package lesson_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        System.out.println(productService.calculateTotalNumber());
        System.out.println(productService.calculateAverageCost());

        context.close();
}
}
