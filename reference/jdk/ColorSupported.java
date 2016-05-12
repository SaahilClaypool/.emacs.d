_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class ColorSupported, the category name is <CODE>"color-supported"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class ColorSupported, the category is class ColorSupported itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class ColorSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class ColorSupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    protected ColorSupported(int value) {

    /**
     * Construct a new color supported enumeration value with the given
     * integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    public static final ColorSupported SUPPORTED = new ColorSupported(1);

    /**
     * The printer is capable of some type of color printing, such as
     * highlight color or full process color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
    public static final ColorSupported NOT_SUPPORTED = new ColorSupported(0);

    /**
     * The printer is not capable of any type of color printing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/ColorSupported.java
public final class ColorSupported extends EnumSyntax

/**
 * Class ColorSupported is a printing attribute class, an enumeration, that
 * identifies whether the device is capable of any type of color printing at
 * all, including highlight color as well as full process color. All document
 * instructions having to do with color are embedded within the print data (none
 * are attributes attached to the job outside the print data).
 * <P>
 * Note: End users are able to determine the nature and details of the color
 * support by querying the {@link PrinterMoreInfoManufacturer
 * PrinterMoreInfoManufacturer} attribute.
 * <P>
 * Don't confuse the ColorSupported attribute with the {@link Chromaticity
 * Chromaticity} attribute. {@link Chromaticity Chromaticity} is an attribute
 * the client can specify for a job to tell the printer whether to print a
 * document in monochrome or color, possibly causing the printer to print a
 * color document in monochrome. ColorSupported is a printer description
 * attribute that tells whether the printer can print in color regardless of how
 * the client specifies to print any particular document.
 * <P>
 * <B>IPP Compatibility:</B> The IPP boolean value is "true" for SUPPORTED and
 * "false" for NOT_SUPPORTED. The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
