package collections;
import java.util.*;


class contact{
	long phoneno;
	String name;
	String email;
	String gender;
	public contact(int phno,String name,String email,String gender) {
		this.phoneno=phno;
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
}
public class collections1 {
	public static void main(String[] args) {
		
		
	
	TreeMap<Long,contact> Contact=new TreeMap<Long,contact>();
	 Contact.put((long) 9999999, new contact(999999,"james","jma@gmail","male"));
	 Contact.put((long) 9888888, new contact(909990992,"barn","hga@gmail","male"));
	 Contact.put((long) 88889, new contact(897694895,"jasmine","jas@gamil","female"));
	 Contact.put((long) 8888889, new contact(897694455,"rosiee","rosiee@gamil","female"));
	 
	 System.out.println(Contact.keySet());
      System.out.println(Contact.values());
     System.out.println(Contact);
	}}
