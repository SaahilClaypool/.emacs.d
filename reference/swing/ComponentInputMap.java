_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public void clear() {

    /**
     * Removes all the mappings from this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public void remove(KeyStroke key) {

    /**
     * Removes the binding for <code>key</code> from this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public void put(KeyStroke keyStroke, Object actionMapKey) {

    /**
     * Adds a binding for <code>keyStroke</code> to <code>actionMapKey</code>.
     * If <code>actionMapKey</code> is null, this removes the current binding
     * for <code>keyStroke</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public JComponent getComponent() {

    /**
     * Returns the component the <code>InputMap</code> was created for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public void setParent(InputMap map) {

    /**
     * Sets the parent, which must be a <code>ComponentInputMap</code>
     * associated with the same component as this
     * <code>ComponentInputMap</code>.
     *
     * @param map  a <code>ComponentInputMap</code>
     *
     * @throws IllegalArgumentException  if <code>map</code>
     *         is not a <code>ComponentInputMap</code>
     *         or is not associated with the same component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    public ComponentInputMap(JComponent component) {

    /**
     * Creates a <code>ComponentInputMap</code> associated with the
     * specified component.
     *
     * @param component  a non-null <code>JComponent</code>
     * @throws IllegalArgumentException  if <code>component</code> is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
    private JComponent          component;

    /** Component binding is created for. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ComponentInputMap.java
@SuppressWarnings("serial")

/**
 * A <code>ComponentInputMap</code> is an <code>InputMap</code>
 * associated with a particular <code>JComponent</code>.
 * The component is automatically notified whenever
 * the <code>ComponentInputMap</code> changes.
 * <code>ComponentInputMap</code>s are used for
 * <code>WHEN_IN_FOCUSED_WINDOW</code> bindings.
 *
 * @author Scott Violet
 * @since 1.3
 */
