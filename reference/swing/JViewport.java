_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of
         * the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected class AccessibleJViewport extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JViewport</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to viewport user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private boolean canUseWindowBlitter() {

    /**
     * Returns true if the viewport is not obscured by one of its ancestors,
     * or its ancestors children and if the viewport is showing. Blitting
     * when the view isn't showing will work,
     * or rather <code>copyArea</code> will work,
     * but will not produce the expected behavior.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private void paintView(Graphics g) {

    /**
     * Called to paint the view, usually when <code>blitPaint</code>
     * can not blit.
     *
     * @param g the <code>Graphics</code> context within which to paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private boolean windowBlitPaint(Graphics g) {

    /**
     * Used when blitting.
     *
     * @param g  the <code>Graphics</code> context within which to paint
     * @return true if blitting succeeded; otherwise false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private void flushViewDirtyRegion(Graphics g, Rectangle dirty) {

    /**
     * If the repaint manager has a dirty region for the view, the view is
     * asked to paint.
     *
     * @param g  the <code>Graphics</code> context within which to paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private boolean needsRepaintAfterBlit() {

    /**
     * Returns true if the component needs to be completely repainted after
     * a blit and a paint is received.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected void firePropertyChange(String propertyName, Object oldValue,
                                      Object newValue) {

    /**
     * Notifies listeners of a property change. This is subclassed to update
     * the <code>windowBlit</code> property.
     * (The <code>putClientProperty</code> property is final).
     *
     * @param propertyName a string containing the property name
     * @param oldValue the old value of the property
     * @param newValue  the new value of the property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JViewport</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JViewport</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void repaint(long tm, int x, int y, int w, int h) {

    /**
     * Always repaint in the parents coordinate system to make sure
     * only one paint is performed by the <code>RepaintManager</code>.
     *
     * @param     tm   maximum time in milliseconds before update
     * @param     x    the <code>x</code> coordinate (pixels over from left)
     * @param     y    the <code>y</code> coordinate (pixels down from top)
     * @param     w    the width
     * @param     h   the height
     * @see       java.awt.Component#update(java.awt.Graphics)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected void fireStateChanged()

    /**
     * Notifies all <code>ChangeListeners</code> when the views
     * size, position, or the viewports extent size has changed.
     *
     * @see #addChangeListener
     * @see #removeChangeListener
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this JViewport with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a <code>ChangeListener</code> from the list that's notified each
     * time the views size, position, or the viewports extent size
     * has changed.
     *
     * @param l the <code>ChangeListener</code> to remove
     * @see #addChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a <code>ChangeListener</code> to the list that is
     * notified each time the view's
     * size, position, or the viewport's extent size has changed.
     *
     * @param l the <code>ChangeListener</code> to add
     * @see #removeChangeListener
     * @see #setViewPosition
     * @see #setViewSize
     * @see #setExtentSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected LayoutManager createLayoutManager() {

    /**
     * Subclassers can override this to install a different
     * layout manager (or <code>null</code>) in the constructor.  Returns
     * the <code>LayoutManager</code> to install on the <code>JViewport</code>.
     *
     * @return a <code>LayoutManager</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected ViewListener createViewListener() {

    /**
     * Creates a listener for the view.
     * @return a <code>ViewListener</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected class ViewListener extends ComponentAdapter implements Serializable

    /**
     * A listener for the view.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setExtentSize(Dimension newExtent) {

    /**
     * Sets the size of the visible part of the view using view coordinates.
     *
     * @param newExtent  a <code>Dimension</code> object specifying
     *          the size of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Point toViewCoordinates(Point p) {

    /**
     * Converts a point in pixel coordinates to view coordinates.
     * Subclasses of viewport that support "logical coordinates"
     * will override this method.
     *
     * @param p  a <code>Point</code> object using pixel coordinates
     * @return a <code>Point</code> object converted to view coordinates
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Dimension toViewCoordinates(Dimension size) {

    /**
     * Converts a size in pixel coordinates to view coordinates.
     * Subclasses of viewport that support "logical coordinates"
     * will override this method.
     *
     * @param size  a <code>Dimension</code> object using pixel coordinates
     * @return a <code>Dimension</code> object converted to view coordinates
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    @Transient

    /**
     * Returns the size of the visible part of the view in view coordinates.
     *
     * @return a <code>Dimension</code> object giving the size of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected boolean computeBlit(
        int dx,
        int dy,
        Point blitFrom,
        Point blitTo,
        Dimension blitSize,
        Rectangle blitPaint)

    /**
     * Computes the parameters for a blit where the backing store image
     * currently contains <code>oldLoc</code> in the upper left hand corner
     * and we're scrolling to <code>newLoc</code>.
     * The parameters are modified
     * to return the values required for the blit.
     *
     * @param dx  the horizontal delta
     * @param dy  the vertical delta
     * @param blitFrom the <code>Point</code> we're blitting from
     * @param blitTo the <code>Point</code> we're blitting to
     * @param blitSize the <code>Dimension</code> of the area to blit
     * @param blitPaint the area to blit
     * @return  true if the parameters are modified and we're ready to blit;
     *          false otherwise
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Rectangle getViewRect() {

    /**
     * Returns a rectangle whose origin is <code>getViewPosition</code>
     * and size is <code>getExtentSize</code>.
     * This is the visible part of the view, in view coordinates.
     *
     * @return a <code>Rectangle</code> giving the visible part of
     *          the view using view coordinates.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setViewPosition(Point p)

    /**
     * Sets the view coordinates that appear in the upper left
     * hand corner of the viewport, does nothing if there's no view.
     *
     * @param p  a <code>Point</code> object giving the upper left coordinates
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Point getViewPosition() {

    /**
     * Returns the view coordinates that appear in the upper left
     * hand corner of the viewport, or 0,0 if there's no view.
     *
     * @return a <code>Point</code> object giving the upper left coordinates
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setViewSize(Dimension newSize) {

    /**
     * Sets the size of the view.  A state changed event will be fired.
     *
     * @param newSize a <code>Dimension</code> object specifying the new
     *          size of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Dimension getViewSize() {

    /**
     * If the view's size hasn't been explicitly set, return the
     * preferred size, otherwise return the view's current size.
     * If there is no view, return 0,0.
     *
     * @return a <code>Dimension</code> object specifying the size of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setView(Component view) {

    /**
     * Sets the <code>JViewport</code>'s one lightweight child
     * (<code>view</code>), which can be <code>null</code>.
     *
     * @param view the viewport's new lightweight child
     *
     * @see #getView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public Component getView() {

    /**
     * Returns the <code>JViewport</code>'s one child or <code>null</code>.
     *
     * @return the viewports child, or <code>null</code> if none exists
     *
     * @see #setView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    @Deprecated

    /**
     * If true if this viewport will maintain an offscreen
     * image of its contents.  The image is used to reduce the cost
     * of small one dimensional changes to the <code>viewPosition</code>.
     * Rather than repainting the entire viewport we use
     * <code>Graphics.copyArea</code> to effect some of the scroll.
     *
     * @param enabled if true, maintain an offscreen backing store
     *
     * @deprecated As of Java 2 platform v1.3, replaced by
     *             <code>setScrollMode()</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    @Deprecated

    /**
     * Returns <code>true</code> if this viewport is maintaining
     * an offscreen image of its contents.
     *
     * @return <code>true</code> if <code>scrollMode</code> is
     *    <code>BACKINGSTORE_SCROLL_MODE</code>
     *
     * @deprecated As of Java 2 platform v1.3, replaced by
     *             <code>getScrollMode()</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public int getScrollMode() {

    /**
      * Returns the current scrolling mode.
      *
      * @return the <code>scrollMode</code> property
      * @see #setScrollMode
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setScrollMode(int mode) {

    /**
      * Used to control the method of scrolling the viewport contents.
      * You may want to change this mode to get maximum performance for your
      * use case.
      *
      * @param mode one of the following values:
      * <ul>
      * <li> JViewport.BLIT_SCROLL_MODE
      * <li> JViewport.BACKINGSTORE_SCROLL_MODE
      * <li> JViewport.SIMPLE_SCROLL_MODE
      * </ul>
      *
      * @see #BLIT_SCROLL_MODE
      * @see #BACKINGSTORE_SCROLL_MODE
      * @see #SIMPLE_SCROLL_MODE
      *
      * @beaninfo
      *        bound: false
      *  description: Method of moving contents for incremental scrolls.
      *         enum: BLIT_SCROLL_MODE JViewport.BLIT_SCROLL_MODE
      *               BACKINGSTORE_SCROLL_MODE JViewport.BACKINGSTORE_SCROLL_MODE
      *               SIMPLE_SCROLL_MODE JViewport.SIMPLE_SCROLL_MODE
      *
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void reshape(int x, int y, int w, int h) {

    /**
     * Sets the bounds of this viewport.  If the viewport's width
     * or height has changed, fire a <code>StateChanged</code> event.
     *
     * @param x left edge of the origin
     * @param y top edge of the origin
     * @param w width in pixels
     * @param h height in pixels
     *
     * @see JComponent#reshape(int, int, int, int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void paint(Graphics g)

    /**
     * Depending on whether the <code>backingStore</code> is enabled,
     * either paint the image through the backing store or paint
     * just the recently exposed part, using the backing store
     * to "blit" the remainder.
     * <blockquote>
     * The term "blit" is the pronounced version of the PDP-10
     * BLT (BLock Transfer) instruction, which copied a block of
     * bits. (In case you were curious.)
     * </blockquote>
     *
     * @param g the <code>Graphics</code> context within which to paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private Point getViewLocation() {

    /**
     * Only used by the paint method below.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected boolean isPaintingOrigin() {

    /**
     * Returns true if scroll mode is a {@code BACKINGSTORE_SCROLL_MODE} to cause
     * painting to originate from {@code JViewport}, or one of its
     * ancestors. Otherwise returns {@code false}.
     *
     * @return true if if scroll mode is a {@code BACKINGSTORE_SCROLL_MODE}.
     * @see JComponent#isPaintingOrigin()
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public boolean isOptimizedDrawingEnabled() {

    /**
     * The <code>JViewport</code> overrides the default implementation of
     * this method (in <code>JComponent</code>) to return false.
     * This ensures
     * that the drawing machinery will call the <code>Viewport</code>'s
     * <code>paint</code>
     * implementation rather than messaging the <code>JViewport</code>'s
     * children directly.
     *
     * @return false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public final Insets getInsets(Insets insets) {

    /**
     * Returns an <code>Insets</code> object containing this
     * <code>JViewport</code>s inset values.  The passed-in
     * <code>Insets</code> object will be reinitialized, and
     * all existing values within this object are overwritten.
     *
     * @param insets the <code>Insets</code> object which can be reused
     * @return this viewports inset values
     * @see #getInsets
     * @beaninfo
     *   expert: true
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public final Insets getInsets() {

    /**
     * Returns the insets (border) dimensions as (0,0,0,0), since borders
     * are not supported on a <code>JViewport</code>.
     *
     * @return a <code>Rectangle</code> of zero dimension and zero origin
     * @see #setBorder
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public final void setBorder(Border border) {

    /**
     * The viewport "scrolls" its child (called the "view") by the
     * normal parent/child clipping (typically the view is moved in
     * the opposite direction of the scroll).  A non-<code>null</code> border,
     * or non-zero insets, isn't supported, to prevent the geometry
     * of this component from becoming complex enough to inhibit
     * subclassing.  To create a <code>JViewport</code> with a border,
     * add it to a <code>JPanel</code> that has a border.
     * <p>Note:  If <code>border</code> is non-<code>null</code>, this
     * method will throw an exception as borders are not supported on
     * a <code>JViewPort</code>.
     *
     * @param border the <code>Border</code> to set
     * @exception IllegalArgumentException this method is not implemented
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private void validateView() {

    /**
     * Ascends the <code>Viewport</code>'s parents stopping when
     * a component is found that returns
     * <code>true</code> to <code>isValidateRoot</code>.
     * If all the <code>Component</code>'s  parents are visible,
     * <code>validate</code> will then be invoked on it. The
     * <code>RepaintManager</code> is then invoked with
     * <code>removeInvalidComponent</code>. This
     * is the synchronous version of a <code>revalidate</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void scrollRectToVisible(Rectangle contentRect) {

    /**
     * Scrolls the view so that <code>Rectangle</code>
     * within the view becomes visible.
     * <p>
     * This attempts to validate the view before scrolling if the
     * view is currently not valid - <code>isValid</code> returns false.
     * To avoid excessive validation when the containment hierarchy is
     * being created this will not validate if one of the ancestors does not
     * have a peer, or there is no validate root ancestor, or one of the
     * ancestors is not a <code>Window</code> or <code>Applet</code>.
     * <p>
     * Note that this method will not scroll outside of the
     * valid viewport; for example, if <code>contentRect</code> is larger
     * than the viewport, scrolling will be confined to the viewport's
     * bounds.
     *
     * @param contentRect the <code>Rectangle</code> to display
     * @see JComponent#isValidateRoot
     * @see java.awt.Component#isValid
     * @see java.awt.Component#getPeer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void remove(Component child) {

    /**
     * Removes the <code>Viewport</code>s one lightweight child.
     *
     * @see #setView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected void addImpl(Component child, Object constraints, int index) {

    /**
     * Sets the <code>JViewport</code>'s one lightweight child,
     * which can be <code>null</code>.
     * (Since there is only one child which occupies the entire viewport,
     * the <code>constraints</code> and <code>index</code>
     * arguments are ignored.)
     *
     * @param child       the lightweight <code>child</code> of the viewport
     * @param constraints the <code>constraints</code> to be respected
     * @param index       the index
     * @see #setView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the L&amp;F class
     * that renders this component.
     *
     * @return the string "ViewportUI"
     *
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public void setUI(ViewportUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the <code>ViewportUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public ViewportUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return a <code>ViewportUI</code> object
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public JViewport() {

    /** Creates a <code>JViewport</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private boolean viewChanged;

    /**
     * When view is changed we have to synchronize scrollbar values
     * with viewport (see the BasicScrollPaneUI#syncScrollPaneWithViewport method).
     * This flag allows to invoke that method while ScrollPaneLayout#layoutContainer
     * is running.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private boolean hasHadValidView;

    /**
     * Whether or not a valid view has been installed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private transient boolean inBlitPaint;

    /**
     * Set to true in paintView when paint is invoked.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private transient Timer repaintTimer;

    /**
     * Instead of directly invoking repaint, a <code>Timer</code>
     * is started and when it fires, repaint is invoked.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private transient boolean waitingForRepaint;

    /**
     * This is set to true in paint, if <code>repaintAll</code>
     * is true and the clip rectangle does not match the bounds.
     * If true, and scrolling happens the
     * repaint manager is not cleared which then allows for the repaint
     * previously invoked to succeed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private transient boolean repaintAll;

    /**
     * This is set to true in <code>setViewPosition</code>
     * if doing a window blit and the viewport is obscured.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private int scrollMode = BLIT_SCROLL_MODE;

    /**
      * @see #setScrollMode
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public static final int SIMPLE_SCROLL_MODE = 0;

    /**
      * This mode uses the very simple method of redrawing the entire
      * contents of the scrollpane each time it is scrolled.
      * This was the default behavior in Swing 1.0 and Swing 1.1.
      * Either of the other two options will provide better performance
      * in most cases.
      *
      * @see #setScrollMode
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public static final int BACKINGSTORE_SCROLL_MODE = 2;

    /**
      * Draws viewport contents into an offscreen image.
      * This was previously the default mode for <code>JTable</code>.
      * This mode may offer advantages over "blit mode"
      * in some cases, but it requires a large chunk of extra RAM.
      *
      * @see #setScrollMode
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    public static final int BLIT_SCROLL_MODE = 1;

    /**
      * Use <code>graphics.copyArea</code> to implement scrolling.
      * This is the fastest for most applications.
      *
      * @see #setScrollMode
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected boolean scrollUnderway = false;

    /**
     * The <code>scrollUnderway</code> flag is used for components like
     * <code>JList</code>.  When the downarrow key is pressed on a
     * <code>JList</code> and the selected
     * cell is the last in the list, the <code>scrollpane</code> autoscrolls.
     * Here, the old selected cell needs repainting and so we need
     * a flag to make the viewport do the optimized painting
     * only when there is an explicit call to
     * <code>setViewPosition(Point)</code>.
     * When <code>setBounds</code> is called through other routes,
     * the flag is off and the view repaints normally.  Another approach
     * would be to remove this from the <code>JViewport</code>
     * class and have the <code>JList</code> manage this case by using
     * <code>setBackingStoreEnabled</code>.  The default is
     * <code>false</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    transient protected Image backingStoreImage = null;

    /** The view image used for a backing store. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    @Deprecated

    /**
     * True when this viewport is maintaining an offscreen image of its
     * contents, so that some scrolling can take place using fast "bit-blit"
     * operations instead of by accessing the view object to construct the
     * display.  The default is <code>false</code>.
     *
     * @deprecated As of Java 2 platform v1.3
     * @see #setScrollMode
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected Point lastPaintPosition = null;

    /**
     * The last <code>viewPosition</code> that we've painted, so we know how
     * much of the backing store image is valid.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    protected boolean isViewSizeSet = false;

    /**
     * True when the viewport dimensions have been determined.
     * The default is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    static final Object EnableWindowBlit = "EnableWindowBlit";

    /** Property used to indicate window blitting should not be done.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
    private static final String uiClassID = "ViewportUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JViewport.java
public class JViewport extends JComponent implements Accessible

/**
 * The "viewport" or "porthole" through which you see the underlying
 * information. When you scroll, what moves is the viewport. It is like
 * peering through a camera's viewfinder. Moving the viewfinder upwards
 * brings new things into view at the top of the picture and loses
 * things that were at the bottom.
 * <p>
 * By default, <code>JViewport</code> is opaque. To change this, use the
 * <code>setOpaque</code> method.
 * <p>
 * <b>NOTE:</b>We have implemented a faster scrolling algorithm that
 * does not require a buffer to draw in. The algorithm works as follows:
 * <ol><li>The view and parent view and checked to see if they are
 * <code>JComponents</code>,
 * if they aren't, stop and repaint the whole viewport.
 * <li>If the viewport is obscured by an ancestor, stop and repaint the whole
 * viewport.
 * <li>Compute the region that will become visible, if it is as big as
 * the viewport, stop and repaint the whole view region.
 * <li>Obtain the ancestor <code>Window</code>'s graphics and
 * do a <code>copyArea</code> on the scrolled region.
 * <li>Message the view to repaint the newly visible region.
 * <li>The next time paint is invoked on the viewport, if the clip region
 * is smaller than the viewport size a timer is kicked off to repaint the
 * whole region.
 * </ol>
 * In general this approach is much faster. Compared to the backing store
 * approach this avoids the overhead of maintaining an offscreen buffer and
 * having to do two <code>copyArea</code>s.
 * Compared to the non backing store case this
 * approach will greatly reduce the painted region.
 * <p>
 * This approach can cause slower times than the backing store approach
 * when the viewport is obscured by another window, or partially offscreen.
 * When another window
 * obscures the viewport the copyArea will copy garbage and a
 * paint event will be generated by the system to inform us we need to
 * paint the newly exposed region. The only way to handle this is to
 * repaint the whole viewport, which can cause slower performance than the
 * backing store case. In most applications very rarely will the user be
 * scrolling while the viewport is obscured by another window or offscreen,
 * so this optimization is usually worth the performance hit when obscured.
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Hans Muller
 * @author Philip Milne
 * @see JScrollPane
 */
