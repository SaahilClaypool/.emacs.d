_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PresentationDirection
     * the category name is <CODE>"presentation-direction"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PresentationDirection
     * the category is class PresentationDirection itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class PresentationDirection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class PresentationDirection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    private PresentationDirection(int value) {

    /**
     * Construct a new presentation direction enumeration value with the given
     * integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOLEFT_TOTOP =

    /**
     * Pages are laid out in rows starting at the bottom right,
     * proceeding towards the left {@literal &} top.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOLEFT_TOBOTTOM =

    /**
     * Pages are laid out in rows starting at the top right,
     * proceeding towards the left {@literal &} bottom.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TORIGHT_TOTOP =

    /**
     * Pages are laid out in rows starting at the bottom left,
     * proceeding towards the right {@literal &} top.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TORIGHT_TOBOTTOM =

    /**
     * Pages are laid out in rows starting at the top left,
     * proceeding towards the right {@literal &} bottom.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOTOP_TOLEFT =

    /**
     * Pages are laid out in columns starting at the bottom right,
     * proceeding towards the top {@literal &} left.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOTOP_TORIGHT =

    /**
     * Pages are laid out in columns starting at the bottom left,
     * proceeding towards the top {@literal &} right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOBOTTOM_TOLEFT =

    /**
     * Pages are laid out in columns starting at the top right,
     * proceeding towards the bottom {@literal &} left.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
    public static final PresentationDirection TOBOTTOM_TORIGHT =

    /**
     * Pages are laid out in columns starting at the top left,
     * proceeding towards the bottom {@literal &} right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PresentationDirection.java
public final class PresentationDirection extends EnumSyntax

/**
 * Class PresentationDirection is a printing attribute class, an enumeration,
 * that is used in conjunction with the {@link  NumberUp NumberUp} attribute to
 * indicate the layout of multiple print-stream pages to impose upon a
 * single side of an instance of a selected medium.
 * This is useful to mirror the text layout conventions of different scripts.
 * For example, English is "toright-tobottom", Hebrew is "toleft-tobottom"
 *  and Japanese is usually "tobottom-toleft".
 * <P>
 * <B>IPP Compatibility:</B>  This attribute is not an IPP 1.1
 * attribute; it is an attribute in the Production Printing Extension
 * (<a href="ftp://ftp.pwg.org/pub/pwg/standards/pwg5100.3.pdf">PDF</a>)
 * of IPP 1.1.  The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Phil Race.
 */
