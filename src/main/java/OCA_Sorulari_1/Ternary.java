package OCA_Sorulari_1;

public class Ternary {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x>2 ? x<4 ? 10: 8:7);

       // yazinin cift mi tek mi oldugunu yazdirmak istersek
        int sayi =20;
        if (sayi%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }

        //ayni soruyu ternary ile yapalim
        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");

        // üstteki soruda icice iki ternary var
        // [ x>2 ? ilk ternary]
        // [x<4 ? 10:8 ikinci ternary ve ilk ternary'nin ilk olasiligi]
        // : 7 ilk ternary'nin ikinci olasiligi
        // ilk ternary dogru oldugu icin ilk olasilik
        // ilk olasilik yanlis oldugu icin onun ikinci olasiligi yani 8 yazdirilir

    }
}
