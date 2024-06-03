import java.util.Scanner;

public class UserInterface {
  private TodoList todoList;
  private Scanner scanner;

  public UserInterface(TodoList todolist, Scanner scanner) {
    this.todoList = todolist;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.println("Command:");
      String command = scanner.nextLine();
      if (command.equals("stop")) {
        break;
      } else if (command.equals("add")) {
        System.out.println("To add:");
        String toAdd = scanner.nextLine();
        this.todoList.add(toAdd);
      } else if (command.equals("list")) {
        this.todoList.print();
      } else if (command.equals("remove")) {
        System.out.println("Which one is removed?");
        int number = Integer.parseInt(scanner.nextLine());
        this.todoList.remove(number);
      }
    }
  }
}
