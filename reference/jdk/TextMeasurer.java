_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    char[] getChars() {

    /**
     * NOTE:  This method is only for LineBreakMeasurer's use.  It is package-
     * private because it returns internal data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public void deleteChar(AttributedCharacterIterator newParagraph, int deletePos) {

    /**
     * Updates the <code>TextMeasurer</code> after a single character has
     * been deleted
     * from the paragraph currently represented by this
     * <code>TextMeasurer</code>.  After this call, this
     * <code>TextMeasurer</code> is equivalent to a new <code>TextMeasurer</code>
     * created from the text;  however, it will usually be more efficient
     * to update an existing <code>TextMeasurer</code> than to create a new one
     * from scratch.
     *
     * @param newParagraph the text of the paragraph after performing
     * the deletion.  Cannot be null.
     * @param deletePos the position in the text where the character was removed.
     * Must not be less than
     * the start of <code>newParagraph</code>, and must not be greater than the
     * end of <code>newParagraph</code>.
     * @throws IndexOutOfBoundsException if <code>deletePos</code> is
     *         less than the start of <code>newParagraph</code> or greater
     *         than the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public void insertChar(AttributedCharacterIterator newParagraph, int insertPos) {

    /**
     * Updates the <code>TextMeasurer</code> after a single character has
     * been inserted
     * into the paragraph currently represented by this
     * <code>TextMeasurer</code>.  After this call, this
     * <code>TextMeasurer</code> is equivalent to a new
     * <code>TextMeasurer</code> created from the text;  however, it will
     * usually be more efficient to update an existing
     * <code>TextMeasurer</code> than to create a new one from scratch.
     *
     * @param newParagraph the text of the paragraph after performing
     * the insertion.  Cannot be null.
     * @param insertPos the position in the text where the character was
     * inserted.  Must not be less than the start of
     * <code>newParagraph</code>, and must be less than the end of
     * <code>newParagraph</code>.
     * @throws IndexOutOfBoundsException if <code>insertPos</code> is less
     *         than the start of <code>newParagraph</code> or greater than
     *         or equal to the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public TextLayout getLayout(int start, int limit) {

    /**
     * Returns a <code>TextLayout</code> on the given character range.
     *
     * @param start the index of the first character
     * @param limit the index after the last character.  Must be greater
     *   than <code>start</code>
     * @return a <code>TextLayout</code> for the characters beginning at
     *  <code>start</code> up to (but not including) <code>limit</code>
     * @throws IndexOutOfBoundsException if <code>limit</code> is less
     *         than <code>start</code>
     * @throws IllegalArgumentException if <code>start</code> or
     *          <code>limit</code> is not between the beginning of
     *          the paragraph and the end of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public float getAdvanceBetween(int start, int limit) {

    /**
     * Returns the graphical width of a line beginning at <code>start</code>
     * and including characters up to <code>limit</code>.
     * <code>start</code> and <code>limit</code> are absolute indices,
     * not relative to the start of the paragraph.
     *
     * @param start the character index at which to start measuring
     * @param limit the character index at which to stop measuring
     * @return the graphical width of a line beginning at <code>start</code>
     *   and including characters up to <code>limit</code>
     * @throws IndexOutOfBoundsException if <code>limit</code> is less
     *         than <code>start</code>
     * @throws IllegalArgumentException if <code>start</code> or
     *          <code>limit</code> is not between the beginning of
     *          the paragraph and the end of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public int getLineBreakIndex(int start, float maxAdvance) {

    /**
     * Returns the index of the first character which will not fit on
     * on a line beginning at <code>start</code> and possible
     * measuring up to <code>maxAdvance</code> in graphical width.
     *
     * @param start the character index at which to start measuring.
     *  <code>start</code> is an absolute index, not relative to the
     *  start of the paragraph
     * @param maxAdvance the graphical width in which the line must fit
     * @return the index after the last character that will fit
     *  on a line beginning at <code>start</code>, which is not longer
     *  than <code>maxAdvance</code> in graphical width
     * @throws IllegalArgumentException if <code>start</code> is
     *          less than the beginning of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private int trailingCdWhitespaceStart(int startPos, int limitPos) {

    /**
     * According to the Unicode Bidirectional Behavior specification
     * (Unicode Standard 2.0, section 3.11), whitespace at the ends
     * of lines which would naturally flow against the base direction
     * must be made to flow with the line direction, and moved to the
     * end of the line.  This method returns the start of the sequence
     * of trailing whitespace characters to move to the end of a
     * line taken from the given range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private void generateComponents(int startingAt, int endingAt) {

    /**
     * Generate components for the paragraph.  fChars, fBidi should have been
     * initialized already.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private void initAll(AttributedCharacterIterator text) {

    /**
     * Initialize state, including fChars array, direction, and
     * fBidi.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public TextMeasurer(AttributedCharacterIterator text, FontRenderContext frc) {

    /**
     * Constructs a <code>TextMeasurer</code> from the source text.
     * The source text should be a single entire paragraph.
     * @param text the source paragraph.  Cannot be null.
     * @param frc the information about a graphics device which is needed
     *       to measure the text correctly.  Cannot be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
public final class TextMeasurer implements Cloneable {

/**
 * The <code>TextMeasurer</code> class provides the primitive operations
 * needed for line break: measuring up to a given advance, determining the
 * advance of a range of characters, and generating a
 * <code>TextLayout</code> for a range of characters. It also provides
 * methods for incremental editing of paragraphs.
 * <p>
 * A <code>TextMeasurer</code> object is constructed with an
 * {@link java.text.AttributedCharacterIterator AttributedCharacterIterator}
 * representing a single paragraph of text.  The value returned by the
 * {@link AttributedCharacterIterator#getBeginIndex() getBeginIndex}
 * method of <code>AttributedCharacterIterator</code>
 * defines the absolute index of the first character.  The value
 * returned by the
 * {@link AttributedCharacterIterator#getEndIndex() getEndIndex}
 * method of <code>AttributedCharacterIterator</code> defines the index
 * past the last character.  These values define the range of indexes to
 * use in calls to the <code>TextMeasurer</code>.  For example, calls to
 * get the advance of a range of text or the line break of a range of text
 * must use indexes between the beginning and end index values.  Calls to
 * {@link #insertChar(java.text.AttributedCharacterIterator, int) insertChar}
 * and
 * {@link #deleteChar(java.text.AttributedCharacterIterator, int) deleteChar}
 * reset the <code>TextMeasurer</code> to use the beginning index and end
 * index of the <code>AttributedCharacterIterator</code> passed in those calls.
 * <p>
 * Most clients will use the more convenient <code>LineBreakMeasurer</code>,
 * which implements the standard line break policy (placing as many words
 * as will fit on each line).
 *
 * @author John Raley
 * @see LineBreakMeasurer
 * @since 1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    char[] getChars() {

    /**
     * NOTE:  This method is only for LineBreakMeasurer's use.  It is package-
     * private because it returns internal data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public void deleteChar(AttributedCharacterIterator newParagraph, int deletePos) {

    /**
     * Updates the <code>TextMeasurer</code> after a single character has
     * been deleted
     * from the paragraph currently represented by this
     * <code>TextMeasurer</code>.  After this call, this
     * <code>TextMeasurer</code> is equivalent to a new <code>TextMeasurer</code>
     * created from the text;  however, it will usually be more efficient
     * to update an existing <code>TextMeasurer</code> than to create a new one
     * from scratch.
     *
     * @param newParagraph the text of the paragraph after performing
     * the deletion.  Cannot be null.
     * @param deletePos the position in the text where the character was removed.
     * Must not be less than
     * the start of <code>newParagraph</code>, and must not be greater than the
     * end of <code>newParagraph</code>.
     * @throws IndexOutOfBoundsException if <code>deletePos</code> is
     *         less than the start of <code>newParagraph</code> or greater
     *         than the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public void insertChar(AttributedCharacterIterator newParagraph, int insertPos) {

    /**
     * Updates the <code>TextMeasurer</code> after a single character has
     * been inserted
     * into the paragraph currently represented by this
     * <code>TextMeasurer</code>.  After this call, this
     * <code>TextMeasurer</code> is equivalent to a new
     * <code>TextMeasurer</code> created from the text;  however, it will
     * usually be more efficient to update an existing
     * <code>TextMeasurer</code> than to create a new one from scratch.
     *
     * @param newParagraph the text of the paragraph after performing
     * the insertion.  Cannot be null.
     * @param insertPos the position in the text where the character was
     * inserted.  Must not be less than the start of
     * <code>newParagraph</code>, and must be less than the end of
     * <code>newParagraph</code>.
     * @throws IndexOutOfBoundsException if <code>insertPos</code> is less
     *         than the start of <code>newParagraph</code> or greater than
     *         or equal to the end of <code>newParagraph</code>
     * @throws NullPointerException if <code>newParagraph</code> is
     *         <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public TextLayout getLayout(int start, int limit) {

    /**
     * Returns a <code>TextLayout</code> on the given character range.
     *
     * @param start the index of the first character
     * @param limit the index after the last character.  Must be greater
     *   than <code>start</code>
     * @return a <code>TextLayout</code> for the characters beginning at
     *  <code>start</code> up to (but not including) <code>limit</code>
     * @throws IndexOutOfBoundsException if <code>limit</code> is less
     *         than <code>start</code>
     * @throws IllegalArgumentException if <code>start</code> or
     *          <code>limit</code> is not between the beginning of
     *          the paragraph and the end of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public float getAdvanceBetween(int start, int limit) {

    /**
     * Returns the graphical width of a line beginning at <code>start</code>
     * and including characters up to <code>limit</code>.
     * <code>start</code> and <code>limit</code> are absolute indices,
     * not relative to the start of the paragraph.
     *
     * @param start the character index at which to start measuring
     * @param limit the character index at which to stop measuring
     * @return the graphical width of a line beginning at <code>start</code>
     *   and including characters up to <code>limit</code>
     * @throws IndexOutOfBoundsException if <code>limit</code> is less
     *         than <code>start</code>
     * @throws IllegalArgumentException if <code>start</code> or
     *          <code>limit</code> is not between the beginning of
     *          the paragraph and the end of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public int getLineBreakIndex(int start, float maxAdvance) {

    /**
     * Returns the index of the first character which will not fit on
     * on a line beginning at <code>start</code> and possible
     * measuring up to <code>maxAdvance</code> in graphical width.
     *
     * @param start the character index at which to start measuring.
     *  <code>start</code> is an absolute index, not relative to the
     *  start of the paragraph
     * @param maxAdvance the graphical width in which the line must fit
     * @return the index after the last character that will fit
     *  on a line beginning at <code>start</code>, which is not longer
     *  than <code>maxAdvance</code> in graphical width
     * @throws IllegalArgumentException if <code>start</code> is
     *          less than the beginning of the paragraph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private int trailingCdWhitespaceStart(int startPos, int limitPos) {

    /**
     * According to the Unicode Bidirectional Behavior specification
     * (Unicode Standard 2.0, section 3.11), whitespace at the ends
     * of lines which would naturally flow against the base direction
     * must be made to flow with the line direction, and moved to the
     * end of the line.  This method returns the start of the sequence
     * of trailing whitespace characters to move to the end of a
     * line taken from the given range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private void generateComponents(int startingAt, int endingAt) {

    /**
     * Generate components for the paragraph.  fChars, fBidi should have been
     * initialized already.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    private void initAll(AttributedCharacterIterator text) {

    /**
     * Initialize state, including fChars array, direction, and
     * fBidi.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
    public TextMeasurer(AttributedCharacterIterator text, FontRenderContext frc) {

    /**
     * Constructs a <code>TextMeasurer</code> from the source text.
     * The source text should be a single entire paragraph.
     * @param text the source paragraph.  Cannot be null.
     * @param frc the information about a graphics device which is needed
     *       to measure the text correctly.  Cannot be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextMeasurer.java
public final class TextMeasurer implements Cloneable {

/**
 * The <code>TextMeasurer</code> class provides the primitive operations
 * needed for line break: measuring up to a given advance, determining the
 * advance of a range of characters, and generating a
 * <code>TextLayout</code> for a range of characters. It also provides
 * methods for incremental editing of paragraphs.
 * <p>
 * A <code>TextMeasurer</code> object is constructed with an
 * {@link java.text.AttributedCharacterIterator AttributedCharacterIterator}
 * representing a single paragraph of text.  The value returned by the
 * {@link AttributedCharacterIterator#getBeginIndex() getBeginIndex}
 * method of <code>AttributedCharacterIterator</code>
 * defines the absolute index of the first character.  The value
 * returned by the
 * {@link AttributedCharacterIterator#getEndIndex() getEndIndex}
 * method of <code>AttributedCharacterIterator</code> defines the index
 * past the last character.  These values define the range of indexes to
 * use in calls to the <code>TextMeasurer</code>.  For example, calls to
 * get the advance of a range of text or the line break of a range of text
 * must use indexes between the beginning and end index values.  Calls to
 * {@link #insertChar(java.text.AttributedCharacterIterator, int) insertChar}
 * and
 * {@link #deleteChar(java.text.AttributedCharacterIterator, int) deleteChar}
 * reset the <code>TextMeasurer</code> to use the beginning index and end
 * index of the <code>AttributedCharacterIterator</code> passed in those calls.
 * <p>
 * Most clients will use the more convenient <code>LineBreakMeasurer</code>,
 * which implements the standard line break policy (placing as many words
 * as will fit on each line).
 *
 * @author John Raley
 * @see LineBreakMeasurer
 * @since 1.3
 */
