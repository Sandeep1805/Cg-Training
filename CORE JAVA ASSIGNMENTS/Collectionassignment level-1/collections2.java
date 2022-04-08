package collections;
import java.util.*;
public class collections3 {
 public static void main(String[] args) {
	

	HashSet<String> products=new HashSet<String>();
          products.add("flying machine");
          products.add("netpaly");
          products.add("polo");
          products.add("peter england");
          products.add("urbantouch");
          products.add("hooda");
          products.add("buffalo");
          products.add("ramraj");
          products.add("kyter");
          products.add("flather");
          products.add("denim");
          System.out.println(products);
          System.out.println(products.size());
          
          //adding same product to check set allowing duplicate
          products.add("polo");
          
          //printing after adding existing product
          System.out.println(products);
          
          System.out.println(products.size());
          //size after adding duplicate is same shows that set doesn't allow duplicates
          
}
}