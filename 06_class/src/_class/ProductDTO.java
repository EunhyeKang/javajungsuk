package _class;

public class ProductDTO {
	private String item;
	private int price;
	private int qty;
	private int total;
//	setter/getter
	
	public void calc() {
		total = price *qty;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotal() {
		return total;
	}

	
	
}
