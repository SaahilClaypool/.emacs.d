_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        protected short getLeftInset() {

        /**
         * Gets the left inset.
         *
         * @return the inset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        protected int getViewIndexAtPosition(int pos) {

        /**
         * Fetches the child view index representing the given position in
         * the model.
         *
         * @param pos the position &gt;= 0
         * @return  index of the view representing the given position, or
         *   -1 if no view represents that position
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        private boolean isJustifyEnabled() {

        /**
         * Whether we need to justify this {@code Row}.
         * At this time (jdk1.6) we support justification on for non
         * 18n text.
         *
         * @return {@code true} if this {@code Row} should be justified.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the minor axis of the box (i.e. the
         * axis orthogonal to the axis that it represents).  The results
         * of the layout should be placed in the given arrays which represent
         * the allocations to the children along the minor axis.
         * <p>
         * This is implemented to do a baseline layout of the children
         * by calling BoxView.baselineLayout.
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children.
         * @param axis the axis being layed out.
         * @param offsets the offsets from the origin of the view for
         *  each of the child views.  This is a return value and is
         *  filled in by the implementation of this method.
         * @param spans the span of each child view.  This is a return
         *  value and is filled in by the implementation of this method.
         * @return the offset and span for each child view in the
         *  offsets and spans parameters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        public int getStartOffset() {

        /**
         * Range represented by a row in the paragraph is only
         * a subset of the total range of the paragraph element.
         * @see View#getRange
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.  This is
         * implemented to let the superclass find the position along
         * the major axis and the allocation of the row is used
         * along the minor axis, so that even though the children
         * are different heights they all get the same caret height.
         *
         * @param pos the position to convert
         * @param a the allocated region to render into
         * @return the bounding box of the given position
         * @exception BadLocationException  if the given position does not represent a
         *   valid location in the associated document
         * @see View#modelToView
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  This view
         * isn't directly responsible for an element so it returns
         * the outer classes attributes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
        protected void loadChildren(ViewFactory f) {

        /**
         * This is reimplemented to do nothing since the
         * paragraph fills in the row with its needed
         * children.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    class Row extends BoxView {

    /**
     * Internally created view that has the purpose of holding
     * the views that represent the children of the paragraph
     * that have been arranged in rows.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    static char[] tabDecimalChars;

    /** Used for searching for a tab or decimal character. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    static char[] tabChars;

    /** Used for searching for a tab. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    static Class i18nStrategy;

    /**
     * Used to create an i18n-based layout strategy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    private int tabBase;

    /**
     * Used by the TabExpander functionality to determine
     * where to base the tab calculations.  This is basically
     * the location of the left side of the paragraph.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected int firstLineIndent = 0;

    /** Indentation for the first line, from the left inset. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public void changedUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     *
     * @param changes the change information from the
     *  associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    private float findEdgeSpan(View v, int axis, int fp, int p0, int p1) {

    /**
     * Binary search for the longest non-breakable fragment at the view edge.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    @Override

    /**
     * Calculate the needs for the paragraph along the minor axis.
     *
     * <p>This uses size requirements of the superclass, modified to take into
     * account the non-breakable areas at the adjacent views edges.  The minimal
     * size requirements for such views should be no less than the sum of all
     * adjacent fragments.</p>
     *
     * <p>If the {@code axis} parameter is neither {@code View.X_AXIS} nor
     * {@code View.Y_AXIS}, {@link IllegalArgumentException} is thrown.  If the
     * {@code r} parameter is {@code null,} a new {@code SizeRequirements}
     * object is created, otherwise the supplied {@code SizeRequirements}
     * object is returned.</p>
     *
     * @param axis  the minor axis
     * @param r     the input {@code SizeRequirements} object
     * @return      the new or adjusted {@code SizeRequirements} object
     * @throws IllegalArgumentException  if the {@code axis} parameter is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public int getBreakWeight(int axis, float len) {

    /**
     * Gets the break weight for a given location.
     * <p>
     * <code>ParagraphView</code> instances are breakable
     * along the <code>Y_AXIS</code> only, and only if
     * <code>len</code> is after the first row.  If the length
     * is less than one row, a value of <code>BadBreakWeight</code>
     * is returned.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *  or <code>View.Y_AXIS</code>
     * @param len specifies where a potential break is desired &gt;= 0
     * @return a value indicating the attractiveness of breaking here;
     *  either <code>GoodBreakWeight</code> or <code>BadBreakWeight</code>
     * @see View#getBreakWeight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public View breakView(int axis, float len, Shape a) {

    /**
     * Breaks this view on the given axis at the given length.
     * <p>
     * <code>ParagraphView</code> instances are breakable
     * along the <code>Y_AXIS</code> only, and only if
     * <code>len</code> is after the first line.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *  or <code>View.Y_AXIS</code>
     * @param len specifies where a potential break is desired
     *  along the given axis &gt;= 0
     * @param a the current allocation of the view
     * @return the fragment of the view that represents the
     *  given span, if the view can be broken; if the view
     *  doesn't support breaking behavior, the view itself is
     *  returned
     * @see View#breakView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public float getAlignment(int axis) {

    /**
     * Determines the desired alignment for this view along an
     * axis.  This is implemented to give the alignment to the
     * center of the first row along the y axis, and the default
     * along the x axis.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *   <code>View.Y_AXIS</code>
     * @return the desired alignment.  This should be a value
     *   between 0.0 and 1.0 inclusive, where 0 indicates alignment at the
     *   origin and 1.0 indicates alignment to the full span
     *   away from the origin.  An alignment of 0.5 would be the
     *   center of the view.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Renders using the given rendering surface and area on that
     * surface.  This is implemented to delegate to the superclass
     * after stashing the base coordinate for tab calculations.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected float getTabBase() {

    /**
     * Returns where the tabs are calculated from.
     * @return where tabs are calculated from
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected int findOffsetToCharactersInString(char[] string,
                                                 int start) {

    /**
     * Finds the next character in the document with a character in
     * <code>string</code>, starting at offset <code>start</code>. If
     * there are no characters found, -1 will be returned.
     *
     * @param string the string of characters
     * @param start where to start in the model &gt;= 0
     * @return the document offset, or -1 if no characters found
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected float getPartialSize(int startOffset, int endOffset) {

    /**
     * Returns the size used by the views between
     * <code>startOffset</code> and <code>endOffset</code>.
     * This uses <code>getPartialView</code> to calculate the
     * size if the child view implements the
     * <code>TabableView</code> interface. If a
     * size is needed and a <code>View</code> does not implement
     * the <code>TabableView</code> interface,
     * the <code>preferredSpan</code> will be used.
     *
     * @param startOffset the starting document offset &gt;= 0
     * @param endOffset the ending document offset &gt;= startOffset
     * @return the size &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected TabSet getTabSet() {

    /**
     * Gets the <code>Tabset</code> to be used in calculating tabs.
     *
     * @return the <code>TabSet</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
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
     *   that the tab occurred at &gt;= 0
     * @return the trailing end of the tab expansion &gt;= 0
     * @see TabSet
     * @see TabStop
     * @see LabelView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected View createRow() {

    /**
     * Create a <code>View</code> that should be used to hold a
     * a row's worth of children in a flow.
     * @return the new <code>View</code>
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public int getFlowStart(int index) {

    /**
     * Fetches the location along the flow axis that the
     * flow span will start at.
     * @param index the index of the view being queried
     * @return the location for the given view at
     *  <code>index</code>
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public int getFlowSpan(int index) {

    /**
     * Fetches the constraining span to flow against for
     * the given child index.
     * @param index the index of the view being queried
     * @return the constraining span for the given view at
     *  <code>index</code>
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected boolean flipEastAndWestAtEnds(int position,
                                            Position.Bias bias) {

    /**
     * Determines in which direction the next view lays.
     * Consider the <code>View</code> at index n.
     * Typically the <code>View</code>s are layed out
     * from left to right, so that the <code>View</code>
     * to the EAST will be at index n + 1, and the
     * <code>View</code> to the WEST will be at index n - 1.
     * In certain situations, such as with bidirectional text,
     * it is possible that the <code>View</code> to EAST is not
     * at index n + 1, but rather at index n - 1,
     * or that the <code>View</code> to the WEST is not at
     * index n - 1, but index n + 1.  In this case this method
     * would return true, indicating the <code>View</code>s are
     * layed out in descending order.
     * <p>
     * This will return true if the text is layed out right
     * to left at position, otherwise false.
     *
     * @param position position into the model
     * @param bias either <code>Position.Bias.Forward</code> or
     *          <code>Position.Bias.Backward</code>
     * @return true if the text is layed out right to left at
     *         position, otherwise false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    // NOTE: This will not properly work if ParagraphView contains

    /**
     * Returns the closest model position to <code>x</code>.
     * <code>rowIndex</code> gives the index of the view that corresponds
     * that should be looked in.
     * @param pos  position into the model
     * @param a the allocated region to render into
     * @param direction one of the following values:
     * <ul>
     * <li><code>SwingConstants.NORTH</code>
     * <li><code>SwingConstants.SOUTH</code>
     * </ul>
     * @param biasRet an array containing the bias that were checked
     *  in this method
     * @param rowIndex the index of the view
     * @param x the x coordinate of interest
     * @return the closest model position to <code>x</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected int getNextNorthSouthVisualPositionFrom(int pos, Position.Bias b,
                                                      Shape a, int direction,
                                                      Position.Bias[] biasRet)

    /**
     * Returns the next visual position for the cursor, in
     * either the east or west direction.
     * Overridden from <code>CompositeView</code>.
     * @param pos position into the model
     * @param b either <code>Position.Bias.Forward</code> or
     *          <code>Position.Bias.Backward</code>
     * @param a the allocated region to render into
     * @param direction either <code>SwingConstants.NORTH</code>
     *          or <code>SwingConstants.SOUTH</code>
     * @param biasRet an array containing the bias that were checked
     *  in this method
     * @return the location in the model that represents the
     *  next location visual position
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected View getLayoutView(int index) {

    /**
     * Returns the view at a given <code>index</code>.
     * The child views of the paragraph are rows which
     * have been used to arrange pieces of the <code>Views</code>
     * that represent the child elements.  This methods returns
     * the view responsible for the child element index
     * (prior to breaking).  These are the Views that were
     * produced from a factory (to represent the child
     * elements) and used for layout.
     *
     * @param index the <code>index</code> of the desired view
     * @return the view at <code>index</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected int getLayoutViewCount() {

    /**
     * Returns the number of views that this view is
     * responsible for.
     * The child views of the paragraph are rows which
     * have been used to arrange pieces of the <code>View</code>s
     * that represent the child elements.  This is the number
     * of views that have been tiled in two dimensions,
     * and should be equivalent to the number of child elements
     * to the element this view is responsible for.
     *
     * @return the number of views that this <code>ParagraphView</code>
     *          is responsible for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Set the cached properties from the attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected void setFirstLineIndent(float fi) {

    /**
     * Sets the indent on the first line.
     *
     * @param fi the value in points
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected void setLineSpacing(float ls) {

    /**
     * Sets the line spacing.
     *
     * @param ls the value is a factor of the line hight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    protected void setJustification(int j) {

    /**
     * Sets the type of justification.
     *
     * @param j one of the following values:
     * <ul>
     * <li><code>StyleConstants.ALIGN_LEFT</code>
     * <li><code>StyleConstants.ALIGN_CENTER</code>
     * <li><code>StyleConstants.ALIGN_RIGHT</code>
     * </ul>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
    public ParagraphView(Element elem) {

    /**
     * Constructs a <code>ParagraphView</code> for the given element.
     *
     * @param elem the element that this view is responsible for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ParagraphView.java
public class ParagraphView extends FlowView implements TabExpander {

/**
 * View of a simple line-wrapping paragraph that supports
 * multiple fonts, colors, components, icons, etc.  It is
 * basically a vertical box with a margin around it.  The
 * contents of the box are a bunch of rows which are special
 * horizontal boxes.  This view creates a collection of
 * views that represent the child elements of the paragraph
 * element.  Each of these views are placed into a row
 * directly if they will fit, otherwise the <code>breakView</code>
 * method is called to try and carve the view into pieces
 * that fit.
 *
 * @author  Timothy Prinzing
 * @author  Scott Violet
 * @author  Igor Kushnirskiy
 * @see     View
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.  Returns 0 if the view is not visible, otherwise
     * it calls the superclass method ot get the maximum span.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *  <code>View.Y_AXIS</code>
     * @return  the maximum span the view can be rendered into
     * @see javax.swing.text.ParagraphView#getMaximumSpan
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.  Returns 0 if the view is not visible, otherwise
     * it calls the superclass method to get the minimum span.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *  <code>View.Y_AXIS</code>
     * @return  the minimum span the view can be rendered into
     * @see javax.swing.text.ParagraphView#getMinimumSpan
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view.  Returns
     * 0 if the view is not visible, otherwise it calls the
     * superclass method to get the preferred span.
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @see javax.swing.text.ParagraphView#getPreferredSpan
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Renders using the given rendering surface and area on that
     * surface.  This is implemented to delegate to the superclass
     * after stashing the base coordinate for tab calculations.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public boolean isVisible() {

    /**
     * Indicates whether or not this view should be
     * displayed.  If none of the children wish to be
     * displayed and the only visible child is the
     * break that ends the paragraph, the paragraph
     * will not be considered visible.  Otherwise,
     * it will be considered visible and return true.
     *
     * @return true if the paragraph should be displayed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    protected SizeRequirements calculateMinorAxisRequirements(
                                                int axis, SizeRequirements r) {

    /**
     * Calculate the needs for the paragraph along the minor axis.
     *
     * <p>If size requirements are explicitly specified for the paragraph,
     * use that requirements.  Otherwise, use the requirements of the
     * superclass {@link javax.swing.text.ParagraphView}.</p>
     *
     * <p>If the {@code axis} parameter is neither {@code View.X_AXIS} nor
     * {@code View.Y_AXIS}, {@link IllegalArgumentException} is thrown.  If the
     * {@code r} parameter is {@code null,} a new {@code SizeRequirements}
     * object is created, otherwise the supplied {@code SizeRequirements}
     * object is returned.</p>
     *
     * @param axis  the minor axis
     * @param r     the input {@code SizeRequirements} object
     * @return      the new or adjusted {@code SizeRequirements} object
     * @throws IllegalArgumentException  if the {@code axis} parameter is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Sets up the paragraph from css attributes instead of
     * the values found in StyleConstants (i.e. which are used
     * by the superclass).  Since
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public AttributeSet getAttributes() {

    /**
     * Fetches the attributes to use when rendering.  This is
     * implemented to multiplex the attributes specified in the
     * model with a StyleSheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public void setParent(View parent) {

    /**
     * Establishes the parent view for this view.  This is
     * guaranteed to be called before any other methods if the
     * parent view is functioning properly.
     * <p>
     * This is implemented
     * to forward to the superclass as well as call the
     * {@link #setPropertiesFromAttributes setPropertiesFromAttributes}
     * method to set the paragraph properties from the css
     * attributes.  The call is made at this time to ensure
     * the ability to resolve upward through the parents
     * view attributes.
     *
     * @param parent the new parent, or null if the view is
     *  being removed from a parent it was previously added
     *  to
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
    public ParagraphView(Element elem) {

    /**
     * Constructs a ParagraphView for the given element.
     *
     * @param elem the element that this view is responsible for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ParagraphView.java
public class ParagraphView extends javax.swing.text.ParagraphView {

/**
 * Displays the a paragraph, and uses css attributes for its
 * configuration.
 *
 * @author  Timothy Prinzing
 */
