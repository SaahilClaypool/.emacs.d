_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public Object readResolve() throws ObjectStreamException {

    /**
     * Replace an object read from an {@link
     * java.io.ObjectInputStream} with the unique instance for that
     * value.
     *
     * @return the replacement object.
     *
     * @exception ObjectStreamException if the read object cannot be
     * resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public String toString() {

    /**
     * Returns a string representation of this <code>SimpleType</code> instance.
     * <p>
     * The string representation consists of
     * the name of this class (ie <code>javax.management.openmbean.SimpleType</code>) and the type name
     * for this instance (which is the java class name of the values this <code>SimpleType</code> instance represents).
     * <p>
     * As <code>SimpleType</code> instances are immutable, the string representation for this instance is calculated once,
     * on the first call to <code>toString</code>, and then the same value is returned for subsequent calls.
     *
     * @return  a string representation of this <code>SimpleType</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public int hashCode() {

    /**
     * Returns the hash code value for this <code>SimpleType</code> instance.
     * The hash code of a <code>SimpleType</code> instance is the the hash code of
     * the string value returned by the {@link OpenType#getClassName() getClassName} method.
     * <p>
     * As <code>SimpleType</code> instances are immutable, the hash code for this instance is calculated once,
     * on the first call to <code>hashCode</code>, and then the same value is returned for subsequent calls.
     *
     * @return  the hash code value for this <code>SimpleType</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public boolean equals(Object obj) {

    /**
     * Compares the specified <code>obj</code> parameter with this <code>SimpleType</code> instance for equality.
     * <p>
     * Two <code>SimpleType</code> instances are equal if and only if their
     * {@link OpenType#getClassName() getClassName} methods return the same value.
     *
     * @param  obj  the object to be compared for equality with this <code>SimpleType</code> instance;
     *              if <var>obj</var> is <code>null</code> or is not an instance of the class <code>SimpleType</code>,
     *              <code>equals</code> returns <code>false</code>.
     *
     * @return  <code>true</code> if the specified object is equal to this <code>SimpleType</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public boolean isValue(Object obj) {

    /**
     * Tests whether <var>obj</var> is a value for this
     * <code>SimpleType</code> instance.  <p> This method returns
     * <code>true</code> if and only if <var>obj</var> is not null and
     * <var>obj</var>'s class name is the same as the className field
     * defined for this <code>SimpleType</code> instance (ie the class
     * name returned by the {@link OpenType#getClassName()
     * getClassName} method).
     *
     * @param obj the object to be tested.
     *
     * @return <code>true</code> if <var>obj</var> is a value for this
     * <code>SimpleType</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<ObjectName> OBJECTNAME =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>javax.management.ObjectName</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Date> DATE =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.util.Date</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<BigInteger> BIGINTEGER =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.math.BigInteger</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<BigDecimal> BIGDECIMAL =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.math.BigDecimal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<String> STRING =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.String</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Double> DOUBLE =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Double</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Float> FLOAT =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Float</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Long> LONG =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Long</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Integer> INTEGER =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Integer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Short> SHORT =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Short</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Byte> BYTE =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Byte</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Character> CHARACTER =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Character</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Boolean> BOOLEAN =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Boolean</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
    public static final SimpleType<Void> VOID =

    /**
     * The <code>SimpleType</code> instance describing values whose
     * Java class name is <code>java.lang.Void</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/SimpleType.java
public final class SimpleType<T> extends OpenType<T> {

/**
 * The <code>SimpleType</code> class is the <i>open type</i> class whose instances describe
 * all <i>open data</i> values which are neither arrays,
 * nor {@link CompositeData CompositeData} values,
 * nor {@link TabularData TabularData} values.
 * It predefines all its possible instances as static fields, and has no public constructor.
 * <p>
 * Given a <code>SimpleType</code> instance describing values whose Java class name is <i>className</i>,
 * the internal fields corresponding to the name and description of this <code>SimpleType</code> instance
 * are also set to <i>className</i>.
 * In other words, its methods <code>getClassName</code>, <code>getTypeName</code> and <code>getDescription</code>
 * all return the same string value <i>className</i>.
 *
 * @since 1.5
 */
