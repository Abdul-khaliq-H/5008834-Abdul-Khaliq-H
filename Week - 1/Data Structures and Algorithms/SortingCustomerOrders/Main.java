package SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 300.0),
            new Order(4, "Dave", 200.0),
            new Order(5, "Eve", 100.0)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        BubbleSort.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset orders array for Quick Sort
        orders = new Order[]{
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 300.0),
            new Order(4, "Dave", 200.0),
            new Order(5, "Eve", 100.0)
        };

        // Quick Sort
        System.out.println("Quick Sort:");
        QuickSort.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

// Output:
// Bubble Sort:
// Order{orderId=5, customerName='Eve', totalPrice=100.0}
// Order{orderId=2, customerName='Bob', totalPrice=150.0}
// Order{orderId=4, customerName='Dave', totalPrice=200.0}
// Order{orderId=1, customerName='Alice', totalPrice=250.0}        
// Order{orderId=3, customerName='Charlie', totalPrice=300.0}      
// Quick Sort:
// Order{orderId=5, customerName='Eve', totalPrice=100.0}
// Order{orderId=2, customerName='Bob', totalPrice=150.0}
// Order{orderId=4, customerName='Dave', totalPrice=200.0}
// Order{orderId=1, customerName='Alice', totalPrice=250.0}        
// Order{orderId=3, customerName='Charlie', totalPrice=300.0}  

