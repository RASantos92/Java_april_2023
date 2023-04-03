import java.util.Date;
public class VoiceMessageUtil{
    public String greeting(){
        return "hello you";
    }

    public String greeting(String name){
        return "hello "  + name;
    }

    public String greeting(String name, Integer age){
        return "hello "  + name + " you age is " + age;
    }

    public String getCurrentDate(){
        Date today = new Date();
        return "Hello, the current date is: " + today;
    }

    public void getCurrentDateAsDate(){
        Date today = new Date();
        System.out.println(today);
    }


}