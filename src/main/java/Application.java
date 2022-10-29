import courseplan.Service.CourseService;
import courseplan.config.AppCongfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        /*System.out.println("Hello Spring");
        CourseService c=new CourseService();
        System.out.println(c.list());*/
        ApplicationContext context=new AnnotationConfigApplicationContext(AppCongfig.class);
        CourseService service=context.getBean("courseService", CourseService.class);
        System.out.println(service.list());
    }
}
