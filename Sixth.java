import java.util.Scanner;

public class Sixth {
    public static void addition(int a, int b){
         int sum = a+b;
         System.out.println("Total Number of sum is: "+ sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int num2 = sc.nextInt();
        addition(num1, num2);
    }
}
