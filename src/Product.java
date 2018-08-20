/* This program is to create product of objects, class and array of product
 * Author: Reeta
 * Date:8/13/18
 */
public class Product {
//declaring all the attributes that are private 
	private String name;
	private Double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color;
	
		
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//Constructors
Product(String name,Double price,String category,int quantity,char size, String color){

	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.size = size;
	this.author = author;
	this.color = color;
	
}
Product(String name,Double price,String category,int quantity, String author){
	 
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.author = author;
	
	
}
Product(String name,Double price,String category,int quantity){
	 
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
}

public String toString(){
	return ("name: " + this.name + "\n" + "price: : " + this.price + "\n" + "category: " + this.category + "\n" + "quantity: " + this.quantity + "\n" + "size: " + this.size + "\n" + "author : " + this.author + "\n" + "color : "+ this.color + "\n"); 
}

boolean buy () {
	
	if (quantity > 0) {
		
		quantity--;
		return true;
		
	}
	else {
		
		return false;
	}
}


}
