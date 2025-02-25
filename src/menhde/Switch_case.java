package menhde;

public class Switch_case {
    public static void main(String[] args){
        int day=7;
        switch (day){
            case 2:
                System.out.println("thứ 2");
                break;
            case 3:
                System.out.println("thứ 3");
                break;
            case 4:
                System.out.println("thứ 4");
                break;
            case 5:
                System.out.println("thứ 5");
                break;
            default:
                System.out.println("cuối tuần");
                break;
        }
    }
}
/*
Đề bài: Viết chương trình nhập vào một số nguyên (1-7) và in ra ngày trong tuần tương ứng.

🔹 Ví dụ:

Nhập 1 → Kết quả: "Thứ Hai"
Nhập 7 → Kết quả: "Chủ Nhật"
Nhập 9 → Kết quả: "Không hợp lệ"
 */