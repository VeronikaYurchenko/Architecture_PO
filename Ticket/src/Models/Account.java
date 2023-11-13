package Models;

import java.text.DecimalFormat;

/**
 * Модель аккаунта
 */
public class Account {
    private long user_account_id;
    private DecimalFormat balance;


    public Account(long user_account_id, DecimalFormat balance) {
        this.user_account_id = user_account_id;
        this.balance = balance;

    }

}