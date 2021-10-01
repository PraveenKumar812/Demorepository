import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name  = br.readLine();
		System.out.println("Enter UserName");
		String user = br.readLine();
		System.out.println("Enter Password");
		String pswd = br.readLine();
		System.out.println("Enter PhoneNo");
		Long ph = Long.parseLong(br.readLine());
		User u1 = new User(name,user,pswd,ph);
		System.out.println("Enter Name");
		name  = br.readLine();
		System.out.println("Enter UserName");
		user = br.readLine();
 		System.out.println("Enter Password");
 		pswd = br.readLine();
		System.out.println("Enter PhoneNo");
		ph = Long.parseLong(br.readLine());
		User u2 = new User(name,user,pswd,ph);
		if(u1.equals(u2)) {
			System.out.println("Same Users");
		}
		else {
			System.out.println("Different Users");
		}

}
}
