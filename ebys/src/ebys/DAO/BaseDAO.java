package ebys.DAO;

public interface BaseDAO <T> {
    T getWithId(int ID) ;
    void save(T type);
    void update(T type);
    void delete(T type);
}


