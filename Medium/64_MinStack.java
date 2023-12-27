/*
 * 64] Min Stack
 */

// class MinStack {

//     int data;
//     MinStack next;
//     public MinStack(int data) {
//         this.data = data;
//         this.next = null;
//     }
//     MinStack Top = null;
//     public MinStack() {

//     }

//     public void push(int val) {
//         MinStack node = new MinStack(val);
//         node.next = Top;
//         Top = node;
//     }

//     public void pop() {
//         if(Top != null) {
//             Top = Top.next;
//         }
//     }

//     public int top() {
//         if(Top != null) {
//             int data = Top.data;
//             return data;
//         }
//         return -1;
//     }

//     public int getMin() {
//         if(Top != null) {

//             MinStack temp = Top;
//             int min = Integer.MAX_VALUE;
//             while(temp != null) {

//                 if(min > temp.data) {

//                     min = temp.data;
//                 }
//                 temp = temp.next;
//             }
//             return min;
//         }
//         return -1;
//     }
// }

class MinStack {
    Stack<Integer>s;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
    }

    public void push(int val) {
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }

    public void pop() {
        int val=s.pop();
        if(val==min){
            min=s.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
