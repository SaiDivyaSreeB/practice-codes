import java.util.Scanner;
//1(Left)
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print(" "+ '*');
//            }
//            System.out.println();
//        }
//    }
//}

//2(right)
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k-- ){
//            System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//3(middle triangle)
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k-- ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//4(double triangle)
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k-- ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=(i); j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=n-i;k++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//5 down left
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j =1; j<=(n-i); j++){
//                System.out.print("* ");
//            }
//            for(int k=i;k>1;k-- ){
//            System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}
//6 down right
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//              for(int k=2*i;k>0;k--){
//                System.out.print(" ");
//            }
//               for( int j =0; j<n-i; j++){
//            System.out.print("* ");
//            }
//               System.out.println();
//        }
//    }
//}
//7 middle down triangle
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k<=n;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//8 right side double triangle
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int j =1; j<=(i); j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//9 left side double triangle
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k-- ){
//            System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<n; i++){
//              for(int k=2*i;k>=0;k--){
//                System.out.print(" ");
//            }
//               for( int j =1; j<n-i; j++){
//            System.out.print(" *");
//            }
//               System.out.println();
//        }
//    }
//
//}
//10 down and up mixed triangle
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//          for(int i=1; i<=n; i++){
//            for(int j =1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k<=n;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++){
//            for(int j =1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k-- ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//11 empty triangle
//public class patterns{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//                for (int j = i; j <= n - 1; j++) {
//                    System.out.print(" ");
//                }
//            System.out.print("*");
//            if(i!=1) {
//                for (int k = 1; k <= 2*(i-1)-1; k++) {
//                    if(i!=n)
//                    System.out.print(" ");
//                    if(i==n)
//                        System.out.print("*");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//12 reverse empty triangle
//public class patterns{
//   public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();
//        for(int i=n; i>=1; i--){
//                for (int j = n; j>i; j--) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//                if(i!=1) {
//                    for (int k = 1; k <= 2*(i-1)-1; k++) {
//                    if(i!=n)
//                    System.out.print(" ");
//                    if(i==n)
//                        System.out.print("*");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//13 empty diamond
public class patterns{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
        for(int i=1; i<=n; i++){
                for (int j = i; j <= n - 1; j++) {
                    System.out.print(" ");
                }
            System.out.print("*");
            if(i!=1) {
                for (int k = 1; k <= 2*(i-1)-1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
                for (int j = n; j>i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i!=1) {
                    for (int k = 1; k <= 2*(i-1)-1; k++) {
                        System.out.print(" ");
                    }
                System.out.print("*");
            }
            System.out.println();
        }
  }
}