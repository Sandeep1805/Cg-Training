import java.lang.annotation.*;
@interface  Info{
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	double Version();
	String Description();
}
public class question2 {
@Info(AuthorID=2,Author="kane",Supervisor="william",Date="1-2-2003",Time="10 o clock",Version=1.5,Description="latest version and upto date")
public static void main(String[] args) {
		
	}

}
