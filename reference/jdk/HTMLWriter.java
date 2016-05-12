_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private void indentSmart() throws IOException {

    /**
     * Writes indent only once per line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private void output(String string) throws IOException {

    /**
     * This directly invokes super's <code>output</code> after converting
     * <code>string</code> to a char[].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void output(char[] chars, int start, int length)

    /**
     * This method is overriden to map any character entities, such as
     * &lt; to &amp;lt;. <code>super.output</code> will be invoked to
     * write the content.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void writeLineSeparator() throws IOException {

    /**
     * Writes the line separator. This is overriden to make sure we don't
     * replace the newline content in case it is outside normal ascii.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private static void convertToHTML40(AttributeSet from, MutableAttributeSet to) {

    /**
     * Copies the given AttributeSet to a new set, converting
     * any CSS attributes found to arguments of an HTML style
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private static void createFontAttribute(CSS.Attribute a, AttributeSet from,
                                    MutableAttributeSet to) {

    /**
     * Create/update an HTML &lt;font&gt; tag attribute.  The
     * value of the attribute should be a MutableAttributeSet so
     * that the attributes can be updated as they are discovered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private static void addAttribute(MutableAttributeSet to, Object key, Object value) {

    /**
     * Add an attribute only if it doesn't exist so that we don't
     * loose information replacing it with SimpleAttributeSet.EMPTY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private static void convertToHTML32(AttributeSet from, MutableAttributeSet to) {

    /**
     * Create an older style of HTML attributes.  This will
     * convert character level attributes that have a StyleConstants
     * mapping over to an HTML tag/attribute.  Other CSS attributes
     * will be placed in an HTML style attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private MutableAttributeSet oConvAttr = new SimpleAttributeSet();

    /**
     * Buffer for the purpose of attribute conversion. This can be
     * used if convAttr is being used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private MutableAttributeSet convAttr = new SimpleAttributeSet();

    /**
     * Buffer for the purpose of attribute conversion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean writeCSS = false;

    /**
     * If true, the writer will emit CSS attributes in preference
     * to HTML tags/attributes (i.e. It will emit an HTML 4.0
     * style).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    AttributeSet convertToHTML(AttributeSet from, MutableAttributeSet to) {

    /**
     * Convert the give set of attributes to be html for
     * the purpose of writing them out.  Any keys that
     * have been converted will not appear in the resultant
     * set.  Any keys not converted will appear in the
     * resultant set the same as the received set.<p>
     * This will put the converted values into <code>to</code>, unless
     * it is null in which case a temporary AttributeSet will be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    boolean writeStyle(String name, Style style, boolean outputStyle)

    /**
     * Outputs the named style. <code>outputStyle</code> indicates
     * whether or not a style has been output yet. This will return
     * true if a style is written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    void writeStyles(StyleSheet sheet) throws IOException {

    /**
     * Outputs the styles as a single element. Styles are not stored as
     * elements, but part of the document. For the time being styles are
     * written out as a comment, inside a style tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    void writeMaps(Enumeration maps) throws IOException {

    /**
     * Outputs the maps as elements. Maps are not stored as elements in
     * the document, and as such this is used to output them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean indentNext = false;

    /**
     * Determines whether a the indentation needs to be
     * incremented.  Basically, if next is a child of current, and
     * next is NOT a synthesized element, the indent level will be
     * incremented.  If there is a parent-child relationship and "next"
     * is a synthesized element, then its children must be indented.
     * This state is maintained by the indentNext boolean.
     *
     * @return boolean that's true if indent level
     *         needs incrementing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean isFormElementWithContent(AttributeSet attr) {

    /**
     * Determines if the element associated with the attributeset
     * is a TEXTAREA or SELECT.  If true, returns true else
     * false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void closeOutUnwantedEmbeddedTags(AttributeSet attr) throws IOException {

    /**
     * Searches the attribute set and for each tag
     * that is stored in the tag vector.  If the tag is not found,
     * then the tag is removed from the vector and a corresponding
     * end tag is written out.
     *
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean noMatchForTagInAttributes(AttributeSet attr, HTML.Tag t,
                                              Object tagValue) {

    /**
     * Searches the attribute set for a tag, both of which
     * are passed in as a parameter.  Returns true if no match is found
     * and false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void writeEmbeddedTags(AttributeSet attr) throws IOException {

    /**
     * Searches for embedded tags in the AttributeSet
     * and writes them out.  It also stores these tags in a vector
     * so that when appropriate the corresponding end tags can be
     * written out.
     *
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected boolean matchNameAttribute(AttributeSet attr, HTML.Tag tag) {

    /**
     * Returns true if the StyleConstants.NameAttribute is
     * equal to the tag that is passed in as a parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected boolean synthesizedElement(Element elem) {

    /**
     * Returns true if the element is a
     * synthesized element.  Currently we are only testing
     * for the p-implied tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    void writeAdditionalComments() throws IOException {

    /**
     * Writes out any additional comments (comments outside of the body)
     * stored under the property HTMLDocument.AdditionalComments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    void writeComment(String string) throws IOException {

    /**
     * Writes out comment string.
     *
     * @param string   the comment
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void comment(Element elem) throws BadLocationException, IOException {

    /**
     * Writes out comments.
     *
     * @param elem    an Element
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void endTag(Element elem) throws IOException {

    /**
     * Writes out an end tag for the element.
     *
     * @param elem    an Element
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void writeOption(Option option) throws IOException {

    /**
     * Writes out the content of the Option form element.
     * @param option  an Option
     * @exception IOException on any I/O error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void selectContent(AttributeSet attr) throws IOException {

    /**
     * Writes out the content of the SELECT form element.
     *
     * @param attr the AttributeSet associated with the form element
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void text(Element elem) throws BadLocationException, IOException {

    /**
     * Writes out text.  If a range is specified when the constructor
     * is invoked, then only the appropriate range of text is written
     * out.
     *
     * @param elem   an Element
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void textAreaContent(AttributeSet attr) throws BadLocationException, IOException {

    /**
     * Writes out text that is contained in a TEXTAREA form
     * element.
     *
     * @param attr  an AttributeSet
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void startTag(Element elem) throws IOException, BadLocationException {

    /**
     * Writes out a start tag for the element.
     * Ignores all synthesized elements.
     *
     * @param elem   an Element
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected boolean isBlockTag(AttributeSet attr) {

    /**
     * Determines if the HTML.Tag associated with the
     * element is a block tag.
     *
     * @param attr  an AttributeSet
     * @return  true if tag is block tag, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void emptyTag(Element elem) throws BadLocationException, IOException {

    /**
     * Writes out all empty elements (all tags that have no
     * corresponding end tag).
     *
     * @param elem   an Element
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    protected void writeAttributes(AttributeSet attr) throws IOException {

    /**
     * Writes out the attribute set.  Ignores all
     * attributes with a key of type HTML.Tag,
     * attributes with a key of type StyleConstants,
     * and attributes with a key of type
     * HTML.Attribute.ENDTAG.
     *
     * @param attr   an AttributeSet
     * @exception IOException on any I/O error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    public void write() throws IOException, BadLocationException {

    /**
     * Iterates over the
     * Element tree and controls the writing out of
     * all the tags and its attributes.
     *
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    public HTMLWriter(Writer w, HTMLDocument doc, int pos, int len) {

    /**
     * Creates a new HTMLWriter.
     *
     * @param w  a Writer
     * @param doc an HTMLDocument
     * @param pos the document location from which to fetch the content
     * @param len the amount to write out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    public HTMLWriter(Writer w, HTMLDocument doc) {

    /**
     * Creates a new HTMLWriter.
     *
     * @param w   a Writer
     * @param doc  an HTMLDocument
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private char[] tempChars;

    /**
     * Temporary buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean replaceEntities;

    /**
     * Set to true when entities (such as &lt;) should be replaced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private boolean wroteHead;

    /**
     * Set to true after the head has been output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private Segment segment;

    /**
     * Used when writing out content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private Vector<Object> tagValues = new Vector<Object>(10);

    /**
     * Values for the tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
    private int preEndOffset;

    /** When inPre is true, this will indicate the end offset of the pre
     * element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTMLWriter.java
public class HTMLWriter extends AbstractWriter {

/**
 * This is a writer for HTMLDocuments.
 *
 * @author  Sunita Mani
 */
