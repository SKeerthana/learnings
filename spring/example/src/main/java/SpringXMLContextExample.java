import com.spring.bootstrap.example.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLContextExample {
    static Logger logger = LoggerFactory.getLogger(SpringXMLContextExample.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        logger.info("Beans loaded --> {}", (Object)applicationContext.getBeanDefinitionNames());

        XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
        System.out.println("XML person DAO" + xmlPersonDAO.getXmlJdbcConnection());

        applicationContext.close();
    }
}
