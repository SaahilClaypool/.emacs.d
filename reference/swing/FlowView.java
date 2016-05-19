_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected void childAllocation(int index, Rectangle a) {

        /**
         * Returns the allocation for a given child.
         * Implemented to do nothing, as the logical view doesn't
         * perform layout on the children.
         *
         * @param index the index of the child, &gt;= 0 &amp;&amp; &lt; getViewCount()
         * @param a  the allocation to the interior of the box on entry,
         *   and the allocation of the child view at the index on exit.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected View getViewAtPoint(int x, int y, Rectangle alloc) {

        /**
         * Fetches the child view at the given point.
         * Implemented to return null, as hit detection is not
         * performed on the logical view.
         *
         * @param x the X coordinate &gt;= 0
         * @param y the Y coordinate &gt;= 0
         * @param alloc the parent's allocation on entry, which should
         *   be changed to the child's allocation on exit
         * @return the child view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected boolean isAfter(int x, int y, Rectangle alloc) {

        /**
         * Tests whether a point lies after the rectangle range.
         * Implemented to return false, as hit detection is not
         * performed on the logical view.
         *
         * @param x the X coordinate &gt;= 0
         * @param y the Y coordinate &gt;= 0
         * @param alloc the rectangle
         * @return true if the point is after the specified range
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected boolean isBefore(int x, int y, Rectangle alloc) {

        /**
         * Tests whether a point lies before the rectangle range.
         * Implemented to return false, as hit detection is not
         * performed on the logical view.
         *
         * @param x the X coordinate &gt;= 0
         * @param y the Y coordinate &gt;= 0
         * @param alloc the rectangle
         * @return true if the point is before the specified range
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public void paint(Graphics g, Shape allocation) {

        /**
         * Renders using the given rendering surface and area on that
         * surface.  This is implemented to do nothing, the logical
         * view is never visible.
         *
         * @param g the rendering surface to use
         * @param allocation the allocated region to render into
         * @see View#paint
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        @Override

        /** {@inheritDoc} */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected void forwardUpdateToView(View v, DocumentEvent e,
                                           Shape a, ViewFactory f) {

        /**
         * Forward the DocumentEvent to the given child view.  This
         * is implemented to reparent the child to the logical view
         * (the children may have been parented by a row in the flow
         * if they fit without breaking) and then execute the superclass
         * behavior.
         *
         * @param v the child view to forward the event to.
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see #forwardUpdate
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public float getMinimumSpan(int axis) {

        /**
         * Determines the minimum span for this view along an
         * axis.  The is implemented to find the minimum unbreakable
         * span.
         *
         * @param axis may be either View.X_AXIS or View.Y_AXIS
         * @return  the span the view would like to be rendered into.
         *           Typically the view is told to render into the span
         *           that is returned, although there is no guarantee.
         *           The parent may choose to resize or break the view.
         * @see View#getPreferredSpan
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public float getPreferredSpan(int axis) {

        /**
         * Determines the preferred span for this view along an
         * axis.
         *
         * @param axis may be either View.X_AXIS or View.Y_AXIS
         * @return   the span the view would like to be rendered into.
         *           Typically the view is told to render into the span
         *           that is returned, although there is no guarantee.
         *           The parent may choose to resize or break the view.
         * @see View#getPreferredSpan
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  This view
         * isn't directly responsible for an element so it returns
         * the outer classes attributes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    static class LogicalView extends CompositeView {

    /**
     * This class can be used to represent a logical view for
     * a flow.  It keeps the children updated to reflect the state
     * of the model, gives the logical child views access to the
     * view hierarchy, and calculates a preferred span.  It doesn't
     * do any rendering, layout, or model/view translation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected View createView(FlowView fv, int startOffset, int spanLeft, int rowIndex) {

        /**
         * Creates a view that can be used to represent the current piece
         * of the flow.  This can be either an entire view from the
         * logical view, or a fragment of the logical view.
         *
         * @param fv the view holding the flow
         * @param startOffset the start location for the view being created
         * @param spanLeft the about of span left to fill in the row
         * @param rowIndex the row the view will be placed into
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected void adjustRow(FlowView fv, int rowIndex, int desiredSpan, int x) {

        /**
         * Adjusts the given row if possible to fit within the
         * layout span.  By default this will try to find the
         * highest break weight possible nearest the end of
         * the row.  If a forced break is encountered, the
         * break will be positioned there.
         *
         * @param rowIndex the row to adjust to the current layout
         *  span.
         * @param desiredSpan the current layout span &gt;= 0
         * @param x the location r starts at.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected int layoutRow(FlowView fv, int rowIndex, int pos) {

        /**
         * Creates a row of views that will fit within the
         * layout span of the row.  This is called by the layout method.
         * This is implemented to fill the row by repeatedly calling
         * the createView method until the available span has been
         * exhausted, a forced break was encountered, or the createView
         * method returned null.  If the remaining span was exhausted,
         * the adjustRow method will be called to perform adjustments
         * to the row to try and make it fit into the given span.
         *
         * @param rowIndex the index of the row to fill in with views.  The
         *   row is assumed to be empty on entry.
         * @param pos  The current position in the children of
         *   this views element from which to start.
         * @return the position to start the next row
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public void layout(FlowView fv) {

        /**
         * Update the flow on the given FlowView.  By default, this causes
         * all of the rows (child views) to be rebuilt to match the given
         * constraints for each row.  This is called by a FlowView.layout
         * to update the child views in the flow.
         *
         * @param fv the view to reflow
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        protected View getLogicalView(FlowView fv) {

        /**
         * This method gives flow strategies access to the logical
         * view of the FlowView.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public void changedUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

        /**
         * Gives notification from the document that attributes were changed
         * in a location that this view is responsible for.
         *
         * @param fv     the <code>FlowView</code> containing the changes
         * @param e      the <code>DocumentEvent</code> describing the changes
         *               done to the Document
         * @param alloc  Bounds of the View
         * @see View#changedUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public void removeUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

        /**
         * Gives notification that something was removed from the document
         * in a location that the given flow view is responsible for.
         *
         * @param e the change information from the associated document
         * @param alloc the current allocation of the view inside of the insets.
         * @see View#removeUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
        public void insertUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

        /**
         * Gives notification that something was inserted into the document
         * in a location that the given flow view is responsible for.  The
         * strategy should update the appropriate changed region (which
         * depends upon the strategy used for repair).
         *
         * @param e the change information from the associated document
         * @param alloc the current allocation of the view inside of the insets.
         *   This value will be null if the view has not yet been displayed.
         * @see View#insertUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public static class FlowStrategy {

    /**
     * Strategy for maintaining the physical form
     * of the flow.  The default implementation is
     * completely stateless, and recalculates the
     * entire flow if the layout is invalid on the
     * given FlowView.  Alternative strategies can
     * be implemented by subclassing, and might
     * perform incremental repair to the layout
     * or alternative breaking behavior.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected FlowStrategy strategy;

    /**
     * The behavior for keeping the flow updated.  By
     * default this is a singleton shared by all instances
     * of FlowView (FlowStrategy is stateless).  Subclasses
     * can create an alternative strategy, which might keep
     * state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected View layoutPool;

    /**
     * These are the views that represent the child elements
     * of the element this view represents (The logical view
     * to translate to a physical view).  These are not
     * directly children of this view.  These are either
     * placed into the rows directly or used for the purpose
     * of breaking into smaller chunks, to form the physical
     * view.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected int layoutSpan;

    /**
     * Default constraint against which the flow is
     * created against.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public void setParent(View parent) {

    /** {@inheritDoc} */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate requirements along the minor axis.  This
     * is implemented to forward the request to the logical
     * view by calling getMinimumSpan, getPreferredSpan, and
     * getMaximumSpan on it.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected void layout(int width, int height) {

    /**
     * Lays out the children.  If the span along the flow
     * axis has changed, layout is marked as invalid which
     * which will cause the superclass behavior to recalculate
     * the layout along the box axis.  The FlowStrategy.layout
     * method will be called to rebuild the flow rows as
     * appropriate.  If the height of this view changes
     * (determined by the preferred size along the box axis),
     * a preferenceChanged is called.  Following all of that,
     * the normal box layout of the superclass is performed.
     *
     * @param width  the width to lay out against &gt;= 0.  This is
     *   the width inside of the inset area.
     * @param height the height to lay out against &gt;= 0 This
     *   is the height inside of the inset area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected void loadChildren(ViewFactory f) {

    /**
     * Loads all of the children to initialize the view.
     * This is called by the <code>setParent</code> method.
     * This is reimplemented to not load any children directly
     * (as they are created in the process of formatting).
     * If the layoutPool variable is null, an instance of
     * LogicalView is created to represent the logical view
     * that is used in the process of formatting.
     *
     * @param f the view factory
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    protected abstract View createRow();

    /**
     * Create a View that should be used to hold a
     * a rows worth of children in a flow.  This is
     * called by the FlowStrategy when new children
     * are added or removed (i.e. rows are added or
     * removed) in the process of updating the flow.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public int getFlowStart(int index) {

    /**
     * Fetch the location along the flow axis that the
     * flow span will start at.  This is called by the
     * FlowStrategy while it is updating the flow.
     * A flow can be shaped by providing different values
     * for the row constraints.

     * @param index the index of the row being updated.
     *   This should be a value &gt;= 0 and &lt; getViewCount().
     * @see #getFlowSpan
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public int getFlowSpan(int index) {

    /**
     * Fetch the constraining span to flow against for
     * the given child index.  This is called by the
     * FlowStrategy while it is updating the flow.
     * A flow can be shaped by providing different values
     * for the row constraints.  By default, the entire
     * span inside of the insets along the flow axis
     * is returned.
     *
     * @param index the index of the row being updated.
     *   This should be a value &gt;= 0 and &lt; getViewCount().
     * @see #getFlowStart
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public int getFlowAxis() {

    /**
     * Fetches the axis along which views should be
     * flowed.  By default, this will be the axis
     * orthogonal to the axis along which the flow
     * rows are tiled (the axis of the default flow
     * rows themselves).  This is typically used
     * by the <code>FlowStrategy</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
    public FlowView(Element elem, int axis) {

    /**
     * Constructs a FlowView for the given element.
     *
     * @param elem the element that this view is responsible for
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/FlowView.java
public abstract class FlowView extends BoxView {

/**
 * A View that tries to flow it's children into some
 * partially constrained space.  This can be used to
 * build things like paragraphs, pages, etc.  The
 * flow is made up of the following pieces of functionality.
 * <ul>
 * <li>A logical set of child views, which as used as a
 * layout pool from which a physical view is formed.
 * <li>A strategy for translating the logical view to
 * a physical (flowed) view.
 * <li>Constraints for the strategy to work against.
 * <li>A physical structure, that represents the flow.
 * The children of this view are where the pieces of
 * of the logical views are placed to create the flow.
 * </ul>
 *
 * @author  Timothy Prinzing
 * @see     View
 * @since 1.3
 */
