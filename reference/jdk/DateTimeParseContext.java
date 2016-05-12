_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    @Override

    /**
     * Returns a string version of the context for debugging.
     *
     * @return a string representation of the context data, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void setParsedLeapSecond() {

    /**
     * Stores the parsed leap second.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void setParsed(ZoneId zone) {

    /**
     * Stores the parsed zone.
     * <p>
     * This stores the zone that has been parsed.
     * No validation is performed other than ensuring it is not null.
     *
     * @param zone  the parsed zone, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void addChronoChangedListener(Consumer<Chronology> listener) {

    /**
     * Adds a Consumer<Chronology> to the list of listeners to be notified
     * if the Chronology changes.
     * @param listener a Consumer<Chronology> to be called when Chronology changes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void setParsed(Chronology chrono) {

    /**
     * Stores the parsed chronology.
     * <p>
     * This stores the chronology that has been parsed.
     * No validation is performed other than ensuring it is not null.
     * <p>
     * The list of listeners is copied and cleared so that each
     * listener is called only once.  A listener can add itself again
     * if it needs to be notified of future changes.
     *
     * @param chrono  the parsed chronology, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    int setParsedField(TemporalField field, long value, int errorPos, int successPos) {

    /**
     * Stores the parsed field.
     * <p>
     * This stores a field-value pair that has been parsed.
     * The value stored may be out of range for the field - no checks are performed.
     *
     * @param field  the field to set in the field-value map, not null
     * @param value  the value to set in the field-value map
     * @param errorPos  the position of the field being parsed
     * @param successPos  the position after the field being parsed
     * @return the new position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    Long getParsed(TemporalField field) {

    /**
     * Gets the first value that was parsed for the specified field.
     * <p>
     * This searches the results of the parse, returning the first value found
     * for the specified field. No attempt is made to derive a value.
     * The field may have an out of range value.
     * For example, the day-of-month might be set to 50, or the hour to 1000.
     *
     * @param field  the field to query from the map, null returns null
     * @return the value mapped to the specified field, null if field was not parsed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    TemporalAccessor toResolved(ResolverStyle resolverStyle, Set<TemporalField> resolverFields) {

    /**
     * Gets the resolved result of the parse.
     *
     * @return the result of the parse, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    Parsed toUnresolved() {

    /**
     * Gets the unresolved result of the parse.
     *
     * @return the result of the parse, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    private Parsed currentParsed() {

    /**
     * Gets the currently active temporal objects.
     *
     * @return the current temporal objects, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void endOptional(boolean successful) {

    /**
     * Ends the parsing of an optional segment of the input.
     *
     * @param successful  whether the optional segment was successfully parsed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void startOptional() {

    /**
     * Starts the parsing of an optional segment of the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void setStrict(boolean strict) {

    /**
     * Sets whether parsing is strict or lenient.
     *
     * @param strict  changes the parsing to be strict or lenient from now on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    boolean isStrict() {

    /**
     * Checks if parsing is strict.
     * <p>
     * Strict parsing requires exact matching of the text and sign styles.
     *
     * @return true if parsing is strict, false if lenient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    static boolean charEqualsIgnoreCase(char c1, char c2) {

    /**
     * Compares two characters ignoring case.
     *
     * @param c1  the first
     * @param c2  the second
     * @return true if equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    boolean charEquals(char ch1, char ch2) {

    /**
     * Helper to compare two {@code char}.
     * This uses {@link #isCaseSensitive()}.
     *
     * @param ch1  the first character
     * @param ch2  the second character
     * @return true if equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    boolean subSequenceEquals(CharSequence cs1, int offset1, CharSequence cs2, int offset2, int length) {

    /**
     * Helper to compare two {@code CharSequence} instances.
     * This uses {@link #isCaseSensitive()}.
     *
     * @param cs1  the first character sequence, not null
     * @param offset1  the offset into the first sequence, valid
     * @param cs2  the second character sequence, not null
     * @param offset2  the offset into the second sequence, valid
     * @param length  the length to check, valid
     * @return true if equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    void setCaseSensitive(boolean caseSensitive) {

    /**
     * Sets whether the parsing is case sensitive or not.
     *
     * @param caseSensitive  changes the parsing to be case sensitive or not from now on
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    boolean isCaseSensitive() {

    /**
     * Checks if parsing is case sensitive.
     *
     * @return true if parsing is case sensitive, false if case insensitive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    Chronology getEffectiveChronology() {

    /**
     * Gets the effective chronology during parsing.
     *
     * @return the effective parsing chronology, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    DecimalStyle getDecimalStyle() {

    /**
     * Gets the DecimalStyle.
     * <p>
     * The DecimalStyle controls the numeric parsing.
     *
     * @return the DecimalStyle, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    Locale getLocale() {

    /**
     * Gets the locale.
     * <p>
     * This locale is used to control localization in the parse except
     * where localization is controlled by the DecimalStyle.
     *
     * @return the locale, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    DateTimeParseContext copy() {

    /**
     * Creates a copy of this context.
     * This retains the case sensitive and strict flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    DateTimeParseContext(DateTimeFormatter formatter) {

    /**
     * Creates a new instance of the context.
     *
     * @param formatter  the formatter controlling the parse, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    private ArrayList<Consumer<Chronology>> chronoListeners = null;

    /**
     * List of Consumers<Chronology> to be notified if the Chronology changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    private boolean strict = true;

    /**
     * Whether to parse using strict rules.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
    private DateTimeFormatter formatter;

    /**
     * The formatter, not null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseContext.java
final class DateTimeParseContext {

/**
 * Context object used during date and time parsing.
 * <p>
 * This class represents the current state of the parse.
 * It has the ability to store and retrieve the parsed values and manage optional segments.
 * It also provides key information to the parsing methods.
 * <p>
 * Once parsing is complete, the {@link #toUnresolved()} is used to obtain the unresolved
 * result data. The {@link #toResolved()} is used to obtain the resolved result.
 *
 * @implSpec
 * This class is a mutable context intended for use from a single thread.
 * Usage of the class is thread-safe within standard parsing as a new instance of this class
 * is automatically created for each parse and parsing is single-threaded
 *
 * @since 1.8
 */
