_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public boolean isLeaf();

    /**
     * Is this element a leaf element? An element that
     * <i>may</i> have children, even if it currently
     * has no children, would return <code>false</code>.
     *
     * @return true if a leaf element else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public Element getElement(int index);

    /**
     * Fetches the child element at the given index.
     *
     * @param index the specified index &gt;= 0
     * @return the child element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public int getElementCount();

    /**
     * Gets the number of child elements contained by this element.
     * If this element is a leaf, a count of zero is returned.
     *
     * @return the number of child elements &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public AttributeSet getAttributes();

    /**
     * Fetches the collection of attributes this element contains.
     *
     * @return the attributes for the element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public String getName();

    /**
     * Fetches the name of the element.  If the element is used to
     * represent some type of structure, this would be the type
     * name.
     *
     * @return the element name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public Element getParentElement();

    /**
     * Fetches the parent element.  If the element is a root level
     * element returns <code>null</code>.
     *
     * @return the parent element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
    public Document getDocument();

    /**
     * Fetches the document associated with this element.
     *
     * @return the document
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Element.java
public interface Element {

/**
 * Interface to describe a structural piece of a document.  It
 * is intended to capture the spirit of an SGML element.
 *
 * @author  Timothy Prinzing
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public AttributeList getAttributeByValue(String name) {

    /**
     * Get an attribute by value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public AttributeList getAttribute(String name) {

    /**
     * Get an attribute by name.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public String toString() {

    /**
     * Convert to a string.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public boolean isEmpty() {

    /**
     * Check if empty
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public int getIndex() {

    /**
     * Get index.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public AttributeList getAttributes() {

    /**
     * Get the attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public ContentModel getContent() {

    /**
     * Get content model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public int getType() {

    /**
     * Get type.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public boolean omitEnd() {

    /**
     * Return true if the end tag can be omitted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public boolean omitStart() {

    /**
     * Return true if the start tag can be omitted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public String getName() {

    /**
     * Get the name of the element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    Element(String name, int index) {

    /**
     * Create a new element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
    public Object data;

    /**
     * A field to store user data. Mostly used to store
     * style sheets.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Element.java
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
