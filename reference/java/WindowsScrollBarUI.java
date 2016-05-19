_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
        private void paintGrid(Graphics g, Color fg, Color bg) {

        /**
         * Actually renders the grid into the Graphics <code>g</code>.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
        public void paint(Graphics g, int x, int y, int w, int h) {

        /**
         * Paints the grid into the specified Graphics at the specified
         * location.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
    private static class Grid {

    /**
     * This should be pulled out into its own class if more classes need to
     * use it.
     * <p>
     * Grid is used to draw the track for windows scrollbars. Grids
     * are cached in a HashMap, with the key being the rgb components
     * of the foreground/background colors. Further the Grid is held through
     * a WeakRef so that it can be freed when no longer needed. As the
     * Grid is rather expensive to draw, it is drawn in a BufferedImage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
    private class WindowsArrowButton extends BasicArrowButton {

    /**
     * WindowsArrowButton is used for the buttons to position the
     * document up/down. It differs from BasicArrowButton in that the
     * preferred size is always a square.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
    @Override

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
    @Override

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for a JScrollBar.
     *
     * @param c the text field
     * @return the UI
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsScrollBarUI.java
public class WindowsScrollBarUI extends BasicScrollBarUI {

/**
 * Windows rendition of the component.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 */
