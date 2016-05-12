_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private class IncrementAction extends AbstractAction {

    /**
     * IncrementAction is used to increment the value by a certain amount.
     * It calls into <code>adjustValue</code> to handle the actual
     * incrementing of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
        void resetFromValue(InternationalFormatter formatter) {

        /**
         * Resets the region to delete to be the complete document and
         * the text from invoking valueToString on the current value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
        int endTextLength;

        /** Length of the text. This may differ from text.length in
         * that if !allowsInvalid the text is replaced on every edit. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    static class ExtendedReplaceHolder extends ReplaceHolder {

    /**
     * As InternationalFormatter replaces the complete text on every edit,
     * ExtendedReplaceHolder keeps track of the offset and length passed
     * into canReplace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    ReplaceHolder getReplaceHolder(DocumentFilter.FilterBypass fb, int offset,
                                   int length, String text,
                                   AttributeSet attrs) {

    /**
     * Overriden to return an instance of <code>ExtendedReplaceHolder</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private void readObject(ObjectInputStream s)

    /**
     * Subclassed to update the internal representation of the mask after
     * the default read operation has completed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void resetValue(Object value) throws BadLocationException, ParseException {

    /**
     * Resets the value of the JFormattedTextField to be
     * <code>value</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean getSupportsIncrement() {

    /**
     * Returns false, indicating InternationalFormatter does not allow
     * incrementing of the value. Subclasses that wish to support
     * incrementing/decrementing the value should override this and
     * return true. Subclasses should also override
     * <code>adjustValue</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    Object adjustValue(Object value, Map attributes, Object field,
                           int direction) throws

    /**
     * Subclasses supporting incrementing must override this to handle
     * the actual incrementing. <code>value</code> is the current value,
     * <code>attributes</code> gives the field the cursor is in (may be
     * null depending upon <code>canIncrement</code>) and
     * <code>direction</code> is the amount to increment by.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private int getFieldTypeCountTo(Object f, int start) {

    /**
     * Returns the number of occurrences of <code>f</code> before
     * the location <code>start</code> in the current
     * <code>AttributedCharacterIterator</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    Object getAdjustField(int start, Map attributes) {

    /**
     * Returns the field that will be adjusted by adjustValue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void selectField(Object f, int count) {

    /**
     * Selects the fields identified by <code>attributes</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean canIncrement(Object field, int cursorPosition) {

    /**
     * Returns true if <code>field</code> is non-null.
     * Subclasses that wish to allow incrementing to happen outside of
     * the known fields will need to override this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private void updateMask(AttributedCharacterIterator iterator) {

    /**
     * Updates the interal bitset from <code>iterator</code>. This will
     * set <code>validMask</code> to true if <code>iterator</code> is
     * non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean isLiteral(Map attributes) {

    /**
     * Returns true if <code>attributes</code> is null or empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean isValidMask() {

    /**
     * Returns true if the current mask is valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    char getBufferedChar(int index) {

    /**
     * Returns the character from the mask that has been buffered
     * at <code>index</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private void repositionCursor(int startLiteralCount, int end,
                                  int direction)  {

    /**
     * Repositions the cursor. <code>startLiteralCount</code> gives
     * the number of literals to the start of the deleted range, end
     * gives the ending location to adjust from, direction gives
     * the direction relative to <code>end</code> to position the
     * cursor from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean replace(ReplaceHolder rh) throws BadLocationException {

    /**
     * When in !allowsInvalid mode the text is reset on every edit, thus
     * supers implementation will position the cursor at the wrong position.
     * As such, this invokes supers implementation and then invokes
     * <code>repositionCursor</code> to correctly reset the cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean canReplace(ReplaceHolder rh) {

    /**
     * Overriden in an attempt to honor the literals.
     * <p>If we do not allow invalid values and are in overwrite mode, this
     * {@code rh.length} is corrected as to preserve trailing literals.
     * If not in overwrite mode, and there is text to insert it is
     * inserted at the next non literal index going forward.  If there
     * is only text to remove, it is removed from the next non literal
     * index going backward.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private int getNextNonliteralIndex(int index, int direction) {

    /**
     * Returns the index of the next non-literal character starting at
     * index. If index is not a literal, it will be returned.
     *
     * @param direction Amount to increment looking for non-literal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void replace(DocumentFilter.FilterBypass fb, int offset,
                     int length, String text,
                     AttributeSet attrs) throws BadLocationException {

    /**
     * Overriden to unconditionally allow the replace if
     * ignoreDocumentMutate is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void updateValue(Object value) {

    /**
     * Overriden to update the mask after invoking supers implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean isNavigatable(int offset) {

    /**
     * Returns true if the character at offset is navigable too. This
     * is implemented in terms of <code>isLiteral</code>, subclasses
     * may wish to provide different behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    char getLiteral(int index) {

    /**
     * Returns the literal character at index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean isLiteral(int index) {

    /**
     * Returns true if the character at index is a literal, that is
     * not editable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    int getLiteralCountTo(int index) {

    /**
     * Returns the number of literal characters before <code>index</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void updateMask() {

    /**
     * Updates the AttributedCharacterIterator by invoking
     * <code>formatToCharacterIterator</code> on the <code>Format</code>.
     * If this is successful,
     * <code>updateMask(AttributedCharacterIterator)</code>
     * is then invoked to update the internal bitmask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    void updateMaskIfNecessary() {

    /**
     * Updates the AttributedCharacterIterator and bitset, if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    AttributedCharacterIterator getIterator() {

    /**
     * Returns the <code>AttributedCharacterIterator</code> used to
     * format the last value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    int getAttributeStart(AttributedCharacterIterator.Attribute id) {

    /**
     * Returns the start of the first run that contains the attribute
     * <code>id</code>. This will return <code>-1</code> if the attribute
     * can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    Map<Attribute, Object> getAttributes(int index) {

    /**
     * Returns a Set of the attribute identifiers at <code>index</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    boolean isValidValue(Object value, boolean wantsCCE) {

    /**
     * Returns true if <code>value</code> is between the min/max.
     *
     * @param wantsCCE If false, and a ClassCastException is thrown in
     *                 comparing the values, the exception is consumed and
     *                 false is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    Object stringToValue(String text, Format f) throws ParseException {

    /**
     * Invokes <code>parseObject</code> on <code>f</code>, returning
     * its value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    protected Action[] getActions() {

    /**
     * If <code>getSupportsIncrement</code> returns true, this returns
     * two Actions suitable for incrementing/decrementing the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * Creates a copy of the DefaultFormatter.
     *
     * @return copy of the DefaultFormatter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Format.Field[] getFields(int offset) {

    /**
     * Returns the <code>Format.Field</code> constants associated with
     * the text at <code>offset</code>. If <code>offset</code> is not
     * a valid location into the current text, this will return an
     * empty array.
     *
     * @param offset offset into text to be examined
     * @return Format.Field constants associated with the text at the
     *         given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Object stringToValue(String text) throws ParseException {

    /**
     * Returns the <code>Object</code> representation of the
     * <code>String</code> <code>text</code>.
     *
     * @param text <code>String</code> to convert
     * @return <code>Object</code> representation of text
     * @throws ParseException if there is an error in the conversion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public String valueToString(Object value) throws ParseException {

    /**
     * Returns a String representation of the Object <code>value</code>.
     * This invokes <code>format</code> on the current <code>Format</code>.
     *
     * @throws ParseException if there is an error in the conversion
     * @param value Value to convert
     * @return String representation of value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Comparable getMaximum() {

    /**
     * Returns the maximum permissible value.
     *
     * @return Maximum legal value that can be input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public void setMaximum(Comparable max) {

    /**
     * Sets the maximum permissible value. If the <code>valueClass</code> has
     * not been specified, and <code>max</code> is non null, the
     * <code>valueClass</code> will be set to that of the class of
     * <code>max</code>.
     *
     * @param max Maximum legal value that can be input
     * @see #setValueClass
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Comparable getMinimum() {

    /**
     * Returns the minimum permissible value.
     *
     * @return Minimum legal value that can be input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public void setMinimum(Comparable minimum) {

    /**
     * Sets the minimum permissible value. If the <code>valueClass</code> has
     * not been specified, and <code>minimum</code> is non null, the
     * <code>valueClass</code> will be set to that of the class of
     * <code>minimum</code>.
     *
     * @param minimum Minimum legal value that can be input
     * @see #setValueClass
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public Format getFormat() {

    /**
     * Returns the format that dictates the legal values that can be edited
     * and displayed.
     *
     * @return Format instance used for converting from/to Strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public void setFormat(Format format) {

    /**
     * Sets the format that dictates the legal values that can be edited
     * and displayed.
     *
     * @param format <code>Format</code> instance used for converting
     * from/to Strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public InternationalFormatter(Format format) {

    /**
     * Creates an <code>InternationalFormatter</code> with the specified
     * <code>Format</code> instance.
     *
     * @param format Format instance used for converting from/to Strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    public InternationalFormatter() {

    /**
     * Creates an <code>InternationalFormatter</code> with no
     * <code>Format</code> specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private transient String string;

    /**
     * Current value being displayed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private transient AttributedCharacterIterator iterator;

    /**
     * Used to iterate over characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    /**

    /**
     * <code>InternationalFormatter</code>'s behavior is dicatated by a
     * <code>AttributedCharacterIterator</code> that is obtained from
     * the <code>Format</code>. On every edit, assuming
     * allows invalid is false, the <code>Format</code> instance is invoked
     * with <code>formatToCharacterIterator</code>. A <code>BitSet</code> is
     * also kept upto date with the non-literal characters, that is
     * for every index in the <code>AttributedCharacterIterator</code> an
     * entry in the bit set is updated based on the return value from
     * <code>isLiteral(Map)</code>. <code>isLiteral(int)</code> then uses
     * this cached information.
     * <p>
     * If allowsInvalid is false, every edit results in resetting the complete
     * text of the JTextComponent.
     * <p>
     * InternationalFormatterFilter can also provide two actions suitable for
     * incrementing and decrementing. To enable this a subclass must
     * override <code>getSupportsIncrement</code> to return true, and
     * override <code>adjustValue</code> to handle the changing of the
     * value. If you want to support changing the value outside of
     * the valid FieldPositions, you will need to override
     * <code>canIncrement</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private Comparable min;

    /**
     * Can be used to impose a minimum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
    private Format format;

    /**
     * Object used to handle the conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/InternationalFormatter.java
public class InternationalFormatter extends DefaultFormatter {

/**
 * <code>InternationalFormatter</code> extends <code>DefaultFormatter</code>,
 * using an instance of <code>java.text.Format</code> to handle the
 * conversion to a String, and the conversion from a String.
 * <p>
 * If <code>getAllowsInvalid()</code> is false, this will ask the
 * <code>Format</code> to format the current text on every edit.
 * <p>
 * You can specify a minimum and maximum value by way of the
 * <code>setMinimum</code> and <code>setMaximum</code> methods. In order
 * for this to work the values returned from <code>stringToValue</code> must be
 * comparable to the min/max values by way of the <code>Comparable</code>
 * interface.
 * <p>
 * Be careful how you configure the <code>Format</code> and the
 * <code>InternationalFormatter</code>, as it is possible to create a
 * situation where certain values can not be input. Consider the date
 * format 'M/d/yy', an <code>InternationalFormatter</code> that is always
 * valid (<code>setAllowsInvalid(false)</code>), is in overwrite mode
 * (<code>setOverwriteMode(true)</code>) and the date 7/1/99. In this
 * case the user will not be able to enter a two digit month or day of
 * month. To avoid this, the format should be 'MM/dd/yy'.
 * <p>
 * If <code>InternationalFormatter</code> is configured to only allow valid
 * values (<code>setAllowsInvalid(false)</code>), every valid edit will result
 * in the text of the <code>JFormattedTextField</code> being completely reset
 * from the <code>Format</code>.
 * The cursor position will also be adjusted as literal characters are
 * added/removed from the resulting String.
 * <p>
 * <code>InternationalFormatter</code>'s behavior of
 * <code>stringToValue</code> is  slightly different than that of
 * <code>DefaultTextFormatter</code>, it does the following:
 * <ol>
 *   <li><code>parseObject</code> is invoked on the <code>Format</code>
 *       specified by <code>setFormat</code>
 *   <li>If a Class has been set for the values (<code>setValueClass</code>),
 *       supers implementation is invoked to convert the value returned
 *       from <code>parseObject</code> to the appropriate class.
 *   <li>If a <code>ParseException</code> has not been thrown, and the value
 *       is outside the min/max a <code>ParseException</code> is thrown.
 *   <li>The value is returned.
 * </ol>
 * <code>InternationalFormatter</code> implements <code>stringToValue</code>
 * in this manner so that you can specify an alternate Class than
 * <code>Format</code> may return.
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
 * @see java.text.Format
 * @see java.lang.Comparable
 *
 * @since 1.4
 */
