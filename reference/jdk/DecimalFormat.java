_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private static final char       CURRENCY_SIGN = '\u00A4';

    /**
     * The CURRENCY_SIGN is the standard Unicode symbol for currency.  It
     * is used in patterns and substituted with either the currency symbol,
     * or if it is doubled, with the international currency symbol.  If the
     * CURRENCY_SIGN is seen in a pattern, then the decimal separator is
     * replaced with the monetary decimal separator.
     *
     * The CURRENCY_SIGN is not localized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private static class DigitArrays {

    /**
     * The digit arrays used in the fast-path methods for collecting digits.
     * Using 3 constants arrays of chars ensures a very fast collection of digits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private static final double MAX_INT_AS_DOUBLE = (double) Integer.MAX_VALUE;

    /** Maximum valid integer value for applying fast-path algorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * The internal serial version which says which version was written.
     * Possible values are:
     * <ul>
     * <li><b>0</b> (default): versions before the Java 2 platform v1.2
     * <li><b>1</b>: version for 1.2, which includes the two new fields
     *      <code>useExponentialNotation</code> and
     *      <code>minExponentDigits</code>.
     * <li><b>2</b>: version for 1.3 and later, which adds four new fields:
     *      <code>posPrefixPattern</code>, <code>posSuffixPattern</code>,
     *      <code>negPrefixPattern</code>, and <code>negSuffixPattern</code>.
     * <li><b>3</b>: version for 1.5 and later, which adds five new fields:
     *      <code>maximumIntegerDigits</code>,
     *      <code>minimumIntegerDigits</code>,
     *      <code>maximumFractionDigits</code>,
     *      <code>minimumFractionDigits</code>, and
     *      <code>parseBigDecimal</code>.
     * <li><b>4</b>: version for 1.6 and later, which adds one new field:
     *      <code>roundingMode</code>.
     * </ul>
     * @since 1.2
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient FastPathData fastPathData;

    /** DecimalFormat reference to its FastPathData */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient boolean fastPathCheckNeeded = true;

    /** Flag stating need of check and reinit fast-path status on next format call. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient boolean isFastPath = false;

    /** The format fast-path status of the instance. Logical state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        char[] charsPositivePrefix;

        /** Suffixes recorded as char array for efficiency. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        char[] fastPathContainer;

        /** The char array buffer that will contain the formatted result */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        double fractionalScaleFactor;

        /** Fractional constants depending on decimal|currency state */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        int fractionalFirstIndex;

        /**  Fixed index position of first fractional digit of formatted result */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        int integralLastIndex;

        /**  Fixed index position of last integral digit of formatted result */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        char groupingChar;

        /** Locale char for grouping separator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        int  zeroDelta;

        /** Difference between locale zero and default zero representation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        int firstUsedIndex;

        /** The first used index at the beginning of the formatted result */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
        int lastFreeIndex;

        /** The first unused index at the end of the formatted result. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private static class FastPathData {

    /**
     * Helper inner utility class for storing the data used in the fast-path
     * algorithm. Almost all fields related to fast-path are encapsulated in
     * this class.
     *
     * Any {@code DecimalFormat} instance has a {@code fastPathData}
     * reference field that is null unless both the properties of the instance
     * are such that the instance is in the "fast-path" state, and a format call
     * has been done at least once while in this state.
     *
     * Almost all fields are related to the "fast-path" state only and don't
     * change until one of the instance properties is changed.
     *
     * {@code firstUsedIndex} and {@code lastFreeIndex} are the only
     * two fields that are used and modified while inside a call to
     * {@code fastDoubleFormat}.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private RoundingMode roundingMode = RoundingMode.HALF_EVEN;

    /**
     * The {@link java.math.RoundingMode} used in this DecimalFormat.
     *
     * @serial
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int    minimumFractionDigits = super.getMinimumFractionDigits();

    /**
     * The minimum number of digits allowed in the fractional portion of a
     * <code>BigInteger</code> or <code>BigDecimal</code> number.
     * <code>minimumFractionDigits</code> must be less than or equal to
     * <code>maximumFractionDigits</code>.
     *
     * @serial
     * @see #getMinimumFractionDigits
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int    maximumFractionDigits = super.getMaximumFractionDigits();

    /**
     * The maximum number of digits allowed in the fractional portion of a
     * <code>BigInteger</code> or <code>BigDecimal</code> number.
     * <code>maximumFractionDigits</code> must be greater than or equal to
     * <code>minimumFractionDigits</code>.
     *
     * @serial
     * @see #getMaximumFractionDigits
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int    minimumIntegerDigits = super.getMinimumIntegerDigits();

    /**
     * The minimum number of digits allowed in the integer portion of a
     * <code>BigInteger</code> or <code>BigDecimal</code> number.
     * <code>minimumIntegerDigits</code> must be less than or equal to
     * <code>maximumIntegerDigits</code>.
     *
     * @serial
     * @see #getMinimumIntegerDigits
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int    maximumIntegerDigits = super.getMaximumIntegerDigits();

    /**
     * The maximum number of digits allowed in the integer portion of a
     * <code>BigInteger</code> or <code>BigDecimal</code> number.
     * <code>maximumIntegerDigits</code> must be greater than or equal to
     * <code>minimumIntegerDigits</code>.
     *
     * @serial
     * @see #getMaximumIntegerDigits
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private byte    minExponentDigits;       // Newly persistent in the Java 2 platform v.1.2

    /**
     * The minimum number of digits used to display the exponent when a number is
     * formatted in exponential notation.  This field is ignored if
     * <code>useExponentialNotation</code> is not true.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient FieldPosition[] negativeSuffixFieldPositions;

    /**
     * FieldPositions describing the negative suffix String. This is
     * lazily created. Use <code>getNegativeSuffixFieldPositions</code>
     * when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient FieldPosition[] negativePrefixFieldPositions;

    /**
     * FieldPositions describing the negative prefix String. This is
     * lazily created. Use <code>getNegativePrefixFieldPositions</code>
     * when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient FieldPosition[] positiveSuffixFieldPositions;

    /**
     * FieldPositions describing the positive suffix String. This is
     * lazily created. Use <code>getPositiveSuffixFieldPositions</code>
     * when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient FieldPosition[] positivePrefixFieldPositions;

    /**
     * FieldPositions describing the positive prefix String. This is
     * lazily created. Use <code>getPositivePrefixFieldPositions</code>
     * when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private boolean useExponentialNotation;  // Newly persistent in the Java 2 platform v.1.2

    /**
     * True to force the use of exponential (i.e. scientific) notation when formatting
     * numbers.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private DecimalFormatSymbols symbols = null; // LIU new DecimalFormatSymbols();

    /**
     * The <code>DecimalFormatSymbols</code> object used by this format.
     * It contains the symbols used to format numbers, e.g. the grouping separator,
     * decimal separator, and so on.
     *
     * @serial
     * @see #setDecimalFormatSymbols
     * @see java.text.DecimalFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private transient boolean isCurrencyFormat = false;

    /**
     * True if this object represents a currency format.  This determines
     * whether the monetary decimal separator is used instead of the normal one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private boolean parseBigDecimal = false;

    /**
     * If true, parse returns BigDecimal wherever possible.
     *
     * @serial
     * @see #isParseBigDecimal
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private boolean decimalSeparatorAlwaysShown = false;

    /**
     * If true, forces the decimal separator to always appear in a formatted
     * number, even if the fractional part of the number is zero.
     *
     * @serial
     * @see #isDecimalSeparatorAlwaysShown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private byte    groupingSize = 3;  // invariant, > 0 if useThousands

    /**
     * The number of digits between grouping separators in the integer
     * portion of a number.  Must be greater than 0 if
     * <code>NumberFormat.groupingUsed</code> is true.
     *
     * @serial
     * @see #getGroupingSize
     * @see java.text.NumberFormat#isGroupingUsed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private int     multiplier = 1;

    /**
     * The multiplier for use in percent, per mille, etc.
     *
     * @serial
     * @see #getMultiplier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String negSuffixPattern;

    /**
     * The suffix pattern for negative numbers.  This variable corresponds
     * to <code>negativeSuffix</code>.  This variable is analogous to
     * <code>posPrefixPattern</code>; see that variable for further
     * documentation.
     *
     * @serial
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String negPrefixPattern;

    /**
     * The prefix pattern for negative numbers.  This variable corresponds
     * to <code>negativePrefix</code>.  This variable is analogous to
     * <code>posPrefixPattern</code>; see that variable for further
     * documentation.
     *
     * @serial
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String posSuffixPattern;

    /**
     * The suffix pattern for non-negative numbers.  This variable corresponds
     * to <code>positiveSuffix</code>.  This variable is analogous to
     * <code>posPrefixPattern</code>; see that variable for further
     * documentation.
     *
     * @serial
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String posPrefixPattern;

    /**
     * The prefix pattern for non-negative numbers.  This variable corresponds
     * to <code>positivePrefix</code>.
     *
     * <p>This pattern is expanded by the method <code>expandAffix()</code> to
     * <code>positivePrefix</code> to update the latter to reflect changes in
     * <code>symbols</code>.  If this variable is <code>null</code> then
     * <code>positivePrefix</code> is taken as a literal value that does not
     * change when <code>symbols</code> changes.  This variable is always
     * <code>null</code> for <code>DecimalFormat</code> objects older than
     * stream version 2 restored from stream.
     *
     * @serial
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String  negativeSuffix = "";

    /**
     * The symbol used as a suffix when formatting negative numbers.
     * This is often an empty string.
     *
     * @serial
     * @see #getNegativeSuffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String  negativePrefix = "-";

    /**
     * The symbol used as a prefix when formatting negative numbers, e.g. "-".
     *
     * @serial
     * @see #getNegativePrefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String  positiveSuffix = "";

    /**
     * The symbol used as a suffix when formatting positive numbers.
     * This is often an empty string.
     *
     * @serial
     * @see #getPositiveSuffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String  positivePrefix = "";

    /**
     * The symbol used as a prefix when formatting positive numbers, e.g. "+".
     *
     * @serial
     * @see #getPositivePrefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reads the default serializable fields from the stream and performs
     * validations and adjustments for older serialized versions. The
     * validations and adjustments are:
     * <ol>
     * <li>
     * Verify that the superclass's digit count fields correctly reflect
     * the limits imposed on formatting numbers other than
     * <code>BigInteger</code> and <code>BigDecimal</code> objects. These
     * limits are stored in the superclass for serialization compatibility
     * with older versions, while the limits for <code>BigInteger</code> and
     * <code>BigDecimal</code> objects are kept in this class.
     * If, in the superclass, the minimum or maximum integer digit count is
     * larger than <code>DOUBLE_INTEGER_DIGITS</code> or if the minimum or
     * maximum fraction digit count is larger than
     * <code>DOUBLE_FRACTION_DIGITS</code>, then the stream data is invalid
     * and this method throws an <code>InvalidObjectException</code>.
     * <li>
     * If <code>serialVersionOnStream</code> is less than 4, initialize
     * <code>roundingMode</code> to {@link java.math.RoundingMode#HALF_EVEN
     * RoundingMode.HALF_EVEN}.  This field is new with version 4.
     * <li>
     * If <code>serialVersionOnStream</code> is less than 3, then call
     * the setters for the minimum and maximum integer and fraction digits with
     * the values of the corresponding superclass getters to initialize the
     * fields in this class. The fields in this class are new with version 3.
     * <li>
     * If <code>serialVersionOnStream</code> is less than 1, indicating that
     * the stream was written by JDK 1.1, initialize
     * <code>useExponentialNotation</code>
     * to false, since it was not present in JDK 1.1.
     * <li>
     * Set <code>serialVersionOnStream</code> to the maximum allowed value so
     * that default serialization will work properly if this object is streamed
     * out again.
     * </ol>
     *
     * <p>Stream versions older than 2 will not have the affix pattern variables
     * <code>posPrefixPattern</code> etc.  As a result, they will be initialized
     * to <code>null</code>, which means the affix strings will be taken as
     * literal values.  This is exactly what we want, since that corresponds to
     * the pre-version-2 behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the {@link java.math.RoundingMode} used in this DecimalFormat.
     *
     * @param roundingMode The <code>RoundingMode</code> to be used
     * @see #getRoundingMode()
     * @exception NullPointerException if <code>roundingMode</code> is null.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the {@link java.math.RoundingMode} used in this DecimalFormat.
     *
     * @return The <code>RoundingMode</code> used for this DecimalFormat.
     * @see #setRoundingMode(RoundingMode)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the currency used by this number format when formatting
     * currency values. This does not update the minimum or maximum
     * number of fraction digits used by the number format.
     * The currency is set by calling
     * {@link DecimalFormatSymbols#setCurrency DecimalFormatSymbols.setCurrency}
     * on this number format's symbols.
     *
     * @param currency the new currency to be used by this decimal format
     * @exception NullPointerException if <code>currency</code> is null
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the currency used by this decimal format when formatting
     * currency values.
     * The currency is obtained by calling
     * {@link DecimalFormatSymbols#getCurrency DecimalFormatSymbols.getCurrency}
     * on this number format's symbols.
     *
     * @return the currency used by this decimal format, or <code>null</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the minimum number of digits allowed in the fraction portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of the return value and
     * 340 is used.
     * @see #setMinimumFractionDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the maximum number of digits allowed in the fraction portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of the return value and
     * 340 is used.
     * @see #setMaximumFractionDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the minimum number of digits allowed in the integer portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of the return value and
     * 309 is used.
     * @see #setMinimumIntegerDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Gets the maximum number of digits allowed in the integer portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of the return value and
     * 309 is used.
     * @see #setMaximumIntegerDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the minimum number of digits allowed in the fraction portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of <code>newValue</code> and
     * 340 is used. Negative input values are replaced with 0.
     * @see NumberFormat#setMinimumFractionDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the maximum number of digits allowed in the fraction portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of <code>newValue</code> and
     * 340 is used. Negative input values are replaced with 0.
     * @see NumberFormat#setMaximumFractionDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the minimum number of digits allowed in the integer portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of <code>newValue</code> and
     * 309 is used. Negative input values are replaced with 0.
     * @see NumberFormat#setMinimumIntegerDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Sets the maximum number of digits allowed in the integer portion of a
     * number.
     * For formatting numbers other than <code>BigInteger</code> and
     * <code>BigDecimal</code> objects, the lower of <code>newValue</code> and
     * 309 is used. Negative input values are replaced with 0.
     * @see NumberFormat#setMaximumIntegerDigits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void applyPattern(String pattern, boolean localized) {

    /**
     * Does the real work of applying a pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void applyLocalizedPattern(String pattern) {

    /**
     * Apply the given pattern to this Format object.  The pattern
     * is assumed to be in a localized notation. A pattern is a
     * short-hand specification for the various formatting properties.
     * These properties can also be changed individually through the
     * various setter methods.
     * <p>
     * There is no limit to integer digits set
     * by this routine, since that is the typical end-user desire;
     * use setMaximumInteger if you want to set a real value.
     * For negative numbers, use a second pattern, separated by a semicolon
     * <P>Example <code>"#,#00.0#"</code> &rarr; 1,234.56
     * <P>This means a minimum of 2 integer digits, 1 fraction digit, and
     * a maximum of 2 fraction digits.
     * <p>Example: <code>"#,#00.0#;(#,#00.0#)"</code> for negatives in
     * parentheses.
     * <p>In negative patterns, the minimum and maximum counts are ignored;
     * these are presumed to be set in the positive pattern.
     *
     * @param pattern a new pattern
     * @exception NullPointerException if <code>pattern</code> is null
     * @exception IllegalArgumentException if the given pattern is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void applyPattern(String pattern) {

    /**
     * Apply the given pattern to this Format object.  A pattern is a
     * short-hand specification for the various formatting properties.
     * These properties can also be changed individually through the
     * various setter methods.
     * <p>
     * There is no limit to integer digits set
     * by this routine, since that is the typical end-user desire;
     * use setMaximumInteger if you want to set a real value.
     * For negative numbers, use a second pattern, separated by a semicolon
     * <P>Example <code>"#,#00.0#"</code> &rarr; 1,234.56
     * <P>This means a minimum of 2 integer digits, 1 fraction digit, and
     * a maximum of 2 fraction digits.
     * <p>Example: <code>"#,#00.0#;(#,#00.0#)"</code> for negatives in
     * parentheses.
     * <p>In negative patterns, the minimum and maximum counts are ignored;
     * these are presumed to be set in the positive pattern.
     *
     * @param pattern a new pattern
     * @exception NullPointerException if <code>pattern</code> is null
     * @exception IllegalArgumentException if the given pattern is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String toPattern(boolean localized) {

    /**
     * Does the real work of generating a pattern.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void appendAffix(StringBuffer buffer, String affix, boolean localized) {

    /**
     * Append an affix to the given StringBuffer, using quotes if
     * there are special characters.  Single quotes themselves must be
     * escaped in either case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void appendAffix(StringBuffer buffer, String affixPattern,
                             String expAffix, boolean localized) {

    /**
     * Appends an affix pattern to the given StringBuffer, quoting special
     * characters as needed.  Uses the internal affix pattern, if that exists,
     * or the literal affix, if the internal affix pattern is null.  The
     * appended string will generate the same affix pattern (or literal affix)
     * when passed to toPattern().
     *
     * @param buffer the affix string is appended to this
     * @param affixPattern a pattern such as posPrefixPattern; may be null
     * @param expAffix a corresponding expanded affix, such as positivePrefix.
     * Ignored unless affixPattern is null.  If affixPattern is null, then
     * expAffix is appended as a literal affix.
     * @param localized true if the appended pattern should contain localized
     * pattern characters; otherwise, non-localized pattern chars are appended
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private FieldPosition[] expandAffix(String pattern) {

    /**
     * Expand an affix pattern into an array of FieldPositions describing
     * how the pattern would be expanded.
     * All characters in the
     * pattern are literal unless prefixed by QUOTE.  The following characters
     * after QUOTE are recognized: PATTERN_PERCENT, PATTERN_PER_MILLE,
     * PATTERN_MINUS, and CURRENCY_SIGN.  If CURRENCY_SIGN is doubled (QUOTE +
     * CURRENCY_SIGN + CURRENCY_SIGN), it is interpreted as an ISO 4217
     * currency code.  Any other character after a QUOTE represents itself.
     * QUOTE must be followed by another character; QUOTE may not occur by
     * itself at the end of the pattern.
     *
     * @param pattern the non-null, possibly empty pattern
     * @return FieldPosition array of the resulting fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private String expandAffix(String pattern, StringBuffer buffer) {

    /**
     * Expand an affix pattern into an affix string.  All characters in the
     * pattern are literal unless prefixed by QUOTE.  The following characters
     * after QUOTE are recognized: PATTERN_PERCENT, PATTERN_PER_MILLE,
     * PATTERN_MINUS, and CURRENCY_SIGN.  If CURRENCY_SIGN is doubled (QUOTE +
     * CURRENCY_SIGN + CURRENCY_SIGN), it is interpreted as an ISO 4217
     * currency code.  Any other character after a QUOTE represents itself.
     * QUOTE must be followed by another character; QUOTE may not occur by
     * itself at the end of the pattern.
     *
     * @param pattern the non-null, possibly empty pattern
     * @param buffer a scratch StringBuffer; its contents will be lost
     * @return the expanded equivalent of pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void expandAffixes() {

    /**
     * Expand the affix pattern strings into the expanded affix strings.  If any
     * affix pattern string is null, do not expand it.  This method should be
     * called any time the symbols or the affix patterns change in order to keep
     * the expanded affix strings up to date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String toLocalizedPattern() {

    /**
     * Synthesizes a localized pattern string that represents the current
     * state of this Format object.
     *
     * @return a localized pattern string
     * @see #applyPattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String toPattern() {

    /**
     * Synthesizes a pattern string that represents the current state
     * of this Format object.
     *
     * @return a pattern string
     * @see #applyPattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Overrides hashCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Overrides equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Standard override; no change in semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setParseBigDecimal(boolean newValue) {

    /**
     * Sets whether the {@link #parse(java.lang.String, java.text.ParsePosition)}
     * method returns <code>BigDecimal</code>.
     *
     * @param newValue {@code true} if the parse method returns BigDecimal;
     *                 {@code false} otherwise
     * @see #isParseBigDecimal
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public boolean isParseBigDecimal() {

    /**
     * Returns whether the {@link #parse(java.lang.String, java.text.ParsePosition)}
     * method returns <code>BigDecimal</code>. The default value is false.
     *
     * @return {@code true} if the parse method returns BigDecimal;
     *         {@code false} otherwise
     * @see #setParseBigDecimal
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setDecimalSeparatorAlwaysShown(boolean newValue) {

    /**
     * Allows you to set the behavior of the decimal separator with integers.
     * (The decimal separator will always appear with decimals.)
     * <P>Example: Decimal ON: 12345 &rarr; 12345.; OFF: 12345 &rarr; 12345
     *
     * @param newValue {@code true} if the decimal separator is always shown;
     *                 {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public boolean isDecimalSeparatorAlwaysShown() {

    /**
     * Allows you to get the behavior of the decimal separator with integers.
     * (The decimal separator will always appear with decimals.)
     * <P>Example: Decimal ON: 12345 &rarr; 12345.; OFF: 12345 &rarr; 12345
     *
     * @return {@code true} if the decimal separator is always shown;
     *         {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setGroupingSize (int newValue) {

    /**
     * Set the grouping size. Grouping size is the number of digits between
     * grouping separators in the integer portion of a number.  For example,
     * in the number "123,456.78", the grouping size is 3.
     * <br>
     * The value passed in is converted to a byte, which may lose information.
     *
     * @param newValue the new grouping size
     * @see #getGroupingSize
     * @see java.text.NumberFormat#setGroupingUsed
     * @see java.text.DecimalFormatSymbols#setGroupingSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public int getGroupingSize () {

    /**
     * Return the grouping size. Grouping size is the number of digits between
     * grouping separators in the integer portion of a number.  For example,
     * in the number "123,456.78", the grouping size is 3.
     *
     * @return the grouping size
     * @see #setGroupingSize
     * @see java.text.NumberFormat#isGroupingUsed
     * @see java.text.DecimalFormatSymbols#getGroupingSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setMultiplier (int newValue) {

    /**
     * Sets the multiplier for use in percent, per mille, and similar
     * formats.
     * For a percent format, set the multiplier to 100 and the suffixes to
     * have '%' (for Arabic, use the Arabic percent sign).
     * For a per mille format, set the multiplier to 1000 and the suffixes to
     * have '&#92;u2030'.
     *
     * <P>Example: with multiplier 100, 1.23 is formatted as "123", and
     * "123" is parsed into 1.23.
     *
     * @param newValue the new multiplier
     * @see #getMultiplier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public int getMultiplier () {

    /**
     * Gets the multiplier for use in percent, per mille, and similar
     * formats.
     *
     * @return the multiplier
     * @see #setMultiplier(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private FieldPosition[] getNegativeSuffixFieldPositions() {

    /**
     * Returns the FieldPositions of the fields in the suffix used for
     * negative numbers. This is not used if the user has explicitly set
     * a negative suffix via <code>setNegativeSuffix</code>. This is
     * lazily created.
     *
     * @return FieldPositions in positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setNegativeSuffix (String newValue) {

    /**
     * Set the negative suffix.
     * <P>Examples: 123%
     *
     * @param newValue the new negative suffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String getNegativeSuffix () {

    /**
     * Get the negative suffix.
     * <P>Examples: -123%, ($123) (with positive suffixes)
     *
     * @return the negative suffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private FieldPosition[] getPositiveSuffixFieldPositions() {

    /**
     * Returns the FieldPositions of the fields in the suffix used for
     * positive numbers. This is not used if the user has explicitly set
     * a positive suffix via <code>setPositiveSuffix</code>. This is
     * lazily created.
     *
     * @return FieldPositions in positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setPositiveSuffix (String newValue) {

    /**
     * Set the positive suffix.
     * <P>Example: 123%
     *
     * @param newValue the new positive suffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String getPositiveSuffix () {

    /**
     * Get the positive suffix.
     * <P>Example: 123%
     *
     * @return the positive suffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private FieldPosition[] getNegativePrefixFieldPositions() {

    /**
     * Returns the FieldPositions of the fields in the prefix used for
     * negative numbers. This is not used if the user has explicitly set
     * a negative prefix via <code>setNegativePrefix</code>. This is
     * lazily created.
     *
     * @return FieldPositions in positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setNegativePrefix (String newValue) {

    /**
     * Set the negative prefix.
     * <P>Examples: -123, ($123) (with negative suffix), sFr-123
     *
     * @param newValue the new negative prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String getNegativePrefix () {

    /**
     * Get the negative prefix.
     * <P>Examples: -123, ($123) (with negative suffix), sFr-123
     *
     * @return the negative prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private FieldPosition[] getPositivePrefixFieldPositions() {

    /**
     * Returns the FieldPositions of the fields in the prefix used for
     * positive numbers. This is not used if the user has explicitly set
     * a positive prefix via <code>setPositivePrefix</code>. This is
     * lazily created.
     *
     * @return FieldPositions in positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setPositivePrefix (String newValue) {

    /**
     * Set the positive prefix.
     * <P>Examples: +123, $123, sFr123
     *
     * @param newValue the new positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public String getPositivePrefix () {

    /**
     * Get the positive prefix.
     * <P>Examples: +123, $123, sFr123
     *
     * @return the positive prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public void setDecimalFormatSymbols(DecimalFormatSymbols newSymbols) {

    /**
     * Sets the decimal format symbols, which is generally not changed
     * by the programmer or user.
     * @param newSymbols desired DecimalFormatSymbols
     * @see java.text.DecimalFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public DecimalFormatSymbols getDecimalFormatSymbols() {

    /**
     * Returns a copy of the decimal format symbols, which is generally not
     * changed by the programmer or user.
     * @return a copy of the desired DecimalFormatSymbols
     * @see java.text.DecimalFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private final boolean subparse(String text, ParsePosition parsePosition,
                   String positivePrefix, String negativePrefix,
                   DigitList digits, boolean isExponent,
                   boolean status[]) {

    /**
     * Parse the given text into a number.  The text is parsed beginning at
     * parsePosition, until an unparseable character is seen.
     * @param text The string to parse.
     * @param parsePosition The position at which to being parsing.  Upon
     * return, the first unparseable character.
     * @param digits The DigitList to set to the parsed value.
     * @param isExponent If true, parse an exponent.  This means no
     * infinite values and integer only.
     * @param status Upon return contains boolean status flags indicating
     * whether the value was infinite and whether it was positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private BigDecimal getBigDecimalMultiplier() {

    /**
     * Return a BigDecimal multiplier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private BigInteger getBigIntegerMultiplier() {

    /**
     * Return a BigInteger multiplier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Parses text from a string to produce a <code>Number</code>.
     * <p>
     * The method attempts to parse text starting at the index given by
     * <code>pos</code>.
     * If parsing succeeds, then the index of <code>pos</code> is updated
     * to the index after the last character used (parsing does not necessarily
     * use all characters up to the end of the string), and the parsed
     * number is returned. The updated <code>pos</code> can be used to
     * indicate the starting point for the next call to this method.
     * If an error occurs, then the index of <code>pos</code> is not
     * changed, the error index of <code>pos</code> is set to the index of
     * the character where the error occurred, and null is returned.
     * <p>
     * The subclass returned depends on the value of {@link #isParseBigDecimal}
     * as well as on the string being parsed.
     * <ul>
     *   <li>If <code>isParseBigDecimal()</code> is false (the default),
     *       most integer values are returned as <code>Long</code>
     *       objects, no matter how they are written: <code>"17"</code> and
     *       <code>"17.000"</code> both parse to <code>Long(17)</code>.
     *       Values that cannot fit into a <code>Long</code> are returned as
     *       <code>Double</code>s. This includes values with a fractional part,
     *       infinite values, <code>NaN</code>, and the value -0.0.
     *       <code>DecimalFormat</code> does <em>not</em> decide whether to
     *       return a <code>Double</code> or a <code>Long</code> based on the
     *       presence of a decimal separator in the source string. Doing so
     *       would prevent integers that overflow the mantissa of a double,
     *       such as <code>"-9,223,372,036,854,775,808.00"</code>, from being
     *       parsed accurately.
     *       <p>
     *       Callers may use the <code>Number</code> methods
     *       <code>doubleValue</code>, <code>longValue</code>, etc., to obtain
     *       the type they want.
     *   <li>If <code>isParseBigDecimal()</code> is true, values are returned
     *       as <code>BigDecimal</code> objects. The values are the ones
     *       constructed by {@link java.math.BigDecimal#BigDecimal(String)}
     *       for corresponding strings in locale-independent format. The
     *       special cases negative and positive infinity and NaN are returned
     *       as <code>Double</code> instances holding the values of the
     *       corresponding <code>Double</code> constants.
     * </ul>
     * <p>
     * <code>DecimalFormat</code> parses all Unicode characters that represent
     * decimal digits, as defined by <code>Character.digit()</code>. In
     * addition, <code>DecimalFormat</code> also recognizes as digits the ten
     * consecutive characters starting with the localized zero digit defined in
     * the <code>DecimalFormatSymbols</code> object.
     *
     * @param text the string to be parsed
     * @param pos  A <code>ParsePosition</code> object with index and error
     *             index information as described above.
     * @return     the parsed value, or <code>null</code> if the parse fails
     * @exception  NullPointerException if <code>text</code> or
     *             <code>pos</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void append(StringBuffer result, String string,
                        FieldDelegate delegate,
                        FieldPosition[] positions,
                        Format.Field signAttribute) {

    /**
     * Appends the String <code>string</code> to <code>result</code>.
     * <code>delegate</code> is notified of all  the
     * <code>FieldPosition</code>s in <code>positions</code>.
     * <p>
     * If one of the <code>FieldPosition</code>s in <code>positions</code>
     * identifies a <code>SIGN</code> attribute, it is mapped to
     * <code>signAttribute</code>. This is used
     * to map the <code>SIGN</code> attribute to the <code>EXPONENT</code>
     * attribute as necessary.
     * <p>
     * This is used by <code>subformat</code> to add the prefix/suffix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer subformat(StringBuffer result, FieldDelegate delegate,
                                   boolean isNegative, boolean isInteger,
                                   int maxIntDigits, int minIntDigits,
                                   int maxFraDigits, int minFraDigits) {

    /**
     * Complete the formatting of a finite number.  On entry, the digitList must
     * be filled in with the correct digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    String fastFormat(double d) {

    /**
     * A fast-path shortcut of format(double) to be called by NumberFormat, or by
     * format(double, ...) public methods.
     *
     * If instance can be applied fast-path and passed double is not NaN or
     * Infinity, is in the integer range, we call {@code fastDoubleFormat}
     * after changing {@code d} to its positive value if necessary.
     *
     * Otherwise returns null by convention since fast-path can't be exercized.
     *
     * @param d The double value to be formatted
     *
     * @return the formatted result for {@code d} as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void fastDoubleFormat(double d,
                                  boolean negative) {

    /**
     * This is the main entry point for the fast-path format algorithm.
     *
     * At this point we are sure to be in the expected conditions to run it.
     * This algorithm builds the formatted result and puts it in the dedicated
     * {@code fastPathData.fastPathContainer}.
     *
     * @param d the double value to be formatted.
     * @param negative Flag precising if {@code d} is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void localizeDigits(char[] digitsBuffer) {

    /**
     * Converts digit chars from {@code digitsBuffer} to current locale.
     *
     * Must be called before adding affixes since we refer to
     * {@code fastPathData.firstUsedIndex} and {@code fastPathData.lastFreeIndex},
     * and do not support affixes (for speed reason).
     *
     * We loop backward starting from last used index in {@code fastPathData}.
     *
     * @param digitsBuffer The char array container where the digits are stored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void appendSuffix(char[] suffix,
                              int len,
                              char[] container) {

    /**
     * Appends the passed {@code suffix} chars to given result
     * {@code container}.  Updates {@code fastPathData.lastFreeIndex}
     * accordingly.
     *
     * @param suffix The suffix characters to append to result.
     * @param len The number of chars to append.
     * @param container Char array container which to append the suffix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void prependPrefix(char[] prefix,
                               int len,
                               char[] container) {

    /**
     * Prepends the passed {@code prefix} chars to given result
     * {@code container}.  Updates {@code fastPathData.firstUsedIndex}
     * accordingly.
     *
     * @param prefix The prefix characters to prepend to result.
     * @param len The number of chars to prepend.
     * @param container Char array container which to prepend the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    //    private void addAffixes(boolean isNegative, char[] container) {

    /**
     * Internal utility.
     * Adds the passed {@code prefix} and {@code suffix} to {@code container}.
     *
     * @param container  Char array container which to prepend/append the
     *  prefix/suffix.
     * @param prefix     Char sequence to prepend as a prefix.
     * @param suffix     Char sequence to append as a suffix.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void collectFractionalDigits(int number,
                                         char[] digitsBuffer,
                                         int startIndex) {

    /**
     * Collects the 2 (currency) or 3 (decimal) fractional digits from passed
     * {@code number}, starting at {@code startIndex} position
     * inclusive.  There is no punctuation to set here (no grouping chars).
     * Updates {@code fastPathData.lastFreeIndex} accordingly.
     *
     *
     * @param number  The int value from which we collect digits.
     * @param digitsBuffer The char array container where digits are stored.
     * @param startIndex the position from which we start storing digits in
     *  digitsBuffer.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void collectIntegralDigits(int number,
                                       char[] digitsBuffer,
                                       int backwardIndex) {

    /**
     * Collects integral digits from passed {@code number}, while setting
     * grouping chars as needed. Updates {@code firstUsedIndex} accordingly.
     *
     * Loops downward starting from {@code backwardIndex} position (inclusive).
     *
     * @param number  The int value from which we collect digits.
     * @param digitsBuffer The char array container where digits and grouping chars
     *  are stored.
     * @param backwardIndex the position from which we start storing digits in
     *  digitsBuffer.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private boolean exactRoundUp(double fractionalPart,
                                 int scaledFractionalPartAsInt) {

    /**
     * Returns true if rounding-up must be done on {@code scaledFractionalPartAsInt},
     * false otherwise.
     *
     * This is a utility method that takes correct half-even rounding decision on
     * passed fractional value at the scaled decimal point (2 digits for currency
     * case and 3 for decimal case), when the approximated fractional part after
     * scaled decimal point is exactly 0.5d.  This is done by means of exact
     * calculations on the {@code fractionalPart} floating-point value.
     *
     * This method is supposed to be called by private {@code fastDoubleFormat}
     * method only.
     *
     * The algorithms used for the exact calculations are :
     *
     * The <b><i>FastTwoSum</i></b> algorithm, from T.J.Dekker, described in the
     * papers  "<i>A  Floating-Point   Technique  for  Extending  the  Available
     * Precision</i>"  by Dekker, and  in "<i>Adaptive  Precision Floating-Point
     * Arithmetic and Fast Robust Geometric Predicates</i>" from J.Shewchuk.
     *
     * A modified version of <b><i>Sum2S</i></b> cascaded summation described in
     * "<i>Accurate Sum and Dot Product</i>" from Takeshi Ogita and All.  As
     * Ogita says in this paper this is an equivalent of the Kahan-Babuska's
     * summation algorithm because we order the terms by magnitude before summing
     * them. For this reason we can use the <i>FastTwoSum</i> algorithm rather
     * than the more expensive Knuth's <i>TwoSum</i>.
     *
     * We do this to avoid a more expensive exact "<i>TwoProduct</i>" algorithm,
     * like those described in Shewchuk's paper above. See comments in the code
     * below.
     *
     * @param  fractionalPart The  fractional value  on which  we  take rounding
     * decision.
     * @param scaledFractionalPartAsInt The integral part of the scaled
     * fractional value.
     *
     * @return the decision that must be taken regarding half-even rounding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private void checkAndSetFastPathStatus() {

    /**
     * Check validity of using fast-path for this instance. If fast-path is valid
     * for this instance, sets fast-path state as true and initializes fast-path
     * utility fields as needed.
     *
     * This method is supposed to be called rarely, otherwise that will break the
     * fast-path performance. That means avoiding frequent changes of the
     * properties of the instance, since for most properties, each time a change
     * happens, a call to this method is needed at the next format call.
     *
     * FAST-PATH RULES:
     *  Similar to the default DecimalFormat instantiation case.
     *  More precisely:
     *  - HALF_EVEN rounding mode,
     *  - isGroupingUsed() is true,
     *  - groupingSize of 3,
     *  - multiplier is 1,
     *  - Decimal separator not mandatory,
     *  - No use of exponential notation,
     *  - minimumIntegerDigits is exactly 1 and maximumIntegerDigits at least 10
     *  - For number of fractional digits, the exact values found in the default case:
     *     Currency : min = max = 2.
     *     Decimal  : min = 0. max = 3.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Formats an Object producing an <code>AttributedCharacterIterator</code>.
     * You can use the returned <code>AttributedCharacterIterator</code>
     * to build the resulting String, as well as to determine information
     * about the resulting String.
     * <p>
     * Each attribute key of the AttributedCharacterIterator will be of type
     * <code>NumberFormat.Field</code>, with the attribute value being the
     * same as the attribute key.
     *
     * @exception NullPointerException if obj is null.
     * @exception IllegalArgumentException when the Format cannot format the
     *            given object.
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @param obj The object to format
     * @return AttributedCharacterIterator describing the formatted value.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(BigInteger number, StringBuffer result,
                               FieldDelegate delegate, boolean formatLong) {

    /**
     * Format a BigInteger to produce a string.
     * @param number    The BigInteger to format
     * @param result    where the text is to be appended
     * @param delegate notified of locations of sub fields
     * @return The formatted number string
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(BigInteger number, StringBuffer result,
                               FieldPosition fieldPosition) {

    /**
     * Format a BigInteger to produce a string.
     * @param number    The BigInteger to format
     * @param result    where the text is to be appended
     * @param fieldPosition    On input: an alignment field, if desired.
     * On output: the offsets of the alignment field.
     * @return The formatted number string
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(BigDecimal number, StringBuffer result,
                                FieldDelegate delegate) {

    /**
     * Formats a BigDecimal to produce a string.
     * @param number    The BigDecimal to format
     * @param result    where the text is to be appended
     * @param delegate notified of locations of sub fields
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @return The formatted number string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(BigDecimal number, StringBuffer result,
                                FieldPosition fieldPosition) {

    /**
     * Formats a BigDecimal to produce a string.
     * @param number    The BigDecimal to format
     * @param result    where the text is to be appended
     * @param fieldPosition    On input: an alignment field, if desired.
     * On output: the offsets of the alignment field.
     * @return The formatted number string
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(long number, StringBuffer result,
                               FieldDelegate delegate) {

    /**
     * Format a long to produce a string.
     * @param number    The long to format
     * @param result    where the text is to be appended
     * @param delegate notified of locations of sub fields
     * @return The formatted number string
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Format a long to produce a string.
     * @param number    The long to format
     * @param result    where the text is to be appended
     * @param fieldPosition    On input: an alignment field, if desired.
     * On output: the offsets of the alignment field.
     * @exception       ArithmeticException if rounding is needed with rounding
     *                  mode being set to RoundingMode.UNNECESSARY
     * @return The formatted number string
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    private StringBuffer format(double number, StringBuffer result,
                                FieldDelegate delegate) {

    /**
     * Formats a double to produce a string.
     * @param number    The double to format
     * @param result    where the text is to be appended
     * @param delegate notified of locations of sub fields
     * @exception       ArithmeticException if rounding is needed with rounding
     *                  mode being set to RoundingMode.UNNECESSARY
     * @return The formatted number string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Formats a double to produce a string.
     * @param number    The double to format
     * @param result    where the text is to be appended
     * @param fieldPosition    On input: an alignment field, if desired.
     * On output: the offsets of the alignment field.
     * @exception ArithmeticException if rounding is needed with rounding
     *            mode being set to RoundingMode.UNNECESSARY
     * @return The formatted number string
     * @see java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    @Override

    /**
     * Formats a number and appends the resulting text to the given string
     * buffer.
     * The number can be of any subclass of {@link java.lang.Number}.
     * <p>
     * This implementation uses the maximum precision permitted.
     * @param number     the number to format
     * @param toAppendTo the <code>StringBuffer</code> to which the formatted
     *                   text is to be appended
     * @param pos        On input: an alignment field, if desired.
     *                   On output: the offsets of the alignment field.
     * @return           the value passed in as <code>toAppendTo</code>
     * @exception        IllegalArgumentException if <code>number</code> is
     *                   null or not an instance of <code>Number</code>.
     * @exception        NullPointerException if <code>toAppendTo</code> or
     *                   <code>pos</code> is null
     * @exception        ArithmeticException if rounding is needed with rounding
     *                   mode being set to RoundingMode.UNNECESSARY
     * @see              java.text.FieldPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public DecimalFormat (String pattern, DecimalFormatSymbols symbols) {

    /**
     * Creates a DecimalFormat using the given pattern and symbols.
     * Use this constructor when you need to completely customize the
     * behavior of the format.
     * <p>
     * To obtain standard formats for a given
     * locale, use the factory methods on NumberFormat such as
     * getInstance or getCurrencyInstance. If you need only minor adjustments
     * to a standard format, you can modify the format returned by
     * a NumberFormat factory method.
     *
     * @param pattern a non-localized pattern string
     * @param symbols the set of symbols to be used
     * @exception NullPointerException if any of the given arguments is null
     * @exception IllegalArgumentException if the given pattern is invalid
     * @see java.text.NumberFormat#getInstance
     * @see java.text.NumberFormat#getNumberInstance
     * @see java.text.NumberFormat#getCurrencyInstance
     * @see java.text.NumberFormat#getPercentInstance
     * @see java.text.DecimalFormatSymbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public DecimalFormat(String pattern) {

    /**
     * Creates a DecimalFormat using the given pattern and the symbols
     * for the default {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * This is a convenient way to obtain a
     * DecimalFormat when internationalization is not the main concern.
     * <p>
     * To obtain standard formats for a given locale, use the factory methods
     * on NumberFormat such as getNumberInstance. These factories will
     * return the most appropriate sub-class of NumberFormat for a given
     * locale.
     *
     * @param pattern a non-localized pattern string.
     * @exception NullPointerException if <code>pattern</code> is null
     * @exception IllegalArgumentException if the given pattern is invalid.
     * @see java.text.NumberFormat#getInstance
     * @see java.text.NumberFormat#getNumberInstance
     * @see java.text.NumberFormat#getCurrencyInstance
     * @see java.text.NumberFormat#getPercentInstance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
    public DecimalFormat() {

    /**
     * Creates a DecimalFormat using the default pattern and symbols
     * for the default {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * This is a convenient way to obtain a
     * DecimalFormat when internationalization is not the main concern.
     * <p>
     * To obtain standard formats for a given locale, use the factory methods
     * on NumberFormat such as getNumberInstance. These factories will
     * return the most appropriate sub-class of NumberFormat for a given
     * locale.
     *
     * @see java.text.NumberFormat#getInstance
     * @see java.text.NumberFormat#getNumberInstance
     * @see java.text.NumberFormat#getCurrencyInstance
     * @see java.text.NumberFormat#getPercentInstance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormat.java
public class DecimalFormat extends NumberFormat {

/**
 * <code>DecimalFormat</code> is a concrete subclass of
 * <code>NumberFormat</code> that formats decimal numbers. It has a variety of
 * features designed to make it possible to parse and format numbers in any
 * locale, including support for Western, Arabic, and Indic digits.  It also
 * supports different kinds of numbers, including integers (123), fixed-point
 * numbers (123.4), scientific notation (1.23E4), percentages (12%), and
 * currency amounts ($123).  All of these can be localized.
 *
 * <p>To obtain a <code>NumberFormat</code> for a specific locale, including the
 * default locale, call one of <code>NumberFormat</code>'s factory methods, such
 * as <code>getInstance()</code>.  In general, do not call the
 * <code>DecimalFormat</code> constructors directly, since the
 * <code>NumberFormat</code> factory methods may return subclasses other than
 * <code>DecimalFormat</code>. If you need to customize the format object, do
 * something like this:
 *
 * <blockquote><pre>
 * NumberFormat f = NumberFormat.getInstance(loc);
 * if (f instanceof DecimalFormat) {
 *     ((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
 * }
 * </pre></blockquote>
 *
 * <p>A <code>DecimalFormat</code> comprises a <em>pattern</em> and a set of
 * <em>symbols</em>.  The pattern may be set directly using
 * <code>applyPattern()</code>, or indirectly using the API methods.  The
 * symbols are stored in a <code>DecimalFormatSymbols</code> object.  When using
 * the <code>NumberFormat</code> factory methods, the pattern and symbols are
 * read from localized <code>ResourceBundle</code>s.
 *
 * <h3>Patterns</h3>
 *
 * <code>DecimalFormat</code> patterns have the following syntax:
 * <blockquote><pre>
 * <i>Pattern:</i>
 *         <i>PositivePattern</i>
 *         <i>PositivePattern</i> ; <i>NegativePattern</i>
 * <i>PositivePattern:</i>
 *         <i>Prefix<sub>opt</sub></i> <i>Number</i> <i>Suffix<sub>opt</sub></i>
 * <i>NegativePattern:</i>
 *         <i>Prefix<sub>opt</sub></i> <i>Number</i> <i>Suffix<sub>opt</sub></i>
 * <i>Prefix:</i>
 *         any Unicode characters except &#92;uFFFE, &#92;uFFFF, and special characters
 * <i>Suffix:</i>
 *         any Unicode characters except &#92;uFFFE, &#92;uFFFF, and special characters
 * <i>Number:</i>
 *         <i>Integer</i> <i>Exponent<sub>opt</sub></i>
 *         <i>Integer</i> . <i>Fraction</i> <i>Exponent<sub>opt</sub></i>
 * <i>Integer:</i>
 *         <i>MinimumInteger</i>
 *         #
 *         # <i>Integer</i>
 *         # , <i>Integer</i>
 * <i>MinimumInteger:</i>
 *         0
 *         0 <i>MinimumInteger</i>
 *         0 , <i>MinimumInteger</i>
 * <i>Fraction:</i>
 *         <i>MinimumFraction<sub>opt</sub></i> <i>OptionalFraction<sub>opt</sub></i>
 * <i>MinimumFraction:</i>
 *         0 <i>MinimumFraction<sub>opt</sub></i>
 * <i>OptionalFraction:</i>
 *         # <i>OptionalFraction<sub>opt</sub></i>
 * <i>Exponent:</i>
 *         E <i>MinimumExponent</i>
 * <i>MinimumExponent:</i>
 *         0 <i>MinimumExponent<sub>opt</sub></i>
 * </pre></blockquote>
 *
 * <p>A <code>DecimalFormat</code> pattern contains a positive and negative
 * subpattern, for example, <code>"#,##0.00;(#,##0.00)"</code>.  Each
 * subpattern has a prefix, numeric part, and suffix. The negative subpattern
 * is optional; if absent, then the positive subpattern prefixed with the
 * localized minus sign (<code>'-'</code> in most locales) is used as the
 * negative subpattern. That is, <code>"0.00"</code> alone is equivalent to
 * <code>"0.00;-0.00"</code>.  If there is an explicit negative subpattern, it
 * serves only to specify the negative prefix and suffix; the number of digits,
 * minimal digits, and other characteristics are all the same as the positive
 * pattern. That means that <code>"#,##0.0#;(#)"</code> produces precisely
 * the same behavior as <code>"#,##0.0#;(#,##0.0#)"</code>.
 *
 * <p>The prefixes, suffixes, and various symbols used for infinity, digits,
 * thousands separators, decimal separators, etc. may be set to arbitrary
 * values, and they will appear properly during formatting.  However, care must
 * be taken that the symbols and strings do not conflict, or parsing will be
 * unreliable.  For example, either the positive and negative prefixes or the
 * suffixes must be distinct for <code>DecimalFormat.parse()</code> to be able
 * to distinguish positive from negative values.  (If they are identical, then
 * <code>DecimalFormat</code> will behave as if no negative subpattern was
 * specified.)  Another example is that the decimal separator and thousands
 * separator should be distinct characters, or parsing will be impossible.
 *
 * <p>The grouping separator is commonly used for thousands, but in some
 * countries it separates ten-thousands. The grouping size is a constant number
 * of digits between the grouping characters, such as 3 for 100,000,000 or 4 for
 * 1,0000,0000.  If you supply a pattern with multiple grouping characters, the
 * interval between the last one and the end of the integer is the one that is
 * used. So <code>"#,##,###,####"</code> == <code>"######,####"</code> ==
 * <code>"##,####,####"</code>.
 *
 * <h4>Special Pattern Characters</h4>
 *
 * <p>Many characters in a pattern are taken literally; they are matched during
 * parsing and output unchanged during formatting.  Special characters, on the
 * other hand, stand for other characters, strings, or classes of characters.
 * They must be quoted, unless noted otherwise, if they are to appear in the
 * prefix or suffix as literals.
 *
 * <p>The characters listed here are used in non-localized patterns.  Localized
 * patterns use the corresponding characters taken from this formatter's
 * <code>DecimalFormatSymbols</code> object instead, and these characters lose
 * their special status.  Two exceptions are the currency sign and quote, which
 * are not localized.
 *
 * <blockquote>
 * <table border=0 cellspacing=3 cellpadding=0 summary="Chart showing symbol,
 *  location, localized, and meaning.">
 *     <tr style="background-color: rgb(204, 204, 255);">
 *          <th align=left>Symbol
 *          <th align=left>Location
 *          <th align=left>Localized?
 *          <th align=left>Meaning
 *     <tr valign=top>
 *          <td><code>0</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Digit
 *     <tr style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *          <td><code>#</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Digit, zero shows as absent
 *     <tr valign=top>
 *          <td><code>.</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Decimal separator or monetary decimal separator
 *     <tr style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *          <td><code>-</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Minus sign
 *     <tr valign=top>
 *          <td><code>,</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Grouping separator
 *     <tr style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *          <td><code>E</code>
 *          <td>Number
 *          <td>Yes
 *          <td>Separates mantissa and exponent in scientific notation.
 *              <em>Need not be quoted in prefix or suffix.</em>
 *     <tr valign=top>
 *          <td><code>;</code>
 *          <td>Subpattern boundary
 *          <td>Yes
 *          <td>Separates positive and negative subpatterns
 *     <tr style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *          <td><code>%</code>
 *          <td>Prefix or suffix
 *          <td>Yes
 *          <td>Multiply by 100 and show as percentage
 *     <tr valign=top>
 *          <td><code>&#92;u2030</code>
 *          <td>Prefix or suffix
 *          <td>Yes
 *          <td>Multiply by 1000 and show as per mille value
 *     <tr style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *          <td><code>&#164;</code> (<code>&#92;u00A4</code>)
 *          <td>Prefix or suffix
 *          <td>No
 *          <td>Currency sign, replaced by currency symbol.  If
 *              doubled, replaced by international currency symbol.
 *              If present in a pattern, the monetary decimal separator
 *              is used instead of the decimal separator.
 *     <tr valign=top>
 *          <td><code>'</code>
 *          <td>Prefix or suffix
 *          <td>No
 *          <td>Used to quote special characters in a prefix or suffix,
 *              for example, <code>"'#'#"</code> formats 123 to
 *              <code>"#123"</code>.  To create a single quote
 *              itself, use two in a row: <code>"# o''clock"</code>.
 * </table>
 * </blockquote>
 *
 * <h4>Scientific Notation</h4>
 *
 * <p>Numbers in scientific notation are expressed as the product of a mantissa
 * and a power of ten, for example, 1234 can be expressed as 1.234 x 10^3.  The
 * mantissa is often in the range 1.0 &le; x {@literal <} 10.0, but it need not
 * be.
 * <code>DecimalFormat</code> can be instructed to format and parse scientific
 * notation <em>only via a pattern</em>; there is currently no factory method
 * that creates a scientific notation format.  In a pattern, the exponent
 * character immediately followed by one or more digit characters indicates
 * scientific notation.  Example: <code>"0.###E0"</code> formats the number
 * 1234 as <code>"1.234E3"</code>.
 *
 * <ul>
 * <li>The number of digit characters after the exponent character gives the
 * minimum exponent digit count.  There is no maximum.  Negative exponents are
 * formatted using the localized minus sign, <em>not</em> the prefix and suffix
 * from the pattern.  This allows patterns such as <code>"0.###E0 m/s"</code>.
 *
 * <li>The minimum and maximum number of integer digits are interpreted
 * together:
 *
 * <ul>
 * <li>If the maximum number of integer digits is greater than their minimum number
 * and greater than 1, it forces the exponent to be a multiple of the maximum
 * number of integer digits, and the minimum number of integer digits to be
 * interpreted as 1.  The most common use of this is to generate
 * <em>engineering notation</em>, in which the exponent is a multiple of three,
 * e.g., <code>"##0.#####E0"</code>. Using this pattern, the number 12345
 * formats to <code>"12.345E3"</code>, and 123456 formats to
 * <code>"123.456E3"</code>.
 *
 * <li>Otherwise, the minimum number of integer digits is achieved by adjusting the
 * exponent.  Example: 0.00123 formatted with <code>"00.###E0"</code> yields
 * <code>"12.3E-4"</code>.
 * </ul>
 *
 * <li>The number of significant digits in the mantissa is the sum of the
 * <em>minimum integer</em> and <em>maximum fraction</em> digits, and is
 * unaffected by the maximum integer digits.  For example, 12345 formatted with
 * <code>"##0.##E0"</code> is <code>"12.3E3"</code>. To show all digits, set
 * the significant digits count to zero.  The number of significant digits
 * does not affect parsing.
 *
 * <li>Exponential patterns may not contain grouping separators.
 * </ul>
 *
 * <h4>Rounding</h4>
 *
 * <code>DecimalFormat</code> provides rounding modes defined in
 * {@link java.math.RoundingMode} for formatting.  By default, it uses
 * {@link java.math.RoundingMode#HALF_EVEN RoundingMode.HALF_EVEN}.
 *
 * <h4>Digits</h4>
 *
 * For formatting, <code>DecimalFormat</code> uses the ten consecutive
 * characters starting with the localized zero digit defined in the
 * <code>DecimalFormatSymbols</code> object as digits. For parsing, these
 * digits as well as all Unicode decimal digits, as defined by
 * {@link Character#digit Character.digit}, are recognized.
 *
 * <h4>Special Values</h4>
 *
 * <p><code>NaN</code> is formatted as a string, which typically has a single character
 * <code>&#92;uFFFD</code>.  This string is determined by the
 * <code>DecimalFormatSymbols</code> object.  This is the only value for which
 * the prefixes and suffixes are not used.
 *
 * <p>Infinity is formatted as a string, which typically has a single character
 * <code>&#92;u221E</code>, with the positive or negative prefixes and suffixes
 * applied.  The infinity string is determined by the
 * <code>DecimalFormatSymbols</code> object.
 *
 * <p>Negative zero (<code>"-0"</code>) parses to
 * <ul>
 * <li><code>BigDecimal(0)</code> if <code>isParseBigDecimal()</code> is
 * true,
 * <li><code>Long(0)</code> if <code>isParseBigDecimal()</code> is false
 *     and <code>isParseIntegerOnly()</code> is true,
 * <li><code>Double(-0.0)</code> if both <code>isParseBigDecimal()</code>
 * and <code>isParseIntegerOnly()</code> are false.
 * </ul>
 *
 * <h4><a name="synchronization">Synchronization</a></h4>
 *
 * <p>
 * Decimal formats are generally not synchronized.
 * It is recommended to create separate format instances for each thread.
 * If multiple threads access a format concurrently, it must be synchronized
 * externally.
 *
 * <h4>Example</h4>
 *
 * <blockquote><pre>{@code
 * <strong>// Print out a number using the localized number, integer, currency,
 * // and percent format for each locale</strong>
 * Locale[] locales = NumberFormat.getAvailableLocales();
 * double myNumber = -1234.56;
 * NumberFormat form;
 * for (int j = 0; j < 4; ++j) {
 *     System.out.println("FORMAT");
 *     for (int i = 0; i < locales.length; ++i) {
 *         if (locales[i].getCountry().length() == 0) {
 *            continue; // Skip language-only locales
 *         }
 *         System.out.print(locales[i].getDisplayName());
 *         switch (j) {
 *         case 0:
 *             form = NumberFormat.getInstance(locales[i]); break;
 *         case 1:
 *             form = NumberFormat.getIntegerInstance(locales[i]); break;
 *         case 2:
 *             form = NumberFormat.getCurrencyInstance(locales[i]); break;
 *         default:
 *             form = NumberFormat.getPercentInstance(locales[i]); break;
 *         }
 *         if (form instanceof DecimalFormat) {
 *             System.out.print(": " + ((DecimalFormat) form).toPattern());
 *         }
 *         System.out.print(" -> " + form.format(myNumber));
 *         try {
 *             System.out.println(" -> " + form.parse(form.format(myNumber)));
 *         } catch (ParseException e) {}
 *     }
 * }
 * }</pre></blockquote>
 *
 * @see          <a href="https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html">Java Tutorial</a>
 * @see          NumberFormat
 * @see          DecimalFormatSymbols
 * @see          ParsePosition
 * @author       Mark Davis
 * @author       Alan Liu
 */
