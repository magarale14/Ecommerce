import java.util.Scanner;
import java.util.InputMismatchException;

public class Shop {
	static double totalAmount = 0.0;
	static int userInput = 9;
	static boolean isShopOpen;	
	static Product[]inventory = {new Product("Mens's Business Casual Shirt",57.10,"Apprael",2,'M',"Teal"), new Product("The Art of Computer Programming", 190.54,"Books",9,"Donald K Knuth"), new Product("Main Business Casual Shirt",57.10,"Appreal",2,'M',"Teal"), new Product("Organic Turmeri Soap",11.25,"Bath and Beauty",1), new Product("Head First Design Pattern",37.35,"books",3,"Eric Freeman")};
		
	public static void main(String args[]){
		
	if (isShopOpen == false) {
					
		}
		else {
		


		Scanner key = new Scanner (System.in);

		while (true) {

			System.out.println(
					"Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4: ");

			for (int i = 0; i < inventory.length; i++) {

				System.out.println(i + ": " + inventory[i].getName());

			}

			try {
				userInput = key.nextInt();
			}

			catch (InputMismatchException e) {

				System.out.println("Invalid input, exiting the shopping cart! Your total amount is: " + totalAmount);

				break;

			}

			if (userInput >= 0 && userInput <= 4) {

				// if(inventory[userInput]&#39;s buy() method returns true)

				if (inventory[userInput].buy()) {

					System.out.println("Your purchase was successful");

					totalAmount += inventory[userInput].getPrice();
				}
				else {

					System.out.println("Sorry! This product is out of stock");

				}



			}



			else {



				System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);

				key.close();

				break;



			}


		}


		}

		System.out.println("EXTRA CREDIT: ");
		for (Product list: inventory){

			System.out.println (list);

		}

	}

}