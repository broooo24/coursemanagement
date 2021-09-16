import java.util.ArrayList;

public class Courses {
    ArrayList<String > courses = new ArrayList<String >();
    int price;
    String courseName;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public Courses(String courseName,int price) {
        this.price = price;
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourses(String course) {
        courses.add(course);
    }

}
