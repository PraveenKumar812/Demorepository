import java.io.*;
import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0,c1=0;
		int n = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			
			sb.append(sc.nextLine());
			
		}
		String ans = sb.toString();
		if(ans.matches("(.*)FUR(.*)")) {
			c++;
		}
		else if(ans.matches("(.*)EL(.*)")) {
			c1++;
		}
		else {
			c =0 ;
			c1 =0;
		}
		System.out.println(c+" "+c1);
	}

}
