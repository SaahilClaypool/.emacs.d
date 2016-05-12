_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public abstract L extract(L listener);

    /**
     * Extracts a real listener from the proxy listener.
     * It is necessary because default proxy class is not serializable.
     *
     * @return a real listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final Set<Entry<String, L[]>> getEntries() {

    /**
     * Returns a set of entries from the map.
     * Each entry is a pair consisted of the property name
     * and the corresponding list of listeners.
     *
     * @return a set of entries from the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized boolean hasListeners(String name) {

    /**
     * Indicates whether the map contains
     * at least one listener to be notified.
     *
     * @param name  the name of the property
     * @return      {@code true} if at least one listener exists or
     *              {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final L[] getListeners(String name) {

    /**
     * Returns listeners that have been associated with the named property.
     *
     * @param name  the name of the property
     * @return an array of listeners for the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized L[] getListeners() {

    /**
     * Returns all listeners in the map.
     *
     * @return an array of all listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final void set(String name, L[] listeners) {

    /**
     * Sets new list of listeners for the specified property.
     *
     * @param name       the name of the property
     * @param listeners  new list of listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized L[] get(String name) {

    /**
     * Returns the list of listeners for the specified property.
     *
     * @param name  the name of the property
     * @return      the corresponding list of listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized void remove(String name, L listener) {

    /**
     * Removes a listener from the list of listeners for the specified property.
     * If the listener was added more than once to the same event source,
     * this listener will be notified one less time after being removed.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized void add(String name, L listener) {

    /**
     * Adds a listener to the list of listeners for the specified property.
     * This listener is called as many times as it was added.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    protected abstract L newProxy(String name, L listener);

    /**
     * Creates a proxy listener for the specified property.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     * @return          a proxy listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    protected abstract L[] newArray(int length);

    /**
     * Creates an array of listeners.
     * This method can be optimized by using
     * the same instance of the empty array
     * when {@code length} is equal to {@code 0}.
     *
     * @param length  the array length
     * @return        an array with specified length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
abstract class ChangeListenerMap<L extends EventListener> {

/**
 * This is an abstract class that provides base functionality
 * for the {@link PropertyChangeSupport PropertyChangeSupport} class
 * and the {@link VetoableChangeSupport VetoableChangeSupport} class.
 *
 * @see PropertyChangeListenerMap
 * @see VetoableChangeListenerMap
 *
 * @author Sergey A. Malenkov
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public abstract L extract(L listener);

    /**
     * Extracts a real listener from the proxy listener.
     * It is necessary because default proxy class is not serializable.
     *
     * @return a real listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final Set<Entry<String, L[]>> getEntries() {

    /**
     * Returns a set of entries from the map.
     * Each entry is a pair consisted of the property name
     * and the corresponding list of listeners.
     *
     * @return a set of entries from the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized boolean hasListeners(String name) {

    /**
     * Indicates whether the map contains
     * at least one listener to be notified.
     *
     * @param name  the name of the property
     * @return      {@code true} if at least one listener exists or
     *              {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final L[] getListeners(String name) {

    /**
     * Returns listeners that have been associated with the named property.
     *
     * @param name  the name of the property
     * @return an array of listeners for the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized L[] getListeners() {

    /**
     * Returns all listeners in the map.
     *
     * @return an array of all listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final void set(String name, L[] listeners) {

    /**
     * Sets new list of listeners for the specified property.
     *
     * @param name       the name of the property
     * @param listeners  new list of listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized L[] get(String name) {

    /**
     * Returns the list of listeners for the specified property.
     *
     * @param name  the name of the property
     * @return      the corresponding list of listeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized void remove(String name, L listener) {

    /**
     * Removes a listener from the list of listeners for the specified property.
     * If the listener was added more than once to the same event source,
     * this listener will be notified one less time after being removed.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    public final synchronized void add(String name, L listener) {

    /**
     * Adds a listener to the list of listeners for the specified property.
     * This listener is called as many times as it was added.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    protected abstract L newProxy(String name, L listener);

    /**
     * Creates a proxy listener for the specified property.
     *
     * @param name      the name of the property to listen on
     * @param listener  the listener to process events
     * @return          a proxy listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
    protected abstract L[] newArray(int length);

    /**
     * Creates an array of listeners.
     * This method can be optimized by using
     * the same instance of the empty array
     * when {@code length} is equal to {@code 0}.
     *
     * @param length  the array length
     * @return        an array with specified length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/ChangeListenerMap.java
abstract class ChangeListenerMap<L extends EventListener> {

/**
 * This is an abstract class that provides base functionality
 * for the {@link PropertyChangeSupport PropertyChangeSupport} class
 * and the {@link VetoableChangeSupport VetoableChangeSupport} class.
 *
 * @see PropertyChangeListenerMap
 * @see VetoableChangeListenerMap
 *
 * @author Sergey A. Malenkov
 */
