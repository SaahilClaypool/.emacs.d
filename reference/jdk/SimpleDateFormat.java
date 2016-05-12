_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private void checkNegativeNumberExpression() {

    /**
     * Analyze the negative subpattern of DecimalFormat and set/update values
     * as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private void readObject(ObjectInputStream stream)

    /**
     * After reading an object from the input stream, the format
     * pattern in the object is verified.
     * <p>
     * @exception InvalidObjectException if the pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Compares the given object with this <code>SimpleDateFormat</code> for
     * equality.
     *
     * @return true if the given object is equal to this
     * <code>SimpleDateFormat</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Returns the hash code value for this <code>SimpleDateFormat</code> object.
     *
     * @return the hash code value for this <code>SimpleDateFormat</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Creates a copy of this <code>SimpleDateFormat</code>. This also
     * clones the format's date format symbols.
     *
     * @return a clone of this <code>SimpleDateFormat</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public void setDateFormatSymbols(DateFormatSymbols newFormatSymbols)

    /**
     * Sets the date and time format symbols of this date format.
     *
     * @param newFormatSymbols the new date and time format symbols
     * @exception NullPointerException if the given newFormatSymbols is null
     * @see #getDateFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public DateFormatSymbols getDateFormatSymbols()

    /**
     * Gets a copy of the date and time format symbols of this date format.
     *
     * @return the date and time format symbols of this date format
     * @see #setDateFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public void applyLocalizedPattern(String pattern) {

    /**
     * Applies the given localized pattern string to this date format.
     *
     * @param pattern a String to be mapped to the new date and time format
     *        pattern for this format
     * @exception NullPointerException if the given pattern is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public void applyPattern(String pattern)

    /**
     * Applies the given pattern string to this date format.
     *
     * @param pattern the new date and time pattern for this date format
     * @exception NullPointerException if the given pattern is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public String toLocalizedPattern() {

    /**
     * Returns a localized pattern string describing this date format.
     *
     * @return a localized pattern string describing this date format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public String toPattern() {

    /**
     * Returns a pattern string describing this date format.
     *
     * @return a pattern string describing this date format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private String translatePattern(String pattern, String from, String to) {

    /**
     * Translates a pattern, mapping each character in the from string to the
     * corresponding character in the to string.
     *
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private boolean useDateFormatSymbols() {

    /**
     * Returns true if the DateFormatSymbols has been set explicitly or locale
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int subParse(String text, int start, int patternCharIndex, int count,
                         boolean obeyCount, boolean[] ambiguousYear,
                         ParsePosition origPos,
                         boolean useFollowingMinusSignAsDelimiter, CalendarBuilder calb) {

    /**
     * Private member function that converts the parsed date strings into
     * timeFields. Returns -start (for ParsePosition) if failed.
     * @param text the time text to be parsed.
     * @param start where to start parsing.
     * @param patternCharIndex the index of the pattern character.
     * @param count the count of a pattern character.
     * @param obeyCount if true, then the next field directly abuts this one,
     * and we should use the count to know when to stop parsing.
     * @param ambiguousYear return parameter; upon return, if ambiguousYear[0]
     * is true, then a two-digit year was parsed and may need to be readjusted.
     * @param origPos origPos.errorIndex is used to return an error index
     * at which a parse error occurred, if matching failure occurs.
     * @return the new start position if matching succeeded; -1 indicating
     * matching failure, otherwise. In case matching failure occurred,
     * an error index is set to origPos.errorIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int subParseNumericZone(String text, int start, int sign, int count,
                                    boolean colon, CalendarBuilder calb) {

    /**
     * Parses numeric forms of time zone offset, such as "hh:mm", and
     * sets calb to the parsed value.
     *
     * @param text  the text to be parsed
     * @param start the character position to start parsing
     * @param sign  1: positive; -1: negative
     * @param count 0: 'Z' or "GMT+hh:mm" parsing; 1 - 3: the number of 'X's
     * @param colon true - colon required between hh and mm; false - no colon required
     * @param calb  a CalendarBuilder in which the parsed value is stored
     * @return updated parsed position, or its negative value to indicate a parsing error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int subParseZoneString(String text, int start, CalendarBuilder calb) {

    /**
     * find time zone 'text' matched zoneStrings and set to internal
     * calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int matchString(String text, int start, int field,
                            Map<String,Integer> data, CalendarBuilder calb) {

    /**
     * Performs the same thing as matchString(String, int, int,
     * String[]). This method takes a Map<String, Integer> instead of
     * String[].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int matchString(String text, int start, int field, String[] data, CalendarBuilder calb)

    /**
     * Private code-size reduction function used by subParse.
     * @param text the time text being parsed.
     * @param start where to start parsing.
     * @param field the date field being parsed.
     * @param data the string array to parsed.
     * @return the new start position if matching succeeded; a negative number
     * indicating matching failure, otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Parses text from a string to produce a <code>Date</code>.
     * <p>
     * The method attempts to parse text starting at the index given by
     * <code>pos</code>.
     * If parsing succeeds, then the index of <code>pos</code> is updated
     * to the index after the last character used (parsing does not necessarily
     * use all characters up to the end of the string), and the parsed
     * date is returned. The updated <code>pos</code> can be used to
     * indicate the starting point for the next call to this method.
     * If an error occurs, then the index of <code>pos</code> is not
     * changed, the error index of <code>pos</code> is set to the index of
     * the character where the error occurred, and null is returned.
     *
     * <p>This parsing operation uses the {@link DateFormat#calendar
     * calendar} to produce a {@code Date}. All of the {@code
     * calendar}'s date-time fields are {@linkplain Calendar#clear()
     * cleared} before parsing, and the {@code calendar}'s default
     * values of the date-time fields are used for any missing
     * date-time information. For example, the year value of the
     * parsed {@code Date} is 1970 with {@link GregorianCalendar} if
     * no year value is given from the parsing operation.  The {@code
     * TimeZone} value may be overwritten, depending on the given
     * pattern and the time zone value in {@code text}. Any {@code
     * TimeZone} value that has previously been set by a call to
     * {@link #setTimeZone(java.util.TimeZone) setTimeZone} may need
     * to be restored for further operations.
     *
     * @param text  A <code>String</code>, part of which should be parsed.
     * @param pos   A <code>ParsePosition</code> object with index and error
     *              index information as described above.
     * @return A <code>Date</code> parsed from the string. In case of
     *         error, returns null.
     * @exception NullPointerException if <code>text</code> or <code>pos</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private void zeroPaddingNumber(int value, int minDigits, int maxDigits, StringBuffer buffer)

    /**
     * Formats a number with the specified minimum and maximum number of digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private void subFormat(int patternCharIndex, int count,
                           FieldDelegate delegate, StringBuffer buffer,
                           boolean useDateFormatSymbols)

    /**
     * Private member function that does the real date/time formatting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Formats an Object producing an <code>AttributedCharacterIterator</code>.
     * You can use the returned <code>AttributedCharacterIterator</code>
     * to build the resulting String, as well as to determine information
     * about the resulting String.
     * <p>
     * Each attribute key of the AttributedCharacterIterator will be of type
     * <code>DateFormat.Field</code>, with the corresponding attribute value
     * being the same as the attribute key.
     *
     * @exception NullPointerException if obj is null.
     * @exception IllegalArgumentException if the Format cannot format the
     *            given object, or if the Format's pattern string is invalid.
     * @param obj The object to format
     * @return AttributedCharacterIterator describing the formatted value.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    @Override

    /**
     * Formats the given <code>Date</code> into a date/time string and appends
     * the result to the given <code>StringBuffer</code>.
     *
     * @param date the date-time value to be formatted into a date-time string.
     * @param toAppendTo where the new date-time text is to be appended.
     * @param pos the formatting position. On input: an alignment field,
     * if desired. On output: the offsets of the alignment field.
     * @return the formatted date-time string.
     * @exception NullPointerException if the given {@code date} is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public Date get2DigitYearStart() {

    /**
     * Returns the beginning date of the 100-year period 2-digit years are interpreted
     * as being within.
     *
     * @return the start of the 100-year period into which two digit years are
     * parsed
     * @see #set2DigitYearStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public void set2DigitYearStart(Date startDate) {

    /**
     * Sets the 100-year period 2-digit years will be interpreted as being in
     * to begin on the date the user specifies.
     *
     * @param startDate During parsing, two digit years will be placed in the range
     * <code>startDate</code> to <code>startDate + 100 years</code>.
     * @see #get2DigitYearStart
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private static void encode(int tag, int length, StringBuilder buffer) {

    /**
     * Encodes the given tag and length and puts encoded char(s) into buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private char[] compile(String pattern) {

    /**
     * Returns the compiled form of the given pattern. The syntax of
     * the compiled pattern is:
     * <blockquote>
     * CompiledPattern:
     *     EntryList
     * EntryList:
     *     Entry
     *     EntryList Entry
     * Entry:
     *     TagField
     *     TagField data
     * TagField:
     *     Tag Length
     *     TaggedData
     * Tag:
     *     pattern_char_index
     *     TAG_QUOTE_CHARS
     * Length:
     *     short_length
     *     long_length
     * TaggedData:
     *     TAG_QUOTE_ASCII_CHAR ascii_char
     *
     * </blockquote>
     *
     * where `short_length' is an 8-bit unsigned integer between 0 and
     * 254.  `long_length' is a sequence of an 8-bit integer 255 and a
     * 32-bit signed integer value which is split into upper and lower
     * 16-bit fields in two char's. `pattern_char_index' is an 8-bit
     * integer between 0 and 18. `ascii_char' is an 7-bit ASCII
     * character value. `data' depends on its Tag value.
     * <p>
     * If Length is short_length, Tag and short_length are packed in a
     * single char, as illustrated below.
     * <blockquote>
     *     char[0] = (Tag << 8) | short_length;
     * </blockquote>
     *
     * If Length is long_length, Tag and 255 are packed in the first
     * char and a 32-bit integer, as illustrated below.
     * <blockquote>
     *     char[0] = (Tag << 8) | 255;
     *     char[1] = (char) (long_length >>> 16);
     *     char[2] = (char) (long_length & 0xffff);
     * </blockquote>
     * <p>
     * If Tag is a pattern_char_index, its Length is the number of
     * pattern characters. For example, if the given pattern is
     * "yyyy", Tag is 1 and Length is 4, followed by no data.
     * <p>
     * If Tag is TAG_QUOTE_CHARS, its Length is the number of char's
     * following the TagField. For example, if the given pattern is
     * "'o''clock'", Length is 7 followed by a char sequence of
     * <code>o&nbs;'&nbs;c&nbs;l&nbs;o&nbs;c&nbs;k</code>.
     * <p>
     * TAG_QUOTE_ASCII_CHAR is a special tag and has an ASCII
     * character in place of Length. For example, if the given pattern
     * is "'o'", the TaggedData entry is
     * <code>((TAG_QUOTE_ASCII_CHAR&nbs;<<&nbs;8)&nbs;|&nbs;'o')</code>.
     *
     * @exception NullPointerException if the given pattern is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)

    /**
     * Constructs a <code>SimpleDateFormat</code> using the given pattern and
     * date format symbols.
     *
     * @param pattern the pattern describing the date and time format
     * @param formatSymbols the date format symbols to be used for formatting
     * @exception NullPointerException if the given pattern or formatSymbols is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public SimpleDateFormat(String pattern, Locale locale)

    /**
     * Constructs a <code>SimpleDateFormat</code> using the given pattern and
     * the default date format symbols for the given locale.
     * <b>Note:</b> This constructor may not support all locales.
     * For full coverage, use the factory methods in the {@link DateFormat}
     * class.
     *
     * @param pattern the pattern describing the date and time format
     * @param locale the locale whose date format symbols should be used
     * @exception NullPointerException if the given pattern or locale is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public SimpleDateFormat(String pattern)

    /**
     * Constructs a <code>SimpleDateFormat</code> using the given pattern and
     * the default date format symbols for the default
     * {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * <b>Note:</b> This constructor may not support all locales.
     * For full coverage, use the factory methods in the {@link DateFormat}
     * class.
     * <p>This is equivalent to calling
     * {@link #SimpleDateFormat(String, Locale)
     *     SimpleDateFormat(pattern, Locale.getDefault(Locale.Category.FORMAT))}.
     *
     * @see java.util.Locale#getDefault(java.util.Locale.Category)
     * @see java.util.Locale.Category#FORMAT
     * @param pattern the pattern describing the date and time format
     * @exception NullPointerException if the given pattern is null
     * @exception IllegalArgumentException if the given pattern is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    public SimpleDateFormat() {

    /**
     * Constructs a <code>SimpleDateFormat</code> using the default pattern and
     * date format symbols for the default
     * {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * <b>Note:</b> This constructor may not support all locales.
     * For full coverage, use the factory methods in the {@link DateFormat}
     * class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient boolean useDateFormatSymbols;

    /**
     * Indicates whether this <code>SimpleDateFormat</code> should use
     * the DateFormatSymbols. If true, the format and parse methods
     * use the DateFormatSymbols values. If false, the format and
     * parse methods call Calendar.getDisplayName or
     * Calendar.getDisplayNames.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private Locale locale;

    /**
     * The Locale used to instantiate this
     * <code>SimpleDateFormat</code>. The value may be null if this object
     * has been created by an older <code>SimpleDateFormat</code> and
     * deserialized.
     *
     * @serial
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private static final ConcurrentMap<Locale, NumberFormat> cachedNumberFormatData

    /**
     * Cache NumberFormat instances with Locale key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private Date defaultCenturyStart;

    /**
     * We map dates with two-digit years into the century starting at
     * <code>defaultCenturyStart</code>, which may be any date.  May
     * not be null.
     * @serial
     * @since JDK1.1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private DateFormatSymbols formatData;

    /**
     * The symbols used by this formatter for week names, month names,
     * etc.  May not be null.
     * @serial
     * @see java.text.DateFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private char zeroDigit;

    /**
     * Locale dependent digit zero.
     * @see #zeroPaddingNumber
     * @see java.text.DecimalFormatSymbols#getZeroDigit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private final static int TAG_QUOTE_ASCII_CHAR       = 100;

    /**
     * Tags for the compiled pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private char[] compiledPattern;

    /**
     * The compiled pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private boolean forceStandaloneForm = false;

    /**
     * True if standalone form needs to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private boolean hasFollowingMinusSign = false;

    /**
     * True when a negative sign follows a number.
     * (True as default in Arabic.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private char minusSign = '-';

    /**
     * The minus sign to be used with format and parse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    transient private NumberFormat originalNumberFormat;

    /**
     * Saved numberFormat and pattern.
     * @see SimpleDateFormat#checkNegativeNumberExpression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private String pattern;

    /**
     * The pattern string of this formatter.  This is always a non-localized
     * pattern.  May not be null.  See class documentation for details.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * The version of the serialized data on the stream.  Possible values:
     * <ul>
     * <li><b>0</b> or not present on stream: JDK 1.1.3.  This version
     * has no <code>defaultCenturyStart</code> on stream.
     * <li><b>1</b> JDK 1.1.4 or later.  This version adds
     * <code>defaultCenturyStart</code>.
     * </ul>
     * When streaming out this class, the most recent format
     * and the highest allowable <code>serialVersionOnStream</code>
     * is written.
     * @serial
     * @since JDK1.1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/SimpleDateFormat.java
public class SimpleDateFormat extends DateFormat {

/**
 * <code>SimpleDateFormat</code> is a concrete class for formatting and
 * parsing dates in a locale-sensitive manner. It allows for formatting
 * (date &rarr; text), parsing (text &rarr; date), and normalization.
 *
 * <p>
 * <code>SimpleDateFormat</code> allows you to start by choosing
 * any user-defined patterns for date-time formatting. However, you
 * are encouraged to create a date-time formatter with either
 * <code>getTimeInstance</code>, <code>getDateInstance</code>, or
 * <code>getDateTimeInstance</code> in <code>DateFormat</code>. Each
 * of these class methods can return a date/time formatter initialized
 * with a default format pattern. You may modify the format pattern
 * using the <code>applyPattern</code> methods as desired.
 * For more information on using these methods, see
 * {@link DateFormat}.
 *
 * <h3>Date and Time Patterns</h3>
 * <p>
 * Date and time formats are specified by <em>date and time pattern</em>
 * strings.
 * Within date and time pattern strings, unquoted letters from
 * <code>'A'</code> to <code>'Z'</code> and from <code>'a'</code> to
 * <code>'z'</code> are interpreted as pattern letters representing the
 * components of a date or time string.
 * Text can be quoted using single quotes (<code>'</code>) to avoid
 * interpretation.
 * <code>"''"</code> represents a single quote.
 * All other characters are not interpreted; they're simply copied into the
 * output string during formatting or matched against the input string
 * during parsing.
 * <p>
 * The following pattern letters are defined (all other characters from
 * <code>'A'</code> to <code>'Z'</code> and from <code>'a'</code> to
 * <code>'z'</code> are reserved):
 * <blockquote>
 * <table border=0 cellspacing=3 cellpadding=0 summary="Chart shows pattern letters, date/time component, presentation, and examples.">
 *     <tr style="background-color: rgb(204, 204, 255);">
 *         <th align=left>Letter
 *         <th align=left>Date or Time Component
 *         <th align=left>Presentation
 *         <th align=left>Examples
 *     <tr>
 *         <td><code>G</code>
 *         <td>Era designator
 *         <td><a href="#text">Text</a>
 *         <td><code>AD</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>y</code>
 *         <td>Year
 *         <td><a href="#year">Year</a>
 *         <td><code>1996</code>; <code>96</code>
 *     <tr>
 *         <td><code>Y</code>
 *         <td>Week year
 *         <td><a href="#year">Year</a>
 *         <td><code>2009</code>; <code>09</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>M</code>
 *         <td>Month in year (context sensitive)
 *         <td><a href="#month">Month</a>
 *         <td><code>July</code>; <code>Jul</code>; <code>07</code>
 *     <tr>
 *         <td><code>L</code>
 *         <td>Month in year (standalone form)
 *         <td><a href="#month">Month</a>
 *         <td><code>July</code>; <code>Jul</code>; <code>07</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>w</code>
 *         <td>Week in year
 *         <td><a href="#number">Number</a>
 *         <td><code>27</code>
 *     <tr>
 *         <td><code>W</code>
 *         <td>Week in month
 *         <td><a href="#number">Number</a>
 *         <td><code>2</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>D</code>
 *         <td>Day in year
 *         <td><a href="#number">Number</a>
 *         <td><code>189</code>
 *     <tr>
 *         <td><code>d</code>
 *         <td>Day in month
 *         <td><a href="#number">Number</a>
 *         <td><code>10</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>F</code>
 *         <td>Day of week in month
 *         <td><a href="#number">Number</a>
 *         <td><code>2</code>
 *     <tr>
 *         <td><code>E</code>
 *         <td>Day name in week
 *         <td><a href="#text">Text</a>
 *         <td><code>Tuesday</code>; <code>Tue</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>u</code>
 *         <td>Day number of week (1 = Monday, ..., 7 = Sunday)
 *         <td><a href="#number">Number</a>
 *         <td><code>1</code>
 *     <tr>
 *         <td><code>a</code>
 *         <td>Am/pm marker
 *         <td><a href="#text">Text</a>
 *         <td><code>PM</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>H</code>
 *         <td>Hour in day (0-23)
 *         <td><a href="#number">Number</a>
 *         <td><code>0</code>
 *     <tr>
 *         <td><code>k</code>
 *         <td>Hour in day (1-24)
 *         <td><a href="#number">Number</a>
 *         <td><code>24</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>K</code>
 *         <td>Hour in am/pm (0-11)
 *         <td><a href="#number">Number</a>
 *         <td><code>0</code>
 *     <tr>
 *         <td><code>h</code>
 *         <td>Hour in am/pm (1-12)
 *         <td><a href="#number">Number</a>
 *         <td><code>12</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>m</code>
 *         <td>Minute in hour
 *         <td><a href="#number">Number</a>
 *         <td><code>30</code>
 *     <tr>
 *         <td><code>s</code>
 *         <td>Second in minute
 *         <td><a href="#number">Number</a>
 *         <td><code>55</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>S</code>
 *         <td>Millisecond
 *         <td><a href="#number">Number</a>
 *         <td><code>978</code>
 *     <tr>
 *         <td><code>z</code>
 *         <td>Time zone
 *         <td><a href="#timezone">General time zone</a>
 *         <td><code>Pacific Standard Time</code>; <code>PST</code>; <code>GMT-08:00</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>Z</code>
 *         <td>Time zone
 *         <td><a href="#rfc822timezone">RFC 822 time zone</a>
 *         <td><code>-0800</code>
 *     <tr>
 *         <td><code>X</code>
 *         <td>Time zone
 *         <td><a href="#iso8601timezone">ISO 8601 time zone</a>
 *         <td><code>-08</code>; <code>-0800</code>;  <code>-08:00</code>
 * </table>
 * </blockquote>
 * Pattern letters are usually repeated, as their number determines the
 * exact presentation:
 * <ul>
 * <li><strong><a name="text">Text:</a></strong>
 *     For formatting, if the number of pattern letters is 4 or more,
 *     the full form is used; otherwise a short or abbreviated form
 *     is used if available.
 *     For parsing, both forms are accepted, independent of the number
 *     of pattern letters.<br><br></li>
 * <li><strong><a name="number">Number:</a></strong>
 *     For formatting, the number of pattern letters is the minimum
 *     number of digits, and shorter numbers are zero-padded to this amount.
 *     For parsing, the number of pattern letters is ignored unless
 *     it's needed to separate two adjacent fields.<br><br></li>
 * <li><strong><a name="year">Year:</a></strong>
 *     If the formatter's {@link #getCalendar() Calendar} is the Gregorian
 *     calendar, the following rules are applied.<br>
 *     <ul>
 *     <li>For formatting, if the number of pattern letters is 2, the year
 *         is truncated to 2 digits; otherwise it is interpreted as a
 *         <a href="#number">number</a>.
 *     <li>For parsing, if the number of pattern letters is more than 2,
 *         the year is interpreted literally, regardless of the number of
 *         digits. So using the pattern "MM/dd/yyyy", "01/11/12" parses to
 *         Jan 11, 12 A.D.
 *     <li>For parsing with the abbreviated year pattern ("y" or "yy"),
 *         <code>SimpleDateFormat</code> must interpret the abbreviated year
 *         relative to some century.  It does this by adjusting dates to be
 *         within 80 years before and 20 years after the time the <code>SimpleDateFormat</code>
 *         instance is created. For example, using a pattern of "MM/dd/yy" and a
 *         <code>SimpleDateFormat</code> instance created on Jan 1, 1997,  the string
 *         "01/11/12" would be interpreted as Jan 11, 2012 while the string "05/04/64"
 *         would be interpreted as May 4, 1964.
 *         During parsing, only strings consisting of exactly two digits, as defined by
 *         {@link Character#isDigit(char)}, will be parsed into the default century.
 *         Any other numeric string, such as a one digit string, a three or more digit
 *         string, or a two digit string that isn't all digits (for example, "-1"), is
 *         interpreted literally.  So "01/02/3" or "01/02/003" are parsed, using the
 *         same pattern, as Jan 2, 3 AD.  Likewise, "01/02/-3" is parsed as Jan 2, 4 BC.
 *     </ul>
 *     Otherwise, calendar system specific forms are applied.
 *     For both formatting and parsing, if the number of pattern
 *     letters is 4 or more, a calendar specific {@linkplain
 *     Calendar#LONG long form} is used. Otherwise, a calendar
 *     specific {@linkplain Calendar#SHORT short or abbreviated form}
 *     is used.<br>
 *     <br>
 *     If week year {@code 'Y'} is specified and the {@linkplain
 *     #getCalendar() calendar} doesn't support any <a
 *     href="../util/GregorianCalendar.html#week_year"> week
 *     years</a>, the calendar year ({@code 'y'}) is used instead. The
 *     support of week years can be tested with a call to {@link
 *     DateFormat#getCalendar() getCalendar()}.{@link
 *     java.util.Calendar#isWeekDateSupported()
 *     isWeekDateSupported()}.<br><br></li>
 * <li><strong><a name="month">Month:</a></strong>
 *     If the number of pattern letters is 3 or more, the month is
 *     interpreted as <a href="#text">text</a>; otherwise,
 *     it is interpreted as a <a href="#number">number</a>.<br>
 *     <ul>
 *     <li>Letter <em>M</em> produces context-sensitive month names, such as the
 *         embedded form of names. If a {@code DateFormatSymbols} has been set
 *         explicitly with constructor {@link #SimpleDateFormat(String,
 *         DateFormatSymbols)} or method {@link
 *         #setDateFormatSymbols(DateFormatSymbols)}, the month names given by
 *         the {@code DateFormatSymbols} are used.</li>
 *     <li>Letter <em>L</em> produces the standalone form of month names.</li>
 *     </ul>
 *     <br></li>
 * <li><strong><a name="timezone">General time zone:</a></strong>
 *     Time zones are interpreted as <a href="#text">text</a> if they have
 *     names. For time zones representing a GMT offset value, the
 *     following syntax is used:
 *     <pre>
 *     <a name="GMTOffsetTimeZone"><i>GMTOffsetTimeZone:</i></a>
 *             <code>GMT</code> <i>Sign</i> <i>Hours</i> <code>:</code> <i>Minutes</i>
 *     <i>Sign:</i> one of
 *             <code>+ -</code>
 *     <i>Hours:</i>
 *             <i>Digit</i>
 *             <i>Digit</i> <i>Digit</i>
 *     <i>Minutes:</i>
 *             <i>Digit</i> <i>Digit</i>
 *     <i>Digit:</i> one of
 *             <code>0 1 2 3 4 5 6 7 8 9</code></pre>
 *     <i>Hours</i> must be between 0 and 23, and <i>Minutes</i> must be between
 *     00 and 59. The format is locale independent and digits must be taken
 *     from the Basic Latin block of the Unicode standard.
 *     <p>For parsing, <a href="#rfc822timezone">RFC 822 time zones</a> are also
 *     accepted.<br><br></li>
 * <li><strong><a name="rfc822timezone">RFC 822 time zone:</a></strong>
 *     For formatting, the RFC 822 4-digit time zone format is used:
 *
 *     <pre>
 *     <i>RFC822TimeZone:</i>
 *             <i>Sign</i> <i>TwoDigitHours</i> <i>Minutes</i>
 *     <i>TwoDigitHours:</i>
 *             <i>Digit Digit</i></pre>
 *     <i>TwoDigitHours</i> must be between 00 and 23. Other definitions
 *     are as for <a href="#timezone">general time zones</a>.
 *
 *     <p>For parsing, <a href="#timezone">general time zones</a> are also
 *     accepted.
 * <li><strong><a name="iso8601timezone">ISO 8601 Time zone:</a></strong>
 *     The number of pattern letters designates the format for both formatting
 *     and parsing as follows:
 *     <pre>
 *     <i>ISO8601TimeZone:</i>
 *             <i>OneLetterISO8601TimeZone</i>
 *             <i>TwoLetterISO8601TimeZone</i>
 *             <i>ThreeLetterISO8601TimeZone</i>
 *     <i>OneLetterISO8601TimeZone:</i>
 *             <i>Sign</i> <i>TwoDigitHours</i>
 *             {@code Z}
 *     <i>TwoLetterISO8601TimeZone:</i>
 *             <i>Sign</i> <i>TwoDigitHours</i> <i>Minutes</i>
 *             {@code Z}
 *     <i>ThreeLetterISO8601TimeZone:</i>
 *             <i>Sign</i> <i>TwoDigitHours</i> {@code :} <i>Minutes</i>
 *             {@code Z}</pre>
 *     Other definitions are as for <a href="#timezone">general time zones</a> or
 *     <a href="#rfc822timezone">RFC 822 time zones</a>.
 *
 *     <p>For formatting, if the offset value from GMT is 0, {@code "Z"} is
 *     produced. If the number of pattern letters is 1, any fraction of an hour
 *     is ignored. For example, if the pattern is {@code "X"} and the time zone is
 *     {@code "GMT+05:30"}, {@code "+05"} is produced.
 *
 *     <p>For parsing, {@code "Z"} is parsed as the UTC time zone designator.
 *     <a href="#timezone">General time zones</a> are <em>not</em> accepted.
 *
 *     <p>If the number of pattern letters is 4 or more, {@link
 *     IllegalArgumentException} is thrown when constructing a {@code
 *     SimpleDateFormat} or {@linkplain #applyPattern(String) applying a
 *     pattern}.
 * </ul>
 * <code>SimpleDateFormat</code> also supports <em>localized date and time
 * pattern</em> strings. In these strings, the pattern letters described above
 * may be replaced with other, locale dependent, pattern letters.
 * <code>SimpleDateFormat</code> does not deal with the localization of text
 * other than the pattern letters; that's up to the client of the class.
 *
 * <h4>Examples</h4>
 *
 * The following examples show how date and time patterns are interpreted in
 * the U.S. locale. The given date and time are 2001-07-04 12:08:56 local time
 * in the U.S. Pacific Time time zone.
 * <blockquote>
 * <table border=0 cellspacing=3 cellpadding=0 summary="Examples of date and time patterns interpreted in the U.S. locale">
 *     <tr style="background-color: rgb(204, 204, 255);">
 *         <th align=left>Date and Time Pattern
 *         <th align=left>Result
 *     <tr>
 *         <td><code>"yyyy.MM.dd G 'at' HH:mm:ss z"</code>
 *         <td><code>2001.07.04 AD at 12:08:56 PDT</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>"EEE, MMM d, ''yy"</code>
 *         <td><code>Wed, Jul 4, '01</code>
 *     <tr>
 *         <td><code>"h:mm a"</code>
 *         <td><code>12:08 PM</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>"hh 'o''clock' a, zzzz"</code>
 *         <td><code>12 o'clock PM, Pacific Daylight Time</code>
 *     <tr>
 *         <td><code>"K:mm a, z"</code>
 *         <td><code>0:08 PM, PDT</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>"yyyyy.MMMMM.dd GGG hh:mm aaa"</code>
 *         <td><code>02001.July.04 AD 12:08 PM</code>
 *     <tr>
 *         <td><code>"EEE, d MMM yyyy HH:mm:ss Z"</code>
 *         <td><code>Wed, 4 Jul 2001 12:08:56 -0700</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>"yyMMddHHmmssZ"</code>
 *         <td><code>010704120856-0700</code>
 *     <tr>
 *         <td><code>"yyyy-MM-dd'T'HH:mm:ss.SSSZ"</code>
 *         <td><code>2001-07-04T12:08:56.235-0700</code>
 *     <tr style="background-color: rgb(238, 238, 255);">
 *         <td><code>"yyyy-MM-dd'T'HH:mm:ss.SSSXXX"</code>
 *         <td><code>2001-07-04T12:08:56.235-07:00</code>
 *     <tr>
 *         <td><code>"YYYY-'W'ww-u"</code>
 *         <td><code>2001-W27-3</code>
 * </table>
 * </blockquote>
 *
 * <h4><a name="synchronization">Synchronization</a></h4>
 *
 * <p>
 * Date formats are not synchronized.
 * It is recommended to create separate format instances for each thread.
 * If multiple threads access a format concurrently, it must be synchronized
 * externally.
 *
 * @see          <a href="https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html">Java Tutorial</a>
 * @see          java.util.Calendar
 * @see          java.util.TimeZone
 * @see          DateFormat
 * @see          DateFormatSymbols
 * @author       Mark Davis, Chen-Lieh Huang, Alan Liu
 */
