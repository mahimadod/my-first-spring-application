package courseplan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("courseplan")
public class AppCongfig {

   /* @Bean("courseService")
    public CourseService getCourseService(){
        return new CourseService(getCourseRepository());
    }

    @Bean("courseRepository")
    public CourseRepository getCourseRepository(){
        return new CourseRepository();
    }*/
}
