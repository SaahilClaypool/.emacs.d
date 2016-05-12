_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public String getMessage() {

    /**
     * Returns a string describing the error.  The resulting string
     * consists of the reason string followed by a colon character
     * (<tt>':'</tt>), a space, and the input string.  If the error index is
     * defined then the string <tt>" at index "</tt> followed by the index, in
     * decimal, is inserted after the reason string and before the colon
     * character.
     *
     * @return  a string describing the error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public int getIndex() {

    /**
     * Returns an index into the input string of the position at which the
     * error occurred, or <tt>-1</tt> if this position is not known.
     *
     * @return  the error index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public String getReason() {

    /**
     * Returns a string explaining why the input string was rejected.
     *
     * @return  the reason string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public String getInput() {

    /**
     * Returns the input string.
     *
     * @return  the input string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public InvalidPathException(String input, String reason) {

    /**
     * Constructs an instance from the given input string and reason.  The
     * resulting object will have an error index of <tt>-1</tt>.
     *
     * @param  input   the input string
     * @param  reason  a string explaining why the input was rejected
     *
     * @throws  NullPointerException
     *          if either the input or reason strings are <tt>null</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
    public InvalidPathException(String input, String reason, int index) {

    /**
     * Constructs an instance from the given input string, reason, and error
     * index.
     *
     * @param  input   the input string
     * @param  reason  a string explaining why the input was rejected
     * @param  index   the index at which the error occurred,
     *                 or <tt>-1</tt> if the index is not known
     *
     * @throws  NullPointerException
     *          if either the input or reason strings are <tt>null</tt>
     *
     * @throws  IllegalArgumentException
     *          if the error index is less than <tt>-1</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/InvalidPathException.java
public class InvalidPathException

/**
 * Unchecked exception thrown when path string cannot be converted into a
 * {@link Path} because the path string contains invalid characters, or
 * the path string is invalid for other file system specific reasons.
 */
