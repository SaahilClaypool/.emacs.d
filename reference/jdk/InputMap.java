_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public KeyStroke[] allKeys() {

    /**
     * Returns an array of the <code>KeyStroke</code>s defined in this
     * <code>InputMap</code> and its parent. This differs from <code>keys()</code> in that
     * this method includes the keys defined in the parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public int size() {

    /**
     * Returns the number of <code>KeyStroke</code> bindings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public KeyStroke[] keys() {

    /**
     * Returns the <code>KeyStroke</code>s that are bound in this <code>InputMap</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public void clear() {

    /**
     * Removes all the mappings from this <code>InputMap</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public void remove(KeyStroke key) {

    /**
     * Removes the binding for <code>key</code> from this
     * <code>InputMap</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public Object get(KeyStroke keyStroke) {

    /**
     * Returns the binding for <code>keyStroke</code>, messaging the
     * parent <code>InputMap</code> if the binding is not locally defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public void put(KeyStroke keyStroke, Object actionMapKey) {

    /**
     * Adds a binding for <code>keyStroke</code> to <code>actionMapKey</code>.
     * If <code>actionMapKey</code> is null, this removes the current binding
     * for <code>keyStroke</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public InputMap getParent() {

    /**
     * Gets this <code>InputMap</code>'s parent.
     *
     * @return map  the <code>InputMap</code> that is the parent of this one,
     *              or null if this <code>InputMap</code> has no parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public void setParent(InputMap map) {

    /**
     * Sets this <code>InputMap</code>'s parent.
     *
     * @param map  the <code>InputMap</code> that is the parent of this one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    public InputMap() {

    /**
     * Creates an <code>InputMap</code> with no parent and no mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
    private transient ArrayTable     arrayTable;

    /** Handles the mapping between KeyStroke and Action name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/InputMap.java
@SuppressWarnings("serial")

/**
 * <code>InputMap</code> provides a binding between an input event
 * (currently only <code>KeyStroke</code>s are used)
 * and an <code>Object</code>. <code>InputMap</code>s
 * are usually used with an <code>ActionMap</code>,
 * to determine an <code>Action</code> to perform
 * when a key is pressed.
 * An <code>InputMap</code> can have a parent
 * that is searched for bindings not defined in the <code>InputMap</code>.
 * <p>As with <code>ActionMap</code> if you create a cycle, eg:
 * <pre>
 *   InputMap am = new InputMap();
 *   InputMap bm = new InputMap():
 *   am.setParent(bm);
 *   bm.setParent(am);
 * </pre>
 * some of the methods will cause a StackOverflowError to be thrown.
 *
 * @author Scott Violet
 * @since 1.3
 */
