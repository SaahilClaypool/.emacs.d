_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        public void dispose() {

        /**
         * Cleans up and removes any references.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        private BufferStrategy createBufferStrategy() {

        /**
         * Creates the BufferStrategy.  If the appropriate system property
         * has been set we'll try for flip first and then we'll try for
         * blit.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        public boolean hasBufferStrategyChanged() {

        /**
         * Returns true if the buffer strategy of the component differs
         * from current buffer strategy.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        public BufferStrategy getBufferStrategy(boolean create) {

        /**
         * Returns the BufferStartegy.  This will return null if
         * the BufferStartegy hasn't been created and <code>create</code> is
         * false, or if there is a problem in creating the
         * <code>BufferStartegy</code>.
         *
         * @param create If true, and the BufferStartegy is currently null,
         *               one will be created.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        public Container getRoot() {

        /**
         * Returns the Root (Window or Applet) that this BufferInfo references.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
        public boolean isInSync() {

        /**
         * Whether or not the contents of the buffer strategy
         * is in sync with the window.  This is set to true when the root
         * pane paints all, and false when contents are lost/restored.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private class BufferInfo extends ComponentAdapter implements

    /**
     * BufferInfo is used to track the BufferStrategy being used for
     * a particular Component.  In addition to tracking the BufferStrategy
     * it will install a WindowListener and ComponentListener.  When the
     * component is hidden/iconified the buffer is marked as needing to be
     * completely repainted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private BufferInfo getBufferInfo(Container root) {

    /**
     * Returns the BufferInfo for the specified root or null if one
     * hasn't been created yet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private void resetDoubleBufferPerWindow() {

    /**
     * Turns off double buffering per window.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private boolean prepare(JComponent c, Container root, boolean isPaint, int x, int y,
                            int w, int h) {

    /**
     * Calculates information common to paint/copyArea.
     *
     * @return true if should use buffering per window in painting.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private void doubleBufferingChanged0(JRootPane rootPane) {

    /**
     * Does the work for doubleBufferingChanged.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    public void doubleBufferingChanged(final JRootPane rootPane) {

    /**
     * Invoked when the double buffering or useTrueDoubleBuffering
     * changes for a JRootPane.  If the rootpane is not double
     * buffered, or true double buffering changes we throw out any
     * cache we may have.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private boolean flushAccumulatedRegion() {

    /**
     * Renders the BufferStrategy to the screen.
     *
     * @return true if successful, false otherwise.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    public boolean show(Container c, int x, int y, int w, int h) {

    /**
     * Shows the specified region of the back buffer.  This will return
     * true if successful, false otherwise.  This is invoked on the
     * toolkit thread in response to an expose event.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    protected void dispose() {

    /**
     * Cleans up any created BufferStrategies.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private boolean disposeBufferOnEnd;

    /**
     * Set to true if the bufferInfo needs to be disposed when current
     * paint loop is done.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private BufferInfo bufferInfo;

    /**
     * BufferInfo corresponding to root.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private BufferStrategy bufferStrategy;

    /**
     * BufferStrategy currently being used.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private Graphics bsg;

    /**
     * Graphics from the BufferStrategy.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private int yOffset;

    /**
     * Location of component being painted relative to root.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private int xOffset;

    /**
     * Location of component being painted relative to root.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private JComponent rootJ;

    /**
     * Farthest JComponent ancestor for the current paint/copyArea.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private boolean showing;

    /**
     * Indicates we're in the process of showing.  All painting, on the EDT,
     * is blocked while this is true.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private boolean painting;

    /**
     * Indicates <code>beginPaint</code> has been invoked.  This is
     * set to true for the life of beginPaint/endPaint pair.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
    private ArrayList<BufferInfo> bufferInfos;

    /**
     * List of BufferInfos.  We don't use a Map primarily because
     * there are typically only a handful of top level components making
     * a Map overkill.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//BufferStrategyPaintManager.java
class BufferStrategyPaintManager extends RepaintManager.PaintManager {

/**
 * A PaintManager implementation that uses a BufferStrategy for
 * rendering.
 *
 * @author Scott Violet
 */
