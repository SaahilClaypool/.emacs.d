_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    private static String attributeType(Method getter, Method setter)

    /**
     * Finds the type of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public boolean equals(Object o) {

    /**
     * Compare this MBeanAttributeInfo to another.
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanAttributeInfo such
     * that its {@link #getName()}, {@link #getType()}, {@link
     * #getDescription()}, {@link #isReadable()}, {@link
     * #isWritable()}, and {@link #isIs()} values are equal (not
     * necessarily identical) to those of this MBeanAttributeInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public boolean isIs() {

    /**
     * Indicates if this attribute has an "is" getter.
     *
     * @return true if this attribute has an "is" getter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public boolean isWritable() {

    /**
     * Whether new values can be written to the attribute.
     *
     * @return True if the attribute can be written to, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public boolean isReadable() {

    /**
     * Whether the value of the attribute can be read.
     *
     * @return True if the attribute can be read, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public String getType() {

    /**
     * Returns the class name of the attribute.
     *
     * @return the class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public MBeanAttributeInfo(String name,
                              String description,
                              Method getter,
                              Method setter) throws IntrospectionException {

    /**
     * <p>This constructor takes the name of a simple attribute, and Method
     * objects for reading and writing the attribute.  The {@link Descriptor}
     * of the constructed object will include fields contributed by any
     * annotations on the {@code Method} objects that contain the
     * {@link DescriptorKey} meta-annotation.
     *
     * @param name The programmatic name of the attribute.
     * @param description A human readable description of the attribute.
     * @param getter The method used for reading the attribute value.
     *          May be null if the property is write-only.
     * @param setter The method used for writing the attribute value.
     *          May be null if the attribute is read-only.
     * @exception IntrospectionException There is a consistency
     * problem in the definition of this attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public MBeanAttributeInfo(String name,
                              String type,
                              String description,
                              boolean isReadable,
                              boolean isWritable,
                              boolean isIs,
                              Descriptor descriptor) {

    /**
     * Constructs an <CODE>MBeanAttributeInfo</CODE> object.
     *
     * @param name The name of the attribute.
     * @param type The type or class name of the attribute.
     * @param description A human readable description of the attribute.
     * @param isReadable True if the attribute has a getter method, false otherwise.
     * @param isWritable True if the attribute has a setter method, false otherwise.
     * @param isIs True if this attribute has an "is" getter, false otherwise.
     * @param descriptor The descriptor for the attribute.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @throws IllegalArgumentException if {@code isIs} is true but
     * {@code isReadable} is not, or if {@code isIs} is true and
     * {@code type} is not {@code boolean} or {@code java.lang.Boolean}.
     * (New code should always use {@code boolean} rather than
     * {@code java.lang.Boolean}.)
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    public MBeanAttributeInfo(String name,
                              String type,
                              String description,
                              boolean isReadable,
                              boolean isWritable,
                              boolean isIs) {

    /**
     * Constructs an <CODE>MBeanAttributeInfo</CODE> object.
     *
     * @param name The name of the attribute.
     * @param type The type or class name of the attribute.
     * @param description A human readable description of the attribute.
     * @param isReadable True if the attribute has a getter method, false otherwise.
     * @param isWritable True if the attribute has a setter method, false otherwise.
     * @param isIs True if this attribute has an "is" getter, false otherwise.
     *
     * @throws IllegalArgumentException if {@code isIs} is true but
     * {@code isReadable} is not, or if {@code isIs} is true and
     * {@code type} is not {@code boolean} or {@code java.lang.Boolean}.
     * (New code should always use {@code boolean} rather than
     * {@code java.lang.Boolean}.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    private final boolean is;

    /**
     * @serial Indicates if this method is a "is"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    private final boolean isRead;

    /**
     * @serial The attribute read right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    private final boolean isWrite;

    /**
     * @serial The attribute write right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
    private final String attributeType;

    /**
     * @serial The actual attribute type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanAttributeInfo.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * Describes an MBean attribute exposed for management.  Instances of
 * this class are immutable.  Subclasses may be mutable but this is
 * not recommended.
 *
 * @since 1.5
 */
