_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setSystemId(String id) {

    /**
     * NON-DOM: The System Identifier for this Notation. If no system
     * identifier was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setPublicId(String id) {

    /**
     * NON-DOM: The Public Identifier for this Notation. If no public
     * identifier was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getSystemId() {

    /**
     * The System Identifier for this Notation. If no system identifier
     * was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getPublicId() {

    /**
     * The Public Identifier for this Notation. If no public identifier
     * was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getNodeName() {

    /**
     * Returns the notation name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public NotationImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String baseURI;

    /** Base URI*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String systemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String publicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String name;

    /** Notation name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    static final long serialVersionUID = -764632195890658402L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
public class NotationImpl

/**
 * Notations are how the Document Type Description (DTD) records hints
 * about the format of an XML "unparsed entity" -- in other words,
 * non-XML data bound to this document type, which some applications
 * may wish to consult when manipulating the document. A Notation
 * represents a name-value pair, with its nodeName being set to the
 * declared name of the notation.
 * <P>
 * Notations are also used to formally declare the "targets" of
 * Processing Instructions.
 * <P>
 * Note that the Notation's data is non-DOM information; the DOM only
 * records what and where it is.
 * <P>
 * See the XML 1.0 spec, sections 4.7 and 2.6, for more info.
 * <P>
 * Level 1 of the DOM does not support editing Notation contents.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setBaseURI(String uri){

    /** NON-DOM: set base uri*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setSystemId(String id) {

    /**
     * NON-DOM: The System Identifier for this Notation. If no system
     * identifier was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public void setPublicId(String id) {

    /**
     * NON-DOM: The Public Identifier for this Notation. If no public
     * identifier was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getSystemId() {

    /**
     * The System Identifier for this Notation. If no system identifier
     * was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getPublicId() {

    /**
     * The Public Identifier for this Notation. If no public identifier
     * was specified, this will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public String getNodeName() {

    /**
     * Returns the notation name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    public NotationImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String baseURI;

    /** Base URI*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String systemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String publicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    protected String name;

    /** Notation name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
    static final long serialVersionUID = -764632195890658402L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NotationImpl.java
public class NotationImpl

/**
 * Notations are how the Document Type Description (DTD) records hints
 * about the format of an XML "unparsed entity" -- in other words,
 * non-XML data bound to this document type, which some applications
 * may wish to consult when manipulating the document. A Notation
 * represents a name-value pair, with its nodeName being set to the
 * declared name of the notation.
 * <P>
 * Notations are also used to formally declare the "targets" of
 * Processing Instructions.
 * <P>
 * Note that the Notation's data is non-DOM information; the DOM only
 * records what and where it is.
 * <P>
 * See the XML 1.0 spec, sections 4.7 and 2.6, for more info.
 * <P>
 * Level 1 of the DOM does not support editing Notation contents.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
