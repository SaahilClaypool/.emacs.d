_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    public final static int PROTOCOL_VERSION_2 = 2;

   /**
    * A Stream Protocol Version. <p>
    *
    * This protocol is written by JVM 1.2.
    *
    * Externalizable data is written in block data mode and is
    * terminated with TC_ENDBLOCKDATA. Externalizable class descriptor
    * flags has SC_BLOCK_DATA enabled. JVM 1.1.6 and greater can
    * read this format change.
    *
    * Enables writing a nonSerializable class descriptor into the
    * stream. The serialVersionUID of a nonSerializable class is
    * set to 0L.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @see #SC_BLOCK_DATA
    * @since 1.2
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    public final static int PROTOCOL_VERSION_1 = 1;

   /**
    * A Stream Protocol Version. <p>
    *
    * All externalizable data is written in JDK 1.1 external data
    * format after calling this method. This version is needed to write
    * streams containing Externalizable data that can be read by
    * pre-JDK 1.1.6 JVMs.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @since 1.2
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION =

    /**
     * Enable overriding of readObject and writeObject.
     *
     * @see java.io.ObjectOutputStream#writeObjectOverride(Object)
     * @see java.io.ObjectInputStream#readObjectOverride()
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static SerializablePermission SUBSTITUTION_PERMISSION =

    /**
     * Enable substitution of one object for another during
     * serialization/deserialization.
     *
     * @see java.io.ObjectOutputStream#enableReplaceObject(boolean)
     * @see java.io.ObjectInputStream#enableResolveObject(boolean)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_ENUM = 0x10;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is an enum type.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_EXTERNALIZABLE = 0x04;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Externalizable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_SERIALIZABLE = 0x02;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_BLOCK_DATA = 0x08;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates Externalizable data
     * written in Block Data mode.
     * Added for PROTOCOL_VERSION_2.
     *
     * @see #PROTOCOL_VERSION_2
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_WRITE_METHOD = 0x01;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates a Serializable class
     * defines its own writeObject method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    /* Bit masks for ObjectStreamClass flag.*/

    /******************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static int baseWireHandle = 0x7e0000;

    /**
     * First wire handle to be assigned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_MAX =          (byte)0x7E;

    /**
     * Last tag value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ENUM =         (byte)0x7E;

    /**
     * new Enum constant.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_PROXYCLASSDESC =       (byte)0x7D;

    /**
     * new Proxy Class Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_LONGSTRING =   (byte)0x7C;

    /**
     * Long string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_EXCEPTION =    (byte)0x7B;

    /**
     * Exception during write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BLOCKDATALONG= (byte)0x7A;

    /**
     * long Block data. The long following the tag indicates the
     * number of bytes in this block data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_RESET =        (byte)0x79;

    /**
     * Reset stream context. All handles written into stream are reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ENDBLOCKDATA = (byte)0x78;

    /**
     * End of optional block data blocks for an object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BLOCKDATA =    (byte)0x77;

    /**
     * Block of optional data. Byte following tag indicates number
     * of bytes in this block data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_CLASS =        (byte)0x76;

    /**
     * Reference to Class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ARRAY =        (byte)0x75;

    /**
     * new Array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_STRING =       (byte)0x74;

    /**
     * new String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_OBJECT =       (byte)0x73;

    /**
     * new Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_CLASSDESC =    (byte)0x72;

    /**
     * new Class Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_REFERENCE =    (byte)0x71;

    /**
     * Reference to an object already written into the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_NULL =         (byte)0x70;

    /**
     * Null object reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BASE = 0x70;

    /**
     * First tag value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static short STREAM_VERSION = 5;

    /**
     * Version number that is written to the stream header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static short STREAM_MAGIC = (short)0xaced;

    /**
     * Magic number that is written to the stream header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
public interface ObjectStreamConstants {

/**
 * Constants written into the Object Serialization Stream.
 *
 * @author  unascribed
 * @since JDK 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    public final static int PROTOCOL_VERSION_2 = 2;

   /**
    * A Stream Protocol Version. <p>
    *
    * This protocol is written by JVM 1.2.
    *
    * Externalizable data is written in block data mode and is
    * terminated with TC_ENDBLOCKDATA. Externalizable class descriptor
    * flags has SC_BLOCK_DATA enabled. JVM 1.1.6 and greater can
    * read this format change.
    *
    * Enables writing a nonSerializable class descriptor into the
    * stream. The serialVersionUID of a nonSerializable class is
    * set to 0L.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @see #SC_BLOCK_DATA
    * @since 1.2
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    public final static int PROTOCOL_VERSION_1 = 1;

   /**
    * A Stream Protocol Version. <p>
    *
    * All externalizable data is written in JDK 1.1 external data
    * format after calling this method. This version is needed to write
    * streams containing Externalizable data that can be read by
    * pre-JDK 1.1.6 JVMs.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @since 1.2
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION =

    /**
     * Enable overriding of readObject and writeObject.
     *
     * @see java.io.ObjectOutputStream#writeObjectOverride(Object)
     * @see java.io.ObjectInputStream#readObjectOverride()
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static SerializablePermission SUBSTITUTION_PERMISSION =

    /**
     * Enable substitution of one object for another during
     * serialization/deserialization.
     *
     * @see java.io.ObjectOutputStream#enableReplaceObject(boolean)
     * @see java.io.ObjectInputStream#enableResolveObject(boolean)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_ENUM = 0x10;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is an enum type.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_EXTERNALIZABLE = 0x04;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Externalizable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_SERIALIZABLE = 0x02;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_BLOCK_DATA = 0x08;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates Externalizable data
     * written in Block Data mode.
     * Added for PROTOCOL_VERSION_2.
     *
     * @see #PROTOCOL_VERSION_2
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte SC_WRITE_METHOD = 0x01;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates a Serializable class
     * defines its own writeObject method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    /* Bit masks for ObjectStreamClass flag.*/

    /******************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static int baseWireHandle = 0x7e0000;

    /**
     * First wire handle to be assigned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_MAX =          (byte)0x7E;

    /**
     * Last tag value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ENUM =         (byte)0x7E;

    /**
     * new Enum constant.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_PROXYCLASSDESC =       (byte)0x7D;

    /**
     * new Proxy Class Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_LONGSTRING =   (byte)0x7C;

    /**
     * Long string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_EXCEPTION =    (byte)0x7B;

    /**
     * Exception during write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BLOCKDATALONG= (byte)0x7A;

    /**
     * long Block data. The long following the tag indicates the
     * number of bytes in this block data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_RESET =        (byte)0x79;

    /**
     * Reset stream context. All handles written into stream are reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ENDBLOCKDATA = (byte)0x78;

    /**
     * End of optional block data blocks for an object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BLOCKDATA =    (byte)0x77;

    /**
     * Block of optional data. Byte following tag indicates number
     * of bytes in this block data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_CLASS =        (byte)0x76;

    /**
     * Reference to Class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_ARRAY =        (byte)0x75;

    /**
     * new Array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_STRING =       (byte)0x74;

    /**
     * new String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_OBJECT =       (byte)0x73;

    /**
     * new Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_CLASSDESC =    (byte)0x72;

    /**
     * new Class Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_REFERENCE =    (byte)0x71;

    /**
     * Reference to an object already written into the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_NULL =         (byte)0x70;

    /**
     * Null object reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static byte TC_BASE = 0x70;

    /**
     * First tag value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static short STREAM_VERSION = 5;

    /**
     * Version number that is written to the stream header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
    final static short STREAM_MAGIC = (short)0xaced;

    /**
     * Magic number that is written to the stream header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/ObjectStreamConstants.java
public interface ObjectStreamConstants {

/**
 * Constants written into the Object Serialization Stream.
 *
 * @author  unascribed
 * @since JDK 1.1
 */
