_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    static class SharedActionScroller extends AbstractAction {

    /**
     * A static version of the above.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public class ActionScroller extends AbstractAction {

    /**
     * As of Java 2 platform v1.3 this undocumented class is no longer used.
     * The recommended approach to creating bindings is to use a
     * combination of an <code>ActionMap</code>, to contain the action,
     * and an <code>InputMap</code> to contain the mapping from KeyStroke
     * to action description. The InputMap is is usually described in the
     * LookAndFeel tables.
     * <p>
     * Please refer to the key bindings specification for further details.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <code>Foo</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public class FocusHandler implements FocusListener {

    /**
     * Focus-change listener.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <code>Foo</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public class ComponentHandler extends ComponentAdapter {

    /**
     * Listener for resizing events.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <code>Foo</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public class ScrollListener implements ActionListener {

    /**
     * Scroll-event listener.
     *
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <code>Foo</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
        public void mouseDragged(MouseEvent e) {

        /**
        * Set the models value to the position of the top/left
        * of the thumb relative to the origin of the track.
        */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
        public void mousePressed(MouseEvent e) {

        /**
        * If the mouse is pressed above the "thumb" component
        * then reduce the scrollbars value by one page ("page up"),
        * otherwise increase it by one page.  If there is no
        * thumb then page up if the mouse is in the upper half
        * of the track.
        */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    /**

    /////////////////////////////////////////////////////////////////////////
    /// Track Listener Class
    /////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    /**

    /////////////////////////////////////////////////////////////////////////
    /// Model Listener Class
    /////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public int valueForXPosition( int xPos ) {

    /**
     * Returns the value at the x position.  If {@code xPos} is beyond the
     * track at the left or the right, this method sets the value to either the
     * minimum or maximum value of the slider, depending on if the slider is
     * inverted or not.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public int valueForYPosition( int yPos ) {

    /**
     * Returns the value at the y position. If {@code yPos} is beyond the
     * track at the the bottom or the top, this method sets the value to either
     * the minimum or maximum value of the slider, depending on if the slider
     * is inverted or not.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected int yPositionForValue(int value, int trackY, int trackHeight) {

    /**
     * Returns the y location for the specified value.  No checking is
     * done on the arguments.  In particular if <code>trackHeight</code> is
     * negative undefined results may occur.
     *
     * @param value the slider value to get the location for
     * @param trackY y-origin of the track
     * @param trackHeight the height of the track
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected void scrollDueToClickInTrack( int dir ) {

    /**
     * This function is called when a mousePressed was detected in the track, not
     * in the thumb.  The default behavior is to scroll by block.  You can
     *  override this method to stop it from scrolling or to add additional behavior.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected void paintVerticalLabel( Graphics g, int value, Component label ) {

    /**
     * Called for every label in the label table.  Used to draw the labels for vertical sliders.
     * The graphics have been translated to labelRect.x already.
     * @see JSlider#setLabelTable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected void paintHorizontalLabel( Graphics g, int value, Component label ) {

    /**
     * Called for every label in the label table.  Used to draw the labels for horizontal sliders.
     * The graphics have been translated to labelRect.y already.
     * @see JSlider#setLabelTable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected Component getHighestValueLabel() {

    /**
     * Returns the label that corresponds to the lowest slider value in the label table.
     * @see JSlider#setLabelTable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected Component getLowestValueLabel() {

    /**
     * Returns the label that corresponds to the highest slider value in the label table.
     * @see JSlider#setLabelTable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected Integer getLowestValue() {

    /**
     * Returns the smallest value that has an entry in the label table.
     *
     * @return smallest value that has an entry in the label table, or
     *         null.
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected Integer getHighestValue() {

    /**
     * Returns the biggest value that has an entry in the label table.
     *
     * @return biggest value that has an entry in the label table, or
     *         null.
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected int getTickLength() {

    /**
     * Gets the height of the tick area for horizontal sliders and the width of the
     * tick area for vertical sliders.  BasicSliderUI uses the returned value to
     * determine the tick area rectangle.  If you want to give your ticks some room,
     * make this larger than you need and paint your ticks away from the sides in paintTicks().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected boolean labelsHaveSameBaselines() {

    /**
     * Returns true if all the labels from the label table have the same
     * baseline.
     *
     * @return true if all the labels from the label table have the
     *         same baseline
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    static void loadActionMap(LazyActionMap map) {

    /**
     * Populates ComboBox's actions.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    public static ComponentUI createUI(JComponent b)    {

    /////////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    // ComponentUI Interface Implementation methods

    /////////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    protected boolean isDragging() {

    /**
     * Returns true if the user is dragging the slider.
     *
     * @return true if the user is dragging the slider
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    private boolean sameLabelBaselines;

    /**
     * Whether or not all the entries in the labeltable have the same
     * baseline.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
    private boolean checkedLabelBaselines;

    /**
     * Whther or not sameLabelBaselines is up to date.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicSliderUI.java
public class BasicSliderUI extends SliderUI{

/**
 * A Basic L&amp;F implementation of SliderUI.
 *
 * @author Tom Santos
 */
