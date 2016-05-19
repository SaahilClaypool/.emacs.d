_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    public class ChangeHandler implements ChangeListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicProgressBarUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Reacts to the timer's action events.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
        private void stop() {

        /**
         * Stops the timer thread.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
        private void start(int interval) {

        /**
         * Creates a timer if one doesn't already exist,
         * then starts the timer thread.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private class Animator implements ActionListener {

    /**
     * Implements an animation thread that invokes repaint
     * at a fixed rate.  If ADJUSTTIMER is true, this thread
     * will continuously adjust the repaint interval to
     * try to make the actual time between repaints match
     * the requested rate.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private void cleanUpIndeterminateValues() {

    /** Invoked by PropertyChangeHandler. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private void initIndeterminateValues() {

    /**
     * Invoked by PropertyChangeHandler.
     *
     *  NOTE: This might not be invoked until after the first
     *  paintIndeterminate call.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private void initIndeterminateDefaults() {

    /** Initialize cycleTime, repaintInterval, numFrames, animationIndex. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int getCycleTime() {

    /**
     * Returns the number of milliseconds per animation cycle.
     * This value is meaningful
     * only if the progress bar is in indeterminate mode.
     * The cycle time is used by the default indeterminate progress bar
     * painting code when determining
     * how far to move the bouncing box per frame.
     * The cycle time is specified by
     * the "ProgressBar.cycleTime" UI default
     * and adjusted, if necessary,
     * by the initIndeterminateDefaults method.
     *
     * @return  the cycle time, in milliseconds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int getRepaintInterval() {

    /**
     * Returns the desired number of milliseconds between repaints.
     * This value is meaningful
     * only if the progress bar is in indeterminate mode.
     * The repaint interval determines how often the
     * default animation thread's timer is fired.
     * It's also used by the default indeterminate progress bar
     * painting code when determining
     * how far to move the bouncing box per frame.
     * The repaint interval is specified by
     * the "ProgressBar.repaintInterval" UI default.
     *
     * @return  the repaint interval, in milliseconds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void incrementAnimationIndex() {

    /**
     * Sets the index of the current animation frame,
     * to the next valid value,
     * which results in the progress bar being repainted.
     * The next valid value is, by default,
     * the current animation index plus one.
     * If the new value would be too large,
     * this method sets the index to 0.
     * Subclasses might need to override this method
     * to ensure that the index does not go over
     * the number of frames needed for the particular
     * progress bar instance.
     * This method is invoked by the default animation thread
     * every <em>X</em> milliseconds,
     * where <em>X</em> is specified by the "ProgressBar.repaintInterval"
     * UI default.
     *
     * @see #setAnimationIndex
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void setAnimationIndex(int newValue) {

    /**
     * Sets the index of the current animation frame
     * to the specified value and requests that the
     * progress bar be repainted.
     * Subclasses that don't use the default painting code
     * might need to override this method
     * to change the way that the <code>repaint</code> method
     * is invoked.
     *
     * @param newValue the new animation index; no checking
     *                 is performed on its value
     * @see #incrementAnimationIndex
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected final int getFrameCount() {

    /**
     * Returns the number of frames for the complete animation loop
     * used by an indeterminate JProgessBar. The progress chunk will go
     * from one end to the other and back during the entire loop. This
     * visual behavior may be changed by subclasses in other Look and Feels.
     *
     * @return the number of frames
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected int getAnimationIndex() {

    /**
     * Gets the index of the current animation frame.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * The Minimum size for this component is 10. The rationale here
     * is that there should be at least one pixel per 10 percent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected Point getStringPlacement(Graphics g, String progressString,
                                       int x,int y,int width,int height) {

    /**
     * Designate the place where the progress string will be painted.
     * This implementation places it at the center of the progress
     * bar (in both x and y). Override this if you want to right,
     * left, top, or bottom align the progress string or if you need
     * to nudge it around for any reason.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private void paintString(Graphics g, int x, int y, int width, int height,
                             int fillStart, int amountFull, Insets b) {

    /**
     * Paints the progress string.
     *
     * @param g Graphics used for drawing.
     * @param x x location of bounding box
     * @param y y location of bounding box
     * @param width width of bounding box
     * @param height height of bounding box
     * @param fillStart start location, in x or y depending on orientation,
     *        of the filled portion of the progress bar.
     * @param amountFull size of the fill region, either width or height
     *        depending upon orientation.
     * @param b Insets of the progress bar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void paintDeterminate(Graphics g, JComponent c) {

    /**
     * All purpose paint method that should do the right thing for almost
     * all linear, determinate progress bars. By setting a few values in
     * the defaults
     * table, things should work just fine to paint your progress bar.
     * Naturally, override this if you are making a circular or
     * semi-circular progress bar.
     *
     * @see #paintIndeterminate
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void paintIndeterminate(Graphics g, JComponent c) {

    /**
     * All purpose paint method that should do the right thing for all
     * linear bouncing-box progress bars.
     * Override this if you are making another kind of
     * progress bar.
     *
     * @see #paintDeterminate
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected int getBoxLength(int availableLength, int otherDimension) {

    /**
     * Returns the length
     * of the "bouncing box" to be painted.
     * This method is invoked by the
     * default implementation of <code>paintIndeterminate</code>
     * to get the width (if the progress bar is horizontal)
     * or height (if vertical) of the box.
     * For example:
     * <blockquote>
     * <pre>
     *boxRect.width = getBoxLength(componentInnards.width,
     *                             componentInnards.height);
     * </pre>
     * </blockquote>
     *
     * @param availableLength  the amount of space available
     *                         for the bouncing box to move in;
     *                         for a horizontal progress bar,
     *                         for example,
     *                         this should be
     *                         the inside width of the progress bar
     *                         (the component width minus borders)
     * @param otherDimension   for a horizontal progress bar, this should be
     *                         the inside height of the progress bar; this
     *                         value might be used to constrain or determine
     *                         the return value
     *
     * @return the size of the box dimension being determined;
     *         must be no larger than <code>availableLength</code>
     *
     * @see javax.swing.SwingUtilities#calculateInnerArea
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private Rectangle getGenericBox(Rectangle r) {

    /**
     * Assumes that the component innards, max position, etc. are up-to-date.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private void updateSizes() {

    /**
     * Updates delta, max position.
     * Assumes componentInnards is correct (e.g. call after sizeChanged()).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected Rectangle getBox(Rectangle r) {

    /**
     * Stores the position and size of
     * the bouncing box that would be painted for the current animation index
     * in <code>r</code> and returns <code>r</code>.
     * Subclasses that add to the painting performed
     * in this class's implementation of <code>paintIndeterminate</code> --
     * to draw an outline around the bouncing box, for example --
     * can use this method to get the location of the bouncing
     * box that was just painted.
     * By overriding this method,
     * you have complete control over the size and position
     * of the bouncing box,
     * without having to reimplement <code>paintIndeterminate</code>.
     *
     * @param r  the Rectangle instance to be modified;
     *           may be <code>null</code>
     * @return   <code>null</code> if no box should be drawn;
     *           otherwise, returns the passed-in rectangle
     *           (if non-null)
     *           or a new rectangle
     *
     * @see #setAnimationIndex
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    public void paint(Graphics g, JComponent c) {

    /**
     * Delegates painting to one of two methods:
     * paintDeterminate or paintIndeterminate.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected int getAmountFull(Insets b, int width, int height) {

    /**
     * This determines the amount of the progress bar that should be filled
     * based on the percent done gathered from the model. This is a common
     * operation so it was abstracted out. It assumes that your progress bar
     * is linear. That is, if you are making a circular progress indicator,
     * you will want to override this method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected int getCellSpacing() {

    /**
     * Returns the spacing between each of the cells/units in the
     * progress bar. However, for text rendering simplification and
     * aesthetic considerations, this function will return 0 when
     * the progress string is being rendered.
     *
     * @return the value representing the spacing between cells
     * @see    #setCellSpacing
     * @see    JProgressBar#isStringPainted
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected int getCellLength() {

    /**
     * Returns the width (if HORIZONTAL) or height (if VERTICAL)
     * of each of the individual cells/units to be rendered in the
     * progress bar. However, for text rendering simplification and
     * aesthetic considerations, this function will return 1 when
     * the progress string is being rendered.
     *
     * @return the value representing the spacing between cells
     * @see    #setCellLength
     * @see    JProgressBar#isStringPainted
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected Color getSelectionBackground() {

    /**
     * The "selectionBackground" is the color of the text when it is painted
     * over an unfilled area of the progress bar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected Color getSelectionForeground() {

    /**
     * The "selectionForeground" is the color of the text when it is painted
     * over a filled area of the progress bar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            JComponent c) {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    public int getBaseline(JComponent c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void uninstallListeners() {

    /**
     * Removes all listeners installed by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void stopAnimationTimer() {

    /**
     * Stops the animation thread.
     * This method is invoked when the indeterminate
     * animation should be stopped. Reasons for this may include:
     * <ul>
     *    <li>The progress bar changes to determinate
     *    <li>The progress bar is no longer part of a displayable hierarchy
     *    <li>This UI in uninstalled
     * </ul>
     * If you implement your own animation thread,
     * you must override this method.
     *
     * @since 1.4
     * @see #startAnimationTimer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected void startAnimationTimer() {

    /**
     * Starts the animation thread, creating and initializing
     * it if necessary. This method is invoked when an
     * indeterminate progress bar should start animating.
     * Reasons for this may include:
     * <ul>
     *    <li>The progress bar is determinate and becomes displayable
     *    <li>The progress bar is displayable and becomes determinate
     *    <li>The progress bar is displayable and determinate and this
     *        UI is installed
     * </ul>
     * If you implement your own animation thread,
     * you must override this method.
     *
     * @since 1.4
     * @see #stopAnimationTimer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private double delta = 0.0;

    /** For bouncing-box animation, the change in position per frame. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private Rectangle componentInnards;    //the current painting area

    /** The component's painting area, not including the border. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private Rectangle nextPaintRect;

    /**
     * The rectangle to be updated the next time the
     * animation thread calls repaint.  For bouncing-box
     * animation this rect should include the union of
     * the currently displayed box (which needs to be erased)
     * and the box to be displayed next.
     * This rectangle's values are set in
     * the setAnimationIndex method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    protected Rectangle boxRect;

    /**
     * Used to hold the location and size of the bouncing box (returned
     * by getBox) to be painted.
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int cycleTime;  //must be repaintInterval*2*aPositiveInteger

    /**
     * The number of milliseconds until the animation cycle repeats.
     * The value of this method is set
     * (every time the progress bar changes to indeterminate mode)
     * using the
     * "ProgressBar.cycleTime" key in the defaults table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int repaintInterval;

    /**
     * Interval (in ms) between repaints of the indeterminate progress bar.
     * The value of this method is set
     * (every time the progress bar changes to indeterminate mode)
     * using the
     * "ProgressBar.repaintInterval" key in the defaults table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int numFrames;   //0 1|numFrames-1 ... numFrames/2

    /**
     * The number of frames per cycle. Under the default implementation,
     * this depends on the cycleTime and repaintInterval.  It
     * must be an even number for the default painting algorithm.  This
     * value is set in the initIndeterminateValues method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
    private int animationIndex = 0;

    /**
     * The current state of the indeterminate animation's cycle.
     * 0, the initial value, means paint the first frame.
     * When the progress bar is indeterminate and showing,
     * the default animation thread updates this variable
     * by invoking incrementAnimationIndex()
     * every repaintInterval milliseconds.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicProgressBarUI.java
public class BasicProgressBarUI extends ProgressBarUI {

/**
 * A Basic L&amp;F implementation of ProgressBarUI.
 *
 * @author Michael C. Albers
 * @author Kathy Walrath
 */
