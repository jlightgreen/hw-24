package application.dao;

import application.model.Order;
import java.util.List;

public interface OrderDao {
    List<Order> getUserOrders(Long userId);

    Order get(Long id);

    List<Order> getAll();

    boolean delete(Long id);

    Order create(Order order);
}
