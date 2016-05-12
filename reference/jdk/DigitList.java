_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    private boolean isLongMIN_VALUE() {

    /**
     * Returns true if this DigitList represents Long.MIN_VALUE;
     * false, otherwise.  This is required so that getLong() works.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public Object clone() {

    /**
     * Creates a copy of this object.
     * @return a clone of this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public int hashCode() {

    /**
     * Generates the hash code for the digit list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public boolean equals(Object obj) {

    /**
     * equality test between two digit lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, BigInteger source, int maximumDigits) {

    /**
     * Set the digit list to a representation of the given BigInteger value.
     * @param isNegative Boolean value indicating whether the number is negative.
     * @param source Value to be converted; must be >= 0.
     * @param maximumDigits The most digits which should be converted.
     * If maximumDigits is lower than the number of significant digits
     * in source, the representation will be rounded.  Ignored if <= 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, BigDecimal source, int maximumDigits, boolean fixedPoint) {

    /**
     * Set the digit list to a representation of the given BigDecimal value.
     * This method supports both fixed-point and exponential notation.
     * @param isNegative Boolean value indicating whether the number is negative.
     * @param source Value to be converted; must not be a value <= 0.
     * @param maximumDigits The most fractional or total digits which should
     * be converted.
     * @param fixedPoint If true, then maximumDigits is the maximum
     * fractional digits to be converted.  If false, total digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, long source, int maximumDigits) {

    /**
     * Set the digit list to a representation of the given long value.
     * @param isNegative Boolean value indicating whether the number is negative.
     * @param source Value to be converted; must be >= 0 or ==
     * Long.MIN_VALUE.
     * @param maximumDigits The most digits which should be converted.
     * If maximumDigits is lower than the number of significant digits
     * in source, the representation will be rounded.  Ignored if <= 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, long source) {

    /**
     * Utility routine to set the value of the digit list from a long
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    private boolean shouldRoundUp(int maximumDigits,
                                  boolean alreadyRounded,
                                  boolean valueExactAsDecimal) {

    /**
     * Return true if truncating the representation to the given number
     * of digits will result in an increment to the last digit.  This
     * method implements the rounding modes defined in the
     * java.math.RoundingMode class.
     * [bnf]
     * @param maximumDigits the number of digits to keep, from 0 to
     * <code>count-1</code>.  If 0, then all digits are rounded away, and
     * this method returns true if a one should be generated (e.g., formatting
     * 0.09 with "#.#").
     * @param alreadyRounded whether or not rounding up has already happened.
     * @param valueExactAsDecimal whether or not collected digits provide
     * an exact decimal representation of the value.
     * @exception ArithmeticException if rounding is needed with rounding
     *            mode being set to RoundingMode.UNNECESSARY
     * @return true if digit <code>maximumDigits-1</code> should be
     * incremented
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    private final void round(int maximumDigits,
                             boolean alreadyRounded,
                             boolean valueExactAsDecimal) {

    /**
     * Round the representation to the given number of digits.
     * @param maximumDigits The maximum number of digits to be shown.
     * @param alreadyRounded whether or not rounding up has already happened.
     * @param valueExactAsDecimal whether or not collected digits provide
     * an exact decimal representation of the value.
     *
     * Upon return, count will be less than or equal to maximumDigits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    private void set(boolean isNegative, String s,
                     boolean roundedUp, boolean valueExactAsDecimal,
                     int maximumDigits, boolean fixedPoint) {

    /**
     * Generate a representation of the form DDDDD, DDDDD.DDDDD, or
     * DDDDDE+/-DDDDD.
     * @param roundedUp whether or not rounding up has already happened.
     * @param valueExactAsDecimal whether or not collected digits provide
     * an exact decimal representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, double source, int maximumDigits, boolean fixedPoint) {

    /**
     * Set the digit list to a representation of the given double value.
     * This method supports both fixed-point and exponential notation.
     * @param isNegative Boolean value indicating whether the number is negative.
     * @param source Value to be converted; must not be Inf, -Inf, Nan,
     * or a value <= 0.
     * @param maximumDigits The most fractional or total digits which should
     * be converted.
     * @param fixedPoint If true, then maximumDigits is the maximum
     * fractional digits to be converted.  If false, total digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    final void set(boolean isNegative, double source, int maximumFractionDigits) {

    /**
     * Set the digit list to a representation of the given double value.
     * This method supports fixed-point notation.
     * @param isNegative Boolean value indicating whether the number is negative.
     * @param source Value to be converted; must not be Inf, -Inf, Nan,
     * or a value <= 0.
     * @param maximumFractionDigits The most fractional digits which should
     * be converted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    boolean fitsIntoLong(boolean isPositive, boolean ignoreNegativeZero) {

    /**
     * Return true if the number represented by this object can fit into
     * a long.
     * @param isPositive true if this number should be regarded as positive
     * @param ignoreNegativeZero true if -0 should be regarded as identical to
     * +0; otherwise they are considered distinct
     * @return true if this number fits into a Java long
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public final long getLong() {

    /**
     * Utility routine to get the value of the digit list.
     * If (count == 0) this returns 0, unlike Long.parseLong().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public final double getDouble() {

    /**
     * Utility routine to get the value of the digit list
     * If (count == 0) this throws a NumberFormatException, which
     * mimics Long.parseLong().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public void append(char digit) {

    /**
     * Appends a digit to the list, extending the list when necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public void clear () {

    /**
     * Clears out the digits.
     * Use before appending them.
     * Typically, you set a series of digits with append, then at the point
     * you hit the decimal point, you set myDigitList.decimalAt = myDigitList.count;
     * then go on appending digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    void setRoundingMode(RoundingMode r) {

    /**
     * Set the rounding mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    boolean isZero() {

    /**
     * Return true if the represented number is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
    public int decimalAt = 0;

    /**
     * These data members are intentionally public and can be set directly.
     *
     * The value represented is given by placing the decimal point before
     * digits[decimalAt].  If decimalAt is < 0, then leading zeros between
     * the decimal point and the first nonzero digit are implied.  If decimalAt
     * is > count, then trailing zeros between the digits[count-1] and the
     * decimal point are implied.
     *
     * Equivalently, the represented value is given by f * 10^decimalAt.  Here
     * f is a value 0.1 <= f < 1 arrived at by placing the digits in Digits to
     * the right of the decimal.
     *
     * DigitList is normalized, so if it is non-zero, figits[0] is non-zero.  We
     * don't allow denormalized numbers because our exponent is effectively of
     * unlimited magnitude.  The count value contains the number of significant
     * digits present in digits[].
     *
     * Zero is represented by any DigitList with count == 0 or with each digits[i]
     * for all i <= count == '0'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DigitList.java
final class DigitList implements Cloneable {

/**
 * Digit List. Private to DecimalFormat.
 * Handles the transcoding
 * between numeric values and strings of characters.  Only handles
 * non-negative numbers.  The division of labor between DigitList and
 * DecimalFormat is that DigitList handles the radix 10 representation
 * issues; DecimalFormat handles the locale-specific issues such as
 * positive/negative, grouping, decimal point, currency, and so on.
 *
 * A DigitList is really a representation of a floating point value.
 * It may be an integer value; we assume that a double has sufficient
 * precision to represent all digits of a long.
 *
 * The DigitList representation consists of a string of characters,
 * which are the digits radix 10, from '0' to '9'.  It also has a radix
 * 10 exponent associated with it.  The value represented by a DigitList
 * object can be computed by mulitplying the fraction f, where 0 <= f < 1,
 * derived by placing all the digits of the list to the right of the
 * decimal point, by 10^exponent.
 *
 * @see  Locale
 * @see  Format
 * @see  NumberFormat
 * @see  DecimalFormat
 * @see  ChoiceFormat
 * @see  MessageFormat
 * @author       Mark Davis, Alan Liu
 */
