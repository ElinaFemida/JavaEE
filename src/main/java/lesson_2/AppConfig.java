package lesson_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson_2")
public class AppConfig {
    @Autowired
    private ProductService productService;
}




