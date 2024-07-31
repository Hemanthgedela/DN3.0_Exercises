
import java.util.*;
public class QuickSortExample {
    public static void quickSort(List<Order> orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(List<Order> orders, int low, int high) {
        double pivot = orders.get(high).getTotalPrice();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (orders.get(j).getTotalPrice() <= pivot) {
                i++;
                Order temp = orders.get(i);
                orders.set(i, orders.get(j));
                orders.set(j, temp);
            }
        }

        Order temp = orders.get(i + 1);
        orders.set(i + 1, orders.get(high));
        orders.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "kiran", 250.00));
        orders.add(new Order(2, "Naveen", 150.00));
        orders.add(new Order(3, "Bharath", 200.00));
        orders.add(new Order(4, "Hari", 100.00));

        System.out.println("Before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.size() - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
