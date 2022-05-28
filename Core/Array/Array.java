import java.util.Arrays;

class Array {
    public static void main(String[] args)
    {
        String[] doggoNames = {"spark", "tom", "pup", "ciao", "cuttles", "dan"};
        System.out.println(Arrays.toString(doggoNames));

        System.out.println("My doggos name is " + doggoNames[2]);
        System.out.println("Total doggos " + doggoNames.length);
    }
}