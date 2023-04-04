import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        Developer dev = new Developer();
        System.out.println(dev);

        dev.setName("Abebe");
        dev.setWorkingHours(40);
        dev.setSalary(120000.52);
        dev.languages.add("python");
        dev.languages.add("javaScript");
        dev.languages.add("Java");
        dev.displayStatus();

        Project project1 = new Project();

        project1.title = "navigation";
        project1.language = "Java";

        Project project2 = new Project();
        
        project2.title = "weather api";
        project2.language = "python";

        dev.addProject(project1);
        dev.addProject(project2);

        dev.displayStatus();

        System.out.println("********************************************");
        Developer dev1 = new Developer("Shreyas", 34, 120000.53);
        dev1.addProject(project1);
        dev1.displayStatus();


        System.out.println("Dev count: " + Developer.getDevCount());

        //240000
        dev1.setSalary(140000);

        //260000
        System.out.println("total salary from all devs : " + Developer.getTotalSalary());

        System.out.println("total number of projects Devs are working on: " + Developer.getTotalProjects());

    }
}