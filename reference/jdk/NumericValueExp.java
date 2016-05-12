_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link NumericValueExp} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link NumericValueExp} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public ValueExp apply(ObjectName name)

    /**
     * Applies the ValueExp on a MBean.
     *
     * @param name The name of the MBean on which the ValueExp will be applied.
     *
     * @return  The <CODE>ValueExp</CODE>.
     *
     * @exception BadStringOperationException
     * @exception BadBinaryOpValueExpException
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public String toString()  {

    /**
     * Returns the string representing the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public boolean isLong()  {

    /**
     * Returns true is if the numeric value is a long, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public long longValue()  {

    /**
     * Returns a long numeric value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public double doubleValue()  {

    /**
     * Returns a double numeric value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    NumericValueExp(Number val)

    /** Creates a new NumericValue representing the numeric literal @{code val}.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    public NumericValueExp() {

    /**
     * Basic constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField val Number The numeric value
     *
     * <p>The <b>serialVersionUID</b> of this class is <code>-4679739485102359104L</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NumericValueExp.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * This class represents numbers that are arguments to relational constraints.
 * A NumericValueExp may be used anywhere a ValueExp is required.
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-4679739485102359104L</code>.
 *
 * @serial include
 *
 * @since 1.5
 */
