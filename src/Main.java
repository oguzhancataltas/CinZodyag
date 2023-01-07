import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int dateOfBirth,mod;
        String zodyag = "";

        System.out.print("Doğum Yılınızı Giriniz : ");
        dateOfBirth = inp.nextInt();

        mod = dateOfBirth % 12;

        if ( dateOfBirth > 0 ) {
            switch (mod) {
                case 0:
                    zodyag = "Maymun";
                    break;
                case 1:
                    zodyag = "Horoz";
                    break;
                case 2:
                    zodyag = "Köpek";
                    break;
                case 3:
                    zodyag = "Domuz";
                    break;
                case 4:
                    zodyag = "Fare";
                    break;
                case 5:
                    zodyag = "Öküz";
                    break;
                case 6:
                    zodyag = "Kaplan";
                    break;
                case 7:
                    zodyag = "Tavşan";
                    break;
                case 8:
                    zodyag = "Ejderha";
                    break;
                case 9:
                    zodyag = "Yılan";
                    break;
                case 10:
                    zodyag = "At";
                    break;
                case 11:
                    zodyag = "Koyun";
                    break;
            }
            System.out.println("Çin Zodyağı Burcunuz : " + zodyag);
        } else {
            System.out.println("Geçersiz İşlem!!!");
        }
    }
}
