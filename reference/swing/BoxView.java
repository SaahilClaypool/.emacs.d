_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    Rectangle tempRect;

    /** used in paint. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected boolean flipEastAndWestAtEnds(int position,
                                            Position.Bias bias) {

    /**
     * Determines in which direction the next view lays.
     * Consider the View at index n. Typically the <code>View</code>s
     * are layed out from left to right, so that the <code>View</code>
     * to the EAST will be at index n + 1, and the <code>View</code>
     * to the WEST will be at index n - 1. In certain situations,
     * such as with bidirectional text, it is possible
     * that the <code>View</code> to EAST is not at index n + 1,
     * but rather at index n - 1, or that the <code>View</code>
     * to the WEST is not at index n - 1, but index n + 1.
     * In this case this method would return true,
     * indicating the <code>View</code>s are layed out in
     * descending order. Otherwise the method would return false
     * indicating the <code>View</code>s are layed out in ascending order.
     * <p>
     * If the receiver is laying its <code>View</code>s along the
     * <code>Y_AXIS</code>, this will will return the value from
     * invoking the same method on the <code>View</code>
     * responsible for rendering <code>position</code> and
     * <code>bias</code>. Otherwise this will return false.
     *
     * @param position position into the model
     * @param bias either <code>Position.Bias.Forward</code> or
     *          <code>Position.Bias.Backward</code>
     * @return true if the <code>View</code>s surrounding the
     *          <code>View</code> responding for rendering
     *          <code>position</code> and <code>bias</code>
     *          are layed out in descending order; otherwise false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected int getSpan(int axis, int childIndex) {

    /**
     * Fetches the span of a particular child's current layout.
     * @param axis the axis being studied
     * @param childIndex the index of the requested child
     * @return the span (width or height) of the specified child
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected int getOffset(int axis, int childIndex) {

    /**
     * Fetches the offset of a particular child's current layout.
     * @param axis the axis being studied
     * @param childIndex the index of the requested child
     * @return the offset (location) for the specified child
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected SizeRequirements baselineRequirements(int axis, SizeRequirements r) {

    /**
     * Calculates the size requirements for this <code>BoxView</code>
     * by examining the size of each child view.
     *
     * @param axis the axis being studied
     * @param r the <code>SizeRequirements</code> object;
     *          if <code>null</code> one will be created
     * @return the newly initialized <code>SizeRequirements</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void baselineLayout(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Computes the location and extent of each child view
     * in this <code>BoxView</code> given the <code>targetSpan</code>,
     * which is the width (or height) of the region we have to
     * work with.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being studied, either
     *          <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     * @param offsets an empty array filled by this method with
     *          values specifying the location  of each child view
     * @param spans  an empty array filled by this method with
     *          values specifying the extent of each child view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    void checkRequests(int axis) {

    /**
     * Checks the request cache and update if needed.
     * @param axis the axis being studied
     * @exception IllegalArgumentException if <code>axis</code> is
     *  neither <code>View.X_AXIS</code> nor <code>View.Y_AXIS</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculates the size requirements for the minor axis
     * <code>axis</code>.
     *
     * @param axis the axis being studied
     * @param r the <code>SizeRequirements</code> object;
     *          if <code>null</code> one will be created
     * @return the newly initialized <code>SizeRequirements</code> object
     * @see javax.swing.SizeRequirements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected SizeRequirements calculateMajorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculates the size requirements for the major axis
     * <code>axis</code>.
     *
     * @param axis the axis being studied
     * @param r the <code>SizeRequirements</code> object;
     *          if <code>null</code> one will be created
     * @return the newly initialized <code>SizeRequirements</code> object
     * @see javax.swing.SizeRequirements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Performs layout for the minor axis of the box (i.e. the
     * axis orthogonal to the axis that it represents). The results
     * of the layout (the offset and span for each children) are
     * placed in the given arrays which represent the allocations to
     * the children along the minor axis.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views; this is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view; this is a return
     *  value and is filled in by the implementation of this method
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Performs layout for the major axis of the box (i.e. the
     * axis that it represents). The results of the layout (the
     * offset and span for each children) are placed in the given
     * arrays which represent the allocations to the children
     * along the major axis.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views; this is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view; this is a return
     *  value and is filled in by the implementation of this method
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public int getHeight() {

    /**
     * Returns the current height of the box.  This is the height that
     * it was last allocated.
     * @return the current height of the box
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public int getWidth() {

    /**
     * Returns the current width of the box.  This is the width that
     * it was last allocated.
     * @return the current width of the box
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void layout(int width, int height) {

    /**
     * Perform layout on the box
     *
     * @param width the width (inside of the insets) &gt;= 0
     * @param height the height (inside of the insets) &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void childAllocation(int index, Rectangle alloc) {

    /**
     * Allocates a region for a child view.
     *
     * @param index the index of the child view to
     *   allocate, &gt;= 0 &amp;&amp; &lt; getViewCount()
     * @param alloc the allocated region
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected View getViewAtPoint(int x, int y, Rectangle alloc) {

    /**
     * Fetches the child view at the given coordinates.
     *
     * @param x the X coordinate &gt;= 0
     * @param y the Y coordinate &gt;= 0
     * @param alloc the parents inner allocation on entry, which should
     *   be changed to the child's allocation on exit
     * @return the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected boolean isAfter(int x, int y, Rectangle innerAlloc) {

    /**
     * Determines if a point falls after an allocated region.
     *
     * @param x the X coordinate &gt;= 0
     * @param y the Y coordinate &gt;= 0
     * @param innerAlloc the allocated region; this is the area
     *   inside of the insets
     * @return true if the point lies after the region else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected boolean isBefore(int x, int y, Rectangle innerAlloc) {

    /**
     * Determines if a point falls before an allocated region.
     *
     * @param x the X coordinate &gt;= 0
     * @param y the Y coordinate &gt;= 0
     * @param innerAlloc the allocated region; this is the area
     *   inside of the insets
     * @return true if the point lies before the region else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected boolean isAllocationValid() {

    /**
     * Are the allocations for the children still
     * valid?
     *
     * @return true if allocations still valid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return   the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return  the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return   the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public float getAlignment(int axis) {

    /**
     * Determines the desired alignment for this view along an
     * axis.  This is implemented to give the total alignment
     * needed to position the children with the alignment points
     * lined up along the axis orthogonal to the axis that is
     * being tiled.  The axis being tiled will request to be
     * centered (i.e. 0.5f).
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *   or <code>View.Y_AXIS</code>
     * @return the desired alignment &gt;= 0.0f &amp;&amp; &lt;= 1.0f; this should
     *   be a value between 0.0 and 1.0 where 0 indicates alignment at the
     *   origin and 1.0 indicates alignment to the full span
     *   away from the origin; an alignment of 0.5 would be the
     *   center of the view
     * @exception IllegalArgumentException for an invalid axis
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public int viewToModel(float x, float y, Shape a, Position.Bias[] bias) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param x   x coordinate of the view location to convert &gt;= 0
     * @param y   y coordinate of the view location to convert &gt;= 0
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point in the view &gt;= 0
     * @see View#viewToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.  This makes
     * sure the allocation is valid before calling the superclass.
     *
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does
     *  not represent a valid location in the associated document
     * @see View#modelToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public Shape getChildAllocation(int index, Shape a) {

    /**
     * Fetches the allocation for the given child view.
     * This enables finding out where various views
     * are located.  This is implemented to return
     * <code>null</code> if the layout is invalid,
     * otherwise the superclass behavior is executed.
     *
     * @param index the index of the child, &gt;= 0 &amp;&amp; &gt; getViewCount()
     * @param a  the allocation to this view
     * @return the allocation to the child; or <code>null</code>
     *          if <code>a</code> is <code>null</code>;
     *          or <code>null</code> if the layout is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void paint(Graphics g, Shape allocation) {

    /**
     * Renders the <code>BoxView</code> using the given
     * rendering surface and area
     * on that surface.  Only the children that intersect
     * the clip bounds of the given <code>Graphics</code>
     * will be rendered.
     *
     * @param g the rendering surface to use
     * @param allocation the allocated region to render into
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void setSize(float width, float height) {

    /**
     * Sets the size of the view.  This should cause
     * layout of the view if the view caches any layout
     * information.  This is implemented to call the
     * layout method with the sizes inside of the insets.
     *
     * @param width the width &gt;= 0
     * @param height the height &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    float getSpanOnAxis(int axis) {

    /**
     * Returns the size of the view along an axis.  This is implemented
     * to return zero.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *          <code>View.Y_AXIS</code>
     * @return the current span of the view along the given axis, >= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    void updateChildSizes() {

    /**
     * Propagates the current allocations to the child views.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    void setSpanOnAxis(int axis, float span) {

    /**
     * Sets the size of the view along an axis.  This should cause
     * layout of the view along the given axis.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *          <code>View.Y_AXIS</code>
     * @param span the span to layout to >= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public int getResizeWeight(int axis) {

    /**
     * Gets the resize weight.  A value of 0 or less is not resizable.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *          <code>View.Y_AXIS</code>
     * @return the weight
     * @exception IllegalArgumentException for an invalid axis
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void preferenceChanged(View child, boolean width, boolean height) {

    /**
     * This is called by a child to indicate its
     * preferred span has changed.  This is implemented to
     * throw away cached layout information so that new
     * calculations will be done the next time the children
     * need an allocation.
     *
     * @param child the child view
     * @param width true if the width preference should change
     * @param height true if the height preference should change
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void forwardUpdate(DocumentEvent.ElementChange ec,
                                 DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Forwards the given <code>DocumentEvent</code> to the child views
     * that need to be notified of the change to the model.
     * If a child changed its requirements and the allocation
     * was valid prior to forwarding the portion of the box
     * from the starting child to the end of the box will
     * be repainted.
     *
     * @param ec changes to the element this view is responsible
     *  for (may be <code>null</code> if there were no changes)
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see #insertUpdate
     * @see #removeUpdate
     * @see #changedUpdate
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    int[] updateLayoutArray(int[] oldArray, int offset, int nInserted) {

    /**
     * Resizes the given layout array to match the new number of
     * child views.  The current number of child views are used to
     * produce the new array.  The contents of the old array are
     * inserted into the new array at the appropriate places so that
     * the old layout information is transferred to the new array.
     *
     * @param oldArray the original layout array
     * @param offset location where new views will be inserted
     * @param nInserted the number of child views being inserted;
     *          therefore the number of blank spaces to leave in the
     *          new array at location <code>offset</code>
     * @return the new layout array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void replace(int index, int length, View[] elems) {

    /**
     * Invalidates the layout and resizes the cache of
     * requests/allocations.  The child allocations can still
     * be accessed for the old layout, but the new children
     * will have an offset and span of 0.
     *
     * @param index the starting index into the child views to insert
     *   the new views; this should be a value &gt;= 0 and &lt;= getViewCount
     * @param length the number of existing child views to remove;
     *   This should be a value &gt;= 0 and &lt;= (getViewCount() - offset)
     * @param elems the child views to add; this value can be
     *   <code>null</code>to indicate no children are being added
     *   (useful to remove)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected void paintChild(Graphics g, Rectangle alloc, int index) {

    /**
     * Paints a child.  By default
     * that is all it does, but a subclass can use this to paint
     * things relative to the child.
     *
     * @param g the graphics context
     * @param alloc the allocated region to paint into
     * @param index the child index, &gt;= 0 &amp;&amp; &lt; getViewCount()
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    protected boolean isLayoutValid(int axis) {

    /**
     * Determines if the layout is valid along the given axis.
     *
     * @param axis either <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void layoutChanged(int axis) {

    /**
     * Invalidates the layout along an axis.  This happens
     * automatically if the preferences have changed for
     * any of the child views.  In some cases the layout
     * may need to be recalculated when the preferences
     * have not changed.  The layout can be marked as
     * invalid by calling this method.  The layout will
     * be updated the next time the <code>setSize</code> method
     * is called on this view (typically in paint).
     *
     * @param axis either <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public void setAxis(int axis) {

    /**
     * Sets the tile axis property.  This is the axis along which
     * the child views are tiled.
     *
     * @param axis either <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public int getAxis() {

    /**
     * Fetches the tile axis property.  This is the axis along which
     * the child views are tiled.
     *
     * @return the major axis of the box, either
     *  <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
    public BoxView(Element elem, int axis) {

    /**
     * Constructs a <code>BoxView</code>.
     *
     * @param elem the element this view is responsible for
     * @param axis either <code>View.X_AXIS</code> or <code>View.Y_AXIS</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/BoxView.java
public class BoxView extends CompositeView {

/**
 * A view that arranges its children into a box shape by tiling
 * its children along an axis.  The box is somewhat like that
 * found in TeX where there is alignment of the
 * children, flexibility of the children is considered, etc.
 * This is a building block that might be useful to represent
 * things like a collection of lines, paragraphs,
 * lists, columns, pages, etc.  The axis along which the children are tiled is
 * considered the major axis.  The orthogonal axis is the minor axis.
 * <p>
 * Layout for each axis is handled separately by the methods
 * <code>layoutMajorAxis</code> and <code>layoutMinorAxis</code>.
 * Subclasses can change the layout algorithm by
 * reimplementing these methods.    These methods will be called
 * as necessary depending upon whether or not there is cached
 * layout information and the cache is considered
 * valid.  These methods are typically called if the given size
 * along the axis changes, or if <code>layoutChanged</code> is
 * called to force an updated layout.  The <code>layoutChanged</code>
 * method invalidates cached layout information, if there is any.
 * The requirements published to the parent view are calculated by
 * the methods <code>calculateMajorAxisRequirements</code>
 * and  <code>calculateMinorAxisRequirements</code>.
 * If the layout algorithm is changed, these methods will
 * likely need to be reimplemented.
 *
 * @author  Timothy Prinzing
 */
