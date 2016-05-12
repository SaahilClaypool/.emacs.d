_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    public boolean equals(Object o) {

    /**
     * Compare this MBeanConstructorInfo to another.
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanConstructorInfo such
     * that its {@link #getName()}, {@link #getDescription()},
     * {@link #getSignature()}, and {@link #getDescriptor()}
     * values are equal (not necessarily
     * identical) to those of this MBeanConstructorInfo.  Two
     * signature arrays are equal if their elements are pairwise
     * equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    public MBeanParameterInfo[] getSignature() {

    /**
     * <p>Returns the list of parameters for this constructor.  Each
     * parameter is described by an <CODE>MBeanParameterInfo</CODE>
     * object.</p>
     *
     * <p>The returned array is a shallow copy of the internal array,
     * which means that it is a copy of the internal array of
     * references to the <CODE>MBeanParameterInfo</CODE> objects but
     * that each referenced <CODE>MBeanParameterInfo</CODE> object is
     * not copied.</p>
     *
     * @return  An array of <CODE>MBeanParameterInfo</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
     public Object clone () {

    /**
     * <p>Returns a shallow clone of this instance.  The clone is
     * obtained by simply calling <tt>super.clone()</tt>, thus calling
     * the default native shallow cloning mechanism implemented by
     * <tt>Object.clone()</tt>.  No deeper cloning of any internal
     * field is made.</p>
     *
     * <p>Since this class is immutable, cloning is chiefly of
     * interest to subclasses.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    public MBeanConstructorInfo(String name,
                                String description,
                                MBeanParameterInfo[] signature,
                                Descriptor descriptor) {

    /**
     * Constructs an <CODE>MBeanConstructorInfo</CODE> object.
     *
     * @param name The name of the constructor.
     * @param signature <CODE>MBeanParameterInfo</CODE> objects
     * describing the parameters(arguments) of the constructor.  This
     * may be null with the same effect as a zero-length array.
     * @param description A human readable description of the constructor.
     * @param descriptor The descriptor for the constructor.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    public MBeanConstructorInfo(String name,
                                String description,
                                MBeanParameterInfo[] signature) {

    /**
     * Constructs an <CODE>MBeanConstructorInfo</CODE> object.
     *
     * @param name The name of the constructor.
     * @param signature <CODE>MBeanParameterInfo</CODE> objects
     * describing the parameters(arguments) of the constructor.  This
     * may be null with the same effect as a zero-length array.
     * @param description A human readable description of the constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    public MBeanConstructorInfo(String description, Constructor<?> constructor) {

    /**
     * Constructs an <CODE>MBeanConstructorInfo</CODE> object.  The
     * {@link Descriptor} of the constructed object will include
     * fields contributed by any annotations on the {@code
     * Constructor} object that contain the {@link DescriptorKey}
     * meta-annotation.
     *
     * @param description A human readable description of the operation.
     * @param constructor The <CODE>java.lang.reflect.Constructor</CODE>
     * object describing the MBean constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    private final MBeanParameterInfo[] signature;

    /**
     * @serial The signature of the method, that is, the class names of the arguments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
    private final transient boolean arrayGettersSafe;

    /** @see MBeanInfo#arrayGettersSafe */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanConstructorInfo.java
public class MBeanConstructorInfo extends MBeanFeatureInfo implements Cloneable {

/**
 * Describes a constructor exposed by an MBean.  Instances of this
 * class are immutable.  Subclasses may be mutable but this is not
 * recommended.
 *
 * @since 1.5
 */
