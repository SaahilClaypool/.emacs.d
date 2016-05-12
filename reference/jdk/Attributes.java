_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/Attributes.java
public final class Attributes implements AttributeList {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/Attributes.java
public final class Attributes implements AttributeList {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name SPECIFICATION_VENDOR = new Name("Specification-Vendor");

        /**
         * <code>Name</code> object for <code>Specification-Vendor</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name SPECIFICATION_VERSION = new Name("Specification-Version");

        /**
         * <code>Name</code> object for <code>Specification-Version</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name SPECIFICATION_TITLE = new Name("Specification-Title");

        /**
         * <code>Name</code> object for <code>Specification-Title</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        @Deprecated

       /**
         * <code>Name</code> object for <code>Implementation-URL</code>
         * manifest attribute used for package versioning.
         * @deprecated Extension mechanism will be removed in a future release.
         *             Use class path instead.
         * @see <a href="../../../../technotes/guides/extensions/versioning.html#applet">
         *      Optional Package Versioning</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        @Deprecated

        /**
         * <code>Name</code> object for <code>Implementation-Vendor-Id</code>
         * manifest attribute used for package versioning.
         * @deprecated Extension mechanism will be removed in a future release.
         *             Use class path instead.
         * @see <a href="../../../../technotes/guides/extensions/versioning.html#applet">
         *      Optional Package Versioning</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name IMPLEMENTATION_VENDOR = new Name("Implementation-Vendor");

        /**
         * <code>Name</code> object for <code>Implementation-Vendor</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name IMPLEMENTATION_VERSION = new Name("Implementation-Version");

        /**
         * <code>Name</code> object for <code>Implementation-Version</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name IMPLEMENTATION_TITLE = new Name("Implementation-Title");

        /**
         * <code>Name</code> object for <code>Implementation-Title</code>
         * manifest attribute used for package versioning.
         * @see <a href="../../../../technotes/guides/versioning/spec/versioning2.html#wp90779">
         *      Java Product Versioning Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        @Deprecated

        /**
         * <code>Name</code> object for <code>Extension-Name</code> manifest attribute
         * used for declaring dependencies on installed extensions.
         * @deprecated Extension mechanism will be removed in a future release.
         *             Use class path instead.
         * @see <a href="../../../../technotes/guides/extensions/spec.html#dependency">
         *      Installed extension dependency</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name EXTENSION_NAME = new Name("Extension-Name");

        /**
         * <code>Name</code> object for <code>Extension-Name</code> manifest attribute
         * used for declaring dependencies on installed extensions.
         * @see <a href="../../../../technotes/guides/extensions/spec.html#dependency">
         *      Installed extension dependency</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name EXTENSION_LIST = new Name("Extension-List");

       /**
         * <code>Name</code> object for <code>Extension-List</code> manifest attribute
         * used for declaring dependencies on installed extensions.
         * @see <a href="../../../../technotes/guides/extensions/spec.html#dependency">
         *      Installed extension dependency</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name SEALED = new Name("Sealed");

        /**
         * <code>Name</code> object for <code>Sealed</code> manifest attribute
         * used for sealing.
         * @see <a href="../../../../technotes/guides/jar/jar.html#sealing">
         *      Package Sealing</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name MAIN_CLASS = new Name("Main-Class");

        /**
         * <code>Name</code> object for <code>Main-Class</code> manifest
         * attribute used for launching applications packaged in JAR files.
         * The <code>Main-Class</code> attribute is used in conjunction
         * with the <code>-jar</code> command-line option of the
         * <tt>java</tt> application launcher.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name CLASS_PATH = new Name("Class-Path");

        /**
         * <code>Name</code> object for <code>Class-Path</code>
         * manifest attribute. Bundled extensions can use this attribute
         * to find other JAR files containing needed classes.
         * @see <a href="../../../../technotes/guides/jar/jar.html#classpath">
         *      JAR file specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name CONTENT_TYPE = new Name("Content-Type");

        /**
         * <code>Name</code> object for <code>Content-Type</code>
         * manifest attribute.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name SIGNATURE_VERSION = new Name("Signature-Version");

        /**
         * <code>Name</code> object for <code>Signature-Version</code>
         * manifest attribute used when signing JAR files.
         * @see <a href="../../../../technotes/guides/jar/jar.html#JAR_Manifest">
         *      Manifest and Signature Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public static final Name MANIFEST_VERSION = new Name("Manifest-Version");

        /**
         * <code>Name</code> object for <code>Manifest-Version</code>
         * manifest attribute. This attribute indicates the version number
         * of the manifest standard to which a JAR file's manifest conforms.
         * @see <a href="../../../../technotes/guides/jar/jar.html#JAR_Manifest">
         *      Manifest and Signature Specification</a>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public String toString() {

        /**
         * Returns the attribute name as a String.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public int hashCode() {

        /**
         * Computes the hash value for this attribute name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public boolean equals(Object o) {

        /**
         * Compares this attribute name to another for equality.
         * @param o the object to compare
         * @return true if this attribute name is equal to the
         *         specified attribute object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
        public Name(String name) {

        /**
         * Constructs a new attribute name using the given string name.
         *
         * @param name the attribute string name
         * @exception IllegalArgumentException if the attribute name was
         *            invalid
         * @exception NullPointerException if the attribute name was null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public static class Name {

    /**
     * The Attributes.Name class represents an attribute name stored in
     * this Map. Valid attribute names are case-insensitive, are restricted
     * to the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed
     * 70 characters in length. Attribute values can contain any characters
     * and will be UTF8-encoded when written to the output stream.  See the
     * <a href="../../../../technotes/guides/jar/jar.html">JAR File Specification</a>
     * for more information about valid attribute names and values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Object clone() {

    /**
     * Returns a copy of the Attributes, implemented as follows:
     * <pre>
     *     public Object clone() { return new Attributes(this); }
     * </pre>
     * Since the attribute names and values are themselves immutable,
     * the Attributes returned can be safely modified without affecting
     * the original.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public int hashCode() {

    /**
     * Returns the hash code value for this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Attributes object with this Map for equality.
     * Returns true if the given object is also an instance of Attributes
     * and the two Attributes objects represent the same mappings.
     *
     * @param o the Object to be compared
     * @return true if the specified Object is equal to this Map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Set<Map.Entry<Object,Object>> entrySet() {

    /**
     * Returns a Collection view of the attribute name-value mappings
     * contained in this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Collection<Object> values() {

    /**
     * Returns a Collection view of the attribute values contained in this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Set<Object> keySet() {

    /**
     * Returns a Set view of the attribute names (keys) contained in this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public boolean isEmpty() {

    /**
     * Returns true if this Map contains no attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public int size() {

    /**
     * Returns the number of attributes in this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public void clear() {

    /**
     * Removes all attributes from this Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public void putAll(Map<?,?> attr) {

    /**
     * Copies all of the attribute name-value mappings from the specified
     * Attributes to this Map. Duplicate mappings will be replaced.
     *
     * @param attr the Attributes to be stored in this map
     * @exception ClassCastException if attr is not an Attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public boolean containsKey(Object name) {

    /**
     * Returns true if this Map contains the specified attribute name (key).
     *
     * @param name the attribute name
     * @return true if this Map contains the specified attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public boolean containsValue(Object value) {

    /**
     * Returns true if this Map maps one or more attribute names (keys)
     * to the specified value.
     *
     * @param value the attribute value
     * @return true if this Map maps one or more attribute names to
     *         the specified value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Object remove(Object name) {

    /**
     * Removes the attribute with the specified name (key) from this Map.
     * Returns the previous attribute value, or null if none.
     *
     * @param name attribute name
     * @return the previous value of the attribute, or null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public String putValue(String name, String value) {

    /**
     * Associates the specified value with the specified attribute name,
     * specified as a String. The attributes name is case-insensitive.
     * If the Map previously contained a mapping for the attribute name,
     * the old value is replaced.
     * <p>
     * This method is defined as:
     * <pre>
     *      return (String)put(new Attributes.Name(name), value);
     * </pre>
     *
     * @param name the attribute name as a string
     * @param value the attribute value
     * @return the previous value of the attribute, or null if none
     * @exception IllegalArgumentException if the attribute name is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Object put(Object name, Object value) {

    /**
     * Associates the specified value with the specified attribute name
     * (key) in this Map. If the Map previously contained a mapping for
     * the attribute name, the old value is replaced.
     *
     * @param name the attribute name
     * @param value the attribute value
     * @return the previous value of the attribute, or null if none
     * @exception ClassCastException if the name is not a Attributes.Name
     *            or the value is not a String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public String getValue(Name name) {

    /**
     * Returns the value of the specified Attributes.Name, or null if the
     * attribute was not found.
     * <p>
     * This method is defined as:
     * <pre>
     *     return (String)get(name);
     * </pre>
     *
     * @param name the Attributes.Name object
     * @return the String value of the specified Attribute.Name, or null if
     *         not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public String getValue(String name) {

    /**
     * Returns the value of the specified attribute name, specified as
     * a string, or null if the attribute was not found. The attribute
     * name is case-insensitive.
     * <p>
     * This method is defined as:
     * <pre>
     *      return (String)get(new Attributes.Name((String)name));
     * </pre>
     *
     * @param name the attribute name as a string
     * @return the String value of the specified attribute name, or null if
     *         not found.
     * @throws IllegalArgumentException if the attribute name is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Object get(Object name) {

    /**
     * Returns the value of the specified attribute name, or null if the
     * attribute name was not found.
     *
     * @param name the attribute name
     * @return the value of the specified attribute name, or null if
     *         not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Attributes(Attributes attr) {

    /**
     * Constructs a new Attributes object with the same attribute name-value
     * mappings as in the specified Attributes.
     *
     * @param attr the specified Attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Attributes(int size) {

    /**
     * Constructs a new, empty Attributes object with the specified
     * initial size.
     *
     * @param size the initial number of attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
    public Attributes() {

    /**
     * Constructs a new, empty Attributes object with default size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Attributes.java
public class Attributes implements Map<Object,Object>, Cloneable {

/**
 * The Attributes class maps Manifest attribute names to associated string
 * values. Valid attribute names are case-insensitive, are restricted to
 * the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed 70
 * characters in length. Attribute values can contain any characters and
 * will be UTF8-encoded when written to the output stream.  See the
 * <a href="../../../../technotes/guides/jar/jar.html">JAR File Specification</a>
 * for more information about valid attribute names and values.
 *
 * @author  David Connelly
 * @see     Manifest
 * @since   1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    // static final long serialVersionUID = -7247874645443605347L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    Object clone();

    /**
      * Makes a copy of the attribute set.
      * The new set contains the same attributes as the original set:
      * the attributes are not themselves cloned.
      * Changes to the copy will not affect the original and vice versa.
      *
      * @return A non-null copy of this attribute set.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    Attribute remove(String attrID);

    /**
      * Removes the attribute with the attribute id 'attrID' from
      * the attribute set. If the attribute does not exist, ignore.
      *
      * @param attrID   The non-null id of the attribute to remove.
      *                 If the attribute set ignores the character
      *                 case of its attribute ids, the case of
      *                 attrID is ignored.
      * @return The Attribute with the same ID as attrID that was previous
      *         in the attribute set;
      *         null if no such attribute existed.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    Attribute put(Attribute attr);

    /**
      * Adds a new attribute to the attribute set.
      *
      * @param attr     The non-null attribute to add.
      *                 If the attribute set ignores the character
      *                 case of its attribute ids, the case of
      *                 attr's identifier is ignored.
      * @return The Attribute with the same ID as attr that was previous
      *         in this attribute set;
      *         null if no such attribute existed.
      * @see #remove
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    Attribute put(String attrID, Object val);

    /**
      * Adds a new attribute to the attribute set.
      *
      * @param attrID   non-null The id of the attribute to add.
      *           If the attribute set ignores the character
      *           case of its attribute ids, the case of attrID
      *           is ignored.
      * @param val      The possibly null value of the attribute to add.
      *                 If null, the attribute does not have any values.
      * @return The Attribute with attrID that was previous in this attribute set;
      *         null if no such attribute existed.
      * @see #remove
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    NamingEnumeration<String> getIDs();

    /**
      * Retrieves an enumeration of the ids of the attributes in the
      * attribute set.
      * The effects of updates to this attribute set on this enumeration
      * are undefined.
      *
      * @return A non-null enumeration of the attributes' ids in
      *         this attribute set. Each element of the enumeration is
      *         of class String.
      *         If attribute set has zero attributes, an empty enumeration
      *         is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    NamingEnumeration<? extends Attribute> getAll();

    /**
      * Retrieves an enumeration of the attributes in the attribute set.
      * The effects of updates to this attribute set on this enumeration
      * are undefined.
      *
      * @return A non-null enumeration of the attributes in this attribute set.
      *         Each element of the enumeration is of class <tt>Attribute</tt>.
      *         If attribute set has zero attributes, an empty enumeration
      *         is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    Attribute get(String attrID);

    /**
      * Retrieves the attribute with the given attribute id from the
      * attribute set.
      *
      * @param attrID The non-null id of the attribute to retrieve.
      *           If this attribute set ignores the character
      *           case of its attribute ids, the case of attrID
      *           is ignored.
      * @return The attribute identified by attrID; null if not found.
      * @see #put
      * @see #remove
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
    int size();

    /**
      * Retrieves the number of attributes in the attribute set.
      *
      * @return The nonnegative number of attributes in this attribute set.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attributes.java
public interface Attributes extends Cloneable, java.io.Serializable {

/**
  * This interface represents a collection of attributes.
  *<p>
  * In a directory, named objects can have associated with them
  * attributes.  The Attributes interface represents a collection of attributes.
  * For example, you can request from the directory the attributes
  * associated with an object.  Those attributes are returned in
  * an object that implements the Attributes interface.
  *<p>
  * Attributes in an object that implements the  Attributes interface are
  * unordered. The object can have zero or more attributes.
  * Attributes is either case-sensitive or case-insensitive (case-ignore).
  * This property is determined at the time the Attributes object is
  * created. (see BasicAttributes constructor for example).
  * In a case-insensitive Attributes, the case of its attribute identifiers
  * is ignored when searching for an attribute, or adding attributes.
  * In a case-sensitive Attributes, the case is significant.
  *<p>
  * Note that updates to Attributes (such as adding or removing an attribute)
  * do not affect the corresponding representation in the directory.
  * Updates to the directory can only be effected
  * using operations in the DirContext interface.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see DirContext#getAttributes
  * @see DirContext#modifyAttributes
  * @see DirContext#bind
  * @see DirContext#rebind
  * @see DirContext#createSubcontext
  * @see DirContext#search
  * @see BasicAttributes
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getValue (String qName);

    /**
     * Look up an attribute's value by XML qualified (prefixed) name.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param qName The XML qualified name.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getValue (String uri, String localName);

    /**
     * Look up an attribute's value by Namespace name.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param uri The Namespace URI, or the empty String if the
     *        name has no Namespace URI.
     * @param localName The local name of the attribute.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getType (String qName);

    /**
     * Look up an attribute's type by XML qualified (prefixed) name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param qName The XML qualified name.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getType (String uri, String localName);

    /**
     * Look up an attribute's type by Namespace name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param uri The Namespace URI, or the empty String if the
     *        name has no Namespace URI.
     * @param localName The local name of the attribute.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if Namespace
     *         processing is not being performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public int getIndex (String qName);

    /**
     * Look up the index of an attribute by XML qualified (prefixed) name.
     *
     * @param qName The qualified (prefixed) name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public int getIndex (String uri, String localName);

    /**
     * Look up the index of an attribute by Namespace name.
     *
     * @param uri The Namespace URI, or the empty string if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    // Name-based query.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getValue (int index);

    /**
     * Look up an attribute's value by index.
     *
     * <p>If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string with each token separated by a
     * single space.</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's value as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getType (int index);

    /**
     * Look up an attribute's type by index.
     *
     * <p>The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).</p>
     *
     * <p>If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommendation
     * (clause 3.3.3, "Attribute-Value Normalization").</p>
     *
     * <p>For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's type as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getQName (int index);

    /**
     * Look up an attribute's XML qualified (prefixed) name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The XML qualified name, or the empty string
     *         if none is available, or null if the index
     *         is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getLocalName (int index);

    /**
     * Look up an attribute's local name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The local name, or the empty string if Namespace
     *         processing is not being performed, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract String getURI (int index);

    /**
     * Look up an attribute's Namespace URI by index.
     *
     * @param index The attribute index (zero-based).
     * @return The Namespace URI, or the empty string if none
     *         is available, or null if the index is out of
     *         range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    public abstract int getLength ();

    /**
     * Return the number of attributes in the list.
     *
     * <p>Once you know the number of attributes, you can iterate
     * through the list.</p>
     *
     * @return The number of attributes in the list.
     * @see #getURI(int)
     * @see #getLocalName(int)
     * @see #getQName(int)
     * @see #getType(int)
     * @see #getValue(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
    // Indexed access.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Attributes.java
public interface Attributes

/**
 * Interface for a list of XML attributes.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This interface allows access to a list of attributes in
 * three different ways:</p>
 *
 * <ol>
 * <li>by attribute index;</li>
 * <li>by Namespace-qualified name; or</li>
 * <li>by qualified (prefixed) name.</li>
 * </ol>
 *
 * <p>The list will not contain attributes that were declared
 * #IMPLIED but not specified in the start tag.  It will also not
 * contain attributes used as Namespace declarations (xmlns*) unless
 * the <code>http://xml.org/sax/features/namespace-prefixes</code>
 * feature is set to <var>true</var> (it is <var>false</var> by
 * default).
 * Because SAX2 conforms to the original "Namespaces in XML"
 * recommendation, it normally does not
 * give namespace declaration attributes a namespace URI.
 * </p>
 *
 * <p>Some SAX2 parsers may support using an optional feature flag
 * (<code>http://xml.org/sax/features/xmlns-uris</code>) to request
 * that those attributes be given URIs, conforming to a later
 * backwards-incompatible revision of that recommendation.  (The
 * attribute's "local name" will be the prefix, or "xmlns" when
 * defining a default element namespace.)  For portability, handler
 * code should always resolve that conflict, rather than requiring
 * parsers that can change the setting of that feature flag.  </p>
 *
 * <p>If the namespace-prefixes feature (see above) is
 * <var>false</var>, access by qualified name may not be available; if
 * the <code>http://xml.org/sax/features/namespaces</code> feature is
 * <var>false</var>, access by Namespace-qualified names may not be
 * available.</p>
 *
 * <p>This interface replaces the now-deprecated SAX1 {@link
 * org.xml.sax.AttributeList AttributeList} interface, which does not
 * contain Namespace support.  In addition to Namespace support, it
 * adds the <var>getIndex</var> methods (below).</p>
 *
 * <p>The order of attributes in the list is unspecified, and will
 * vary from implementation to implementation.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @see org.xml.sax.helpers.AttributesImpl
 * @see org.xml.sax.ext.DeclHandler#attributeDecl
 */
