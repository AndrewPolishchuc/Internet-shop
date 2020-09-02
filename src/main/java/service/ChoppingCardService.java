package service;

import java.util.List;
import model.ShoppingCart;

public interface ChoppingCardService {
    ShoppingCart create(ShoppingCart shoppingCart);

    ShoppingCart get(Long id);

    List<ShoppingCart> getAll();

    ShoppingCart update(ShoppingCart shoppingCart);

    boolean delete(Long id);
}
