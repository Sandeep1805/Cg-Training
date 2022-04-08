package question4;

abstract class practice{
	
}
 abstract class big{   
	public  void show() {			
		System.out.println("Hello");
	}
	public abstract void method();  

}

class small extends big{
		
	
	public void method() {		
		System.out.println("method overrided");
	}
	
}
class Assignment2Q4{
	public static void main(String[] args) {
	
		big a = new big();
		{
			a.show();
	}}
}