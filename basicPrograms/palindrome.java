import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test;
        int i=0;
        int num = test = sc.nextInt();
        double sum =0;
        int length = (Integer.toString(num)).length();
        while(test!=0)
        {
            int rem = test%10;
            sum = sum + rem*Math.pow(10,length-i-1);
            test = test/10;
            i++;
        }
        if(sum==num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
