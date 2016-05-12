_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
            public java.lang.Object getAccessibleKeyBinding(int i) {

            /**
             * Returns a key binding for this object.  The value returned is an
             * java.lang.Object which must be cast to appropriate type depending
             * on the underlying implementation of the key.  For example, if the
             * Object returned is a javax.swing.KeyStroke, the user of this
             * method should do the following:
             * <nf><code>
             * Component c = <get the component that has the key bindings>
             * AccessibleContext ac = c.getAccessibleContext();
             * AccessibleKeyBinding akb = ac.getAccessibleKeyBinding();
             * for (int i = 0; i < akb.getAccessibleKeyBindingCount(); i++) {
             *     Object o = akb.getAccessibleKeyBinding(i);
             *     if (o instanceof javax.swing.KeyStroke) {
             *         javax.swing.KeyStroke keyStroke = (javax.swing.KeyStroke)o;
             *         <do something with the key binding>
             *     }
             * }
             * </code></nf>
             *
             * @param i zero-based index of the key bindings
             * @return a javax.lang.Object which specifies the key binding
             * @exception IllegalArgumentException if the index is
             * out of bounds
             * @see #getAccessibleKeyBindingCount
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
            public int getAccessibleKeyBindingCount() {

            /**
             * Returns the number of key bindings for this object
             *
             * @return the zero-based number of key bindings for this object
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AccessibleKeyBinding getAccessibleKeyBinding() {

        /**
         * Returns key bindings associated with this object
         *
         * @return the key bindings, if supported, of the object;
         * otherwise, null
         * @see AccessibleKeyBinding
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getTitledBorderText() {

        /**
         * Returns the titled border text
         *
         * @return the titled border text, if supported, of the object;
         * otherwise, null
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getToolTipText() {

        /**
         * Returns the tool tip text
         *
         * @return the tool tip text, if supported, of the object;
         * otherwise, null
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        AccessibleExtendedComponent getAccessibleExtendedComponent() {

        /**
         * Returns the AccessibleExtendedComponent
         *
         * @return the AccessibleExtendedComponent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the String portion of the text that is selected
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getSelectionEnd() {

        /**
         * Returns the end offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         *
         * @return the index into the text of the end of the selection
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getSelectionStart() {

        /**
         * Returns the start offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         *
         * @return the index into the text of the start of the selection
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Return the AttributeSet for a given character at a given index
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getBeforeIndex(int part, int index) {

        /**
         * Returns the String before a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         *   or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid index
         *  or part
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getAfterIndex(int part, int index) {

        /**
         * Returns the String after a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid
         *  index or part
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getAtIndex(int part, int index) {

        /**
         * Returns the String at a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence,
         *   null for an invalid index or part
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getCaretPosition() {

        /**
         * Return the zero-based offset of the caret.
         *
         * Note: That to the right of the caret will have the same index
         * value as the offset (the caret is between two characters).
         * @return the zero-based offset of the caret.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getCharCount() {

        /**
         * Return the number of characters (valid indicies)
         *
         * @return the number of characters
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Determine the bounding box of the character at the given
         * index into the string.  The bounds are returned in local
         * coordinates.  If the index is invalid an empty rectangle is
         * returned.
         *
         * Note: the AbstractButton must have a valid size (e.g. have
         * been added to a parent container whose ancestor container
         * is a valid top-level window) for this method to be able
         * to return a meaningful value.
         *
         * @param i the index into the String
         * @return the screen coordinates of the character's the bounding box,
         * if index is invalid returns an empty rectangle.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getIndexAtPoint(Point p) {

        /**
         * Given a point in local coordinates, return the zero-based index
         * of the character under that Point.  If the point is invalid,
         * this method returns -1.
         *
         * Note: the AbstractButton must have a valid size (e.g. have
         * been added to a parent container whose ancestor container
         * is a valid top-level window) for this method to be able
         * to return a meaningful value.
         *
         * @param p the Point in local coordinates
         * @return the zero-based index of the character under Point p; if
         * Point is invalid returns -1.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return An Integer of 1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return an Integer of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return True if the value was set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.
         *
         * @return An Integer of 0 if this isn't selected or an Integer of 1 if
         * this is selected.
         * @see AbstractButton#isSelected
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the the action was performed; else false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.  The
         * default behavior of a button is to have one action - toggle
         * the button.
         *
         * @return 1, the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AccessibleRelationSet getAccessibleRelationSet() {

        /**
         * Get the AccessibleRelationSet associated with this object if one
         * exists.  Otherwise return null.
         * @see AccessibleRelation
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state set of this object.
         *
         * @return an instance of AccessibleState containing the current state
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public AccessibleIcon [] getAccessibleIcon() {

        /**
         * Get the AccessibleIcons associated with this object if one
         * or more exist.  Otherwise return null.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
        public String getAccessibleName() {

        /**
         * Returns the accessible name of this object.
         *
         * @return the localized name of the object -- can be
         *              <code>null</code> if this
         *              object does not have a name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected abstract class AccessibleAbstractButton

    /**
     * This class implements accessibility support for the
     * <code>AbstractButton</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to button and menu item
     * user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
// Accessibility support

///////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>AbstractButton</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     * <P>
     * Overriding <code>paramString</code> to provide information about the
     * specific new aspects of the JFC components.
     *
     * @return  a string representation of this <code>AbstractButton</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean imageUpdate(Image img, int infoflags,
                               int x, int y, int w, int h) {

    /**
     * This is overridden to return false if the current <code>Icon</code>'s
     * <code>Image</code> is not equal to the
     * passed in <code>Image</code> <code>img</code>.
     *
     * @param img  the <code>Image</code> to be compared
     * @param infoflags flags used to repaint the button when the image
     *          is updated and which determine how much is to be painted
     * @param x  the x coordinate
     * @param y  the y coordinate
     * @param w  the width
     * @param h  the height
     * @see     java.awt.image.ImageObserver
     * @see     java.awt.Component#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Object[] getSelectedObjects() {

   /**
     * Returns an array (length 1) containing the label or
     * <code>null</code> if the button is not selected.
     *
     * @return an array containing 1 Object: the text of the button,
     *         if the item is selected; otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the <code>ItemListener</code>s added
     * to this AbstractButton with addItemListener().
     *
     * @return all of the <code>ItemListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void removeItemListener(ItemListener l) {

    /**
     * Removes an <code>ItemListener</code> from the button.
     * @param l the <code>ItemListener</code> to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void addItemListener(ItemListener l) {

    /**
     * Adds an <code>ItemListener</code> to the <code>checkbox</code>.
     * @param l  the <code>ItemListener</code> to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    @Deprecated

    /**
     * Sets the label text.
     *
     * @param label  a <code>String</code> containing the text
     * @deprecated - Replaced by <code>setText(text)</code>
     * @beaninfo
     *        bound: true
     *  description: Replace by setText(text)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    @Deprecated

    /**
     * Returns the label text.
     *
     * @return a <code>String</code> containing the label
     * @deprecated - Replaced by <code>getText</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setEnabled(boolean b) {

    /**
     * Enables (or disables) the button.
     * @param b  true to enable the button, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void fireItemStateChanged(ItemEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>event</code> parameter.
     *
     * @param event  the <code>ItemEvent</code> object
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void fireActionPerformed(ActionEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>event</code>
     * parameter.
     *
     * @param event  the <code>ActionEvent</code> object
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    @SuppressWarnings("serial")

    /**
     * Extends <code>ChangeListener</code> to be serializable.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected ChangeListener createChangeListener() {

    /**
     * Subclasses that want to handle <code>ChangeEvents</code> differently
     * can override this to return another <code>ChangeListener</code>
     * implementation.
     *
     * @return the new <code>ChangeListener</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the <code>ActionListener</code>s added
     * to this AbstractButton with addActionListener().
     *
     * @return all of the <code>ActionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void removeActionListener(ActionListener l) {

    /**
     * Removes an <code>ActionListener</code> from the button.
     * If the listener is the currently set <code>Action</code>
     * for the button, then the <code>Action</code>
     * is set to <code>null</code>.
     *
     * @param l the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void addActionListener(ActionListener l) {

    /**
     * Adds an <code>ActionListener</code> to the button.
     * @param l the <code>ActionListener</code> to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void fireStateChanged() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created.
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this AbstractButton with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a ChangeListener from the button.
     * @param l the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a <code>ChangeListener</code> to the button.
     * @param l the listener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setLayout(LayoutManager mgr) {

    /**
     * Sets the layout manager for this container, refer to
     * {@link java.awt.Container#setLayout(LayoutManager)}
     * for a complete description of this method.
     *
     * @param mgr the specified layout manager
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this container at the specified
     * index, refer to
     * {@link java.awt.Container#addImpl(Component, Object, int)}
     * for a complete description of this method.
     *
     * @param     comp the component to be added
     * @param     constraints an object expressing layout constraints
     *                 for this component
     * @param     index the position in the container's list at which to
     *                 insert the component, where <code>-1</code>
     *                 means append to the end
     * @exception IllegalArgumentException if <code>index</code> is invalid
     * @exception IllegalArgumentException if adding the container's parent
     *                  to itself
     * @exception IllegalArgumentException if adding a window to a container
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look
     * and feel.  Subtypes of <code>AbstractButton</code>
     * should override this to update the UI. For
     * example, <code>JButton</code> might do the following:
     * <pre>
     *      setUI((ButtonUI)UIManager.getUI(
     *          "ButtonUI", "javax.swing.plaf.basic.BasicButtonUI", this));
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setUI(ButtonUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     * @param ui the <code>ButtonUI</code> L&amp;F object
     * @see #getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public ButtonUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     * @return the ButtonUI object
     * @see #setUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setModel(ButtonModel newModel) {

    /**
     * Sets the model that this button represents.
     * @param newModel the new <code>ButtonModel</code>
     * @see #getModel
     * @beaninfo
     *        bound: true
     *  description: Model that the Button uses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public ButtonModel getModel() {

    /**
     * Returns the model that this button represents.
     * @return the <code>model</code> property
     * @see #setModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public long getMultiClickThreshhold() {

    /**
     * Gets the amount of time (in milliseconds) required between
     * mouse press events for the button to generate the corresponding
     * action events.
     *
     * @see #setMultiClickThreshhold
     * @return the amount of time required between mouse press events
     *         to generate corresponding action events
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setMultiClickThreshhold(long threshhold) {

    /**
     * Sets the amount of time (in milliseconds) required between
     * mouse press events for the button to generate the corresponding
     * action events.  After the initial mouse press occurs (and action
     * event generated) any subsequent mouse press events which occur
     * on intervals less than the threshhold will be ignored and no
     * corresponding action event generated.  By default the threshhold is 0,
     * which means that for each mouse press, an action event will be
     * fired, no matter how quickly the mouse clicks occur.  In buttons
     * where this behavior is not desirable (for example, the "OK" button
     * in a dialog), this threshhold should be set to an appropriate
     * positive value.
     *
     * @see #getMultiClickThreshhold
     * @param threshhold the amount of time required between mouse
     *        press events to generate corresponding action events
     * @exception   IllegalArgumentException if threshhold &lt; 0
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    private void updateMnemonicProperties() {

    /**
     * Brings the mnemonic property in accordance with model's mnemonic.
     * This is called when model's mnemonic changes. Also updates the
     * displayedMnemonicIndex property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    private void updateDisplayedMnemonicIndex(String text, int mnemonic) {

    /**
     * Update the displayedMnemonicIndex property. This method
     * is called when either text or mnemonic changes. The new
     * value of the displayedMnemonicIndex property is the index
     * of the first occurrence of mnemonic in text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getDisplayedMnemonicIndex() {

    /**
     * Returns the character, as an index, that the look and feel should
     * provide decoration for as representing the mnemonic character.
     *
     * @since 1.4
     * @return index representing mnemonic character
     * @see #setDisplayedMnemonicIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setDisplayedMnemonicIndex(int index)

    /**
     * Provides a hint to the look and feel as to which character in the
     * text should be decorated to represent the mnemonic. Not all look and
     * feels may support this. A value of -1 indicates either there is no
     * mnemonic, the mnemonic character is not contained in the string, or
     * the developer does not wish the mnemonic to be displayed.
     * <p>
     * The value of this is updated as the properties relating to the
     * mnemonic change (such as the mnemonic itself, the text...).
     * You should only ever have to call this if
     * you do not wish the default character to be underlined. For example, if
     * the text was 'Save As', with a mnemonic of 'a', and you wanted the 'A'
     * to be decorated, as 'Save <u>A</u>s', you would have to invoke
     * <code>setDisplayedMnemonicIndex(5)</code> after invoking
     * <code>setMnemonic(KeyEvent.VK_A)</code>.
     *
     * @since 1.4
     * @param index Index into the String to underline
     * @exception IllegalArgumentException will be thrown if <code>index</code>
     *            is &gt;= length of the text, or &lt; -1
     * @see #getDisplayedMnemonicIndex
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the index into the String to draw the keyboard character
     *               mnemonic at
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setMnemonic(char mnemonic) {

    /**
     * This method is now obsolete, please use <code>setMnemonic(int)</code>
     * to set the mnemonic for a button.  This method is only designed
     * to handle character values which fall between 'a' and 'z' or
     * 'A' and 'Z'.
     *
     * @param mnemonic  a char specifying the mnemonic value
     * @see #setMnemonic(int)
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the keyboard character mnemonic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setMnemonic(int mnemonic) {

    /**
     * Sets the keyboard mnemonic on the current model.
     * The mnemonic is the key which when combined with the look and feel's
     * mouseless modifier (usually Alt) will activate this button
     * if focus is contained somewhere within this button's ancestor
     * window.
     * <p>
     * A mnemonic must correspond to a single key on the keyboard
     * and should be specified using one of the <code>VK_XXX</code>
     * keycodes defined in <code>java.awt.event.KeyEvent</code>.
     * These codes and the wider array of codes for international
     * keyboards may be obtained through
     * <code>java.awt.event.KeyEvent.getExtendedKeyCodeForChar</code>.
     * Mnemonics are case-insensitive, therefore a key event
     * with the corresponding keycode would cause the button to be
     * activated whether or not the Shift modifier was pressed.
     * <p>
     * If the character defined by the mnemonic is found within
     * the button's label string, the first occurrence of it
     * will be underlined to indicate the mnemonic to the user.
     *
     * @param mnemonic the key code which represents the mnemonic
     * @see     java.awt.event.KeyEvent
     * @see     #setDisplayedMnemonicIndex
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the keyboard character mnemonic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getMnemonic() {

    /**
     * Returns the keyboard mnemonic from the the current model.
     * @return the keyboard mnemonic from the model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setRolloverEnabled(boolean b) {

    /**
     * Sets the <code>rolloverEnabled</code> property, which
     * must be <code>true</code> for rollover effects to occur.
     * The default value for the <code>rolloverEnabled</code>
     * property is <code>false</code>.
     * Some look and feels might not implement rollover effects;
     * they will ignore this property.
     *
     * @param b if <code>true</code>, rollover effects should be painted
     * @see #isRolloverEnabled
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether rollover effects should be enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean isRolloverEnabled() {

    /**
     * Gets the <code>rolloverEnabled</code> property.
     *
     * @return the value of the <code>rolloverEnabled</code> property
     * @see #setRolloverEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setContentAreaFilled(boolean b) {

    /**
     * Sets the <code>contentAreaFilled</code> property.
     * If <code>true</code> the button will paint the content
     * area.  If you wish to have a transparent button, such as
     * an icon only button, for example, then you should set
     * this to <code>false</code>. Do not call <code>setOpaque(false)</code>.
     * The default value for the the <code>contentAreaFilled</code>
     * property is <code>true</code>.
     * <p>
     * This function may cause the component's opaque property to change.
     * <p>
     * The exact behavior of calling this function varies on a
     * component-by-component and L&amp;F-by-L&amp;F basis.
     *
     * @param b if true, the content should be filled; if false
     *          the content area is not filled
     * @see #isContentAreaFilled
     * @see #setOpaque
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether the button should paint the content area
     *               or leave it transparent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean isContentAreaFilled() {

    /**
     * Gets the <code>contentAreaFilled</code> property.
     *
     * @return the <code>contentAreaFilled</code> property
     * @see #setContentAreaFilled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setFocusPainted(boolean b) {

    /**
     * Sets the <code>paintFocus</code> property, which must
     * be <code>true</code> for the focus state to be painted.
     * The default value for the <code>paintFocus</code> property
     * is <code>true</code>.
     * Some look and feels might not paint focus state;
     * they will ignore this property.
     *
     * @param b if <code>true</code>, the focus state should be painted
     * @see #isFocusPainted
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether focus should be painted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean isFocusPainted() {

    /**
     * Gets the <code>paintFocus</code> property.
     *
     * @return the <code>paintFocus</code> property
     * @see #setFocusPainted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void paintBorder(Graphics g) {

    /**
     * Paint the button's border if <code>BorderPainted</code>
     * property is true and the button has a border.
     * @param g the <code>Graphics</code> context in which to paint
     *
     * @see #paint
     * @see #setBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setBorderPainted(boolean b) {

    /**
     * Sets the <code>borderPainted</code> property.
     * If <code>true</code> and the button has a border,
     * the border is painted. The default value for the
     * <code>borderPainted</code> property is <code>true</code>.
     * <p>
     * Some look and feels might not support
     * the <code>borderPainted</code> property,
     * in which case they ignore this.
     *
     * @param b if true and border property is not <code>null</code>,
     *          the border is painted
     * @see #isBorderPainted
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether the border should be painted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean isBorderPainted() {

    /**
     * Gets the <code>borderPainted</code> property.
     *
     * @return the value of the <code>borderPainted</code> property
     * @see #setBorderPainted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected PropertyChangeListener createActionPropertyChangeListener(Action a) {

    /**
     * Creates and returns a <code>PropertyChangeListener</code> that is
     * responsible for listening for changes from the specified
     * <code>Action</code> and updating the appropriate properties.
     * <p>
     * <b>Warning:</b> If you subclass this do not create an anonymous
     * inner class.  If you do the lifetime of the button will be tied to
     * that of the <code>Action</code>.
     *
     * @param a the button's action
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    private void setSelectedFromAction(Action a) {

    /**
     * Sets the seleted state of the button from the action.  This is defined
     * here, but not wired up.  Subclasses like JToggleButton and
     * JCheckBoxMenuItem make use of it.
     *
     * @param a the Action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void actionPropertyChanged(Action action, String propertyName) {

    /**
     * Updates the button's state in response to property changes in the
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
     * @param action the <code>Action</code> associated with this button
     * @param propertyName the name of the property that changed
     * @since 1.6
     * @see Action
     * @see #configurePropertiesFromAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    boolean shouldUpdateSelectedStateFromAction() {

    /**
     * Button subclasses that support mirroring the selected state from
     * the action should override this to return true.  AbstractButton's
     * implementation returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected void configurePropertiesFromAction(Action a) {

    /**
     * Sets the properties on this button to match those in the specified
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Action getAction() {

    /**
     * Returns the currently set <code>Action</code> for this
     * <code>ActionEvent</code> source, or <code>null</code>
     * if no <code>Action</code> is set.
     *
     * @return the <code>Action</code> for this <code>ActionEvent</code>
     *          source, or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setAction(Action a) {

    /**
     * Sets the <code>Action</code>.
     * The new <code>Action</code> replaces any previously set
     * <code>Action</code> but does not affect <code>ActionListeners</code>
     * independently added with <code>addActionListener</code>.
     * If the <code>Action</code> is already a registered
     * <code>ActionListener</code> for the button, it is not re-registered.
     * <p>
     * Setting the <code>Action</code> results in immediately changing
     * all the properties described in <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a>.
     * Subsequently, the button's properties are automatically updated
     * as the <code>Action</code>'s properties change.
     * <p>
     * This method uses three other methods to set
     * and help track the <code>Action</code>'s property values.
     * It uses the <code>configurePropertiesFromAction</code> method
     * to immediately change the button's properties.
     * To track changes in the <code>Action</code>'s property values,
     * this method registers the <code>PropertyChangeListener</code>
     * returned by <code>createActionPropertyChangeListener</code>. The
     * default {@code PropertyChangeListener} invokes the
     * {@code actionPropertyChanged} method when a property in the
     * {@code Action} changes.
     *
     * @param a the <code>Action</code> for the <code>AbstractButton</code>,
     *          or <code>null</code>
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public String getActionCommand() {

    /**
     * Returns the action command for this button.
     * @return the action command for this button
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setActionCommand(String actionCommand) {

    /**
     * Sets the action command for this button.
     * @param actionCommand the action command for this button
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void removeNotify() {

    /**
     *{@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected int checkVerticalKey(int key, String exception) {

    /**
     * Verify that the {@code key} argument is a legal value for the
     * vertical properties. Valid values are:
     * <ul>
     *   <li>{@code SwingConstants.CENTER}
     *   <li>{@code SwingConstants.TOP}
     *   <li>{@code SwingConstants.BOTTOM}
     * </ul>
     *
     * @param key the property value to check
     * @param exception the message to use in the
     *        {@code IllegalArgumentException} that is thrown for an invalid
     *        value
     * @return the {@code key} argument
     * @exception IllegalArgumentException if key is not one of the legal
     *            values listed above
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected int checkHorizontalKey(int key, String exception) {

    /**
     * Verify that the {@code key} argument is a legal value for the
     * {@code horizontalAlignment} and {@code horizontalTextPosition}
     * properties. Valid values are:
     * <ul>
     *   <li>{@code SwingConstants.RIGHT}
     *   <li>{@code SwingConstants.LEFT}
     *   <li>{@code SwingConstants.CENTER}
     *   <li>{@code SwingConstants.LEADING}
     *   <li>{@code SwingConstants.TRAILING}
     * </ul>
     *
     * @param key the property value to check
     * @param exception the message to use in the
     *        {@code IllegalArgumentException} that is thrown for an invalid
     *        value
     * @return the {@code key} argument
     * @exception IllegalArgumentException if key is not one of the legal
     *            values listed above
     * @see #setHorizontalTextPosition
     * @see #setHorizontalAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setIconTextGap(int iconTextGap) {

    /**
     * If both the icon and text properties are set, this property
     * defines the space between them.
     * <p>
     * The default value of this property is 4 pixels.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @since 1.4
     * @see #getIconTextGap
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If both the icon and text properties are set, this
     *               property defines the space between them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getIconTextGap() {

    /**
     * Returns the amount of space between the text and the icon
     * displayed in this button.
     *
     * @return an int equal to the number of pixels between the text
     *         and the icon.
     * @since 1.4
     * @see #setIconTextGap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setHorizontalTextPosition(int textPosition) {

    /**
     * Sets the horizontal position of the text relative to the icon.
     * @param textPosition one of the following values:
     * <ul>
     * <li>{@code SwingConstants.RIGHT}
     * <li>{@code SwingConstants.LEFT}
     * <li>{@code SwingConstants.CENTER}
     * <li>{@code SwingConstants.LEADING}
     * <li>{@code SwingConstants.TRAILING} (the default)
     * </ul>
     * @exception IllegalArgumentException if <code>textPosition</code>
     *          is not one of the legal values listed above
     * @beaninfo
     *        bound: true
     *         enum: LEFT     SwingConstants.LEFT
     *               CENTER   SwingConstants.CENTER
     *               RIGHT    SwingConstants.RIGHT
     *               LEADING  SwingConstants.LEADING
     *               TRAILING SwingConstants.TRAILING
     *    attribute: visualUpdate true
     *  description: The horizontal position of the text relative to the icon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getHorizontalTextPosition() {

    /**
     * Returns the horizontal position of the text relative to the icon.
     * @return the <code>horizontalTextPosition</code> property,
     *          one of the following values:
     * <ul>
     * <li>{@code SwingConstants.RIGHT}
     * <li>{@code SwingConstants.LEFT}
     * <li>{@code SwingConstants.CENTER}
     * <li>{@code SwingConstants.LEADING}
     * <li>{@code SwingConstants.TRAILING} (the default)
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setVerticalTextPosition(int textPosition) {

    /**
     * Sets the vertical position of the text relative to the icon.
     * @param textPosition  one of the following values:
     * <ul>
     * <li>{@code SwingConstants.CENTER} (the default)
     * <li>{@code SwingConstants.TOP}
     * <li>{@code SwingConstants.BOTTOM}
     * </ul>
     * @beaninfo
     *        bound: true
     *         enum: TOP    SwingConstants.TOP
     *               CENTER SwingConstants.CENTER
     *               BOTTOM SwingConstants.BOTTOM
     *    attribute: visualUpdate true
     *  description: The vertical position of the text relative to the icon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getVerticalTextPosition() {

    /**
     * Returns the vertical position of the text relative to the icon.
     * @return the <code>verticalTextPosition</code> property,
     *          one of the following values:
     * <ul>
     * <li>{@code SwingConstants.CENTER} (the default)
     * <li>{@code SwingConstants.TOP}
     * <li>{@code SwingConstants.BOTTOM}
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setHorizontalAlignment(int alignment) {

    /**
     * Sets the horizontal alignment of the icon and text.
     * {@code AbstractButton}'s default is {@code SwingConstants.CENTER},
     * but subclasses such as {@code JCheckBox} may use a different default.
     *
     * @param alignment the alignment value, one of the following values:
     * <ul>
     *   <li>{@code SwingConstants.RIGHT}
     *   <li>{@code SwingConstants.LEFT}
     *   <li>{@code SwingConstants.CENTER}
     *   <li>{@code SwingConstants.LEADING}
     *   <li>{@code SwingConstants.TRAILING}
     * </ul>
     * @throws IllegalArgumentException if the alignment is not one of the
     *         valid values
     * @beaninfo
     *        bound: true
     *         enum: LEFT     SwingConstants.LEFT
     *               CENTER   SwingConstants.CENTER
     *               RIGHT    SwingConstants.RIGHT
     *               LEADING  SwingConstants.LEADING
     *               TRAILING SwingConstants.TRAILING
     *    attribute: visualUpdate true
     *  description: The horizontal alignment of the icon and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getHorizontalAlignment() {

    /**
     * Returns the horizontal alignment of the icon and text.
     * {@code AbstractButton}'s default is {@code SwingConstants.CENTER},
     * but subclasses such as {@code JCheckBox} may use a different default.
     *
     * @return the <code>horizontalAlignment</code> property,
     *             one of the following values:
     * <ul>
     *   <li>{@code SwingConstants.RIGHT}
     *   <li>{@code SwingConstants.LEFT}
     *   <li>{@code SwingConstants.CENTER}
     *   <li>{@code SwingConstants.LEADING}
     *   <li>{@code SwingConstants.TRAILING}
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setVerticalAlignment(int alignment) {

    /**
     * Sets the vertical alignment of the icon and text.
     * @param alignment one of the following values:
     * <ul>
     * <li>{@code SwingConstants.CENTER} (the default)
     * <li>{@code SwingConstants.TOP}
     * <li>{@code SwingConstants.BOTTOM}
     * </ul>
     * @throws IllegalArgumentException if the alignment is not one of the legal
     *         values listed above
     * @beaninfo
     *        bound: true
     *         enum: TOP    SwingConstants.TOP
     *               CENTER SwingConstants.CENTER
     *               BOTTOM  SwingConstants.BOTTOM
     *    attribute: visualUpdate true
     *  description: The vertical alignment of the icon and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public int getVerticalAlignment() {

    /**
     * Returns the vertical alignment of the text and icon.
     *
     * @return the <code>verticalAlignment</code> property, one of the
     *          following values:
     * <ul>
     * <li>{@code SwingConstants.CENTER} (the default)
     * <li>{@code SwingConstants.TOP}
     * <li>{@code SwingConstants.BOTTOM}
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setDisabledSelectedIcon(Icon disabledSelectedIcon) {

    /**
     * Sets the disabled selection icon for the button.
     * @param disabledSelectedIcon the icon used as the disabled
     *          selection image
     * @see #getDisabledSelectedIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The disabled selection icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getDisabledSelectedIcon() {

    /**
     * Returns the icon used by the button when it's disabled and selected.
     * If no disabled selection icon has been set, this will forward
     * the call to the LookAndFeel to construct an appropriate disabled
     * Icon from the selection icon if it has been set and to
     * <code>getDisabledIcon()</code> otherwise.
     * <p>
     * Some look and feels might not render the disabled selected Icon, in
     * which case they will ignore this.
     *
     * @return the <code>disabledSelectedIcon</code> property
     * @see #getDisabledIcon
     * @see #setDisabledSelectedIcon
     * @see javax.swing.LookAndFeel#getDisabledSelectedIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setDisabledIcon(Icon disabledIcon) {

    /**
     * Sets the disabled icon for the button.
     * @param disabledIcon the icon used as the disabled image
     * @see #getDisabledIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The disabled icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    @Transient

    /**
     * Returns the icon used by the button when it's disabled.
     * If no disabled icon has been set this will forward the call to
     * the look and feel to construct an appropriate disabled Icon.
     * <p>
     * Some look and feels might not render the disabled Icon, in which
     * case they will ignore this.
     *
     * @return the <code>disabledIcon</code> property
     * @see #getPressedIcon
     * @see #setDisabledIcon
     * @see javax.swing.LookAndFeel#getDisabledIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setRolloverSelectedIcon(Icon rolloverSelectedIcon) {

    /**
     * Sets the rollover selected icon for the button.
     * @param rolloverSelectedIcon the icon used as the
     *          "selected rollover" image
     * @see #getRolloverSelectedIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The rollover selected icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getRolloverSelectedIcon() {

    /**
     * Returns the rollover selection icon for the button.
     * @return the <code>rolloverSelectedIcon</code> property
     * @see #setRolloverSelectedIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setRolloverIcon(Icon rolloverIcon) {

    /**
     * Sets the rollover icon for the button.
     * @param rolloverIcon the icon used as the "rollover" image
     * @see #getRolloverIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The rollover icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getRolloverIcon() {

    /**
     * Returns the rollover icon for the button.
     * @return the <code>rolloverIcon</code> property
     * @see #setRolloverIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setSelectedIcon(Icon selectedIcon) {

    /**
     * Sets the selected icon for the button.
     * @param selectedIcon the icon used as the "selected" image
     * @see #getSelectedIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The selected icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getSelectedIcon() {

    /**
     * Returns the selected icon for the button.
     * @return the <code>selectedIcon</code> property
     * @see #setSelectedIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setPressedIcon(Icon pressedIcon) {

    /**
     * Sets the pressed icon for the button.
     * @param pressedIcon the icon used as the "pressed" image
     * @see #getPressedIcon
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The pressed icon for the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getPressedIcon() {

    /**
     * Returns the pressed icon for the button.
     * @return the <code>pressedIcon</code> property
     * @see #setPressedIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setIcon(Icon defaultIcon) {

    /**
     * Sets the button's default icon. This icon is
     * also used as the "pressed" and "disabled" icon if
     * there is no explicitly set pressed icon.
     *
     * @param defaultIcon the icon used as the default image
     * @see #getIcon
     * @see #setPressedIcon
     * @beaninfo
     *           bound: true
     *       attribute: visualUpdate true
     *     description: The button's default icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Icon getIcon() {

    /**
     * Returns the default icon.
     * @return the default <code>Icon</code>
     * @see #setIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public Insets getMargin() {

    /**
     * Returns the margin between the button's border and
     * the label.
     *
     * @return an <code>Insets</code> object specifying the margin
     *          between the botton's border and the label
     * @see #setMargin
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setMargin(Insets m) {

    /**
     * Sets space for margin between the button's border and
     * the label. Setting to <code>null</code> will cause the button to
     * use the default margin.  The button's default <code>Border</code>
     * object will use this value to create the proper margin.
     * However, if a non-default border is set on the button,
     * it is that <code>Border</code> object's responsibility to create the
     * appropriate margin space (else this property will
     * effectively be ignored).
     *
     * @param m the space between the border and the label
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The space between the button's border and the label.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void doClick(int pressTime) {

    /**
     * Programmatically perform a "click". This does the same
     * thing as if the user had pressed and released the button.
     * The button stays visually "pressed" for <code>pressTime</code>
     *  milliseconds.
     *
     * @param pressTime the time to "hold down" the button, in milliseconds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void doClick() {

    /**
     * Programmatically perform a "click". This does the same
     * thing as if the user had pressed and released the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setSelected(boolean b) {

    /**
     * Sets the state of the button. Note that this method does not
     * trigger an <code>actionEvent</code>.
     * Call <code>doClick</code> to perform a programmatic action change.
     *
     * @param b  true if the button is selected, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean isSelected() {

    /**
     * Returns the state of the button. True if the
     * toggle button is selected, false if it's not.
     * @return true if the toggle button is selected, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setText(String text) {

    /**
     * Sets the button's text.
     * @param text the string used to set the text
     * @see #getText
     * @beaninfo
     *        bound: true
     *    preferred: true
     *    attribute: visualUpdate true
     *  description: The button's text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public String getText() {

    /**
     * Returns the button's text.
     * @return the buttons text
     * @see #setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public boolean getHideActionText() {

    /**
     * Returns the value of the <code>hideActionText</code> property, which
     * determines whether the button displays text from the
     * <code>Action</code>.  This is useful only if an <code>Action</code>
     * has been installed on the button.
     *
     * @return <code>true</code> if the button's <code>text</code>
     *         property should not reflect that of the
     *         <code>Action</code>; the default is <code>false</code>
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public void setHideActionText(boolean hideActionText) {

    /**
     * Sets the <code>hideActionText</code> property, which determines
     * whether the button displays text from the <code>Action</code>.
     * This is useful only if an <code>Action</code> has been
     * installed on the button.
     *
     * @param hideActionText <code>true</code> if the button's
     *                       <code>text</code> property should not reflect
     *                       that of the <code>Action</code>; the default is
     *                       <code>false</code>
     * @see <a href="Action.html#buttonActions">Swing Components Supporting
     *      <code>Action</code></a>
     * @since 1.6
     * @beaninfo
     *        bound: true
     *    expert: true
     *  description: Whether the text of the button should come from
     *               the <code>Action</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected transient ChangeEvent changeEvent;

    /**
     * Only one <code>ChangeEvent</code> is needed per button
     * instance since the
     * event's only state is the source property.  The source of events
     * generated is always "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected ItemListener itemListener = null;

    /**
     * The button model's <code>ItemListener</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected ChangeListener changeListener = null;

    /**
     * The button model's <code>changeListener</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    private Handler handler;

    /**
     * Combined listeners: ActionListener, ChangeListener, ItemListener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    protected ButtonModel model                = null;

    /** The data model that determines the button's state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String DISABLED_ICON_CHANGED_PROPERTY = "disabledIcon";

    /**
     * Identifies a change to the icon used when the button has
     * been disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String ROLLOVER_ICON_CHANGED_PROPERTY = "rolloverIcon";

    /**
     * Identifies a change to the icon used when the cursor is over
     * the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String PRESSED_ICON_CHANGED_PROPERTY = "pressedIcon";

    /**
     * Identifies a change to the icon used when the button has been
     * pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String ICON_CHANGED_PROPERTY = "icon";

    /** Identifies a change to the icon that represents the button. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String ROLLOVER_ENABLED_CHANGED_PROPERTY = "rolloverEnabled";

    /**
     * Identifies a change from rollover enabled to disabled or back
     * to enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String BORDER_PAINTED_CHANGED_PROPERTY = "borderPainted";

    /**
     * Identifies a change to having the border drawn,
     * or having it not drawn.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String VERTICAL_TEXT_POSITION_CHANGED_PROPERTY = "verticalTextPosition";

    /** Identifies a change in the button's vertical text position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY = "horizontalAlignment";

    /** Identifies a change in the button's horizontal alignment. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String MARGIN_CHANGED_PROPERTY = "margin";

    /** Identifies a change in the button's margins. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String MNEMONIC_CHANGED_PROPERTY = "mnemonic";

    /** Identifies a change to the button's mnemonic. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
    public static final String MODEL_CHANGED_PROPERTY = "model";

    /** Identifies a change in the button model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractButton.java
public abstract class AbstractButton extends JComponent implements ItemSelectable, SwingConstants {

/**
 * Defines common behaviors for buttons and menu items.
 * <p>
 * Buttons can be configured, and to some degree controlled, by
 * <code><a href="Action.html">Action</a></code>s.  Using an
 * <code>Action</code> with a button has many benefits beyond directly
 * configuring a button.  Refer to <a href="Action.html#buttonActions">
 * Swing Components Supporting <code>Action</code></a> for more
 * details, and you can find more information in <a
 * href="https://docs.oracle.com/javase/tutorial/uiswing/misc/action.html">How
 * to Use Actions</a>, a section in <em>The Java Tutorial</em>.
 * <p>
 * For further information see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/button.html">How to Use Buttons, Check Boxes, and Radio Buttons</a>,
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
