_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
        protected Transferable createTransferable(JComponent c) {

        /**
         * Create a Transferable to use as the source for a data transfer.
         *
         * @param c  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  The representation of the data to be transfered.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public void paint(Graphics g, JComponent c) {

    /** Paint a representation of the <code>table</code> instance
     * that was set in installUI().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * Return the maximum size of the table. The maximum height is the
     * row heighttimes the number of rows.
     * The maximum width is the sum of the maximum widths of each column.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * Return the preferred size of the table. The preferred height is the
     * row height times the number of rows.
     * The preferred width is the sum of the preferred widths of each column.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * Return the minimum size of the table. The minimum height is the
     * row height times the number of rows.
     * The minimum width is the sum of the minimum widths of each column.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected void installKeyboardActions() {

    /**
     * Register all keyboard actions on the JTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected void installListeners() {

    /**
     * Attaches listeners to the JTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected void installDefaults() {

    /**
     * Initialize JTable properties, e.g. font, foreground, and background.
     * The font, foreground, and background properties are only set if their
     * current value is either null or a UIResource, other properties are set
     * if the current value is null.
     *
     * @see #installUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected MouseInputListener createMouseInputListener() {

    /**
     * Creates the mouse listener for the JTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected FocusListener createFocusListener() {

    /**
     * Creates the focus listener for handling keyboard navigation in the JTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    protected KeyListener createKeyListener() {

    /**
     * Creates the key listener for handling keyboard navigation in the JTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public class MouseInputHandler implements MouseInputListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTableUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    public class FocusHandler implements FocusListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicTableUI}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
     public class KeyHandler implements KeyListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicTableUI}.
     * <p>As of Java 2 platform v1.3 this class is no longer used.
     * Instead <code>JTable</code>
     * overrides <code>processKeyBinding</code> to dispatch the event to
     * the current <code>TableCellEditor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
        private void calcNextPos(int dx, int minX, int maxX,
                                 int dy, int minY, int maxY) {

        /**
         * Find the next lead row and column based on the given
         * dx/dy and max/min values.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
        private boolean moveWithinSelectedRange(JTable table, int dx, int dy,
                ListSelectionModel rsm, ListSelectionModel csm) {

        /**
         * Called to move within the selected range of the given JTable.
         * This method uses the table's notion of selection, which is
         * important to allow the user to navigate between items visually
         * selected on screen. This notion may or may not be the same as
         * what could be determined by directly querying the selection models.
         * It depends on certain table properties (such as whether or not
         * row or column selection is allowed). When performing modifications,
         * it is recommended that caution be taken in order to preserve
         * the intent of this method, especially when deciding whether to
         * query the selection models or interact with JTable directly.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
    private boolean isFileList = false;

    /**
     * Local cache of Table's client property "Table.isFileList"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTableUI.java
public class BasicTableUI extends TableUI

/**
 * BasicTableUI implementation
 *
 * @author Philip Milne
 * @author Shannon Hickey (drag and drop)
 */
