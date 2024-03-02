public class Products {
	// thuoc tinh
	private int id;
	private String name;
	private String cate;
	private double price;
	private int quantity;
	// constructor
	public Products(int id, String name, String cate, double price, int quantity) {
		//super();
		this.id = id;
		this.name = name;
		this.cate = cate;
		this.price = price;
		this.quantity = quantity;
	}
	// getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
