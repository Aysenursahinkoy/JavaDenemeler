package Metodlar;


import java.util.Scanner;

public class Islemler{
    public static void main(String[] args) {
        /*

        While d�ng�s� yard�m�yla bir tane ATM program� yapmaya �al���n.
        
        ��lemler 
        1.��lem : Bakiye ��renme
        2.��lem : Para �ekme
        3.��lem : Para Yat�rma
        ��k�� : q
        
        */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.��lem : Bakiye ��renme\n"
                          + "2.��lem : Para �ekme\n"
                          + "3.��lem : Para Yat�rma\n"
                          + "��k�� i�in q'a bas�n";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("��lemi Se�iniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan ��k�l�yor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.print("�ekmek istedi�iniz tutar : ");
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
                System.out.print("Yat�rmak istedi�iniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz  : " + bakiye);
                
            }
            else {
                System.out.println("Ge�ersiz ��lem...");
            }
            
            
        }

        
        
    }
}