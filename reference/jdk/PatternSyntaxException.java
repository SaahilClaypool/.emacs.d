_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
    public String getMessage() {

    /**
     * Returns a multi-line string containing the description of the syntax
     * error and its index, the erroneous regular-expression pattern, and a
     * visual indication of the error index within the pattern.
     *
     * @return  The full detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
    public String getPattern() {

    /**
     * Retrieves the erroneous regular-expression pattern.
     *
     * @return  The erroneous pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
    public String getDescription() {

    /**
     * Retrieves the description of the error.
     *
     * @return  The description of the error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
    public int getIndex() {

    /**
     * Retrieves the error index.
     *
     * @return  The approximate index in the pattern of the error,
     *         or <tt>-1</tt> if the index is not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
    public PatternSyntaxException(String desc, String regex, int index) {

    /**
     * Constructs a new instance of this class.
     *
     * @param  desc
     *         A description of the error
     *
     * @param  regex
     *         The erroneous pattern
     *
     * @param  index
     *         The approximate index in the pattern of the error,
     *         or <tt>-1</tt> if the index is not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/PatternSyntaxException.java
public class PatternSyntaxException

/**
 * Unchecked exception thrown to indicate a syntax error in a
 * regular-expression pattern.
 *
 * @author  unascribed
 * @since 1.4
 * @spec JSR-51
 */
