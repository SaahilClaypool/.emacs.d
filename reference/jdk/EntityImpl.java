_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setNotationName(String name) {

    /**
     * DOM Level 2: Unparsed entities -- which contain non-XML data -- have a
     * "notation name" which tells applications how to deal with them.
     * Parsed entities, which <em>are</em> in XML format, don't need this and
     * set it to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setSystemId(String id) {

    /**
     * DOM Level 2: The system identifier associated with the entity. If not
     * specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setXmlVersion(String value) {

    /**
      * NON-DOM
      * version - An attribute specifying, as part of the text declaration,
      * the version number of this entity, when it is an external parsed entity.
      * This is null otherwise
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setInputEncoding(String inputEncoding){

    /**
     * NON-DOM, used to set the input encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getInputEncoding(){

    /**
     * An attribute specifying the encoding used for this entity at the tiome
     * of parsing, when it is an external parsed entity. This is
     * <code>null</code> if it an entity from the internal subset or if it
     * is not known..
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setXmlEncoding(String value) {

    /**
     * NON-DOM
     * encoding - An attribute specifying, as part of the text declaration,
     * the encoding of this entity, when it is an external parsed entity.
     * This is null otherwise
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setPublicId(String id) {

    /**
     * DOM Level 2: The public identifier associated with the entity. If not specified,
     * this will be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getNotationName() {

    /**
     * Unparsed entities -- which contain non-XML data -- have a
     * "notation name" which tells applications how to deal with them.
     * Parsed entities, which <em>are</em> in XML format, don't need this and
     * set it to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getXmlEncoding() {

    /**
     * DOM Level 3 WD - experimental
     * the encoding of this entity, when it is an external parsed entity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getXmlVersion() {

    /**
      * DOM Level 3 WD - experimental
      * the version number of this entity, when it is an external parsed entity.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getSystemId() {

    /**
     * The system identifier associated with the entity. If not specified,
     * this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getPublicId() {

    /**
     * The public identifier associated with the entity. If not specified,
     * this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public Node cloneNode(boolean deep) {

    /** Clone node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setPrefix(String prefix)

    /**
     * The namespace prefix of this node
     * @exception DOMException
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setNodeValue(String x)

    /**
     * Sets the node value.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getNodeName() {

    /**
     * Returns the entity name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public EntityImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String baseURI;

    /** base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String notationName;

    /** Notation name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String version;

    /** Version */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String inputEncoding;

    /** Input Encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String encoding;

    /** Encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String systemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String publicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String name;

    /** Entity name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    static final long serialVersionUID = -3575760943444303423L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
public class EntityImpl

/**
 * Entity nodes hold the reference data for an XML Entity -- either
 * parsed or unparsed. The nodeName (inherited from Node) will contain
 * the name (if any) of the Entity. Its data will be contained in the
 * Entity's children, in exactly the structure which an
 * EntityReference to this name will present within the document's
 * body.
 * <P>
 * Note that this object models the actual entity, _not_ the entity
 * declaration or the entity reference.
 * <P>
 * An XML processor may choose to completely expand entities before
 * the structure model is passed to the DOM; in this case, there will
 * be no EntityReferences in the DOM tree.
 * <P>
 * Quoting the 10/01 DOM Proposal,
 * <BLOCKQUOTE>
 * "The DOM Level 1 does not support editing Entity nodes; if a user
 * wants to make changes to the contents of an Entity, every related
 * EntityReference node has to be replaced in the structure model by
 * a clone of the Entity's contents, and then the desired changes
 * must be made to each of those clones instead. All the
 * descendants of an Entity node are readonly."
 * </BLOCKQUOTE>
 * I'm interpreting this as: It is the parser's responsibilty to call
 * the non-DOM operation setReadOnly(true,true) after it constructs
 * the Entity. Since the DOM explicitly decided not to deal with this,
 * _any_ answer will involve a non-DOM operation, and this is the
 * simplest solution.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @since PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setNotationName(String name) {

    /**
     * DOM Level 2: Unparsed entities -- which contain non-XML data -- have a
     * "notation name" which tells applications how to deal with them.
     * Parsed entities, which <em>are</em> in XML format, don't need this and
     * set it to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setSystemId(String id) {

    /**
     * DOM Level 2: The system identifier associated with the entity. If not
     * specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setXmlVersion(String value) {

    /**
      * NON-DOM
      * version - An attribute specifying, as part of the text declaration,
      * the version number of this entity, when it is an external parsed entity.
      * This is null otherwise
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setInputEncoding(String inputEncoding){

    /**
     * NON-DOM, used to set the input encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getInputEncoding(){

    /**
     * An attribute specifying the encoding used for this entity at the tiome
     * of parsing, when it is an external parsed entity. This is
     * <code>null</code> if it an entity from the internal subset or if it
     * is not known..
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setXmlEncoding(String value) {

    /**
     * NON-DOM
     * encoding - An attribute specifying, as part of the text declaration,
     * the encoding of this entity, when it is an external parsed entity.
     * This is null otherwise
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setPublicId(String id) {

    /**
     * DOM Level 2: The public identifier associated with the entity. If not specified,
     * this will be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getNotationName() {

    /**
     * Unparsed entities -- which contain non-XML data -- have a
     * "notation name" which tells applications how to deal with them.
     * Parsed entities, which <em>are</em> in XML format, don't need this and
     * set it to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getXmlEncoding() {

    /**
     * DOM Level 3 WD - experimental
     * the encoding of this entity, when it is an external parsed entity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getXmlVersion() {

    /**
      * DOM Level 3 WD - experimental
      * the version number of this entity, when it is an external parsed entity.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getSystemId() {

    /**
     * The system identifier associated with the entity. If not specified,
     * this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getPublicId() {

    /**
     * The public identifier associated with the entity. If not specified,
     * this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public Node cloneNode(boolean deep) {

    /** Clone node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setPrefix(String prefix)

    /**
     * The namespace prefix of this node
     * @exception DOMException
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public void setNodeValue(String x)

    /**
     * Sets the node value.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public String getNodeName() {

    /**
     * Returns the entity name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    public EntityImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String baseURI;

    /** base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String notationName;

    /** Notation name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String version;

    /** Version */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String inputEncoding;

    /** Input Encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String encoding;

    /** Encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String systemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String publicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    protected String name;

    /** Entity name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
    static final long serialVersionUID = -3575760943444303423L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/EntityImpl.java
public class EntityImpl

/**
 * Entity nodes hold the reference data for an XML Entity -- either
 * parsed or unparsed. The nodeName (inherited from Node) will contain
 * the name (if any) of the Entity. Its data will be contained in the
 * Entity's children, in exactly the structure which an
 * EntityReference to this name will present within the document's
 * body.
 * <P>
 * Note that this object models the actual entity, _not_ the entity
 * declaration or the entity reference.
 * <P>
 * An XML processor may choose to completely expand entities before
 * the structure model is passed to the DOM; in this case, there will
 * be no EntityReferences in the DOM tree.
 * <P>
 * Quoting the 10/01 DOM Proposal,
 * <BLOCKQUOTE>
 * "The DOM Level 1 does not support editing Entity nodes; if a user
 * wants to make changes to the contents of an Entity, every related
 * EntityReference node has to be replaced in the structure model by
 * a clone of the Entity's contents, and then the desired changes
 * must be made to each of those clones instead. All the
 * descendants of an Entity node are readonly."
 * </BLOCKQUOTE>
 * I'm interpreting this as: It is the parser's responsibilty to call
 * the non-DOM operation setReadOnly(true,true) after it constructs
 * the Entity. Since the DOM explicitly decided not to deal with this,
 * _any_ answer will involve a non-DOM operation, and this is the
 * simplest solution.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @since PR-DOM-Level-1-19980818.
 */
