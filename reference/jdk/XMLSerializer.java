_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
        protected void checkUnboundNamespacePrefixedNode (Node node) throws IOException{

   /**
    * DOM Level 3:
    * Check a node to determine if it contains unbound namespace prefixes.
    *
    * @param node The node to check for unbound namespace prefices
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected void printXMLChar( int ch) throws IOException {

    /** print text data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private Attributes extractNamespaces( Attributes attrs )

    /** Retrieve and remove the namespaces declarations from the list of attributes.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private void printAttribute (String name, String value, boolean isSpecified, Attr attr) throws IOException{

    /**
     * Prints attribute.
     * NOTE: xml:space attribute modifies output format
     *
     * @param name
     * @param value
     * @param isSpecified
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private void printNamespaceAttr(String prefix, String uri) throws IOException{

    /**
     * Serializes a namespace attribute with the given prefix and value for URI.
     * In case prefix is empty will serialize default namespace declaration.
     *
     * @param prefix
     * @param uri
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected void serializeElement( Element elem )

    /**
     * Called to serialize a DOM element. Equivalent to calling {@link
     * #startElement}, {@link #endElement} and serializing everything
     * inbetween, but better optimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public void setNamespaces (boolean namespaces){

    /**
     * This methods turns on namespace fixup algorithm during
     * DOM serialization.
     * @see org.w3c.dom.ls.DOMSerializer
     *
     * @param namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( OutputStream output, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( Writer writer, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( OutputFormat format ) {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer() {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected boolean fNamespacePrefixes = true;

    /**
     * Controls whether namespace prefixes will be printed out during serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected boolean fNamespaces = false;

    /**
     * Controls whether namespace fixup should be performed during
     * the serialization.
     * NOTE: if this field is set to true the following
     * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable,
     * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected SymbolTable fSymbolTable;

    /** symbol table for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected NamespaceSupport fLocalNSBinder;

    /** stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected NamespaceSupport fNSBinder;

    /** stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
public class XMLSerializer

/**
 * Implements an XML serializer supporting both DOM and SAX pretty
 * serializing. For usage instructions see {@link Serializer}.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. SAX serializing is done by firing
 * SAX events and using the serializer as a document handler. DOM serializing is done
 * by calling {@link #serialize(Document)} or by using DOM Level 3
 * {@link org.w3c.dom.ls.DOMSerializer} and
 * serializing with {@link org.w3c.dom.ls.DOMSerializer#write},
 * {@link org.w3c.dom.ls.DOMSerializer#writeToString}.
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
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a>
 * @author Elena Litani IBM
 * @see Serializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
        protected void checkUnboundNamespacePrefixedNode (Node node) throws IOException{

   /**
    * DOM Level 3:
    * Check a node to determine if it contains unbound namespace prefixes.
    *
    * @param node The node to check for unbound namespace prefices
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected void printXMLChar( int ch) throws IOException {

    /** print text data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private Attributes extractNamespaces( Attributes attrs )

    /** Retrieve and remove the namespaces declarations from the list of attributes.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private void printAttribute (String name, String value, boolean isSpecified, Attr attr) throws IOException{

    /**
     * Prints attribute.
     * NOTE: xml:space attribute modifies output format
     *
     * @param name
     * @param value
     * @param isSpecified
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    private void printNamespaceAttr(String prefix, String uri) throws IOException{

    /**
     * Serializes a namespace attribute with the given prefix and value for URI.
     * In case prefix is empty will serialize default namespace declaration.
     *
     * @param prefix
     * @param uri
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected void serializeElement( Element elem )

    /**
     * Called to serialize a DOM element. Equivalent to calling {@link
     * #startElement}, {@link #endElement} and serializing everything
     * inbetween, but better optimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public void setNamespaces (boolean namespaces){

    /**
     * This methods turns on namespace fixup algorithm during
     * DOM serialization.
     * @see org.w3c.dom.ls.DOMSerializer
     *
     * @param namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( OutputStream output, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( Writer writer, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer( OutputFormat format ) {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    public XMLSerializer() {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected boolean fNamespacePrefixes = true;

    /**
     * Controls whether namespace prefixes will be printed out during serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected boolean fNamespaces = false;

    /**
     * Controls whether namespace fixup should be performed during
     * the serialization.
     * NOTE: if this field is set to true the following
     * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable,
     * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected SymbolTable fSymbolTable;

    /** symbol table for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected NamespaceSupport fLocalNSBinder;

    /** stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
    protected NamespaceSupport fNSBinder;

    /** stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XMLSerializer.java
public class XMLSerializer

/**
 * Implements an XML serializer supporting both DOM and SAX pretty
 * serializing. For usage instructions see {@link Serializer}.
 * <p>
 * If an output stream is used, the encoding is taken from the
 * output format (defaults to <tt>UTF-8</tt>). If a writer is
 * used, make sure the writer uses the same encoding (if applies)
 * as specified in the output format.
 * <p>
 * The serializer supports both DOM and SAX. SAX serializing is done by firing
 * SAX events and using the serializer as a document handler. DOM serializing is done
 * by calling {@link #serialize(Document)} or by using DOM Level 3
 * {@link org.w3c.dom.ls.DOMSerializer} and
 * serializing with {@link org.w3c.dom.ls.DOMSerializer#write},
 * {@link org.w3c.dom.ls.DOMSerializer#writeToString}.
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
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a>
 * @author Elena Litani IBM
 * @see Serializer
 */
