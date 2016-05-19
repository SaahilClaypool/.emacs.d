_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private String mapStyleName(String style) {

    /**
     * Returns the mapped style name corresponding to <code>style</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private String addStyleName(String style) {

    /**
     * Adds the style named <code>style</code> to the style mapping. This
     * returns the name that should be used when outputting. CSS does not
     * allow the full Unicode set to be used as a style name.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private void endSpanTag() throws IOException {

    /**
     * Writes out an end tag for the &lt;span&gt; tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private void startSpanTag(String style) throws IOException {

    /**
     * Writes out a start tag for the &lt;font&gt; tag.
     * Because font tags cannot be nested,
     * this method closes out
     * any enclosing font tag before writing out a
     * new start tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void startFontTag(String style) throws IOException {

    /**
     * This is no longer used, instead &lt;span&gt; will be written out.
     * <p>
     * Writes out a start tag for the &lt;font&gt; tag.
     * Because font tags cannot be nested,
     * this method closes out
     * any enclosing font tag before writing out a
     * new start tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void endFontTag() throws IOException {

    /**
     * This is no longer used, instead &lt;span&gt; will be written out.
     * <p>
     * Writes out an end tag for the &lt;font&gt; tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected boolean inFontTag() {

    /**
     * Returns true if we are currently in a &lt;font&gt; tag.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeNonHTMLAttributes(AttributeSet attr) throws IOException {

    /**
     * Writes out the remaining
     * character-level attributes (attributes other than bold,
     * italic, and underline) in an HTML-compliant way.  Given that
     * attributes such as font family and font size have no direct
     * mapping to HTML tags, a &lt;span&gt; tag is generated and its
     * style attribute is set to contain the list of remaining
     * attributes just like inline styles.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private void writeEndMask(int mask) throws IOException {

    /**
     * Writes out end tags for &lt;u&gt;, &lt;i&gt;, and &lt;b&gt; based on
     * the mask settings.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private void writeStartMask(int mask) throws IOException  {

    /**
     * Writes out start tags &lt;u&gt;, &lt;i&gt;, and &lt;b&gt; based on
     * the mask settings.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private void setFontMask(AttributeSet attr) {

    /**
     * Tweaks the appropriate bits of fontMask
     * to reflect whether the text is to be displayed in
     * bold, italic, and/or with an underline.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeHTMLTags(AttributeSet attr) throws IOException {

    /**
     * Generates
     * bold &lt;b&gt;, italic &lt;i&gt;, and &lt;u&gt; tags for the
     * text based on its attribute settings.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeContent(Element elem,  boolean needsIndenting)

    /**
     * Writes out the attribute set
     * in an HTML-compliant manner.
     *
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected boolean isText(Element elem) {

    /**
     * Returns true if the element is a text element.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeComponent(Element elem) throws IOException {

    /**
     * Responsible for handling Component Elements;
     * deliberately unimplemented.
     * How this method is implemented is a matter of policy.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeImage(Element elem) throws IOException {

    /**
     * Responsible for handling Icon Elements;
     * deliberately unimplemented.  How to implement this method is
     * an issue of policy.  For example, if you're generating
     * an &lt;img&gt; tag, how should you
     * represent the src attribute (the location of the image)?
     * In certain cases it could be a URL, in others it could
     * be read from a stream.
     *
     * @param elem element of type StyleConstants.IconElementName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeLeaf(Element elem) throws IOException {

    /**
     * Responsible for writing out other non-text leaf
     * elements.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeStartParagraph(Element elem) throws IOException {

    /**
     * Emits the start tag for a paragraph. If
     * the paragraph has a named style associated with it,
     * then this method also generates a class attribute for the
     * &lt;p&gt; tag and sets its value to be the name of the
     * style.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeEndParagraph() throws IOException {

    /**
     * Emits an end tag for a &lt;p&gt;
     * tag.  Before writing out the tag, this method ensures
     * that all other tags that have been opened are
     * appropriately closed off.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeBody() throws IOException, BadLocationException {

    /**
     * Iterates over the elements in the document
     * and processes elements based on whether they are
     * branch elements or leaf elements.  This method specially handles
     * leaf elements that are text.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
            if (s.getAttributeCount() == 1 &&

            /** PENDING: Once the name attribute is removed
                from the list we check check for 0. **/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeStyles() throws IOException {

    /**
     * Writes out all the named styles as the
     * content of the &lt;style&gt; tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeHeader() throws IOException {

    /**
     * Writes out the &lt;head&gt; and &lt;style&gt;
     * tags, and then invokes writeStyles() to write
     * out all the named styles as the content of the
     * &lt;style&gt; tag.  The content is surrounded by
     * valid HTML comment markers to ensure that the
     * document is viewable in applications/browsers
     * that do not support the tag.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeEndTag(String endTag) throws IOException {

    /**
     * Writes out an end tag appropriately
     * indented.  Also decrements the indent level.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeStartTag(String tag) throws IOException {

    /**
     * Writes out a start tag appropriately
     * indented.  Also increments the indent level.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void text(Element elem) throws IOException, BadLocationException {

    /**
     * Writes out text.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    protected void writeAttributes(AttributeSet attr) throws IOException {

    /**
     * Writes out all the attributes for the
     * following types:
     *  StyleConstants.ParagraphConstants,
     *  StyleConstants.CharacterConstants,
     *  StyleConstants.FontConstants,
     *  StyleConstants.ColorConstants.
     * The attribute name and value are separated by a colon.
     * Each pair is separated by a semicolon.
     *
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    public void write() throws IOException, BadLocationException {

    /**
     * Generates HTML output
     * from a StyledDocument.
     *
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    public MinimalHTMLWriter(Writer w, StyledDocument doc, int pos, int len) {

    /**
     * Creates a new MinimalHTMLWriter.
     *
     * @param w  Writer
     * @param doc StyledDocument
     * @param pos The location in the document to fetch the
     *   content.
     * @param len The amount to write out.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    public MinimalHTMLWriter(Writer w, StyledDocument doc) {

    /**
     * Creates a new MinimalHTMLWriter.
     *
     * @param w  Writer
     * @param doc StyledDocument
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private Hashtable<String, String> styleNameMapping;

    /**
     * Maps from style name as held by the Document, to the archived
     * style name (style name written out). These may differ.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private AttributeSet fontAttributes;

    /**
     * Stores the attributes of the previous run.
     * Used to compare with the current run's
     * attributeset.  If identical, then a
     * &lt;span&gt; tag is not emitted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
    private static final int BOLD = 0x01;

    /**
     * These static finals are used to
     * tweak and query the fontMask about which
     * of these tags need to be generated or
     * terminated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/MinimalHTMLWriter.java
public class MinimalHTMLWriter extends AbstractWriter {

/**
 * MinimalHTMLWriter is a fallback writer used by the
 * HTMLEditorKit to write out HTML for a document that
 * is a not produced by the EditorKit.
 *
 * The format for the document is:
 * <pre>
 * &lt;html&gt;
 *   &lt;head&gt;
 *     &lt;style&gt;
 *        &lt;!-- list of named styles
 *         p.normal {
 *            font-family: SansSerif;
 *            margin-height: 0;
 *            font-size: 14
 *         }
 *        --&gt;
 *      &lt;/style&gt;
 *   &lt;/head&gt;
 *   &lt;body&gt;
 *    &lt;p style=normal&gt;
 *        <b>Bold, italic, and underline attributes
 *        of the run are emitted as HTML tags.
 *        The remaining attributes are emitted as
 *        part of the style attribute of a &lt;span&gt; tag.
 *        The syntax is similar to inline styles.</b>
 *    &lt;/p&gt;
 *   &lt;/body&gt;
 * &lt;/html&gt;
 * </pre>
 *
 * @author Sunita Mani
 */
