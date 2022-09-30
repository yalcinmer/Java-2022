import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int number = reader.nextInt();
        
        
        while(number<2){
            System.out.print("Lütfen 1'den büyük bir sayı girin:");
            number = reader.nextInt();
        }
        
        boolean ısPrimeNumber = true;
        
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                ısPrimeNumber = false;
            }
        }
        if(ısPrimeNumber){
            System.out.println(number + " asal sayıdır...");
        }
        else{
            System.out.println(number + " asal sayı değildir...");
        }
    }
    
}
