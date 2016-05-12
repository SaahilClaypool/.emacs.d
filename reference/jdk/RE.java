_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private int compareChars(char c1, char c2, boolean caseIndependent)

    /**
     * Compares two characters.
     *
     * @param c1 first character to compare.
     * @param c2 second character to compare.
     * @param caseIndependent whether comparision is case insensitive or not.
     * @return negative, 0, or positive integer as the first character
     *         less than, equal to, or greater then the second.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private boolean isNewline(int i)

    /**
     * @return true if character at i-th position in the <code>search</code> string is a newline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String[] grep(Object[] search)

    /**
     * Returns an array of Strings, whose toString representation matches a regular
     * expression. This method works like the Perl function of the same name.  Given
     * a regular expression of "a*b" and an array of String objects of [foo, aab, zzz,
     * aaaab], the array of Strings returned by grep would be [aab, aaaab].
     *
     * @param search Array of Objects to search
     * @return Array of Strings whose toString() value matches this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String subst(String substituteIn, String substitution, int flags)

    /**
     * Substitutes a string for this regular expression in another string.
     * This method works like the Perl function of the same name.
     * Given a regular expression of "a*b", a String to substituteIn of
     * "aaaabfooaaabgarplyaaabwackyb" and the substitution String "-", the
     * resulting String returned by subst would be "-foo-garply-wacky-".
     * <p>
     * It is also possible to reference the contents of a parenthesized expression
     * with $0, $1, ... $9. A regular expression of "http://[\\.\\w\\-\\?/~_@&=%]+",
     * a String to substituteIn of "visit us: http://www.apache.org!" and the
     * substitution String "&lt;a href=\"$0\"&gt;$0&lt;/a&gt;", the resulting String
     * returned by subst would be
     * "visit us: &lt;a href=\"http://www.apache.org\"&gt;http://www.apache.org&lt;/a&gt;!".
     * <p>
     * <i>Note:</i> $0 represents the whole match.
     *
     * @param substituteIn String to substitute within
     * @param substitution String to substitute for matches of this regular expression
     * @param flags One or more bitwise flags from REPLACE_*.  If the REPLACE_FIRSTONLY
     * flag bit is set, only the first occurrence of this regular expression is replaced.
     * If the bit is not set (REPLACE_ALL), all occurrences of this pattern will be
     * replaced. If the flag REPLACE_BACKREFERENCES is set, all backreferences will
     * be processed.
     * @return The string substituteIn with zero or more occurrences of the current
     * regular expression replaced with the substitution String (if this regular
     * expression object doesn't match at any position, the original String is returned
     * unchanged).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String subst(String substituteIn, String substitution)

    /**
     * Substitutes a string for this regular expression in another string.
     * This method works like the Perl function of the same name.
     * Given a regular expression of "a*b", a String to substituteIn of
     * "aaaabfooaaabgarplyaaabwackyb" and the substitution String "-", the
     * resulting String returned by subst would be "-foo-garply-wacky-".
     *
     * @param substituteIn String to substitute within
     * @param substitution String to substitute for all matches of this regular expression.
     * @return The string substituteIn with zero or more occurrences of the current
     * regular expression replaced with the substitution String (if this regular
     * expression object doesn't match at any position, the original String is returned
     * unchanged).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_BACKREFERENCES = 0x0002;

    /**
     * Flag bit that indicates that subst should replace backreferences
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_FIRSTONLY      = 0x0001;

    /**
     * Flag bit that indicates that subst should only replace the first occurrence
     * of this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_ALL            = 0x0000;

    /**
     * Flag bit that indicates that subst should replace all occurrences of this
     * regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String[] split(String s)

    /**
     * Splits a string into an array of strings on regular expression boundaries.
     * This function works the same way as the Perl function of the same name.
     * Given a regular expression of "[ab]+" and a string to split of
     * "xyzzyababbayyzabbbab123", the result would be the array of Strings
     * "[xyzzy, yyz, 123]".
     *
     * <p>Please note that the first string in the resulting array may be an empty
     * string. This happens when the very first character of input string is
     * matched by the pattern.
     *
     * @param s String to split on this regular exression
     * @return Array of strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(String search)

    /**
     * Matches the current regular expression program against a String.
     *
     * @param search String to match against
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(CharacterIterator search, int i)

    /**
     * Matches the current regular expression program against a character array,
     * starting at a given index.
     *
     * @param search String to match against
     * @param i Index to start searching at
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(String search, int i)

    /**
     * Matches the current regular expression program against a character array,
     * starting at a given index.
     *
     * @param search String to match against
     * @param i Index to start searching at
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected boolean matchAt(int i)

    /**
     * Match the current regular expression program against the current
     * input string, starting at index i of the input string.  This method
     * is only meant for internal use.
     *
     * @param i The input string index to start matching at
     * @return True if the input matched the expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected int matchNodes(int firstNode, int lastNode, int idxStart)

    /**
     * Try to match a string against a subset of nodes in the program
     *
     * @param firstNode Node to start at in program
     * @param lastNode  Last valid node (used for matching a subexpression without
     *                  matching the rest of the program as well).
     * @param idxStart  Starting position in character array
     * @return Final input array index if match succeeded.  -1 if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private final void allocParens()

    /**
     * Performs lazy allocation of subexpression arrays
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected void internalError(String s) throws Error

    /**
     * Throws an Error representing an internal error condition probably resulting
     * from a bug in the regular expression compiler (or possibly data corruption).
     * In practice, this should be very rare.
     *
     * @param s Error description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected final void setParenEnd(int which, int i)

    /**
     * Sets the end of a paren level
     *
     * @param which Which paren level
     * @param i Index in input array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected final void setParenStart(int which, int i)

    /**
     * Sets the start of a paren level
     *
     * @param which Which paren level
     * @param i Index in input array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenLength(int which)

    /**
     * Returns the length of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return Number of characters in the parenthesized subexpression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenEnd(int which)

    /**
     * Returns the end index of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return String index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenStart(int which)

    /**
     * Returns the start index of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return String index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String getParen(int which)

    /**
     * Gets the contents of a parenthesized subexpression after a successful match.
     *
     * @param which Nesting level of subexpression
     * @return String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public int getParenCount()

    /**
     * Returns the number of parenthesized subexpressions available after a successful match.
     *
     * @return Number of available parenthesized subexpressions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public REProgram getProgram()

    /**
     * Returns the current regular expression program in use by this matcher object.
     *
     * @return Regular expression program
     * @see #setProgram
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public void setProgram(REProgram program)

    /**
     * Sets the current regular expression program used by this matcher object.
     *
     * @param program Regular expression program compiled by RECompiler.
     * @see RECompiler
     * @see REProgram
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public int getMatchFlags()

    /**
     * Returns the current match behaviour flags.
     * @return Current match behaviour flags (RE.MATCH_*).
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     *
     * @see #setMatchFlags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public void setMatchFlags(int matchFlags)

    /**
     * Sets match behaviour flags which alter the way RE does matching.
     * @param matchFlags One or more of the RE match behaviour flags (RE.MATCH_*):
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static String simplePatternToFullRegularExpression(String pattern)

    /**
     * Converts a 'simplified' regular expression to a full regular expression
     *
     * @param pattern The pattern to convert
     * @return The full regular expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE()

    /**
     * Constructs a regular expression matcher with no initial program.
     * This is likely to be an uncommon practice, but is still supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(REProgram program)

    /**
     * Construct a matcher for a pre-compiled regular expression from program
     * (bytecode) data.
     *
     * @param program Compiled regular expression program
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(REProgram program, int matchFlags)

    /**
     * Construct a matcher for a pre-compiled regular expression from program
     * (bytecode) data.  Permits special flags to be passed in to modify matching
     * behaviour.
     *
     * @param program Compiled regular expression program (see RECompiler and/or recompile)
     * @param matchFlags One or more of the RE match behaviour flags (RE.MATCH_*):
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     *
     * @see RECompiler
     * @see REProgram
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(String pattern, int matchFlags) throws RESyntaxException

    /**
     * Constructs a regular expression matcher from a String by compiling it
     * using a new instance of RECompiler.  If you will be compiling many
     * expressions, you may prefer to use a single RECompiler object instead.
     *
     * @param pattern The regular expression pattern to compile.
     * @param matchFlags The matching style
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(String pattern) throws RESyntaxException

    /**
     * Constructs a regular expression matcher from a String by compiling it
     * using a new instance of RECompiler.  If you will be compiling many
     * expressions, you may prefer to use a single RECompiler object instead.
     *
     * @param pattern The regular expression pattern to compile.
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
                 //   Opcode              Char       Opdata/Operand  Meaning

    /************************************************
     *                                              *
     * The format of a node in a program is:        *
     *                                              *
     * [ OPCODE ] [ OPDATA ] [ OPNEXT ] [ OPERAND ] *
     *                                              *
     * char OPCODE - instruction                    *
     * char OPDATA - modifying data                 *
     * char OPNEXT - next node (relative offset)    *
     *                                              *
     ************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_SINGLELINE      = 0x0004;

    /**
     * Consider all input a single body of text - newlines are matched by .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_MULTILINE       = 0x0002;

    /**
     * Newlines should match as BOL/EOL (^ and $)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_CASEINDEPENDENT = 0x0001;

    /**
     * Flag to indicate that matching should be case-independent (folded)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_NORMAL          = 0x0000;

    /**
     * Specifies normal, case-sensitive matching behaviour.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
public class RE implements Serializable

/**
 * RE is an efficient, lightweight regular expression evaluator/matcher
 * class. Regular expressions are pattern descriptions which enable
 * sophisticated matching of strings.  In addition to being able to
 * match a string against a pattern, you can also extract parts of the
 * match.  This is especially useful in text parsing! Details on the
 * syntax of regular expression patterns are given below.
 *
 * <p>
 * To compile a regular expression (RE), you can simply construct an RE
 * matcher object from the string specification of the pattern, like this:
 *
 * <pre>
 *  RE r = new RE("a*b");
 * </pre>
 *
 * <p>
 * Once you have done this, you can call either of the RE.match methods to
 * perform matching on a String.  For example:
 *
 * <pre>
 *  boolean matched = r.match("aaaab");
 * </pre>
 *
 * will cause the boolean matched to be set to true because the
 * pattern "a*b" matches the string "aaaab".
 *
 * <p>
 * If you were interested in the <i>number</i> of a's which matched the
 * first part of our example expression, you could change the expression to
 * "(a*)b".  Then when you compiled the expression and matched it against
 * something like "xaaaab", you would get results like this:
 *
 * <pre>
 *  RE r = new RE("(a*)b");                  // Compile expression
 *  boolean matched = r.match("xaaaab");     // Match against "xaaaab"
 *
 *  String wholeExpr = r.getParen(0);        // wholeExpr will be 'aaaab'
 *  String insideParens = r.getParen(1);     // insideParens will be 'aaaa'
 *
 *  int startWholeExpr = r.getParenStart(0); // startWholeExpr will be index 1
 *  int endWholeExpr = r.getParenEnd(0);     // endWholeExpr will be index 6
 *  int lenWholeExpr = r.getParenLength(0);  // lenWholeExpr will be 5
 *
 *  int startInside = r.getParenStart(1);    // startInside will be index 1
 *  int endInside = r.getParenEnd(1);        // endInside will be index 5
 *  int lenInside = r.getParenLength(1);     // lenInside will be 4
 * </pre>
 *
 * You can also refer to the contents of a parenthesized expression
 * within a regular expression itself.  This is called a
 * 'backreference'.  The first backreference in a regular expression is
 * denoted by \1, the second by \2 and so on.  So the expression:
 *
 * <pre>
 *  ([0-9]+)=\1
 * </pre>
 *
 * will match any string of the form n=n (like 0=0 or 2=2).
 *
 * <p>
 * The full regular expression syntax accepted by RE is described here:
 *
 * <pre>
 *
 *  <b><font face=times roman>Characters</font></b>
 *
 *    <i>unicodeChar</i>   Matches any identical unicode character
 *    \                    Used to quote a meta-character (like '*')
 *    \\                   Matches a single '\' character
 *    \0nnn                Matches a given octal character
 *    \xhh                 Matches a given 8-bit hexadecimal character
 *    \\uhhhh              Matches a given 16-bit hexadecimal character
 *    \t                   Matches an ASCII tab character
 *    \n                   Matches an ASCII newline character
 *    \r                   Matches an ASCII return character
 *    \f                   Matches an ASCII form feed character
 *
 *
 *  <b><font face=times roman>Character Classes</font></b>
 *
 *    [abc]                Simple character class
 *    [a-zA-Z]             Character class with ranges
 *    [^abc]               Negated character class
 * </pre>
 *
 * <b>NOTE:</b> Incomplete ranges will be interpreted as &quot;starts
 * from zero&quot; or &quot;ends with last character&quot;.
 * <br>
 * I.e. [-a] is the same as [\\u0000-a], and [a-] is the same as [a-\\uFFFF],
 * [-] means &quot;all characters&quot;.
 *
 * <pre>
 *
 *  <b><font face=times roman>Standard POSIX Character Classes</font></b>
 *
 *    [:alnum:]            Alphanumeric characters.
 *    [:alpha:]            Alphabetic characters.
 *    [:blank:]            Space and tab characters.
 *    [:cntrl:]            Control characters.
 *    [:digit:]            Numeric characters.
 *    [:graph:]            Characters that are printable and are also visible.
 *                         (A space is printable, but not visible, while an
 *                         `a' is both.)
 *    [:lower:]            Lower-case alphabetic characters.
 *    [:print:]            Printable characters (characters that are not
 *                         control characters.)
 *    [:punct:]            Punctuation characters (characters that are not letter,
 *                         digits, control characters, or space characters).
 *    [:space:]            Space characters (such as space, tab, and formfeed,
 *                         to name a few).
 *    [:upper:]            Upper-case alphabetic characters.
 *    [:xdigit:]           Characters that are hexadecimal digits.
 *
 *
 *  <b><font face=times roman>Non-standard POSIX-style Character Classes</font></b>
 *
 *    [:javastart:]        Start of a Java identifier
 *    [:javapart:]         Part of a Java identifier
 *
 *
 *  <b><font face=times roman>Predefined Classes</font></b>
 *
 *    .         Matches any character other than newline
 *    \w        Matches a "word" character (alphanumeric plus "_")
 *    \W        Matches a non-word character
 *    \s        Matches a whitespace character
 *    \S        Matches a non-whitespace character
 *    \d        Matches a digit character
 *    \D        Matches a non-digit character
 *
 *
 *  <b><font face=times roman>Boundary Matchers</font></b>
 *
 *    ^         Matches only at the beginning of a line
 *    $         Matches only at the end of a line
 *    \b        Matches only at a word boundary
 *    \B        Matches only at a non-word boundary
 *
 *
 *  <b><font face=times roman>Greedy Closures</font></b>
 *
 *    A*        Matches A 0 or more times (greedy)
 *    A+        Matches A 1 or more times (greedy)
 *    A?        Matches A 1 or 0 times (greedy)
 *    A{n}      Matches A exactly n times (greedy)
 *    A{n,}     Matches A at least n times (greedy)
 *    A{n,m}    Matches A at least n but not more than m times (greedy)
 *
 *
 *  <b><font face=times roman>Reluctant Closures</font></b>
 *
 *    A*?       Matches A 0 or more times (reluctant)
 *    A+?       Matches A 1 or more times (reluctant)
 *    A??       Matches A 0 or 1 times (reluctant)
 *
 *
 *  <b><font face=times roman>Logical Operators</font></b>
 *
 *    AB        Matches A followed by B
 *    A|B       Matches either A or B
 *    (A)       Used for subexpression grouping
 *   (?:A)      Used for subexpression clustering (just like grouping but
 *              no backrefs)
 *
 *
 *  <b><font face=times roman>Backreferences</font></b>
 *
 *    \1    Backreference to 1st parenthesized subexpression
 *    \2    Backreference to 2nd parenthesized subexpression
 *    \3    Backreference to 3rd parenthesized subexpression
 *    \4    Backreference to 4th parenthesized subexpression
 *    \5    Backreference to 5th parenthesized subexpression
 *    \6    Backreference to 6th parenthesized subexpression
 *    \7    Backreference to 7th parenthesized subexpression
 *    \8    Backreference to 8th parenthesized subexpression
 *    \9    Backreference to 9th parenthesized subexpression
 * </pre>
 *
 * <p>
 * All closure operators (+, *, ?, {m,n}) are greedy by default, meaning
 * that they match as many elements of the string as possible without
 * causing the overall match to fail.  If you want a closure to be
 * reluctant (non-greedy), you can simply follow it with a '?'.  A
 * reluctant closure will match as few elements of the string as
 * possible when finding matches.  {m,n} closures don't currently
 * support reluctancy.
 *
 * <p>
 * <b><font face="times roman">Line terminators</font></b>
 * <br>
 * A line terminator is a one- or two-character sequence that marks
 * the end of a line of the input character sequence. The following
 * are recognized as line terminators:
 * <ul>
 * <li>A newline (line feed) character ('\n'),</li>
 * <li>A carriage-return character followed immediately by a newline character ("\r\n"),</li>
 * <li>A standalone carriage-return character ('\r'),</li>
 * <li>A next-line character ('\u0085'),</li>
 * <li>A line-separator character ('\u2028'), or</li>
 * <li>A paragraph-separator character ('\u2029).</li>
 * </ul>
 *
 * <p>
 * RE runs programs compiled by the RECompiler class.  But the RE
 * matcher class does not include the actual regular expression compiler
 * for reasons of efficiency.  In fact, if you want to pre-compile one
 * or more regular expressions, the 'recompile' class can be invoked
 * from the command line to produce compiled output like this:
 *
 * <pre>
 *    // Pre-compiled regular expression "a*b"
 *    char[] re1Instructions =
 *    {
 *        0x007c, 0x0000, 0x001a, 0x007c, 0x0000, 0x000d, 0x0041,
 *        0x0001, 0x0004, 0x0061, 0x007c, 0x0000, 0x0003, 0x0047,
 *        0x0000, 0xfff6, 0x007c, 0x0000, 0x0003, 0x004e, 0x0000,
 *        0x0003, 0x0041, 0x0001, 0x0004, 0x0062, 0x0045, 0x0000,
 *        0x0000,
 *    };
 *
 *
 *    REProgram re1 = new REProgram(re1Instructions);
 * </pre>
 *
 * You can then construct a regular expression matcher (RE) object from
 * the pre-compiled expression re1 and thus avoid the overhead of
 * compiling the expression at runtime. If you require more dynamic
 * regular expressions, you can construct a single RECompiler object and
 * re-use it to compile each expression. Similarly, you can change the
 * program run by a given matcher object at any time. However, RE and
 * RECompiler are not threadsafe (for efficiency reasons, and because
 * requiring thread safety in this class is deemed to be a rare
 * requirement), so you will need to construct a separate compiler or
 * matcher object for each thread (unless you do thread synchronization
 * yourself). Once expression compiled into the REProgram object, REProgram
 * can be safely shared across multiple threads and RE objects.
 *
 * <br><p><br>
 *
 * <font color="red">
 * <i>ISSUES:</i>
 *
 * <ul>
 *  <li>com.weusours.util.re is not currently compatible with all
 *      standard POSIX regcomp flags</li>
 *  <li>com.weusours.util.re does not support POSIX equivalence classes
 *      ([=foo=] syntax) (I18N/locale issue)</li>
 *  <li>com.weusours.util.re does not support nested POSIX character
 *      classes (definitely should, but not completely trivial)</li>
 *  <li>com.weusours.util.re Does not support POSIX character collation
 *      concepts ([.foo.] syntax) (I18N/locale issue)</li>
 *  <li>Should there be different matching styles (simple, POSIX, Perl etc?)</li>
 *  <li>Should RE support character iterators (for backwards RE matching!)?</li>
 *  <li>Should RE support reluctant {m,n} closures (does anyone care)?</li>
 *  <li>Not *all* possibilities are considered for greediness when backreferences
 *      are involved (as POSIX suggests should be the case).  The POSIX RE
 *      "(ac*)c*d[ac]*\1", when matched against "acdacaa" should yield a match
 *      of acdacaa where \1 is "a".  This is not the case in this RE package,
 *      and actually Perl doesn't go to this extent either!  Until someone
 *      actually complains about this, I'm not sure it's worth "fixing".
 *      If it ever is fixed, test #137 in RETest.txt should be updated.</li>
 * </ul>
 *
 * </font>
 *
 * @see recompile
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:ts@sch-fer.de">Tobias Sch&auml;fer</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private int compareChars(char c1, char c2, boolean caseIndependent)

    /**
     * Compares two characters.
     *
     * @param c1 first character to compare.
     * @param c2 second character to compare.
     * @param caseIndependent whether comparision is case insensitive or not.
     * @return negative, 0, or positive integer as the first character
     *         less than, equal to, or greater then the second.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private boolean isNewline(int i)

    /**
     * @return true if character at i-th position in the <code>search</code> string is a newline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String[] grep(Object[] search)

    /**
     * Returns an array of Strings, whose toString representation matches a regular
     * expression. This method works like the Perl function of the same name.  Given
     * a regular expression of "a*b" and an array of String objects of [foo, aab, zzz,
     * aaaab], the array of Strings returned by grep would be [aab, aaaab].
     *
     * @param search Array of Objects to search
     * @return Array of Strings whose toString() value matches this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String subst(String substituteIn, String substitution, int flags)

    /**
     * Substitutes a string for this regular expression in another string.
     * This method works like the Perl function of the same name.
     * Given a regular expression of "a*b", a String to substituteIn of
     * "aaaabfooaaabgarplyaaabwackyb" and the substitution String "-", the
     * resulting String returned by subst would be "-foo-garply-wacky-".
     * <p>
     * It is also possible to reference the contents of a parenthesized expression
     * with $0, $1, ... $9. A regular expression of "http://[\\.\\w\\-\\?/~_@&=%]+",
     * a String to substituteIn of "visit us: http://www.apache.org!" and the
     * substitution String "&lt;a href=\"$0\"&gt;$0&lt;/a&gt;", the resulting String
     * returned by subst would be
     * "visit us: &lt;a href=\"http://www.apache.org\"&gt;http://www.apache.org&lt;/a&gt;!".
     * <p>
     * <i>Note:</i> $0 represents the whole match.
     *
     * @param substituteIn String to substitute within
     * @param substitution String to substitute for matches of this regular expression
     * @param flags One or more bitwise flags from REPLACE_*.  If the REPLACE_FIRSTONLY
     * flag bit is set, only the first occurrence of this regular expression is replaced.
     * If the bit is not set (REPLACE_ALL), all occurrences of this pattern will be
     * replaced. If the flag REPLACE_BACKREFERENCES is set, all backreferences will
     * be processed.
     * @return The string substituteIn with zero or more occurrences of the current
     * regular expression replaced with the substitution String (if this regular
     * expression object doesn't match at any position, the original String is returned
     * unchanged).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String subst(String substituteIn, String substitution)

    /**
     * Substitutes a string for this regular expression in another string.
     * This method works like the Perl function of the same name.
     * Given a regular expression of "a*b", a String to substituteIn of
     * "aaaabfooaaabgarplyaaabwackyb" and the substitution String "-", the
     * resulting String returned by subst would be "-foo-garply-wacky-".
     *
     * @param substituteIn String to substitute within
     * @param substitution String to substitute for all matches of this regular expression.
     * @return The string substituteIn with zero or more occurrences of the current
     * regular expression replaced with the substitution String (if this regular
     * expression object doesn't match at any position, the original String is returned
     * unchanged).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_BACKREFERENCES = 0x0002;

    /**
     * Flag bit that indicates that subst should replace backreferences
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_FIRSTONLY      = 0x0001;

    /**
     * Flag bit that indicates that subst should only replace the first occurrence
     * of this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int REPLACE_ALL            = 0x0000;

    /**
     * Flag bit that indicates that subst should replace all occurrences of this
     * regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String[] split(String s)

    /**
     * Splits a string into an array of strings on regular expression boundaries.
     * This function works the same way as the Perl function of the same name.
     * Given a regular expression of "[ab]+" and a string to split of
     * "xyzzyababbayyzabbbab123", the result would be the array of Strings
     * "[xyzzy, yyz, 123]".
     *
     * <p>Please note that the first string in the resulting array may be an empty
     * string. This happens when the very first character of input string is
     * matched by the pattern.
     *
     * @param s String to split on this regular exression
     * @return Array of strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(String search)

    /**
     * Matches the current regular expression program against a String.
     *
     * @param search String to match against
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(CharacterIterator search, int i)

    /**
     * Matches the current regular expression program against a character array,
     * starting at a given index.
     *
     * @param search String to match against
     * @param i Index to start searching at
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public boolean match(String search, int i)

    /**
     * Matches the current regular expression program against a character array,
     * starting at a given index.
     *
     * @param search String to match against
     * @param i Index to start searching at
     * @return True if string matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected boolean matchAt(int i)

    /**
     * Match the current regular expression program against the current
     * input string, starting at index i of the input string.  This method
     * is only meant for internal use.
     *
     * @param i The input string index to start matching at
     * @return True if the input matched the expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected int matchNodes(int firstNode, int lastNode, int idxStart)

    /**
     * Try to match a string against a subset of nodes in the program
     *
     * @param firstNode Node to start at in program
     * @param lastNode  Last valid node (used for matching a subexpression without
     *                  matching the rest of the program as well).
     * @param idxStart  Starting position in character array
     * @return Final input array index if match succeeded.  -1 if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    private final void allocParens()

    /**
     * Performs lazy allocation of subexpression arrays
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected void internalError(String s) throws Error

    /**
     * Throws an Error representing an internal error condition probably resulting
     * from a bug in the regular expression compiler (or possibly data corruption).
     * In practice, this should be very rare.
     *
     * @param s Error description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected final void setParenEnd(int which, int i)

    /**
     * Sets the end of a paren level
     *
     * @param which Which paren level
     * @param i Index in input array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    protected final void setParenStart(int which, int i)

    /**
     * Sets the start of a paren level
     *
     * @param which Which paren level
     * @param i Index in input array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenLength(int which)

    /**
     * Returns the length of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return Number of characters in the parenthesized subexpression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenEnd(int which)

    /**
     * Returns the end index of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return String index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public final int getParenStart(int which)

    /**
     * Returns the start index of a given paren level.
     *
     * @param which Nesting level of subexpression
     * @return String index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public String getParen(int which)

    /**
     * Gets the contents of a parenthesized subexpression after a successful match.
     *
     * @param which Nesting level of subexpression
     * @return String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public int getParenCount()

    /**
     * Returns the number of parenthesized subexpressions available after a successful match.
     *
     * @return Number of available parenthesized subexpressions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public REProgram getProgram()

    /**
     * Returns the current regular expression program in use by this matcher object.
     *
     * @return Regular expression program
     * @see #setProgram
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public void setProgram(REProgram program)

    /**
     * Sets the current regular expression program used by this matcher object.
     *
     * @param program Regular expression program compiled by RECompiler.
     * @see RECompiler
     * @see REProgram
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public int getMatchFlags()

    /**
     * Returns the current match behaviour flags.
     * @return Current match behaviour flags (RE.MATCH_*).
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     *
     * @see #setMatchFlags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public void setMatchFlags(int matchFlags)

    /**
     * Sets match behaviour flags which alter the way RE does matching.
     * @param matchFlags One or more of the RE match behaviour flags (RE.MATCH_*):
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static String simplePatternToFullRegularExpression(String pattern)

    /**
     * Converts a 'simplified' regular expression to a full regular expression
     *
     * @param pattern The pattern to convert
     * @return The full regular expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE()

    /**
     * Constructs a regular expression matcher with no initial program.
     * This is likely to be an uncommon practice, but is still supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(REProgram program)

    /**
     * Construct a matcher for a pre-compiled regular expression from program
     * (bytecode) data.
     *
     * @param program Compiled regular expression program
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(REProgram program, int matchFlags)

    /**
     * Construct a matcher for a pre-compiled regular expression from program
     * (bytecode) data.  Permits special flags to be passed in to modify matching
     * behaviour.
     *
     * @param program Compiled regular expression program (see RECompiler and/or recompile)
     * @param matchFlags One or more of the RE match behaviour flags (RE.MATCH_*):
     *
     * <pre>
     *   MATCH_NORMAL              // Normal (case-sensitive) matching
     *   MATCH_CASEINDEPENDENT     // Case folded comparisons
     *   MATCH_MULTILINE           // Newline matches as BOL/EOL
     * </pre>
     *
     * @see RECompiler
     * @see REProgram
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(String pattern, int matchFlags) throws RESyntaxException

    /**
     * Constructs a regular expression matcher from a String by compiling it
     * using a new instance of RECompiler.  If you will be compiling many
     * expressions, you may prefer to use a single RECompiler object instead.
     *
     * @param pattern The regular expression pattern to compile.
     * @param matchFlags The matching style
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public RE(String pattern) throws RESyntaxException

    /**
     * Constructs a regular expression matcher from a String by compiling it
     * using a new instance of RECompiler.  If you will be compiling many
     * expressions, you may prefer to use a single RECompiler object instead.
     *
     * @param pattern The regular expression pattern to compile.
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see recompile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
                 //   Opcode              Char       Opdata/Operand  Meaning

    /************************************************
     *                                              *
     * The format of a node in a program is:        *
     *                                              *
     * [ OPCODE ] [ OPDATA ] [ OPNEXT ] [ OPERAND ] *
     *                                              *
     * char OPCODE - instruction                    *
     * char OPDATA - modifying data                 *
     * char OPNEXT - next node (relative offset)    *
     *                                              *
     ************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_SINGLELINE      = 0x0004;

    /**
     * Consider all input a single body of text - newlines are matched by .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_MULTILINE       = 0x0002;

    /**
     * Newlines should match as BOL/EOL (^ and $)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_CASEINDEPENDENT = 0x0001;

    /**
     * Flag to indicate that matching should be case-independent (folded)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
    public static final int MATCH_NORMAL          = 0x0000;

    /**
     * Specifies normal, case-sensitive matching behaviour.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RE.java
public class RE implements Serializable

/**
 * RE is an efficient, lightweight regular expression evaluator/matcher
 * class. Regular expressions are pattern descriptions which enable
 * sophisticated matching of strings.  In addition to being able to
 * match a string against a pattern, you can also extract parts of the
 * match.  This is especially useful in text parsing! Details on the
 * syntax of regular expression patterns are given below.
 *
 * <p>
 * To compile a regular expression (RE), you can simply construct an RE
 * matcher object from the string specification of the pattern, like this:
 *
 * <pre>
 *  RE r = new RE("a*b");
 * </pre>
 *
 * <p>
 * Once you have done this, you can call either of the RE.match methods to
 * perform matching on a String.  For example:
 *
 * <pre>
 *  boolean matched = r.match("aaaab");
 * </pre>
 *
 * will cause the boolean matched to be set to true because the
 * pattern "a*b" matches the string "aaaab".
 *
 * <p>
 * If you were interested in the <i>number</i> of a's which matched the
 * first part of our example expression, you could change the expression to
 * "(a*)b".  Then when you compiled the expression and matched it against
 * something like "xaaaab", you would get results like this:
 *
 * <pre>
 *  RE r = new RE("(a*)b");                  // Compile expression
 *  boolean matched = r.match("xaaaab");     // Match against "xaaaab"
 *
 *  String wholeExpr = r.getParen(0);        // wholeExpr will be 'aaaab'
 *  String insideParens = r.getParen(1);     // insideParens will be 'aaaa'
 *
 *  int startWholeExpr = r.getParenStart(0); // startWholeExpr will be index 1
 *  int endWholeExpr = r.getParenEnd(0);     // endWholeExpr will be index 6
 *  int lenWholeExpr = r.getParenLength(0);  // lenWholeExpr will be 5
 *
 *  int startInside = r.getParenStart(1);    // startInside will be index 1
 *  int endInside = r.getParenEnd(1);        // endInside will be index 5
 *  int lenInside = r.getParenLength(1);     // lenInside will be 4
 * </pre>
 *
 * You can also refer to the contents of a parenthesized expression
 * within a regular expression itself.  This is called a
 * 'backreference'.  The first backreference in a regular expression is
 * denoted by \1, the second by \2 and so on.  So the expression:
 *
 * <pre>
 *  ([0-9]+)=\1
 * </pre>
 *
 * will match any string of the form n=n (like 0=0 or 2=2).
 *
 * <p>
 * The full regular expression syntax accepted by RE is described here:
 *
 * <pre>
 *
 *  <b><font face=times roman>Characters</font></b>
 *
 *    <i>unicodeChar</i>   Matches any identical unicode character
 *    \                    Used to quote a meta-character (like '*')
 *    \\                   Matches a single '\' character
 *    \0nnn                Matches a given octal character
 *    \xhh                 Matches a given 8-bit hexadecimal character
 *    \\uhhhh              Matches a given 16-bit hexadecimal character
 *    \t                   Matches an ASCII tab character
 *    \n                   Matches an ASCII newline character
 *    \r                   Matches an ASCII return character
 *    \f                   Matches an ASCII form feed character
 *
 *
 *  <b><font face=times roman>Character Classes</font></b>
 *
 *    [abc]                Simple character class
 *    [a-zA-Z]             Character class with ranges
 *    [^abc]               Negated character class
 * </pre>
 *
 * <b>NOTE:</b> Incomplete ranges will be interpreted as &quot;starts
 * from zero&quot; or &quot;ends with last character&quot;.
 * <br>
 * I.e. [-a] is the same as [\\u0000-a], and [a-] is the same as [a-\\uFFFF],
 * [-] means &quot;all characters&quot;.
 *
 * <pre>
 *
 *  <b><font face=times roman>Standard POSIX Character Classes</font></b>
 *
 *    [:alnum:]            Alphanumeric characters.
 *    [:alpha:]            Alphabetic characters.
 *    [:blank:]            Space and tab characters.
 *    [:cntrl:]            Control characters.
 *    [:digit:]            Numeric characters.
 *    [:graph:]            Characters that are printable and are also visible.
 *                         (A space is printable, but not visible, while an
 *                         `a' is both.)
 *    [:lower:]            Lower-case alphabetic characters.
 *    [:print:]            Printable characters (characters that are not
 *                         control characters.)
 *    [:punct:]            Punctuation characters (characters that are not letter,
 *                         digits, control characters, or space characters).
 *    [:space:]            Space characters (such as space, tab, and formfeed,
 *                         to name a few).
 *    [:upper:]            Upper-case alphabetic characters.
 *    [:xdigit:]           Characters that are hexadecimal digits.
 *
 *
 *  <b><font face=times roman>Non-standard POSIX-style Character Classes</font></b>
 *
 *    [:javastart:]        Start of a Java identifier
 *    [:javapart:]         Part of a Java identifier
 *
 *
 *  <b><font face=times roman>Predefined Classes</font></b>
 *
 *    .         Matches any character other than newline
 *    \w        Matches a "word" character (alphanumeric plus "_")
 *    \W        Matches a non-word character
 *    \s        Matches a whitespace character
 *    \S        Matches a non-whitespace character
 *    \d        Matches a digit character
 *    \D        Matches a non-digit character
 *
 *
 *  <b><font face=times roman>Boundary Matchers</font></b>
 *
 *    ^         Matches only at the beginning of a line
 *    $         Matches only at the end of a line
 *    \b        Matches only at a word boundary
 *    \B        Matches only at a non-word boundary
 *
 *
 *  <b><font face=times roman>Greedy Closures</font></b>
 *
 *    A*        Matches A 0 or more times (greedy)
 *    A+        Matches A 1 or more times (greedy)
 *    A?        Matches A 1 or 0 times (greedy)
 *    A{n}      Matches A exactly n times (greedy)
 *    A{n,}     Matches A at least n times (greedy)
 *    A{n,m}    Matches A at least n but not more than m times (greedy)
 *
 *
 *  <b><font face=times roman>Reluctant Closures</font></b>
 *
 *    A*?       Matches A 0 or more times (reluctant)
 *    A+?       Matches A 1 or more times (reluctant)
 *    A??       Matches A 0 or 1 times (reluctant)
 *
 *
 *  <b><font face=times roman>Logical Operators</font></b>
 *
 *    AB        Matches A followed by B
 *    A|B       Matches either A or B
 *    (A)       Used for subexpression grouping
 *   (?:A)      Used for subexpression clustering (just like grouping but
 *              no backrefs)
 *
 *
 *  <b><font face=times roman>Backreferences</font></b>
 *
 *    \1    Backreference to 1st parenthesized subexpression
 *    \2    Backreference to 2nd parenthesized subexpression
 *    \3    Backreference to 3rd parenthesized subexpression
 *    \4    Backreference to 4th parenthesized subexpression
 *    \5    Backreference to 5th parenthesized subexpression
 *    \6    Backreference to 6th parenthesized subexpression
 *    \7    Backreference to 7th parenthesized subexpression
 *    \8    Backreference to 8th parenthesized subexpression
 *    \9    Backreference to 9th parenthesized subexpression
 * </pre>
 *
 * <p>
 * All closure operators (+, *, ?, {m,n}) are greedy by default, meaning
 * that they match as many elements of the string as possible without
 * causing the overall match to fail.  If you want a closure to be
 * reluctant (non-greedy), you can simply follow it with a '?'.  A
 * reluctant closure will match as few elements of the string as
 * possible when finding matches.  {m,n} closures don't currently
 * support reluctancy.
 *
 * <p>
 * <b><font face="times roman">Line terminators</font></b>
 * <br>
 * A line terminator is a one- or two-character sequence that marks
 * the end of a line of the input character sequence. The following
 * are recognized as line terminators:
 * <ul>
 * <li>A newline (line feed) character ('\n'),</li>
 * <li>A carriage-return character followed immediately by a newline character ("\r\n"),</li>
 * <li>A standalone carriage-return character ('\r'),</li>
 * <li>A next-line character ('\u0085'),</li>
 * <li>A line-separator character ('\u2028'), or</li>
 * <li>A paragraph-separator character ('\u2029).</li>
 * </ul>
 *
 * <p>
 * RE runs programs compiled by the RECompiler class.  But the RE
 * matcher class does not include the actual regular expression compiler
 * for reasons of efficiency.  In fact, if you want to pre-compile one
 * or more regular expressions, the 'recompile' class can be invoked
 * from the command line to produce compiled output like this:
 *
 * <pre>
 *    // Pre-compiled regular expression "a*b"
 *    char[] re1Instructions =
 *    {
 *        0x007c, 0x0000, 0x001a, 0x007c, 0x0000, 0x000d, 0x0041,
 *        0x0001, 0x0004, 0x0061, 0x007c, 0x0000, 0x0003, 0x0047,
 *        0x0000, 0xfff6, 0x007c, 0x0000, 0x0003, 0x004e, 0x0000,
 *        0x0003, 0x0041, 0x0001, 0x0004, 0x0062, 0x0045, 0x0000,
 *        0x0000,
 *    };
 *
 *
 *    REProgram re1 = new REProgram(re1Instructions);
 * </pre>
 *
 * You can then construct a regular expression matcher (RE) object from
 * the pre-compiled expression re1 and thus avoid the overhead of
 * compiling the expression at runtime. If you require more dynamic
 * regular expressions, you can construct a single RECompiler object and
 * re-use it to compile each expression. Similarly, you can change the
 * program run by a given matcher object at any time. However, RE and
 * RECompiler are not threadsafe (for efficiency reasons, and because
 * requiring thread safety in this class is deemed to be a rare
 * requirement), so you will need to construct a separate compiler or
 * matcher object for each thread (unless you do thread synchronization
 * yourself). Once expression compiled into the REProgram object, REProgram
 * can be safely shared across multiple threads and RE objects.
 *
 * <br><p><br>
 *
 * <font color="red">
 * <i>ISSUES:</i>
 *
 * <ul>
 *  <li>com.weusours.util.re is not currently compatible with all
 *      standard POSIX regcomp flags</li>
 *  <li>com.weusours.util.re does not support POSIX equivalence classes
 *      ([=foo=] syntax) (I18N/locale issue)</li>
 *  <li>com.weusours.util.re does not support nested POSIX character
 *      classes (definitely should, but not completely trivial)</li>
 *  <li>com.weusours.util.re Does not support POSIX character collation
 *      concepts ([.foo.] syntax) (I18N/locale issue)</li>
 *  <li>Should there be different matching styles (simple, POSIX, Perl etc?)</li>
 *  <li>Should RE support character iterators (for backwards RE matching!)?</li>
 *  <li>Should RE support reluctant {m,n} closures (does anyone care)?</li>
 *  <li>Not *all* possibilities are considered for greediness when backreferences
 *      are involved (as POSIX suggests should be the case).  The POSIX RE
 *      "(ac*)c*d[ac]*\1", when matched against "acdacaa" should yield a match
 *      of acdacaa where \1 is "a".  This is not the case in this RE package,
 *      and actually Perl doesn't go to this extent either!  Until someone
 *      actually complains about this, I'm not sure it's worth "fixing".
 *      If it ever is fixed, test #137 in RETest.txt should be updated.</li>
 * </ul>
 *
 * </font>
 *
 * @see recompile
 * @see RECompiler
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:ts@sch-fer.de">Tobias Sch&auml;fer</a>
 */
