import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0 || num == 1)
            System.out.println(num+" is not prime");
        else if(num==2)
            System.out.println(num+" is even prime");
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num+" is not a prime");
                    break;
                } else {
                    System.out.println(num+" is a prime");
                    break;
                }
            }

        }
    }}
