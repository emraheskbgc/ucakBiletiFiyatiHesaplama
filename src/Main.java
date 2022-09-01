import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int distance , age, tripType;
        double distancePrice , total;
        distancePrice= 0.10;

        System.out.print("Lütfen Gideceğiniz Mesafeyi Giriniz = ");
        distance = input.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz = ");
        age = input.nextInt();
        System.out.println("Lütfen Yolculuk Tipini Seçiniz \n 1- Tek Yön \n 2- Gidiş Dönüş\n" );
        tripType = input.nextInt();

        total = distance * distancePrice;
        System.out.println();


        if ((distance > 0 && age > 0) && (tripType == 1 || tripType == 2) ){

           if (age < 12){
               total = total/2;

           }else if (age > 12 && age < 24){
               total = total - (total*0.10);

           }else if (age > 65){
               total = total - (total * 0.30);

           }
        }else
        {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        switch (tripType){
            case 1 :
                System.out.println(" Yolculuk Toplam Ücretiniz = " + total);
                break;

            case 2 :
                total = total - (total * 0.20);
                System.out.println("Yolcuğunuzun Toplam Ücreti = " + total * 2 );
                break;
        }


    }
}
