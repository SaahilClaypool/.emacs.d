_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//IllegalFormatCodePointException.java
    public int getCodePoint() {

    /**
     * Returns the illegal code point as defined by {@link
     * Character#isValidCodePoint}.
     *
     * @return  The illegal Unicode code point
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//IllegalFormatCodePointException.java
    public IllegalFormatCodePointException(int c) {

    /**
     * Constructs an instance of this class with the specified illegal code
     * point as defined by {@link Character#isValidCodePoint}.
     *
     * @param  c
     *         The illegal Unicode code point
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//IllegalFormatCodePointException.java
public class IllegalFormatCodePointException extends IllegalFormatException {

/**
 * Unchecked exception thrown when a character with an invalid Unicode code
 * point as defined by {@link Character#isValidCodePoint} is passed to the
 * {@link Formatter}.
 *
 * <p> Unless otherwise specified, passing a <tt>null</tt> argument to any
 * method or constructor in this class will cause a {@link
 * NullPointerException} to be thrown.
 *
 * @since 1.5
 */
