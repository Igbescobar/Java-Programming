import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> todo;

  public TodoList() {
    this.todo = new ArrayList<>();
  }

  public void add(String task) {
    this.todo.add(task);
  }

  public void print() {
    int index = 1;
    for (String eachTodo : this.todo) {
      System.out.println(index + ": " + eachTodo);
      index++;
    }
  }

  public void remove(int number) {
    this.todo.remove(number - 1);
  }

}
