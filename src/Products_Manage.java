
import java.util.ArrayList;
import java.util.Collections;

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
	 	 public void SortProductsByName() {
	 	        Collections.sort(ProductList, new Comparator<Products>() {
	 	            @Override
	 	            public int compare(Products p1, Products p2) {
	 	                return p1.getName().compareTo(p2.getName());
	 	            }
	 	        });}
	 	     // Sắp xếp sản phẩm theo giá
	 	        public void SortProductsByPrice() {
	 	            Collections.sort(ProductList, new Comparator<Products>() {
	 	                @Override
	 	                public int compare(Products p1, Products p2) {
	 	                    return Double.compare(p1.getPrice(), p2.getPrice());
	 	                }
	 	            });
	 	        }

	 	        // Sắp xếp sản phẩm theo số lượng
	 	        public void SortProductsByQuantity() {
	 	            Collections.sort(ProductList, new Comparator<Products>() {
	 	                @Override
	 	                public int compare(Products p1, Products p2) {
	 	                    return Integer.compare(p1.getQuantity(), p2.getQuantity());
	 	                }
	 	            });}
	 	       public void SearchProductsByName(String keyword) {
	 	    	    for (Products product : ProductList) {
	 	    	        if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
	 	    	            System.out.println(product);
	 	    	        }
	 	    	    }
	 	    	}
	 	       // search theo khoang gia
	 	      public void searchProductsByPriceRange(double minPrice, double maxPrice) {
	 	    	    List<Products> result = new ArrayList<>();
	 	    	    for (Products product : ProductList) {
	 	    	        if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
	 	    	            result.add(product);
	 	    	        }
	 	    	    }
	 	    	    if (result.isEmpty()) {
	 	    	        System.out.println("Không có sản phẩm nào trong khoảng giá từ " + minPrice + " đến " + maxPrice);
	 	    	    } else {
	 	    	        System.out.println("Các sản phẩm trong khoảng giá từ " + minPrice + " đến " + maxPrice + ":");
	 	    	        for (Products product : result) {
	 	    	            System.out.println(product);
	 	    	        }
	 	    	    }
	 	    	}
	 	       }
	 
	 				
	 				
	 		
	 		
	 		
	 	
	 	
	 	
	 	
	 	
	 	



	



	 
				
				
		
		
		
	
	
	
	
	
	


