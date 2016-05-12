_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PDLOverrideSupported and any vendor-defined subclasses, the
     * category name is <CODE>"pdl-override-supported"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PDLOverrideSupported and any vendor-defined subclasses, the
     * category is class PDLOverrideSupported itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class PDLOverrideSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class PDLOverrideSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    protected PDLOverrideSupported(int value) {

    /**
     * Construct a new PDL override supported enumeration value with the given
     * integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    public static final PDLOverrideSupported

    /**
     * The printer attempts to make the external job attribute values take
     * precedence over embedded instructions in the documents' print data,
     * however there is no guarantee.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
    public static final PDLOverrideSupported

    /**
     * The printer makes no attempt to make the external job attribute values
     * take precedence over embedded instructions in the documents' print
     * data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PDLOverrideSupported.java
public class PDLOverrideSupported extends EnumSyntax

/**
 * Class PDLOverrideSupported is a printing attribute class, an enumeration,
 * that expresses the printer's ability to attempt to override processing
 * instructions embedded in documents' print data with processing instructions
 * specified as attributes outside the print data.
 * <P>
 * <B>IPP Compatibility:</B> The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
