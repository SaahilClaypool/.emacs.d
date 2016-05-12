_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public synchronized boolean markPending() {

        /**
         * Marks this processing runnable as pending. If this was not
         * already marked as pending, true is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private final class ProcessingRunnable implements Runnable {

    /**
     * Runnable used to process all repaint/revalidate requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private static final class DisplayChangedHandler implements

    /**
     * Listener installed to detect display changes. When display changes,
     * schedules a callback to notify all RepaintManagers of the display
     * changes. Only one DisplayChangedHandler is ever installed. The
     * singleton instance will schedule notification for all AppContexts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        protected void dispose() {

        /**
         * Cleans up any state.  After invoked the PaintManager will no
         * longer be used anymore.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        protected boolean isRepaintingRoot() {

        /**
         * Returns true if the component being painted is the root component
         * that was previously passed to <code>repaintRoot</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        protected void repaintRoot(JComponent root) {

        /**
         * Schedules a repaint for the specified component.  This differs
         * from <code>root.repaint</code> in that if the RepaintManager is
         * currently processing paint requests it'll process this request
         * with the current set of requests.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        private Image getValidImage(Image image) {

        /**
         * If <code>image</code> is non-null with a positive size it
         * is returned, otherwise null is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        protected void paintDoubleBuffered(JComponent c, Image image,
                            Graphics g, int clipX, int clipY,
                            int clipW, int clipH) {

        /**
         * Paints a portion of a component to an offscreen buffer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public void doubleBufferingChanged(JRootPane rootPane) {

        /**
         * Invoked when the doubleBuffered or useTrueDoubleBuffering
         * properties of a JRootPane change.  This may come in on any thread.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public boolean show(Container c, int x, int y, int w, int h) {

        /**
         * Shows a region of a previously rendered component.  This
         * will return true if successful, false otherwise.  The default
         * implementation returns false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public void endPaint() {

        /**
         * Invoked to indicate painting has been completed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public void beginPaint() {

        /**
         * Invoked prior to any calls to paint or copyArea.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public void copyArea(JComponent c, Graphics g, int x, int y, int w,
                             int h, int deltaX, int deltaY, boolean clip) {

        /**
         * Does a copy area on the specified region.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
        public boolean paint(JComponent paintingComponent,
                             JComponent bufferComponent, Graphics g,
                             int x, int y, int w, int h) {

        /**
         * Paints a region of a component
         *
         * @param paintingComponent Component to paint
         * @param bufferComponent Component to obtain buffer for
         * @param g Graphics to paint to
         * @param x X-coordinate
         * @param y Y-coordinate
         * @param w Width
         * @param h Height
         * @return true if painting was successful.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    static class PaintManager {

    /**
     * PaintManager is used to handle all double buffered painting for
     * Swing.  Subclasses should call back into the JComponent method
     * <code>paintToOffscreen</code> to handle the actual painting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void setPaintManager(PaintManager paintManager) {

    /**
     * Sets the <code>PaintManager</code> that is used to handle all
     * double buffered painting.
     *
     * @param paintManager The PaintManager to use.  Passing in null indicates
     *        the fallback PaintManager should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void doubleBufferingChanged(JRootPane rootPane) {

    /**
     * Invoked when the doubleBuffered or useTrueDoubleBuffering
     * properties of a JRootPane change.  This may come in on any thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    boolean show(Container c, int x, int y, int w, int h) {

    /**
     * If possible this will show a previously rendered portion of
     * a Component.  If successful, this will return true, otherwise false.
     * <p>
     * WARNING: This method is invoked from the native toolkit thread, be
     * very careful as to what methods this invokes!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void endPaint() {

    /**
     * Invoked after <code>beginPaint</code> has been invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void beginPaint() {

    /**
     * Invoked prior to any paint/copyArea method calls.  This will
     * be followed by an invocation of <code>endPaint</code>.
     * <b>WARNING</b>: Callers of this method need to wrap the call
     * in a <code>try/finally</code>, otherwise if an exception is thrown
     * during the course of painting the RepaintManager may
     * be left in a state in which the screen is not updated, eg:
     * <pre>
     * repaintManager.beginPaint();
     * try {
     *   repaintManager.paint(...);
     * } finally {
     *   repaintManager.endPaint();
     * }
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void notifyRepaintPerformed(JComponent c, int x, int y, int w, int h) {

    /**
     * Notify the attached repaint listeners that an area of the {@code c} component
     * has been immediately repainted, that is without scheduling a repaint runnable,
     * due to performing a "blit" (via calling the {@code copyArea} method).
     *
     * @param c the component
     * @param x the x coordinate of the area
     * @param y the y coordinate of the area
     * @param w the width of the area
     * @param h the height of the area
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void copyArea(JComponent c, Graphics g, int x, int y, int w, int h,
                  int deltaX, int deltaY, boolean clip) {

    /**
     * Does a copy area on the specified region.
     *
     * @param clip Whether or not the copyArea needs to be clipped to the
     *             Component's bounds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void paint(JComponent paintingComponent,
               JComponent bufferComponent, Graphics g,
               int x, int y, int w, int h) {

    /**
     * Paints a region of a component
     *
     * @param paintingComponent Component to paint
     * @param bufferComponent Component to obtain buffer for
     * @param g Graphics to paint to
     * @param x X-coordinate
     * @param y Y-coordinate
     * @param w Width
     * @param h Height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private synchronized boolean isPaintingThread() {

    /**
     * Returns true if the current thread is the thread painting.  This
     * will return false if no threads are painting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    boolean useVolatileDoubleBuffer() {

    /**
     * Returns true if we should use the <code>Image</code> returned
     * from <code>getVolatileOffscreenBuffer</code> to do double buffering.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void resetVolatileDoubleBuffer(GraphicsConfiguration gc) {

    /**
     * This resets the volatile double buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    void resetDoubleBuffer() {

    /**
     * This resets the double buffer. Actually, it marks the double buffer
     * as invalid, the double buffer will then be recreated on the next
     * invocation of getOffscreenBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public boolean isDoubleBufferingEnabled() {

    /**
     * Returns true if this RepaintManager is double buffered.
     * The default value for this property may vary from platform
     * to platform.  On platforms where native double buffering
     * is supported in the AWT, the default value will be <code>false</code>
     * to avoid unnecessary buffering in Swing.
     * On platforms where native double buffering is not supported,
     * the default value will be <code>true</code>.
     *
     * @return true if this object is double buffered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void setDoubleBufferingEnabled(boolean aFlag) {

    /**
     * Enables or disables double buffering in this RepaintManager.
     * CAUTION: The default value for this property is set for optimal
     * paint performance on the given platform and it is not recommended
     * that programs modify this property directly.
     *
     * @param aFlag  true to activate double buffering
     * @see #isDoubleBufferingEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public Dimension getDoubleBufferMaximumSize() {

    /**
     * Returns the maximum double buffer size.
     *
     * @return a Dimension object representing the maximum size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void setDoubleBufferMaximumSize(Dimension d) {

    /** Set the maximum double buffer size. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public Image getVolatileOffscreenBuffer(Component c,
                                            int proposedWidth,int proposedHeight) {

  /**
   * Return a volatile offscreen buffer that should be used as a
   * double buffer with the specified component <code>c</code>.
   * The image returned will be an instance of VolatileImage, or null
   * if a VolatileImage object could not be instantiated.
   * This buffer might be smaller than <code>(proposedWidth,proposedHeight)</code>.
   * This happens when the maximum double buffer size has been set for this
   * repaint manager.
   *
   * @see java.awt.image.VolatileImage
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public Image getOffscreenBuffer(Component c,int proposedWidth,int proposedHeight) {

   /**
     * Return the offscreen buffer that should be used as a double buffer with
     * the component <code>c</code>.
     * By default there is a double buffer per RepaintManager.
     * The buffer might be smaller than <code>(proposedWidth,proposedHeight)</code>
     * This happens when the maximum double buffer size as been set for the receiving
     * repaint manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public synchronized String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private void adjustRoots(JComponent root,
                             java.util.List<Component> roots, int index) {

    /**
     * Removes any components from roots that are children of
     * root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void paintDirtyRegions() {

    /**
     * Paint all of the components that have been marked dirty.
     *
     * @see #addDirtyRegion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private void prePaintDirtyRegions() {

    /**
     * This is invoked to process paint requests.  It's needed
     * for backward compatibility in so far as RepaintManager would previously
     * not see paint requests for top levels, so, we have to make sure
     * a subclass correctly paints any dirty top levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void validateInvalidComponents() {

    /**
     * Validate all of the components that have been marked invalid.
     * @see #addInvalidComponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public boolean isCompletelyDirty(JComponent aComponent) {

    /**
     * Convenience method that returns true if <b>aComponent</b> will be completely
     * painted during the next paintDirtyRegions(). If computing dirty regions is
     * expensive for your component, use this method and avoid computing dirty region
     * if it return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void markCompletelyClean(JComponent aComponent) {

    /**
     * Mark a component completely clean. <b>aComponent</b> will not
     * get painted during the next paintDirtyRegions() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void markCompletelyDirty(JComponent aComponent) {

    /**
     * Mark a component completely dirty. <b>aComponent</b> will be
     * completely painted during the next paintDirtyRegions() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public Rectangle getDirtyRegion(JComponent aComponent) {

    /** Return the current dirty region for a component.
     *  Return an empty rectangle if the component is not
     *  dirty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private synchronized boolean extendDirtyRegion(
        Component c, int x, int y, int w, int h) {

    /**
     * Extends the dirty region for the specified component to include
     * the new region.
     *
     * @return false if <code>c</code> is not yet marked dirty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void addDirtyRegion(Applet applet, int x, int y, int w, int h) {

    /**
     * Adds <code>applet</code> to the list of <code>Component</code>s that
     * need to be repainted.
     *
     * @param applet Applet to repaint, null results in nothing happening.
     * @param x X coordinate of the region to repaint
     * @param y Y coordinate of the region to repaint
     * @param w Width of the region to repaint
     * @param h Height of the region to repaint
     * @see JApplet#repaint
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void addDirtyRegion(Window window, int x, int y, int w, int h) {

    /**
     * Adds <code>window</code> to the list of <code>Component</code>s that
     * need to be repainted.
     *
     * @param window Window to repaint, null results in nothing happening.
     * @param x X coordinate of the region to repaint
     * @param y Y coordinate of the region to repaint
     * @param w Width of the region to repaint
     * @param h Height of the region to repaint
     * @see JFrame#repaint
     * @see JWindow#repaint
     * @see JDialog#repaint
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public void addDirtyRegion(JComponent c, int x, int y, int w, int h)

    /**
     * Add a component in the list of components that should be refreshed.
     * If <i>c</i> already has a dirty region, the rectangle <i>(x,y,w,h)</i>
     * will be unioned with the region that should be redrawn.
     *
     * @param c Component to repaint, null results in nothing happening.
     * @param x X coordinate of the region to repaint
     * @param y Y coordinate of the region to repaint
     * @param w Width of the region to repaint
     * @param h Height of the region to repaint
     * @see JComponent#repaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private void addDirtyRegion0(Container c, int x, int y, int w, int h) {

    /**
     * Add a component in the list of components that should be refreshed.
     * If <i>c</i> already has a dirty region, the rectangle <i>(x,y,w,h)</i>
     * will be unioned with the region that should be redrawn.
     *
     * @see JComponent#repaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public synchronized void removeInvalidComponent(JComponent component) {

    /**
     * Remove a component from the list of invalid components.
     *
     * @see #addInvalidComponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public synchronized void addInvalidComponent(JComponent invalidComponent)

    /**
     * Mark the component as in need of layout and queue a runnable
     * for the event dispatching thread that will validate the components
     * first isValidateRoot() ancestor.
     *
     * @see JComponent#isValidateRoot
     * @see #removeInvalidComponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public RepaintManager() {

    /**
     * Create a new RepaintManager instance. You rarely call this constructor.
     * directly. To get the default RepaintManager, use
     * RepaintManager.currentManager(JComponent) (normally "this").
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public static void setCurrentManager(RepaintManager aRepaintManager) {

    /**
     * Set the RepaintManager that should be used for the calling
     * thread. <b>aRepaintManager</b> will become the current RepaintManager
     * for the calling thread's thread group.
     * @param aRepaintManager  the RepaintManager object to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public static RepaintManager currentManager(JComponent c) {

    /**
     * Return the RepaintManager for the calling thread given a JComponent.
     * <p>
    * Note: This method exists for backward binary compatibility with earlier
     * versions of the Swing library. It simply returns the result returned by
     * {@link #currentManager(Component)}.
     *
     * @param c a JComponent -- unused
     * @return the RepaintManager object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    static RepaintManager currentManager(AppContext appContext) {

    /**
     * Returns the RepaintManager for the specified AppContext.  If
     * a RepaintManager has not been created for the specified
     * AppContext this will return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    public static RepaintManager currentManager(Component c) {

    /**
     * Return the RepaintManager for the calling thread given a Component.
     *
     * @param c a Component -- unused in the default implementation, but could
     *          be used by an overridden version to return a different RepaintManager
     *          depending on the Component
     * @return the RepaintManager object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private static final DisplayChangedListener displayChangedHandler =

    /**
     * Listener installed to detect display changes. When display changes,
     * schedules a callback to notify all RepaintManagers of the display
     * changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private final ProcessingRunnable processingRunnable;

    /**
     * Runnable used to process all repaint/revalidate requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private Thread paintThread;

    /**
     * The Thread that has initiated painting.  If null it
     * indicates painting is not currently in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private boolean painting;

    /**
     * True if we're in the process of painting the dirty regions.  This is
     * set to true in <code>paintDirtyRegions</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private short bufferStrategyType;

    /**
     * Type of buffer strategy to use.  Will be one of the BUFFER_STRATEGY_
     * constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private int paintDepth = 0;

    /**
     * Number of <code>beginPaint</code> that have been invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private static final int volatileBufferType;

    /**
     * Type of VolatileImage which should be used for double-buffered
     * painting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private PaintManager paintManager;

    /**
     * Object responsible for hanlding core paint functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    private Map<GraphicsConfiguration,VolatileImage> volatileMap = new

    /**
     * Maps from GraphicsConfiguration to VolatileImage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
    static final boolean HANDLE_TOP_LEVEL_PAINT;

    /**
     * Whether or not the RepaintManager should handle paint requests
     * for top levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/RepaintManager.java
public class RepaintManager

/**
 * This class manages repaint requests, allowing the number
 * of repaints to be minimized, for example by collapsing multiple
 * requests into a single repaint for members of a component tree.
 * <p>
 * As of 1.6 <code>RepaintManager</code> handles repaint requests
 * for Swing's top level components (<code>JApplet</code>,
 * <code>JWindow</code>, <code>JFrame</code> and <code>JDialog</code>).
 * Any calls to <code>repaint</code> on one of these will call into the
 * appropriate <code>addDirtyRegion</code> method.
 *
 * @author Arnaud Weber
 */
