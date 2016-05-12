_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class ReferenceUriSchemesSupported and any vendor-defined
     * subclasses, the category name is
     * <CODE>"reference-uri-schemes-supported"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class ReferenceUriSchemesSupported and any vendor-defined
     * subclasses, the category is class ReferenceUriSchemesSupported itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class
     * ReferenceUriSchemesSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class ReferenceUriSchemesSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    protected ReferenceUriSchemesSupported(int value) {

    /**
     * Construct a new reference URI scheme enumeration value with the given
     * integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported FILE = new ReferenceUriSchemesSupported(7);

    /**
     * Host-specific file names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported WAIS = new ReferenceUriSchemesSupported(6);

    /**
     * Wide Area Information Server (WAIS) protocol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported NNTP = new ReferenceUriSchemesSupported(5);

    /**
     * USENET news using Network News Transfer Protocol (NNTP).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported NEWS = new ReferenceUriSchemesSupported(4);

    /**
     * USENET news.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported GOPHER = new ReferenceUriSchemesSupported(3);

    /**
     * Gopher Protocol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported HTTPS = new ReferenceUriSchemesSupported(2);

    /**
     * Secure HyperText Transfer Protocol (HTTPS).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported HTTP = new ReferenceUriSchemesSupported(1);

    /**
     * HyperText Transfer Protocol (HTTP).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
    public static final ReferenceUriSchemesSupported FTP =

    /**
     * File Transfer Protocol (FTP).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ReferenceUriSchemesSupported.java
public class ReferenceUriSchemesSupported

/**
 * Class ReferenceUriSchemesSupported is a printing attribute class
 * an enumeration, that indicates a "URI scheme," such as "http:" or "ftp:",
 * that a printer can use to retrieve print data stored at a URI location.
 * If a printer supports doc flavors with a print data representation class of
 * <CODE>"java.net.URL"</CODE>, the printer uses instances of class
 * ReferenceUriSchemesSupported to advertise the URI schemes it can accept.
 * The acceptable URI schemes are included as service attributes in the
 * lookup service; this lets clients search the
 * for printers that can get print data using a certain URI scheme. The
 * acceptable URI schemes can also be queried using the capability methods in
 * interface <code>PrintService</code>. However,
 * ReferenceUriSchemesSupported attributes are used solely for determining
 * acceptable URI schemes, they are never included in a doc's,
 * print request's, print job's, or print service's attribute set.
 * <P>
 * The Internet Assigned Numbers Authority maintains the
 * <A HREF="http://www.iana.org/assignments/uri-schemes.html">official
 * list of URI schemes</A>.
 * <p>
 * Class ReferenceUriSchemesSupported defines enumeration values for widely
 * used URI schemes. A printer that supports additional URI schemes
 * can define them in a subclass of class ReferenceUriSchemesSupported.
 * <P>
 * <B>IPP Compatibility:</B>  The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
