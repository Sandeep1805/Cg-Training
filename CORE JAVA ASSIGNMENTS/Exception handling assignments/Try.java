import java.util.Scanner;
public class Try {
  public void div() {
	  int a,b;
	  System.out.println("Enter two numbers for division: "); 
	  Scanner gh=new Scanner(System.in);
	  a=gh.nextInt();
	  Scanner jk=new Scanner(System.in);
	  b=jk.nextInt();
	  
	  try {
		  System.out.println(a/b);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("arithmetic exception due to division of number by zero");
		  e.printStackTrace();
	  }
 }

public static void main(String[] args) {
	Try c=new Try();
	{
	c.div();
	}
}}
