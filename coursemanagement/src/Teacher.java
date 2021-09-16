import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> courses=new ArrayList<String>();
    ArrayList<String> emails=new ArrayList<String>();

    public Teacher(int ID, String name, String password) {
        super(ID, name, password);
    }

    public void sendEmailToGroup(){
        System.out.println("Send Email to group");
    }

    public void sendEmailToSomeone(Teacher teacher,Student student,String text){
        String message = teacher + text;
        student.messages.add(message);
    }

    public void createNewProject(){
        new Project("Maths");
    }

    public void acceptProject(Project project){
        project.setAccepted(true);
    }

    public void rejectProject(Project project){
        project.setAccepted(false);
    }
}
