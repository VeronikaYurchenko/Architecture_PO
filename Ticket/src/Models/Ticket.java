package Models;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Модель билета
 */
public class Ticket {

    private long id;
    private int departure_zone;
    private int arrival_zone;
    private Date departure_time;
    private Date arrival_time;
    private long buyer_id;
    private boolean is_used;
    public DecimalFormat price;
    public String place;

    public Ticket(long id, int departure_zone, int arrival_zone, DecimalFormat price, Date departure_time, Date arrival_time, long buyer_id, boolean is_used) {
        this.id = id;
        this.departure_zone = departure_zone;
        this.arrival_zone = arrival_zone;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.buyer_id = buyer_id;
        this.is_used = is_used;
        this.price = price;
        this.place = place;
    }
}

