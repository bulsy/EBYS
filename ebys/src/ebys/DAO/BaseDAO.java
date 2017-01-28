package ebys.DAO;

import java.sql.SQLException;

public interface BaseDAO <T> {      
    T getByID(int ID) throws ClassNotFoundException, SQLException;
    T save(T type);
    T update(T type);
    void delete(T type);
}