
public class Main {


    public static void main(String[] args) {
        numberFind();
        numberFind();
    }
    
    public static void numberFind(){
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
            message("Sayı mevcuttur.." + searchingNumber);
        }
        else{
            message("Sayı mevcut değildir.." + searchingNumber);
        }
    }
    //camelCase
    public static void message(String mesaj){
        System.out.println(mesaj);
    }
    
}
