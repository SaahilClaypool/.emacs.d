_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    public synchronized void parse(Reader in) throws IOException {

    /**
     * Parse an HTML stream, given a DTD.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    String getEndOfLineString() {

    /**
     * Returns the end of line string. This will return the end of line
     * string that has been encountered the most, one of \r, \n or \r\n.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseContent() throws IOException {

    /**
     * Parse Content. [24] 320:1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
        /*

        /** In dealing with forms, we have decided to treat
            them as legal in any context.  Also, even though
            they do have a start and an end tag, we will
            not put this tag on the stack.  This is to deal
            several pages in the web oasis that choose to
            start and end forms in any possible location. **/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseTag() throws IOException {

    /**
     * Parse a start or end tag.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseInvalidTag() throws IOException {

    /**
     * Parse an invalid tag.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected boolean parseMarkupDeclarations(StringBuffer strBuff) throws IOException {

    /**
     * Parse markup declarations.
     * Currently only handles the Document Type Declaration markup.
     * Returns true if it is a markup declaration false otherwise.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    public String parseDTDMarkup() throws IOException {

    /**
     * Parses th Document Declaration Type markup declaration.
     * Currently ignores it.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseAttributeSpecificationList(Element elem) throws IOException {

    /**
     * Parse attribute specification List. [31] 327:17
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    String parseAttributeValue(boolean lower) throws IOException {

    /**
     * Parse attribute value. [33] 331:1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseLiteral(boolean replace) throws IOException {

    /**
     * Parse literal content. [46] 343:1 and [47] 344:1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
                if (!strict && (strpos != 0) && (str[strpos - 1] == '-')) {

                  /** Presuming that the start string of a comment "<!--" has
                      already been parsed, the '-' character is valid only as
                      part of a comment termination and further more it must
                      be present in even numbers. Hence if strict is true, we
                      presume the comment has been terminated and return.
                      However if strict is false, then there is no even number
                      requirement and this character can appear anywhere in the
                      comment.  The parser reads on until it sees the following
                      pattern: "-->" or "--!>".
                   **/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void parseComment() throws IOException {

    /**
     * Parse a comment. [92] 391:7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private char[] mapNumericReference(int c) {

    /**
     * Converts numeric character reference to char array.
     *
     * Normally the code in a reference should be always converted
     * to the Unicode character with the same code, but due to
     * wide usage of Cp1252 charset most browsers map numeric references
     * in the range 130-159 (which are control chars in Unicode set)
     * to displayable characters with other codes.
     *
     * @param c the code of numeric character reference.
     * @return a char array corresponding to the reference code.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private char[] parseEntityReference() throws IOException {

    /**
     * Parse an entity reference. [59] 350:17
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    boolean parseIdentifier(boolean lower) throws IOException {

    /**
     * Parse identifier. Uppercase characters are folded
     * to lowercase when lower is true. Returns falsed if
     * no identifier is found. [55] 346:17
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void skipSpace() throws IOException {

    /**
     * Skip space.
     * [5] 297:5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    String getString(int pos) {

    /**
     * Get the string that's been accumulated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void addString(int c) {

    /**
     * Add a char to the string buffer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void errorContext() throws ChangedCharSetException {

    /**
     * Error context. Something went wrong, make sure we are in
     * the document's body context
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void legalTagContext(TagElement tag) throws ChangedCharSetException {

    /**
     * Create a legal context for a tag.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    boolean legalElementContext(Element elem) throws ChangedCharSetException {

    /**
     * Create a legal content for an element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void markFirstTime(Element elem) {

    /**
     * Marks the first time a tag has been seen in a document
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void endTag(boolean omitted) {

    /**
     * Handle an end tag. The end tag is popped
     * from the tag stack.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void startTag(TagElement tag) throws ChangedCharSetException {

    /**
     * Handle a start tag. The new tag is pushed
     * onto the tag stack. The attribute list is
     * checked for required attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void error(String err, String arg1, String arg2,
        String arg3) {

    /**
     * Invoke the error handler.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    void handleText(TagElement tag) {

    /**
     * Output text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleError(int ln, String msg) {

    /**
     * An error has occurred.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleEndTag(TagElement tag) {

    /**
     * Called when an end tag is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleStartTag(TagElement tag) {

    /**
     * Called when a start tag is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleEmptyTag(TagElement tag) throws ChangedCharSetException {

    /**
     * Called when an empty tag is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleComment(char text[]) {

    /**
     * Called when an HTML comment is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleTitle(char text[]) {

    /**
     * Called when an HTML title tag is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected void handleText(char text[]) {

    /**
     * Called when PCDATA is encountered.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected TagElement makeTag(Element elem, boolean fictional) {

    /**
     * Makes a TagElement.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    int getBlockStartPosition() {

    /**
     * Returns the start position of the current block. Block is
     * overloaded here, it really means the current start position for
     * the current comment tag, text, block.... This is provided for
     * subclassers that wish to know the start of the current block when
     * called with one of the handleXXX methods.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected int getCurrentLine() {

    /**
     * @return the line number of the line currently being parsed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private static final char[] cp1252Map = {

    /**
     * array for mapping numeric references in range
     * 130-159 to displayable Unicode characters.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private int lastBlockStartPos;

    /** Start position of the last block. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private int currentBlockStartPos;

    /** The start position of the current block. Block is overloaded here,
     * it really means the current start position for the current comment,
     * tag, text. Use getBlockStartPosition to access this. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private int lfCount;

    /** Number of \n's encountered. A \r\n will not increment this. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private int crCount;

    /** Number of \r's encountered. A \r\n will not increment this. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private int crlfCount;

    /** Number of \r\n's encountered. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    protected boolean strict = false;

    /**
     * This flag determines whether or not the Parser will be strict
     * in enforcing SGML compatibility.  If false, it will be lenient
     * with certain common classes of erroneous HTML constructs.
     * Strict or not, in either case an error will be recorded.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
    private boolean ignoreSpace;

    /**
     * The html spec does not specify how spaces are coalesced very well.
     * If strict == false, ignoreSpace is used to try and mimic the behavior
     * of the popular browsers.
     * <p>
     * The problematic scenarios are:
     * '&lt;b>blah &lt;i> &lt;strike> foo' which can be treated as:
     * '&lt;b>blah &lt;i>&lt;strike>foo'
     * as well as:
     * '&lt;p>&lt;a href="xx"> &lt;em>Using&lt;/em>&lt;/a>&lt;/p>'
     * which appears to be treated as:
     * '&lt;p>&lt;a href="xx">&lt;em>Using&lt;/em>&lt;/a>&lt;/p>'
     * <p>
     * When a tag that breaks flow, or trailing whitespace is encountered
     * ignoreSpace is set to true. From then on, all whitespace will be
     * ignored.
     * ignoreSpace will be set back to false the first time a
     * non whitespace character is encountered. This appears to give
     * behavior closer to the popular browsers.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Parser.java
public

/**
 * A simple DTD-driven HTML parser. The parser reads an
 * HTML file from an InputStream and calls various methods
 * (which should be overridden in a subclass) when tags and
 * data are encountered.
 * <p>
 * Unfortunately there are many badly implemented HTML parsers
 * out there, and as a result there are many badly formatted
 * HTML files. This parser attempts to parse most HTML files.
 * This means that the implementation sometimes deviates from
 * the SGML specification in favor of HTML.
 * <p>
 * The parser treats \r and \r\n as \n. Newlines after starttags
 * and before end tags are ignored just as specified in the SGML/HTML
 * specification.
 * <p>
 * The html spec does not specify how spaces are to be coalesced very well.
 * Specifically, the following scenarios are not discussed (note that a
 * space should be used here, but I am using &amp;nbsp to force the space to
 * be displayed):
 * <p>
 * '&lt;b&gt;blah&nbsp;&lt;i&gt;&nbsp;&lt;strike&gt;&nbsp;foo' which can be treated as:
 * '&lt;b&gt;blah&nbsp;&lt;i&gt;&lt;strike&gt;foo'
 * <p>as well as:
 * '&lt;p&gt;&lt;a href="xx"&gt;&nbsp;&lt;em&gt;Using&lt;/em&gt;&lt;/a&gt;&lt;/p&gt;'
 * which appears to be treated as:
 * '&lt;p&gt;&lt;a href="xx"&gt;&lt;em&gt;Using&lt;/em&gt;&lt;/a&gt;&lt;/p&gt;'
 * <p>
 * If <code>strict</code> is false, when a tag that breaks flow,
 * (<code>TagElement.breaksFlows</code>) or trailing whitespace is
 * encountered, all whitespace will be ignored until a non whitespace
 * character is encountered. This appears to give behavior closer to
 * the popular browsers.
 *
 * @see DTD
 * @see TagElement
 * @see SimpleAttributeSet
 * @author Arthur van Hoff
 * @author Sunita Mani
 */
