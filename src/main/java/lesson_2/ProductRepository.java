package lesson_2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

    @Component
    public class ProductRepository {
        private List<Product> products;

        @PostConstruct
        public void init() {
            products = new ArrayList<>();
            products.add(new Product(1, "lesson_2.Product 1", 100));
            products.add(new Product(2, "lesson_2.Product 2", 200));
            products.add(new Product(3, "lesson_2.Product 3", 300));
            products.add(new Product(3, "lesson_2.Product 4", 400));
            products.add(new Product(3, "lesson_2.Product 5", 500));
        }

        public List<Product> getProducts() {
            return products;
        }

        public void add(Product product) {
            products.add(product);
        }

        public void delete (int id) {
            Product deletedProduct = null;
            for (Product product : products) {
                if (product.getId() == id) {
                    deletedProduct = product;
                }
                products.remove(deletedProduct);
            }
        }

        public void showAllProducts() {
            for (Product product : products) {
                System.out.println(product);
            }
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }