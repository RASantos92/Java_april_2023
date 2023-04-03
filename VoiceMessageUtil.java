import java.util.Date;
import java.util.ArrayList;
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
    public String greeting(int age){
        return "hello you age: "  + age;
    }

    public String getCurrentDate(){
        Date today = new Date();
        return "Hello, the current date is: " + today;
    }

    public void getCurrentDateAsDate(){
        Date today = new Date();
        System.out.println(today);
    }

    public int totalMessages(int[] intArr){
        int output = 0;
        for(int i = 0; i< intArr.length; i++){
            output += intArr[i];
        }
        return output;
    }

    public void printMessages(String[] msgArray){
        // traditional forloop

        // for( int i = 0 ; i<msgArray.length; i++){
        //     System.out.println(msgArray[i]);
        // }

        //enhanced forloop

        for(String message : msgArray){
            System.out.println(message);
        }

    }

    public void printMessages(ArrayList<String> msgArrayList){
        // traditional forloop
        for(int i = 0; i<msgArrayList.size(); i++){
            System.out.println(msgArrayList.get(i));
        }

        //enhanced forloop

        for(String message : msgArrayList){
            System.out.println(message);
        }
    }
}