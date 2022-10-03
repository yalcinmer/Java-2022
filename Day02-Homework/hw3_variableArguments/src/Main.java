
public class Main {

    public static void main(String[] args) {
        int toplam = topla();
        System.out.println(toplam);
        int toplam1 = topla(2,5,9,6);
        System.out.println(toplam1);
    }
    
    public static int topla(int...sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
