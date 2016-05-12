_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void firePropertyChange(String propertyName,
                                           Object oldValue,
                                           Object newValue) {

            /**
             * Support for reporting bound property changes.  If oldValue and
             * newValue are not equal and the PropertyChangeEvent listener list
             * is not empty, then fire a PropertyChange event to each listener.
             * In general, this is for use by the Accessible objects themselves
             * and should not be called by an application program.
             * @param propertyName  The programmatic name of the property that
             * was changed.
             * @param oldValue  The old value of the property.
             * @param newValue  The new value of the property.
             * @see java.beans.PropertyChangeSupport
             * @see #addPropertyChangeListener
             * @see #removePropertyChangeListener
             * @see #ACCESSIBLE_NAME_PROPERTY
             * @see #ACCESSIBLE_DESCRIPTION_PROPERTY
             * @see #ACCESSIBLE_STATE_PROPERTY
             * @see #ACCESSIBLE_VALUE_PROPERTY
             * @see #ACCESSIBLE_SELECTION_PROPERTY
             * @see #ACCESSIBLE_TEXT_PROPERTY
             * @see #ACCESSIBLE_VISIBLE_DATA_PROPERTY
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleTable getAccessibleTable() {

            /**
             * Gets the AccessibleTable associated with an object
             *
             * @return an AccessibleTable if supported by object;
             * otherwise return null
             * @see AccessibleTable
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleRelationSet getAccessibleRelationSet() {

            /**
             * Gets the AccessibleRelationSet associated with an object
             *
             * @return an AccessibleRelationSet if supported by object;
             * otherwise return null
             * @see AccessibleRelationSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleIcon [] getAccessibleIcon() {

            /**
             * Gets the AccessibleIcons associated with an object that has
             * one or more associated icons
             *
             * @return an array of AccessibleIcon if supported by object;
             * otherwise return null
             * @see AccessibleIcon
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleValue getAccessibleValue() {

            /**
             * Gets the AccessibleValue associated with this object that supports a
             * Numerical value.
             *
             * @return AccessibleValue if supported by object; else return null
             * @see AccessibleValue
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleEditableText getAccessibleEditableText() {

            /**
             * Gets the AccessibleEditableText associated with this object
             * presenting editable text on the display.
             *
             * @return AccessibleEditableText if supported by object; else return null
             * @see AccessibleEditableText
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleText getAccessibleText() {

            /**
             * Gets the AccessibleText associated with this object presenting
             * text on the display.
             *
             * @return AccessibleText if supported by object; else return null
             * @see AccessibleText
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleSelection getAccessibleSelection() {

            /**
             * Gets the AccessibleSelection associated with this object which allows its
             * Accessible children to be selected.
             *
             * @return AccessibleSelection if supported by object; else return null
             * @see AccessibleSelection
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleComponent getAccessibleComponent() {

            /**
             * Gets the AccessibleComponent associated with this object that has a
             * graphical representation.
             *
             * @return AccessibleComponent if supported by object; else return null
             * @see AccessibleComponent
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleAction getAccessibleAction() {

            /**
             * Gets the AccessibleAction associated with this object that supports
             * one or more actions.
             *
             * @return AccessibleAction if supported by object; else return null
             * @see AccessibleAction
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            /**
             * Removes a PropertyChangeListener from the listener list.
             * This removes a PropertyChangeListener that was registered
             * for all properties.
             *
             * @param listener  The PropertyChangeListener to be removed
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            /**
             * Adds a PropertyChangeListener to the listener list.
             * The listener is registered for all Accessible properties and will
             * be called when those properties change.
             *
             * @see #ACCESSIBLE_NAME_PROPERTY
             * @see #ACCESSIBLE_DESCRIPTION_PROPERTY
             * @see #ACCESSIBLE_STATE_PROPERTY
             * @see #ACCESSIBLE_VALUE_PROPERTY
             * @see #ACCESSIBLE_SELECTION_PROPERTY
             * @see #ACCESSIBLE_TEXT_PROPERTY
             * @see #ACCESSIBLE_VISIBLE_DATA_PROPERTY
             *
             * @param listener  The PropertyChangeListener to be added
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public Locale getLocale() throws IllegalComponentStateException {

            /**
             * Gets the locale of the component. If the component does not have a
             * locale, then the locale of its parent is returned.
             *
             * @return this component's locale.  If this component does not have
             * a locale, the locale of its parent is returned.
             *
             * @exception IllegalComponentStateException
             * If the Component does not have its own locale and has not yet been
             * added to a containment hierarchy such that the locale can be
             * determined from the containing parent.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Returns the specified Accessible child of the object.  The Accessible
             * children of an Accessible object are zero-based, so the first child
             * of an Accessible child is at index 0, the second child is at index 1,
             * and so on.
             *
             * @param i zero-based index of child
             * @return the Accessible child of the object
             * @see #getAccessibleChildrenCount
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children of the object.
             *
             * @return the number of accessible children of the object.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public int getAccessibleIndexInParent() {

            /**
             * Gets the 0-based index of this object in its accessible parent.
             *
             * @return the 0-based index of this object in its parent; -1 if this
             * object does not have an accessible parent.
             *
             * @see #getAccessibleParent
             * @see #getAccessibleChildrenCount
             * @see #getAccessibleChild
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void setAccessibleParent(Accessible a) {

            /**
             * Sets the Accessible parent of this object.  This is meant to be used
             * only in the situations where the actual component's parent should
             * not be treated as the component's accessible parent and is a method
             * that should only be called by the parent of the accessible child.
             *
             * @param a - Accessible to be set as the parent
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public Accessible getAccessibleParent() {

            /**
             * Gets the Accessible parent of this object.
             *
             * @return the Accessible parent of this object; null if this
             * object does not have an Accessible parent
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Gets the state set of this object.  The AccessibleStateSet of an object
             * is composed of a set of unique AccessibleStates.  A change in the
             * AccessibleStateSet of an object will cause a PropertyChangeEvent to
             * be fired for the ACCESSIBLE_STATE_PROPERTY property.
             *
             * @return an instance of AccessibleStateSet containing the
             * current state set of the object
             * @see AccessibleStateSet
             * @see AccessibleState
             * @see #addPropertyChangeListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.  The role of the object is the generic
             * purpose or use of the class of this object.  For example, the role
             * of a push button is AccessibleRole.PUSH_BUTTON.  The roles in
             * AccessibleRole are provided so component developers can pick from
             * a set of predefined roles.  This enables assistive technologies to
             * provide a consistent interface to various tweaked subclasses of
             * components (e.g., use AccessibleRole.PUSH_BUTTON for all components
             * that act like a push button) as well as distinguish between subclasses
             * that behave differently (e.g., AccessibleRole.CHECK_BOX for check boxes
             * and AccessibleRole.RADIO_BUTTON for radio buttons).
             * <p>Note that the AccessibleRole class is also extensible, so
             * custom component developers can define their own AccessibleRole's
             * if the set of predefined roles is inadequate.
             *
             * @return an instance of AccessibleRole describing the role of the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void setAccessibleDescription(String s) {

            /**
             * Sets the accessible description of this object.  Changing the
             * name will cause a PropertyChangeEvent to be fired for the
             * ACCESSIBLE_DESCRIPTION_PROPERTY property.
             *
             * @param s the new localized description of the object
             *
             * @see #setAccessibleName
             * @see #addPropertyChangeListener
             *
             * @beaninfo
             *    preferred:   true
             *    description: Sets the accessible description for the component.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessibleDescription property of this object.  The
             * accessibleDescription property of this object is a short localized
             * phrase describing the purpose of the object.  For example, in the
             * case of a 'Cancel' button, the accessibleDescription could be
             * 'Ignore changes and close dialog box.'
             *
             * @return the localized description of the object; null if
             * this object does not have a description
             *
             * @see #setAccessibleDescription
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void setAccessibleName(String s) {

            /**
             * Sets the localized accessible name of this object.  Changing the
             * name will cause a PropertyChangeEvent to be fired for the
             * ACCESSIBLE_NAME_PROPERTY property.
             *
             * @param s the new localized name of the object.
             *
             * @see #getAccessibleName
             * @see #addPropertyChangeListener
             *
             * @beaninfo
             *    preferred:   true
             *    description: Sets the accessible name for the component.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public String getAccessibleName() {

            /**
             * Gets the accessibleName property of this object.  The accessibleName
             * property of an object is a localized String that designates the purpose
             * of the object.  For example, the accessibleName property of a label
             * or button might be the text of the label or button itself.  In the
             * case of an object that doesn't display its name, the accessibleName
             * should still be set.  For example, in the case of a text field used
             * to enter the name of a city, the accessibleName for the en_US locale
             * could be 'city.'
             *
             * @return the localized name of the object; null if this
             * object does not have a name
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public void selectAllAccessibleSelection() {

        /**
         * Causes every child of the object to be selected
         * if the object supports multiple selections.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that no children in the
         * object are selected.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified child of the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public void addAccessibleSelection(int i) {

        /**
         * Adds the specified Accessible child of the object to the object's
         * selection.  If the object supports multiple selections,
         * the specified child is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified child is already selected, this method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Determines if the current child of this object is selected.
         *
         * @return true if the current child of this object is selected;
         *              else false
         * @param i the zero-based index of the child in this Accessible
         * object.
         * @see AccessibleContext#getAccessibleChild
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an Accessible representing the specified selected child
         * in the popup.  If there isn't a selection, or there are
         * fewer children selected than the integer passed in, the return
         * value will be null.
         * <p>Note that the index represents the i-th selected child, which
         * is different from the i-th child.
         *
         * @param i the zero-based index of selected children
         * @return the i-th selected child
         * @see #getAccessibleSelectionCount
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public int getAccessibleSelectionCount() {

        /**
         * Returns the number of Accessible children currently selected.
         * If no children are selected, the return value will be 0.
         *
         * @return the number of items currently selected.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Get the AccessibleSelection associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleSelection interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the the action was performed; else false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.  The
         * default behavior of a combo box is to have one action.
         *
         * @return 1, the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of this object.  The AccessibleStateSet of
         * an object is composed of a set of unique AccessibleStates.
         * A change in the AccessibleStateSet of an object will cause a
         * PropertyChangeEvent to be fired for the ACCESSIBLE_STATE_PROPERTY
         * property.
         *
         * @return an instance of AccessibleStateSet containing the
         * current state set of the object
         * @see AccessibleStateSet
         * @see AccessibleState
         * @see #addPropertyChangeListener
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth Accessible child of the object.
         * The child at index zero represents the popup.
         * If the combo box is editable, the child at index one
         * represents the editor.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void popupMenuCanceled(PopupMenuEvent e) {

            /**
             * This method is called when the popup menu is canceled
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {

            /**
             * This method is called before the popup menu becomes invisible
             * Note that a JPopupMenu can become invisible any time
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            /**
             *  This method is called before the popup menu becomes visible
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
        public AccessibleJComboBox() {

        /**
         * Returns an AccessibleJComboBox instance
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected class AccessibleJComboBox extends AccessibleJComponent

    /**
     * This class implements accessibility support for the
     * <code>JComboBox</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to Combo Box user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JComboBox.
     * For combo boxes, the AccessibleContext takes the form of an
     * AccessibleJComboBox.
     * A new AccessibleJComboBox instance is created if necessary.
     *
     * @return an AccessibleJComboBox that serves as the
     *         AccessibleContext of this JComboBox
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
// Accessibility support

///////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JComboBox</code>.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JComboBox</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public interface KeySelectionManager {

    /**
     * The interface that defines a <code>KeySelectionManager</code>.
     * To qualify as a <code>KeySelectionManager</code>,
     * the class needs to implement the method
     * that identifies the list index given a character and the
     * combo box data model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected KeySelectionManager createDefaultKeySelectionManager() {

    /**
     * Returns an instance of the default key-selection manager.
     *
     * @return the <code>KeySelectionManager</code> currently used by the list
     * @see #setKeySelectionManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public E getItemAt(int index) {

    /**
     * Returns the list item at the specified index.  If <code>index</code>
     * is out of range (less than zero or greater than or equal to size)
     * it will return <code>null</code>.
     *
     * @param index  an integer indicating the list position, where the first
     *               item starts at zero
     * @return the item at that list position; or
     *                  <code>null</code> if out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public int getItemCount() {

    /**
     * Returns the number of items in the list.
     *
     * @return an integer equal to the number of items in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public KeySelectionManager getKeySelectionManager() {

    /**
     * Returns the list's key-selection manager.
     *
     * @return the <code>KeySelectionManager</code> currently in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setKeySelectionManager(KeySelectionManager aManager) {

    /**
     * Sets the object that translates a keyboard character into a list
     * selection. Typically, the first selection with a matching first
     * character becomes the selected item.
     *
     * @beaninfo
     *       expert: true
     *  description: The objects that changes the selection when a key is pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void processKeyEvent(KeyEvent e) {

    /**
     * Handles <code>KeyEvent</code>s, looking for the Tab key.
     * If the Tab key is found, the popup window is closed.
     *
     * @param e  the <code>KeyEvent</code> containing the keyboard
     *          key that was pressed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void configureEditor(ComboBoxEditor anEditor, Object anItem) {

    /**
     * Initializes the editor with the specified item.
     *
     * @param anEditor the <code>ComboBoxEditor</code> that displays
     *                  the list item in the
     *                  combo box field and allows it to be edited
     * @param anItem   the object to display and edit in the field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setEnabled(boolean b) {

    /**
     * Enables the combo box so that items can be selected. When the
     * combo box is disabled, items cannot be selected and values
     * cannot be typed into its field (if it is editable).
     *
     * @param b a boolean value, where true enables the component and
     *          false disables it
     * @beaninfo
     *        bound: true
     *    preferred: true
     *  description: Whether the combo box is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public boolean selectWithKeyChar(char keyChar) {

    /**
     * Selects the list item that corresponds to the specified keyboard
     * character and returns true, if there is an item corresponding
     * to that character.  Otherwise, returns false.
     *
     * @param keyChar a char, typically this is a keyboard key
     *                  typed by the user
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void intervalRemoved(ListDataEvent e) {

    /**
     * This method is public as an implementation side effect.
     * do not call or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void intervalAdded(ListDataEvent e) {

    /**
     * This method is public as an implementation side effect.
     * do not call or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void contentsChanged(ListDataEvent e) {

    /**
     * This method is public as an implementation side effect.
     * do not call or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void actionPerformed(ActionEvent e) {

    /**
     * This method is public as an implementation side effect.
     * do not call or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public Object[] getSelectedObjects() {

    /**
     * Returns an array containing the selected item.
     * This method is implemented for compatibility with
     * <code>ItemSelectable</code>.
     *
     * @return an array of <code>Objects</code> containing one
     *          element -- the selected item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected void selectedItemChanged() {

    /**
     * This protected method is implementation specific. Do not access directly
     * or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected void fireActionEvent() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected void fireItemStateChanged(ItemEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     * @param e  the event of interest
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected void actionPropertyChanged(Action action, String propertyName) {

    /**
     * Updates the combobox's state in response to property changes in
     * associated action. This method is invoked from the
     * {@code PropertyChangeListener} returned from
     * {@code createActionPropertyChangeListener}. Subclasses do not normally
     * need to invoke this. Subclasses that support additional {@code Action}
     * properties should override this and
     * {@code configurePropertiesFromAction}.
     * <p>
     * Refer to the table at <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a> for a list of
     * the properties this method sets.
     *
     * @param action the <code>Action</code> associated with this combobox
     * @param propertyName the name of the property that changed
     * @since 1.6
     * @see Action
     * @see #configurePropertiesFromAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected PropertyChangeListener createActionPropertyChangeListener(Action a) {

    /**
     * Creates and returns a <code>PropertyChangeListener</code> that is
     * responsible for listening for changes from the specified
     * <code>Action</code> and updating the appropriate properties.
     * <p>
     * <b>Warning:</b> If you subclass this do not create an anonymous
     * inner class.  If you do the lifetime of the combobox will be tied to
     * that of the <code>Action</code>.
     *
     * @param a the combobox's action
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected void configurePropertiesFromAction(Action a) {

    /**
     * Sets the properties on this combobox to match those in the specified
     * <code>Action</code>.  Refer to <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a> for more
     * details as to which properties this sets.
     *
     * @param a the <code>Action</code> from which to get the properties,
     *          or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public Action getAction() {

    /**
     * Returns the currently set <code>Action</code> for this
     * <code>ActionEvent</code> source, or <code>null</code> if no
     * <code>Action</code> is set.
     *
     * @return the <code>Action</code> for this <code>ActionEvent</code>
     *          source; or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setAction(Action a) {

    /**
     * Sets the <code>Action</code> for the <code>ActionEvent</code> source.
     * The new <code>Action</code> replaces any previously set
     * <code>Action</code> but does not affect <code>ActionListeners</code>
     * independently added with <code>addActionListener</code>.
     * If the <code>Action</code> is already a registered
     * <code>ActionListener</code> for the <code>ActionEvent</code> source,
     * it is not re-registered.
     * <p>
     * Setting the <code>Action</code> results in immediately changing
     * all the properties described in <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a>.
     * Subsequently, the combobox's properties are automatically updated
     * as the <code>Action</code>'s properties change.
     * <p>
     * This method uses three other methods to set
     * and help track the <code>Action</code>'s property values.
     * It uses the <code>configurePropertiesFromAction</code> method
     * to immediately change the combobox's properties.
     * To track changes in the <code>Action</code>'s property values,
     * this method registers the <code>PropertyChangeListener</code>
     * returned by <code>createActionPropertyChangeListener</code>. The
     * default {@code PropertyChangeListener} invokes the
     * {@code actionPropertyChanged} method when a property in the
     * {@code Action} changes.
     *
     * @param a the <code>Action</code> for the <code>JComboBox</code>,
     *                  or <code>null</code>.
     * @since 1.3
     * @see Action
     * @see #getAction
     * @see #configurePropertiesFromAction
     * @see #createActionPropertyChangeListener
     * @see #actionPropertyChanged
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the Action instance connected with this ActionEvent source
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public String getActionCommand() {

    /**
     * Returns the action command that is included in the event sent to
     * action listeners.
     *
     * @return  the string containing the "command" that is sent
     *          to action listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setActionCommand(String aCommand) {

    /**
     * Sets the action command that should be included in the event
     * sent to action listeners.
     *
     * @param aCommand  a string containing the "command" that is sent
     *                  to action listeners; the same listener can then
     *                  do different things depending on the command it
     *                  receives
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void firePopupMenuCanceled() {

    /**
     * Notifies <code>PopupMenuListener</code>s that the popup portion of the
     * combo box has been canceled.
     * <p>
     * This method is public but should not be called by anything other than
     * the UI delegate.
     * @see #addPopupMenuListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void firePopupMenuWillBecomeInvisible() {

    /**
     * Notifies <code>PopupMenuListener</code>s that the popup portion of the
     * combo box has become invisible.
     * <p>
     * This method is public but should not be called by anything other than
     * the UI delegate.
     * @see #addPopupMenuListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void firePopupMenuWillBecomeVisible() {

    /**
     * Notifies <code>PopupMenuListener</code>s that the popup portion of the
     * combo box will become visible.
     * <p>
     * This method is public but should not be called by anything other than
     * the UI delegate.
     * @see #addPopupMenuListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public PopupMenuListener[] getPopupMenuListeners() {

    /**
     * Returns an array of all the <code>PopupMenuListener</code>s added
     * to this JComboBox with addPopupMenuListener().
     *
     * @return all of the <code>PopupMenuListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removePopupMenuListener(PopupMenuListener l) {

    /**
     * Removes a <code>PopupMenuListener</code>.
     *
     * @param l  the <code>PopupMenuListener</code> to remove
     * @see #addPopupMenuListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void addPopupMenuListener(PopupMenuListener l) {

    /**
     * Adds a <code>PopupMenu</code> listener which will listen to notification
     * messages from the popup portion of the combo box.
     * <p>
     * For all standard look and feels shipped with Java, the popup list
     * portion of combo box is implemented as a <code>JPopupMenu</code>.
     * A custom look and feel may not implement it this way and will
     * therefore not receive the notification.
     *
     * @param l  the <code>PopupMenuListener</code> to add
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the <code>ActionListener</code>s added
     * to this JComboBox with addActionListener().
     *
     * @return all of the <code>ActionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removeActionListener(ActionListener l) {

    /** Removes an <code>ActionListener</code>.
     *
     * @param l  the <code>ActionListener</code> to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void addActionListener(ActionListener l) {

    /**
     * Adds an <code>ActionListener</code>.
     * <p>
     * The <code>ActionListener</code> will receive an <code>ActionEvent</code>
     * when a selection has been made. If the combo box is editable, then
     * an <code>ActionEvent</code> will be fired when editing has stopped.
     *
     * @param l  the <code>ActionListener</code> that is to be notified
     * @see #setSelectedItem
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the <code>ItemListener</code>s added
     * to this JComboBox with addItemListener().
     *
     * @return all of the <code>ItemListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removeItemListener(ItemListener aListener) {

    /** Removes an <code>ItemListener</code>.
     *
     * @param aListener  the <code>ItemListener</code> to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    /**

    /** Selection **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public boolean isPopupVisible() {

    /**
     * Determines the visibility of the popup.
     *
     * @return true if the popup is visible, otherwise returns false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setPopupVisible(boolean v) {

    /**
     * Sets the visibility of the popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void hidePopup() {

    /**
     * Causes the combo box to close its popup window.
     * @see #setPopupVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void showPopup() {

    /**
     * Causes the combo box to display its popup window.
     * @see #setPopupVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    void checkMutableComboBoxModel() {

    /**
     * Checks that the <code>dataModel</code> is an instance of
     * <code>MutableComboBoxModel</code>.  If not, it throws an exception.
     * @exception RuntimeException if <code>dataModel</code> is not an
     *          instance of <code>MutableComboBoxModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removeAllItems() {

    /**
     * Removes all items from the item list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removeItemAt(int anIndex) {

    /**
     * Removes the item at <code>anIndex</code>
     * This method works only if the <code>JComboBox</code> uses a
     * mutable data model.
     *
     * @param anIndex  an int specifying the index of the item to remove,
     *                  where 0
     *                  indicates the first item in the list
     * @see MutableComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void removeItem(Object anObject) {

    /**
     * Removes an item from the item list.
     * This method works only if the <code>JComboBox</code> uses a
     * mutable data model.
     *
     * @param anObject  the object to remove from the item list
     * @see MutableComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void insertItemAt(E item, int index) {

    /**
     * Inserts an item into the item list at a given index.
     * This method works only if the <code>JComboBox</code> uses a
     * mutable data model.
     *
     * @param item the item to add to the list
     * @param index    an integer specifying the position at which
     *                  to add the item
     * @see MutableComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void addItem(E item) {

    /**
     * Adds an item to the item list.
     * This method works only if the <code>JComboBox</code> uses a
     * mutable data model.
     * <p>
     * <strong>Warning:</strong>
     * Focus and keyboard navigation problems may arise if you add duplicate
     * String objects. A workaround is to add new objects instead of String
     * objects and make sure that the toString() method is defined.
     * For example:
     * <pre>
     *   comboBox.addItem(makeObj("Item 1"));
     *   comboBox.addItem(makeObj("Item 1"));
     *   ...
     *   private Object makeObj(final String item)  {
     *     return new Object() { public String toString() { return item; } };
     *   }
     * </pre>
     *
     * @param item the item to add to the list
     * @see MutableComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setPrototypeDisplayValue(E prototypeDisplayValue) {

    /**
     * Sets the prototype display value used to calculate the size of the display
     * for the UI portion.
     * <p>
     * If a prototype display value is specified, the preferred size of
     * the combo box is calculated by configuring the renderer with the
     * prototype display value and obtaining its preferred size. Specifying
     * the preferred display value is often useful when the combo box will be
     * displaying large amounts of data. If no prototype display value has
     * been specified, the renderer must be configured for each value from
     * the model and its preferred size obtained, which can be
     * relatively expensive.
     *
     * @param prototypeDisplayValue
     * @see #getPrototypeDisplayValue
     * @since 1.4
     * @beaninfo
     *       bound: true
     *   attribute: visualUpdate true
     * description: The display prototype value, used to compute display width and height.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public E getPrototypeDisplayValue() {

    /**
     * Returns the "prototypical display" value - an Object used
     * for the calculation of the display height and width.
     *
     * @return the value of the <code>prototypeDisplayValue</code> property
     * @see #setPrototypeDisplayValue
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    @Transient

    /**
     * Returns the first item in the list that matches the given item.
     * The result is not always defined if the <code>JComboBox</code>
     * allows selected items that are not in the list.
     * Returns -1 if there is no selected item or if the user specified
     * an item which is not in the list.

     * @return an integer specifying the currently selected list item,
     *                  where 0 specifies
     *                  the first item in the list;
     *                  or -1 if no item is selected or if
     *                  the currently selected item is not in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setSelectedIndex(int anIndex) {

    /**
     * Selects the item at index <code>anIndex</code>.
     *
     * @param anIndex an integer specifying the list item to select,
     *                  where 0 specifies the first item in the list and -1 indicates no selection
     * @exception IllegalArgumentException if <code>anIndex</code> &lt; -1 or
     *                  <code>anIndex</code> is greater than or equal to size
     * @beaninfo
     *   preferred: true
     *  description: The item at index is selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public Object getSelectedItem() {

    /**
     * Returns the current selected item.
     * <p>
     * If the combo box is editable, then this value may not have been added
     * to the combo box with <code>addItem</code>, <code>insertItemAt</code>
     * or the data constructors.
     *
     * @return the current selected Object
     * @see #setSelectedItem
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setSelectedItem(Object anObject) {

    /**
     * Sets the selected item in the combo box display area to the object in
     * the argument.
     * If <code>anObject</code> is in the list, the display area shows
     * <code>anObject</code> selected.
     * <p>
     * If <code>anObject</code> is <i>not</i> in the list and the combo box is
     * uneditable, it will not change the current selection. For editable
     * combo boxes, the selection will change to <code>anObject</code>.
     * <p>
     * If this constitutes a change in the selected item,
     * <code>ItemListener</code>s added to the combo box will be notified with
     * one or two <code>ItemEvent</code>s.
     * If there is a current selected item, an <code>ItemEvent</code> will be
     * fired and the state change will be <code>ItemEvent.DESELECTED</code>.
     * If <code>anObject</code> is in the list and is not currently selected
     * then an <code>ItemEvent</code> will be fired and the state change will
     * be <code>ItemEvent.SELECTED</code>.
     * <p>
     * <code>ActionListener</code>s added to the combo box will be notified
     * with an <code>ActionEvent</code> when this method is called.
     *
     * @param anObject  the list object to select; use <code>null</code> to
                        clear the selection
     * @beaninfo
     *    preferred:   true
     *    description: Sets the selected item in the JComboBox.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ComboBoxEditor getEditor() {

    /**
     * Returns the editor used to paint and edit the selected item in the
     * <code>JComboBox</code> field.
     *
     * @return the <code>ComboBoxEditor</code> that displays the selected item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setEditor(ComboBoxEditor anEditor) {

    /**
     * Sets the editor used to paint and edit the selected item in the
     * <code>JComboBox</code> field.  The editor is used only if the
     * receiving <code>JComboBox</code> is editable. If not editable,
     * the combo box uses the renderer to paint the selected item.
     *
     * @param anEditor  the <code>ComboBoxEditor</code> that
     *                  displays the selected item
     * @see #setRenderer
     * @beaninfo
     *     bound: true
     *    expert: true
     *  description: The editor that combo box uses to edit the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ListCellRenderer<? super E> getRenderer() {

    /**
     * Returns the renderer used to display the selected item in the
     * <code>JComboBox</code> field.
     *
     * @return  the <code>ListCellRenderer</code> that displays
     *                  the selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setRenderer(ListCellRenderer<? super E> aRenderer) {

    /**
     * Sets the renderer that paints the list items and the item selected from the list in
     * the JComboBox field. The renderer is used if the JComboBox is not
     * editable. If it is editable, the editor is used to render and edit
     * the selected item.
     * <p>
     * The default renderer displays a string or an icon.
     * Other renderers can handle graphic images and composite items.
     * <p>
     * To display the selected item,
     * <code>aRenderer.getListCellRendererComponent</code>
     * is called, passing the list object and an index of -1.
     *
     * @param aRenderer  the <code>ListCellRenderer</code> that
     *                  displays the selected item
     * @see #setEditor
     * @beaninfo
     *      bound: true
     *     expert: true
     *  description: The renderer that paints the item selected in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public int getMaximumRowCount() {

    /**
     * Returns the maximum number of items the combo box can display
     * without a scrollbar
     *
     * @return an integer specifying the maximum number of items that are
     *         displayed in the list before using a scrollbar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setMaximumRowCount(int count) {

    /**
     * Sets the maximum number of rows the <code>JComboBox</code> displays.
     * If the number of objects in the model is greater than count,
     * the combo box uses a scrollbar.
     *
     * @param count an integer specifying the maximum number of items to
     *              display in the list before using a scrollbar
     * @beaninfo
     *        bound: true
     *    preferred: true
     *  description: The maximum number of rows the popup should have
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public boolean isEditable() {

    /**
     * Returns true if the <code>JComboBox</code> is editable.
     * By default, a combo box is not editable.
     *
     * @return true if the <code>JComboBox</code> is editable, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setEditable(boolean aFlag) {

    /**
     * Determines whether the <code>JComboBox</code> field is editable.
     * An editable <code>JComboBox</code> allows the user to type into the
     * field or selected an item from the list to initialize the field,
     * after which it can be edited. (The editing affects only the field,
     * the list item remains intact.) A non editable <code>JComboBox</code>
     * displays the selected item in the field,
     * but the selection cannot be modified.
     *
     * @param aFlag a boolean value, where true indicates that the
     *                  field is editable
     *
     * @beaninfo
     *        bound: true
     *    preferred: true
     *  description: If true, the user can type a new value in the combo box.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public boolean isLightWeightPopupEnabled() {

    /**
     * Gets the value of the <code>lightWeightPopupEnabled</code>
     * property.
     *
     * @return the value of the <code>lightWeightPopupEnabled</code>
     *    property
     * @see #setLightWeightPopupEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setLightWeightPopupEnabled(boolean aFlag) {

    /**
     * Sets the <code>lightWeightPopupEnabled</code> property, which
     * provides a hint as to whether or not a lightweight
     * <code>Component</code> should be used to contain the
     * <code>JComboBox</code>, versus a heavyweight
     * <code>Component</code> such as a <code>Panel</code>
     * or a <code>Window</code>.  The decision of lightweight
     * versus heavyweight is ultimately up to the
     * <code>JComboBox</code>.  Lightweight windows are more
     * efficient than heavyweight windows, but lightweight
     * and heavyweight components do not mix well in a GUI.
     * If your application mixes lightweight and heavyweight
     * components, you should disable lightweight popups.
     * The default value for the <code>lightWeightPopupEnabled</code>
     * property is <code>true</code>, unless otherwise specified
     * by the look and feel.  Some look and feels always use
     * heavyweight popups, no matter what the value of this property.
     * <p>
     * See the article <a href="http://www.oracle.com/technetwork/articles/java/mixing-components-433992.html">Mixing Heavy and Light Components</a>
     * This method fires a property changed event.
     *
     * @param aFlag if <code>true</code>, lightweight popups are desired
     *
     * @beaninfo
     *        bound: true
     *       expert: true
     *  description: Set to <code>false</code> to require heavyweight popups.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ComboBoxModel<E> getModel() {

    /**
     * Returns the data model currently used by the <code>JComboBox</code>.
     *
     * @return the <code>ComboBoxModel</code> that provides the displayed
     *                  list of items
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setModel(ComboBoxModel<E> aModel) {

    /**
     * Sets the data model that the <code>JComboBox</code> uses to obtain
     * the list of items.
     *
     * @param aModel the <code>ComboBoxModel</code> that provides the
     *  displayed list of items
     *
     * @beaninfo
     *        bound: true
     *  description: Model that the combo box uses to get data to display.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public ComboBoxUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the ComboBoxUI object that renders this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "ComboBoxUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public void setUI(ComboBoxUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the <code>ComboBoxUI</code> L&amp;F object
     * @see UIDefaults#getUI
     *
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public JComboBox() {

    /**
     * Creates a <code>JComboBox</code> with a default data model.
     * The default data model is an empty list of objects.
     * Use <code>addItem</code> to add items.  By default the first item
     * in the data model becomes selected.
     *
     * @see DefaultComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public JComboBox(Vector<E> items) {

    /**
     * Creates a <code>JComboBox</code> that contains the elements
     * in the specified Vector.  By default the first item in the vector
     * (and therefore the data model) becomes selected.
     *
     * @param items  an array of vectors to insert into the combo box
     * @see DefaultComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public JComboBox(E[] items) {

    /**
     * Creates a <code>JComboBox</code> that contains the elements
     * in the specified array.  By default the first item in the array
     * (and therefore the data model) becomes selected.
     *
     * @param items  an array of objects to insert into the combo box
     * @see DefaultComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    public JComboBox(ComboBoxModel<E> aModel) {

    /**
     * Creates a <code>JComboBox</code> that takes its items from an
     * existing <code>ComboBoxModel</code>.  Since the
     * <code>ComboBoxModel</code> is provided, a combo box created using
     * this constructor does not create a default combo box model and
     * may impact how the insert, remove and add methods behave.
     *
     * @param aModel the <code>ComboBoxModel</code> that provides the
     *          displayed list of items
     * @see DefaultComboBoxModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected Object selectedItemReminder = null;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected String actionCommand = "comboBoxChanged";

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor methods instead.
     *
     * @see #setActionCommand
     * @see #getActionCommand
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected boolean isEditable  = false;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor methods instead.
     *
     * @see #isEditable
     * @see #setEditable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected ComboBoxEditor       editor;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor methods instead.
     *
     * @see #getEditor
     * @see #setEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    protected ComboBoxModel<E>    dataModel;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor methods instead.
     *
     * @see #getModel
     * @see #setModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
    private static final String uiClassID = "ComboBoxUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JComboBox.java
public class JComboBox<E> extends JComponent

/**
 * A component that combines a button or editable field and a drop-down list.
 * The user can select a value from the drop-down list, which appears at the
 * user's request. If you make the combo box editable, then the combo box
 * includes an editable field into which the user can type a value.
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
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
 * <p>
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html">How to Use Combo Boxes</a>
 * in <a href="https://docs.oracle.com/javase/tutorial/"><em>The Java Tutorial</em></a>
 * for further information.
 * <p>
 * @see ComboBoxModel
 * @see DefaultComboBoxModel
 *
 * @param <E> the type of the elements of this combo box
 *
 * @beaninfo
 *   attribute: isContainer false
 * description: A combination of a text field and a drop-down list.
 *
 * @author Arnaud Weber
 * @author Mark Davidson
 */
