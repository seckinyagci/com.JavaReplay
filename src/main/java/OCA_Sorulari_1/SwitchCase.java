package OCA_Sorulari_1;

public class SwitchCase {
    public static void main(String[] args) {

        final char a = 'A', d='D'; // final keyword variable'in son degerini belirler

        char grade='B';

        switch (grade){
            case  a :
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break ;
            case  d :
            case 'F': System.out.print("not good");

        /* cevap: greatgood cünkü ilk variable grade degerine es degil,
        ikincisi grade variable'a es ve calisir.
        switchlerde kod calismaya baslayinca break yoksa sona kadar yazdir
        dolayisiyla ikinci case de calisir ve break ile switch sonlanir
         */


    }
}}
