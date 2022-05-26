public class LogicalOperator {
    public static void main(String[] args) {
        /* 
            Logical Operators
            - < => smaller than
            - > => greater than
            - == => equal to
            - != => not equal to
            - <= => smaller than or equal to
            - >= => greater than or equal to

            - .equals() => to compare to string
        */

        int grade = 45;

        if(grade < 33)
        {
            System.out.println("Fail");
        }

        else if(grade < 50)
        {
            System.out.println("C");
        }

        else if(grade < 79)
        {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }


        String a = "app";
        String b = "apple";

        System.out.println(a.equals(b));
    }
}
