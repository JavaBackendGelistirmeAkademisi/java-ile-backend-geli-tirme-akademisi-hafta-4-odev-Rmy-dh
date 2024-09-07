
public class ProductManagementSystem {
    public static void main(String[] args) {

        // Customers generated.
        Customer ayse = new Customer("Ayşe","Yılmaz","05000000000","ayse@gmail.com");
        Customer ali = new Customer("Ali","Sarp","05000000000","ali@gmail.com");

        // Employee was created to add products.
        Employee kaan = new Employee("Kaan","Cenk","05000000000","kaan@gmail.com","EEE*125*");

        // Products generated.
        Product desk = new Product("Desk","EEP123",120.50);
        Product book = new Product("Book","EEP321",10.00);
        Product tea = new Product("Tea","EEP213",42.60);

        // Employee added product to product list.
        kaan.addProductToProductList(desk);
        // Added desk twice but it recorded once.
        kaan.addProductToProductList(desk);
        kaan.addProductToProductList(book);
        kaan.addProductToProductList(tea);

        // Increase amount of products.
        book.increaseStockAmount(9);
        desk.increaseStockAmount(18);

        // Customer order generated and products added to order.
        Order order = new Order(ayse);
        order.addProduct(desk,2);
        order.addProduct(book,1);
        order.addProduct(book,5);
        order.deleteProduct(desk);

        ayse.makeOrder(order);
        ayse.getOrderList();

        ayse.setBalance(1000);
        // Customer paid for her order.
        ayse.pay();

        // Information of product recorded.
        Employee.writeProductInformationToFile();

    }
}
