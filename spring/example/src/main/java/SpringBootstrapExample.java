import com.spring.bootstrap.example.BinarySearch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.bootstrap.example")
public class SpringBootstrapExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringBootstrapExample.class);

        BinarySearch binarySearch = annotationConfigApplicationContext.getBean(BinarySearch.class);
        int result = binarySearch.search(new int[]{3, 1, 2}, 2);
        System.out.println("Result found at " + result);

        annotationConfigApplicationContext.close();

    }
}
