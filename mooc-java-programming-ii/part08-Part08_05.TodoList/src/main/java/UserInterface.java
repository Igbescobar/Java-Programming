import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private TodoList todoList;

  public UserInterface(TodoList todoList, Scanner scanner) {
    this.scanner = scanner;
    this.todoList = todoList;
  }

  public void start() {
    while (true) {
      System.out.println("Command:");
      String input = scanner.nextLine();
      if (input.equals("stop")) {
        break;
      } else if (input.equals("add")) {
        System.out.println("To add:");
        String task = scanner.nextLine();
        todoList.add(task);
      } else if (input.equals("list")) {
        todoList.print();
      } else if (input.equals("remove")) {
        System.out.println("Which one is removed?");
        int value = Integer.parseInt(scanner.nextLine());
        todoList.remove(value);
      }
    }
  }
}
