package lifecycle;

import static com.google.common.base.Preconditions.checkNotNull;

import java.beans.PropertyEditorSupport;

public class BoatCustomPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        checkNotNull(text);
        Boat boat = new Boat();
        if (text != null && text.indexOf(",") == -1) {
            throw new IllegalArgumentException("empty...");
        }

        String[] info = text.split(",");
        boat.setColor(info[0]);
        boat.setColor(info[1]);
        boat.setAge(Integer.parseInt(info[2]));
        setValue(boat);
    }

}