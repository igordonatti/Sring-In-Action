package tacos.data;

import tacos.entities.Order;

public interface OrderRepository {

    Order save(Order data);
}