import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        Developer dev = new Developer();
        System.out.println(dev);

        dev.name = "Abebe";
        dev.workingHours = 40;
        dev.salary = 120000.52;
        dev.languages = new ArrayList<String>();
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



    }
}