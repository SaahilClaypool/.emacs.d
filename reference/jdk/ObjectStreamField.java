_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string describing this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public boolean typeEquals(ObjectStreamField other) {

    /**
     * Compare the types of two class descriptors.
     * The match if they have the same primitive types.
     * or if they are both objects and the object types match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public int compareTo(Object o) {

    /**
     * Compare this with another ObjectStreamField.
     * return -1 if this is smaller, 0 if equal, 1 if greater
     * types that are primitives are "smaller" than objects.
     * if equal, the names are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public boolean isPrimitive() {

    /**
     * test if this field is a primitive or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public Class getType() {

    /**
     * Get the type of the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    ObjectStreamField(String n, char t, Field f, String ts)

    /**
     * Create an ObjectStreamField containing a reflected Field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    ObjectStreamField(String n, Class clazz) {

    /**
     * Create a named field with the specified type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
public class ObjectStreamField implements Comparable

/**
 * A description of a field in a serializable class.
 * A array of these is used to declare the persistent fields of
 * a class.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string describing this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public boolean typeEquals(ObjectStreamField other) {

    /**
     * Compare the types of two class descriptors.
     * The match if they have the same primitive types.
     * or if they are both objects and the object types match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public int compareTo(Object o) {

    /**
     * Compare this with another ObjectStreamField.
     * return -1 if this is smaller, 0 if equal, 1 if greater
     * types that are primitives are "smaller" than objects.
     * if equal, the names are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public boolean isPrimitive() {

    /**
     * test if this field is a primitive or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public Class getType() {

    /**
     * Get the type of the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    ObjectStreamField(String n, char t, Field f, String ts)

    /**
     * Create an ObjectStreamField containing a reflected Field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    ObjectStreamField(String n, Class clazz) {

    /**
     * Create a named field with the specified type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
/**

/**
 * This is duplicated here somewhat in haste since we can't
 * expose this class outside of the com.sun.corba.se.impl.io
 * package for security reasons.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private static String getClassSignature(Class<?> cl) {

    /**
     * Returns JVM type signature for given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    String getSignature() {

    /**
     * Returns JVM type signature of field (similar to getTypeString, except
     * that signature strings are returned for primitive fields as well).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    Field getField() {

    /**
     * Returns field represented by this ObjectStreamField, or null if
     * ObjectStreamField is not associated with an actual field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string that describes this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Compare this field with another <code>ObjectStreamField</code>.  Return
     * -1 if this is smaller, 0 if equal, 1 if greater.  Types that are
     * primitives are "smaller" than object types.  If equal, the field names
     * are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public boolean isUnshared() {

    /**
     * Returns boolean value indicating whether or not the serializable field
     * represented by this ObjectStreamField instance is unshared.
     *
     * @return {@code true} if this field is unshared
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Return true if this field has a primitive type.
     *
     * @return  true if and only if this field corresponds to a primitive type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Offset within instance data.
     *
     * @param   offset the offset of the field
     * @see #getOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Offset of field within instance data.
     *
     * @return  the offset of this field
     * @see #setOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Return the JVM type signature.
     *
     * @return  null if this field has a primitive type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Returns character encoding of field type.  The encoding is as follows:
     * <blockquote><pre>
     * B            byte
     * C            char
     * D            double
     * F            float
     * I            int
     * J            long
     * L            class or interface
     * S            short
     * Z            boolean
     * [            array
     * </pre></blockquote>
     *
     * @return  the typecode of the serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    @CallerSensitive

    /**
     * Get the type of the field.  If the type is non-primitive and this
     * <code>ObjectStreamField</code> was obtained from a deserialized {@link
     * ObjectStreamClass} instance, then <code>Object.class</code> is returned.
     * Otherwise, the <code>Class</code> object for the type of the field is
     * returned.
     *
     * @return  a <code>Class</code> object representing the type of the
     *          serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     *
     * @return  a <code>String</code> representing the name of the serializable
     *          field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    ObjectStreamField(Field field, boolean unshared, boolean showType) {

    /**
     * Creates an ObjectStreamField representing the given field with the
     * specified unshared setting.  For compatibility with the behavior of
     * earlier serialization implementations, a "showType" parameter is
     * necessary to govern whether or not a getType() call on this
     * ObjectStreamField (if non-primitive) will return Object.class (as
     * opposed to a more specific reference type).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    ObjectStreamField(String name, String signature, boolean unshared) {

    /**
     * Creates an ObjectStreamField representing a field with the given name,
     * signature and unshared setting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public ObjectStreamField(String name, Class<?> type, boolean unshared) {

    /**
     * Creates an ObjectStreamField representing a serializable field with the
     * given name and type.  If unshared is false, values of the represented
     * field are serialized and deserialized in the default manner--if the
     * field is non-primitive, object values are serialized and deserialized as
     * if they had been written and read by calls to writeObject and
     * readObject.  If unshared is true, values of the represented field are
     * serialized and deserialized as if they had been written and read by
     * calls to writeUnshared and readUnshared.
     *
     * @param   name field name
     * @param   type field type
     * @param   unshared if false, write/read field values in the same manner
     *          as writeObject/readObject; if true, write/read in the same
     *          manner as writeUnshared/readUnshared
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public ObjectStreamField(String name, Class<?> type) {

    /**
     * Create a Serializable field with the specified type.  This field should
     * be documented with a <code>serialField</code> tag.
     *
     * @param   name the name of the serializable field
     * @param   type the <code>Class</code> object of the serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final Field field;

    /** corresponding reflective field object, if any */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final Class<?> type;

    /** field type (Object.class if unknown non-primitive type) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final String name;

    /** field name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
public class ObjectStreamField

/**
 * A description of a Serializable field from a Serializable class.  An array
 * of ObjectStreamFields is used to declare the Serializable fields of a class.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see ObjectStreamClass
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string describing this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public boolean typeEquals(ObjectStreamField other) {

    /**
     * Compare the types of two class descriptors.
     * The match if they have the same primitive types.
     * or if they are both objects and the object types match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public int compareTo(Object o) {

    /**
     * Compare this with another ObjectStreamField.
     * return -1 if this is smaller, 0 if equal, 1 if greater
     * types that are primitives are "smaller" than objects.
     * if equal, the names are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public boolean isPrimitive() {

    /**
     * test if this field is a primitive or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public Class getType() {

    /**
     * Get the type of the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    ObjectStreamField(String n, char t, Field f, String ts)

    /**
     * Create an ObjectStreamField containing a reflected Field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
    ObjectStreamField(String n, Class clazz) {

    /**
     * Create a named field with the specified type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamField.java
public class ObjectStreamField implements Comparable

/**
 * A description of a field in a serializable class.
 * A array of these is used to declare the persistent fields of
 * a class.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string describing this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public boolean typeEquals(ObjectStreamField other) {

    /**
     * Compare the types of two class descriptors.
     * The match if they have the same primitive types.
     * or if they are both objects and the object types match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public int compareTo(Object o) {

    /**
     * Compare this with another ObjectStreamField.
     * return -1 if this is smaller, 0 if equal, 1 if greater
     * types that are primitives are "smaller" than objects.
     * if equal, the names are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public boolean isPrimitive() {

    /**
     * test if this field is a primitive or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public Class getType() {

    /**
     * Get the type of the field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    ObjectStreamField(String n, char t, Field f, String ts)

    /**
     * Create an ObjectStreamField containing a reflected Field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
    ObjectStreamField(String n, Class clazz) {

    /**
     * Create a named field with the specified type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ObjectStreamField.java
/**

/**
 * This is duplicated here somewhat in haste since we can't
 * expose this class outside of the com.sun.corba.se.impl.io
 * package for security reasons.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private static String getClassSignature(Class<?> cl) {

    /**
     * Returns JVM type signature for given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    String getSignature() {

    /**
     * Returns JVM type signature of field (similar to getTypeString, except
     * that signature strings are returned for primitive fields as well).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    Field getField() {

    /**
     * Returns field represented by this ObjectStreamField, or null if
     * ObjectStreamField is not associated with an actual field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public String toString() {

    /**
     * Return a string that describes this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Compare this field with another <code>ObjectStreamField</code>.  Return
     * -1 if this is smaller, 0 if equal, 1 if greater.  Types that are
     * primitives are "smaller" than object types.  If equal, the field names
     * are compared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public boolean isUnshared() {

    /**
     * Returns boolean value indicating whether or not the serializable field
     * represented by this ObjectStreamField instance is unshared.
     *
     * @return {@code true} if this field is unshared
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Return true if this field has a primitive type.
     *
     * @return  true if and only if this field corresponds to a primitive type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Offset within instance data.
     *
     * @param   offset the offset of the field
     * @see #getOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Offset of field within instance data.
     *
     * @return  the offset of this field
     * @see #setOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Return the JVM type signature.
     *
     * @return  null if this field has a primitive type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    // REMIND: deprecate?

    /**
     * Returns character encoding of field type.  The encoding is as follows:
     * <blockquote><pre>
     * B            byte
     * C            char
     * D            double
     * F            float
     * I            int
     * J            long
     * L            class or interface
     * S            short
     * Z            boolean
     * [            array
     * </pre></blockquote>
     *
     * @return  the typecode of the serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    @CallerSensitive

    /**
     * Get the type of the field.  If the type is non-primitive and this
     * <code>ObjectStreamField</code> was obtained from a deserialized {@link
     * ObjectStreamClass} instance, then <code>Object.class</code> is returned.
     * Otherwise, the <code>Class</code> object for the type of the field is
     * returned.
     *
     * @return  a <code>Class</code> object representing the type of the
     *          serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public String getName() {

    /**
     * Get the name of this field.
     *
     * @return  a <code>String</code> representing the name of the serializable
     *          field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    ObjectStreamField(Field field, boolean unshared, boolean showType) {

    /**
     * Creates an ObjectStreamField representing the given field with the
     * specified unshared setting.  For compatibility with the behavior of
     * earlier serialization implementations, a "showType" parameter is
     * necessary to govern whether or not a getType() call on this
     * ObjectStreamField (if non-primitive) will return Object.class (as
     * opposed to a more specific reference type).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    ObjectStreamField(String name, String signature, boolean unshared) {

    /**
     * Creates an ObjectStreamField representing a field with the given name,
     * signature and unshared setting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public ObjectStreamField(String name, Class<?> type, boolean unshared) {

    /**
     * Creates an ObjectStreamField representing a serializable field with the
     * given name and type.  If unshared is false, values of the represented
     * field are serialized and deserialized in the default manner--if the
     * field is non-primitive, object values are serialized and deserialized as
     * if they had been written and read by calls to writeObject and
     * readObject.  If unshared is true, values of the represented field are
     * serialized and deserialized as if they had been written and read by
     * calls to writeUnshared and readUnshared.
     *
     * @param   name field name
     * @param   type field type
     * @param   unshared if false, write/read field values in the same manner
     *          as writeObject/readObject; if true, write/read in the same
     *          manner as writeUnshared/readUnshared
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    public ObjectStreamField(String name, Class<?> type) {

    /**
     * Create a Serializable field with the specified type.  This field should
     * be documented with a <code>serialField</code> tag.
     *
     * @param   name the name of the serializable field
     * @param   type the <code>Class</code> object of the serializable field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final Field field;

    /** corresponding reflective field object, if any */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final Class<?> type;

    /** field type (Object.class if unknown non-primitive type) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
    private final String name;

    /** field name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamField.java
public class ObjectStreamField

/**
 * A description of a Serializable field from a Serializable class.  An array
 * of ObjectStreamFields is used to declare the Serializable fields of a class.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see ObjectStreamClass
 * @since 1.2
 */
