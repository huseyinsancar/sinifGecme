import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin : ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu girin : ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu girin : ");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuzu girin : ");
        turkce = inp.nextInt();

        System.out.println("Muzik notunuzu girin : ");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + muzik);
        double ortalama = toplam / 6;

        boolean kosul = ortalama >=60;
        String gectiMi = kosul ? "Sınıfı geçti." : "Sınıf tekrarı";
        System.out.println(gectiMi);

    }
}
