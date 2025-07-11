public class AnaClass {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        CustomerManager customerManager2 = new CustomerManager();
        // yukardaki kullanımda customerManagerin new ve sonrasındaki Heap kısmı tanımlaması gereksiz oldu çünkü o da Manager2 ile aynı yeri gösteriyor
        customerManager = customerManager2;

        //value type
        int sayi1=  10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1= 30;
        System.out.println(sayi2);

        //dizilerin referans tipli olduğuna bir örnek
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar1 = sayilar2;
        sayilar2[0] =10;
        System.out.println(sayilar1[0]);


    }
}

