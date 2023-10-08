/*
 * 36] Roman to Integer
 */

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;  
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            int value = 0;
            if(map.containsKey(c)) {

                value = map.get(c);
            }           
            if (value < prevValue) {
                result -= value;  
            } else {
                result += value;  
            }
            
            prevValue = value;  
        }      
        return result;
    }
}
