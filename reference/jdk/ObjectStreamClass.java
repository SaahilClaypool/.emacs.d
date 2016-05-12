_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {

    /**
     * Returns true if classes are defined in the same package, false
     * otherwise.
     *
     * Copied from the Merlin java.io.ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private final static Comparator compareObjStrFieldsByName

    /**
     * Comparator for ObjectStreamFields by name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final ObjectStreamField[] NO_FIELDS =

    /**
     * Set serialPersistentFields of a Serializable class to this value to
     * denote that the class has no Serializable fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static final long serialVersionUID = -6120832682080437368L;

    /** use serialVersionUID from JDK 1.1. for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean hasStaticInitializer(Class<?> cl) {

    /**
     * Returns true if the given class defines a static initializer method,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean initialized = false;

    /**
     * Flag indicating whether or not this instance has
     * successfully completed initialization.  This is to
     * try to fix bug 4373844.  Working to move to
     * reusing java.io.ObjectStreamClass for JDK 1.5.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static String getSignature(Class<?> clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getSerializableConstructor(Class<?> cl) {

    /**
     * Returns subclass-accessible no-arg constructor of first non-serializable
     * superclass, or null if none found.  Access checks are disabled on the
     * returned constructor (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getExternalizableConstructor(Class<?> cl) {

    /**
     * Returns public no-arg constructor of given class, or null if none found.
     * Access checks are disabled on the returned constructor (if any), since
     * the defining class may still be non-public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean isCustomMarshaled() {

    /**
     * Returns when or not this class should be custom
     * marshaled (use chunking).  This should happen if
     * it is Externalizable OR if it or
     * any of its superclasses has a writeObject method,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean hasReadObject() {

    /**
     * Return whether the class has a readObject method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getRMIIIOPOptionalDataRepId() {

    /**
     * This will return null if there is no writeObject method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Method getPrivateMethod(Class<?> cl, String name,
                                           Class<?>[] argTypes,
                                           Class<?> returnType)

    /**
     * Returns non-static private method with given signature defined by given
     * class, or null if none found.  Access checks are disabled on the
     * returned method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String toString() {

    /**
     * Return a string describing this ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     * @return The ObjectStreamField object of the named field or null if there
     * is no such named field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public ObjectStreamField[] getFields() {

    /**
     * Return an array of the fields of this serializable class.
     * @return an array containing an element for each persistent
     * field of this class. Returns an array of length zero if
     * there are no fields.
     * @since JDK1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final Class<?> forClass() {

    /**
     * Return the class in the local VM that this version is mapped to.
     * Null is returned if there is no corresponding local class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getActualSerialVersionUIDStr() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getActualSerialVersionUID() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getActualSerialVersionUID( java.lang.Class<?> clazz )

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getSerialVersionUIDStr() {

    /**
     * Return the serialVersionUID string for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getSerialVersionUID( java.lang.Class<?> clazz) {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getName() {

    /**
     * The name of the class described by this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static final ObjectStreamClass lookup(Class<?> cl)

    /** Find the descriptor for a class that can be serialized.  Null
     * is returned if the specified class does not implement
     * java.io.Serializable or java.io.Externalizable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean isEnum;

    /** true if represents enum type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        public boolean equals(Object obj) {

        /**
         * Returns true if the given object is this identical
         * WeakClassKey instance, or, if this object's referent has not
         * been cleared, if the given object is another WeakClassKey
         * instance with the identical non-null referent as this one.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        public int hashCode() {

        /**
         * Returns the identity hash code of the original referent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {

        /**
         * Create a new WeakClassKey to the given object, registered
         * with a queue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static class WeakClassKey extends WeakReference<Class<?>> {

    /**
     *  Weak key for Class objects.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static void processQueue(ReferenceQueue<Class<?>> queue,
                             ConcurrentMap<? extends
                             WeakReference<Class<?>>, ?> map)

    /**
     * Removes from the specified map any keys that have been enqueued
     * on the specified reference queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] matchFields(ObjectStreamField[] fields,
                                                   ObjectStreamClass localDesc)

    /**
     * Matches given set of serializable fields with serializable fields
     * obtained from the given local class descriptor (which contain bindings
     * to reflective Field objects).  Returns list of ObjectStreamFields in
     * which each ObjectStreamField whose signature matches that of a local
     * field contains a Field object for that field; unmatched
     * ObjectStreamFields contain null Field objects.  Shared/unshared settings
     * of the returned ObjectStreamFields also reflect those of matched local
     * ObjectStreamFields.  Throws InvalidClassException if unresolvable type
     * conflicts exist between the two sets of fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class FieldReflectorKey extends WeakReference<Class<?>> {

    /**
     * FieldReflector cache lookup key.  Keys are considered equal if they
     * refer to the same class and equivalent field formats.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static FieldReflector getReflector(ObjectStreamField[] fields,
                                               ObjectStreamClass localDesc)

    /**
     * Matches given set of serializable fields with serializable fields
     * described by the given local class descriptor, and returns a
     * FieldReflector instance capable of setting/getting values from the
     * subset of fields that match (non-matching fields are treated as filler,
     * for which get operations return default values and set operations
     * discard given values).  Throws InvalidClassException if unresolvable
     * type conflicts exist between the two sets of fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void setObjFieldValues(Object obj, Object[] vals) {

        /**
         * Sets the serializable object fields of object obj using values from
         * array vals starting at offset 0.  The caller is responsible for
         * ensuring that obj is of the proper type; however, attempts to set a
         * field with a value of the wrong type will trigger an appropriate
         * ClassCastException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void getObjFieldValues(Object obj, Object[] vals) {

        /**
         * Fetches the serializable object field values of object obj and
         * stores them in array vals starting at offset 0.  The caller is
         * responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void setPrimFieldValues(Object obj, byte[] buf) {

        /**
         * Sets the serializable primitive fields of object obj using values
         * unmarshalled from byte array buf starting at offset 0.  The caller
         * is responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void getPrimFieldValues(Object obj, byte[] buf) {

        /**
         * Fetches the serializable primitive field values of object obj and
         * marshals them into byte array buf starting at offset 0.  The caller
         * is responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        ObjectStreamField[] getFields() {

        /**
         * Returns list of ObjectStreamFields representing fields operated on
         * by this reflector.  The shared/unshared values and Field objects
         * contained by ObjectStreamFields in the list reflect their bindings
         * to locally defined serializable fields.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        FieldReflector(ObjectStreamField[] fields) {

        /**
         * Constructs FieldReflector capable of setting/getting values from the
         * subset of fields whose ObjectStreamFields contain non-null
         * reflective Field objects.  ObjectStreamFields with null Fields are
         * treated as filler, for which get operations return default values
         * and set operations discard given values.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final Class<?>[] types;

        /** field types */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final int[] offsets;

        /** field data offsets */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final long[] readKeys;

        /** unsafe field keys for reading fields - may contain dupes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final ObjectStreamField[] fields;

        /** fields to operate on */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final Unsafe unsafe = Unsafe.getUnsafe();

        /** handle for performing unsafe operations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    // REMIND: dynamically generate these?

    /**
     * Class for setting and retrieving serializable field values in batch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class MemberSignature {

    /**
     * Class for computing and caching field/constructor/method signatures
     * during serialVersionUID calculation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private native static boolean hasStaticInitializer(Class<?> cl);

    /**
     * Returns true if the given class defines a static initializer method,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static long computeDefaultSUID(Class<?> cl) {

    /**
     * Computes the default serial version UID value for the given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Long getDeclaredSUID(Class<?> cl) {

    /**
     * Returns explicit serial version UID value declared by given class, or
     * null if none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getDefaultSerialFields(Class<?> cl) {

    /**
     * Returns array of ObjectStreamFields corresponding to all non-static
     * non-transient fields declared by given class.  Each ObjectStreamField
     * contains a Field object for the field it represents.  If no default
     * serializable fields exist, NO_FIELDS is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getDeclaredSerialFields(Class<?> cl)

    /**
     * Returns serializable fields of given class as defined explicitly by a
     * "serialPersistentFields" field, or null if no appropriate
     * "serialPersistentFields" field is defined.  Serializable fields backed
     * by an actual field of the class are represented by ObjectStreamFields
     * with corresponding non-null Field objects.  For compatibility with past
     * releases, a "serialPersistentFields" field with a null value is
     * considered equivalent to not declaring "serialPersistentFields".  Throws
     * InvalidClassException if the declared serializable fields are
     * invalid--e.g., if multiple fields share the same name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getSerialFields(Class<?> cl)

    /**
     * Returns ObjectStreamField array describing the serializable fields of
     * the given class.  Serializable fields backed by an actual field of the
     * class are represented by ObjectStreamFields with corresponding non-null
     * Field objects.  Throws InvalidClassException if the (explicitly
     * declared) serializable fields are invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static void throwMiscException(Throwable th) throws IOException {

    /**
     * Convenience method for throwing an exception that is either a
     * RuntimeException, Error, or of some unexpected type (in which case it is
     * wrapped inside an IOException).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getMethodSignature(Class<?>[] paramTypes,
                                             Class<?> retType)

    /**
     * Returns JVM type signature for given list of parameters and return type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getClassSignature(Class<?> cl) {

    /**
     * Returns JVM type signature for given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static boolean classNamesEqual(String name1, String name2) {

    /**
     * Compares class names for equality, ignoring package names.  Returns true
     * if class names equal, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getPackageName(Class<?> cl) {

    /**
     * Returns package name of given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {

    /**
     * Returns true if classes are defined in the same runtime package, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Method getPrivateMethod(Class<?> cl, String name,
                                           Class<?>[] argTypes,
                                           Class<?> returnType)

    /**
     * Returns non-static private method with given signature defined by given
     * class, or null if none found.  Access checks are disabled on the
     * returned method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Method getInheritableMethod(Class<?> cl, String name,
                                               Class<?>[] argTypes,
                                               Class<?> returnType)

    /**
     * Returns non-static, non-abstract method with given signature provided it
     * is defined by or accessible (via inheritance) by the given class, or
     * null if no match found.  Access checks are disabled on the returned
     * method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Constructor<?> getSerializableConstructor(Class<?> cl) {

    /**
     * Returns subclass-accessible no-arg constructor of first non-serializable
     * superclass, or null if none found.  Access checks are disabled on the
     * returned constructor (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Constructor<?> getExternalizableConstructor(Class<?> cl) {

    /**
     * Returns public no-arg constructor of given class, or null if none found.
     * Access checks are disabled on the returned constructor (if any), since
     * the defining class may still be non-public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass getVariantFor(Class<?> cl)

    /**
     * If given class is the same as the class associated with this class
     * descriptor, returns reference to this class descriptor.  Otherwise,
     * returns variant of this class descriptor bound to given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private void computeFieldOffsets() throws InvalidClassException {

    /**
     * Calculates and sets serializable field offsets, as well as primitive
     * data size and object field count totals.  Throws InvalidClassException
     * if fields are illegally ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void setObjFieldValues(Object obj, Object[] vals) {

    /**
     * Sets the serializable object fields of object obj using values from
     * array vals starting at offset 0.  It is the responsibility of the caller
     * to ensure that obj is of the proper type if non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void getObjFieldValues(Object obj, Object[] vals) {

    /**
     * Fetches the serializable object field values of object obj and stores
     * them in array vals starting at offset 0.  It is the responsibility of
     * the caller to ensure that obj is of the proper type if non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void setPrimFieldValues(Object obj, byte[] buf) {

    /**
     * Sets the serializable primitive fields of object obj using values
     * unmarshalled from byte array buf starting at offset 0.  It is the
     * responsibility of the caller to ensure that obj is of the proper type if
     * non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void getPrimFieldValues(Object obj, byte[] buf) {

    /**
     * Fetches the serializable primitive field values of object obj and
     * marshals them into byte array buf starting at offset 0.  It is the
     * responsibility of the caller to ensure that obj is of the proper type if
     * non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    int getNumObjFields() {

    /**
     * Returns number of non-primitive serializable fields of represented
     * class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    int getPrimDataSize() {

    /**
     * Returns aggregate size (in bytes) of marshalled primitive field values
     * for represented class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ClassDataSlot[] getClassDataLayout() throws InvalidClassException {

    /**
     * Returns array of ClassDataSlot instances representing the data layout
     * (including superclass data) for serialized objects described by this
     * class descriptor.  ClassDataSlots are ordered by inheritance with those
     * containing "higher" superclasses appearing first.  The final
     * ClassDataSlot contains a reference to this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        final ObjectStreamClass desc;

        /** class descriptor "occupying" this slot */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static class ClassDataSlot {

    /**
     * Class representing the portion of an object's serialized form allotted
     * to data described by a given class descriptor.  If "hasData" is false,
     * the object's serialized form does not contain data associated with the
     * class descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    Object invokeReadResolve(Object obj)

    /**
     * Invokes the readResolve method of the represented serializable class and
     * returns the result.  Throws UnsupportedOperationException if this class
     * descriptor is not associated with a class, or if the class is
     * non-serializable or does not define readResolve.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    Object invokeWriteReplace(Object obj)

    /**
     * Invokes the writeReplace method of the represented serializable class and
     * returns the result.  Throws UnsupportedOperationException if this class
     * descriptor is not associated with a class, or if the class is
     * non-serializable or does not define writeReplace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeReadObjectNoData(Object obj)

    /**
     * Invokes the readObjectNoData method of the represented serializable
     * class.  Throws UnsupportedOperationException if this class descriptor is
     * not associated with a class, or if the class is externalizable,
     * non-serializable or does not define readObjectNoData.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeReadObject(Object obj, ObjectInputStream in)

    /**
     * Invokes the readObject method of the represented serializable class.
     * Throws UnsupportedOperationException if this class descriptor is not
     * associated with a class, or if the class is externalizable,
     * non-serializable or does not define readObject.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeWriteObject(Object obj, ObjectOutputStream out)

    /**
     * Invokes the writeObject method of the represented serializable class.
     * Throws UnsupportedOperationException if this class descriptor is not
     * associated with a class, or if the class is externalizable,
     * non-serializable or does not define writeObject.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadResolveMethod() {

    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant readResolve method.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteReplaceMethod() {

    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant writeReplace method.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadObjectNoDataMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant readObjectNoData method.
     * Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadObjectMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant readObject method.  Otherwise,
     * returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteObjectMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant writeObject method.  Otherwise,
     * returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isInstantiable() {

    /**
     * Returns true if represented class is serializable/externalizable and can
     * be instantiated by the serialization runtime--i.e., if it is
     * externalizable and defines a public no-arg constructor, or if it is
     * non-externalizable and its first non-serializable superclass defines an
     * accessible no-arg constructor.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteObjectData() {

    /**
     * Returns true if class descriptor represents serializable (but not
     * externalizable) class which has written its data via a custom
     * writeObject() method, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasBlockExternalData() {

    /**
     * Returns true if class descriptor represents externalizable class that
     * has written its data in 1.2 (block data) format, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isSerializable() {

    /**
     * Returns true if represented class implements Serializable, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isExternalizable() {

    /**
     * Returns true if represented class implements Externalizable, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isEnum() {

    /**
     * Returns true if class descriptor represents an enum type, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isProxy() {

    /**
     * Returns true if class descriptor represents a dynamic proxy class, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamField getField(String name, Class<?> type) {

    /**
     * Looks up a serializable field of the represented class by name and type.
     * A specified type of null matches all types, Object.class matches all
     * non-primitive types, and any other non-null type matches assignable
     * types only.  Returns matching field, or null if no match found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamField[] getFields(boolean copy) {

    /**
     * Returns arrays of ObjectStreamFields representing the serializable
     * fields of the represented class.  If copy is true, a clone of this class
     * descriptor's field array is returned, otherwise the array itself is
     * returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass getLocalDesc() {

    /**
     * Returns the "local" class descriptor for the class associated with this
     * class descriptor (i.e., the result of
     * ObjectStreamClass.lookup(this.forClass())) or null if there is no class
     * associated with this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass getSuperDesc() {

    /**
     * Returns superclass descriptor.  Note that on the receiving side, the
     * superclass descriptor may be bound to a class that is not a superclass
     * of the subclass descriptor's bound class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkDefaultSerialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if objects whose class is represented by
     * this descriptor should not be permitted to use default serialization
     * (e.g., if the class declares serializable fields that do not correspond
     * to actual fields, and hence must use the GetField API).  This method
     * does not apply to deserialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkSerialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if objects whose class is represented by
     * this descriptor should not be allowed to serialize.  This method does
     * not apply to serialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkDeserialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if object instances referencing this
     * class descriptor should not be allowed to deserialize.  This method does
     * not apply to deserialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private final void requireInitialized() {

    /**
     * Throws InternalError if not initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ClassNotFoundException getResolveException() {

    /**
     * Returns ClassNotFoundException (if any) thrown while attempting to
     * resolve local class corresponding to this class descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void writeNonProxy(ObjectOutputStream out) throws IOException {

    /**
     * Writes non-proxy class descriptor information to given output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void readNonProxy(ObjectInputStream in)

    /**
     * Reads non-proxy class descriptor information from given input stream.
     * The resulting class descriptor is not fully functional; it can only be
     * used as input to the ObjectInputStream.resolveClass() and
     * ObjectStreamClass.initNonProxy() methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void initNonProxy(ObjectStreamClass model,
                      Class<?> cl,
                      ClassNotFoundException resolveEx,
                      ObjectStreamClass superDesc)

    /**
     * Initializes class descriptor representing a non-proxy class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void initProxy(Class<?> cl,
                   ClassNotFoundException resolveEx,
                   ObjectStreamClass superDesc)

    /**
     * Initializes class descriptor representing a proxy class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass() {

    /**
     * Creates blank class descriptor which should be initialized via a
     * subsequent call to initProxy(), initNonProxy() or readNonProxy().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass(final Class<?> cl) {

    /**
     * Creates local class descriptor representing given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        Thread getOwner() {

        /**
         * Returns the thread that created this EntryFuture.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        synchronized Object get() {

        /**
         * Returns the value contained by this EntryFuture, blocking if
         * necessary until a value is set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        synchronized boolean set(Object entry) {

        /**
         * Attempts to set the value contained by this EntryFuture.  If the
         * EntryFuture's value has not been set already, then the value is
         * saved, any callers blocked in the get() method are notified, and
         * true is returned.  If the value has already been set, then no saving
         * or notification occurs, and false is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class EntryFuture {

    /**
     * Placeholder used in class descriptor and field reflector lookup tables
     * for an entry in the process of being initialized.  (Internal) callers
     * which receive an EntryFuture belonging to another thread as the result
     * of a lookup should call the get() method of the EntryFuture; this will
     * return the actual entry once it is ready for use and has been set().  To
     * conserve objects, EntryFutures synchronize on themselves.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static ObjectStreamClass lookup(Class<?> cl, boolean all) {

    /**
     * Looks up and returns class descriptor for given class, or null if class
     * is non-serializable and "all" is set to false.
     *
     * @param   cl class to look up
     * @param   all if true, return descriptors for all classes; if false, only
     *          return descriptors for serializable classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public String toString() {

    /**
     * Return a string describing this ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     *
     * @param   name the name of the data field to look for
     * @return  The ObjectStreamField object of the named field or null if
     *          there is no such named field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public ObjectStreamField[] getFields() {

    /**
     * Return an array of the fields of this serializable class.
     *
     * @return  an array containing an element for each persistent field of
     *          this class. Returns an array of length zero if there are no
     *          fields.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    @CallerSensitive

    /**
     * Return the class in the local VM that this version is mapped to.  Null
     * is returned if there is no corresponding local class.
     *
     * @return  the <code>Class</code> instance that this descriptor represents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.  The serialVersionUID
     * defines a set of classes all with the same name that have evolved from a
     * common root class and agree to be serialized and deserialized using a
     * common format.  NonSerializable classes have a serialVersionUID of 0L.
     *
     * @return  the SUID of the class described by this descriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public String getName() {

    /**
     * Returns the name of the class described by this descriptor.
     * This method returns the name of the class in the format that
     * is used by the {@link Class#getName} method.
     *
     * @return a string representing the name of the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static ObjectStreamClass lookupAny(Class<?> cl) {

    /**
     * Returns the descriptor for any class, regardless of whether it
     * implements {@link Serializable}.
     *
     * @param        cl class for which to get the descriptor
     * @return       the class descriptor for the specified class
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static ObjectStreamClass lookup(Class<?> cl) {

    /**
     * Find the descriptor for a class that can be serialized.  Creates an
     * ObjectStreamClass instance if one does not exist yet for class. Null is
     * returned if the specified class does not implement java.io.Serializable
     * or java.io.Externalizable.
     *
     * @param   cl class for which to get the descriptor
     * @return  the class descriptor for the specified class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static native void initNative();

    /**
     * Initializes native code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean initialized;

    /** true if, and only if, the object has been correctly initialized */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass localDesc;

    /** local class descriptor for represented class (may point to self) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Method writeReplaceMethod;

    /** class-defined writeReplace method, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Method readObjectMethod;

    /** class-defined readObject method, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Constructor<?> cons;

    /** serialization-appropriate constructor, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private volatile ClassDataSlot[] dataLayout;

    /** data layout of serialized objects described by this class desc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private int numObjFields;

    /** number of non-primitive fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamField[] fields;

    /** serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ExceptionInfo serializeEx;

    /** exception (if any) to throw if non-enum serialization attempted */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ClassNotFoundException resolveEx;

    /** exception (if any) thrown while attempting to resolve class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        InvalidClassException newInvalidClassException() {

        /**
         * Returns (does not throw) an InvalidClassException instance created
         * from the information in this object, suitable for being thrown by
         * the caller.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class ExceptionInfo {

    /**
     * Contains information about InvalidClassException instances to be thrown
     * when attempting operations on an invalid class. Note that instances of
     * this class are immutable and are potentially shared among
     * ObjectStreamClass instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean hasWriteObjectData;

    /** true if desc has data written by class-defined writeObject method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean serializable;

    /** true if represented class implements Serializable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean isProxy;

    /** true if represents dynamic proxy class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private volatile Long suid;

    /** serialVersionUID of represented class (null if not computed yet) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Class<?> cl;

    /** class associated with this descriptor (if any) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final ReferenceQueue<Class<?>> reflectorsQueue =

        /** queue for WeakReferences to field reflectors keys */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final ReferenceQueue<Class<?>> localDescsQueue =

        /** queue for WeakReferences to local classes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        static final ConcurrentMap<FieldReflectorKey,Reference<?>> reflectors =

        /** cache mapping field group/local desc pairs -> field reflectors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        static final ConcurrentMap<WeakClassKey,Reference<?>> localDescs =

        /** cache mapping local classes -> descriptors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static final ReflectionFactory reflFactory =

    /** reflection factory for obtaining serialization constructors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static final ObjectStreamField[] NO_FIELDS =

    /** serialPersistentFields value indicating no serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
public class ObjectStreamClass implements Serializable {

/**
 * Serialization's descriptor for classes.  It contains the name and
 * serialVersionUID of the class.  The ObjectStreamClass for a specific class
 * loaded in this Java VM can be found/created using the lookup method.
 *
 * <p>The algorithm to compute the SerialVersionUID is described in
 * <a href="../../../platform/serialization/spec/class.html#4100">Object
 * Serialization Specification, Section 4.6, Stream Unique Identifiers</a>.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see ObjectStreamField
 * @see <a href="../../../platform/serialization/spec/class.html">Object Serialization Specification, Section 4, Class Descriptors</a>
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {

    /**
     * Returns true if classes are defined in the same package, false
     * otherwise.
     *
     * Copied from the Merlin java.io.ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private final static Comparator compareObjStrFieldsByName

    /**
     * Comparator for ObjectStreamFields by name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final ObjectStreamField[] NO_FIELDS =

    /**
     * Set serialPersistentFields of a Serializable class to this value to
     * denote that the class has no Serializable fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static final long serialVersionUID = -6120832682080437368L;

    /** use serialVersionUID from JDK 1.1. for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static boolean hasStaticInitializer(Class<?> cl) {

    /**
     * Returns true if the given class defines a static initializer method,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean initialized = false;

    /**
     * Flag indicating whether or not this instance has
     * successfully completed initialization.  This is to
     * try to fix bug 4373844.  Working to move to
     * reusing java.io.ObjectStreamClass for JDK 1.5.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static String getSignature(Class<?> clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getSerializableConstructor(Class<?> cl) {

    /**
     * Returns subclass-accessible no-arg constructor of first non-serializable
     * superclass, or null if none found.  Access checks are disabled on the
     * returned constructor (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Constructor getExternalizableConstructor(Class<?> cl) {

    /**
     * Returns public no-arg constructor of given class, or null if none found.
     * Access checks are disabled on the returned constructor (if any), since
     * the defining class may still be non-public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean isCustomMarshaled() {

    /**
     * Returns when or not this class should be custom
     * marshaled (use chunking).  This should happen if
     * it is Externalizable OR if it or
     * any of its superclasses has a writeObject method,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    final boolean hasReadObject() {

    /**
     * Return whether the class has a readObject method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getRMIIIOPOptionalDataRepId() {

    /**
     * This will return null if there is no writeObject method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private static Method getPrivateMethod(Class<?> cl, String name,
                                           Class<?>[] argTypes,
                                           Class<?> returnType)

    /**
     * Returns non-static private method with given signature defined by given
     * class, or null if none found.  Access checks are disabled on the
     * returned method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String toString() {

    /**
     * Return a string describing this ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     * @return The ObjectStreamField object of the named field or null if there
     * is no such named field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public ObjectStreamField[] getFields() {

    /**
     * Return an array of the fields of this serializable class.
     * @return an array containing an element for each persistent
     * field of this class. Returns an array of length zero if
     * there are no fields.
     * @since JDK1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final Class<?> forClass() {

    /**
     * Return the class in the local VM that this version is mapped to.
     * Null is returned if there is no corresponding local class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getActualSerialVersionUIDStr() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getActualSerialVersionUID() {

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getActualSerialVersionUID( java.lang.Class<?> clazz )

    /**
     * Return the actual (computed) serialVersionUID for this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getSerialVersionUIDStr() {

    /**
     * Return the serialVersionUID string for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public static final long getSerialVersionUID( java.lang.Class<?> clazz) {

    /**
     * Return the serialVersionUID for this class.
     * The serialVersionUID defines a set of classes all with the same name
     * that have evolved from a common root class and agree to be serialized
     * and deserialized using a common format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    public final String getName() {

    /**
     * The name of the class described by this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    static final ObjectStreamClass lookup(Class<?> cl)

    /** Find the descriptor for a class that can be serialized.  Null
     * is returned if the specified class does not implement
     * java.io.Serializable or java.io.Externalizable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
    private boolean isEnum;

    /** true if represents enum type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/ObjectStreamClass.java
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
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        public boolean equals(Object obj) {

        /**
         * Returns true if the given object is this identical
         * WeakClassKey instance, or, if this object's referent has not
         * been cleared, if the given object is another WeakClassKey
         * instance with the identical non-null referent as this one.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        public int hashCode() {

        /**
         * Returns the identity hash code of the original referent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {

        /**
         * Create a new WeakClassKey to the given object, registered
         * with a queue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static class WeakClassKey extends WeakReference<Class<?>> {

    /**
     *  Weak key for Class objects.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static void processQueue(ReferenceQueue<Class<?>> queue,
                             ConcurrentMap<? extends
                             WeakReference<Class<?>>, ?> map)

    /**
     * Removes from the specified map any keys that have been enqueued
     * on the specified reference queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] matchFields(ObjectStreamField[] fields,
                                                   ObjectStreamClass localDesc)

    /**
     * Matches given set of serializable fields with serializable fields
     * obtained from the given local class descriptor (which contain bindings
     * to reflective Field objects).  Returns list of ObjectStreamFields in
     * which each ObjectStreamField whose signature matches that of a local
     * field contains a Field object for that field; unmatched
     * ObjectStreamFields contain null Field objects.  Shared/unshared settings
     * of the returned ObjectStreamFields also reflect those of matched local
     * ObjectStreamFields.  Throws InvalidClassException if unresolvable type
     * conflicts exist between the two sets of fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class FieldReflectorKey extends WeakReference<Class<?>> {

    /**
     * FieldReflector cache lookup key.  Keys are considered equal if they
     * refer to the same class and equivalent field formats.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static FieldReflector getReflector(ObjectStreamField[] fields,
                                               ObjectStreamClass localDesc)

    /**
     * Matches given set of serializable fields with serializable fields
     * described by the given local class descriptor, and returns a
     * FieldReflector instance capable of setting/getting values from the
     * subset of fields that match (non-matching fields are treated as filler,
     * for which get operations return default values and set operations
     * discard given values).  Throws InvalidClassException if unresolvable
     * type conflicts exist between the two sets of fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void setObjFieldValues(Object obj, Object[] vals) {

        /**
         * Sets the serializable object fields of object obj using values from
         * array vals starting at offset 0.  The caller is responsible for
         * ensuring that obj is of the proper type; however, attempts to set a
         * field with a value of the wrong type will trigger an appropriate
         * ClassCastException.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void getObjFieldValues(Object obj, Object[] vals) {

        /**
         * Fetches the serializable object field values of object obj and
         * stores them in array vals starting at offset 0.  The caller is
         * responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void setPrimFieldValues(Object obj, byte[] buf) {

        /**
         * Sets the serializable primitive fields of object obj using values
         * unmarshalled from byte array buf starting at offset 0.  The caller
         * is responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        void getPrimFieldValues(Object obj, byte[] buf) {

        /**
         * Fetches the serializable primitive field values of object obj and
         * marshals them into byte array buf starting at offset 0.  The caller
         * is responsible for ensuring that obj is of the proper type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        ObjectStreamField[] getFields() {

        /**
         * Returns list of ObjectStreamFields representing fields operated on
         * by this reflector.  The shared/unshared values and Field objects
         * contained by ObjectStreamFields in the list reflect their bindings
         * to locally defined serializable fields.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        FieldReflector(ObjectStreamField[] fields) {

        /**
         * Constructs FieldReflector capable of setting/getting values from the
         * subset of fields whose ObjectStreamFields contain non-null
         * reflective Field objects.  ObjectStreamFields with null Fields are
         * treated as filler, for which get operations return default values
         * and set operations discard given values.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final Class<?>[] types;

        /** field types */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final int[] offsets;

        /** field data offsets */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final long[] readKeys;

        /** unsafe field keys for reading fields - may contain dupes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private final ObjectStreamField[] fields;

        /** fields to operate on */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final Unsafe unsafe = Unsafe.getUnsafe();

        /** handle for performing unsafe operations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    // REMIND: dynamically generate these?

    /**
     * Class for setting and retrieving serializable field values in batch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class MemberSignature {

    /**
     * Class for computing and caching field/constructor/method signatures
     * during serialVersionUID calculation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private native static boolean hasStaticInitializer(Class<?> cl);

    /**
     * Returns true if the given class defines a static initializer method,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static long computeDefaultSUID(Class<?> cl) {

    /**
     * Computes the default serial version UID value for the given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Long getDeclaredSUID(Class<?> cl) {

    /**
     * Returns explicit serial version UID value declared by given class, or
     * null if none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getDefaultSerialFields(Class<?> cl) {

    /**
     * Returns array of ObjectStreamFields corresponding to all non-static
     * non-transient fields declared by given class.  Each ObjectStreamField
     * contains a Field object for the field it represents.  If no default
     * serializable fields exist, NO_FIELDS is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getDeclaredSerialFields(Class<?> cl)

    /**
     * Returns serializable fields of given class as defined explicitly by a
     * "serialPersistentFields" field, or null if no appropriate
     * "serialPersistentFields" field is defined.  Serializable fields backed
     * by an actual field of the class are represented by ObjectStreamFields
     * with corresponding non-null Field objects.  For compatibility with past
     * releases, a "serialPersistentFields" field with a null value is
     * considered equivalent to not declaring "serialPersistentFields".  Throws
     * InvalidClassException if the declared serializable fields are
     * invalid--e.g., if multiple fields share the same name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static ObjectStreamField[] getSerialFields(Class<?> cl)

    /**
     * Returns ObjectStreamField array describing the serializable fields of
     * the given class.  Serializable fields backed by an actual field of the
     * class are represented by ObjectStreamFields with corresponding non-null
     * Field objects.  Throws InvalidClassException if the (explicitly
     * declared) serializable fields are invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static void throwMiscException(Throwable th) throws IOException {

    /**
     * Convenience method for throwing an exception that is either a
     * RuntimeException, Error, or of some unexpected type (in which case it is
     * wrapped inside an IOException).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getMethodSignature(Class<?>[] paramTypes,
                                             Class<?> retType)

    /**
     * Returns JVM type signature for given list of parameters and return type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getClassSignature(Class<?> cl) {

    /**
     * Returns JVM type signature for given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static boolean classNamesEqual(String name1, String name2) {

    /**
     * Compares class names for equality, ignoring package names.  Returns true
     * if class names equal, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static String getPackageName(Class<?> cl) {

    /**
     * Returns package name of given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {

    /**
     * Returns true if classes are defined in the same runtime package, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Method getPrivateMethod(Class<?> cl, String name,
                                           Class<?>[] argTypes,
                                           Class<?> returnType)

    /**
     * Returns non-static private method with given signature defined by given
     * class, or null if none found.  Access checks are disabled on the
     * returned method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Method getInheritableMethod(Class<?> cl, String name,
                                               Class<?>[] argTypes,
                                               Class<?> returnType)

    /**
     * Returns non-static, non-abstract method with given signature provided it
     * is defined by or accessible (via inheritance) by the given class, or
     * null if no match found.  Access checks are disabled on the returned
     * method (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Constructor<?> getSerializableConstructor(Class<?> cl) {

    /**
     * Returns subclass-accessible no-arg constructor of first non-serializable
     * superclass, or null if none found.  Access checks are disabled on the
     * returned constructor (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static Constructor<?> getExternalizableConstructor(Class<?> cl) {

    /**
     * Returns public no-arg constructor of given class, or null if none found.
     * Access checks are disabled on the returned constructor (if any), since
     * the defining class may still be non-public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass getVariantFor(Class<?> cl)

    /**
     * If given class is the same as the class associated with this class
     * descriptor, returns reference to this class descriptor.  Otherwise,
     * returns variant of this class descriptor bound to given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private void computeFieldOffsets() throws InvalidClassException {

    /**
     * Calculates and sets serializable field offsets, as well as primitive
     * data size and object field count totals.  Throws InvalidClassException
     * if fields are illegally ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void setObjFieldValues(Object obj, Object[] vals) {

    /**
     * Sets the serializable object fields of object obj using values from
     * array vals starting at offset 0.  It is the responsibility of the caller
     * to ensure that obj is of the proper type if non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void getObjFieldValues(Object obj, Object[] vals) {

    /**
     * Fetches the serializable object field values of object obj and stores
     * them in array vals starting at offset 0.  It is the responsibility of
     * the caller to ensure that obj is of the proper type if non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void setPrimFieldValues(Object obj, byte[] buf) {

    /**
     * Sets the serializable primitive fields of object obj using values
     * unmarshalled from byte array buf starting at offset 0.  It is the
     * responsibility of the caller to ensure that obj is of the proper type if
     * non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void getPrimFieldValues(Object obj, byte[] buf) {

    /**
     * Fetches the serializable primitive field values of object obj and
     * marshals them into byte array buf starting at offset 0.  It is the
     * responsibility of the caller to ensure that obj is of the proper type if
     * non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    int getNumObjFields() {

    /**
     * Returns number of non-primitive serializable fields of represented
     * class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    int getPrimDataSize() {

    /**
     * Returns aggregate size (in bytes) of marshalled primitive field values
     * for represented class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ClassDataSlot[] getClassDataLayout() throws InvalidClassException {

    /**
     * Returns array of ClassDataSlot instances representing the data layout
     * (including superclass data) for serialized objects described by this
     * class descriptor.  ClassDataSlots are ordered by inheritance with those
     * containing "higher" superclasses appearing first.  The final
     * ClassDataSlot contains a reference to this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        final ObjectStreamClass desc;

        /** class descriptor "occupying" this slot */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static class ClassDataSlot {

    /**
     * Class representing the portion of an object's serialized form allotted
     * to data described by a given class descriptor.  If "hasData" is false,
     * the object's serialized form does not contain data associated with the
     * class descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    Object invokeReadResolve(Object obj)

    /**
     * Invokes the readResolve method of the represented serializable class and
     * returns the result.  Throws UnsupportedOperationException if this class
     * descriptor is not associated with a class, or if the class is
     * non-serializable or does not define readResolve.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    Object invokeWriteReplace(Object obj)

    /**
     * Invokes the writeReplace method of the represented serializable class and
     * returns the result.  Throws UnsupportedOperationException if this class
     * descriptor is not associated with a class, or if the class is
     * non-serializable or does not define writeReplace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeReadObjectNoData(Object obj)

    /**
     * Invokes the readObjectNoData method of the represented serializable
     * class.  Throws UnsupportedOperationException if this class descriptor is
     * not associated with a class, or if the class is externalizable,
     * non-serializable or does not define readObjectNoData.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeReadObject(Object obj, ObjectInputStream in)

    /**
     * Invokes the readObject method of the represented serializable class.
     * Throws UnsupportedOperationException if this class descriptor is not
     * associated with a class, or if the class is externalizable,
     * non-serializable or does not define readObject.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void invokeWriteObject(Object obj, ObjectOutputStream out)

    /**
     * Invokes the writeObject method of the represented serializable class.
     * Throws UnsupportedOperationException if this class descriptor is not
     * associated with a class, or if the class is externalizable,
     * non-serializable or does not define writeObject.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadResolveMethod() {

    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant readResolve method.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteReplaceMethod() {

    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant writeReplace method.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadObjectNoDataMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant readObjectNoData method.
     * Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasReadObjectMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant readObject method.  Otherwise,
     * returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteObjectMethod() {

    /**
     * Returns true if represented class is serializable (but not
     * externalizable) and defines a conformant writeObject method.  Otherwise,
     * returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isInstantiable() {

    /**
     * Returns true if represented class is serializable/externalizable and can
     * be instantiated by the serialization runtime--i.e., if it is
     * externalizable and defines a public no-arg constructor, or if it is
     * non-externalizable and its first non-serializable superclass defines an
     * accessible no-arg constructor.  Otherwise, returns false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasWriteObjectData() {

    /**
     * Returns true if class descriptor represents serializable (but not
     * externalizable) class which has written its data via a custom
     * writeObject() method, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean hasBlockExternalData() {

    /**
     * Returns true if class descriptor represents externalizable class that
     * has written its data in 1.2 (block data) format, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isSerializable() {

    /**
     * Returns true if represented class implements Serializable, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isExternalizable() {

    /**
     * Returns true if represented class implements Externalizable, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isEnum() {

    /**
     * Returns true if class descriptor represents an enum type, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    boolean isProxy() {

    /**
     * Returns true if class descriptor represents a dynamic proxy class, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamField getField(String name, Class<?> type) {

    /**
     * Looks up a serializable field of the represented class by name and type.
     * A specified type of null matches all types, Object.class matches all
     * non-primitive types, and any other non-null type matches assignable
     * types only.  Returns matching field, or null if no match found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamField[] getFields(boolean copy) {

    /**
     * Returns arrays of ObjectStreamFields representing the serializable
     * fields of the represented class.  If copy is true, a clone of this class
     * descriptor's field array is returned, otherwise the array itself is
     * returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass getLocalDesc() {

    /**
     * Returns the "local" class descriptor for the class associated with this
     * class descriptor (i.e., the result of
     * ObjectStreamClass.lookup(this.forClass())) or null if there is no class
     * associated with this descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass getSuperDesc() {

    /**
     * Returns superclass descriptor.  Note that on the receiving side, the
     * superclass descriptor may be bound to a class that is not a superclass
     * of the subclass descriptor's bound class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkDefaultSerialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if objects whose class is represented by
     * this descriptor should not be permitted to use default serialization
     * (e.g., if the class declares serializable fields that do not correspond
     * to actual fields, and hence must use the GetField API).  This method
     * does not apply to deserialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkSerialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if objects whose class is represented by
     * this descriptor should not be allowed to serialize.  This method does
     * not apply to serialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void checkDeserialize() throws InvalidClassException {

    /**
     * Throws an InvalidClassException if object instances referencing this
     * class descriptor should not be allowed to deserialize.  This method does
     * not apply to deserialization of enum constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private final void requireInitialized() {

    /**
     * Throws InternalError if not initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ClassNotFoundException getResolveException() {

    /**
     * Returns ClassNotFoundException (if any) thrown while attempting to
     * resolve local class corresponding to this class descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void writeNonProxy(ObjectOutputStream out) throws IOException {

    /**
     * Writes non-proxy class descriptor information to given output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void readNonProxy(ObjectInputStream in)

    /**
     * Reads non-proxy class descriptor information from given input stream.
     * The resulting class descriptor is not fully functional; it can only be
     * used as input to the ObjectInputStream.resolveClass() and
     * ObjectStreamClass.initNonProxy() methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void initNonProxy(ObjectStreamClass model,
                      Class<?> cl,
                      ClassNotFoundException resolveEx,
                      ObjectStreamClass superDesc)

    /**
     * Initializes class descriptor representing a non-proxy class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    void initProxy(Class<?> cl,
                   ClassNotFoundException resolveEx,
                   ObjectStreamClass superDesc)

    /**
     * Initializes class descriptor representing a proxy class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    ObjectStreamClass() {

    /**
     * Creates blank class descriptor which should be initialized via a
     * subsequent call to initProxy(), initNonProxy() or readNonProxy().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass(final Class<?> cl) {

    /**
     * Creates local class descriptor representing given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        Thread getOwner() {

        /**
         * Returns the thread that created this EntryFuture.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        synchronized Object get() {

        /**
         * Returns the value contained by this EntryFuture, blocking if
         * necessary until a value is set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        synchronized boolean set(Object entry) {

        /**
         * Attempts to set the value contained by this EntryFuture.  If the
         * EntryFuture's value has not been set already, then the value is
         * saved, any callers blocked in the get() method are notified, and
         * true is returned.  If the value has already been set, then no saving
         * or notification occurs, and false is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class EntryFuture {

    /**
     * Placeholder used in class descriptor and field reflector lookup tables
     * for an entry in the process of being initialized.  (Internal) callers
     * which receive an EntryFuture belonging to another thread as the result
     * of a lookup should call the get() method of the EntryFuture; this will
     * return the actual entry once it is ready for use and has been set().  To
     * conserve objects, EntryFutures synchronize on themselves.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    static ObjectStreamClass lookup(Class<?> cl, boolean all) {

    /**
     * Looks up and returns class descriptor for given class, or null if class
     * is non-serializable and "all" is set to false.
     *
     * @param   cl class to look up
     * @param   all if true, return descriptors for all classes; if false, only
     *          return descriptors for serializable classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public String toString() {

    /**
     * Return a string describing this ObjectStreamClass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public ObjectStreamField getField(String name) {

    /**
     * Get the field of this class by name.
     *
     * @param   name the name of the data field to look for
     * @return  The ObjectStreamField object of the named field or null if
     *          there is no such named field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public ObjectStreamField[] getFields() {

    /**
     * Return an array of the fields of this serializable class.
     *
     * @return  an array containing an element for each persistent field of
     *          this class. Returns an array of length zero if there are no
     *          fields.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    @CallerSensitive

    /**
     * Return the class in the local VM that this version is mapped to.  Null
     * is returned if there is no corresponding local class.
     *
     * @return  the <code>Class</code> instance that this descriptor represents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public long getSerialVersionUID() {

    /**
     * Return the serialVersionUID for this class.  The serialVersionUID
     * defines a set of classes all with the same name that have evolved from a
     * common root class and agree to be serialized and deserialized using a
     * common format.  NonSerializable classes have a serialVersionUID of 0L.
     *
     * @return  the SUID of the class described by this descriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public String getName() {

    /**
     * Returns the name of the class described by this descriptor.
     * This method returns the name of the class in the format that
     * is used by the {@link Class#getName} method.
     *
     * @return a string representing the name of the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static ObjectStreamClass lookupAny(Class<?> cl) {

    /**
     * Returns the descriptor for any class, regardless of whether it
     * implements {@link Serializable}.
     *
     * @param        cl class for which to get the descriptor
     * @return       the class descriptor for the specified class
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static ObjectStreamClass lookup(Class<?> cl) {

    /**
     * Find the descriptor for a class that can be serialized.  Creates an
     * ObjectStreamClass instance if one does not exist yet for class. Null is
     * returned if the specified class does not implement java.io.Serializable
     * or java.io.Externalizable.
     *
     * @param   cl class for which to get the descriptor
     * @return  the class descriptor for the specified class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static native void initNative();

    /**
     * Initializes native code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean initialized;

    /** true if, and only if, the object has been correctly initialized */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamClass localDesc;

    /** local class descriptor for represented class (may point to self) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Method writeReplaceMethod;

    /** class-defined writeReplace method, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Method readObjectMethod;

    /** class-defined readObject method, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Constructor<?> cons;

    /** serialization-appropriate constructor, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private volatile ClassDataSlot[] dataLayout;

    /** data layout of serialized objects described by this class desc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private int numObjFields;

    /** number of non-primitive fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ObjectStreamField[] fields;

    /** serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ExceptionInfo serializeEx;

    /** exception (if any) to throw if non-enum serialization attempted */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private ClassNotFoundException resolveEx;

    /** exception (if any) thrown while attempting to resolve class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        InvalidClassException newInvalidClassException() {

        /**
         * Returns (does not throw) an InvalidClassException instance created
         * from the information in this object, suitable for being thrown by
         * the caller.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static class ExceptionInfo {

    /**
     * Contains information about InvalidClassException instances to be thrown
     * when attempting operations on an invalid class. Note that instances of
     * this class are immutable and are potentially shared among
     * ObjectStreamClass instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean hasWriteObjectData;

    /** true if desc has data written by class-defined writeObject method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean serializable;

    /** true if represented class implements Serializable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private boolean isProxy;

    /** true if represents dynamic proxy class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private volatile Long suid;

    /** serialVersionUID of represented class (null if not computed yet) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private Class<?> cl;

    /** class associated with this descriptor (if any) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final ReferenceQueue<Class<?>> reflectorsQueue =

        /** queue for WeakReferences to field reflectors keys */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        private static final ReferenceQueue<Class<?>> localDescsQueue =

        /** queue for WeakReferences to local classes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        static final ConcurrentMap<FieldReflectorKey,Reference<?>> reflectors =

        /** cache mapping field group/local desc pairs -> field reflectors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
        static final ConcurrentMap<WeakClassKey,Reference<?>> localDescs =

        /** cache mapping local classes -> descriptors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    private static final ReflectionFactory reflFactory =

    /** reflection factory for obtaining serialization constructors */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
    public static final ObjectStreamField[] NO_FIELDS =

    /** serialPersistentFields value indicating no serializable fields */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamClass.java
public class ObjectStreamClass implements Serializable {

/**
 * Serialization's descriptor for classes.  It contains the name and
 * serialVersionUID of the class.  The ObjectStreamClass for a specific class
 * loaded in this Java VM can be found/created using the lookup method.
 *
 * <p>The algorithm to compute the SerialVersionUID is described in
 * <a href="../../../platform/serialization/spec/class.html#4100">Object
 * Serialization Specification, Section 4.6, Stream Unique Identifiers</a>.
 *
 * @author      Mike Warres
 * @author      Roger Riggs
 * @see ObjectStreamField
 * @see <a href="../../../platform/serialization/spec/class.html">Object Serialization Specification, Section 4, Class Descriptors</a>
 * @since   JDK1.1
 */
