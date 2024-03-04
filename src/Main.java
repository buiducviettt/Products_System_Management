
public class Main { 
    public static void main(String[] args) {
        // Tạo một đối tượng quản lý sản phẩm
        Products_Manage productManager = new Products_Manage();

        // Thêm một số sản phẩm vào danh sách
        productManager.AddProduct(new Products(1, "Sp1", "Cate A", 1012120.0, 112120));
        productManager.AddProduct(new Products(2, "Sp 2", "Cate B", 2012120.0, 2120));
        productManager.AddProduct(new Products(3, "Sp 3", "Cate A", 151210.0, 15121));
        productManager.AddProduct(new Products(4, "Sp 4", "Cate C", 301210.0, 30121));
        productManager.AddProduct(new Products(5, "Sp 5", "Cate D", 2222200.0, 3121210));


        // Hiển thị tất cả sản phẩm
        System.out.println("Danh sách sản phẩm:");
        productManager.ShowProductByCate("Cate");

        // Sắp xếp sản phẩm theo tên
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo tên:");
        productManager.SortProductsByName();
        productManager.ShowProductByCate("Cate A");

        // Tìm kiếm sản phẩm theo tên gần đúng
        System.out.println("Tìm kiếm sản phẩm theo tên gần đúng:");
        productManager.SearchProductsByName("sp");

        // Tìm kiếm sản phẩm theo khoảng giá
        System.out.println("Tìm kiếm sản phẩm theo khoảng giá:");
        productManager.searchProductsByPriceRange(1121200, 212121200);
        // dang nhap 
        import java.util.HashMap;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// nhap tai khoan
		System.out.println("Moi nhap tai khoan");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.println("Moi nhap mat khau");
		String pass = sc.nextLine();
		HashMap<String, String> user = new HashMap<String, String>();
		// gia su user da dang ky truoc do
		user.put("buiducviet", "Buiducviet");
		user.put("bdv", "buiducviettttt");
		user.put("viet", "khongnhopass");
		// ktra
		if (user.containsKey(username)==false) {
			System.out.println("User khong ton tai");}
		else if (user.get(username).equals(pass)==false) {
			System.out.println("sai mat khau");
			
		}
		else System.out.println("Ban da dang nhap thanh cong");
		
		
		
	}

}

    


