_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class OrientationRequested, the
     * category name is <CODE>"orientation-requested"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class OrientationRequested, the
     * category is class OrientationRequested itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    protected int getOffset() {

    /**
     * Returns the lowest integer value used by class OrientationRequested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class OrientationRequested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class OrientationRequested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    protected OrientationRequested(int value) {

    /**
     * Construct a new orientation requested enumeration value with the given
     * integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public static final OrientationRequested

    /**
     * The content will be imaged across the short edge of the medium, but in
     * the opposite manner from portrait. Reverse-portrait is defined to be a
     * rotation of the print-stream page to be imaged by 180 degrees with
     * respect to the medium from the portrait orientation. <I>Note:</I> The
     * REVERSE_PORTRAIT value was added for use with the {@link
     * Finishings Finishings} attribute in cases where the
     * opposite edge is desired for finishing a portrait document on simple
     * finishing devices that have only one finishing position. Thus a
     * <CODE>"text/plain"</CODE> portrait document can be stapled "on the
     * right" by a simple finishing device as is common use with some
     * Middle Eastern languages such as Hebrew.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public static final OrientationRequested

    /**
     * The content will be imaged across the long edge of the medium, but in
     * the opposite manner from landscape. Reverse-landscape is defined to be
     * a rotation of the print-stream page to be imaged by -90 degrees with
     * respect to the medium (i.e. clockwise) from the portrait orientation.
     * <I>Note:</I> The REVERSE_LANDSCAPE value was added because some
     * applications rotate landscape -90 degrees from portrait, rather than
     * +90 degrees.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public static final OrientationRequested

    /**
     * The content will be imaged across the long edge of the medium.
     * Landscape is defined to be a rotation of the print-stream page to be
     * imaged by +90 degrees with respect to the medium
     * (i.e. anti-clockwise) from the
     * portrait orientation. <I>Note:</I> The +90 direction was chosen because
     * simple finishing on the long edge is the same edge whether portrait or
     * landscape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
    public static final OrientationRequested

    /**
     * The content will be imaged across the short edge of the medium.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/OrientationRequested.java
public final class OrientationRequested extends EnumSyntax

/**
 * Class OrientationRequested is a printing attribute class, an enumeration,
 * that indicates the desired orientation for printed print-stream pages; it
 * does not describe the orientation of the client-supplied print-stream
 * pages.
 * <P>
 * For some document formats (such as <CODE>"application/postscript"</CODE>),
 * the desired orientation of the print-stream pages is specified within the
 * document data. This information is generated by a device driver prior to
 * the submission of the print job. Other document formats (such as
 * <CODE>"text/plain"</CODE>) do not include the notion of desired orientation
 * within the document data. In the latter case it is possible for the printer
 * to bind the desired orientation to the document data after it has been
 * submitted. It is expected that a printer would only support the
 * OrientationRequested attribute for some document formats (e.g.,
 * <CODE>"text/plain"</CODE> or <CODE>"text/html"</CODE>) but not others (e.g.
 * <CODE>"application/postscript"</CODE>). This is no different from any other
 * job template attribute, since a print job can always impose constraints
 * among the values of different job template attributes.
 *  However, a special mention
 * is made here since it is very likely that a printer will support the
 * OrientationRequested attribute for only a subset of the supported document
 * formats.
 * <P>
 * <B>IPP Compatibility:</B> The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
