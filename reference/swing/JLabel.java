_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
            public int getAccessibleKeyBindingCount() {

            /**
             * Returns the number of key bindings for this object
             *
             * @return the zero-based number of key bindings for this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public String getTitledBorderText() {

        /**
         * Returns the titled border text
         *
         * @return the titled border text, if supported, of the object;
         * otherwise, null
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public String getToolTipText() {

        /**
         * Returns the tool tip text
         *
         * @return the tool tip text, if supported, of the object;
         * otherwise, null
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        AccessibleExtendedComponent getAccessibleExtendedComponent() {

        /**
         * Returns the AccessibleExtendedComponent
         *
         * @return the AccessibleExtendedComponent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the String portion of the text that is selected
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Return the AttributeSet for a given character at a given index
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public int getCharCount() {

        /**
         * Return the number of characters (valid indicies)
         *
         * @return the number of characters
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Returns the bounding box of the character at the given
         * index in the string.  The bounds are returned in local
         * coordinates. If the index is invalid, <code>null</code> is returned.
         *
         * @param i the index into the String
         * @return the screen coordinates of the character's bounding box.
         * If the index is invalid, <code>null</code> is returned.
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public int getIndexAtPoint(Point p) {

        /**
         * Given a point in local coordinates, return the zero-based index
         * of the character under that Point.  If the point is invalid,
         * this method returns -1.
         *
         * @param p the Point in local coordinates
         * @return the zero-based index of the character under Point p; if
         * Point is invalid returns -1.
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public AccessibleRelationSet getAccessibleRelationSet() {

        /**
         * Get the AccessibleRelationSet associated with this object if one
         * exists.  Otherwise return null.
         * @see AccessibleRelation
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public AccessibleIcon [] getAccessibleIcon() {

        /**
         * Get the AccessibleIcons associated with this object if one
         * or more exist.  Otherwise return null.
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be null if this
         * object does not have a name
         * @see AccessibleContext#setAccessibleName
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    @SuppressWarnings("serial")

    /**
     * The class used to obtain the accessible role for this object.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Get the AccessibleContext of this object
     *
     * @return the AccessibleContext of this object
     * @beaninfo
     *       expert: true
     *  description: The AccessibleContext associated with this Label.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setLabelFor(Component c) {

    /**
     * Set the component this is labelling.  Can be null if this does not
     * label a Component.  If the displayedMnemonic property is set
     * and the labelFor property is also set, the label will
     * call the requestFocus method of the component specified by the
     * labelFor property when the mnemonic is activated.
     *
     * @param c  the Component this label is for, or null if the label is
     *           not the label for a component
     *
     * @see #getDisplayedMnemonic
     * @see #setDisplayedMnemonic
     *
     * @beaninfo
     *        bound: true
     *  description: The component this is labelling.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    /**

    /**
     * --- Accessibility Support ---
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    protected String paramString() {

    /**
     * Returns a string representation of this JLabel. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this JLabel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public boolean imageUpdate(Image img, int infoflags,
                               int x, int y, int w, int h) {

    /**
     * This is overridden to return false if the current Icon's Image is
     * not equal to the passed in Image <code>img</code>.
     *
     * @see     java.awt.image.ImageObserver
     * @see     java.awt.Component#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setHorizontalTextPosition(int textPosition) {

    /**
     * Sets the horizontal position of the label's text,
     * relative to its image.
     *
     * @param textPosition  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code>, or
     *           <code>TRAILING</code> (the default).
     * @exception IllegalArgumentException
     *
     * @see SwingConstants
     * @beaninfo
     *       expert: true
     *        bound: true
     *         enum: LEFT     SwingConstants.LEFT
     *               CENTER   SwingConstants.CENTER
     *               RIGHT    SwingConstants.RIGHT
     *               LEADING  SwingConstants.LEADING
     *               TRAILING SwingConstants.TRAILING
     *    attribute: visualUpdate true
     *  description: The horizontal position of the label's text,
     *               relative to its image.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getHorizontalTextPosition() {

    /**
     * Returns the horizontal position of the label's text,
     * relative to its image.
     *
     * @return   One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> or
     *           <code>TRAILING</code>.
     *
     * @see SwingConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setVerticalTextPosition(int textPosition) {

    /**
     * Sets the vertical position of the label's text,
     * relative to its image.
     * <p>
     * The default value of this property is CENTER.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @param textPosition  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>TOP</code>,
     *           <code>CENTER</code> (the default), or
     *           <code>BOTTOM</code>.
     *
     * @see SwingConstants
     * @see #getVerticalTextPosition
     * @beaninfo
     *        bound: true
     *         enum: TOP    SwingConstants.TOP
     *               CENTER SwingConstants.CENTER
     *               BOTTOM SwingConstants.BOTTOM
     *       expert: true
     *    attribute: visualUpdate true
     *  description: The vertical position of the text relative to it's image.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getVerticalTextPosition() {

    /**
     * Returns the vertical position of the label's text,
     * relative to its image.
     *
     * @return   One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>TOP</code>,
     *           <code>CENTER</code>, or
     *           <code>BOTTOM</code>.
     *
     * @see #setVerticalTextPosition
     * @see SwingConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setHorizontalAlignment(int alignment) {

    /**
     * Sets the alignment of the label's contents along the X axis.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @param alignment  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code> (the default for image-only labels),
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> (the default for text-only labels) or
     *           <code>TRAILING</code>.
     *
     * @see SwingConstants
     * @see #getHorizontalAlignment
     * @beaninfo
     *        bound: true
     *         enum: LEFT     SwingConstants.LEFT
     *               CENTER   SwingConstants.CENTER
     *               RIGHT    SwingConstants.RIGHT
     *               LEADING  SwingConstants.LEADING
     *               TRAILING SwingConstants.TRAILING
     *    attribute: visualUpdate true
     *  description: The alignment of the label's content along the X axis.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getHorizontalAlignment() {

    /**
     * Returns the alignment of the label's contents along the X axis.
     *
     * @return   The value of the horizontalAlignment property, one of the
     *           following constants defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> or
     *           <code>TRAILING</code>.
     *
     * @see #setHorizontalAlignment
     * @see SwingConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setVerticalAlignment(int alignment) {

    /**
     * Sets the alignment of the label's contents along the Y axis.
     * <p>
     * The default value of this property is CENTER.
     *
     * @param alignment One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>TOP</code>,
     *           <code>CENTER</code> (the default), or
     *           <code>BOTTOM</code>.
     *
     * @see SwingConstants
     * @see #getVerticalAlignment
     * @beaninfo
     *        bound: true
     *         enum: TOP    SwingConstants.TOP
     *               CENTER SwingConstants.CENTER
     *               BOTTOM SwingConstants.BOTTOM
     *    attribute: visualUpdate true
     *  description: The alignment of the label's contents along the Y axis.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getVerticalAlignment() {

    /**
     * Returns the alignment of the label's contents along the Y axis.
     *
     * @return   The value of the verticalAlignment property, one of the
     *           following constants defined in <code>SwingConstants</code>:
     *           <code>TOP</code>,
     *           <code>CENTER</code>, or
     *           <code>BOTTOM</code>.
     *
     * @see SwingConstants
     * @see #setVerticalAlignment
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setIconTextGap(int iconTextGap) {

    /**
     * If both the icon and text properties are set, this property
     * defines the space between them.
     * <p>
     * The default value of this property is 4 pixels.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @see #getIconTextGap
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If both the icon and text properties are set, this
     *               property defines the space between them.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getIconTextGap() {

    /**
     * Returns the amount of space between the text and the icon
     * displayed in this label.
     *
     * @return an int equal to the number of pixels between the text
     *         and the icon.
     * @see #setIconTextGap
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    protected int checkVerticalKey(int key, String message) {

    /**
     * Verify that key is a legal value for the
     * verticalAlignment or verticalTextPosition properties.
     *
     * @param key the property value to check
     * @param message the IllegalArgumentException detail message
     * @exception IllegalArgumentException if key isn't TOP, CENTER, or BOTTOM.
     * @see #setVerticalAlignment
     * @see #setVerticalTextPosition
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    protected int checkHorizontalKey(int key, String message) {

    /**
     * Verify that key is a legal value for the horizontalAlignment properties.
     *
     * @param key the property value to check
     * @param message the IllegalArgumentException detail message
     * @exception IllegalArgumentException if key isn't LEFT, CENTER, RIGHT,
     * LEADING or TRAILING.
     * @see #setHorizontalTextPosition
     * @see #setHorizontalAlignment
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
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
     * <code>setDisplayedMnemonic(KeyEvent.VK_A)</code>.
     *
     * @since 1.4
     * @param index Index into the String to underline
     * @exception IllegalArgumentException will be thrown if <code>index</code>
     *            is &gt;= length of the text, or &lt; -1
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the index into the String to draw the keyboard character
     *               mnemonic at
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public int getDisplayedMnemonic() {

    /**
     * Return the keycode that indicates a mnemonic key.
     * This property is used when the label is part of a larger component.
     * If the labelFor property of the label is not null, the label will
     * call the requestFocus method of the component specified by the
     * labelFor property when the mnemonic is activated.
     *
     * @return int value for the mnemonic key
     *
     * @see #getLabelFor
     * @see #setLabelFor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setDisplayedMnemonic(char aChar) {

    /**
     * Specifies the displayedMnemonic as a char value.
     *
     * @param aChar  a char specifying the mnemonic to display
     * @see #setDisplayedMnemonic(int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setDisplayedMnemonic(int key) {

    /**
     * Specify a keycode that indicates a mnemonic key.
     * This property is used when the label is part of a larger component.
     * If the labelFor property of the label is not null, the label will
     * call the requestFocus method of the component specified by the
     * labelFor property when the mnemonic is activated.
     *
     * @see #getLabelFor
     * @see #setLabelFor
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The mnemonic keycode.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setDisabledIcon(Icon disabledIcon) {

    /**
     * Set the icon to be displayed if this JLabel is "disabled"
     * (JLabel.setEnabled(false)).
     * <p>
     * The default value of this property is null.
     *
     * @param disabledIcon the Icon to display when the component is disabled
     * @see #getDisabledIcon
     * @see #setEnabled
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The icon to display if the label is disabled.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    @Transient

    /**
     * Returns the icon used by the label when it's disabled.
     * If no disabled icon has been set this will forward the call to
     * the look and feel to construct an appropriate disabled Icon.
     * <p>
     * Some look and feels might not render the disabled Icon, in which
     * case they will ignore this.
     *
     * @return the <code>disabledIcon</code> property
     * @see #setDisabledIcon
     * @see javax.swing.LookAndFeel#getDisabledIcon
     * @see ImageIcon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setIcon(Icon icon) {

    /**
     * Defines the icon this component will display.  If
     * the value of icon is null, nothing is displayed.
     * <p>
     * The default value of this property is null.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @see #setVerticalTextPosition
     * @see #setHorizontalTextPosition
     * @see #getIcon
     * @beaninfo
     *    preferred: true
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The icon this component will display.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public Icon getIcon() {

    /**
     * Returns the graphic image (glyph, icon) that the label displays.
     *
     * @return an Icon
     * @see #setIcon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setText(String text) {

    /**
     * Defines the single line of text this component will display.  If
     * the value of text is null or empty string, nothing is displayed.
     * <p>
     * The default value of this property is null.
     * <p>
     * This is a JavaBeans bound property.
     *
     * @see #setVerticalTextPosition
     * @see #setHorizontalTextPosition
     * @see #setIcon
     * @beaninfo
     *    preferred: true
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Defines the single line of text this component will display.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public String getText() {

    /**
     * Returns the text string that the label displays.
     *
     * @return a String
     * @see #setText
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the l&amp;f class
     * that renders this component.
     *
     * @return String "LabelUI"
     *
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public void setUI(LabelUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the LabelUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public LabelUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return LabelUI object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel() {

    /**
     * Creates a <code>JLabel</code> instance with
     * no image and with an empty string for the title.
     * The label is centered vertically
     * in its display area.
     * The label's contents, once set, will be displayed on the leading edge
     * of the label's display area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel(Icon image) {

    /**
     * Creates a <code>JLabel</code> instance with the specified image.
     * The label is centered vertically and horizontally
     * in its display area.
     *
     * @param image  The image to be displayed by the label.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel(Icon image, int horizontalAlignment) {

    /**
     * Creates a <code>JLabel</code> instance with the specified
     * image and horizontal alignment.
     * The label is centered vertically in its display area.
     *
     * @param image  The image to be displayed by the label.
     * @param horizontalAlignment  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> or
     *           <code>TRAILING</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel(String text) {

    /**
     * Creates a <code>JLabel</code> instance with the specified text.
     * The label is aligned against the leading edge of its display area,
     * and centered vertically.
     *
     * @param text  The text to be displayed by the label.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel(String text, int horizontalAlignment) {

    /**
     * Creates a <code>JLabel</code> instance with the specified
     * text and horizontal alignment.
     * The label is centered vertically in its display area.
     *
     * @param text  The text to be displayed by the label.
     * @param horizontalAlignment  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> or
     *           <code>TRAILING</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    public JLabel(String text, Icon icon, int horizontalAlignment) {

    /**
     * Creates a <code>JLabel</code> instance with the specified
     * text, image, and horizontal alignment.
     * The label is centered vertically in its display area.
     * The text is on the trailing edge of the image.
     *
     * @param text  The text to be displayed by the label.
     * @param icon  The image to be displayed by the label.
     * @param horizontalAlignment  One of the following constants
     *           defined in <code>SwingConstants</code>:
     *           <code>LEFT</code>,
     *           <code>CENTER</code>,
     *           <code>RIGHT</code>,
     *           <code>LEADING</code> or
     *           <code>TRAILING</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    static final String LABELED_BY_PROPERTY = "labeledBy";

    /**
     * Client property key used to determine what label is labeling the
     * component.  This is generally not used by labels, but is instead
     * used by components such as text areas that are being labeled by
     * labels.  When the labelFor property of a label is set, it will
     * automatically set the LABELED_BY_PROPERTY of the component being
     * labelled.
     *
     * @see #setLabelFor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
    private static final String uiClassID = "LabelUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JLabel.java
@SuppressWarnings("serial")

/**
 * A display area for a short text string or an image,
 * or both.
 * A label does not react to input events.
 * As a result, it cannot get the keyboard focus.
 * A label can, however, display a keyboard alternative
 * as a convenience for a nearby component
 * that has a keyboard alternative but can't display it.
 * <p>
 * A <code>JLabel</code> object can display
 * either text, an image, or both.
 * You can specify where in the label's display area
 * the label's contents are aligned
 * by setting the vertical and horizontal alignment.
 * By default, labels are vertically centered
 * in their display area.
 * Text-only labels are leading edge aligned, by default;
 * image-only labels are horizontally centered, by default.
 * <p>
 * You can also specify the position of the text
 * relative to the image.
 * By default, text is on the trailing edge of the image,
 * with the text and image vertically aligned.
 * <p>
 * A label's leading and trailing edge are determined from the value of its
 * {@link java.awt.ComponentOrientation} property.  At present, the default
 * ComponentOrientation setting maps the leading edge to left and the trailing
 * edge to right.
 *
 * <p>
 * Finally, you can use the <code>setIconTextGap</code> method
 * to specify how many pixels
 * should appear between the text and the image.
 * The default is 4 pixels.
 * <p>
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/label.html">How to Use Labels</a>
 * in <em>The Java Tutorial</em>
 * for further documentation.
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
 * @beaninfo
 *   attribute: isContainer false
 * description: A component that displays a short string and an icon.
 *
 * @author Hans Muller
 */
