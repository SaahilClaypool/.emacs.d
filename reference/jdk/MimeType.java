_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private static final String TSPECIALS = "()<>@,;:\\\"/[]?=";

    /**
     * A string that holds all the special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private boolean isValidToken(String s) {

    /**
     * Determines whether or not a given string is a legal token.
     *
     * @throws NullPointerException if <code>s</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private static boolean isTokenChar(char c) {

    /**
     * Determines whether or not a given character belongs to a legal token.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public Object clone() {

    /**
     * Returns a clone of this object.
     * @return a clone of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void readExternal(ObjectInput in) throws IOException,

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     * @exception ClassNotFoundException If the class for an object being
     *              restored cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void writeExternal(ObjectOutput out) throws IOException {

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings
     * and arrays.
     * @exception IOException Includes any I/O exceptions that may occur
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean match(String rawdata) throws MimeTypeParseException {

    /**
     * Returns <code>true</code> if the primary type and the
     * subtype of this object are the same as the content type
     * described in <code>rawdata</code>; otherwise returns
     * <code>false</code>.
     *
     * @param rawdata the raw data to be examined
     * @return <code>true</code> if the primary type and the
     *    subtype of this object are the same as the content type
     *    described in <code>rawdata</code>; otherwise returns
     *    <code>false</code>; if <code>rawdata</code> is
     *    <code>null</code>, returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean match(MimeType type) {

    /**
     * Returns <code>true</code> if the primary type and the
     * subtype of this object are the same as the specified
     * <code>type</code>; otherwise returns <code>false</code>.
     *
     * @param type the type to compare to <code>this</code>'s type
     * @return <code>true</code> if the primary type and the
     *    subtype of this object are the same as the
     *    specified <code>type</code>; otherwise returns
     *    <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getBaseType() {

    /**
     * Return a String representation of this object
     * without the parameter list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String toString() {

    /**
     * Return the String representation of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void removeParameter(String name) {

    /**
     * Remove any value associated with the given name.
     *
     * @throw IllegalArgumentExcpetion if parameter may not be deleted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void setParameter(String name, String value) {

    /**
     * Set the value to be associated with the given name, replacing
     * any previous association.
     *
     * @throw IllegalArgumentException if parameter or value is illegal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getParameter(String name) {

    /**
     * Retrieve the value associated with the given name, or null if there
     * is no current association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeTypeParameterList getParameters() {

    /**
     * Retrieve a copy of this object's parameter list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getSubType() {

    /**
     * Retrieve the sub type of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getPrimaryType() {

    /**
     * Retrieve the primary type of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private void parse(String rawdata) throws MimeTypeParseException {

    /**
     * A routine for parsing the MIME type out of a String.
     *
     * @throws NullPointerException if <code>rawdata</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean equals(Object thatObject) {

    /**
     * <code>MimeType</code>s are equal if their primary types,
     * subtypes, and  parameters are all equal. No default values
     * are taken into account.
     * @param thatObject the object to be evaluated as a
     *    <code>MimeType</code>
     * @return <code>true</code> if <code>thatObject</code> is
     *    a <code>MimeType</code>; otherwise returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String primary, String sub, MimeTypeParameterList mtpl) throws

    /**
     * Builds a <code>MimeType</code> with a pre-defined
     * and valid (or empty) parameter list.
     *
     * @param primary the primary type of this <code>MimeType</code>
     * @param sub the subtype of this <code>MimeType</code>
     * @param mtpl the requested parameter list
     * @throws NullPointerException if either <code>primary</code>,
     *         <code>sub</code> or <code>mtpl</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String primary, String sub) throws MimeTypeParseException {

    /**
     * Builds a <code>MimeType</code> with the given primary and sub
     * type but has an empty parameter list.
     *
     * @param primary the primary type of this <code>MimeType</code>
     * @param sub the subtype of this <code>MimeType</code>
     * @throws NullPointerException if either <code>primary</code> or
     *         <code>sub</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String rawdata) throws MimeTypeParseException {

    /**
     * Builds a <code>MimeType</code> from a <code>String</code>.
     *
     * @param rawdata text used to initialize the <code>MimeType</code>
     * @throws NullPointerException if <code>rawdata</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType() {

    /**
     * Constructor for externalization; this constructor should not be
     * called directly by an application, since the result will be an
     * uninitialized, immutable <code>MimeType</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
class MimeType implements Externalizable, Cloneable {

/**
 * A Multipurpose Internet Mail Extension (MIME) type, as defined
 * in RFC 2045 and 2046.
 *
 * THIS IS *NOT* - REPEAT *NOT* - A PUBLIC CLASS! DataFlavor IS
 * THE PUBLIC INTERFACE, AND THIS IS PROVIDED AS A ***PRIVATE***
 * (THAT IS AS IN *NOT* PUBLIC) HELPER CLASS!
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private static final String TSPECIALS = "()<>@,;:\\\"/[]?=";

    /**
     * A string that holds all the special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private boolean isValidToken(String s) {

    /**
     * Determines whether or not a given string is a legal token.
     *
     * @throws NullPointerException if <code>s</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private static boolean isTokenChar(char c) {

    /**
     * Determines whether or not a given character belongs to a legal token.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public Object clone() {

    /**
     * Returns a clone of this object.
     * @return a clone of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void readExternal(ObjectInput in) throws IOException,

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     * @exception ClassNotFoundException If the class for an object being
     *              restored cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void writeExternal(ObjectOutput out) throws IOException {

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings
     * and arrays.
     * @exception IOException Includes any I/O exceptions that may occur
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean match(String rawdata) throws MimeTypeParseException {

    /**
     * Returns <code>true</code> if the primary type and the
     * subtype of this object are the same as the content type
     * described in <code>rawdata</code>; otherwise returns
     * <code>false</code>.
     *
     * @param rawdata the raw data to be examined
     * @return <code>true</code> if the primary type and the
     *    subtype of this object are the same as the content type
     *    described in <code>rawdata</code>; otherwise returns
     *    <code>false</code>; if <code>rawdata</code> is
     *    <code>null</code>, returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean match(MimeType type) {

    /**
     * Returns <code>true</code> if the primary type and the
     * subtype of this object are the same as the specified
     * <code>type</code>; otherwise returns <code>false</code>.
     *
     * @param type the type to compare to <code>this</code>'s type
     * @return <code>true</code> if the primary type and the
     *    subtype of this object are the same as the
     *    specified <code>type</code>; otherwise returns
     *    <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getBaseType() {

    /**
     * Return a String representation of this object
     * without the parameter list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String toString() {

    /**
     * Return the String representation of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void removeParameter(String name) {

    /**
     * Remove any value associated with the given name.
     *
     * @throw IllegalArgumentExcpetion if parameter may not be deleted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public void setParameter(String name, String value) {

    /**
     * Set the value to be associated with the given name, replacing
     * any previous association.
     *
     * @throw IllegalArgumentException if parameter or value is illegal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getParameter(String name) {

    /**
     * Retrieve the value associated with the given name, or null if there
     * is no current association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeTypeParameterList getParameters() {

    /**
     * Retrieve a copy of this object's parameter list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getSubType() {

    /**
     * Retrieve the sub type of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public String getPrimaryType() {

    /**
     * Retrieve the primary type of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    private void parse(String rawdata) throws MimeTypeParseException {

    /**
     * A routine for parsing the MIME type out of a String.
     *
     * @throws NullPointerException if <code>rawdata</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public boolean equals(Object thatObject) {

    /**
     * <code>MimeType</code>s are equal if their primary types,
     * subtypes, and  parameters are all equal. No default values
     * are taken into account.
     * @param thatObject the object to be evaluated as a
     *    <code>MimeType</code>
     * @return <code>true</code> if <code>thatObject</code> is
     *    a <code>MimeType</code>; otherwise returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String primary, String sub, MimeTypeParameterList mtpl) throws

    /**
     * Builds a <code>MimeType</code> with a pre-defined
     * and valid (or empty) parameter list.
     *
     * @param primary the primary type of this <code>MimeType</code>
     * @param sub the subtype of this <code>MimeType</code>
     * @param mtpl the requested parameter list
     * @throws NullPointerException if either <code>primary</code>,
     *         <code>sub</code> or <code>mtpl</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String primary, String sub) throws MimeTypeParseException {

    /**
     * Builds a <code>MimeType</code> with the given primary and sub
     * type but has an empty parameter list.
     *
     * @param primary the primary type of this <code>MimeType</code>
     * @param sub the subtype of this <code>MimeType</code>
     * @throws NullPointerException if either <code>primary</code> or
     *         <code>sub</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType(String rawdata) throws MimeTypeParseException {

    /**
     * Builds a <code>MimeType</code> from a <code>String</code>.
     *
     * @param rawdata text used to initialize the <code>MimeType</code>
     * @throws NullPointerException if <code>rawdata</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
    public MimeType() {

    /**
     * Constructor for externalization; this constructor should not be
     * called directly by an application, since the result will be an
     * uninitialized, immutable <code>MimeType</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeType.java
class MimeType implements Externalizable, Cloneable {

/**
 * A Multipurpose Internet Mail Extension (MIME) type, as defined
 * in RFC 2045 and 2046.
 *
 * THIS IS *NOT* - REPEAT *NOT* - A PUBLIC CLASS! DataFlavor IS
 * THE PUBLIC INTERFACE, AND THIS IS PROVIDED AS A ***PRIVATE***
 * (THAT IS AS IN *NOT* PUBLIC) HELPER CLASS!
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private void parse(String s) {

    /**
     * Parses the given string into canonical pieces and stores the pieces in
     * {@link #myPieces <CODE>myPieces</CODE>}.
     * <P>
     * Special rules applied:
     * <UL>
     * <LI> If the media type is text, the value of a charset parameter is
     *      converted to lowercase.
     * </UL>
     *
     * @param  s  MIME media type string.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>s</CODE> is null.
     * @exception  IllegalArgumentException
     *     (unchecked exception) Thrown if <CODE>s</CODE> does not obey the
     *     syntax for a MIME media type string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private static String addQuotes(String s) {

    /**
     * Returns a version of the string surrounded by quotes and with interior
     * quotes preceded by a backslash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private static String removeBackslashes(String s) {

    /**
     * Returns a version of the given string with backslashes removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private static String toUnicodeLowerCase(String s) {

    /**
     * Returns a lowercase version of the given string. The lowercase version
     * is constructed by applying Character.toLowerCase() to each character of
     * the given string, which maps characters to lowercase using the rules of
     * Unicode. This mapping is the same regardless of locale, whereas the
     * mapping of String.toLowerCase() may be different depending on the
     * default locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private String getStringValue() {

    /**
     * Returns this MIME type's string value in canonical form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public boolean equals (Object obj) {

    /**
     * Determine if this MIME type object is equal to the given object. The two
     * are equal if the given object is not null, is an instance of class
     * net.jini.print.data.MimeType, and has the same canonical form as this
     * MIME type object (that is, has the same type, subtype, and parameters).
     * Thus, if two MIME type objects are the same except for comments, they are
     * considered equal. However, "text/plain" and "text/plain;
     * charset=us-ascii" are not considered equal, even though they represent
     * the same media type (because the default character set for plain text is
     * US-ASCII).
     *
     * @param  obj  Object to test.
     *
     * @return  True if this MIME type object equals <CODE>obj</CODE>, false
     *          otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public int hashCode() {

    /**
     * Returns a hash code for this MIME type object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public String toString() {

    /**
     * Converts this MIME type object to a string.
     *
     * @return  MIME type string based on the canonical form. Each parameter
     *          value is enclosed in quotes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public Map getParameterMap() {

    /**
     * Returns an unmodifiable map view of the parameters in this MIME type
     * object. Each entry in the parameter map view consists of a parameter
     * name String (key) mapping to a parameter value String. If this MIME
     * type object has no parameters, an empty map is returned.
     *
     * @return  Parameter map for this MIME type object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public String getMediaSubtype() {

    /**
     * Returns this MIME type object's media subtype.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public String getMediaType() {

    /**
     * Returns this MIME type object's media type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public String getMimeType() {

    /**
     * Returns this MIME type object's MIME type string based on the canonical
     * form. Each parameter value is enclosed in quotes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    public MimeType(String s) {

    /**
     * Construct a new MIME type object from the given string. The given
     * string is converted into canonical form and stored internally.
     *
     * @param  s  MIME media type string.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>s</CODE> is null.
     * @exception  IllegalArgumentException
     *     (unchecked exception) Thrown if <CODE>s</CODE> does not obey the
     *     syntax for a MIME media type string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private class ParameterMap extends AbstractMap {

    /**
     * Parameter map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private class ParameterMapEntrySet extends AbstractSet {

    /**
     * Parameter map entry set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private class ParameterMapEntrySetIterator implements Iterator {

    /**
     * Parameter map entry set iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private class ParameterMapEntry implements Map.Entry {

    /**
     * Parameter map entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private transient ParameterMap myParameterMap = null;

    /**
     * Parameter map. Computed when needed and cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private transient ParameterMapEntrySet myEntrySet = null;

    /**
     * Parameter map entry set. Computed when needed and cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private transient String myStringValue = null;

    /**
     * String value for this MIME type. Computed when needed and cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
    private String[] myPieces;

    /**
     * Array of strings that hold pieces of this MIME type's canonical form.
     * If the MIME type has <I>n</I> parameters, <I>n</I> &gt;= 0, then the
     * strings in the array are:
     * <BR>Index 0 -- Media type.
     * <BR>Index 1 -- Media subtype.
     * <BR>Index 2<I>i</I>+2 -- Name of parameter <I>i</I>,
     * <I>i</I>=0,1,...,<I>n</I>-1.
     * <BR>Index 2<I>i</I>+3 -- Value of parameter <I>i</I>,
     * <I>i</I>=0,1,...,<I>n</I>-1.
     * <BR>Parameters are arranged in ascending order of parameter name.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/MimeType.java
class MimeType implements Serializable, Cloneable {

/**
 * Class MimeType encapsulates a Multipurpose Internet Mail Extensions (MIME)
 * media type as defined in <A HREF="http://www.ietf.org/rfc/rfc2045.txt">RFC
 * 2045</A> and <A HREF="http://www.ietf.org/rfc/rfc2046.txt">RFC 2046</A>. A
 * MIME type object is part of a {@link DocFlavor DocFlavor} object and
 * specifies the format of the print data.
 * <P>
 * Class MimeType is similar to the like-named
 * class in package {@link java.awt.datatransfer java.awt.datatransfer}. Class
 * java.awt.datatransfer.MimeType is not used in the Jini Print Service API
 * for two reasons:
 * <OL TYPE=1>
 * <LI>
 * Since not all Java profiles include the AWT, the Jini Print Service should
 * not depend on an AWT class.
 * <P>
 * <LI>
 * The implementation of class java.awt.datatransfer.MimeType does not
 * guarantee
 * that equivalent MIME types will have the same serialized representation.
 * Thus, since the Jini Lookup Service (JLUS) matches service attributes based
 * on equality of serialized representations, JLUS searches involving MIME
 * types encapsulated in class java.awt.datatransfer.MimeType may incorrectly
 * fail to match.
 * </OL>
 * <P>
 * Class MimeType's serialized representation is based on the following
 * canonical form of a MIME type string. Thus, two MIME types that are not
 * identical but that are equivalent (that have the same canonical form) will
 * be considered equal by the JLUS's matching algorithm.
 * <UL>
 * <LI> The media type, media subtype, and parameters are retained, but all
 *      comments and whitespace characters are discarded.
 * <LI> The media type, media subtype, and parameter names are converted to
 *      lowercase.
 * <LI> The parameter values retain their original case, except a charset
 *      parameter value for a text media type is converted to lowercase.
 * <LI> Quote characters surrounding parameter values are removed.
 * <LI> Quoting backslash characters inside parameter values are removed.
 * <LI> The parameters are arranged in ascending order of parameter name.
 * </UL>
 * <P>
 *
 * @author  Alan Kaminsky
 */
