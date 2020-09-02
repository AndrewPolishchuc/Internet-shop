package service;

import java.util.List;
import model.Order;

public interface OrderService {
    Order create(Order order);

    Order get(Long id);

    List<Order> getAll();

    Order update(Order order);

    boolean delete(Long id);
}
