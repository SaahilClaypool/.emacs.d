_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/QName.java
final class QName {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public boolean equals(Object object) {

    /** Returns true if the two objects are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public int hashCode() {

    /** Returns the hashcode for this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public Object clone() {

    /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void clear() {

    /** Clears the values of the qname components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void setValues(String prefix, String localpart, String rawname,
    String uri) {

    /**
     * Convenience method to set the values of the qname components.
     *
     * @param prefix    The qname prefix. (e.g. "a")
     * @param localpart The qname localpart. (e.g. "foo")
     * @param rawname   The qname rawname. (e.g. "a:foo")
     * @param uri       The URI binding. (e.g. "http://foo.com/mybinding")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void setValues(QName qname) {

    /**
     * Convenience method to set the values of the qname components.
     *
     * @param QName The qualified name to be copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName(QName qname) {

    /** Constructs a copy of the specified QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName(String prefix, String localpart, String rawname, String uri) {

    /** Constructs a QName with the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String uri;

    /**
     * The URI to which the qname prefix is bound. This binding must be
     * performed by a XML Namespaces aware processor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String rawname;

    /**
     * The qname rawname. For example, the rawname for the qname "a:foo"
     * is "a:foo".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String localpart;

    /**
     * The qname localpart. For example, the localpart for the qname "a:foo"
     * is "foo".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String prefix;

    /**
     * The qname prefix. For example, the prefix for the qname "a:foo"
     * is "a".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
public class QName

/**
 * A structure that holds the components of an XML Namespaces qualified
 * name.
 * <p>
 * To be used correctly, the strings must be identical references for
 * equal strings. Within the parser, these values are considered symbols
 * and should always be retrieved from the <code>SymbolTable</code>.
 *
 * @see <a href="../../../../../xerces2/com/sun/org/apache/xerces/internal/util/SymbolTable.html">com.sun.org.apache.xerces.internal.util.SymbolTable</a>
 *
 * @author Andy Clark, IBM
 *
 * Better performance patch for the equals method by Daniel Petersson: refer to jaxp issue 61;
 * == were used to compare strings
 * @author Joe Wang, Oracle
 *
 * @version $Id: QName.java,v 1.6 2010/03/18 19:32:31 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getPrefixPart(String qname)

  /**
   * Returns the local name of the given node.
   *
   * @param qname Input name
   *
   * @return Prefix of name or empty string if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getLocalPart(String qname)

  /**
   * Returns the local name of the given node.
   *
   * @param qname Input name
   *
   * @return Local part of the name if prefixed, or the given name if not
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getPrefixFromXMLNSDecl(String attRawName)

  /**
   * This function tells if a raw attribute name is a
   * xmlns attribute.
   *
   * @param attRawName Raw name of attribute
   *
   * @return Prefix of attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static boolean isXMLNSDecl(String attRawName)

  /**
   * This function tells if a raw attribute name is a
   * xmlns attribute.
   *
   * @param attRawName Raw name of attribute
   *
   * @return True if the attribute starts with or is equal to xmlns
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static QName getQNameFromString(String name)

  /**
   * Given a string, create and return a QName object
   *
   *
   * @param name String to use to create QName
   *
   * @return a QName object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public boolean equals(Object object)

  /**
   * Override equals and agree that we're equal if
   * the passed object is a QName and it matches
   * the name of the arg.
   *
   * @return True if the qualified names are equal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public boolean equals(String ns, String localPart)

  /**
   * Override equals and agree that we're equal if
   * the passed object is a string and it matches
   * the name of the arg.
   *
   * @param ns Namespace URI to compare to
   * @param localPart Local part of qualified name to compare to
   *
   * @return True if the local name and uri match
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public int hashCode()

  /**
   * Return the cached hashcode of the qualified name.
   *
   * @return the cached hashcode of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getLocalPart()

  /**
   * Get the local part of the qualified name.
   *
   * @return the local part of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getNamespace()

  /**
   * Get the namespace of the qualified name.
   *
   * @return the namespace URI of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String toNamespacedString()

  /**
   * Return the string representation of the qualified name using the
   * the '{ns}foo' notation. Performs
   * string concatenation, so beware of performance issues.
   *
   * @return the string representation of the namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String toString()

  /**
   * Return the string representation of the qualified name, using the
   * prefix if available, or the '{ns}foo' notation if not. Performs
   * string concatenation, so beware of performance issues.
   *
   * @return the string representation of the namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getLocalName()

  /**
   * Returns the local part of the qualified name.
   *
   * @return The local part of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getPrefix()

  /**
   * Returns the namespace prefix. Returns null if the namespace
   * prefix is not known.
   *
   * @return The namespace prefix, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getNamespaceURI()

  /**
   * Returns the namespace URI. Returns null if the namespace URI
   * is not known.
   *
   * @return The namespace URI, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, PrefixResolver resolver, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param resolver Prefix resolver for this context
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, PrefixResolver resolver)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param resolver Prefix resolver for this context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Element namespaceContext,
               PrefixResolver resolver, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace context and prefix resolver.
   * The default namespace is not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaceContext Namespace Context to use
   * @param resolver Prefix resolver for this context
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Element namespaceContext,
               PrefixResolver resolver)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace context and prefix resolver.
   * The default namespace is not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaceContext Namespace Context to use
   * @param resolver Prefix resolver for this context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Stack namespaces, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaces Namespace stack to use to resolve namespace
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Stack namespaces)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaces Namespace stack to use to resolve namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String localName, boolean validate)

  /**
   * Construct a QName from a string, without namespace resolution.  Good
   * for a few odd cases.
   *
   * @param localName Local part of qualified name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String localName)

  /**
   * Construct a QName from a string, without namespace resolution.  Good
   * for a few odd cases.
   *
   * @param localName Local part of qualified name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String prefix, String localName, boolean validate)

 /**
   * Constructs a new QName with the specified namespace URI, prefix
   * and local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param prefix The namespace prefix is known, or null
   * @param localName The local name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String prefix, String localName)

  /**
   * Constructs a new QName with the specified namespace URI, prefix
   * and local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param prefix The namespace prefix is known, or null
   * @param localName The local name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String localName, boolean validate)

  /**
   * Constructs a new QName with the specified namespace URI and
   * local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param localName The local name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String localName)

  /**
   * Constructs a new QName with the specified namespace URI and
   * local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param localName The local name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(){}

  /**
   * Constructs an empty QName.
   * 20001019: Try making this public, to support Serializable? -- JKESS
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  private int m_hashCode;

  /**
   * The cached hashcode, which is calculated at construction time.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static final String S_XMLNAMESPACEURI =

  /**
   * The XML namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _prefix;

  /**
   * The namespace prefix.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _namespaceURI;

  /**
   * The namespace URI.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _localName;

  /**
   * The local name.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
public class QName implements java.io.Serializable

/**
 * Class to represent a qualified name: "The name of an internal XSLT object,
 * specifically a named template (see [7 Named Templates]), a mode (see [6.7 Modes]),
 * an attribute set (see [8.1.4 Named Attribute Sets]), a key (see [14.2 Keys]),
 * a locale (see [14.3 Number Formatting]), a variable or a parameter (see
 * [12 Variables and Parameters]) is specified as a QName. If it has a prefix,
 * then the prefix is expanded into a URI reference using the namespace declarations
 * in effect on the attribute in which the name occurs. The expanded name
 * consisting of the local part of the name and the possibly null URI reference
 * is used as the name of the object. The default namespace is not used for
 * unprefixed names."
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/QName.java
final class QName {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public boolean equals(Object object) {

    /** Returns true if the two objects are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public int hashCode() {

    /** Returns the hashcode for this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public Object clone() {

    /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void clear() {

    /** Clears the values of the qname components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void setValues(String prefix, String localpart, String rawname,
    String uri) {

    /**
     * Convenience method to set the values of the qname components.
     *
     * @param prefix    The qname prefix. (e.g. "a")
     * @param localpart The qname localpart. (e.g. "foo")
     * @param rawname   The qname rawname. (e.g. "a:foo")
     * @param uri       The URI binding. (e.g. "http://foo.com/mybinding")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public void setValues(QName qname) {

    /**
     * Convenience method to set the values of the qname components.
     *
     * @param QName The qualified name to be copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName(QName qname) {

    /** Constructs a copy of the specified QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName(String prefix, String localpart, String rawname, String uri) {

    /** Constructs a QName with the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public QName() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String uri;

    /**
     * The URI to which the qname prefix is bound. This binding must be
     * performed by a XML Namespaces aware processor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String rawname;

    /**
     * The qname rawname. For example, the rawname for the qname "a:foo"
     * is "a:foo".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String localpart;

    /**
     * The qname localpart. For example, the localpart for the qname "a:foo"
     * is "foo".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
    public String prefix;

    /**
     * The qname prefix. For example, the prefix for the qname "a:foo"
     * is "a".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/QName.java
public class QName

/**
 * A structure that holds the components of an XML Namespaces qualified
 * name.
 * <p>
 * To be used correctly, the strings must be identical references for
 * equal strings. Within the parser, these values are considered symbols
 * and should always be retrieved from the <code>SymbolTable</code>.
 *
 * @see <a href="../../../../../xerces2/com/sun/org/apache/xerces/internal/util/SymbolTable.html">com.sun.org.apache.xerces.internal.util.SymbolTable</a>
 *
 * @author Andy Clark, IBM
 *
 * Better performance patch for the equals method by Daniel Petersson: refer to jaxp issue 61;
 * == were used to compare strings
 * @author Joe Wang, Oracle
 *
 * @version $Id: QName.java,v 1.6 2010/03/18 19:32:31 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getPrefixPart(String qname)

  /**
   * Returns the local name of the given node.
   *
   * @param qname Input name
   *
   * @return Prefix of name or empty string if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getLocalPart(String qname)

  /**
   * Returns the local name of the given node.
   *
   * @param qname Input name
   *
   * @return Local part of the name if prefixed, or the given name if not
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static String getPrefixFromXMLNSDecl(String attRawName)

  /**
   * This function tells if a raw attribute name is a
   * xmlns attribute.
   *
   * @param attRawName Raw name of attribute
   *
   * @return Prefix of attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static boolean isXMLNSDecl(String attRawName)

  /**
   * This function tells if a raw attribute name is a
   * xmlns attribute.
   *
   * @param attRawName Raw name of attribute
   *
   * @return True if the attribute starts with or is equal to xmlns
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static QName getQNameFromString(String name)

  /**
   * Given a string, create and return a QName object
   *
   *
   * @param name String to use to create QName
   *
   * @return a QName object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public boolean equals(Object object)

  /**
   * Override equals and agree that we're equal if
   * the passed object is a QName and it matches
   * the name of the arg.
   *
   * @return True if the qualified names are equal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public boolean equals(String ns, String localPart)

  /**
   * Override equals and agree that we're equal if
   * the passed object is a string and it matches
   * the name of the arg.
   *
   * @param ns Namespace URI to compare to
   * @param localPart Local part of qualified name to compare to
   *
   * @return True if the local name and uri match
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public int hashCode()

  /**
   * Return the cached hashcode of the qualified name.
   *
   * @return the cached hashcode of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getLocalPart()

  /**
   * Get the local part of the qualified name.
   *
   * @return the local part of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getNamespace()

  /**
   * Get the namespace of the qualified name.
   *
   * @return the namespace URI of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String toNamespacedString()

  /**
   * Return the string representation of the qualified name using the
   * the '{ns}foo' notation. Performs
   * string concatenation, so beware of performance issues.
   *
   * @return the string representation of the namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String toString()

  /**
   * Return the string representation of the qualified name, using the
   * prefix if available, or the '{ns}foo' notation if not. Performs
   * string concatenation, so beware of performance issues.
   *
   * @return the string representation of the namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getLocalName()

  /**
   * Returns the local part of the qualified name.
   *
   * @return The local part of the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getPrefix()

  /**
   * Returns the namespace prefix. Returns null if the namespace
   * prefix is not known.
   *
   * @return The namespace prefix, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public String getNamespaceURI()

  /**
   * Returns the namespace URI. Returns null if the namespace URI
   * is not known.
   *
   * @return The namespace URI, or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, PrefixResolver resolver, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param resolver Prefix resolver for this context
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, PrefixResolver resolver)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param resolver Prefix resolver for this context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Element namespaceContext,
               PrefixResolver resolver, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace context and prefix resolver.
   * The default namespace is not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaceContext Namespace Context to use
   * @param resolver Prefix resolver for this context
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Element namespaceContext,
               PrefixResolver resolver)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace context and prefix resolver.
   * The default namespace is not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaceContext Namespace Context to use
   * @param resolver Prefix resolver for this context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Stack namespaces, boolean validate)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaces Namespace stack to use to resolve namespace
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String qname, Stack namespaces)

  /**
   * Construct a QName from a string, resolving the prefix
   * using the given namespace stack. The default namespace is
   * not resolved.
   *
   * @param qname Qualified name to resolve
   * @param namespaces Namespace stack to use to resolve namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String localName, boolean validate)

  /**
   * Construct a QName from a string, without namespace resolution.  Good
   * for a few odd cases.
   *
   * @param localName Local part of qualified name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String localName)

  /**
   * Construct a QName from a string, without namespace resolution.  Good
   * for a few odd cases.
   *
   * @param localName Local part of qualified name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String prefix, String localName, boolean validate)

 /**
   * Constructs a new QName with the specified namespace URI, prefix
   * and local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param prefix The namespace prefix is known, or null
   * @param localName The local name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String prefix, String localName)

  /**
   * Constructs a new QName with the specified namespace URI, prefix
   * and local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param prefix The namespace prefix is known, or null
   * @param localName The local name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String localName, boolean validate)

  /**
   * Constructs a new QName with the specified namespace URI and
   * local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param localName The local name
   * @param validate If true the new QName will be validated and an IllegalArgumentException will
   *                 be thrown if it is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(String namespaceURI, String localName)

  /**
   * Constructs a new QName with the specified namespace URI and
   * local name.
   *
   * @param namespaceURI The namespace URI if known, or null
   * @param localName The local name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public QName(){}

  /**
   * Constructs an empty QName.
   * 20001019: Try making this public, to support Serializable? -- JKESS
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  private int m_hashCode;

  /**
   * The cached hashcode, which is calculated at construction time.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  public static final String S_XMLNAMESPACEURI =

  /**
   * The XML namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _prefix;

  /**
   * The namespace prefix.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _namespaceURI;

  /**
   * The namespace URI.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
  protected String _localName;

  /**
   * The local name.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/QName.java
public class QName implements java.io.Serializable

/**
 * Class to represent a qualified name: "The name of an internal XSLT object,
 * specifically a named template (see [7 Named Templates]), a mode (see [6.7 Modes]),
 * an attribute set (see [8.1.4 Named Attribute Sets]), a key (see [14.2 Keys]),
 * a locale (see [14.3 Number Formatting]), a variable or a parameter (see
 * [12 Variables and Parameters]) is specified as a QName. If it has a prefix,
 * then the prefix is expanded into a URI reference using the namespace declarations
 * in effect on the attribute in which the name occurs. The expanded name
 * consisting of the local part of the name and the possibly null URI reference
 * is used as the name of the object. The default namespace is not used for
 * unprefixed names."
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public static QName valueOf(String qNameAsString) {

    /**
     * <p><code>QName</code> derived from parsing the formatted
     * <code>String</code>.</p>
     *
     * <p>If the <code>String</code> is <code>null</code> or does not conform to
     * {@link #toString() QName.toString()} formatting, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p><em>The <code>String</code> <strong>MUST</strong> be in the
     * form returned by {@link #toString() QName.toString()}.</em></p>
     *
     * <p>The commonly accepted way of representing a <code>QName</code>
     * as a <code>String</code> was
     * <a href="http://jclark.com/xml/xmlns.htm">defined</a>
     * by James Clark.  Although this is not a <em>standard</em>
     * specification, it is in common use, e.g. {@link
     * javax.xml.transform.Transformer#setParameter(String name, Object value)}.
     * This implementation parses a <code>String</code> formatted
     * as: "{" + Namespace URI + "}" + local part.  If the Namespace
     * URI <code>.equals(XMLConstants.NULL_NS_URI)</code>, only the
     * local part should be provided.</p>
     *
     * <p>The prefix value <strong><em>CANNOT</em></strong> be
     * represented in the <code>String</code> and will be set to
     * {@link javax.xml.XMLConstants#DEFAULT_NS_PREFIX
     * XMLConstants.DEFAULT_NS_PREFIX}.</p>
     *
     * <p>This method does not do full validation of the resulting
     * <code>QName</code>.
     * <p>The Namespace URI is not validated as a
     * <a href="http://www.ietf.org/rfc/rfc2396.txt">URI reference</a>.
     * The local part is not validated as a
     * <a href="http://www.w3.org/TR/REC-xml-names/#NT-NCName">NCName</a>
     * as specified in
     * <a href="http://www.w3.org/TR/REC-xml-names/">Namespaces in XML</a>.</p>
     *
     * @param qNameAsString <code>String</code> representation
     * of the <code>QName</code>
     *
     * @throws IllegalArgumentException When <code>qNameAsString</code> is
     *   <code>null</code> or malformed
     *
     * @return <code>QName</code> corresponding to the given <code>String</code>
     * @see #toString() QName.toString()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public String toString() {

    /**
     * <p><code>String</code> representation of this
     * <code>QName</code>.</p>
     *
     * <p>The commonly accepted way of representing a <code>QName</code>
     * as a <code>String</code> was
     * <a href="http://jclark.com/xml/xmlns.htm">defined</a>
     * by James Clark.  Although this is not a <em>standard</em>
     * specification, it is in common use, e.g. {@link
     * javax.xml.transform.Transformer#setParameter(String name, Object value)}.
     * This implementation represents a <code>QName</code> as:
     * "{" + Namespace URI + "}" + local part.  If the Namespace URI
     * <code>.equals(XMLConstants.NULL_NS_URI)</code>, only the
     * local part is returned.  An appropriate use of this method is
     * for debugging or logging for human consumption.</p>
     *
     * <p>Note the prefix value is <strong><em>NOT</em></strong>
     * returned as part of the <code>String</code> representation.</p>
     *
     * <p>This method satisfies the general contract of {@link
     * java.lang.Object#toString() Object.toString()}.</p>
     *
     *  @return <code>String</code> representation of this <code>QName</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public final int hashCode() {

    /**
     * <p>Generate the hash code for this <code>QName</code>.</p>
     *
     * <p>The hash code is calculated using both the Namespace URI and
     * the local part of the <code>QName</code>.  The prefix is
     * <strong><em>NOT</em></strong> used to calculate the hash
     * code.</p>
     *
     * <p>This method satisfies the general contract of {@link
     * java.lang.Object#hashCode() Object.hashCode()}.</p>
     *
     * @return hash code for this <code>QName</code> <code>Object</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public final boolean equals(Object objectToTest) {

    /**
     * <p>Test this <code>QName</code> for equality with another
     * <code>Object</code>.</p>
     *
     * <p>If the <code>Object</code> to be tested is not a
     * <code>QName</code> or is <code>null</code>, then this method
     * returns <code>false</code>.</p>
     *
     * <p>Two <code>QName</code>s are considered equal if and only if
     * both the Namespace URI and local part are equal. This method
     * uses <code>String.equals()</code> to check equality of the
     * Namespace URI and local part. The prefix is
     * <strong><em>NOT</em></strong> used to determine equality.</p>
     *
     * <p>This method satisfies the general contract of {@link
     * java.lang.Object#equals(Object) Object.equals(Object)}</p>
     *
     * @param objectToTest the <code>Object</code> to test for
     * equality with this <code>QName</code>
     * @return <code>true</code> if the given <code>Object</code> is
     * equal to this <code>QName</code> else <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public String getPrefix() {

    /**
     * <p>Get the prefix of this <code>QName</code>.</p>
     *
     * <p>The prefix assigned to a <code>QName</code> might
     * <strong><em>NOT</em></strong> be valid in a different
     * context. For example, a <code>QName</code> may be assigned a
     * prefix in the context of parsing a document but that prefix may
     * be invalid in the context of a different document.</p>
     *
     *  @return prefix of this <code>QName</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public String getLocalPart() {

    /**
     * <p>Get the local part of this <code>QName</code>.</p>
     *
     *  @return local part of this <code>QName</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public String getNamespaceURI() {

    /**
     * <p>Get the Namespace URI of this <code>QName</code>.</p>
     *
     * @return Namespace URI of this <code>QName</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public QName(String localPart) {

    /**
     * <p><code>QName</code> constructor specifying the local part.</p>
     *
     * <p>If the local part is <code>null</code> an
     * <code>IllegalArgumentException</code> is thrown.
     * A local part of "" is allowed to preserve
     * compatible behavior with QName 1.0. </p>
     *
     * <p>When using this constructor, the Namespace URI is set to
     * {@link javax.xml.XMLConstants#NULL_NS_URI
     * XMLConstants.NULL_NS_URI} and the prefix is set to {@link
     * javax.xml.XMLConstants#DEFAULT_NS_PREFIX
     * XMLConstants.DEFAULT_NS_PREFIX}.</p>
     *
     * <p><em>In an XML context, all Element and Attribute names exist
     * in the context of a Namespace.  Making this explicit during the
     * construction of a <code>QName</code> helps prevent hard to
     * diagnosis XML validity errors.  The constructors {@link
     * #QName(String namespaceURI, String localPart) QName(String
     * namespaceURI, String localPart)} and
     * {@link #QName(String namespaceURI, String localPart, String prefix)}
     * are preferred.</em></p>
     *
     * <p>The local part is not validated as a
     * <a href="http://www.w3.org/TR/REC-xml-names/#NT-NCName">NCName</a>
     * as specified in <a href="http://www.w3.org/TR/REC-xml-names/">Namespaces
     * in XML</a>.</p>
     *
     * @param localPart local part of the <code>QName</code>
     *
     * @throws IllegalArgumentException When <code>localPart</code> is
     *   <code>null</code>
     *
     * @see #QName(String namespaceURI, String localPart) QName(String
     * namespaceURI, String localPart)
     * @see #QName(String namespaceURI, String localPart, String
     * prefix) QName(String namespaceURI, String localPart, String
     * prefix)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public QName(String namespaceURI, String localPart, String prefix) {

    /**
     * <p><code>QName</code> constructor specifying the Namespace URI,
     * local part and prefix.</p>
     *
     * <p>If the Namespace URI is <code>null</code>, it is set to
     * {@link javax.xml.XMLConstants#NULL_NS_URI
     * XMLConstants.NULL_NS_URI}.  This value represents no
     * explicitly defined Namespace as defined by the <a
     * href="http://www.w3.org/TR/REC-xml-names/#ns-qualnames">Namespaces
     * in XML</a> specification.  This action preserves compatible
     * behavior with QName 1.0.  Explicitly providing the {@link
     * javax.xml.XMLConstants#NULL_NS_URI
     * XMLConstants.NULL_NS_URI} value is the preferred coding
     * style.</p>
     *
     * <p>If the local part is <code>null</code> an
     * <code>IllegalArgumentException</code> is thrown.
     * A local part of "" is allowed to preserve
     * compatible behavior with QName 1.0. </p>
     *
     * <p>If the prefix is <code>null</code>, an
     * <code>IllegalArgumentException</code> is thrown.  Use {@link
     * javax.xml.XMLConstants#DEFAULT_NS_PREFIX
     * XMLConstants.DEFAULT_NS_PREFIX} to explicitly indicate that no
     * prefix is present or the prefix is not relevant.</p>
     *
     * <p>The Namespace URI is not validated as a
     * <a href="http://www.ietf.org/rfc/rfc2396.txt">URI reference</a>.
     * The local part and prefix are not validated as a
     * <a href="http://www.w3.org/TR/REC-xml-names/#NT-NCName">NCName</a>
     * as specified in <a href="http://www.w3.org/TR/REC-xml-names/">Namespaces
     * in XML</a>.</p>
     *
     * @param namespaceURI Namespace URI of the <code>QName</code>
     * @param localPart    local part of the <code>QName</code>
     * @param prefix       prefix of the <code>QName</code>
     *
     * @throws IllegalArgumentException When <code>localPart</code>
     *   or <code>prefix</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    public QName(final String namespaceURI, final String localPart) {

    /**
     * <p><code>QName</code> constructor specifying the Namespace URI
     * and local part.</p>
     *
     * <p>If the Namespace URI is <code>null</code>, it is set to
     * {@link javax.xml.XMLConstants#NULL_NS_URI
     * XMLConstants.NULL_NS_URI}.  This value represents no
     * explicitly defined Namespace as defined by the <a
     * href="http://www.w3.org/TR/REC-xml-names/#ns-qualnames">Namespaces
     * in XML</a> specification.  This action preserves compatible
     * behavior with QName 1.0.  Explicitly providing the {@link
     * javax.xml.XMLConstants#NULL_NS_URI
     * XMLConstants.NULL_NS_URI} value is the preferred coding
     * style.</p>
     *
     * <p>If the local part is <code>null</code> an
     * <code>IllegalArgumentException</code> is thrown.
     * A local part of "" is allowed to preserve
     * compatible behavior with QName 1.0. </p>
     *
     * <p>When using this constructor, the prefix is set to {@link
     * javax.xml.XMLConstants#DEFAULT_NS_PREFIX
     * XMLConstants.DEFAULT_NS_PREFIX}.</p>
     *
     * <p>The Namespace URI is not validated as a
     * <a href="http://www.ietf.org/rfc/rfc2396.txt">URI reference</a>.
     * The local part is not validated as a
     * <a href="http://www.w3.org/TR/REC-xml-names/#NT-NCName">NCName</a>
     * as specified in <a href="http://www.w3.org/TR/REC-xml-names/">Namespaces
     * in XML</a>.</p>
     *
     * @param namespaceURI Namespace URI of the <code>QName</code>
     * @param localPart    local part of the <code>QName</code>
     *
     * @throws IllegalArgumentException When <code>localPart</code> is
     *   <code>null</code>
     *
     * @see #QName(String namespaceURI, String localPart, String
     * prefix) QName(String namespaceURI, String localPart, String
     * prefix)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    private final String prefix;

    /**
     * <p>prefix of this <code>QName</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    private final String localPart;

    /**
     * <p>local part of this <code>QName</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    private final String namespaceURI;

    /**
     * <p>Namespace URI of this <code>QName</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    private static final long compatibleSerialVersionUID = 4418622981026545151L;

    /**
     * <p>Compatibility <code>serialVersionUID</code> value.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
    private static final long serialVersionUID;

    /**
     * <p>Stream Unique Identifier.</p>
     *
     * <p>Due to a historical defect, QName was released with multiple
     * serialVersionUID values even though its serialization was the
     * same.</p>
     *
     * <p>To workaround this issue, serialVersionUID is set with either
     * a default value or a compatibility value.  To use the
     * compatiblity value, set the system property:</p>
     *
     * <code>com.sun.xml.namespace.QName.useCompatibleSerialVersionUID=1.0</code>
     *
     * <p>This workaround was inspired by classes in the javax.management
     * package, e.g. ObjectName, etc.
     * See CR6267224 for original defect report.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/namespace/QName.java
public class QName implements Serializable {

/**
 * <p><code>QName</code> represents a <strong>qualified name</strong>
 * as defined in the XML specifications: <a
 * href="http://www.w3.org/TR/xmlschema-2/#QName">XML Schema Part2:
 * Datatypes specification</a>, <a
 * href="http://www.w3.org/TR/REC-xml-names/#ns-qualnames">Namespaces
 * in XML</a>, <a
 * href="http://www.w3.org/XML/xml-names-19990114-errata">Namespaces
 * in XML Errata</a>.</p>
 *
 * <p>The value of a <code>QName</code> contains a <strong>Namespace
 * URI</strong>, <strong>local part</strong> and
 * <strong>prefix</strong>.</p>
 *
 * <p>The prefix is included in <code>QName</code> to retain lexical
 * information <strong><em>when present</em></strong> in an {@link
 * javax.xml.transform.Source XML input source}. The prefix is
 * <strong><em>NOT</em></strong> used in {@link #equals(Object)
 * QName.equals(Object)} or to compute the {@link #hashCode()
 * QName.hashCode()}.  Equality and the hash code are defined using
 * <strong><em>only</em></strong> the Namespace URI and local part.</p>
 *
 * <p>If not specified, the Namespace URI is set to {@link
 * javax.xml.XMLConstants#NULL_NS_URI XMLConstants.NULL_NS_URI}.
 * If not specified, the prefix is set to {@link
 * javax.xml.XMLConstants#DEFAULT_NS_PREFIX
 * XMLConstants.DEFAULT_NS_PREFIX}.</p>
 *
 * <p><code>QName</code> is immutable.</p>
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @version $Revision: 1.8 $, $Date: 2010/03/18 03:06:17 $
 * @see <a href="http://www.w3.org/TR/xmlschema-2/#QName">
 *   XML Schema Part2: Datatypes specification</a>
 * @see <a href="http://www.w3.org/TR/REC-xml-names/#ns-qualnames">
 *   Namespaces in XML</a>
 * @see <a href="http://www.w3.org/XML/xml-names-19990114-errata">
 *   Namespaces in XML Errata</a>
 * @since 1.5
 */
