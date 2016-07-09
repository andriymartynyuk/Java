package ua.com.westwind.Denys_HomeWork.module06.property.change.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Администратор on 09.07.2016.
 */
public class StudentListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("StudentListener:"+evt.getSource());
        System.out.println("\tProperty:"+evt.getPropertyName());
        System.out.println("\tOldValue:"+evt.getOldValue());
        System.out.println("\tNewValue:"+evt.getNewValue());
    }
}
