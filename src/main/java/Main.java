import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerformanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Performer performer1 = (Performer) ctx.getBean("saxophonist1");
        performer1.perform();

        Performer performer2 = (Performer) ctx.getBean("saxophonist2");
        performer2.perform();

    }
}
