public class Email {
    String nameOfTheSender;
    String nameOfTheReceiver;
    String title;
    String Message;

    public Email(String nameOfTheSender, String nameOfTheReceiver, String title, String message) {
        this.nameOfTheSender = nameOfTheSender;
        this.nameOfTheReceiver = nameOfTheReceiver;
        this.title = title;
        Message = message;
    }

    public Email(String nameOfTheSender, String title, String message) {
        this.nameOfTheSender = nameOfTheSender;
        this.title = title;
        Message = message;
    }
}
