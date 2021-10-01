import java.io.*;
public class Magic {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int len = word.length();
		char[] arr = new char[len];
		for(int i =0;i<len;i++) {
			if(((arr[i] =='(') || (arr[i] ==')')) && ((arr[i+1] =='(') || (arr[i+1] ==')'))){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}
