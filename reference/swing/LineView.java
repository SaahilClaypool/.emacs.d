_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    protected int getCharactersPerTab() {

    /**
     * @return number of characters per tab, 8.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    protected float getPreTab(float x, int tabOffset) {

    /**
     * Returns the location for the tab.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public float nextTabStop(float x, int tabOffset) {

    /**
     * Returns the next tab stop position given a reference position.
     * This view implements the tab coordinate system, and calls
     * <code>getTabbedSpan</code> on the logical children in the process
     * of layout to determine the desired span of the children.  The
     * logical children can delegate their tab expansion upward to
     * the paragraph which knows how to expand tabs.
     * <code>LabelView</code> is an example of a view that delegates
     * its tab expansion needs upward to the paragraph.
     * <p>
     * This is implemented to try and locate a <code>TabSet</code>
     * in the paragraph element's attribute set.  If one can be
     * found, its settings will be used, otherwise a default expansion
     * will be provided.  The base location for for tab expansion
     * is the left inset from the paragraphs most recent allocation
     * (which is what the layout of the children is based upon).
     *
     * @param x the X reference position
     * @param tabOffset the position within the text stream
     *   that the tab occurred at >= 0.
     * @return the trailing end of the tab expansion >= 0
     * @see TabSet
     * @see TabStop
     * @see LabelView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    protected void layout(int width, int height) {

    /**
     * Lays out the children.  If the layout span has changed,
     * the rows are rebuilt.  The superclass functionality
     * is called after checking and possibly rebuilding the
     * rows.  If the height has changed, the
     * <code>preferenceChanged</code> method is called
     * on the parent since the vertical preference is
     * rigid.
     *
     * @param width  the width to lay out against >= 0.  This is
     *   the width inside of the inset area.
     * @param height the height to lay out against >= 0 (not used
     *   by paragraph, but used by the superclass).  This
     *   is the height inside of the inset area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public float getAlignment(int axis) {

    /**
     * Gets the alignment for an axis.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the alignment
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public int getResizeWeight(int axis) {

    /**
     * Gets the resize weight for the specified axis.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the weight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.  The preformatted line should refuse to be
     * sized less than the preferred size.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *  <code>View.Y_AXIS</code>
     * @return  the minimum span the view can be rendered into
     * @see View#getPreferredSpan
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public boolean isVisible() {

    /**
     * Preformatted lines are not suppressed if they
     * have only whitespace, so they are always visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    public LineView(Element elem) {

    /**
     * Creates a LineView object.
     *
     * @param elem the element to wrap in a view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
    int tabBase;

    /** Last place painted at. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/LineView.java
class LineView extends ParagraphView {

/**
 * A view implementation to display an unwrapped
 * preformatted line.<p>
 * This subclasses ParagraphView, but this really only contains one
 * Row of text.
 *
 * @author  Timothy Prinzing
 */
