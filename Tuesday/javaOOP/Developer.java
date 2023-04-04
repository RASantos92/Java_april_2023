import java.util.ArrayList;
public class Developer{
    //attributes
    public String name;
    public int workingHours;
    public double salary;
    public ArrayList<String> languages;
    public ArrayList<Project> projects = new ArrayList<Project>();

    // methods
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("workingHours: " + this.workingHours);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);
        System.out.println("projects: ");
        for(Project project : this.projects){
            project.displayInfo();
        }
    }
    
    public void addProject(Project project){
        this.projects.add(project);
    }
}