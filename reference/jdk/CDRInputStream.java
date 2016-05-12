_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void resetCodeSetConverters() {

    /**
     * Resets any internal references to code set converters.
     * This is useful for forcing the CDR stream to reacquire
     * converters (probably from its subclasses) when state
     * has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void performORBVersionSpecificInit() {

    /**
     * This must be called after determining the proper ORB version,
     * and setting it on the stream's ORB instance.  It can be called
     * after reading the service contexts, since that is the only place
     * we can get the ORB version info.
     *
     * Trying to unmarshal things requiring repository IDs before calling
     * this will result in NullPtrExceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void alignOnBoundary(int octetBoundary) {

    /**
     * Aligns the current position on the given octet boundary
     * if there are enough bytes available to do so.  Otherwise,
     * it just returns.  This is used for some (but not all)
     * GIOP 1.2 message headers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    protected final boolean isSharing(ByteBuffer bb) {

    /**
     * return true if our ByteBuffer is sharing/equal to bb
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
public abstract class CDRInputStream

/**
 * This is delegates to the real implementation.
 *
 * NOTE:
 *
 * Before using the stream for valuetype unmarshaling, one must call
 * performORBVersionSpecificInit().
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void resetCodeSetConverters() {

    /**
     * Resets any internal references to code set converters.
     * This is useful for forcing the CDR stream to reacquire
     * converters (probably from its subclasses) when state
     * has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void performORBVersionSpecificInit() {

    /**
     * This must be called after determining the proper ORB version,
     * and setting it on the stream's ORB instance.  It can be called
     * after reading the service contexts, since that is the only place
     * we can get the ORB version info.
     *
     * Trying to unmarshal things requiring repository IDs before calling
     * this will result in NullPtrExceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    public void alignOnBoundary(int octetBoundary) {

    /**
     * Aligns the current position on the given octet boundary
     * if there are enough bytes available to do so.  Otherwise,
     * it just returns.  This is used for some (but not all)
     * GIOP 1.2 message headers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
    protected final boolean isSharing(ByteBuffer bb) {

    /**
     * return true if our ByteBuffer is sharing/equal to bb
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CDRInputStream.java
public abstract class CDRInputStream

/**
 * This is delegates to the real implementation.
 *
 * NOTE:
 *
 * Before using the stream for valuetype unmarshaling, one must call
 * performORBVersionSpecificInit().
 */
