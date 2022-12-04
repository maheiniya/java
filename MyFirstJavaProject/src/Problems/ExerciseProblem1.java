
/** Problem statement - (Sample ShoppingCart)
 * 
 *       -- Design a class CartItem with fields (itemCode,quantity) with the mandatory
 *          constructor to initialize the CartItem.
 *          
 *        -- Design a class ShoppingCart with following operations
 *               --Fields
 *                    CartItem items[]
 *                    itemCount
 *               --Constructors
 *                    ShoppingCart() - initialize items array with size 10
 *                    ShoppingCart(int size) - initialize items array with given size
 *               --Methods
 *                      addToCart(CartItem) - add item to the items array
 *                      order() - print the ordered items.  
 */

package Problems;

class CartItem {
	private String itemCode;
	private int quantity;
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CartItem(String itemCode, int quantity) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
	}	
}

class ShoppingCart {
	private  CartItem items[];
	private int itemCount;
	
	public CartItem[] getItems() {
		return items;
	}
	public void setItems(CartItem[] items) {
		this.items = items;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public ShoppingCart() {
		super();
		this.items = new CartItem [10];	
	}
	
	public ShoppingCart( int size) {
		super();
		this.items = new CartItem [size];
	}
	public void addToCart(CartItem item) {
		this.items[itemCount]= item;
		itemCount++;
	}	
	public void order() {
		for (int i = 0; i < items.length; i++) {
			 CartItem item = this.items[i];
			 System.out.println("i = "+i);
			 if (item!=null) {
				 System.out.println(item.getItemCode()  + " " + item.getQuantity() );
			 }
		}
	}
}




public class ExerciseProblem1 {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new CartItem("a", 10));
		cart.addToCart(new CartItem("b", 20));
		cart.addToCart(new CartItem("c", 30));
		cart.order();
		ShoppingCart cart1 = new ShoppingCart();
		cart1.addToCart(new CartItem("a", 140));
		cart1.addToCart(new CartItem("b",150));
		cart1.addToCart(new CartItem("c", 160));
		cart1.order();
	}

}
