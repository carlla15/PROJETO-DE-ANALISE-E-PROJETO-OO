package projeto_APOO_academia;

import java.util.List;

public interface DAO<T> {
    void save(T t);
    T get(String id);
    void update(T t);
    void delete(String id);
    List<T> getAll();
}
