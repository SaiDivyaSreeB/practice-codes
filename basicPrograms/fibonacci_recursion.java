import java.util.Scanner;

public class fibonacci_recursion {
    public static int fib(int fib1, int fib2, int count){
        int i=2;
        if(i<count) {
            int result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
            count--;
            System.out.print(" "+result);
            return result + fib(fib1, fib2, count--);
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        int fib1=0, fib2 =1;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(" "+fib1);
        System.out.print(" "+fib2);
        //System.out.println(fib(fib1, fib2, count));
        fib(fib1, fib2, count);
    }
}
