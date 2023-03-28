import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int fib1=0, fib2=1, result, count;
        System.out.println("Enter count:");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.print(fib1);
        System.out.print(" "+fib2);
        for(int i=2; i<count; i++){
            result= fib1+fib2;
            System.out.print(" "+result);
            fib1=fib2;
            fib2=result;
        }
    }
}