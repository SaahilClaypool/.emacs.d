_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates an instance of PropertyChangeListener that's added to
     * the JScrollPane by installUI().  Subclasses can override this method
     * to return a custom PropertyChangeListener, e.g.
     * <pre>
     * class MyScrollPaneUI extends BasicScrollPaneUI {
     *    protected PropertyChangeListener <b>createPropertyChangeListener</b>() {
     *        return new MyPropertyChangeListener();
     *    }
     *    public class MyPropertyChangeListener extends PropertyChangeListener {
     *        public void propertyChange(PropertyChangeEvent e) {
     *            if (e.getPropertyName().equals("viewport")) {
     *                // do some extra work when the viewport changes
     *            }
     *            super.propertyChange(e);
     *        }
     *    }
     * }
     * </pre>
     *
     * @see java.beans.PropertyChangeListener
     * @see #installUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    protected MouseWheelListener createMouseWheelListener() {

    /**
     * Creates an instance of MouseWheelListener, which is added to the
     * JScrollPane by installUI().  The returned MouseWheelListener is used
     * to handle mouse wheel-driven scrolling.
     *
     * @return      MouseWheelListener which implements wheel-driven scrolling
     * @see #installUI
     * @see MouseWheelHandler
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
        public void mouseWheelMoved(MouseWheelEvent e) {

        /**
         * Called when the mouse wheel is rotated while over a
         * JScrollPane.
         *
         * @param e     MouseWheelEvent to be handled
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    protected class MouseWheelHandler implements MouseWheelListener {

    /**
     * MouseWheelHandler is an inner class which implements the
     * MouseWheelListener interface.  MouseWheelHandler responds to
     * MouseWheelEvents by scrolling the JScrollPane appropriately.
     * If the scroll pane's
     * <code>isWheelScrollingEnabled</code>
     * method returns false, no scrolling occurs.
     *
     * @see javax.swing.JScrollPane#isWheelScrollingEnabled
     * @see #createMouseWheelListener
     * @see java.awt.event.MouseWheelListener
     * @see java.awt.event.MouseWheelEvent
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    private PropertyChangeListener createVSBPropertyChangeListener() {

    /**
     * Returns a <code>PropertyChangeListener</code> that will be installed
     * on the vertical <code>JScrollBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    public class VSBChangeListener implements ChangeListener

    /**
     * Vertical scrollbar listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    private PropertyChangeListener createHSBPropertyChangeListener() {

    /**
     * Returns a <code>PropertyChangeListener</code> that will be installed
     * on the horizontal <code>JScrollBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    public class HSBChangeListener implements ChangeListener

    /**
     * Horizontal scrollbar listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    public class ViewportChangeHandler implements ChangeListener

    /**
     * Listener for viewport events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * @return new Dimension(Short.MAX_VALUE, Short.MAX_VALUE)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    private boolean setValueCalled = false;

    /**
     * State flag that shows whether setValue() was called from a user program
     * before the value of "extent" was set in right-to-left component
     * orientation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    private PropertyChangeListener hsbPropertyChangeListener;

    /**
     * PropertyChangeListener installed on the horizontal scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
    private PropertyChangeListener vsbPropertyChangeListener;

    /**
     * PropertyChangeListener installed on the vertical scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicScrollPaneUI.java
public class BasicScrollPaneUI

/**
 * A default L&amp;F implementation of ScrollPaneUI.
 *
 * @author Hans Muller
 */
