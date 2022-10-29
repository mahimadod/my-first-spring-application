package courseplan.Service;

import java.util.List;
import java.util.Optional;

public interface CRUDService<T> {
    List<T> list();

    T create(T t);

    Optional<T> get(int i);

    void update(T t,int i);

    void delete(int i);
}
