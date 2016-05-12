_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    boolean isEnd(int pos);

    /** @return <tt>true</tt> iff if the specified index is after the end of the character stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    char charAt(int pos);

    /** @return a character at the specified position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    String substring(int beginIndex);

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    String substring(int beginIndex, int endIndex);

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
public interface CharacterIterator

/**
 * Encapsulates different types of character sources - String, InputStream, ...
 * Defines a set of common methods
 *
 * @author <a href="mailto:ales.novak@netbeans.com">Ales Novak</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    boolean isEnd(int pos);

    /** @return <tt>true</tt> iff if the specified index is after the end of the character stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    char charAt(int pos);

    /** @return a character at the specified position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    String substring(int beginIndex);

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
    String substring(int beginIndex, int endIndex);

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/CharacterIterator.java
public interface CharacterIterator

/**
 * Encapsulates different types of character sources - String, InputStream, ...
 * Defines a set of common methods
 *
 * @author <a href="mailto:ales.novak@netbeans.com">Ales Novak</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public Object clone();

    /**
     * Create a copy of this iterator
     * @return A copy of this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public int getIndex();

    /**
     * Returns the current index.
     * @return the current index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public int getEndIndex();

    /**
     * Returns the end index of the text.  This index is the index of the first
     * character following the end of the text.
     * @return the index after the last character in the text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public int getBeginIndex();

    /**
     * Returns the start index of the text.
     * @return the index at which the text begins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char setIndex(int position);

    /**
     * Sets the position to the specified position in the text and returns that
     * character.
     * @param position the position within the text.  Valid values range from
     * getBeginIndex() to getEndIndex().  An IllegalArgumentException is thrown
     * if an invalid value is supplied.
     * @return the character at the specified position or DONE if the specified position is equal to getEndIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char previous();

    /**
     * Decrements the iterator's index by one and returns the character
     * at the new index. If the current index is getBeginIndex(), the index
     * remains at getBeginIndex() and a value of DONE is returned.
     * @return the character at the new position or DONE if the current
     * position is equal to getBeginIndex().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char next();

    /**
     * Increments the iterator's index by one and returns the character
     * at the new index.  If the resulting index is greater or equal
     * to getEndIndex(), the current index is reset to getEndIndex() and
     * a value of DONE is returned.
     * @return the character at the new position or DONE if the new
     * position is off the end of the text range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char current();

    /**
     * Gets the character at the current position (as returned by getIndex()).
     * @return the character at the current position or DONE if the current
     * position is off the end of the text.
     * @see #getIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char last();

    /**
     * Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty)
     * and returns the character at that position.
     * @return the last character in the text, or DONE if the text is empty
     * @see #getEndIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public char first();

    /**
     * Sets the position to getBeginIndex() and returns the character at that
     * position.
     * @return the first character in the text, or DONE if the text is empty
     * @see #getBeginIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
    public static final char DONE = '\uFFFF';

    /**
     * Constant that is returned when the iterator has reached either the end
     * or the beginning of the text. The value is '\\uFFFF', the "not a
     * character" value which should not occur in any valid Unicode string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIterator.java
public interface CharacterIterator extends Cloneable

/**
 * This interface defines a protocol for bidirectional iteration over text.
 * The iterator iterates over a bounded sequence of characters.  Characters
 * are indexed with values beginning with the value returned by getBeginIndex() and
 * continuing through the value returned by getEndIndex()-1.
 * <p>
 * Iterators maintain a current character index, whose valid range is from
 * getBeginIndex() to getEndIndex(); the value getEndIndex() is included to allow
 * handling of zero-length text ranges and for historical reasons.
 * The current index can be retrieved by calling getIndex() and set directly
 * by calling setIndex(), first(), and last().
 * <p>
 * The methods previous() and next() are used for iteration. They return DONE if
 * they would move outside the range from getBeginIndex() to getEndIndex() -1,
 * signaling that the iterator has reached the end of the sequence. DONE is
 * also returned by other methods to indicate that the current index is
 * outside this range.
 *
 * <P>Examples:<P>
 *
 * Traverse the text from start to finish
 * <pre>{@code
 * public void traverseForward(CharacterIterator iter) {
 *     for(char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
 *         processChar(c);
 *     }
 * }
 * }</pre>
 *
 * Traverse the text backwards, from end to start
 * <pre>{@code
 * public void traverseBackward(CharacterIterator iter) {
 *     for(char c = iter.last(); c != CharacterIterator.DONE; c = iter.previous()) {
 *         processChar(c);
 *     }
 * }
 * }</pre>
 *
 * Traverse both forward and backward from a given position in the text.
 * Calls to notBoundary() in this example represents some
 * additional stopping criteria.
 * <pre>{@code
 * public void traverseOut(CharacterIterator iter, int pos) {
 *     for (char c = iter.setIndex(pos);
 *              c != CharacterIterator.DONE && notBoundary(c);
 *              c = iter.next()) {
 *     }
 *     int end = iter.getIndex();
 *     for (char c = iter.setIndex(pos);
 *             c != CharacterIterator.DONE && notBoundary(c);
 *             c = iter.previous()) {
 *     }
 *     int start = iter.getIndex();
 *     processSection(start, end);
 * }
 * }</pre>
 *
 * @see StringCharacterIterator
 * @see AttributedCharacterIterator
 */
