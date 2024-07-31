package TaskManagementSystem;

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a new task to the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by taskId
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by taskId
    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task(1, "Design Database", "In Progress");
        Task task2 = new Task(2, "Develop Backend", "Pending");
        Task task3 = new Task(3, "Create UI", "Completed");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("All tasks:");
        taskList.traverseTasks();

        System.out.println("Search for task with ID 2:");
        System.out.println(taskList.searchTask(2));

        System.out.println("Deleting task with ID 2");
        taskList.deleteTask(2);

        System.out.println("All tasks after deletion:");
        taskList.traverseTasks();
    }
}
