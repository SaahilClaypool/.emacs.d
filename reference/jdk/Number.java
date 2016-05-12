_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    private void compileLocals(NodeCounterGenerator nodeCounterGen,
                               MatchGenerator matchGen,
                               InstructionList il)

    /**
     * This method compiles code that is common to matchesFrom() and
     * matchesCount() in the auxillary class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    private void compileConstructor(ClassGenerator classGen) {

    /**
     * Compiles a constructor for the class <tt>_className</tt> that
     * inherits from {Any,Single,Multiple}NodeCounter. This constructor
     * simply calls the same constructor in the super class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean isDefault() {

    /**
     * Returns <tt>true</tt> if this instance of number has neither
     * a from nor a count pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean hasValue() {

    /**
     * True if the has specified a value for this instance of number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
final class Number extends Instruction implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate this operation directly to a double.
   *
   * @param xctxt The runtime execution context.
   *
   * @return The result of the operation as a double.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
  public XObject operate(XObject right) throws javax.xml.transform.TransformerException

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
public class Number extends UnaryOperation

/**
 * The 'number()' operation expression executer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    private static final long serialVersionUID = -8742448824652078965L;

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public short shortValue() {

    /**
     * Returns the value of the specified number as a {@code short},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code short}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code short}.
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public byte byteValue() {

    /**
     * Returns the value of the specified number as a {@code byte},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code byte}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code byte}.
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract double doubleValue();

    /**
     * Returns the value of the specified number as a {@code double},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract float floatValue();

    /**
     * Returns the value of the specified number as a {@code float},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract long longValue();

    /**
     * Returns the value of the specified number as a {@code long},
     * which may involve rounding or truncation.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code long}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
public abstract class Number implements java.io.Serializable {

/**
 * The abstract class {@code Number} is the superclass of platform
 * classes representing numeric values that are convertible to the
 * primitive types {@code byte}, {@code double}, {@code float}, {@code
 * int}, {@code long}, and {@code short}.
 *
 * The specific semantics of the conversion from the numeric value of
 * a particular {@code Number} implementation to a given primitive
 * type is defined by the {@code Number} implementation in question.
 *
 * For platform classes, the conversion is often analogous to a
 * narrowing primitive conversion or a widening primitive conversion
 * as defining in <cite>The Java&trade; Language Specification</cite>
 * for converting between primitive types.  Therefore, conversions may
 * lose information about the overall magnitude of a numeric value, may
 * lose precision, and may even return a result of a different sign
 * than the input.
 *
 * See the documentation of a given {@code Number} implementation for
 * conversion details.
 *
 * @author      Lee Boynton
 * @author      Arthur van Hoff
 * @jls 5.1.2 Widening Primitive Conversions
 * @jls 5.1.3 Narrowing Primitive Conversions
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    private void compileLocals(NodeCounterGenerator nodeCounterGen,
                               MatchGenerator matchGen,
                               InstructionList il)

    /**
     * This method compiles code that is common to matchesFrom() and
     * matchesCount() in the auxillary class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    private void compileConstructor(ClassGenerator classGen) {

    /**
     * Compiles a constructor for the class <tt>_className</tt> that
     * inherits from {Any,Single,Multiple}NodeCounter. This constructor
     * simply calls the same constructor in the super class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean isDefault() {

    /**
     * Returns <tt>true</tt> if this instance of number has neither
     * a from nor a count pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean hasValue() {

    /**
     * True if the has specified a value for this instance of number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Number.java
final class Number extends Instruction implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate this operation directly to a double.
   *
   * @param xctxt The runtime execution context.
   *
   * @return The result of the operation as a double.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
  public XObject operate(XObject right) throws javax.xml.transform.TransformerException

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Number.java
public class Number extends UnaryOperation

/**
 * The 'number()' operation expression executer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    private static final long serialVersionUID = -8742448824652078965L;

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public short shortValue() {

    /**
     * Returns the value of the specified number as a {@code short},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code short}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code short}.
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public byte byteValue() {

    /**
     * Returns the value of the specified number as a {@code byte},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code byte}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code byte}.
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract double doubleValue();

    /**
     * Returns the value of the specified number as a {@code double},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract float floatValue();

    /**
     * Returns the value of the specified number as a {@code float},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
    public abstract long longValue();

    /**
     * Returns the value of the specified number as a {@code long},
     * which may involve rounding or truncation.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code long}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Number.java
public abstract class Number implements java.io.Serializable {

/**
 * The abstract class {@code Number} is the superclass of platform
 * classes representing numeric values that are convertible to the
 * primitive types {@code byte}, {@code double}, {@code float}, {@code
 * int}, {@code long}, and {@code short}.
 *
 * The specific semantics of the conversion from the numeric value of
 * a particular {@code Number} implementation to a given primitive
 * type is defined by the {@code Number} implementation in question.
 *
 * For platform classes, the conversion is often analogous to a
 * narrowing primitive conversion or a widening primitive conversion
 * as defining in <cite>The Java&trade; Language Specification</cite>
 * for converting between primitive types.  Therefore, conversions may
 * lose information about the overall magnitude of a numeric value, may
 * lose precision, and may even return a result of a different sign
 * than the input.
 *
 * See the documentation of a given {@code Number} implementation for
 * conversion details.
 *
 * @author      Lee Boynton
 * @author      Arthur van Hoff
 * @jls 5.1.2 Widening Primitive Conversions
 * @jls 5.1.3 Narrowing Primitive Conversions
 * @since   JDK1.0
 */
