_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    private static class Actions extends UIAction {

    /**
     * Used for scrolling the scrollbar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected class ScrollListener implements ActionListener

    /**
     * Listener for scrolling events initiated in the
     * <code>ScrollPane</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected class ArrowButtonListener extends MouseAdapter

    /**
     * Listener for cursor keys.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
        public void mouseExited(MouseEvent e) {

        /**
         * Invoked when the mouse exits the scrollbar.
         *
         * @param e MouseEvent further describing the event
         * @since 1.5
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
        public void mouseDragged(MouseEvent e) {

        /**
         * Set the models value to the position of the thumb's top of Vertical
         * scrollbar, or the left/right of Horizontal scrollbar in
         * left-to-right/right-to-left scrollbar relative to the origin of the
         * track.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
        public void mousePressed(MouseEvent e)

        /**
         * If the mouse is pressed above the "thumb" component
         * then reduce the scrollbars value by one page ("page up"),
         * otherwise increase it by one page.  If there is no
         * thumb then page up if the mouse is in the upper half
         * of the track.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected class TrackListener

    /**
     * Track mouse drags.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected class ModelListener implements ChangeListener {

    /**
     * A listener to listen for model changes.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    public boolean getSupportsAbsolutePositioning() {

    /**
     * Indicates whether the user can absolutely position the thumb with
     * a mouse gesture (usually the middle mouse button).
     *
     * @return true if a mouse gesture can absolutely position the thumb
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected Rectangle getTrackBounds() {

    /**
     * Returns the current bounds of the track, i.e. the space in between
     * the increment and decrement buttons, less the insets.  The value
     * returned by this method is updated each time the scrollbar is
     * laid out (validated).
     * <p>
     * <b>Warning </b>: the value returned by this method should not be
     * be modified, it's a reference to the actual rectangle, not a copy.
     *
     * @return the current bounds of the scrollbar track
     * @see #layoutContainer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected Rectangle getThumbBounds() {

    /**
     * Return the current size/location of the thumb.
     * <p>
     * <b>Warning </b>: the value returned by this method should not be
     * be modified, it's a reference to the actual rectangle, not a copy.
     *
     * @return The current size/location of the thumb.
     * @see #setThumbBounds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected void setThumbBounds(int x, int y, int width, int height)

    /**
     * Set the bounds of the thumb and force a repaint that includes
     * the old thumbBounds and the new one.
     *
     * @see #getThumbBounds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected Dimension getMaximumThumbSize()   {

    /**
     * Returns the largest acceptable size for the thumb.  To create a fixed
     * size thumb one make this method and <code>getMinimumThumbSize</code>
     * return the same value.
     * <p>
     * <b>Warning </b>: the value returned by this method should not be
     * be modified, it's a shared static constant.
     *
     * @return The largest acceptable size for the thumb.
     * @see #getMinimumThumbSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected Dimension getMinimumThumbSize() {

    /**
     * Returns the smallest acceptable size for the thumb.  If the scrollbar
     * becomes so small that this size isn't available, the thumb will be
     * hidden.
     * <p>
     * <b>Warning </b>: the value returned by this method should not be
     * be modified, it's a shared static constant.
     *
     * @return The smallest acceptable size for the thumb.
     * @see #getMaximumThumbSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * @param c The JScrollBar that's delegating this method to us.
     * @return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
     * @see #getMinimumSize
     * @see #getPreferredSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * A vertical scrollbar's preferred width is the maximum of
     * preferred widths of the (non <code>null</code>)
     * increment/decrement buttons,
     * and the minimum width of the thumb. The preferred height is the
     * sum of the preferred heights of the same parts.  The basis for
     * the preferred size of a horizontal scrollbar is similar.
     * <p>
     * The <code>preferredSize</code> is only computed once, subsequent
     * calls to this method just return a cached size.
     *
     * @param c the <code>JScrollBar</code> that's delegating this method to us
     * @return the preferred size of a Basic JScrollBar
     * @see #getMaximumSize
     * @see #getMinimumSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    public boolean isThumbRollover() {

    /**
     * Returns true if the mouse is currently over the thumb.
     *
     * @return true if the thumb is currently active
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected void setThumbRollover(boolean active) {

    /**
     * Sets whether or not the mouse is currently over the thumb.
     *
     * @param active True indicates the thumb is currently active.
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected int decrGap;

    /**
     * Distance between the decrement button and the track. This may be a negative
     * number. If negative, then an overlap between the button and track will occur,
     * which is useful for shaped buttons.
     *
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected int incrGap;

    /**
     * Distance between the increment button and the track. This may be a negative
     * number. If negative, then an overlap between the button and track will occur,
     * which is useful for shaped buttons.
     *
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    private int scrollBarValue;

    /**
     * The scrollbar value is cached to save real value if the view is adjusted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    private boolean useCachedValue = false;

    /**
     * Determine whether scrollbar layout should use cached value or adjusted
     * value returned by scrollbar's <code>getValue</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    protected int scrollBarWidth;

    /**
     * Hint as to what width (when vertical) or height (when horizontal)
     * should be.
     *
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
    private boolean supportsAbsolutePositioning;

    /** True indicates a middle click will absolutely position the
     * scrollbar. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicScrollBarUI.java
public class BasicScrollBarUI

/**
 * Implementation of ScrollBarUI for the Basic Look and Feel
 *
 * @author Rich Schiavi
 * @author David Kloba
 * @author Hans Muller
 */
