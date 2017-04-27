package rental;

import data.Product;
import data.Transaction;
import data.User;
import enums.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamila on 27.04.17.
 */
public class Rental {
    private List<User> users=new ArrayList<>();
    private List<Product> products=new ArrayList<>();
    private List<Transaction> history=new ArrayList<>();
    public void addProduct (String name){
        products.add(new Product(name));
    }
    public void addUser (String name, Role role, String password){
        users.add(new User(name, role, password));
    }

    public static void main(String[] args) {
        new Rental();
    }
}
