package Models;

import java.util.List;

/**
 * Модель пользователя
 */
public class User {

    private long id;
    private String name;
    private List<Ticket> tickets;
    private String login;
    private long password_hash_code;
    private long account_id;

    public User(long id, String name, List<Ticket> tickets, String login, long password_hash_code, long account_id) {
        this.id = id;
        this.name = name;
        this.tickets = tickets;
        this.login = login;
        this.password_hash_code = password_hash_code;
        this.account_id = account_id;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public String getLogin() {
        return login;
    }

    public long getPassword_hash_code() {
        return password_hash_code;
    }

    public long getAccount_id() {
        return account_id;
    }
}

