
import java.util.*;

class LocalDate{
  int date;
  int month;
  int year;
  public LocalDate(int d,int m, int y) {
	  this.date=d;
	  this.month=m;
	  this.year=y;
  }
  public void leapcheck() {
	  if(year%4==0) {
		  if(year%100==0) {
			  if(year%400==0) {
				  System.out.println("Your birth year "+date+"-"+month+"-"+year+" is Leapyear");
			  }
			  else {
				  System.out.println("Your birth year "+date+"-"+month+"-"+year+" is non-Leapyear");
			  }
			 
		  }
		  else {
			 
		  System.out.println("Your birth year "+date+"-"+month+"-"+year+" is Leapyear");
	  }
	  }
	  else {
		  System.out.println("Your birth year "+date+"-"+month+"-"+year+" is non-Leapyear");
	  }

}
}
public class collections4 {
	public static void main(String[] args) {
    LinkedList<LocalDate> dp=new LinkedList<LocalDate>();
     dp.add(new LocalDate(21,2,2000));
     dp.add(new LocalDate(21,5,1947));
     dp.add(new LocalDate(7,9,1867));
     dp.add(new LocalDate(21,4,2021));
     dp.add(new LocalDate(25,5,2020));
     for(LocalDate bday:dp) {
    	 bday.leapcheck();
    	 
     }
    	 
     }
     
}
