_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    static class ActiveRecursionManager

    /**
     * This class maintains a map of stream position to
     * an Object currently being deserialized.  It is used
     * to handle the cases where the are indirections to
     * an object on the recursion stack.  The CDR level
     * handles indirections to objects previously seen
     * (and completely deserialized) in the stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private final void inputCurrentClassFieldsForReadFields(java.util.Map fieldToValueMap)

    /**
     * Called from InputStreamHook.
     *
     * Reads the fields of the current class (could be the ones
     * queried from the remote FVD) and puts them in
     * the given Map, name to value.  Wraps primitives in the
     * corresponding java.lang Objects.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private Object inputObjectField(ObjectStreamField field)

    /**
     * Factored out of inputClassFields and reused in
     * inputCurrentClassFieldsForReadFields.
     *
     * Reads the field (which of an Object type as opposed to a primitive)
     * described by ObjectStreamField field and returns it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private void inputPrimitiveField(Object o, Class cl, ObjectStreamField field)

    /**
     * Factored out of inputClassFields  This reads a primitive value and sets it
     * in the field of o described by the ObjectStreamField field.
     *
     * Note that reflection cannot be used here, because reflection cannot be used
     * to set final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private int findNextClass(String classname, Class classes[], int _spClass, int _spBase){

    ///////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private Object skipObjectUsingFVD(String repositoryID,
                                      com.sun.org.omg.SendingContext.CodeBase sender)

    /**
     * This input method uses FullValueDescriptions retrieved from the sender's runtime to
     * read in the data.  This method is capable of throwing out data not applicable to client's fields.
     *
     * NOTE : If the local description indicates custom marshaling and the remote type's FVD also
     * indicates custom marsahling than the local type is used to read the data off the wire.  However,
     * if either says custom while the other does not, a MARSHAL error is thrown.  Externalizable is
     * a form of custom marshaling.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    private synchronized Object inputObjectUsingFVD(Class clz,
                                       String repositoryID,
                                       com.sun.org.omg.SendingContext.CodeBase sender,
                                       int offset)

    /**
     * This input method uses FullValueDescriptions retrieved from the sender's runtime to
     * read in the data.  This method is capable of throwing out data not applicable to client's fields.
     * This method handles instances where the reader has a class not sent by the sender, the sender sent
     * a class not present on the reader, and/or the reader's class does not match the sender's class.
     *
     * NOTE : If the local description indicates custom marshaling and the remote type's FVD also
     * indicates custom marsahling than the local type is used to read the data off the wire.  However,
     * if either says custom while the other does not, a MARSHAL error is thrown.  Externalizable is
     * a form of custom marshaling.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    protected String internalReadUTF(org.omg.CORBA.portable.InputStream stream)

    /**
     * Helper method for correcting the Kestrel bug 4367783 (dealing
     * with larger than 8-bit chars).  The old behavior is preserved
     * in orbutil.IIOPInputStream_1_3 in order to interoperate with
     * our legacy ORBs.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    public final boolean enableResolveObjectDelegate(boolean enable)

    /**
     * Override the actions of the final method "enableResolveObject()"
     * in ObjectInputStream.
     * @since     JDK1.1.6
     *
     * Enable the stream to allow objects read from the stream to be replaced.
     * If the stream is a trusted class it is allowed to enable replacment.
     * Trusted classes are those classes with a classLoader equals null. <p>
     *
     * When enabled the resolveObject method is called for every object
     * being deserialized.
     *
     * @exception SecurityException The classloader of this stream object is non-null.
     * @since     JDK1.1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    final synchronized void defaultReadObjectDelegate()

    /**
     * Override the actions of the final method "defaultReadObject()"
     * in ObjectInputStream.
     * @since     JDK1.1.6
     *
     * Read the non-static and non-transient fields of the current class
     * from this stream.  This may only be called from the readObject method
     * of the class being deserialized. It will throw the NotActiveException
     * if it is called otherwise.
     *
     * @exception java.lang.ClassNotFoundException if the class of a serialized
     *              object could not be found.
     * @exception IOException        if an I/O error occurs.
     * @exception NotActiveException if the stream is not currently reading
     *              objects.
     * @since     JDK1.1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    /**

    /////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    public final synchronized Object readObjectDelegate() throws IOException

    /**
     * Override the actions of the final method "readObject()"
     * in ObjectInputStream.
     * @since     JDK1.1.6
     *
     * Read an object from the ObjectInputStream.
     * The class of the object, the signature of the class, and the values
     * of the non-transient and non-static fields of the class and all
     * of its supertypes are read.  Default deserializing for a class can be
     * overriden using the writeObject and readObject methods.
     * Objects referenced by this object are read transitively so
     * that a complete equivalent graph of objects is reconstructed by readObject. <p>
     *
     * The root object is completly restored when all of its fields
     * and the objects it references are completely restored.  At this
     * point the object validation callbacks are executed in order
     * based on their registered priorities. The callbacks are
     * registered by objects (in the readObject special methods)
     * as they are individually restored.
     *
     * Exceptions are thrown for problems with the InputStream and for classes
     * that should not be deserialized.  All exceptions are fatal to the
     * InputStream and leave it in an indeterminate state; it is up to the caller
     * to ignore or recover the stream state.
     * @exception java.lang.ClassNotFoundException Class of a serialized object
     *      cannot be found.
     * @exception InvalidClassException Something is wrong with a class used by
     *     serialization.
     * @exception StreamCorruptedException Control information in the
     *     stream is inconsistent.
     * @exception OptionalDataException Primitive data was found in the
     * stream instead of objects.
     * @exception IOException Any of the usual Input/Output related exceptions.
     * @since     JDK1.1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
    public IIOPInputStream()

    /**
     * Dummy constructor; passes upper stream a dummy stream;
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/IIOPInputStream.java
public class IIOPInputStream

/**
 * IIOPInputStream is used by the ValueHandlerImpl to handle Java serialization
 * input semantics.
 *
 * @author  Stephen Lewallen
 * @since   JDK1.1.6
 */
