package ua.com.westwind.Denys_HomeWork.module06.property.change.listener;

import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by Администратор on 09.07.2016.
 */
public class Phone {
    private String title;

    private PropertyChangeSupport support = new SwingPropertyChangeSupport(this);

    public Phone(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        support.firePropertyChange("title",this.title,title);
        this.title = title;
    }

    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
