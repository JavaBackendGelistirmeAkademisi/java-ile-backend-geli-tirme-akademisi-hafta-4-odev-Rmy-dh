import java.time.LocalDateTime;


public class Product {
    private String name;
    private String productCode;

    private double price;
    private LocalDateTime expiryDate;
    private int stock;

    public Product(String name, String productCode,double price){
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.expiryDate = LocalDateTime.now();
        stock=0;
    }
    public void increaseStockAmount(int stock){
        if(stock > 0){
            this.stock += stock;
            System.out.println("Amount of "+this.name+" : "+this.stock);
        }else{
            System.out.println("Please enter correct stock for the stock !");
        }
    }
    public void setPrice(double price){
        if(price > 0 && price < this.price ){
            this.price=price;
            System.out.println("The discount was realized");
        }else if(price > 0 && price > this.price) {
            System.out.println("The raise was realized");
        }
    }
    public double getPrice(){
        return this.price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock){
        if(stock < this.stock){
            this.stock -= stock;
        }
    }

    public String getName() {
        return name;
    }


}
