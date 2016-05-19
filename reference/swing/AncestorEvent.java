_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public JComponent getComponent() {

    /**
     * Returns the component that the listener was added to.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public Container getAncestorParent() {

    /**
     * Returns the parent of the ancestor the event actually occurred on.
     * This is most interesting in an ANCESTOR_REMOVED event, as
     * the ancestor may no longer be in the component hierarchy.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public Container getAncestor() {

    /**
     * Returns the ancestor that the event actually occurred on.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public AncestorEvent(JComponent source, int id, Container ancestor, Container ancestorParent) {

    /**
     * Constructs an AncestorEvent object to identify a change
     * in an ancestor-component's display-status.
     *
     * @param source          the JComponent that originated the event
     *                        (typically <code>this</code>)
     * @param id              an int specifying {@link #ANCESTOR_ADDED},
     *                        {@link #ANCESTOR_REMOVED} or {@link #ANCESTOR_MOVED}
     * @param ancestor        a Container object specifying the ancestor-component
     *                        whose display-status changed
     * @param ancestorParent  a Container object specifying the ancestor's parent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public static final int ANCESTOR_MOVED = 3;

    /** An ancestor-component changed its position on the screen. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public static final int ANCESTOR_REMOVED = 2;

    /**
     * An ancestor-component was removed from the hierarchy
     * of visible objects (hidden) and is no longer being displayed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
    public static final int ANCESTOR_ADDED = 1;

    /**
     * An ancestor-component was added to the hierarchy of
     * visible objects (made visible), and is currently being displayed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/AncestorEvent.java
@SuppressWarnings("serial")

/**
 * An event reported to a child component that originated from an
 * ancestor in the component hierarchy.
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
 * @author Dave Moore
 */
