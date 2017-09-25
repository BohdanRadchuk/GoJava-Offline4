import java.util.Scanner;

public class offlineTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite 1 chislo");
        int a = scanner.nextInt();
        System.out.println("vvedite 2 chislo");
        int b = scanner.nextInt();
        System.out.println(count(a, b));


    }

    public static String count(int a, int b) {

        if (a < b) {

            return a +" "+ count (a+1,b);
        }
        return Integer.toString(a);
    }
}
