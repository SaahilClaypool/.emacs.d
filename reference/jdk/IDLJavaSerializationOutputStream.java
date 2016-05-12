_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationOutputStream.java
        protected final Object replaceObject(Object obj) throws IOException {

        /**
         * Checks for objects that are instances of java.rmi.Remote
         * that need to be serialized as proxy (Stub) objects.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationOutputStream.java
final class IDLJavaSerializationOutputStream extends CDROutputStreamBase {

/**
 * Implementation class that uses Java serialization for output streams.
 * This assumes a GIOP version 1.2 message format.
 *
 * This class uses a ByteArrayOutputStream as the underlying buffer. The
 * first 16 bytes are direct writes into the underlying buffer. This allows
 * [GIOPHeader (12 bytes) + requestID (4 bytes)] to be written as bytes.
 * Subsequent write operations on this output stream object uses
 * ObjectOutputStream class to write into the buffer. This allows marshaling
 * complex types and graphs using the ObjectOutputStream implementation.
 *
 * Note, this class assumes a GIOP 1.2 style header. Note, we expect that the
 * first 16 bytes are written only using the write_octet, write_long or
 * write_ulong method calls.
 *
 * @author Ram Jeyaraman
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationOutputStream.java
        protected final Object replaceObject(Object obj) throws IOException {

        /**
         * Checks for objects that are instances of java.rmi.Remote
         * that need to be serialized as proxy (Stub) objects.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationOutputStream.java
final class IDLJavaSerializationOutputStream extends CDROutputStreamBase {

/**
 * Implementation class that uses Java serialization for output streams.
 * This assumes a GIOP version 1.2 message format.
 *
 * This class uses a ByteArrayOutputStream as the underlying buffer. The
 * first 16 bytes are direct writes into the underlying buffer. This allows
 * [GIOPHeader (12 bytes) + requestID (4 bytes)] to be written as bytes.
 * Subsequent write operations on this output stream object uses
 * ObjectOutputStream class to write into the buffer. This allows marshaling
 * complex types and graphs using the ObjectOutputStream implementation.
 *
 * Note, this class assumes a GIOP 1.2 style header. Note, we expect that the
 * first 16 bytes are written only using the write_octet, write_long or
 * write_ulong method calls.
 *
 * @author Ram Jeyaraman
 */
