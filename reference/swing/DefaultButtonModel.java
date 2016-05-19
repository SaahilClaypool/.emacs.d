_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public ButtonGroup getGroup() {

    /**
     * Returns the group that the button belongs to.
     * Normally used with radio buttons, which are mutually
     * exclusive within their group.
     *
     * @return the <code>ButtonGroup</code> that the button belongs to
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setGroup(ButtonGroup group) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public Object[] getSelectedObjects() {

    /** Overridden to return <code>null</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered as
     * <code><em>Foo</em>Listener</code>s
     * upon this model.
     * <code><em>Foo</em>Listener</code>s
     * are registered using the <code>add<em>Foo</em>Listener</code> method.
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a <code>DefaultButtonModel</code>
     * instance <code>m</code>
     * for its action listeners
     * with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(m.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist,
     * this method returns an empty array.
     *
     * @param listenerType  the type of listeners requested;
     *          this parameter should specify an interface
     *          that descends from <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s
     *          on this model,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code> doesn't
     *          specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @see #getChangeListeners
     * @see #getItemListeners
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected void fireItemStateChanged(ItemEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param e the <code>ItemEvent</code> to deliver to listeners
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this <code>DefaultButtonModel</code>.
     *
     * @return all of this model's <code>ItemListener</code>s
     *         or an empty
     *         array if no item listeners are currently registered
     *
     * @see #addItemListener
     * @see #removeItemListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void removeItemListener(ItemListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void addItemListener(ItemListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected void fireActionPerformed(ActionEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param e the <code>ActionEvent</code> to deliver to listeners
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this <code>DefaultButtonModel</code>.
     *
     * @return all of this model's <code>ActionListener</code>s
     *         or an empty
     *         array if no action listeners are currently registered
     *
     * @see #addActionListener
     * @see #removeActionListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void removeActionListener(ActionListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void addActionListener(ActionListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected void fireStateChanged() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the change listeners
     * registered on this <code>DefaultButtonModel</code>.
     *
     * @return all of this model's <code>ChangeListener</code>s
     *         or an empty
     *         array if no change listeners are currently registered
     *
     * @see #addChangeListener
     * @see #removeChangeListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void addChangeListener(ChangeListener l) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public int getMnemonic() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setMnemonic(int key) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setRollover(boolean b) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setPressed(boolean b) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setSelected(boolean b) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setEnabled(boolean b) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setArmed(boolean b) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public boolean isRollover() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public boolean isPressed() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public boolean isEnabled() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public boolean isSelected() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public boolean isArmed() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public String getActionCommand() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public void setActionCommand(String actionCommand) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public final static int ROLLOVER = 1 << 4;

    /**
     * Identifies the "rollover" bit in the bitmask, which
     * indicates that the mouse is over the button.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public final static int ENABLED = 1 << 3;

    /**
     * Identifies the "enabled" bit in the bitmask, which
     * indicates that the button can be selected by
     * an input device (such as a mouse pointer).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public final static int PRESSED = 1 << 2;

    /**
     * Identifies the "pressed" bit in the bitmask, which
     * indicates that the button is pressed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public final static int SELECTED = 1 << 1;

    /**
     * Identifies the "selected" bit in the bitmask, which
     * indicates that the button has been selected. Only needed for
     * certain types of buttons - such as radio button or check box.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public final static int ARMED = 1 << 0;

    /**
     * Identifies the "armed" bit in the bitmask, which
     * indicates partial commitment towards choosing/triggering
     * the button.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    public DefaultButtonModel() {

    /**
     * Constructs a <code>DefaultButtonModel</code>.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /** Stores the listeners on this model. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected transient ChangeEvent changeEvent = null;

    /**
     * Only one <code>ChangeEvent</code> is needed per button model
     * instance since the event's only state is the source property.
     * The source of events generated is always "this".
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected int mnemonic = 0;

    /** The button's mnemonic. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected ButtonGroup group = null;

    /** The button group that the button belongs to. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected String actionCommand = null;

    /** The action command string fired by the button. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
    protected int stateMask = 0;

    /** The bitmask used to store the state of the button. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultButtonModel.java
public class DefaultButtonModel implements ButtonModel, Serializable {

/**
 * The default implementation of a <code>Button</code> component's data model.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing. As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Jeff Dinkins
 */
