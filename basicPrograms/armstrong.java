import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int test = num;
        double sum = 0;
        while(test!=0) {
            int rem = test % 10;
            sum = sum + Math.pow(rem, 3);
            test = test/10;
        }
        if(num==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
}
