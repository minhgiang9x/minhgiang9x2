package menhde;

public class PL_tuoi {
    public static void main(String[] args){
        int tuoi=10;
        if(tuoi>=16){
            System.out.println(tuoi+"tuổi: tuổi vị thành niên");
        }
        else if(tuoi >=18) {
            System.out.println(tuoi+"tuổi: tuổi thành niên");
        }
        else if(tuoi>=30) {
            System.out.println(tuoi+"tuổi: tuổi trung niên");
        }
        else if(tuoi>=1){
            System.out.println(tuoi+"tuổi:sơ sinh");
        }
        else {
            System.out.println(tuoi+ "Tuổi: tuổi già");
        }
    }
}
