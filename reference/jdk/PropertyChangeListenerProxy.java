_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public String getPropertyName() {

    /**
     * Returns the name of the named property associated with the listener.
     *
     * @return the name of the named property associated with the listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public void propertyChange(PropertyChangeEvent event) {

    /**
     * Forwards the property change event to the listener delegate.
     *
     * @param event  the property change event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener) {

    /**
     * Constructor which binds the {@code PropertyChangeListener}
     * to a specific property.
     *
     * @param propertyName  the name of the property to listen on
     * @param listener      the listener object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
public class PropertyChangeListenerProxy

/**
 * A class which extends the {@code EventListenerProxy}
 * specifically for adding a {@code PropertyChangeListener}
 * with a "bound" property.
 * Instances of this class can be added
 * as {@code PropertyChangeListener}s to a bean
 * which supports firing property change events.
 * <p>
 * If the object has a {@code getPropertyChangeListeners} method
 * then the array returned could be a mixture of {@code PropertyChangeListener}
 * and {@code PropertyChangeListenerProxy} objects.
 *
 * @see java.util.EventListenerProxy
 * @see PropertyChangeSupport#getPropertyChangeListeners
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public String getPropertyName() {

    /**
     * Returns the name of the named property associated with the listener.
     *
     * @return the name of the named property associated with the listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public void propertyChange(PropertyChangeEvent event) {

    /**
     * Forwards the property change event to the listener delegate.
     *
     * @param event  the property change event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
    public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener) {

    /**
     * Constructor which binds the {@code PropertyChangeListener}
     * to a specific property.
     *
     * @param propertyName  the name of the property to listen on
     * @param listener      the listener object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeListenerProxy.java
public class PropertyChangeListenerProxy

/**
 * A class which extends the {@code EventListenerProxy}
 * specifically for adding a {@code PropertyChangeListener}
 * with a "bound" property.
 * Instances of this class can be added
 * as {@code PropertyChangeListener}s to a bean
 * which supports firing property change events.
 * <p>
 * If the object has a {@code getPropertyChangeListeners} method
 * then the array returned could be a mixture of {@code PropertyChangeListener}
 * and {@code PropertyChangeListenerProxy} objects.
 *
 * @see java.util.EventListenerProxy
 * @see PropertyChangeSupport#getPropertyChangeListeners
 * @since 1.4
 */
