import java.util.Scanner;

/**
 * not
 */
public class not {

    public static void main(String[] args) {
        int mat,fiz,muz,tur,kim,bol=5;
        double ort;
        Scanner scn= new Scanner(System.in);
        System.out.println("lütfen matematik notunuzu girin");
        mat=scn.nextInt();
        if(mat<0 || mat>100){
            mat=0;
            bol--;
        }
        System.out.println("lütfen fizik notunuzu girin");
        fiz=scn.nextInt();
        if(fiz<0 || fiz>100){
            fiz=0;
            bol--;
        }
        System.out.println("lütfen müzik notunuzu girin");
        muz=scn.nextInt();
        if(muz<0 || muz>100){
            muz=0;
            bol--;
        }
        System.out.println("lütfen türkçe notunuzu girin");
        tur=scn.nextInt();
        if(tur<0 || tur>100){
            tur=0;
            bol--;
        }
        System.out.println("lütfen kimya notunuzu girin");
        kim=scn.nextInt();
        if(kim<0 || kim>100){
            kim=0;
            bol--;
        }

        ort=(mat+fiz+kim+tur+muz)/bol;

        if (ort<60) {System.out.println("kaldınız efenim notunuz : " +ort);
            
        }
        else{
            System.out.println("geçtiniz efenim notunuz : "+ort);
        }
        
    }
}