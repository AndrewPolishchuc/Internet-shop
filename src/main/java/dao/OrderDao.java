package dao;

import java.util.List;
import java.util.Optional;
import model.User;

public interface OrderDao {
    User create(User user);

    Optional<User> get(Long id);

    List<User> getAll();

    User update(User user);

    boolean delete(Long id);
}
