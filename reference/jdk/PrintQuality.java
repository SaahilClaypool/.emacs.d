_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PrintQuality and any vendor-defined subclasses, the category
     * name is <CODE>"print-quality"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PrintQuality and any vendor-defined subclasses, the category is
     * class PrintQuality itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    protected int getOffset() {

    /**
     * Returns the lowest integer value used by class PrintQuality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class PrintQuality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class PrintQuality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    protected PrintQuality(int value) {

    /**
     * Construct a new print quality enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    public static final PrintQuality HIGH = new PrintQuality(5);

    /**
     * Highest quality available on the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    public static final PrintQuality NORMAL = new PrintQuality(4);

    /**
     * Normal or intermediate quality on the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
    public static final PrintQuality DRAFT = new PrintQuality(3);

    /**
     * Lowest quality available on the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrintQuality.java
public class PrintQuality extends EnumSyntax

/**
 * Class PrintQuality is a printing attribute class, an enumeration,
 * that specifies the print quality that the printer uses for the job.
 * <P>
 * <B>IPP Compatibility:</B> The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
