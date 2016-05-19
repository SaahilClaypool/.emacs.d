_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public static final ObjectStreamField[] NO_FIELDS =

    /**
     * Set serialPersistentFields of a Serializable class to this value to
     * denote that the class has no Serializable fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    private static final long serialVersionUID = -6120832682080437368L;

    /** use serialVersionUID from JDK 1.1. for interoperability */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    static String getSignature(Class<?> clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final String toString() {

    /**
     * Return a string describing this ObjectStreamClass_1_3_1.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     * @return The ObjectStreamField object of the named field or null if there
     * is no such named field.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final Class<?> forClass() {

    /**
     * Return the class in the local VM that this version is mapped to.
     * Null is returned if there is no corresponding local class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final String getActualSerialVersionUIDStr() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final long getActualSerialVersionUID() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public static final long getActualSerialVersionUID( java.lang.Class<?> clazz )

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final String getSerialVersionUIDStr() {

    /**
     * Return the serialVersionUID string for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public static final long getSerialVersionUID( java.lang.Class<?> clazz) {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    public final String getName() {

    /**
     * The name of the class described by this descriptor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
    static final ObjectStreamClass_1_3_1 lookup(Class<?> cl)

    /** Find the descriptor for a class that can be serialized.  Null
     * is returned if the specified class does not implement
     * java.io.Serializable or java.io.Externalizable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectStreamClass_1_3_1.java
/**

/**
 * This is duplicated here to preserve the JDK 1.3.1FCS behavior
 * of calculating the OMG hash code incorrectly when serialPersistentFields
 * is used, but some of the fields no longer exist in the class itself.
 *
 * We have to duplicate it since we aren't allowed to modify the
 * com.sun.corba.se.impl.io version further, and can't make it
 * public outside of its package for security reasons.
 */
