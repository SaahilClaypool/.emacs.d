_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    private class Delegate implements Format.FieldDelegate {

    /**
     * An implementation of FieldDelegate that will adjust the begin/end
     * of the FieldPosition if the arguments match the field of
     * the FieldPosition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    private boolean matchesField(Format.Field attribute, int field) {

    /**
     * Return true if the receiver wants a <code>Format.Field</code> value and
     * <code>attribute</code> is equal to it, or true if the receiver
     * represents an inteter constant and <code>field</code> equals it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    private boolean matchesField(Format.Field attribute) {

    /**
     * Return true if the receiver wants a <code>Format.Field</code> value and
     * <code>attribute</code> is equal to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public String toString() {

    /**
     * Return a string representation of this FieldPosition.
     * @return  a string representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public int hashCode() {

    /**
     * Returns a hash code for this FieldPosition.
     * @return a hash code value for this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public boolean equals(Object obj)

    /**
     * Overrides equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    Format.FieldDelegate getFieldDelegate() {

    /**
     * Returns a <code>Format.FieldDelegate</code> instance that is associated
     * with the FieldPosition. When the delegate is notified of the same
     * field the FieldPosition is associated with, the begin/end will be
     * adjusted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public void setEndIndex(int ei) {

    /**
     * Sets the end index.  For use by subclasses of Format.
     *
     * @param ei the end index
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public void setBeginIndex(int bi) {

    /**
     * Sets the begin index.  For use by subclasses of Format.
     *
     * @param bi the begin index
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public int getEndIndex() {

    /**
     * Retrieves the index of the character following the last character in the
     * requested field.
     *
     * @return the end index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public int getBeginIndex() {

    /**
     * Retrieves the index of the first character in the requested field.
     *
     * @return the begin index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public int getField() {

    /**
     * Retrieves the field identifier.
     *
     * @return the field identifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public Format.Field getFieldAttribute() {

    /**
     * Returns the field identifier as an attribute constant
     * from one of the <code>Field</code> subclasses. May return null if
     * the field is specified only by an integer field ID.
     *
     * @return Identifier for the field
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public FieldPosition(Format.Field attribute, int fieldID) {

    /**
     * Creates a <code>FieldPosition</code> object for the given field.
     * The field is identified by an attribute constant from one of the
     * <code>Field</code> subclasses as well as an integer field ID
     * defined by the <code>Format</code> subclasses. <code>Format</code>
     * subclasses that are aware of <code>Field</code> should give precedence
     * to <code>attribute</code> and ignore <code>fieldID</code> if
     * <code>attribute</code> is not null. However, older <code>Format</code>
     * subclasses may not be aware of <code>Field</code> and rely on
     * <code>fieldID</code>. If the field has no corresponding integer
     * constant, <code>fieldID</code> should be -1.
     *
     * @param attribute Format.Field constant identifying a field
     * @param fieldID integer constant identifying a field
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public FieldPosition(Format.Field attribute) {

    /**
     * Creates a FieldPosition object for the given field constant. Fields are
     * identified by constants defined in the various <code>Format</code>
     * subclasses. This is equivalent to calling
     * <code>new FieldPosition(attribute, -1)</code>.
     *
     * @param attribute Format.Field constant identifying a field
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    public FieldPosition(int field) {

    /**
     * Creates a FieldPosition object for the given field.  Fields are
     * identified by constants, whose names typically end with _FIELD,
     * in the various subclasses of Format.
     *
     * @param field the field identifier
     * @see java.text.NumberFormat#INTEGER_FIELD
     * @see java.text.NumberFormat#FRACTION_FIELD
     * @see java.text.DateFormat#YEAR_FIELD
     * @see java.text.DateFormat#MONTH_FIELD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    private Format.Field attribute;

    /**
     * Desired field this FieldPosition is for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    int beginIndex = 0;

    /**
     * Output: Start offset of field in text.
     * If the field does not occur in the text, 0 is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    int endIndex = 0;

    /**
     * Output: End offset of field in text.
     * If the field does not occur in the text, 0 is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
    int field = 0;

    /**
     * Input: Desired field to determine start and end offsets for.
     * The meaning depends on the subclass of Format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/FieldPosition.java
public class FieldPosition {

/**
 * <code>FieldPosition</code> is a simple class used by <code>Format</code>
 * and its subclasses to identify fields in formatted output. Fields can
 * be identified in two ways:
 * <ul>
 *  <li>By an integer constant, whose names typically end with
 *      <code>_FIELD</code>. The constants are defined in the various
 *      subclasses of <code>Format</code>.
 *  <li>By a <code>Format.Field</code> constant, see <code>ERA_FIELD</code>
 *      and its friends in <code>DateFormat</code> for an example.
 * </ul>
 * <p>
 * <code>FieldPosition</code> keeps track of the position of the
 * field within the formatted output with two indices: the index
 * of the first character of the field and the index of the last
 * character of the field.
 *
 * <p>
 * One version of the <code>format</code> method in the various
 * <code>Format</code> classes requires a <code>FieldPosition</code>
 * object as an argument. You use this <code>format</code> method
 * to perform partial formatting or to get information about the
 * formatted output (such as the position of a field).
 *
 * <p>
 * If you are interested in the positions of all attributes in the
 * formatted string use the <code>Format</code> method
 * <code>formatToCharacterIterator</code>.
 *
 * @author      Mark Davis
 * @see         java.text.Format
 */
