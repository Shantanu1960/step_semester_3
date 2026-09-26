package advanced_arrays.assignment_problems;

public class Cart {
    private final String cartId;
    private final double[] itemPrices;

    public Cart(String cartId, int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }

        this.cartId = cartId;
        this.itemPrices = new double[capacity];
    }

    public String getCartId() {
        return cartId;
    }

    public void addItem(double price) {
        if (price <= 0) {
            System.out.println("Item rejected: price must be positive");
            return;
        }

        int index = 0;
        while (index < itemPrices.length && itemPrices[index] != 0) {
            index++;
        }

        if (index == itemPrices.length) {
            System.out.println("Item rejected: cart is full");
            return;
        }

        itemPrices[index] = price;
    }

    public double getTotal() {
        double total = 0;
        for (double price : itemPrices) {
            total += price;
        }
        return total;
    }

    public int getItemCount() {
        int count = 0;
        for (double price : itemPrices) {
            if (price != 0) {
                count++;
            }
        }
        return count;
    }
}