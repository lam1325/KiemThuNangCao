package KiemThu.com.service;

import java.util.List;

public class TrungBinhCong {
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Không thể tinh trung binh cộng của danh sách trống");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
