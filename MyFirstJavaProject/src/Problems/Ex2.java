package Problems;

/**
 * Problem statement - (Sample ShoppingCart)
 * 
 * -- Design a class CartItem with fields (itemCode,quantity) with the mandatory
 * constructor to initialize the CartItem.
 * 
 * -- Design a class ShoppingCart with following operations 
 *            --Fields
 *               CartItem items[] 
 *               itemCount 
 *      	   --Constructors ShoppingCart() - initialize items array with size 10 
 *          		 ShoppingCart(int size) - initialize items array with given size
 *				 --Methods addToCart(CartItem) - add item to the items array order() 
 * 				- print  the ordered items.
 */

class CartItem1 {
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

	public CartItem1(String itemCode, int Quantity) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
	}

	class ShoppingCart {
		private CartItem items[];
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
			this.items=new CartItem[10];
		}
		public ShoppingCart(int size) {
			super();
			this.items=new CartItem[size];
		}
		public void addToCart(CartItem item) {
			this.items[itemCount]= item;
			ShoppingCart(10);
			itemCount++;
		}
		
		
	}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
