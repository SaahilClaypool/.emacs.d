_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer( OutputStream output,
                                               OutputFormat format )

    /**
     * Create a new serializer, based on the {@link OutputFormat} and
     * using the output byte stream and the encoding specified in the
     * output format.
     *
     * @throws UnsupportedEncodingException The specified encoding is
     *   not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer( Writer writer,
                                               OutputFormat format );

    /**
     * Create a new serializer, based on the {@link OutputFormat} and
     * using the writer as the output character stream.  If this
     * method is used, the encoding property will be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer(OutputFormat format);

    /**
     * Create a new serializer based on the {@link OutputFormat}.
     * If this method is used to create the serializer, the {@link
     * Serializer#setOutputByteStream} or {@link Serializer#setOutputCharStream}
     * methods must be called before serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    protected abstract String getSupportedMethod();

    /**
     * Returns the method supported by this factory and used to register
     * the factory. This call is required so factories can be added from
     * a properties file by knowing only the class name. This method is
     * protected, it is only required by this class but must be implemented
     * in derived classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public static SerializerFactory getSerializerFactory( String method )

    /**
     * Register a serializer factory, keyed by the given
     * method string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public static void registerSerializerFactory( SerializerFactory factory )

    /**
     * Register a serializer factory, keyed by the given
     * method string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
public abstract class SerializerFactory

/**
 *
 *
 * @version $Revision: 1.6 $ $Date: 2010-11-01 04:40:36 $
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
  public static Serializer getSerializer(Properties format)

  /**
   * Returns a serializer for the specified output method. The output method
   * is specified by the value of the property associated with the "method" key.
   * If no implementation exists that supports the specified output method
   * an exception of some type will be thrown.
   * For a list of the output "method" key values see {@link Method}.
   *
   * @param format The output format, minimally the "method" property must be set.
   * @return A suitable serializer.
   * @throws IllegalArgumentException if method is
   * null or an appropriate serializer can't be found
   * @throws Exception if the class for the serializer is found but does not
   * implement ContentHandler.
   * @throws WrappedRuntimeException if an exception is thrown while trying to find serializer
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
  private SerializerFactory() {

  /**
   * This constructor is private just to prevent the creation of such an object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
public final class SerializerFactory

/**
 * This class is a public API, it is a factory for creating serializers.
   *
   * The properties object passed to the getSerializer() method should be created by
   * the OutputPropertiesFactory. Although the properties object
   * used to create a serializer does not need to be obtained
   * from OutputPropertiesFactory,
   * using this factory ensures that the default key/value properties
   * are set for the given output "method".
   *
   * <p>
   * The standard property keys supported are: "method", "version", "encoding",
   * "omit-xml-declaration", "standalone", doctype-public",
   * "doctype-system", "cdata-section-elements", "indent", "media-type".
   * These property keys and their values are described in the XSLT recommendation,
   * see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>}
   *
   * <p>
   * The value of the "cdata-section-elements" property key is a whitespace
   * separated list of elements. If the element is in a namespace then
   * value is passed in this format: {uri}localName
   *
   * <p>
   * The non-standard property keys supported are defined in {@link OutputPropertiesFactory}.
   *
   * @see OutputPropertiesFactory
   * @see Method
   * @see Serializer
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer( OutputStream output,
                                               OutputFormat format )

    /**
     * Create a new serializer, based on the {@link OutputFormat} and
     * using the output byte stream and the encoding specified in the
     * output format.
     *
     * @throws UnsupportedEncodingException The specified encoding is
     *   not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer( Writer writer,
                                               OutputFormat format );

    /**
     * Create a new serializer, based on the {@link OutputFormat} and
     * using the writer as the output character stream.  If this
     * method is used, the encoding property will be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public abstract Serializer makeSerializer(OutputFormat format);

    /**
     * Create a new serializer based on the {@link OutputFormat}.
     * If this method is used to create the serializer, the {@link
     * Serializer#setOutputByteStream} or {@link Serializer#setOutputCharStream}
     * methods must be called before serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    protected abstract String getSupportedMethod();

    /**
     * Returns the method supported by this factory and used to register
     * the factory. This call is required so factories can be added from
     * a properties file by knowing only the class name. This method is
     * protected, it is only required by this class but must be implemented
     * in derived classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public static SerializerFactory getSerializerFactory( String method )

    /**
     * Register a serializer factory, keyed by the given
     * method string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
    public static void registerSerializerFactory( SerializerFactory factory )

    /**
     * Register a serializer factory, keyed by the given
     * method string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SerializerFactory.java
public abstract class SerializerFactory

/**
 *
 *
 * @version $Revision: 1.6 $ $Date: 2010-11-01 04:40:36 $
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
  public static Serializer getSerializer(Properties format)

  /**
   * Returns a serializer for the specified output method. The output method
   * is specified by the value of the property associated with the "method" key.
   * If no implementation exists that supports the specified output method
   * an exception of some type will be thrown.
   * For a list of the output "method" key values see {@link Method}.
   *
   * @param format The output format, minimally the "method" property must be set.
   * @return A suitable serializer.
   * @throws IllegalArgumentException if method is
   * null or an appropriate serializer can't be found
   * @throws Exception if the class for the serializer is found but does not
   * implement ContentHandler.
   * @throws WrappedRuntimeException if an exception is thrown while trying to find serializer
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
  private SerializerFactory() {

  /**
   * This constructor is private just to prevent the creation of such an object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerFactory.java
public final class SerializerFactory

/**
 * This class is a public API, it is a factory for creating serializers.
   *
   * The properties object passed to the getSerializer() method should be created by
   * the OutputPropertiesFactory. Although the properties object
   * used to create a serializer does not need to be obtained
   * from OutputPropertiesFactory,
   * using this factory ensures that the default key/value properties
   * are set for the given output "method".
   *
   * <p>
   * The standard property keys supported are: "method", "version", "encoding",
   * "omit-xml-declaration", "standalone", doctype-public",
   * "doctype-system", "cdata-section-elements", "indent", "media-type".
   * These property keys and their values are described in the XSLT recommendation,
   * see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>}
   *
   * <p>
   * The value of the "cdata-section-elements" property key is a whitespace
   * separated list of elements. If the element is in a namespace then
   * value is passed in this format: {uri}localName
   *
   * <p>
   * The non-standard property keys supported are defined in {@link OutputPropertiesFactory}.
   *
   * @see OutputPropertiesFactory
   * @see Method
   * @see Serializer
   */
