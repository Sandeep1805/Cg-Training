package Q1;



import java.util.Arrays;

import java.util.List;


class Fruit  {
	private String name;
	private int calories;
	private int price;
	private String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
}
public class DisplayFruit{
	public static void main(String[] args) {
			
				
		List<Fruit> fruit = Arrays.asList(
				new Fruit("pineapple", 90, 25, "yellowishgreen"),
				new Fruit("Apple", 105, 30, "red"),
				new Fruit("Banana", 100, 30, "yellow"),
				new Fruit("Mango", 85, 40, "yellow"),
				new Fruit("Grapes", 70, 55, "green"),
				new Fruit("Guava", 80, 25, "green"),
				new Fruit("orange", 110, 35, "orange")
				);
		fruit.stream()
		.filter(f->f.getCalories()<100)
		.sorted((a,b)->b.getCalories()-a.getCalories())
		.forEach(f->System.out.println(f.getCalories() +" "+ f.getName()));
		fruit.stream()
		.sorted((a,b)->a.getColor().compareTo(b.getColor()))
		.forEach(f->System.out.println("Colour: "+f.getColor()+ " => "+"Fruit: "+f.getName()));
		fruit.stream()
		.filter(f->f.getColor().startsWith("red"))
		.sorted((a,b)->a.getPrice()-b.getPrice())
		.forEach(f->System.out.println(f.getColor()+" "+f.getPrice()+" "+f.getName()));
		
				
		
	}
	
	
		
		
	}
	


