package day01;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String  band;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String band, LocalDateTime concertDateTime, int price) {
        this.band = band;
        this.startTime = concertDateTime;
        this.price = price;
    }

    public LocalTime entryTime(){
        return startTime.toLocalTime().minusHours(1);
    }
    public String getNameOfBand() {
        return band;
    }

    public LocalDateTime getConcertDateTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}
