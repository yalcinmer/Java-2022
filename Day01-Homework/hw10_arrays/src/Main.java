
public class Main {

    public static void main(String[] args) {
        
        String ogrenci1 = "merve";
        String ogrenci2 = "toprak";
        String ogrenci3 = "kadife";
        
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        
        System.out.println("----------");
        
        String [] ogrenciler = new String[3];
        ogrenciler[0] = "merve";
        ogrenciler[1] = "toprak";
        ogrenciler[2] = "kadife";
        
        for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        
        System.out.println("----------");
        
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
    
}
