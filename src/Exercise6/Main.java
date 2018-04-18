/*
 * @project Exercise6
 * @author  Osbardo Rodriguez
 * Date:    4/3/18
 */
package Exercise6;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    GroceryItem milk = new GroceryItem( "Milk", 5.99 );
	    GroceryItem bread = new GroceryItem( "Bread", 3.99, 4, 20, 2018 );

	    System.out.println( "The name of the item is: " + bread.getItemName() );
	    System.out.printf( "The cost of the %s is: $%.2f\n", bread.getItemName(), bread.getItemCost() );
	    System.out.println( "Expiration date: " + bread.getExpDate() );

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );

	    double expensivePrice;

	    System.out.printf( "What would you consider expensive for %s: ", bread.getItemName() );
	    expensivePrice = input.nextDouble();

	    if ( bread.isExpensive( expensivePrice ) ) {
	    	System.out.printf( "%s is more expensive that $%.2f\n", bread.getItemName(), expensivePrice );
	    } else {
	    	System.out.printf( "%s is not expensive!\n", bread.getItemName() );
	    }
    }
}
