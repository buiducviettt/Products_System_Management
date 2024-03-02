
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ioFILE {
    // Lưu trữ danh sách sản phẩm vào file
    public static void saveProductsToFile(List<Products> productList, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Products product : productList) {
                writer.write(product.toString() + System.lineSeparator());
            }
            System.out.println("Đã lưu danh sách sản phẩm vào file " + filename);
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu danh sách sản phẩm vào file " + filename);
            e.printStackTrace();
        }
    }

    // Lưu trữ danh mục sản phẩm vào file
    
}



