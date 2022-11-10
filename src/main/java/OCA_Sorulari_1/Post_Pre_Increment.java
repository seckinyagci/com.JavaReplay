package OCA_Sorulari_1;

public class Post_Pre_Increment {
    public static void main(String[] args) {
        // pre incrementte her iki islemde önce oldugu icin iki atamada ayni anda olur.
        // post increment olsaydi num2 ilk basta 9 olacak sonrasinda num1 10 olacakti
        int num1=9;
        int num2=++num1;

        if(num1<10){
            System.out.println("num1 10 degil" +num1);}
        else {
            System.out.println("num1 = "+num1);
        }
        if (num2<10){
            System.out.println("num2 10 degil");}
        else {
            System.out.println("num2 = "+num2);
        }



    }

}
