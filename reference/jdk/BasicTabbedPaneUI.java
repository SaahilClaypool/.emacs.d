_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public class FocusHandler extends FocusAdapter {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTabbedPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public class MouseHandler extends MouseAdapter {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTabbedPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public class TabSelectionHandler implements ChangeListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTabbedPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public class PropertyChangeHandler implements PropertyChangeListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTabbedPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
        public void actionPerformed(ActionEvent e) {

        /**
         * ActionListener for the scroll buttons.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
        void createButtons() {

        /**
         * Recreates the scroll buttons and adds them to the TabbedPane.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public class TabbedPaneLayout implements LayoutManager {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicTabbedPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected int getFocusIndex() {

    /**
     * Returns the index of the tab that has focus.
     *
     * @return index of tab that has focus
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void validateFocusIndex() {

    /**
     * Makes sure the focusIndex is valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void repaintTab(int index) {

    /**
     * Repaints the specified tab.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected View getTextViewForTab(int tabIndex) {

    /**
     * Returns the text View object required to render stylized text (HTML) for
     * the specified tab or null if no specialized text rendering is needed
     * for this tab. This is provided to support html rendering inside tabs.
     *
     * @param tabIndex the index of the tab
     * @return the text view to render the tab's text or null if no
     *         specialized rendering is required
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private Point translatePointToTabPanel(int srcx, int srcy, Point dest) {

    /**
     * Returns a point which is translated from the specified point in the
     * JTabbedPane's coordinate space to the coordinate space of the
     * ScrollableTabPanel.  This is used for SCROLL_TAB_LAYOUT ONLY.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private int getClosestTab(int x, int y) {

    /**
     * Returns the index of the tab closest to the passed in location, note
     * that the returned tab may not contain the location x,y.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected Rectangle getTabBounds(int tabIndex, Rectangle dest) {

    /**
     * Returns the bounds of the specified tab in the coordinate space
     * of the JTabbedPane component.  This is required because the tab rects
     * are by default defined in the coordinate space of the component where
     * they are rendered, which could be the JTabbedPane
     * (for WRAP_TAB_LAYOUT) or a ScrollableTabPanel (SCROLL_TAB_LAYOUT).
     * This method should be used whenever the tab rectangle must be relative
     * to the JTabbedPane itself and the result should be placed in a
     * designated Rectangle object (rather than instantiating and returning
     * a new Rectangle each time). The tab index parameter must be a valid
     * tabbed pane tab index (0 to tab count - 1, inclusive).  The destination
     * rectangle parameter must be a valid <code>Rectangle</code> instance.
     * The handling of invalid parameters is unspecified.
     *
     * @param tabIndex the index of the tab
     * @param dest the rectangle where the result should be placed
     * @return the resulting rectangle
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public int tabForCoordinate(JTabbedPane pane, int x, int y) {

    /**
     * Returns the tab index which intersects the specified point
     * in the JTabbedPane's coordinate space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    public Rectangle getTabBounds(JTabbedPane pane, int i) {

    /**
     * Returns the bounds of the specified tab index.  The bounds are
     * with respect to the JTabbedPane's coordinate space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected void paintTabBorder(Graphics g, int tabPlacement,
                                  int tabIndex,
                                  int x, int y, int w, int h,
                                  boolean isSelected ) {

    /**
      * this function draws the border around each tab
      * note that this function does now draw the background of the tab.
      * that is done elsewhere
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {

    /**
     * Paints the tabs in the tab area.
     * Invoked by paint().
     * The graphics parameter must be a valid <code>Graphics</code>
     * object.  Tab placement may be either:
     * <code>JTabbedPane.TOP</code>, <code>JTabbedPane.BOTTOM</code>,
     * <code>JTabbedPane.LEFT</code>, or <code>JTabbedPane.RIGHT</code>.
     * The selected index must be a valid tabbed pane tab index (0 to
     * tab count - 1, inclusive) or -1 if no tab is currently selected.
     * The handling of invalid parameters is unspecified.
     *
     * @param g the graphics object to use for rendering
     * @param tabPlacement the placement for the tabs within the JTabbedPane
     * @param selectedIndex the tab index of the selected component
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected int getBaselineOffset() {

    /**
     * Returns the amount the baseline is offset by.  This is typically
     * the same as <code>getTabLabelShiftY</code>.
     *
     * @return amount to offset the baseline by
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected int getBaseline(int tab) {

    /**
     * Returns the baseline for the specified tab.
     *
     * @param tab index of tab to get baseline for
     * @exception IndexOutOfBoundsException if index is out of range
     *            (index &lt; 0 || index &gt;= tab count)
     * @return baseline or a value &lt; 0 indicating there is no reasonable
     *                  baseline
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected int getRolloverTab() {

    /**
     * Returns the tab the mouse is currently over, or {@code -1} if the mouse is no
     * longer over any tab.
     *
     * @return the tab the mouse is currently over, or {@code -1} if the mouse is no
     * longer over any tab
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected void setRolloverTab(int index) {

    /**
     * Sets the tab the mouse is currently over to <code>index</code>.
     * <code>index</code> will be -1 if the mouse is no longer over any
     * tab. No checking is done to ensure the passed in index identifies a
     * valid tab.
     *
     * @param index Index of the tab the mouse is over.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void setRolloverTab(int x, int y) {

    /**
     * Sets the tab the mouse is over by location. This is a cover method
     * for <code>setRolloverTab(tabForCoordinate(x, y, false))</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void initMnemonics() {

    /**
     * Installs the state needed for mnemonics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void addMnemonic(int index, int mnemonic) {

    /**
     * Adds the specified mnemonic at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void resetMnemonics() {

    /**
     * Resets the mnemonics bindings to an empty state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private void updateMnemonics() {

    /**
     * Reloads the mnemonics. This should be invoked when a memonic changes,
     * when the title of a mnemonic changes, or when tabs are added/removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected void uninstallComponents() {

    /**
     * Removes any installed subcomponents from the JTabbedPane.
     * Invoked by uninstallUI.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected JButton createScrollButton(int direction) {

    /**
     * Creates and returns a JButton that will provide the user
     * with a way to scroll the tabs in a particular direction. The
     * returned JButton must be instance of UIResource.
     *
     * @param direction One of the SwingConstants constants:
     * SOUTH, NORTH, EAST or WEST
     * @return Widget for user to
     * @see javax.swing.JTabbedPane#setTabPlacement
     * @see javax.swing.SwingConstants
     * @throws IllegalArgumentException if direction is not one of
     *         NORTH, SOUTH, EAST or WEST
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected void installComponents() {

    /**
     * Creates and installs any required subcomponents for the JTabbedPane.
     * Invoked by installUI.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected LayoutManager createLayoutManager() {

    /**
     * Invoked by <code>installUI</code> to create
     * a layout manager object to manage
     * the <code>JTabbedPane</code>.
     *
     * @return a layout manager object
     *
     * @see TabbedPaneLayout
     * @see javax.swing.JTabbedPane#getTabLayoutPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private boolean isRunsDirty;

    /**
     * This is set to true when a component is added/removed from the tab
     * pane and set to false when layout happens.  If true it indicates that
     * tabRuns is not valid and shouldn't be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private int rolloverTabIndex;

    /**
     * Index of the tab the mouse is over.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private Handler handler;

    /**
     * Combined listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private int focusIndex;

    /**
     * Tab that has focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    protected transient Rectangle calcRect = new Rectangle(0,0,0,0);

    /**
     * A rectangle used for general layout calculations in order
     * to avoid constructing many new Rectangles on the fly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    private InputMap mnemonicInputMap;

    /**
     * InputMap used for mnemonics. Only non-null if the JTabbedPane has
     * mnemonics associated with it. Lazily created in initMnemonics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTabbedPaneUI.java
public class BasicTabbedPaneUI extends TabbedPaneUI implements SwingConstants {

/**
 * A Basic L&amp;F implementation of TabbedPaneUI.
 *
 * @author Amy Fowler
 * @author Philip Milne
 * @author Steve Wilson
 * @author Tom Santos
 * @author Dave Moore
 */
