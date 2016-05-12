_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private void writeObject(ObjectOutputStream stream) throws IOException {

    /**
     * Converts the {@code NumericShaper.Range} enum-based parameters,
     * if any, to the bit mask-based counterparts and writes this
     * object to the {@code stream}. Any enum constants that have no
     * bit mask-based counterparts are ignored in the conversion.
     *
     * @param stream the output stream to write to
     * @throws IOException if an I/O error occurs while writing to {@code stream}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static int search(int value, int[] array, int start, int length)

    /**
     * fast binary search over subrange of array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static int getHighBit(int value) {

    /**
     * Returns the index of the high bit in value (assuming le, actually
     * power of 2 >= value). value must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public String toString() {

    /**
     * Returns a <code>String</code> that describes this shaper. This method
     * is used for debugging purposes only.
     * @return a <code>String</code> describing this shaper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public boolean equals(Object o) {

    /**
     * Returns {@code true} if the specified object is an instance of
     * <code>NumericShaper</code> and shapes identically to this one,
     * regardless of the range representations, the bit mask or the
     * enum. For example, the following code produces {@code "true"}.
     * <blockquote><pre>
     * NumericShaper ns1 = NumericShaper.getShaper(NumericShaper.ARABIC);
     * NumericShaper ns2 = NumericShaper.getShaper(NumericShaper.Range.ARABIC);
     * System.out.println(ns1.equals(ns2));
     * </pre></blockquote>
     *
     * @param o the specified object to compare to this
     *          <code>NumericShaper</code>
     * @return <code>true</code> if <code>o</code> is an instance
     *         of <code>NumericShaper</code> and shapes in the same way;
     *         <code>false</code> otherwise.
     * @see java.lang.Object#equals(java.lang.Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public int hashCode() {

    /**
     * Returns a hash code for this shaper.
     * @return this shaper's hash code.
     * @see java.lang.Object#hashCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private synchronized void shapeContextually(char[] text, int start, int count, int ctxKey) {

    /**
     * Perform contextual shaping.
     * Synchronized to protect caches used in getContextKey.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private void shapeNonContextually(char[] text, int start, int count) {

    /**
     * Perform non-contextual shaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public Set<Range> getRangeSet() {

    /**
     * Returns a {@code Set} representing all the Unicode ranges in
     * this {@code NumericShaper} that will be shaped.
     *
     * @return all the Unicode ranges to be shaped.
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public int getRanges() {

    /**
     * Returns an <code>int</code> that ORs together the values for
     * all the ranges that will be shaped.
     * <p>
     * For example, to check if a shaper shapes to Arabic, you would use the
     * following:
     * <blockquote>
     *   {@code if ((shaper.getRanges() & shaper.ARABIC) != 0) &#123; ... }
     * </blockquote>
     *
     * <p>Note that this method supports only the bit mask-based
     * ranges. Call {@link #getRangeSet()} for the enum-based ranges.
     *
     * @return the values for all the ranges to be shaped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public boolean isContextual() {

    /**
     * Returns a <code>boolean</code> indicating whether or not
     * this shaper shapes contextually.
     * @return <code>true</code> if this shaper is contextual;
     *         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count, Range context) {

    /**
     * Converts the digits in the text that occur between {@code
     * start} and {@code start + count}, using the provided {@code
     * context}. {@code Context} is ignored if the shaper is not a
     * contextual shaper.
     *
     * @param text  a {@code char} array
     * @param start the index into {@code text} to start converting
     * @param count the number of {@code char}s in {@code text}
     *              to convert
     * @param context the context to which to convert the characters,
     *                such as {@code NumericShaper.Range.EUROPEAN}
     * @throws IndexOutOfBoundsException
     *         if {@code start} or {@code start + count} is out of bounds
     * @throws NullPointerException
     *         if {@code text} or {@code context} is null
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count, int context) {

    /**
     * Converts the digits in the text that occur between start and
     * start + count, using the provided context.
     * Context is ignored if the shaper is not a contextual shaper.
     * @param text an array of characters
     * @param start the index into <code>text</code> to start
     *        converting
     * @param count the number of characters in <code>text</code>
     *        to convert
     * @param context the context to which to convert the
     *        characters, such as <code>NumericShaper.EUROPEAN</code>
     * @throws IndexOutOfBoundsException if start or start + count is
     *        out of bounds
     * @throws NullPointerException if text is null
     * @throws IllegalArgumentException if this is a contextual shaper
     * and the specified <code>context</code> is not a single valid
     * range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count) {

    /**
     * Converts the digits in the text that occur between start and
     * start + count.
     * @param text an array of characters to convert
     * @param start the index into <code>text</code> to start
     *        converting
     * @param count the number of characters in <code>text</code>
     *        to convert
     * @throws IndexOutOfBoundsException if start or start + count is
     *        out of bounds
     * @throws NullPointerException if text is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private NumericShaper(int key, int mask) {

    /**
     * Private constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(Set<Range> ranges,
                                                    Range defaultContext) {

    /**
     * Returns a contextual shaper for the provided Unicode range(s).
     * The Latin-1 (EUROPEAN) digits will be converted to the decimal
     * digits corresponding to the range of the preceding text, if the
     * range is one of the provided ranges. The shaper uses {@code
     * defaultContext} as the starting context.
     *
     * @param ranges the specified Unicode ranges
     * @param defaultContext the starting context, such as
     *                       {@code NumericShaper.Range.EUROPEAN}
     * @return a contextual shaper for the specified Unicode ranges.
     * @throws NullPointerException
     *         if {@code ranges} or {@code defaultContext} is {@code null}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(int ranges, int defaultContext) {

    /**
     * Returns a contextual shaper for the provided unicode range(s).
     * Latin-1 (EUROPEAN) digits will be converted to the decimal digits
     * corresponding to the range of the preceding text, if the
     * range is one of the provided ranges.  Multiple ranges are
     * represented by or-ing the values together, for example,
     * <code>NumericShaper.ARABIC | NumericShaper.THAI</code>.  The
     * shaper uses defaultContext as the starting context.
     * @param ranges the specified Unicode ranges
     * @param defaultContext the starting context, such as
     * <code>NumericShaper.EUROPEAN</code>
     * @return a shaper for the specified Unicode ranges.
     * @throws IllegalArgumentException if the specified
     * <code>defaultContext</code> is not a single valid range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(Set<Range> ranges) {

    /**
     * Returns a contextual shaper for the provided Unicode
     * range(s). The Latin-1 (EUROPEAN) digits are converted to the
     * decimal digits corresponding to the range of the preceding
     * text, if the range is one of the provided ranges.
     *
     * <p>The shaper assumes EUROPEAN as the starting context, that
     * is, if EUROPEAN digits are encountered before any strong
     * directional text in the string, the context is presumed to be
     * EUROPEAN, and so the digits will not shape.
     *
     * @param ranges the specified Unicode ranges
     * @return a contextual shaper for the specified ranges
     * @throws NullPointerException if {@code ranges} is {@code null}.
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(int ranges) {

    /**
     * Returns a contextual shaper for the provided unicode range(s).
     * Latin-1 (EUROPEAN) digits are converted to the decimal digits
     * corresponding to the range of the preceding text, if the
     * range is one of the provided ranges.  Multiple ranges are
     * represented by or-ing the values together, such as,
     * <code>NumericShaper.ARABIC | NumericShaper.THAI</code>.  The
     * shaper assumes EUROPEAN as the starting context, that is, if
     * EUROPEAN digits are encountered before any strong directional
     * text in the string, the context is presumed to be EUROPEAN, and
     * so the digits will not shape.
     * @param ranges the specified Unicode ranges
     * @return a shaper for the specified ranges
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getShaper(Range singleRange) {

    /**
     * Returns a shaper for the provided Unicode
     * range. All Latin-1 (EUROPEAN) digits are converted to the
     * corresponding decimal digits of the specified Unicode range.
     *
     * @param singleRange the Unicode range given by a {@link
     *                    NumericShaper.Range} constant.
     * @return a non-contextual {@code NumericShaper}.
     * @throws NullPointerException if {@code singleRange} is {@code null}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getShaper(int singleRange) {

    /**
     * Returns a shaper for the provided unicode range.  All
     * Latin-1 (EUROPEAN) digits are converted
     * to the corresponding decimal unicode digits.
     * @param singleRange the specified Unicode range
     * @return a non-contextual numeric shaper
     * @throws IllegalArgumentException if the range is not a single range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ALL_RANGES = 0x0007ffff;

    /** Identifies all ranges, for full contextual shaping.
     *
     * <p>This constant specifies all of the bit mask-based
     * ranges. Use {@code EmunSet.allOf(NumericShaper.Range.class)} to
     * specify all of the enum-based ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MONGOLIAN = 1<<18;

    /** Identifies the MONGOLIAN range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int KHMER = 1<<17;

    /** Identifies the KHMER range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ETHIOPIC = 1<<16;

    /** Identifies the ETHIOPIC range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MYANMAR = 1<<15;

    /** Identifies the MYANMAR range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int TIBETAN = 1<<14;

    /** Identifies the TIBETAN range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int LAO = 1<<13;

    /** Identifies the LAO range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int THAI = 1<<12;

    /** Identifies the THAI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MALAYALAM = 1<<11;

    /** Identifies the MALAYALAM range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int KANNADA = 1<<10;

    /** Identifies the KANNADA range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int TELUGU = 1<<9;

    /** Identifies the TELUGU range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    // TAMIL DIGIT ZERO was added in Unicode 4.1

    /** Identifies the TAMIL range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ORIYA = 1<<7;

    /** Identifies the ORIYA range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int GUJARATI = 1<<6;

    /** Identifies the GUJARATI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int GURMUKHI = 1<<5;

    /** Identifies the GURMUKHI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int BENGALI = 1<<4;

    /** Identifies the BENGALI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int DEVANAGARI = 1<<3;

    /** Identifies the DEVANAGARI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int EASTERN_ARABIC = 1<<2;

    /** Identifies the ARABIC range and ARABIC_EXTENDED decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ARABIC = 1<<1;

    /** Identifies the ARABIC range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int EUROPEAN = 1<<0;

    /** Identifies the Latin-1 (European) and extended range, and
     *  Latin-1 (European) decimal base.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static final int BSEARCH_THRESHOLD = 3;

    /**
     * If more than BSEARCH_THRESHOLD ranges are specified, binary search is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private transient Range[] rangeArray;

    /**
     * rangeSet.toArray() value. Sorted by Range.base when the number
     * of elements is greater then BSEARCH_THRESHOLD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private transient Set<Range> rangeSet;

    /**
     * {@code Set<Range>} indicating which Unicode ranges to
     * shape. {@code null} for the bit mask-based API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private Range shapingRange;

    /**
     * The context {@code Range} for contextual shaping or the {@code
     * Range} for non-contextual shaping. {@code null} for the bit
     * mask-based API.
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private int mask;

    /** flag indicating whether to shape contextually (high bit) and which
     *  digit ranges to shape (bits 0-18)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private int key;

    /** index of context for contextual shaping - values range from 0 to 18 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        JAVANESE        ('\ua9d0', '\ua980', '\ua9e0'),

        /**
         * The Javanese range with the Javanese digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TAI_THAM_HORA   ('\u1a80', '\u1a20', '\u1ab0'),

        /**
         * The Tai Tham Hora range with the Tai Tham Hora digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KAYAH_LI        ('\ua900', '\ua900', '\ua930'),

        /**
         * The Kayah Li range with the Kayah Li digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        VAI             ('\ua620', '\ua500', '\ua640'),

        /**
         * The Vai range with the Vai digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        LEPCHA          ('\u1c40', '\u1c00', '\u1c50'),

        /**
         * The Lepcha range with the Lepcha digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        BALINESE        ('\u1b50', '\u1b00', '\u1b80'),

        /**
         * The Balinese range with the Balinese digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        LIMBU           ('\u1946', '\u1900', '\u1950'),

        /**
         * The Limbu range with the Limbu digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        NKO             ('\u07c0', '\u07c0', '\u0800'),

        /**
         * The N'Ko range with the N'Ko digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KHMER           ('\u17e0', '\u1780', '\u1800'),

        /**
         * The Khmer range with the Khmer digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        ETHIOPIC        ('\u1369', '\u1200', '\u1380') {

        /**
         * The Ethiopic range with the Ethiopic digits. Ethiopic
         * does not have a decimal digit 0 so Latin (European) 0 is
         * used.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TIBETAN         ('\u0f20', '\u0f00', '\u1000'),

        /**
         * The Tibetan range with the Tibetan digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        THAI            ('\u0e50', '\u0e00', '\u0e80'),

        /**
         * The Thai range with the Thai digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KANNADA         ('\u0ce6', '\u0c80', '\u0d00'),

        /**
         * The Kannada range with the Kannada digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TAMIL           ('\u0be6', '\u0b80', '\u0c00'),

        /**
         * The Tamil range with the Tamil digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        GUJARATI        ('\u0ae6', '\u0b00', '\u0b80'),

        /**
         * The Gujarati range with the Gujarati digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        BENGALI         ('\u09e6', '\u0980', '\u0a00'),

        /**
         * The Bengali range with the Bengali digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        EASTERN_ARABIC  ('\u06f0', '\u0600', '\u0780'),

        /**
         * The Arabic range with the Eastern Arabic-Indic digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        EUROPEAN        ('\u0030', '\u0000', '\u0300'),

        /**
         * The Latin (European) range with the Latin (ASCII) digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
public final class NumericShaper implements java.io.Serializable {

/**
 * The <code>NumericShaper</code> class is used to convert Latin-1 (European)
 * digits to other Unicode decimal digits.  Users of this class will
 * primarily be people who wish to present data using
 * national digit shapes, but find it more convenient to represent the
 * data internally using Latin-1 (European) digits.  This does not
 * interpret the deprecated numeric shape selector character (U+206E).
 * <p>
 * Instances of <code>NumericShaper</code> are typically applied
 * as attributes to text with the
 * {@link TextAttribute#NUMERIC_SHAPING NUMERIC_SHAPING} attribute
 * of the <code>TextAttribute</code> class.
 * For example, this code snippet causes a <code>TextLayout</code> to
 * shape European digits to Arabic in an Arabic context:<br>
 * <blockquote><pre>
 * Map map = new HashMap();
 * map.put(TextAttribute.NUMERIC_SHAPING,
 *     NumericShaper.getContextualShaper(NumericShaper.ARABIC));
 * FontRenderContext frc = ...;
 * TextLayout layout = new TextLayout(text, map, frc);
 * layout.draw(g2d, x, y);
 * </pre></blockquote>
 * <br>
 * It is also possible to perform numeric shaping explicitly using instances
 * of <code>NumericShaper</code>, as this code snippet demonstrates:<br>
 * <blockquote><pre>
 * char[] text = ...;
 * // shape all EUROPEAN digits (except zero) to ARABIC digits
 * NumericShaper shaper = NumericShaper.getShaper(NumericShaper.ARABIC);
 * shaper.shape(text, start, count);
 *
 * // shape European digits to ARABIC digits if preceding text is Arabic, or
 * // shape European digits to TAMIL digits if preceding text is Tamil, or
 * // leave European digits alone if there is no preceding text, or
 * // preceding text is neither Arabic nor Tamil
 * NumericShaper shaper =
 *     NumericShaper.getContextualShaper(NumericShaper.ARABIC |
 *                                         NumericShaper.TAMIL,
 *                                       NumericShaper.EUROPEAN);
 * shaper.shape(text, start, count);
 * </pre></blockquote>
 *
 * <p><b>Bit mask- and enum-based Unicode ranges</b></p>
 *
 * <p>This class supports two different programming interfaces to
 * represent Unicode ranges for script-specific digits: bit
 * mask-based ones, such as {@link #ARABIC NumericShaper.ARABIC}, and
 * enum-based ones, such as {@link NumericShaper.Range#ARABIC}.
 * Multiple ranges can be specified by ORing bit mask-based constants,
 * such as:
 * <blockquote><pre>
 * NumericShaper.ARABIC | NumericShaper.TAMIL
 * </pre></blockquote>
 * or creating a {@code Set} with the {@link NumericShaper.Range}
 * constants, such as:
 * <blockquote><pre>
 * EnumSet.of(NumericShaper.Scirpt.ARABIC, NumericShaper.Range.TAMIL)
 * </pre></blockquote>
 * The enum-based ranges are a super set of the bit mask-based ones.
 *
 * <p>If the two interfaces are mixed (including serialization),
 * Unicode range values are mapped to their counterparts where such
 * mapping is possible, such as {@code NumericShaper.Range.ARABIC}
 * from/to {@code NumericShaper.ARABIC}.  If any unmappable range
 * values are specified, such as {@code NumericShaper.Range.BALINESE},
 * those ranges are ignored.
 *
 * <p><b>Decimal Digits Precedence</b></p>
 *
 * <p>A Unicode range may have more than one set of decimal digits. If
 * multiple decimal digits sets are specified for the same Unicode
 * range, one of the sets will take precedence as follows.
 *
 * <table border=1 cellspacing=3 cellpadding=0 summary="NumericShaper constants precedence.">
 *    <tr>
 *       <th class="TableHeadingColor">Unicode Range</th>
 *       <th class="TableHeadingColor"><code>NumericShaper</code> Constants</th>
 *       <th class="TableHeadingColor">Precedence</th>
 *    </tr>
 *    <tr>
 *       <td rowspan="2">Arabic</td>
 *       <td>{@link NumericShaper#ARABIC NumericShaper.ARABIC}<br>
 *           {@link NumericShaper#EASTERN_ARABIC NumericShaper.EASTERN_ARABIC}</td>
 *       <td>{@link NumericShaper#EASTERN_ARABIC NumericShaper.EASTERN_ARABIC}</td>
 *    </tr>
 *    <tr>
 *       <td>{@link NumericShaper.Range#ARABIC}<br>
 *           {@link NumericShaper.Range#EASTERN_ARABIC}</td>
 *       <td>{@link NumericShaper.Range#EASTERN_ARABIC}</td>
 *    </tr>
 *    <tr>
 *       <td>Tai Tham</td>
 *       <td>{@link NumericShaper.Range#TAI_THAM_HORA}<br>
 *           {@link NumericShaper.Range#TAI_THAM_THAM}</td>
 *       <td>{@link NumericShaper.Range#TAI_THAM_THAM}</td>
 *    </tr>
 * </table>
 *
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private void writeObject(ObjectOutputStream stream) throws IOException {

    /**
     * Converts the {@code NumericShaper.Range} enum-based parameters,
     * if any, to the bit mask-based counterparts and writes this
     * object to the {@code stream}. Any enum constants that have no
     * bit mask-based counterparts are ignored in the conversion.
     *
     * @param stream the output stream to write to
     * @throws IOException if an I/O error occurs while writing to {@code stream}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static int search(int value, int[] array, int start, int length)

    /**
     * fast binary search over subrange of array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static int getHighBit(int value) {

    /**
     * Returns the index of the high bit in value (assuming le, actually
     * power of 2 >= value). value must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public String toString() {

    /**
     * Returns a <code>String</code> that describes this shaper. This method
     * is used for debugging purposes only.
     * @return a <code>String</code> describing this shaper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public boolean equals(Object o) {

    /**
     * Returns {@code true} if the specified object is an instance of
     * <code>NumericShaper</code> and shapes identically to this one,
     * regardless of the range representations, the bit mask or the
     * enum. For example, the following code produces {@code "true"}.
     * <blockquote><pre>
     * NumericShaper ns1 = NumericShaper.getShaper(NumericShaper.ARABIC);
     * NumericShaper ns2 = NumericShaper.getShaper(NumericShaper.Range.ARABIC);
     * System.out.println(ns1.equals(ns2));
     * </pre></blockquote>
     *
     * @param o the specified object to compare to this
     *          <code>NumericShaper</code>
     * @return <code>true</code> if <code>o</code> is an instance
     *         of <code>NumericShaper</code> and shapes in the same way;
     *         <code>false</code> otherwise.
     * @see java.lang.Object#equals(java.lang.Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public int hashCode() {

    /**
     * Returns a hash code for this shaper.
     * @return this shaper's hash code.
     * @see java.lang.Object#hashCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private synchronized void shapeContextually(char[] text, int start, int count, int ctxKey) {

    /**
     * Perform contextual shaping.
     * Synchronized to protect caches used in getContextKey.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private void shapeNonContextually(char[] text, int start, int count) {

    /**
     * Perform non-contextual shaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public Set<Range> getRangeSet() {

    /**
     * Returns a {@code Set} representing all the Unicode ranges in
     * this {@code NumericShaper} that will be shaped.
     *
     * @return all the Unicode ranges to be shaped.
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public int getRanges() {

    /**
     * Returns an <code>int</code> that ORs together the values for
     * all the ranges that will be shaped.
     * <p>
     * For example, to check if a shaper shapes to Arabic, you would use the
     * following:
     * <blockquote>
     *   {@code if ((shaper.getRanges() & shaper.ARABIC) != 0) &#123; ... }
     * </blockquote>
     *
     * <p>Note that this method supports only the bit mask-based
     * ranges. Call {@link #getRangeSet()} for the enum-based ranges.
     *
     * @return the values for all the ranges to be shaped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public boolean isContextual() {

    /**
     * Returns a <code>boolean</code> indicating whether or not
     * this shaper shapes contextually.
     * @return <code>true</code> if this shaper is contextual;
     *         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count, Range context) {

    /**
     * Converts the digits in the text that occur between {@code
     * start} and {@code start + count}, using the provided {@code
     * context}. {@code Context} is ignored if the shaper is not a
     * contextual shaper.
     *
     * @param text  a {@code char} array
     * @param start the index into {@code text} to start converting
     * @param count the number of {@code char}s in {@code text}
     *              to convert
     * @param context the context to which to convert the characters,
     *                such as {@code NumericShaper.Range.EUROPEAN}
     * @throws IndexOutOfBoundsException
     *         if {@code start} or {@code start + count} is out of bounds
     * @throws NullPointerException
     *         if {@code text} or {@code context} is null
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count, int context) {

    /**
     * Converts the digits in the text that occur between start and
     * start + count, using the provided context.
     * Context is ignored if the shaper is not a contextual shaper.
     * @param text an array of characters
     * @param start the index into <code>text</code> to start
     *        converting
     * @param count the number of characters in <code>text</code>
     *        to convert
     * @param context the context to which to convert the
     *        characters, such as <code>NumericShaper.EUROPEAN</code>
     * @throws IndexOutOfBoundsException if start or start + count is
     *        out of bounds
     * @throws NullPointerException if text is null
     * @throws IllegalArgumentException if this is a contextual shaper
     * and the specified <code>context</code> is not a single valid
     * range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public void shape(char[] text, int start, int count) {

    /**
     * Converts the digits in the text that occur between start and
     * start + count.
     * @param text an array of characters to convert
     * @param start the index into <code>text</code> to start
     *        converting
     * @param count the number of characters in <code>text</code>
     *        to convert
     * @throws IndexOutOfBoundsException if start or start + count is
     *        out of bounds
     * @throws NullPointerException if text is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private NumericShaper(int key, int mask) {

    /**
     * Private constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(Set<Range> ranges,
                                                    Range defaultContext) {

    /**
     * Returns a contextual shaper for the provided Unicode range(s).
     * The Latin-1 (EUROPEAN) digits will be converted to the decimal
     * digits corresponding to the range of the preceding text, if the
     * range is one of the provided ranges. The shaper uses {@code
     * defaultContext} as the starting context.
     *
     * @param ranges the specified Unicode ranges
     * @param defaultContext the starting context, such as
     *                       {@code NumericShaper.Range.EUROPEAN}
     * @return a contextual shaper for the specified Unicode ranges.
     * @throws NullPointerException
     *         if {@code ranges} or {@code defaultContext} is {@code null}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(int ranges, int defaultContext) {

    /**
     * Returns a contextual shaper for the provided unicode range(s).
     * Latin-1 (EUROPEAN) digits will be converted to the decimal digits
     * corresponding to the range of the preceding text, if the
     * range is one of the provided ranges.  Multiple ranges are
     * represented by or-ing the values together, for example,
     * <code>NumericShaper.ARABIC | NumericShaper.THAI</code>.  The
     * shaper uses defaultContext as the starting context.
     * @param ranges the specified Unicode ranges
     * @param defaultContext the starting context, such as
     * <code>NumericShaper.EUROPEAN</code>
     * @return a shaper for the specified Unicode ranges.
     * @throws IllegalArgumentException if the specified
     * <code>defaultContext</code> is not a single valid range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(Set<Range> ranges) {

    /**
     * Returns a contextual shaper for the provided Unicode
     * range(s). The Latin-1 (EUROPEAN) digits are converted to the
     * decimal digits corresponding to the range of the preceding
     * text, if the range is one of the provided ranges.
     *
     * <p>The shaper assumes EUROPEAN as the starting context, that
     * is, if EUROPEAN digits are encountered before any strong
     * directional text in the string, the context is presumed to be
     * EUROPEAN, and so the digits will not shape.
     *
     * @param ranges the specified Unicode ranges
     * @return a contextual shaper for the specified ranges
     * @throws NullPointerException if {@code ranges} is {@code null}.
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getContextualShaper(int ranges) {

    /**
     * Returns a contextual shaper for the provided unicode range(s).
     * Latin-1 (EUROPEAN) digits are converted to the decimal digits
     * corresponding to the range of the preceding text, if the
     * range is one of the provided ranges.  Multiple ranges are
     * represented by or-ing the values together, such as,
     * <code>NumericShaper.ARABIC | NumericShaper.THAI</code>.  The
     * shaper assumes EUROPEAN as the starting context, that is, if
     * EUROPEAN digits are encountered before any strong directional
     * text in the string, the context is presumed to be EUROPEAN, and
     * so the digits will not shape.
     * @param ranges the specified Unicode ranges
     * @return a shaper for the specified ranges
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getShaper(Range singleRange) {

    /**
     * Returns a shaper for the provided Unicode
     * range. All Latin-1 (EUROPEAN) digits are converted to the
     * corresponding decimal digits of the specified Unicode range.
     *
     * @param singleRange the Unicode range given by a {@link
     *                    NumericShaper.Range} constant.
     * @return a non-contextual {@code NumericShaper}.
     * @throws NullPointerException if {@code singleRange} is {@code null}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static NumericShaper getShaper(int singleRange) {

    /**
     * Returns a shaper for the provided unicode range.  All
     * Latin-1 (EUROPEAN) digits are converted
     * to the corresponding decimal unicode digits.
     * @param singleRange the specified Unicode range
     * @return a non-contextual numeric shaper
     * @throws IllegalArgumentException if the range is not a single range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ALL_RANGES = 0x0007ffff;

    /** Identifies all ranges, for full contextual shaping.
     *
     * <p>This constant specifies all of the bit mask-based
     * ranges. Use {@code EmunSet.allOf(NumericShaper.Range.class)} to
     * specify all of the enum-based ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MONGOLIAN = 1<<18;

    /** Identifies the MONGOLIAN range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int KHMER = 1<<17;

    /** Identifies the KHMER range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ETHIOPIC = 1<<16;

    /** Identifies the ETHIOPIC range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MYANMAR = 1<<15;

    /** Identifies the MYANMAR range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int TIBETAN = 1<<14;

    /** Identifies the TIBETAN range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int LAO = 1<<13;

    /** Identifies the LAO range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int THAI = 1<<12;

    /** Identifies the THAI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int MALAYALAM = 1<<11;

    /** Identifies the MALAYALAM range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int KANNADA = 1<<10;

    /** Identifies the KANNADA range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int TELUGU = 1<<9;

    /** Identifies the TELUGU range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    // TAMIL DIGIT ZERO was added in Unicode 4.1

    /** Identifies the TAMIL range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ORIYA = 1<<7;

    /** Identifies the ORIYA range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int GUJARATI = 1<<6;

    /** Identifies the GUJARATI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int GURMUKHI = 1<<5;

    /** Identifies the GURMUKHI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int BENGALI = 1<<4;

    /** Identifies the BENGALI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int DEVANAGARI = 1<<3;

    /** Identifies the DEVANAGARI range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int EASTERN_ARABIC = 1<<2;

    /** Identifies the ARABIC range and ARABIC_EXTENDED decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int ARABIC = 1<<1;

    /** Identifies the ARABIC range and decimal base. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    public static final int EUROPEAN = 1<<0;

    /** Identifies the Latin-1 (European) and extended range, and
     *  Latin-1 (European) decimal base.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private static final int BSEARCH_THRESHOLD = 3;

    /**
     * If more than BSEARCH_THRESHOLD ranges are specified, binary search is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private transient Range[] rangeArray;

    /**
     * rangeSet.toArray() value. Sorted by Range.base when the number
     * of elements is greater then BSEARCH_THRESHOLD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private transient Set<Range> rangeSet;

    /**
     * {@code Set<Range>} indicating which Unicode ranges to
     * shape. {@code null} for the bit mask-based API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private Range shapingRange;

    /**
     * The context {@code Range} for contextual shaping or the {@code
     * Range} for non-contextual shaping. {@code null} for the bit
     * mask-based API.
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private int mask;

    /** flag indicating whether to shape contextually (high bit) and which
     *  digit ranges to shape (bits 0-18)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
    private int key;

    /** index of context for contextual shaping - values range from 0 to 18 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        JAVANESE        ('\ua9d0', '\ua980', '\ua9e0'),

        /**
         * The Javanese range with the Javanese digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TAI_THAM_HORA   ('\u1a80', '\u1a20', '\u1ab0'),

        /**
         * The Tai Tham Hora range with the Tai Tham Hora digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KAYAH_LI        ('\ua900', '\ua900', '\ua930'),

        /**
         * The Kayah Li range with the Kayah Li digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        VAI             ('\ua620', '\ua500', '\ua640'),

        /**
         * The Vai range with the Vai digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        LEPCHA          ('\u1c40', '\u1c00', '\u1c50'),

        /**
         * The Lepcha range with the Lepcha digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        BALINESE        ('\u1b50', '\u1b00', '\u1b80'),

        /**
         * The Balinese range with the Balinese digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        LIMBU           ('\u1946', '\u1900', '\u1950'),

        /**
         * The Limbu range with the Limbu digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        NKO             ('\u07c0', '\u07c0', '\u0800'),

        /**
         * The N'Ko range with the N'Ko digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KHMER           ('\u17e0', '\u1780', '\u1800'),

        /**
         * The Khmer range with the Khmer digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        ETHIOPIC        ('\u1369', '\u1200', '\u1380') {

        /**
         * The Ethiopic range with the Ethiopic digits. Ethiopic
         * does not have a decimal digit 0 so Latin (European) 0 is
         * used.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TIBETAN         ('\u0f20', '\u0f00', '\u1000'),

        /**
         * The Tibetan range with the Tibetan digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        THAI            ('\u0e50', '\u0e00', '\u0e80'),

        /**
         * The Thai range with the Thai digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        KANNADA         ('\u0ce6', '\u0c80', '\u0d00'),

        /**
         * The Kannada range with the Kannada digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        TAMIL           ('\u0be6', '\u0b80', '\u0c00'),

        /**
         * The Tamil range with the Tamil digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        GUJARATI        ('\u0ae6', '\u0b00', '\u0b80'),

        /**
         * The Gujarati range with the Gujarati digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        BENGALI         ('\u09e6', '\u0980', '\u0a00'),

        /**
         * The Bengali range with the Bengali digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        EASTERN_ARABIC  ('\u06f0', '\u0600', '\u0780'),

        /**
         * The Arabic range with the Eastern Arabic-Indic digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
        EUROPEAN        ('\u0030', '\u0000', '\u0300'),

        /**
         * The Latin (European) range with the Latin (ASCII) digits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/NumericShaper.java
public final class NumericShaper implements java.io.Serializable {

/**
 * The <code>NumericShaper</code> class is used to convert Latin-1 (European)
 * digits to other Unicode decimal digits.  Users of this class will
 * primarily be people who wish to present data using
 * national digit shapes, but find it more convenient to represent the
 * data internally using Latin-1 (European) digits.  This does not
 * interpret the deprecated numeric shape selector character (U+206E).
 * <p>
 * Instances of <code>NumericShaper</code> are typically applied
 * as attributes to text with the
 * {@link TextAttribute#NUMERIC_SHAPING NUMERIC_SHAPING} attribute
 * of the <code>TextAttribute</code> class.
 * For example, this code snippet causes a <code>TextLayout</code> to
 * shape European digits to Arabic in an Arabic context:<br>
 * <blockquote><pre>
 * Map map = new HashMap();
 * map.put(TextAttribute.NUMERIC_SHAPING,
 *     NumericShaper.getContextualShaper(NumericShaper.ARABIC));
 * FontRenderContext frc = ...;
 * TextLayout layout = new TextLayout(text, map, frc);
 * layout.draw(g2d, x, y);
 * </pre></blockquote>
 * <br>
 * It is also possible to perform numeric shaping explicitly using instances
 * of <code>NumericShaper</code>, as this code snippet demonstrates:<br>
 * <blockquote><pre>
 * char[] text = ...;
 * // shape all EUROPEAN digits (except zero) to ARABIC digits
 * NumericShaper shaper = NumericShaper.getShaper(NumericShaper.ARABIC);
 * shaper.shape(text, start, count);
 *
 * // shape European digits to ARABIC digits if preceding text is Arabic, or
 * // shape European digits to TAMIL digits if preceding text is Tamil, or
 * // leave European digits alone if there is no preceding text, or
 * // preceding text is neither Arabic nor Tamil
 * NumericShaper shaper =
 *     NumericShaper.getContextualShaper(NumericShaper.ARABIC |
 *                                         NumericShaper.TAMIL,
 *                                       NumericShaper.EUROPEAN);
 * shaper.shape(text, start, count);
 * </pre></blockquote>
 *
 * <p><b>Bit mask- and enum-based Unicode ranges</b></p>
 *
 * <p>This class supports two different programming interfaces to
 * represent Unicode ranges for script-specific digits: bit
 * mask-based ones, such as {@link #ARABIC NumericShaper.ARABIC}, and
 * enum-based ones, such as {@link NumericShaper.Range#ARABIC}.
 * Multiple ranges can be specified by ORing bit mask-based constants,
 * such as:
 * <blockquote><pre>
 * NumericShaper.ARABIC | NumericShaper.TAMIL
 * </pre></blockquote>
 * or creating a {@code Set} with the {@link NumericShaper.Range}
 * constants, such as:
 * <blockquote><pre>
 * EnumSet.of(NumericShaper.Scirpt.ARABIC, NumericShaper.Range.TAMIL)
 * </pre></blockquote>
 * The enum-based ranges are a super set of the bit mask-based ones.
 *
 * <p>If the two interfaces are mixed (including serialization),
 * Unicode range values are mapped to their counterparts where such
 * mapping is possible, such as {@code NumericShaper.Range.ARABIC}
 * from/to {@code NumericShaper.ARABIC}.  If any unmappable range
 * values are specified, such as {@code NumericShaper.Range.BALINESE},
 * those ranges are ignored.
 *
 * <p><b>Decimal Digits Precedence</b></p>
 *
 * <p>A Unicode range may have more than one set of decimal digits. If
 * multiple decimal digits sets are specified for the same Unicode
 * range, one of the sets will take precedence as follows.
 *
 * <table border=1 cellspacing=3 cellpadding=0 summary="NumericShaper constants precedence.">
 *    <tr>
 *       <th class="TableHeadingColor">Unicode Range</th>
 *       <th class="TableHeadingColor"><code>NumericShaper</code> Constants</th>
 *       <th class="TableHeadingColor">Precedence</th>
 *    </tr>
 *    <tr>
 *       <td rowspan="2">Arabic</td>
 *       <td>{@link NumericShaper#ARABIC NumericShaper.ARABIC}<br>
 *           {@link NumericShaper#EASTERN_ARABIC NumericShaper.EASTERN_ARABIC}</td>
 *       <td>{@link NumericShaper#EASTERN_ARABIC NumericShaper.EASTERN_ARABIC}</td>
 *    </tr>
 *    <tr>
 *       <td>{@link NumericShaper.Range#ARABIC}<br>
 *           {@link NumericShaper.Range#EASTERN_ARABIC}</td>
 *       <td>{@link NumericShaper.Range#EASTERN_ARABIC}</td>
 *    </tr>
 *    <tr>
 *       <td>Tai Tham</td>
 *       <td>{@link NumericShaper.Range#TAI_THAM_HORA}<br>
 *           {@link NumericShaper.Range#TAI_THAM_THAM}</td>
 *       <td>{@link NumericShaper.Range#TAI_THAM_THAM}</td>
 *    </tr>
 * </table>
 *
 * @since 1.4
 */
