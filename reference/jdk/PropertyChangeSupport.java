_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        public final PropertyChangeListener extract(PropertyChangeListener listener) {

        /**
         * {@inheritDoc}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        @Override

        /**
         * Creates a {@link PropertyChangeListenerProxy PropertyChangeListenerProxy}
         * object for the specified property.
         *
         * @param name      the name of the property to listen on
         * @param listener  the listener to process events
         * @return          a {@code PropertyChangeListenerProxy} object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        @Override

        /**
         * Creates an array of {@link PropertyChangeListener PropertyChangeListener} objects.
         * This method uses the same instance of the empty array
         * when {@code length} equals {@code 0}.
         *
         * @param length  the array length
         * @return        an array with specified length
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private static final class PropertyChangeListenerMap extends ChangeListenerMap<PropertyChangeListener> {

    /**
     * This is a {@link ChangeListenerMap ChangeListenerMap} implementation
     * that works with {@link PropertyChangeListener PropertyChangeListener} objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    static final long serialVersionUID = 6401253773779951803L;

    /**
     * Serialization version ID, so we're compatible with JDK 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField children                                   Hashtable
     * @serialField source                                     Object
     * @serialField propertyChangeSupportSerializedDataVersion int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private Object source;

    /**
     * The object to be provided as the "source" for any generated events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * @serialData Null terminated list of <code>PropertyChangeListeners</code>.
     * <p>
     * At serialization time we skip non-serializable listeners and
     * only serialize the serializable listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, boolean oldValue, boolean newValue) {

    /**
     * Reports a boolean bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireIndexedPropertyChange(String, int, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, int oldValue, int newValue) {

    /**
     * Reports an integer bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireIndexedPropertyChange(String, int, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, Object oldValue, Object newValue) {

    /**
     * Reports a bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(PropertyChangeEvent event) {

    /**
     * Fires a property change event to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if the given event's old and new values are equal and non-null.
     *
     * @param event  the {@code PropertyChangeEvent} to be fired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {

    /**
     * Reports a boolean bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(String, Object, Object)}  method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, int oldValue, int newValue) {

    /**
     * Reports an integer bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(String, Object, Object)}  method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {

    /**
     * Reports a bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @param propertyName  The name of the property being listened to
     * @return all of the <code>PropertyChangeListeners</code> associated with
     *         the named property.  If no such listeners have been added,
     *         or if <code>propertyName</code> is null, an empty array is
     *         returned.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void removePropertyChangeListener(
                String propertyName,
                PropertyChangeListener listener) {

    /**
     * Remove a PropertyChangeListener for a specific property.
     * If <code>listener</code> was added more than once to the same event
     * source for the specified property, it will be notified one less time
     * after being removed.
     * If <code>propertyName</code> is null,  no exception is thrown and no
     * action is taken.
     * If <code>listener</code> is null, or was never added for the specified
     * property, no exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property that was listened on.
     * @param listener  The PropertyChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void addPropertyChangeListener(
                String propertyName,
                PropertyChangeListener listener) {

    /**
     * Add a PropertyChangeListener for a specific property.  The listener
     * will be invoked only when a call on firePropertyChange names that
     * specific property.
     * The same listener object may be added more than once.  For each
     * property,  the listener will be invoked the number of times it was added
     * for that property.
     * If <code>propertyName</code> or <code>listener</code> is null, no
     * exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property to listen on.
     * @param listener  The PropertyChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the listeners that were added to the
     * PropertyChangeSupport object with addPropertyChangeListener().
     * <p>
     * If some listeners have been added with a named property, then
     * the returned array will be a mixture of PropertyChangeListeners
     * and <code>PropertyChangeListenerProxy</code>s. If the calling
     * method is interested in distinguishing the listeners then it must
     * test each element to see if it's a
     * <code>PropertyChangeListenerProxy</code>, perform the cast, and examine
     * the parameter.
     *
     * <pre>{@code
     * PropertyChangeListener[] listeners = bean.getPropertyChangeListeners();
     * for (int i = 0; i < listeners.length; i++) {
     *   if (listeners[i] instanceof PropertyChangeListenerProxy) {
     *     PropertyChangeListenerProxy proxy =
     *                    (PropertyChangeListenerProxy)listeners[i];
     *     if (proxy.getPropertyName().equals("foo")) {
     *       // proxy is a PropertyChangeListener which was associated
     *       // with the property named "foo"
     *     }
     *   }
     * }
     * }</pre>
     *
     * @see PropertyChangeListenerProxy
     * @return all of the <code>PropertyChangeListeners</code> added or an
     *         empty array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Remove a PropertyChangeListener from the listener list.
     * This removes a PropertyChangeListener that was registered
     * for all properties.
     * If <code>listener</code> was added more than once to the same event
     * source, it will be notified one less time after being removed.
     * If <code>listener</code> is null, or was never added, no exception is
     * thrown and no action is taken.
     *
     * @param listener  The PropertyChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Add a PropertyChangeListener to the listener list.
     * The listener is registered for all properties.
     * The same listener object may be added more than once, and will be called
     * as many times as it is added.
     * If <code>listener</code> is null, no exception is thrown and no action
     * is taken.
     *
     * @param listener  The PropertyChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeSupport(Object sourceBean) {

    /**
     * Constructs a <code>PropertyChangeSupport</code> object.
     *
     * @param sourceBean  The bean to be given as the source for any events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
public class PropertyChangeSupport implements Serializable {

/**
 * This is a utility class that can be used by beans that support bound
 * properties.  It manages a list of listeners and dispatches
 * {@link PropertyChangeEvent}s to them.  You can use an instance of this class
 * as a member field of your bean and delegate these types of work to it.
 * The {@link PropertyChangeListener} can be registered for all properties
 * or for a property specified by name.
 * <p>
 * Here is an example of {@code PropertyChangeSupport} usage that follows
 * the rules and recommendations laid out in the JavaBeans&trade; specification:
 * <pre>
 * public class MyBean {
 *     private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
 *
 *     public void addPropertyChangeListener(PropertyChangeListener listener) {
 *         this.pcs.addPropertyChangeListener(listener);
 *     }
 *
 *     public void removePropertyChangeListener(PropertyChangeListener listener) {
 *         this.pcs.removePropertyChangeListener(listener);
 *     }
 *
 *     private String value;
 *
 *     public String getValue() {
 *         return this.value;
 *     }
 *
 *     public void setValue(String newValue) {
 *         String oldValue = this.value;
 *         this.value = newValue;
 *         this.pcs.firePropertyChange("value", oldValue, newValue);
 *     }
 *
 *     [...]
 * }
 * </pre>
 * <p>
 * A {@code PropertyChangeSupport} instance is thread-safe.
 * <p>
 * This class is serializable.  When it is serialized it will save
 * (and restore) any listeners that are themselves serializable.  Any
 * non-serializable listeners will be skipped during serialization.
 *
 * @see VetoableChangeSupport
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        public final PropertyChangeListener extract(PropertyChangeListener listener) {

        /**
         * {@inheritDoc}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        @Override

        /**
         * Creates a {@link PropertyChangeListenerProxy PropertyChangeListenerProxy}
         * object for the specified property.
         *
         * @param name      the name of the property to listen on
         * @param listener  the listener to process events
         * @return          a {@code PropertyChangeListenerProxy} object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
        @Override

        /**
         * Creates an array of {@link PropertyChangeListener PropertyChangeListener} objects.
         * This method uses the same instance of the empty array
         * when {@code length} equals {@code 0}.
         *
         * @param length  the array length
         * @return        an array with specified length
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private static final class PropertyChangeListenerMap extends ChangeListenerMap<PropertyChangeListener> {

    /**
     * This is a {@link ChangeListenerMap ChangeListenerMap} implementation
     * that works with {@link PropertyChangeListener PropertyChangeListener} objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    static final long serialVersionUID = 6401253773779951803L;

    /**
     * Serialization version ID, so we're compatible with JDK 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField children                                   Hashtable
     * @serialField source                                     Object
     * @serialField propertyChangeSupportSerializedDataVersion int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private Object source;

    /**
     * The object to be provided as the "source" for any generated events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * @serialData Null terminated list of <code>PropertyChangeListeners</code>.
     * <p>
     * At serialization time we skip non-serializable listeners and
     * only serialize the serializable listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, boolean oldValue, boolean newValue) {

    /**
     * Reports a boolean bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireIndexedPropertyChange(String, int, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, int oldValue, int newValue) {

    /**
     * Reports an integer bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #fireIndexedPropertyChange(String, int, Object, Object)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void fireIndexedPropertyChange(String propertyName, int index, Object oldValue, Object newValue) {

    /**
     * Reports a bound indexed property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param index         the index of the property element that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(PropertyChangeEvent event) {

    /**
     * Fires a property change event to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if the given event's old and new values are equal and non-null.
     *
     * @param event  the {@code PropertyChangeEvent} to be fired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {

    /**
     * Reports a boolean bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(String, Object, Object)}  method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, int oldValue, int newValue) {

    /**
     * Reports an integer bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(String, Object, Object)}  method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {

    /**
     * Reports a bound property update to listeners
     * that have been registered to track updates of
     * all properties or a property with the specified name.
     * <p>
     * No event is fired if old and new values are equal and non-null.
     * <p>
     * This is merely a convenience wrapper around the more general
     * {@link #firePropertyChange(PropertyChangeEvent)} method.
     *
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @param propertyName  The name of the property being listened to
     * @return all of the <code>PropertyChangeListeners</code> associated with
     *         the named property.  If no such listeners have been added,
     *         or if <code>propertyName</code> is null, an empty array is
     *         returned.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void removePropertyChangeListener(
                String propertyName,
                PropertyChangeListener listener) {

    /**
     * Remove a PropertyChangeListener for a specific property.
     * If <code>listener</code> was added more than once to the same event
     * source for the specified property, it will be notified one less time
     * after being removed.
     * If <code>propertyName</code> is null,  no exception is thrown and no
     * action is taken.
     * If <code>listener</code> is null, or was never added for the specified
     * property, no exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property that was listened on.
     * @param listener  The PropertyChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void addPropertyChangeListener(
                String propertyName,
                PropertyChangeListener listener) {

    /**
     * Add a PropertyChangeListener for a specific property.  The listener
     * will be invoked only when a call on firePropertyChange names that
     * specific property.
     * The same listener object may be added more than once.  For each
     * property,  the listener will be invoked the number of times it was added
     * for that property.
     * If <code>propertyName</code> or <code>listener</code> is null, no
     * exception is thrown and no action is taken.
     *
     * @param propertyName  The name of the property to listen on.
     * @param listener  The PropertyChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the listeners that were added to the
     * PropertyChangeSupport object with addPropertyChangeListener().
     * <p>
     * If some listeners have been added with a named property, then
     * the returned array will be a mixture of PropertyChangeListeners
     * and <code>PropertyChangeListenerProxy</code>s. If the calling
     * method is interested in distinguishing the listeners then it must
     * test each element to see if it's a
     * <code>PropertyChangeListenerProxy</code>, perform the cast, and examine
     * the parameter.
     *
     * <pre>{@code
     * PropertyChangeListener[] listeners = bean.getPropertyChangeListeners();
     * for (int i = 0; i < listeners.length; i++) {
     *   if (listeners[i] instanceof PropertyChangeListenerProxy) {
     *     PropertyChangeListenerProxy proxy =
     *                    (PropertyChangeListenerProxy)listeners[i];
     *     if (proxy.getPropertyName().equals("foo")) {
     *       // proxy is a PropertyChangeListener which was associated
     *       // with the property named "foo"
     *     }
     *   }
     * }
     * }</pre>
     *
     * @see PropertyChangeListenerProxy
     * @return all of the <code>PropertyChangeListeners</code> added or an
     *         empty array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Remove a PropertyChangeListener from the listener list.
     * This removes a PropertyChangeListener that was registered
     * for all properties.
     * If <code>listener</code> was added more than once to the same event
     * source, it will be notified one less time after being removed.
     * If <code>listener</code> is null, or was never added, no exception is
     * thrown and no action is taken.
     *
     * @param listener  The PropertyChangeListener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Add a PropertyChangeListener to the listener list.
     * The listener is registered for all properties.
     * The same listener object may be added more than once, and will be called
     * as many times as it is added.
     * If <code>listener</code> is null, no exception is thrown and no action
     * is taken.
     *
     * @param listener  The PropertyChangeListener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
    public PropertyChangeSupport(Object sourceBean) {

    /**
     * Constructs a <code>PropertyChangeSupport</code> object.
     *
     * @param sourceBean  The bean to be given as the source for any events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeSupport.java
public class PropertyChangeSupport implements Serializable {

/**
 * This is a utility class that can be used by beans that support bound
 * properties.  It manages a list of listeners and dispatches
 * {@link PropertyChangeEvent}s to them.  You can use an instance of this class
 * as a member field of your bean and delegate these types of work to it.
 * The {@link PropertyChangeListener} can be registered for all properties
 * or for a property specified by name.
 * <p>
 * Here is an example of {@code PropertyChangeSupport} usage that follows
 * the rules and recommendations laid out in the JavaBeans&trade; specification:
 * <pre>
 * public class MyBean {
 *     private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
 *
 *     public void addPropertyChangeListener(PropertyChangeListener listener) {
 *         this.pcs.addPropertyChangeListener(listener);
 *     }
 *
 *     public void removePropertyChangeListener(PropertyChangeListener listener) {
 *         this.pcs.removePropertyChangeListener(listener);
 *     }
 *
 *     private String value;
 *
 *     public String getValue() {
 *         return this.value;
 *     }
 *
 *     public void setValue(String newValue) {
 *         String oldValue = this.value;
 *         this.value = newValue;
 *         this.pcs.firePropertyChange("value", oldValue, newValue);
 *     }
 *
 *     [...]
 * }
 * </pre>
 * <p>
 * A {@code PropertyChangeSupport} instance is thread-safe.
 * <p>
 * This class is serializable.  When it is serialized it will save
 * (and restore) any listeners that are themselves serializable.  Any
 * non-serializable listeners will be skipped during serialization.
 *
 * @see VetoableChangeSupport
 */
