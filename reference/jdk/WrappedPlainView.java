_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        private int findLine(int offset) {

        /**
         * Binary search in the cache for line containing specified offset
         * (which is relative to the beginning of the view). This method
         * assumes that cache exists.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        final int[] breakLines(int startPos) {

        /**
         * Creates line cache if text breaks into more than one physical line.
         * @param startPos position to start breaking from
         * @return the cache created, ot null if text breaks into one line
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        final int[] getLineEnds() {

        /**
         * Returns line cache. If the cache was GC'ed, recreates it.
         * If there's no cache, returns null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.
         *
         * @param fx the X coordinate
         * @param fy the Y coordinate
         * @param a the allocated region to render into
         * @return the location within the model that best represents the
         *  given point in the view
         * @see View#viewToModel
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        public Shape modelToView(int pos, Shape a, Position.Bias b)

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param pos the position to convert
         * @param a the allocated region to render into
         * @return the bounding box of the given position is returned
         * @exception BadLocationException  if the given position does not represent a
         *   valid location in the associated document
         * @see View#modelToView
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        public void paint(Graphics g, Shape a) {

        /**
         * Renders using the given rendering surface and area on that
         * surface.  The view may need to do layout and create child
         * views to enable itself to render into the given allocation.
         *
         * @param g the rendering surface to use
         * @param a the allocated region to render into
         * @see View#paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
        public float getPreferredSpan(int axis) {

        /**
         * Determines the preferred span for this view along an
         * axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return   the span the view would like to be rendered into.
         *           Typically the view is told to render into the span
         *           that is returned, although there is no guarantee.
         *           The parent may choose to resize or break the view.
         * @see View#getPreferredSpan
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    class WrappedLine extends View {

    /**
     * Simple view of a line that wraps if it doesn't
     * fit withing the horizontal space allocated.
     * This class tries to be lightweight by carrying little
     * state of it's own and sharing the state of the outer class
     * with it's sibblings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public void removeUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was removed from the
     * document in a location that this view is responsible for.
     * This is implemented to simply update the children.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#removeUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public void insertUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was inserted into the
     * document in a location that this view is responsible for.
     * This is implemented to simply update the children.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#insertUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.  This is implemented to provide the superclass
     * behavior after first making sure that the current font
     * metrics are cached (for the nested lines which use
     * the metrics to determine the height of the potentially
     * wrapped lines).
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return  the span the view would like to be rendered into.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @see View#getMaximumSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.  This is implemented to provide the superclass
     * behavior after first making sure that the current font
     * metrics are cached (for the nested lines which use
     * the metrics to determine the height of the potentially
     * wrapped lines).
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return  the span the view would like to be rendered into.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @see View#getMinimumSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.  This is implemented to provide the superclass
     * behavior after first making sure that the current font
     * metrics are cached (for the nested lines which use
     * the metrics to determine the height of the potentially
     * wrapped lines).
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return  the span the view would like to be rendered into.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @see View#getPreferredSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public void setSize(float width, float height) {

    /**
     * Sets the size of the view.  This should cause
     * layout of the view along the given axis, if it
     * has any layout duties.
     *
     * @param width the width &gt;= 0
     * @param height the height &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Renders using the given rendering surface and area
     * on that surface.  This is implemented to stash the
     * selection positions, selection colors, and font
     * metrics for the nested lines to use.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     *
     * @see View#paint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public float nextTabStop(float x, int tabOffset) {

    /**
     * Returns the next tab stop position after a given reference position.
     * This implementation does not support things like centering so it
     * ignores the tabOffset argument.
     *
     * @param x the current position &gt;= 0
     * @param tabOffset the position within the text stream
     *   that the tab occurred at &gt;= 0.
     * @return the tab stop, measured in points &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    final void loadText(Segment segment, int p0, int p1) {

    /**
     * Load the text buffer with the given range
     * of text.  This is used by the fragments
     * broken off of this view as well as this
     * view itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    void updateChildren(DocumentEvent e, Shape a) {

    /**
     * Update the child views in response to a
     * document event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected void loadChildren(ViewFactory f) {

    /**
     * Loads all of the children to initialize the view.
     * This is called by the <code>setParent</code> method.
     * Subclasses can reimplement this to initialize their
     * child views in a different manner.  The default
     * implementation creates a child view for each
     * child element.
     *
     * @param f the view factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected int calculateBreakPosition(int p0, int p1) {

    /**
     * This is called by the nested wrapped line
     * views to determine the break location.  This can
     * be reimplemented to alter the breaking behavior.
     * It will either break at word or character boundaries
     * depending upon the break argument given at
     * construction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected final Segment getLineBuffer() {

    /**
     * Gives access to a buffer that can be used to fetch
     * text from the associated document.
     *
     * @return the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected int drawSelectedText(Graphics g, int x,
                                   int y, int p0, int p1) throws BadLocationException {

    /**
     * Renders the given range in the model as selected text.  This
     * is implemented to render the text in the color specified in
     * the hosting component.  It assumes the highlighter will render
     * the selected background.
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param p0 the beginning position in the model &gt;= 0
     * @param p1 the ending position in the model &gt;= p0
     * @return the location of the end of the range.
     * @exception BadLocationException if the range is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected int drawUnselectedText(Graphics g, int x, int y,
                                     int p0, int p1) throws BadLocationException {

    /**
     * Renders the given range in the model as normal unselected
     * text.
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param p0 the beginning position in the model &gt;= 0
     * @param p1 the ending position in the model &gt;= p0
     * @return the X location of the end of the range &gt;= 0
     * @exception BadLocationException if the range is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected void drawLine(int p0, int p1, Graphics g, int x, int y) {

    /**
     * Renders a line of text, suppressing whitespace at the end
     * and expanding any tabs.  This is implemented to make calls
     * to the methods <code>drawUnselectedText</code> and
     * <code>drawSelectedText</code> so that the way selected and
     * unselected text are rendered can be customized.
     *
     * @param p0 the starting document location to use &gt;= 0
     * @param p1 the ending document location to use &gt;= p1
     * @param g the graphics context
     * @param x the starting X position &gt;= 0
     * @param y the starting Y position &gt;= 0
     * @see #drawUnselectedText
     * @see #drawSelectedText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    protected int getTabSize() {

    /**
     * Returns the tab size set for the document, defaulting to 8.
     *
     * @return the tab size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public WrappedPlainView(Element elem, boolean wordWrap) {

    /**
     * Creates a new WrappedPlainView.  Lines can be wrapped on
     * either character or word boundaries depending upon the
     * setting of the wordWrap parameter.
     *
     * @param elem the element underlying the view
     * @param wordWrap should lines be wrapped on word boundaries?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
    public WrappedPlainView(Element elem) {

    /**
     * Creates a new WrappedPlainView.  Lines will be wrapped
     * on character boundaries.
     *
     * @param elem the element underlying the view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/WrappedPlainView.java
public class WrappedPlainView extends BoxView implements TabExpander {

/**
 * View of plain text (text with only one font and color)
 * that does line-wrapping.  This view expects that its
 * associated element has child elements that represent
 * the lines it should be wrapping.  It is implemented
 * as a vertical box that contains logical line views.
 * The logical line views are nested classes that render
 * the logical line as multiple physical line if the logical
 * line is too wide to fit within the allocation.  The
 * line views draw upon the outer class for its state
 * to reduce their memory requirements.
 * <p>
 * The line views do all of their rendering through the
 * <code>drawLine</code> method which in turn does all of
 * its rendering through the <code>drawSelectedText</code>
 * and <code>drawUnselectedText</code> methods.  This
 * enables subclasses to easily specialize the rendering
 * without concern for the layout aspects.
 *
 * @author  Timothy Prinzing
 * @see     View
 */
