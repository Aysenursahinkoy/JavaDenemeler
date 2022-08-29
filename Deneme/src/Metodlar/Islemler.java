package Metodlar;


import java.util.Scanner;

public class Islemler{
    public static void main(String[] args) {
        /*

        While döngüsü yardýmýyla bir tane ATM programý yapmaya çalýþýn.
        
        Ýþlemler 
        1.Ýþlem : Bakiye Öðrenme
        2.Ýþlem : Para Çekme
        3.Ýþlem : Para Yatýrma
        Çýkýþ : q
        
        */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.Ýþlem : Bakiye Öðrenme\n"
                          + "2.Ýþlem : Para Çekme\n"
                          + "3.Ýþlem : Para Yatýrma\n"
                          + "Çýkýþ için q'a basýn";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("Ýþlemi Seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan Çýkýlýyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.print("Çekmek istediðiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0) {
                    
                    System.out.println("Yeterli Bakiye Yok . Bakiyeniz : " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }
                
                
            }
            else if (islem.equals("3")){
                System.out.print("Yatýrmak istediðiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz  : " + bakiye);
                
            }
            else {
                System.out.println("Geçersiz Ýþlem...");
            }
            
            
        }

        
        
    }
}