_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public long getEventMask() {

    /**
     * Returns the event mask associated with the listener.
     *
     * @return the event mask associated with the listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public void eventDispatched(AWTEvent event) {

    /**
     * Forwards the AWT event to the listener delegate.
     *
     * @param event  the AWT event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public AWTEventListenerProxy (long eventMask, AWTEventListener listener) {

    /**
     * Constructor which binds the {@code AWTEventListener}
     * to a specific event mask.
     *
     * @param eventMask  the bitmap of event types to receive
     * @param listener   the listener object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
public class AWTEventListenerProxy

/**
 * A class which extends the {@code EventListenerProxy}
 * specifically for adding an {@code AWTEventListener}
 * for a specific event mask.
 * Instances of this class can be added as {@code AWTEventListener}s
 * to a {@code Toolkit} object.
 * <p>
 * The {@code getAWTEventListeners} method of {@code Toolkit}
 * can return a mixture of {@code AWTEventListener}
 * and {@code AWTEventListenerProxy} objects.
 *
 * @see java.awt.Toolkit
 * @see java.util.EventListenerProxy
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public long getEventMask() {

    /**
     * Returns the event mask associated with the listener.
     *
     * @return the event mask associated with the listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public void eventDispatched(AWTEvent event) {

    /**
     * Forwards the AWT event to the listener delegate.
     *
     * @param event  the AWT event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
    public AWTEventListenerProxy (long eventMask, AWTEventListener listener) {

    /**
     * Constructor which binds the {@code AWTEventListener}
     * to a specific event mask.
     *
     * @param eventMask  the bitmap of event types to receive
     * @param listener   the listener object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListenerProxy.java
public class AWTEventListenerProxy

/**
 * A class which extends the {@code EventListenerProxy}
 * specifically for adding an {@code AWTEventListener}
 * for a specific event mask.
 * Instances of this class can be added as {@code AWTEventListener}s
 * to a {@code Toolkit} object.
 * <p>
 * The {@code getAWTEventListeners} method of {@code Toolkit}
 * can return a mixture of {@code AWTEventListener}
 * and {@code AWTEventListenerProxy} objects.
 *
 * @see java.awt.Toolkit
 * @see java.util.EventListenerProxy
 * @since 1.4
 */
