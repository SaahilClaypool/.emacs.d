_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        protected Object readLocation()

        /**
         * Overrides MarshalInputStream.readLocation to return locations from
         * the stream we were given, or <code>null</code> if we were given a
         * <code>null</code> location stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        MarshalledObjectInputStream(InputStream objIn, InputStream locIn)

        /**
         * Creates a new <code>MarshalledObjectInputStream</code> that
         * reads its objects from <code>objIn</code> and annotations
         * from <code>locIn</code>.  If <code>locIn</code> is
         * <code>null</code>, then all annotations will be
         * <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        private ObjectInputStream locIn;

        /**
         * The stream from which annotations will be read.  If this is
         * <code>null</code>, then all annotations were <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    private static class MarshalledObjectInputStream

    /**
     * The counterpart to <code>MarshalledObjectOutputStream</code>.
     *
     * @see MarshalledObjectOutputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        protected void writeLocation(String loc) throws IOException {

        /**
         * Overrides MarshalOutputStream.writeLocation implementation to write
         * annotations to the location stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        boolean hadAnnotations() {

        /**
         * Returns <code>true</code> if any non-<code>null</code> location
         * annotations have been written to this stream.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        MarshalledObjectOutputStream(OutputStream objOut, OutputStream locOut)

        /**
         * Creates a new <code>MarshalledObjectOutputStream</code> whose
         * non-location bytes will be written to <code>objOut</code> and whose
         * location annotations (if any) will be written to
         * <code>locOut</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        private boolean hadAnnotations;

        /** <code>true</code> if non-<code>null</code> annotations are
         *  written.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
        private ObjectOutputStream locOut;

        /** The stream on which location objects are written. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    private static class MarshalledObjectOutputStream

    /**
     * This class is used to marshal objects for
     * <code>MarshalledObject</code>.  It places the location annotations
     * to one side so that two <code>MarshalledObject</code>s can be
     * compared for equality if they differ only in location
     * annotations.  Objects written using this stream should be read back
     * from a <code>MarshalledObjectInputStream</code>.
     *
     * @see java.rmi.MarshalledObject
     * @see MarshalledObjectInputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    public boolean equals(Object obj) {

    /**
     * Compares this <code>MarshalledObject</code> to another object.
     * Returns true if and only if the argument refers to a
     * <code>MarshalledObject</code> that contains exactly the same
     * serialized representation of an object as this one does. The
     * comparison ignores any class codebase annotation, meaning that
     * two objects are equivalent if they have the same serialized
     * representation <i>except</i> for the codebase of each class
     * in the serialized representation.
     *
     * @param obj the object to compare with this <code>MarshalledObject</code>
     * @return <code>true</code> if the argument contains an equivalent
     * serialized object; <code>false</code> otherwise
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>MarshalledObject</code>.
     *
     * @return a hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    public T get() throws IOException, ClassNotFoundException {

    /**
     * Returns a new copy of the contained marshalledobject.  The internal
     * representation is deserialized with the semantics used for
     * unmarshaling parameters for RMI calls.
     *
     * @return a copy of the contained object
     * @exception IOException if an <code>IOException</code> occurs while
     * deserializing the object from its internal representation.
     * @exception ClassNotFoundException if a
     * <code>ClassNotFoundException</code> occurs while deserializing the
     * object from its internal representation.
     * could not be found
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    public MarshalledObject(T obj) throws IOException {

    /**
     * Creates a new <code>MarshalledObject</code> that contains the
     * serialized representation of the current state of the supplied object.
     * The object is serialized with the semantics used for marshaling
     * parameters for RMI calls.
     *
     * @param obj the object to be serialized (must be serializable)
     * @exception IOException if an <code>IOException</code> occurs; an
     * <code>IOException</code> may occur if <code>obj</code> is not
     * serializable.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    private static final long serialVersionUID = 8988374069173025854L;

    /** Indicate compatibility with 1.2 version of class. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    private int hash;

    /**
     * @serial Stored hash code of contained object.
     *
     * @see #hashCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
    private byte[] locBytes = null;

    /**
     * @serial Bytes of location annotations, which are ignored by
     * <code>equals</code>.  If <code>locBytes</code> is null, there were no
     * non-<code>null</code> annotations during marshalling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalledObject.java
public final class MarshalledObject<T> implements Serializable {

/**
 * A <code>MarshalledObject</code> contains a byte stream with the serialized
 * representation of an object given to its constructor.  The <code>get</code>
 * method returns a new copy of the original object, as deserialized from
 * the contained byte stream.  The contained object is serialized and
 * deserialized with the same serialization semantics used for marshaling
 * and unmarshaling parameters and return values of RMI calls:  When the
 * serialized form is created:
 *
 * <ul>
 * <li> classes are annotated with a codebase URL from where the class
 *      can be loaded (if available), and
 * <li> any remote object in the <code>MarshalledObject</code> is
 *      represented by a serialized instance of its stub.
 * </ul>
 *
 * <p>When copy of the object is retrieved (via the <code>get</code> method),
 * if the class is not available locally, it will be loaded from the
 * appropriate location (specified the URL annotated with the class descriptor
 * when the class was serialized.
 *
 * <p><code>MarshalledObject</code> facilitates passing objects in RMI calls
 * that are not automatically deserialized immediately by the remote peer.
 *
 * @param <T> the type of the object contained in this
 * <code>MarshalledObject</code>
 *
 * @author  Ann Wollrath
 * @author  Peter Jones
 * @since   1.2
 */
