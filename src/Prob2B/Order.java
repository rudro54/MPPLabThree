package Prob2B;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderNum;
    private List<OrderLine>orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return "Order [orderNum=" + orderNum + ", orderLines=" + orderLines + "]";
    }

}
