_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int calculatePosition(int spot, int width) {

        /**
         * Returns an integer indicating the position of <code>spot</code>
         * in <code>width</code>. The return value will be:
         * 0 if < BORDER_DRAG_THICKNESS
         * 1 if < CORNER_DRAG_WIDTH
         * 2 if >= CORNER_DRAG_WIDTH && < width - BORDER_DRAG_THICKNESS
         * 3 if >= width - CORNER_DRAG_WIDTH
         * 4 if >= width - BORDER_DRAG_THICKNESS
         * 5 otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int getCursor(int corner) {

        /**
         * Returns the Cursor to render for the specified corner. This returns
         * 0 if the corner doesn't map to a valid Cursor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int calculateCorner(Window w, int x, int y) {

        /**
         * Returns the corner that contains the point <code>x</code>,
         * <code>y</code>, or -1 if the position doesn't match a corner.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int dragHeight;

        /**
         * Height of the window when the drag started.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int dragWidth;

        /**
         * Width of the window when the drag started.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int dragOffsetY;

        /**
         * Y location the mouse went down on for a drag operation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int dragOffsetX;

        /**
         * X location the mouse went down on for a drag operation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        private int dragCursor;

        /**
         * Used to determine the corner the resize is occurring from.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private class MouseInputHandler implements MouseInputListener {

    /**
     * MouseInputHandler is responsible for handling resize/moving of
     * the Window. It sets the cursor directly on the Window when then
     * mouse moves over a hot spot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private static final int[] cursorMapping = new int[]

    /**
     * Maps from positions to cursor type. Refer to calculateCorner and
     * calculatePosition for details of this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        public void layoutContainer(Container parent) {

        /**
         * Instructs the layout manager to perform the layout for the specified
         * container.
         *
         * @param the Container for which this layout manager is being used
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        public Dimension maximumLayoutSize(Container target) {

        /**
         * Returns the maximum amount of space the layout can use.
         *
         * @param the Container for which this layout manager is being used
         * @return a Dimension object containing the layout's maximum size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        public Dimension minimumLayoutSize(Container parent) {

        /**
         * Returns the minimum amount of space the layout needs.
         *
         * @param the Container for which this layout manager is being used
         * @return a Dimension object containing the layout's minimum size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
        public Dimension preferredLayoutSize(Container parent) {

        /**
         * Returns the amount of space the layout would like to have.
         *
         * @param the Container for which this layout manager is being used
         * @return a Dimension object containing the layout's preferred size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    // NOTE: Ideally this would extends JRootPane.RootLayout, but that

    /**
     * A custom layout manager that is responsible for the layout of
     * layeredPane, glassPane, menuBar and titlePane, if one has been
     * installed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    public void propertyChange(PropertyChangeEvent e) {

    /**
     * Invoked when a property changes. <code>MetalRootPaneUI</code> is
     * primarily interested in events originating from the
     * <code>JRootPane</code> it has been installed on identifying the
     * property <code>windowDecorationStyle</code>. If the
     * <code>windowDecorationStyle</code> has changed to a value other
     * than <code>JRootPane.NONE</code>, this will add a <code>Component</code>
     * to the <code>JRootPane</code> to render the window decorations, as well
     * as installing a <code>Border</code> on the <code>JRootPane</code>.
     * On the other hand, if the <code>windowDecorationStyle</code> has
     * changed to <code>JRootPane.NONE</code>, this will remove the
     * <code>Component</code> that has been added to the <code>JRootPane</code>
     * as well resetting the Border to what it was before
     * <code>installUI</code> was invoked.
     *
     * @param e A PropertyChangeEvent object describing the event source
     *          and the property that has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private JRootPane getRootPane() {

    /**
     * Returns the <code>JRootPane</code> we're providing the look and
     * feel for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private JComponent getTitlePane() {

    /**
     * Returns the <code>JComponent</code> rendering the title pane. If this
     * returns null, it implies there is no need to render window decorations.
     *
     * @return the current window title pane, or null
     * @see #setTitlePane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void setTitlePane(JRootPane root, JComponent titlePane) {

    /**
     * Sets the window title pane -- the JComponent used to provide a plaf a
     * way to override the native operating system's window title pane with
     * one whose look and feel are controlled by the plaf.  The plaf creates
     * and sets this value; the default is null, implying a native operating
     * system window title pane.
     *
     * @param content the <code>JComponent</code> to use for the window title pane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private LayoutManager createLayoutManager() {

    /**
     * Returns a <code>LayoutManager</code> that will be set on the
     * <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private MouseInputListener createWindowMouseInputListener(JRootPane root) {

    /**
     * Returns a <code>MouseListener</code> that will be added to the
     * <code>Window</code> containing the <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private JComponent createTitlePane(JRootPane root) {

    /**
     * Returns the <code>JComponent</code> to render the window decoration
     * style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void uninstallClientDecorations(JRootPane root) {

    /**
     * Uninstalls any state that <code>installClientDecorations</code> has
     * installed.
     * <p>
     * NOTE: This may be called if you haven't installed client decorations
     * yet (ie before <code>installClientDecorations</code> has been invoked).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void installClientDecorations(JRootPane root) {

    /**
     * Installs the necessary state onto the JRootPane to render client
     * decorations. This is ONLY invoked if the <code>JRootPane</code>
     * has a decoration style other than <code>JRootPane.NONE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void uninstallLayout(JRootPane root) {

    /**
     * Uninstalls the previously installed <code>LayoutManager</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void installLayout(JRootPane root) {

    /**
     * Installs the appropriate LayoutManager on the <code>JRootPane</code>
     * to render the window decorations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void uninstallWindowListeners(JRootPane root) {

    /**
     * Uninstalls the necessary Listeners on the <code>Window</code> the
     * Listeners were last installed on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void installWindowListeners(JRootPane root, Component parent) {

    /**
     * Installs the necessary Listeners on the parent <code>Window</code>,
     * if there is one.
     * <p>
     * This takes the parent so that cleanup can be done from
     * <code>removeNotify</code>, at which point the parent hasn't been
     * reset yet.
     *
     * @param parent The parent of the JRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private void uninstallBorder(JRootPane root) {

    /**
     * Removes any border that may have been installed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    void installBorder(JRootPane root) {

    /**
     * Installs the appropriate <code>Border</code> onto the
     * <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    public void uninstallUI(JComponent c) {

    /**
     * Invokes supers implementation to uninstall any of its state. This will
     * also reset the <code>LayoutManager</code> of the <code>JRootPane</code>.
     * If a <code>Component</code> has been added to the <code>JRootPane</code>
     * to render the window decoration style, this method will remove it.
     * Similarly, this will revert the Border and LayoutManager of the
     * <code>JRootPane</code> to what it was before <code>installUI</code>
     * was invoked.
     *
     * @param c the JRootPane to uninstall state from
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    public void installUI(JComponent c) {

    /**
     * Invokes supers implementation of <code>installUI</code> to install
     * the necessary state onto the passed in <code>JRootPane</code>
     * to render the metal look and feel implementation of
     * <code>RootPaneUI</code>. If
     * the <code>windowDecorationStyle</code> property of the
     * <code>JRootPane</code> is other than <code>JRootPane.NONE</code>,
     * this will add a custom <code>Component</code> to render the widgets to
     * <code>JRootPane</code>, as well as installing a custom
     * <code>Border</code> and <code>LayoutManager</code> on the
     * <code>JRootPane</code>.
     *
     * @param c the JRootPane to install state onto
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for a <code>JRootPane</code>.
     *
     * @param c the JRootPane the RootPaneUI will be created for
     * @return the RootPaneUI implementation for the passed in JRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private Cursor lastCursor =

    /**
     * <code>Cursor</code> used to track the cursor set by the user.
     * This is initially <code>Cursor.DEFAULT_CURSOR</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private JRootPane root;

    /**
     * <code>JRootPane</code> providing the look and feel for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private LayoutManager savedOldLayout;

    /**
     * <code>LayoutManager</code> of the <code>JRootPane</code> before we
     * replaced it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private LayoutManager layoutManager;

    /**
     * The <code>LayoutManager</code> that is set on the
     * <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private MouseInputListener mouseInputListener;

    /**
     * <code>MouseInputListener</code> that is added to the parent
     * <code>Window</code> the <code>JRootPane</code> is contained in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private JComponent titlePane;

    /**
     * <code>JComponent</code> providing window decorations. This will be
     * null if not providing window decorations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private Window window;

    /**
     * Window the <code>JRootPane</code> is in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private static final int BORDER_DRAG_THICKNESS = 5;

    /**
     * Region from edges that dragging is active from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private static final int CORNER_DRAG_WIDTH = 16;

    /**
     * The amount of space (in pixels) that the cursor is changed on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
    private static final String[] borderKeys = new String[] {

    /**
     * Keys to lookup borders in defaults table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalRootPaneUI.java
public class MetalRootPaneUI extends BasicRootPaneUI

/**
 * Provides the metal look and feel implementation of <code>RootPaneUI</code>.
 * <p>
 * <code>MetalRootPaneUI</code> provides support for the
 * <code>windowDecorationStyle</code> property of <code>JRootPane</code>.
 * <code>MetalRootPaneUI</code> does this by way of installing a custom
 * <code>LayoutManager</code>, a private <code>Component</code> to render
 * the appropriate widgets, and a private <code>Border</code>. The
 * <code>LayoutManager</code> is always installed, regardless of the value of
 * the <code>windowDecorationStyle</code> property, but the
 * <code>Border</code> and <code>Component</code> are only installed/added if
 * the <code>windowDecorationStyle</code> is other than
 * <code>JRootPane.NONE</code>.
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
 * @author Terry Kellerman
 * @since 1.4
 */
