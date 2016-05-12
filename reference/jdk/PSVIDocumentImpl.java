_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public DOMConfiguration getDomConfig(){

    /**
     *
     * The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName,
                                  String localName) throws DOMException {

    /**
     * Create an attribute with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName)

    /**
     * Create an attribute with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName,
                                   String localpart) throws DOMException {

    /**
     * Create an element with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName)

    /**
     * Create an element with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public PSVIDocumentImpl(DocumentType doctype) {

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public PSVIDocumentImpl() {

    /**
     * Create a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    static final long serialVersionUID = -8822220250676434522L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
public class PSVIDocumentImpl extends DocumentImpl {

/**
 * Our own document implementation, which knows how to create an element
 * with PSVI information.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public DOMConfiguration getDomConfig(){

    /**
     *
     * The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName,
                                  String localName) throws DOMException {

    /**
     * Create an attribute with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName)

    /**
     * Create an attribute with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName,
                                   String localpart) throws DOMException {

    /**
     * Create an element with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName)

    /**
     * Create an element with PSVI information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public PSVIDocumentImpl(DocumentType doctype) {

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    public PSVIDocumentImpl() {

    /**
     * Create a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
    static final long serialVersionUID = -8822220250676434522L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIDocumentImpl.java
public class PSVIDocumentImpl extends DocumentImpl {

/**
 * Our own document implementation, which knows how to create an element
 * with PSVI information.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 */
