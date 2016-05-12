_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        public final VetoableChangeListener extract(VetoableChangeListener listener) {

        /**
         * {@inheritDoc}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        @Override

        /**
         * Creates a {@link VetoableChangeListenerProxy VetoableChangeListenerProxy}
         * object for the specified property.
         *
         * @param name      the name of the property to listen on
         * @param listener  the listener to process events
         * @return          a {@code VetoableChangeListenerProxy} object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        @Override

        /**
         * Creates an array of {@link VetoableChangeListener VetoableChangeListener} objects.
         * This method uses the same instance of the empty array
         * when {@code length} equals {@code 0}.
         *
         * @param length  the array length
         * @return        an array with specified length
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private static final class VetoableChangeListenerMap extends ChangeListenerMap<VetoableChangeListener> {

    /**
     * This is a {@link ChangeListenerMap ChangeListenerMap} implementation
     * that works with {@link VetoableChangeListener VetoableChangeListener} objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    static final long serialVersionUID = -5090210921595982017L;

    /**
     * Serialization version ID, so we're compatible with JDK 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField children                                   Hashtable
     * @serialField source                                     Object
     * @serialField vetoableChangeSupportSerializedDataVersion int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private Object source;

    /**
     * The object to be provided as the "source" for any generated events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * @serialData Null terminated list of <code>VetoableChangeListeners</code>.
     * <p>
     * At serialization time we skip non-serializable listeners and
     * only serialize the serializable listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public boolean hasListeners(String propertyName) {

    /**
     * Check if there are any listeners for a specific property, including
     * those registered on all properties.  If <code>propertyName</code>
     * is null, only check for listeners registered on all properties.
     *
     * @param propertyName  the property name.
     * @return true if there are one or more listeners for the given property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(PropertyChangeEvent event)

    /**
     * Fires a property change event to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if the given event's old and new values are equal and non-null.
     *
     * @param event  the {@code PropertyChangeEvent} to be fired
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, boolean oldValue, boolean newValue)

    /**
     * Reports a boolean constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(String, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, int oldValue, int newValue)

    /**
     * Reports an integer constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(String, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, Object oldValue, Object newValue)

    /**
     * Reports a constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeListener[] getVetoableChangeListeners(String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @param propertyName  The name of the property being listened to
     * @return all the <code>VetoableChangeListeners</code> associated with
     *         the named property.  If no such listeners have been added,
     *         or if <code>propertyName</code> is null, an empty array is
     *         returned.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void removeVetoableChangeListener(
                                String propertyName,
                VetoableChangeListener listener) {

    /**
     * Remove a VetoableChangeListener for a specific property.
     * If <code>listener</code> was added more than once to the same event
     * source for the specified property, it will be notified one less time
     * after being removed.
     * If <code>propertyName</code> is null, no exception is thrown and no
     * action is taken.
     * If <code>listener</code> is null, or was never added for the specified
     * property, no exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property that was listened on.
     * @param listener  The VetoableChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void addVetoableChangeListener(
                                String propertyName,
                VetoableChangeListener listener) {

    /**
     * Add a VetoableChangeListener for a specific property.  The listener
     * will be invoked only when a call on fireVetoableChange names that
     * specific property.
     * The same listener object may be added more than once.  For each
     * property,  the listener will be invoked the number of times it was added
     * for that property.
     * If <code>propertyName</code> or <code>listener</code> is null, no
     * exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property to listen on.
     * @param listener  The VetoableChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeListener[] getVetoableChangeListeners(){

    /**
     * Returns an array of all the listeners that were added to the
     * VetoableChangeSupport object with addVetoableChangeListener().
     * <p>
     * If some listeners have been added with a named property, then
     * the returned array will be a mixture of VetoableChangeListeners
     * and <code>VetoableChangeListenerProxy</code>s. If the calling
     * method is interested in distinguishing the listeners then it must
     * test each element to see if it's a
     * <code>VetoableChangeListenerProxy</code>, perform the cast, and examine
     * the parameter.
     *
     * <pre>{@code
     * VetoableChangeListener[] listeners = bean.getVetoableChangeListeners();
     * for (int i = 0; i < listeners.length; i++) {
     *        if (listeners[i] instanceof VetoableChangeListenerProxy) {
     *     VetoableChangeListenerProxy proxy =
     *                    (VetoableChangeListenerProxy)listeners[i];
     *     if (proxy.getPropertyName().equals("foo")) {
     *       // proxy is a VetoableChangeListener which was associated
     *       // with the property named "foo"
     *     }
     *   }
     * }
     * }</pre>
     *
     * @see VetoableChangeListenerProxy
     * @return all of the <code>VetoableChangeListeners</code> added or an
     *         empty array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void removeVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Remove a VetoableChangeListener from the listener list.
     * This removes a VetoableChangeListener that was registered
     * for all properties.
     * If <code>listener</code> was added more than once to the same event
     * source, it will be notified one less time after being removed.
     * If <code>listener</code> is null, or was never added, no exception is
     * thrown and no action is taken.
     *
     * @param listener  The VetoableChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void addVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Add a VetoableChangeListener to the listener list.
     * The listener is registered for all properties.
     * The same listener object may be added more than once, and will be called
     * as many times as it is added.
     * If <code>listener</code> is null, no exception is thrown and no action
     * is taken.
     *
     * @param listener  The VetoableChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeSupport(Object sourceBean) {

    /**
     * Constructs a <code>VetoableChangeSupport</code> object.
     *
     * @param sourceBean  The bean to be given as the source for any events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
public class VetoableChangeSupport implements Serializable {

/**
 * This is a utility class that can be used by beans that support constrained
 * properties.  It manages a list of listeners and dispatches
 * {@link PropertyChangeEvent}s to them.  You can use an instance of this class
 * as a member field of your bean and delegate these types of work to it.
 * The {@link VetoableChangeListener} can be registered for all properties
 * or for a property specified by name.
 * <p>
 * Here is an example of {@code VetoableChangeSupport} usage that follows
 * the rules and recommendations laid out in the JavaBeans&trade; specification:
 * <pre>{@code
 * public class MyBean {
 *     private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);
 *
 *     public void addVetoableChangeListener(VetoableChangeListener listener) {
 *         this.vcs.addVetoableChangeListener(listener);
 *     }
 *
 *     public void removeVetoableChangeListener(VetoableChangeListener listener) {
 *         this.vcs.removeVetoableChangeListener(listener);
 *     }
 *
 *     private String value;
 *
 *     public String getValue() {
 *         return this.value;
 *     }
 *
 *     public void setValue(String newValue) throws PropertyVetoException {
 *         String oldValue = this.value;
 *         this.vcs.fireVetoableChange("value", oldValue, newValue);
 *         this.value = newValue;
 *     }
 *
 *     [...]
 * }
 * }</pre>
 * <p>
 * A {@code VetoableChangeSupport} instance is thread-safe.
 * <p>
 * This class is serializable.  When it is serialized it will save
 * (and restore) any listeners that are themselves serializable.  Any
 * non-serializable listeners will be skipped during serialization.
 *
 * @see PropertyChangeSupport
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        public final VetoableChangeListener extract(VetoableChangeListener listener) {

        /**
         * {@inheritDoc}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        @Override

        /**
         * Creates a {@link VetoableChangeListenerProxy VetoableChangeListenerProxy}
         * object for the specified property.
         *
         * @param name      the name of the property to listen on
         * @param listener  the listener to process events
         * @return          a {@code VetoableChangeListenerProxy} object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
        @Override

        /**
         * Creates an array of {@link VetoableChangeListener VetoableChangeListener} objects.
         * This method uses the same instance of the empty array
         * when {@code length} equals {@code 0}.
         *
         * @param length  the array length
         * @return        an array with specified length
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private static final class VetoableChangeListenerMap extends ChangeListenerMap<VetoableChangeListener> {

    /**
     * This is a {@link ChangeListenerMap ChangeListenerMap} implementation
     * that works with {@link VetoableChangeListener VetoableChangeListener} objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    static final long serialVersionUID = -5090210921595982017L;

    /**
     * Serialization version ID, so we're compatible with JDK 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField children                                   Hashtable
     * @serialField source                                     Object
     * @serialField vetoableChangeSupportSerializedDataVersion int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private Object source;

    /**
     * The object to be provided as the "source" for any generated events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * @serialData Null terminated list of <code>VetoableChangeListeners</code>.
     * <p>
     * At serialization time we skip non-serializable listeners and
     * only serialize the serializable listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public boolean hasListeners(String propertyName) {

    /**
     * Check if there are any listeners for a specific property, including
     * those registered on all properties.  If <code>propertyName</code>
     * is null, only check for listeners registered on all properties.
     *
     * @param propertyName  the property name.
     * @return true if there are one or more listeners for the given property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(PropertyChangeEvent event)

    /**
     * Fires a property change event to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if the given event's old and new values are equal and non-null.
     *
     * @param event  the {@code PropertyChangeEvent} to be fired
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, boolean oldValue, boolean newValue)

    /**
     * Reports a boolean constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(String, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, int oldValue, int newValue)

    /**
     * Reports an integer constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(String, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void fireVetoableChange(String propertyName, Object oldValue, Object newValue)

    /**
     * Reports a constrained property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * Any listener can throw a {@code PropertyVetoException} to veto the update.
     * If one of the listeners vetoes the update, this method passes
     * a new "undo" {@code PropertyChangeEvent} that reverts to the old value
     * to all listeners that already confirmed this update
     * and throws the {@code PropertyVetoException} again.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireVetoableChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that is about to change
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @throws PropertyVetoException if one of listeners vetoes the property update
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeListener[] getVetoableChangeListeners(String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @param propertyName  The name of the property being listened to
     * @return all the <code>VetoableChangeListeners</code> associated with
     *         the named property.  If no such listeners have been added,
     *         or if <code>propertyName</code> is null, an empty array is
     *         returned.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void removeVetoableChangeListener(
                                String propertyName,
                VetoableChangeListener listener) {

    /**
     * Remove a VetoableChangeListener for a specific property.
     * If <code>listener</code> was added more than once to the same event
     * source for the specified property, it will be notified one less time
     * after being removed.
     * If <code>propertyName</code> is null, no exception is thrown and no
     * action is taken.
     * If <code>listener</code> is null, or was never added for the specified
     * property, no exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property that was listened on.
     * @param listener  The VetoableChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void addVetoableChangeListener(
                                String propertyName,
                VetoableChangeListener listener) {

    /**
     * Add a VetoableChangeListener for a specific property.  The listener
     * will be invoked only when a call on fireVetoableChange names that
     * specific property.
     * The same listener object may be added more than once.  For each
     * property,  the listener will be invoked the number of times it was added
     * for that property.
     * If <code>propertyName</code> or <code>listener</code> is null, no
     * exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property to listen on.
     * @param listener  The VetoableChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeListener[] getVetoableChangeListeners(){

    /**
     * Returns an array of all the listeners that were added to the
     * VetoableChangeSupport object with addVetoableChangeListener().
     * <p>
     * If some listeners have been added with a named property, then
     * the returned array will be a mixture of VetoableChangeListeners
     * and <code>VetoableChangeListenerProxy</code>s. If the calling
     * method is interested in distinguishing the listeners then it must
     * test each element to see if it's a
     * <code>VetoableChangeListenerProxy</code>, perform the cast, and examine
     * the parameter.
     *
     * <pre>{@code
     * VetoableChangeListener[] listeners = bean.getVetoableChangeListeners();
     * for (int i = 0; i < listeners.length; i++) {
     *        if (listeners[i] instanceof VetoableChangeListenerProxy) {
     *     VetoableChangeListenerProxy proxy =
     *                    (VetoableChangeListenerProxy)listeners[i];
     *     if (proxy.getPropertyName().equals("foo")) {
     *       // proxy is a VetoableChangeListener which was associated
     *       // with the property named "foo"
     *     }
     *   }
     * }
     * }</pre>
     *
     * @see VetoableChangeListenerProxy
     * @return all of the <code>VetoableChangeListeners</code> added or an
     *         empty array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void removeVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Remove a VetoableChangeListener from the listener list.
     * This removes a VetoableChangeListener that was registered
     * for all properties.
     * If <code>listener</code> was added more than once to the same event
     * source, it will be notified one less time after being removed.
     * If <code>listener</code> is null, or was never added, no exception is
     * thrown and no action is taken.
     *
     * @param listener  The VetoableChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public void addVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Add a VetoableChangeListener to the listener list.
     * The listener is registered for all properties.
     * The same listener object may be added more than once, and will be called
     * as many times as it is added.
     * If <code>listener</code> is null, no exception is thrown and no action
     * is taken.
     *
     * @param listener  The VetoableChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
    public VetoableChangeSupport(Object sourceBean) {

    /**
     * Constructs a <code>VetoableChangeSupport</code> object.
     *
     * @param sourceBean  The bean to be given as the source for any events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/VetoableChangeSupport.java
public class VetoableChangeSupport implements Serializable {

/**
 * This is a utility class that can be used by beans that support constrained
 * properties.  It manages a list of listeners and dispatches
 * {@link PropertyChangeEvent}s to them.  You can use an instance of this class
 * as a member field of your bean and delegate these types of work to it.
 * The {@link VetoableChangeListener} can be registered for all properties
 * or for a property specified by name.
 * <p>
 * Here is an example of {@code VetoableChangeSupport} usage that follows
 * the rules and recommendations laid out in the JavaBeans&trade; specification:
 * <pre>{@code
 * public class MyBean {
 *     private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);
 *
 *     public void addVetoableChangeListener(VetoableChangeListener listener) {
 *         this.vcs.addVetoableChangeListener(listener);
 *     }
 *
 *     public void removeVetoableChangeListener(VetoableChangeListener listener) {
 *         this.vcs.removeVetoableChangeListener(listener);
 *     }
 *
 *     private String value;
 *
 *     public String getValue() {
 *         return this.value;
 *     }
 *
 *     public void setValue(String newValue) throws PropertyVetoException {
 *         String oldValue = this.value;
 *         this.vcs.fireVetoableChange("value", oldValue, newValue);
 *         this.value = newValue;
 *     }
 *
 *     [...]
 * }
 * }</pre>
 * <p>
 * A {@code VetoableChangeSupport} instance is thread-safe.
 * <p>
 * This class is serializable.  When it is serialized it will save
 * (and restore) any listeners that are themselves serializable.  Any
 * non-serializable listeners will be skipped during serialization.
 *
 * @see PropertyChangeSupport
 */
