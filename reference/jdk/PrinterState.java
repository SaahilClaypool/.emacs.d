_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PrinterState, the category name is <CODE>"printer-state"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PrinterState, the category is class PrinterState itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class PrinterState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class PrinterState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    protected PrinterState(int value) {

    /**
     * Construct a new printer state enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public static final PrinterState STOPPED = new PrinterState(5);

    /**
     * Indicates that no jobs can be processed and intervention is required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public static final PrinterState PROCESSING = new PrinterState(4);

    /**
     * Indicates that jobs are processing;
     * new jobs will wait before processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public static final PrinterState IDLE = new PrinterState(3);

    /**
     * Indicates that new jobs can start processing without waiting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
    public static final PrinterState UNKNOWN = new PrinterState(0);

    /**
     * The printer state is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterState.java
public final class PrinterState extends EnumSyntax

/**
 * Class PrinterState is a printing attribute class, an enumeration, that
 * identifies the current state of a printer. Class PrinterState defines
 * standard printer state values. A Print Service implementation only needs
 * to report those printer states which are appropriate for the particular
 * implementation; it does not have to report every defined printer state. The
 * {@link PrinterStateReasons PrinterStateReasons} attribute augments the
 * PrinterState attribute to give more detailed information about the printer
 * in  given printer state.
 * <P>
 * <B>IPP Compatibility:</B> The category name returned by
 * <CODE>getName()</CODE> is the IPP attribute name.  The enumeration's
 * integer value is the IPP enum value.  The <code>toString()</code> method
 * returns the IPP string representation of the attribute value.
 * <P>
 *
 * @author  Alan Kaminsky
 */
