_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    private class OneTouchActionHandler implements ActionListener {

    /**
     * Listeners installed on the one touch expandable buttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected class DividerLayout implements LayoutManager

    /**
     * Used to layout a <code>BasicSplitPaneDivider</code>.
     * Layout for the divider
     * involves appropriately moving the left/right buttons around.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected int positionForMouseEvent(MouseEvent e) {

        /**
         * Returns the new position to put the divider at based on
         * the passed in MouseEvent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected int getNeededLocation(int x, int y) {

        /**
         * Returns the y argument, since this is used for vertical
         * splits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected class VerticalDragController extends DragController

    /**
     * Handles the events during a dragging session for a
     * VERTICAL_SPLIT oriented split pane. This continually
     * messages <code>dragDividerTo</code> and then when done messages
     * <code>finishDraggingTo</code>. When an instance is created it should be
     * messaged with <code>isValid</code> to insure that dragging can happen
     * (dragging won't be allowed if the two views can not be resized).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected void completeDrag(MouseEvent e) {

        /**
         * Messages finishDraggingTo with the new location for the mouse
         * event.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected void continueDrag(MouseEvent e) {

        /**
         * Messages dragDividerTo with the new location for the mouse
         * event.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected int getNeededLocation(int x, int y) {

        /**
         * Returns the x argument, since this is used for horizontal
         * splits.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected int positionForMouseEvent(MouseEvent e) {

        /**
         * Returns the new position to put the divider at based on
         * the passed in MouseEvent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        protected boolean isValid() {

        /**
         * Returns true if the dragging session is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        int offset;

        /**
         * Initial location the mouse down happened at.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        int maxX, minX;

        /**
         * Maximum and minimum positions to drag to.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        int initialX;

        /**
         * Initial location of the divider.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected class DragController

    /**
     * Handles the events during a dragging session for a
     * HORIZONTAL_SPLIT oriented split pane. This continually
     * messages <code>dragDividerTo</code> and then when done messages
     * <code>finishDraggingTo</code>. When an instance is created it should be
     * messaged with <code>isValid</code> to insure that dragging can happen
     * (dragging won't be allowed if the two views can not be resized).
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mouseExited(MouseEvent e) {

        /**
         * Invoked when the mouse exits a component.
         *
         * @param e MouseEvent describing the details of the exit event.
         * @since 1.5
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mouseEntered(MouseEvent e) {

        /**
         * Invoked when the mouse enters a component.
         *
         * @param e MouseEvent describing the details of the enter event.
         * @since 1.5
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mouseMoved(MouseEvent e) {

        /**
         *  Resets the cursor based on the orientation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mouseDragged(MouseEvent e) {

        /**
         * If dragger is not null it is messaged with continueDrag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mouseReleased(MouseEvent e) {

        /**
         * If dragger is not null it is messaged with completeDrag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
        public void mousePressed(MouseEvent e) {

        /**
         * Starts the dragging session by creating the appropriate instance
         * of DragController.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected class MouseHandler extends MouseAdapter

    /**
     * MouseHandler is responsible for converting mouse events
     * (released, dragged...) into the appropriate DragController
     * methods.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected void finishDraggingTo(int location) {

    /**
     * Messages the BasicSplitPaneUI with finishDraggingTo that this instance
     * is contained in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected void dragDividerTo(int location) {

    /**
     * Messages the BasicSplitPaneUI with dragDividerTo that this instance
     * is contained in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected void prepareForDragging() {

    /**
     * Message to prepare for dragging. This messages the BasicSplitPaneUI
     * with startDragging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected JButton createRightOneTouchButton() {

    /**
     * Creates and return an instance of JButton that can be used to
     * collapse the right component in the split pane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected JButton createLeftOneTouchButton() {

    /**
     * Creates and return an instance of JButton that can be used to
     * collapse the left component in the split pane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected void oneTouchExpandableChanged() {

    /**
     * Messaged when the oneTouchExpandable value of the JSplitPane the
     * receiver is contained in changes. Will create the
     * <code>leftButton</code> and <code>rightButton</code> if they
     * are null. invalidates the receiver as well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public void paint(Graphics g) {

    /**
     * Paints the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public void propertyChange(PropertyChangeEvent e) {

    /**
     * Property change event, presumably from the JSplitPane, will message
     * updateOrientation if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public Dimension getMinimumSize() {

    /**
     * Returns dividerSize x dividerSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public Dimension getPreferredSize() {

    /**
     * Returns dividerSize x dividerSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public boolean isMouseOver() {

    /**
     * Returns whether or not the mouse is currently over the divider
     *
     * @return whether or not the mouse is currently over the divider
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected void setMouseOver(boolean mouseOver) {

    /**
     * Sets whether or not the mouse is currently over the divider.
     *
     * @param mouseOver whether or not the mouse is currently over the divider
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public Insets getInsets() {

    /**
     * If a border has been set on this component, returns the
     * border's insets, else calls super.getInsets.
     *
     * @return the value of the insets property.
     * @see #setBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public Border getBorder() {

    /**
     * Returns the border of this component or null if no border is
     * currently set.
     *
     * @return the border object for this component
     * @see #setBorder
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public void setBorder(Border border) {

    /**
     * Sets the border of this component.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public int getDividerSize() {

    /**
     * Returns the size of the divider, that is the width if the splitpane
     * is HORIZONTAL_SPLIT, or the height of VERTICAL_SPLIT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public void setDividerSize(int newSize) {

    /**
     * Sets the size of the divider to <code>newSize</code>. That is
     * the width if the splitpane is <code>HORIZONTAL_SPLIT</code>, or
     * the height of <code>VERTICAL_SPLIT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public BasicSplitPaneUI getBasicSplitPaneUI() {

    /**
     * Returns the <code>SplitPaneUI</code> the receiver is currently
     * in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public void setBasicSplitPaneUI(BasicSplitPaneUI newUI) {

    /**
     * Sets the SplitPaneUI that is using the receiver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    public BasicSplitPaneDivider(BasicSplitPaneUI ui) {

    /**
     * Creates an instance of BasicSplitPaneDivider. Registers this
     * instance for mouse events and mouse dragged events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    private boolean centerOneTouchButtons;

    /**
     * If true the one touch buttons are centered on the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    private boolean mouseOver;

    /**
     * Is the mouse over the divider?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    private Border border;

    /** Border. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected JButton rightButton;

    /**
     * Button for quickly toggling the right component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected JButton leftButton;

    /**
     * Button for quickly toggling the left component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected int orientation;

    /**
     * Orientation of the JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected MouseHandler mouseHandler;

    /**
     * Handles mouse events from both this class, and the split pane.
     * Mouse events are handled for the splitpane since you want to be able
     * to drag when clicking on the border of the divider, which is not
     * drawn by the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected JSplitPane splitPane;

    /**
     * JSplitPane the receiver is contained in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected Component hiddenDivider;

    /**
     * Divider that is used for noncontinuous layout mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected int dividerSize = 0; // default - SET TO 0???

    /**
     * Size of the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected BasicSplitPaneUI splitPaneUI;

    /**
     * UI this instance was created from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected DragController dragger;

    /**
     * Handles mouse dragging message to do the actual dragging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
    protected static final int ONE_TOUCH_SIZE = 6;

    /**
     * Width or height of the divider based on orientation
     * BasicSplitPaneUI adds two to this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneDivider.java
public class BasicSplitPaneDivider extends Container

/**
 * Divider used by BasicSplitPaneUI. Subclassers may wish to override
 * paint to do something more interesting.
 * The border effect is drawn in BasicSplitPaneUI, so if you don't like
 * that border, reset it there.
 * To conditionally drag from certain areas subclass mousePressed and
 * call super when you wish the dragging to begin.
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
 * @author Scott Violet
 */
