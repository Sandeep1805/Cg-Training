import java.util.Scanner;
public class Exceptionhandling2 {

  public void div() {
	  int a,b;
	  System.out.println("Enter two numbers for division: "); 
	  Scanner hg=new Scanner(System.in);
	  a=hg.nextInt();
	  Scanner kl=new Scanner(System.in);
	  b=kl.nextInt();
	try {  
	  try {
		  System.out.println(a/b);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("arithmetic exception due to division of number by zero");
		  e.printStackTrace();
	  }
	
	throw new UnsupportedOperationException();
	}  catch(UnsupportedOperationException ex){
		  System.out.println("Number cant be divided by zero");
	      ex.printStackTrace();
	  }  
 }
	

public static void main(String[] args) {
	Exceptionhandling2 c=new Exceptionhandling2();
	{
	c.div();
	}
}}



