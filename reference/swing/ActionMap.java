_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public Object[] allKeys() {

    /**
     * Returns an array of the keys defined in this <code>ActionMap</code> and
     * its parent. This method differs from <code>keys()</code> in that
     * this method includes the keys defined in the parent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public int size() {

    /**
     * Returns the number of bindings in this {@code ActionMap}.
     *
     * @return the number of bindings in this {@code ActionMap}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public Object[] keys() {

    /**
     * Returns the <code>Action</code> names that are bound in this <code>ActionMap</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public void clear() {

    /**
     * Removes all the mappings from this <code>ActionMap</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public void remove(Object key) {

    /**
     * Removes the binding for <code>key</code> from this <code>ActionMap</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public Action get(Object key) {

    /**
     * Returns the binding for <code>key</code>, messaging the
     * parent <code>ActionMap</code> if the binding is not locally defined.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public void put(Object key, Action action) {

    /**
     * Adds a binding for <code>key</code> to <code>action</code>.
     * If <code>action</code> is null, this removes the current binding
     * for <code>key</code>.
     * <p>In most instances, <code>key</code> will be
     * <code>action.getValue(NAME)</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public ActionMap getParent() {

    /**
     * Returns this <code>ActionMap</code>'s parent.
     *
     * @return the <code>ActionMap</code> that is the parent of this one,
     *         or null if this <code>ActionMap</code> has no parent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public void setParent(ActionMap map) {

    /**
     * Sets this <code>ActionMap</code>'s parent.
     *
     * @param map  the <code>ActionMap</code> that is the parent of this one
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    public ActionMap() {

    /**
     * Creates an <code>ActionMap</code> with no parent and no mappings.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    private ActionMap                               parent;

    /** Parent that handles any bindings we don't contain. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
    private transient ArrayTable     arrayTable;

    /** Handles the mapping between Action name and Action. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionMap.java
@SuppressWarnings("serial")

/**
 * <code>ActionMap</code> provides mappings from
 * <code>Object</code>s
 * (called <em>keys</em> or <em><code>Action</code> names</em>)
 * to <code>Action</code>s.
 * An <code>ActionMap</code> is usually used with an <code>InputMap</code>
 * to locate a particular action
 * when a key is pressed. As with <code>InputMap</code>,
 * an <code>ActionMap</code> can have a parent
 * that is searched for keys not defined in the <code>ActionMap</code>.
 * <p>As with <code>InputMap</code> if you create a cycle, eg:
 * <pre>
 *   ActionMap am = new ActionMap();
 *   ActionMap bm = new ActionMap():
 *   am.setParent(bm);
 *   bm.setParent(am);
 * </pre>
 * some of the methods will cause a StackOverflowError to be thrown.
 *
 * @see InputMap
 *
 * @author Scott Violet
 * @since 1.3
 */
