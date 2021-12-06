package day01;

import java.time.LocalDateTime;

public class Person {

    private Ticket ticket;

    public Person(Ticket ticket ) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
