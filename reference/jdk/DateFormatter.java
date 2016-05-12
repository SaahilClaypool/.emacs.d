_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    Object adjustValue(Object value, Map attributes, Object key,
                           int direction) throws

    /**
     * Adjusts the Date if FieldPosition identifies a known calendar
     * field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    Object getAdjustField(int start, Map attributes) {

    /**
     * Returns the field that will be adjusted by adjustValue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    boolean getSupportsIncrement() {

    /**
     * Returns true, as DateFormatterFilter will support
     * incrementing/decrementing of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    private Calendar getCalendar() {

    /**
     * Returns the Calendar that <code>DateFormat</code> is associated with,
     * or if the <code>Format</code> is not a <code>DateFormat</code>
     * <code>Calendar.getInstance</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    public void setFormat(DateFormat format) {

    /**
     * Sets the format that dictates the legal values that can be edited
     * and displayed.
     * <p>
     * If you have used the nullary constructor the value of this property
     * will be determined for the current locale by way of the
     * <code>Dateformat.getDateInstance()</code> method.
     *
     * @param format DateFormat instance used for converting from/to Strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
    public DateFormatter(DateFormat format) {

    /**
     * Returns a DateFormatter configured with the specified
     * <code>Format</code> instance.
     *
     * @param format Format used to dictate legal values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DateFormatter.java
public class DateFormatter extends InternationalFormatter {

/**
 * DateFormatter is an <code>InternationalFormatter</code> that does its
 * formatting by way of an instance of <code>java.text.DateFormat</code>.
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
 * @see java.text.DateFormat
 *
 * @since 1.4
 */
