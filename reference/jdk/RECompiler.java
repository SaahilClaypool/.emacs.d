_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void include(char minmax, boolean include)

        /**
         * Includes a range with the same min and max
         * @param minmax Minimum and maximum end of range (inclusive)
         * @param include True if range should be included.  False otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void include(int min, int max, boolean include)

        /**
         * Includes (or excludes) the range from min to max, inclusive.
         * @param min Minimum end of range
         * @param max Maximum end of range
         * @param include True if range should be included.  False otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void remove(int min, int max)

        /**
         * Removes a range by deleting or shrinking all other ranges
         * @param min Minimum end of range
         * @param max Maximum end of range
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void merge(int min, int max)

        /**
         * Merges a range into the range list, coalescing ranges if possible.
         * @param min Minimum end of range
         * @param max Maximum end of range
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void delete(int index)

        /**
         * Deletes the range at a given index from the range lists
         * @param index Index of range to delete from minRange and maxRange arrays.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    class RERange

    /**
     * Local, nested class for maintaining character ranges for character classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    public REProgram compile(String pattern) throws RESyntaxException

    /**
     * Compiles a regular expression pattern into a program runnable by the pattern
     * matcher class 'RE'.
     * @param pattern Regular expression pattern to compile (see RECompiler class
     * for details).
     * @return A compiled regular expression program.
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see RE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int expr(int[] flags) throws RESyntaxException

    /**
     * Compile an expression with possible parens around it.  Paren matching
     * is done at this level so we can tie the branch tails together.
     * @param flags Flag value passed by reference
     * @return Node index of expression in instruction array
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int branch(int[] flags) throws RESyntaxException

    /**
     * Compile one branch of an or operator (implements concatenation)
     * @param flags Flags passed by reference
     * @return Pointer to branch node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int closure(int[] flags) throws RESyntaxException

    /**
     * Compile a possibly closured terminal
     * @param flags Flags passed by reference
     * @return Index of closured node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int terminal(int[] flags) throws RESyntaxException

    /**
     * Match a terminal node.
     * @param flags Flags
     * @return Index of terminal node (closeable)
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int atom() throws RESyntaxException

    /**
     * Absorb an atomic character string.  This method is a little tricky because
     * it can un-include the last character of string if a closure operator follows.
     * This is correct because *+? have higher precedence than concatentation (thus
     * ABC* means AB(C*) and NOT (ABC)*).
     * @return Index of new atom node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int characterClass() throws RESyntaxException

    /**
     * Compile a character class
     * @return Index of class node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int escape() throws RESyntaxException

    /**
     * Match an escape sequence.  Handles quoted chars and octal escapes as well
     * as normal escape characters.  Always advances the input stream by the
     * right amount. This code "understands" the subtle difference between an
     * octal escape and a backref.  You can access the type of ESC_CLASS or
     * ESC_COMPLEX or ESC_BACKREF by looking at pattern[idx - 1].
     * @return ESC_* code or character if simple escape
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void bracket() throws RESyntaxException

    /**
     * Match bracket {m,n} expression put results in bracket member variables
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    synchronized void reallocBrackets() {

    /** Enlarge storage for brackets only as needed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void allocBrackets()

    /**
     * Allocate storage for brackets only as needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void syntaxError(String s) throws RESyntaxException

    /**
     * Throws a new syntax error exception
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void internalError() throws Error

    /**
     * Throws a new internal error exception
     * @exception Error Thrown in the event of an internal error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int node(char opcode, int opdata)

    /**
     * Adds a new node
     * @param opcode Opcode for node
     * @param opdata Opdata for node (only the low 16 bits are currently used)
     * @return Index of new node in program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void setNextOfEnd(int node, int pointTo)

    /**
     * Appends a node to the end of a node chain
     * @param node Start of node chain to traverse
     * @param pointTo Node to have the tail of the chain point to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void nodeInsert(char opcode, int opdata, int insertAt)

    /**
     * Inserts a node with a given opcode and opdata at insertAt.  The node relative next
     * pointer is initialized to 0.
     * @param opcode Opcode for new node
     * @param opdata Opdata for new node (only the low 16 bits are currently used)
     * @param insertAt Index at which to insert the new node in the program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void emit(char c)

    /**
     * Emit a single character into the program stream.
     * @param c Character to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void ensure(int n)

    /**
     * Ensures that n more characters can fit in the program buffer.
     * If n more can't fit, then the size is doubled until it can.
     * @param n Number of additional characters to ensure will fit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    public RECompiler()

    /**
     * Constructor.  Creates (initially empty) storage for a regular expression program.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
public class RECompiler

/**
 * A regular expression compiler class.  This class compiles a pattern string into a
 * regular expression program interpretable by the RE evaluator class.  The 'recompile'
 * command line tool uses this compiler to pre-compile regular expressions for use
 * with RE.  For a description of the syntax accepted by RECompiler and what you can
 * do with regular expressions, see the documentation for the RE matcher class.
 *
 * @see RE
 * @see recompile
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:gholam@xtra.co.nz">Michael McCallum</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void include(char minmax, boolean include)

        /**
         * Includes a range with the same min and max
         * @param minmax Minimum and maximum end of range (inclusive)
         * @param include True if range should be included.  False otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void include(int min, int max, boolean include)

        /**
         * Includes (or excludes) the range from min to max, inclusive.
         * @param min Minimum end of range
         * @param max Maximum end of range
         * @param include True if range should be included.  False otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void remove(int min, int max)

        /**
         * Removes a range by deleting or shrinking all other ranges
         * @param min Minimum end of range
         * @param max Maximum end of range
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void merge(int min, int max)

        /**
         * Merges a range into the range list, coalescing ranges if possible.
         * @param min Minimum end of range
         * @param max Maximum end of range
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
        void delete(int index)

        /**
         * Deletes the range at a given index from the range lists
         * @param index Index of range to delete from minRange and maxRange arrays.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    class RERange

    /**
     * Local, nested class for maintaining character ranges for character classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    public REProgram compile(String pattern) throws RESyntaxException

    /**
     * Compiles a regular expression pattern into a program runnable by the pattern
     * matcher class 'RE'.
     * @param pattern Regular expression pattern to compile (see RECompiler class
     * for details).
     * @return A compiled regular expression program.
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     * @see RECompiler
     * @see RE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int expr(int[] flags) throws RESyntaxException

    /**
     * Compile an expression with possible parens around it.  Paren matching
     * is done at this level so we can tie the branch tails together.
     * @param flags Flag value passed by reference
     * @return Node index of expression in instruction array
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int branch(int[] flags) throws RESyntaxException

    /**
     * Compile one branch of an or operator (implements concatenation)
     * @param flags Flags passed by reference
     * @return Pointer to branch node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int closure(int[] flags) throws RESyntaxException

    /**
     * Compile a possibly closured terminal
     * @param flags Flags passed by reference
     * @return Index of closured node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int terminal(int[] flags) throws RESyntaxException

    /**
     * Match a terminal node.
     * @param flags Flags
     * @return Index of terminal node (closeable)
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int atom() throws RESyntaxException

    /**
     * Absorb an atomic character string.  This method is a little tricky because
     * it can un-include the last character of string if a closure operator follows.
     * This is correct because *+? have higher precedence than concatentation (thus
     * ABC* means AB(C*) and NOT (ABC)*).
     * @return Index of new atom node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int characterClass() throws RESyntaxException

    /**
     * Compile a character class
     * @return Index of class node
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int escape() throws RESyntaxException

    /**
     * Match an escape sequence.  Handles quoted chars and octal escapes as well
     * as normal escape characters.  Always advances the input stream by the
     * right amount. This code "understands" the subtle difference between an
     * octal escape and a backref.  You can access the type of ESC_CLASS or
     * ESC_COMPLEX or ESC_BACKREF by looking at pattern[idx - 1].
     * @return ESC_* code or character if simple escape
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void bracket() throws RESyntaxException

    /**
     * Match bracket {m,n} expression put results in bracket member variables
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    synchronized void reallocBrackets() {

    /** Enlarge storage for brackets only as needed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void allocBrackets()

    /**
     * Allocate storage for brackets only as needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void syntaxError(String s) throws RESyntaxException

    /**
     * Throws a new syntax error exception
     * @exception RESyntaxException Thrown if the regular expression has invalid syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void internalError() throws Error

    /**
     * Throws a new internal error exception
     * @exception Error Thrown in the event of an internal error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    int node(char opcode, int opdata)

    /**
     * Adds a new node
     * @param opcode Opcode for node
     * @param opdata Opdata for node (only the low 16 bits are currently used)
     * @return Index of new node in program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void setNextOfEnd(int node, int pointTo)

    /**
     * Appends a node to the end of a node chain
     * @param node Start of node chain to traverse
     * @param pointTo Node to have the tail of the chain point to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void nodeInsert(char opcode, int opdata, int insertAt)

    /**
     * Inserts a node with a given opcode and opdata at insertAt.  The node relative next
     * pointer is initialized to 0.
     * @param opcode Opcode for new node
     * @param opdata Opdata for new node (only the low 16 bits are currently used)
     * @param insertAt Index at which to insert the new node in the program
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void emit(char c)

    /**
     * Emit a single character into the program stream.
     * @param c Character to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    void ensure(int n)

    /**
     * Ensures that n more characters can fit in the program buffer.
     * If n more can't fit, then the size is doubled until it can.
     * @param n Number of additional characters to ensure will fit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
    public RECompiler()

    /**
     * Constructor.  Creates (initially empty) storage for a regular expression program.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/regexp/internal/RECompiler.java
public class RECompiler

/**
 * A regular expression compiler class.  This class compiles a pattern string into a
 * regular expression program interpretable by the RE evaluator class.  The 'recompile'
 * command line tool uses this compiler to pre-compile regular expressions for use
 * with RE.  For a description of the syntax accepted by RECompiler and what you can
 * do with regular expressions, see the documentation for the RE matcher class.
 *
 * @see RE
 * @see recompile
 *
 * @author <a href="mailto:jonl@muppetlabs.com">Jonathan Locke</a>
 * @author <a href="mailto:gholam@xtra.co.nz">Michael McCallum</a>
 */
