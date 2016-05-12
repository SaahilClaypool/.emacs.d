_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    @Override

    /**
     * Returns a string version of the context for debugging.
     *
     * @return a string representation of the context, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    Long getValue(TemporalField field) {

    /**
     * Gets the value of the specified field.
     * <p>
     * This will return the value for the specified field.
     *
     * @param field  the field to find, not null
     * @return the value, null if not found and optional is true
     * @throws DateTimeException if the field is not available and the section is not optional
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    <R> R getValue(TemporalQuery<R> query) {

    /**
     * Gets a value using a query.
     *
     * @param query  the query to use, not null
     * @return the result, null if not found and optional is true
     * @throws DateTimeException if the type is not available and the section is not optional
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    void endOptional() {

    /**
     * Ends the printing of an optional segment of the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    void startOptional() {

    /**
     * Starts the printing of an optional segment of the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    DecimalStyle getDecimalStyle() {

    /**
     * Gets the DecimalStyle.
     * <p>
     * The DecimalStyle controls the localization of numeric output.
     *
     * @return the DecimalStyle, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    Locale getLocale() {

    /**
     * Gets the locale.
     * <p>
     * This locale is used to control localization in the format output except
     * where localization is controlled by the DecimalStyle.
     *
     * @return the locale, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    TemporalAccessor getTemporal() {

    /**
     * Gets the temporal object being output.
     *
     * @return the temporal object, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    DateTimePrintContext(TemporalAccessor temporal, DateTimeFormatter formatter) {

    /**
     * Creates a new instance of the context.
     *
     * @param temporal  the temporal object being output, not null
     * @param formatter  the formatter controlling the format, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    private int optional;

    /**
     * Whether the current formatter is optional.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
    private TemporalAccessor temporal;

    /**
     * The temporal being output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimePrintContext.java
final class DateTimePrintContext {

/**
 * Context object used during date and time printing.
 * <p>
 * This class provides a single wrapper to items used in the format.
 *
 * @implSpec
 * This class is a mutable context intended for use from a single thread.
 * Usage of the class is thread-safe within standard printing as the framework creates
 * a new instance of the class for each format and printing is single-threaded.
 *
 * @since 1.8
 */
