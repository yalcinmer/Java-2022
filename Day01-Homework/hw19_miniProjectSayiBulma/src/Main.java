
public class Main {

    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,5,7,9,0};
        int searchingNumber=5;
        
        boolean isHave=false;
        
        for(int number:numbers){
            if(number==searchingNumber){
                isHave=true;
                break;
            }
        }
        
        if(isHave){
            System.out.println("Sayı mevcuttur..");
        }
        else{
            System.out.println("Sayı mevcut değildir..");
        }
    }
    
}
