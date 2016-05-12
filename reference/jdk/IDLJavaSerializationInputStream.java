_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationInputStream.java
        protected final Object resolveObject(Object obj) throws IOException {

        /**
         * Connect the Stub to the ORB.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationInputStream.java
public class IDLJavaSerializationInputStream extends CDRInputStreamBase {

/**
 * Implementation class that uses Java serialization for input streams.
 * This assumes a GIOP version 1.2 message format.
 *
 * This class uses a ByteArrayInputStream as the underlying buffer. The
 * first 16 bytes are directly read out of the underlying buffer. This allows
 * [GIOPHeader (12 bytes) + requestID (4 bytes)] to be read as bytes.
 * Subsequent write operations on this output stream object uses
 * ObjectInputStream class to read into the buffer. This allows unmarshaling
 * complex types and graphs using the ObjectInputStream implementation.
 *
 * Note, this class assumes a GIOP 1.2 style header. Further, the first
 * 12 bytes, that is, the GIOPHeader is read directly from the received
 * message, before this stream object is called. So, this class effectively
 * reads only the requestID (4 bytes) directly, and uses the
 * ObjectInputStream for further unmarshaling.
 *
 * @author Ram Jeyaraman
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationInputStream.java
        protected final Object resolveObject(Object obj) throws IOException {

        /**
         * Connect the Stub to the ORB.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/IDLJavaSerializationInputStream.java
public class IDLJavaSerializationInputStream extends CDRInputStreamBase {

/**
 * Implementation class that uses Java serialization for input streams.
 * This assumes a GIOP version 1.2 message format.
 *
 * This class uses a ByteArrayInputStream as the underlying buffer. The
 * first 16 bytes are directly read out of the underlying buffer. This allows
 * [GIOPHeader (12 bytes) + requestID (4 bytes)] to be read as bytes.
 * Subsequent write operations on this output stream object uses
 * ObjectInputStream class to read into the buffer. This allows unmarshaling
 * complex types and graphs using the ObjectInputStream implementation.
 *
 * Note, this class assumes a GIOP 1.2 style header. Further, the first
 * 12 bytes, that is, the GIOPHeader is read directly from the received
 * message, before this stream object is called. So, this class effectively
 * reads only the requestID (4 bytes) directly, and uses the
 * ObjectInputStream for further unmarshaling.
 *
 * @author Ram Jeyaraman
 */
