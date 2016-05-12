_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( DocumentFragment frag )

    /**
     * Serializes the DOM document fragment. Throws an exception
     * only if an I/O exception occured while serializing.
     *
     * @param frag The document fragment to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( Document doc )

    /**
     * Serializes the DOM document. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param doc The document to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( Element elem )

    /**
     * Serialized the DOM element. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
public interface DOMSerializer

/**
 * Interface for a DOM serializer implementation.
 *
 *
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/DOMSerializer.java
    public void serialize(Node node) throws IOException;

    /**
     * Serializes the DOM node. Throws an exception only if an I/O
     * exception occured while serializing.
     *
     * This interface is a public API.
     *
     * @param node the DOM node to serialize
     * @throws IOException if an I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/DOMSerializer.java
public interface DOMSerializer

/**
 * Interface for a DOM serializer implementation.
 * <p>
 * The DOMSerializer is a facet of a serializer and is obtained from the
 * asDOMSerializer() method of the Serializer interface.
 * A serializer may or may not support a DOM serializer, if it does not then the
 * return value from asDOMSerializer() is null.
 * <p>
 * Example:
 * <pre>
 * Document     doc;
 * Serializer   ser;
 * OutputStream os;
 *
 * ser = ...;
 * os = ...;
 *
 * ser.setOutputStream( os );
 * DOMSerialzier dser = ser.asDOMSerializer();
 * dser.serialize(doc);
 * </pre>
 *
 * @see Serializer
 *
 * @xsl.usage general
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( DocumentFragment frag )

    /**
     * Serializes the DOM document fragment. Throws an exception
     * only if an I/O exception occured while serializing.
     *
     * @param frag The document fragment to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( Document doc )

    /**
     * Serializes the DOM document. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param doc The document to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
    public void serialize( Element elem )

    /**
     * Serialized the DOM element. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializer.java
public interface DOMSerializer

/**
 * Interface for a DOM serializer implementation.
 *
 *
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/DOMSerializer.java
    public void serialize(Node node) throws IOException;

    /**
     * Serializes the DOM node. Throws an exception only if an I/O
     * exception occured while serializing.
     *
     * This interface is a public API.
     *
     * @param node the DOM node to serialize
     * @throws IOException if an I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/DOMSerializer.java
public interface DOMSerializer

/**
 * Interface for a DOM serializer implementation.
 * <p>
 * The DOMSerializer is a facet of a serializer and is obtained from the
 * asDOMSerializer() method of the Serializer interface.
 * A serializer may or may not support a DOM serializer, if it does not then the
 * return value from asDOMSerializer() is null.
 * <p>
 * Example:
 * <pre>
 * Document     doc;
 * Serializer   ser;
 * OutputStream os;
 *
 * ser = ...;
 * os = ...;
 *
 * ser.setOutputStream( os );
 * DOMSerialzier dser = ser.asDOMSerializer();
 * dser.serialize(doc);
 * </pre>
 *
 * @see Serializer
 *
 * @xsl.usage general
 *
 */
