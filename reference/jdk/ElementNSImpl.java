_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public void setType(XSTypeDefinition type) {

    /**
     * NON-DOM: setting type used by the DOM parser
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg, String typeNameArg,
            int derivationMethod) {

    /**
     * Introduced in DOM Level 2. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getBaseURI() {

   /**
     * DOM Level 3 WD - Experimental.
     * Retrieve baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getLocalName()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns the local part of the qualified name of this node.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public void setPrefix(String prefix)

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Note that setting this attribute changes the nodeName attribute, which holds the
     * qualified name, as well as the tagName and name attributes of the Element
     * and Attr interfaces, when applicable.<p>
     *
     * @param prefix The namespace prefix of this node, or null(empty string) if it is unspecified.
     *
     * @exception INVALID_CHARACTER_ERR
     *                   Raised if the specified
     *                   prefix contains an invalid character.
     * @exception DOMException
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getPrefix()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace prefix of this node, or null if it is unspecified. <p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null. <p>
     *
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getNamespaceURI()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace URI of this node, or null if it is unspecified.<p>
     *
     * This is not a computed value that is the result of a namespace lookup based on
     * an examination of the namespace declarations in scope. It is merely the
     * namespace URI given at creation time.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected void setValues (CoreDocumentImpl ownerDocument,
                            String namespaceURI, String qualifiedName,
                            String localName){

    /**
     * NON-DOM: resets this node and sets specified values for the node
     *
     * @param ownerDocument
     * @param namespaceURI
     * @param qualifiedName
     * @param localName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected ElementNSImpl(CoreDocumentImpl ownerDocument,
                            String namespaceURI,
                            String qualifiedName)

    /**
     * DOM2: Constructor for Namespace implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    // REVISIT: we are losing the type information in DOM during serialization

    /** DOM3: type information */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected String localName;

    /** DOM2: localName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected String namespaceURI;

    /** DOM2: Namespace URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    static final long serialVersionUID = -9142310625494392642L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
public class ElementNSImpl

/**
 * ElementNSImpl inherits from ElementImpl and adds namespace support.
 * <P>
 * The qualified name is the node name, and we store localName which is also
 * used in all queries. On the other hand we recompute the prefix when
 * necessary.
 *
 * @xerces.internal
 *
 * @author Elena litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems
 * @version $Id: ElementNSImpl.java,v 1.7 2010-11-01 04:39:39 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public void setType(XSTypeDefinition type) {

    /**
     * NON-DOM: setting type used by the DOM parser
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg, String typeNameArg,
            int derivationMethod) {

    /**
     * Introduced in DOM Level 2. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getBaseURI() {

   /**
     * DOM Level 3 WD - Experimental.
     * Retrieve baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getLocalName()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns the local part of the qualified name of this node.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public void setPrefix(String prefix)

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Note that setting this attribute changes the nodeName attribute, which holds the
     * qualified name, as well as the tagName and name attributes of the Element
     * and Attr interfaces, when applicable.<p>
     *
     * @param prefix The namespace prefix of this node, or null(empty string) if it is unspecified.
     *
     * @exception INVALID_CHARACTER_ERR
     *                   Raised if the specified
     *                   prefix contains an invalid character.
     * @exception DOMException
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getPrefix()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace prefix of this node, or null if it is unspecified. <p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null. <p>
     *
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    public String getNamespaceURI()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace URI of this node, or null if it is unspecified.<p>
     *
     * This is not a computed value that is the result of a namespace lookup based on
     * an examination of the namespace declarations in scope. It is merely the
     * namespace URI given at creation time.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected void setValues (CoreDocumentImpl ownerDocument,
                            String namespaceURI, String qualifiedName,
                            String localName){

    /**
     * NON-DOM: resets this node and sets specified values for the node
     *
     * @param ownerDocument
     * @param namespaceURI
     * @param qualifiedName
     * @param localName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected ElementNSImpl(CoreDocumentImpl ownerDocument,
                            String namespaceURI,
                            String qualifiedName)

    /**
     * DOM2: Constructor for Namespace implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    // REVISIT: we are losing the type information in DOM during serialization

    /** DOM3: type information */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected String localName;

    /** DOM2: localName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    protected String namespaceURI;

    /** DOM2: Namespace URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
    static final long serialVersionUID = -9142310625494392642L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementNSImpl.java
public class ElementNSImpl

/**
 * ElementNSImpl inherits from ElementImpl and adds namespace support.
 * <P>
 * The qualified name is the node name, and we store localName which is also
 * used in all queries. On the other hand we recompute the prefix when
 * necessary.
 *
 * @xerces.internal
 *
 * @author Elena litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems
 * @version $Id: ElementNSImpl.java,v 1.7 2010-11-01 04:39:39 joehw Exp $
 */
