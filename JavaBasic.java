public class JavaBasic{
    // entry point
    // public because this method needs to be callable outside the class.
    // static methods can be called without having to create an instance of the class to call it. JavaBasic.main()
    // JRE by default will call on your class.main(args) 
    public static void main(String[] args){
        System.out.println("hello world");

        // Variable declaration
        String firstName = "Abebe";
        String lastName = "Leon";
        int age = 25;
        boolean isStudent = true;
        Double weight = 175.52;
        char grade = 'A';
        System.out.println(firstName + " " + lastName);
        System.out.println(age + "\n" + isStudent + "\n" + weight);
        System.out.println(Integer.MAX_VALUE);

        // Conditionals

        // if(weight < 100){
        //     System.out.println("you have to gain some weight");
        // } else {
        //     System.out.println("you are fine");
        // }

        System.out.println(weight < 100 ? "you have to gain some weight" : "you are fine");

        // More on Strings

        String name = "Calvin Leong";
        System.out.println(name.length());

        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String greeting = String.format("Hi %s, you are %d years old", fullName, age);
        // System.out.println(greeting);
        System.out.printf("Hi %s, you are %f years old \n", fullName, weight);

        // creating a string
        String firstName1 = "Omar";
        String firstName2 = new String("Omar");
        String firstName3 = "Omar";

        System.out.println(firstName1 == firstName2);// false
        System.out.println(firstName1 == firstName3);// true

        System.out.println(firstName2.equals(firstName1));// true




    }
}