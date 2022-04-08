class SiCi {
    public double simpleInterest(double p,int t,double r){
    	double SimpleInterest = (p * r * t) /(100);
    	System.out.println("Simple intrest of "+ p + " is :"+SimpleInterest);
    	return p;
    }
    public double compoundInterest(double p,int t,double r)
    {
    	double CompoundInterest = p * (Math.pow(1 + (r/100), t) - 1);
    	System.out.println("Compound intrest of "+ p + " is : "+CompoundInterest);
    	return  p;
    	
    }
}
public class Assignment1Q3 {
public static void main(String[] args)
{
   SiCi ob=new SiCi();
   ob.simpleInterest(400, 4, 16);
   ob.compoundInterest(450, 3, 20);
}
}
