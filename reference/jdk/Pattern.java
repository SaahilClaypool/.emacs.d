_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
    public abstract double getPriority();

    /**
     * Returns the priority of this pattern (section 5.5 in the XSLT spec).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
    public abstract void translate(ClassGenerator classGen,
                                   MethodGenerator methodGen);

    /**
     * Translate this node into JVM bytecodes. Patterns are translated as
     * boolean expressions with true/false lists. Before calling
     * <code>translate</code> on a pattern, make sure that the node being
     * matched is on top of the stack. After calling <code>translate</code>,
     * make sure to backpatch both true and false lists. True lists are the
     * default, in the sense that they always <em>"fall through"</em>. If this
     * is not the intended semantics (e.g., see
     * {@link com.sun.org.apache.xalan.internal.xsltc.compiler.AlternativePattern#translate})
     * then a GOTO must be appended to the instruction list after calling
     * <code>translate</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
public abstract class Pattern extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
    public abstract double getPriority();

    /**
     * Returns the priority of this pattern (section 5.5 in the XSLT spec).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
    public abstract void translate(ClassGenerator classGen,
                                   MethodGenerator methodGen);

    /**
     * Translate this node into JVM bytecodes. Patterns are translated as
     * boolean expressions with true/false lists. Before calling
     * <code>translate</code> on a pattern, make sure that the node being
     * matched is on top of the stack. After calling <code>translate</code>,
     * make sure to backpatch both true and false lists. True lists are the
     * default, in the sense that they always <em>"fall through"</em>. If this
     * is not the intended semantics (e.g., see
     * {@link com.sun.org.apache.xalan.internal.xsltc.compiler.AlternativePattern#translate})
     * then a GOTO must be appended to the instruction list after calling
     * <code>translate</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Pattern.java
public abstract class Pattern extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public Stream<String> splitAsStream(final CharSequence input) {

    /**
     * Creates a stream from the given input sequence around matches of this
     * pattern.
     *
     * <p> The stream returned by this method contains each substring of the
     * input sequence that is terminated by another subsequence that matches
     * this pattern or is terminated by the end of the input sequence.  The
     * substrings in the stream are in the order in which they occur in the
     * input. Trailing empty strings will be discarded and not encountered in
     * the stream.
     *
     * <p> If this pattern does not match any subsequence of the input then
     * the resulting stream has just one element, namely the input sequence in
     * string form.
     *
     * <p> When there is a positive-width match at the beginning of the input
     * sequence then an empty leading substring is included at the beginning
     * of the stream. A zero-width match at the beginning however never produces
     * such empty leading substring.
     *
     * <p> If the input sequence is mutable, it must remain constant during the
     * execution of the terminal stream operation.  Otherwise, the result of the
     * terminal stream operation is undefined.
     *
     * @param   input
     *          The character sequence to be split
     *
     * @return  The stream of strings computed by splitting the input
     *          around matches of this pattern
     * @see     #split(CharSequence)
     * @since   1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public Predicate<String> asPredicate() {

    /**
     * Creates a predicate which can be used to match a string.
     *
     * @return  The predicate which can be used for matching on a string
     * @since   1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    /**

///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class BnMS extends BnM {

    /**
     * Supplementary support version of BnM(). Unpaired surrogates are
     * also handled by this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
        static Node optimize(Node node) {

        /**
         * Pre calculates arrays needed to generate the bad character
         * shift and the good suffix shift. Only the last seven bits
         * are used to see if chars match; This keeps the tables small
         * and covers the heavily used ASCII range, but occasionally
         * results in an aliased match for the bad character shift.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class BnM extends Node {

    /**
     * Attempts to match a slice in the input using the Boyer-Moore string
     * matching algorithm. The algorithm is based on the idea that the
     * pattern can be shifted farther ahead in the search text if it is
     * matched right to left.
     * <p>
     * The pattern is compared to the input one character at a time, from
     * the rightmost character in the pattern to the left. If the characters
     * all match the pattern has been found. If a character does not match,
     * the pattern is shifted right a distance that is the maximum of two
     * functions, the bad character shift and the good suffix shift. This
     * shift moves the attempted match position through the input more
     * quickly than a naive one position at a time check.
     * <p>
     * The bad character shift is based on the character from the text that
     * did not match. If the character does not appear in the pattern, the
     * pattern can be shifted completely beyond the bad character. If the
     * character does occur in the pattern, the pattern can be shifted to
     * line the pattern up with the next occurrence of that character.
     * <p>
     * The good suffix shift is based on the idea that some subset on the right
     * side of the pattern has matched. When a bad character is found, the
     * pattern can be shifted right by the pattern length if the subset does
     * not occur again in pattern, or by the amount of distance to the
     * next occurrence of the subset in the pattern.
     *
     * Boyer-Moore search methods adapted from code by Amy Yu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static boolean hasBaseCharacter(Matcher matcher, int i,
                                            CharSequence seq)

    /**
     * Non spacing marks only count as word characters in bounds calculations
     * if they have a base character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Bound extends Node {

    /**
     * Handles word boundaries. Includes a field to allow this one class to
     * deal with the different types of word boundaries we can match. The word
     * characters include underscores, letters, and digits. Non spacing marks
     * can are also part of a word if they have a base character, otherwise
     * they are ignored for purposes of finding word boundaries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static CharProperty setDifference(final CharProperty lhs,
                                              final CharProperty rhs) {

    /**
     * Returns the set difference of two CharProperty nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static CharProperty intersection(final CharProperty lhs,
                                             final CharProperty rhs) {

    /**
     * Returns the set intersection of two CharProperty nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static CharProperty union(final CharProperty lhs,
                                      final CharProperty rhs) {

    /**
     * Returns the set union of two CharProperty nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class NotBehindS extends NotBehind {

    /**
     * Zero width negative lookbehind, including supplementary
     * characters or unpaired surrogates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class NotBehind extends Node {

    /**
     * Zero width negative lookbehind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class BehindS extends Behind {

    /**
     * Zero width positive lookbehind, including supplementary
     * characters or unpaired surrogates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class Behind extends Node {

    /**
     * Zero width positive lookbehind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static Node lookbehindEnd = new Node() {

    /**
     * For use with lookbehinds; matches the position where the lookbehind
     * was encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Neg extends Node {

    /**
     * Zero width negative lookahead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Pos extends Node {

    /**
     * Zero width positive lookahead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class First extends Node {

    /**
     * Searches until the next instance of its atom. This is useful for
     * finding the atom efficiently without passing an instance of it
     * (greedy problem) and without a lot of wasted search time (reluctant
     * problem).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class BackRef extends Node {

    /**
     * Refers to a group in the regular expression. Attempts to match
     * whatever the group referred to last matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class LazyLoop extends Loop {

    /**
     * Handles the repetition count for a reluctant Curly. The matchInit
     * is called from the Prolog to save the index of where the group
     * beginning is stored. A zero length group check occurs in the
     * normal match but is skipped in the matchInit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class Loop extends Node {

    /**
     * Handles the repetition count for a greedy Curly. The matchInit
     * is called from the Prolog to save the index of where the group
     * beginning is stored. A zero length group check occurs in the
     * normal match but is skipped in the matchInit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Prolog extends Node {

    /**
     * This sets up a loop to handle a recursive quantifier structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class GroupTail extends Node {

    /**
     * The GroupTail handles the setting of group beginning and ending
     * locations when groups are successfully matched. It must also be able to
     * unset groups that have to be backed off of.
     *
     * The GroupTail node is also used when a previous group is referenced,
     * and in that case no group information needs to be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class GroupRef extends Node {

    /**
     * Recursive reference to a group in the regular expression. It calls
     * matchRef because if the reference fails to match we would not unset
     * the group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class GroupHead extends Node {

    /**
     * The GroupHead saves the location where the group begins in the locals
     * and restores them when the match is done.
     *
     * The matchRef is used when a reference to this group is accessed later
     * in the expression. The locals will have a negative value in them to
     * indicate that we do not want to unset the group if the reference
     * doesn't match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Branch extends Node {

    /**
     * Handles the branching of alternations. Note this is also used for
     * the ? quantifier to branch between the case where it matches once
     * and where it does not occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class BranchConn extends Node {

    /**
     * A Guard node at the end of each atom node in a Branch. It
     * serves the purpose of chaining the "match" operation to
     * "next" but not the "study", so we can collect the TreeInfo
     * of each atom node without including the TreeInfo of the
     * "next".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class GroupCurly extends Node {

    /**
     * Handles the curly-brace style repetition with a specified minimum and
     * maximum occurrences in deterministic cases. This is an iterative
     * optimization over the Prolog and Loop system which would handle this
     * in a recursive way. The * quantifier is handled as a special case.
     * If capture is true then this class saves group settings and ensures
     * that groups are unset when backing off of a group match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Curly extends Node {

    /**
     * Handles the curly-brace style repetition with a specified minimum and
     * maximum occurrences. The * quantifier is handled as a special case.
     * This class handles the three types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Ques extends Node {

    /**
     * The 0 or 1 quantifier. This one class implements all three types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class UnixDot extends CharProperty {

    /**
     * Node class for the dot metacharacter when dotall is not enabled
     * but UNIX_LINES is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Dot extends CharProperty {

    /**
     * Node class for the dot metacharacter when dotall is not enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class All extends CharProperty {

    /**
     * Implements the Unicode category ALL and the dot metacharacter when
     * in dotall mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty caseInsensitiveRangeFor(final int lower,
                                                 final int upper) {

    /**
     * Returns node for matching characters within an explicit value
     * range in a case insensitive manner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static CharProperty rangeFor(final int lower,
                                         final int upper) {

    /**
     * Returns node for matching characters within an explicit value range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SliceUS extends SliceIS {

    /**
     * Node class for a case insensitive sequence of literal characters.
     * Uses unicode case folding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class SliceIS extends SliceNode {

    /**
     * Node class for a case insensitive sequence of literal characters
     * including supplementary characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SliceS extends SliceNode {

    /**
     * Node class for a case sensitive sequence of literal characters
     * including supplementary characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SliceU extends SliceNode {

    /**
     * Node class for a unicode_case_insensitive/BMP-only sequence of
     * literal characters. Uses unicode case folding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class SliceI extends SliceNode {

    /**
     * Node class for a case_insensitive/BMP-only sequence of literal
     * characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Slice extends SliceNode {

    /**
     * Node class for a case sensitive/BMP-only sequence of literal
     * characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class SliceNode extends Node {

    /**
     * Base class for all Slice nodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class HorizWS extends BmpCharProperty {

    /**
     * Node class that matches a Perl horizontal whitespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class VertWS extends BmpCharProperty {

    /**
     * Node class that matches a Perl vertical whitespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Ctype extends BmpCharProperty {

    /**
     * Node class that matches a POSIX type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Utype extends CharProperty {

    /**
     * Node class that matches a Unicode "type"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Category extends CharProperty {

    /**
     * Node class that matches a Unicode category.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Script extends CharProperty {

    /**
     * Node class that matches a Unicode script
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Block extends CharProperty {

    /**
     * Node class that matches a Unicode block.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SingleU extends CharProperty {

    /**
     * Unicode case insensitive matches a given Unicode character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SingleI extends BmpCharProperty {

    /**
     * Case insensitive matches a given BMP character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Single extends BmpCharProperty {

    /**
     * Optimization -- matches a given BMP character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class SingleS extends CharProperty {

    /**
     * Node class that matches a Supplementary Unicode character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static abstract class BmpCharProperty extends CharProperty {

    /**
     * Optimized version of CharProperty that works only for
     * properties never satisfied by Supplementary characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static abstract class CharProperty extends Node {

    /**
     * Abstract node class to match one character satisfying some
     * boolean property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class LineEnding extends Node {

    /**
     * Node class that matches a Unicode line ending '\R'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class UnixDollar extends Node {

    /**
     * Node to anchor at the end of a line or the end of input based on the
     * multiline mode when in unix lines mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Dollar extends Node {

    /**
     * Node to anchor at the end of a line or the end of input based on the
     * multiline mode.
     *
     * When not in multiline mode, the $ can only match at the very end
     * of the input, unless the input ends in a line terminator in which
     * it matches right before the last line terminator.
     *
     * Note that \r\n is considered an atomic line terminator.
     *
     * Like ^ the $ operator matches at a position, it does not match the
     * line terminators themselves.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class LastMatch extends Node {

    /**
     * Node to match the location where the last match ended.
     * This is used for the \G construct.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class UnixCaret extends Node {

    /**
     * Node to anchor at the beginning of a line when in unixdot mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Caret extends Node {

    /**
     * Node to anchor at the beginning of a line. This is essentially the
     * object to match for the multiline ^.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class End extends Node {

    /**
     * Node to anchor at the end of input. This is the absolute end, so this
     * should not match at the last newline before the end as $ will.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class Begin extends Node {

    /**
     * Node to anchor at the beginning of input. This object implements the
     * match for a \A sequence, and the caret anchor will use this if not in
     * multiline mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static class Start extends Node {

    /**
     * Used for REs that can start anywhere within the input string.
     * This basically tries to match repeatedly at each spot in the
     * input string, moving forward after each try. An anchored search
     * or a BnM will bypass this node completely.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
        boolean match(Matcher matcher, int i, CharSequence seq) {

        /**
         * This method implements the classic accept node with
         * the addition of a check to see if the match occurred
         * using all of the input.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
        boolean study(TreeInfo info) {

        /**
         * This method is good for all zero length assertions.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
        boolean match(Matcher matcher, int i, CharSequence seq) {

        /**
         * This method implements the classic accept node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    /**

    /**
     * The following classes are the building components of the object
     * tree that represents a compiled regular expression. The object tree
     * is made of individual elements that handle constructs in the Pattern.
     * Each type of object knows how to match its equivalent construct with
     * the match() method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node newSlice(int[] buf, int count, boolean hasSupplementary) {

    /**
     *  Utility method for creating a string slice matcher.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty newSingle(final int ch) {

    /**
     *  Returns a suitably optimized, single character matcher.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static final class BitClass extends BmpCharProperty {

    /**
     *  Creates a bit vector for matching Latin-1 values. A normal BitClass
     *  never matches values above Latin-1, and a complemented BitClass always
     *  matches values above Latin-1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int cursor() {

    /**
     *  Utility method for parsing unicode escape sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int x() {

    /**
     *  Utility method for parsing hexadecimal escape sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int o() {

    /**
     *  Utility method for parsing octal escape sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int c() {

    /**
     *  Utility method for parsing control escape sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node closure(Node prev) {

    /**
     * Processes repetition. If the next character peeked is a quantifier
     * then new nodes must be appended to handle the repetition.
     * Prev could be a single or a group, so it could be a chain of nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void subFlag() {

    /**
     * Parses the second part of inlined match flags and turns off
     * flags appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void addFlag() {

    /**
     * Parses inlined match flags and set them appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node createGroup(boolean anonymous) {

    /**
     * Create group head and tail nodes using double return. If the group is
     * created with anonymous true then it is a pure group and should not
     * affect group counting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node group0() {

    /**
     * Parses a group and returns the head node of a set of nodes that process
     * the group. Sometimes a double return system is used where the tail is
     * returned in root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private String groupname(int ch) {

    /**
     * Parses and returns the name of a "named capturing group", the trailing
     * ">" is consumed after parsing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty charPropertyNodeFor(String name) {

    /**
     * Returns a CharProperty matching all characters in a named property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty unicodeBlockPropertyFor(String name) {

    /**
     * Returns a CharProperty matching all characters in a UnicodeBlock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty unicodeScriptPropertyFor(String name) {

    /**
     * Returns a CharProperty matching all characters belong to
     * a UnicodeScript.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty family(boolean singleLetter,
                                boolean maybeComplement)

    /**
     * Parses a Unicode character family and returns its representative node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty range(BitClass bits) {

    /**
     * Parse a single character or a character range in a character class
     * and return its representative node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private CharProperty clazz(boolean consume) {

    /**
     * Parse a character class, and return the node that matches it.
     *
     * Consumes a ] on the way out if consume is true. Usually consume
     * is true except for the case of [abc&&def] where def is a separate
     * right hand node with "understood" brackets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int escape(boolean inclass, boolean create, boolean isrange) {

    /**
     * Parses an escape sequence to determine the actual value that needs
     * to be matched.
     * If -1 is returned and create was true a new object was added to the tree
     * to handle the escape sequence.
     * If the returned value is greater than zero, it is the value that
     * matches the escape sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node ref(int refNum) {

    /**
     * Parses a backref greedily, taking as many numbers as it
     * can. The first digit is always treated as a backref, but
     * multi digit numbers are only treated as a backref if at
     * least that many backrefs exist at this point in the regex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node atom() {

    /**
     * Parse and add a new Single or Slice.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Node sequence(Node end) {

    /**
     * Parsing of sequences between alternations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    /**

    /**
     *  The following methods handle the main parsing. They are sorted
     *  according to their precedence order, the lowest one first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static final boolean isSupplementary(int ch) {

    /**
     * Determines if the specified code point is a supplementary
     * character or unpaired surrogate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private boolean findSupplementary(int start, int end) {

    /**
     * Determines if there is any supplementary character or unpaired
     * surrogate in the specified range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private PatternSyntaxException error(String s) {

    /**
     * Internal method used for handling all syntax errors. The pattern is
     * displayed with a pointer to aid in locating the syntax error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void unread() {

    /**
     * Unread one next character, and retreat cursor by one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int skip() {

    /**
     * Read the character after the next one, and advance the cursor by two.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private boolean isLineSeparator(int ch) {

    /**
     * Determines if character is a line separator in the current mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int peekPastLine() {

    /**
     * xmode peek past comment to end of line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int parsePastLine() {

    /**
     * xmode parse past comment to end of line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int parsePastWhitespace(int ch) {

    /**
     * If in xmode parse past whitespace and comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int peekPastWhitespace(int ch) {

    /**
     * If in xmode peek past whitespace and comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int nextEscaped() {

    /**
     * Advance the cursor by one, and peek the next character,
     * ignoring the COMMENTS setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int next() {

    /**
     * Advance the cursor by one, and peek the next character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int readEscaped() {

    /**
     * Read the next character, and advance the cursor by one,
     * ignoring the COMMENTS setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int read() {

    /**
     * Read the next character, and advance the cursor by one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int peek() {

    /**
     * Peek the next character, and do not advance the cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void mark(int c) {

    /**
     * Mark the end of pattern with a specific character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void accept(int ch, String s) {

    /**
     * Match next character, signal error if failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private boolean has(int f) {

    /**
     * Indicates whether a particular flag is set or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    static final class TreeInfo {

    /**
     * Used to accumulate information about a subtree of the object graph
     * so that optimizations can be applied to the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static void printObjectTree(Node node) {

    /**
     * Used to print out a subtree of the Pattern to help with debugging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void compile() {

    /**
     * Copies regular expression to an int array and invokes the parsing
     * of the expression which will create the object tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void RemoveQEQuoting() {

    /**
     * Preprocess any \Q...\E sequences in `temp', meta-quoting them.
     * See the description of `quotemeta' in perlfunc(1).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private String composeOneStep(String input) {

    /**
     * Attempts to compose input by combining the first character
     * with the first combining mark following it. Returns a String
     * that is the composition of the leading character with its first
     * combining mark followed by the remaining combining marks. Returns
     * null if the first two characters cannot be further composed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private String[] producePermutations(String input) {

    /**
     * Returns an array of strings that have all the possible
     * permutations of the characters in the input string.
     * This is used to get a list of all possible orderings
     * of a set of combining marks. Note that some of the permutations
     * are invalid because of combining class collisions, and these
     * possibilities must be removed because they are not canonically
     * equivalent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private String produceEquivalentAlternation(String source) {

    /**
     * Given a specific sequence composed of a regular character and
     * combining marks that follow it, produce the alternation that will
     * match all canonical equivalences of that sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int normalizeCharClass(StringBuilder newPattern, int i) {

    /**
     * Complete the character class being parsed and add a set
     * of alternations to it that will match the canonical equivalences
     * of the characters within the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void normalize() {

    /**
     * The pattern is converted to normalizedD form and then a pure group
     * is constructed to match canonical equivalences of the characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private Pattern(String p, int f) {

    /**
     * This private constructor is used to create all Patterns. The pattern
     * string and match flags are all that is needed to completely describe
     * a Pattern. An empty pattern string results in an object tree with
     * only a Start node and a LastNode node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Recompile the Pattern instance from a stream.  The original pattern
     * string is read in and the object tree is recompiled from it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static String quote(String s) {

    /**
     * Returns a literal pattern <code>String</code> for the specified
     * <code>String</code>.
     *
     * <p>This method produces a <code>String</code> that can be used to
     * create a <code>Pattern</code> that would match the string
     * <code>s</code> as if it were a literal pattern.</p> Metacharacters
     * or escape sequences in the input sequence will be given no special
     * meaning.
     *
     * @param  s The string to be literalized
     * @return  A literal string replacement
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public String[] split(CharSequence input) {

    /**
     * Splits the given input sequence around matches of this pattern.
     *
     * <p> This method works as if by invoking the two-argument {@link
     * #split(java.lang.CharSequence, int) split} method with the given input
     * sequence and a limit argument of zero.  Trailing empty strings are
     * therefore not included in the resulting array. </p>
     *
     * <p> The input <tt>"boo:and:foo"</tt>, for example, yields the following
     * results with these expressions:
     *
     * <blockquote><table cellpadding=1 cellspacing=0
     *              summary="Split examples showing regex and result">
     * <tr><th align="left"><i>Regex&nbsp;&nbsp;&nbsp;&nbsp;</i></th>
     *     <th align="left"><i>Result</i></th></tr>
     * <tr><td align=center>:</td>
     *     <td><tt>{ "boo", "and", "foo" }</tt></td></tr>
     * <tr><td align=center>o</td>
     *     <td><tt>{ "b", "", ":and:f" }</tt></td></tr>
     * </table></blockquote>
     *
     *
     * @param  input
     *         The character sequence to be split
     *
     * @return  The array of strings computed by splitting the input
     *          around matches of this pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public String[] split(CharSequence input, int limit) {

    /**
     * Splits the given input sequence around matches of this pattern.
     *
     * <p> The array returned by this method contains each substring of the
     * input sequence that is terminated by another subsequence that matches
     * this pattern or is terminated by the end of the input sequence.  The
     * substrings in the array are in the order in which they occur in the
     * input. If this pattern does not match any subsequence of the input then
     * the resulting array has just one element, namely the input sequence in
     * string form.
     *
     * <p> When there is a positive-width match at the beginning of the input
     * sequence then an empty leading substring is included at the beginning
     * of the resulting array. A zero-width match at the beginning however
     * never produces such empty leading substring.
     *
     * <p> The <tt>limit</tt> parameter controls the number of times the
     * pattern is applied and therefore affects the length of the resulting
     * array.  If the limit <i>n</i> is greater than zero then the pattern
     * will be applied at most <i>n</i>&nbsp;-&nbsp;1 times, the array's
     * length will be no greater than <i>n</i>, and the array's last entry
     * will contain all input beyond the last matched delimiter.  If <i>n</i>
     * is non-positive then the pattern will be applied as many times as
     * possible and the array can have any length.  If <i>n</i> is zero then
     * the pattern will be applied as many times as possible, the array can
     * have any length, and trailing empty strings will be discarded.
     *
     * <p> The input <tt>"boo:and:foo"</tt>, for example, yields the following
     * results with these parameters:
     *
     * <blockquote><table cellpadding=1 cellspacing=0
     *              summary="Split examples showing regex, limit, and result">
     * <tr><th align="left"><i>Regex&nbsp;&nbsp;&nbsp;&nbsp;</i></th>
     *     <th align="left"><i>Limit&nbsp;&nbsp;&nbsp;&nbsp;</i></th>
     *     <th align="left"><i>Result&nbsp;&nbsp;&nbsp;&nbsp;</i></th></tr>
     * <tr><td align=center>:</td>
     *     <td align=center>2</td>
     *     <td><tt>{ "boo", "and:foo" }</tt></td></tr>
     * <tr><td align=center>:</td>
     *     <td align=center>5</td>
     *     <td><tt>{ "boo", "and", "foo" }</tt></td></tr>
     * <tr><td align=center>:</td>
     *     <td align=center>-2</td>
     *     <td><tt>{ "boo", "and", "foo" }</tt></td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>5</td>
     *     <td><tt>{ "b", "", ":and:f", "", "" }</tt></td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>-2</td>
     *     <td><tt>{ "b", "", ":and:f", "", "" }</tt></td></tr>
     * <tr><td align=center>o</td>
     *     <td align=center>0</td>
     *     <td><tt>{ "b", "", ":and:f" }</tt></td></tr>
     * </table></blockquote>
     *
     * @param  input
     *         The character sequence to be split
     *
     * @param  limit
     *         The result threshold, as described above
     *
     * @return  The array of strings computed by splitting the input
     *          around matches of this pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static boolean matches(String regex, CharSequence input) {

    /**
     * Compiles the given regular expression and attempts to match the given
     * input against it.
     *
     * <p> An invocation of this convenience method of the form
     *
     * <blockquote><pre>
     * Pattern.matches(regex, input);</pre></blockquote>
     *
     * behaves in exactly the same way as the expression
     *
     * <blockquote><pre>
     * Pattern.compile(regex).matcher(input).matches()</pre></blockquote>
     *
     * <p> If a pattern is to be used multiple times, compiling it once and reusing
     * it will be more efficient than invoking this method each time.  </p>
     *
     * @param  regex
     *         The expression to be compiled
     *
     * @param  input
     *         The character sequence to be matched
     * @return whether or not the regular expression matches on the input
     * @throws  PatternSyntaxException
     *          If the expression's syntax is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public int flags() {

    /**
     * Returns this pattern's match flags.
     *
     * @return  The match flags specified when this pattern was compiled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public Matcher matcher(CharSequence input) {

    /**
     * Creates a matcher that will match the given input against this pattern.
     *
     * @param  input
     *         The character sequence to be matched
     *
     * @return  A new matcher for this pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public String toString() {

    /**
     * <p>Returns the string representation of this pattern. This
     * is the regular expression from which this pattern was
     * compiled.</p>
     *
     * @return  The string representation of this pattern
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public String pattern() {

    /**
     * Returns the regular expression from which this pattern was compiled.
     *
     * @return  The source of this pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static Pattern compile(String regex, int flags) {

    /**
     * Compiles the given regular expression into a pattern with the given
     * flags.
     *
     * @param  regex
     *         The expression to be compiled
     *
     * @param  flags
     *         Match flags, a bit mask that may include
     *         {@link #CASE_INSENSITIVE}, {@link #MULTILINE}, {@link #DOTALL},
     *         {@link #UNICODE_CASE}, {@link #CANON_EQ}, {@link #UNIX_LINES},
     *         {@link #LITERAL}, {@link #UNICODE_CHARACTER_CLASS}
     *         and {@link #COMMENTS}
     *
     * @return the given regular expression compiled into a pattern with the given flags
     * @throws  IllegalArgumentException
     *          If bit values other than those corresponding to the defined
     *          match flags are set in <tt>flags</tt>
     *
     * @throws  PatternSyntaxException
     *          If the expression's syntax is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static Pattern compile(String regex) {

    /**
     * Compiles the given regular expression into a pattern.
     *
     * @param  regex
     *         The expression to be compiled
     * @return the given regular expression compiled into a pattern
     * @throws  PatternSyntaxException
     *          If the expression's syntax is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient boolean hasSupplementary;

    /**
     * If the Start node might possibly match supplementary characters.
     * It is set to true during compiling if
     * (1) There is supplementary char in pattern, or
     * (2) There is complement node of Category or Block
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient int patternLength;

    /**
     * Holds the length of the pattern string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient int cursor;

    /**
     * Index into the pattern string that keeps track of how much has been
     * parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient int localCount;

    /**
     * The local variable count used by parsing tree. Used by matchers to
     * allocate storage needed to perform a match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient int capturingGroupCount;

    /**
     * The number of capturing groups in this Pattern. Used by matchers to
     * allocate storage needed to perform a match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient int[] temp;

    /**
     * Temporary null terminated code point array used by pattern compiling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient GroupHead[] groupNodes;

    /**
     * Temporary storage used while parsing group references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient volatile Map<String, Integer> namedGroups;

    /**
     * Map the "name" of the "named capturing group" to its group id
     * node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient int[] buffer;

    /**
     * Temporary storage used by parsing pattern slice.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient Node matchRoot;

    /**
     * The root of object tree for a match operation.  The pattern is matched
     * at the beginning.  This may include a find that uses BnM or a First
     * node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    transient Node root;

    /**
     * The starting point of state machine for the find operation.  This allows
     * a match to start anywhere in the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient String normalizedPattern;

    /**
     * The normalized pattern string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private transient volatile boolean compiled = false;

    /**
     * Boolean indicating this Pattern is compiled; this is necessary in order
     * to lazily compile deserialized Patterns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private int flags;

    /**
     * The original pattern flags.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private String pattern;

    /**
     * The original regular-expression pattern string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    private static final long serialVersionUID = 5073258162644648461L;

    /** use serialVersionUID from Merlin b59 for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int UNICODE_CHARACTER_CLASS = 0x100;

    /**
     * Enables the Unicode version of <i>Predefined character classes</i> and
     * <i>POSIX character classes</i>.
     *
     * <p> When this flag is specified then the (US-ASCII only)
     * <i>Predefined character classes</i> and <i>POSIX character classes</i>
     * are in conformance with
     * <a href="http://www.unicode.org/reports/tr18/"><i>Unicode Technical
     * Standard #18: Unicode Regular Expression</i></a>
     * <i>Annex C: Compatibility Properties</i>.
     * <p>
     * The UNICODE_CHARACTER_CLASS mode can also be enabled via the embedded
     * flag expression&nbsp;<tt>(?U)</tt>.
     * <p>
     * The flag implies UNICODE_CASE, that is, it enables Unicode-aware case
     * folding.
     * <p>
     * Specifying this flag may impose a performance penalty.  </p>
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int CANON_EQ = 0x80;

    /**
     * Enables canonical equivalence.
     *
     * <p> When this flag is specified then two characters will be considered
     * to match if, and only if, their full canonical decompositions match.
     * The expression <tt>"a&#92;u030A"</tt>, for example, will match the
     * string <tt>"&#92;u00E5"</tt> when this flag is specified.  By default,
     * matching does not take canonical equivalence into account.
     *
     * <p> There is no embedded flag character for enabling canonical
     * equivalence.
     *
     * <p> Specifying this flag may impose a performance penalty.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int UNICODE_CASE = 0x40;

    /**
     * Enables Unicode-aware case folding.
     *
     * <p> When this flag is specified then case-insensitive matching, when
     * enabled by the {@link #CASE_INSENSITIVE} flag, is done in a manner
     * consistent with the Unicode Standard.  By default, case-insensitive
     * matching assumes that only characters in the US-ASCII charset are being
     * matched.
     *
     * <p> Unicode-aware case folding can also be enabled via the embedded flag
     * expression&nbsp;<tt>(?u)</tt>.
     *
     * <p> Specifying this flag may impose a performance penalty.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int DOTALL = 0x20;

    /**
     * Enables dotall mode.
     *
     * <p> In dotall mode, the expression <tt>.</tt> matches any character,
     * including a line terminator.  By default this expression does not match
     * line terminators.
     *
     * <p> Dotall mode can also be enabled via the embedded flag
     * expression&nbsp;<tt>(?s)</tt>.  (The <tt>s</tt> is a mnemonic for
     * "single-line" mode, which is what this is called in Perl.)  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int LITERAL = 0x10;

    /**
     * Enables literal parsing of the pattern.
     *
     * <p> When this flag is specified then the input string that specifies
     * the pattern is treated as a sequence of literal characters.
     * Metacharacters or escape sequences in the input sequence will be
     * given no special meaning.
     *
     * <p>The flags CASE_INSENSITIVE and UNICODE_CASE retain their impact on
     * matching when used in conjunction with this flag. The other flags
     * become superfluous.
     *
     * <p> There is no embedded flag character for enabling literal parsing.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int MULTILINE = 0x08;

    /**
     * Enables multiline mode.
     *
     * <p> In multiline mode the expressions <tt>^</tt> and <tt>$</tt> match
     * just after or just before, respectively, a line terminator or the end of
     * the input sequence.  By default these expressions only match at the
     * beginning and the end of the entire input sequence.
     *
     * <p> Multiline mode can also be enabled via the embedded flag
     * expression&nbsp;<tt>(?m)</tt>.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int COMMENTS = 0x04;

    /**
     * Permits whitespace and comments in pattern.
     *
     * <p> In this mode, whitespace is ignored, and embedded comments starting
     * with <tt>#</tt> are ignored until the end of a line.
     *
     * <p> Comments mode can also be enabled via the embedded flag
     * expression&nbsp;<tt>(?x)</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    public static final int CASE_INSENSITIVE = 0x02;

    /**
     * Enables case-insensitive matching.
     *
     * <p> By default, case-insensitive matching assumes that only characters
     * in the US-ASCII charset are being matched.  Unicode-aware
     * case-insensitive matching can be enabled by specifying the {@link
     * #UNICODE_CASE} flag in conjunction with this flag.
     *
     * <p> Case-insensitive matching can also be enabled via the embedded flag
     * expression&nbsp;<tt>(?i)</tt>.
     *
     * <p> Specifying this flag may impose a slight performance penalty.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
    /**

    /**
     * Regular expression modifier values.  Instead of being passed as
     * arguments, they can also be passed as inline modifiers.
     * For example, the following statements have the same effect.
     * <pre>
     * RegExp r1 = RegExp.compile("abc", Pattern.I|Pattern.M);
     * RegExp r2 = RegExp.compile("(?im)abc", 0);
     * </pre>
     *
     * The flags are duplicated so that the familiar Perl match flag
     * names are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/regex/Pattern.java
public final class Pattern

/**
 * A compiled representation of a regular expression.
 *
 * <p> A regular expression, specified as a string, must first be compiled into
 * an instance of this class.  The resulting pattern can then be used to create
 * a {@link Matcher} object that can match arbitrary {@linkplain
 * java.lang.CharSequence character sequences} against the regular
 * expression.  All of the state involved in performing a match resides in the
 * matcher, so many matchers can share the same pattern.
 *
 * <p> A typical invocation sequence is thus
 *
 * <blockquote><pre>
 * Pattern p = Pattern.{@link #compile compile}("a*b");
 * Matcher m = p.{@link #matcher matcher}("aaaaab");
 * boolean b = m.{@link Matcher#matches matches}();</pre></blockquote>
 *
 * <p> A {@link #matches matches} method is defined by this class as a
 * convenience for when a regular expression is used just once.  This method
 * compiles an expression and matches an input sequence against it in a single
 * invocation.  The statement
 *
 * <blockquote><pre>
 * boolean b = Pattern.matches("a*b", "aaaaab");</pre></blockquote>
 *
 * is equivalent to the three statements above, though for repeated matches it
 * is less efficient since it does not allow the compiled pattern to be reused.
 *
 * <p> Instances of this class are immutable and are safe for use by multiple
 * concurrent threads.  Instances of the {@link Matcher} class are not safe for
 * such use.
 *
 *
 * <h3><a name="sum">Summary of regular-expression constructs</a></h3>
 *
 * <table border="0" cellpadding="1" cellspacing="0"
 *  summary="Regular expression constructs, and what they match">
 *
 * <tr align="left">
 * <th align="left" id="construct">Construct</th>
 * <th align="left" id="matches">Matches</th>
 * </tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="characters">Characters</th></tr>
 *
 * <tr><td valign="top" headers="construct characters"><i>x</i></td>
 *     <td headers="matches">The character <i>x</i></td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\\</tt></td>
 *     <td headers="matches">The backslash character</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\0</tt><i>n</i></td>
 *     <td headers="matches">The character with octal value <tt>0</tt><i>n</i>
 *         (0&nbsp;<tt>&lt;=</tt>&nbsp;<i>n</i>&nbsp;<tt>&lt;=</tt>&nbsp;7)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\0</tt><i>nn</i></td>
 *     <td headers="matches">The character with octal value <tt>0</tt><i>nn</i>
 *         (0&nbsp;<tt>&lt;=</tt>&nbsp;<i>n</i>&nbsp;<tt>&lt;=</tt>&nbsp;7)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\0</tt><i>mnn</i></td>
 *     <td headers="matches">The character with octal value <tt>0</tt><i>mnn</i>
 *         (0&nbsp;<tt>&lt;=</tt>&nbsp;<i>m</i>&nbsp;<tt>&lt;=</tt>&nbsp;3,
 *         0&nbsp;<tt>&lt;=</tt>&nbsp;<i>n</i>&nbsp;<tt>&lt;=</tt>&nbsp;7)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\x</tt><i>hh</i></td>
 *     <td headers="matches">The character with hexadecimal&nbsp;value&nbsp;<tt>0x</tt><i>hh</i></td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>&#92;u</tt><i>hhhh</i></td>
 *     <td headers="matches">The character with hexadecimal&nbsp;value&nbsp;<tt>0x</tt><i>hhhh</i></td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>&#92;x</tt><i>{h...h}</i></td>
 *     <td headers="matches">The character with hexadecimal&nbsp;value&nbsp;<tt>0x</tt><i>h...h</i>
 *         ({@link java.lang.Character#MIN_CODE_POINT Character.MIN_CODE_POINT}
 *         &nbsp;&lt;=&nbsp;<tt>0x</tt><i>h...h</i>&nbsp;&lt;=&nbsp;
 *          {@link java.lang.Character#MAX_CODE_POINT Character.MAX_CODE_POINT})</td></tr>
 * <tr><td valign="top" headers="matches"><tt>\t</tt></td>
 *     <td headers="matches">The tab character (<tt>'&#92;u0009'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\n</tt></td>
 *     <td headers="matches">The newline (line feed) character (<tt>'&#92;u000A'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\r</tt></td>
 *     <td headers="matches">The carriage-return character (<tt>'&#92;u000D'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\f</tt></td>
 *     <td headers="matches">The form-feed character (<tt>'&#92;u000C'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\a</tt></td>
 *     <td headers="matches">The alert (bell) character (<tt>'&#92;u0007'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\e</tt></td>
 *     <td headers="matches">The escape character (<tt>'&#92;u001B'</tt>)</td></tr>
 * <tr><td valign="top" headers="construct characters"><tt>\c</tt><i>x</i></td>
 *     <td headers="matches">The control character corresponding to <i>x</i></td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="classes">Character classes</th></tr>
 *
 * <tr><td valign="top" headers="construct classes">{@code [abc]}</td>
 *     <td headers="matches">{@code a}, {@code b}, or {@code c} (simple class)</td></tr>
 * <tr><td valign="top" headers="construct classes">{@code [^abc]}</td>
 *     <td headers="matches">Any character except {@code a}, {@code b}, or {@code c} (negation)</td></tr>
 * <tr><td valign="top" headers="construct classes">{@code [a-zA-Z]}</td>
 *     <td headers="matches">{@code a} through {@code z}
 *         or {@code A} through {@code Z}, inclusive (range)</td></tr>
 * <tr><td valign="top" headers="construct classes">{@code [a-d[m-p]]}</td>
 *     <td headers="matches">{@code a} through {@code d},
 *      or {@code m} through {@code p}: {@code [a-dm-p]} (union)</td></tr>
 * <tr><td valign="top" headers="construct classes">{@code [a-z&&[def]]}</td>
 *     <td headers="matches">{@code d}, {@code e}, or {@code f} (intersection)</tr>
 * <tr><td valign="top" headers="construct classes">{@code [a-z&&[^bc]]}</td>
 *     <td headers="matches">{@code a} through {@code z},
 *         except for {@code b} and {@code c}: {@code [ad-z]} (subtraction)</td></tr>
 * <tr><td valign="top" headers="construct classes">{@code [a-z&&[^m-p]]}</td>
 *     <td headers="matches">{@code a} through {@code z},
 *          and not {@code m} through {@code p}: {@code [a-lq-z]}(subtraction)</td></tr>
 * <tr><th>&nbsp;</th></tr>
 *
 * <tr align="left"><th colspan="2" id="predef">Predefined character classes</th></tr>
 *
 * <tr><td valign="top" headers="construct predef"><tt>.</tt></td>
 *     <td headers="matches">Any character (may or may not match <a href="#lt">line terminators</a>)</td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\d</tt></td>
 *     <td headers="matches">A digit: <tt>[0-9]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\D</tt></td>
 *     <td headers="matches">A non-digit: <tt>[^0-9]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\h</tt></td>
 *     <td headers="matches">A horizontal whitespace character:
 *     <tt>[ \t\xA0&#92;u1680&#92;u180e&#92;u2000-&#92;u200a&#92;u202f&#92;u205f&#92;u3000]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\H</tt></td>
 *     <td headers="matches">A non-horizontal whitespace character: <tt>[^\h]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\s</tt></td>
 *     <td headers="matches">A whitespace character: <tt>[ \t\n\x0B\f\r]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\S</tt></td>
 *     <td headers="matches">A non-whitespace character: <tt>[^\s]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\v</tt></td>
 *     <td headers="matches">A vertical whitespace character: <tt>[\n\x0B\f\r\x85&#92;u2028&#92;u2029]</tt>
 *     </td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\V</tt></td>
 *     <td headers="matches">A non-vertical whitespace character: <tt>[^\v]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\w</tt></td>
 *     <td headers="matches">A word character: <tt>[a-zA-Z_0-9]</tt></td></tr>
 * <tr><td valign="top" headers="construct predef"><tt>\W</tt></td>
 *     <td headers="matches">A non-word character: <tt>[^\w]</tt></td></tr>
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="posix"><b>POSIX character classes (US-ASCII only)</b></th></tr>
 *
 * <tr><td valign="top" headers="construct posix">{@code \p{Lower}}</td>
 *     <td headers="matches">A lower-case alphabetic character: {@code [a-z]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Upper}}</td>
 *     <td headers="matches">An upper-case alphabetic character:{@code [A-Z]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{ASCII}}</td>
 *     <td headers="matches">All ASCII:{@code [\x00-\x7F]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Alpha}}</td>
 *     <td headers="matches">An alphabetic character:{@code [\p{Lower}\p{Upper}]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Digit}}</td>
 *     <td headers="matches">A decimal digit: {@code [0-9]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Alnum}}</td>
 *     <td headers="matches">An alphanumeric character:{@code [\p{Alpha}\p{Digit}]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Punct}}</td>
 *     <td headers="matches">Punctuation: One of {@code !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~}</td></tr>
 *     <!-- {@code [\!"#\$%&'\(\)\*\+,\-\./:;\<=\>\?@\[\\\]\^_`\{\|\}~]}
 *          {@code [\X21-\X2F\X31-\X40\X5B-\X60\X7B-\X7E]} -->
 * <tr><td valign="top" headers="construct posix">{@code \p{Graph}}</td>
 *     <td headers="matches">A visible character: {@code [\p{Alnum}\p{Punct}]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Print}}</td>
 *     <td headers="matches">A printable character: {@code [\p{Graph}\x20]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Blank}}</td>
 *     <td headers="matches">A space or a tab: {@code [ \t]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Cntrl}}</td>
 *     <td headers="matches">A control character: {@code [\x00-\x1F\x7F]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{XDigit}}</td>
 *     <td headers="matches">A hexadecimal digit: {@code [0-9a-fA-F]}</td></tr>
 * <tr><td valign="top" headers="construct posix">{@code \p{Space}}</td>
 *     <td headers="matches">A whitespace character: {@code [ \t\n\x0B\f\r]}</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2">java.lang.Character classes (simple <a href="#jcc">java character type</a>)</th></tr>
 *
 * <tr><td valign="top"><tt>\p{javaLowerCase}</tt></td>
 *     <td>Equivalent to java.lang.Character.isLowerCase()</td></tr>
 * <tr><td valign="top"><tt>\p{javaUpperCase}</tt></td>
 *     <td>Equivalent to java.lang.Character.isUpperCase()</td></tr>
 * <tr><td valign="top"><tt>\p{javaWhitespace}</tt></td>
 *     <td>Equivalent to java.lang.Character.isWhitespace()</td></tr>
 * <tr><td valign="top"><tt>\p{javaMirrored}</tt></td>
 *     <td>Equivalent to java.lang.Character.isMirrored()</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="unicode">Classes for Unicode scripts, blocks, categories and binary properties</th></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \p{IsLatin}}</td>
 *     <td headers="matches">A Latin&nbsp;script character (<a href="#usc">script</a>)</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \p{InGreek}}</td>
 *     <td headers="matches">A character in the Greek&nbsp;block (<a href="#ubc">block</a>)</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \p{Lu}}</td>
 *     <td headers="matches">An uppercase letter (<a href="#ucc">category</a>)</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \p{IsAlphabetic}}</td>
 *     <td headers="matches">An alphabetic character (<a href="#ubpc">binary property</a>)</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \p{Sc}}</td>
 *     <td headers="matches">A currency symbol</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code \P{InGreek}}</td>
 *     <td headers="matches">Any character except one in the Greek block (negation)</td></tr>
 * <tr><td valign="top" headers="construct unicode">{@code [\p{L}&&[^\p{Lu}]]}</td>
 *     <td headers="matches">Any letter except an uppercase letter (subtraction)</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="bounds">Boundary matchers</th></tr>
 *
 * <tr><td valign="top" headers="construct bounds"><tt>^</tt></td>
 *     <td headers="matches">The beginning of a line</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>$</tt></td>
 *     <td headers="matches">The end of a line</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\b</tt></td>
 *     <td headers="matches">A word boundary</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\B</tt></td>
 *     <td headers="matches">A non-word boundary</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\A</tt></td>
 *     <td headers="matches">The beginning of the input</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\G</tt></td>
 *     <td headers="matches">The end of the previous match</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\Z</tt></td>
 *     <td headers="matches">The end of the input but for the final
 *         <a href="#lt">terminator</a>, if&nbsp;any</td></tr>
 * <tr><td valign="top" headers="construct bounds"><tt>\z</tt></td>
 *     <td headers="matches">The end of the input</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="lineending">Linebreak matcher</th></tr>
 * <tr><td valign="top" headers="construct lineending"><tt>\R</tt></td>
 *     <td headers="matches">Any Unicode linebreak sequence, is equivalent to
 *     <tt>&#92;u000D&#92;u000A|[&#92;u000A&#92;u000B&#92;u000C&#92;u000D&#92;u0085&#92;u2028&#92;u2029]
 *     </tt></td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="greedy">Greedy quantifiers</th></tr>
 *
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>?</tt></td>
 *     <td headers="matches"><i>X</i>, once or not at all</td></tr>
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>*</tt></td>
 *     <td headers="matches"><i>X</i>, zero or more times</td></tr>
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>+</tt></td>
 *     <td headers="matches"><i>X</i>, one or more times</td></tr>
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>{</tt><i>n</i><tt>}</tt></td>
 *     <td headers="matches"><i>X</i>, exactly <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>{</tt><i>n</i><tt>,}</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct greedy"><i>X</i><tt>{</tt><i>n</i><tt>,</tt><i>m</i><tt>}</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> but not more than <i>m</i> times</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="reluc">Reluctant quantifiers</th></tr>
 *
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>??</tt></td>
 *     <td headers="matches"><i>X</i>, once or not at all</td></tr>
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>*?</tt></td>
 *     <td headers="matches"><i>X</i>, zero or more times</td></tr>
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>+?</tt></td>
 *     <td headers="matches"><i>X</i>, one or more times</td></tr>
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>{</tt><i>n</i><tt>}?</tt></td>
 *     <td headers="matches"><i>X</i>, exactly <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>{</tt><i>n</i><tt>,}?</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct reluc"><i>X</i><tt>{</tt><i>n</i><tt>,</tt><i>m</i><tt>}?</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> but not more than <i>m</i> times</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="poss">Possessive quantifiers</th></tr>
 *
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>?+</tt></td>
 *     <td headers="matches"><i>X</i>, once or not at all</td></tr>
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>*+</tt></td>
 *     <td headers="matches"><i>X</i>, zero or more times</td></tr>
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>++</tt></td>
 *     <td headers="matches"><i>X</i>, one or more times</td></tr>
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>{</tt><i>n</i><tt>}+</tt></td>
 *     <td headers="matches"><i>X</i>, exactly <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>{</tt><i>n</i><tt>,}+</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> times</td></tr>
 * <tr><td valign="top" headers="construct poss"><i>X</i><tt>{</tt><i>n</i><tt>,</tt><i>m</i><tt>}+</tt></td>
 *     <td headers="matches"><i>X</i>, at least <i>n</i> but not more than <i>m</i> times</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="logical">Logical operators</th></tr>
 *
 * <tr><td valign="top" headers="construct logical"><i>XY</i></td>
 *     <td headers="matches"><i>X</i> followed by <i>Y</i></td></tr>
 * <tr><td valign="top" headers="construct logical"><i>X</i><tt>|</tt><i>Y</i></td>
 *     <td headers="matches">Either <i>X</i> or <i>Y</i></td></tr>
 * <tr><td valign="top" headers="construct logical"><tt>(</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches">X, as a <a href="#cg">capturing group</a></td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="backref">Back references</th></tr>
 *
 * <tr><td valign="bottom" headers="construct backref"><tt>\</tt><i>n</i></td>
 *     <td valign="bottom" headers="matches">Whatever the <i>n</i><sup>th</sup>
 *     <a href="#cg">capturing group</a> matched</td></tr>
 *
 * <tr><td valign="bottom" headers="construct backref"><tt>\</tt><i>k</i>&lt;<i>name</i>&gt;</td>
 *     <td valign="bottom" headers="matches">Whatever the
 *     <a href="#groupname">named-capturing group</a> "name" matched</td></tr>
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="quot">Quotation</th></tr>
 *
 * <tr><td valign="top" headers="construct quot"><tt>\</tt></td>
 *     <td headers="matches">Nothing, but quotes the following character</td></tr>
 * <tr><td valign="top" headers="construct quot"><tt>\Q</tt></td>
 *     <td headers="matches">Nothing, but quotes all characters until <tt>\E</tt></td></tr>
 * <tr><td valign="top" headers="construct quot"><tt>\E</tt></td>
 *     <td headers="matches">Nothing, but ends quoting started by <tt>\Q</tt></td></tr>
 *     <!-- Metachars: !$()*+.<>?[\]^{|} -->
 *
 * <tr><th>&nbsp;</th></tr>
 * <tr align="left"><th colspan="2" id="special">Special constructs (named-capturing and non-capturing)</th></tr>
 *
 * <tr><td valign="top" headers="construct special"><tt>(?&lt;<a href="#groupname">name</a>&gt;</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, as a named-capturing group</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?:</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, as a non-capturing group</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?idmsuxU-idmsuxU)&nbsp;</tt></td>
 *     <td headers="matches">Nothing, but turns match flags <a href="#CASE_INSENSITIVE">i</a>
 * <a href="#UNIX_LINES">d</a> <a href="#MULTILINE">m</a> <a href="#DOTALL">s</a>
 * <a href="#UNICODE_CASE">u</a> <a href="#COMMENTS">x</a> <a href="#UNICODE_CHARACTER_CLASS">U</a>
 * on - off</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?idmsux-idmsux:</tt><i>X</i><tt>)</tt>&nbsp;&nbsp;</td>
 *     <td headers="matches"><i>X</i>, as a <a href="#cg">non-capturing group</a> with the
 *         given flags <a href="#CASE_INSENSITIVE">i</a> <a href="#UNIX_LINES">d</a>
 * <a href="#MULTILINE">m</a> <a href="#DOTALL">s</a> <a href="#UNICODE_CASE">u</a >
 * <a href="#COMMENTS">x</a> on - off</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?=</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, via zero-width positive lookahead</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?!</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, via zero-width negative lookahead</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?&lt;=</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, via zero-width positive lookbehind</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?&lt;!</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, via zero-width negative lookbehind</td></tr>
 * <tr><td valign="top" headers="construct special"><tt>(?&gt;</tt><i>X</i><tt>)</tt></td>
 *     <td headers="matches"><i>X</i>, as an independent, non-capturing group</td></tr>
 *
 * </table>
 *
 * <hr>
 *
 *
 * <h3><a name="bs">Backslashes, escapes, and quoting</a></h3>
 *
 * <p> The backslash character (<tt>'\'</tt>) serves to introduce escaped
 * constructs, as defined in the table above, as well as to quote characters
 * that otherwise would be interpreted as unescaped constructs.  Thus the
 * expression <tt>\\</tt> matches a single backslash and <tt>\{</tt> matches a
 * left brace.
 *
 * <p> It is an error to use a backslash prior to any alphabetic character that
 * does not denote an escaped construct; these are reserved for future
 * extensions to the regular-expression language.  A backslash may be used
 * prior to a non-alphabetic character regardless of whether that character is
 * part of an unescaped construct.
 *
 * <p> Backslashes within string literals in Java source code are interpreted
 * as required by
 * <cite>The Java&trade; Language Specification</cite>
 * as either Unicode escapes (section 3.3) or other character escapes (section 3.10.6)
 * It is therefore necessary to double backslashes in string
 * literals that represent regular expressions to protect them from
 * interpretation by the Java bytecode compiler.  The string literal
 * <tt>"&#92;b"</tt>, for example, matches a single backspace character when
 * interpreted as a regular expression, while <tt>"&#92;&#92;b"</tt> matches a
 * word boundary.  The string literal <tt>"&#92;(hello&#92;)"</tt> is illegal
 * and leads to a compile-time error; in order to match the string
 * <tt>(hello)</tt> the string literal <tt>"&#92;&#92;(hello&#92;&#92;)"</tt>
 * must be used.
 *
 * <h3><a name="cc">Character Classes</a></h3>
 *
 *    <p> Character classes may appear within other character classes, and
 *    may be composed by the union operator (implicit) and the intersection
 *    operator (<tt>&amp;&amp;</tt>).
 *    The union operator denotes a class that contains every character that is
 *    in at least one of its operand classes.  The intersection operator
 *    denotes a class that contains every character that is in both of its
 *    operand classes.
 *
 *    <p> The precedence of character-class operators is as follows, from
 *    highest to lowest:
 *
 *    <blockquote><table border="0" cellpadding="1" cellspacing="0"
 *                 summary="Precedence of character class operators.">
 *      <tr><th>1&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *        <td>Literal escape&nbsp;&nbsp;&nbsp;&nbsp;</td>
 *        <td><tt>\x</tt></td></tr>
 *     <tr><th>2&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *        <td>Grouping</td>
 *        <td><tt>[...]</tt></td></tr>
 *     <tr><th>3&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *        <td>Range</td>
 *        <td><tt>a-z</tt></td></tr>
 *      <tr><th>4&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *        <td>Union</td>
 *        <td><tt>[a-e][i-u]</tt></td></tr>
 *      <tr><th>5&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *        <td>Intersection</td>
 *        <td>{@code [a-z&&[aeiou]]}</td></tr>
 *    </table></blockquote>
 *
 *    <p> Note that a different set of metacharacters are in effect inside
 *    a character class than outside a character class. For instance, the
 *    regular expression <tt>.</tt> loses its special meaning inside a
 *    character class, while the expression <tt>-</tt> becomes a range
 *    forming metacharacter.
 *
 * <h3><a name="lt">Line terminators</a></h3>
 *
 * <p> A <i>line terminator</i> is a one- or two-character sequence that marks
 * the end of a line of the input character sequence.  The following are
 * recognized as line terminators:
 *
 * <ul>
 *
 *   <li> A newline (line feed) character&nbsp;(<tt>'\n'</tt>),
 *
 *   <li> A carriage-return character followed immediately by a newline
 *   character&nbsp;(<tt>"\r\n"</tt>),
 *
 *   <li> A standalone carriage-return character&nbsp;(<tt>'\r'</tt>),
 *
 *   <li> A next-line character&nbsp;(<tt>'&#92;u0085'</tt>),
 *
 *   <li> A line-separator character&nbsp;(<tt>'&#92;u2028'</tt>), or
 *
 *   <li> A paragraph-separator character&nbsp;(<tt>'&#92;u2029</tt>).
 *
 * </ul>
 * <p>If {@link #UNIX_LINES} mode is activated, then the only line terminators
 * recognized are newline characters.
 *
 * <p> The regular expression <tt>.</tt> matches any character except a line
 * terminator unless the {@link #DOTALL} flag is specified.
 *
 * <p> By default, the regular expressions <tt>^</tt> and <tt>$</tt> ignore
 * line terminators and only match at the beginning and the end, respectively,
 * of the entire input sequence. If {@link #MULTILINE} mode is activated then
 * <tt>^</tt> matches at the beginning of input and after any line terminator
 * except at the end of input. When in {@link #MULTILINE} mode <tt>$</tt>
 * matches just before a line terminator or the end of the input sequence.
 *
 * <h3><a name="cg">Groups and capturing</a></h3>
 *
 * <h4><a name="gnumber">Group number</a></h4>
 * <p> Capturing groups are numbered by counting their opening parentheses from
 * left to right.  In the expression <tt>((A)(B(C)))</tt>, for example, there
 * are four such groups: </p>
 *
 * <blockquote><table cellpadding=1 cellspacing=0 summary="Capturing group numberings">
 * <tr><th>1&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *     <td><tt>((A)(B(C)))</tt></td></tr>
 * <tr><th>2&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *     <td><tt>(A)</tt></td></tr>
 * <tr><th>3&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *     <td><tt>(B(C))</tt></td></tr>
 * <tr><th>4&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *     <td><tt>(C)</tt></td></tr>
 * </table></blockquote>
 *
 * <p> Group zero always stands for the entire expression.
 *
 * <p> Capturing groups are so named because, during a match, each subsequence
 * of the input sequence that matches such a group is saved.  The captured
 * subsequence may be used later in the expression, via a back reference, and
 * may also be retrieved from the matcher once the match operation is complete.
 *
 * <h4><a name="groupname">Group name</a></h4>
 * <p>A capturing group can also be assigned a "name", a <tt>named-capturing group</tt>,
 * and then be back-referenced later by the "name". Group names are composed of
 * the following characters. The first character must be a <tt>letter</tt>.
 *
 * <ul>
 *   <li> The uppercase letters <tt>'A'</tt> through <tt>'Z'</tt>
 *        (<tt>'&#92;u0041'</tt>&nbsp;through&nbsp;<tt>'&#92;u005a'</tt>),
 *   <li> The lowercase letters <tt>'a'</tt> through <tt>'z'</tt>
 *        (<tt>'&#92;u0061'</tt>&nbsp;through&nbsp;<tt>'&#92;u007a'</tt>),
 *   <li> The digits <tt>'0'</tt> through <tt>'9'</tt>
 *        (<tt>'&#92;u0030'</tt>&nbsp;through&nbsp;<tt>'&#92;u0039'</tt>),
 * </ul>
 *
 * <p> A <tt>named-capturing group</tt> is still numbered as described in
 * <a href="#gnumber">Group number</a>.
 *
 * <p> The captured input associated with a group is always the subsequence
 * that the group most recently matched.  If a group is evaluated a second time
 * because of quantification then its previously-captured value, if any, will
 * be retained if the second evaluation fails.  Matching the string
 * <tt>"aba"</tt> against the expression <tt>(a(b)?)+</tt>, for example, leaves
 * group two set to <tt>"b"</tt>.  All captured input is discarded at the
 * beginning of each match.
 *
 * <p> Groups beginning with <tt>(?</tt> are either pure, <i>non-capturing</i> groups
 * that do not capture text and do not count towards the group total, or
 * <i>named-capturing</i> group.
 *
 * <h3> Unicode support </h3>
 *
 * <p> This class is in conformance with Level 1 of <a
 * href="http://www.unicode.org/reports/tr18/"><i>Unicode Technical
 * Standard #18: Unicode Regular Expression</i></a>, plus RL2.1
 * Canonical Equivalents.
 * <p>
 * <b>Unicode escape sequences</b> such as <tt>&#92;u2014</tt> in Java source code
 * are processed as described in section 3.3 of
 * <cite>The Java&trade; Language Specification</cite>.
 * Such escape sequences are also implemented directly by the regular-expression
 * parser so that Unicode escapes can be used in expressions that are read from
 * files or from the keyboard.  Thus the strings <tt>"&#92;u2014"</tt> and
 * <tt>"\\u2014"</tt>, while not equal, compile into the same pattern, which
 * matches the character with hexadecimal value <tt>0x2014</tt>.
 * <p>
 * A Unicode character can also be represented in a regular-expression by
 * using its <b>Hex notation</b>(hexadecimal code point value) directly as described in construct
 * <tt>&#92;x{...}</tt>, for example a supplementary character U+2011F
 * can be specified as <tt>&#92;x{2011F}</tt>, instead of two consecutive
 * Unicode escape sequences of the surrogate pair
 * <tt>&#92;uD840</tt><tt>&#92;uDD1F</tt>.
 * <p>
 * Unicode scripts, blocks, categories and binary properties are written with
 * the <tt>\p</tt> and <tt>\P</tt> constructs as in Perl.
 * <tt>\p{</tt><i>prop</i><tt>}</tt> matches if
 * the input has the property <i>prop</i>, while <tt>\P{</tt><i>prop</i><tt>}</tt>
 * does not match if the input has that property.
 * <p>
 * Scripts, blocks, categories and binary properties can be used both inside
 * and outside of a character class.
 *
 * <p>
 * <b><a name="usc">Scripts</a></b> are specified either with the prefix {@code Is}, as in
 * {@code IsHiragana}, or by using  the {@code script} keyword (or its short
 * form {@code sc})as in {@code script=Hiragana} or {@code sc=Hiragana}.
 * <p>
 * The script names supported by <code>Pattern</code> are the valid script names
 * accepted and defined by
 * {@link java.lang.Character.UnicodeScript#forName(String) UnicodeScript.forName}.
 *
 * <p>
 * <b><a name="ubc">Blocks</a></b> are specified with the prefix {@code In}, as in
 * {@code InMongolian}, or by using the keyword {@code block} (or its short
 * form {@code blk}) as in {@code block=Mongolian} or {@code blk=Mongolian}.
 * <p>
 * The block names supported by <code>Pattern</code> are the valid block names
 * accepted and defined by
 * {@link java.lang.Character.UnicodeBlock#forName(String) UnicodeBlock.forName}.
 * <p>
 *
 * <b><a name="ucc">Categories</a></b> may be specified with the optional prefix {@code Is}:
 * Both {@code \p{L}} and {@code \p{IsL}} denote the category of Unicode
 * letters. Same as scripts and blocks, categories can also be specified
 * by using the keyword {@code general_category} (or its short form
 * {@code gc}) as in {@code general_category=Lu} or {@code gc=Lu}.
 * <p>
 * The supported categories are those of
 * <a href="http://www.unicode.org/unicode/standard/standard.html">
 * <i>The Unicode Standard</i></a> in the version specified by the
 * {@link java.lang.Character Character} class. The category names are those
 * defined in the Standard, both normative and informative.
 * <p>
 *
 * <b><a name="ubpc">Binary properties</a></b> are specified with the prefix {@code Is}, as in
 * {@code IsAlphabetic}. The supported binary properties by <code>Pattern</code>
 * are
 * <ul>
 *   <li> Alphabetic
 *   <li> Ideographic
 *   <li> Letter
 *   <li> Lowercase
 *   <li> Uppercase
 *   <li> Titlecase
 *   <li> Punctuation
 *   <Li> Control
 *   <li> White_Space
 *   <li> Digit
 *   <li> Hex_Digit
 *   <li> Join_Control
 *   <li> Noncharacter_Code_Point
 *   <li> Assigned
 * </ul>
 * <p>
 * The following <b>Predefined Character classes</b> and <b>POSIX character classes</b>
 * are in conformance with the recommendation of <i>Annex C: Compatibility Properties</i>
 * of <a href="http://www.unicode.org/reports/tr18/"><i>Unicode Regular Expression
 * </i></a>, when {@link #UNICODE_CHARACTER_CLASS} flag is specified.
 *
 * <table border="0" cellpadding="1" cellspacing="0"
 *  summary="predefined and posix character classes in Unicode mode">
 * <tr align="left">
 * <th align="left" id="predef_classes">Classes</th>
 * <th align="left" id="predef_matches">Matches</th>
 *</tr>
 * <tr><td><tt>\p{Lower}</tt></td>
 *     <td>A lowercase character:<tt>\p{IsLowercase}</tt></td></tr>
 * <tr><td><tt>\p{Upper}</tt></td>
 *     <td>An uppercase character:<tt>\p{IsUppercase}</tt></td></tr>
 * <tr><td><tt>\p{ASCII}</tt></td>
 *     <td>All ASCII:<tt>[\x00-\x7F]</tt></td></tr>
 * <tr><td><tt>\p{Alpha}</tt></td>
 *     <td>An alphabetic character:<tt>\p{IsAlphabetic}</tt></td></tr>
 * <tr><td><tt>\p{Digit}</tt></td>
 *     <td>A decimal digit character:<tt>p{IsDigit}</tt></td></tr>
 * <tr><td><tt>\p{Alnum}</tt></td>
 *     <td>An alphanumeric character:<tt>[\p{IsAlphabetic}\p{IsDigit}]</tt></td></tr>
 * <tr><td><tt>\p{Punct}</tt></td>
 *     <td>A punctuation character:<tt>p{IsPunctuation}</tt></td></tr>
 * <tr><td><tt>\p{Graph}</tt></td>
 *     <td>A visible character: <tt>[^\p{IsWhite_Space}\p{gc=Cc}\p{gc=Cs}\p{gc=Cn}]</tt></td></tr>
 * <tr><td><tt>\p{Print}</tt></td>
 *     <td>A printable character: {@code [\p{Graph}\p{Blank}&&[^\p{Cntrl}]]}</td></tr>
 * <tr><td><tt>\p{Blank}</tt></td>
 *     <td>A space or a tab: {@code [\p{IsWhite_Space}&&[^\p{gc=Zl}\p{gc=Zp}\x0a\x0b\x0c\x0d\x85]]}</td></tr>
 * <tr><td><tt>\p{Cntrl}</tt></td>
 *     <td>A control character: <tt>\p{gc=Cc}</tt></td></tr>
 * <tr><td><tt>\p{XDigit}</tt></td>
 *     <td>A hexadecimal digit: <tt>[\p{gc=Nd}\p{IsHex_Digit}]</tt></td></tr>
 * <tr><td><tt>\p{Space}</tt></td>
 *     <td>A whitespace character:<tt>\p{IsWhite_Space}</tt></td></tr>
 * <tr><td><tt>\d</tt></td>
 *     <td>A digit: <tt>\p{IsDigit}</tt></td></tr>
 * <tr><td><tt>\D</tt></td>
 *     <td>A non-digit: <tt>[^\d]</tt></td></tr>
 * <tr><td><tt>\s</tt></td>
 *     <td>A whitespace character: <tt>\p{IsWhite_Space}</tt></td></tr>
 * <tr><td><tt>\S</tt></td>
 *     <td>A non-whitespace character: <tt>[^\s]</tt></td></tr>
 * <tr><td><tt>\w</tt></td>
 *     <td>A word character: <tt>[\p{Alpha}\p{gc=Mn}\p{gc=Me}\p{gc=Mc}\p{Digit}\p{gc=Pc}\p{IsJoin_Control}]</tt></td></tr>
 * <tr><td><tt>\W</tt></td>
 *     <td>A non-word character: <tt>[^\w]</tt></td></tr>
 * </table>
 * <p>
 * <a name="jcc">
 * Categories that behave like the java.lang.Character
 * boolean is<i>methodname</i> methods (except for the deprecated ones) are
 * available through the same <tt>\p{</tt><i>prop</i><tt>}</tt> syntax where
 * the specified property has the name <tt>java<i>methodname</i></tt></a>.
 *
 * <h3> Comparison to Perl 5 </h3>
 *
 * <p>The <code>Pattern</code> engine performs traditional NFA-based matching
 * with ordered alternation as occurs in Perl 5.
 *
 * <p> Perl constructs not supported by this class: </p>
 *
 * <ul>
 *    <li><p> Predefined character classes (Unicode character)
 *    <p><tt>\X&nbsp;&nbsp;&nbsp;&nbsp;</tt>Match Unicode
 *    <a href="http://www.unicode.org/reports/tr18/#Default_Grapheme_Clusters">
 *    <i>extended grapheme cluster</i></a>
 *    </p></li>
 *
 *    <li><p> The backreference constructs, <tt>\g{</tt><i>n</i><tt>}</tt> for
 *    the <i>n</i><sup>th</sup><a href="#cg">capturing group</a> and
 *    <tt>\g{</tt><i>name</i><tt>}</tt> for
 *    <a href="#groupname">named-capturing group</a>.
 *    </p></li>
 *
 *    <li><p> The named character construct, <tt>\N{</tt><i>name</i><tt>}</tt>
 *    for a Unicode character by its name.
 *    </p></li>
 *
 *    <li><p> The conditional constructs
 *    <tt>(?(</tt><i>condition</i><tt>)</tt><i>X</i><tt>)</tt> and
 *    <tt>(?(</tt><i>condition</i><tt>)</tt><i>X</i><tt>|</tt><i>Y</i><tt>)</tt>,
 *    </p></li>
 *
 *    <li><p> The embedded code constructs <tt>(?{</tt><i>code</i><tt>})</tt>
 *    and <tt>(??{</tt><i>code</i><tt>})</tt>,</p></li>
 *
 *    <li><p> The embedded comment syntax <tt>(?#comment)</tt>, and </p></li>
 *
 *    <li><p> The preprocessing operations <tt>\l</tt> <tt>&#92;u</tt>,
 *    <tt>\L</tt>, and <tt>\U</tt>.  </p></li>
 *
 * </ul>
 *
 * <p> Constructs supported by this class but not by Perl: </p>
 *
 * <ul>
 *
 *    <li><p> Character-class union and intersection as described
 *    <a href="#cc">above</a>.</p></li>
 *
 * </ul>
 *
 * <p> Notable differences from Perl: </p>
 *
 * <ul>
 *
 *    <li><p> In Perl, <tt>\1</tt> through <tt>\9</tt> are always interpreted
 *    as back references; a backslash-escaped number greater than <tt>9</tt> is
 *    treated as a back reference if at least that many subexpressions exist,
 *    otherwise it is interpreted, if possible, as an octal escape.  In this
 *    class octal escapes must always begin with a zero. In this class,
 *    <tt>\1</tt> through <tt>\9</tt> are always interpreted as back
 *    references, and a larger number is accepted as a back reference if at
 *    least that many subexpressions exist at that point in the regular
 *    expression, otherwise the parser will drop digits until the number is
 *    smaller or equal to the existing number of groups or it is one digit.
 *    </p></li>
 *
 *    <li><p> Perl uses the <tt>g</tt> flag to request a match that resumes
 *    where the last match left off.  This functionality is provided implicitly
 *    by the {@link Matcher} class: Repeated invocations of the {@link
 *    Matcher#find find} method will resume where the last match left off,
 *    unless the matcher is reset.  </p></li>
 *
 *    <li><p> In Perl, embedded flags at the top level of an expression affect
 *    the whole expression.  In this class, embedded flags always take effect
 *    at the point at which they appear, whether they are at the top level or
 *    within a group; in the latter case, flags are restored at the end of the
 *    group just as in Perl.  </p></li>
 *
 * </ul>
 *
 *
 * <p> For a more precise description of the behavior of regular expression
 * constructs, please see <a href="http://www.oreilly.com/catalog/regex3/">
 * <i>Mastering Regular Expressions, 3nd Edition</i>, Jeffrey E. F. Friedl,
 * O'Reilly and Associates, 2006.</a>
 * </p>
 *
 * @see java.lang.String#split(String, int)
 * @see java.lang.String#split(String)
 *
 * @author      Mike McCloskey
 * @author      Mark Reinhold
 * @author      JSR-51 Expert Group
 * @since       1.4
 * @spec        JSR-51
 */
