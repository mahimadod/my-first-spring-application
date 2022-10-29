package courseplan.Repository;

import courseplan.Model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepository implements CRUDRepository<Course>{
    @Override
    public List<Course> findAll() {
        List<Course> courses=new ArrayList<>();
        Course springBoot=new Course(1,"Springboot","basics of springBoot","www.springBoot.com");
        courses.add(springBoot);
        return courses;
    }
}
