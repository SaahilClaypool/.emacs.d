_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    void alignOnBoundary(int octetBoundary) {

    /**
     * Aligns the current position on the given octet boundary
     * if there are enough bytes available to do so.  Otherwise,
     * it just returns.  This is used for some (but not all)
     * GIOP 1.2 message headers.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    private Class getClassFromString(String repositoryIDString,
                                     String codebaseURL)

    /**
     * Attempts to find the class described by the given
     * repository ID string.  At most, three attempts are made:
     * Try to find it locally, through the provided URL, and
     * finally, via a URL from the remote CodeBase.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    private Class getClassFromString(String repositoryIDString,
                                     String codebaseURL,
                                     Class expectedType)

    /**
     * Attempts to find the class described by the given
     * repository ID string and expected type.  The first
     * attempt is to find the class locally, falling back
     * on the URL that came with the value.  The second
     * attempt is to use a URL from the remote CodeBase.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
//     public final boolean isAtEnd() {

    /**
     * Are we at the end of the input stream?
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    private void readEndTag() {

    /**
     * End tags are only written for chunked valuetypes.
     *
     * Before Merlin, our ORBs wrote end tags which took into account
     * all enclosing valuetypes.  This was changed by an interop resolution
     * (see details around chunkedValueNestingLevel) to only include
     * enclosing chunked types.
     *
     * ORB versioning and end tag compaction are handled here.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    private String readRepositoryIds(int valueTag,
                                     Class expectedType,
                                     String expectedTypeRepId,
                                     BoxedValueHelper factory) {

    /**
     * Examines the valuetag to see how many (if any) repository IDs
     * are present on the wire.  If no repository ID information
     * is on the wire but the expectedType or expectedTypeRepId
     * is known, it will return one of those (favoring the
     * expectedType's repId). Failing that, it uses the supplied
     * BoxedValueHelper to obtain the repository ID, as a last resort.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDRInputStream_1_0.java
    public void init(org.omg.CORBA.ORB orb,
                     ByteBuffer byteBuffer,
                     int size,
                     boolean littleEndian,
                     BufferManagerRead bufferManager)

    /**
     * NOTE:  size passed to init means buffer size
     */
