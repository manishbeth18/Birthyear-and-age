import java.util.*;
public class Birthyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthyear = sc.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        
        int age = currentYear - birthyear;
        
        System.out.println("Your age is: " + age);
        
        sc.close();
    }

}
