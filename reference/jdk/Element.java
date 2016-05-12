_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    <R, P> R accept(ElementVisitor<R, P> v, P p);

    /**
     * Applies a visitor to this element.
     *
     * @param <R> the return type of the visitor's methods
     * @param <P> the type of the additional parameter to the visitor's methods
     * @param v   the visitor operating on this element
     * @param p   additional parameter to the visitor
     * @return a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    @Override

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    @Override

    /**
     * {@inheritDoc}
     *
     * <p> To get inherited annotations as well, use {@link
     * Elements#getAllAnnotationMirrors(Element)
     * getAllAnnotationMirrors}.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    @Override

    /**
     * Obeys the general contract of {@link Object#hashCode Object.hashCode}.
     *
     * @see #equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    @Override

    /**
     * Returns {@code true} if the argument represents the same
     * element as {@code this}, or {@code false} otherwise.
     *
     * <p>Note that the identity of an element involves implicit state
     * not directly accessible from the element's methods, including
     * state about the presence of unrelated types.  Element objects
     * created by different implementations of these interfaces should
     * <i>not</i> be expected to be equal even if &quot;the same&quot;
     * element is being modeled; this is analogous to the inequality
     * of {@code Class} objects for the same class file loaded through
     * different class loaders.
     *
     * @param obj  the object to be compared with this element
     * @return {@code true} if the specified object represents the same
     *          element as this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    List<? extends Element> getEnclosedElements();

    /**
     * Returns the elements that are, loosely speaking, directly
     * enclosed by this element.
     *
     * A {@linkplain TypeElement#getEnclosedElements class or
     * interface} is considered to enclose the fields, methods,
     * constructors, and member types that it directly declares.
     *
     * A {@linkplain PackageElement#getEnclosedElements package}
     * encloses the top-level classes and interfaces within it, but is
     * not considered to enclose subpackages.
     *
     * Other kinds of elements are not currently considered to enclose
     * any elements; however, that may change as this API or the
     * programming language evolves.
     *
     * <p>Note that elements of certain kinds can be isolated using
     * methods in {@link ElementFilter}.
     *
     * @return the enclosed elements, or an empty list if none
     * @see PackageElement#getEnclosedElements
     * @see TypeElement#getEnclosedElements
     * @see Elements#getAllMembers
     * @jls 8.8.9 Default Constructor
     * @jls 8.9 Enums
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    Element getEnclosingElement();

    /**
     * Returns the innermost element
     * within which this element is, loosely speaking, enclosed.
     * <ul>
     * <li> If this element is one whose declaration is lexically enclosed
     * immediately within the declaration of another element, that other
     * element is returned.
     *
     * <li> If this is a {@linkplain TypeElement#getEnclosingElement
     * top-level type}, its package is returned.
     *
     * <li> If this is a {@linkplain
     * PackageElement#getEnclosingElement package}, {@code null} is
     * returned.
     *
     * <li> If this is a {@linkplain
     * TypeParameterElement#getEnclosingElement type parameter},
     * {@linkplain TypeParameterElement#getGenericElement the
     * generic element} of the type parameter is returned.
     *
     * <li> If this is a {@linkplain
     * VariableElement#getEnclosingElement method or constructor
     * parameter}, {@linkplain ExecutableElement the executable
     * element} which declares the parameter is returned.
     *
     * </ul>
     *
     * @return the enclosing element, or {@code null} if there is none
     * @see Elements#getPackageOf
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    Name getSimpleName();

    /**
     * Returns the simple (unqualified) name of this element.  The
     * name of a generic type does not include any reference to its
     * formal type parameters.
     *
     * For example, the simple name of the type element {@code
     * java.util.Set<E>} is {@code "Set"}.
     *
     * If this element represents an unnamed {@linkplain
     * PackageElement#getSimpleName package}, an empty name is
     * returned.
     *
     * If it represents a {@linkplain ExecutableElement#getSimpleName
     * constructor}, the name "{@code <init>}" is returned.  If it
     * represents a {@linkplain ExecutableElement#getSimpleName static
     * initializer}, the name "{@code <clinit>}" is returned.
     *
     * If it represents an {@linkplain TypeElement#getSimpleName
     * anonymous class} or {@linkplain ExecutableElement#getSimpleName
     * instance initializer}, an empty name is returned.
     *
     * @return the simple name of this element
     * @see PackageElement#getSimpleName
     * @see ExecutableElement#getSimpleName
     * @see TypeElement#getSimpleName
     * @see VariableElement#getSimpleName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    Set<Modifier> getModifiers();

    /**
     * Returns the modifiers of this element, excluding annotations.
     * Implicit modifiers, such as the {@code public} and {@code static}
     * modifiers of interface members, are included.
     *
     * @return the modifiers of this element, or an empty set if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
    ElementKind getKind();

    /**
     * Returns the {@code kind} of this element.
     *
     * @return the kind of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Element.java
public interface Element extends javax.lang.model.AnnotatedConstruct {

/**
 * Represents a program element such as a package, class, or method.
 * Each element represents a static, language-level construct
 * (and not, for example, a runtime construct of the virtual machine).
 *
 * <p> Elements should be compared using the {@link #equals(Object)}
 * method.  There is no guarantee that any particular element will
 * always be represented by the same object.
 *
 * <p> To implement operations based on the class of an {@code
 * Element} object, either use a {@linkplain ElementVisitor visitor} or
 * use the result of the {@link #getKind} method.  Using {@code
 * instanceof} is <em>not</em> necessarily a reliable idiom for
 * determining the effective class of an object in this modeling
 * hierarchy since an implementation may choose to have a single object
 * implement multiple {@code Element} subinterfaces.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see Elements
 * @see TypeMirror
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public boolean isLeaf();

    /**
     * Is this element a leaf element? An element that
     * <i>may</i> have children, even if it currently
     * has no children, would return <code>false</code>.
     *
     * @return true if a leaf element else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public Element getElement(int index);

    /**
     * Fetches the child element at the given index.
     *
     * @param index the specified index &gt;= 0
     * @return the child element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public int getElementCount();

    /**
     * Gets the number of child elements contained by this element.
     * If this element is a leaf, a count of zero is returned.
     *
     * @return the number of child elements &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public int getElementIndex(int offset);

    /**
     * Gets the child element index closest to the given offset.
     * The offset is specified relative to the beginning of the
     * document.  Returns <code>-1</code> if the
     * <code>Element</code> is a leaf, otherwise returns
     * the index of the <code>Element</code> that best represents
     * the given location.  Returns <code>0</code> if the location
     * is less than the start offset. Returns
     * <code>getElementCount() - 1</code> if the location is
     * greater than or equal to the end offset.
     *
     * @param offset the specified offset &gt;= 0
     * @return the element index &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public int getEndOffset();

    /**
     * Fetches the offset from the beginning of the document
     * that this element ends at.  If this element has
     * children, this will be the end offset of the last child.
     * As a document position, there is an implied backward bias.
     * <p>
     * All the default <code>Document</code> implementations
     * descend from <code>AbstractDocument</code>.
     * <code>AbstractDocument</code> models an implied break at the end of
     * the document. As a result of this, it is possible for this to
     * return a value greater than the length of the document.
     *
     * @return the ending offset &gt; getStartOffset() and
     *     &lt;= getDocument().getLength() + 1
     * @see Document
     * @see AbstractDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public int getStartOffset();

    /**
     * Fetches the offset from the beginning of the document
     * that this element begins at.  If this element has
     * children, this will be the offset of the first child.
     * As a document position, there is an implied forward bias.
     *
     * @return the starting offset &gt;= 0 and &lt; getEndOffset();
     * @see Document
     * @see AbstractDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public AttributeSet getAttributes();

    /**
     * Fetches the collection of attributes this element contains.
     *
     * @return the attributes for the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public String getName();

    /**
     * Fetches the name of the element.  If the element is used to
     * represent some type of structure, this would be the type
     * name.
     *
     * @return the element name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public Element getParentElement();

    /**
     * Fetches the parent element.  If the element is a root level
     * element returns <code>null</code>.
     *
     * @return the parent element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
    public Document getDocument();

    /**
     * Fetches the document associated with this element.
     *
     * @return the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Element.java
public interface Element {

/**
 * Interface to describe a structural piece of a document.  It
 * is intended to capture the spirit of an SGML element.
 *
 * @author  Timothy Prinzing
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public AttributeList getAttributeByValue(String name) {

    /**
     * Get an attribute by value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public AttributeList getAttribute(String name) {

    /**
     * Get an attribute by name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public String toString() {

    /**
     * Convert to a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public boolean isEmpty() {

    /**
     * Check if empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public int getIndex() {

    /**
     * Get index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public AttributeList getAttributes() {

    /**
     * Get the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public ContentModel getContent() {

    /**
     * Get content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public int getType() {

    /**
     * Get type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public boolean omitEnd() {

    /**
     * Return true if the end tag can be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public boolean omitStart() {

    /**
     * Return true if the start tag can be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public String getName() {

    /**
     * Get the name of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    Element(String name, int index) {

    /**
     * Create a new element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
    public Object data;

    /**
     * A field to store user data. Mostly used to store
     * style sheets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Element.java
public final

/**
 * An element as described in a DTD using the ELEMENT construct.
 * This is essential the description of a tag. It describes the
 * type, content model, attributes, attribute types etc. It is used
 * to correctly parse a document by the Parser.
 *
 * @see DTD
 * @see AttributeList
 * @author Arthur van Hoff
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Element.java
public interface Element {

/**
 * This is an element marker interface.
 *
 * Under certain circumstances, it is necessary for the binding compiler to
 * generate derived java content classes that implement this interface.  In
 * those cases, client applications must supply element instances rather than
 * types of elements.  For more detail, see section 5.7 "Element Declaration"
 * and 5.7.1 "Bind to Java Element Interface" of the specification.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul>
 * @since JAXB1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void setIdAttributeNode(Attr idAttr,
                                   boolean isId)

    /**
     *  If the parameter <code>isId</code> is <code>true</code>, this method
     * declares the specified attribute to be a user-determined ID attribute
     * . This affects the value of <code>Attr.isId</code> and the behavior
     * of <code>Document.getElementById</code>, but does not change any
     * schema that may be in use, in particular this does not affect the
     * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
     * node. Use the value <code>false</code> for the parameter
     * <code>isId</code> to undeclare an attribute for being a
     * user-determined ID attribute.
     * @param idAttr The attribute node.
     * @param isId Whether the attribute is a of type ID.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
     *   of this element.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void setIdAttributeNS(String namespaceURI,
                                 String localName,
                                 boolean isId)

    /**
     *  If the parameter <code>isId</code> is <code>true</code>, this method
     * declares the specified attribute to be a user-determined ID attribute
     * . This affects the value of <code>Attr.isId</code> and the behavior
     * of <code>Document.getElementById</code>, but does not change any
     * schema that may be in use, in particular this does not affect the
     * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
     * node. Use the value <code>false</code> for the parameter
     * <code>isId</code> to undeclare an attribute for being a
     * user-determined ID attribute.
     * @param namespaceURI The namespace URI of the attribute.
     * @param localName The local name of the attribute.
     * @param isId Whether the attribute is a of type ID.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
     *   of this element.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void setIdAttribute(String name,
                               boolean isId)

    /**
     *  If the parameter <code>isId</code> is <code>true</code>, this method
     * declares the specified attribute to be a user-determined ID attribute
     * . This affects the value of <code>Attr.isId</code> and the behavior
     * of <code>Document.getElementById</code>, but does not change any
     * schema that may be in use, in particular this does not affect the
     * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
     * node. Use the value <code>false</code> for the parameter
     * <code>isId</code> to undeclare an attribute for being a
     * user-determined ID attribute.
     * <br> To specify an attribute by local name and namespace URI, use the
     * <code>setIdAttributeNS</code> method.
     * @param name The name of the attribute.
     * @param isId Whether the attribute is a of type ID.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
     *   of this element.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public TypeInfo getSchemaTypeInfo();

    /**
     *  The type information associated with this element.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public boolean hasAttributeNS(String namespaceURI,
                                  String localName)

    /**
     * Returns <code>true</code> when an attribute with a given local name and
     * namespace URI is specified on this element or has a default value,
     * <code>false</code> otherwise.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to look for.
     * @param localName The local name of the attribute to look for.
     * @return <code>true</code> if an attribute with the given local name
     *   and namespace URI is specified or has a default value on this
     *   element, <code>false</code> otherwise.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public boolean hasAttribute(String name);

    /**
     * Returns <code>true</code> when an attribute with a given name is
     * specified on this element or has a default value, <code>false</code>
     * otherwise.
     * @param name The name of the attribute to look for.
     * @return <code>true</code> if an attribute with the given name is
     *   specified on this element or has a default value, <code>false</code>
     *    otherwise.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
                                           String localName)

    /**
     * Returns a <code>NodeList</code> of all the descendant
     * <code>Elements</code> with a given local name and namespace URI in
     * document order.
     * @param namespaceURI The namespace URI of the elements to match on. The
     *   special value "*" matches all namespaces.
     * @param localName The local name of the elements to match on. The
     *   special value "*" matches all local names.
     * @return A new <code>NodeList</code> object containing all the matched
     *   <code>Elements</code>.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public Attr setAttributeNodeNS(Attr newAttr)

    /**
     * Adds a new attribute. If an attribute with that local name and that
     * namespace URI is already present in the element, it is replaced by
     * the new one. Replacing an attribute node by itself has no effect.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param newAttr The <code>Attr</code> node to add to the attribute list.
     * @return If the <code>newAttr</code> attribute replaces an existing
     *   attribute with the same local name and namespace URI, the replaced
     *   <code>Attr</code> node is returned, otherwise <code>null</code> is
     *   returned.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if <code>newAttr</code> was created from a
     *   different document than the one that created the element.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>newAttr</code> is already an
     *   attribute of another <code>Element</code> object. The DOM user must
     *   explicitly clone <code>Attr</code> nodes to re-use them in other
     *   elements.
     *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public Attr getAttributeNodeNS(String namespaceURI,
                                   String localName)

    /**
     * Retrieves an <code>Attr</code> node by local name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The <code>Attr</code> node with the specified attribute local
     *   name and namespace URI or <code>null</code> if there is no such
     *   attribute.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void removeAttributeNS(String namespaceURI,
                                  String localName)

    /**
     * Removes an attribute by local name and namespace URI. If a default
     * value for the removed attribute is defined in the DTD, a new
     * attribute immediately appears with the default value as well as the
     * corresponding namespace URI, local name, and prefix when applicable.
     * The implementation may handle default values from other schemas
     * similarly but applications should use
     * <code>Document.normalizeDocument()</code> to guarantee this
     * information is up-to-date.
     * <br>If no attribute with this local name and namespace URI is found,
     * this method has no effect.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to remove.
     * @param localName The local name of the attribute to remove.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void setAttributeNS(String namespaceURI,
                               String qualifiedName,
                               String value)

    /**
     * Adds a new attribute. If an attribute with the same local name and
     * namespace URI is already present on the element, its prefix is
     * changed to be the prefix part of the <code>qualifiedName</code>, and
     * its value is changed to be the <code>value</code> parameter. This
     * value is a simple string; it is not parsed as it is being set. So any
     * markup (such as syntax to be recognized as an entity reference) is
     * treated as literal text, and needs to be appropriately escaped by the
     * implementation when it is written out. In order to assign an
     * attribute value that contains entity references, the user must create
     * an <code>Attr</code> node plus any <code>Text</code> and
     * <code>EntityReference</code> nodes, build the appropriate subtree,
     * and use <code>setAttributeNodeNS</code> or
     * <code>setAttributeNode</code> to assign it as the value of an
     * attribute.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to create or
     *   alter.
     * @param qualifiedName The qualified name of the attribute to create or
     *   alter.
     * @param value The value to set in string form.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified qualified name is not
     *   an XML name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is
     *   malformed per the Namespaces in XML specification, if the
     *   <code>qualifiedName</code> has a prefix and the
     *   <code>namespaceURI</code> is <code>null</code>, if the
     *   <code>qualifiedName</code> has a prefix that is "xml" and the
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>", if the <code>qualifiedName</code> or its prefix is "xmlns" and the
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
     *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public String getAttributeNS(String namespaceURI,
                                 String localName)

    /**
     * Retrieves an attribute value by local name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The <code>Attr</code> value as a string, or the empty string
     *   if that attribute does not have a specified or default value.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
     *   support the feature <code>"XML"</code> and the language exposed
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public NodeList getElementsByTagName(String name);

    /**
     * Returns a <code>NodeList</code> of all descendant <code>Elements</code>
     * with a given tag name, in document order.
     * @param name The name of the tag to match on. The special value "*"
     *   matches all tags.
     * @return A list of matching <code>Element</code> nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public Attr removeAttributeNode(Attr oldAttr)

    /**
     * Removes the specified attribute node. If a default value for the
     * removed <code>Attr</code> node is defined in the DTD, a new node
     * immediately appears with the default value as well as the
     * corresponding namespace URI, local name, and prefix when applicable.
     * The implementation may handle default values from other schemas
     * similarly but applications should use
     * <code>Document.normalizeDocument()</code> to guarantee this
     * information is up-to-date.
     * @param oldAttr The <code>Attr</code> node to remove from the attribute
     *   list.
     * @return The <code>Attr</code> node that was removed.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if <code>oldAttr</code> is not an attribute
     *   of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public Attr setAttributeNode(Attr newAttr)

    /**
     * Adds a new attribute node. If an attribute with that name (
     * <code>nodeName</code>) is already present in the element, it is
     * replaced by the new one. Replacing an attribute node by itself has no
     * effect.
     * <br>To add a new attribute node with a qualified name and namespace
     * URI, use the <code>setAttributeNodeNS</code> method.
     * @param newAttr The <code>Attr</code> node to add to the attribute list.
     * @return If the <code>newAttr</code> attribute replaces an existing
     *   attribute, the replaced <code>Attr</code> node is returned,
     *   otherwise <code>null</code> is returned.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if <code>newAttr</code> was created from a
     *   different document than the one that created the element.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>newAttr</code> is already an
     *   attribute of another <code>Element</code> object. The DOM user must
     *   explicitly clone <code>Attr</code> nodes to re-use them in other
     *   elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public Attr getAttributeNode(String name);

    /**
     * Retrieves an attribute node by name.
     * <br>To retrieve an attribute node by qualified name and namespace URI,
     * use the <code>getAttributeNodeNS</code> method.
     * @param name The name (<code>nodeName</code>) of the attribute to
     *   retrieve.
     * @return The <code>Attr</code> node with the specified name (
     *   <code>nodeName</code>) or <code>null</code> if there is no such
     *   attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void removeAttribute(String name)

    /**
     * Removes an attribute by name. If a default value for the removed
     * attribute is defined in the DTD, a new attribute immediately appears
     * with the default value as well as the corresponding namespace URI,
     * local name, and prefix when applicable. The implementation may handle
     * default values from other schemas similarly but applications should
     * use <code>Document.normalizeDocument()</code> to guarantee this
     * information is up-to-date.
     * <br>If no attribute with this name is found, this method has no effect.
     * <br>To remove an attribute by local name and namespace URI, use the
     * <code>removeAttributeNS</code> method.
     * @param name The name of the attribute to remove.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public void setAttribute(String name,
                             String value)

    /**
     * Adds a new attribute. If an attribute with that name is already present
     * in the element, its value is changed to be that of the value
     * parameter. This value is a simple string; it is not parsed as it is
     * being set. So any markup (such as syntax to be recognized as an
     * entity reference) is treated as literal text, and needs to be
     * appropriately escaped by the implementation when it is written out.
     * In order to assign an attribute value that contains entity
     * references, the user must create an <code>Attr</code> node plus any
     * <code>Text</code> and <code>EntityReference</code> nodes, build the
     * appropriate subtree, and use <code>setAttributeNode</code> to assign
     * it as the value of an attribute.
     * <br>To set an attribute with a qualified name and namespace URI, use
     * the <code>setAttributeNS</code> method.
     * @param name The name of the attribute to create or alter.
     * @param value Value to set in string form.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML
     *   name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
    public String getAttribute(String name);

    /**
     * Retrieves an attribute value by name.
     * @param name The name of the attribute to retrieve.
     * @return The <code>Attr</code> value as a string, or the empty string
     *   if that attribute does not have a specified or default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Element.java
public interface Element extends Node {

/**
 * The <code>Element</code> interface represents an element in an HTML or XML
 * document. Elements may have attributes associated with them; since the
 * <code>Element</code> interface inherits from <code>Node</code>, the
 * generic <code>Node</code> interface attribute <code>attributes</code> may
 * be used to retrieve the set of all attributes for an element. There are
 * methods on the <code>Element</code> interface to retrieve either an
 * <code>Attr</code> object by name or an attribute value by name. In XML,
 * where an attribute value may contain entity references, an
 * <code>Attr</code> object should be retrieved to examine the possibly
 * fairly complex sub-tree representing the attribute value. On the other
 * hand, in HTML, where all attributes have simple string values, methods to
 * directly access an attribute value can safely be used as a convenience.
 * <p ><b>Note:</b> In DOM Level 2, the method <code>normalize</code> is
 * inherited from the <code>Node</code> interface where it was moved.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
