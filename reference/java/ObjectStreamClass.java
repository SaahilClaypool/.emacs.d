_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {

    /**
     * Returns true if classes are defined in the same package, false
     * otherwise.
     *
     * Copied from the Merlin java.io.ObjectStreamClass.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Method getInheritableMethod(Class<?> cl, String name,
                                               Class<?>[] argTypes,
                                               Class<?> returnType)

    /**
     * Returns non-static, non-abstract method with given signature provided it
     * is defined by or accessible (via inheritance) by the given class, or
     * null if no match found.  Access checks are disabled on the returned
     * method (if any).
     *
     * Copied from the Merlin java.io.ObjectStreamClass.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private final static Comparator compareObjStrFieldsByName

    /**
     * Comparator for ObjectStreamFields by name
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final ObjectStreamField[] NO_FIELDS =

    /**
     * Set serialPersistentFields of a Serializable class to this value to
     * denote that the class has no Serializable fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static final long serialVersionUID = -6120832682080437368L;

    /** use serialVersionUID from JDK 1.1. for interoperability */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean hasStaticInitializer(Class<?> cl) {

    /**
     * Returns true if the given class defines a static initializer method,
     * false otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private String rmiiiopOptionalDataRepId = null;

    /**
     * Beginning in Java to IDL ptc/02-01-12, RMI-IIOP has a
     * stream format version 2 which puts a fake valuetype around
     * a Serializable's optional custom data.  This valuetype has
     * a special repository ID made from the Serializable's
     * information which we are pre-computing and
     * storing here.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean initialized = false;

    /**
     * Flag indicating whether or not this instance has
     * successfully completed initialization.  This is to
     * try to fix bug 4373844.  Working to move to
     * reusing java.io.ObjectStreamClass for JDK 1.5.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static String getSignature(Class<?> clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getSerializableConstructor(Class<?> cl) {

    /**
     * Returns subclass-accessible no-arg constructor of first non-serializable
     * superclass, or null if none found.  Access checks are disabled on the
     * returned constructor (if any).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getExternalizableConstructor(Class<?> cl) {

    /**
     * Returns public no-arg constructor of given class, or null if none found.
     * Access checks are disabled on the returned constructor (if any), since
     * the defining class may still be non-public.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    Object newInstance()

    /**
     * Creates a new instance of the represented class.  If the class is
     * externalizable, invokes its public no-arg constructor; otherwise, if the
     * class is serializable, invokes the no-arg constructor of the first
     * non-serializable superclass.  Throws UnsupportedOperationException if
     * this class descriptor is not associated with a class, if the associated
     * class is non-serializable or if the appropriate no-arg constructor is
     * inaccessible/unavailable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean isCustomMarshaled() {

    /**
     * Returns when or not this class should be custom
     * marshaled (use chunking).  This should happen if
     * it is Externalizable OR if it or
     * any of its superclasses has a writeObject method,
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean hasReadObject() {

    /**
     * Return whether the class has a readObject method
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getRMIIIOPOptionalDataRepId() {

    /**
     * This will return null if there is no writeObject method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private String computeRMIIIOPOptionalDataRepId() {

    /**
     * Java to IDL ptc-02-01-12 1.5.1
     *
     * "The rep_id string passed to the start_value method must be
     * 'RMI:org.omg.custom.class:hashcode:suid' where class is the
     * fully-qualified name of the class whose writeObject method
     * is being invoked and hashcode and suid are the class's hashcode
     * and SUID."
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Method getPrivateMethod(Class<?> cl, String name,
                                           Class<?>[] argTypes,
                                           Class<?> returnType)

    /**
     * Returns non-static private method with given signature defined by given
     * class, or null if none found.  Access checks are disabled on the
     * returned method (if any).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String toString() {

    /**
     * Return a string describing this ObjectStreamClass.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     * @return The ObjectStreamField object of the named field or null if there
     * is no such named field.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public ObjectStreamField[] getFields() {

    /**
     * Return an array of the fields of this serializable class.
     * @return an array containing an element for each persistent
     * field of this class. Returns an array of length zero if
     * there are no fields.
     * @since JDK1.2
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final Class<?> forClass() {

    /**
     * Return the class in the local VM that this version is mapped to.
     * Null is returned if there is no corresponding local class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getActualSerialVersionUIDStr() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getActualSerialVersionUID() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getActualSerialVersionUID( java.lang.Class<?> clazz )

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getSerialVersionUIDStr() {

    /**
     * Return the serialVersionUID string for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getSerialVersionUID( java.lang.Class<?> clazz) {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getName() {

    /**
     * The name of the class described by this descriptor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static final ObjectStreamClass lookup(Class<?> cl)

    /** Find the descriptor for a class that can be serialized.  Null
     * is returned if the specified class does not implement
     * java.io.Serializable or java.io.Externalizable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean isEnum;

    /** true if represents enum type */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClass.java
public class ObjectStreamClass implements java.io.Serializable {

/**
 * A ObjectStreamClass describes a class that can be serialized to a stream
 * or a class that was serialized to a stream.  It contains the name
 * and the serialVersionUID of the class.
 * <br>
 * The ObjectStreamClass for a specific class loaded in this Java VM can
 * be found using the lookup method.
 *
 * @author  Roger Riggs
 * @since   JDK1.1
 */
