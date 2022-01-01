package javaStudy;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

public class ThisEscape {
    private final EventListener eventListener;

    public ThisEscape() {
        System.out.println("!!!");
        this.eventListener = new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                System.out.println("@@@@@");
            }
        };

    }

    public static void main(String[] args) {
        ThisEscape thisEscape = new ThisEscape();

    }
}
