
public class Main {

    public static void main(String[] args) {
        
        int number=28;
        int total=1;
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println(number + " mükemmel bir sayıdır..");
        }
        else{
            System.out.println(number + " mükemmel bir sayı değildir..");
        }
    }
    
}
