package advanced_arrays.assignment_problems;

public class q5 {

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Cart total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}