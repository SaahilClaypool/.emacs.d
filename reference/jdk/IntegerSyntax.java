_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    public String toString() {

    /**
     * Returns a string value corresponding to this integer attribute. The
     * string value is just this integer attribute's integer value converted to
     * a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    public int hashCode() {

    /**
     * Returns a hash code value for this integer attribute. The hash code is
     * just this integer attribute's integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    public boolean equals(Object object) {

    /**
     * Returns whether this integer attribute is equivalent to the passed in
     * object. To be equivalent, all of the following conditions must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class IntegerSyntax.
     * <LI>
     * This integer attribute's value and <CODE>object</CODE>'s value are
     * equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this integer
     *          attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    public int getValue() {

    /**
     * Returns this integer attribute's integer value.
     * @return the integer value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    protected IntegerSyntax(int value, int lowerBound, int upperBound) {

    /**
     * Construct a new integer attribute with the given integer value, which
     * must lie within the given range.
     *
     * @param  value       Integer value.
     * @param  lowerBound  Lower bound.
     * @param  upperBound  Upper bound.
     *
     * @exception  IllegalArgumentException
     *     (Unchecked exception) Thrown if <CODE>value</CODE> is less than
     *     <CODE>lowerBound</CODE> or greater than
     *     <CODE>upperBound</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    protected IntegerSyntax(int value) {

    /**
     * Construct a new integer attribute with the given integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
    private int value;

    /**
     * This integer attribute's integer value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/IntegerSyntax.java
public abstract class IntegerSyntax implements Serializable, Cloneable {

/**
 * Class IntegerSyntax is an abstract base class providing the common
 * implementation of all attributes with integer values.
 * <P>
 * Under the hood, an integer attribute is just an integer. You can get an
 * integer attribute's integer value by calling {@link #getValue()
 * getValue()}. An integer attribute's integer value is
 * established when it is constructed (see {@link #IntegerSyntax(int)
 * IntegerSyntax(int)}). Once constructed, an integer attribute's
 * value is immutable.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
