package data;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by kamila on 27.04.17.
 */
public class Transaction {
    private String userName;
    private String productName;
    private Calendar rentalDate;
    /**
     * Dni od daty wypozyczenia do daty zwrotu.
     */
    private int daysToReturn;

    public Transaction(String userName, String productName, int daysToReturn) {
        this.userName = userName;
        this.productName = productName;
        this.rentalDate = Calendar.getInstance();
        this.daysToReturn = daysToReturn;
    }

    public String getUserName() {
        return userName;
    }

    public String getProductName() {
        return productName;
    }

    public Calendar getRentalDate() {
        return rentalDate;
    }
    public Calendar getReturnDate() {
        Calendar x = rentalDate;
        x.add(Calendar.DATE, daysToReturn);
        return x;
    }
}
