import java.util.ArrayList;
import java.util.Iterator;

public class Customer extends Person{

    //One Customer has many order
    private double balance;
    private ArrayList<Order> orderList;

    public Customer(String name,String surName,String phoneNumber,String email){
        super(name,surName,phoneNumber,email);
        balance = 0.0;
        orderList = new ArrayList<>();
    }
    public void setBalance(double balance){

        if(balance > 0){
            this.balance += balance;
            System.out.println("Balance updated : "+ this.balance);
        }else{
            System.out.println("Please enter correct amount for the balance !");
        }

    }
    public double getBalance(){
        return this.balance;
    }
    public String makeOrder(Order order){
        if(order != null ){
            this.orderList.add(order);
            return "Order added.";
        }
        return "Your order not added";
    }
    public void getOrderList(){
        Iterator<Order> itr = orderList.iterator();
        while (itr.hasNext()){
            System.out.println("---------");
            itr.next().print();
        }
    }
    public double getTotalAmountForOrderList(){
        Iterator<Order> itr = orderList.iterator();
        double total=0.0;
        while (itr.hasNext()){
            total += itr.next().getTotalAmount();
        }
        return total;
    }
    public void pay(){
        double total = getTotalAmountForOrderList();
        if(this.balance > total){
            this.balance -= total;
            System.out.println("Payment completed.");
            System.out.println("Amount paid: "+total+ " Your new balance : "+this.balance);
        }else{
            System.out.println("You don't have enough money.");
        }

    }
}
