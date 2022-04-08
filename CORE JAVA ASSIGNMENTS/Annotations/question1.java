import java.lang.annotation.*;
@Target(ElementType.METHOD)
@interface Test
{
	String o();
}

public class question1 {
@Test(o="this annotation is for method test-case")
public static void main(String[] args) {
	
}
}
