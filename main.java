import java.util.Arrays;
import java.util.Scanner;

public class lb1 {

    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");
        int x = 1010101100;
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }
        Scanner S = new Scanner(System.in);
        int scan = S.nextInt();
        int n = arr.length - 1;
        for (int i = 0; i < scan; i++) {
            xor(arr,n);
        }
    }

    public static void xor (int [] array, int n){
        int temp = array[n];
        for (int i = n; i > 0; i--) {
            array[i] = array[i-1];
        }
        if (((temp == 1) & (array[n] == 1)) | ((temp == 0) & (array[n] == 0)))
            array[0] = 0;
        else    array[0] = 1;
        String str2 = "";
        for (int value : array) {
            str2 = str2.concat(String.valueOf(value));
        }
        System.out.println(str2);
        System.out.println(Integer.parseInt(str2, 2));
    }
}
