package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Person person=new Person(new Ticket("Queen", LocalDateTime.now(),20000));
        Person person2=new Person(new FrontOfStageTicket("Queen", LocalDateTime.now(),30000,"#54256"));
        Concert concert= new Concert();

        concert.addPerson(person, LocalTime.of(15,40));
        concert.addPerson(person2, LocalTime.of(11,40));

    }
}
