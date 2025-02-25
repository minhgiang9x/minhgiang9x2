package menhde;
import java.util.Scanner;
public class vd6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số từ 1-7:");
        int ngay = scanner.nextInt();
        String tenngay;
        switch (ngay) {
            case 2: tenngay ="thứ 2"; break;
            case 3: tenngay ="thứ 3"; break;
            case 4: tenngay = "th 4"; break;
            case 5: tenngay = "th 5"; break;
            case 6: tenngay = "th 6"; break;
            case 7: tenngay = "cuối tuần"; break;
            case 1: tenngay = "cuối tuần"; break;
            default: tenngay="không hợp lệ"; break;

        }
        System.out.print("kết quả "+ tenngay);
        scanner.close();

    }
}

/*
Đề bài: Viết chương trình nhập vào một số nguyên (1-7) và in ra ngày trong tuần tương ứng.

🔹 Ví dụ:

Nhập 1 → Kết quả: "Thứ Hai"
Nhập 7 → Kết quả: "Chủ Nhật"
Nhập 9 → Kết quả: "Không hợp lệ"
 */