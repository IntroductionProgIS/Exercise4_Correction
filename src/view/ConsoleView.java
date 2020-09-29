/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javafx.event.Event;
import controller.Percentage_Controller;
import event.ValueChangedEvent;
import event.ValueListener;

public class ConsoleView implements Percentage_View,ValueListener {

    private final Percentage_Controller myController;

    public ConsoleView (Percentage_Controller controller) {
        myController = controller;
    }

    @Override
    public void update(Event event) {
        if(event instanceof ValueChangedEvent) {
            ValueChangedEvent e = (ValueChangedEvent) event;
            System.out.println("La nouvelle valeur du pourcentage est : " + Math.round(e.getNewValue() * 100) + " %");
        }
    }

    @Override
    public void valueChanged(ValueChangedEvent event) {
        update(event);
    }

}
