class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {

            if('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }

        s = new String(arr);
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        StringBuffer sb1 = new StringBuffer(s);

        if(s.contentEquals(sb1.reverse())) {
            return  true;
        }else {
            return false;
        }

    }
}
class Main {
	
    public static void main(String[] args) {
		
	Solution obj = new Solution();
	String str = "race a car";

	boolean ret  = obj.isPalindrome(str);
	System.out.println(ret);
    }
}
