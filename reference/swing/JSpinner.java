_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void setAttributes(int startIndex, int endIndex, AttributeSet as) {

        /**
         * Sets attributes for the text between two indices.
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         * @param as the attribute set
         * @see AttributeSet
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void selectText(int startIndex, int endIndex) {

        /**
         * Selects the text between two indices.
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void replaceText(int startIndex, int endIndex, String s) {

        /**
         * Replaces the text between two indices with the specified
         * string.
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         * @param s the string to replace the text between two indices
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void paste(int startIndex) {

        /**
         * Pastes the text from the system clipboard into the text
         * starting at the specified index.
         *
         * @param startIndex the starting index in the text
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void cut(int startIndex, int endIndex) {

        /**
         * Cuts the text between two indices into the system clipboard.
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void delete(int startIndex, int endIndex) {

        /**
         * Deletes the text between two indices
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getTextRange(int startIndex, int endIndex) {

        /**
         * Returns the text string between two indices.
         *
         * @param startIndex the starting index in the text
         * @param endIndex the ending index in the text
         * @return the text string between the indices
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void insertTextAtIndex(int index, String s) {

        /**
         * Inserts the specified string at the given index/
         *
         * @param index the index in the text where the string will
         * be inserted
         * @param s the string to insert in the text
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void setTextContents(String s) {

        /**
         * Sets the text contents to the specified string.
         *
         * @param s the string to set the text contents
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the String portion of the text that is selected
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getSelectionEnd() {

        /**
         * Returns the end offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         *
         * @return the index into the text of the end of the selection
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getSelectionStart() {

        /**
         * Returns the start offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         *
         * @return the index into the text of the start of the selection
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Returns the AttributeSet for a given character at a given index
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getBeforeIndex(int part, int index) {

        /**
         * Returns the String before a given index.
         *
         * @param part the CHARACTER, WORD, or SENTENCE to retrieve
         * @param index an index within the text
         * @return the letter, word, or sentence
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getAfterIndex(int part, int index) {

        /**
         * Returns the String after a given index.
         *
         * @param part the CHARACTER, WORD, or SENTENCE to retrieve
         * @param index an index within the text
         * @return the letter, word, or sentence
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getAtIndex(int part, int index) {

        /**
         * Returns the String at a given index.
         *
         * @param part the CHARACTER, WORD, or SENTENCE to retrieve
         * @param index an index within the text
         * @return the letter, word, or sentence
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getCaretPosition() {

        /**
         * Returns the zero-based offset of the caret.
         *
         * Note: That to the right of the caret will have the same index
         * value as the offset (the caret is between two characters).
         * @return the zero-based offset of the caret.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getCharCount() {

        /**
         * Returns the number of characters (valid indicies)
         *
         * @return the number of characters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Determines the bounding box of the character at the given
         * index into the string.  The bounds are returned in local
         * coordinates.  If the index is invalid an empty rectangle is
         * returned.
         *
         * @param i the index into the String
         * @return the screen coordinates of the character's bounding box,
         * if index is invalid return an empty rectangle.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getIndexAtPoint(Point p) {

        /**
         * Given a point in local coordinates, return the zero-based index
         * of the character under that Point.  If the point is invalid,
         * this method returns -1.
         *
         * @param p the Point in local coordinates
         * @return the zero-based index of the character under Point p; if
         * Point is invalid return -1.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public boolean doAccessibleAction(int i) {

        /**
         * Performs the specified Action on the object
         *
         * @param i zero-based index of actions. The first action
         * (index 0) is AccessibleAction.INCREMENT and the second
         * action (index 1) is AccessibleAction.DECREMENT.
         * @return true if the action was performed; otherwise false.
         * @see #getAccessibleActionCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Returns a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         * @return a String description of the action
         * @see #getAccessibleActionCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of accessible actions available in this object
         * If there are more than one, the first one is considered the "default"
         * action of the object.
         *
         * Two actions are supported: AccessibleAction.INCREMENT which
         * increments the spinner value and AccessibleAction.DECREMENT
         * which decrements the spinner value
         *
         * @return the zero-based number of Actions in this object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return Maximum value of the object; null if this object does not
         * have a maximum value
         * @see #getMinimumAccessibleValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return Minimum value of the object; null if this object does not
         * have a minimum value
         * @see #getMaximumAccessibleValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @param n the value to set for this object
         * @return true if the value was set; else False
         * @see #getCurrentAccessibleValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.  If the value has not been
         * set, the return value will be null.
         *
         * @return value of the object
         * @see #setCurrentAccessibleValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Gets the AccessibleValue associated with this object.
         *
         * @return AccessibleValue if supported by object; else return null
         * @see AccessibleValue
         *
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public AccessibleText getAccessibleText() {

        /**
         * Gets the AccessibleText associated with this object presenting
         * text on the display.
         *
         * @return AccessibleText if supported by object; else return null
         * @see AccessibleText
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Gets the AccessibleAction associated with this object that supports
         * one or more actions.
         *
         * @return AccessibleAction if supported by object; else return null
         * @see AccessibleAction
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children of the object.
         *
         * @return the number of accessible children of the object.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void stateChanged(ChangeEvent e) {

        /**
         * Invoked when the target of the listener has changed its state.
         *
         * @param e  a <code>ChangeEvent</code> object. Must not be null.
         * @throws NullPointerException if the parameter is null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        protected AccessibleJSpinner() {

        /**
         * AccessibleJSpinner constructor
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    protected class AccessibleJSpinner extends AccessibleJComponent

    /**
     * <code>AccessibleJSpinner</code> implements accessibility
     * support for the <code>JSpinner</code> class.
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    /**

    ////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    // Accessibility support

    /////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    private static class DisabledAction implements Action {

    /**
     * An Action implementation that is always disabled.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        private class ListFormatter extends

        /**
         * ListFormatter provides completion while text is being input
         * into the JFormattedTextField. Completion is only done if the
         * user is inserting text at the end of the document. Completion
         * is done by way of the SpinnerListModel method findNextMatch.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public SpinnerListModel getModel() {

        /**
         * Return our spinner ancestor's <code>SpinnerNumberModel</code>.
         *
         * @return <code>getSpinner().getModel()</code>
         * @see #getSpinner
         * @see #getTextField
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public ListEditor(JSpinner spinner) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerListModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>ListEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerListModel</code>
         *
         * @see #getModel
         * @see SpinnerListModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public static class ListEditor extends DefaultEditor

    /**
     * An editor for a <code>JSpinner</code> whose model is a
     * <code>SpinnerListModel</code>.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public SpinnerNumberModel getModel() {

        /**
         * Return our spinner ancestor's <code>SpinnerNumberModel</code>.
         *
         * @return <code>getSpinner().getModel()</code>
         * @see #getSpinner
         * @see #getTextField
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public DecimalFormat getFormat() {

        /**
         * Returns the <code>java.text.DecimalFormat</code> object the
         * <code>JFormattedTextField</code> uses to parse and format
         * numbers.
         *
         * @return the value of <code>getTextField().getFormatter().getFormat()</code>.
         * @see #getTextField
         * @see java.text.DecimalFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        private NumberEditor(JSpinner spinner, DecimalFormat format) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerNumberModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>NumberEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @param decimalFormatPattern the initial pattern for the
         *     <code>DecimalFormat</code> object that's used to display
         *     and parse the value of the text field.
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerNumberModel</code>
         *
         * @see #getTextField
         * @see SpinnerNumberModel
         * @see java.text.DecimalFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public NumberEditor(JSpinner spinner, String decimalFormatPattern) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerNumberModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>NumberEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @param decimalFormatPattern the initial pattern for the
         *     <code>DecimalFormat</code> object that's used to display
         *     and parse the value of the text field.
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerNumberModel</code> or if
         *     <code>decimalFormatPattern</code> is not a legal
         *     argument to <code>DecimalFormat</code>
         *
         * @see #getTextField
         * @see SpinnerNumberModel
         * @see java.text.DecimalFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public NumberEditor(JSpinner spinner) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerNumberModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>NumberEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerNumberModel</code>
         *
         * @see #getModel
         * @see #getFormat
         * @see SpinnerNumberModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    // PENDING(hmuller): more example javadoc

    /**
     * An editor for a <code>JSpinner</code> whose model is a
     * <code>SpinnerNumberModel</code>.  The value of the editor is
     * displayed with a <code>JFormattedTextField</code> whose format
     * is defined by a <code>NumberFormatter</code> instance whose
     * <code>minimum</code> and <code>maximum</code> properties
     * are mapped to the <code>SpinnerNumberModel</code>.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    private static class NumberEditorFormatter extends NumberFormatter {

    /**
     * This subclass of javax.swing.NumberFormatter maps the minimum/maximum
     * properties to a SpinnerNumberModel and initializes the valueClass
     * of the NumberFormatter to match the type of the initial models value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public SpinnerDateModel getModel() {

        /**
         * Return our spinner ancestor's <code>SpinnerDateModel</code>.
         *
         * @return <code>getSpinner().getModel()</code>
         * @see #getSpinner
         * @see #getTextField
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public SimpleDateFormat getFormat() {

        /**
         * Returns the <code>java.text.SimpleDateFormat</code> object the
         * <code>JFormattedTextField</code> uses to parse and format
         * numbers.
         *
         * @return the value of <code>getTextField().getFormatter().getFormat()</code>.
         * @see #getTextField
         * @see java.text.SimpleDateFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        private DateEditor(JSpinner spinner, DateFormat format) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerDateModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>DateEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor
         *        will monitor
         * @param format <code>DateFormat</code> object that's used to display
         *     and parse the value of the text field.
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerDateModel</code>
         *
         * @see #getModel
         * @see #getFormat
         * @see SpinnerDateModel
         * @see java.text.SimpleDateFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public DateEditor(JSpinner spinner, String dateFormatPattern) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerDateModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>DateEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinner and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @param dateFormatPattern the initial pattern for the
         *     <code>SimpleDateFormat</code> object that's used to display
         *     and parse the value of the text field.
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerDateModel</code>
         *
         * @see #getModel
         * @see #getFormat
         * @see SpinnerDateModel
         * @see java.text.SimpleDateFormat
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public DateEditor(JSpinner spinner) {

        /**
         * Construct a <code>JSpinner</code> editor that supports displaying
         * and editing the value of a <code>SpinnerDateModel</code>
         * with a <code>JFormattedTextField</code>.  <code>This</code>
         * <code>DateEditor</code> becomes both a <code>ChangeListener</code>
         * on the spinners model and a <code>PropertyChangeListener</code>
         * on the new <code>JFormattedTextField</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @exception IllegalArgumentException if the spinners model is not
         *     an instance of <code>SpinnerDateModel</code>
         *
         * @see #getModel
         * @see #getFormat
         * @see SpinnerDateModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    // PENDING(hmuller): more example javadoc

    /**
     * An editor for a <code>JSpinner</code> whose model is a
     * <code>SpinnerDateModel</code>.  The value of the editor is
     * displayed with a <code>JFormattedTextField</code> whose format
     * is defined by a <code>DateFormatter</code> instance whose
     * <code>minimum</code> and <code>maximum</code> properties
     * are mapped to the <code>SpinnerDateModel</code>.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    private static class DateEditorFormatter extends DateFormatter {

    /**
     * This subclass of javax.swing.DateFormatter maps the minimum/maximum
     * properties to te start/end properties of a SpinnerDateModel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public BaselineResizeBehavior getBaselineResizeBehavior() {

        /**
         * Returns an enum indicating how the baseline of the component
         * changes as the size changes.
         *
         * @throws NullPointerException {@inheritDoc}
         * @see javax.swing.JComponent#getBaseline(int, int)
         * @since 1.6
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public int getBaseline(int width, int height) {

        /**
         * Returns the baseline.
         *
         * @throws IllegalArgumentException {@inheritDoc}
         * @see javax.swing.JComponent#getBaseline(int,int)
         * @see javax.swing.JComponent#getBaselineResizeBehavior()
         * @since 1.6
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void commitEdit()  throws ParseException {

        /**
         * Pushes the currently edited value to the <code>SpinnerModel</code>.
         * <p>
         * The default implementation invokes <code>commitEdit</code> on the
         * <code>JFormattedTextField</code>.
         *
         * @throws ParseException if the edited value is not legal
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void layoutContainer(Container parent) {

        /**
         * Resize the one (and only) child to completely fill the area
         * within the parents insets.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Dimension minimumLayoutSize(Container parent) {

        /**
         * Returns the minimum size of first (and only) child plus the
         * size of the parents insets.
         *
         * @param parent the Container that's managing the layout
         * @return  the minimum dimensions needed to lay out the subcomponents
         *          of the specified container.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public Dimension preferredLayoutSize(Container parent) {

        /**
         * Returns the preferred size of first (and only) child plus the
         * size of the parents insets.
         *
         * @param parent the Container that's managing the layout
         * @return the preferred dimensions to lay out the subcomponents
         *          of the specified container.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        private Dimension insetSize(Container parent) {

        /**
         * Returns the size of the parents insets.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void removeLayoutComponent(Component child) {

        /**
         * This <code>LayoutManager</code> method does nothing.  There
         * isn't any per-child state.
         *
         * @param child ignored
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void addLayoutComponent(String name, Component child) {

        /**
         * This <code>LayoutManager</code> method does nothing.  We're
         * only managing a single child and there's no support
         * for layout constraints.
         *
         * @param name ignored
         * @param child ignored
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void propertyChange(PropertyChangeEvent e)

        /**
         * Called by the <code>JFormattedTextField</code>
         * <code>PropertyChangeListener</code>.  When the <code>"value"</code>
         * property changes, which implies that the user has typed a new
         * number, we set the value of the spinners model.
         * <p>
         * This class ignores <code>PropertyChangeEvents</code> whose
         * source is not the <code>JFormattedTextField</code>, so subclasses
         * may safely make <code>this</code> <code>DefaultEditor</code> a
         * <code>PropertyChangeListener</code> on other objects.
         *
         * @param e the <code>PropertyChangeEvent</code> whose source is
         *    the <code>JFormattedTextField</code> created by this class.
         * @see #getTextField
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void stateChanged(ChangeEvent e) {

        /**
         * This method is called when the spinner's model's state changes.
         * It sets the <code>value</code> of the text field to the current
         * value of the spinners model.
         *
         * @param e the <code>ChangeEvent</code> whose source is the
         * <code>JSpinner</code> whose model has changed.
         * @see #getTextField
         * @see JSpinner#getValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public JFormattedTextField getTextField() {

        /**
         * Returns the <code>JFormattedTextField</code> child of this
         * editor.  By default the text field is the first and only
         * child of editor.
         *
         * @return the <code>JFormattedTextField</code> that gives the user
         *     access to the <code>SpinnerDateModel's</code> value.
         * @see #getSpinner
         * @see #getModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public JSpinner getSpinner() {

        /**
         * Returns the <code>JSpinner</code> ancestor of this editor or
         * <code>null</code> if none of the ancestors are a
         * <code>JSpinner</code>.
         * Typically the editor's parent is a <code>JSpinner</code> however
         * subclasses of <code>JSpinner</code> may override the
         * the <code>createEditor</code> method and insert one or more containers
         * between the <code>JSpinner</code> and it's editor.
         *
         * @return <code>JSpinner</code> ancestor; <code>null</code>
         *         if none of the ancestors are a <code>JSpinner</code>
         *
         * @see JSpinner#createEditor
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public void dismiss(JSpinner spinner) {

        /**
         * Disconnect <code>this</code> editor from the specified
         * <code>JSpinner</code>.  By default, this method removes
         * itself from the spinners <code>ChangeListener</code> list.
         *
         * @param spinner the <code>JSpinner</code> to disconnect this
         *    editor from; the same spinner as was passed to the constructor.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
        public DefaultEditor(JSpinner spinner) {

        /**
         * Constructs an editor component for the specified <code>JSpinner</code>.
         * This <code>DefaultEditor</code> is it's own layout manager and
         * it is added to the spinner's <code>ChangeListener</code> list.
         * The constructor creates a single <code>JFormattedTextField</code> child,
         * initializes it's value to be the spinner model's current value
         * and adds it to <code>this</code> <code>DefaultEditor</code>.
         *
         * @param spinner the spinner whose model <code>this</code> editor will monitor
         * @see #getTextField
         * @see JSpinner#addChangeListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public static class DefaultEditor extends JPanel

    /**
     * A simple base class for more specialized editors
     * that displays a read-only view of the model's current
     * value with a <code>JFormattedTextField</code>.  Subclasses
     * can configure the <code>JFormattedTextField</code> to create
     * an editor that's appropriate for the type of model they
     * support and they may want to override
     * the <code>stateChanged</code> and <code>propertyChanged</code>
     * methods, which keep the model and the text field in sync.
     * <p>
     * This class defines a <code>dismiss</code> method that removes the
     * editors <code>ChangeListener</code> from the <code>JSpinner</code>
     * that it's part of.   The <code>setEditor</code> method knows about
     * <code>DefaultEditor.dismiss</code>, so if the developer
     * replaces an editor that's derived from <code>JSpinner.DefaultEditor</code>
     * its <code>ChangeListener</code> connection back to the
     * <code>JSpinner</code> will be removed.  However after that,
     * it's up to the developer to manage their editor listeners.
     * Similarly, if a subclass overrides <code>createEditor</code>,
     * it's up to the subclasser to deal with their editor
     * subsequently being replaced (with <code>setEditor</code>).
     * We expect that in most cases, and in editor installed
     * with <code>setEditor</code> or created by a <code>createEditor</code>
     * override, will not be replaced anyway.
     * <p>
     * This class is the <code>LayoutManager</code> for it's single
     * <code>JFormattedTextField</code> child.   By default the
     * child is just centered with the parents insets.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void commitEdit() throws ParseException {

    /**
     * Commits the currently edited value to the <code>SpinnerModel</code>.
     * <p>
     * If the editor is an instance of <code>DefaultEditor</code>, the
     * call if forwarded to the editor, otherwise this does nothing.
     *
     * @throws ParseException if the currently edited value couldn't
     *         be committed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public JComponent getEditor() {

    /**
     * Returns the component that displays and potentially
     * changes the model's value.
     *
     * @return the component that displays and potentially
     *    changes the model's value
     * @see #setEditor
     * @see #createEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void setEditor(JComponent editor) {

    /**
     * Changes the <code>JComponent</code> that displays the current value
     * of the <code>SpinnerModel</code>.  It is the responsibility of this
     * method to <i>disconnect</i> the old editor from the model and to
     * connect the new editor.  This may mean removing the
     * old editors <code>ChangeListener</code> from the model or the
     * spinner itself and adding one for the new editor.
     *
     * @param editor the new editor
     * @see #getEditor
     * @see #createEditor
     * @see #getModel
     * @throws IllegalArgumentException if editor is <code>null</code>
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: JComponent that displays the current value of the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public Object getPreviousValue() {

    /**
     * Returns the object in the sequence that comes
     * before the object returned by <code>getValue()</code>.
     * If the end of the sequence has been reached then
     * return <code>null</code>. Calling this method does
     * not effect <code>value</code>.
     * <p>
     * This method simply delegates to the <code>model</code>.
     * It is equivalent to:
     * <pre>
     * getModel().getPreviousValue()
     * </pre>
     *
     * @return the previous legal value or <code>null</code>
     *   if one doesn't exist
     * @see #getValue
     * @see #getNextValue
     * @see SpinnerModel#getPreviousValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    protected void fireStateChanged() {

    /**
     * Sends a <code>ChangeEvent</code>, whose source is this
     * <code>JSpinner</code>, to each <code>ChangeListener</code>.
     * When a <code>ChangeListener</code> has been added
     * to the spinner, this method method is called each time
     * a <code>ChangeEvent</code> is received from the model.
     *
     * @see #addChangeListener
     * @see #removeChangeListener
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this JSpinner with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void removeChangeListener(ChangeListener listener) {

    /**
     * Removes a <code>ChangeListener</code> from this spinner.
     *
     * @param listener the <code>ChangeListener</code> to remove
     * @see #fireStateChanged
     * @see #addChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void addChangeListener(ChangeListener listener) {

    /**
     * Adds a listener to the list that is notified each time a change
     * to the model occurs.  The source of <code>ChangeEvents</code>
     * delivered to <code>ChangeListeners</code> will be this
     * <code>JSpinner</code>.  Note also that replacing the model
     * will not affect listeners added directly to JSpinner.
     * Applications can add listeners to  the model directly.  In that
     * case is that the source of the event would be the
     * <code>SpinnerModel</code>.
     *
     * @param listener the <code>ChangeListener</code> to add
     * @see #removeChangeListener
     * @see #getModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    private class ModelListener implements ChangeListener, Serializable {

    /**
     * We pass <code>Change</code> events along to the listeners with the
     * the slider (instead of the model itself) as the event source.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public Object getNextValue() {

    /**
     * Returns the object in the sequence that comes after the object returned
     * by <code>getValue()</code>. If the end of the sequence has been reached
     * then return <code>null</code>.
     * Calling this method does not effect <code>value</code>.
     * <p>
     * This method simply delegates to the <code>model</code>.
     * It is equivalent to:
     * <pre>
     * getModel().getNextValue()
     * </pre>
     *
     * @return the next legal value or <code>null</code> if one doesn't exist
     * @see #getValue
     * @see #getPreviousValue
     * @see SpinnerModel#getNextValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void setValue(Object value) {

    /**
     * Changes current value of the model, typically
     * this value is displayed by the <code>editor</code>.
     * If the <code>SpinnerModel</code> implementation
     * doesn't support the specified value then an
     * <code>IllegalArgumentException</code> is thrown.
     * <p>
     * This method simply delegates to the <code>model</code>.
     * It is equivalent to:
     * <pre>
     * getModel().setValue(value)
     * </pre>
     *
     * @throws IllegalArgumentException if <code>value</code> isn't allowed
     * @see #getValue
     * @see SpinnerModel#setValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public Object getValue() {

    /**
     * Returns the current value of the model, typically
     * this value is displayed by the <code>editor</code>. If the
     * user has changed the value displayed by the <code>editor</code> it is
     * possible for the <code>model</code>'s value to differ from that of
     * the <code>editor</code>, refer to the class level javadoc for examples
     * of how to deal with this.
     * <p>
     * This method simply delegates to the <code>model</code>.
     * It is equivalent to:
     * <pre>
     * getModel().getValue()
     * </pre>
     *
     * @see #setValue
     * @see SpinnerModel#getValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public SpinnerModel getModel() {

    /**
     * Returns the <code>SpinnerModel</code> that defines
     * this spinners sequence of values.
     *
     * @return the value of the model property
     * @see #setModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void setModel(SpinnerModel model) {

    /**
     * Changes the model that represents the value of this spinner.
     * If the editor property has not been explicitly set,
     * the editor property is (implicitly) set after the <code>"model"</code>
     * <code>PropertyChangeEvent</code> has been fired.  The editor
     * property is set to the value returned by <code>createEditor</code>,
     * as in:
     * <pre>
     * setEditor(createEditor(model));
     * </pre>
     *
     * @param model the new <code>SpinnerModel</code>
     * @see #getModel
     * @see #getEditor
     * @see #setEditor
     * @throws IllegalArgumentException if model is <code>null</code>
     *
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Model that represents the value of this spinner.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    protected JComponent createEditor(SpinnerModel model) {

    /**
     * This method is called by the constructors to create the
     * <code>JComponent</code>
     * that displays the current value of the sequence.  The editor may
     * also allow the user to enter an element of the sequence directly.
     * An editor must listen for <code>ChangeEvents</code> on the
     * <code>model</code> and keep the value it displays
     * in sync with the value of the model.
     * <p>
     * Subclasses may override this method to add support for new
     * <code>SpinnerModel</code> classes.  Alternatively one can just
     * replace the editor created here with the <code>setEditor</code>
     * method.  The default mapping from model type to editor is:
     * <ul>
     * <li> <code>SpinnerNumberModel =&gt; JSpinner.NumberEditor</code>
     * <li> <code>SpinnerDateModel =&gt; JSpinner.DateEditor</code>
     * <li> <code>SpinnerListModel =&gt; JSpinner.ListEditor</code>
     * <li> <i>all others</i> =&gt; <code>JSpinner.DefaultEditor</code>
     * </ul>
     *
     * @return a component that displays the current value of the sequence
     * @param model the value of getModel
     * @see #getModel
     * @see #setEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void updateUI() {

    /**
     * Resets the UI property with the value from the current look and feel.
     *
     * @see UIManager#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public String getUIClassID() {

    /**
     * Returns the suffix used to construct the name of the look and feel
     * (L&amp;F) class used to render this component.
     *
     * @return the string "SpinnerUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public void setUI(SpinnerUI ui) {

    /**
     * Sets the look and feel (L&amp;F) object that renders this component.
     *
     * @param ui  the <code>SpinnerUI</code> L&amp;F object
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public SpinnerUI getUI() {

    /**
     * Returns the look and feel (L&amp;F) object that renders this component.
     *
     * @return the <code>SpinnerUI</code> object that renders this component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public JSpinner() {

    /**
     * Constructs a spinner with an <code>Integer SpinnerNumberModel</code>
     * with initial value 0 and no minimum or maximum limits.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    public JSpinner(SpinnerModel model) {

    /**
     * Constructs a spinner for the given model. The spinner has
     * a set of previous/next buttons, and an editor appropriate
     * for the model.
     *
     * @throws NullPointerException if the model is {@code null}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
    private static final String uiClassID = "SpinnerUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JSpinner.java
public class JSpinner extends JComponent implements Accessible

/**
 * A single line input field that lets the user select a
 * number or an object value from an ordered sequence. Spinners typically
 * provide a pair of tiny arrow buttons for stepping through the elements
 * of the sequence. The keyboard up/down arrow keys also cycle through the
 * elements. The user may also be allowed to type a (legal) value directly
 * into the spinner. Although combo boxes provide similar functionality,
 * spinners are sometimes preferred because they don't require a drop down list
 * that can obscure important data.
 * <p>
 * A <code>JSpinner</code>'s sequence value is defined by its
 * <code>SpinnerModel</code>.
 * The <code>model</code> can be specified as a constructor argument and
 * changed with the <code>model</code> property.  <code>SpinnerModel</code>
 * classes for some common types are provided: <code>SpinnerListModel</code>,
 * <code>SpinnerNumberModel</code>, and <code>SpinnerDateModel</code>.
 * <p>
 * A <code>JSpinner</code> has a single child component that's
 * responsible for displaying
 * and potentially changing the current element or <i>value</i> of
 * the model, which is called the <code>editor</code>.  The editor is created
 * by the <code>JSpinner</code>'s constructor and can be changed with the
 * <code>editor</code> property.  The <code>JSpinner</code>'s editor stays
 * in sync with the model by listening for <code>ChangeEvent</code>s. If the
 * user has changed the value displayed by the <code>editor</code> it is
 * possible for the <code>model</code>'s value to differ from that of
 * the <code>editor</code>. To make sure the <code>model</code> has the same
 * value as the editor use the <code>commitEdit</code> method, eg:
 * <pre>
 *   try {
 *       spinner.commitEdit();
 *   }
 *   catch (ParseException pe) {{
 *       // Edited value is invalid, spinner.getValue() will return
 *       // the last valid value, you could revert the spinner to show that:
 *       JComponent editor = spinner.getEditor()
 *       if (editor instanceof DefaultEditor) {
 *           ((DefaultEditor)editor).getTextField().setValue(spinner.getValue();
 *       }
 *       // reset the value to some known value:
 *       spinner.setValue(fallbackValue);
 *       // or treat the last valid value as the current, in which
 *       // case you don't need to do anything.
 *   }
 *   return spinner.getValue();
 * </pre>
 * <p>
 * For information and examples of using spinner see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/spinner.html">How to Use Spinners</a>,
 * a section in <em>The Java Tutorial.</em>
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
 * description: A single line input field that lets the user select a
 *     number or an object value from an ordered set.
 *
 * @see SpinnerModel
 * @see AbstractSpinnerModel
 * @see SpinnerListModel
 * @see SpinnerNumberModel
 * @see SpinnerDateModel
 * @see JFormattedTextField
 *
 * @author Hans Muller
 * @author Lynn Monsanto (accessibility)
 * @since 1.4
 */
