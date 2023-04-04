import java.util.ArrayList;
public class Developer{
    //attributes
    private String name;
    private int workingHours;
    private double salary;
    public ArrayList<String> languages;
    public ArrayList<Project> projects;

    // constructor
    public Developer(){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

    public Developer(String name, int workingHours, double salary){
        this.name = name;
        this.workingHours = workingHours;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

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

    // getters and setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWorkingHours(){
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}