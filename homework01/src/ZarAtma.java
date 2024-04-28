
import java.util.Random;

public class ZarAtma {

    public static void main(String[] args) {
        Random random = new Random(); // Rastgele sayı üretmek için
        int denemeSayisi = 1;

        while (true) {
            int zar1 = random.nextInt(6) + 1; // 1 ile 6 arasında rastgele sayı üretmesi için
            int zar2 = random.nextInt(6) + 1; // 1 ile 6 arasında rastgele sayı üretmesi için

            denemeSayisi++;

            if (zar1 == 6 && zar2 == 5) {
                System.out.println(denemeSayisi + ". denemede 6-5 geldi.");

                /* hangi deneme sonucunda 6-5 geleceğini bilmiyoruz .
                 Eğer 12. denemede 6-5 gelecek olsaydı çıktıda : "12. denemede 6-5 geldi." yazardı.
                 */

                break; // While ile sonsuz döngüye girdiği için istenen sonuca geldiğinde break ile durdurmak gerekiyor.
            }
        }
    }
}
