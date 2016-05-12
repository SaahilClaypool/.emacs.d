_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private class DefaultDocumentFilter extends DocumentFilter implements

    /**
     * DocumentFilter implementation that calls back to the replace
     * method of DefaultFormatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private class DefaultNavigationFilter extends NavigationFilter

    /**
     * NavigationFilter implementation that calls back to methods with
     * same name in DefaultFormatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
        Object value;

        /** The resulting value, this may never be set. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
        String text;

        /** The text to insert, may be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
        int offset;

        /** Offset where the remove/insert is going to occur. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    static class ReplaceHolder {

    /**
     * ReplaceHolder is used to track where insert/remove/replace is
     * going to happen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    ReplaceHolder getReplaceHolder(DocumentFilter.FilterBypass fb, int offset,
                                   int length, String text,
                                   AttributeSet attrs) {

    /**
     * Returns the ReplaceHolder to track the replace of the specified
     * text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void moveDot(NavigationFilter.FilterBypass fb, int dot,
                 Position.Bias bias) {

    /**
     * NavigationFilter method, subclasses that wish finer control should
     * override this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void setDot(NavigationFilter.FilterBypass fb, int dot, Position.Bias bias){

    /**
     * NavigationFilter method, subclasses that wish finer control should
     * override this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    boolean replace(ReplaceHolder rh) throws BadLocationException {

    /**
     * If the edit described by <code>rh</code> is legal, this will
     * return true, commit the edit (if necessary) and update the cursor
     * position.  This forwards to <code>canReplace</code> and
     * <code>isLegalInsertText</code> as necessary to determine if
     * the edit is in fact legal.
     * <p>
     * All of the DocumentFilter methods funnel into here, you should
     * generally only have to override this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void replace(DocumentFilter.FilterBypass fb, int offset,
                     int length, String text,
                     AttributeSet attrs) throws BadLocationException {

    /**
     * DocumentFilter method, funnels into <code>replace</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    boolean canReplace(ReplaceHolder rh) {

    /**
     * Returns true if the edit described by <code>rh</code> will result
     * in a legal value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    int getNextVisualPositionFrom(JTextComponent text, int pos,
                                  Position.Bias bias, int direction,
                                  Position.Bias[] biasRet)

    /**
     * Finds the next navigable character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void repositionCursor(int offset, int direction) {

    /**
     * Resets the cursor by using getNextCursorPosition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    int getNextCursorPosition(int offset, int direction) {

    /**
     * Returns the next cursor position from offset by incrementing
     * <code>direction</code>. This uses
     * <code>getNextNavigatableChar</code>
     * as well as constraining the location to the max position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void updateValue(Object value) {

    /**
     * Pushes the <code>value</code> to the editor if we are to
     * commit on edits. If <code>value</code> is null, the current value
     * will be obtained from the text component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void updateValue() {

    /**
     * Pushes the value to the JFormattedTextField if the current value
     * is valid and invokes <code>setEditValid</code> based on the
     * validity of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void commitEdit() throws ParseException {

    /**
     * Invokes <code>commitEdit</code> on the JFormattedTextField.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    String getReplaceString(int offset, int deleteLength,
                            String replaceString) {

    /**
     * A convenience methods to return the result of deleting
     * <code>deleteLength</code> characters at <code>offset</code>
     * and inserting <code>replaceString</code> at <code>offset</code>
     * in the current text field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private int getNextNavigatableChar(int offset, int direction) {

    /**
     * Returns the next editable character starting at offset incrementing
     * the offset by <code>direction</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    boolean isLegalInsertText(String text) {

    /**
     * Returns true if the text in <code>text</code> can be inserted.  This
     * does not mean the text will ultimately be inserted, it is used if
     * text can trivially reject certain characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    boolean isNavigatable(int offset) {

    /**
     * Subclasses should override this if they want cursor navigation
     * to skip certain characters. A return value of false indicates
     * the character at <code>offset</code> should be skipped when
     * navigating throught the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    int getInitialVisualPosition() {

    /**
     * Returns the initial location to position the cursor at. This forwards
     * the call to <code>getNextNavigatableChar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    void positionCursorAtInitialLocation() {

    /**
     * Positions the cursor at the initial location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * Creates a copy of the DefaultFormatter.
     *
     * @return copy of the DefaultFormatter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    protected NavigationFilter getNavigationFilter() {

    /**
     * Returns the <code>NavigationFilter</code> used to restrict where the
     * cursor can be placed.
     *
     * @return NavigationFilter to restrict navigation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    protected DocumentFilter getDocumentFilter() {

    /**
     * Returns the <code>DocumentFilter</code> used to restrict the characters
     * that can be input into the <code>JFormattedTextField</code>.
     *
     * @return DocumentFilter to restrict edits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public String valueToString(Object value) throws ParseException {

    /**
     * Converts the passed in Object into a String by way of the
     * <code>toString</code> method.
     *
     * @throws ParseException if there is an error in the conversion
     * @param value Value to convert
     * @return String representation of value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public Object stringToValue(String string) throws ParseException {

    /**
     * Converts the passed in String into an instance of
     * <code>getValueClass</code> by way of the constructor that
     * takes a String argument. If <code>getValueClass</code>
     * returns null, the Class of the current value in the
     * <code>JFormattedTextField</code> will be used. If this is null, a
     * String will be returned. If the constructor throws an exception, a
     * <code>ParseException</code> will be thrown. If there is no single
     * argument String constructor, <code>string</code> will be returned.
     *
     * @throws ParseException if there is an error in the conversion
     * @param string String to convert
     * @return Object representation of text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public Class<?> getValueClass() {

    /**
     * Returns that class that is used to create new Objects.
     *
     * @return Class used to construct return value from stringToValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public void setValueClass(Class<?> valueClass) {

    /**
     * Sets that class that is used to create new Objects. If the
     * passed in class does not have a single argument constructor that
     * takes a String, String values will be used.
     *
     * @param valueClass Class used to construct return value from
     *        stringToValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public boolean getAllowsInvalid() {

    /**
     * Returns whether or not the value being edited is allowed to be invalid
     * for a length of time.
     *
     * @return false if the edited value must always be valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public void setAllowsInvalid(boolean allowsInvalid) {

    /**
     * Sets whether or not the value being edited is allowed to be invalid
     * for a length of time (that is, <code>stringToValue</code> throws
     * a <code>ParseException</code>).
     * It is often convenient to allow the user to temporarily input an
     * invalid value.
     *
     * @param allowsInvalid Used to indicate if the edited value must always
     *        be valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public boolean getOverwriteMode() {

    /**
     * Returns the behavior when inserting characters.
     *
     * @return true if newly inserted characters overwrite existing characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public void setOverwriteMode(boolean overwriteMode) {

    /**
     * Configures the behavior when inserting characters. If
     * <code>overwriteMode</code> is true (the default), new characters
     * overwrite existing characters in the model.
     *
     * @param overwriteMode Indicates if overwrite or overstrike mode is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public boolean getCommitsOnValidEdit() {

    /**
     * Returns when edits are published back to the
     * <code>JFormattedTextField</code>.
     *
     * @return true if edits are committed after every valid edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public void setCommitsOnValidEdit(boolean commit) {

    /**
     * Sets when edits are published back to the
     * <code>JFormattedTextField</code>. If true, <code>commitEdit</code>
     * is invoked after every valid edit (any time the text is edited). On
     * the other hand, if this is false than the <code>DefaultFormatter</code>
     * does not publish edits back to the <code>JFormattedTextField</code>.
     * As such, the only time the value of the <code>JFormattedTextField</code>
     * will change is when <code>commitEdit</code> is invoked on
     * <code>JFormattedTextField</code>, typically when enter is pressed
     * or focus leaves the <code>JFormattedTextField</code>.
     *
     * @param commit Used to indicate when edits are committed back to the
     *               JTextComponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public void install(JFormattedTextField ftf) {

    /**
     * Installs the <code>DefaultFormatter</code> onto a particular
     * <code>JFormattedTextField</code>.
     * This will invoke <code>valueToString</code> to convert the
     * current value from the <code>JFormattedTextField</code> to
     * a String. This will then install the <code>Action</code>s from
     * <code>getActions</code>, the <code>DocumentFilter</code>
     * returned from <code>getDocumentFilter</code> and the
     * <code>NavigationFilter</code> returned from
     * <code>getNavigationFilter</code> onto the
     * <code>JFormattedTextField</code>.
     * <p>
     * Subclasses will typically only need to override this if they
     * wish to install additional listeners on the
     * <code>JFormattedTextField</code>.
     * <p>
     * If there is a <code>ParseException</code> in converting the
     * current value to a String, this will set the text to an empty
     * String, and mark the <code>JFormattedTextField</code> as being
     * in an invalid state.
     * <p>
     * While this is a public method, this is typically only useful
     * for subclassers of <code>JFormattedTextField</code>.
     * <code>JFormattedTextField</code> will invoke this method at
     * the appropriate times when the value changes, or its internal
     * state changes.
     *
     * @param ftf JFormattedTextField to format for, may be null indicating
     *            uninstall from current JFormattedTextField.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    public DefaultFormatter() {

    /**
     * Creates a DefaultFormatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    transient ReplaceHolder replaceHolder;

    /** Used during replace to track the region to replace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private DocumentFilter documentFilter;

    /** DocumentFilter that forwards calls back to DefaultFormatter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private NavigationFilter navigationFilter;

    /** NavigationFilter that forwards calls back to DefaultFormatter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private Class<?> valueClass;

    /** Class used to create new instances. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private boolean commitOnEdit;

    /** If true, any time a valid edit happens commitEdit is invoked. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private boolean overwriteMode;

    /** If true, editing mode is in overwrite (or strikethough). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
    private boolean allowsInvalid;

    /** Indicates if the value being edited must match the mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatter.java
public class DefaultFormatter extends JFormattedTextField.AbstractFormatter

/**
 * <code>DefaultFormatter</code> formats arbitrary objects. Formatting is done
 * by invoking the <code>toString</code> method. In order to convert the
 * value back to a String, your class must provide a constructor that
 * takes a String argument. If no single argument constructor that takes a
 * String is found, the returned value will be the String passed into
 * <code>stringToValue</code>.
 * <p>
 * Instances of <code>DefaultFormatter</code> can not be used in multiple
 * instances of <code>JFormattedTextField</code>. To obtain a copy of
 * an already configured <code>DefaultFormatter</code>, use the
 * <code>clone</code> method.
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
 * @see javax.swing.JFormattedTextField.AbstractFormatter
 *
 * @since 1.4
 */
