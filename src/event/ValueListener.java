package event;

import javafx.event.Event;
import event.ValueChangedEvent;
import java.util.EventListener;

public interface ValueListener extends EventListener {
        public void valueChanged(ValueChangedEvent event);
}
