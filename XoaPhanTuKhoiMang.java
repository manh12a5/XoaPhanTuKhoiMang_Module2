import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 7, 5, 6, 2, 9, 8, -1};
        System.out.println(Arrays.toString(arr));
        int number;
        System.out.print("Nhap so: ");
        number = scanner.nextInt();
        int a = checkIndex(arr, number);
        deleteNumber(arr, a);
        System.out.println(Arrays.toString(arr));
    }

    public static int checkIndex(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public static void deleteNumber(int[] arr, int index) {
        if (index >= 0) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        } else {
            System.out.println("Khong co so trong mang");
        }
    }
}
