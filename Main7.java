import java.util.Scanner;

public class Main7 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r, alan, cevre;
        double pi = 3.14;

        System.out.println("Alan için 1'e,Çevre için 2'ye tıklayınız.");
        int karar=scan.nextInt();
        if (karar==1){
            System.out.print("Yarı çapını giriniz: ");
            r = scan.nextDouble();
            alan=pi*(r*r);
            System.out.println("Dairenin alanı " + alan);

        }else if(karar==2){
            System.out.print("Yarı çapını giriniz: ");
            r = scan.nextDouble();
            cevre=2*pi*r;
            System.out.println("Dairenin çevresi " + cevre);

        }else{
            System.out.println("Lütfen geçerli bir seçim yapınız");
        }


    }
}
