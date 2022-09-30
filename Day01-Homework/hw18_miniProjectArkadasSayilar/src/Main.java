
public class Main {

    public static void main(String[] args) {
        
        int number1= 220;
        int number2 = 284;
        
        int total1 = 1;
        int total2 = 1;
        
        for(int i=2; i<=number1/2; i++){
            if(number1%i==0){
                total1 += i;
            }
        }
        for(int i=2; i<=number2/2; i++){
            if(number2%i==0){
                total2 += i;
            }
        }
        
        if(number1==total2 && number2==total1){
            System.out.println(number1 + " ve " + number2 + " arkadaş sayıdır..");
        }
        else{
            System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir..");
        }
    }
    
}
