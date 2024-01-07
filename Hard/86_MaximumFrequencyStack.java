/*
 * 86] Maximum Frequency Stack
 */

class FreqStack {
    HashMap<Integer,Stack> stacksMap;
    HashMap<Integer,Integer> fmap;
    int maxFreq=0;
    public FreqStack() {
        stacksMap=new HashMap<>();
        fmap=new HashMap<>();
    }

    public void push(int val) {
        fmap.put(val,fmap.getOrDefault(val,0)+1);
        int freq=fmap.get(val);
        if(freq>maxFreq){
            maxFreq=freq;
        }
        Stack<Integer> st=new Stack();
        if(stacksMap.containsKey(freq)){
            st=stacksMap.get(freq);
        }
        st.push(val);
        stacksMap.put(freq,st);
    }

    public int pop() {
        Stack<Integer> st=stacksMap.get(maxFreq);
        int ans=st.pop();
        fmap.put(ans,fmap.get(ans)-1);
        if(stacksMap.get(maxFreq).size()==0){
            stacksMap.remove(maxFreq);
            maxFreq--;
        }
        return ans;
    }
}
