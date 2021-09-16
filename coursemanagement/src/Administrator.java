import java.util.Scanner;

public class Administrator extends Person{

    public Administrator(int ID, String name, String password) {
        super(ID, name, password);
    }

    public void setPricesToCourse(Courses courseName,int price){
        courseName.setPrice(price);
    }

    public void createNewCourse(String course){
        new Courses(course);
    }

    public void createNewCourseWithPrice(String course,int price){
        new Courses(course,price);
    }

    public void sendMessageToEveryone(){

    }

    public void sendMessageToSomeone(Student student,String text){
        student.messages.add(text);

    }

    public void addNewUser(int ID,String name,String password){
        new Student(ID, name, password);
    }

    public void banSomeone(Student student){
        student.isBanned = true;
    }
}
