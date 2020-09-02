package dao;

import java.util.List;
import java.util.Optional;
import model.ShoppingCart;

public interface ShoppingDao {
    ShoppingCart create(ShoppingCart shoppingCart);

    Optional<ShoppingCart> get(Long id);

    List<ShoppingCart> getAll();

    ShoppingCart update(ShoppingCart shoppingCart);

    boolean delete(Long id);
}
