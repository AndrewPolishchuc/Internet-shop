package dao;

import java.util.List;
import java.util.Optional;
import model.Product;

public interface ProductDao {
    Product create(Product product);

    Optional<Product> get(Long id);

    List<Product> getAll();

    Product update(Product product);

    boolean delete(Long id);
}
