package db;

import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.Product;
import model.ShoppingCart;
import model.User;

public class Storage {
    private static final List<Product> products = new ArrayList<>();
    private static final List<Order> orders = new ArrayList<>();
    private static final List<ShoppingCart> shoppingCarts = new ArrayList<>();
    private static final List<User> users = new ArrayList<>();
    private static Long productId = 0L;
    private static Long orderId = 0L;
    private static Long shoppingCartId = 0L;
    private static Long userId = 0L;

    private Storage() {

    }

    public static void addProduct(Product product) {
        product.setId(productId);
        products.add(product);
        productId++;
    }

    public static void addOrder(Order order) {
        order.setId(orderId);
        orders.add(order);
        orderId++;
    }

    public static void addUser(User user) {
        user.setId(userId);
        users.add(user);
        userId++;
    }

    public static void addShoppingCart(ShoppingCart shoppingCart) {
        shoppingCart.setId(shoppingCartId);
        shoppingCarts.add(shoppingCart);
        shoppingCartId++;
    }
}
