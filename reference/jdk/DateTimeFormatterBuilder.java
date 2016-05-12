_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final Comparator<String> LENGTH_SORT = new Comparator<String>() {

    /**
     * Length comparator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private DateTimePrinterParser printerParser(Locale locale) {

        /**
         * Gets the printerParser to use based on the field and the locale.
         *
         * @param locale  the locale to use, not null
         * @return the formatter, not null
         * @throws IllegalArgumentException if the formatter cannot be found
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        WeekBasedFieldPrinterParser(char chr, int count) {

        /**
         * Constructor.
         *
         * @param chr the pattern format letter that added this PrinterParser.
         * @param count the repeat count of the format letter
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class WeekBasedFieldPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a localized pattern from a localized field.
     * The specific formatter and parameters is not selected until the
     * the field is to be printed or parsed.
     * The locale is needed to select the proper WeekFields from which
     * the field for day-of-week, week-of-month, or week-of-year is selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private DateTimeFormatter formatter(Locale locale, Chronology chrono) {

        /**
         * Gets the formatter to use.
         * <p>
         * The formatter will be the most appropriate to use for the date and time style in the locale.
         * For example, some locales will use the month name while others will use the number.
         *
         * @param locale  the locale to use, not null
         * @param chrono  the chronology to use, not null
         * @return the formatter, not null
         * @throws IllegalArgumentException if the formatter cannot be found
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        LocalizedPrinterParser(FormatStyle dateStyle, FormatStyle timeStyle) {

        /**
         * Constructor.
         *
         * @param dateStyle  the date style to use, may be null
         * @param timeStyle  the time style to use, may be null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class LocalizedPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a localized pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private String getChronologyName(Chronology chrono, Locale locale) {

        /**
         * Returns the chronology name of the given chrono in the given locale
         * if available, or the chronology Id otherwise. The regular ResourceBundle
         * search path is used for looking up the chronology name.
         *
         * @param chrono  the chronology, not null
         * @param locale  the locale, not null
         * @return the chronology name of chrono in locale, or the id if no name is available
         * @throws NullPointerException if chrono or locale is null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class ChronoPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private static class LENIENT extends CI {

        /**
         * Lenient prefix tree. Case insensitive and ignores characters
         * like space, underscore and slash.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private static class CI extends PrefixTree {

        /**
         * Case Insensitive prefix tree.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public String match(CharSequence text, ParsePosition pos) {

        /**
         * Match text with the prefix tree.
         *
         * @param text  the input text to parse, not null
         * @param pos  the position to start parsing at, from 0 to the text
         *  length. Upon return, position will be updated to the new parse
         *  position, or unchanged, if no match found.
         * @return the resulting string, or null if no match found.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public String match(CharSequence text, int off, int end) {

        /**
         * Match text with the prefix tree.
         *
         * @param text  the input text to parse, not null
         * @param off  the offset position to start parsing at
         * @param end  the end position to stop parsing
         * @return the resulting string, or null if no match found.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public boolean add(String k, String v) {

        /**
         * Adds a pair of {key, value} into the prefix tree.
         *
         * @param k  the key, not null
         * @param v  the value, not null
         * @return  true if the pair is added successfully
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public PrefixTree copyTree() {

        /**
         * Clone a copy of this tree
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public static  PrefixTree newTree(Set<String> keys, DateTimeParseContext context) {

        /**
         * Creates a new prefix parsing tree.
         *
         * @param keys  a set of strings to build the prefix parsing tree, not null
         * @param context  the parse context
         * @return the tree, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public static PrefixTree newTree(DateTimeParseContext context) {

        /**
         * Creates a new prefix parsing tree based on parse context.
         *
         * @param context  the parse context
         * @return the tree, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static class PrefixTree {

    /**
     * A String based prefix tree for parsing time-zone names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private int parseOffsetBased(DateTimeParseContext context, CharSequence text, int prefixPos, int position, OffsetIdPrinterParser parser) {

        /**
         * Parse an offset following a prefix and set the ZoneId if it is valid.
         * To matching the parsing of ZoneId.of the values are not normalized
         * to ZoneOffsets.
         *
         * @param context the parse context
         * @param text the input text
         * @param prefixPos start of the prefix
         * @param position start of text after the prefix
         * @param parser parser for the value after the prefix
         * @return the position after the parse
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        @Override

        /**
         * This implementation looks for the longest matching string.
         * For example, parsing Etc/GMT-2 will return Etc/GMC-2 rather than just
         * Etc/GMC although both are valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private static volatile Entry<Integer, PrefixTree> cachedPrefixTree;

        /**
         * The cached tree to speed up parsing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static class ZoneIdPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a zone ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private Set<String> preferredZones;

        /** The preferred zoneid map */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private final TextStyle textStyle;

        /** The text style to output. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class ZoneTextPrinterParser extends ZoneIdPrinterParser {

    /**
     * Prints or parses a zone ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        LocalizedOffsetIdPrinterParser(TextStyle style) {

        /**
         * Constructor.
         *
         * @param style  the style, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class LocalizedOffsetIdPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses an offset ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private boolean parseNumber(int[] array, int arrayIndex, CharSequence parseText, boolean required) {

        /**
         * Parse a two digit zero-prefixed number.
         *
         * @param array  the array of parsed data, 0=pos,1=hours,2=mins,3=secs, not null
         * @param arrayIndex  the index to parse the value into
         * @param parseText  the offset ID, not null
         * @param required  whether this number is required
         * @return true if an error occurred
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        OffsetIdPrinterParser(String pattern, String noOffsetText) {

        /**
         * Constructor.
         *
         * @param pattern  the pattern
         * @param noOffsetText  the text to use for UTC, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class OffsetIdPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses an offset ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class InstantPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses an ISO-8601 instant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private NumberPrinterParser numberPrinterParser() {

        /**
         * Create and cache a number printer parser.
         * @return the number printer parser for this field, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        TextPrinterParser(TemporalField field, TextStyle textStyle, DateTimeTextProvider provider) {

        /**
         * Constructor.
         *
         * @param field  the field to output, not null
         * @param textStyle  the text style, not null
         * @param provider  the text provider, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private volatile NumberPrinterParser numberPrinterParser;

        /**
         * The cached number printer parser.
         * Immutable and volatile, so no synchronization needed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class TextPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses field text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private long convertFromFraction(BigDecimal fraction) {

        /**
         * Converts a fraction from 0 to 1 for this field to a value.
         * <p>
         * The fractional value must be between 0 (inclusive) and 1 (exclusive).
         * It can only be returned if the {@link java.time.temporal.TemporalField#range() value range} is fixed.
         * The value is obtained by calculation from the field range and a rounding
         * mode of {@link RoundingMode#FLOOR FLOOR}.
         * The calculation is inaccurate if the values do not run continuously from smallest to largest.
         * <p>
         * For example, the fractional second-of-minute of 0.25 would be converted to 15,
         * assuming the standard definition of 60 seconds in a minute.
         *
         * @param fraction  the fraction to convert, not null
         * @return the value of the field, valid for this rule
         * @throws DateTimeException if the value cannot be converted
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private BigDecimal convertToFraction(long value) {

        /**
         * Converts a value for this field to a fraction between 0 and 1.
         * <p>
         * The fractional value is between 0 (inclusive) and 1 (exclusive).
         * It can only be returned if the {@link java.time.temporal.TemporalField#range() value range} is fixed.
         * The fraction is obtained by calculation from the field range using 9 decimal
         * places and a rounding mode of {@link RoundingMode#FLOOR FLOOR}.
         * The calculation is inaccurate if the values do not run continuously from smallest to largest.
         * <p>
         * For example, the second-of-minute value of 15 would be returned as 0.25,
         * assuming the standard definition of 60 seconds in a minute.
         *
         * @param value  the value to convert, must be valid for this rule
         * @return the value as a fraction within the range, from 0 to 1, not null
         * @throws DateTimeException if the value cannot be converted to a fraction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        FractionPrinterParser(TemporalField field, int minWidth, int maxWidth, boolean decimalPoint) {

        /**
         * Constructor.
         *
         * @param field  the field to output, not null
         * @param minWidth  the minimum width to output, from 0 to 9
         * @param maxWidth  the maximum width to output, from 0 to 9
         * @param decimalPoint  whether to output the localized decimal point symbol
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class FractionPrinterParser implements DateTimePrinterParser {

    /**
     * Prints and parses a numeric date-time field with optional padding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        @Override

        /**
         * For a ReducedPrinterParser, fixed width is false if the mode is strict,
         * otherwise it is set as for NumberPrinterParser.
         * @param context the context
         * @return if the field is fixed width
         * @see DateTimeFormatterBuilder#appendValueReduced(java.time.temporal.TemporalField, int, int, int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        @Override

        /**
         * Returns a new instance with an updated subsequent width.
         *
         * @param subsequentWidth  the width of subsequent non-negative numbers, 0 or greater
         * @return a new updated printer-parser, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        @Override

        /**
         * Returns a new instance with fixed width flag set.
         *
         * @return a new updated printer-parser, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        private ReducedPrinterParser(TemporalField field, int minWidth, int maxWidth,
                int baseValue, ChronoLocalDate baseDate, int subsequentWidth) {

        /**
         * Constructor.
         * The arguments have already been checked.
         *
         * @param field  the field to format, validated not null
         * @param minWidth  the minimum field width, from 1 to 10
         * @param maxWidth  the maximum field width, from 1 to 10
         * @param baseValue  the base value
         * @param baseDate  the base date
         * @param subsequentWidth the subsequentWidth for this instance
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        ReducedPrinterParser(TemporalField field, int minWidth, int maxWidth,
                int baseValue, ChronoLocalDate baseDate) {

        /**
         * Constructor.
         *
         * @param field  the field to format, validated not null
         * @param minWidth  the minimum field width, from 1 to 10
         * @param maxWidth  the maximum field width, from 1 to 10
         * @param baseValue  the base value
         * @param baseDate  the base date
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class ReducedPrinterParser extends NumberPrinterParser {

    /**
     * Prints and parses a reduced numeric date-time field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        int setValue(DateTimeParseContext context, long value, int errorPos, int successPos) {

        /**
         * Stores the value.
         *
         * @param context  the context to store into, not null
         * @param value  the value
         * @param errorPos  the position of the field being parsed
         * @param successPos  the position after the field being parsed
         * @return the new position
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        boolean isFixedWidth(DateTimeParseContext context) {

        /**
         * For NumberPrinterParser, the width is fixed depending on the
         * minWidth, maxWidth, signStyle and whether subsequent fields are fixed.
         * @param context the context
         * @return true if the field is fixed width
         * @see DateTimeFormatterBuilder#appendValue(java.time.temporal.TemporalField, int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        long getValue(DateTimePrintContext context, long value) {

        /**
         * Gets the value to output.
         *
         * @param context  the context
         * @param value  the value of the field, not null
         * @return the value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        NumberPrinterParser withSubsequentWidth(int subsequentWidth) {

        /**
         * Returns a new instance with an updated subsequent width.
         *
         * @param subsequentWidth  the width of subsequent non-negative numbers, 0 or greater
         * @return a new updated printer-parser, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        NumberPrinterParser withFixedWidth() {

        /**
         * Returns a new instance with fixed width flag set.
         *
         * @return a new updated printer-parser, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        protected NumberPrinterParser(TemporalField field, int minWidth, int maxWidth, SignStyle signStyle, int subsequentWidth) {

        /**
         * Constructor.
         *
         * @param field  the field to format, not null
         * @param minWidth  the minimum field width, from 1 to 19
         * @param maxWidth  the maximum field width, from minWidth to 19
         * @param signStyle  the positive/negative sign style, not null
         * @param subsequentWidth  the width of subsequent non-negative numbers, 0 or greater,
         *  -1 if fixed width due to active adjacent parsing
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        NumberPrinterParser(TemporalField field, int minWidth, int maxWidth, SignStyle signStyle) {

        /**
         * Constructor.
         *
         * @param field  the field to format, not null
         * @param minWidth  the minimum field width, from 1 to 19
         * @param maxWidth  the maximum field width, from minWidth to 19
         * @param signStyle  the positive/negative sign style, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        static final long[] EXCEED_POINTS = new long[] {

        /**
         * Array of 10 to the power of n.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static class NumberPrinterParser implements DateTimePrinterParser {

    /**
     * Prints and parses a numeric date-time field with optional padding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class StringLiteralPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a string literal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class CharLiteralPrinterParser implements DateTimePrinterParser {

    /**
     * Prints or parses a character literal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static class DefaultValueParser implements DateTimePrinterParser {

    /**
     * Defaults a value into the parse if not currently present.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static enum SettingsParser implements DateTimePrinterParser {

    /**
     * Enumeration to apply simple parse settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        PadPrinterParserDecorator(DateTimePrinterParser printerParser, int padWidth, char padChar) {

        /**
         * Constructor.
         *
         * @param printerParser  the printer, not null
         * @param padWidth  the width to pad to, 1 or greater
         * @param padChar  the pad character
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class PadPrinterParserDecorator implements DateTimePrinterParser {

    /**
     * Pads the output to a fixed width.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        public CompositePrinterParser withOptional(boolean optional) {

        /**
         * Returns a copy of this printer-parser with the optional flag changed.
         *
         * @param optional  the optional flag to set in the copy
         * @return the new printer-parser, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    static final class CompositePrinterParser implements DateTimePrinterParser {

    /**
     * Composite printer and parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        int parse(DateTimeParseContext context, CharSequence text, int position);

        /**
         * Parses text into date-time information.
         * <p>
         * The context holds information to use during the parse.
         * It is also used to store the parsed date-time information.
         *
         * @param context  the context to use and parse into, not null
         * @param text  the input text to parse, not null
         * @param position  the position to start parsing at, from 0 to the text length
         * @return the new parse position, where negative means an error with the
         *  error position encoded using the complement ~ operator
         * @throws NullPointerException if the context or text is null
         * @throws IndexOutOfBoundsException if the position is invalid
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
        boolean format(DateTimePrintContext context, StringBuilder buf);

        /**
         * Prints the date-time object to the buffer.
         * <p>
         * The context holds information to use during the format.
         * It also contains the date-time information to be printed.
         * <p>
         * The buffer must not be mutated beyond the content controlled by the implementation.
         *
         * @param context  the context to format using, not null
         * @param buf  the buffer to append to, not null
         * @return false if unable to query the value from the date-time, true otherwise
         * @throws DateTimeException if the date-time cannot be printed successfully
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    interface DateTimePrinterParser {

    /**
     * Strategy for formatting/parsing date-time information.
     * <p>
     * The printer may format any part, or the whole, of the input date-time object.
     * Typically, a complete format is constructed from a number of smaller
     * units, each outputting a single field.
     * <p>
     * The parser may parse any piece of text from the input, storing the result
     * in the context. Typically, each individual parser will just parse one
     * field, such as the day-of-month, storing the value in the context.
     * Once the parse is complete, the caller will then resolve the parsed values
     * to create the desired object, such as a {@code LocalDate}.
     * <p>
     * The parse position will be updated during the parse. Parsing will start at
     * the specified index and the return value specifies the new parse position
     * for the next parser. If an error occurs, the returned index will be negative
     * and will have the error position encoded using the complement operator.
     *
     * @implSpec
     * This interface must be implemented with care to ensure other classes operate correctly.
     * All implementations that can be instantiated must be final, immutable and thread-safe.
     * <p>
     * The context is not a thread-safe object and a new instance will be created
     * for each format that occurs. The context must not be stored in an instance
     * variable or shared with any other threads.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private DateTimeFormatter toFormatter(Locale locale, ResolverStyle resolverStyle, Chronology chrono) {

    /**
     * Completes this builder by creating the formatter.
     *
     * @param locale  the locale to use for formatting, not null
     * @param chrono  the chronology to use, may be null
     * @return the created formatter, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    DateTimeFormatter toFormatter(ResolverStyle resolverStyle, Chronology chrono) {

    /**
     * Completes this builder by creating the formatter.
     * This uses the default locale.
     *
     * @param resolverStyle  the resolver style to use, not null
     * @return the created formatter, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatter toFormatter(Locale locale) {

    /**
     * Completes this builder by creating the {@code DateTimeFormatter}
     * using the specified locale.
     * <p>
     * This will create a formatter with the specified locale.
     * Numbers will be printed and parsed using the standard DecimalStyle.
     * The resolver style will be {@link ResolverStyle#SMART SMART}.
     * <p>
     * Calling this method will end any open optional sections by repeatedly
     * calling {@link #optionalEnd()} before creating the formatter.
     * <p>
     * This builder can still be used after creating the formatter if desired,
     * although the state may have been changed by calls to {@code optionalEnd}.
     *
     * @param locale  the locale to use for formatting, not null
     * @return the created formatter, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatter toFormatter() {

    /**
     * Completes this builder by creating the {@code DateTimeFormatter}
     * using the default locale.
     * <p>
     * This will create a formatter with the {@linkplain Locale#getDefault(Locale.Category) default FORMAT locale}.
     * Numbers will be printed and parsed using the standard DecimalStyle.
     * The resolver style will be {@link ResolverStyle#SMART SMART}.
     * <p>
     * Calling this method will end any open optional sections by repeatedly
     * calling {@link #optionalEnd()} before creating the formatter.
     * <p>
     * This builder can still be used after creating the formatter if desired,
     * although the state may have been changed by calls to {@code optionalEnd}.
     *
     * @return the created formatter, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private int appendInternal(DateTimePrinterParser pp) {

    /**
     * Appends a printer and/or parser to the internal list handling padding.
     *
     * @param pp  the printer-parser to add, not null
     * @return the index into the active parsers list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder optionalEnd() {

    /**
     * Ends an optional section.
     * <p>
     * The output of formatting can include optional sections, which may be nested.
     * An optional section is started by calling {@link #optionalStart()} and ended
     * using this method (or at the end of the builder).
     * <p>
     * Calling this method without having previously called {@code optionalStart}
     * will throw an exception.
     * Calling this method immediately after calling {@code optionalStart} has no effect
     * on the formatter other than ending the (empty) optional section.
     * <p>
     * All elements in the optional section are treated as optional.
     * During formatting, the section is only output if data is available in the
     * {@code TemporalAccessor} for all the elements in the section.
     * During parsing, the whole section may be missing from the parsed string.
     * <p>
     * For example, consider a builder setup as
     * {@code builder.appendValue(HOUR_OF_DAY,2).optionalStart().appendValue(MINUTE_OF_HOUR,2).optionalEnd()}.
     * During formatting, the minute will only be output if its value can be obtained from the date-time.
     * During parsing, the input will be successfully parsed whether the minute is present or not.
     *
     * @return this, for chaining, not null
     * @throws IllegalStateException if there was no previous call to {@code optionalStart}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder optionalStart() {

    /**
     * Mark the start of an optional section.
     * <p>
     * The output of formatting can include optional sections, which may be nested.
     * An optional section is started by calling this method and ended by calling
     * {@link #optionalEnd()} or by ending the build process.
     * <p>
     * All elements in the optional section are treated as optional.
     * During formatting, the section is only output if data is available in the
     * {@code TemporalAccessor} for all the elements in the section.
     * During parsing, the whole section may be missing from the parsed string.
     * <p>
     * For example, consider a builder setup as
     * {@code builder.appendValue(HOUR_OF_DAY,2).optionalStart().appendValue(MINUTE_OF_HOUR,2)}.
     * The optional section ends automatically at the end of the builder.
     * During formatting, the minute will only be output if its value can be obtained from the date-time.
     * During parsing, the input will be successfully parsed whether the minute is present or not.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder padNext(int padWidth, char padChar) {

    /**
     * Causes the next added printer/parser to pad to a fixed width.
     * <p>
     * This padding is intended for padding other than zero-padding.
     * Zero-padding should be achieved using the appendValue methods.
     * <p>
     * During formatting, the decorated element will be output and then padded
     * to the specified width. An exception will be thrown during formatting if
     * the pad width is exceeded.
     * <p>
     * During parsing, the padding and decorated element are parsed.
     * If parsing is lenient, then the pad width is treated as a maximum.
     * If parsing is case insensitive, then the pad character is matched ignoring case.
     * The padding is parsed greedily. Thus, if the decorated element starts with
     * the pad character, it will not be parsed.
     *
     * @param padWidth  the pad width, 1 or greater
     * @param padChar  the pad character
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if pad width is too small
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder padNext(int padWidth) {

    /**
     * Causes the next added printer/parser to pad to a fixed width using a space.
     * <p>
     * This padding will pad to a fixed width using spaces.
     * <p>
     * During formatting, the decorated element will be output and then padded
     * to the specified width. An exception will be thrown during formatting if
     * the pad width is exceeded.
     * <p>
     * During parsing, the padding and decorated element are parsed.
     * If parsing is lenient, then the pad width is treated as a maximum.
     * The padding is parsed greedily. Thus, if the decorated element starts with
     * the pad character, it will not be parsed.
     *
     * @param padWidth  the pad width, 1 or greater
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if pad width is too small
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private static final Map<Character, TemporalField> FIELD_MAP = new HashMap<>();

    /** Map of letters to fields. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendPattern(String pattern) {

    /**
     * Appends the elements defined by the specified pattern to the builder.
     * <p>
     * All letters 'A' to 'Z' and 'a' to 'z' are reserved as pattern letters.
     * The characters '#', '{' and '}' are reserved for future use.
     * The characters '[' and ']' indicate optional patterns.
     * The following pattern letters are defined:
     * <pre>
     *  Symbol  Meaning                     Presentation      Examples
     *  ------  -------                     ------------      -------
     *   G       era                         text              AD; Anno Domini; A
     *   u       year                        year              2004; 04
     *   y       year-of-era                 year              2004; 04
     *   D       day-of-year                 number            189
     *   M/L     month-of-year               number/text       7; 07; Jul; July; J
     *   d       day-of-month                number            10
     *
     *   Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
     *   Y       week-based-year             year              1996; 96
     *   w       week-of-week-based-year     number            27
     *   W       week-of-month               number            4
     *   E       day-of-week                 text              Tue; Tuesday; T
     *   e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
     *   F       week-of-month               number            3
     *
     *   a       am-pm-of-day                text              PM
     *   h       clock-hour-of-am-pm (1-12)  number            12
     *   K       hour-of-am-pm (0-11)        number            0
     *   k       clock-hour-of-am-pm (1-24)  number            0
     *
     *   H       hour-of-day (0-23)          number            0
     *   m       minute-of-hour              number            30
     *   s       second-of-minute            number            55
     *   S       fraction-of-second          fraction          978
     *   A       milli-of-day                number            1234
     *   n       nano-of-second              number            987654321
     *   N       nano-of-day                 number            1234000000
     *
     *   V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
     *   z       time-zone name              zone-name         Pacific Standard Time; PST
     *   O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
     *   X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
     *   x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
     *   Z       zone-offset                 offset-Z          +0000; -0800; -08:00;
     *
     *   p       pad next                    pad modifier      1
     *
     *   '       escape for text             delimiter
     *   ''      single quote                literal           '
     *   [       optional section start
     *   ]       optional section end
     *   #       reserved for future use
     *   {       reserved for future use
     *   }       reserved for future use
     * </pre>
     * <p>
     * The count of pattern letters determine the format.
     * See <a href="DateTimeFormatter.html#patterns">DateTimeFormatter</a> for a user-focused description of the patterns.
     * The following tables define how the pattern letters map to the builder.
     * <p>
     * <b>Date fields</b>: Pattern letters to output a date.
     * <pre>
     *  Pattern  Count  Equivalent builder methods
     *  -------  -----  --------------------------
     *    G       1      appendText(ChronoField.ERA, TextStyle.SHORT)
     *    GG      2      appendText(ChronoField.ERA, TextStyle.SHORT)
     *    GGG     3      appendText(ChronoField.ERA, TextStyle.SHORT)
     *    GGGG    4      appendText(ChronoField.ERA, TextStyle.FULL)
     *    GGGGG   5      appendText(ChronoField.ERA, TextStyle.NARROW)
     *
     *    u       1      appendValue(ChronoField.YEAR, 1, 19, SignStyle.NORMAL);
     *    uu      2      appendValueReduced(ChronoField.YEAR, 2, 2000);
     *    uuu     3      appendValue(ChronoField.YEAR, 3, 19, SignStyle.NORMAL);
     *    u..u    4..n   appendValue(ChronoField.YEAR, n, 19, SignStyle.EXCEEDS_PAD);
     *    y       1      appendValue(ChronoField.YEAR_OF_ERA, 1, 19, SignStyle.NORMAL);
     *    yy      2      appendValueReduced(ChronoField.YEAR_OF_ERA, 2, 2000);
     *    yyy     3      appendValue(ChronoField.YEAR_OF_ERA, 3, 19, SignStyle.NORMAL);
     *    y..y    4..n   appendValue(ChronoField.YEAR_OF_ERA, n, 19, SignStyle.EXCEEDS_PAD);
     *    Y       1      append special localized WeekFields element for numeric week-based-year
     *    YY      2      append special localized WeekFields element for reduced numeric week-based-year 2 digits;
     *    YYY     3      append special localized WeekFields element for numeric week-based-year (3, 19, SignStyle.NORMAL);
     *    Y..Y    4..n   append special localized WeekFields element for numeric week-based-year (n, 19, SignStyle.EXCEEDS_PAD);
     *
     *    Q       1      appendValue(IsoFields.QUARTER_OF_YEAR);
     *    QQ      2      appendValue(IsoFields.QUARTER_OF_YEAR, 2);
     *    QQQ     3      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.SHORT)
     *    QQQQ    4      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.FULL)
     *    QQQQQ   5      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.NARROW)
     *    q       1      appendValue(IsoFields.QUARTER_OF_YEAR);
     *    qq      2      appendValue(IsoFields.QUARTER_OF_YEAR, 2);
     *    qqq     3      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.SHORT_STANDALONE)
     *    qqqq    4      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.FULL_STANDALONE)
     *    qqqqq   5      appendText(IsoFields.QUARTER_OF_YEAR, TextStyle.NARROW_STANDALONE)
     *
     *    M       1      appendValue(ChronoField.MONTH_OF_YEAR);
     *    MM      2      appendValue(ChronoField.MONTH_OF_YEAR, 2);
     *    MMM     3      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.SHORT)
     *    MMMM    4      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL)
     *    MMMMM   5      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.NARROW)
     *    L       1      appendValue(ChronoField.MONTH_OF_YEAR);
     *    LL      2      appendValue(ChronoField.MONTH_OF_YEAR, 2);
     *    LLL     3      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.SHORT_STANDALONE)
     *    LLLL    4      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL_STANDALONE)
     *    LLLLL   5      appendText(ChronoField.MONTH_OF_YEAR, TextStyle.NARROW_STANDALONE)
     *
     *    w       1      append special localized WeekFields element for numeric week-of-year
     *    ww      2      append special localized WeekFields element for numeric week-of-year, zero-padded
     *    W       1      append special localized WeekFields element for numeric week-of-month
     *    d       1      appendValue(ChronoField.DAY_OF_MONTH)
     *    dd      2      appendValue(ChronoField.DAY_OF_MONTH, 2)
     *    D       1      appendValue(ChronoField.DAY_OF_YEAR)
     *    DD      2      appendValue(ChronoField.DAY_OF_YEAR, 2)
     *    DDD     3      appendValue(ChronoField.DAY_OF_YEAR, 3)
     *    F       1      appendValue(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)
     *    E       1      appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT)
     *    EE      2      appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT)
     *    EEE     3      appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT)
     *    EEEE    4      appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL)
     *    EEEEE   5      appendText(ChronoField.DAY_OF_WEEK, TextStyle.NARROW)
     *    e       1      append special localized WeekFields element for numeric day-of-week
     *    ee      2      append special localized WeekFields element for numeric day-of-week, zero-padded
     *    eee     3      appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT)
     *    eeee    4      appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL)
     *    eeeee   5      appendText(ChronoField.DAY_OF_WEEK, TextStyle.NARROW)
     *    c       1      append special localized WeekFields element for numeric day-of-week
     *    ccc     3      appendText(ChronoField.DAY_OF_WEEK, TextStyle.SHORT_STANDALONE)
     *    cccc    4      appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE)
     *    ccccc   5      appendText(ChronoField.DAY_OF_WEEK, TextStyle.NARROW_STANDALONE)
     * </pre>
     * <p>
     * <b>Time fields</b>: Pattern letters to output a time.
     * <pre>
     *  Pattern  Count  Equivalent builder methods
     *  -------  -----  --------------------------
     *    a       1      appendText(ChronoField.AMPM_OF_DAY, TextStyle.SHORT)
     *    h       1      appendValue(ChronoField.CLOCK_HOUR_OF_AMPM)
     *    hh      2      appendValue(ChronoField.CLOCK_HOUR_OF_AMPM, 2)
     *    H       1      appendValue(ChronoField.HOUR_OF_DAY)
     *    HH      2      appendValue(ChronoField.HOUR_OF_DAY, 2)
     *    k       1      appendValue(ChronoField.CLOCK_HOUR_OF_DAY)
     *    kk      2      appendValue(ChronoField.CLOCK_HOUR_OF_DAY, 2)
     *    K       1      appendValue(ChronoField.HOUR_OF_AMPM)
     *    KK      2      appendValue(ChronoField.HOUR_OF_AMPM, 2)
     *    m       1      appendValue(ChronoField.MINUTE_OF_HOUR)
     *    mm      2      appendValue(ChronoField.MINUTE_OF_HOUR, 2)
     *    s       1      appendValue(ChronoField.SECOND_OF_MINUTE)
     *    ss      2      appendValue(ChronoField.SECOND_OF_MINUTE, 2)
     *
     *    S..S    1..n   appendFraction(ChronoField.NANO_OF_SECOND, n, n, false)
     *    A       1      appendValue(ChronoField.MILLI_OF_DAY)
     *    A..A    2..n   appendValue(ChronoField.MILLI_OF_DAY, n)
     *    n       1      appendValue(ChronoField.NANO_OF_SECOND)
     *    n..n    2..n   appendValue(ChronoField.NANO_OF_SECOND, n)
     *    N       1      appendValue(ChronoField.NANO_OF_DAY)
     *    N..N    2..n   appendValue(ChronoField.NANO_OF_DAY, n)
     * </pre>
     * <p>
     * <b>Zone ID</b>: Pattern letters to output {@code ZoneId}.
     * <pre>
     *  Pattern  Count  Equivalent builder methods
     *  -------  -----  --------------------------
     *    VV      2      appendZoneId()
     *    z       1      appendZoneText(TextStyle.SHORT)
     *    zz      2      appendZoneText(TextStyle.SHORT)
     *    zzz     3      appendZoneText(TextStyle.SHORT)
     *    zzzz    4      appendZoneText(TextStyle.FULL)
     * </pre>
     * <p>
     * <b>Zone offset</b>: Pattern letters to output {@code ZoneOffset}.
     * <pre>
     *  Pattern  Count  Equivalent builder methods
     *  -------  -----  --------------------------
     *    O       1      appendLocalizedOffsetPrefixed(TextStyle.SHORT);
     *    OOOO    4      appendLocalizedOffsetPrefixed(TextStyle.FULL);
     *    X       1      appendOffset("+HHmm","Z")
     *    XX      2      appendOffset("+HHMM","Z")
     *    XXX     3      appendOffset("+HH:MM","Z")
     *    XXXX    4      appendOffset("+HHMMss","Z")
     *    XXXXX   5      appendOffset("+HH:MM:ss","Z")
     *    x       1      appendOffset("+HHmm","+00")
     *    xx      2      appendOffset("+HHMM","+0000")
     *    xxx     3      appendOffset("+HH:MM","+00:00")
     *    xxxx    4      appendOffset("+HHMMss","+0000")
     *    xxxxx   5      appendOffset("+HH:MM:ss","+00:00")
     *    Z       1      appendOffset("+HHMM","+0000")
     *    ZZ      2      appendOffset("+HHMM","+0000")
     *    ZZZ     3      appendOffset("+HHMM","+0000")
     *    ZZZZ    4      appendLocalizedOffset(TextStyle.FULL);
     *    ZZZZZ   5      appendOffset("+HH:MM:ss","Z")
     * </pre>
     * <p>
     * <b>Modifiers</b>: Pattern letters that modify the rest of the pattern:
     * <pre>
     *  Pattern  Count  Equivalent builder methods
     *  -------  -----  --------------------------
     *    [       1      optionalStart()
     *    ]       1      optionalEnd()
     *    p..p    1..n   padNext(n)
     * </pre>
     * <p>
     * Any sequence of letters not specified above, unrecognized letter or
     * reserved character will throw an exception.
     * Future versions may add to the set of patterns.
     * It is recommended to use single quotes around all characters that you want
     * to output directly to ensure that future changes do not break your application.
     * <p>
     * Note that the pattern string is similar, but not identical, to
     * {@link java.text.SimpleDateFormat SimpleDateFormat}.
     * The pattern string is also similar, but not identical, to that defined by the
     * Unicode Common Locale Data Repository (CLDR/LDML).
     * Pattern letters 'X' and 'u' are aligned with Unicode CLDR/LDML.
     * By contrast, {@code SimpleDateFormat} uses 'u' for the numeric day of week.
     * Pattern letters 'y' and 'Y' parse years of two digits and more than 4 digits differently.
     * Pattern letters 'n', 'A', 'N', and 'p' are added.
     * Number types will reject large numbers.
     *
     * @param pattern  the pattern to add, not null
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendOptional(DateTimeFormatter formatter) {

    /**
     * Appends a formatter to the builder which will optionally format/parse.
     * <p>
     * This method has the same effect as appending each of the constituent
     * parts directly to this builder surrounded by an {@link #optionalStart()} and
     * {@link #optionalEnd()}.
     * <p>
     * The formatter will format if data is available for all the fields contained within it.
     * The formatter will parse if the string matches, otherwise no error is returned.
     *
     * @param formatter  the formatter to add, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder append(DateTimeFormatter formatter) {

    /**
     * Appends all the elements of a formatter to the builder.
     * <p>
     * This method has the same effect as appending each of the constituent
     * parts of the formatter directly to this builder.
     *
     * @param formatter  the formatter to add, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendLiteral(String literal) {

    /**
     * Appends a string literal to the formatter.
     * <p>
     * This string will be output during a format.
     * <p>
     * If the literal is empty, nothing is added to the formatter.
     *
     * @param literal  the literal to append, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendLiteral(char literal) {

    /**
     * Appends a character literal to the formatter.
     * <p>
     * This character will be output during a format.
     *
     * @param literal  the literal to append, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendLocalized(FormatStyle dateStyle, FormatStyle timeStyle) {

    /**
     * Appends a localized date-time pattern to the formatter.
     * <p>
     * This appends a localized section to the builder, suitable for outputting
     * a date, time or date-time combination. The format of the localized
     * section is lazily looked up based on four items:
     * <ul>
     * <li>the {@code dateStyle} specified to this method
     * <li>the {@code timeStyle} specified to this method
     * <li>the {@code Locale} of the {@code DateTimeFormatter}
     * <li>the {@code Chronology}, selecting the best available
     * </ul>
     * During formatting, the chronology is obtained from the temporal object
     * being formatted, which may have been overridden by
     * {@link DateTimeFormatter#withChronology(Chronology)}.
     * <p>
     * During parsing, if a chronology has already been parsed, then it is used.
     * Otherwise the default from {@code DateTimeFormatter.withChronology(Chronology)}
     * is used, with {@code IsoChronology} as the fallback.
     * <p>
     * Note that this method provides similar functionality to methods on
     * {@code DateFormat} such as {@link java.text.DateFormat#getDateTimeInstance(int, int)}.
     *
     * @param dateStyle  the date style to use, null means no date required
     * @param timeStyle  the time style to use, null means no time required
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if both the date and time styles are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendChronologyText(TextStyle textStyle) {

    /**
     * Appends the chronology name to the formatter.
     * <p>
     * The calendar system name will be output during a format.
     * If the chronology cannot be obtained then an exception will be thrown.
     *
     * @param textStyle  the text style to use, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendChronologyId() {

    /**
     * Appends the chronology ID, such as 'ISO' or 'ThaiBuddhist', to the formatter.
     * <p>
     * This appends an instruction to format/parse the chronology ID to the builder.
     * <p>
     * During formatting, the chronology is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#chronology()}.
     * It will be printed using the result of {@link Chronology#getId()}.
     * If the chronology cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, the chronology is parsed and must match one of the chronologies
     * in {@link Chronology#getAvailableChronologies()}.
     * If the chronology cannot be parsed then an exception is thrown unless the
     * section of the formatter is optional.
     * The parser uses the {@linkplain #parseCaseInsensitive() case sensitive} setting.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle,
                                                   Set<ZoneId> preferredZones) {

    /**
     * Appends the time-zone name, such as 'British Summer Time', to the formatter.
     * <p>
     * This appends an instruction to format/parse the textual name of the zone to
     * the builder.
     * <p>
     * During formatting, the zone is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#zoneId()}.
     * If the zone is a {@code ZoneOffset} it will be printed using the
     * result of {@link ZoneOffset#getId()}.
     * If the zone is not an offset, the textual name will be looked up
     * for the locale set in the {@link DateTimeFormatter}.
     * If the temporal object being printed represents an instant, then the text
     * will be the summer or winter time text as appropriate.
     * If the lookup for text does not find any suitable result, then the
     * {@link ZoneId#getId() ID} will be printed instead.
     * If the zone cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, either the textual zone name, the zone ID or the offset
     * is accepted. Many textual zone names are not unique, such as CST can be
     * for both "Central Standard Time" and "China Standard Time". In this
     * situation, the zone id will be determined by the region information from
     * formatter's  {@link DateTimeFormatter#getLocale() locale} and the standard
     * zone id for that area, for example, America/New_York for the America Eastern
     * zone. This method also allows a set of preferred {@link ZoneId} to be
     * specified for parsing. The matched preferred zone id will be used if the
     * textural zone name being parsed is not unique.
     * <p>
     * If the zone cannot be parsed then an exception is thrown unless the
     * section of the formatter is optional.
     *
     * @param textStyle  the text style to use, not null
     * @param preferredZones  the set of preferred zone ids, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {

    /**
     * Appends the time-zone name, such as 'British Summer Time', to the formatter.
     * <p>
     * This appends an instruction to format/parse the textual name of the zone to
     * the builder.
     * <p>
     * During formatting, the zone is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#zoneId()}.
     * If the zone is a {@code ZoneOffset} it will be printed using the
     * result of {@link ZoneOffset#getId()}.
     * If the zone is not an offset, the textual name will be looked up
     * for the locale set in the {@link DateTimeFormatter}.
     * If the temporal object being printed represents an instant, then the text
     * will be the summer or winter time text as appropriate.
     * If the lookup for text does not find any suitable result, then the
     * {@link ZoneId#getId() ID} will be printed instead.
     * If the zone cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, either the textual zone name, the zone ID or the offset
     * is accepted. Many textual zone names are not unique, such as CST can be
     * for both "Central Standard Time" and "China Standard Time". In this
     * situation, the zone id will be determined by the region information from
     * formatter's  {@link DateTimeFormatter#getLocale() locale} and the standard
     * zone id for that area, for example, America/New_York for the America Eastern
     * zone. The {@link #appendZoneText(TextStyle, Set)} may be used
     * to specify a set of preferred {@link ZoneId} in this situation.
     *
     * @param textStyle  the text style to use, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendZoneOrOffsetId() {

    /**
     * Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to
     * the formatter, using the best available zone ID.
     * <p>
     * This appends an instruction to format/parse the best available
     * zone or offset ID to the builder.
     * The zone ID is obtained in a lenient manner that first attempts to
     * find a true zone ID, such as that on {@code ZonedDateTime}, and
     * then attempts to find an offset, such as that on {@code OffsetDateTime}.
     * <p>
     * During formatting, the zone is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#zone()}.
     * It will be printed using the result of {@link ZoneId#getId()}.
     * If the zone cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, the text must match a known zone or offset.
     * There are two types of zone ID, offset-based, such as '+01:30' and
     * region-based, such as 'Europe/London'. These are parsed differently.
     * If the parse starts with '+', '-', 'UT', 'UTC' or 'GMT', then the parser
     * expects an offset-based zone and will not match region-based zones.
     * The offset ID, such as '+02:30', may be at the start of the parse,
     * or prefixed by  'UT', 'UTC' or 'GMT'. The offset ID parsing is
     * equivalent to using {@link #appendOffset(String, String)} using the
     * arguments 'HH:MM:ss' and the no offset string '0'.
     * If the parse starts with 'UT', 'UTC' or 'GMT', and the parser cannot
     * match a following offset ID, then {@link ZoneOffset#UTC} is selected.
     * In all other cases, the list of known region-based zones is used to
     * find the longest available match. If no match is found, and the parse
     * starts with 'Z', then {@code ZoneOffset.UTC} is selected.
     * The parser uses the {@linkplain #parseCaseInsensitive() case sensitive} setting.
     * <p>
     * For example, the following will parse:
     * <pre>
     *   "Europe/London"           -- ZoneId.of("Europe/London")
     *   "Z"                       -- ZoneOffset.UTC
     *   "UT"                      -- ZoneId.of("UT")
     *   "UTC"                     -- ZoneId.of("UTC")
     *   "GMT"                     -- ZoneId.of("GMT")
     *   "+01:30"                  -- ZoneOffset.of("+01:30")
     *   "UT+01:30"                -- ZoneOffset.of("UT+01:30")
     *   "UTC+01:30"               -- ZoneOffset.of("UTC+01:30")
     *   "GMT+01:30"               -- ZoneOffset.of("GMT+01:30")
     * </pre>
     * <p>
     * Note that this method is identical to {@code appendZoneId()} except
     * in the mechanism used to obtain the zone.
     *
     * @return this, for chaining, not null
     * @see #appendZoneId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendZoneRegionId() {

    /**
     * Appends the time-zone region ID, such as 'Europe/Paris', to the formatter,
     * rejecting the zone ID if it is a {@code ZoneOffset}.
     * <p>
     * This appends an instruction to format/parse the zone ID to the builder
     * only if it is a region-based ID.
     * <p>
     * During formatting, the zone is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#zoneId()}.
     * If the zone is a {@code ZoneOffset} or it cannot be obtained then
     * an exception is thrown unless the section of the formatter is optional.
     * If the zone is not an offset, then the zone will be printed using
     * the zone ID from {@link ZoneId#getId()}.
     * <p>
     * During parsing, the text must match a known zone or offset.
     * There are two types of zone ID, offset-based, such as '+01:30' and
     * region-based, such as 'Europe/London'. These are parsed differently.
     * If the parse starts with '+', '-', 'UT', 'UTC' or 'GMT', then the parser
     * expects an offset-based zone and will not match region-based zones.
     * The offset ID, such as '+02:30', may be at the start of the parse,
     * or prefixed by  'UT', 'UTC' or 'GMT'. The offset ID parsing is
     * equivalent to using {@link #appendOffset(String, String)} using the
     * arguments 'HH:MM:ss' and the no offset string '0'.
     * If the parse starts with 'UT', 'UTC' or 'GMT', and the parser cannot
     * match a following offset ID, then {@link ZoneOffset#UTC} is selected.
     * In all other cases, the list of known region-based zones is used to
     * find the longest available match. If no match is found, and the parse
     * starts with 'Z', then {@code ZoneOffset.UTC} is selected.
     * The parser uses the {@linkplain #parseCaseInsensitive() case sensitive} setting.
     * <p>
     * For example, the following will parse:
     * <pre>
     *   "Europe/London"           -- ZoneId.of("Europe/London")
     *   "Z"                       -- ZoneOffset.UTC
     *   "UT"                      -- ZoneId.of("UT")
     *   "UTC"                     -- ZoneId.of("UTC")
     *   "GMT"                     -- ZoneId.of("GMT")
     *   "+01:30"                  -- ZoneOffset.of("+01:30")
     *   "UT+01:30"                -- ZoneOffset.of("+01:30")
     *   "UTC+01:30"               -- ZoneOffset.of("+01:30")
     *   "GMT+01:30"               -- ZoneOffset.of("+01:30")
     * </pre>
     * <p>
     * Note that this method is identical to {@code appendZoneId()} except
     * in the mechanism used to obtain the zone.
     * Note also that parsing accepts offsets, whereas formatting will never
     * produce one.
     *
     * @return this, for chaining, not null
     * @see #appendZoneId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendZoneId() {

    /**
     * Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to the formatter.
     * <p>
     * This appends an instruction to format/parse the zone ID to the builder.
     * The zone ID is obtained in a strict manner suitable for {@code ZonedDateTime}.
     * By contrast, {@code OffsetDateTime} does not have a zone ID suitable
     * for use with this method, see {@link #appendZoneOrOffsetId()}.
     * <p>
     * During formatting, the zone is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#zoneId()}.
     * It will be printed using the result of {@link ZoneId#getId()}.
     * If the zone cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, the text must match a known zone or offset.
     * There are two types of zone ID, offset-based, such as '+01:30' and
     * region-based, such as 'Europe/London'. These are parsed differently.
     * If the parse starts with '+', '-', 'UT', 'UTC' or 'GMT', then the parser
     * expects an offset-based zone and will not match region-based zones.
     * The offset ID, such as '+02:30', may be at the start of the parse,
     * or prefixed by  'UT', 'UTC' or 'GMT'. The offset ID parsing is
     * equivalent to using {@link #appendOffset(String, String)} using the
     * arguments 'HH:MM:ss' and the no offset string '0'.
     * If the parse starts with 'UT', 'UTC' or 'GMT', and the parser cannot
     * match a following offset ID, then {@link ZoneOffset#UTC} is selected.
     * In all other cases, the list of known region-based zones is used to
     * find the longest available match. If no match is found, and the parse
     * starts with 'Z', then {@code ZoneOffset.UTC} is selected.
     * The parser uses the {@linkplain #parseCaseInsensitive() case sensitive} setting.
     * <p>
     * For example, the following will parse:
     * <pre>
     *   "Europe/London"           -- ZoneId.of("Europe/London")
     *   "Z"                       -- ZoneOffset.UTC
     *   "UT"                      -- ZoneId.of("UT")
     *   "UTC"                     -- ZoneId.of("UTC")
     *   "GMT"                     -- ZoneId.of("GMT")
     *   "+01:30"                  -- ZoneOffset.of("+01:30")
     *   "UT+01:30"                -- ZoneOffset.of("+01:30")
     *   "UTC+01:30"               -- ZoneOffset.of("+01:30")
     *   "GMT+01:30"               -- ZoneOffset.of("+01:30")
     * </pre>
     *
     * @return this, for chaining, not null
     * @see #appendZoneRegionId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle style) {

    /**
     * Appends the localized zone offset, such as 'GMT+01:00', to the formatter.
     * <p>
     * This appends a localized zone offset to the builder, the format of the
     * localized offset is controlled by the specified {@link FormatStyle style}
     * to this method:
     * <ul>
     * <li>{@link TextStyle#FULL full} - formats with localized offset text, such
     * as 'GMT, 2-digit hour and minute field, optional second field if non-zero,
     * and colon.
     * <li>{@link TextStyle#SHORT short} - formats with localized offset text,
     * such as 'GMT, hour without leading zero, optional 2-digit minute and
     * second if non-zero, and colon.
     * </ul>
     * <p>
     * During formatting, the offset is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#offset()}.
     * If the offset cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, the offset is parsed using the format defined above.
     * If the offset cannot be parsed then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * @param style  the format style to use, not null
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if style is neither {@link TextStyle#FULL
     * full} nor {@link TextStyle#SHORT short}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendOffset(String pattern, String noOffsetText) {

    /**
     * Appends the zone offset, such as '+01:00', to the formatter.
     * <p>
     * This appends an instruction to format/parse the offset ID to the builder.
     * <p>
     * During formatting, the offset is obtained using a mechanism equivalent
     * to querying the temporal with {@link TemporalQueries#offset()}.
     * It will be printed using the format defined below.
     * If the offset cannot be obtained then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * During parsing, the offset is parsed using the format defined below.
     * If the offset cannot be parsed then an exception is thrown unless the
     * section of the formatter is optional.
     * <p>
     * The format of the offset is controlled by a pattern which must be one
     * of the following:
     * <ul>
     * <li>{@code +HH} - hour only, ignoring minute and second
     * <li>{@code +HHmm} - hour, with minute if non-zero, ignoring second, no colon
     * <li>{@code +HH:mm} - hour, with minute if non-zero, ignoring second, with colon
     * <li>{@code +HHMM} - hour and minute, ignoring second, no colon
     * <li>{@code +HH:MM} - hour and minute, ignoring second, with colon
     * <li>{@code +HHMMss} - hour and minute, with second if non-zero, no colon
     * <li>{@code +HH:MM:ss} - hour and minute, with second if non-zero, with colon
     * <li>{@code +HHMMSS} - hour, minute and second, no colon
     * <li>{@code +HH:MM:SS} - hour, minute and second, with colon
     * </ul>
     * The "no offset" text controls what text is printed when the total amount of
     * the offset fields to be output is zero.
     * Example values would be 'Z', '+00:00', 'UTC' or 'GMT'.
     * Three formats are accepted for parsing UTC - the "no offset" text, and the
     * plus and minus versions of zero defined by the pattern.
     *
     * @param pattern  the pattern to use, not null
     * @param noOffsetText  the text to use when the offset is zero, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendOffsetId() {

    /**
     * Appends the zone offset, such as '+01:00', to the formatter.
     * <p>
     * This appends an instruction to format/parse the offset ID to the builder.
     * This is equivalent to calling {@code appendOffset("+HH:MM:ss", "Z")}.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendInstant(int fractionalDigits) {

    /**
     * Appends an instant using ISO-8601 to the formatter with control over
     * the number of fractional digits.
     * <p>
     * Instants have a fixed output format, although this method provides some
     * control over the fractional digits. They are converted to a date-time
     * with a zone-offset of UTC and printed using the standard ISO-8601 format.
     * The localized decimal style is not used.
     * <p>
     * The {@code fractionalDigits} parameter allows the output of the fractional
     * second to be controlled. Specifying zero will cause no fractional digits
     * to be output. From 1 to 9 will output an increasing number of digits, using
     * zero right-padding if necessary. The special value -1 is used to output as
     * many digits as necessary to avoid any trailing zeroes.
     * <p>
     * When parsing in strict mode, the number of parsed digits must match the
     * fractional digits. When parsing in lenient mode, any number of fractional
     * digits from zero to nine are accepted.
     * <p>
     * The instant is obtained using {@link ChronoField#INSTANT_SECONDS INSTANT_SECONDS}
     * and optionally (@code NANO_OF_SECOND). The value of {@code INSTANT_SECONDS}
     * may be outside the maximum range of {@code LocalDateTime}.
     * <p>
     * The {@linkplain ResolverStyle resolver style} has no effect on instant parsing.
     * The end-of-day time of '24:00' is handled as midnight at the start of the following day.
     * The leap-second time of '23:59:60' is handled to some degree, see
     * {@link DateTimeFormatter#parsedLeapSecond()} for full details.
     * <p>
     * An alternative to this method is to format/parse the instant as a single
     * epoch-seconds value. That is achieved using {@code appendValue(INSTANT_SECONDS)}.
     *
     * @param fractionalDigits  the number of fractional second digits to format with,
     *  from 0 to 9, or -1 to use as many digits as necessary
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendInstant() {

    /**
     * Appends an instant using ISO-8601 to the formatter, formatting fractional
     * digits in groups of three.
     * <p>
     * Instants have a fixed output format.
     * They are converted to a date-time with a zone-offset of UTC and formatted
     * using the standard ISO-8601 format.
     * With this method, formatting nano-of-second outputs zero, three, six
     * or nine digits digits as necessary.
     * The localized decimal style is not used.
     * <p>
     * The instant is obtained using {@link ChronoField#INSTANT_SECONDS INSTANT_SECONDS}
     * and optionally (@code NANO_OF_SECOND). The value of {@code INSTANT_SECONDS}
     * may be outside the maximum range of {@code LocalDateTime}.
     * <p>
     * The {@linkplain ResolverStyle resolver style} has no effect on instant parsing.
     * The end-of-day time of '24:00' is handled as midnight at the start of the following day.
     * The leap-second time of '23:59:59' is handled to some degree, see
     * {@link DateTimeFormatter#parsedLeapSecond()} for full details.
     * <p>
     * An alternative to this method is to format/parse the instant as a single
     * epoch-seconds value. That is achieved using {@code appendValue(INSTANT_SECONDS)}.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendText(TemporalField field, Map<Long, String> textLookup) {

    /**
     * Appends the text of a date-time field to the formatter using the specified
     * map to supply the text.
     * <p>
     * The standard text outputting methods use the localized text in the JDK.
     * This method allows that text to be specified directly.
     * The supplied map is not validated by the builder to ensure that formatting or
     * parsing is possible, thus an invalid map may throw an error during later use.
     * <p>
     * Supplying the map of text provides considerable flexibility in formatting and parsing.
     * For example, a legacy application might require or supply the months of the
     * year as "JNY", "FBY", "MCH" etc. These do not match the standard set of text
     * for localized month names. Using this method, a map can be created which
     * defines the connection between each value and the text:
     * <pre>
     * Map&lt;Long, String&gt; map = new HashMap&lt;&gt;();
     * map.put(1L, "JNY");
     * map.put(2L, "FBY");
     * map.put(3L, "MCH");
     * ...
     * builder.appendText(MONTH_OF_YEAR, map);
     * </pre>
     * <p>
     * Other uses might be to output the value with a suffix, such as "1st", "2nd", "3rd",
     * or as Roman numerals "I", "II", "III", "IV".
     * <p>
     * During formatting, the value is obtained and checked that it is in the valid range.
     * If text is not available for the value then it is output as a number.
     * During parsing, the parser will match against the map of text and numeric values.
     *
     * @param field  the field to append, not null
     * @param textLookup  the map from the value to the text
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendText(TemporalField field, TextStyle textStyle) {

    /**
     * Appends the text of a date-time field to the formatter.
     * <p>
     * The text of the field will be output during a format.
     * The value must be within the valid range of the field.
     * If the value cannot be obtained then an exception will be thrown.
     * If the field has no textual representation, then the numeric value will be used.
     * <p>
     * The value will be printed as per the normal format of an integer value.
     * Only negative numbers will be signed. No padding will be added.
     *
     * @param field  the field to append, not null
     * @param textStyle  the text style to use, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendText(TemporalField field) {

    /**
     * Appends the text of a date-time field to the formatter using the full
     * text style.
     * <p>
     * The text of the field will be output during a format.
     * The value must be within the valid range of the field.
     * If the value cannot be obtained then an exception will be thrown.
     * If the field has no textual representation, then the numeric value will be used.
     * <p>
     * The value will be printed as per the normal format of an integer value.
     * Only negative numbers will be signed. No padding will be added.
     *
     * @param field  the field to append, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendFraction(
            TemporalField field, int minWidth, int maxWidth, boolean decimalPoint) {

    /**
     * Appends the fractional value of a date-time field to the formatter.
     * <p>
     * The fractional value of the field will be output including the
     * preceding decimal point. The preceding value is not output.
     * For example, the second-of-minute value of 15 would be output as {@code .25}.
     * <p>
     * The width of the printed fraction can be controlled. Setting the
     * minimum width to zero will cause no output to be generated.
     * The printed fraction will have the minimum width necessary between
     * the minimum and maximum widths - trailing zeroes are omitted.
     * No rounding occurs due to the maximum width - digits are simply dropped.
     * <p>
     * When parsing in strict mode, the number of parsed digits must be between
     * the minimum and maximum width. When parsing in lenient mode, the minimum
     * width is considered to be zero and the maximum is nine.
     * <p>
     * If the value cannot be obtained then an exception will be thrown.
     * If the value is negative an exception will be thrown.
     * If the field does not have a fixed set of valid values then an
     * exception will be thrown.
     * If the field value in the date-time to be printed is invalid it
     * cannot be printed and an exception will be thrown.
     *
     * @param field  the field to append, not null
     * @param minWidth  the minimum width of the field excluding the decimal point, from 0 to 9
     * @param maxWidth  the maximum width of the field excluding the decimal point, from 1 to 9
     * @param decimalPoint  whether to output the localized decimal point symbol
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the field has a variable set of valid values or
     *  either width is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private DateTimeFormatterBuilder appendValue(NumberPrinterParser pp) {

    /**
     * Appends a fixed or variable width printer-parser handling adjacent value mode.
     * If a PrinterParser is not active then the new PrinterParser becomes
     * the active PrinterParser.
     * Otherwise, the active PrinterParser is modified depending on the new PrinterParser.
     * If the new PrinterParser is fixed width and has sign style {@code NOT_NEGATIVE}
     * then its width is added to the active PP and
     * the new PrinterParser is forced to be fixed width.
     * If the new PrinterParser is variable width, the active PrinterParser is changed
     * to be fixed width and the new PrinterParser becomes the active PP.
     *
     * @param pp  the printer-parser, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendValueReduced(
            TemporalField field, int width, int maxWidth, ChronoLocalDate baseDate) {

    /**
     * Appends the reduced value of a date-time field to the formatter.
     * <p>
     * This is typically used for formatting and parsing a two digit year.
     * <p>
     * The base date is used to calculate the full value during parsing.
     * For example, if the base date is 1950-01-01 then parsed values for
     * a two digit year parse will be in the range 1950-01-01 to 2049-12-31.
     * Only the year would be extracted from the date, thus a base date of
     * 1950-08-25 would also parse to the range 1950-01-01 to 2049-12-31.
     * This behavior is necessary to support fields such as week-based-year
     * or other calendar systems where the parsed value does not align with
     * standard ISO years.
     * <p>
     * The exact behavior is as follows. Parse the full set of fields and
     * determine the effective chronology using the last chronology if
     * it appears more than once. Then convert the base date to the
     * effective chronology. Then extract the specified field from the
     * chronology-specific base date and use it to determine the
     * {@code baseValue} used below.
     * <p>
     * For formatting, the {@code width} and {@code maxWidth} are used to
     * determine the number of characters to format.
     * If they are equal then the format is fixed width.
     * If the value of the field is within the range of the {@code baseValue} using
     * {@code width} characters then the reduced value is formatted otherwise the value is
     * truncated to fit {@code maxWidth}.
     * The rightmost characters are output to match the width, left padding with zero.
     * <p>
     * For strict parsing, the number of characters allowed by {@code width} to {@code maxWidth} are parsed.
     * For lenient parsing, the number of characters must be at least 1 and less than 10.
     * If the number of digits parsed is equal to {@code width} and the value is positive,
     * the value of the field is computed to be the first number greater than
     * or equal to the {@code baseValue} with the same least significant characters,
     * otherwise the value parsed is the field value.
     * This allows a reduced value to be entered for values in range of the baseValue
     * and width and absolute values can be entered for values outside the range.
     * <p>
     * For example, a base value of {@code 1980} and a width of {@code 2} will have
     * valid values from {@code 1980} to {@code 2079}.
     * During parsing, the text {@code "12"} will result in the value {@code 2012} as that
     * is the value within the range where the last two characters are "12".
     * By contrast, parsing the text {@code "1915"} will result in the value {@code 1915}.
     *
     * @param field  the field to append, not null
     * @param width  the field width of the printed and parsed field, from 1 to 10
     * @param maxWidth  the maximum field width of the printed field, from 1 to 10
     * @param baseDate  the base date used to calculate the base value for the range
     *  of valid values in the parsed chronology, not null
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the width or base value is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendValueReduced(TemporalField field,
            int width, int maxWidth, int baseValue) {

    /**
     * Appends the reduced value of a date-time field to the formatter.
     * <p>
     * Since fields such as year vary by chronology, it is recommended to use the
     * {@link #appendValueReduced(TemporalField, int, int, ChronoLocalDate)} date}
     * variant of this method in most cases. This variant is suitable for
     * simple fields or working with only the ISO chronology.
     * <p>
     * For formatting, the {@code width} and {@code maxWidth} are used to
     * determine the number of characters to format.
     * If they are equal then the format is fixed width.
     * If the value of the field is within the range of the {@code baseValue} using
     * {@code width} characters then the reduced value is formatted otherwise the value is
     * truncated to fit {@code maxWidth}.
     * The rightmost characters are output to match the width, left padding with zero.
     * <p>
     * For strict parsing, the number of characters allowed by {@code width} to {@code maxWidth} are parsed.
     * For lenient parsing, the number of characters must be at least 1 and less than 10.
     * If the number of digits parsed is equal to {@code width} and the value is positive,
     * the value of the field is computed to be the first number greater than
     * or equal to the {@code baseValue} with the same least significant characters,
     * otherwise the value parsed is the field value.
     * This allows a reduced value to be entered for values in range of the baseValue
     * and width and absolute values can be entered for values outside the range.
     * <p>
     * For example, a base value of {@code 1980} and a width of {@code 2} will have
     * valid values from {@code 1980} to {@code 2079}.
     * During parsing, the text {@code "12"} will result in the value {@code 2012} as that
     * is the value within the range where the last two characters are "12".
     * By contrast, parsing the text {@code "1915"} will result in the value {@code 1915}.
     *
     * @param field  the field to append, not null
     * @param width  the field width of the printed and parsed field, from 1 to 10
     * @param maxWidth  the maximum field width of the printed field, from 1 to 10
     * @param baseValue  the base value of the range of valid values
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the width or base value is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendValue(
            TemporalField field, int minWidth, int maxWidth, SignStyle signStyle) {

    /**
     * Appends the value of a date-time field to the formatter providing full
     * control over formatting.
     * <p>
     * The value of the field will be output during a format.
     * If the value cannot be obtained then an exception will be thrown.
     * <p>
     * This method provides full control of the numeric formatting, including
     * zero-padding and the positive/negative sign.
     * <p>
     * The parser for a variable width value such as this normally behaves greedily,
     * accepting as many digits as possible.
     * This behavior can be affected by 'adjacent value parsing'.
     * See {@link #appendValue(java.time.temporal.TemporalField, int)} for full details.
     * <p>
     * In strict parsing mode, the minimum number of parsed digits is {@code minWidth}
     * and the maximum is {@code maxWidth}.
     * In lenient parsing mode, the minimum number of parsed digits is one
     * and the maximum is 19 (except as limited by adjacent value parsing).
     * <p>
     * If this method is invoked with equal minimum and maximum widths and a sign style of
     * {@code NOT_NEGATIVE} then it delegates to {@code appendValue(TemporalField,int)}.
     * In this scenario, the formatting and parsing behavior described there occur.
     *
     * @param field  the field to append, not null
     * @param minWidth  the minimum field width of the printed field, from 1 to 19
     * @param maxWidth  the maximum field width of the printed field, from 1 to 19
     * @param signStyle  the positive/negative output style, not null
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the widths are invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendValue(TemporalField field, int width) {

    /**
     * Appends the value of a date-time field to the formatter using a fixed
     * width, zero-padded approach.
     * <p>
     * The value of the field will be output during a format.
     * If the value cannot be obtained then an exception will be thrown.
     * <p>
     * The value will be zero-padded on the left. If the size of the value
     * means that it cannot be printed within the width then an exception is thrown.
     * If the value of the field is negative then an exception is thrown during formatting.
     * <p>
     * This method supports a special technique of parsing known as 'adjacent value parsing'.
     * This technique solves the problem where a value, variable or fixed width, is followed by one or more
     * fixed length values. The standard parser is greedy, and thus it would normally
     * steal the digits that are needed by the fixed width value parsers that follow the
     * variable width one.
     * <p>
     * No action is required to initiate 'adjacent value parsing'.
     * When a call to {@code appendValue} is made, the builder
     * enters adjacent value parsing setup mode. If the immediately subsequent method
     * call or calls on the same builder are for a fixed width value, then the parser will reserve
     * space so that the fixed width values can be parsed.
     * <p>
     * For example, consider {@code builder.appendValue(YEAR).appendValue(MONTH_OF_YEAR, 2);}
     * The year is a variable width parse of between 1 and 19 digits.
     * The month is a fixed width parse of 2 digits.
     * Because these were appended to the same builder immediately after one another,
     * the year parser will reserve two digits for the month to parse.
     * Thus, the text '201106' will correctly parse to a year of 2011 and a month of 6.
     * Without adjacent value parsing, the year would greedily parse all six digits and leave
     * nothing for the month.
     * <p>
     * Adjacent value parsing applies to each set of fixed width not-negative values in the parser
     * that immediately follow any kind of value, variable or fixed width.
     * Calling any other append method will end the setup of adjacent value parsing.
     * Thus, in the unlikely event that you need to avoid adjacent value parsing behavior,
     * simply add the {@code appendValue} to another {@code DateTimeFormatterBuilder}
     * and add that to this builder.
     * <p>
     * If adjacent parsing is active, then parsing must match exactly the specified
     * number of digits in both strict and lenient modes.
     * In addition, no positive or negative sign is permitted.
     *
     * @param field  the field to append, not null
     * @param width  the width of the printed field, from 1 to 19
     * @return this, for chaining, not null
     * @throws IllegalArgumentException if the width is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder appendValue(TemporalField field) {

    /**
     * Appends the value of a date-time field to the formatter using a normal
     * output style.
     * <p>
     * The value of the field will be output during a format.
     * If the value cannot be obtained then an exception will be thrown.
     * <p>
     * The value will be printed as per the normal format of an integer value.
     * Only negative numbers will be signed. No padding will be added.
     * <p>
     * The parser for a variable width value such as this normally behaves greedily,
     * requiring one digit, but accepting as many digits as possible.
     * This behavior can be affected by 'adjacent value parsing'.
     * See {@link #appendValue(java.time.temporal.TemporalField, int)} for full details.
     *
     * @param field  the field to append, not null
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder parseDefaulting(TemporalField field, long value) {

    /**
     * Appends a default value for a field to the formatter for use in parsing.
     * <p>
     * This appends an instruction to the builder to inject a default value
     * into the parsed result. This is especially useful in conjunction with
     * optional parts of the formatter.
     * <p>
     * For example, consider a formatter that parses the year, followed by
     * an optional month, with a further optional day-of-month. Using such a
     * formatter would require the calling code to check whether a full date,
     * year-month or just a year had been parsed. This method can be used to
     * default the month and day-of-month to a sensible value, such as the
     * first of the month, allowing the calling code to always get a date.
     * <p>
     * During formatting, this method has no effect.
     * <p>
     * During parsing, the current state of the parse is inspected.
     * If the specified field has no associated value, because it has not been
     * parsed successfully at that point, then the specified value is injected
     * into the parse result. Injection is immediate, thus the field-value pair
     * will be visible to any subsequent elements in the formatter.
     * As such, this method is normally called at the end of the builder.
     *
     * @param field  the field to default the value of, not null
     * @param value  the value to default the field to
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder parseLenient() {

    /**
     * Changes the parse style to be lenient for the remainder of the formatter.
     * Note that case sensitivity is set separately to this method.
     * <p>
     * Parsing can be strict or lenient - by default its strict.
     * This controls the degree of flexibility in matching the text and sign styles.
     * Applications calling this method should typically also call {@link #parseCaseInsensitive()}.
     * <p>
     * When used, this method changes the parsing to be lenient from this point onwards.
     * The change will remain in force until the end of the formatter that is eventually
     * constructed or until {@code parseStrict} is called.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder parseStrict() {

    /**
     * Changes the parse style to be strict for the remainder of the formatter.
     * <p>
     * Parsing can be strict or lenient - by default its strict.
     * This controls the degree of flexibility in matching the text and sign styles.
     * <p>
     * When used, this method changes the parsing to be strict from this point onwards.
     * As strict is the default, this is normally only needed after calling {@link #parseLenient()}.
     * The change will remain in force until the end of the formatter that is eventually
     * constructed or until {@code parseLenient} is called.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder parseCaseInsensitive() {

    /**
     * Changes the parse style to be case insensitive for the remainder of the formatter.
     * <p>
     * Parsing can be case sensitive or insensitive - by default it is case sensitive.
     * This method allows the case sensitivity setting of parsing to be changed.
     * <p>
     * Calling this method changes the state of the builder such that all
     * subsequent builder method calls will parse text in case insensitive mode.
     * See {@link #parseCaseSensitive()} for the opposite setting.
     * The parse case sensitive/insensitive methods may be called at any point
     * in the builder, thus the parser can swap between case parsing modes
     * multiple times during the parse.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder parseCaseSensitive() {

    /**
     * Changes the parse style to be case sensitive for the remainder of the formatter.
     * <p>
     * Parsing can be case sensitive or insensitive - by default it is case sensitive.
     * This method allows the case sensitivity setting of parsing to be changed.
     * <p>
     * Calling this method changes the state of the builder such that all
     * subsequent builder method calls will parse text in case sensitive mode.
     * See {@link #parseCaseInsensitive} for the opposite setting.
     * The parse case sensitive/insensitive methods may be called at any point
     * in the builder, thus the parser can swap between case parsing modes
     * multiple times during the parse.
     * <p>
     * Since the default is case sensitive, this method should only be used after
     * a previous call to {@code #parseCaseInsensitive}.
     *
     * @return this, for chaining, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private DateTimeFormatterBuilder(DateTimeFormatterBuilder parent, boolean optional) {

    /**
     * Constructs a new instance of the builder.
     *
     * @param parent  the parent builder, not null
     * @param optional  whether the formatter is optional, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public DateTimeFormatterBuilder() {

    /**
     * Constructs a new instance of the builder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private static int convertStyle(FormatStyle style) {

    /**
     * Converts the given FormatStyle to the java.text.DateFormat style.
     *
     * @param style  the FormatStyle style
     * @return the int style, or -1 if style is null, indicating un-required
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    public static String getLocalizedDateTimePattern(FormatStyle dateStyle, FormatStyle timeStyle,
            Chronology chrono, Locale locale) {

    /**
     * Gets the formatting pattern for date and time styles for a locale and chronology.
     * The locale and chronology are used to lookup the locale specific format
     * for the requested dateStyle and/or timeStyle.
     *
     * @param dateStyle  the FormatStyle for the date, null for time-only pattern
     * @param timeStyle  the FormatStyle for the time, null for date-only pattern
     * @param chrono  the Chronology, non-null
     * @param locale  the locale, non-null
     * @return the locale and Chronology specific formatting pattern
     * @throws IllegalArgumentException if both dateStyle and timeStyle are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private int valueParserIndex = -1;

    /**
     * The index of the last variable width value parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private int padNextWidth;

    /**
     * The width to pad the next field to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private final List<DateTimePrinterParser> printerParsers = new ArrayList<>();

    /**
     * The list of printers that will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private DateTimeFormatterBuilder active = this;

    /**
     * The currently active builder, used by the outermost builder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
    private static final TemporalQuery<ZoneId> QUERY_REGION_ONLY = (temporal) -> {

    /**
     * Query for a time-zone that is region-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeFormatterBuilder.java
public final class DateTimeFormatterBuilder {

/**
 * Builder to create date-time formatters.
 * <p>
 * This allows a {@code DateTimeFormatter} to be created.
 * All date-time formatters are created ultimately using this builder.
 * <p>
 * The basic elements of date-time can all be added:
 * <ul>
 * <li>Value - a numeric value</li>
 * <li>Fraction - a fractional value including the decimal place. Always use this when
 * outputting fractions to ensure that the fraction is parsed correctly</li>
 * <li>Text - the textual equivalent for the value</li>
 * <li>OffsetId/Offset - the {@linkplain ZoneOffset zone offset}</li>
 * <li>ZoneId - the {@linkplain ZoneId time-zone} id</li>
 * <li>ZoneText - the name of the time-zone</li>
 * <li>ChronologyId - the {@linkplain Chronology chronology} id</li>
 * <li>ChronologyText - the name of the chronology</li>
 * <li>Literal - a text literal</li>
 * <li>Nested and Optional - formats can be nested or made optional</li>
 * </ul>
 * In addition, any of the elements may be decorated by padding, either with spaces or any other character.
 * <p>
 * Finally, a shorthand pattern, mostly compatible with {@code java.text.SimpleDateFormat SimpleDateFormat}
 * can be used, see {@link #appendPattern(String)}.
 * In practice, this simply parses the pattern and calls other methods on the builder.
 *
 * @implSpec
 * This class is a mutable builder intended for use from a single thread.
 *
 * @since 1.8
 */
