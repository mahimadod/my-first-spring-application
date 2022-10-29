package courseplan.Service;

import courseplan.Model.Course;
import courseplan.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CRUDService<Course>{

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }
    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int i) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int i) {

    }

    @Override
    public void delete(int i) {

    }
}
