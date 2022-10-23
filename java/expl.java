// Hello world program

public class expl {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //mükemmel sayılar
        int sayi = 6;

        
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
        
    }
}