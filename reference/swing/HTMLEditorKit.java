_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /** The operation to perform when this action is triggered. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public ActivateLinkAction(String actionName) {

        /**
         * Create this action with the appropriate identifier.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
            public Shape paintLayer(Graphics g, int offs0, int offs1,
                                    Shape bounds, JTextComponent c, View view) {

            /**
             * Paints a portion of a highlight.
             *
             * @param g the graphics context
             * @param offs0 the starting model offset &ge; 0
             * @param offs1 the ending model offset &ge; offs1
             * @param bounds the bounding box of the view, which is not
             *        necessarily the region to paint.
             * @param c the editor
             * @param view View painting for
             * @return region in which drawing occurred
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        static class FocusHighlightPainter extends

        /**
         * A highlight painter that draws a one-pixel border around
         * the highlighted area.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void caretUpdate(CaretEvent e) {

        /**
         * Called when the caret position is updated.
         *
         * @param e the caret event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void actionPerformed(ActionEvent ae) {

        /**
         * Inserts the HTML into the document.
         *
         * @param ae the event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    static class InsertHRAction extends InsertHTMLTextAction {

    /**
     * InsertHRAction is special, at actionPerformed time it will determine
     * the parent HTML.Tag based on the paragraph element at the selection
     * start.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        boolean adjustSelection;

        /** True indicates the selection should be adjusted after an insert. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTML.Tag alternateAddTag;

        /** Alternate tag in HTML to start adding tags from if parentTag
         * is not found and alternateParentTag is found. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTML.Tag alternateParentTag;

        /** Alternate Tag to check for in the document if parentTag is
         * not found. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTML.Tag addTag;

        /** Tag in HTML to start adding tags from. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTML.Tag parentTag;

        /** Tag to check for in the document. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected String html;

        /** HTML to insert. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void actionPerformed(ActionEvent ae) {

        /**
         * Inserts the HTML into the document.
         *
         * @param ae the event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        /* protected */

        /**
         * Called after an insertion to adjust the selection.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        /*protected*/

        /**
         * If there is an Element with name <code>tag</code> at
         * <code>offset</code>, this will invoke either insertAtBoundary
         * or <code>insertHTML</code>. This returns true if there is
         * a match, and one of the inserts is invoked.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        @Deprecated

        /**
         * This is invoked when inserting at a boundary. It determines
         * the number of pops, and then the number of pushes that need
         * to be performed, and then invokes insertHTML.
         * @deprecated As of Java 2 platform v1.3, use insertAtBoundary
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected void insertAtBoundary(JEditorPane editor, HTMLDocument doc,
                                        int offset, Element insertElement,
                                        String html, HTML.Tag parentTag,
                                        HTML.Tag addTag) {

        /**
         * This is invoked when inserting at a boundary. It determines
         * the number of pops, and then the number of pushes that need
         * to be performed, and then invokes insertHTML.
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected void insertHTML(JEditorPane editor, HTMLDocument doc,
                                  int offset, String html, int popDepth,
                                  int pushDepth, HTML.Tag addTag) {

        /**
         * A cover for HTMLEditorKit.insertHTML. If an exception it
         * thrown it is wrapped in a RuntimeException and thrown.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static class InsertHTMLTextAction extends HTMLTextAction {

    /**
     * InsertHTMLTextAction can be used to insert an arbitrary string of HTML
     * into an existing HTML document. At least two HTML.Tags need to be
     * supplied. The first Tag, parentTag, identifies the parent in
     * the document to add the elements to. The second tag, addTag,
     * identifies the first tag that should be added to the document as
     * seen in the HTML string. One important thing to remember, is that
     * the parser is going to generate all the appropriate tags, even if
     * they aren't in the HTML string passed in.<p>
     * For example, lets say you wanted to create an action to insert
     * a table into the body. The parentTag would be HTML.Tag.BODY,
     * addTag would be HTML.Tag.TABLE, and the string could be something
     * like &lt;table&gt;&lt;tr&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;.
     * <p>There is also an option to supply an alternate parentTag and
     * addTag. These will be checked for if there is no parentTag at
     * offset.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected Element findElementMatchingTag(HTMLDocument doc, int offset,
                                                 HTML.Tag tag) {

        /**
         * Returns the deepest element at <code>offset</code> matching
         * <code>tag</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected int elementCountToTag(HTMLDocument doc, int offset,
                                        HTML.Tag tag) {

        /**
         * Returns number of elements, starting at the deepest leaf, needed
         * to get to an element representing <code>tag</code>. This will
         * return -1 if no elements is found representing <code>tag</code>,
         * or 0 if the parent of the leaf at <code>offset</code> represents
         * <code>tag</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private Element[] getElementsAt(Element parent, int offset,
                                        int depth) {

        /**
         * Recursive method used by getElementsAt.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected Element[] getElementsAt(HTMLDocument doc, int offset) {

        /**
         * Returns an array of the Elements that contain <code>offset</code>.
         * The first elements corresponds to the root.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTMLEditorKit getHTMLEditorKit(JEditorPane e) {

        /**
         * @return HTMLEditorKit for <code>e</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected HTMLDocument getHTMLDocument(JEditorPane e) {

        /**
         * @return HTMLDocument of <code>e</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static abstract class HTMLTextAction extends StyledTextAction {

    /**
     * An abstract Action providing some convenience methods that may
     * be useful in inserting HTML into an existing document.
     * <p>NOTE: None of the convenience methods obtain a lock on the
     * document. If you have another thread modifying the text these
     * methods may have inconsistent behavior, or return the wrong thing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final String INSERT_PRE_HTML = "<pre></pre>";

    /** HTML used when inserting pre. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final String INSERT_HR_HTML = "<hr>";

    /** HTML used when inserting hr. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final String INSERT_OL_HTML = "<ol><li></li></ol>";

    /** HTML used when inserting ordered lists. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final String INSERT_UL_HTML = "<ul><li></li></ul>";

    /** HTML used when inserting unordered lists. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final String INSERT_TABLE_HTML = "<table border=1><tr><td></td></tr></table>";

    /** HTML used when inserting tables. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  IMG_BORDER = "html-image-border";

    /**
     * Align images at the border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  IMG_ALIGN_BOTTOM = "html-image-align-bottom";

    /**
     * Align images at the bottom.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  IMG_ALIGN_MIDDLE = "html-image-align-middle";

    /**
     * Align images in the middle.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  IMG_ALIGN_TOP = "html-image-align-top";

    /**
     * Align images at the top.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  LOGICAL_STYLE_ACTION = "html-logical-style-action";

/** The logical style choice action identifier
     The logical style is passed in as an argument
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  COLOR_ACTION = "html-color-action";

/** The Color choice action identifier
     The color is passed as an argument
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  FONT_CHANGE_SMALLER = "html-font-smaller";

/** The font size decrease to next value action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  FONT_CHANGE_BIGGER = "html-font-bigger";

/** The  font size increase to next value action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  PARA_INDENT_RIGHT = "html-para-indent-right";

/** The paragraph right indent action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  PARA_INDENT_LEFT = "html-para-indent-left";

/** The paragraph left indent action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  ITALIC_ACTION = "html-italic-action";

/** The italic action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String  BOLD_ACTION = "html-bold-action";

/** The bold action identifier
*/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public View create(Element elem) {

        /**
         * Creates a view from an element.
         *
         * @param elem the element
         * @return the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static class HTMLFactory implements ViewFactory {

    /**
     * A factory to build views for HTML.  The following
     * table describes what this factory will build by
     * default.
     *
     * <table summary="Describes the tag and view created by this factory by default">
     * <tr>
     * <th align=left>Tag<th align=left>View created
     * </tr><tr>
     * <td>HTML.Tag.CONTENT<td>InlineView
     * </tr><tr>
     * <td>HTML.Tag.IMPLIED<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.P<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H1<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H2<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H3<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H4<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H5<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.H6<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.DT<td>javax.swing.text.html.ParagraphView
     * </tr><tr>
     * <td>HTML.Tag.MENU<td>ListView
     * </tr><tr>
     * <td>HTML.Tag.DIR<td>ListView
     * </tr><tr>
     * <td>HTML.Tag.UL<td>ListView
     * </tr><tr>
     * <td>HTML.Tag.OL<td>ListView
     * </tr><tr>
     * <td>HTML.Tag.LI<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.DL<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.DD<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.BODY<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.HTML<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.CENTER<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.DIV<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.BLOCKQUOTE<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.PRE<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.BLOCKQUOTE<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.PRE<td>BlockView
     * </tr><tr>
     * <td>HTML.Tag.IMG<td>ImageView
     * </tr><tr>
     * <td>HTML.Tag.HR<td>HRuleView
     * </tr><tr>
     * <td>HTML.Tag.BR<td>BRView
     * </tr><tr>
     * <td>HTML.Tag.TABLE<td>javax.swing.text.html.TableView
     * </tr><tr>
     * <td>HTML.Tag.INPUT<td>FormView
     * </tr><tr>
     * <td>HTML.Tag.SELECT<td>FormView
     * </tr><tr>
     * <td>HTML.Tag.TEXTAREA<td>FormView
     * </tr><tr>
     * <td>HTML.Tag.OBJECT<td>ObjectView
     * </tr><tr>
     * <td>HTML.Tag.FRAMESET<td>FrameSetView
     * </tr><tr>
     * <td>HTML.Tag.FRAME<td>FrameView
     * </tr>
     * </table>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void handleEndOfLineString(String eol) {

        /**
         * This is invoked after the stream has been parsed, but before
         * <code>flush</code>. <code>eol</code> will be one of \n, \r
         * or \r\n, which ever is encountered the most in parsing the
         * stream.
         *
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public static final Object IMPLIED = "_implied_";

        /**
         * This is passed as an attribute in the attributeset to indicate
         * the element is implied eg, the string '&lt;&gt;foo&lt;\t&gt;'
         * contains an implied html element and an implied body element.
         *
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static class ParserCallback {

    /**
     * The result of parsing drives these callback methods.
     * The open and close actions should be balanced.  The
     * <code>flush</code> method will be the last method
     * called, to give the receiver a chance to flush any
     * pending data into the document.
     * <p>Refer to DocumentParser, the default parser used, for further
     * information on the contents of the AttributeSets, the positions, and
     * other info.
     *
     * @see javax.swing.text.html.parser.DocumentParser
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public abstract void parse(Reader r, ParserCallback cb, boolean ignoreCharSet) throws IOException;

        /**
         * Parse the given stream and drive the given callback
         * with the results of the parse.  This method should
         * be implemented to be thread-safe.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static abstract class Parser {

    /**
     * Interface to be supported by the parser.  This enables
     * providing a different parser while reusing some of the
     * implementation provided by this editor kit.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        HyperlinkEvent createHyperlinkEvent(JEditorPane html,
                                            HTMLDocument hdoc, String href,
                                            AttributeSet anchor,
                                            Element element,
                                            MouseEvent mouseEvent) {

        /**
         * Creates and returns a new instance of HyperlinkEvent. If
         * <code>hdoc</code> is a frame document a HTMLFrameHyperlinkEvent
         * will be created.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        void activateLink(int pos, JEditorPane html, MouseEvent mouseEvent) {

        /**
         * Calls linkActivated on the associated JEditorPane
         * if the given position represents a link. If this was the result
         * of a mouse click, <code>x</code> and
         * <code>y</code> will give the location of the mouse, otherwise
         * they will be {@literal <} 0.
         *
         * @param pos the position
         * @param html the editor pane
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        protected void activateLink(int pos, JEditorPane editor) {

        /**
         * Calls linkActivated on the associated JEditorPane
         * if the given position represents a link.<p>This is implemented
         * to forward to the method with the same name, but with the following
         * args both == -1.
         *
         * @param pos the position
         * @param editor the editor pane
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private boolean doesElementContainLocation(JEditorPane editor,
                                                   Element e, int offset,
                                                   int x, int y) {

        /**
         * Returns true if the View representing <code>e</code> contains
         * the location <code>x</code>, <code>y</code>. <code>offset</code>
         * gives the offset into the Document to check for.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private String getMapHREF(JEditorPane html, HTMLDocument hdoc,
                                  Element elem, AttributeSet attr, int offset,
                                  int x, int y) {

        /**
         * Returns a string anchor if the passed in element has a
         * USEMAP that contains the passed in location.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        public void mouseClicked(MouseEvent e) {

        /**
         * Called for a mouse click event.
         * If the component is read-only (ie a browser) then
         * the clicked event is used to drive an attempt to
         * follow the reference specified by a link.
         *
         * @param e the mouse event
         * @see MouseListener#mouseClicked
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private int curOffset;

        /**
         * Current offset.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private transient Position.Bias[] bias = new Position.Bias[1];

        /** This is used by viewToModel to avoid allocing a new array each
         * time. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
        private boolean curElemImage = false;

        /**
         * If true, the current element (curElem) represents an image.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static class LinkController extends MouseAdapter implements MouseMotionListener, Serializable {

    /**
     * Class to watch the associated component and fire
     * hyperlink events on it when appropriate.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private static final ViewFactory defaultFactory = new HTMLFactory();

    /** Shared factory for creating HTML Views. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public AccessibleContext getAccessibleContext() {

    /**
     * returns the AccessibleContext associated with this editor kit
     *
     * @return the AccessibleContext associated with this editor kit
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    protected Parser getParser() {

    /**
     * Fetch the parser to use for reading HTML streams.
     * This can be reimplemented to provide a different
     * parser.  The default implementation is loaded dynamically
     * to avoid the overhead of loading the default parser if
     * it's not used.  The default parser is the HotJava parser
     * using an HTML 3.2 DTD.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public Object clone() {

    /**
     * Creates a copy of the editor kit.
     *
     * @return the copy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void setAutoFormSubmission(boolean isAuto) {

    /**
     * Specifies if an html form submission is processed
     * automatically or only <code>FormSubmitEvent</code> is fired.
     * By default it is set to true.
     *
     * @see #isAutoFormSubmission()
     * @see FormSubmitEvent
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public boolean isAutoFormSubmission() {

    /**
     * Indicates whether an html form submission is processed automatically
     * or only <code>FormSubmitEvent</code> is fired.
     *
     * @return true  if html form submission is processed automatically,
     *         false otherwise.
     *
     * @see #setAutoFormSubmission
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public Cursor getLinkCursor() {

    /**
     * Returns the cursor to use over hyper links.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void setLinkCursor(Cursor cursor) {

    /**
     * Sets the cursor to use over links.
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public Cursor getDefaultCursor() {

    /**
     * Returns the default cursor.
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void setDefaultCursor(Cursor cursor) {

    /**
     * Sets the default cursor.
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public MutableAttributeSet getInputAttributes() {

    /**
     * Gets the input attributes used for the styled
     * editing actions.
     *
     * @return the attribute set
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    protected void createInputAttributes(Element element,
                                         MutableAttributeSet set) {

    /**
     * Copies the key/values in <code>element</code>s AttributeSet into
     * <code>set</code>. This does not copy component, icon, or element
     * names attributes. Subclasses may wish to refine what is and what
     * isn't copied here. But be sure to first remove all the attributes that
     * are in <code>set</code>.<p>
     * This is called anytime the caret moves over a different location.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public Action[] getActions() {

    /**
     * Fetches the command list for the editor.  This is
     * the list of commands supported by the superclass
     * augmented by the collection of commands defined
     * locally for style operations.
     *
     * @return the command list
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    static InputStream getResourceAsStream(final String name) {

    /**
     * Fetch a resource relative to the HTMLEditorKit classfile.
     * If this is called on 1.2 the loading will occur under the
     * protection of a doPrivileged call to allow the HTMLEditorKit
     * to function when used in an applet.
     *
     * @param name the name of the resource, relative to the
     *  HTMLEditorKit class
     * @return a stream representing the resource
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public StyleSheet getStyleSheet() {

    /**
     * Get the set of styles currently being used to render the
     * HTML elements.  By default the resource specified by
     * DEFAULT_CSS gets loaded, and is shared by all HTMLEditorKit
     * instances.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void setStyleSheet(StyleSheet s) {

    /**
     * Set the set of styles to be used to render the various
     * HTML elements.  These styles are specified in terms of
     * CSS specifications.  Each document produced by the kit
     * will have a copy of the sheet which it can add the
     * document specific styles to.  By default, the StyleSheet
     * specified is shared by all HTMLEditorKit instances.
     * This should be reimplemented to provide a finer granularity
     * if desired.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public static final String DEFAULT_CSS = "default.css";

    /**
     * Default Cascading Style Sheet file that sets
     * up the tag views.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void deinstall(JEditorPane c) {

    /**
     * Called when the kit is being removed from the
     * JEditorPane.  This is used to unregister any
     * listeners that were attached.
     *
     * @param c the JEditorPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void install(JEditorPane c) {

    /**
     * Called when the kit is being installed into the
     * a JEditorPane.
     *
     * @param c the JEditorPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void write(Writer out, Document doc, int pos, int len)

    /**
     * Write content from a document to the given stream
     * in a format appropriate for this kind of content handler.
     *
     * @param out  the stream to write to
     * @param doc  the source for the write
     * @param pos  the location in the document to fetch the
     *   content
     * @param len  the amount to write out
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void insertHTML(HTMLDocument doc, int offset, String html,
                           int popDepth, int pushDepth,
                           HTML.Tag insertTag) throws

    /**
     * Inserts HTML into an existing document.
     *
     * @param doc       the document to insert into
     * @param offset    the offset to insert HTML at
     * @param popDepth  the number of ElementSpec.EndTagTypes to generate before
     *        inserting
     * @param pushDepth the number of ElementSpec.StartTagTypes with a direction
     *        of ElementSpec.JoinNextDirection that should be generated
     *        before inserting, but after the end tags have been generated
     * @param insertTag the first tag to start inserting into document
     * @exception RuntimeException (will eventually be a BadLocationException)
     *            if pos is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public void read(Reader in, Document doc, int pos) throws IOException, BadLocationException {

    /**
     * Inserts content from the given stream. If <code>doc</code> is
     * an instance of HTMLDocument, this will read
     * HTML 3.2 text. Inserting HTML into a non-empty document must be inside
     * the body Element, if you do not insert into the body an exception will
     * be thrown. When inserting into a non-empty document all tags outside
     * of the body (head, title) will be dropped.
     *
     * @param in  the stream to read from
     * @param doc the destination for the insertion
     * @param pos the location in the document to place the
     *   content
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *   location within the document
     * @exception RuntimeException (will eventually be a BadLocationException)
     *            if pos is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    private Parser ensureParser(HTMLDocument doc) throws IOException {

    /**
     * Try to get an HTML parser from the document.  If no parser is set for
     * the document, return the editor kit's default parser.  It is an error
     * if no parser could be obtained from the editor kit.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public Document createDefaultDocument() {

    /**
     * Create an uninitialized text storage model
     * that is appropriate for this type of editor.
     *
     * @return the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public ViewFactory getViewFactory() {

    /**
     * Fetch a factory that is suitable for producing
     * views of any models that are produced by this
     * kit.
     *
     * @return the factory
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public String getContentType() {

    /**
     * Get the MIME type of the data that this
     * kit represents support for.  This kit supports
     * the type <code>text/html</code>.
     *
     * @return the type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
    public HTMLEditorKit() {

    /**
     * Constructs an HTMLEditorKit, creates a StyleContext,
     * and loads the style sheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/HTMLEditorKit.java
public class HTMLEditorKit extends StyledEditorKit implements Accessible {

/**
 * The Swing JEditorPane text component supports different kinds
 * of content via a plug-in mechanism called an EditorKit.  Because
 * HTML is a very popular format of content, some support is provided
 * by default.  The default support is provided by this class, which
 * supports HTML version 3.2 (with some extensions), and is migrating
 * toward version 4.0.
 * The &lt;applet&gt; tag is not supported, but some support is provided
 * for the &lt;object&gt; tag.
 * <p>
 * There are several goals of the HTML EditorKit provided, that have
 * an effect upon the way that HTML is modeled.  These
 * have influenced its design in a substantial way.
 * <dl>
 * <dt>
 * Support editing
 * <dd>
 * It might seem fairly obvious that a plug-in for JEditorPane
 * should provide editing support, but that fact has several
 * design considerations.  There are a substantial number of HTML
 * documents that don't properly conform to an HTML specification.
 * These must be normalized somewhat into a correct form if one
 * is to edit them.  Additionally, users don't like to be presented
 * with an excessive amount of structure editing, so using traditional
 * text editing gestures is preferred over using the HTML structure
 * exactly as defined in the HTML document.
 * <p>
 * The modeling of HTML is provided by the class <code>HTMLDocument</code>.
 * Its documentation describes the details of how the HTML is modeled.
 * The editing support leverages heavily off of the text package.
 *
 * <dt>
 * Extendable/Scalable
 * <dd>
 * To maximize the usefulness of this kit, a great deal of effort
 * has gone into making it extendable.  These are some of the
 * features.
 * <ol>
 *   <li>
 *   The parser is replaceable.  The default parser is the Hot Java
 *   parser which is DTD based.  A different DTD can be used, or an
 *   entirely different parser can be used.  To change the parser,
 *   reimplement the getParser method.  The default parser is
 *   dynamically loaded when first asked for, so the class files
 *   will never be loaded if an alternative parser is used.  The
 *   default parser is in a separate package called parser below
 *   this package.
 *   <li>
 *   The parser drives the ParserCallback, which is provided by
 *   HTMLDocument.  To change the callback, subclass HTMLDocument
 *   and reimplement the createDefaultDocument method to return
 *   document that produces a different reader.  The reader controls
 *   how the document is structured.  Although the Document provides
 *   HTML support by default, there is nothing preventing support of
 *   non-HTML tags that result in alternative element structures.
 *   <li>
 *   The default view of the models are provided as a hierarchy of
 *   View implementations, so one can easily customize how a particular
 *   element is displayed or add capabilities for new kinds of elements
 *   by providing new View implementations.  The default set of views
 *   are provided by the <code>HTMLFactory</code> class.  This can
 *   be easily changed by subclassing or replacing the HTMLFactory
 *   and reimplementing the getViewFactory method to return the alternative
 *   factory.
 *   <li>
 *   The View implementations work primarily off of CSS attributes,
 *   which are kept in the views.  This makes it possible to have
 *   multiple views mapped over the same model that appear substantially
 *   different.  This can be especially useful for printing.  For
 *   most HTML attributes, the HTML attributes are converted to CSS
 *   attributes for display.  This helps make the View implementations
 *   more general purpose
 * </ol>
 *
 * <dt>
 * Asynchronous Loading
 * <dd>
 * Larger documents involve a lot of parsing and take some time
 * to load.  By default, this kit produces documents that will be
 * loaded asynchronously if loaded using <code>JEditorPane.setPage</code>.
 * This is controlled by a property on the document.  The method
 * {@link #createDefaultDocument createDefaultDocument} can
 * be overriden to change this.  The batching of work is done
 * by the <code>HTMLDocument.HTMLReader</code> class.  The actual
 * work is done by the <code>DefaultStyledDocument</code> and
 * <code>AbstractDocument</code> classes in the text package.
 *
 * <dt>
 * Customization from current LAF
 * <dd>
 * HTML provides a well known set of features without exactly
 * specifying the display characteristics.  Swing has a theme
 * mechanism for its look-and-feel implementations.  It is desirable
 * for the look-and-feel to feed display characteristics into the
 * HTML views.  An user with poor vision for example would want
 * high contrast and larger than typical fonts.
 * <p>
 * The support for this is provided by the <code>StyleSheet</code>
 * class.  The presentation of the HTML can be heavily influenced
 * by the setting of the StyleSheet property on the EditorKit.
 *
 * <dt>
 * Not lossy
 * <dd>
 * An EditorKit has the ability to be read and save documents.
 * It is generally the most pleasing to users if there is no loss
 * of data between the two operation.  The policy of the HTMLEditorKit
 * will be to store things not recognized or not necessarily visible
 * so they can be subsequently written out.  The model of the HTML document
 * should therefore contain all information discovered while reading the
 * document.  This is constrained in some ways by the need to support
 * editing (i.e. incorrect documents sometimes must be normalized).
 * The guiding principle is that information shouldn't be lost, but
 * some might be synthesized to produce a more correct model or it might
 * be rearranged.
 * </dl>
 *
 * @author  Timothy Prinzing
 */
