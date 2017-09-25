import java.util.Scanner;

public class offlineTaskOne {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер масива");

        int[] array = new int[scanner.nextInt()];
        System.out.println("введите значения масива");
        for (int i = 0 ; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(arr(array));
        System.out.println(maxValue(array));
    }

    public static int arr(int[] array){

        int maxval = array[0];
        int maxind = 0;
        for (int i = 0 ; i<array.length; i++){
            if (array[i]>maxval){
                maxval = array[i];
                maxind = i;
            }
        }

        return maxind;
    }
    public static int maxValue (int[] array){
       return array[arr (array)];
    }


}
