public class TaskManagementSystem {
    private TaskNode head;
    private TaskNode tail;

    public TaskManagementSystem() {
        head = null;
        tail = null;
    }

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Task searchTaskById(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTaskById(int taskId) {
        if (head == null) {
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();

        system.addTask(new Task(1, "Task A", "Pending"));
        system.addTask(new Task(2, "Task B", "In Progress"));
        system.addTask(new Task(3, "Task C", "Completed"));

        System.out.println("All tasks:");
        system.traverseTasks();

        Task foundTask = system.searchTaskById(2);
        if (foundTask != null) {
            System.out.println("\nTask found: " + foundTask);
        } else {
            System.out.println("\nTask not found.");
        }

        system.deleteTaskById(2);

        System.out.println("\nTasks after deletion:");
        system.traverseTasks();
    }
}
