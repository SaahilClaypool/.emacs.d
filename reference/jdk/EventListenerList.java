_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public String toString() {

    /**
     * Returns a string representation of the EventListenerList.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public synchronized <T extends EventListener> void remove(Class<T> t, T l) {

    /**
     * Removes the listener as a listener of the specified type.
     * @param t the type of the listener to be removed
     * @param l the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public synchronized <T extends EventListener> void add(Class<T> t, T l) {

    /**
     * Adds the listener as a listener of the specified type.
     * @param t the type of the listener to be added
     * @param l the listener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public int getListenerCount(Class<?> t) {

    /**
     * Returns the total number of listeners of the supplied type
     * for this listener list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public int getListenerCount() {

    /**
     * Returns the total number of listeners for this listener list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public <T extends EventListener> T[] getListeners(Class<T> t) {

    /**
     * Return an array of all the listeners of the given type.
     * @return all of the listeners of the specified type.
     * @exception  ClassCastException if the supplied class
     *          is not assignable to EventListener
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
    public Object[] getListenerList() {

    /**
     * Passes back the event listener list as an array
     * of ListenerType-listener pairs.  Note that for
     * performance reasons, this implementation passes back
     * the actual data structure in which the listener data
     * is stored internally!
     * This method is guaranteed to pass back a non-null
     * array, so that no null-checking is required in
     * fire methods.  A zero-length array of Object should
     * be returned if there are currently no listeners.
     *
     * WARNING!!! Absolutely NO modification of
     * the data contained in this array should be made -- if
     * any such manipulation is necessary, it should be done
     * on a copy of the array returned rather than the array
     * itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/EventListenerList.java
@SuppressWarnings("serial")

/**
 * A class that holds a list of EventListeners.  A single instance
 * can be used to hold all listeners (of all types) for the instance
 * using the list.  It is the responsiblity of the class using the
 * EventListenerList to provide type-safe API (preferably conforming
 * to the JavaBeans spec) and methods which dispatch event notification
 * methods to appropriate Event Listeners on the list.
 *
 * The main benefits that this class provides are that it is relatively
 * cheap in the case of no listeners, and it provides serialization for
 * event-listener lists in a single place, as well as a degree of MT safety
 * (when used correctly).
 *
 * Usage example:
 *    Say one is defining a class that sends out FooEvents, and one wants
 * to allow users of the class to register FooListeners and receive
 * notification when FooEvents occur.  The following should be added
 * to the class definition:
 * <pre>
 * EventListenerList listenerList = new EventListenerList();
 * FooEvent fooEvent = null;
 *
 * public void addFooListener(FooListener l) {
 *     listenerList.add(FooListener.class, l);
 * }
 *
 * public void removeFooListener(FooListener l) {
 *     listenerList.remove(FooListener.class, l);
 * }
 *
 *
 * // Notify all listeners that have registered interest for
 * // notification on this event type.  The event instance
 * // is lazily created using the parameters passed into
 * // the fire method.
 *
 * protected void fireFooXXX() {
 *     // Guaranteed to return a non-null array
 *     Object[] listeners = listenerList.getListenerList();
 *     // Process the listeners last to first, notifying
 *     // those that are interested in this event
 *     for (int i = listeners.length-2; i&gt;=0; i-=2) {
 *         if (listeners[i]==FooListener.class) {
 *             // Lazily create the event:
 *             if (fooEvent == null)
 *                 fooEvent = new FooEvent(this);
 *             ((FooListener)listeners[i+1]).fooXXX(fooEvent);
 *         }
 *     }
 * }
 * </pre>
 * foo should be changed to the appropriate name, and fireFooXxx to the
 * appropriate method name.  One fire method should exist for each
 * notification method in the FooListener interface.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Georges Saab
 * @author Hans Muller
 * @author James Gosling
 */
