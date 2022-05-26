public class Arithmetic {
    public static void main(String args[]){
        //addition
        double balance = 1232.43;
        double depositAmount = 342;
        balance += depositAmount;

        balance++;

        //subtraction
        double withdrawAmount = 323;
        balance -= withdrawAmount;

        balance--;

        System.out.println(balance);

        //multiplication
        double paymentPerHour = 500.32;
        int workHours = 8;

        double payment = paymentPerHour * workHours;

        System.out.println(payment);

        //division
        int totalDays = 14;
        int daysInWeek = 7;
        int weeks = totalDays / daysInWeek;

        System.out.println(weeks);

        //modulo
        int cookies = 47;
        int leftOver = cookies % 3;

        System.out.println(leftOver);
    }
}