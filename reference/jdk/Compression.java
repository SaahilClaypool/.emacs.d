_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class Compression and any vendor-defined subclasses, the category
     * name is <CODE>"compression"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class Compression and any vendor-defined subclasses, the category is
     * class Compression itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class Compression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class Compression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    protected Compression(int value) {

    /**
     * Construct a new compression enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public static final Compression COMPRESS = new Compression(3);

    /**
     * UNIX compression technology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public static final Compression GZIP = new Compression(2);

    /**
     * GNU zip compression technology described in
     * <A HREF="http://www.ietf.org/rfc/rfc1952.txt">RFC 1952</A>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public static final Compression DEFLATE = new Compression(1);

    /**
     * ZIP public domain inflate/deflate compression technology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
    public static final Compression NONE = new Compression(0);

    /**
     * No compression is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Compression.java
public class Compression extends EnumSyntax implements DocAttribute {

/**
 * Class Compression is a printing attribute class, an enumeration, that
 * specifies how print data is compressed. Compression is an attribute of the
 * print data (the doc), not of the Print Job. If a Compression attribute is not
 * specified for a doc, the printer assumes the doc's print data is uncompressed
 * (i.e., the default Compression value is always {@link #NONE
 * NONE}).
 * <P>
 * <B>IPP Compatibility:</B> The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
