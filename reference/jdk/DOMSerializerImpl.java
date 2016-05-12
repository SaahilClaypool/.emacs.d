_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean writeToURI(Node node, String URI) throws LSException{

    /**
      *  Serialize the specified node as described above in the general
      * description of the <code>LSSerializer</code> interface. The output
      * is written to the supplied URI.
      * <br> When writing to a URI, the encoding is found by looking at the
      * encoding information that is reachable through the item to be written
      * (or its owner document) in this order:
      * <ol>
      * <li>
      * <code>Document.inputEncoding</code>,
      * </li>
      * <li>
      * <code>Document.xmlEncoding</code>.
      * </li>
      * </ol>
      * <br> If no encoding is reachable through the above properties, a
      * default encoding of "UTF-8" will be used.
      * <br> If the specified encoding is not supported an
      * "unsupported-encoding" error is raised.
      * @param node  The node to serialize.
      * @param URI The URI to write to.
      * @return  Returns <code>true</code> if <code>node</code> was
      *   successfully serialized and <code>false</code> in case the node
      *   couldn't be serialized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean write(Node node, LSOutput destination) throws LSException{

    /**
      *  Serialize the specified node as described above in the general
      * description of the <code>LSSerializer</code> interface. The output
      * is written to the supplied <code>LSOutput</code>.
      * <br> When writing to a <code>LSOutput</code>, the encoding is found by
      * looking at the encoding information that is reachable through the
      * <code>LSOutput</code> and the item to be written (or its owner
      * document) in this order:
      * <ol>
      * <li> <code>LSOutput.encoding</code>,
      * </li>
      * <li>
      * <code>Document.actualEncoding</code>,
      * </li>
      * <li>
      * <code>Document.xmlEncoding</code>.
      * </li>
      * </ol>
      * <br> If no encoding is reachable through the above properties, a
      * default encoding of "UTF-8" will be used.
      * <br> If the specified encoding is not supported an
      * "unsupported-encoding" error is raised.
      * <br> If no output is specified in the <code>LSOutput</code>, a
      * "no-output-specified" error is raised.
      * @param node  The node to serialize.
      * @param destination The destination for the serialized DOM.
      * @return  Returns <code>true</code> if <code>node</code> was
      *   successfully serialized and <code>false</code> in case the node
      *   couldn't be serialized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setFilter(LSSerializerFilter filter){

    /**
     *  When the application provides a filter, the serializer will call out
     * to the filter before serializing each Node. Attribute nodes are never
     * passed to the filter. The filter implementation can choose to remove
     * the node from the stream or to terminate the serialization early.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public LSSerializerFilter getFilter(){

    /**
     *  When the application provides a filter, the serializer will call out
     * to the filter before serializing each Node. Attribute nodes are never
     * passed to the filter. The filter implementation can choose to remove
     * the node from the stream or to terminate the serialization early.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public String getNewLine() {

    /**
     * DOM L3 EXPERIMENTAL:
     * The end-of-line sequence of characters to be used in the XML being
     * written out. The only permitted values are these:
     * <dl>
     * <dt><code>null</code></dt>
     * <dd>
     * Use a default end-of-line sequence. DOM implementations should choose
     * the default to match the usual convention for text files in the
     * environment being used. Implementations must choose a default
     * sequence that matches one of those allowed by  2.11 "End-of-Line
     * Handling". </dd>
     * <dt>CR</dt>
     * <dd>The carriage-return character (#xD).</dd>
     * <dt>CR-LF</dt>
     * <dd> The
     * carriage-return and line-feed characters (#xD #xA). </dd>
     * <dt>LF</dt>
     * <dd> The line-feed
     * character (#xA). </dd>
     * </dl>
     * <br>The default value for this attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setNewLine(String newLine) {

    /**
     * DOM L3 EXPERIMENTAL:
     * The end-of-line sequence of characters to be used in the XML being
     * written out. The only permitted values are these:
     * <dl>
     * <dt><code>null</code></dt>
     * <dd>
     * Use a default end-of-line sequence. DOM implementations should choose
     * the default to match the usual convention for text files in the
     * environment being used. Implementations must choose a default
     * sequence that matches one of those allowed by  2.11 "End-of-Line
     * Handling". </dd>
     * <dt>CR</dt>
     * <dd>The carriage-return character (#xD).</dd>
     * <dt>CR-LF</dt>
     * <dd> The
     * carriage-return and line-feed characters (#xD #xA). </dd>
     * <dt>LF</dt>
     * <dd> The line-feed
     * character (#xA). </dd>
     * </dl>
     * <br>The default value for this attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public String writeToString(Node wnode) throws DOMException, LSException {

    /**
     * DOM L3 EXPERIMENTAL:
     *  Serialize the specified node as described above in the description of
     * <code>LSSerializer</code>. The result of serializing the node is
     * returned as a string. Writing a Document or Entity node produces a
     * serialized form that is well formed XML. Writing other node types
     * produces a fragment of text in a form that is not fully defined by
     * this document, but that should be useful to a human for debugging or
     * diagnostic purposes.
     * @param wnode  The node to be written.
     * @return  Returns the serialized data
     * @exception DOMException
     *    DOMSTRING_SIZE_ERR: The resulting string is too long to fit in a
     *   <code>DOMString</code>.
     * @exception LSException
     *    SERIALIZE_ERR: Unable to serialize the node.  DOM applications should
     *    attach a <code>DOMErrorHandler</code> using the parameter
     *    &quot;<i>error-handler</i>&quot; to get details on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public Object getParameter(String name) throws DOMException {

    /** DOM L3-EXPERIMENTAL:
     * Getter for boolean and object parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public DOMStringList getParameterNames() {

    /**
     *  DOM Level 3 Core CR - Experimental.
     *
     *  The list of the parameters supported by this
     * <code>DOMConfiguration</code> object and for which at least one value
     * can be set by the application. Note that this list can also contain
     * parameter names defined outside this specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean canSetParameter(String name, Object state) {

    /** DOM L3-EXPERIMENTAL:
     * Check if parameter can be set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setParameter(String name, Object value) throws DOMException {

    /** DOM L3-EXPERIMENTAL:
     * Setter for boolean and object parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public DOMSerializerImpl() {

    /**
     * Constructs a new LSSerializer.
     * The constructor turns on the namespace support in <code>XMLSerializer</code> and
     * initializes the following fields: fNSBinder, fLocalNSBinder, fSymbolTable,
     * fEmptySymbol, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter, fFeatures.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    protected short features = 0;

    /** REVISIT: Currently we handle 3 different configurations, would be nice just have one configuration
     * that has different recognized parameters depending if it is used in Core/LS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
public class DOMSerializerImpl implements LSSerializer, DOMConfiguration {

/**
 * EXPERIMENTAL: Implemenatation of DOM Level 3 org.w3c.ls.LSSerializer  by delegating serialization
 * calls to <CODE>XMLSerializer</CODE>.
 * LSSerializer provides an API for serializing (writing) a DOM document out in an
 * XML document. The XML data is written to an output stream.
 * During serialization of XML data, namespace fixup is done when possible as
 * defined in DOM Level 3 Core, Appendix B.
 *
 * @author Elena Litani, IBM
 * @author Gopal Sharma, Sun Microsystems
 * @author Arun Yadav, Sun Microsystems
 * @author Sunitha Reddy, Sun Microsystems
 * @version $Id: DOMSerializerImpl.java,v 1.11 2010-11-01 04:40:36 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean writeToURI(Node node, String URI) throws LSException{

    /**
      *  Serialize the specified node as described above in the general
      * description of the <code>LSSerializer</code> interface. The output
      * is written to the supplied URI.
      * <br> When writing to a URI, the encoding is found by looking at the
      * encoding information that is reachable through the item to be written
      * (or its owner document) in this order:
      * <ol>
      * <li>
      * <code>Document.inputEncoding</code>,
      * </li>
      * <li>
      * <code>Document.xmlEncoding</code>.
      * </li>
      * </ol>
      * <br> If no encoding is reachable through the above properties, a
      * default encoding of "UTF-8" will be used.
      * <br> If the specified encoding is not supported an
      * "unsupported-encoding" error is raised.
      * @param node  The node to serialize.
      * @param URI The URI to write to.
      * @return  Returns <code>true</code> if <code>node</code> was
      *   successfully serialized and <code>false</code> in case the node
      *   couldn't be serialized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean write(Node node, LSOutput destination) throws LSException{

    /**
      *  Serialize the specified node as described above in the general
      * description of the <code>LSSerializer</code> interface. The output
      * is written to the supplied <code>LSOutput</code>.
      * <br> When writing to a <code>LSOutput</code>, the encoding is found by
      * looking at the encoding information that is reachable through the
      * <code>LSOutput</code> and the item to be written (or its owner
      * document) in this order:
      * <ol>
      * <li> <code>LSOutput.encoding</code>,
      * </li>
      * <li>
      * <code>Document.actualEncoding</code>,
      * </li>
      * <li>
      * <code>Document.xmlEncoding</code>.
      * </li>
      * </ol>
      * <br> If no encoding is reachable through the above properties, a
      * default encoding of "UTF-8" will be used.
      * <br> If the specified encoding is not supported an
      * "unsupported-encoding" error is raised.
      * <br> If no output is specified in the <code>LSOutput</code>, a
      * "no-output-specified" error is raised.
      * @param node  The node to serialize.
      * @param destination The destination for the serialized DOM.
      * @return  Returns <code>true</code> if <code>node</code> was
      *   successfully serialized and <code>false</code> in case the node
      *   couldn't be serialized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setFilter(LSSerializerFilter filter){

    /**
     *  When the application provides a filter, the serializer will call out
     * to the filter before serializing each Node. Attribute nodes are never
     * passed to the filter. The filter implementation can choose to remove
     * the node from the stream or to terminate the serialization early.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public LSSerializerFilter getFilter(){

    /**
     *  When the application provides a filter, the serializer will call out
     * to the filter before serializing each Node. Attribute nodes are never
     * passed to the filter. The filter implementation can choose to remove
     * the node from the stream or to terminate the serialization early.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public String getNewLine() {

    /**
     * DOM L3 EXPERIMENTAL:
     * The end-of-line sequence of characters to be used in the XML being
     * written out. The only permitted values are these:
     * <dl>
     * <dt><code>null</code></dt>
     * <dd>
     * Use a default end-of-line sequence. DOM implementations should choose
     * the default to match the usual convention for text files in the
     * environment being used. Implementations must choose a default
     * sequence that matches one of those allowed by  2.11 "End-of-Line
     * Handling". </dd>
     * <dt>CR</dt>
     * <dd>The carriage-return character (#xD).</dd>
     * <dt>CR-LF</dt>
     * <dd> The
     * carriage-return and line-feed characters (#xD #xA). </dd>
     * <dt>LF</dt>
     * <dd> The line-feed
     * character (#xA). </dd>
     * </dl>
     * <br>The default value for this attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setNewLine(String newLine) {

    /**
     * DOM L3 EXPERIMENTAL:
     * The end-of-line sequence of characters to be used in the XML being
     * written out. The only permitted values are these:
     * <dl>
     * <dt><code>null</code></dt>
     * <dd>
     * Use a default end-of-line sequence. DOM implementations should choose
     * the default to match the usual convention for text files in the
     * environment being used. Implementations must choose a default
     * sequence that matches one of those allowed by  2.11 "End-of-Line
     * Handling". </dd>
     * <dt>CR</dt>
     * <dd>The carriage-return character (#xD).</dd>
     * <dt>CR-LF</dt>
     * <dd> The
     * carriage-return and line-feed characters (#xD #xA). </dd>
     * <dt>LF</dt>
     * <dd> The line-feed
     * character (#xA). </dd>
     * </dl>
     * <br>The default value for this attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public String writeToString(Node wnode) throws DOMException, LSException {

    /**
     * DOM L3 EXPERIMENTAL:
     *  Serialize the specified node as described above in the description of
     * <code>LSSerializer</code>. The result of serializing the node is
     * returned as a string. Writing a Document or Entity node produces a
     * serialized form that is well formed XML. Writing other node types
     * produces a fragment of text in a form that is not fully defined by
     * this document, but that should be useful to a human for debugging or
     * diagnostic purposes.
     * @param wnode  The node to be written.
     * @return  Returns the serialized data
     * @exception DOMException
     *    DOMSTRING_SIZE_ERR: The resulting string is too long to fit in a
     *   <code>DOMString</code>.
     * @exception LSException
     *    SERIALIZE_ERR: Unable to serialize the node.  DOM applications should
     *    attach a <code>DOMErrorHandler</code> using the parameter
     *    &quot;<i>error-handler</i>&quot; to get details on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public Object getParameter(String name) throws DOMException {

    /** DOM L3-EXPERIMENTAL:
     * Getter for boolean and object parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public DOMStringList getParameterNames() {

    /**
     *  DOM Level 3 Core CR - Experimental.
     *
     *  The list of the parameters supported by this
     * <code>DOMConfiguration</code> object and for which at least one value
     * can be set by the application. Note that this list can also contain
     * parameter names defined outside this specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public boolean canSetParameter(String name, Object state) {

    /** DOM L3-EXPERIMENTAL:
     * Check if parameter can be set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public void setParameter(String name, Object value) throws DOMException {

    /** DOM L3-EXPERIMENTAL:
     * Setter for boolean and object parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    public DOMSerializerImpl() {

    /**
     * Constructs a new LSSerializer.
     * The constructor turns on the namespace support in <code>XMLSerializer</code> and
     * initializes the following fields: fNSBinder, fLocalNSBinder, fSymbolTable,
     * fEmptySymbol, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter, fFeatures.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
    protected short features = 0;

    /** REVISIT: Currently we handle 3 different configurations, would be nice just have one configuration
     * that has different recognized parameters depending if it is used in Core/LS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/DOMSerializerImpl.java
public class DOMSerializerImpl implements LSSerializer, DOMConfiguration {

/**
 * EXPERIMENTAL: Implemenatation of DOM Level 3 org.w3c.ls.LSSerializer  by delegating serialization
 * calls to <CODE>XMLSerializer</CODE>.
 * LSSerializer provides an API for serializing (writing) a DOM document out in an
 * XML document. The XML data is written to an output stream.
 * During serialization of XML data, namespace fixup is done when possible as
 * defined in DOM Level 3 Core, Appendix B.
 *
 * @author Elena Litani, IBM
 * @author Gopal Sharma, Sun Microsystems
 * @author Arun Yadav, Sun Microsystems
 * @author Sunitha Reddy, Sun Microsystems
 * @version $Id: DOMSerializerImpl.java,v 1.11 2010-11-01 04:40:36 joehw Exp $
 */
