public class Variable {
    public static void main(String[] args) {
        //type of variables
        int age = 20;
        boolean isEmployed = false;
        double IQ = 120.34;
        char firstLetter = 'A';
        String builtInString = ":O Java has a built in string object";

        System.out.println("I am " + age + " years old");
        System.out.print("Are you employed currently: ");
        System.out.print((isEmployed) ? "Yes" : "No");
        System.out.println("\nMy IQ is " + IQ);
        System.out.println("First letter of alphabet is " + firstLetter);
        System.out.println(builtInString);
    }
}