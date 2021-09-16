import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> courses=new ArrayList<String>();
    ArrayList<String> messages=new ArrayList<String>();
    boolean isBanned=false;

    public Student(int ID, String name, String password) {
        super(ID, name, password);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void checkGrades(){
        System.out.println("grades");
    }

    public void checkMessages(){
        System.out.println("Messages");
    }

    public void submitProjects(){
        System.out.println("Project submited");
    }

}
