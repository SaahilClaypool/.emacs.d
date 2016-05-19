_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void removeChangeListener(ChangeListener l);

    /**
     * Removes a <code>ChangeListener</code> from the model.
     *
     * @param l the listener to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void addChangeListener(ChangeListener l);

    /**
     * Adds a <code>ChangeListener</code> to the model.
     *
     * @param l the listener to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void removeItemListener(ItemListener l);

    /**
     * Removes an <code>ItemListener</code> from the model.
     *
     * @param l the listener to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void addItemListener(ItemListener l);

    /**
     * Adds an <code>ItemListener</code> to the model.
     *
     * @param l the listener to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void removeActionListener(ActionListener l);

    /**
     * Removes an <code>ActionListener</code> from the model.
     *
     * @param l the listener to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    void addActionListener(ActionListener l);

    /**
     * Adds an <code>ActionListener</code> to the model.
     *
     * @param l the listener to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setGroup(ButtonGroup group);

    /**
     * Identifies the group the button belongs to --
     * needed for radio buttons, which are mutually
     * exclusive within their group.
     *
     * @param group the <code>ButtonGroup</code> the button belongs to
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public String getActionCommand();

    /**
     * Returns the action command string for the button.
     *
     * @return the <code>String</code> that identifies the generated event
     * @see #setActionCommand
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setActionCommand(String s);

    /**
     * Sets the action command string that gets sent as part of the
     * <code>ActionEvent</code> when the button is triggered.
     *
     * @param s the <code>String</code> that identifies the generated event
     * @see #getActionCommand
     * @see java.awt.event.ActionEvent#getActionCommand
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public int  getMnemonic();

    /**
     * Gets the keyboard mnemonic for the button.
     *
     * @return an int specifying the accelerator key
     * @see #setMnemonic
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setMnemonic(int key);

    /**
     * Sets the keyboard mnemonic (shortcut key or
     * accelerator key) for the button.
     *
     * @param key an int specifying the accelerator key
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setRollover(boolean b);

    /**
     * Sets or clears the button's rollover state
     *
     * @param b whether or not the button is in the rollover state
     * @see #isRollover
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setPressed(boolean b);

    /**
     * Sets the button to pressed or unpressed.
     *
     * @param b whether or not the button should be pressed
     * @see #isPressed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setEnabled(boolean b);

    /**
     * Enables or disables the button.
     *
     * @param b whether or not the button should be enabled
     * @see #isEnabled
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setSelected(boolean b);

    /**
     * Selects or deselects the button.
     *
     * @param b <code>true</code> selects the button,
     *          <code>false</code> deselects the button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    public void setArmed(boolean b);

    /**
     * Marks the button as armed or unarmed.
     *
     * @param b whether or not the button should be armed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    boolean isRollover();

    /**
     * Indicates that the mouse is over the button.
     *
     * @return <code>true</code> if the mouse is over the button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    boolean isPressed();

    /**
     * Indicates if the button is pressed.
     *
     * @return <code>true</code> if the button is pressed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    boolean isEnabled();

    /**
     * Indicates if the button can be selected or triggered by
     * an input device, such as a mouse pointer.
     *
     * @return <code>true</code> if the button is enabled
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    boolean isSelected();

    /**
     * Indicates if the button has been selected. Only needed for
     * certain types of buttons - such as radio buttons and check boxes.
     *
     * @return <code>true</code> if the button is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
    boolean isArmed();

    /**
     * Indicates partial commitment towards triggering the
     * button.
     *
     * @return <code>true</code> if the button is armed,
     *         and ready to be triggered
     * @see #setArmed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ButtonModel.java
public interface ButtonModel extends ItemSelectable {

/**
 * State model for buttons.
 * <p>
 * This model is used for regular buttons, as well as check boxes
 * and radio buttons, which are special kinds of buttons. In practice,
 * a button's UI takes the responsibility of calling methods on its
 * model to manage the state, as detailed below:
 * <p>
 * In simple terms, pressing and releasing the mouse over a regular
 * button triggers the button and causes and <code>ActionEvent</code>
 * to be fired. The same behavior can be produced via a keyboard key
 * defined by the look and feel of the button (typically the SPACE BAR).
 * Pressing and releasing this key while the button has
 * focus will give the same results. For check boxes and radio buttons, the
 * mouse or keyboard equivalent sequence just described causes the button
 * to become selected.
 * <p>
 * In details, the state model for buttons works as follows
 * when used with the mouse:
 * <br>
 * Pressing the mouse on top of a button makes the model both
 * armed and pressed. As long as the mouse remains down,
 * the model remains pressed, even if the mouse moves
 * outside the button. On the contrary, the model is only
 * armed while the mouse remains pressed within the bounds of
 * the button (it can move in or out of the button, but the model
 * is only armed during the portion of time spent within the button).
 * A button is triggered, and an <code>ActionEvent</code> is fired,
 * when the mouse is released while the model is armed
 * - meaning when it is released over top of the button after the mouse
 * has previously been pressed on that button (and not already released).
 * Upon mouse release, the model becomes unarmed and unpressed.
 * <p>
 * In details, the state model for buttons works as follows
 * when used with the keyboard:
 * <br>
 * Pressing the look and feel defined keyboard key while the button
 * has focus makes the model both armed and pressed. As long as this key
 * remains down, the model remains in this state. Releasing the key sets
 * the model to unarmed and unpressed, triggers the button, and causes an
 * <code>ActionEvent</code> to be fired.
 *
 * @author Jeff Dinkins
 */
