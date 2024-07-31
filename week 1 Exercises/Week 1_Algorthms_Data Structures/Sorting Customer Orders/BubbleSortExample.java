import java.util.*;

public class BubbleSortExample {
    public static void bubbleSort(List<Order> orders) {
        int n = orders.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders.get(j).getTotalPrice() > orders.get(j + 1).getTotalPrice()) {
                    Order temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Hemanth", 250.00));
        orders.add(new Order(2, "kiran", 150.00));
        orders.add(new Order(3, "Hari", 200.00));
        orders.add(new Order(4, "Bharat", 100.00));

        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
