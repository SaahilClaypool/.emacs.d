_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
    public boolean equals(Object o) {

    /**
     * Compare this MBeanParameterInfo to another.
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanParameterInfo such
     * that its {@link #getName()}, {@link #getType()},
     * {@link #getDescriptor()}, and {@link
     * #getDescription()} values are equal (not necessarily identical)
     * to those of this MBeanParameterInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
    public String getType() {

    /**
     * Returns the type or class name of the data.
     *
     * @return the type string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
     public Object clone () {

    /**
     * <p>Returns a shallow clone of this instance.
     * The clone is obtained by simply calling <tt>super.clone()</tt>,
     * thus calling the default native shallow cloning mechanism
     * implemented by <tt>Object.clone()</tt>.
     * No deeper cloning of any internal field is made.</p>
     *
     * <p>Since this class is immutable, cloning is chiefly of
     * interest to subclasses.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
    public MBeanParameterInfo(String name,
                              String type,
                              String description,
                              Descriptor descriptor) {

    /**
     * Constructs an <CODE>MBeanParameterInfo</CODE> object.
     *
     * @param name The name of the data
     * @param type The type or class name of the data
     * @param description A human readable description of the data. Optional.
     * @param descriptor The descriptor for the operation.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
    public MBeanParameterInfo(String name,
                              String type,
                              String description) {

    /**
     * Constructs an <CODE>MBeanParameterInfo</CODE> object.
     *
     * @param name The name of the data
     * @param type The type or class name of the data
     * @param description A human readable description of the data. Optional.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
    private final String type;

    /**
     * @serial The type or class name of the data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanParameterInfo.java
public class MBeanParameterInfo extends MBeanFeatureInfo implements Cloneable {

/**
 * Describes an argument of an operation exposed by an MBean.
 * Instances of this class are immutable.  Subclasses may be mutable
 * but this is not recommended.
 *
 * @since 1.5
 */
