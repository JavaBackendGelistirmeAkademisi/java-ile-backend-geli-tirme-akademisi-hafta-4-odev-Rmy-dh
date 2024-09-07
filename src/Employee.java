import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends Person{

    private String employeeCode;
    private static ArrayList<Product> products = new ArrayList<>();

    public Employee( String name,String surName, String phoneNumber, String email,String employeeCode) {
        super( name,surName, phoneNumber, email);
        this.employeeCode = employeeCode;

    }
    public void addProductToProductList(Product product){
        if(product != null && !checkProductExist(product)){
            Employee.products.add(product);
        }
    }
    public  static ArrayList<Product> getProducts(){
        return Employee.products;
    }

    public static boolean checkProductExist(Product product){
        Iterator<Product> itr = Employee.products.iterator();

        while (itr.hasNext()){
            if(itr.next().equals(product)){
                return true;
            }
        }
        return false;
    }

    public static void writeProductInformationToFile(){
        try( BufferedWriter writer= new BufferedWriter(new FileWriter("product.txt",true))) {

            ArrayList<Product> products = Employee.getProducts();
            for(Product product:products){
                String productSample = product.getName()+" - > "+product.getPrice()+" -> "+product.getStock();
                writer.write(productSample);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
