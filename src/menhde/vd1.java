package menhde;
import java.lang.String;
import java.lang.Math;
public class vd1 {
    public static void main(String[] args) {
        String text = "Hello Java!";
        int so=4;
        System.out.println("Độ dài chuỗi: " + text.length());
        System.out.println("Chữ hoa: " + text.toUpperCase());
        System.out.println("Chữ thường: " + text.toLowerCase());
        System.out.println("Chuỗi chứa 'Java'? " + text.contains("Java"));
        System.out.println("căn bậc 2: "+Math.sqrt(so));
        System.out.println("số lớn nhất: "+Math.max(10,20));
        System.out.println("số bé nhất: "+Math.min(10,20));

    }
}