import java.util.HashMap;
import java.util.Map;

public class Order {
    private double totalAmount;
    // One order has one or many products
    private HashMap<Product,Integer> products;
    private Customer customer;

    public Order(Customer customer){
        this.customer=customer;
        totalAmount=0.0;
        products=new HashMap<>();
    }
    public void addProduct(Product product,int amount){
        if( Employee.checkProductExist(product) && product.getStock() >= amount  ){
            if(isExist(product)){
                int newAmount = this.products.get(product) + amount;
                this.products.put(product,newAmount);

            }else{
                this.products.put(product,amount);
                product.setStock(amount);
            }
            System.out.println("Product added to productList");
        }else{
            System.out.println("Out of stock");
        }
    }
    public void deleteProduct(Product product){
        if(isExist(product)){
            this.products.remove(product);
        }
    }
    public boolean isExist(Product product){
        for(Map.Entry<Product,Integer> entry : products.entrySet()){
            if(entry.getKey().equals(product)){
                return true;
            }
        }
        return  false;
    }
    public double getTotalAmount(){
       for(Map.Entry<Product,Integer> entry: products.entrySet()){
           this.totalAmount += entry.getKey().getPrice()*entry.getValue();
       }
       return this.totalAmount;
    }
    public void print(){
        for(Map.Entry<Product,Integer> entry : products.entrySet()){
            System.out.println(entry.getKey().getName()+" : "+entry.getValue());

        }
    }

}
