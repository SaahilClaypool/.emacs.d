_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void pushChar(int tempChar) {

    /**
     * Supports one character look ahead, this will throw if called twice
     * in a row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int readChar() throws IOException {

    /**
     * Reads a character from the stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int readWS() throws IOException {

    /**
     * Skips any white space, returning the character after the white space.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean inBlock() {

    /**
     * @return true if currently in a block.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void endBlock(int endToken) {

    /**
     * Called when an end block is encountered )]}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void startBlock(int startToken) {

    /**
     * Called when a block start is encountered ({[.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void readComment() throws IOException {

    /**
     * Parses a comment block.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void readTill(char stopChar) throws IOException {

    /**
     * Reads till a <code>stopChar</code> is encountered, escaping characters
     * as necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    // NOTE: this could be combined with readTill, as they contain somewhat

    /**
     * Gets an identifier, returning true if the length of the string is greater than 0,
     * stopping when <code>stopChar</code>, whitespace, or one of {}()[] is
     * hit.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int nextToken(char idChar) throws IOException {

    /**
     * Fetches the next token.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void parseTillClosed(int openToken) throws IOException {

    /**
     * Parses till a matching block close is encountered. This is only
     * appropriate to be called at the top level (no nesting).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int parseIdentifiers(char extraChar,
                                 boolean wantsBlocks) throws IOException {

    /**
     * Parses identifiers until <code>extraChar</code> is encountered,
     * returning the ending token, which will be IDENTIFIER if extraChar
     * is found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    // identifier+: identifier* ;|}

    /**
     * Parses a single declaration, which is an identifier a : and another
     * identifier. This returns the last token seen.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void parseDeclarationBlock() throws IOException {

    /**
     * Parses a declaration block. Which a number of declarations followed
     * by a })].
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean parseSelectors() throws IOException {

    /**
     * Parses a set of selectors, returning false if the end of the stream
     * is reached.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void parseRuleSet() throws IOException {

    /**
     * Parses the next rule set, which is a selector followed by a
     * declaration block.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private void parseAtRule() throws IOException {

    /**
     * Parses an @ rule, stopping at a matching brace pair, or ;.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean getNextStatement() throws IOException {

    /**
     * Gets the next statement, returning false if the end is reached. A
     * statement is either an @rule, or a ruleset.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
        void handleImport(String importString);

        /** Called when an @import is encountered. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean        readWS;

    /** Set to true if any whitespace is read. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int            tokenBufferLength;

    /** Current number of chars in tokenBufferLength. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private char[]         tokenBuffer;

    /** nextToken() inserts the string here. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private CSSParserCallback callback;

    /** Notified of state. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean        encounteredRuleSet;

    /** Set to true when the first non @ rule is encountered. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private Reader         reader;

    /** Holds the incoming CSS rules. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int            stackCount;

    /** Number of valid blocks. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int[]          unitStack;

    /** Used to indicate blocks. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private StringBuffer   unitBuffer;

    /** Temporary place to hold identifiers. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private int            pushedChar;

    /** The read ahead character. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
    private boolean        didPushChar;

    /** Set to true if one character has been read ahead. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSParser.java
class CSSParser {

/**
 * A CSS parser. This works by way of a delegate that implements the
 * CSSParserCallback interface. The delegate is notified of the following
 * events:
 * <ul>
 *   <li>Import statement: <code>handleImport</code>
 *   <li>Selectors <code>handleSelector</code>. This is invoked for each
 *       string. For example if the Reader contained p, bar , a {}, the delegate
 *       would be notified 4 times, for 'p,' 'bar' ',' and 'a'.
 *   <li>When a rule starts, <code>startRule</code>
 *   <li>Properties in the rule via the <code>handleProperty</code>. This
 *       is invoked one per property/value key, eg font size: foo;, would
 *       cause the delegate to be notified once with a value of 'font size'.
 *   <li>Values in the rule via the <code>handleValue</code>, this is notified
 *       for the total value.
 *   <li>When a rule ends, <code>endRule</code>
 * </ul>
 * This will parse much more than CSS 1, and loosely implements the
 * recommendation for <i>Forward-compatible parsing</i> in section
 * 7.1 of the CSS spec found at:
 * <a href=http://www.w3.org/TR/REC-CSS1>http://www.w3.org/TR/REC-CSS1</a>.
 * If an error results in parsing, a RuntimeException will be thrown.
 * <p>
 * This will preserve case. If the callback wishes to treat certain poritions
 * case insensitively (such as selectors), it should use toLowerCase, or
 * something similar.
 *
 * @author Scott Violet
 */
