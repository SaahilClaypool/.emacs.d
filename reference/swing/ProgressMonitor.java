_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the String portion of the text that is selected
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Returns the AttributeSet for a given character at a given index
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public int getCharCount() {

        /**
         * Returns the number of characters (valid indicies)
         *
         * @return the number of characters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Determines the bounding box of the character at the given
         * index into the string.  The bounds are returned in local
         * coordinates.  If the index is invalid an empty rectangle is returned.
         *
         * @param i the index into the String
         * @return the screen coordinates of the character's bounding box,
         * if index is invalid return an empty rectangle.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Gets the AccessibleValue associated with this object that supports a
         * Numerical value.
         *
         * @return AccessibleValue if supported by object; else return null
         * @see AccessibleValue
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public AccessibleComponent getAccessibleComponent() {

        /**
         * Gets the AccessibleComponent associated with this object that has a
         * graphical representation.
         *
         * @return AccessibleComponent if supported by object; else return null
         * @see AccessibleComponent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children of the object.
         *
         * @return the number of accessible children of the object.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the Accessible parent of this object.
         *
         * @return the Accessible parent of this object; null if this
         * object does not have an Accessible parent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * This method gets called when a bound property is changed.
         *
         * @param e A <code>PropertyChangeEvent</code> object describing
         * the event source and the property that has changed. Must not be null.
         * @throws NullPointerException if the parameter is null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        public void stateChanged(ChangeEvent e) {

        /**
         * Invoked when the target of the listener has changed its state.
         *
         * @param e  a <code>ChangeEvent</code> object. Must not be null.
         * @throws NullPointerException if the parameter is null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        protected AccessibleProgressMonitor() {

        /**
         * AccessibleProgressMonitor constructor
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    protected class AccessibleProgressMonitor extends AccessibleContext

    /**
     * <code>AccessibleProgressMonitor</code> implements accessibility
     * support for the <code>ProgressMonitor</code> class.
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> for the
     * <code>ProgressMonitor</code>
     *
     * @return the <code>AccessibleContext</code> for the
     * <code>ProgressMonitor</code>
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    /**

    ////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    // Accessibility support

    /////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public String getNote() {

    /**
     * Specifies the additional note that is displayed along with the
     * progress message.
     *
     * @return a String specifying the note to display
     * @see #setNote
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setNote(String note) {

    /**
     * Specifies the additional note that is displayed along with the
     * progress message. Used, for example, to show which file the
     * is currently being copied during a multiple-file copy.
     *
     * @param note  a String specifying the note to display
     * @see #getNote
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public int getMillisToPopup() {

    /**
     * Returns the amount of time it will take for the popup to appear.
     *
     * @see #setMillisToPopup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setMillisToPopup(int millisToPopup) {

    /**
     * Specifies the amount of time it will take for the popup to appear.
     * (If the predicted time remaining is less than this time, the popup
     * won't be displayed.)
     *
     * @param millisToPopup  an int specifying the time in milliseconds
     * @see #getMillisToPopup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public int getMillisToDecideToPopup() {

    /**
     * Returns the amount of time this object waits before deciding whether
     * or not to popup a progress monitor.
     *
     * @see #setMillisToDecideToPopup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setMillisToDecideToPopup(int millisToDecideToPopup) {

    /**
     * Specifies the amount of time to wait before deciding whether or
     * not to popup a progress monitor.
     *
     * @param millisToDecideToPopup  an int specifying the time to wait,
     *        in milliseconds
     * @see #getMillisToDecideToPopup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public boolean isCanceled() {

    /**
     * Returns true if the user hits the Cancel button in the progress dialog.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setMaximum(int m) {

    /**
     * Specifies the maximum value.
     *
     * @param m  an int specifying the maximum value
     * @see #getMaximum
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public int getMaximum() {

    /**
     * Returns the maximum value -- the higher end of the progress value.
     *
     * @return an int representing the maximum value
     * @see #setMaximum
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setMinimum(int m) {

    /**
     * Specifies the minimum value.
     *
     * @param m  an int specifying the minimum value
     * @see #getMinimum
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public int getMinimum() {

    /**
     * Returns the minimum value -- the lower end of the progress value.
     *
     * @return an int representing the minimum value
     * @see #setMinimum
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void close() {

    /**
     * Indicate that the operation is complete.  This happens automatically
     * when the value set by setProgress is &gt;= max, but it may be called
     * earlier if the operation ends early.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public void setProgress(int nv) {

    /**
     * Indicate the progress of the operation being monitored.
     * If the specified value is &gt;= the maximum, the progress
     * monitor is closed.
     * @param nv an int specifying the current value, between the
     *        maximum and minimum specified for this component
     * @see #setMinimum
     * @see #setMaximum
     * @see #close
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        /**

        ////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
        // Accessibility support for ProgressOptionPane

        /////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
    public ProgressMonitor(Component parentComponent,
                           Object message,
                           String note,
                           int min,
                           int max) {

    /**
     * Constructs a graphic object that shows progress, typically by filling
     * in a rectangular bar as the process nears completion.
     *
     * @param parentComponent the parent component for the dialog box
     * @param message a descriptive message that will be shown
     *        to the user to indicate what operation is being monitored.
     *        This does not change as the operation progresses.
     *        See the message parameters to methods in
     *        {@link JOptionPane#message}
     *        for the range of values.
     * @param note a short note describing the state of the
     *        operation.  As the operation progresses, you can call
     *        setNote to change the note displayed.  This is used,
     *        for example, in operations that iterate through a
     *        list of files to show the name of the file being processes.
     *        If note is initially null, there will be no note line
     *        in the dialog box and setNote will be ineffective
     * @param min the lower bound of the range
     * @param max the upper bound of the range
     * @see JDialog
     * @see JOptionPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitor.java
public class ProgressMonitor implements Accessible

/** A class to monitor the progress of some operation. If it looks
 * like the operation will take a while, a progress dialog will be popped up.
 * When the ProgressMonitor is created it is given a numeric range and a
 * descriptive string. As the operation progresses, call the setProgress method
 * to indicate how far along the [min,max] range the operation is.
 * Initially, there is no ProgressDialog. After the first millisToDecideToPopup
 * milliseconds (default 500) the progress monitor will predict how long
 * the operation will take.  If it is longer than millisToPopup (default 2000,
 * 2 seconds) a ProgressDialog will be popped up.
 * <p>
 * From time to time, when the Dialog box is visible, the progress bar will
 * be updated when setProgress is called.  setProgress won't always update
 * the progress bar, it will only be done if the amount of progress is
 * visibly significant.
 *
 * <p>
 *
 * For further documentation and examples see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html">How to Monitor Progress</a>,
 * a section in <em>The Java Tutorial.</em>
 *
 * @see ProgressMonitorInputStream
 * @author James Gosling
 * @author Lynn Monsanto (accessibility)
 */
