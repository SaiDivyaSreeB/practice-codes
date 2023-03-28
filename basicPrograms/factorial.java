import java.util.Scanner;
//public class factorial {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=num;i++){
//         fact = fact *i;
//        }
//        System.out.println(fact);
//    }
//}
//using recursion
public class factorial {
    public static int fact(int num){

            if(num>0)
                return num*fact(num-1);
            else
                return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println(result);
    }
}