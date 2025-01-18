package Prob2B;

public class OrderLine {
    private String productName;
    private int quantity;

    public OrderLine(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLine [product=" + productName + ", quantity=" + quantity + "]";
    }

}
