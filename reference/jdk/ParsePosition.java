_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public String toString() {

    /**
     * Return a string representation of this ParsePosition.
     * @return  a string representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public int hashCode() {

    /**
     * Returns a hash code for this ParsePosition.
     * @return a hash code value for this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public boolean equals(Object obj)

    /**
     * Overrides equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public int getErrorIndex()

    /**
     * Retrieve the index at which an error occurred, or -1 if the
     * error index has not been set.
     *
     * @return the index at which an error occurred
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public void setErrorIndex(int ei)

    /**
     * Set the index at which a parse error occurred.  Formatters
     * should set this before returning an error code from their
     * parseObject method.  The default value is -1 if this is not set.
     *
     * @param ei the index at which an error occurred
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public ParsePosition(int index) {

    /**
     * Create a new ParsePosition with the given initial index.
     *
     * @param index initial index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public void setIndex(int index) {

    /**
     * Set the current parse position.
     *
     * @param index the current parse position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    public int getIndex() {

    /**
     * Retrieve the current parse position.  On input to a parse method, this
     * is the index of the character at which parsing will begin; on output, it
     * is the index of the character following the last character parsed.
     *
     * @return the current parse position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
    int index = 0;

    /**
     * Input: the place you start parsing.
     * <br>Output: position where the parse stopped.
     * This is designed to be used serially,
     * with each call setting index up for the next one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/ParsePosition.java
public class ParsePosition {

/**
 * <code>ParsePosition</code> is a simple class used by <code>Format</code>
 * and its subclasses to keep track of the current position during parsing.
 * The <code>parseObject</code> method in the various <code>Format</code>
 * classes requires a <code>ParsePosition</code> object as an argument.
 *
 * <p>
 * By design, as you parse through a string with different formats,
 * you can use the same <code>ParsePosition</code>, since the index parameter
 * records the current position.
 *
 * @author      Mark Davis
 * @see         java.text.Format
 */
