import java.util.Scanner;

public class Ninth {
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();        
        
        
        System.out.println("Physics marks = "+  marks[0]);
        System.out.println("Physics marks = "+  marks[1]);
        System.out.println("Physics marks = "+  marks[2]);
        System.out.println(marks.length);
    }
}
