package Q3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Trader{
	 private String name;
	 private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
}
class Transaction{
	private Trader trader;
    private int year;
    private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
}
public class DisplayTraderTransaction {
	public static void main(String[] args) {
		Trader t1=new Trader("Anirudh", "Bangolore");
		Trader t2=new Trader("Dharma", "Chennai");
		Trader t3=new Trader("Juanid", "Pune");
		Trader t4=new Trader("Narasimha", "Hyderabad");
		Trader t5=new Trader("Siddharth", "Pune");
		Trader t6=new Trader("Saju", "Delhi");
		List<Trader> trader= new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		List<Transaction> transaction= Arrays.asList(
				new Transaction(t1, 2018, 99),
				new Transaction(t2, 2017, 85),
				new Transaction(t3, 2011, 81),
				new Transaction(t4, 2009, 95),
				new Transaction(t5, 2015, 92),
				new Transaction(t6, 2011, 75)				
				);
		System.out.println("Traders belonging to Pune with names sorted");
		trader.stream()
		.filter(t->t.getCity().equals("Pune")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(t->System.out.println(t));
		
		System.out.println("Traders with names sorted alphabetically");
		trader.stream()
		.filter(t->t.getName().contains(t.getName())).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(t->System.out.println(t));
	
		System.out.println("Trader based in indore");
		long count=trader.stream()
		.filter(t->t.getCity().equals("Indore")).count();
		if(count==0)
			System.out.println("No Traders Belong to Indore");
		else
			System.out.println("Traders Belong to Indore");

		System.out.println("Transactions made in the year 2011");
		transaction.stream()
		.filter(tr->tr.getYear()==2011).sorted((a,b)->a.getValue()-b.getValue()).forEach(tr->System.out.println(tr));
	
		System.out.println("Traders Belonging to Delhi");
		transaction.stream()
		.filter(t->t.getTrader().getCity().equals("Delhi")).forEach(tr->System.out.println(tr));

		System.out.println("Highest Transaction");
		transaction.stream()
		.mapToInt(Transaction::getValue).max().ifPresent(System.out::println);
	
		System.out.println("Lowest Transaction");
		transaction.stream()
		.mapToInt(Transaction::getValue).min().ifPresent(System.out::println);
	
	}

}
