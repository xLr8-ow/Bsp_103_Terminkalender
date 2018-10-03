
import java.util.LinkedList;
import javax.swing.AbstractListModel;

public class AppointmentModell extends AbstractListModel {

    private LinkedList<Appointment> appointments = new LinkedList<>();

    @Override
    public int getSize() {
        return appointments.size();
    }

    @Override
    public Object getElementAt(int i) {
        return appointments.get(i);
    }

}
