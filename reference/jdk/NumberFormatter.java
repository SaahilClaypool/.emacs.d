_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private Object toggleExponentSign(int offset, char aChar) throws

    /**
     * Invoked to toggle the sign of the exponent (for scientific
     * numbers).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private Object toggleSign(boolean positive) throws ParseException {

    /**
     * Invoked to toggle the sign. For this to work the value class
     * must have a single arg constructor that takes a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private boolean toggleSignIfNecessary(DocumentFilter.FilterBypass fb,
                                              int offset, char aChar) throws

    /**
     * Will change the sign of the integer or exponent field if
     * <code>aChar</code> is the positive or minus sign. Returns
     * true if a sign change was attempted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    void replace(DocumentFilter.FilterBypass fb, int offset, int length,
                String string, AttributeSet attr) throws BadLocationException {

    /**
     * Overriden to toggle the value if the positive/minus sign
     * is inserted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private NumberFormat.Field getFieldFrom(int index, int direction) {

    /**
     * Returns the first <code>NumberFormat.Field</code> starting
     * <code>index</code> incrementing by <code>direction</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    boolean isNavigatable(int index) {

    /**
     * Subclassed to make the decimal separator navigable, as well
     * as making the character between the integer field and the next
     * field navigable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    boolean isLiteral(Map attrs) {

    /**
     * Subclassed to treat the decimal separator, grouping separator,
     * exponent symbol, percent, permille, currency and sign as literals.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    boolean isLegalInsertText(String text) {

    /**
     * Subclassed to return false if <code>text</code> contains in an invalid
     * character to insert, that is, it is not a digit
     * (<code>Character.isDigit()</code>) and
     * not one of the characters defined by the DecimalFormatSymbols.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private DecimalFormatSymbols getDecimalFormatSymbols() {

    /**
     * Returns the DecimalFormatSymbols from the Format instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private char getDecimalSeparator() {

    /**
     * Returns the character that is used to toggle to negative values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private char getMinusSign() {

    /**
     * Returns the character that is used to toggle to negative values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private char getPositiveSign() {

    /**
     * Returns the character that is used to toggle to positive values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    private Object convertValueToValueClass(Object value, Class valueClass) {

    /**
     * Converts the passed in value to the passed in class. This only
     * works if <code>valueClass</code> is one of <code>Integer</code>,
     * <code>Long</code>, <code>Float</code>, <code>Double</code>,
     * <code>Byte</code> or <code>Short</code> and <code>value</code>
     * is an instanceof <code>Number</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    Object stringToValue(String text, Format f) throws ParseException {

    /**
     * Invokes <code>parseObject</code> on <code>f</code>, returning
     * its value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    public void setFormat(Format format) {

    /**
     * Sets the format that dictates the legal values that can be edited
     * and displayed.
     * <p>
     * If you have used the nullary constructor the value of this property
     * will be determined for the current locale by way of the
     * <code>NumberFormat.getNumberInstance()</code> method.
     *
     * @param format NumberFormat instance used to dictate legal values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    public NumberFormatter(NumberFormat format) {

    /**
     * Creates a NumberFormatter with the specified Format instance.
     *
     * @param format Format used to dictate legal values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
    public NumberFormatter() {

    /**
     * Creates a <code>NumberFormatter</code> with the a default
     * <code>NumberFormat</code> instance obtained from
     * <code>NumberFormat.getNumberInstance()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/NumberFormatter.java
public class NumberFormatter extends InternationalFormatter {

/**
 * <code>NumberFormatter</code> subclasses <code>InternationalFormatter</code>
 * adding special behavior for numbers. Among the specializations are
 * (these are only used if the <code>NumberFormatter</code> does not display
 * invalid numbers, for example, <code>setAllowsInvalid(false)</code>):
 * <ul>
 *   <li>Pressing +/- (- is determined from the
 *       <code>DecimalFormatSymbols</code> associated with the
 *       <code>DecimalFormat</code>) in any field but the exponent
 *       field will attempt to change the sign of the number to
 *       positive/negative.
 *   <li>Pressing +/- (- is determined from the
 *       <code>DecimalFormatSymbols</code> associated with the
 *       <code>DecimalFormat</code>) in the exponent field will
 *       attempt to change the sign of the exponent to positive/negative.
 * </ul>
 * <p>
 * If you are displaying scientific numbers, you may wish to turn on
 * overwrite mode, <code>setOverwriteMode(true)</code>. For example:
 * <pre>
 * DecimalFormat decimalFormat = new DecimalFormat("0.000E0");
 * NumberFormatter textFormatter = new NumberFormatter(decimalFormat);
 * textFormatter.setOverwriteMode(true);
 * textFormatter.setAllowsInvalid(false);
 * </pre>
 * <p>
 * If you are going to allow the user to enter decimal
 * values, you should either force the DecimalFormat to contain at least
 * one decimal (<code>#.0###</code>), or allow the value to be invalid
 * <code>setAllowsInvalid(true)</code>. Otherwise users may not be able to
 * input decimal values.
 * <p>
 * <code>NumberFormatter</code> provides slightly different behavior to
 * <code>stringToValue</code> than that of its superclass. If you have
 * specified a Class for values, {@link #setValueClass}, that is one of
 * of <code>Integer</code>, <code>Long</code>, <code>Float</code>,
 * <code>Double</code>, <code>Byte</code> or <code>Short</code> and
 * the Format's <code>parseObject</code> returns an instance of
 * <code>Number</code>, the corresponding instance of the value class
 * will be created using the constructor appropriate for the primitive
 * type the value class represents. For example:
 * <code>setValueClass(Integer.class)</code> will cause the resulting
 * value to be created via
 * <code>new Integer(((Number)formatter.parseObject(string)).intValue())</code>.
 * This is typically useful if you
 * wish to set a min/max value as the various <code>Number</code>
 * implementations are generally not comparable to each other. This is also
 * useful if for some reason you need a specific <code>Number</code>
 * implementation for your values.
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
 * @since 1.4
 */
