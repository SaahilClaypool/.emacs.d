_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    int firstLineOffset;

    /**
     * Offset of where to draw the first character on the first line.
     * This is a hack and temporary until we can better address the problem
     * of text measuring. This field is actually never set directly in
     * PlainView, but by FieldView.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    Font font;

    /**
     * Font used to calculate the longest line... if this
     * changes we need to recalculate the longest line
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    Element longLine;

    /**
     * The current longest line.  This is used to calculate
     * the preferred width of the view.  Since the calculation
     * is potentially expensive we try to avoid it by stashing
     * which line is currently the longest.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected FontMetrics metrics;

    /**
     * Font metrics for the current font.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    private int getLineWidth(Element line) {

    /**
     * Calculate the width of the line represented by
     * the given element.  It is assumed that the font
     * and font metrics are up-to-date.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    private void calculateLongestLine() {

    /**
     * Iterate over the lines represented by the child elements
     * of the element this view represents, looking for the line
     * that is the longest.  The <em>longLine</em> variable is updated to
     * represent the longest line contained.  The <em>font</em> variable
     * is updated to indicate the font used to calculate the
     * longest line.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected Rectangle lineToRect(Shape a, int line) {

    /**
     * Determine the rectangle that represents the given line.
     *
     * @param a  the region allocated for the view to render into
     * @param line the line number to find the region of.  This must
     *   be a valid line number in the model.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected void damageLineRange(int line0, int line1, Shape a, Component host) {

    /**
     * Repaint the given line range.
     *
     * @param host the component hosting the view (used to call repaint)
     * @param a  the region allocated for the view to render into
     * @param line0 the starting line number to repaint.  This must
     *   be a valid line number in the model.
     * @param line1 the ending line number to repaint.  This must
     *   be a valid line number in the model.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected void updateDamage(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Repaint the region of change covered by the given document
     * event.  Damages the line that begins the range to cover
     * the case when the insert/remove is only on one line.
     * If lines are added or removed, damages the whole
     * view.  The longest line is checked to see if it has
     * changed.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public void changedUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public void removeUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was removed from the document
     * in a location that this view is responsible for.
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#removeUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public void insertUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was inserted into the document
     * in a location that this view is responsible for.
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#insertUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param fx the X coordinate &gt;= 0
     * @param fy the Y coordinate &gt;= 0
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point in the view &gt;= 0
     * @see View#viewToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see View#modelToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    Shape adjustPaintRegion(Shape a) {

    /**
     * Should return a shape ideal for painting based on the passed in
     * Shape <code>a</code>. This is useful if painting in a different
     * region. The default implementation returns <code>a</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Renders using the given rendering surface and area on that surface.
     * The view may need to do layout and create child views to enable
     * itself to render into the given allocation.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     *
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @exception IllegalArgumentException for an invalid axis
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected void updateMetrics() {

    /**
     * Checks to see if the font metrics and longest line
     * are up-to-date.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected final Segment getLineBuffer() {

    /**
     * Gives access to a buffer that can be used to fetch
     * text from the associated document.
     *
     * @return the buffer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
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
     * @param p1 the ending position in the model &gt;= 0
     * @return the location of the end of the range
     * @exception BadLocationException if the range is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected int drawUnselectedText(Graphics g, int x, int y,
                                     int p0, int p1) throws BadLocationException {

    /**
     * Renders the given range in the model as normal unselected
     * text.  Uses the foreground or disabled color to render the text.
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param p0 the beginning position in the model &gt;= 0
     * @param p1 the ending position in the model &gt;= 0
     * @return the X location of the end of the range &gt;= 0
     * @exception BadLocationException if the range is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected void drawLine(int lineIndex, Graphics g, int x, int y) {

    /**
     * Renders a line of text, suppressing whitespace at the end
     * and expanding any tabs.  This is implemented to make calls
     * to the methods <code>drawUnselectedText</code> and
     * <code>drawSelectedText</code> so that the way selected and
     * unselected text are rendered can be customized.
     *
     * @param lineIndex the line to draw &gt;= 0
     * @param g the <code>Graphics</code> context
     * @param x the starting X position &gt;= 0
     * @param y the starting Y position &gt;= 0
     * @see #drawUnselectedText
     * @see #drawSelectedText
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    protected int getTabSize() {

    /**
     * Returns the tab size set for the document, defaulting to 8.
     *
     * @return the tab size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
    public PlainView(Element elem) {

    /**
     * Constructs a new PlainView wrapped on an element.
     *
     * @param elem the element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainView.java
public class PlainView extends View implements TabExpander {

/**
 * Implements View interface for a simple multi-line text view
 * that has text in one font and color.  The view represents each
 * child element as a line of text.
 *
 * @author  Timothy Prinzing
 * @see     View
 */
