package mang_array;
public class BaiTapMang {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 5, 1};
        int tong = 0;
        int max = numbers[0];
        
        for(int num : numbers) {
            tong += num;
            if(num > max) max = num;
        }
        
        System.out.println("Tổng: " + tong); // Kết quả: 21
        System.out.println("Số lớn nhất: " + max); // Kết quả: 9
    }
}
