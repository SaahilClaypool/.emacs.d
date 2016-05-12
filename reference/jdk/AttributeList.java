_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @Override

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException if this {@code AttributeList} is
     * <a href="#type-safe">type-safe</a> and {@code element} is not an
     * {@code Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @Override

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException if this {@code AttributeList} is
     * <a href="#type-safe">type-safe</a> and {@code c} contains an
     * element that is not an {@code Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @Override

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException if this {@code AttributeList} is
     * <a href="#type-safe">type-safe</a> and {@code c} contains an
     * element that is not an {@code Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @Override

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException if this {@code AttributeList} is
     * <a href="#type-safe">type-safe</a> and {@code element} is not an
     * {@code Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @Override

    /**
     * {@inheritDoc}
     * @throws IllegalArgumentException if this {@code AttributeList} is
     * <a href="#type-safe">type-safe</a> and {@code element} is not an
     * {@code Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public boolean addAll(int index, AttributeList list)  {

    /**
     * Inserts all of the elements in the <CODE>AttributeList</CODE> specified
     * into this list, starting at the specified position, in the order in which
     * they are returned by the Iterator of the {@code AttributeList} specified.
     * If the index is out of range {@literal (index < 0 || index > size())} a
     * RuntimeOperationsException should be raised, wrapping the
     * java.lang.IndexOutOfBoundsException thrown.
     *
     * @param list  Elements to be inserted into the list.
     * @param index  Position at which to insert the first element from the
     * <CODE>AttributeList</CODE> specified.
     *
     * @return true if this list changed as a result of the call.
     *
     * @see ArrayList#addAll(int, java.util.Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public boolean addAll(AttributeList list)  {

    /**
     * Appends all the elements in the <CODE>AttributeList</CODE> specified to
     * the end of the list, in the order in which they are returned by the
     * Iterator of the <CODE>AttributeList</CODE> specified.
     *
     * @param list  Elements to be inserted into the list.
     *
     * @return true if this list changed as a result of the call.
     *
     * @see ArrayList#addAll(java.util.Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public void set(int index, Attribute object)  {

    /**
     * Sets the element at the position specified to be the attribute specified.
     * The previous element at that position is discarded. If the index is
     * out of range {@literal (index < 0 || index > size())} a RuntimeOperationsException
     * should be raised, wrapping the java.lang.IndexOutOfBoundsException thrown.
     *
     * @param object  The value to which the attribute element should be set.
     * @param index  The position specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public void add(int index, Attribute object)  {

    /**
     * Inserts the attribute specified as an element at the position specified.
     * Elements with an index greater than or equal to the current position are
     * shifted up. If the index is out of range {@literal (index < 0 || index >
     * size())} a RuntimeOperationsException should be raised, wrapping the
     * java.lang.IndexOutOfBoundsException thrown.
     *
     * @param object  The <CODE>Attribute</CODE> object to be inserted.
     * @param index The position in the list where the new {@code Attribute}
     * object is to be inserted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public void add(Attribute object)  {

    /**
     * Adds the {@code Attribute} specified as the last element of the list.
     *
     * @param object  The attribute to be added.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    @SuppressWarnings("unchecked")

    /**
     * Return a view of this list as a {@code List<Attribute>}.
     * Changes to the returned value are reflected by changes
     * to the original {@code AttributeList} and vice versa.
     *
     * @return a {@code List<Attribute>} whose contents
     * reflect the contents of this {@code AttributeList}.
     *
     * <p>If this method has ever been called on a given
     * {@code AttributeList} instance, a subsequent attempt to add
     * an object to that instance which is not an {@code Attribute}
     * will fail with a {@code IllegalArgumentException}. For compatibility
     * reasons, an {@code AttributeList} on which this method has never
     * been called does allow objects other than {@code Attribute}s to
     * be added.</p>
     *
     * @throws IllegalArgumentException if this {@code AttributeList} contains
     * an element that is not an {@code Attribute}.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public AttributeList(List<Attribute> list) {

    /**
     * Constructs an {@code AttributeList} containing the elements of the
     * {@code List} specified, in the order in which they are returned by
     * the {@code List}'s iterator.
     *
     * @param list the {@code List} that defines the initial contents of
     * the new {@code AttributeList}.
     *
     * @exception IllegalArgumentException if the {@code list} parameter
     * is {@code null} or if the {@code list} parameter contains any
     * non-Attribute objects.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public AttributeList(AttributeList list) {

    /**
     * Constructs an <CODE>AttributeList</CODE> containing the
     * elements of the <CODE>AttributeList</CODE> specified, in the
     * order in which they are returned by the
     * <CODE>AttributeList</CODE>'s iterator.  The
     * <CODE>AttributeList</CODE> instance has an initial capacity of
     * 110% of the size of the <CODE>AttributeList</CODE> specified.
     *
     * @param list the <code>AttributeList</code> that defines the initial
     * contents of the new <code>AttributeList</code>.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public AttributeList(int initialCapacity) {

    /**
     * Constructs an empty <CODE>AttributeList</CODE> with
     * the initial capacity specified.
     *
     * @param initialCapacity the initial capacity of the
     * <code>AttributeList</code>, as specified by {@link
     * ArrayList#ArrayList(int)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
    public AttributeList() {

    /**
     * Constructs an empty <CODE>AttributeList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeList.java
/* We cannot extend ArrayList<Attribute> because our legacy

/**
 * <p>Represents a list of values for attributes of an MBean.  See the
 * {@link MBeanServerConnection#getAttributes getAttributes} and
 * {@link MBeanServerConnection#setAttributes setAttributes} methods of
 * {@link MBeanServer} and {@link MBeanServerConnection}.</p>
 *
 * <p id="type-safe">For compatibility reasons, it is possible, though
 * highly discouraged, to add objects to an {@code AttributeList} that are
 * not instances of {@code Attribute}.  However, an {@code AttributeList}
 * can be made <em>type-safe</em>, which means that an attempt to add
 * an object that is not an {@code Attribute} will produce an {@code
 * IllegalArgumentException}.  An {@code AttributeList} becomes type-safe
 * when the method {@link #asList()} is called on it.</p>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    static Hashtable<Object, Object> attributeTypes = new Hashtable<Object, Object>();

    /**
     * Create a hashtable of attribute types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public String toString() {

    /**
     * @return string representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public AttributeList getNext() {

    /**
     * @return the next attribute in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public String getValue() {

    /**
     * @return default attribute value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public Enumeration<?> getValues() {

    /**
     * @return possible attribute values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public int getModifier() {

    /**
     * @return attribute modifier
     * @see DTDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public int getType() {

    /**
     * @return attribute type
     * @see DTDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public String getName() {

    /**
     * @return attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public AttributeList(String name, int type, int modifier, String value, Vector<?> values, AttributeList next) {

    /**
     * Create an attribute list element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
    public AttributeList(String name) {

    /**
     * Create an attribute list element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/AttributeList.java
public final

/**
 * This class defines the attributes of an SGML element
 * as described in a DTD using the ATTLIST construct.
 * An AttributeList can be obtained from the Element
 * class using the getAttributes() method.
 * <p>
 * It is actually an element in a linked list. Use the
 * getNext() method repeatedly to enumerate all the attributes
 * of an element.
 *
 * @see         Element
 * @author      Arthur Van Hoff
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract String getValue (String name);

    /**
     * Return the value of an attribute in the list (by name).
     *
     * <p>The return value is the same as the return value for
     * getValue(int).</p>
     *
     * <p>If the attribute name has a namespace prefix in the document,
     * the application must include the prefix here.</p>
     *
     * @param name the name of the attribute to return
     * @return The attribute value as a string, or null if
     *         no such attribute exists.
     * @see #getValue(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract String getType (String name);

    /**
     * Return the type of an attribute in the list (by name).
     *
     * <p>The return value is the same as the return value for
     * getType(int).</p>
     *
     * <p>If the attribute name has a namespace prefix in the document,
     * the application must include the prefix here.</p>
     *
     * @param name The name of the attribute.
     * @return The attribute type as a string, or null if no
     *         such attribute exists.
     * @see #getType(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    // Lookup methods.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract String getValue (int i);

    /**
     * Return the value of an attribute in the list (by position).
     *
     * <p>If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string separated by whitespace.</p>
     *
     * @param i The index of the attribute in the list (starting at 0).
     * @return The attribute value as a string, or
     *         null if the index is out of range.
     * @see #getLength
     * @see #getValue(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract String getType (int i);

    /**
     * Return the type of an attribute in the list (by position).
     *
     * <p>The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).</p>
     *
     * <p>If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommentation
     * (clause 3.3.3, "Attribute-Value Normalization").</p>
     *
     * <p>For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".</p>
     *
     * @param i The index of the attribute in the list (starting at 0).
     * @return The attribute type as a string, or
     *         null if the index is out of range.
     * @see #getLength
     * @see #getType(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract String getName (int i);

    /**
     * Return the name of an attribute in this list (by position).
     *
     * <p>The names must be unique: the SAX parser shall not include the
     * same attribute twice.  Attributes without values (those declared
     * #IMPLIED without a value specified in the start tag) will be
     * omitted from the list.</p>
     *
     * <p>If the attribute name has a namespace prefix, the prefix
     * will still be attached.</p>
     *
     * @param i The index of the attribute in the list (starting at 0).
     * @return The name of the indexed attribute, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    public abstract int getLength ();

    /**
     * Return the number of attributes in this list.
     *
     * <p>The SAX parser may provide attributes in any
     * arbitrary order, regardless of the order in which they were
     * declared or specified.  The number of attributes may be
     * zero.</p>
     *
     * @return The number of attributes in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
    // Iteration methods.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/AttributeList.java
public interface AttributeList {

/**
 * Interface for an element's attribute specifications.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This is the original SAX1 interface for reporting an element's
 * attributes.  Unlike the new {@link org.xml.sax.Attributes Attributes}
 * interface, it does not support Namespace-related information.</p>
 *
 * <p>When an attribute list is supplied as part of a
 * {@link org.xml.sax.DocumentHandler#startElement startElement}
 * event, the list will return valid results only during the
 * scope of the event; once the event handler returns control
 * to the parser, the attribute list is invalid.  To save a
 * persistent copy of the attribute list, use the SAX1
 * {@link org.xml.sax.helpers.AttributeListImpl AttributeListImpl}
 * helper class.</p>
 *
 * <p>An attribute list includes only attributes that have been
 * specified or defaulted: #IMPLIED attributes will not be included.</p>
 *
 * <p>There are two ways for the SAX application to obtain information
 * from the AttributeList.  First, it can iterate through the entire
 * list:</p>
 *
 * <pre>
 * public void startElement (String name, AttributeList atts) {
 *   for (int i = 0; i < atts.getLength(); i++) {
 *     String name = atts.getName(i);
 *     String type = atts.getType(i);
 *     String value = atts.getValue(i);
 *     [...]
 *   }
 * }
 * </pre>
 *
 * <p>(Note that the result of getLength() will be zero if there
 * are no attributes.)
 *
 * <p>As an alternative, the application can request the value or
 * type of specific attributes:</p>
 *
 * <pre>
 * public void startElement (String name, AttributeList atts) {
 *   String identifier = atts.getValue("id");
 *   String label = atts.getValue("label");
 *   [...]
 * }
 * </pre>
 *
 * @deprecated This interface has been replaced by the SAX2
 *             {@link org.xml.sax.Attributes Attributes}
 *             interface, which includes Namespace support.
 * @since SAX 1.0
 * @author David Megginson
 * @see org.xml.sax.DocumentHandler#startElement startElement
 * @see org.xml.sax.helpers.AttributeListImpl AttributeListImpl
 */
