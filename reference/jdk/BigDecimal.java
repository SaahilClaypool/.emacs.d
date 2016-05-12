_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal doRound128(long hi, long lo, int sign, int scale, MathContext mc) {

    /**
     * rounds 128-bit value according {@code MathContext}
     * returns null if result can't be repsented as compact BigDecimal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal multiplyAndRound(long x, long y, int scale, MathContext mc) {

    /**
     * Multiplies two long values and rounds according {@code MathContext}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static long[] divRemNegativeLong(long n, long d) {

    /**
     * Calculate the quotient and remainder of dividing a negative long by
     * another long.
     *
     * @param n the numerator; must be negative
     * @param d the denominator; must not be unity
     * @return a two-element {@long} array with the remainder and quotient in
     *         the initial and final elements, respectively
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divide(BigInteger xs, int xscale, BigInteger ys, int yscale, long preferredScale, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (xs /
     * ys)}, with rounding according to the context settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divide(long xs, int xscale, BigInteger ys, int yscale, long preferredScale, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (xs /
     * ys)}, with rounding according to the context settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divide(BigInteger xs, int xscale, long ys, int yscale, long preferredScale, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (xs /
     * ys)}, with rounding according to the context settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divide(final long xs, int xscale, final long ys, int yscale, long preferredScale, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (xs /
     * ys)}, with rounding according to the context settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divideSmallFastPath(final long xs, int xscale,
                                                  final long ys, int yscale,
                                                  long preferredScale, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (xs /
     * ys)}, with rounding according to the context settings.
     *
     * Fast path - used only when (xscale <= yscale && yscale < 18
     *  && mc.presision<18) {
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal createAndStripZerosToMatchScale(long compactVal, int scale, long preferredScale) {

    /**
     * Remove insignificant trailing zeros from this
     * {@code long} value until the preferred scale is reached or no
     * more zeros can be removed.  If the preferred scale is less than
     * Integer.MIN_VALUE, all the trailing zeros will be removed.
     *
     * @return new {@code BigDecimal} with a scale possibly reduced
     * to be closed to the preferred scale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal createAndStripZerosToMatchScale(BigInteger intVal, int scale, long preferredScale) {

    /**
     * Remove insignificant trailing zeros from this
     * {@code BigInteger} value until the preferred scale is reached or no
     * more zeros can be removed.  If the preferred scale is less than
     * Integer.MIN_VALUE, all the trailing zeros will be removed.
     *
     * @return new {@code BigDecimal} with a scale possibly reduced
     * to be closed to the preferred scale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static boolean needIncrement(MutableBigInteger mdivisor, int roundingMode,
                                         int qsign, MutableBigInteger mq, MutableBigInteger mr) {

    /**
     * Tests if quotient has to be incremented according the roundingMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divideAndRound(BigInteger bdividend, BigInteger bdivisor, int scale, int roundingMode,
                                             int preferredScale) {

    /**
     * Internally used for division operation for division {@code BigInteger}
     * by {@code BigInteger}.
     * The returned {@code BigDecimal} object is the quotient whose scale is set
     * to the passed in scale. If the remainder is not zero, it will be rounded
     * based on the passed in roundingMode. Also, if the remainder is zero and
     * the last parameter, i.e. preferredScale is NOT equal to scale, the
     * trailing zeros of the result is stripped to match the preferredScale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigInteger divideAndRound(BigInteger bdividend, BigInteger bdivisor, int roundingMode) {

    /**
     * Divides {@code BigInteger} value by {@code BigInteger} value and
     * do rounding based on the passed in roundingMode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static boolean needIncrement(long ldivisor, int roundingMode,
                                         int qsign, MutableBigInteger mq, long r) {

    /**
     * Tests if quotient has to be incremented according the roundingMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divideAndRound(BigInteger bdividend,
                                             long ldivisor, int scale, int roundingMode, int preferredScale) {

    /**
     * Internally used for division operation for division {@code BigInteger}
     * by {@code long}.
     * The returned {@code BigDecimal} object is the quotient whose scale is set
     * to the passed in scale. If the remainder is not zero, it will be rounded
     * based on the passed in roundingMode. Also, if the remainder is zero and
     * the last parameter, i.e. preferredScale is NOT equal to scale, the
     * trailing zeros of the result is stripped to match the preferredScale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigInteger divideAndRound(BigInteger bdividend, long ldivisor, int roundingMode) {

    /**
     * Divides {@code BigInteger} value by {@code long} value and
     * do rounding based on the passed in roundingMode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static boolean needIncrement(long ldivisor, int roundingMode,
                                         int qsign, long q, long r) {

    /**
     * Tests if quotient has to be incremented according the roundingMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static boolean commonNeedIncrement(int roundingMode, int qsign,
                                        int cmpFracHalf, boolean oddQuot) {

    /**
     * Shared logic of need increment computation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static long divideAndRound(long ldividend, long ldivisor, int roundingMode) {

    /**
     * Divides {@code long} by {@code long} and do rounding based on the
     * passed in roundingMode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal divideAndRound(long ldividend, long ldivisor, int scale, int roundingMode,
                                             int preferredScale) {

    /**
     * Internally used for division operation for division {@code long} by
     * {@code long}.
     * The returned {@code BigDecimal} object is the quotient whose scale is set
     * to the passed in scale. If the remainder is not zero, it will be rounded
     * based on the passed in roundingMode. Also, if the remainder is zero and
     * the last parameter, i.e. preferredScale is NOT equal to scale, the
     * trailing zeros of the result is stripped to match the preferredScale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigDecimal doRound(BigDecimal val, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} rounded according to the MathContext
     * settings;
     * If rounding is needed a new {@code BigDecimal} is created and returned.
     *
     * @param val the value to be rounded
     * @param mc the context to use.
     * @return a {@code BigDecimal} rounded according to the MathContext
     *         settings.  May return {@code value}, if no rounding needed.
     * @throws ArithmeticException if the rounding mode is
     *         {@code RoundingMode.UNNECESSARY} and the
     *         result is inexact.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private BigDecimal audit() {

    /**
     * Check internal invariants of this BigDecimal.  These invariants
     * include:
     *
     * <ul>
     *
     * <li>The object must be initialized; either intCompact must not be
     * INFLATED or intVal is non-null.  Both of these conditions may
     * be true.
     *
     * <li>If both intCompact and intVal and set, their values must be
     * consistent.
     *
     * <li>If precision is nonzero, it must have the right value.
     * </ul>
     *
     * Note: Since this is an audit method, we are not supposed to change the
     * state of this BigDecimal object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static long compactValFor(BigInteger b) {

   /**
     * Returns the compact value for given {@code BigInteger}, or
     * INFLATED if too big. Relies on internal representation of
     * {@code BigInteger}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private int checkScale(long val) {

    /**
     * Check a scale for Underflow or Overflow.  If this BigDecimal is
     * nonzero, throw an exception if the scale is outof range. If this
     * is zero, saturate the scale to the extreme value of the right
     * sign if the scale is out of range.
     *
     * @param val The new scale.
     * @throws ArithmeticException (overflow or underflow) if the new
     *         scale is out of range.
     * @return validated scale as an int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static int bigDigitLength(BigInteger b) {

    /**
     * Returns the length of the absolute value of a BigInteger, in
     * decimal digits.
     *
     * @param b the BigInteger
     * @return the length of the unscaled value, in decimal digits
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    static int longDigitLength(long x) {

    /**
     * Returns the length of the absolute value of a {@code long}, in decimal
     * digits.
     *
     * @param x the {@code long}
     * @return the length of the unscaled value, in deciaml digits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
   private void writeObject(java.io.ObjectOutputStream s)

   /**
    * Serialize this {@code BigDecimal} to the stream in question
    *
    * @param s the stream to serialize to.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitute the {@code BigDecimal} instance from a stream (that is,
     * deserialize it).
     *
     * @param s the stream being read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static void matchScale(BigDecimal[] val) {

    /**
     * Match the scales of two {@code BigDecimal}s to align their
     * least significant digits.
     *
     * <p>If the scales of val[0] and val[1] differ, rescale
     * (non-destructively) the lower-scaled {@code BigDecimal} so
     * they match.  That is, the lower-scaled reference will be
     * replaced by a reference to a new object with the same scale as
     * the other {@code BigDecimal}.
     *
     * @param  val array of two elements referring to the two
     *         {@code BigDecimal}s to be aligned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private BigInteger inflated() {

    /**
     * Returns appropriate BigInteger from intVal field if intVal is
     * null, i.e. the compact representation is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private BigInteger bigMultiplyPowerTen(int n) {

    /**
     * Compute this * 10 ^ n.
     * Needed mainly to allow special casing to trap zero value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static long longMultiplyPowerTen(long val, int n) {

    /**
     * Compute val * 10 ^ n; return this product if it is
     * representable as a long, INFLATED otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigInteger expandBigIntegerTenPowers(int n) {

    /**
     * Expand the BIG_TEN_POWERS_TABLE array to contain at least 10**n.
     *
     * @param n the power of ten to be returned (>=0)
     * @return a {@code BigDecimal} with the value (10<sup>n</sup>) and
     *         in the meantime, the BIG_TEN_POWERS_TABLE array gets
     *         expanded to the size greater than n.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static BigInteger bigTenToThe(int n) {

    /**
     * Return 10 to the power n, as a {@code BigInteger}.
     *
     * @param  n the power of ten to be returned (>=0)
     * @return a {@code BigInteger} with the value (10<sup>n</sup>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private String layoutChars(boolean sci) {

    /**
     * Lay out this {@code BigDecimal} into a {@code char[]} array.
     * The Java 1.2 equivalent to this was called {@code getValueString}.
     *
     * @param  sci {@code true} for Scientific exponential notation;
     *          {@code false} for Engineering
     * @return string with canonical string representation of this
     *         {@code BigDecimal}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
        int putIntCompact(long intCompact) {

        /**
         * Places characters representing the intCompact in {@code long} into
         * cmpCharArray and returns the offset to the array where the
         * representation starts.
         *
         * @param intCompact the number to put into the cmpCharArray.
         * @return offset to the array where the representation starts.
         * Note: intCompact must be greater or equal to zero.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal ulp() {

    /**
     * Returns the size of an ulp, a unit in the last place, of this
     * {@code BigDecimal}.  An ulp of a nonzero {@code BigDecimal}
     * value is the positive distance between this value and the
     * {@code BigDecimal} value next larger in magnitude with the
     * same number of digits.  An ulp of a zero value is numerically
     * equal to 1 with the scale of {@code this}.  The result is
     * stored with the same scale as {@code this} so the result
     * for zero and nonzero values is equal to {@code [1,
     * this.scale()]}.
     *
     * @return the size of an ulp of {@code this}
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static final float float10pow[] = {

    /**
     * Powers of 10 which can be represented exactly in {@code
     * float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private static final double double10pow[] = {

    /**
     * Powers of 10 which can be represented exactly in {@code
     * double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public double doubleValue(){

    /**
     * Converts this {@code BigDecimal} to a {@code double}.
     * This conversion is similar to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code float} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this {@code BigDecimal} has too great a
     * magnitude represent as a {@code double}, it will be
     * converted to {@link Double#NEGATIVE_INFINITY} or {@link
     * Double#POSITIVE_INFINITY} as appropriate.  Note that even when
     * the return value is finite, this conversion can lose
     * information about the precision of the {@code BigDecimal}
     * value.
     *
     * @return this {@code BigDecimal} converted to a {@code double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public float floatValue(){

    /**
     * Converts this {@code BigDecimal} to a {@code float}.
     * This conversion is similar to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code float} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this {@code BigDecimal} has too great a
     * magnitude to represent as a {@code float}, it will be
     * converted to {@link Float#NEGATIVE_INFINITY} or {@link
     * Float#POSITIVE_INFINITY} as appropriate.  Note that even when
     * the return value is finite, this conversion can lose
     * information about the precision of the {@code BigDecimal}
     * value.
     *
     * @return this {@code BigDecimal} converted to a {@code float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public byte byteValueExact() {

    /**
     * Converts this {@code BigDecimal} to a {@code byte}, checking
     * for lost information.  If this {@code BigDecimal} has a
     * nonzero fractional part or is out of the possible range for a
     * {@code byte} result then an {@code ArithmeticException} is
     * thrown.
     *
     * @return this {@code BigDecimal} converted to a {@code byte}.
     * @throws ArithmeticException if {@code this} has a nonzero
     *         fractional part, or will not fit in a {@code byte}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public short shortValueExact() {

    /**
     * Converts this {@code BigDecimal} to a {@code short}, checking
     * for lost information.  If this {@code BigDecimal} has a
     * nonzero fractional part or is out of the possible range for a
     * {@code short} result then an {@code ArithmeticException} is
     * thrown.
     *
     * @return this {@code BigDecimal} converted to a {@code short}.
     * @throws ArithmeticException if {@code this} has a nonzero
     *         fractional part, or will not fit in a {@code short}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int intValueExact() {

    /**
     * Converts this {@code BigDecimal} to an {@code int}, checking
     * for lost information.  If this {@code BigDecimal} has a
     * nonzero fractional part or is out of the possible range for an
     * {@code int} result then an {@code ArithmeticException} is
     * thrown.
     *
     * @return this {@code BigDecimal} converted to an {@code int}.
     * @throws ArithmeticException if {@code this} has a nonzero
     *         fractional part, or will not fit in an {@code int}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int intValue() {

    /**
     * Converts this {@code BigDecimal} to an {@code int}.
     * This conversion is analogous to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code short} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * any fractional part of this
     * {@code BigDecimal} will be discarded, and if the resulting
     * "{@code BigInteger}" is too big to fit in an
     * {@code int}, only the low-order 32 bits are returned.
     * Note that this conversion can lose information about the
     * overall magnitude and precision of this {@code BigDecimal}
     * value as well as return a result with the opposite sign.
     *
     * @return this {@code BigDecimal} converted to an {@code int}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
        private static final BigInteger LONGMAX = BigInteger.valueOf(Long.MAX_VALUE);

        /** BigInteger equal to Long.MAX_VALUE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
        private static final BigInteger LONGMIN = BigInteger.valueOf(Long.MIN_VALUE);

        /** BigInteger equal to Long.MIN_VALUE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public long longValueExact() {

    /**
     * Converts this {@code BigDecimal} to a {@code long}, checking
     * for lost information.  If this {@code BigDecimal} has a
     * nonzero fractional part or is out of the possible range for a
     * {@code long} result then an {@code ArithmeticException} is
     * thrown.
     *
     * @return this {@code BigDecimal} converted to a {@code long}.
     * @throws ArithmeticException if {@code this} has a nonzero
     *         fractional part, or will not fit in a {@code long}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public long longValue(){

    /**
     * Converts this {@code BigDecimal} to a {@code long}.
     * This conversion is analogous to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code short} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * any fractional part of this
     * {@code BigDecimal} will be discarded, and if the resulting
     * "{@code BigInteger}" is too big to fit in a
     * {@code long}, only the low-order 64 bits are returned.
     * Note that this conversion can lose information about the
     * overall magnitude and precision of this {@code BigDecimal} value as well
     * as return a result with the opposite sign.
     *
     * @return this {@code BigDecimal} converted to a {@code long}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigInteger toBigIntegerExact() {

    /**
     * Converts this {@code BigDecimal} to a {@code BigInteger},
     * checking for lost information.  An exception is thrown if this
     * {@code BigDecimal} has a nonzero fractional part.
     *
     * @return this {@code BigDecimal} converted to a {@code BigInteger}.
     * @throws ArithmeticException if {@code this} has a nonzero
     *         fractional part.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigInteger toBigInteger() {

    /**
     * Converts this {@code BigDecimal} to a {@code BigInteger}.
     * This conversion is analogous to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code long} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * any fractional part of this
     * {@code BigDecimal} will be discarded.  Note that this
     * conversion can lose information about the precision of the
     * {@code BigDecimal} value.
     * <p>
     * To have an exception thrown if the conversion is inexact (in
     * other words if a nonzero fractional part is discarded), use the
     * {@link #toBigIntegerExact()} method.
     *
     * @return this {@code BigDecimal} converted to a {@code BigInteger}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public String toPlainString() {

    /**
     * Returns a string representation of this {@code BigDecimal}
     * without an exponent field.  For values with a positive scale,
     * the number of digits to the right of the decimal point is used
     * to indicate scale.  For values with a zero or negative scale,
     * the resulting string is generated as if the value were
     * converted to a numerically equal value with zero scale and as
     * if all the trailing zeros of the zero scale value were present
     * in the result.
     *
     * The entire string is prefixed by a minus sign character '-'
     * (<tt>'&#92;u002D'</tt>) if the unscaled value is less than
     * zero. No sign character is prefixed if the unscaled value is
     * zero or positive.
     *
     * Note that if the result of this method is passed to the
     * {@linkplain #BigDecimal(String) string constructor}, only the
     * numerical value of this {@code BigDecimal} will necessarily be
     * recovered; the representation of the new {@code BigDecimal}
     * may have a different scale.  In particular, if this
     * {@code BigDecimal} has a negative scale, the string resulting
     * from this method will have a scale of zero when processed by
     * the string constructor.
     *
     * (This method behaves analogously to the {@code toString}
     * method in 1.4 and earlier releases.)
     *
     * @return a string representation of this {@code BigDecimal}
     * without an exponent field.
     * @since 1.5
     * @see #toString()
     * @see #toEngineeringString()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public String toEngineeringString() {

    /**
     * Returns a string representation of this {@code BigDecimal},
     * using engineering notation if an exponent is needed.
     *
     * <p>Returns a string that represents the {@code BigDecimal} as
     * described in the {@link #toString()} method, except that if
     * exponential notation is used, the power of ten is adjusted to
     * be a multiple of three (engineering notation) such that the
     * integer part of nonzero values will be in the range 1 through
     * 999.  If exponential notation is used for zero values, a
     * decimal point and one or two fractional zero digits are used so
     * that the scale of the zero value is preserved.  Note that
     * unlike the output of {@link #toString()}, the output of this
     * method is <em>not</em> guaranteed to recover the same [integer,
     * scale] pair of this {@code BigDecimal} if the output string is
     * converting back to a {@code BigDecimal} using the {@linkplain
     * #BigDecimal(String) string constructor}.  The result of this method meets
     * the weaker constraint of always producing a numerically equal
     * result from applying the string constructor to the method's output.
     *
     * @return string representation of this {@code BigDecimal}, using
     *         engineering notation if an exponent is needed.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    @Override

    /**
     * Returns the string representation of this {@code BigDecimal},
     * using scientific notation if an exponent is needed.
     *
     * <p>A standard canonical string form of the {@code BigDecimal}
     * is created as though by the following steps: first, the
     * absolute value of the unscaled value of the {@code BigDecimal}
     * is converted to a string in base ten using the characters
     * {@code '0'} through {@code '9'} with no leading zeros (except
     * if its value is zero, in which case a single {@code '0'}
     * character is used).
     *
     * <p>Next, an <i>adjusted exponent</i> is calculated; this is the
     * negated scale, plus the number of characters in the converted
     * unscaled value, less one.  That is,
     * {@code -scale+(ulength-1)}, where {@code ulength} is the
     * length of the absolute value of the unscaled value in decimal
     * digits (its <i>precision</i>).
     *
     * <p>If the scale is greater than or equal to zero and the
     * adjusted exponent is greater than or equal to {@code -6}, the
     * number will be converted to a character form without using
     * exponential notation.  In this case, if the scale is zero then
     * no decimal point is added and if the scale is positive a
     * decimal point will be inserted with the scale specifying the
     * number of characters to the right of the decimal point.
     * {@code '0'} characters are added to the left of the converted
     * unscaled value as necessary.  If no character precedes the
     * decimal point after this insertion then a conventional
     * {@code '0'} character is prefixed.
     *
     * <p>Otherwise (that is, if the scale is negative, or the
     * adjusted exponent is less than {@code -6}), the number will be
     * converted to a character form using exponential notation.  In
     * this case, if the converted {@code BigInteger} has more than
     * one digit a decimal point is inserted after the first digit.
     * An exponent in character form is then suffixed to the converted
     * unscaled value (perhaps with inserted decimal point); this
     * comprises the letter {@code 'E'} followed immediately by the
     * adjusted exponent converted to a character form.  The latter is
     * in base ten, using the characters {@code '0'} through
     * {@code '9'} with no leading zeros, and is always prefixed by a
     * sign character {@code '-'} (<tt>'&#92;u002D'</tt>) if the
     * adjusted exponent is negative, {@code '+'}
     * (<tt>'&#92;u002B'</tt>) otherwise).
     *
     * <p>Finally, the entire string is prefixed by a minus sign
     * character {@code '-'} (<tt>'&#92;u002D'</tt>) if the unscaled
     * value is less than zero.  No sign character is prefixed if the
     * unscaled value is zero or positive.
     *
     * <p><b>Examples:</b>
     * <p>For each representation [<i>unscaled value</i>, <i>scale</i>]
     * on the left, the resulting string is shown on the right.
     * <pre>
     * [123,0]      "123"
     * [-123,0]     "-123"
     * [123,-1]     "1.23E+3"
     * [123,-3]     "1.23E+5"
     * [123,1]      "12.3"
     * [123,5]      "0.00123"
     * [123,10]     "1.23E-8"
     * [-123,12]    "-1.23E-10"
     * </pre>
     *
     * <b>Notes:</b>
     * <ol>
     *
     * <li>There is a one-to-one mapping between the distinguishable
     * {@code BigDecimal} values and the result of this conversion.
     * That is, every distinguishable {@code BigDecimal} value
     * (unscaled value and scale) has a unique string representation
     * as a result of using {@code toString}.  If that string
     * representation is converted back to a {@code BigDecimal} using
     * the {@link #BigDecimal(String)} constructor, then the original
     * value will be recovered.
     *
     * <li>The string produced for a given number is always the same;
     * it is not affected by locale.  This means that it can be used
     * as a canonical string representation for exchanging decimal
     * data, or as a key for a Hashtable, etc.  Locale-sensitive
     * number formatting and parsing is handled by the {@link
     * java.text.NumberFormat} class and its subclasses.
     *
     * <li>The {@link #toEngineeringString} method may be used for
     * presenting numbers with exponents in engineering notation, and the
     * {@link #setScale(int,RoundingMode) setScale} method may be used for
     * rounding a {@code BigDecimal} so it has a known number of digits after
     * the decimal point.
     *
     * <li>The digit-to-character mapping provided by
     * {@code Character.forDigit} is used.
     *
     * </ol>
     *
     * @return string representation of this {@code BigDecimal}.
     * @see    Character#forDigit
     * @see    #BigDecimal(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    @Override

    /**
     * Returns the hash code for this {@code BigDecimal}.  Note that
     * two {@code BigDecimal} objects that are numerically equal but
     * differ in scale (like 2.0 and 2.00) will generally <i>not</i>
     * have the same hash code.
     *
     * @return hash code for this {@code BigDecimal}.
     * @see #equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal max(BigDecimal val) {

    /**
     * Returns the maximum of this {@code BigDecimal} and {@code val}.
     *
     * @param  val value with which the maximum is to be computed.
     * @return the {@code BigDecimal} whose value is the greater of this
     *         {@code BigDecimal} and {@code val}.  If they are equal,
     *         as defined by the {@link #compareTo(BigDecimal) compareTo}
     *         method, {@code this} is returned.
     * @see    #compareTo(java.math.BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal min(BigDecimal val) {

    /**
     * Returns the minimum of this {@code BigDecimal} and
     * {@code val}.
     *
     * @param  val value with which the minimum is to be computed.
     * @return the {@code BigDecimal} whose value is the lesser of this
     *         {@code BigDecimal} and {@code val}.  If they are equal,
     *         as defined by the {@link #compareTo(BigDecimal) compareTo}
     *         method, {@code this} is returned.
     * @see    #compareTo(java.math.BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    @Override

    /**
     * Compares this {@code BigDecimal} with the specified
     * {@code Object} for equality.  Unlike {@link
     * #compareTo(BigDecimal) compareTo}, this method considers two
     * {@code BigDecimal} objects equal only if they are equal in
     * value and scale (thus 2.0 is not equal to 2.00 when compared by
     * this method).
     *
     * @param  x {@code Object} to which this {@code BigDecimal} is
     *         to be compared.
     * @return {@code true} if and only if the specified {@code Object} is a
     *         {@code BigDecimal} whose value and scale are equal to this
     *         {@code BigDecimal}'s.
     * @see    #compareTo(java.math.BigDecimal)
     * @see    #hashCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private int compareMagnitude(BigDecimal val) {

    /**
     * Version of compareTo that ignores sign.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int compareTo(BigDecimal val) {

    /**
     * Compares this {@code BigDecimal} with the specified
     * {@code BigDecimal}.  Two {@code BigDecimal} objects that are
     * equal in value but have a different scale (like 2.0 and 2.00)
     * are considered equal by this method.  This method is provided
     * in preference to individual methods for each of the six boolean
     * comparison operators ({@literal <}, ==,
     * {@literal >}, {@literal >=}, !=, {@literal <=}).  The
     * suggested idiom for performing these comparisons is:
     * {@code (x.compareTo(y)} &lt;<i>op</i>&gt; {@code 0)}, where
     * &lt;<i>op</i>&gt; is one of the six comparison operators.
     *
     * @param  val {@code BigDecimal} to which this {@code BigDecimal} is
     *         to be compared.
     * @return -1, 0, or 1 as this {@code BigDecimal} is numerically
     *          less than, equal to, or greater than {@code val}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal stripTrailingZeros() {

    /**
     * Returns a {@code BigDecimal} which is numerically equal to
     * this one but with any trailing zeros removed from the
     * representation.  For example, stripping the trailing zeros from
     * the {@code BigDecimal} value {@code 600.0}, which has
     * [{@code BigInteger}, {@code scale}] components equals to
     * [6000, 1], yields {@code 6E2} with [{@code BigInteger},
     * {@code scale}] components equals to [6, -2].  If
     * this BigDecimal is numerically equal to zero, then
     * {@code BigDecimal.ZERO} is returned.
     *
     * @return a numerically equal {@code BigDecimal} with any
     * trailing zeros removed.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal scaleByPowerOfTen(int n) {

    /**
     * Returns a BigDecimal whose numerical value is equal to
     * ({@code this} * 10<sup>n</sup>).  The scale of
     * the result is {@code (this.scale() - n)}.
     *
     * @param n the exponent power of ten to scale by
     * @return a BigDecimal whose numerical value is equal to
     * ({@code this} * 10<sup>n</sup>)
     * @throws ArithmeticException if the scale would be
     *         outside the range of a 32-bit integer.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal movePointRight(int n) {

    /**
     * Returns a {@code BigDecimal} which is equivalent to this one
     * with the decimal point moved {@code n} places to the right.
     * If {@code n} is non-negative, the call merely subtracts
     * {@code n} from the scale.  If {@code n} is negative, the call
     * is equivalent to {@code movePointLeft(-n)}.  The
     * {@code BigDecimal} returned by this call has value <tt>(this
     * &times; 10<sup>n</sup>)</tt> and scale {@code max(this.scale()-n,
     * 0)}.
     *
     * @param  n number of places to move the decimal point to the right.
     * @return a {@code BigDecimal} which is equivalent to this one
     *         with the decimal point moved {@code n} places to the right.
     * @throws ArithmeticException if scale overflows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal movePointLeft(int n) {

    /**
     * Returns a {@code BigDecimal} which is equivalent to this one
     * with the decimal point moved {@code n} places to the left.  If
     * {@code n} is non-negative, the call merely adds {@code n} to
     * the scale.  If {@code n} is negative, the call is equivalent
     * to {@code movePointRight(-n)}.  The {@code BigDecimal}
     * returned by this call has value <tt>(this &times;
     * 10<sup>-n</sup>)</tt> and scale {@code max(this.scale()+n,
     * 0)}.
     *
     * @param  n number of places to move the decimal point to the left.
     * @return a {@code BigDecimal} which is equivalent to this one with the
     *         decimal point moved {@code n} places to the left.
     * @throws ArithmeticException if scale overflows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal setScale(int newScale) {

    /**
     * Returns a {@code BigDecimal} whose scale is the specified
     * value, and whose value is numerically equal to this
     * {@code BigDecimal}'s.  Throws an {@code ArithmeticException}
     * if this is not possible.
     *
     * <p>This call is typically used to increase the scale, in which
     * case it is guaranteed that there exists a {@code BigDecimal}
     * of the specified scale and the correct value.  The call can
     * also be used to reduce the scale if the caller knows that the
     * {@code BigDecimal} has sufficiently many zeros at the end of
     * its fractional part (i.e., factors of ten in its integer value)
     * to allow for the rescaling without changing its value.
     *
     * <p>This method returns the same result as the two-argument
     * versions of {@code setScale}, but saves the caller the trouble
     * of specifying a rounding mode in cases where it is irrelevant.
     *
     * <p>Note that since {@code BigDecimal} objects are immutable,
     * calls of this method do <i>not</i> result in the original
     * object being modified, contrary to the usual convention of
     * having methods named <tt>set<i>X</i></tt> mutate field
     * <i>{@code X}</i>.  Instead, {@code setScale} returns an
     * object with the proper scale; the returned object may or may
     * not be newly allocated.
     *
     * @param  newScale scale of the {@code BigDecimal} value to be returned.
     * @return a {@code BigDecimal} whose scale is the specified value, and
     *         whose unscaled value is determined by multiplying or dividing
     *         this {@code BigDecimal}'s unscaled value by the appropriate
     *         power of ten to maintain its overall value.
     * @throws ArithmeticException if the specified scaling operation would
     *         require rounding.
     * @see    #setScale(int, int)
     * @see    #setScale(int, RoundingMode)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal setScale(int newScale, int roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose scale is the specified
     * value, and whose unscaled value is determined by multiplying or
     * dividing this {@code BigDecimal}'s unscaled value by the
     * appropriate power of ten to maintain its overall value.  If the
     * scale is reduced by the operation, the unscaled value must be
     * divided (rather than multiplied), and the value may be changed;
     * in this case, the specified rounding mode is applied to the
     * division.
     *
     * <p>Note that since BigDecimal objects are immutable, calls of
     * this method do <i>not</i> result in the original object being
     * modified, contrary to the usual convention of having methods
     * named <tt>set<i>X</i></tt> mutate field <i>{@code X}</i>.
     * Instead, {@code setScale} returns an object with the proper
     * scale; the returned object may or may not be newly allocated.
     *
     * <p>The new {@link #setScale(int, RoundingMode)} method should
     * be used in preference to this legacy method.
     *
     * @param  newScale scale of the {@code BigDecimal} value to be returned.
     * @param  roundingMode The rounding mode to apply.
     * @return a {@code BigDecimal} whose scale is the specified value,
     *         and whose unscaled value is determined by multiplying or
     *         dividing this {@code BigDecimal}'s unscaled value by the
     *         appropriate power of ten to maintain its overall value.
     * @throws ArithmeticException if {@code roundingMode==ROUND_UNNECESSARY}
     *         and the specified scaling operation would require
     *         rounding.
     * @throws IllegalArgumentException if {@code roundingMode} does not
     *         represent a valid rounding mode.
     * @see    #ROUND_UP
     * @see    #ROUND_DOWN
     * @see    #ROUND_CEILING
     * @see    #ROUND_FLOOR
     * @see    #ROUND_HALF_UP
     * @see    #ROUND_HALF_DOWN
     * @see    #ROUND_HALF_EVEN
     * @see    #ROUND_UNNECESSARY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal setScale(int newScale, RoundingMode roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose scale is the specified
     * value, and whose unscaled value is determined by multiplying or
     * dividing this {@code BigDecimal}'s unscaled value by the
     * appropriate power of ten to maintain its overall value.  If the
     * scale is reduced by the operation, the unscaled value must be
     * divided (rather than multiplied), and the value may be changed;
     * in this case, the specified rounding mode is applied to the
     * division.
     *
     * <p>Note that since BigDecimal objects are immutable, calls of
     * this method do <i>not</i> result in the original object being
     * modified, contrary to the usual convention of having methods
     * named <tt>set<i>X</i></tt> mutate field <i>{@code X}</i>.
     * Instead, {@code setScale} returns an object with the proper
     * scale; the returned object may or may not be newly allocated.
     *
     * @param  newScale scale of the {@code BigDecimal} value to be returned.
     * @param  roundingMode The rounding mode to apply.
     * @return a {@code BigDecimal} whose scale is the specified value,
     *         and whose unscaled value is determined by multiplying or
     *         dividing this {@code BigDecimal}'s unscaled value by the
     *         appropriate power of ten to maintain its overall value.
     * @throws ArithmeticException if {@code roundingMode==UNNECESSARY}
     *         and the specified scaling operation would require
     *         rounding.
     * @see    RoundingMode
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal round(MathContext mc) {

    /**
     * Returns a {@code BigDecimal} rounded according to the
     * {@code MathContext} settings.  If the precision setting is 0 then
     * no rounding takes place.
     *
     * <p>The effect of this method is identical to that of the
     * {@link #plus(MathContext)} method.
     *
     * @param mc the context to use.
     * @return a {@code BigDecimal} rounded according to the
     *         {@code MathContext} settings.
     * @throws ArithmeticException if the rounding mode is
     *         {@code UNNECESSARY} and the
     *         {@code BigDecimal}  operation would require rounding.
     * @see    #plus(MathContext)
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_UNNECESSARY =  7;

    /**
     * Rounding mode to assert that the requested operation has an exact
     * result, hence no rounding is necessary.  If this rounding mode is
     * specified on an operation that yields an inexact result, an
     * {@code ArithmeticException} is thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_HALF_EVEN =    6;

    /**
     * Rounding mode to round towards the {@literal "nearest neighbor"}
     * unless both neighbors are equidistant, in which case, round
     * towards the even neighbor.  Behaves as for
     * {@code ROUND_HALF_UP} if the digit to the left of the
     * discarded fraction is odd; behaves as for
     * {@code ROUND_HALF_DOWN} if it's even.  Note that this is the
     * rounding mode that minimizes cumulative error when applied
     * repeatedly over a sequence of calculations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_HALF_DOWN =    5;

    /**
     * Rounding mode to round towards {@literal "nearest neighbor"}
     * unless both neighbors are equidistant, in which case round
     * down.  Behaves as for {@code ROUND_UP} if the discarded
     * fraction is {@literal >} 0.5; otherwise, behaves as for
     * {@code ROUND_DOWN}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_HALF_UP =      4;

    /**
     * Rounding mode to round towards {@literal "nearest neighbor"}
     * unless both neighbors are equidistant, in which case round up.
     * Behaves as for {@code ROUND_UP} if the discarded fraction is
     * &ge; 0.5; otherwise, behaves as for {@code ROUND_DOWN}.  Note
     * that this is the rounding mode that most of us were taught in
     * grade school.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_FLOOR =        3;

    /**
     * Rounding mode to round towards negative infinity.  If the
     * {@code BigDecimal} is positive, behave as for
     * {@code ROUND_DOWN}; if negative, behave as for
     * {@code ROUND_UP}.  Note that this rounding mode never
     * increases the calculated value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_CEILING =      2;

    /**
     * Rounding mode to round towards positive infinity.  If the
     * {@code BigDecimal} is positive, behaves as for
     * {@code ROUND_UP}; if negative, behaves as for
     * {@code ROUND_DOWN}.  Note that this rounding mode never
     * decreases the calculated value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_DOWN =         1;

    /**
     * Rounding mode to round towards zero.  Never increments the digit
     * prior to a discarded fraction (i.e., truncates).  Note that this
     * rounding mode never increases the magnitude of the calculated value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public final static int ROUND_UP =           0;

    /**
     * Rounding mode to round away from zero.  Always increments the
     * digit prior to a nonzero discarded fraction.  Note that this rounding
     * mode never decreases the magnitude of the calculated value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigInteger unscaledValue() {

    /**
     * Returns a {@code BigInteger} whose value is the <i>unscaled
     * value</i> of this {@code BigDecimal}.  (Computes <tt>(this *
     * 10<sup>this.scale()</sup>)</tt>.)
     *
     * @return the unscaled value of this {@code BigDecimal}.
     * @since  1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int precision() {

    /**
     * Returns the <i>precision</i> of this {@code BigDecimal}.  (The
     * precision is the number of digits in the unscaled value.)
     *
     * <p>The precision of a zero value is 1.
     *
     * @return the precision of this {@code BigDecimal}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int scale() {

    /**
     * Returns the <i>scale</i> of this {@code BigDecimal}.  If zero
     * or positive, the scale is the number of digits to the right of
     * the decimal point.  If negative, the unscaled value of the
     * number is multiplied by ten to the power of the negation of the
     * scale.  For example, a scale of {@code -3} means the unscaled
     * value is multiplied by 1000.
     *
     * @return the scale of this {@code BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public int signum() {

    /**
     * Returns the signum function of this {@code BigDecimal}.
     *
     * @return -1, 0, or 1 as the value of this {@code BigDecimal}
     *         is negative, zero, or positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal plus(MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (+this)},
     * with rounding according to the context settings.
     *
     * <p>The effect of this method is identical to that of the {@link
     * #round(MathContext)} method.
     *
     * @param mc the context to use.
     * @return {@code this}, rounded as necessary.  A zero result will
     *         have a scale of 0.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @see    #round(MathContext)
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal plus() {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (+this)}, and whose
     * scale is {@code this.scale()}.
     *
     * <p>This method, which simply returns this {@code BigDecimal}
     * is included for symmetry with the unary minus method {@link
     * #negate()}.
     *
     * @return {@code this}.
     * @see #negate()
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal negate(MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (-this)},
     * with rounding according to the context settings.
     *
     * @param mc the context to use.
     * @return {@code -this}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal negate() {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (-this)},
     * and whose scale is {@code this.scale()}.
     *
     * @return {@code -this}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal abs(MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is the absolute value
     * of this {@code BigDecimal}, with rounding according to the
     * context settings.
     *
     * @param mc the context to use.
     * @return {@code abs(this)}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal abs() {

    /**
     * Returns a {@code BigDecimal} whose value is the absolute value
     * of this {@code BigDecimal}, and whose scale is
     * {@code this.scale()}.
     *
     * @return {@code abs(this)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal pow(int n, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is
     * <tt>(this<sup>n</sup>)</tt>.  The current implementation uses
     * the core algorithm defined in ANSI standard X3.274-1996 with
     * rounding according to the context settings.  In general, the
     * returned numerical value is within two ulps of the exact
     * numerical value for the chosen precision.  Note that future
     * releases may use a different algorithm with a decreased
     * allowable error bound and increased allowable exponent range.
     *
     * <p>The X3.274-1996 algorithm is:
     *
     * <ul>
     * <li> An {@code ArithmeticException} exception is thrown if
     *  <ul>
     *    <li>{@code abs(n) > 999999999}
     *    <li>{@code mc.precision == 0} and {@code n < 0}
     *    <li>{@code mc.precision > 0} and {@code n} has more than
     *    {@code mc.precision} decimal digits
     *  </ul>
     *
     * <li> if {@code n} is zero, {@link #ONE} is returned even if
     * {@code this} is zero, otherwise
     * <ul>
     *   <li> if {@code n} is positive, the result is calculated via
     *   the repeated squaring technique into a single accumulator.
     *   The individual multiplications with the accumulator use the
     *   same math context settings as in {@code mc} except for a
     *   precision increased to {@code mc.precision + elength + 1}
     *   where {@code elength} is the number of decimal digits in
     *   {@code n}.
     *
     *   <li> if {@code n} is negative, the result is calculated as if
     *   {@code n} were positive; this value is then divided into one
     *   using the working precision specified above.
     *
     *   <li> The final value from either the positive or negative case
     *   is then rounded to the destination precision.
     *   </ul>
     * </ul>
     *
     * @param  n power to raise this {@code BigDecimal} to.
     * @param  mc the context to use.
     * @return <tt>this<sup>n</sup></tt> using the ANSI standard X3.274-1996
     *         algorithm
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}, or {@code n} is out
     *         of range.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal pow(int n) {

    /**
     * Returns a {@code BigDecimal} whose value is
     * <tt>(this<sup>n</sup>)</tt>, The power is computed exactly, to
     * unlimited precision.
     *
     * <p>The parameter {@code n} must be in the range 0 through
     * 999999999, inclusive.  {@code ZERO.pow(0)} returns {@link
     * #ONE}.
     *
     * Note that future releases may expand the allowable exponent
     * range of this method.
     *
     * @param  n power to raise this {@code BigDecimal} to.
     * @return <tt>this<sup>n</sup></tt>
     * @throws ArithmeticException if {@code n} is out of range.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal[] divideAndRemainder(BigDecimal divisor, MathContext mc) {

    /**
     * Returns a two-element {@code BigDecimal} array containing the
     * result of {@code divideToIntegralValue} followed by the result of
     * {@code remainder} on the two operands calculated with rounding
     * according to the context settings.
     *
     * <p>Note that if both the integer quotient and remainder are
     * needed, this method is faster than using the
     * {@code divideToIntegralValue} and {@code remainder} methods
     * separately because the division need only be carried out once.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided,
     *         and the remainder computed.
     * @param  mc the context to use.
     * @return a two element {@code BigDecimal} array: the quotient
     *         (the result of {@code divideToIntegralValue}) is the
     *         initial element and the remainder is the final element.
     * @throws ArithmeticException if {@code divisor==0}
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}, or {@code mc.precision}
     *         {@literal >} 0 and the result of {@code this.divideToIntgralValue(divisor)} would
     *         require a precision of more than {@code mc.precision} digits.
     * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
     * @see    #remainder(java.math.BigDecimal, java.math.MathContext)
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal[] divideAndRemainder(BigDecimal divisor) {

    /**
     * Returns a two-element {@code BigDecimal} array containing the
     * result of {@code divideToIntegralValue} followed by the result of
     * {@code remainder} on the two operands.
     *
     * <p>Note that if both the integer quotient and remainder are
     * needed, this method is faster than using the
     * {@code divideToIntegralValue} and {@code remainder} methods
     * separately because the division need only be carried out once.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided,
     *         and the remainder computed.
     * @return a two element {@code BigDecimal} array: the quotient
     *         (the result of {@code divideToIntegralValue}) is the initial element
     *         and the remainder is the final element.
     * @throws ArithmeticException if {@code divisor==0}
     * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
     * @see    #remainder(java.math.BigDecimal, java.math.MathContext)
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal remainder(BigDecimal divisor, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this %
     * divisor)}, with rounding according to the context settings.
     * The {@code MathContext} settings affect the implicit divide
     * used to compute the remainder.  The remainder computation
     * itself is by definition exact.  Therefore, the remainder may
     * contain more than {@code mc.getPrecision()} digits.
     *
     * <p>The remainder is given by
     * {@code this.subtract(this.divideToIntegralValue(divisor,
     * mc).multiply(divisor))}.  Note that this is not the modulo
     * operation (the result can be negative).
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  mc the context to use.
     * @return {@code this % divisor}, rounded as necessary.
     * @throws ArithmeticException if {@code divisor==0}
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}, or {@code mc.precision}
     *         {@literal >} 0 and the result of {@code this.divideToIntgralValue(divisor)} would
     *         require a precision of more than {@code mc.precision} digits.
     * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal remainder(BigDecimal divisor) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this % divisor)}.
     *
     * <p>The remainder is given by
     * {@code this.subtract(this.divideToIntegralValue(divisor).multiply(divisor))}.
     * Note that this is not the modulo operation (the result can be
     * negative).
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @return {@code this % divisor}.
     * @throws ArithmeticException if {@code divisor==0}
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is the integer part
     * of {@code (this / divisor)}.  Since the integer part of the
     * exact quotient does not depend on the rounding mode, the
     * rounding mode does not affect the values returned by this
     * method.  The preferred scale of the result is
     * {@code (this.scale() - divisor.scale())}.  An
     * {@code ArithmeticException} is thrown if the integer part of
     * the exact quotient needs more than {@code mc.precision}
     * digits.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  mc the context to use.
     * @return The integer part of {@code this / divisor}.
     * @throws ArithmeticException if {@code divisor==0}
     * @throws ArithmeticException if {@code mc.precision} {@literal >} 0 and the result
     *         requires a precision of more than {@code mc.precision} digits.
     * @since  1.5
     * @author Joseph D. Darcy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divideToIntegralValue(BigDecimal divisor) {

    /**
     * Returns a {@code BigDecimal} whose value is the integer part
     * of the quotient {@code (this / divisor)} rounded down.  The
     * preferred scale of the result is {@code (this.scale() -
     * divisor.scale())}.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @return The integer part of {@code this / divisor}.
     * @throws ArithmeticException if {@code divisor==0}
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, with rounding according to the context settings.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  mc the context to use.
     * @return {@code this / divisor}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY} or
     *         {@code mc.precision == 0} and the quotient has a
     *         non-terminating decimal expansion.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, and whose preferred scale is {@code (this.scale() -
     * divisor.scale())}; if the exact quotient cannot be
     * represented (because it has a non-terminating decimal
     * expansion) an {@code ArithmeticException} is thrown.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @throws ArithmeticException if the exact quotient does not have a
     *         terminating decimal expansion
     * @return {@code this / divisor}
     * @since 1.5
     * @author Joseph D. Darcy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, and whose scale is {@code this.scale()}.  If
     * rounding must be performed to generate a result with the given
     * scale, the specified rounding mode is applied.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  roundingMode rounding mode to apply.
     * @return {@code this / divisor}
     * @throws ArithmeticException if {@code divisor==0}, or
     *         {@code roundingMode==RoundingMode.UNNECESSARY} and
     *         {@code this.scale()} is insufficient to represent the result
     *         of the division exactly.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor, int roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, and whose scale is {@code this.scale()}.  If
     * rounding must be performed to generate a result with the given
     * scale, the specified rounding mode is applied.
     *
     * <p>The new {@link #divide(BigDecimal, RoundingMode)} method
     * should be used in preference to this legacy method.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  roundingMode rounding mode to apply.
     * @return {@code this / divisor}
     * @throws ArithmeticException if {@code divisor==0}, or
     *         {@code roundingMode==ROUND_UNNECESSARY} and
     *         {@code this.scale()} is insufficient to represent the result
     *         of the division exactly.
     * @throws IllegalArgumentException if {@code roundingMode} does not
     *         represent a valid rounding mode.
     * @see    #ROUND_UP
     * @see    #ROUND_DOWN
     * @see    #ROUND_CEILING
     * @see    #ROUND_FLOOR
     * @see    #ROUND_HALF_UP
     * @see    #ROUND_HALF_DOWN
     * @see    #ROUND_HALF_EVEN
     * @see    #ROUND_UNNECESSARY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, and whose scale is as specified.  If rounding must
     * be performed to generate a result with the specified scale, the
     * specified rounding mode is applied.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  scale scale of the {@code BigDecimal} quotient to be returned.
     * @param  roundingMode rounding mode to apply.
     * @return {@code this / divisor}
     * @throws ArithmeticException if {@code divisor} is zero,
     *         {@code roundingMode==RoundingMode.UNNECESSARY} and
     *         the specified scale is insufficient to represent the result
     *         of the division exactly.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this /
     * divisor)}, and whose scale is as specified.  If rounding must
     * be performed to generate a result with the specified scale, the
     * specified rounding mode is applied.
     *
     * <p>The new {@link #divide(BigDecimal, int, RoundingMode)} method
     * should be used in preference to this legacy method.
     *
     * @param  divisor value by which this {@code BigDecimal} is to be divided.
     * @param  scale scale of the {@code BigDecimal} quotient to be returned.
     * @param  roundingMode rounding mode to apply.
     * @return {@code this / divisor}
     * @throws ArithmeticException if {@code divisor} is zero,
     *         {@code roundingMode==ROUND_UNNECESSARY} and
     *         the specified scale is insufficient to represent the result
     *         of the division exactly.
     * @throws IllegalArgumentException if {@code roundingMode} does not
     *         represent a valid rounding mode.
     * @see    #ROUND_UP
     * @see    #ROUND_DOWN
     * @see    #ROUND_CEILING
     * @see    #ROUND_FLOOR
     * @see    #ROUND_HALF_UP
     * @see    #ROUND_HALF_DOWN
     * @see    #ROUND_HALF_EVEN
     * @see    #ROUND_UNNECESSARY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal multiply(BigDecimal multiplicand, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is <tt>(this &times;
     * multiplicand)</tt>, with rounding according to the context settings.
     *
     * @param  multiplicand value to be multiplied by this {@code BigDecimal}.
     * @param  mc the context to use.
     * @return {@code this * multiplicand}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal multiply(BigDecimal multiplicand) {

    /**
     * Returns a {@code BigDecimal} whose value is <tt>(this &times;
     * multiplicand)</tt>, and whose scale is {@code (this.scale() +
     * multiplicand.scale())}.
     *
     * @param  multiplicand value to be multiplied by this {@code BigDecimal}.
     * @return {@code this * multiplicand}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal subtract(BigDecimal subtrahend, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this - subtrahend)},
     * with rounding according to the context settings.
     *
     * If {@code subtrahend} is zero then this, rounded if necessary, is used as the
     * result.  If this is zero then the result is {@code subtrahend.negate(mc)}.
     *
     * @param  subtrahend value to be subtracted from this {@code BigDecimal}.
     * @param  mc the context to use.
     * @return {@code this - subtrahend}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal subtract(BigDecimal subtrahend) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this -
     * subtrahend)}, and whose scale is {@code max(this.scale(),
     * subtrahend.scale())}.
     *
     * @param  subtrahend value to be subtracted from this {@code BigDecimal}.
     * @return {@code this - subtrahend}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private BigDecimal[] preAlign(BigDecimal lhs, BigDecimal augend, long padding, MathContext mc) {

    /**
     * Returns an array of length two, the sum of whose entries is
     * equal to the rounded sum of the {@code BigDecimal} arguments.
     *
     * <p>If the digit positions of the arguments have a sufficient
     * gap between them, the value smaller in magnitude can be
     * condensed into a {@literal "sticky bit"} and the end result will
     * round the same way <em>if</em> the precision of the final
     * result does not include the high order digit of the small
     * magnitude operand.
     *
     * <p>Note that while strictly speaking this is an optimization,
     * it makes a much wider range of additions practical.
     *
     * <p>This corresponds to a pre-shift operation in a fixed
     * precision floating-point adder; this method is complicated by
     * variable precision of the result as determined by the
     * MathContext.  A more nuanced operation could implement a
     * {@literal "right shift"} on the smaller magnitude operand so
     * that the number of digits of the smaller operand could be
     * reduced even though the significands partially overlapped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal add(BigDecimal augend, MathContext mc) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this + augend)},
     * with rounding according to the context settings.
     *
     * If either number is zero and the precision setting is nonzero then
     * the other number, rounded if necessary, is used as the result.
     *
     * @param  augend value to be added to this {@code BigDecimal}.
     * @param  mc the context to use.
     * @return {@code this + augend}, rounded as necessary.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal add(BigDecimal augend) {

    /**
     * Returns a {@code BigDecimal} whose value is {@code (this +
     * augend)}, and whose scale is {@code max(this.scale(),
     * augend.scale())}.
     *
     * @param  augend value to be added to this {@code BigDecimal}.
     * @return {@code this + augend}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static BigDecimal valueOf(double val) {

    /**
     * Translates a {@code double} into a {@code BigDecimal}, using
     * the {@code double}'s canonical string representation provided
     * by the {@link Double#toString(double)} method.
     *
     * <p><b>Note:</b> This is generally the preferred way to convert
     * a {@code double} (or {@code float}) into a
     * {@code BigDecimal}, as the value returned is equal to that
     * resulting from constructing a {@code BigDecimal} from the
     * result of using {@link Double#toString(double)}.
     *
     * @param  val {@code double} to convert to a {@code BigDecimal}.
     * @return a {@code BigDecimal} whose value is equal to or approximately
     *         equal to the value of {@code val}.
     * @throws NumberFormatException if {@code val} is infinite or NaN.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static BigDecimal valueOf(long val) {

    /**
     * Translates a {@code long} value into a {@code BigDecimal}
     * with a scale of zero.  This {@literal "static factory method"}
     * is provided in preference to a ({@code long}) constructor
     * because it allows for reuse of frequently used
     * {@code BigDecimal} values.
     *
     * @param val value of the {@code BigDecimal}.
     * @return a {@code BigDecimal} whose value is {@code val}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static BigDecimal valueOf(long unscaledVal, int scale) {

    /**
     * Translates a {@code long} unscaled value and an
     * {@code int} scale into a {@code BigDecimal}.  This
     * {@literal "static factory method"} is provided in preference to
     * a ({@code long}, {@code int}) constructor because it
     * allows for reuse of frequently used {@code BigDecimal} values..
     *
     * @param unscaledVal unscaled value of the {@code BigDecimal}.
     * @param scale scale of the {@code BigDecimal}.
     * @return a {@code BigDecimal} whose value is
     *         <tt>(unscaledVal &times; 10<sup>-scale</sup>)</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(long val, MathContext mc) {

    /**
     * Translates a {@code long} into a {@code BigDecimal}, with
     * rounding according to the context settings.  The scale of the
     * {@code BigDecimal}, before any rounding, is zero.
     *
     * @param  val {@code long} value to be converted to {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(long val) {

    /**
     * Translates a {@code long} into a {@code BigDecimal}.  The
     * scale of the {@code BigDecimal} is zero.
     *
     * @param val {@code long} value to be converted to {@code BigDecimal}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(int val, MathContext mc) {

    /**
     * Translates an {@code int} into a {@code BigDecimal}, with
     * rounding according to the context settings.  The scale of the
     * {@code BigDecimal}, before any rounding, is zero.
     *
     * @param  val {@code int} value to be converted to {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(int val) {

    /**
     * Translates an {@code int} into a {@code BigDecimal}.  The
     * scale of the {@code BigDecimal} is zero.
     *
     * @param val {@code int} value to be converted to
     *            {@code BigDecimal}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(BigInteger unscaledVal, int scale, MathContext mc) {

    /**
     * Translates a {@code BigInteger} unscaled value and an
     * {@code int} scale into a {@code BigDecimal}, with rounding
     * according to the context settings.  The value of the
     * {@code BigDecimal} is <tt>(unscaledVal &times;
     * 10<sup>-scale</sup>)</tt>, rounded according to the
     * {@code precision} and rounding mode settings.
     *
     * @param  unscaledVal unscaled value of the {@code BigDecimal}.
     * @param  scale scale of the {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(BigInteger unscaledVal, int scale) {

    /**
     * Translates a {@code BigInteger} unscaled value and an
     * {@code int} scale into a {@code BigDecimal}.  The value of
     * the {@code BigDecimal} is
     * <tt>(unscaledVal &times; 10<sup>-scale</sup>)</tt>.
     *
     * @param unscaledVal unscaled value of the {@code BigDecimal}.
     * @param scale scale of the {@code BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(BigInteger val, MathContext mc) {

    /**
     * Translates a {@code BigInteger} into a {@code BigDecimal}
     * rounding according to the context settings.  The scale of the
     * {@code BigDecimal} is zero.
     *
     * @param val {@code BigInteger} value to be converted to
     *            {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(BigInteger val) {

    /**
     * Translates a {@code BigInteger} into a {@code BigDecimal}.
     * The scale of the {@code BigDecimal} is zero.
     *
     * @param val {@code BigInteger} value to be converted to
     *            {@code BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(double val, MathContext mc) {

    /**
     * Translates a {@code double} into a {@code BigDecimal}, with
     * rounding according to the context settings.  The scale of the
     * {@code BigDecimal} is the smallest value such that
     * <tt>(10<sup>scale</sup> &times; val)</tt> is an integer.
     *
     * <p>The results of this constructor can be somewhat unpredictable
     * and its use is generally not recommended; see the notes under
     * the {@link #BigDecimal(double)} constructor.
     *
     * @param  val {@code double} value to be converted to
     *         {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         RoundingMode is UNNECESSARY.
     * @throws NumberFormatException if {@code val} is infinite or NaN.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(double val) {

    /**
     * Translates a {@code double} into a {@code BigDecimal} which
     * is the exact decimal representation of the {@code double}'s
     * binary floating-point value.  The scale of the returned
     * {@code BigDecimal} is the smallest value such that
     * <tt>(10<sup>scale</sup> &times; val)</tt> is an integer.
     * <p>
     * <b>Notes:</b>
     * <ol>
     * <li>
     * The results of this constructor can be somewhat unpredictable.
     * One might assume that writing {@code new BigDecimal(0.1)} in
     * Java creates a {@code BigDecimal} which is exactly equal to
     * 0.1 (an unscaled value of 1, with a scale of 1), but it is
     * actually equal to
     * 0.1000000000000000055511151231257827021181583404541015625.
     * This is because 0.1 cannot be represented exactly as a
     * {@code double} (or, for that matter, as a binary fraction of
     * any finite length).  Thus, the value that is being passed
     * <i>in</i> to the constructor is not exactly equal to 0.1,
     * appearances notwithstanding.
     *
     * <li>
     * The {@code String} constructor, on the other hand, is
     * perfectly predictable: writing {@code new BigDecimal("0.1")}
     * creates a {@code BigDecimal} which is <i>exactly</i> equal to
     * 0.1, as one would expect.  Therefore, it is generally
     * recommended that the {@linkplain #BigDecimal(String)
     * <tt>String</tt> constructor} be used in preference to this one.
     *
     * <li>
     * When a {@code double} must be used as a source for a
     * {@code BigDecimal}, note that this constructor provides an
     * exact conversion; it does not give the same result as
     * converting the {@code double} to a {@code String} using the
     * {@link Double#toString(double)} method and then using the
     * {@link #BigDecimal(String)} constructor.  To get that result,
     * use the {@code static} {@link #valueOf(double)} method.
     * </ol>
     *
     * @param val {@code double} value to be converted to
     *        {@code BigDecimal}.
     * @throws NumberFormatException if {@code val} is infinite or NaN.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(String val, MathContext mc) {

    /**
     * Translates the string representation of a {@code BigDecimal}
     * into a {@code BigDecimal}, accepting the same strings as the
     * {@link #BigDecimal(String)} constructor, with rounding
     * according to the context settings.
     *
     * @param  val string representation of a {@code BigDecimal}.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @throws NumberFormatException if {@code val} is not a valid
     *         representation of a BigDecimal.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(String val) {

    /**
     * Translates the string representation of a {@code BigDecimal}
     * into a {@code BigDecimal}.  The string representation consists
     * of an optional sign, {@code '+'} (<tt> '&#92;u002B'</tt>) or
     * {@code '-'} (<tt>'&#92;u002D'</tt>), followed by a sequence of
     * zero or more decimal digits ("the integer"), optionally
     * followed by a fraction, optionally followed by an exponent.
     *
     * <p>The fraction consists of a decimal point followed by zero
     * or more decimal digits.  The string must contain at least one
     * digit in either the integer or the fraction.  The number formed
     * by the sign, the integer and the fraction is referred to as the
     * <i>significand</i>.
     *
     * <p>The exponent consists of the character {@code 'e'}
     * (<tt>'&#92;u0065'</tt>) or {@code 'E'} (<tt>'&#92;u0045'</tt>)
     * followed by one or more decimal digits.  The value of the
     * exponent must lie between -{@link Integer#MAX_VALUE} ({@link
     * Integer#MIN_VALUE}+1) and {@link Integer#MAX_VALUE}, inclusive.
     *
     * <p>More formally, the strings this constructor accepts are
     * described by the following grammar:
     * <blockquote>
     * <dl>
     * <dt><i>BigDecimalString:</i>
     * <dd><i>Sign<sub>opt</sub> Significand Exponent<sub>opt</sub></i>
     * <dt><i>Sign:</i>
     * <dd>{@code +}
     * <dd>{@code -}
     * <dt><i>Significand:</i>
     * <dd><i>IntegerPart</i> {@code .} <i>FractionPart<sub>opt</sub></i>
     * <dd>{@code .} <i>FractionPart</i>
     * <dd><i>IntegerPart</i>
     * <dt><i>IntegerPart:</i>
     * <dd><i>Digits</i>
     * <dt><i>FractionPart:</i>
     * <dd><i>Digits</i>
     * <dt><i>Exponent:</i>
     * <dd><i>ExponentIndicator SignedInteger</i>
     * <dt><i>ExponentIndicator:</i>
     * <dd>{@code e}
     * <dd>{@code E}
     * <dt><i>SignedInteger:</i>
     * <dd><i>Sign<sub>opt</sub> Digits</i>
     * <dt><i>Digits:</i>
     * <dd><i>Digit</i>
     * <dd><i>Digits Digit</i>
     * <dt><i>Digit:</i>
     * <dd>any character for which {@link Character#isDigit}
     * returns {@code true}, including 0, 1, 2 ...
     * </dl>
     * </blockquote>
     *
     * <p>The scale of the returned {@code BigDecimal} will be the
     * number of digits in the fraction, or zero if the string
     * contains no decimal point, subject to adjustment for any
     * exponent; if the string contains an exponent, the exponent is
     * subtracted from the scale.  The value of the resulting scale
     * must lie between {@code Integer.MIN_VALUE} and
     * {@code Integer.MAX_VALUE}, inclusive.
     *
     * <p>The character-to-digit mapping is provided by {@link
     * java.lang.Character#digit} set to convert to radix 10.  The
     * String may not contain any extraneous characters (whitespace,
     * for example).
     *
     * <p><b>Examples:</b><br>
     * The value of the returned {@code BigDecimal} is equal to
     * <i>significand</i> &times; 10<sup>&nbsp;<i>exponent</i></sup>.
     * For each string on the left, the resulting representation
     * [{@code BigInteger}, {@code scale}] is shown on the right.
     * <pre>
     * "0"            [0,0]
     * "0.00"         [0,2]
     * "123"          [123,0]
     * "-123"         [-123,0]
     * "1.23E3"       [123,-1]
     * "1.23E+3"      [123,-1]
     * "12.3E+7"      [123,-6]
     * "12.0"         [120,1]
     * "12.3"         [123,1]
     * "0.00123"      [123,5]
     * "-1.23E-12"    [-123,14]
     * "1234.5E-4"    [12345,5]
     * "0E+7"         [0,-7]
     * "-0"           [0,0]
     * </pre>
     *
     * <p>Note: For values other than {@code float} and
     * {@code double} NaN and &plusmn;Infinity, this constructor is
     * compatible with the values returned by {@link Float#toString}
     * and {@link Double#toString}.  This is generally the preferred
     * way to convert a {@code float} or {@code double} into a
     * BigDecimal, as it doesn't suffer from the unpredictability of
     * the {@link #BigDecimal(double)} constructor.
     *
     * @param val String representation of {@code BigDecimal}.
     *
     * @throws NumberFormatException if {@code val} is not a valid
     *         representation of a {@code BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(char[] in, MathContext mc) {

    /**
     * Translates a character array representation of a
     * {@code BigDecimal} into a {@code BigDecimal}, accepting the
     * same sequence of characters as the {@link #BigDecimal(String)}
     * constructor and with rounding according to the context
     * settings.
     *
     * <p>Note that if the sequence of characters is already available
     * as a character array, using this constructor is faster than
     * converting the {@code char} array to string and using the
     * {@code BigDecimal(String)} constructor .
     *
     * @param  in {@code char} array that is the source of characters.
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @throws NumberFormatException if {@code in} is not a valid
     *         representation of a {@code BigDecimal}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(char[] in) {

    /**
     * Translates a character array representation of a
     * {@code BigDecimal} into a {@code BigDecimal}, accepting the
     * same sequence of characters as the {@link #BigDecimal(String)}
     * constructor.
     *
     * <p>Note that if the sequence of characters is already available
     * as a character array, using this constructor is faster than
     * converting the {@code char} array to string and using the
     * {@code BigDecimal(String)} constructor .
     *
     * @param in {@code char} array that is the source of characters.
     * @throws NumberFormatException if {@code in} is not a valid
     *         representation of a {@code BigDecimal}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(char[] in, int offset, int len, MathContext mc) {

    /**
     * Translates a character array representation of a
     * {@code BigDecimal} into a {@code BigDecimal}, accepting the
     * same sequence of characters as the {@link #BigDecimal(String)}
     * constructor, while allowing a sub-array to be specified and
     * with rounding according to the context settings.
     *
     * <p>Note that if the sequence of characters is already available
     * within a character array, using this constructor is faster than
     * converting the {@code char} array to string and using the
     * {@code BigDecimal(String)} constructor .
     *
     * @param  in {@code char} array that is the source of characters.
     * @param  offset first character in the array to inspect.
     * @param  len number of characters to consider..
     * @param  mc the context to use.
     * @throws ArithmeticException if the result is inexact but the
     *         rounding mode is {@code UNNECESSARY}.
     * @throws NumberFormatException if {@code in} is not a valid
     *         representation of a {@code BigDecimal} or the defined subarray
     *         is not wholly within {@code in}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public BigDecimal(char[] in, int offset, int len) {

    /**
     * Translates a character array representation of a
     * {@code BigDecimal} into a {@code BigDecimal}, accepting the
     * same sequence of characters as the {@link #BigDecimal(String)}
     * constructor, while allowing a sub-array to be specified.
     *
     * <p>Note that if the sequence of characters is already available
     * within a character array, using this constructor is faster than
     * converting the {@code char} array to string and using the
     * {@code BigDecimal(String)} constructor .
     *
     * @param  in {@code char} array that is the source of characters.
     * @param  offset first character in the array to inspect.
     * @param  len number of characters to consider.
     * @throws NumberFormatException if {@code in} is not a valid
     *         representation of a {@code BigDecimal} or the defined subarray
     *         is not wholly within {@code in}.
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    BigDecimal(BigInteger intVal, long val, int scale, int prec) {

    /**
     * Trusted package private constructor.
     * Trusted simply means if val is INFLATED, intVal could not be null and
     * if intVal is null, val could not be INFLATED.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static final BigDecimal TEN =

    /**
     * The value 10, with a scale of 0.
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static final BigDecimal ONE =

    /**
     * The value 1, with a scale of 0.
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    public static final BigDecimal ZERO =

    /**
     * The value 0, with a scale of 0.
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private final transient long intCompact;

    /**
     * If the absolute value of the significand of this BigDecimal is
     * less than or equal to {@code Long.MAX_VALUE}, the value can be
     * compactly stored in this field and used in computations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    static final long INFLATED = Long.MIN_VALUE;

    /**
     * Sentinel value for {@link #intCompact} indicating the
     * significand information is only available from {@code intVal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private transient String stringCache;

    /**
     * Used to store the canonical string representation, if computed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private transient int precision;

    /**
     * The number of decimal digits in this BigDecimal, or 0 if the
     * number of digits are not known (lookaside information).  If
     * nonzero, the value is guaranteed correct.  Use the precision()
     * method to obtain and set the value if it might be 0.  This
     * field is mutable until set nonzero.
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
    private final int scale;  // Note: this may have any value, so

    /**
     * The scale of this BigDecimal, as returned by {@link #scale}.
     *
     * @serial
     * @see #scale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigDecimal.java
public class BigDecimal extends Number implements Comparable<BigDecimal> {

/**
 * Immutable, arbitrary-precision signed decimal numbers.  A
 * {@code BigDecimal} consists of an arbitrary precision integer
 * <i>unscaled value</i> and a 32-bit integer <i>scale</i>.  If zero
 * or positive, the scale is the number of digits to the right of the
 * decimal point.  If negative, the unscaled value of the number is
 * multiplied by ten to the power of the negation of the scale.  The
 * value of the number represented by the {@code BigDecimal} is
 * therefore <tt>(unscaledValue &times; 10<sup>-scale</sup>)</tt>.
 *
 * <p>The {@code BigDecimal} class provides operations for
 * arithmetic, scale manipulation, rounding, comparison, hashing, and
 * format conversion.  The {@link #toString} method provides a
 * canonical representation of a {@code BigDecimal}.
 *
 * <p>The {@code BigDecimal} class gives its user complete control
 * over rounding behavior.  If no rounding mode is specified and the
 * exact result cannot be represented, an exception is thrown;
 * otherwise, calculations can be carried out to a chosen precision
 * and rounding mode by supplying an appropriate {@link MathContext}
 * object to the operation.  In either case, eight <em>rounding
 * modes</em> are provided for the control of rounding.  Using the
 * integer fields in this class (such as {@link #ROUND_HALF_UP}) to
 * represent rounding mode is largely obsolete; the enumeration values
 * of the {@code RoundingMode} {@code enum}, (such as {@link
 * RoundingMode#HALF_UP}) should be used instead.
 *
 * <p>When a {@code MathContext} object is supplied with a precision
 * setting of 0 (for example, {@link MathContext#UNLIMITED}),
 * arithmetic operations are exact, as are the arithmetic methods
 * which take no {@code MathContext} object.  (This is the only
 * behavior that was supported in releases prior to 5.)  As a
 * corollary of computing the exact result, the rounding mode setting
 * of a {@code MathContext} object with a precision setting of 0 is
 * not used and thus irrelevant.  In the case of divide, the exact
 * quotient could have an infinitely long decimal expansion; for
 * example, 1 divided by 3.  If the quotient has a nonterminating
 * decimal expansion and the operation is specified to return an exact
 * result, an {@code ArithmeticException} is thrown.  Otherwise, the
 * exact result of the division is returned, as done for other
 * operations.
 *
 * <p>When the precision setting is not 0, the rules of
 * {@code BigDecimal} arithmetic are broadly compatible with selected
 * modes of operation of the arithmetic defined in ANSI X3.274-1996
 * and ANSI X3.274-1996/AM 1-2000 (section 7.4).  Unlike those
 * standards, {@code BigDecimal} includes many rounding modes, which
 * were mandatory for division in {@code BigDecimal} releases prior
 * to 5.  Any conflicts between these ANSI standards and the
 * {@code BigDecimal} specification are resolved in favor of
 * {@code BigDecimal}.
 *
 * <p>Since the same numerical value can have different
 * representations (with different scales), the rules of arithmetic
 * and rounding must specify both the numerical result and the scale
 * used in the result's representation.
 *
 *
 * <p>In general the rounding modes and precision setting determine
 * how operations return results with a limited number of digits when
 * the exact result has more digits (perhaps infinitely many in the
 * case of division) than the number of digits returned.
 *
 * First, the
 * total number of digits to return is specified by the
 * {@code MathContext}'s {@code precision} setting; this determines
 * the result's <i>precision</i>.  The digit count starts from the
 * leftmost nonzero digit of the exact result.  The rounding mode
 * determines how any discarded trailing digits affect the returned
 * result.
 *
 * <p>For all arithmetic operators , the operation is carried out as
 * though an exact intermediate result were first calculated and then
 * rounded to the number of digits specified by the precision setting
 * (if necessary), using the selected rounding mode.  If the exact
 * result is not returned, some digit positions of the exact result
 * are discarded.  When rounding increases the magnitude of the
 * returned result, it is possible for a new digit position to be
 * created by a carry propagating to a leading {@literal "9"} digit.
 * For example, rounding the value 999.9 to three digits rounding up
 * would be numerically equal to one thousand, represented as
 * 100&times;10<sup>1</sup>.  In such cases, the new {@literal "1"} is
 * the leading digit position of the returned result.
 *
 * <p>Besides a logical exact result, each arithmetic operation has a
 * preferred scale for representing a result.  The preferred
 * scale for each operation is listed in the table below.
 *
 * <table border>
 * <caption><b>Preferred Scales for Results of Arithmetic Operations
 * </b></caption>
 * <tr><th>Operation</th><th>Preferred Scale of Result</th></tr>
 * <tr><td>Add</td><td>max(addend.scale(), augend.scale())</td>
 * <tr><td>Subtract</td><td>max(minuend.scale(), subtrahend.scale())</td>
 * <tr><td>Multiply</td><td>multiplier.scale() + multiplicand.scale()</td>
 * <tr><td>Divide</td><td>dividend.scale() - divisor.scale()</td>
 * </table>
 *
 * These scales are the ones used by the methods which return exact
 * arithmetic results; except that an exact divide may have to use a
 * larger scale since the exact result may have more digits.  For
 * example, {@code 1/32} is {@code 0.03125}.
 *
 * <p>Before rounding, the scale of the logical exact intermediate
 * result is the preferred scale for that operation.  If the exact
 * numerical result cannot be represented in {@code precision}
 * digits, rounding selects the set of digits to return and the scale
 * of the result is reduced from the scale of the intermediate result
 * to the least scale which can represent the {@code precision}
 * digits actually returned.  If the exact result can be represented
 * with at most {@code precision} digits, the representation
 * of the result with the scale closest to the preferred scale is
 * returned.  In particular, an exactly representable quotient may be
 * represented in fewer than {@code precision} digits by removing
 * trailing zeros and decreasing the scale.  For example, rounding to
 * three digits using the {@linkplain RoundingMode#FLOOR floor}
 * rounding mode, <br>
 *
 * {@code 19/100 = 0.19   // integer=19,  scale=2} <br>
 *
 * but<br>
 *
 * {@code 21/110 = 0.190  // integer=190, scale=3} <br>
 *
 * <p>Note that for add, subtract, and multiply, the reduction in
 * scale will equal the number of digit positions of the exact result
 * which are discarded. If the rounding causes a carry propagation to
 * create a new high-order digit position, an additional digit of the
 * result is discarded than when no new digit position is created.
 *
 * <p>Other methods may have slightly different rounding semantics.
 * For example, the result of the {@code pow} method using the
 * {@linkplain #pow(int, MathContext) specified algorithm} can
 * occasionally differ from the rounded mathematical result by more
 * than one unit in the last place, one <i>{@linkplain #ulp() ulp}</i>.
 *
 * <p>Two types of operations are provided for manipulating the scale
 * of a {@code BigDecimal}: scaling/rounding operations and decimal
 * point motion operations.  Scaling/rounding operations ({@link
 * #setScale setScale} and {@link #round round}) return a
 * {@code BigDecimal} whose value is approximately (or exactly) equal
 * to that of the operand, but whose scale or precision is the
 * specified value; that is, they increase or decrease the precision
 * of the stored number with minimal effect on its value.  Decimal
 * point motion operations ({@link #movePointLeft movePointLeft} and
 * {@link #movePointRight movePointRight}) return a
 * {@code BigDecimal} created from the operand by moving the decimal
 * point a specified distance in the specified direction.
 *
 * <p>For the sake of brevity and clarity, pseudo-code is used
 * throughout the descriptions of {@code BigDecimal} methods.  The
 * pseudo-code expression {@code (i + j)} is shorthand for "a
 * {@code BigDecimal} whose value is that of the {@code BigDecimal}
 * {@code i} added to that of the {@code BigDecimal}
 * {@code j}." The pseudo-code expression {@code (i == j)} is
 * shorthand for "{@code true} if and only if the
 * {@code BigDecimal} {@code i} represents the same value as the
 * {@code BigDecimal} {@code j}." Other pseudo-code expressions
 * are interpreted similarly.  Square brackets are used to represent
 * the particular {@code BigInteger} and scale pair defining a
 * {@code BigDecimal} value; for example [19, 2] is the
 * {@code BigDecimal} numerically equal to 0.19 having a scale of 2.
 *
 * <p>Note: care should be exercised if {@code BigDecimal} objects
 * are used as keys in a {@link java.util.SortedMap SortedMap} or
 * elements in a {@link java.util.SortedSet SortedSet} since
 * {@code BigDecimal}'s <i>natural ordering</i> is <i>inconsistent
 * with equals</i>.  See {@link Comparable}, {@link
 * java.util.SortedMap} or {@link java.util.SortedSet} for more
 * information.
 *
 * <p>All methods and constructors for this class throw
 * {@code NullPointerException} when passed a {@code null} object
 * reference for any input parameter.
 *
 * @see     BigInteger
 * @see     MathContext
 * @see     RoundingMode
 * @see     java.util.SortedMap
 * @see     java.util.SortedSet
 * @author  Josh Bloch
 * @author  Mike Cowlishaw
 * @author  Joseph D. Darcy
 * @author  Sergey V. Kuksenko
 */
