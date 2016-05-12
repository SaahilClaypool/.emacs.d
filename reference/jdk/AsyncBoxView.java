_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    class FlushTask implements Runnable {

    /**
     * Task to flush requirement changes upward
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public boolean isLayoutValid() {

        /**
         * Has the child view been laid out.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public void preferenceChanged(boolean width, boolean height) {

        /**
         * Mark preferences changed for this child.
         *
         * @param width true if the width preference has changed
         * @param height true if the height preference has changed
         * @see javax.swing.JComponent#revalidate
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public void setMajorOffset(float offs) {

        /**
         * This method should only be called by the ChildLocator,
         * it is simply a convenient place to hold the cached
         * location.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public float getMajorOffset() {

        /**
         * Get the offset along the major axis
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public float getMajorSpan() {

        /**
         * What is the span along the major axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public float getMinorOffset() {

        /**
         * What is the offset along the minor axis
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public float getMinorSpan() {

        /**
         * What is the span along the minor axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public void run () {

        /**
         * Update the child state.  This should be
         * called by the thread that desires to spend
         * time updating the child state (intended to
         * be the layout thread).
         * <p>
         * This acquires a read lock on the associated
         * document for the duration of the update to
         * ensure the model is not changed while it is
         * operating.  The first thing to do would be
         * to see if any work actually needs to be done.
         * The following could have conceivably happened
         * while the state was waiting to be updated:
         * <ol>
         * <li>The child may have been removed from the
         * view hierarchy.
         * <li>The child may have been updated by a
         * higher priority operation (i.e. the child
         * may have become visible).
         * </ol>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public View getChildView() {

        /**
         * Fetch the child view this record represents
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public ChildState(View v) {

        /**
         * Construct a child status.  This needs to start
         * out as fairly large so we don't falsely begin with
         * the idea that all of the children are visible.
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public class ChildState implements Runnable {

    /**
     * A record representing the layout state of a
     * child view.  It is runnable as a task on another
     * thread.  All access to the child view that is
     * based upon a read-lock on the model should synchronize
     * on this object (i.e. The layout thread and the GUI
     * thread can both have a read lock on the model at the
     * same time and are not protected from each other).
     * Access to a child view hierarchy is serialized via
     * synchronization on the ChildState instance.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected Rectangle childAlloc;

        /**
         * A shape to use for the child allocation to avoid
         * creating a lot of garbage.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected Rectangle lastAlloc;

        /**
         * The last seen allocation (for repainting when changes
         * are flushed upward).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected ChildState lastValidOffset;

        /**
         * The location of the last offset calculation
         * that is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        void updateChildOffsetsToIndex(int index) {

        /**
         * Move the location of the last offset calculation forward
         * to the desired index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        int updateChildOffsets(float targetOffset) {

        /**
         * Move the location of the last offset calculation forward
         * to the desired offset.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected int getViewIndexAtVisualOffset(float targetOffset) {

        /**
         * Locate the view responsible for an offset into the box
         * along the major axis.  Make sure that offsets are set
         * on the ChildState objects up to the given target span
         * past the desired offset.
         *
         * @return   index of the view representing the given visual
         *   location (targetOffset), or -1 if no view represents
         *   that location
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected void setAllocation(Shape a) {

        /**
         * Copy the currently allocated shape into the Rectangle
         * used to store the current allocation.  This would be
         * a floating point rectangle in a Java2D-specific implementation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        protected Shape getChildAllocation(int index) {

        /**
         * Fetch the allocation to use for a child view.
         * <em>This does not update the offsets in the ChildState
         * records.</em>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public int getViewIndexAtPoint(float x, float y, Shape a) {

        /**
         * Fetches the child view index at the given point.
         * This is called by the various View methods that
         * need to calculate which child to forward a message
         * to.  This should be called by a block synchronized
         * on this object, and would typically be followed
         * with one or more calls to getChildAllocation that
         * should also be in the synchronized block.
         *
         * @param x the X coordinate &gt;= 0
         * @param y the Y coordinate &gt;= 0
         * @param a the allocation to the View
         * @return the nearest child index
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public synchronized Shape getChildAllocation(int index, Shape a) {

        /**
         * Fetch the allocation to use for a child view.
         * This will update the offsets for all children
         * not yet updated before the given index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public synchronized void paintChildren(Graphics g) {

        /**
         * Paint the children that intersect the clip area.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public synchronized void childChanged(ChildState cs) {

        /**
         * Notification that a child changed.  This can effect
         * whether or not new offset calculations are needed.
         * This is called by a ChildState object that has
         * changed it's major span.  This can therefore be
         * called by multiple threads.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
        public ChildLocator() {

        /**
         * construct a child locator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public class ChildLocator {

    /**
     * A class to manage the effective position of the
     * child views in a localized area while changes are
     * being made around the localized area.  The AsyncBoxView
     * may be continuously changing, but the visible area
     * needs to remain fairly stable until the layout thread
     * decides to publish an update to the parent.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    ChildState changing;

    /**
     * Child that is actively changing size.  This often
     * causes a preferenceChanged, so this is a cache to
     * possibly speed up the marking the state.  It also
     * helps flag an opportunity to avoid adding to flush
     * task to the layout queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected ChildLocator locator;

    /**
     * Object that manages the offsets of the
     * children.  All locking for management of
     * child locations is on this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    float minorSpan;

    /**
     * Current span along the minor axis.  This
     * is what layout was done against (i.e. things
     * are flexible in this direction).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    boolean estimatedMajorSpan;

    /**
     * Is the span along the major axis estimated?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    float majorSpan;

    /**
     * Current span along the major axis.  This
     * is also the value returned by getMinimumSize,
     * getPreferredSize, and getMaximumSize along
     * the major axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    List<ChildState> stats;

    /**
     * The children and their layout statistics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    int axis;

    /**
     * The major axis against which the children are
     * tiled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int getNextVisualPositionFrom(int pos, Position.Bias b, Shape a,
                                         int direction,
                                         Position.Bias[] biasRet)

    /**
     * Provides a way to determine the next visually represented model
     * location that one might place a caret.  Some views may not be visible,
     * they might not be in the same order found in the model, or they just
     * might not allow access to some of the locations in the model.
     * This method enables specifying a position to convert
     * within the range of &gt;=0.  If the value is -1, a position
     * will be calculated automatically.  If the value &lt; -1,
     * the {@code BadLocationException} will be thrown.
     *
     * @param pos the position to convert
     * @param a the allocated region to render into
     * @param direction the direction from the current position that can
     *  be thought of as the arrow keys typically found on a keyboard;
     *  this may be one of the following:
     *  <ul style="list-style-type:none">
     *  <li><code>SwingConstants.WEST</code></li>
     *  <li><code>SwingConstants.EAST</code></li>
     *  <li><code>SwingConstants.NORTH</code></li>
     *  <li><code>SwingConstants.SOUTH</code></li>
     *  </ul>
     * @param biasRet an array contain the bias that was checked
     * @return the location within the model that best represents the next
     *  location visual position
     * @exception BadLocationException the given position is not a valid
     *                                 position within the document
     * @exception IllegalArgumentException if <code>direction</code> is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int viewToModel(float x, float y, Shape a, Position.Bias[] biasReturn) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.  The biasReturn argument will be
     * filled in to indicate that the point given is closer to the next
     * character in the model or the previous character in the model.
     * <p>
     * This is expected to be called by the GUI thread, holding a
     * read-lock on the associated model.  It is implemented to
     * locate the child view and determine it's allocation with a
     * lock on the ChildLocator object, and to call viewToModel
     * on the child view with a lock on the ChildState object
     * to avoid interaction with the layout thread.
     *
     * @param x the X coordinate &gt;= 0
     * @param y the Y coordinate &gt;= 0
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point in the view &gt;= 0.  The biasReturn argument will be
     * filled in to indicate that the point given is closer to the next
     * character in the model or the previous character in the model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @param b the bias toward the previous character or the
     *  next character represented by the offset, in case the
     *  position is a boundary of two views.
     * @return the bounding box of the given position is returned
     * @exception BadLocationException  if the given position does
     *   not represent a valid location in the associated document
     * @exception IllegalArgumentException for an invalid bias argument
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int getViewIndex(int pos, Position.Bias b) {

    /**
     * Returns the child view index representing the given position in
     * the model.  By default a view has no children so this is implemented
     * to return -1 to indicate there is no valid child index for any
     * position.
     *
     * @param pos the position &gt;= 0
     * @return  index of the view representing the given position, or
     *   -1 if no view represents that position
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public Shape getChildAllocation(int index, Shape a) {

    /**
     * Fetches the allocation for the given child view.
     * This enables finding out where various views
     * are located, without assuming the views store
     * their location.  This returns null since the
     * default is to not have any child views.
     *
     * @param index the index of the child, &gt;= 0 &amp;&amp; &lt; getViewCount()
     * @param a  the allocation to this view.
     * @return the allocation to the child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public View getView(int n) {

    /**
     * Gets the nth child view.  Since there are no
     * children by default, this returns null.
     *
     * @param n the number of the view to get, &gt;= 0 &amp;&amp; &lt; getViewCount()
     * @return the view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int getViewCount() {

    /**
     * Returns the number of views in this view.  Since
     * the default is to not be a composite view this
     * returns 0.
     *
     * @return the number of views &gt;= 0
     * @see View#getViewCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return  the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
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
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void paint(Graphics g, Shape alloc) {

    /**
     * Render the view using the given allocation and
     * rendering surface.
     * <p>
     * This is implemented to determine whether or not the
     * desired region to be rendered (i.e. the unclipped
     * area) is up to date or not.  If up-to-date the children
     * are rendered.  If not up-to-date, a task to build
     * the desired area is placed on the layout queue as
     * a high priority task.  This keeps by event thread
     * moving by rendering if ready, and postponing until
     * a later time if not ready (since paint requests
     * can be rescheduled).
     *
     * @param g the rendering surface to use
     * @param alloc the allocated region to render into
     * @see View#paint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    void setSpanOnAxis(int axis, float span) {

    /**
     * Sets the size of the view along an axis.  Since the major
     * axis is updated asynchronously and should be the sum of the
     * tiled children the call is ignored for the major axis.  Since
     * the minor axis is flexible, work is queued to resize the
     * children if the minor span changes.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *          <code>View.Y_AXIS</code>
     * @param span the span to layout to >= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    float getSpanOnAxis(int axis) {

    /**
     * Retrieves the size of the view along an axis.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *          <code>View.Y_AXIS</code>
     * @return the current span of the view along the given axis, >= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setSize(float width, float height) {

    /**
     * Sets the size of the view.  This should cause
     * layout of the view if the view caches any layout
     * information.
     * <p>
     * Since the major axis is updated asynchronously and should be
     * the sum of the tiled children the call is ignored for the major
     * axis.  Since the minor axis is flexible, work is queued to resize
     * the children if the minor span changes.
     *
     * @param width the width &gt;= 0
     * @param height the height &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public synchronized void preferenceChanged(View child, boolean width, boolean height) {

    /**
     * Child views can call this on the parent to indicate that
     * the preference has changed and should be reconsidered
     * for layout.  This is reimplemented to queue new work
     * on the layout thread.  This method gets messaged from
     * multiple threads via the children.
     *
     * @param child the child view
     * @param width true if the width preference has changed
     * @param height true if the height preference has changed
     * @see javax.swing.JComponent#revalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setParent(View parent) {

    /**
     * Sets the parent of the view.
     * This is reimplemented to provide the superclass
     * behavior as well as calling the <code>loadChildren</code>
     * method if this view does not already have children.
     * The children should not be loaded in the
     * constructor because the act of setting the parent
     * may cause them to try to search up the hierarchy
     * (to get the hosting Container for example).
     * If this view has children (the view is being moved
     * from one place in the view hierarchy to another),
     * the <code>loadChildren</code> method will not be called.
     *
     * @param parent the parent of the view, null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected void updateLayout(DocumentEvent.ElementChange ec,
                                    DocumentEvent e, Shape a) {

    /**
     * Update the layout in response to receiving notification of
     * change from the model.  This is implemented to note the
     * change on the ChildLocator so that offsets of the children
     * will be correctly computed.
     *
     * @param ec changes to the element this view is responsible
     *  for (may be null if there were no changes).
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @see #insertUpdate
     * @see #removeUpdate
     * @see #changedUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected synchronized int getViewIndexAtPosition(int pos, Position.Bias b) {

    /**
     * Fetches the child view index representing the given position in
     * the model.  This is implemented to fetch the view in the case
     * where there is a child view for each child element.
     *
     * @param pos the position &gt;= 0
     * @return  index of the view representing the given position, or
     *   -1 if no view represents that position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected void loadChildren(ViewFactory f) {

    /**
     * Loads all of the children to initialize the view.
     * This is called by the {@link #setParent setParent}
     * method.  Subclasses can reimplement this to initialize
     * their child views in a different manner.  The default
     * implementation creates a child view for each
     * child element.
     * <p>
     * Normally a write-lock is held on the Document while
     * the children are being changed, which keeps the rendering
     * and layout threads safe.  The exception to this is when
     * the view is initialized to represent an existing element
     * (via this method), so it is synchronized to exclude
     * preferenceChanged while we are initializing.
     *
     * @param f the view factory
     * @see #setParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void replace(int offset, int length, View[] views) {

    /**
     * Calls the superclass to update the child views, and
     * updates the status records for the children.  This
     * is expected to be called while a write lock is held
     * on the model so that interaction with the layout
     * thread will not happen (i.e. the layout thread
     * acquires a read lock before doing anything).
     *
     * @param offset the starting offset into the child views &gt;= 0
     * @param length the number of existing views to replace &gt;= 0
     * @param views the child views to insert
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected void flushRequirementChanges() {

    /**
     * Publish the changes in preferences upward to the parent
     * view.  This is normally called by the layout thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected synchronized void minorRequirementChange(ChildState cs) {

    /**
     * Requirements changed along the minor axis.
     * This is called by the thread doing layout for
     * the given ChildState object when it has completed
     * fetching the child views new preferences.
     * Typically this would be the layout thread, but
     * might be the GUI thread if it is trying to update
     * something immediately (such as to perform a
     * model/view translation).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected synchronized void majorRequirementChange(ChildState cs, float delta) {

    /**
     * Requirements changed along the major axis.
     * This is called by the thread doing layout for
     * the given ChildState object when it has completed
     * fetching the child views new preferences.
     * Typically this would be the layout thread, but
     * might be the event thread if it is trying to update
     * something immediately (such as to perform a
     * model/view translation).
     * <p>
     * This is implemented to mark the major axis as having
     * changed so that a future check to see if the requirements
     * need to be published to the parent view will consider
     * the major axis.  If the span along the major axis is
     * not estimated, it is updated by the given delta to reflect
     * the incremental change.  The delta is ignored if the
     * major span is estimated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected ChildState createChildState(View v) {

    /**
     * New ChildState records are created through
     * this method to allow subclasses the extend
     * the ChildState records to do/hold more
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected LayoutQueue getLayoutQueue() {

    /**
     * Fetch the queue to use for layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected ChildState getChildState(int index) {

    /**
     * Fetch the object representing the layout state of
     * of the child at the given index.
     *
     * @param index the child index.  This should be a
     *   value &gt;= 0 and &lt; getViewCount().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected boolean getEstimatedMajorSpan() {

    /**
     * Is the major span currently estimated?
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected void setEstimatedMajorSpan(boolean isEstimated) {

    /**
     * Set the estimatedMajorSpan property that determines if the
     * major span should be treated as being estimated.  If this
     * property is true, the value of setSize along the major axis
     * will change the requirements along the major axis and incremental
     * changes will be ignored until all of the children have been updated
     * (which will cause the property to automatically be set to false).
     * If the property is false the value of the majorSpan will be
     * considered to be accurate and incremental changes will be
     * added into the total as they are calculated.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    protected float getInsetSpan(int axis) {

    /**
     * Fetch the span along an axis that is taken up by the insets.
     *
     * @param axis the axis to determine the total insets along,
     *  either X_AXIS or Y_AXIS.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setRightInset(float i) {

    /**
     * Set the right part of the margin around the view.
     *
     * @param i the value of the inset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getRightInset() {

    /**
     * Get the right part of the margin around the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setLeftInset(float i) {

    /**
     * Set the left part of the margin around the view.
     *
     * @param i the value of the inset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getLeftInset() {

    /**
     * Get the left part of the margin around the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setBottomInset(float i) {

    /**
     * Set the bottom part of the margin around the view.
     *
     * @param i the value of the inset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getBottomInset() {

    /**
     * Get the bottom part of the margin around the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public void setTopInset(float i) {

    /**
     * Set the top part of the margin around the view.
     *
     * @param i the value of the inset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public float getTopInset() {

    /**
     * Get the top part of the margin around the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int getMinorAxis() {

    /**
     * Fetch the minor axis (the axis orthogonal
     * to the tiled axis).  This will have a value of
     * either X_AXIS or Y_AXIS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public int getMajorAxis() {

    /**
     * Fetch the major axis (the axis the children
     * are tiled along).  This will have a value of
     * either X_AXIS or Y_AXIS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
    public AsyncBoxView(Element elem, int axis) {

    /**
     * Construct a box view that does asynchronous layout.
     *
     * @param elem the element of the model to represent
     * @param axis the axis to tile along.  This can be
     *  either X_AXIS or Y_AXIS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AsyncBoxView.java
public class AsyncBoxView extends View {

/**
 * A box that does layout asynchronously.  This
 * is useful to keep the GUI event thread moving by
 * not doing any layout on it.  The layout is done
 * on a granularity of operations on the child views.
 * After each child view is accessed for some part
 * of layout (a potentially time consuming operation)
 * the remaining tasks can be abandoned or a new higher
 * priority task (i.e. to service a synchronous request
 * or a visible area) can be taken on.
 * <p>
 * While the child view is being accessed
 * a read lock is acquired on the associated document
 * so that the model is stable while being accessed.
 *
 * @author  Timothy Prinzing
 * @since   1.3
 */
