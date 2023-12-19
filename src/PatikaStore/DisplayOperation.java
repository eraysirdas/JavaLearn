package PatikaStore;

import java.util.Scanner;

public class DisplayOperation {
    Scanner sca = new Scanner(System.in);

    public void initialization(){
        System.out.println("\nPatikaStore Ürün Yönetim Paneli\n");
        System.out.println("1- Notebook İşlemleri\n"+
                "2- Cep Telefonu İşlemleri\n"+
                "3- Marka Listele\n"+
                "0- Çıkış Yap\n");

        System.out.print("İşlem Seçiniz : ");
        int select = sca.nextInt();
        switch (select)
        {
            case 1 :
                new Operation().displayProduct(1);
                break;

            case 2 :
                new Operation().displayProduct(2);
                break;

            case 3 :
                new Operation().displayProduct(3);

            case 0 :
                System.out.println("Çıkış yapıldı...");
                break;
        }

    }
}
