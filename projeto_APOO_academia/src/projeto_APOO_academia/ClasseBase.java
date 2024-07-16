package projeto_APOO_academia;

public class ClasseBase {
    private String id;

    public ClasseBase(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ClasseBase{id='" + id + '\'' + '}';
    }
}

