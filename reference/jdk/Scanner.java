_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/Scanner.java
/* *************************************************

/**
 * Defines the Scanner interface, which CUP uses in the default
 * implementation of <code>lr_parser.scan()</code>.  Integration
 * of scanners implementing <code>Scanner</code> is facilitated.
 *
 * @author David MacMahon <davidm@smartsc.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java_cup/internal/runtime/Scanner.java
/* *************************************************

/**
 * Defines the Scanner interface, which CUP uses in the default
 * implementation of <code>lr_parser.scan()</code>.  Integration
 * of scanners implementing <code>Scanner</code> is facilitated.
 *
 * @author David MacMahon <davidm@smartsc.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner reset() {

    /**
     * Resets this scanner.
     *
     * <p> Resetting a scanner discards all of its explicit state
     * information which may have been changed by invocations of {@link
     * #useDelimiter}, {@link #useLocale}, or {@link #useRadix}.
     *
     * <p> An invocation of this method of the form
     * <tt>scanner.reset()</tt> behaves in exactly the same way as the
     * invocation
     *
     * <blockquote><pre>{@code
     *   scanner.useDelimiter("\\p{javaWhitespace}+")
     *          .useLocale(Locale.getDefault(Locale.Category.FORMAT))
     *          .useRadix(10);
     * }</pre></blockquote>
     *
     * @return this scanner
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public BigDecimal nextBigDecimal() {

    /**
     * Scans the next token of the input as a {@link java.math.BigDecimal
     * BigDecimal}.
     *
     * <p> If the next token matches the <a
     * href="#Decimal-regex"><i>Decimal</i></a> regular expression defined
     * above then the token is converted into a <tt>BigDecimal</tt> value as if
     * by removing all group separators, mapping non-ASCII digits into ASCII
     * digits via the {@link Character#digit Character.digit}, and passing the
     * resulting string to the {@link
     * java.math.BigDecimal#BigDecimal(java.lang.String) BigDecimal(String)}
     * constructor.
     *
     * @return the <tt>BigDecimal</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Decimal</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if the input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextBigDecimal() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a <code>BigDecimal</code> using the
     * {@link #nextBigDecimal} method. The scanner does not advance past any
     * input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         <code>BigDecimal</code>
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public BigInteger nextBigInteger(int radix) {

    /**
     * Scans the next token of the input as a {@link java.math.BigInteger
     * BigInteger}.
     *
     * <p> If the next token matches the <a
     * href="#Integer-regex"><i>Integer</i></a> regular expression defined
     * above then the token is converted into a <tt>BigInteger</tt> value as if
     * by removing all group separators, mapping non-ASCII digits into ASCII
     * digits via the {@link Character#digit Character.digit}, and passing the
     * resulting string to the {@link
     * java.math.BigInteger#BigInteger(java.lang.String)
     * BigInteger(String, int)} constructor with the specified radix.
     *
     * @param radix the radix used to interpret the token
     * @return the <tt>BigInteger</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if the input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public BigInteger nextBigInteger() {

    /**
     * Scans the next token of the input as a {@link java.math.BigInteger
     * BigInteger}.
     *
     * <p> An invocation of this method of the form
     * <tt>nextBigInteger()</tt> behaves in exactly the same way as the
     * invocation <tt>nextBigInteger(radix)</tt>, where <code>radix</code>
     * is the default radix of this scanner.
     *
     * @return the <tt>BigInteger</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if the input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextBigInteger(int radix) {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a <code>BigInteger</code> in the specified radix using
     * the {@link #nextBigInteger} method. The scanner does not advance past
     * any input.
     *
     * @param radix the radix used to interpret the token as an integer
     * @return true if and only if this scanner's next token is a valid
     *         <code>BigInteger</code>
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextBigInteger() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a <code>BigInteger</code> in the default radix using the
     * {@link #nextBigInteger} method. The scanner does not advance past any
     * input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         <code>BigInteger</code>
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public double nextDouble() {

    /**
     * Scans the next token of the input as a <tt>double</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid double value.
     * If the translation is successful, the scanner advances past the input
     * that matched.
     *
     * <p> If the next token matches the <a
     * href="#Float-regex"><i>Float</i></a> regular expression defined above
     * then the token is converted into a <tt>double</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Double#parseDouble Double.parseDouble}. If the token matches
     * the localized NaN or infinity strings, then either "Nan" or "Infinity"
     * is passed to {@link Double#parseDouble(String) Double.parseDouble} as
     * appropriate.
     *
     * @return the <tt>double</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Float</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if the input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextDouble() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a double value using the {@link #nextDouble}
     * method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         double value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public float nextFloat() {

    /**
     * Scans the next token of the input as a <tt>float</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid float value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Float-regex"><i>Float</i></a> regular expression defined above
     * then the token is converted into a <tt>float</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Float#parseFloat Float.parseFloat}. If the token matches
     * the localized NaN or infinity strings, then either "Nan" or "Infinity"
     * is passed to {@link Float#parseFloat(String) Float.parseFloat} as
     * appropriate.
     *
     * @return the <tt>float</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Float</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextFloat() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a float value using the {@link #nextFloat}
     * method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         float value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private String processFloatToken(String token) {

    /**
     * The float token must be stripped of prefixes, group separators,
     * and suffixes, non ascii digits must be converted into ascii digits
     * before parseFloat will accept it.
     *
     * If there are non-ascii digits in the token these digits must
     * be processed before the token is passed to parseFloat.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public long nextLong(int radix) {

    /**
     * Scans the next token of the input as a <tt>long</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid long value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Integer-regex"><i>Integer</i></a> regular expression defined
     * above then the token is converted into a <tt>long</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Long#parseLong(String, int) Long.parseLong} with the
     * specified radix.
     *
     * @param radix the radix used to interpret the token as an int value
     * @return the <tt>long</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public long nextLong() {

    /**
     * Scans the next token of the input as a <tt>long</tt>.
     *
     * <p> An invocation of this method of the form
     * <tt>nextLong()</tt> behaves in exactly the same way as the
     * invocation <tt>nextLong(radix)</tt>, where <code>radix</code>
     * is the default radix of this scanner.
     *
     * @return the <tt>long</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextLong(int radix) {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a long value in the specified radix using the
     * {@link #nextLong} method. The scanner does not advance past any input.
     *
     * @param radix the radix used to interpret the token as a long value
     * @return true if and only if this scanner's next token is a valid
     *         long value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextLong() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a long value in the default radix using the
     * {@link #nextLong} method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         long value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public int nextInt(int radix) {

    /**
     * Scans the next token of the input as an <tt>int</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid int value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Integer-regex"><i>Integer</i></a> regular expression defined
     * above then the token is converted into an <tt>int</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Integer#parseInt(String, int) Integer.parseInt} with the
     * specified radix.
     *
     * @param radix the radix used to interpret the token as an int value
     * @return the <tt>int</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public int nextInt() {

    /**
     * Scans the next token of the input as an <tt>int</tt>.
     *
     * <p> An invocation of this method of the form
     * <tt>nextInt()</tt> behaves in exactly the same way as the
     * invocation <tt>nextInt(radix)</tt>, where <code>radix</code>
     * is the default radix of this scanner.
     *
     * @return the <tt>int</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private String processIntegerToken(String token) {

    /**
     * The integer token must be stripped of prefixes, group separators,
     * and suffixes, non ascii digits must be converted into ascii digits
     * before parse will accept it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextInt(int radix) {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as an int value in the specified radix using the
     * {@link #nextInt} method. The scanner does not advance past any input.
     *
     * @param radix the radix used to interpret the token as an int value
     * @return true if and only if this scanner's next token is a valid
     *         int value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextInt() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as an int value in the default radix using the
     * {@link #nextInt} method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         int value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public short nextShort(int radix) {

    /**
     * Scans the next token of the input as a <tt>short</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid short value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Integer-regex"><i>Integer</i></a> regular expression defined
     * above then the token is converted into a <tt>short</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Short#parseShort(String, int) Short.parseShort} with the
     * specified radix.
     *
     * @param radix the radix used to interpret the token as a short value
     * @return the <tt>short</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public short nextShort() {

    /**
     * Scans the next token of the input as a <tt>short</tt>.
     *
     * <p> An invocation of this method of the form
     * <tt>nextShort()</tt> behaves in exactly the same way as the
     * invocation <tt>nextShort(radix)</tt>, where <code>radix</code>
     * is the default radix of this scanner.
     *
     * @return the <tt>short</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextShort(int radix) {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a short value in the specified radix using the
     * {@link #nextShort} method. The scanner does not advance past any input.
     *
     * @param radix the radix used to interpret the token as a short value
     * @return true if and only if this scanner's next token is a valid
     *         short value in the specified radix
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextShort() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a short value in the default radix using the
     * {@link #nextShort} method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         short value in the default radix
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public byte nextByte(int radix) {

    /**
     * Scans the next token of the input as a <tt>byte</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid byte value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Integer-regex"><i>Integer</i></a> regular expression defined
     * above then the token is converted into a <tt>byte</tt> value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Byte#parseByte(String, int) Byte.parseByte} with the
     * specified radix.
     *
     * @param radix the radix used to interpret the token as a byte value
     * @return the <tt>byte</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public byte nextByte() {

    /**
     * Scans the next token of the input as a <tt>byte</tt>.
     *
     * <p> An invocation of this method of the form
     * <tt>nextByte()</tt> behaves in exactly the same way as the
     * invocation <tt>nextByte(radix)</tt>, where <code>radix</code>
     * is the default radix of this scanner.
     *
     * @return the <tt>byte</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextByte(int radix) {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a byte value in the specified radix using the
     * {@link #nextByte} method. The scanner does not advance past any input.
     *
     * @param radix the radix used to interpret the token as a byte value
     * @return true if and only if this scanner's next token is a valid
     *         byte value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextByte() {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a byte value in the default radix using the
     * {@link #nextByte} method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         byte value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean nextBoolean()  {

    /**
     * Scans the next token of the input into a boolean value and returns
     * that value. This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid boolean value.
     * If the match is successful, the scanner advances past the input that
     * matched.
     *
     * @return the boolean scanned from the input
     * @throws InputMismatchException if the next token is not a valid boolean
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextBoolean()  {

    /**
     * Returns true if the next token in this scanner's input can be
     * interpreted as a boolean value using a case insensitive pattern
     * created from the string "true|false".  The scanner does not
     * advance past the input that matched.
     *
     * @return true if and only if this scanner's next token is a valid
     *         boolean value
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner skip(String pattern) {

    /**
     * Skips input that matches a pattern constructed from the specified
     * string.
     *
     * <p> An invocation of this method of the form <tt>skip(pattern)</tt>
     * behaves in exactly the same way as the invocation
     * <tt>skip(Pattern.compile(pattern))</tt>.
     *
     * @param pattern a string specifying the pattern to skip over
     * @return this scanner
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner skip(Pattern pattern) {

    /**
     * Skips input that matches the specified pattern, ignoring delimiters.
     * This method will skip input if an anchored match of the specified
     * pattern succeeds.
     *
     * <p>If a match to the specified pattern is not found at the
     * current position, then no input is skipped and a
     * <tt>NoSuchElementException</tt> is thrown.
     *
     * <p>Since this method seeks to match the specified pattern starting at
     * the scanner's current position, patterns that can match a lot of
     * input (".*", for example) may cause the scanner to buffer a large
     * amount of input.
     *
     * <p>Note that it is possible to skip something without risking a
     * <code>NoSuchElementException</code> by using a pattern that can
     * match nothing, e.g., <code>sc.skip("[ \t]*")</code>.
     *
     * @param pattern a string specifying the pattern to skip over
     * @return this scanner
     * @throws NoSuchElementException if the specified pattern is not found
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String findWithinHorizon(Pattern pattern, int horizon) {

    /**
     * Attempts to find the next occurrence of the specified pattern.
     *
     * <p>This method searches through the input up to the specified
     * search horizon, ignoring delimiters. If the pattern is found the
     * scanner advances past the input that matched and returns the string
     * that matched the pattern. If no such pattern is detected then the
     * null is returned and the scanner's position remains unchanged. This
     * method may block waiting for input that matches the pattern.
     *
     * <p>A scanner will never search more than <code>horizon</code> code
     * points beyond its current position. Note that a match may be clipped
     * by the horizon; that is, an arbitrary match result may have been
     * different if the horizon had been larger. The scanner treats the
     * horizon as a transparent, non-anchoring bound (see {@link
     * Matcher#useTransparentBounds} and {@link Matcher#useAnchoringBounds}).
     *
     * <p>If horizon is <code>0</code>, then the horizon is ignored and
     * this method continues to search through the input looking for the
     * specified pattern without bound. In this case it may buffer all of
     * the input searching for the pattern.
     *
     * <p>If horizon is negative, then an IllegalArgumentException is
     * thrown.
     *
     * @param pattern the pattern to scan for
     * @param horizon the search horizon
     * @return the text that matched the specified pattern
     * @throws IllegalStateException if this scanner is closed
     * @throws IllegalArgumentException if horizon is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String findWithinHorizon(String pattern, int horizon) {

    /**
     * Attempts to find the next occurrence of a pattern constructed from the
     * specified string, ignoring delimiters.
     *
     * <p>An invocation of this method of the form
     * <tt>findWithinHorizon(pattern)</tt> behaves in exactly the same way as
     * the invocation
     * <tt>findWithinHorizon(Pattern.compile(pattern, horizon))</tt>.
     *
     * @param pattern a string specifying the pattern to search for
     * @param horizon the search horizon
     * @return the text that matched the specified pattern
     * @throws IllegalStateException if this scanner is closed
     * @throws IllegalArgumentException if horizon is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String findInLine(Pattern pattern) {

    /**
     * Attempts to find the next occurrence of the specified pattern ignoring
     * delimiters. If the pattern is found before the next line separator, the
     * scanner advances past the input that matched and returns the string that
     * matched the pattern.
     * If no such pattern is detected in the input up to the next line
     * separator, then <code>null</code> is returned and the scanner's
     * position is unchanged. This method may block waiting for input that
     * matches the pattern.
     *
     * <p>Since this method continues to search through the input looking
     * for the specified pattern, it may buffer all of the input searching for
     * the desired token if no line separators are present.
     *
     * @param pattern the pattern to scan for
     * @return the text that matched the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String findInLine(String pattern) {

    /**
     * Attempts to find the next occurrence of a pattern constructed from the
     * specified string, ignoring delimiters.
     *
     * <p>An invocation of this method of the form <tt>findInLine(pattern)</tt>
     * behaves in exactly the same way as the invocation
     * <tt>findInLine(Pattern.compile(pattern))</tt>.
     *
     * @param pattern a string specifying the pattern to search for
     * @return the text that matched the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String nextLine() {

    /**
     * Advances this scanner past the current line and returns the input
     * that was skipped.
     *
     * This method returns the rest of the current line, excluding any line
     * separator at the end. The position is set to the beginning of the next
     * line.
     *
     * <p>Since this method continues to search through the input looking
     * for a line separator, it may buffer all of the input searching for
     * the line to skip if no line separators are present.
     *
     * @return the line that was skipped
     * @throws NoSuchElementException if no line was found
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNextLine() {

    /**
     * Returns true if there is another line in the input of this scanner.
     * This method may block while waiting for input. The scanner does not
     * advance past any input.
     *
     * @return true if and only if this scanner has another line of input
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String next(Pattern pattern) {

    /**
     * Returns the next token if it matches the specified pattern. This
     * method may block while waiting for input to scan, even if a previous
     * invocation of {@link #hasNext(Pattern)} returned <code>true</code>.
     * If the match is successful, the scanner advances past the input that
     * matched the pattern.
     *
     * @param pattern the pattern to scan for
     * @return the next token
     * @throws NoSuchElementException if no more tokens are available
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNext(Pattern pattern) {

    /**
     * Returns true if the next complete token matches the specified pattern.
     * A complete token is prefixed and postfixed by input that matches
     * the delimiter pattern. This method may block while waiting for input.
     * The scanner does not advance past any input.
     *
     * @param pattern the pattern to scan for
     * @return true if and only if this scanner has another token matching
     *         the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String next(String pattern)  {

    /**
     * Returns the next token if it matches the pattern constructed from the
     * specified string.  If the match is successful, the scanner advances
     * past the input that matched the pattern.
     *
     * <p> An invocation of this method of the form <tt>next(pattern)</tt>
     * behaves in exactly the same way as the invocation
     * <tt>next(Pattern.compile(pattern))</tt>.
     *
     * @param pattern a string specifying the pattern to scan
     * @return the next token
     * @throws NoSuchElementException if no such tokens are available
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNext(String pattern)  {

    /**
     * Returns true if the next token matches the pattern constructed from the
     * specified string. The scanner does not advance past any input.
     *
     * <p> An invocation of this method of the form <tt>hasNext(pattern)</tt>
     * behaves in exactly the same way as the invocation
     * <tt>hasNext(Pattern.compile(pattern))</tt>.
     *
     * @param pattern a string specifying the pattern to scan
     * @return true if and only if this scanner has another token matching
     *         the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public void remove() {

    /**
     * The remove operation is not supported by this implementation of
     * <code>Iterator</code>.
     *
     * @throws UnsupportedOperationException if this method is invoked.
     * @see java.util.Iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String next() {

    /**
     * Finds and returns the next complete token from this scanner.
     * A complete token is preceded and followed by input that matches
     * the delimiter pattern. This method may block while waiting for input
     * to scan, even if a previous invocation of {@link #hasNext} returned
     * <code>true</code>.
     *
     * @return the next token
     * @throws NoSuchElementException if no more tokens are available
     * @throws IllegalStateException if this scanner is closed
     * @see java.util.Iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public boolean hasNext() {

    /**
     * Returns true if this scanner has another token in its input.
     * This method may block while waiting for input to scan.
     * The scanner does not advance past any input.
     *
     * @return true if and only if this scanner has another token
     * @throws IllegalStateException if this scanner is closed
     * @see java.util.Iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public String toString() {

    /**
     * <p>Returns the string representation of this <code>Scanner</code>. The
     * string representation of a <code>Scanner</code> contains information
     * that may be useful for debugging. The exact format is unspecified.
     *
     * @return  The string representation of this scanner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public MatchResult match() {

    /**
     * Returns the match result of the last scanning operation performed
     * by this scanner. This method throws <code>IllegalStateException</code>
     * if no match has been performed, or if the last match was
     * not successful.
     *
     * <p>The various <code>next</code>methods of <code>Scanner</code>
     * make a match result available if they complete without throwing an
     * exception. For instance, after an invocation of the {@link #nextInt}
     * method that returned an int, this method returns a
     * <code>MatchResult</code> for the search of the
     * <a href="#Integer-regex"><i>Integer</i></a> regular expression
     * defined above. Similarly the {@link #findInLine},
     * {@link #findWithinHorizon}, and {@link #skip} methods will make a
     * match available if they succeed.
     *
     * @return a match result for the last match operation
     * @throws IllegalStateException  If no match result is available
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner useRadix(int radix) {

    /**
     * Sets this scanner's default radix to the specified radix.
     *
     * <p>A scanner's radix affects elements of its default
     * number matching regular expressions; see
     * <a href= "#localized-numbers">localized numbers</a> above.
     *
     * <p>If the radix is less than <code>Character.MIN_RADIX</code>
     * or greater than <code>Character.MAX_RADIX</code>, then an
     * <code>IllegalArgumentException</code> is thrown.
     *
     * <p>Invoking the {@link #reset} method will set the scanner's radix to
     * <code>10</code>.
     *
     * @param radix The radix to use when scanning numbers
     * @return this scanner
     * @throws IllegalArgumentException if radix is out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public int radix() {

    /**
     * Returns this scanner's default radix.
     *
     * <p>A scanner's radix affects elements of its default
     * number matching regular expressions; see
     * <a href= "#localized-numbers">localized numbers</a> above.
     *
     * @return the default radix of this scanner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner useLocale(Locale locale) {

    /**
     * Sets this scanner's locale to the specified locale.
     *
     * <p>A scanner's locale affects many elements of its default
     * primitive matching regular expressions; see
     * <a href= "#localized-numbers">localized numbers</a> above.
     *
     * <p>Invoking the {@link #reset} method will set the scanner's locale to
     * the <a href= "#initial-locale">initial locale</a>.
     *
     * @param locale A string specifying the locale to use
     * @return this scanner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Locale locale() {

    /**
     * Returns this scanner's locale.
     *
     * <p>A scanner's locale affects many elements of its default
     * primitive matching regular expressions; see
     * <a href= "#localized-numbers">localized numbers</a> above.
     *
     * @return this scanner's locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner useDelimiter(String pattern) {

    /**
     * Sets this scanner's delimiting pattern to a pattern constructed from
     * the specified <code>String</code>.
     *
     * <p> An invocation of this method of the form
     * <tt>useDelimiter(pattern)</tt> behaves in exactly the same way as the
     * invocation <tt>useDelimiter(Pattern.compile(pattern))</tt>.
     *
     * <p> Invoking the {@link #reset} method will set the scanner's delimiter
     * to the <a href= "#default-delimiter">default</a>.
     *
     * @param pattern A string specifying a delimiting pattern
     * @return this scanner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner useDelimiter(Pattern pattern) {

    /**
     * Sets this scanner's delimiting pattern to the specified pattern.
     *
     * @param pattern A delimiting pattern
     * @return this scanner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Pattern delimiter() {

    /**
     * Returns the <code>Pattern</code> this <code>Scanner</code> is currently
     * using to match delimiters.
     *
     * @return this scanner's delimiting pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public IOException ioException() {

    /**
     * Returns the <code>IOException</code> last thrown by this
     * <code>Scanner</code>'s underlying <code>Readable</code>. This method
     * returns <code>null</code> if no such exception exists.
     *
     * @return the last exception thrown by this scanner's readable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public void close() {

    /**
     * Closes this scanner.
     *
     * <p> If this scanner has not yet been closed then if its underlying
     * {@linkplain java.lang.Readable readable} also implements the {@link
     * java.io.Closeable} interface then the readable's <tt>close</tt> method
     * will be invoked.  If this scanner is already closed then invoking this
     * method will have no effect.
     *
     * <p>Attempting to perform search operations after a scanner has
     * been closed will result in an {@link IllegalStateException}.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(ReadableByteChannel source, String charsetName) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified channel. Bytes from the source are converted into
     * characters using the specified charset.
     *
     * @param  source A channel to scan
     * @param charsetName The encoding type used to convert bytes from the
     *        channel into characters to be scanned
     * @throws IllegalArgumentException if the specified character set
     *         does not exist
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(ReadableByteChannel source) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified channel. Bytes from the source are converted into
     * characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     * @param  source A channel to scan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(String source) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified string.
     *
     * @param  source A string to scan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(Path source, String charsetName) throws IOException {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified file. Bytes from the file are converted into
     * characters using the specified charset.
     *
     * @param   source
     *          the path to the file to be scanned
     * @param   charsetName
     *          The encoding type used to convert bytes from the file
     *          into characters to be scanned
     * @throws  IOException
     *          if an I/O error occurs opening source
     * @throws  IllegalArgumentException
     *          if the specified encoding is not found
     * @since   1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(Path source)

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified file. Bytes from the file are converted into
     * characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     * @param   source
     *          the path to the file to be scanned
     * @throws  IOException
     *          if an I/O error occurs opening source
     *
     * @since   1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(File source, String charsetName)

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified file. Bytes from the file are converted into
     * characters using the specified charset.
     *
     * @param  source A file to be scanned
     * @param charsetName The encoding type used to convert bytes from the file
     *        into characters to be scanned
     * @throws FileNotFoundException if source is not found
     * @throws IllegalArgumentException if the specified encoding is
     *         not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(File source) throws FileNotFoundException {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified file. Bytes from the file are converted into
     * characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     * @param  source A file to be scanned
     * @throws FileNotFoundException if source is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private static Charset toCharset(String csn) {

    /**
     * Returns a charset object for the given charset name.
     * @throws NullPointerException          is csn is null
     * @throws IllegalArgumentException      if the charset is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(InputStream source, String charsetName) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified input stream. Bytes from the stream are converted
     * into characters using the specified charset.
     *
     * @param  source An input stream to be scanned
     * @param charsetName The encoding type used to convert bytes from the
     *        stream into characters to be scanned
     * @throws IllegalArgumentException if the specified character set
     *         does not exist
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(InputStream source) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified input stream. Bytes from the stream are converted
     * into characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     * @param  source An input stream to be scanned
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    public Scanner(Readable source) {

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified source.
     *
     * @param  source A character source implementing the {@link Readable}
     *         interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private Scanner(Readable source, Pattern pattern) {

    /**
     * Constructs a <code>Scanner</code> that returns values scanned
     * from the specified source delimited by the specified pattern.
     *
     * @param source A character source implementing the Readable interface
     * @param pattern A delimiting pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private Pattern floatPattern;

    /**
     * Fields and methods to match floats and doubles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private static volatile Pattern separatorPattern;

    /**
     * Fields and an accessor method to match line separators
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private Pattern integerPattern;

    /**
     * Fields and methods to match bytes, shorts, ints, and longs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private static volatile Pattern boolPattern;

    /**
     * Fields and an accessor method to match booleans
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
    private String groupSeparator = "\\,";

    /**
     * Locale dependent values used to scan numbers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Scanner.java
public final class Scanner implements Iterator<String>, Closeable {

/**
 * A simple text scanner which can parse primitive types and strings using
 * regular expressions.
 *
 * <p>A <code>Scanner</code> breaks its input into tokens using a
 * delimiter pattern, which by default matches whitespace. The resulting
 * tokens may then be converted into values of different types using the
 * various <tt>next</tt> methods.
 *
 * <p>For example, this code allows a user to read a number from
 * <tt>System.in</tt>:
 * <blockquote><pre>{@code
 *     Scanner sc = new Scanner(System.in);
 *     int i = sc.nextInt();
 * }</pre></blockquote>
 *
 * <p>As another example, this code allows <code>long</code> types to be
 * assigned from entries in a file <code>myNumbers</code>:
 * <blockquote><pre>{@code
 *      Scanner sc = new Scanner(new File("myNumbers"));
 *      while (sc.hasNextLong()) {
 *          long aLong = sc.nextLong();
 *      }
 * }</pre></blockquote>
 *
 * <p>The scanner can also use delimiters other than whitespace. This
 * example reads several items in from a string:
 * <blockquote><pre>{@code
 *     String input = "1 fish 2 fish red fish blue fish";
 *     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
 *     System.out.println(s.nextInt());
 *     System.out.println(s.nextInt());
 *     System.out.println(s.next());
 *     System.out.println(s.next());
 *     s.close();
 * }</pre></blockquote>
 * <p>
 * prints the following output:
 * <blockquote><pre>{@code
 *     1
 *     2
 *     red
 *     blue
 * }</pre></blockquote>
 *
 * <p>The same output can be generated with this code, which uses a regular
 * expression to parse all four tokens at once:
 * <blockquote><pre>{@code
 *     String input = "1 fish 2 fish red fish blue fish";
 *     Scanner s = new Scanner(input);
 *     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
 *     MatchResult result = s.match();
 *     for (int i=1; i<=result.groupCount(); i++)
 *         System.out.println(result.group(i));
 *     s.close();
 * }</pre></blockquote>
 *
 * <p>The <a name="default-delimiter">default whitespace delimiter</a> used
 * by a scanner is as recognized by {@link java.lang.Character}.{@link
 * java.lang.Character#isWhitespace(char) isWhitespace}. The {@link #reset}
 * method will reset the value of the scanner's delimiter to the default
 * whitespace delimiter regardless of whether it was previously changed.
 *
 * <p>A scanning operation may block waiting for input.
 *
 * <p>The {@link #next} and {@link #hasNext} methods and their
 * primitive-type companion methods (such as {@link #nextInt} and
 * {@link #hasNextInt}) first skip any input that matches the delimiter
 * pattern, and then attempt to return the next token. Both <tt>hasNext</tt>
 * and <tt>next</tt> methods may block waiting for further input.  Whether a
 * <tt>hasNext</tt> method blocks has no connection to whether or not its
 * associated <tt>next</tt> method will block.
 *
 * <p> The {@link #findInLine}, {@link #findWithinHorizon}, and {@link #skip}
 * methods operate independently of the delimiter pattern. These methods will
 * attempt to match the specified pattern with no regard to delimiters in the
 * input and thus can be used in special circumstances where delimiters are
 * not relevant. These methods may block waiting for more input.
 *
 * <p>When a scanner throws an {@link InputMismatchException}, the scanner
 * will not pass the token that caused the exception, so that it may be
 * retrieved or skipped via some other method.
 *
 * <p>Depending upon the type of delimiting pattern, empty tokens may be
 * returned. For example, the pattern <tt>"\\s+"</tt> will return no empty
 * tokens since it matches multiple instances of the delimiter. The delimiting
 * pattern <tt>"\\s"</tt> could return empty tokens since it only passes one
 * space at a time.
 *
 * <p> A scanner can read text from any object which implements the {@link
 * java.lang.Readable} interface.  If an invocation of the underlying
 * readable's {@link java.lang.Readable#read} method throws an {@link
 * java.io.IOException} then the scanner assumes that the end of the input
 * has been reached.  The most recent <tt>IOException</tt> thrown by the
 * underlying readable can be retrieved via the {@link #ioException} method.
 *
 * <p>When a <code>Scanner</code> is closed, it will close its input source
 * if the source implements the {@link java.io.Closeable} interface.
 *
 * <p>A <code>Scanner</code> is not safe for multithreaded use without
 * external synchronization.
 *
 * <p>Unless otherwise mentioned, passing a <code>null</code> parameter into
 * any method of a <code>Scanner</code> will cause a
 * <code>NullPointerException</code> to be thrown.
 *
 * <p>A scanner will default to interpreting numbers as decimal unless a
 * different radix has been set by using the {@link #useRadix} method. The
 * {@link #reset} method will reset the value of the scanner's radix to
 * <code>10</code> regardless of whether it was previously changed.
 *
 * <h3> <a name="localized-numbers">Localized numbers</a> </h3>
 *
 * <p> An instance of this class is capable of scanning numbers in the standard
 * formats as well as in the formats of the scanner's locale. A scanner's
 * <a name="initial-locale">initial locale </a>is the value returned by the {@link
 * java.util.Locale#getDefault(Locale.Category)
 * Locale.getDefault(Locale.Category.FORMAT)} method; it may be changed via the {@link
 * #useLocale} method. The {@link #reset} method will reset the value of the
 * scanner's locale to the initial locale regardless of whether it was
 * previously changed.
 *
 * <p>The localized formats are defined in terms of the following parameters,
 * which for a particular locale are taken from that locale's {@link
 * java.text.DecimalFormat DecimalFormat} object, <tt>df</tt>, and its and
 * {@link java.text.DecimalFormatSymbols DecimalFormatSymbols} object,
 * <tt>dfs</tt>.
 *
 * <blockquote><dl>
 *     <dt><i>LocalGroupSeparator&nbsp;&nbsp;</i>
 *         <dd>The character used to separate thousands groups,
 *         <i>i.e.,</i>&nbsp;<tt>dfs.</tt>{@link
 *         java.text.DecimalFormatSymbols#getGroupingSeparator
 *         getGroupingSeparator()}
 *     <dt><i>LocalDecimalSeparator&nbsp;&nbsp;</i>
 *         <dd>The character used for the decimal point,
 *     <i>i.e.,</i>&nbsp;<tt>dfs.</tt>{@link
 *     java.text.DecimalFormatSymbols#getDecimalSeparator
 *     getDecimalSeparator()}
 *     <dt><i>LocalPositivePrefix&nbsp;&nbsp;</i>
 *         <dd>The string that appears before a positive number (may
 *         be empty), <i>i.e.,</i>&nbsp;<tt>df.</tt>{@link
 *         java.text.DecimalFormat#getPositivePrefix
 *         getPositivePrefix()}
 *     <dt><i>LocalPositiveSuffix&nbsp;&nbsp;</i>
 *         <dd>The string that appears after a positive number (may be
 *         empty), <i>i.e.,</i>&nbsp;<tt>df.</tt>{@link
 *         java.text.DecimalFormat#getPositiveSuffix
 *         getPositiveSuffix()}
 *     <dt><i>LocalNegativePrefix&nbsp;&nbsp;</i>
 *         <dd>The string that appears before a negative number (may
 *         be empty), <i>i.e.,</i>&nbsp;<tt>df.</tt>{@link
 *         java.text.DecimalFormat#getNegativePrefix
 *         getNegativePrefix()}
 *     <dt><i>LocalNegativeSuffix&nbsp;&nbsp;</i>
 *         <dd>The string that appears after a negative number (may be
 *         empty), <i>i.e.,</i>&nbsp;<tt>df.</tt>{@link
 *     java.text.DecimalFormat#getNegativeSuffix
 *     getNegativeSuffix()}
 *     <dt><i>LocalNaN&nbsp;&nbsp;</i>
 *         <dd>The string that represents not-a-number for
 *         floating-point values,
 *         <i>i.e.,</i>&nbsp;<tt>dfs.</tt>{@link
 *         java.text.DecimalFormatSymbols#getNaN
 *         getNaN()}
 *     <dt><i>LocalInfinity&nbsp;&nbsp;</i>
 *         <dd>The string that represents infinity for floating-point
 *         values, <i>i.e.,</i>&nbsp;<tt>dfs.</tt>{@link
 *         java.text.DecimalFormatSymbols#getInfinity
 *         getInfinity()}
 * </dl></blockquote>
 *
 * <h4> <a name="number-syntax">Number syntax</a> </h4>
 *
 * <p> The strings that can be parsed as numbers by an instance of this class
 * are specified in terms of the following regular-expression grammar, where
 * Rmax is the highest digit in the radix being used (for example, Rmax is 9 in base 10).
 *
 * <dl>
 *   <dt><i>NonAsciiDigit</i>:
 *       <dd>A non-ASCII character c for which
 *            {@link java.lang.Character#isDigit Character.isDigit}<tt>(c)</tt>
 *                        returns&nbsp;true
 *
 *   <dt><i>Non0Digit</i>:
 *       <dd><tt>[1-</tt><i>Rmax</i><tt>] | </tt><i>NonASCIIDigit</i>
 *
 *   <dt><i>Digit</i>:
 *       <dd><tt>[0-</tt><i>Rmax</i><tt>] | </tt><i>NonASCIIDigit</i>
 *
 *   <dt><i>GroupedNumeral</i>:
 *       <dd><tt>(&nbsp;</tt><i>Non0Digit</i>
 *                   <i>Digit</i><tt>?
 *                   </tt><i>Digit</i><tt>?</tt>
 *       <dd>&nbsp;&nbsp;&nbsp;&nbsp;<tt>(&nbsp;</tt><i>LocalGroupSeparator</i>
 *                         <i>Digit</i>
 *                         <i>Digit</i>
 *                         <i>Digit</i><tt> )+ )</tt>
 *
 *   <dt><i>Numeral</i>:
 *       <dd><tt>( ( </tt><i>Digit</i><tt>+ )
 *               | </tt><i>GroupedNumeral</i><tt> )</tt>
 *
 *   <dt><a name="Integer-regex"><i>Integer</i>:</a>
 *       <dd><tt>( [-+]? ( </tt><i>Numeral</i><tt>
 *                               ) )</tt>
 *       <dd><tt>| </tt><i>LocalPositivePrefix</i> <i>Numeral</i>
 *                      <i>LocalPositiveSuffix</i>
 *       <dd><tt>| </tt><i>LocalNegativePrefix</i> <i>Numeral</i>
 *                 <i>LocalNegativeSuffix</i>
 *
 *   <dt><i>DecimalNumeral</i>:
 *       <dd><i>Numeral</i>
 *       <dd><tt>| </tt><i>Numeral</i>
 *                 <i>LocalDecimalSeparator</i>
 *                 <i>Digit</i><tt>*</tt>
 *       <dd><tt>| </tt><i>LocalDecimalSeparator</i>
 *                 <i>Digit</i><tt>+</tt>
 *
 *   <dt><i>Exponent</i>:
 *       <dd><tt>( [eE] [+-]? </tt><i>Digit</i><tt>+ )</tt>
 *
 *   <dt><a name="Decimal-regex"><i>Decimal</i>:</a>
 *       <dd><tt>( [-+]? </tt><i>DecimalNumeral</i>
 *                         <i>Exponent</i><tt>? )</tt>
 *       <dd><tt>| </tt><i>LocalPositivePrefix</i>
 *                 <i>DecimalNumeral</i>
 *                 <i>LocalPositiveSuffix</i>
 *                 <i>Exponent</i><tt>?</tt>
 *       <dd><tt>| </tt><i>LocalNegativePrefix</i>
 *                 <i>DecimalNumeral</i>
 *                 <i>LocalNegativeSuffix</i>
 *                 <i>Exponent</i><tt>?</tt>
 *
 *   <dt><i>HexFloat</i>:
 *       <dd><tt>[-+]? 0[xX][0-9a-fA-F]*\.[0-9a-fA-F]+
 *                 ([pP][-+]?[0-9]+)?</tt>
 *
 *   <dt><i>NonNumber</i>:
 *       <dd><tt>NaN
 *                          | </tt><i>LocalNan</i><tt>
 *                          | Infinity
 *                          | </tt><i>LocalInfinity</i>
 *
 *   <dt><i>SignedNonNumber</i>:
 *       <dd><tt>( [-+]? </tt><i>NonNumber</i><tt> )</tt>
 *       <dd><tt>| </tt><i>LocalPositivePrefix</i>
 *                 <i>NonNumber</i>
 *                 <i>LocalPositiveSuffix</i>
 *       <dd><tt>| </tt><i>LocalNegativePrefix</i>
 *                 <i>NonNumber</i>
 *                 <i>LocalNegativeSuffix</i>
 *
 *   <dt><a name="Float-regex"><i>Float</i></a>:
 *       <dd><i>Decimal</i>
 *           <tt>| </tt><i>HexFloat</i>
 *           <tt>| </tt><i>SignedNonNumber</i>
 *
 * </dl>
 * <p>Whitespace is not significant in the above regular expressions.
 *
 * @since   1.5
 */
