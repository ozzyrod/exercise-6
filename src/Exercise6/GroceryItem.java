/*
 * @project Exercise6
 * @author  Osbardo Rodriguez
 * Date:    4/3/18
 */
package Exercise6;

public class GroceryItem {

	private String itemName;
	private double itemCost;
	private Date expDate;
	private double expensivePrice;

	public GroceryItem( String name, double cost, int month, int day, int year ) {
		itemName = name;
		itemCost = cost;
		expDate  = new Date( month, day, year );
	}

	public GroceryItem( String name, double cost ) {
		itemName = name;
		itemCost = cost;
	}

	public GroceryItem( String name ) {
		itemName = name;
		itemCost = 0.00;
	}

	/*
	 * Set the name of the item.
	 *
	 * @param String name The name of the item.
	 * @return void
	 */
	public void setItemName( String name ) {
		itemName = name;
	}

	/*
	 * Gets the name of the item.
	 *
	 * @return String itemName.
	 */
	public String getItemName() {
		return itemName;
	}

	/*
	 * Set the cost of the item.
	 *
	 * @param double cost The cost of the item
	 * @return void
	 */
	public void setItemCost( double cost ) {
		itemCost = cost;
	}

	/*
	 * Gets the cost of the item.
	 *
	 * @return double itemCost
	 */
	public double getItemCost() {
		return itemCost;
	}

	/*
	 * Set the expiration date of the item.
	 *
	 * @param int month The month of expiration.
	 * @param int day The day of expiration.
	 * @param int year The year of expiration.
	 * @return void
	 */
	public void setExpDate( int month, int day, int year ) {
		expDate = new Date( month, day, year );
	}

	/*
	 * Get the expiration date.
	 *
	 * @param double cost The cost of the item
	 * @return void
	 */
	public Date getExpDate() {
		return expDate;
	}

	/*
	 * Check to see if the item has an expiration date..
	 *
	 * @return bool
	 */
	public boolean isExpDate() {
		if ( null != expDate ) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Check to see if the item is expensive.
	 *
	 * @param double cost Defined as expensive.
	 * @return bool
	 */
	public boolean isExpensive( double expensiveCost ) {
		if ( expensiveCost <= itemCost ) {
			return true;
		} else {
			return false;
		}
	}
}
