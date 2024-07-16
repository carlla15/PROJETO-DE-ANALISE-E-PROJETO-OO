package projeto_APOO_academia;


import java.util.ArrayList;
import java.util.List;

public class GenericDAO<T extends ClasseBase> implements DAO<T> {
    private List<T> database = new ArrayList<>();

    private static GenericDAO instance;

    private GenericDAO() {}

    public static <T extends ClasseBase> GenericDAO<T> getInstance() {
        if (instance == null) {
            instance = new GenericDAO<>();
        }
        return instance;
    }

    @Override
    public void save(T entity) {
        database.add(entity);
    }

    @Override
    public T get(String id) {
        return database.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void update(T entity) {
        delete(entity.getId());
        save(entity);
    }

    @Override
    public void delete(String id) {
        database.removeIf(entity -> entity.getId().equals(id));
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(database);
    }
}

