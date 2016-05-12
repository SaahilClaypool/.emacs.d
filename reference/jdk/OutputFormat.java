_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichMediaType( String method )

    /**
     * Returns the suitable media format for a document
     * output with the specified method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichDoctypeSystem( Document doc )

    /**
     * Returns the document type system identifier
     * specified for this document, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichDoctypePublic( Document doc )

    /**
     * Returns the document type public identifier
     * specified for this document, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichMethod( Document doc )

    /**
     * Determine the output method for the specified document.
     * If the document is an instance of {@link org.w3c.dom.html.HTMLDocument}
     * then the method is said to be <tt>html</tt>. If the root
     * element is 'html' and all text nodes preceding the root
     * element are all whitespace, then the method is said to be
     * <tt>html</tt>. Otherwise the method is <tt>xml</tt>.
     *
     * @param doc The document to check
     * @return The suitable method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public char getLastPrintable()

    /**
     * Returns the last printable character based on the selected
     * encoding. Control characters and non-printable characters
     * are always printed as character references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
         * Sets the preserveEmptyAttribute flag. If flag is false, then'

        /**
         * Returns the preserveEmptyAttribute flag. If flag is false, then'
         * attributes with empty string values are output as the attribute
         * name only (in HTML mode).
         * @return preserve the preserve flag
         */     public boolean getPreserveEmptyAttributes () {          return _preserveEmptyAttributes;        }       /**
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setLineWidth( int lineWidth )

    /**
     * Sets the line width. If zero then no line wrapping will
     * occur. Calling {@link #setIndenting} will reset this
     * value to zero (off) or the default (on).
     *
     * @param lineWidth The line width to use, zero for default
     * @see #getLineWidth
     * @see #setIndenting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public int getLineWidth()

    /**
     * Return the selected line width for breaking up long lines.
     * When indenting, and only when indenting, long lines will be
     * broken at space boundaries based on this line width.
     * No line wrapping occurs if this value is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setPreserveSpace( boolean preserve )

    /**
     * Sets space preserving as the default behavior. The default is
     * space stripping and all elements that do not specify otherwise
     * or use the default value will not preserve spaces.
     *
     * @param preserve True if spaces should be preserved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getPreserveSpace()

    /**
     * Returns true if the default behavior for this format is to
     * preserve spaces. All elements that do not specify otherwise
     * or specify the default behavior will be formatted based on
     * this rule. All elements that specify space preserving will
     * always preserve space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setLineSeparator( String lineSeparator )

    /**
     * Sets the line separator. The default is the Web line separator
     * (<tt>\n</tt>). The machine's line separator can be obtained
     * from the system property <tt>line.separator</tt>, but is only
     * useful if the document is edited on machines of the same type.
     * For general documents, use the Web line separator.
     *
     * @param lineSeparator The specified line separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getLineSeparator()

    /**
     * Returns a specific line separator to use. The default is the
     * Web line separator (<tt>\n</tt>). A string is returned to
     * support double codes (CR + LF).
     *
     * @return The specified line separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setNonEscapingElements( String[] nonEscapingElements )

    /**
     * Sets the list of elements for which text node children
     * should be output unescaped (no character references).
     *
     * @param nonEscapingElements List of unescaped element tag names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean isNonEscapingElement( String tagName )

    /**
     * Returns true if the text node children of the given elements
     * should be output unescaped.
     *
     * @param tagName The element's tag name
     * @return True if should serialize unescaped
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String[] getNonEscapingElements()

    /**
     * Returns a list of all the elements whose text node children
     * should be output unescaped (no character references), or null
     * if no such elements were specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setCDataElements( String[] cdataElements )

    /**
     * Sets the list of elements for which text node children
     * should be output as CDATA.
     *
     * @param cdataElements List of CDATA element tag names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean isCDataElement( String tagName )

    /**
     * Returns true if the text node children of the given elements
     * should be output as CDATA.
     *
     * @param tagName The element's tag name
     * @return True if should serialize as CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String[] getCDataElements()

    /**
     * Returns a list of all the elements whose text node children
     * should be output as CDATA, or null if no such elements were
     * specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setStandalone( boolean standalone )

    /**
     * Sets document DTD standalone. The public and system
     * identifiers must be null for the document to be
     * serialized as standalone.
     *
     * @param standalone True if document DTD is standalone
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getStandalone()

    /**
     * Returns true if the document type is standalone.
     * The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitXMLDeclaration( boolean omit )

    /**
     * Sets XML declaration omitting on and off.
     *
     * @param omit True if XML declaration should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitXMLDeclaration()

    /**
     * Returns true if the XML document declaration should
     * be ommited. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitDocumentType( boolean omit )

    /**
     * Sets DOCTYPE declaration omitting on and off.
     *
     * @param omit True if DOCTYPE declaration should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitDocumentType()

    /**
     * Returns true if the DOCTYPE declaration should
     * be ommited. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitComments( boolean omit )

    /**
     * Sets comment omitting on and off.
     *
     * @param omit True if comments should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitComments()

    /**
     * Returns true if comments should be ommited.
     * The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getDoctypeSystem()

    /**
     * Returns the specified document type system identifier,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getDoctypePublic()

    /**
     * Returns the specified document type public identifier,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setDoctype( String publicId, String systemId )

    /**
     * Sets the document type public and system identifiers.
     * Required only if the DOM Document or SAX events do not
     * specify the document type, and one must be present in
     * the serialized document. Any document type specified
     * by the DOM Document or SAX events will override these
     * values.
     *
     * @param publicId The public identifier, or null
     * @param systemId The system identifier, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setMediaType( String mediaType )

    /**
     * Sets the media type.
     *
     * @see #getMediaType
     * @param mediaType The specified media type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getMediaType()

    /**
     * Returns the specified media type, or null.
     * To determine the media type based on the
     * document type, use {@link #whichMediaType}.
     *
     * @return The specified media type, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean setAllowJavaNames () {

    /**
     * Returns whether java encoding names are permitted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setAllowJavaNames (boolean allow) {

    /**
     * Sets whether java encoding names are permitted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public EncodingInfo getEncodingInfo() throws UnsupportedEncodingException {

    /**
     * Returns an <code>EncodingInfo<code> instance for the encoding.
     *
     * @see #setEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setEncoding(EncodingInfo encInfo) {

    /**
     * Sets the encoding for this output method with an <code>EncodingInfo</code>
     * instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setEncoding( String encoding )

    /**
     * Sets the encoding for this output method. If no
     * encoding was specified, the default is always "UTF-8".
     * Make sure the encoding is compatible with the one
     * used by the {@link java.io.Writer}.
     *
     * @see #getEncoding
     * @param encoding The encoding, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getEncoding()

    /**
     * Returns the specified encoding. If no encoding was
     * specified, the default is always "UTF-8".
     *
     * @return The encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setIndenting( boolean on )

    /**
     * Sets the indentation on and off. When set on, the default
     * indentation level and default line wrapping is used
     * (see {@link Defaults#Indent} and {@link Defaults#LineWidth}).
     * To specify a different indentation level or line wrapping,
     * use {@link #setIndent} and {@link #setLineWidth}.
     *
     * @param on True if indentation should be on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setIndent( int indent )

    /**
     * Sets the indentation. The document will not be
     * indented if the indentation is set to zero.
     * Calling {@link #setIndenting} will reset this
     * value to zero (off) or the default (on).
     *
     * @param indent The indentation, or zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getIndenting()

    /**
     * Returns true if indentation was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public int getIndent()

    /**
     * Returns the indentation specified. If no indentation
     * was specified, zero is returned and the document
     * should not be indented.
     *
     * @return The indentation or zero
     * @see #setIndenting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setVersion( String version )

    /**
     * Sets the version for this output method.
     * For XML the value would be "1.0", for HTML
     * it would be "4.0".
     *
     * @see #getVersion
     * @param version The output method version, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getVersion()

    /**
     * Returns the version for this output method.
     * If no version was specified, will return null
     * and the default version number will be used.
     * If the serializerr does not support that particular
     * version, it should default to a supported version.
     *
     * @return The specified method version, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setMethod( String method )

    /**
     * Sets the method for this output format.
     *
     * @see #getMethod
     * @param method The output method, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getMethod()

    /**
     * Returns the method specified for this output format.
     * Typically the method will be <tt>xml</tt>, <tt>html</tt>
     * or <tt>text</tt>, but it might be other values.
     * If no method was specified, null will be returned
     * and the most suitable method will be determined for
     * the document by calling {@link #whichMethod}.
     *
     * @return The specified output method, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( Document doc, String encoding, boolean indenting )

    /**
     * Constructs a new output format with the proper method,
     * document type identifiers and media type for the specified
     * document, and with the specified encoding. If <tt>indent</tt>
     * is true, the document will be pretty printed with the default
     * indentation level and default line wrapping.
     *
     * @param doc The document to output
     * @param encoding The specified encoding
     * @param indenting True for pretty printing
     * @see #setEncoding
     * @see #setIndenting
     * @see #whichMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( Document doc )

    /**
     * Constructs a new output format with the proper method,
     * document type identifiers and media type for the specified
     * document.
     *
     * @param doc The document to output
     * @see #whichMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( String method, String encoding, boolean indenting )

    /**
     * Constructs a new output format with the default values for
     * the specified method and encoding. If <tt>indent</tt>
     * is true, the document will be pretty printed with the default
     * indentation level and default line wrapping.
     *
     * @param method The specified output method
     * @param encoding The specified encoding
     * @param indenting True for pretty printing
     * @see #setEncoding
     * @see #setIndenting
     * @see #setMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat()

    /**
     * Constructs a new output format with the default values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _preserve = false;

    /**
     * True if spaces should be preserved in elements that do not
     * specify otherwise, or specify the default behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private int _lineWidth = Defaults.LineWidth;

    /**
     * The line width at which to wrap long lines when indenting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _lineSeparator = LineSeparator.Web;

    /**
     * The selected line separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String[] _nonEscapingElements;

    /**
     * List of element tag names whose text node children must
     * be output unescaped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String[] _cdataElements;

    /**
     * List of element tag names whose text node children must
     * be output as CDATA.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _standalone = false;

    /**
     * True if the document type should be marked as standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _stripComments = false;

    /**
     * Ture if the comments should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitComments = false;

    /**
     * Ture if comments should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitDoctype = false;

    /**
     * Ture if the DOCTYPE declaration should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitXmlDeclaration = false;

    /**
     * Ture if the XML declaration should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _doctypePublic;

    /**
     * The specified document type public identifier, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _doctypeSystem;

    /**
     * The specified document type system identifier, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _mediaType;

    /**
     * The specified media type or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private EncodingInfo _encodingInfo = null;

    /**
     * The EncodingInfo instance for _encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _encoding = Defaults.Encoding;

    /**
     * The encoding to use, if an input stream is used.
     * The default is always UTF-8.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private int _indent = 0;

    /**
     * The indentation level, or zero if no indentation
     * was requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _version;

    /**
     * Specifies the version of the output method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _method;

    /**
     * Holds the output method specified for this document,
     * or null if no method was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final int LineWidth = 72;

        /**
         * The default line width at which to break long lines
         * when identing. This is set to 72.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String Encoding = "UTF-8";

        /**
         * The default encoding for Web documents it UTF-8.
         *
         * @see #getEncoding()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final int Indent = 4;

        /**
         * If indentation is turned on, the default identation
         * level is 4.
         *
         * @see #setIndenting(boolean)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String XHTMLSystemId =

        /**
         * System identifier for XHTML 1.0 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String XHTMLPublicId =

        /**
         * Public identifier for XHTML 1.0 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String HTMLSystemId =

        /**
         * System identifier for HTML 4.01 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";

        /**
         * Public identifier for HTML 4.01 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
public class OutputFormat

/**
 * Specifies an output format to control the serializer. Based on the
 * XSLT specification for output format, plus additional parameters.
 * Used to select the suitable serializer and determine how the
 * document should be formatted on output.
 * <p>
 * The two interesting constructors are:
 * <ul>
 * <li>{@link #OutputFormat(String,String,boolean)} creates a format
 *  for the specified method (XML, HTML, Text, etc), encoding and indentation
 * <li>{@link #OutputFormat(Document,String,boolean)} creates a format
 *  compatible with the document type (XML, HTML, Text, etc), encoding and
 *  indentation
 * </ul>
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 *         <a href="mailto:visco@intalio.com">Keith Visco</a>
 * @see Serializer
 * @see Method
 * @see LineSeparator
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichMediaType( String method )

    /**
     * Returns the suitable media format for a document
     * output with the specified method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichDoctypeSystem( Document doc )

    /**
     * Returns the document type system identifier
     * specified for this document, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichDoctypePublic( Document doc )

    /**
     * Returns the document type public identifier
     * specified for this document, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public static String whichMethod( Document doc )

    /**
     * Determine the output method for the specified document.
     * If the document is an instance of {@link org.w3c.dom.html.HTMLDocument}
     * then the method is said to be <tt>html</tt>. If the root
     * element is 'html' and all text nodes preceding the root
     * element are all whitespace, then the method is said to be
     * <tt>html</tt>. Otherwise the method is <tt>xml</tt>.
     *
     * @param doc The document to check
     * @return The suitable method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public char getLastPrintable()

    /**
     * Returns the last printable character based on the selected
     * encoding. Control characters and non-printable characters
     * are always printed as character references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
         * Sets the preserveEmptyAttribute flag. If flag is false, then'

        /**
         * Returns the preserveEmptyAttribute flag. If flag is false, then'
         * attributes with empty string values are output as the attribute
         * name only (in HTML mode).
         * @return preserve the preserve flag
         */     public boolean getPreserveEmptyAttributes () {          return _preserveEmptyAttributes;        }       /**
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setLineWidth( int lineWidth )

    /**
     * Sets the line width. If zero then no line wrapping will
     * occur. Calling {@link #setIndenting} will reset this
     * value to zero (off) or the default (on).
     *
     * @param lineWidth The line width to use, zero for default
     * @see #getLineWidth
     * @see #setIndenting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public int getLineWidth()

    /**
     * Return the selected line width for breaking up long lines.
     * When indenting, and only when indenting, long lines will be
     * broken at space boundaries based on this line width.
     * No line wrapping occurs if this value is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setPreserveSpace( boolean preserve )

    /**
     * Sets space preserving as the default behavior. The default is
     * space stripping and all elements that do not specify otherwise
     * or use the default value will not preserve spaces.
     *
     * @param preserve True if spaces should be preserved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getPreserveSpace()

    /**
     * Returns true if the default behavior for this format is to
     * preserve spaces. All elements that do not specify otherwise
     * or specify the default behavior will be formatted based on
     * this rule. All elements that specify space preserving will
     * always preserve space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setLineSeparator( String lineSeparator )

    /**
     * Sets the line separator. The default is the Web line separator
     * (<tt>\n</tt>). The machine's line separator can be obtained
     * from the system property <tt>line.separator</tt>, but is only
     * useful if the document is edited on machines of the same type.
     * For general documents, use the Web line separator.
     *
     * @param lineSeparator The specified line separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getLineSeparator()

    /**
     * Returns a specific line separator to use. The default is the
     * Web line separator (<tt>\n</tt>). A string is returned to
     * support double codes (CR + LF).
     *
     * @return The specified line separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setNonEscapingElements( String[] nonEscapingElements )

    /**
     * Sets the list of elements for which text node children
     * should be output unescaped (no character references).
     *
     * @param nonEscapingElements List of unescaped element tag names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean isNonEscapingElement( String tagName )

    /**
     * Returns true if the text node children of the given elements
     * should be output unescaped.
     *
     * @param tagName The element's tag name
     * @return True if should serialize unescaped
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String[] getNonEscapingElements()

    /**
     * Returns a list of all the elements whose text node children
     * should be output unescaped (no character references), or null
     * if no such elements were specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setCDataElements( String[] cdataElements )

    /**
     * Sets the list of elements for which text node children
     * should be output as CDATA.
     *
     * @param cdataElements List of CDATA element tag names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean isCDataElement( String tagName )

    /**
     * Returns true if the text node children of the given elements
     * should be output as CDATA.
     *
     * @param tagName The element's tag name
     * @return True if should serialize as CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String[] getCDataElements()

    /**
     * Returns a list of all the elements whose text node children
     * should be output as CDATA, or null if no such elements were
     * specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setStandalone( boolean standalone )

    /**
     * Sets document DTD standalone. The public and system
     * identifiers must be null for the document to be
     * serialized as standalone.
     *
     * @param standalone True if document DTD is standalone
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getStandalone()

    /**
     * Returns true if the document type is standalone.
     * The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitXMLDeclaration( boolean omit )

    /**
     * Sets XML declaration omitting on and off.
     *
     * @param omit True if XML declaration should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitXMLDeclaration()

    /**
     * Returns true if the XML document declaration should
     * be ommited. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitDocumentType( boolean omit )

    /**
     * Sets DOCTYPE declaration omitting on and off.
     *
     * @param omit True if DOCTYPE declaration should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitDocumentType()

    /**
     * Returns true if the DOCTYPE declaration should
     * be ommited. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setOmitComments( boolean omit )

    /**
     * Sets comment omitting on and off.
     *
     * @param omit True if comments should be ommited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getOmitComments()

    /**
     * Returns true if comments should be ommited.
     * The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getDoctypeSystem()

    /**
     * Returns the specified document type system identifier,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getDoctypePublic()

    /**
     * Returns the specified document type public identifier,
     * or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setDoctype( String publicId, String systemId )

    /**
     * Sets the document type public and system identifiers.
     * Required only if the DOM Document or SAX events do not
     * specify the document type, and one must be present in
     * the serialized document. Any document type specified
     * by the DOM Document or SAX events will override these
     * values.
     *
     * @param publicId The public identifier, or null
     * @param systemId The system identifier, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setMediaType( String mediaType )

    /**
     * Sets the media type.
     *
     * @see #getMediaType
     * @param mediaType The specified media type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getMediaType()

    /**
     * Returns the specified media type, or null.
     * To determine the media type based on the
     * document type, use {@link #whichMediaType}.
     *
     * @return The specified media type, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean setAllowJavaNames () {

    /**
     * Returns whether java encoding names are permitted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setAllowJavaNames (boolean allow) {

    /**
     * Sets whether java encoding names are permitted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public EncodingInfo getEncodingInfo() throws UnsupportedEncodingException {

    /**
     * Returns an <code>EncodingInfo<code> instance for the encoding.
     *
     * @see #setEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setEncoding(EncodingInfo encInfo) {

    /**
     * Sets the encoding for this output method with an <code>EncodingInfo</code>
     * instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setEncoding( String encoding )

    /**
     * Sets the encoding for this output method. If no
     * encoding was specified, the default is always "UTF-8".
     * Make sure the encoding is compatible with the one
     * used by the {@link java.io.Writer}.
     *
     * @see #getEncoding
     * @param encoding The encoding, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getEncoding()

    /**
     * Returns the specified encoding. If no encoding was
     * specified, the default is always "UTF-8".
     *
     * @return The encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setIndenting( boolean on )

    /**
     * Sets the indentation on and off. When set on, the default
     * indentation level and default line wrapping is used
     * (see {@link Defaults#Indent} and {@link Defaults#LineWidth}).
     * To specify a different indentation level or line wrapping,
     * use {@link #setIndent} and {@link #setLineWidth}.
     *
     * @param on True if indentation should be on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setIndent( int indent )

    /**
     * Sets the indentation. The document will not be
     * indented if the indentation is set to zero.
     * Calling {@link #setIndenting} will reset this
     * value to zero (off) or the default (on).
     *
     * @param indent The indentation, or zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public boolean getIndenting()

    /**
     * Returns true if indentation was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public int getIndent()

    /**
     * Returns the indentation specified. If no indentation
     * was specified, zero is returned and the document
     * should not be indented.
     *
     * @return The indentation or zero
     * @see #setIndenting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setVersion( String version )

    /**
     * Sets the version for this output method.
     * For XML the value would be "1.0", for HTML
     * it would be "4.0".
     *
     * @see #getVersion
     * @param version The output method version, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getVersion()

    /**
     * Returns the version for this output method.
     * If no version was specified, will return null
     * and the default version number will be used.
     * If the serializerr does not support that particular
     * version, it should default to a supported version.
     *
     * @return The specified method version, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public void setMethod( String method )

    /**
     * Sets the method for this output format.
     *
     * @see #getMethod
     * @param method The output method, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public String getMethod()

    /**
     * Returns the method specified for this output format.
     * Typically the method will be <tt>xml</tt>, <tt>html</tt>
     * or <tt>text</tt>, but it might be other values.
     * If no method was specified, null will be returned
     * and the most suitable method will be determined for
     * the document by calling {@link #whichMethod}.
     *
     * @return The specified output method, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( Document doc, String encoding, boolean indenting )

    /**
     * Constructs a new output format with the proper method,
     * document type identifiers and media type for the specified
     * document, and with the specified encoding. If <tt>indent</tt>
     * is true, the document will be pretty printed with the default
     * indentation level and default line wrapping.
     *
     * @param doc The document to output
     * @param encoding The specified encoding
     * @param indenting True for pretty printing
     * @see #setEncoding
     * @see #setIndenting
     * @see #whichMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( Document doc )

    /**
     * Constructs a new output format with the proper method,
     * document type identifiers and media type for the specified
     * document.
     *
     * @param doc The document to output
     * @see #whichMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat( String method, String encoding, boolean indenting )

    /**
     * Constructs a new output format with the default values for
     * the specified method and encoding. If <tt>indent</tt>
     * is true, the document will be pretty printed with the default
     * indentation level and default line wrapping.
     *
     * @param method The specified output method
     * @param encoding The specified encoding
     * @param indenting True for pretty printing
     * @see #setEncoding
     * @see #setIndenting
     * @see #setMethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    public OutputFormat()

    /**
     * Constructs a new output format with the default values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _preserve = false;

    /**
     * True if spaces should be preserved in elements that do not
     * specify otherwise, or specify the default behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private int _lineWidth = Defaults.LineWidth;

    /**
     * The line width at which to wrap long lines when indenting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _lineSeparator = LineSeparator.Web;

    /**
     * The selected line separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String[] _nonEscapingElements;

    /**
     * List of element tag names whose text node children must
     * be output unescaped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String[] _cdataElements;

    /**
     * List of element tag names whose text node children must
     * be output as CDATA.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _standalone = false;

    /**
     * True if the document type should be marked as standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _stripComments = false;

    /**
     * Ture if the comments should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitComments = false;

    /**
     * Ture if comments should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitDoctype = false;

    /**
     * Ture if the DOCTYPE declaration should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private boolean _omitXmlDeclaration = false;

    /**
     * Ture if the XML declaration should be ommited;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _doctypePublic;

    /**
     * The specified document type public identifier, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _doctypeSystem;

    /**
     * The specified document type system identifier, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _mediaType;

    /**
     * The specified media type or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private EncodingInfo _encodingInfo = null;

    /**
     * The EncodingInfo instance for _encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _encoding = Defaults.Encoding;

    /**
     * The encoding to use, if an input stream is used.
     * The default is always UTF-8.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private int _indent = 0;

    /**
     * The indentation level, or zero if no indentation
     * was requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _version;

    /**
     * Specifies the version of the output method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
    private String _method;

    /**
     * Holds the output method specified for this document,
     * or null if no method was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final int LineWidth = 72;

        /**
         * The default line width at which to break long lines
         * when identing. This is set to 72.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String Encoding = "UTF-8";

        /**
         * The default encoding for Web documents it UTF-8.
         *
         * @see #getEncoding()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final int Indent = 4;

        /**
         * If indentation is turned on, the default identation
         * level is 4.
         *
         * @see #setIndenting(boolean)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String XHTMLSystemId =

        /**
         * System identifier for XHTML 1.0 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String XHTMLPublicId =

        /**
         * Public identifier for XHTML 1.0 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String HTMLSystemId =

        /**
         * System identifier for HTML 4.01 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
        public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";

        /**
         * Public identifier for HTML 4.01 (Strict) document type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/OutputFormat.java
public class OutputFormat

/**
 * Specifies an output format to control the serializer. Based on the
 * XSLT specification for output format, plus additional parameters.
 * Used to select the suitable serializer and determine how the
 * document should be formatted on output.
 * <p>
 * The two interesting constructors are:
 * <ul>
 * <li>{@link #OutputFormat(String,String,boolean)} creates a format
 *  for the specified method (XML, HTML, Text, etc), encoding and indentation
 * <li>{@link #OutputFormat(Document,String,boolean)} creates a format
 *  compatible with the document type (XML, HTML, Text, etc), encoding and
 *  indentation
 * </ul>
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 *         <a href="mailto:visco@intalio.com">Keith Visco</a>
 * @see Serializer
 * @see Method
 * @see LineSeparator
 */
