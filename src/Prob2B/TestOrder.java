package Prob2B;

public class TestOrder {
    public static void main(String[] args) {

        Order order = new Order("ORDER9099");
        OrderLine firstOne = new OrderLine("Laptop",5);
        OrderLine secondOne = new OrderLine("iPhone",10);
        order.addOrderLine(firstOne);
        order.addOrderLine(secondOne);
        System.out.println(order);
    }
}
