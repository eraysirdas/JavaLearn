package PatikaStore;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Operation{
    public TreeSet<Telephone> telSet = new TreeSet<>(new Comparator<Telephone>(){
        @Override
        public int compare(Telephone o1, Telephone o2) {
            return o1.getProductBrandId()-o2.getProductBrandId();
        }
    });
    public TreeSet<Notebook> notSet = new TreeSet<>(new Comparator<Notebook>() {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            return o1.getProductBrandId()-o2.getProductBrandId();
        }
    });
    public TreeSet<Brand> brandSet = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getBrandName().compareTo(o2.getBrandName());
        }
    });
    public TreeSet<Brand> brandList(){
        brandSet.add(new Brand(1, "Samsung"));
        brandSet.add(new Brand(2, "Lenovo"));
        brandSet.add(new Brand(3, "Apple"));
        brandSet.add(new Brand(4, "Huawei"));
        brandSet.add(new Brand(5, "Casper"));
        brandSet.add(new Brand(6, "Asus"));
        brandSet.add(new Brand(7, "HP"));
        brandSet.add(new Brand(8, "Xiamoi"));
        brandSet.add(new Brand(9, "Monster"));

        return brandSet;
    }
    public TreeSet<Telephone> telephoneList() {
        telSet.add(new Telephone(1, 3199, "Samsung", "SAMSUNG GALAXY A51", "128", "6.5", "6","4000.0","32","Siyah"));
        telSet.add(new Telephone(2, 7379, "Apple", "iPhone 11 64 GB\t", "64", "\t6.1\t", "6", "3046.0\t", "5\t", "Mavi\t"));
        telSet.add(new Telephone(3, 4012, "Xiaomi", "Redmi Note 10 Pro", "128", "6.5", "8", "4000.0", "64", "Beyaz"));
       return telSet;
    }
    public void telephoneListPrint(TreeSet<Telephone> telephones){
        System.out.println("Cep Telefonu Listesi");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID |\tÜrün Adı\t\t\t\t\t| Fiyat\t\t\t| Marka\t\t| Depolama\t | Ekran\t| Pil\t\t\t| RAM\t\t\t| Renk \t\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        for (Telephone phone : telephones) {
            System.out.println("| " + phone.getProductBrandId() + " |\t" + phone.getProductName() + "\t\t\t| " + phone.getPrice() + " TL\t\t| " +
                    phone.getProductBrandName() + "\t| " + phone.getMemory() + " GB\t | " + phone.getScreenSize() + " inc\t| " +
                    phone.getBattery() + "\t\t| " + phone.getRam() + " GB\t\t| " + phone.getColor() + " |");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }

    public TreeSet<Notebook> notebookList(){
        notSet.add(new Notebook(1,7000,"Huawei","HUAWEI Matebook 14","512","14.0","16"));
        notSet.add(new Notebook(2,3699,"Lenova","LENOVO V14 IGL","1024","14.0","8"));
        notSet.add(new Notebook(3,8199,"Asus","ASUS Tuf Gaming","2048","15.6","32"));
        return notSet;
    }
    public void notebookListPrint(TreeSet<Notebook> notebooks){
        System.out.println("Notebook listemiz!!!");

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("| ID |\tÜrün Adı\t\t\t\t| Fiyat\t\t\t| Marka\t\t| Depolama\t | Ekran\t| RAM\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.println("| " + notebook.getProductBrandId() + " |\t" + notebook.getProductName() + "\t\t\t| " + notebook.getPrice() + " TL\t\t| " +
                    notebook.getProductBrandName() + "\t| " + notebook.getMemory() + " GB\t | " + notebook.getScreenSize() + " inc\t| " +
                    notebook.getRam() + " GB\t|");
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void displayProduct(int select){


        switch (select)
        {
            case 1 :
                notebookListPrint(notebookList());
                break;

            case 2 :
                telephoneListPrint(telephoneList());
                break;

            case 3 :
                brandListPrint(brandList());

        }
        System.out.println("0 - Çıkış yap");
        System.out.print("İşlem Seçin : ");
        Scanner sca =new Scanner(System.in);
        int transition=sca.nextInt();
        new DisplayOperation().initialization();

    }

    private void brandListPrint(TreeSet<Brand> brands) {
        System.out.println("Cep Telefonu Listesi");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        for(Brand brand : brands){
            System.out.println(brand.getBrandName());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }

}
