
public class Main {

    public static void main(String[] args) {
        String newMessage = message();
        System.out.println(newMessage);
        
        int number = topla(5,7);
        System.out.println("Toplam: " + number);
    }
    
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static String message(){
        return "Ankara";
    }
    public static int topla(int num1, int num2){
        return num1+num2;
    }
}
