public class Project {
    String name;
    boolean isAccepted;

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, boolean isAccepted) {
        this.name = name;
        this.isAccepted = isAccepted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
