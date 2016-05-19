_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static int getNextVisualPositionFrom(View v, int pos, Position.Bias b,
                                          Shape alloc, int direction,
                                          Position.Bias[] biasRet)

    /**
     * Provides a way to determine the next visually represented model
     * location that one might place a caret.  Some views may not be visible,
     * they might not be in the same order found in the model, or they just
     * might not allow access to some of the locations in the model.
     * <p>
     * This implementation assumes the views are layed out in a logical
     * manner. That is, that the view at index x + 1 is visually after
     * the View at index x, and that the View at index x - 1 is visually
     * before the View at x. There is support for reversing this behavior
     * only if the passed in <code>View</code> is an instance of
     * <code>CompositeView</code>. The <code>CompositeView</code>
     * must then override the <code>flipEastAndWestAtEnds</code> method.
     *
     * @param v View to query
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @param direction the direction from the current position that can
     *  be thought of as the arrow keys typically found on a keyboard;
     *  this may be one of the following:
     *  <ul>
     *  <li><code>SwingConstants.WEST</code>
     *  <li><code>SwingConstants.EAST</code>
     *  <li><code>SwingConstants.NORTH</code>
     *  <li><code>SwingConstants.SOUTH</code>
     *  </ul>
     * @param biasRet an array contain the bias that was checked
     * @return the location within the model that best represents the next
     *  location visual position
     * @exception BadLocationException
     * @exception IllegalArgumentException if <code>direction</code> is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static void paintComposedText(Graphics g, Rectangle alloc, GlyphView v) {

    /**
     * Paints the composed text in a GlyphView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static int drawComposedText(View view, AttributeSet attr, Graphics g,
                                int x, int y, int p0, int p1)

    /**
     * Draws the given composed text passed from an input method.
     *
     * @param view View hosting text
     * @param attr the attributes containing the composed text
     * @param g  the graphics context
     * @param x  the X origin
     * @param y  the Y origin
     * @param p0 starting offset in the composed text to be rendered
     * @param p1 ending offset in the composed text to be rendered
     * @return  the new insertion position
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final Element getParagraphElement(JTextComponent c, int offs) {

    /**
     * Determines the element to use for a paragraph/line.
     *
     * @param c the editor
     * @param offs the starting offset in the document &gt;= 0
     * @return the element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static int getPrevWordInParagraph(JTextComponent c, Element line, int offs) throws BadLocationException {

    /**
     * Finds the previous word in the given elements text.  The first
     * parameter allows searching multiple paragraphs where even
     * the first offset is desired.
     * Returns the offset of the next word, or BreakIterator.DONE
     * if there are no more words in the element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getPreviousWord(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determine the start of the prev word for the given location.
     * Uses BreakIterator.getWordInstance() to actually get the words.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the location in the model of the word start &gt;= 0
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static int getNextWordInParagraph(JTextComponent c, Element line, int offs, boolean first) throws BadLocationException {

    /**
     * Finds the next word in the given elements text.  The first
     * parameter allows searching multiple paragraphs where even
     * the first offset is desired.
     * Returns the offset of the next word, or BreakIterator.DONE
     * if there are no more words in the element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getNextWord(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determines the start of the next word for the given location.
     * Uses BreakIterator.getWordInstance() to actually get the words.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the location in the model of the word start &gt;= 0
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getWordEnd(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determines the end of a word for the given location.
     * Uses BreakIterator.getWordInstance() to actually get the words.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the location in the model of the word end &gt;= 0
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getWordStart(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determines the start of a word for the given model location.
     * Uses BreakIterator.getWordInstance() to actually get the words.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the location in the model of the word start &gt;= 0
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getPositionBelow(JTextComponent c, int offs, int x) throws BadLocationException {

    /**
     * Determines the position in the model that is closest to the given
     * view location in the row below.  The component given must have a
     * size to compute the result.  If the component doesn't have a size
     * a value of -1 will be returned.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @param x the X coordinate &gt;= 0
     * @return the position &gt;= 0 if the request can be computed, otherwise
     *  a value of -1 will be returned.
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getPositionAbove(JTextComponent c, int offs, int x) throws BadLocationException {

    /**
     * Determines the position in the model that is closest to the given
     * view location in the row above.  The component given must have a
     * size to compute the result.  If the component doesn't have a size
     * a value of -1 will be returned.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @param x the X coordinate &gt;= 0
     * @return the position &gt;= 0 if the request can be computed, otherwise
     *  a value of -1 will be returned.
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getRowEnd(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determines the ending row model position of the row that contains
     * the specified model position.  The component given must have a
     * size to compute the result.  If the component doesn't have a size
     * a value of -1 will be returned.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the position &gt;= 0 if the request can be computed, otherwise
     *  a value of -1 will be returned.
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getRowStart(JTextComponent c, int offs) throws BadLocationException {

    /**
     * Determines the starting row model position of the row that contains
     * the specified model position.  The component given must have a
     * size to compute the result.  If the component doesn't have a size
     * a value of -1 will be returned.
     *
     * @param c the editor
     * @param offs the offset in the document &gt;= 0
     * @return the position &gt;= 0 if the request can be computed, otherwise
     *  a value of -1 will be returned.
     * @exception BadLocationException if the offset is out of range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getBreakLocation(Segment s, FontMetrics metrics,
                                             int x0, int x, TabExpander e,
                                             int startOffset) {

    /**
     * Determine where to break the given text to fit
     * within the given span. This tries to find a word boundary.
     * @param s  the source of the text
     * @param metrics the font metrics to use for the calculation
     * @param x0 the starting view location representing the start
     *   of the given text.
     * @param x  the target view location to translate to an
     *   offset into the text.
     * @param e  how to expand the tabs.  If this value is null,
     *   tabs will be expanded as a space character.
     * @param startOffset starting offset in the document of the text
     * @return  the offset into the given text
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getTabbedTextOffset(Segment s, FontMetrics metrics,
                                             int x0, int x, TabExpander e,
                                             int startOffset) {

    /**
     * Determines the relative offset into the given text that
     * best represents the given span in the view coordinate
     * system.  This is implemented in a 1.1 style coordinate
     * system where ints are used and 72dpi is assumed.
     *
     * @param s  the source of the text
     * @param metrics the font metrics to use for the calculation
     * @param x0 the starting view location representing the start
     *   of the given text &gt;= 0.
     * @param x  the target view location to translate to an
     *   offset into the text &gt;= 0.
     * @param e  how to expand the tabs.  If this value is null,
     *   tabs will be expanded as a space character.
     * @param startOffset starting offset of the text in the document &gt;= 0
     * @return  the offset into the text &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int getTabbedTextWidth(Segment s, FontMetrics metrics, int x,
                                               TabExpander e, int startOffset) {

    /**
     * Determines the width of the given segment of text taking tabs
     * into consideration.  This is implemented in a 1.1 style coordinate
     * system where ints are used and 72dpi is assumed.
     *
     * @param s  the source of the text
     * @param metrics the font metrics to use for the calculation
     * @param x  the X origin &gt;= 0
     * @param e  how to expand the tabs.  If this value is null,
     *   tabs will be expanded as a space character.
     * @param startOffset starting offset of the text in the document &gt;= 0
     * @return  the width of the text
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static final int drawTabbedText(View view,
                                Segment s, int x, int y, Graphics g,
                                TabExpander e, int startOffset) {

    /**
     * Draws the given text, expanding any tabs that are contained
     * using the given tab expansion technique.  This particular
     * implementation renders in a 1.1 style coordinate system
     * where ints are used and 72dpi is assumed.
     *
     * @param view View requesting rendering, may be null.
     * @param s  the source of the text
     * @param x  the X origin &gt;= 0
     * @param y  the Y origin &gt;= 0
     * @param g  the graphics context
     * @param e  how to expand the tabs.  If this value is null,
     *   tabs will be expanded as a space character.
     * @param startOffset starting offset of the text in the document &gt;= 0
     * @return  the X location at the end of the rendered text
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    public static final int drawTabbedText(Segment s, int x, int y, Graphics g,
                                           TabExpander e, int startOffset) {

    /**
     * Draws the given text, expanding any tabs that are contained
     * using the given tab expansion technique.  This particular
     * implementation renders in a 1.1 style coordinate system
     * where ints are used and 72dpi is assumed.
     *
     * @param s  the source of the text
     * @param x  the X origin &gt;= 0
     * @param y  the Y origin &gt;= 0
     * @param g  the graphics context
     * @param e  how to expand the tabs.  If this value is null,
     *   tabs will be expanded as a space character.
     * @param startOffset starting offset of the text in the document &gt;= 0
     * @return  the X location at the end of the rendered text
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
    static JComponent getJComponent(View view) {

    /**
     * If <code>view</code>'s container is a <code>JComponent</code> it
     * is returned, after casting.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Utilities.java
public class Utilities {

/**
 * A collection of methods to deal with various text
 * related activities.
 *
 * @author  Timothy Prinzing
 */
