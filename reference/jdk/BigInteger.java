_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public byte byteValueExact() {

    /**
     * Converts this {@code BigInteger} to a {@code byte}, checking
     * for lost information.  If the value of this {@code BigInteger}
     * is out of the range of the {@code byte} type, then an
     * {@code ArithmeticException} is thrown.
     *
     * @return this {@code BigInteger} converted to a {@code byte}.
     * @throws ArithmeticException if the value of {@code this} will
     * not exactly fit in a {@code byte}.
     * @see BigInteger#byteValue
     * @since  1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public short shortValueExact() {

    /**
     * Converts this {@code BigInteger} to a {@code short}, checking
     * for lost information.  If the value of this {@code BigInteger}
     * is out of the range of the {@code short} type, then an
     * {@code ArithmeticException} is thrown.
     *
     * @return this {@code BigInteger} converted to a {@code short}.
     * @throws ArithmeticException if the value of {@code this} will
     * not exactly fit in a {@code short}.
     * @see BigInteger#shortValue
     * @since  1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int intValueExact() {

    /**
     * Converts this {@code BigInteger} to an {@code int}, checking
     * for lost information.  If the value of this {@code BigInteger}
     * is out of the range of the {@code int} type, then an
     * {@code ArithmeticException} is thrown.
     *
     * @return this {@code BigInteger} converted to an {@code int}.
     * @throws ArithmeticException if the value of {@code this} will
     * not exactly fit in a {@code int}.
     * @see BigInteger#intValue
     * @since  1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public long longValueExact() {

    /**
     * Converts this {@code BigInteger} to a {@code long}, checking
     * for lost information.  If the value of this {@code BigInteger}
     * is out of the range of the {@code long} type, then an
     * {@code ArithmeticException} is thrown.
     *
     * @return this {@code BigInteger} converted to a {@code long}.
     * @throws ArithmeticException if the value of {@code this} will
     * not exactly fit in a {@code long}.
     * @see BigInteger#longValue
     * @since  1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private byte[] magSerializedForm() {

    /**
     * Returns the mag array as an array of bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Save the {@code BigInteger} instance to a stream.
     * The magnitude of a BigInteger is serialized as a byte array for
     * historical reasons.
     *
     * @serialData two necessary fields are written as well as obsolete
     *             fields for compatibility with older versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitute the {@code BigInteger} instance from a stream (that is,
     * deserialize it). The magnitude is read in as an array of bytes
     * for historical reasons, but it is converted to an array of ints
     * and the byte array is discarded.
     * Note:
     * The current convention is to initialize the cache fields, bitCount,
     * bitLength and lowestSetBit, to 0 rather than some other marker value.
     * Therefore, no explicit action to set these fields needs to be taken in
     * readObject because those fields already have a 0 value be default since
     * defaultReadObject is not being used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * Serializable fields for BigInteger.
     *
     * @serialField signum  int
     *              signum of this BigInteger.
     * @serialField magnitude int[]
     *              magnitude array of this BigInteger.
     * @serialField bitCount  int
     *              number of bits in this BigInteger
     * @serialField bitLength int
     *              the number of bits in the minimal two's-complement
     *              representation of this BigInteger
     * @serialField lowestSetBit int
     *              lowest set bit in the twos complement representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final long serialVersionUID = -8287574255936472291L;

    /** use serialVersionUID from JDK 1.1. for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private int firstNonzeroIntNum() {

    /**
     * Returns the index of the int that contains the first nonzero int in the
     * little-endian binary representation of the magnitude (int 0 is the
     * least significant). If the magnitude is zero, return value is undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private int getInt(int n) {

    /**
     * Returns the specified int of the little-endian two's complement
     * representation (int 0 is the least significant).  The int number can
     * be arbitrarily high (values are logically preceded by infinitely many
     * sign ints).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    /**

    /**
     * These routines provide access to the two's complement representation
     * of BigIntegers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] makePositive(int a[]) {

    /**
     * Takes an array a representing a negative 2's-complement number and
     * returns the minimal (no leading zero ints) unsigned whose value is -a.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] makePositive(byte a[]) {

    /**
     * Takes an array a representing a negative 2's-complement number and
     * returns the minimal (no leading zero bytes) unsigned whose value is -a.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] stripLeadingZeroBytes(byte a[]) {

    /**
     * Returns a copy of the input array stripped of any leading zero bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] trustedStripLeadingZeroInts(int val[]) {

    /**
     * Returns the input array stripped of any leading zero bytes.
     * Since the source is trusted the copying may be skipped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] stripLeadingZeroInts(int val[]) {

    /**
     * Returns a copy of the input array stripped of any leading zero bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public double doubleValue() {

    /**
     * Converts this BigInteger to a {@code double}.  This
     * conversion is similar to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code float} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this BigInteger has too great a magnitude
     * to represent as a {@code double}, it will be converted to
     * {@link Double#NEGATIVE_INFINITY} or {@link
     * Double#POSITIVE_INFINITY} as appropriate.  Note that even when
     * the return value is finite, this conversion can lose
     * information about the precision of the BigInteger value.
     *
     * @return this BigInteger converted to a {@code double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public float floatValue() {

    /**
     * Converts this BigInteger to a {@code float}.  This
     * conversion is similar to the
     * <i>narrowing primitive conversion</i> from {@code double} to
     * {@code float} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this BigInteger has too great a magnitude
     * to represent as a {@code float}, it will be converted to
     * {@link Float#NEGATIVE_INFINITY} or {@link
     * Float#POSITIVE_INFINITY} as appropriate.  Note that even when
     * the return value is finite, this conversion can lose
     * information about the precision of the BigInteger value.
     *
     * @return this BigInteger converted to a {@code float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public long longValue() {

    /**
     * Converts this BigInteger to a {@code long}.  This
     * conversion is analogous to a
     * <i>narrowing primitive conversion</i> from {@code long} to
     * {@code int} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this BigInteger is too big to fit in a
     * {@code long}, only the low-order 64 bits are returned.
     * Note that this conversion can lose information about the
     * overall magnitude of the BigInteger value as well as return a
     * result with the opposite sign.
     *
     * @return this BigInteger converted to a {@code long}.
     * @see #longValueExact()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int intValue() {

    /**
     * Converts this BigInteger to an {@code int}.  This
     * conversion is analogous to a
     * <i>narrowing primitive conversion</i> from {@code long} to
     * {@code int} as defined in section 5.1.3 of
     * <cite>The Java&trade; Language Specification</cite>:
     * if this BigInteger is too big to fit in an
     * {@code int}, only the low-order 32 bits are returned.
     * Note that this conversion can lose information about the
     * overall magnitude of the BigInteger value as well as return a
     * result with the opposite sign.
     *
     * @return this BigInteger converted to an {@code int}.
     * @see #intValueExact()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public byte[] toByteArray() {

    /**
     * Returns a byte array containing the two's-complement
     * representation of this BigInteger.  The byte array will be in
     * <i>big-endian</i> byte-order: the most significant byte is in
     * the zeroth element.  The array will contain the minimum number
     * of bytes required to represent this BigInteger, including at
     * least one sign bit, which is {@code (ceil((this.bitLength() +
     * 1)/8))}.  (This representation is compatible with the
     * {@link #BigInteger(byte[]) (byte[])} constructor.)
     *
     * @return a byte array containing the two's-complement representation of
     *         this BigInteger.
     * @see    #BigInteger(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public String toString() {

    /**
     * Returns the decimal String representation of this BigInteger.
     * The digit-to-character mapping provided by
     * {@code Character.forDigit} is used, and a minus sign is
     * prepended if appropriate.  (This representation is compatible
     * with the {@link #BigInteger(String) (String)} constructor, and
     * allows for String concatenation with Java's + operator.)
     *
     * @return decimal String representation of this BigInteger.
     * @see    Character#forDigit
     * @see    #BigInteger(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger getRadixConversionCache(int radix, int exponent) {

    /**
     * Returns the value radix^(2^exponent) from the cache.
     * If this value doesn't already exist in the cache, it is added.
     * <p/>
     * This could be changed to a more complicated caching method using
     * {@code Future}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static void toString(BigInteger u, StringBuilder sb, int radix,
                                 int digits) {

    /**
     * Converts the specified BigInteger to a string and appends to
     * {@code sb}.  This implements the recursive Schoenhage algorithm
     * for base conversions.
     * <p/>
     * See Knuth, Donald,  _The Art of Computer Programming_, Vol. 2,
     * Answers to Exercises (4.4) Question 14.
     *
     * @param u      The number to convert to a string.
     * @param sb     The StringBuilder that will be appended to in place.
     * @param radix  The base to convert to.
     * @param digits The minimum number of digits to pad to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private String smallToString(int radix) {

    /** This method is used to perform toString when arguments are small. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public String toString(int radix) {

    /**
     * Returns the String representation of this BigInteger in the
     * given radix.  If the radix is outside the range from {@link
     * Character#MIN_RADIX} to {@link Character#MAX_RADIX} inclusive,
     * it will default to 10 (as is the case for
     * {@code Integer.toString}).  The digit-to-character mapping
     * provided by {@code Character.forDigit} is used, and a minus
     * sign is prepended if appropriate.  (This representation is
     * compatible with the {@link #BigInteger(String, int) (String,
     * int)} constructor.)
     *
     * @param  radix  radix of the String representation.
     * @return String representation of this BigInteger in the given radix.
     * @see    Integer#toString
     * @see    Character#forDigit
     * @see    #BigInteger(java.lang.String, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int hashCode() {

    /**
     * Returns the hash code for this BigInteger.
     *
     * @return hash code for this BigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger max(BigInteger val) {

    /**
     * Returns the maximum of this BigInteger and {@code val}.
     *
     * @param  val value with which the maximum is to be computed.
     * @return the BigInteger whose value is the greater of this and
     *         {@code val}.  If they are equal, either may be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger min(BigInteger val) {

    /**
     * Returns the minimum of this BigInteger and {@code val}.
     *
     * @param  val value with which the minimum is to be computed.
     * @return the BigInteger whose value is the lesser of this BigInteger and
     *         {@code val}.  If they are equal, either may be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public boolean equals(Object x) {

    /**
     * Compares this BigInteger with the specified Object for equality.
     *
     * @param  x Object to which this BigInteger is to be compared.
     * @return {@code true} if and only if the specified Object is a
     *         BigInteger whose value is numerically equal to this BigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    final int compareMagnitude(long val) {

    /**
     * Version of compareMagnitude that compares magnitude with long value.
     * val can't be Long.MIN_VALUE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    final int compareMagnitude(BigInteger val) {

    /**
     * Compares the magnitude array of this BigInteger with the specified
     * BigInteger's. This is the version of compareTo ignoring sign.
     *
     * @param val BigInteger whose magnitude array to be compared.
     * @return -1, 0 or 1 as this magnitude array is less than, equal to or
     *         greater than the magnitude aray for the specified BigInteger's.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int compareTo(BigInteger val) {

    /**
     * Compares this BigInteger with the specified BigInteger.  This
     * method is provided in preference to individual methods for each
     * of the six boolean comparison operators ({@literal <}, ==,
     * {@literal >}, {@literal >=}, !=, {@literal <=}).  The suggested
     * idiom for performing these comparisons is: {@code
     * (x.compareTo(y)} &lt;<i>op</i>&gt; {@code 0)}, where
     * &lt;<i>op</i>&gt; is one of the six comparison operators.
     *
     * @param  val BigInteger to which this BigInteger is to be compared.
     * @return -1, 0 or 1 as this BigInteger is numerically less than, equal
     *         to, or greater than {@code val}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public boolean isProbablePrime(int certainty) {

    /**
     * Returns {@code true} if this BigInteger is probably prime,
     * {@code false} if it's definitely composite.  If
     * {@code certainty} is &le; 0, {@code true} is
     * returned.
     *
     * @param  certainty a measure of the uncertainty that the caller is
     *         willing to tolerate: if the call returns {@code true}
     *         the probability that this BigInteger is prime exceeds
     *         (1 - 1/2<sup>{@code certainty}</sup>).  The execution time of
     *         this method is proportional to the value of this parameter.
     * @return {@code true} if this BigInteger is probably prime,
     *         {@code false} if it's definitely composite.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int bitCount() {

    /**
     * Returns the number of bits in the two's complement representation
     * of this BigInteger that differ from its sign bit.  This method is
     * useful when implementing bit-vector style sets atop BigIntegers.
     *
     * @return number of bits in the two's complement representation
     *         of this BigInteger that differ from its sign bit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int bitLength() {

    /**
     * Returns the number of bits in the minimal two's-complement
     * representation of this BigInteger, <i>excluding</i> a sign bit.
     * For positive BigIntegers, this is equivalent to the number of bits in
     * the ordinary binary representation.  (Computes
     * {@code (ceil(log2(this < 0 ? -this : this+1)))}.)
     *
     * @return number of bits in the minimal two's-complement
     *         representation of this BigInteger, <i>excluding</i> a sign bit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int getLowestSetBit() {

    /**
     * Returns the index of the rightmost (lowest-order) one bit in this
     * BigInteger (the number of zero bits to the right of the rightmost
     * one bit).  Returns -1 if this BigInteger contains no one bits.
     * (Computes {@code (this == 0? -1 : log2(this & -this))}.)
     *
     * @return index of the rightmost one bit in this BigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger flipBit(int n) {

    /**
     * Returns a BigInteger whose value is equivalent to this BigInteger
     * with the designated bit flipped.
     * (Computes {@code (this ^ (1<<n))}.)
     *
     * @param  n index of bit to flip.
     * @return {@code this ^ (1<<n)}
     * @throws ArithmeticException {@code n} is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger clearBit(int n) {

    /**
     * Returns a BigInteger whose value is equivalent to this BigInteger
     * with the designated bit cleared.
     * (Computes {@code (this & ~(1<<n))}.)
     *
     * @param  n index of bit to clear.
     * @return {@code this & ~(1<<n)}
     * @throws ArithmeticException {@code n} is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger setBit(int n) {

    /**
     * Returns a BigInteger whose value is equivalent to this BigInteger
     * with the designated bit set.  (Computes {@code (this | (1<<n))}.)
     *
     * @param  n index of bit to set.
     * @return {@code this | (1<<n)}
     * @throws ArithmeticException {@code n} is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public boolean testBit(int n) {

    /**
     * Returns {@code true} if and only if the designated bit is set.
     * (Computes {@code ((this & (1<<n)) != 0)}.)
     *
     * @param  n index of bit to test.
     * @return {@code true} if and only if the designated bit is set.
     * @throws ArithmeticException {@code n} is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger andNot(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this & ~val)}.  This
     * method, which is equivalent to {@code and(val.not())}, is provided as
     * a convenience for masking operations.  (This method returns a negative
     * BigInteger if and only if {@code this} is negative and {@code val} is
     * positive.)
     *
     * @param val value to be complemented and AND'ed with this BigInteger.
     * @return {@code this & ~val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger not() {

    /**
     * Returns a BigInteger whose value is {@code (~this)}.  (This method
     * returns a negative value if and only if this BigInteger is
     * non-negative.)
     *
     * @return {@code ~this}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger xor(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this ^ val)}.  (This method
     * returns a negative BigInteger if and only if exactly one of this and
     * val are negative.)
     *
     * @param val value to be XOR'ed with this BigInteger.
     * @return {@code this ^ val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger or(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this | val)}.  (This method
     * returns a negative BigInteger if and only if either this or val is
     * negative.)
     *
     * @param val value to be OR'ed with this BigInteger.
     * @return {@code this | val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger and(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this & val)}.  (This
     * method returns a negative BigInteger if and only if this and val are
     * both negative.)
     *
     * @param val value to be AND'ed with this BigInteger.
     * @return {@code this & val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger shiftRightImpl(int n) {

    /**
     * Returns a BigInteger whose value is {@code (this >> n)}. The shift
     * distance, {@code n}, is considered unsigned.
     * (Computes <tt>floor(this * 2<sup>-n</sup>)</tt>.)
     *
     * @param  n unsigned shift distance, in bits.
     * @return {@code this >> n}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger shiftRight(int n) {

    /**
     * Returns a BigInteger whose value is {@code (this >> n)}.  Sign
     * extension is performed.  The shift distance, {@code n}, may be
     * negative, in which case this method performs a left shift.
     * (Computes <tt>floor(this / 2<sup>n</sup>)</tt>.)
     *
     * @param  n shift distance, in bits.
     * @return {@code this >> n}
     * @see #shiftLeft
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] shiftLeft(int[] mag, int n) {

    /**
     * Returns a magnitude array whose value is {@code (mag << n)}.
     * The shift distance, {@code n}, is considered unnsigned.
     * (Computes <tt>this * 2<sup>n</sup></tt>.)
     *
     * @param mag magnitude, the most-significant int ({@code mag[0]}) must be non-zero.
     * @param  n unsigned shift distance, in bits.
     * @return {@code mag << n}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger shiftLeft(int n) {

    /**
     * Returns a BigInteger whose value is {@code (this << n)}.
     * The shift distance, {@code n}, may be negative, in which case
     * this method performs a right shift.
     * (Computes <tt>floor(this * 2<sup>n</sup>)</tt>.)
     *
     * @param  n shift distance, in bits.
     * @return {@code this << n}
     * @see #shiftRight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger modInverse(BigInteger m) {

    /**
     * Returns a BigInteger whose value is {@code (this}<sup>-1</sup> {@code mod m)}.
     *
     * @param  m the modulus.
     * @return {@code this}<sup>-1</sup> {@code mod m}.
     * @throws ArithmeticException {@code  m} &le; 0, or this BigInteger
     *         has no multiplicative inverse mod m (that is, this BigInteger
     *         is not <i>relatively prime</i> to m).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger mod2(int p) {

    /**
     * Returns a BigInteger whose value is this mod(2**p).
     * Assumes that this {@code BigInteger >= 0} and {@code p > 0}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger modPow2(BigInteger exponent, int p) {

    /**
     * Returns a BigInteger whose value is (this ** exponent) mod (2**p)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    static int addOne(int[] a, int offset, int mlen, int carry) {

    /**
     * Add one word to the number a mlen words into a. Return the resulting
     * carry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    static int mulAdd(int[] out, int[] in, int offset, int len, int k) {

    /**
     * Multiply an array by one word k and add to result, return the carry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int subN(int[] a, int[] b, int len) {

    /**
     * Subtracts two numbers of same length, returning borrow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] montReduce(int[] n, int[] mod, int mlen, int inv) {

    /**
     * Montgomery reduce n, modulo mod.  This reduces modulo mod and divides
     * by 2^(32*mlen). Adapted from Colin Plumb's C library.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger oddModPow(BigInteger y, BigInteger z) {

    /**
     * Returns a BigInteger whose value is x to the power of y mod z.
     * Assumes: z is odd && x < z.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger modPow(BigInteger exponent, BigInteger m) {

    /**
     * Returns a BigInteger whose value is
     * <tt>(this<sup>exponent</sup> mod m)</tt>.  (Unlike {@code pow}, this
     * method permits negative exponents.)
     *
     * @param  exponent the exponent.
     * @param  m the modulus.
     * @return <tt>this<sup>exponent</sup> mod m</tt>
     * @throws ArithmeticException {@code m} &le; 0 or the exponent is
     *         negative and this BigInteger is not <i>relatively
     *         prime</i> to {@code m}.
     * @see    #modInverse
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger mod(BigInteger m) {

    /**
     * Returns a BigInteger whose value is {@code (this mod m}).  This method
     * differs from {@code remainder} in that it always returns a
     * <i>non-negative</i> BigInteger.
     *
     * @param  m the modulus.
     * @return {@code this mod m}
     * @throws ArithmeticException {@code m} &le; 0
     * @see    #remainder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public int signum() {

    /**
     * Returns the signum function of this BigInteger.
     *
     * @return -1, 0 or 1 as the value of this BigInteger is negative, zero or
     *         positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger negate() {

    /**
     * Returns a BigInteger whose value is {@code (-this)}.
     *
     * @return {@code -this}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger abs() {

    /**
     * Returns a BigInteger whose value is the absolute value of this
     * BigInteger.
     *
     * @return {@code abs(this)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int bitLength(int[] val, int len) {

    /**
     * Calculate bitlength of contents of the first len elements an int array,
     * assuming there are no leading zero ints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] leftShift(int[] a, int len, int n) {

    /**
     * Left shift int array a up to len by n bits. Returns the array that
     * results from the shift since space may have to be reallocated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    static int bitLengthForInt(int n) {

    /**
     * Package private method to return bit length for an integer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger gcd(BigInteger val) {

    /**
     * Returns a BigInteger whose value is the greatest common divisor of
     * {@code abs(this)} and {@code abs(val)}.  Returns 0 if
     * {@code this == 0 && val == 0}.
     *
     * @param  val value with which the GCD is to be computed.
     * @return {@code GCD(abs(this), abs(val))}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger pow(int exponent) {

    /**
     * Returns a BigInteger whose value is <tt>(this<sup>exponent</sup>)</tt>.
     * Note that {@code exponent} is an integer rather than a BigInteger.
     *
     * @param  exponent exponent to which this BigInteger is to be raised.
     * @return <tt>this<sup>exponent</sup></tt>
     * @throws ArithmeticException {@code exponent} is negative.  (This would
     *         cause the operation to yield a non-integer value.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger[] divideAndRemainderBurnikelZiegler(BigInteger val) {

    /**
     * Computes {@code this / val} and {@code this % val} using the
     * Burnikel-Ziegler algorithm.
     * @param val the divisor
     * @return an array containing the quotient and remainder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger remainderBurnikelZiegler(BigInteger val) {

    /**
     * Calculates {@code this % val} using the Burnikel-Ziegler algorithm.
     * @param val the divisor
     * @return {@code this % val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger divideBurnikelZiegler(BigInteger val) {

    /**
     * Calculates {@code this / val} using the Burnikel-Ziegler algorithm.
     * @param  val the divisor
     * @return {@code this / val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger remainderKnuth(BigInteger val) {

    /** Long division */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger remainder(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this % val)}.
     *
     * @param  val value by which this BigInteger is to be divided, and the
     *         remainder computed.
     * @return {@code this % val}
     * @throws ArithmeticException if {@code val} is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger[] divideAndRemainderKnuth(BigInteger val) {

    /** Long division */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger[] divideAndRemainder(BigInteger val) {

    /**
     * Returns an array of two BigIntegers containing {@code (this / val)}
     * followed by {@code (this % val)}.
     *
     * @param  val value by which this BigInteger is to be divided, and the
     *         remainder computed.
     * @return an array of two BigIntegers: the quotient {@code (this / val)}
     *         is the initial element, and the remainder {@code (this % val)}
     *         is the final element.
     * @throws ArithmeticException if {@code val} is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger divideKnuth(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this / val)} using an O(n^2) algorithm from Knuth.
     *
     * @param  val value by which this BigInteger is to be divided.
     * @return {@code this / val}
     * @throws ArithmeticException if {@code val} is zero.
     * @see MutableBigInteger#divideKnuth(MutableBigInteger, MutableBigInteger, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger divide(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this / val)}.
     *
     * @param  val value by which this BigInteger is to be divided.
     * @return {@code this / val}
     * @throws ArithmeticException if {@code val} is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger squareToomCook3() {

    /**
     * Squares a BigInteger using the 3-way Toom-Cook squaring algorithm.  It
     * should be used when both numbers are larger than a certain threshold
     * (found experimentally).  It is a recursive divide-and-conquer algorithm
     * that has better asymptotic performance than the algorithm used in
     * squareToLen or squareKaratsuba.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger squareKaratsuba() {

    /**
     * Squares a BigInteger using the Karatsuba squaring algorithm.  It should
     * be used when both numbers are larger than a certain threshold (found
     * experimentally).  It is a recursive divide-and-conquer algorithm that
     * has better asymptotic performance than the algorithm used in
     * squareToLen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int[] squareToLen(int[] x, int len, int[] z) {

    /**
     * Squares the contents of the int array x. The result is placed into the
     * int array z.  The contents of x are not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger square() {

    /**
     * Returns a BigInteger whose value is {@code (this<sup>2</sup>)}.
     *
     * @return {@code this<sup>2</sup>}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger getUpper(int n) {

    /**
     * Returns a new BigInteger representing mag.length-n upper
     * ints of the number.  This is used by Karatsuba multiplication and
     * Karatsuba squaring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger getLower(int n) {

    /**
     * Returns a new BigInteger representing n lower ints of the number.
     * This is used by Karatsuba multiplication and Karatsuba squaring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger exactDivideBy3() {

    /**
     * Does an exact division (that is, the remainder is known to be zero)
     * of the specified number by 3.  This is used in Toom-Cook
     * multiplication.  This is an efficient algorithm that runs in linear
     * time.  If the argument is not exactly divisible by 3, results are
     * undefined.  Note that this is expected to be called with positive
     * arguments only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger getToomSlice(int lowerSize, int upperSize, int slice,
                                    int fullsize) {

    /**
     * Returns a slice of a BigInteger for use in Toom-Cook multiplication.
     *
     * @param lowerSize The size of the lower-order bit slices.
     * @param upperSize The size of the higher-order bit slices.
     * @param slice The index of which slice is requested, which must be a
     * number from 0 to size-1. Slice 0 is the highest-order bits, and slice
     * size-1 are the lowest-order bits. Slice 0 may be of different size than
     * the other slices.
     * @param fullsize The size of the larger integer array, used to align
     * slices to the appropriate position when multiplying different-sized
     * numbers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger multiplyToomCook3(BigInteger a, BigInteger b) {

    /**
     * Multiplies two BigIntegers using a 3-way Toom-Cook multiplication
     * algorithm.  This is a recursive divide-and-conquer algorithm which is
     * more efficient for large numbers than what is commonly called the
     * "grade-school" algorithm used in multiplyToLen.  If the numbers to be
     * multiplied have length n, the "grade-school" algorithm has an
     * asymptotic complexity of O(n^2).  In contrast, 3-way Toom-Cook has a
     * complexity of about O(n^1.465).  It achieves this increased asymptotic
     * performance by breaking each number into three parts and by doing 5
     * multiplies instead of 9 when evaluating the product.  Due to overhead
     * (additions, shifts, and one division) in the Toom-Cook algorithm, it
     * should only be used when both numbers are larger than a certain
     * threshold (found experimentally).  This threshold is generally larger
     * than that for Karatsuba multiplication, so this algorithm is generally
     * only used when numbers become significantly larger.
     *
     * The algorithm used is the "optimal" 3-way Toom-Cook algorithm outlined
     * by Marco Bodrato.
     *
     *  See: http://bodrato.it/toom-cook/
     *       http://bodrato.it/papers/#WAIFI2007
     *
     * "Towards Optimal Toom-Cook Multiplication for Univariate and
     * Multivariate Polynomials in Characteristic 2 and 0." by Marco BODRATO;
     * In C.Carlet and B.Sunar, Eds., "WAIFI'07 proceedings", p. 116-133,
     * LNCS #4547. Springer, Madrid, Spain, June 21-22, 2007.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger multiplyKaratsuba(BigInteger x, BigInteger y) {

    /**
     * Multiplies two BigIntegers using the Karatsuba multiplication
     * algorithm.  This is a recursive divide-and-conquer algorithm which is
     * more efficient for large numbers than what is commonly called the
     * "grade-school" algorithm used in multiplyToLen.  If the numbers to be
     * multiplied have length n, the "grade-school" algorithm has an
     * asymptotic complexity of O(n^2).  In contrast, the Karatsuba algorithm
     * has complexity of O(n^(log2(3))), or O(n^1.585).  It achieves this
     * increased performance by doing 3 multiplies instead of 4 when
     * evaluating the product.  As it has some overhead, should be used when
     * both numbers are larger than a certain threshold (found
     * experimentally).
     *
     * See:  http://en.wikipedia.org/wiki/Karatsuba_algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private int[] multiplyToLen(int[] x, int xlen, int[] y, int ylen, int[] z) {

    /**
     * Multiplies int arrays x and y to the specified lengths and places
     * the result into z. There will be no leading zeros in the resultant array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    BigInteger multiply(long v) {

    /**
     * Package private methods used by BigDecimal code to multiply a BigInteger
     * with a long. Assumes v is not equal to INFLATED.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger multiply(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this * val)}.
     *
     * @implNote An implementation may offer better algorithmic
     * performance when {@code val == this}.
     *
     * @param  val value to be multiplied by this BigInteger.
     * @return {@code this * val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] subtract(int[] big, int[] little) {

    /**
     * Subtracts the contents of the second int arrays (little) from the
     * first (big).  The first int array (big) must represent a larger number
     * than the second.  This method allocates the space necessary to hold the
     * answer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger subtract(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this - val)}.
     *
     * @param  val value to be subtracted from this BigInteger.
     * @return {@code this - val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] subtract(int[] big, long val) {

    /**
     * Subtracts the contents of the second argument (val) from the
     * first (big).  The first int array (big) must represent a larger number
     * than the second.  This method allocates the space necessary to hold the
     * answer.
     * assumes val &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] add(int[] x, int[] y) {

    /**
     * Adds the contents of the int arrays x and y. This method allocates
     * a new int array to hold the answer and returns a reference to that
     * array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int[] add(int[] x, long val) {

    /**
     * Adds the contents of the int array x and long value val. This
     * method allocates a new int array to hold the answer and returns
     * a reference to that array.  Assumes x.length &gt; 0 and val is
     * non-negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    BigInteger add(long val) {

    /**
     * Package private methods used by BigDecimal code to add a BigInteger
     * with a long. Assumes val is not equal to INFLATED.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger add(BigInteger val) {

    /**
     * Returns a BigInteger whose value is {@code (this + val)}.
     *
     * @param  val value to be added to this BigInteger.
     * @return {@code this + val}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public static final BigInteger TEN = valueOf(10);

    /**
     * The BigInteger constant ten.
     *
     * @since   1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final BigInteger NEGATIVE_ONE = valueOf(-1);

    /**
     * The BigInteger constant -1.  (Not exported.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final BigInteger TWO = valueOf(2);

    /**
     * The BigInteger constant two.  (Not exported.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public static final BigInteger ONE = valueOf(1);

    /**
     * The BigInteger constant one.
     *
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public static final BigInteger ZERO = new BigInteger(new int[0], 0);

    /**
     * The BigInteger constant zero.
     *
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final double LOG_TWO = Math.log(2.0);

    /** The natural log of 2.  This is used in computing cache indices. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final double[] logCache;

    /** The cache of logarithms of radices for base conversion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static volatile BigInteger[][] powerCache;

    /**
     * The cache of powers of each radix.  This allows us to not have to
     * recalculate powers of radix^(2^n) more than once.  This speeds
     * Schoenhage recursive base conversion significantly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private final static int MAX_CONSTANT = 16;

    /**
     * Initialize static constant array when class is loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger valueOf(int val[]) {

    /**
     * Returns a BigInteger with the given two's complement representation.
     * Assumes that the input array will not be modified (the returned
     * BigInteger will reference the input array if feasible).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger(long val) {

    /**
     * Constructs a BigInteger with the specified value, which may not be zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public static BigInteger valueOf(long val) {

    /**
     * Returns a BigInteger whose value is equal to that of the
     * specified {@code long}.  This "static factory method" is
     * provided in preference to a ({@code long}) constructor
     * because it allows for reuse of frequently used BigIntegers.
     *
     * @param  val value of the BigInteger to return.
     * @return a BigInteger with the specified value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private void checkRange() {

    /**
     * Throws an {@code ArithmeticException} if the {@code BigInteger} would be
     * out of the supported range.
     *
     * @throws ArithmeticException if {@code this} exceeds the supported range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger(byte[] magnitude, int signum) {

    /**
     * This private constructor is for internal use and assumes that its
     * arguments are correct.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    BigInteger(int[] magnitude, int signum) {

    /**
     * This internal constructor differs from its public cousin
     * with the arguments reversed in two ways: it assumes that its
     * arguments are correct, and it doesn't copy the magnitude array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private boolean passesMillerRabin(int iterations, Random rnd) {

    /**
     * Returns true iff this BigInteger passes the specified number of
     * Miller-Rabin tests. This test is taken from the DSA spec (NIST FIPS
     * 186-2).
     *
     * The following assumptions are made:
     * This BigInteger is a positive, odd number greater than 2.
     * iterations<=50.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static int jacobiSymbol(int p, BigInteger n) {

    /**
     * Computes Jacobi(p,n).
     * Assumes n positive, odd, n>=3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private boolean passesLucasLehmer() {

    /**
     * Returns true iff this BigInteger is a Lucas-Lehmer probable prime.
     *
     * The following assumptions are made:
     * This BigInteger is a positive, odd number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    boolean primeToCertainty(int certainty, Random random) {

    /**
     * Returns {@code true} if this BigInteger is probably prime,
     * {@code false} if it's definitely composite.
     *
     * This method assumes bitLength > 2.
     *
     * @param  certainty a measure of the uncertainty that the caller is
     *         willing to tolerate: if the call returns {@code true}
     *         the probability that this BigInteger is prime exceeds
     *         {@code (1 - 1/2<sup>certainty</sup>)}.  The execution time of
     *         this method is proportional to the value of this parameter.
     * @return {@code true} if this BigInteger is probably prime,
     *         {@code false} if it's definitely composite.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger nextProbablePrime() {

   /**
    * Returns the first integer greater than this {@code BigInteger} that
    * is probably prime.  The probability that the number returned by this
    * method is composite does not exceed 2<sup>-100</sup>. This method will
    * never skip over a prime when searching: if it returns {@code p}, there
    * is no prime {@code q} such that {@code this < q < p}.
    *
    * @return the first integer greater than this {@code BigInteger} that
    *         is probably prime.
    * @throws ArithmeticException {@code this < 0} or {@code this} is too large.
    * @since 1.5
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger largePrime(int bitLength, int certainty, Random rnd) {

    /**
     * Find a random number of the specified bitLength that is probably prime.
     * This method is more appropriate for larger bitlengths since it uses
     * a sieve to eliminate most composites before using a more expensive
     * test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static BigInteger smallPrime(int bitLength, int certainty, Random rnd) {

    /**
     * Find a random number of the specified bitLength that is probably prime.
     * This method is used for smaller primes, its performance degrades on
     * larger bitlengths.
     *
     * This method assumes bitLength > 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public static BigInteger probablePrime(int bitLength, Random rnd) {

    /**
     * Returns a positive BigInteger that is probably prime, with the
     * specified bitLength. The probability that a BigInteger returned
     * by this method is composite does not exceed 2<sup>-100</sup>.
     *
     * @param  bitLength bitLength of the returned BigInteger.
     * @param  rnd source of random bits used to select candidates to be
     *         tested for primality.
     * @return a BigInteger of {@code bitLength} bits that is probably prime
     * @throws ArithmeticException {@code bitLength < 2} or {@code bitLength} is too large.
     * @see    #bitLength()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(int bitLength, int certainty, Random rnd) {

    /**
     * Constructs a randomly generated positive BigInteger that is probably
     * prime, with the specified bitLength.
     *
     * <p>It is recommended that the {@link #probablePrime probablePrime}
     * method be used in preference to this constructor unless there
     * is a compelling need to specify a certainty.
     *
     * @param  bitLength bitLength of the returned BigInteger.
     * @param  certainty a measure of the uncertainty that the caller is
     *         willing to tolerate.  The probability that the new BigInteger
     *         represents a prime number will exceed
     *         (1 - 1/2<sup>{@code certainty}</sup>).  The execution time of
     *         this constructor is proportional to the value of this parameter.
     * @param  rnd source of random bits used to select candidates to be
     *         tested for primality.
     * @throws ArithmeticException {@code bitLength < 2} or {@code bitLength} is too large.
     * @see    #bitLength()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(int numBits, Random rnd) {

    /**
     * Constructs a randomly generated BigInteger, uniformly distributed over
     * the range 0 to (2<sup>{@code numBits}</sup> - 1), inclusive.
     * The uniformity of the distribution assumes that a fair source of random
     * bits is provided in {@code rnd}.  Note that this constructor always
     * constructs a non-negative BigInteger.
     *
     * @param  numBits maximum bitLength of the new BigInteger.
     * @param  rnd source of randomness to be used in computing the new
     *         BigInteger.
     * @throws IllegalArgumentException {@code numBits} is negative.
     * @see #bitLength()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(String val) {

    /**
     * Translates the decimal String representation of a BigInteger into a
     * BigInteger.  The String representation consists of an optional minus
     * sign followed by a sequence of one or more decimal digits.  The
     * character-to-digit mapping is provided by {@code Character.digit}.
     * The String may not contain any extraneous characters (whitespace, for
     * example).
     *
     * @param val decimal String representation of BigInteger.
     * @throws NumberFormatException {@code val} is not a valid representation
     *         of a BigInteger.
     * @see    Character#digit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(String val, int radix) {

    /**
     * Translates the String representation of a BigInteger in the
     * specified radix into a BigInteger.  The String representation
     * consists of an optional minus or plus sign followed by a
     * sequence of one or more digits in the specified radix.  The
     * character-to-digit mapping is provided by {@code
     * Character.digit}.  The String may not contain any extraneous
     * characters (whitespace, for example).
     *
     * @param val String representation of BigInteger.
     * @param radix radix to be used in interpreting {@code val}.
     * @throws NumberFormatException {@code val} is not a valid representation
     *         of a BigInteger in the specified radix, or {@code radix} is
     *         outside the range from {@link Character#MIN_RADIX} to
     *         {@link Character#MAX_RADIX}, inclusive.
     * @see    Character#digit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger(int signum, int[] magnitude) {

    /**
     * A constructor for internal use that translates the sign-magnitude
     * representation of a BigInteger into a BigInteger. It checks the
     * arguments and copies the magnitude so this constructor would be
     * safe for external use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(int signum, byte[] magnitude) {

    /**
     * Translates the sign-magnitude representation of a BigInteger into a
     * BigInteger.  The sign is represented as an integer signum value: -1 for
     * negative, 0 for zero, or 1 for positive.  The magnitude is a byte array
     * in <i>big-endian</i> byte-order: the most significant byte is in the
     * zeroth element.  A zero-length magnitude array is permissible, and will
     * result in a BigInteger value of 0, whether signum is -1, 0 or 1.
     *
     * @param  signum signum of the number (-1 for negative, 0 for zero, 1
     *         for positive).
     * @param  magnitude big-endian binary representation of the magnitude of
     *         the number.
     * @throws NumberFormatException {@code signum} is not one of the three
     *         legal values (-1, 0, and 1), or {@code signum} is 0 and
     *         {@code magnitude} contains one or more non-zero bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private BigInteger(int[] val) {

    /**
     * This private constructor translates an int array containing the
     * two's-complement binary representation of a BigInteger into a
     * BigInteger. The input array is assumed to be in <i>big-endian</i>
     * int-order: the most significant int is in the zeroth element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    public BigInteger(byte[] val) {

    /**
     * Translates a byte array containing the two's-complement binary
     * representation of a BigInteger into a BigInteger.  The input array is
     * assumed to be in <i>big-endian</i> byte-order: the most significant
     * byte is in the zeroth element.
     *
     * @param  val big-endian two's-complement binary representation of
     *         BigInteger.
     * @throws NumberFormatException {@code val} is zero bytes long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int MULTIPLY_SQUARE_THRESHOLD = 20;

    /**
     * The threshold value for using squaring code to perform multiplication
     * of a {@code BigInteger} instance by itself.  If the number of ints in
     * the number are larger than this value, {@code multiply(this)} will
     * return {@code square()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int SCHOENHAGE_BASE_CONVERSION_THRESHOLD = 20;

    /**
     * The threshold value for using Schoenhage recursive base conversion. If
     * the number of ints in the number are larger than this value,
     * the Schoenhage algorithm will be used.  In practice, it appears that the
     * Schoenhage routine is faster for any threshold down to 2, and is
     * relatively flat for thresholds between 2-25, so this choice may be
     * varied within this range for very small effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    static final int BURNIKEL_ZIEGLER_OFFSET = 40;

    /**
     * The offset value for using Burnikel-Ziegler division.  If the number
     * of ints in the divisor exceeds the Burnikel-Ziegler threshold, and the
     * number of ints in the dividend is greater than the number of ints in the
     * divisor plus this value, Burnikel-Ziegler division will be used.  This
     * value is found experimentally to work well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    static final int BURNIKEL_ZIEGLER_THRESHOLD = 80;

    /**
     * The threshold value for using Burnikel-Ziegler division.  If the number
     * of ints in the divisor are larger than this value, Burnikel-Ziegler
     * division may be used.  This value is found experimentally to work well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int TOOM_COOK_SQUARE_THRESHOLD = 216;

    /**
     * The threshold value for using Toom-Cook squaring.  If the number
     * of ints in the number are larger than this value,
     * Toom-Cook squaring will be used.   This value is found
     * experimentally to work well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int KARATSUBA_SQUARE_THRESHOLD = 128;

    /**
     * The threshold value for using Karatsuba squaring.  If the number
     * of ints in the number are larger than this value,
     * Karatsuba squaring will be used.   This value is found
     * experimentally to work well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int TOOM_COOK_THRESHOLD = 240;

    /**
     * The threshold value for using 3-way Toom-Cook multiplication.
     * If the number of ints in each mag array is greater than the
     * Karatsuba threshold, and the number of ints in at least one of
     * the mag arrays is greater than this threshold, then Toom-Cook
     * multiplication will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int KARATSUBA_THRESHOLD = 80;

    /**
     * The threshold value for using Karatsuba multiplication.  If the number
     * of ints in both mag arrays are greater than this number, then
     * Karatsuba multiplication will be used.   This value is found
     * experimentally to work well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final  int PRIME_SEARCH_BIT_LENGTH_LIMIT = 500000000;

    /**
     * Bit lengths larger than this constant can cause overflow in searchLen
     * calculation and in BitSieve.singleSearch method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    private static final int MAX_MAG_LENGTH = Integer.MAX_VALUE / Integer.SIZE + 1; // (1 << 26)

    /**
     * This constant limits {@code mag.length} of BigIntegers to the supported
     * range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    final static long LONG_MASK = 0xffffffffL;

    /**
     * This mask is used to obtain the value of an int as if it were unsigned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    @Deprecated

    /**
     * Two plus the index of the lowest-order int in the magnitude of this
     * BigInteger that contains a nonzero int, or -2 (either value is acceptable).
     * The least significant int has int-number 0, the next int in order of
     * increasing significance has int-number 1, and so forth.
     * @deprecated Deprecated since logical value is offset from stored
     * value and correction factor is applied in accessor method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    @Deprecated

    /**
     * Two plus the lowest set bit of this BigInteger, as returned by
     * getLowestSetBit().
     *
     * @serial
     * @see #getLowestSetBit
     * @deprecated Deprecated since logical value is offset from stored
     * value and correction factor is applied in accessor method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    @Deprecated

    /**
     * One plus the bitLength of this BigInteger. Zeros means unitialized.
     * (either value is acceptable).
     *
     * @serial
     * @see #bitLength()
     * @deprecated Deprecated since logical value is offset from stored
     * value and correction factor is applied in accessor method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    @Deprecated

     /**
     * One plus the bitCount of this BigInteger. Zeros means unitialized.
     *
     * @serial
     * @see #bitCount
     * @deprecated Deprecated since logical value is offset from stored
     * value and correction factor is applied in accessor method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
    final int[] mag;

    /**
     * The magnitude of this BigInteger, in <i>big-endian</i> order: the
     * zeroth element of this array is the most-significant int of the
     * magnitude.  The magnitude must be "minimal" in that the most-significant
     * int ({@code mag[0]}) must be non-zero.  This is necessary to
     * ensure that there is exactly one representation for each BigInteger
     * value.  Note that this implies that the BigInteger zero has a
     * zero-length mag array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/BigInteger.java
public class BigInteger extends Number implements Comparable<BigInteger> {

/**
 * Immutable arbitrary-precision integers.  All operations behave as if
 * BigIntegers were represented in two's-complement notation (like Java's
 * primitive integer types).  BigInteger provides analogues to all of Java's
 * primitive integer operators, and all relevant methods from java.lang.Math.
 * Additionally, BigInteger provides operations for modular arithmetic, GCD
 * calculation, primality testing, prime generation, bit manipulation,
 * and a few other miscellaneous operations.
 *
 * <p>Semantics of arithmetic operations exactly mimic those of Java's integer
 * arithmetic operators, as defined in <i>The Java Language Specification</i>.
 * For example, division by zero throws an {@code ArithmeticException}, and
 * division of a negative by a positive yields a negative (or zero) remainder.
 * All of the details in the Spec concerning overflow are ignored, as
 * BigIntegers are made as large as necessary to accommodate the results of an
 * operation.
 *
 * <p>Semantics of shift operations extend those of Java's shift operators
 * to allow for negative shift distances.  A right-shift with a negative
 * shift distance results in a left shift, and vice-versa.  The unsigned
 * right shift operator ({@code >>>}) is omitted, as this operation makes
 * little sense in combination with the "infinite word size" abstraction
 * provided by this class.
 *
 * <p>Semantics of bitwise logical operations exactly mimic those of Java's
 * bitwise integer operators.  The binary operators ({@code and},
 * {@code or}, {@code xor}) implicitly perform sign extension on the shorter
 * of the two operands prior to performing the operation.
 *
 * <p>Comparison operations perform signed integer comparisons, analogous to
 * those performed by Java's relational and equality operators.
 *
 * <p>Modular arithmetic operations are provided to compute residues, perform
 * exponentiation, and compute multiplicative inverses.  These methods always
 * return a non-negative result, between {@code 0} and {@code (modulus - 1)},
 * inclusive.
 *
 * <p>Bit operations operate on a single bit of the two's-complement
 * representation of their operand.  If necessary, the operand is sign-
 * extended so that it contains the designated bit.  None of the single-bit
 * operations can produce a BigInteger with a different sign from the
 * BigInteger being operated on, as they affect only a single bit, and the
 * "infinite word size" abstraction provided by this class ensures that there
 * are infinitely many "virtual sign bits" preceding each BigInteger.
 *
 * <p>For the sake of brevity and clarity, pseudo-code is used throughout the
 * descriptions of BigInteger methods.  The pseudo-code expression
 * {@code (i + j)} is shorthand for "a BigInteger whose value is
 * that of the BigInteger {@code i} plus that of the BigInteger {@code j}."
 * The pseudo-code expression {@code (i == j)} is shorthand for
 * "{@code true} if and only if the BigInteger {@code i} represents the same
 * value as the BigInteger {@code j}."  Other pseudo-code expressions are
 * interpreted similarly.
 *
 * <p>All methods and constructors in this class throw
 * {@code NullPointerException} when passed
 * a null object reference for any input parameter.
 *
 * BigInteger must support values in the range
 * -2<sup>{@code Integer.MAX_VALUE}</sup> (exclusive) to
 * +2<sup>{@code Integer.MAX_VALUE}</sup> (exclusive)
 * and may support values outside of that range.
 *
 * The range of probable prime values is limited and may be less than
 * the full supported positive range of {@code BigInteger}.
 * The range must be at least 1 to 2<sup>500000000</sup>.
 *
 * @implNote
 * BigInteger constructors and operations throw {@code ArithmeticException} when
 * the result is out of the supported range of
 * -2<sup>{@code Integer.MAX_VALUE}</sup> (exclusive) to
 * +2<sup>{@code Integer.MAX_VALUE}</sup> (exclusive).
 *
 * @see     BigDecimal
 * @author  Josh Bloch
 * @author  Michael McCloskey
 * @author  Alan Eliasen
 * @author  Timothy Buktu
 * @since JDK1.1
 */
