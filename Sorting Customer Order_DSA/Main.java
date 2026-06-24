public class Main {
    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Riya", 2500),
            new Order(102, "Aman", 1200),
            new Order(103, "Priya", 4500),
            new Order(104, "Rahul", 3000)
        };

        OrderSorter.quickSort(orders, 0, orders.length - 1);

        System.out.println("Sorted Orders:");

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}