import java.util.ArrayList;

public class MessagingService {
  private ArrayList<Message> listOfMessages;

  public MessagingService() {
    this.listOfMessages = new ArrayList<>();
  }

  public void add(Message message) {
    if (message.getContent().length() <= 280) {
      listOfMessages.add(message);
    }
  }

  public ArrayList<Message> getMessages() {
    return listOfMessages;
  }

}
