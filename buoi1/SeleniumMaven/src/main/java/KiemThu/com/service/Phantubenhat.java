package KiemThu.com.service;

public class Phantubenhat {
    public static int findMinElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
