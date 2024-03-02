import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class Products_Manage {
	// tao danh sach products
	private List<Products> ProductList = new ArrayList<Products>();
	// them moi san pham
	public void AddProduct(Products products) {
		ProductList.add(products);}
	// xoa sp theo id
	public void DeleteProduct(int id) {
		for (int i = 0; i < ProductList.size(); i++) {
			if (ProductList.get(i).getId()==id) {
				ProductList.remove(i);
				break;}}}
		//hien thi sp theo danh muc
	public void ShowProductByCate(String cate) {
		//duyet sp trong list
		for (Products products : ProductList) {
			if (products.getCate().equals(cate)) {
				System.out.println(products);}}}
	// Chinh sua san pham theo id
	public void EditProduct(int id, String NewName, String NewCate, double NewPrice, int NewQuantity) {
		// duyet mang
		for (Products products : ProductList) {
			if (products.getId()==id) {
				products.setName(NewName);
				products.setPrice(NewPrice);
				products.setQuantity(NewQuantity);
				products.setCate(NewCate);}
			break;}}
	// Sort


}
				
				
		
		
		
	
	
	
	
	
	


