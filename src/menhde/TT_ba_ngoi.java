package menhde;

public class TT_ba_ngoi {
    public static void main(String[] args) {
        int age = 15;
        String ketqua =
                (age > 16) ? "tuổi vị thành niên" :
                        (age >= 30) ? "tuổi thanh niên":
                                (age>=40)  ? "tuổi trung niên":
                                        (age>=60)? "tuổi già": "tuổi sơ sinh";
        System.out.println(ketqua);
    }
}
