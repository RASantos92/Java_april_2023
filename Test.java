import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        VoiceMessageUtil voiceMessageUtil = new VoiceMessageUtil();

        // System.out.println(voiceMessageUtil.greeting());
        // System.out.println(voiceMessageUtil.greeting("Shreyas"));
        // System.out.println(voiceMessageUtil.greeting("Shreyas",54));
        // System.out.println(voiceMessageUtil.getCurrentDate());
        // voiceMessageUtil.getCurrentDateAsDate();

        //----------------- fixed arrays--------------------

        // int[] messagesPerDay = new int[5]; // [5,5,5,0,0]
        // messagesPerDay[0] = 5;
        // messagesPerDay[1] = 5;
        // messagesPerDay[2] = 5;

        int[] messagesPerDay = {5,4,6};

        String[] messages = {"String1", "String2", "String3"};

        System.out.println(voiceMessageUtil.totalMessages(messagesPerDay));


        voiceMessageUtil.printMessages(messages);

        //--------------- Dynamic arrays------------------

        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish cafe bussiness logic");
        todoList.add("Read ahead for oop");

        voiceMessageUtil.printMessages(todoList);

        int days = 7;
        double costOfLiving = 40.54;

        // implicit casting
        double totalCost = days * costOfLiving;// const: double; day: int => double (no loss of data so java will implicitly convert int to double)
        System.out.println(totalCost);

        // explicitly casting
        int roundedTotalCost = days * (int) costOfLiving;
        System.out.println(roundedTotalCost);
        String test = "40";
        
        System.out.println((int) Integer.valueOf(test));
    }
}