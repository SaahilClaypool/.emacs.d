_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger euclidModInverse(int k) {

    /**
     * Uses the extended Euclidean algorithm to compute the modInverse of base
     * mod a modulus that is a power of 2. The modulus is 2^k.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static MutableBigInteger fixup(MutableBigInteger c, MutableBigInteger p,
                                                                      int k) {

    /**
     * The Fixup Algorithm
     * Calculates X such that X = C * 2^(-k) (mod P)
     * Assumes C<P and P is odd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger modInverse(MutableBigInteger mod) {

    /**
     * Calculate the multiplicative inverse of this mod mod, where mod is odd.
     * This and mod are not changed by the calculation.
     *
     * This method implements an algorithm due to Richard Schroeppel, that uses
     * the same intermediate representation as Montgomery Reduction
     * ("Montgomery Form").  The algorithm is described in an unpublished
     * manuscript entitled "Fast Modular Reciprocals."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static MutableBigInteger modInverseBP2(MutableBigInteger mod, int k) {

    /**
     * Calculate the multiplicative inverse of 2^k mod mod, where mod is odd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static int inverseMod32(int val) {

    /**
     * Returns the multiplicative inverse of val mod 2^32.  Assumes val is odd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger mutableModInverse(MutableBigInteger p) {

    /**
     * Returns the modInverse of this mod p. This and p are not affected by
     * the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static int binaryGcd(int a, int b) {

    /**
     * Calculate GCD of a and b interpreted as unsigned integers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger binaryGCD(MutableBigInteger v) {

    /**
     * Calculate GCD of this and v.
     * Assumes that this and v are not zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger hybridGCD(MutableBigInteger b) {

    /**
     * Calculate GCD of this and b. This and b are changed by the computation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static long divWord(long n, int d) {

    /**
     * This method divides a long quantity by an int to estimate
     * qhat for two multi precision numbers. It is used when
     * the signed value of n is less than zero.
     * Returns long value where high 32 bits contain remainder value and
     * low 32 bits contain quotient value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private boolean unsignedLongCompare(long one, long two) {

    /**
     * Compare two longs as if they were unsigned.
     * Returns true iff one is bigger than two.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int mulsubLong(int[] q, int dh, int dl, int x, int offset) {

    /**
     * This method is used for division by long.
     * Specialized version of the method sulsub.
     * dh is a high part of the divisor, dl is a low part
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int divaddLong(int dh, int dl, int[] result, int offset) {

    /**
     * A primitive used for division by long.
     * Specialized version of the method divadd.
     * dh is a high part of the divisor, dl is a low part
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger divideLongMagnitude(long ldivisor, MutableBigInteger quotient) {

    /**
     * Divide this MutableBigInteger by the divisor represented by positive long
     * value. The quotient will be placed into the provided quotient object &
     * the remainder object is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger divideMagnitude(MutableBigInteger div,
                                              MutableBigInteger quotient,
                                              boolean needRemainder ) {

    /**
     * Divide this MutableBigInteger by the divisor.
     * The quotient will be placed into the provided quotient object &
     * the remainder object is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    long divide(long v, MutableBigInteger quotient) {

    /**
     * Internally used  to calculate the quotient of this div v and places the
     * quotient in the provided MutableBigInteger object and the remainder is
     * returned.
     *
     * @return the remainder of the division will be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    long bitLength() {

    /** @see BigInteger#bitLength() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger getBlock(int index, int numBlocks, int blockLength) {

    /**
     * Returns a {@code MutableBigInteger} containing {@code blockLength} ints from
     * {@code this} number, starting at {@code index*blockLength}.<br/>
     * Used by Burnikel-Ziegler division.
     * @param index the block index
     * @param numBlocks the total number of blocks in {@code this} number
     * @param blockLength length of one block in units of 32 bits
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger divide3n2n(MutableBigInteger b, MutableBigInteger quotient) {

    /**
     * This method implements algorithm 2 from pg. 5 of the Burnikel-Ziegler paper.
     * It divides a 3n-digit number by a 2n-digit number.<br/>
     * The parameter beta is 2<sup>32</sup> so all shifts are multiples of 32 bits.<br/>
     * <br/>
     * {@code this} must be a nonnegative number such that {@code 2*this.bitLength() <= 3*b.bitLength()}
     * @param quotient output parameter for {@code this/b}
     * @return {@code this%b}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private MutableBigInteger divide2n1n(MutableBigInteger b, MutableBigInteger quotient) {

    /**
     * This method implements algorithm 1 from pg. 4 of the Burnikel-Ziegler paper.
     * It divides a 2n-digit number by a n-digit number.<br/>
     * The parameter beta is 2<sup>32</sup> so all shifts are multiples of 32 bits.
     * <br/>
     * {@code this} must be a nonnegative number such that {@code this.bitLength() <= 2*b.bitLength()}
     * @param b a positive number such that {@code b.bitLength()} is even
     * @param quotient output parameter for {@code this/b}
     * @return {@code this%b}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger divideAndRemainderBurnikelZiegler(MutableBigInteger b, MutableBigInteger quotient) {

    /**
     * Computes {@code this/b} and {@code this%b} using the
     * <a href="http://cr.yp.to/bib/1998/burnikel.ps"> Burnikel-Ziegler algorithm</a>.
     * This method implements algorithm 3 from pg. 9 of the Burnikel-Ziegler paper.
     * The parameter beta was chosen to b 2<sup>32</sup> so almost all shifts are
     * multiples of 32 bits.<br/>
     * {@code this} and {@code b} must be nonnegative.
     * @param b the divisor
     * @param quotient output parameter for {@code this/b}
     * @return the remainder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger divideKnuth(MutableBigInteger b, MutableBigInteger quotient, boolean needRemainder) {

    /**
     * Calculates the quotient of this div b and places the quotient in the
     * provided MutableBigInteger objects and the remainder object is returned.
     *
     * Uses Algorithm D in Knuth section 4.3.1.
     * Many optimizations to that algorithm have been adapted from the Colin
     * Plumb C library.
     * It special cases one word divisors for speed. The content of b is not
     * changed.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger divideKnuth(MutableBigInteger b, MutableBigInteger quotient) {

    /**
     * @see #divideKnuth(MutableBigInteger, MutableBigInteger, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger divide(MutableBigInteger b, MutableBigInteger quotient) {

    /**
     * Calculates the quotient of this div b and places the quotient in the
     * provided MutableBigInteger objects and the remainder object is returned.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int divideOneWord(int divisor, MutableBigInteger quotient) {

     /**
     * This method is used for division of an n word dividend by a one word
     * divisor. The quotient is placed into quotient. The one word divisor is
     * specified by divisor.
     *
     * @return the remainder of the division is returned.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void mul(int y, MutableBigInteger z) {

    /**
     * Multiply the contents of this MutableBigInteger by the word y. The
     * result is placed into z.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void multiply(MutableBigInteger y, MutableBigInteger z) {

    /**
     * Multiply the contents of two MutableBigInteger objects. The result is
     * placed into MutableBigInteger z. The contents of y are not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int difference(MutableBigInteger b) {

    /**
     * Subtracts the smaller of a and b from the larger and places the result
     * into the larger. Returns 1 if the answer is in a, -1 if in b, 0 if no
     * operation was performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int subtract(MutableBigInteger b) {

    /**
     * Subtracts the smaller of this and b from the larger and places the
     * result into this MutableBigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void addLower(MutableBigInteger addend, int n) {

    /**
     * Adds the low {@code n} ints of {@code addend}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void addDisjoint(MutableBigInteger addend, int n) {

    /**
     * Like {@link #addShifted(MutableBigInteger, int)} but {@code this.intLen} must
     * not be greater than {@code n}. In other words, concatenates {@code this}
     * and {@code addend}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void addShifted(MutableBigInteger addend, int n) {

    /**
     * Adds the value of {@code addend} shifted {@code n} ints to the left.
     * Has the same effect as {@code addend.leftShift(32*ints); add(addend);}
     * but doesn't change the value of {@code addend}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void add(MutableBigInteger addend) {

    /**
     * Adds the contents of two MutableBigInteger objects.The result
     * is placed within this MutableBigInteger.
     * The contents of the addend are not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private void keepLower(int n) {

    /**
     * Discards all ints whose index is greater than {@code n}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private BigInteger getLower(int n) {

    /**
     * Returns a {@code BigInteger} equal to the {@code n}
     * low ints of this number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final void primitiveLeftShift(int n) {

    /**
     * Left shift this MutableBigInteger n bits, where n is
     * less than 32.
     * Assumes that intLen > 0, n > 0 for speed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final void primitiveRightShift(int n) {

    /**
     * Right shift this MutableBigInteger n bits, where n is
     * less than 32.
     * Assumes that intLen > 0, n > 0 for speed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int mulsubBorrow(int[] q, int[] a, int x, int len, int offset) {

    /**
     * The method is the same as mulsun, except the fact that q array is not
     * updated, the only result of the method is borrow flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int mulsub(int[] q, int[] a, int x, int len, int offset) {

    /**
     * This method is used for division. It multiplies an n word input a by one
     * word input x, and subtracts the n word product from q. This is needed
     * when subtracting qhat*divisor from dividend.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int divadd(int[] a, int[] result, int offset) {

    /**
     * A primitive used for division. This method adds in one multiple of the
     * divisor a back to the dividend result at a specified offset. It is used
     * when qhat was estimated too large, and must be adjusted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void leftShift(int n) {

    /**
     * Left shift this MutableBigInteger n bits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void safeLeftShift(int n) {

    /**
     * Like {@link #leftShift(int)} but {@code n} can be zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void rightShift(int n) {

    /**
     * Right shift this MutableBigInteger n bits. The MutableBigInteger is left
     * in normal form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void safeRightShift(int n) {

    /**
     * Like {@link #rightShift(int)} but {@code n} can be greater than the length of the number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    public String toString() {

    /**
     * Returns a String representation of this MutableBigInteger in radix 10.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    boolean isNormal() {

    /**
     * Returns true iff this MutableBigInteger is in normal form. A
     * MutableBigInteger is in normal form if it has no leading zeros
     * after the offset, and intLen + offset <= value.length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    boolean isOdd() {

    /**
     * Returns true iff this MutableBigInteger is odd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    boolean isEven() {

    /**
     * Returns true iff this MutableBigInteger is even.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    boolean isZero() {

    /**
     * Returns true iff this MutableBigInteger has a value of zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    boolean isOne() {

    /**
     * Returns true iff this MutableBigInteger has a value of one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void copyValue(int[] val) {

    /**
     * Sets this MutableBigInteger's value array to a copy of the specified
     * array. The intLen is set to the length of the specified array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void copyValue(MutableBigInteger src) {

    /**
     * Sets this MutableBigInteger's value array to a copy of the specified
     * array. The intLen is set to the length of the new array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void setValue(int[] val, int length) {

    /**
     * Sets this MutableBigInteger's value array to the specified array.
     * The intLen is set to the specified length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void setInt(int index, int val) {

    /**
     * Sets the int at index+offset in this MutableBigInteger to val.
     * This does not get inlined on all platforms so it is not used
     * as often as originally intended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int[] toIntArray() {

    /**
     * Convert this MutableBigInteger into an int array with no leading
     * zeros, of a length that is equal to this MutableBigInteger's intLen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final void ensureCapacity(int len) {

    /**
     * If this MutableBigInteger cannot hold len words, increase the size
     * of the value array to len words.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    final void normalize() {

    /**
     * Ensure that the MutableBigInteger is in normal form, specifically
     * making sure that there are no leading zeros, and that if the
     * magnitude is zero, then intLen is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final long getLong(int index) {

    /**
     * Return a long which is equal to the unsigned value of the int in
     * use in this MutableBigInteger at the specified index. This method is
     * not used because it is not inlined on all platforms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final int getInt(int index) {

    /**
     * Return the int in use in this MutableBigInteger at the specified
     * index. This method is not used because it is not inlined on all
     * platforms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private final int getLowestSetBit() {

    /**
     * Return the index of the lowest set bit in this MutableBigInteger. If the
     * magnitude of this MutableBigInteger is zero, -1 is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    final int compareHalf(MutableBigInteger b) {

    /**
     * Compare this against half of a MutableBigInteger object (Needed for
     * remainder tests).
     * Assumes no leading unnecessary zeros, which holds for results
     * from divide().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int compareShifted(MutableBigInteger b, int ints) {

    /**
     * Returns a value equal to what {@code b.leftShift(32*ints); return compare(b);}
     * would return, but doesn't change the value of {@code b}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    final int compare(MutableBigInteger b) {

    /**
     * Compare the magnitude of two MutableBigIntegers. Returns -1, 0 or 1
     * as this MutableBigInteger is numerically less than, equal to, or
     * greater than <tt>b</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void reset() {

    /**
     * Set a MutableBigInteger to zero, removing its offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    void clear() {

    /**
     * Clear out a MutableBigInteger for reuse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    long toCompactValue(int sign) {

    /**
     * This is for internal use in converting from a MutableBigInteger
     * object into a long value given a specified sign.
     * returns INFLATED if value is not fit into long
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    BigDecimal toBigDecimal(int sign, int scale) {

    /**
     * Convert this MutableBigInteger to BigDecimal object with the specified sign
     * and scale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    BigInteger toBigInteger() {

    /**
     * Converts this number to a nonnegative {@code BigInteger}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    BigInteger toBigInteger(int sign) {

    /**
     * Convert this MutableBigInteger to a BigInteger object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private long toLong() {

    /**
     * Convert this MutableBigInteger to a long value. The caller has to make
     * sure this MutableBigInteger can be fit into long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private int[] getMagnitudeArray() {

    /**
     * Internal helper method to return the magnitude array. The caller is not
     * supposed to modify the returned array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    private void ones(int n) {

    /**
     * Makes this number an {@code n}-int number all of whose bits are ones.
     * Used by Burnikel-Ziegler division.
     * @param n number of ints in the {@code value} array
     * @return a number equal to {@code ((1<<(32*n)))-1}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger(MutableBigInteger val) {

    /**
     * Construct a new MutableBigInteger with a magnitude equal to the
     * specified MutableBigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger(BigInteger b) {

    /**
     * Construct a new MutableBigInteger with a magnitude equal to the
     * specified BigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger(int[] val) {

    /**
     * Construct a new MutableBigInteger with the specified value array
     * up to the length of the array supplied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger(int val) {

    /**
     * Construct a new MutableBigInteger with a magnitude specified by
     * the int val.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    MutableBigInteger() {

    /**
     * The default constructor. An empty MutableBigInteger is created with
     * a one word capacity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static final int KNUTH_POW2_THRESH_ZEROS = 3;

    /**
     * The minimum number of trailing zero ints for cancelling powers of two
     * before dividing.
     * If the dividend and divisor don't share at least this many zero ints
     * at the end, {@code divideKnuth} does not eliminate common powers
     * of two from the dividend and divisor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static final int KNUTH_POW2_THRESH_LEN = 6;

    /**
     * The minimum {@code intLen} for cancelling powers of two before
     * dividing.
     * If the number of ints is less than this threshold,
     * {@code divideKnuth} does not eliminate common powers of two from
     * the dividend and divisor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    static final MutableBigInteger ONE = new MutableBigInteger(1);

    /**
     * MutableBigInteger with one element value array with the value 1. Used by
     * BigDecimal divideAndRound to increment the quotient. Use this constant
     * only when the method is not going to modify this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int offset = 0;

    /**
     * The offset into the value array where the magnitude of this
     * MutableBigInteger begins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int intLen;

    /**
     * The number of ints of the value array that are currently used
     * to hold the magnitude of this MutableBigInteger. The magnitude starts
     * at an offset and offset + intLen may be less than value.length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
    int[] value;

    /**
     * Holds the magnitude of this MutableBigInteger in big endian order.
     * The magnitude may start at an offset into the value array, and it may
     * end before the length of the value array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/MutableBigInteger.java
import static java.math.BigDecimal.INFLATED;

/**
 * A class used to represent multiprecision integers that makes efficient
 * use of allocated space by allowing a number to occupy only part of
 * an array so that the arrays do not have to be reallocated as often.
 * When performing an operation with many iterations the array used to
 * hold a number is only reallocated when necessary and does not have to
 * be the same size as the number it represents. A mutable number allows
 * calculations to occur on the same number without having to create
 * a new number for every step of the calculation as occurs with
 * BigIntegers.
 *
 * @see     BigInteger
 * @author  Michael McCloskey
 * @author  Timothy Buktu
 * @since   1.3
 */
