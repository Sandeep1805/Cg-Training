import java.util.Scanner;
public class Assignment1Q6{
	public static void main(String[] args) {
		String userId  ="Ajay";
		String password = "password";
		Scanner scan = new Scanner(System.in);
		System.out.println( "Enter username and password");
		
	int i=0;
	while(1>0) {
		
		String sc = scan.next();
		String pwd = scan.next();
		if(sc.equals(userId)&&pwd.equals(password)) {
	System.out.println("Welcome "+sc);
	 scan.close();
	 System.exit(0);
	}
		else {
			System.out.println("You have entered wrong credentials");
			i++;
		}   if(i == 3) {
        	System.out.println("Contact Admin");
        	scan.close();
        	System.exit(0);
        	
        }
}}
}
