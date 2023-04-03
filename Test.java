public class Test{
    public static void main(String[] args){
        VoiceMessageUtil voiceMessageUtil = new VoiceMessageUtil();

        System.out.println(voiceMessageUtil.greeting());
        System.out.println(voiceMessageUtil.greeting("Shreyas"));
        System.out.println(voiceMessageUtil.greeting("Shreyas",54));
        System.out.println(voiceMessageUtil.getCurrentDate());
        voiceMessageUtil.getCurrentDateAsDate();
    }
}