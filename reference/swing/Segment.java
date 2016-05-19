_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public Object clone() {

    /**
     * Creates a shallow copy.
     *
     * @return the copy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public CharSequence subSequence(int start, int end) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int length() {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char charAt(int index) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int getIndex() {

    /**
     * Returns the current index.
     * @return the current index.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int getEndIndex() {

    /**
     * Returns the end index of the text.  This index is the index of the first
     * character following the end of the text.
     * @return the index after the last character in the text
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int getBeginIndex() {

    /**
     * Returns the start index of the text.
     * @return the index at which the text begins.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char setIndex(int position) {

    /**
     * Sets the position to the specified position in the text and returns that
     * character.
     * @param position the position within the text.  Valid values range from
     * getBeginIndex() to getEndIndex().  An IllegalArgumentException is thrown
     * if an invalid value is supplied.
     * @return the character at the specified position or DONE if the specified position is equal to getEndIndex()
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char previous() {

    /**
     * Decrements the iterator's index by one and returns the character
     * at the new index. If the current index is getBeginIndex(), the index
     * remains at getBeginIndex() and a value of DONE is returned.
     * @return the character at the new position or DONE if the current
     * position is equal to getBeginIndex().
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char next() {

    /**
     * Increments the iterator's index by one and returns the character
     * at the new index.  If the resulting index is greater or equal
     * to getEndIndex(), the current index is reset to getEndIndex() and
     * a value of DONE is returned.
     * @return the character at the new position or DONE if the new
     * position is off the end of the text range.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char current() {

    /**
     * Gets the character at the current position (as returned by getIndex()).
     * @return the character at the current position or DONE if the current
     * position is off the end of the text.
     * @see #getIndex
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char last() {

    /**
     * Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     * and returns the character at that position.
     * @return the last character in the text, or DONE if the text is empty
     * @see #getEndIndex
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char first() {

    /**
     * Sets the position to getBeginIndex() and returns the character at that
     * position.
     * @return the first character in the text, or DONE if the text is empty
     * @see #getBeginIndex
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public String toString() {

    /**
     * Converts a segment into a String.
     *
     * @return the string
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public boolean isPartialReturn() {

    /**
     * Flag to indicate that partial returns are valid.
     *
     * @return whether or not partial returns are valid.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public void setPartialReturn(boolean p) {

    /**
     * Flag to indicate that partial returns are valid.  If the flag is true,
     * an implementation of the interface method Document.getText(position,length,Segment)
     * should return as much text as possible without making a copy.  The default
     * state of the flag is false which will cause Document.getText(position,length,Segment)
     * to provide the same return behavior it always had, which may or may not
     * make a copy of the text depending upon the request.
     *
     * @param p whether or not partial returns are valid.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public Segment(char[] array, int offset, int count) {

    /**
     * Creates a new segment referring to an existing array.
     *
     * @param array the array to refer to
     * @param offset the offset into the array
     * @param count the number of characters
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public Segment() {

    /**
     * Creates a new segment.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int count;

    /**
     * This is the number of array elements that
     * make up the text of interest.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public int offset;

    /**
     * This is the offset into the array that
     * the desired text begins.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
    public char[] array;

    /**
     * This is the array containing the text of
     * interest.  This array should never be modified;
     * it is available only for efficiency.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Segment.java
public class Segment implements Cloneable, CharacterIterator, CharSequence {

/**
 * A segment of a character array representing a fragment
 * of text.  It should be treated as immutable even though
 * the array is directly accessible.  This gives fast access
 * to fragments of text without the overhead of copying
 * around characters.  This is effectively an unprotected
 * String.
 * <p>
 * The Segment implements the java.text.CharacterIterator
 * interface to support use with the i18n support without
 * copying text into a string.
 *
 * @author  Timothy Prinzing
 */
