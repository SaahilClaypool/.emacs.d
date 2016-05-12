_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( OutputStream output, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( Writer writer, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( OutputFormat format ) {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer() {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected boolean fNamespaces = false;

    /**
     * Controls whether namespace fixup should be performed during
     * the serialization.
     * NOTE: if this field is set to true the following
     * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable,
     * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected SymbolTable fSymbolTable;

    /** symbol table for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected NamespaceSupport fLocalNSBinder;

    /** stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected NamespaceSupport fNSBinder;

    /** stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
public class XML11Serializer

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( OutputStream output, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( Writer writer, OutputFormat format ) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer( OutputFormat format ) {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    public XML11Serializer() {

    /**
     * Constructs a new serializer. The serializer cannot be used without
     * calling {@link #setOutputCharStream} or {@link #setOutputByteStream}
     * first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected boolean fNamespaces = false;

    /**
     * Controls whether namespace fixup should be performed during
     * the serialization.
     * NOTE: if this field is set to true the following
     * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable,
     * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected SymbolTable fSymbolTable;

    /** symbol table for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected NamespaceSupport fLocalNSBinder;

    /** stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
    protected NamespaceSupport fNSBinder;

    /** stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/XML11Serializer.java
public class XML11Serializer

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
