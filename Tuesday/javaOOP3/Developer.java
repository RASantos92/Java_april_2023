import java.util.ArrayList;
public class Developer{
    //------------------ attributes (private/protected) ----------------------
    private String name;
    private int workingHours;
    private double salary;

    // Static Variables
    private static int devCount;
    private static double totalSalary;
    private static int totalProjects;

    public ArrayList<String> languages;
    public ArrayList<Project> projects;


    //------------------ constructors ----------------------
    public Developer(){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        Developer.devCount++;
    }

    public Developer(String name, int workingHours, double salary){
        this.name = name;
        this.workingHours = workingHours;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        Developer.devCount++;
        Developer.totalSalary += salary;
    }

    //------------------ other class methods ----------------------
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
        Developer.totalProjects++;
        this.projects.add(project);
    }

    //------------------ getters / setters  ----------------------

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
        Developer.totalSalary -= this.salary;
        Developer.totalSalary += salary;
        this.salary = salary;
    }


    // Static methods
    public static int getDevCount(){
        return devCount;
    }

    public static double getTotalSalary(){
        return Developer.totalSalary;
    }

    public static int getTotalProjects(){
        return Developer.totalProjects;
    }
}