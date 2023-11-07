import java.util.concurrent.TimeUnit;

class TaxiDriver {
    private String name;
    private Order currentOrder;

    public TaxiDriver(String name) {
        this.name = name;
        this.currentOrder = null;
    }

    public void acceptOrder(Order order) {
        if (currentOrder == null) {
            currentOrder = order;
            System.out.println(name + " has accepted the order: " + order.getCustomerName());
        } else {
            System.out.println(name + " already has an order and cannot accept a new one.");
        }
    }

    public void completeOrder() {
        if (currentOrder != null) {
            System.out.println(name + " has completed the order: " + currentOrder.getCustomerName());
            currentOrder = null;
        } else {
            System.out.println(name + " does not have an active order to complete.");
        }
    }
}

class Order {
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
