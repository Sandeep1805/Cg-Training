import java.util.*;
public class generics2 {
public static void main(String[] args) {
	HashMap<Integer,Double> hat=new HashMap<Integer,Double>();
	hat.put(1, 1.11);
	hat.put(2, 2.11);
	hat.put(3, 3.11);
	hat.put(4, 4.11);
	hat.put(5, 5.11);
	hat.put(6, 6.11);
	hat.put(7, 7.11);
	hat.put(8, 8.11);
	hat.put(9, 19.11);
	hat.put(10, 10.11);
	for(Map.Entry<Integer, Double> e: hat.entrySet())
		System.out.println("Key : "+e.getKey()+"   || "+" Value : "+e.getValue());


}
}
