_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
         protected void checkUnboundNamespacePrefixedNode (Node node) throws IOException{

        /**
         * DOM level 3:
         * Check a node to determine if it contains unbound namespace prefixes.
         *
         * @param node The node to check for unbound namespace prefices
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected DOMError modifyDOMError(String message, short severity, String type, Node node){

    /**
     * The method modifies global DOM error object
     *
     * @param message
     * @param severity
     * @param type
     * @return a DOMError
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String getPrefix( String namespaceURI )

    /**
     * Returns the namespace prefix for the specified URI.
     * If the URI has been mapped to a prefix, returns the
     * prefix, otherwise returns null.
     *
     * @param namespaceURI The namespace URI
     * @return The namespace prefix if known, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean isDocumentState()

    /**
     * Returns true if in the state of the document.
     * Returns true before entering any element and after
     * leaving the root element.
     *
     * @return True if in the state of the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState leaveElementState()

    /**
     * Leave the current element state and return to the
     * state of the parent element. If this was the root
     * element, return to the state of the document.
     *
     * @return Previous element state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState enterElementState( String namespaceURI, String localName,
                                              String rawName, boolean preserveSpace )

    /**
     * Enter a new element state for the specified element.
     * Tag name and space preserving is specified, element
     * state is initially empty.
     *
     * @return Current element state, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState getElementState()

    /**
     * Return the state of the current element.
     *
     * @return Current element state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printEscaped( String source )

    /**
     * Escapes a string so it may be printed as text content or attribute
     * value. Non printable characters are escaped using character references.
     * Where the format specifies a deault entity reference, that reference
     * is used (e.g. <tt>&amp;lt;</tt>).
     *
     * @param source The string to escape
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
         final void printHex( int ch) throws IOException {

        /**
         * Escapes chars
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printDoctypeURL( String url )

    /**
     * Print a document type public or system identifier URL.
     * Encapsulates the URL in double quotes, escapes non-printing
     * characters and print it equivalent to {@link #printText}.
     *
     * @param url The document type url to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printText( char[] chars, int start, int length,
                                    boolean preserveSpace, boolean unescaped )

    /**
     * Called to print additional text with whitespace handling.
     * If spaces are preserved, the text is printed as if by calling
     * {@link #printText(String,boolean,boolean)} with a call to {@link Printer#breakLine}
     * for each new line. If spaces are not preserved, the text is
     * broken at space boundaries if longer than the line width;
     * Multiple spaces are printed as such, but spaces at beginning
     * of line are removed.
     *
     * @param text The text to print
     * @param preserveSpace Space preserving flag
     * @param unescaped Print unescaped
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void serializePreRoot()

    /**
     * Comments and PIs cannot be serialized before the root element,
     * because the root element serializes the document type, which
     * generally comes first. Instead such PIs and comments are
     * accumulated inside a vector and serialized by calling this
     * method. Will be called when the root element is serialized
     * and when the document finished serializing.
     *
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected abstract void serializeElement( Element elem )

    /**
     * Called to serializee the DOM element. The element is serialized based on
     * the serializer's method (XML, HTML, XHTML).
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected abstract String getEntityRef( int ch );

    /**
     * Returns the suitable entity reference for this character value,
     * or null if no such entity exists. Calling this method with <tt>'&amp;'</tt>
     * will return <tt>"&amp;amp;"</tt>.
     *
     * @param ch Character value
     * @return Character entity name, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void characters( String text )

    /**
     * Called to print the text contents in the prevailing element format.
     * Since this method is capable of printing text as CDATA, it is used
     * for that purpose as well. White space handling is determined by the
     * current element state. In addition, the output format can dictate
     * whether the text is printed as CDATA or unescaped.
     *
     * @param text The text to print
     * @param unescaped True is should print unescaped
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState content()

    /**
     * Must be called by a method about to print any type of content.
     * If the element was just opened, the opening tag is closed and
     * will be matched to a closing tag. Returns the current element
     * state with <tt>empty</tt> and <tt>afterElement</tt> set to false.
     *
     * @return The current element state
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void serializeNode( Node node )

    /**
     * Serialize the DOM node. This method is shared across XML, HTML and XHTML
     * serializers and the differences are masked out in a separate {@link
     * #serializeElement}.
     *
     * @param node The node to serialize
     * @see #serializeElement
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void endDocument()

    /**
     * Called at the end of the document to wrap it up.
     * Will flush the output stream and throw an exception
     * if any I/O error occured while serializing.
     *
     * @throws SAXException An I/O exception occured during
     *  serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Document doc )

    /**
     * Serializes the DOM document using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param doc The document to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( DocumentFragment frag )

    /**
     * Serializes the DOM document fragmnt using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Node node ) throws IOException {

    /**
     * Serializes a node using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param node Node to serialize
     * @throws IOException An I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Element elem )

    /**
     * Serializes the DOM element using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected BaseMarkupSerializer( OutputFormat format )

    /**
     * Protected constructor can only be used by derived class.
     * Must initialize the serializer before serializing any document,
     * by calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
                 * first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Node fCurrentNode = null;

    /** Current node that is being processed  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private OutputStream    _output;

    /**
     * The output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private Writer          _writer;

    /**
     * The underlying writer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected final StringBuffer fStrBuffer = new StringBuffer(40);

    /** Temporary buffer to store character data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean       _indenting;

    /**
     * True if indenting printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Printer       _printer;

    /**
     * The printer used for printing text parts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected OutputFormat   _format;

    /**
     * The output format associated with this serializer. This will never
     * be a null reference. If no format was passed to the constructor,
     * the default one for this document type will be used. The format
     * object is never changed by the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String        _docTypeSystemId;

    /**
     * The system identifier of the document type, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String        _docTypePublicId;

    /**
     * The system identifier of the document type, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Map<String, String>  _prefixes;

    /**
     * Association between namespace URIs (keys) and prefixes (values).
     * Accumulated here prior to starting an element and placing this
     * list in the element state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private boolean         _prepared;

    /**
     * True if the serializer has been prepared. This flag is set
     * to false when the serializer is reset prior to using it,
     * and to true after it has been prepared for usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean       _started;

    /**
     * If the document has been started (header serialized), this
     * flag is set to true so it's not started twice.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private Vector          _preRoot;

    /**
     * Vector holding comments and PIs that come before the root
     * element (even after it), see {@link #serializePreRoot}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private int             _elementStateCount;

    /**
     * The index of the next state to place in the array,
     * or one plus the index of the current state. When zero,
     * we are in no state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private ElementState[]  _elementStates;

    /**
     * Holds array of all element states that have been entered.
     * The array is automatically resized. When leaving an element,
     * it's state is not removed but reused when later returning
     * to the same nesting level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
public abstract class BaseMarkupSerializer

/**
 * Base class for a serializer supporting both DOM and SAX pretty
 * serializing of XML/HTML/XHTML documents. Derives classes perform
 * the method-specific serializing, this class provides the common
 * serializing mechanisms.
 * <p>
 * The serializer must be initialized with the proper writer and
 * output format before it can be used by calling {@link #setOutputCharStream}
 * or {@link #setOutputByteStream} for the writer and {@link #setOutputFormat}
 * for the output format.
 * <p>
 * The serializer can be reused any number of times, but cannot
 * be used concurrently by two threads.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. DOM serializing is done
 * by calling {@link #serialize(Document)} and SAX serializing is done by firing
 * SAX events and using the serializer as a document handler.
 * This also applies to derived class.
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
 * When indenting, the serializer is capable of detecting seemingly
 * element content, and serializing these elements indented on separate
 * lines. An element is serialized indented when it is the first or
 * last child of an element, or immediate following or preceding
 * another element.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a>
 * @author Elena Litani, IBM
 * @author Sunitha Reddy, Sun Microsystems
 * @see Serializer
 * @see LSSerializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
         protected void checkUnboundNamespacePrefixedNode (Node node) throws IOException{

        /**
         * DOM level 3:
         * Check a node to determine if it contains unbound namespace prefixes.
         *
         * @param node The node to check for unbound namespace prefices
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected DOMError modifyDOMError(String message, short severity, String type, Node node){

    /**
     * The method modifies global DOM error object
     *
     * @param message
     * @param severity
     * @param type
     * @return a DOMError
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String getPrefix( String namespaceURI )

    /**
     * Returns the namespace prefix for the specified URI.
     * If the URI has been mapped to a prefix, returns the
     * prefix, otherwise returns null.
     *
     * @param namespaceURI The namespace URI
     * @return The namespace prefix if known, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean isDocumentState()

    /**
     * Returns true if in the state of the document.
     * Returns true before entering any element and after
     * leaving the root element.
     *
     * @return True if in the state of the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState leaveElementState()

    /**
     * Leave the current element state and return to the
     * state of the parent element. If this was the root
     * element, return to the state of the document.
     *
     * @return Previous element state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState enterElementState( String namespaceURI, String localName,
                                              String rawName, boolean preserveSpace )

    /**
     * Enter a new element state for the specified element.
     * Tag name and space preserving is specified, element
     * state is initially empty.
     *
     * @return Current element state, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState getElementState()

    /**
     * Return the state of the current element.
     *
     * @return Current element state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printEscaped( String source )

    /**
     * Escapes a string so it may be printed as text content or attribute
     * value. Non printable characters are escaped using character references.
     * Where the format specifies a deault entity reference, that reference
     * is used (e.g. <tt>&amp;lt;</tt>).
     *
     * @param source The string to escape
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
         final void printHex( int ch) throws IOException {

        /**
         * Escapes chars
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printDoctypeURL( String url )

    /**
     * Print a document type public or system identifier URL.
     * Encapsulates the URL in double quotes, escapes non-printing
     * characters and print it equivalent to {@link #printText}.
     *
     * @param url The document type url to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void printText( char[] chars, int start, int length,
                                    boolean preserveSpace, boolean unescaped )

    /**
     * Called to print additional text with whitespace handling.
     * If spaces are preserved, the text is printed as if by calling
     * {@link #printText(String,boolean,boolean)} with a call to {@link Printer#breakLine}
     * for each new line. If spaces are not preserved, the text is
     * broken at space boundaries if longer than the line width;
     * Multiple spaces are printed as such, but spaces at beginning
     * of line are removed.
     *
     * @param text The text to print
     * @param preserveSpace Space preserving flag
     * @param unescaped Print unescaped
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void serializePreRoot()

    /**
     * Comments and PIs cannot be serialized before the root element,
     * because the root element serializes the document type, which
     * generally comes first. Instead such PIs and comments are
     * accumulated inside a vector and serialized by calling this
     * method. Will be called when the root element is serialized
     * and when the document finished serializing.
     *
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected abstract void serializeElement( Element elem )

    /**
     * Called to serializee the DOM element. The element is serialized based on
     * the serializer's method (XML, HTML, XHTML).
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected abstract String getEntityRef( int ch );

    /**
     * Returns the suitable entity reference for this character value,
     * or null if no such entity exists. Calling this method with <tt>'&amp;'</tt>
     * will return <tt>"&amp;amp;"</tt>.
     *
     * @param ch Character value
     * @return Character entity name, or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void characters( String text )

    /**
     * Called to print the text contents in the prevailing element format.
     * Since this method is capable of printing text as CDATA, it is used
     * for that purpose as well. White space handling is determined by the
     * current element state. In addition, the output format can dictate
     * whether the text is printed as CDATA or unescaped.
     *
     * @param text The text to print
     * @param unescaped True is should print unescaped
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected ElementState content()

    /**
     * Must be called by a method about to print any type of content.
     * If the element was just opened, the opening tag is closed and
     * will be matched to a closing tag. Returns the current element
     * state with <tt>empty</tt> and <tt>afterElement</tt> set to false.
     *
     * @return The current element state
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected void serializeNode( Node node )

    /**
     * Serialize the DOM node. This method is shared across XML, HTML and XHTML
     * serializers and the differences are masked out in a separate {@link
     * #serializeElement}.
     *
     * @param node The node to serialize
     * @see #serializeElement
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void endDocument()

    /**
     * Called at the end of the document to wrap it up.
     * Will flush the output stream and throw an exception
     * if any I/O error occured while serializing.
     *
     * @throws SAXException An I/O exception occured during
     *  serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Document doc )

    /**
     * Serializes the DOM document using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param doc The document to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( DocumentFragment frag )

    /**
     * Serializes the DOM document fragmnt using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Node node ) throws IOException {

    /**
     * Serializes a node using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param node Node to serialize
     * @throws IOException An I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    public void serialize( Element elem )

    /**
     * Serializes the DOM element using the previously specified
     * writer and output format. Throws an exception only if
     * an I/O exception occured while serializing.
     *
     * @param elem The element to serialize
     * @throws IOException An I/O exception occured while
     *   serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected BaseMarkupSerializer( OutputFormat format )

    /**
     * Protected constructor can only be used by derived class.
     * Must initialize the serializer before serializing any document,
     * by calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
                 * first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Node fCurrentNode = null;

    /** Current node that is being processed  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private OutputStream    _output;

    /**
     * The output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private Writer          _writer;

    /**
     * The underlying writer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected final StringBuffer fStrBuffer = new StringBuffer(40);

    /** Temporary buffer to store character data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean       _indenting;

    /**
     * True if indenting printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Printer       _printer;

    /**
     * The printer used for printing text parts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected OutputFormat   _format;

    /**
     * The output format associated with this serializer. This will never
     * be a null reference. If no format was passed to the constructor,
     * the default one for this document type will be used. The format
     * object is never changed by the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String        _docTypeSystemId;

    /**
     * The system identifier of the document type, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected String        _docTypePublicId;

    /**
     * The system identifier of the document type, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected Map<String, String>  _prefixes;

    /**
     * Association between namespace URIs (keys) and prefixes (values).
     * Accumulated here prior to starting an element and placing this
     * list in the element state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private boolean         _prepared;

    /**
     * True if the serializer has been prepared. This flag is set
     * to false when the serializer is reset prior to using it,
     * and to true after it has been prepared for usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    protected boolean       _started;

    /**
     * If the document has been started (header serialized), this
     * flag is set to true so it's not started twice.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private Vector          _preRoot;

    /**
     * Vector holding comments and PIs that come before the root
     * element (even after it), see {@link #serializePreRoot}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private int             _elementStateCount;

    /**
     * The index of the next state to place in the array,
     * or one plus the index of the current state. When zero,
     * we are in no state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
    private ElementState[]  _elementStates;

    /**
     * Holds array of all element states that have been entered.
     * The array is automatically resized. When leaving an element,
     * it's state is not removed but reused when later returning
     * to the same nesting level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/BaseMarkupSerializer.java
public abstract class BaseMarkupSerializer

/**
 * Base class for a serializer supporting both DOM and SAX pretty
 * serializing of XML/HTML/XHTML documents. Derives classes perform
 * the method-specific serializing, this class provides the common
 * serializing mechanisms.
 * <p>
 * The serializer must be initialized with the proper writer and
 * output format before it can be used by calling {@link #setOutputCharStream}
 * or {@link #setOutputByteStream} for the writer and {@link #setOutputFormat}
 * for the output format.
 * <p>
 * The serializer can be reused any number of times, but cannot
 * be used concurrently by two threads.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. DOM serializing is done
 * by calling {@link #serialize(Document)} and SAX serializing is done by firing
 * SAX events and using the serializer as a document handler.
 * This also applies to derived class.
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
 * When indenting, the serializer is capable of detecting seemingly
 * element content, and serializing these elements indented on separate
 * lines. An element is serialized indented when it is the first or
 * last child of an element, or immediate following or preceding
 * another element.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a>
 * @author Elena Litani, IBM
 * @author Sunitha Reddy, Sun Microsystems
 * @see Serializer
 * @see LSSerializer
 */
