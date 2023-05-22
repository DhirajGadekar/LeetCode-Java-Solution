import java.util.StringTokenizer;
import java.io.*;

class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer token = new StringTokenizer(s," ");

        String str = s;
        while(token.hasMoreElements()) {
            
            str = token.nextToken();
        }
        return str.length();
    }
}

class Main {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Solution obj = new Solution();

		System.out.println("Enter the String : ");
		String s = br.readLine();

		int ret = obj.lengthOfLastWord(s);
		System.out.println(ret);
	}
}
