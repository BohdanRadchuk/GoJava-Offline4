import java.util.Scanner;

public class offlineTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite x");
        int x = scanner.nextInt();
        System.out.println("vvedite stepen");
        int n = scanner.nextInt();
        System.out.println(stepen(x,n));

    }
    public static int stepen(int x, int n){
        if (n>0){
            return x*stepen(x,n-1);}
        return 1;

    }

}

