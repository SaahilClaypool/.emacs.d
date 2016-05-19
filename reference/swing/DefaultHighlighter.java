_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public synchronized void damageRange(Position pos0, Position pos1) {

        /**
         * Adds the range to be damaged into the range queue. If the
         * range queue is empty (the first call or run() was already
         * invoked) then adds this class instance into EventDispatch
         * queue.
         *
         * The method also tracks if the current document changed or
         * component is null. In this case it removes all ranges added
         * before from range queue.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public synchronized void run() {

        /**
         * Executes range(s) damage and cleans range queue.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    class SafeDamager implements Runnable {

    /**
     * This class invokes <code>mapper.damageRange</code> in
     * EventDispatchThread. The only one instance per Highlighter
     * is cretaed. When a number of ranges should be damaged
     * it collects them into queue and damages
     * them in consecutive order in <code>run</code>
     * call.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        void paintLayeredHighlights(Graphics g, int p0, int p1,
                                    Shape viewBounds, JTextComponent editor,
                                    View view) {

        /**
         * Restricts the region based on the receivers offsets and messages
         * the painter to paint the region.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    class LayeredHighlightInfo extends HighlightInfo {

    /**
     * LayeredHighlightPainter is used when a drawsLayeredHighlights is
     * true. It maintains a rectangle of the region to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public Shape paintLayer(Graphics g, int offs0, int offs1,
                                Shape bounds, JTextComponent c, View view) {

        /**
         * Paints a portion of a highlight.
         *
         * @param g the graphics context
         * @param offs0 the starting model offset &gt;= 0
         * @param offs1 the ending model offset &gt;= offs1
         * @param bounds the bounding box of the view, which is not
         *        necessarily the region to paint.
         * @param c the editor
         * @param view View painting for
         * @return region drawing occurred in
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public void paint(Graphics g, int offs0, int offs1, Shape bounds, JTextComponent c) {

        /**
         * Paints a highlight.
         *
         * @param g the graphics context
         * @param offs0 the starting model offset &gt;= 0
         * @param offs1 the ending model offset &gt;= offs1
         * @param bounds the bounding box for the highlight
         * @param c the editor
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public Color getColor() {

        /**
         * Returns the color of the highlight.
         *
         * @return the color
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
        public DefaultHighlightPainter(Color c) {

        /**
         * Constructs a new highlight painter. If <code>c</code> is null,
         * the JTextComponent will be queried for its selection color.
         *
         * @param c the color for the highlight
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public static class DefaultHighlightPainter extends LayeredHighlighter.LayerPainter {

    /**
     * Simple highlight painter that fills a highlighted area with
     * a solid color.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public static final LayeredHighlighter.LayerPainter DefaultPainter = new DefaultHighlightPainter(null);

    /**
     * Default implementation of LayeredHighlighter.LayerPainter that can
     * be used for painting highlights.
     * <p>
     * As of 1.4 this field is final.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void setDrawsLayeredHighlights(boolean newValue) {

    /**
     * If true, highlights are drawn as the Views draw the text. That is
     * the Views will call into <code>paintLayeredHighlight</code> which
     * will result in a rectangle being drawn before the text is drawn
     * (if the offsets are in a highlighted region that is). For this to
     * work the painter supplied must be an instance of
     * LayeredHighlightPainter.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    private void safeDamageRange(int a0, int a1) throws BadLocationException {

    /**
     * Queues damageRange() call into event dispatch thread
     * to be sure that views are in consistent state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    private void safeDamageRange(final Position p0, final Position p1) {

    /**
     * Queues damageRange() call into event dispatch thread
     * to be sure that views are in consistent state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void paintLayeredHighlights(Graphics g, int p0, int p1,
                                       Shape viewBounds,
                                       JTextComponent editor, View view) {

    /**
     * When leaf Views (such as LabelView) are rendering they should
     * call into this method. If a highlight is in the given region it will
     * be drawn immediately.
     *
     * @param g Graphics used to draw
     * @param p0 starting offset of view
     * @param p1 ending offset of view
     * @param viewBounds Bounds of View
     * @param editor JTextComponent
     * @param view View instance being rendered
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public Highlighter.Highlight[] getHighlights() {

    /**
     * Makes a copy of the highlights.  Does not actually clone each highlight,
     * but only makes references to them.
     *
     * @return the copy
     * @see Highlighter#getHighlights
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void changeHighlight(Object tag, int p0, int p1) throws BadLocationException {

    /**
     * Changes a highlight.
     *
     * @param tag the highlight tag
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     * @exception BadLocationException if the specified location is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void removeAllHighlights() {

    /**
     * Removes all highlights.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void removeHighlight(Object tag) {

    /**
     * Removes a highlight from the view.
     *
     * @param tag the reference to the highlight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public Object addHighlight(int p0, int p1, Highlighter.HighlightPainter p) throws BadLocationException {

    /**
     * Adds a highlight to the view.  Returns a tag that can be used
     * to refer to the highlight.
     *
     * @param p0   the start offset of the range to highlight &gt;= 0
     * @param p1   the end offset of the range to highlight &gt;= p0
     * @param p    the painter to use to actually render the highlight
     * @return     an object that can be used as a tag
     *   to refer to the highlight
     * @exception BadLocationException if the specified location is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void deinstall(JTextComponent c) {

    /**
     * Called when the UI is being removed from the interface of
     * a JTextComponent.
     *
     * @param c the component
     * @see Highlighter#deinstall
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void install(JTextComponent c) {

    /**
     * Called when the UI is being installed into the
     * interface of a JTextComponent.  Installs the editor, and
     * removes any existing highlights.
     *
     * @param c the editor component
     * @see Highlighter#install
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public void paint(Graphics g) {

    /**
     * Renders the highlights.
     *
     * @param g the graphics context
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
    public DefaultHighlighter() {

    /**
     * Creates a new DefaultHighlighther object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/DefaultHighlighter.java
public class DefaultHighlighter extends LayeredHighlighter {

/**
 * Implements the Highlighter interfaces.  Implements a simple highlight
 * painter that renders in a solid color.
 *
 * @author  Timothy Prinzing
 * @see     Highlighter
 */
