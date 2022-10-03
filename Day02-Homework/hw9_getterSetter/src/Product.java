public class Product {
    
    public Product(){
        System.out.println("Yapıcı blok çalıştı..");
    }
    
    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı..");
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
        _renk = renk;   
    }
    private int _id; 
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _kod;
    private String _renk;
    
    //getter
    public int getId(){
        return _id;
    }
    //setter
    public void setId(int id){
        _id=id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }
    
    public String getKod() {
        return _name.substring(0,1) + _id;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        _renk = renk;
    }
}
