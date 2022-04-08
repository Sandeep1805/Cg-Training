
public class Assignment1Q2{
	public static void main(String[] args) {
	
		int number,temp,num1,total;
    for(int i=100;i<1000;i++) {
    	number=i;
    	total=0;
    while (number != 0)
    {
        temp = number % 10;
        total = total + temp*temp*temp;
        number /= 10;
    }

    if(total == i)
        System.out.println(i + " is an Armstrong number");
    }
}
}