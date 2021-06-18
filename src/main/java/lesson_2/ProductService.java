package lesson_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    List<Product> productsList = productRepository.getProducts();

    public void addProducts(int id, String title, int cost) {
        productRepository.add(new Product(id, title, cost));
    }

    public void deleteProduct(int id) {
        productRepository.delete(id);
    }

    public void showProducts() {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    public int calculateAverageCost() {
        int avg = 0;
        for (Product product : productsList) {
            avg += product.getCost();
        }
        avg /= productsList.size();
        return avg;
    }

    public int calculateTotalNumber(){
        return productsList.size();
    }
}
