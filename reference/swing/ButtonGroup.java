_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public int getButtonCount() {

    /**
     * Returns the number of buttons in the group.
     * @return the button count
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public boolean isSelected(ButtonModel m) {

    /**
     * Returns whether a <code>ButtonModel</code> is selected.
     * @return <code>true</code> if the button is selected,
     *   otherwise returns <code>false</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public void setSelected(ButtonModel m, boolean b) {

    /**
     * Sets the selected value for the <code>ButtonModel</code>.
     * Only one button in the group may be selected at a time.
     * @param m the <code>ButtonModel</code>
     * @param b <code>true</code> if this button is to be
     *   selected, otherwise <code>false</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public ButtonModel getSelection() {

    /**
     * Returns the model of the selected button.
     * @return the selected button model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public Enumeration<AbstractButton> getElements() {

    /**
     * Returns all the buttons that are participating in
     * this group.
     * @return an <code>Enumeration</code> of the buttons in this group
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public void clearSelection() {

    /**
     * Clears the selection such that none of the buttons
     * in the <code>ButtonGroup</code> are selected.
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public void remove(AbstractButton b) {

    /**
     * Removes the button from the group.
     * @param b the button to be removed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public void add(AbstractButton b) {

    /**
     * Adds the button to the group.
     * @param b the button to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    public ButtonGroup() {}

    /**
     * Creates a new <code>ButtonGroup</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
    ButtonModel selection = null;

    /**
     * The current selection.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonGroup.java
@SuppressWarnings("serial")

/**
 * This class is used to create a multiple-exclusion scope for
 * a set of buttons. Creating a set of buttons with the
 * same <code>ButtonGroup</code> object means that
 * turning "on" one of those buttons
 * turns off all other buttons in the group.
 * <p>
 * A <code>ButtonGroup</code> can be used with
 * any set of objects that inherit from <code>AbstractButton</code>.
 * Typically a button group contains instances of
 * <code>JRadioButton</code>,
 * <code>JRadioButtonMenuItem</code>,
 * or <code>JToggleButton</code>.
 * It wouldn't make sense to put an instance of
 * <code>JButton</code> or <code>JMenuItem</code>
 * in a button group
 * because <code>JButton</code> and <code>JMenuItem</code>
 * don't implement the selected state.
 * <p>
 * Initially, all buttons in the group are unselected.
 * <p>
 * For examples and further information on using button groups see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/button.html#radiobutton">How to Use Radio Buttons</a>,
 * a section in <em>The Java Tutorial</em>.
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
 * @author Jeff Dinkins
 */
