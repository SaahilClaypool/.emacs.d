_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    private Any decodeImpl( byte[] data, TypeCode tc )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.  If the type code is null, it is
     * expected to appear in the octet sequence.  Otherwise, the given
     * type code is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    private byte[] encodeImpl( Any data, boolean sendTypeCode )

    /**
     * Convert the given any into a CDR encapsulated octet sequence.
     * If sendTypeCode is true, the type code is sent with the message, as in
     * a standard encapsulation.  If it is false, only the data is sent.
     * Either way, the endian type is sent as the first part of the message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public Any decode_value( byte[] data, TypeCode tc )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.  The type code is expected not to appear
     * in the octet sequence, and the given type code is used instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public byte[] encode_value( Any data )

    /**
     * Convert the given any into a CDR encapsulated octet sequence.  Only
     * the data is stored.  The type code is not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public Any decode ( byte[] data )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public byte[] encode( Any data )

    /**
     * Convert the given any into a CDR encapsulated octet sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public CDREncapsCodec( ORB orb, int major, int minor ) {

    /**
     * Creates a new codec implementation.  Uses the given ORB to create
     * CDRInputStreams when necessary.
     *
     * @param orb The ORB to use to create a CDRInputStream or CDROutputStream
     * @param major The major version of GIOP we are encoding for
     * @param minor The minor version of GIOP we are encoding for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
public final class CDREncapsCodec

/**
 * CDREncapsCodec is an implementation of Codec, as described
 * in orbos/99-12-02, that supports CDR encapsulation version 1.0, 1.1, and
 * 1.2.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    private Any decodeImpl( byte[] data, TypeCode tc )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.  If the type code is null, it is
     * expected to appear in the octet sequence.  Otherwise, the given
     * type code is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    private byte[] encodeImpl( Any data, boolean sendTypeCode )

    /**
     * Convert the given any into a CDR encapsulated octet sequence.
     * If sendTypeCode is true, the type code is sent with the message, as in
     * a standard encapsulation.  If it is false, only the data is sent.
     * Either way, the endian type is sent as the first part of the message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public Any decode_value( byte[] data, TypeCode tc )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.  The type code is expected not to appear
     * in the octet sequence, and the given type code is used instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public byte[] encode_value( Any data )

    /**
     * Convert the given any into a CDR encapsulated octet sequence.  Only
     * the data is stored.  The type code is not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public Any decode ( byte[] data )

    /**
     * Decode the given octet sequence into an any based on a CDR
     * encapsulated octet sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public byte[] encode( Any data )

    /**
     * Convert the given any into a CDR encapsulated octet sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
    public CDREncapsCodec( ORB orb, int major, int minor ) {

    /**
     * Creates a new codec implementation.  Uses the given ORB to create
     * CDRInputStreams when necessary.
     *
     * @param orb The ORB to use to create a CDRInputStream or CDROutputStream
     * @param major The major version of GIOP we are encoding for
     * @param minor The minor version of GIOP we are encoding for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/CDREncapsCodec.java
public final class CDREncapsCodec

/**
 * CDREncapsCodec is an implementation of Codec, as described
 * in orbos/99-12-02, that supports CDR encapsulation version 1.0, 1.1, and
 * 1.2.
 */
