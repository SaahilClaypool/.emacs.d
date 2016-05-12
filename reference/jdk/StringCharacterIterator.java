_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public boolean isEnd(int pos)

    /** @return <tt>true</tt> iff if the specified index is after the end of the character stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public char charAt(int pos)

    /** @return a character at the specified position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public String substring(int beginIndex)

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public String substring(int beginIndex, int endIndex)

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public StringCharacterIterator(String src)

    /** @param src - encapsulated String */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    private final String src;

    /** encapsulated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
public final class StringCharacterIterator implements CharacterIterator

/**
 * Encapsulates String as CharacterIterator.
 *
 * @author <a href="mailto:ales.novak@netbeans.com">Ales Novak</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public boolean isEnd(int pos)

    /** @return <tt>true</tt> iff if the specified index is after the end of the character stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public char charAt(int pos)

    /** @return a character at the specified position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public String substring(int beginIndex)

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public String substring(int beginIndex, int endIndex)

    /** @return a substring */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    public StringCharacterIterator(String src)

    /** @param src - encapsulated String */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
    private final String src;

    /** encapsulated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/StringCharacterIterator.java
public final class StringCharacterIterator implements CharacterIterator

/**
 * Encapsulates String as CharacterIterator.
 *
 * @author <a href="mailto:ales.novak@netbeans.com">Ales Novak</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public Object clone()

    /**
     * Creates a copy of this iterator.
     * @return A copy of this
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public int hashCode()

    /**
     * Computes a hashcode for this iterator.
     * @return A hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public boolean equals(Object obj)

    /**
     * Compares the equality of two StringCharacterIterator objects.
     * @param obj the StringCharacterIterator object to be compared with.
     * @return true if the given obj is the same as this
     * StringCharacterIterator object; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public int getIndex()

    /**
     * Implements CharacterIterator.getIndex() for String.
     * @see CharacterIterator#getIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public int getEndIndex()

    /**
     * Implements CharacterIterator.getEndIndex() for String.
     * @see CharacterIterator#getEndIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public int getBeginIndex()

    /**
     * Implements CharacterIterator.getBeginIndex() for String.
     * @see CharacterIterator#getBeginIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char previous()

    /**
     * Implements CharacterIterator.previous() for String.
     * @see CharacterIterator#previous
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char next()

    /**
     * Implements CharacterIterator.next() for String.
     * @see CharacterIterator#next
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char current()

    /**
     * Implements CharacterIterator.current() for String.
     * @see CharacterIterator#current
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char setIndex(int p)

    /**
     * Implements CharacterIterator.setIndex() for String.
     * @see CharacterIterator#setIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char last()

    /**
     * Implements CharacterIterator.last() for String.
     * @see CharacterIterator#last
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public char first()

    /**
     * Implements CharacterIterator.first() for String.
     * @see CharacterIterator#first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public void setText(String text) {

    /**
     * Reset this iterator to point to a new string.  This package-visible
     * method is used by other java.text classes that want to avoid allocating
     * new StringCharacterIterator objects every time their setText method
     * is called.
     *
     * @param  text   The String to be iterated over
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public StringCharacterIterator(String text, int begin, int end, int pos) {

    /**
     * Constructs an iterator over the given range of the given string, with the
     * index set at the specified position.
     *
     * @param  text   The String to be iterated over
     * @param  begin  Index of the first character
     * @param  end    Index of the character following the last character
     * @param  pos    Initial iterator position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public StringCharacterIterator(String text, int pos)

    /**
     * Constructs an iterator with the specified initial index.
     *
     * @param  text   The String to be iterated over
     * @param  pos    Initial iterator position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
    public StringCharacterIterator(String text)

    /**
     * Constructs an iterator with an initial index of 0.
     *
     * @param text the {@code String} to be iterated over
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/StringCharacterIterator.java
public final class StringCharacterIterator implements CharacterIterator

/**
 * <code>StringCharacterIterator</code> implements the
 * <code>CharacterIterator</code> protocol for a <code>String</code>.
 * The <code>StringCharacterIterator</code> class iterates over the
 * entire <code>String</code>.
 *
 * @see CharacterIterator
 */
