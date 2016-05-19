_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification from the document that attributes were changed
         * in a location that this view is responsible for.
         * If the zone has been loaded, the superclass behavior is
         * invoked, otherwise this does nothing.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see View#removeUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void removeUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was removed from the document
         * in a location that this view is responsible for.
         * If the zone has been loaded, the superclass behavior is
         * invoked, otherwise this does nothing.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see View#removeUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void insertUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was inserted into
         * the document in a location that this view is responsible for.
         * If the zone has been loaded, the superclass behavior is
         * invoked, otherwise this does nothing.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see View#insertUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public int getEndOffset() {

        /**
         * End of the zones range.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public int getStartOffset() {

        /**
         * Start of the zones range.
         *
         * @see View#getStartOffset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.  This is
         * implemented to provide the superclass behavior after first
         * making sure the zone is loaded (The zone must be loaded to
         * make this calculation).
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public int viewToModel(float x, float y, Shape a, Position.Bias[] bias) {

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.  This is implemented to first
         * make sure the zone is loaded before providing the superclass
         * behavior.
         *
         * @param x   x coordinate of the view location to convert >= 0
         * @param y   y coordinate of the view location to convert >= 0
         * @param a the allocated region to render into
         * @return the location within the model that best represents the
         *  given point in the view >= 0
         * @see View#viewToModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void paint(Graphics g, Shape a) {

        /**
         * Renders using the given rendering surface and area on that
         * surface.  This is implemented to load the zone if its not
         * already loaded, and then perform the superclass behavior.
         *
         * @param g the rendering surface to use
         * @param a the allocated region to render into
         * @see View#paint
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  This view
         * isn't directly responsible for an element so it returns
         * the outer classes attributes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public int getViewIndex(int pos, Position.Bias b) {

        /**
         * Returns the child view index representing the given position in
         * the model.  Since the zone contains a cluster of the overall
         * set of child elements, we can determine the index fairly
         * quickly from the model by subtracting the index of the
         * start offset from the index of the position given.
         *
         * @param pos the position >= 0
         * @return  index of the view representing the given position, or
         *   -1 if no view represents that position
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        protected void flushRequirementChanges() {

        /**
         * Publish the changes in preferences upward to the parent
         * view.
         * <p>
         * This is reimplemented to stop the superclass behavior
         * if the zone has not yet been loaded.  If the zone is
         * unloaded for example, the last seen major span is the
         * best estimate and a calculated span for no children
         * is undesirable.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        protected void loadChildren(ViewFactory f) {

        /**
         * This method is reimplemented to not build the children
         * since the children are created when the zone is loaded
         * rather then when it is placed in the view hierarchy.
         * The major span is estimated at this point by building
         * the first child (but not storing it), and calling
         * setEstimatedMajorSpan(true) followed by setSpan for
         * the major axis with the estimated span.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public boolean isLoaded() {

        /**
         * Determines if the zone is in the loaded state
         * or not.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void unload() {

        /**
         * Removes the child views and returns to a
         * state of unloaded.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
        public void load() {

        /**
         * Creates the child views and populates the
         * zone with them.  This is done by translating
         * the positions to child element index locations
         * and building views to those elements.  If the
         * zone is already loaded, this does nothing.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    class Zone extends AsyncBoxView {

    /**
     * Internally created view that has the purpose of holding
     * the views that represent the children of the ZoneView
     * that have been arranged in a zone.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public void removeUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was removed from the document
     * in a location that this view is responsible for.  This is largely
     * delegated to the superclass, but is reimplemented to update the
     * relevant zones (i.e. determine if zones need to be removed or
     * joined with another zone).
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#removeUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public void insertUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was inserted into the document
     * in a location that this view is responsible for.  This is largely
     * delegated to the superclass, but is reimplemented to update the
     * relevant zone (i.e. determine if a zone needs to be split into a
     * set of 2 or more zones).
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#insertUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected boolean updateChildren(DocumentEvent.ElementChange ec,
                                     DocumentEvent e, ViewFactory f) {

    /**
     * The superclass behavior will try to update the child views
     * which is not desired in this case, since the children are
     * zones and not directly effected by the changes to the
     * associated element.  This is reimplemented to do nothing
     * and return false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    int getDesiredZoneEnd(int pos) {

    /**
     * Returns the zone position to use for the
     * end of a zone that starts at the given
     * position.  By default this returns something
     * close to half the max zone size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    void splitZone(int index, int offs0, int offs1) {

    /**
     * Break up the zone at the given index into pieces
     * of an acceptable size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected int getViewIndexAtPosition(int pos) {

    /**
     * Returns the child view index representing the given position in
     * the model.
     *
     * @param pos the position &gt;= 0
     * @return  index of the view representing the given position, or
     *   -1 if no view represents that position
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected void loadChildren(ViewFactory f) {

    /**
     * Loads all of the children to initialize the view.
     * This is called by the <code>setParent</code> method.
     * This is reimplemented to not load any children directly
     * (as they are created by the zones).  This method creates
     * the initial set of zones.  Zones don't actually get
     * populated however until an attempt is made to display
     * them or to do model/view coordinate translation.
     *
     * @param f the view factory
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected View createZone(int p0, int p1) {

    /**
     * Create a view to represent a zone for the given
     * range within the model (which should be within
     * the range of this objects responsibility).  This
     * is called by the zone management logic to create
     * new zones.  Subclasses can provide a different
     * implementation for a zone by changing this method.
     *
     * @param p0 the start of the desired zone.  This should
     *  be &gt;= getStartOffset() and &lt; getEndOffset().  This
     *  value should also be &lt; p1.
     * @param p1 the end of the desired zone.  This should
     *  be &gt; getStartOffset() and &lt;= getEndOffset().  This
     *  value should also be &gt; p0.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected boolean isZoneLoaded(View zone) {

    /**
     * Determine if a zone is in the loaded state.
     * The zones are expected to represent a subset of the
     * child elements of the element this view is responsible for.
     * Therefore, the default implementation is to return
     * true if the view has children.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected void unloadZone(View zone) {

    /**
     * Unload a zone (Convert the zone to its memory saving state).
     * The zones are expected to represent a subset of the
     * child elements of the element this view is responsible for.
     * Therefore, the default implementation is to simple remove
     * all the children.
     *
     * @param zone the child view desired to be set to an
     *  unloaded state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    protected void zoneWasLoaded(View zone) {

    /**
     * Called by a zone when it gets loaded.  This happens when
     * an attempt is made to display or perform a model/view
     * translation on a zone that was in an unloaded state.
     * This is implemented to check if the maximum number of
     * zones was reached and to unload the oldest zone if so.
     *
     * @param zone the child view that was just loaded.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public void setMaxZonesLoaded(int mzl) {

    /**
     * Sets the current setting of the number of zones
     * allowed to be loaded at the same time. This will throw an
     * <code>IllegalArgumentException</code> if <code>mzl</code> is less
     * than 1.
     *
     * @param mzl the desired maximum number of zones
     *  to be actively loaded, must be greater than 0
     * @exception IllegalArgumentException if <code>mzl</code> is &lt; 1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public int getMaxZonesLoaded() {

    /**
     * Get the current setting of the number of zones
     * allowed to be loaded at the same time.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public void setMaximumZoneSize(int size) {

    /**
     * Set the desired maximum zone size.  A
     * zone may get larger than this size if
     * a single child view is larger than this
     * size since zones are formed on child view
     * boundaries.
     *
     * @param size the number of characters the zone
     * may represent before attempting to break
     * the zone into a smaller size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public int getMaximumZoneSize() {

    /**
     * Get the current maximum zone size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
    public ZoneView(Element elem, int axis) {

    /**
     * Constructs a ZoneView.
     *
     * @param elem the element this view is responsible for
     * @param axis either View.X_AXIS or View.Y_AXIS
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/ZoneView.java
public class ZoneView extends BoxView {

/**
 * ZoneView is a View implementation that creates zones for which
 * the child views are not created or stored until they are needed
 * for display or model/view translations.  This enables a substantial
 * reduction in memory consumption for situations where the model
 * being represented is very large, by building view objects only for
 * the region being actively viewed/edited.  The size of the children
 * can be estimated in some way, or calculated asynchronously with
 * only the result being saved.
 * <p>
 * ZoneView extends BoxView to provide a box that implements
 * zones for its children.  The zones are special View implementations
 * (the children of an instance of this class) that represent only a
 * portion of the model that an instance of ZoneView is responsible
 * for.  The zones don't create child views until an attempt is made
 * to display them. A box shaped view is well suited to this because:
 *   <ul>
 *   <li>
 *   Boxes are a heavily used view, and having a box that
 *   provides this behavior gives substantial opportunity
 *   to plug the behavior into a view hierarchy from the
 *   view factory.
 *   <li>
 *   Boxes are tiled in one direction, so it is easy to
 *   divide them into zones in a reliable way.
 *   <li>
 *   Boxes typically have a simple relationship to the model (i.e. they
 *   create child views that directly represent the child elements).
 *   <li>
 *   Boxes are easier to estimate the size of than some other shapes.
 *   </ul>
 * <p>
 * The default behavior is controlled by two properties, maxZoneSize
 * and maxZonesLoaded.  Setting maxZoneSize to Integer.MAX_VALUE would
 * have the effect of causing only one zone to be created.  This would
 * effectively turn the view into an implementation of the decorator
 * pattern.  Setting maxZonesLoaded to a value of Integer.MAX_VALUE would
 * cause zones to never be unloaded.  For simplicity, zones are created on
 * boundaries represented by the child elements of the element the view is
 * responsible for.  The zones can be any View implementation, but the
 * default implementation is based upon AsyncBoxView which supports fairly
 * large zones efficiently.
 *
 * @author  Timothy Prinzing
 * @see     View
 * @since   1.3
 */
