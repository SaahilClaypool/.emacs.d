_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public void abort();

    /**
     *  Abort the loading of the document that is currently being loaded by
     * the <code>LSParser</code>. If the <code>LSParser</code> is currently
     * not busy, a call to this method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public Node parseWithContext(LSInput input,
                                 Node contextArg,
                                 short action)

    /**
     *  Parse an XML fragment from a resource identified by a
     * <code>LSInput</code> and insert the content into an existing document
     * at the position specified with the <code>context</code> and
     * <code>action</code> arguments. When parsing the input stream, the
     * context node (or its parent, depending on where the result will be
     * inserted) is used for resolving unbound namespace prefixes. The
     * context node's <code>ownerDocument</code> node (or the node itself if
     * the node of type <code>DOCUMENT_NODE</code>) is used to resolve
     * default attributes and entity references.
     * <br> As the new data is inserted into the document, at least one
     * mutation event is fired per new immediate child or sibling of the
     * context node.
     * <br> If the context node is a <code>Document</code> node and the action
     * is <code>ACTION_REPLACE_CHILDREN</code>, then the document that is
     * passed as the context node will be changed such that its
     * <code>xmlEncoding</code>, <code>documentURI</code>,
     * <code>xmlVersion</code>, <code>inputEncoding</code>,
     * <code>xmlStandalone</code>, and all other such attributes are set to
     * what they would be set to if the input source was parsed using
     * <code>LSParser.parse()</code>.
     * <br> This method is always synchronous, even if the
     * <code>LSParser</code> is asynchronous (<code>LSParser.async</code> is
     * <code>true</code>).
     * <br> If an error occurs while parsing, the caller is notified through
     * the <code>ErrorHandler</code> instance associated with the "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-error-handler'>
     * error-handler</a>" parameter of the <code>DOMConfiguration</code>.
     * <br> When calling <code>parseWithContext</code>, the values of the
     * following configuration parameters will be ignored and their default
     * values will always be used instead: "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-validate'>
     * validate</a>", "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-validate-if-schema'>
     * validate-if-schema</a>", and "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-element-content-whitespace'>
     * element-content-whitespace</a>". Other parameters will be treated normally, and the parser is expected
     * to call the <code>LSParserFilter</code> just as if a whole document
     * was parsed.
     * @param input  The <code>LSInput</code> from which the source document
     *   is to be read. The source document must be an XML fragment, i.e.
     *   anything except a complete XML document (except in the case where
     *   the context node of type <code>DOCUMENT_NODE</code>, and the action
     *   is <code>ACTION_REPLACE_CHILDREN</code>), a DOCTYPE (internal
     *   subset), entity declaration(s), notation declaration(s), or XML or
     *   text declaration(s).
     * @param contextArg  The node that is used as the context for the data
     *   that is being parsed. This node must be a <code>Document</code>
     *   node, a <code>DocumentFragment</code> node, or a node of a type
     *   that is allowed as a child of an <code>Element</code> node, e.g. it
     *   cannot be an <code>Attribute</code> node.
     * @param action  This parameter describes which action should be taken
     *   between the new set of nodes being inserted and the existing
     *   children of the context node. The set of possible actions is
     *   defined in <code>ACTION_TYPES</code> above.
     * @return  Return the node that is the result of the parse operation. If
     *   the result is more than one top-level node, the first one is
     *   returned.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Raised if the content cannot replace, be
     *   inserted before, after, or as a child of the context node (see also
     *   <code>Node.insertBefore</code> or <code>Node.replaceChild</code> in [<a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>DOM Level 3 Core</a>]
     *   ).
     *   <br> NOT_SUPPORTED_ERR: Raised if the <code>LSParser</code> doesn't
     *   support this method, or if the context node is of type
     *   <code>Document</code> and the DOM implementation doesn't support
     *   the replacement of the <code>DocumentType</code> child or
     *   <code>Element</code> child.
     *   <br> NO_MODIFICATION_ALLOWED_ERR: Raised if the context node is a
     *   read only node and the content is being appended to its child list,
     *   or if the parent node of the context node is read only node and the
     *   content is being inserted in its child list.
     *   <br> INVALID_STATE_ERR: Raised if the <code>LSParser.busy</code>
     *   attribute is <code>true</code>.
     * @exception LSException
     *    PARSE_ERR: Raised if the <code>LSParser</code> was unable to load
     *   the XML fragment. DOM applications should attach a
     *   <code>DOMErrorHandler</code> using the parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-error-handler'>
     *   error-handler</a>" if they wish to get details on the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public static final short ACTION_REPLACE            = 5;

    /**
     *  Replace the context node with the result of the parse operation. For
     * this action to work, the context node must have a parent, and the
     * parent must be an <code>Element</code> or a
     * <code>DocumentFragment</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public static final short ACTION_INSERT_BEFORE      = 3;

    /**
     *  Insert the result of the parse operation as the immediately preceding
     * sibling of the context node. For this action to work the context
     * node's parent must be an <code>Element</code> or a
     * <code>DocumentFragment</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public static final short ACTION_APPEND_AS_CHILDREN = 1;

    /**
     *  Append the result of the parse operation as children of the context
     * node. For this action to work, the context node must be an
     * <code>Element</code> or a <code>DocumentFragment</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public Document parseURI(String uri)

    /**
     *  Parse an XML document from a location identified by a URI reference [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>]. If the URI
     * contains a fragment identifier (see section 4.1 in [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>]), the
     * behavior is not defined by this specification, future versions of
     * this specification may define the behavior.
     * @param uri The location of the XML document to be read.
     * @return  If the <code>LSParser</code> is a synchronous
     *   <code>LSParser</code>, the newly created and populated
     *   <code>Document</code> is returned, or <code>null</code> if an error
     *   occured. If the <code>LSParser</code> is asynchronous,
     *   <code>null</code> is returned since the document object may not yet
     *   be constructed when this method returns.
     * @exception DOMException
     *    INVALID_STATE_ERR: Raised if the <code>LSParser.busy</code>
     *   attribute is <code>true</code>.
     * @exception LSException
     *    PARSE_ERR: Raised if the <code>LSParser</code> was unable to load
     *   the XML document. DOM applications should attach a
     *   <code>DOMErrorHandler</code> using the parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-error-handler'>
     *   error-handler</a>" if they wish to get details on the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public Document parse(LSInput input)

    /**
     * Parse an XML document from a resource identified by a
     * <code>LSInput</code>.
     * @param input  The <code>LSInput</code> from which the source of the
     *   document is to be read.
     * @return  If the <code>LSParser</code> is a synchronous
     *   <code>LSParser</code>, the newly created and populated
     *   <code>Document</code> is returned. If the <code>LSParser</code> is
     *   asynchronous, <code>null</code> is returned since the document
     *   object may not yet be constructed when this method returns.
     * @exception DOMException
     *    INVALID_STATE_ERR: Raised if the <code>LSParser</code>'s
     *   <code>LSParser.busy</code> attribute is <code>true</code>.
     * @exception LSException
     *    PARSE_ERR: Raised if the <code>LSParser</code> was unable to load
     *   the XML document. DOM applications should attach a
     *   <code>DOMErrorHandler</code> using the parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-error-handler'>
     *   error-handler</a>" if they wish to get details on the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public boolean getBusy();

    /**
     *  <code>true</code> if the <code>LSParser</code> is currently busy
     * loading a document, otherwise <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public boolean getAsync();

    /**
     *  <code>true</code> if the <code>LSParser</code> is asynchronous,
     * <code>false</code> if it is synchronous.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
    public LSParserFilter getFilter();

    /**
     *  When a filter is provided, the implementation will call out to the
     * filter as it is constructing the DOM tree structure. The filter can
     * choose to remove elements from the document being constructed, or to
     * terminate the parsing early.
     * <br> The filter is invoked after the operations requested by the
     * <code>DOMConfiguration</code> parameters have been applied. For
     * example, if "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-validate'>
     * validate</a>" is set to <code>true</code>, the validation is done before invoking the
     * filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSParser.java
public interface LSParser {

/**
 *  An interface to an object that is able to build, or augment, a DOM tree
 * from various input sources.
 * <p> <code>LSParser</code> provides an API for parsing XML and building the
 * corresponding DOM document structure. A <code>LSParser</code> instance
 * can be obtained by invoking the
 * <code>DOMImplementationLS.createLSParser()</code> method.
 * <p> As specified in [<a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>DOM Level 3 Core</a>]
 * , when a document is first made available via the LSParser:
 * <ul>
 * <li> there will
 * never be two adjacent nodes of type NODE_TEXT, and there will never be
 * empty text nodes.
 * </li>
 * <li> it is expected that the <code>value</code> and
 * <code>nodeValue</code> attributes of an <code>Attr</code> node initially
 * return the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#AVNormalize'>XML 1.0
 * normalized value</a>. However, if the parameters "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-validate-if-schema'>
 * validate-if-schema</a>" and "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-datatype-normalization'>
 * datatype-normalization</a>" are set to <code>true</code>, depending on the attribute normalization
 * used, the attribute values may differ from the ones obtained by the XML
 * 1.0 attribute normalization. If the parameters "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-datatype-normalization'>
 * datatype-normalization</a>" is set to <code>false</code>, the XML 1.0 attribute normalization is
 * guaranteed to occur, and if the attributes list does not contain
 * namespace declarations, the <code>attributes</code> attribute on
 * <code>Element</code> node represents the property <b>[attributes]</b> defined in [<a href='http://www.w3.org/TR/2004/REC-xml-infoset-20040204/'>XML Information Set</a>]
 * .
 * </li>
 * </ul>
 * <p> Asynchronous <code>LSParser</code> objects are expected to also
 * implement the <code>events::EventTarget</code> interface so that event
 * listeners can be registered on asynchronous <code>LSParser</code>
 * objects.
 * <p> Events supported by asynchronous <code>LSParser</code> objects are:
 * <dl>
 * <dt>load</dt>
 * <dd>
 *  The <code>LSParser</code> finishes to load the document. See also the
 * definition of the <code>LSLoadEvent</code> interface. </dd>
 * <dt>progress</dt>
 * <dd> The
 * <code>LSParser</code> signals progress as data is parsed.  This
 * specification does not attempt to define exactly when progress events
 * should be dispatched. That is intentionally left as
 * implementation-dependent. Here is one example of how an application might
 * dispatch progress events: Once the parser starts receiving data, a
 * progress event is dispatched to indicate that the parsing starts. From
 * there on, a progress event is dispatched for every 4096 bytes of data
 * that is received and processed. This is only one example, though, and
 * implementations can choose to dispatch progress events at any time while
 * parsing, or not dispatch them at all.  See also the definition of the
 * <code>LSProgressEvent</code> interface. </dd>
 * </dl>
 * <p ><b>Note:</b>  All events defined in this specification use the
 * namespace URI <code>"http://www.w3.org/2002/DOMLS"</code>.
 * <p> While parsing an input source, errors are reported to the application
 * through the error handler (<code>LSParser.domConfig</code>'s "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-error-handler'>
 * error-handler</a>" parameter). This specification does in no way try to define all possible
 * errors that can occur while parsing XML, or any other markup, but some
 * common error cases are defined. The types (<code>DOMError.type</code>) of
 * errors and warnings defined by this specification are:
 * <dl>
 * <dt>
 * <code>"check-character-normalization-failure" [error]</code> </dt>
 * <dd> Raised if
 * the parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-check-character-normalization'>
 * check-character-normalization</a>" is set to true and a string is encountered that fails normalization
 * checking. </dd>
 * <dt><code>"doctype-not-allowed" [fatal]</code></dt>
 * <dd> Raised if the
 * configuration parameter "disallow-doctype" is set to <code>true</code>
 * and a doctype is encountered. </dd>
 * <dt><code>"no-input-specified" [fatal]</code></dt>
 * <dd>
 * Raised when loading a document and no input is specified in the
 * <code>LSInput</code> object. </dd>
 * <dt>
 * <code>"pi-base-uri-not-preserved" [warning]</code></dt>
 * <dd> Raised if a processing
 * instruction is encountered in a location where the base URI of the
 * processing instruction can not be preserved.  One example of a case where
 * this warning will be raised is if the configuration parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-entities'>
 * entities</a>" is set to <code>false</code> and the following XML file is parsed:
 * <pre>
 * &lt;!DOCTYPE root [ &lt;!ENTITY e SYSTEM 'subdir/myentity.ent' ]&gt;
 * &lt;root&gt; &amp;e; &lt;/root&gt;</pre>
 *  And <code>subdir/myentity.ent</code>
 * contains:
 * <pre>&lt;one&gt; &lt;two/&gt; &lt;/one&gt; &lt;?pi 3.14159?&gt;
 * &lt;more/&gt;</pre>
 * </dd>
 * <dt><code>"unbound-prefix-in-entity" [warning]</code></dt>
 * <dd> An
 * implementation dependent warning that may be raised if the configuration
 * parameter "<a href='http://www.w3.org/TR/DOM-Level-3-Core/core.html#parameter-namespaces'>
 * namespaces</a>" is set to <code>true</code> and an unbound namespace prefix is
 * encountered in an entity's replacement text. Raising this warning is not
 * enforced since some existing parsers may not recognize unbound namespace
 * prefixes in the replacement text of entities. </dd>
 * <dt>
 * <code>"unknown-character-denormalization" [fatal]</code></dt>
 * <dd> Raised if the
 * configuration parameter "ignore-unknown-character-denormalizations" is
 * set to <code>false</code> and a character is encountered for which the
 * processor cannot determine the normalization properties. </dd>
 * <dt>
 * <code>"unsupported-encoding" [fatal]</code></dt>
 * <dd> Raised if an unsupported
 * encoding is encountered. </dd>
 * <dt><code>"unsupported-media-type" [fatal]</code></dt>
 * <dd>
 * Raised if the configuration parameter "supported-media-types-only" is set
 * to <code>true</code> and an unsupported media type is encountered. </dd>
 * </dl>
 * <p> In addition to raising the defined errors and warnings, implementations
 * are expected to raise implementation specific errors and warnings for any
 * other error and warning cases such as IO errors (file not found,
 * permission denied,...), XML well-formedness errors, and so on.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407'>Document Object Model (DOM) Level 3 Load
and Save Specification</a>.
 */
