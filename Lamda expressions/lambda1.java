package lambda;

import java.util.Scanner;

interface operation{
	int display(int a, int b);
}
public class lambda1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt(); 
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		
		operation add=(a,b)-> a+b;
		System.out.println("Addition:"+add.display(num1,num2));
	
		operation sub=(a,b)-> a-b;
		System.out.println("Subtraction:"+sub.display(num1,num2));
		
		operation mul=(a,b)-> a*b;
		System.out.println("Multiplication:"+mul.display(num1,num2));
		
		operation div=(a,b)-> {
		if(b==0) return 0;
		
		return a/b;
		
		};
		System.out.println("Division:"+div.display(num1,num2));
		sc.close();
	
	}
	}