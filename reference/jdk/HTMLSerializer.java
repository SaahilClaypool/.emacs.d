_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected void serializeElement( Element elem )

    /**
     * Called to serialize a DOM element. Equivalent to calling {@link
     * #startElement}, {@link #endElement} and serializing everything
     * inbetween, but better optimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected void startDocument( String rootTagName )

    /**
     * Called to serialize the document's DOCTYPE by the root element.
     * The document type declaration must name the root element,
     * but the root element is only known when that element is serialized,
     * and not at the start of the document.
     * <p>
     * This method will check if it has not been called before ({@link #_started}),
     * will serialize the document type declaration, and will serialize all
     * pre-root comments and PIs that were accumulated in the document
     * (see {@link #serializePreRoot}). Pre-root will be serialized even if
     * this is not the first root element of the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( OutputStream output, OutputFormat format )

    /**
     * Constructs a new serializer that writes to the specified output
     * stream using the specified output format. If <tt>format</tt>
     * is null, will use a default output format.
     *
     * @param output The output stream to use
     * @param format The output format to use, null for the default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( Writer writer, OutputFormat format )

    /**
     * Constructs a new serializer that writes to the specified writer
     * using the specified output format. If <tt>format</tt> is null,
     * will use a default output format.
     *
     * @param writer The writer to use
     * @param format The output format to use, null for the default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( OutputFormat format )

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer()

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected HTMLSerializer( boolean xhtml, OutputFormat format )

    /**
     * Constructs a new HTML/XHTML serializer depending on the value of
     * <tt>xhtml</tt>. The serializer cannot be used without calling
     * {@link #setOutputCharStream} or {@link #setOutputByteStream} first.
     *
     * @param xhtml True if XHTML serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    private boolean _xhtml;

    /**
     * True if serializing in XHTML format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
public class HTMLSerializer

/**
 * Implements an HTML/XHTML serializer supporting both DOM and SAX
 * pretty serializing. HTML/XHTML mode is determined in the
 * constructor.  For usage instructions see {@link Serializer}.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. DOM serializing is done
 * by calling {@link #serialize} and SAX serializing is done by firing
 * SAX events and using the serializer as a document handler.
 * <p>
 * If an I/O exception occurs while serializing, the serializer
 * will not throw an exception directly, but only throw it
 * at the end of serializing (either DOM or SAX's {@link
 * org.xml.sax.DocumentHandler#endDocument}.
 * <p>
 * For elements that are not specified as whitespace preserving,
 * the serializer will potentially break long text lines at space
 * boundaries, indent lines, and serialize elements on separate
 * lines. Line terminators will be regarded as spaces, and
 * spaces at beginning of line will be stripped.
 * <p>
 * XHTML is slightly different than HTML:
 * <ul>
 * <li>Element/attribute names are lower case and case matters
 * <li>Attributes must specify value, even if empty string
 * <li>Empty elements must have '/' in empty tag
 * <li>Contents of SCRIPT and STYLE elements serialized as CDATA
 * </ul>
 *
 * @deprecated This class was deprecated in Xerces 2.6.2. It is
 * recommended that new applications use JAXP's Transformation API
 * for XML (TrAX) for serializing HTML. See the Xerces documentation
 * for more information.
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @see Serializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected void serializeElement( Element elem )

    /**
     * Called to serialize a DOM element. Equivalent to calling {@link
     * #startElement}, {@link #endElement} and serializing everything
     * inbetween, but better optimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected void startDocument( String rootTagName )

    /**
     * Called to serialize the document's DOCTYPE by the root element.
     * The document type declaration must name the root element,
     * but the root element is only known when that element is serialized,
     * and not at the start of the document.
     * <p>
     * This method will check if it has not been called before ({@link #_started}),
     * will serialize the document type declaration, and will serialize all
     * pre-root comments and PIs that were accumulated in the document
     * (see {@link #serializePreRoot}). Pre-root will be serialized even if
     * this is not the first root element of the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( OutputStream output, OutputFormat format )

    /**
     * Constructs a new serializer that writes to the specified output
     * stream using the specified output format. If <tt>format</tt>
     * is null, will use a default output format.
     *
     * @param output The output stream to use
     * @param format The output format to use, null for the default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( Writer writer, OutputFormat format )

    /**
     * Constructs a new serializer that writes to the specified writer
     * using the specified output format. If <tt>format</tt> is null,
     * will use a default output format.
     *
     * @param writer The writer to use
     * @param format The output format to use, null for the default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer( OutputFormat format )

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    public HTMLSerializer()

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    protected HTMLSerializer( boolean xhtml, OutputFormat format )

    /**
     * Constructs a new HTML/XHTML serializer depending on the value of
     * <tt>xhtml</tt>. The serializer cannot be used without calling
     * {@link #setOutputCharStream} or {@link #setOutputByteStream} first.
     *
     * @param xhtml True if XHTML serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
    private boolean _xhtml;

    /**
     * True if serializing in XHTML format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLSerializer.java
public class HTMLSerializer

/**
 * Implements an HTML/XHTML serializer supporting both DOM and SAX
 * pretty serializing. HTML/XHTML mode is determined in the
 * constructor.  For usage instructions see {@link Serializer}.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. DOM serializing is done
 * by calling {@link #serialize} and SAX serializing is done by firing
 * SAX events and using the serializer as a document handler.
 * <p>
 * If an I/O exception occurs while serializing, the serializer
 * will not throw an exception directly, but only throw it
 * at the end of serializing (either DOM or SAX's {@link
 * org.xml.sax.DocumentHandler#endDocument}.
 * <p>
 * For elements that are not specified as whitespace preserving,
 * the serializer will potentially break long text lines at space
 * boundaries, indent lines, and serialize elements on separate
 * lines. Line terminators will be regarded as spaces, and
 * spaces at beginning of line will be stripped.
 * <p>
 * XHTML is slightly different than HTML:
 * <ul>
 * <li>Element/attribute names are lower case and case matters
 * <li>Attributes must specify value, even if empty string
 * <li>Empty elements must have '/' in empty tag
 * <li>Contents of SCRIPT and STYLE elements serialized as CDATA
 * </ul>
 *
 * @deprecated This class was deprecated in Xerces 2.6.2. It is
 * recommended that new applications use JAXP's Transformation API
 * for XML (TrAX) for serializing HTML. See the Xerces documentation
 * for more information.
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @see Serializer
 */
