package courseplan.Repository;

import java.util.List;

public interface CRUDRepository<T>{
    List<T> findAll();
}
