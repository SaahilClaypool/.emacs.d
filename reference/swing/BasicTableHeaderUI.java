_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * Return the maximum size of the header. The maximum width is the sum
     * of the maximum widths of each column (plus inter-cell spacing).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * Return the preferred size of the header. The preferred height is the
     * maximum of the preferred heights of all of the components provided
     * by the header renderers. The preferred width is the sum of the
     * preferred widths of each column (plus inter-cell spacing).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * Return the minimum size of the header. The minimum width is the sum
     * of the minimum widths of each column (plus inter-cell spacing).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    private void scrollToColumn(int col) {

    /**
     * Used by selectColumn to scroll horizontally, if necessary,
     * to ensure that the newly selected column is visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    void selectColumn(int newColIndex) {

    /**
     * Selects the specified column in the table header. Repaints the
     * affected header cells and makes sure the newly selected one is visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected void rolloverColumnUpdated(int oldColumn, int newColumn) {

    /**
     * This method gets called every time when a rollover column in the table
     * header is updated. Every look and feel that supports a rollover effect
     * in a table header should override this method and repaint the header.
     *
     * @param oldColumn the index of the previous rollover column or -1 if the
     * mouse was not over a column
     * @param newColumn the index of the new rollover column or -1 if the mouse
     * is not over a column
     * @see #getRolloverColumn()
     * @see JTableHeader#getHeaderRect(int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected int getRolloverColumn() {

    /**
     * Returns the index of the column header over which the mouse
     * currently is. When the mouse is not over the table header,
     * -1 is returned.
     *
     * @see #rolloverColumnUpdated(int, int)
     * @return the index of the current rollover column
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    static void loadActionMap(LazyActionMap map) {

    /**
     * Populates TableHeader's actions.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected void uninstallKeyboardActions() {

    /**
     * Unregisters default key actions.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected void installKeyboardActions() {

    /**
     * Register all keyboard actions on the JTableHeader.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected void installListeners() {

    /**
     * Attaches listeners to the JTableHeader.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected void installDefaults() {

    /**
     * Initializes JTableHeader properties such as font, foreground, and background.
     * The font, foreground, and background properties are only set if their
     * current value is either null or a UIResource, other properties are set
     * if the current value is null.
     *
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected MouseInputListener createMouseInputListener() {

    /**
     * Creates the mouse listener for the JTableHeader.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    public class MouseInputHandler implements MouseInputListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicTableHeaderUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
    protected JTableHeader header;

    /** The JTableHeader that is delegating the painting to this UI. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTableHeaderUI.java
public class BasicTableHeaderUI extends TableHeaderUI {

/**
 * BasicTableHeaderUI implementation
 *
 * @author Alan Chung
 * @author Philip Milne
 */
