package ebys.DAO;

public interface BaseDAO <T> {
    T getWithId(T type) ;
    void save(T type);
    void update(T type);
    void delete(T type);
}


