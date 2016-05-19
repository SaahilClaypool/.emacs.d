_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public static class UIResource extends ScrollPaneLayout implements javax.swing.plaf.UIResource {}

    /**
     * The UI resource version of <code>ScrollPaneLayout</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    @Deprecated

    /**
     * Returns the bounds of the border around the specified scroll pane's
     * viewport.
     *
     * @return the size and position of the viewport border
     * @deprecated As of JDK version Swing1.1
     *    replaced by <code>JScrollPane.getViewportBorderBounds()</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    private void adjustForHSB(boolean wantsHSB, Rectangle available,
                              Rectangle hsbR, Insets vpbInsets) {

    /**
     * Adjusts the <code>Rectangle</code> <code>available</code> based on if
     * the horizontal scrollbar is needed (<code>wantsHSB</code>).
     * The location of the hsb is updated in <code>hsbR</code>, and
     * the viewport border insets (<code>vpbInsets</code>) are used to offset
     * the hsb.  This is only called when <code>wantsHSB</code> has
     * changed, eg you shouldn't invoked adjustForHSB(true) twice.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    private void adjustForVSB(boolean wantsVSB, Rectangle available,
                              Rectangle vsbR, Insets vpbInsets,
                              boolean leftToRight) {

    /**
     * Adjusts the <code>Rectangle</code> <code>available</code> based on if
     * the vertical scrollbar is needed (<code>wantsVSB</code>).
     * The location of the vsb is updated in <code>vsbR</code>, and
     * the viewport border insets (<code>vpbInsets</code>) are used to offset
     * the vsb. This is only called when <code>wantsVSB</code> has
     * changed, eg you shouldn't invoke adjustForVSB(true) twice.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void layoutContainer(Container parent)

    /**
     * Lays out the scrollpane. The positioning of components depends on
     * the following constraints:
     * <ul>
     * <li> The row header, if present and visible, gets its preferred
     * width and the viewport's height.
     *
     * <li> The column header, if present and visible, gets its preferred
     * height and the viewport's width.
     *
     * <li> If a vertical scrollbar is needed, i.e. if the viewport's extent
     * height is smaller than its view height or if the <code>displayPolicy</code>
     * is ALWAYS, it's treated like the row header with respect to its
     * dimensions and is made visible.
     *
     * <li> If a horizontal scrollbar is needed, it is treated like the
     * column header (see the paragraph above regarding the vertical scrollbar).
     *
     * <li> If the scrollpane has a non-<code>null</code>
     * <code>viewportBorder</code>, then space is allocated for that.
     *
     * <li> The viewport gets the space available after accounting for
     * the previous constraints.
     *
     * <li> The corner components, if provided, are aligned with the
     * ends of the scrollbars and headers. If there is a vertical
     * scrollbar, the right corners appear; if there is a horizontal
     * scrollbar, the lower corners appear; a row header gets left
     * corners, and a column header gets upper corners.
     * </ul>
     *
     * @param parent the <code>Container</code> to lay out
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public Dimension minimumLayoutSize(Container parent)

    /**
     * The minimum size of a <code>ScrollPane</code> is the size of the insets
     * plus minimum size of the viewport, plus the scrollpane's
     * viewportBorder insets, plus the minimum size
     * of the visible headers, plus the minimum size of the
     * scrollbars whose displayPolicy isn't NEVER.
     *
     * @param parent the <code>Container</code> that will be laid out
     * @return a <code>Dimension</code> object specifying the minimum size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public Dimension preferredLayoutSize(Container parent)

    /**
     * The preferred size of a <code>ScrollPane</code> is the size of the insets,
     * plus the preferred size of the viewport, plus the preferred size of
     * the visible headers, plus the preferred size of the scrollbars
     * that will appear given the current view and the current
     * scrollbar displayPolicies.
     * <p>Note that the rowHeader is calculated as part of the preferred width
     * and the colHeader is calculated as part of the preferred size.
     *
     * @param parent the <code>Container</code> that will be laid out
     * @return a <code>Dimension</code> object specifying the preferred size of the
     *         viewport and any scrollbars
     * @see ViewportLayout
     * @see LayoutManager
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public Component getCorner(String key) {

    /**
     * Returns the <code>Component</code> at the specified corner.
     * @param key the <code>String</code> specifying the corner
     * @return the <code>Component</code> at the specified corner, as defined in
     *         {@link ScrollPaneConstants}; if <code>key</code> is not one of the
     *          four corners, <code>null</code> is returned
     * @see JScrollPane#getCorner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public JViewport getColumnHeader() {

    /**
     * Returns the <code>JViewport</code> object that is the column header.
     * @return the <code>JViewport</code> object that is the column header
     * @see JScrollPane#getColumnHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public JViewport getRowHeader() {

    /**
     * Returns the <code>JViewport</code> object that is the row header.
     * @return the <code>JViewport</code> object that is the row header
     * @see JScrollPane#getRowHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public JScrollBar getVerticalScrollBar() {

    /**
     * Returns the <code>JScrollBar</code> object that handles vertical scrolling.
     * @return the <code>JScrollBar</code> object that handles vertical scrolling
     * @see JScrollPane#getVerticalScrollBar
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public JScrollBar getHorizontalScrollBar() {

    /**
     * Returns the <code>JScrollBar</code> object that handles horizontal scrolling.
     * @return the <code>JScrollBar</code> object that handles horizontal scrolling
     * @see JScrollPane#getHorizontalScrollBar
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public JViewport getViewport() {

    /**
     * Returns the <code>JViewport</code> object that displays the
     * scrollable contents.
     * @return the <code>JViewport</code> object that displays the scrollable contents
     * @see JScrollPane#getViewport
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void setHorizontalScrollBarPolicy(int x) {

    /**
     * Sets the horizontal scrollbar-display policy.
     * The options are:<ul>
     * <li>ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
     * <li>ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
     * <li>ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS
     * </ul>
     * Note: Applications should use the <code>JScrollPane</code> version
     * of this method.  It only exists for backwards compatibility
     * with the Swing 1.0.2 (and earlier) versions of this class.
     *
     * @param x an int giving the display policy
     * @exception IllegalArgumentException if <code>x</code> is not a valid
     *          horizontal scrollbar policy, as listed above
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public int getHorizontalScrollBarPolicy() {

    /**
     * Returns the horizontal scrollbar-display policy.
     *
     * @return an integer giving the display policy
     * @see #setHorizontalScrollBarPolicy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void setVerticalScrollBarPolicy(int x) {

    /**
     * Sets the vertical scrollbar-display policy. The options
     * are:
     * <ul>
     * <li>ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED
     * <li>ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER
     * <li>ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
     * </ul>
     * Note: Applications should use the <code>JScrollPane</code> version
     * of this method.  It only exists for backwards compatibility
     * with the Swing 1.0.2 (and earlier) versions of this class.
     *
     * @param x an integer giving the display policy
     * @exception IllegalArgumentException if <code>x</code> is an invalid
     *          vertical scroll bar policy, as listed above
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public int getVerticalScrollBarPolicy() {

    /**
     * Returns the vertical scrollbar-display policy.
     *
     * @return an integer giving the display policy
     * @see #setVerticalScrollBarPolicy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void removeLayoutComponent(Component c)

    /**
     * Removes the specified component from the layout.
     *
     * @param c the component to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void addLayoutComponent(String s, Component c)

    /**
     * Adds the specified component to the layout. The layout is
     * identified using one of:
     * <ul>
     * <li>ScrollPaneConstants.VIEWPORT
     * <li>ScrollPaneConstants.VERTICAL_SCROLLBAR
     * <li>ScrollPaneConstants.HORIZONTAL_SCROLLBAR
     * <li>ScrollPaneConstants.ROW_HEADER
     * <li>ScrollPaneConstants.COLUMN_HEADER
     * <li>ScrollPaneConstants.LOWER_LEFT_CORNER
     * <li>ScrollPaneConstants.LOWER_RIGHT_CORNER
     * <li>ScrollPaneConstants.UPPER_LEFT_CORNER
     * <li>ScrollPaneConstants.UPPER_RIGHT_CORNER
     * </ul>
     *
     * @param s the component identifier
     * @param c the the component to be added
     * @exception IllegalArgumentException if <code>s</code> is an invalid key
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected Component addSingletonComponent(Component oldC, Component newC)

    /**
     * Removes an existing component.  When a new component, such as
     * the left corner, or vertical scrollbar, is added, the old one,
     * if it exists, must be removed.
     * <p>
     * This method returns <code>newC</code>. If <code>oldC</code> is
     * not equal to <code>newC</code> and is non-<code>null</code>,
     * it will be removed from its parent.
     *
     * @param oldC the <code>Component</code> to replace
     * @param newC the <code>Component</code> to add
     * @return the <code>newC</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    public void syncWithScrollPane(JScrollPane sp) {

    /**
     * This method is invoked after the ScrollPaneLayout is set as the
     * LayoutManager of a <code>JScrollPane</code>.
     * It initializes all of the internal fields that
     * are ordinarily set by <code>addLayoutComponent</code>.  For example:
     * <pre>
     * ScrollPaneLayout mySPLayout = new ScrollPanelLayout() {
     *     public void layoutContainer(Container p) {
     *         super.layoutContainer(p);
     *         // do some extra work here ...
     *     }
     * };
     * scrollpane.setLayout(mySPLayout):
     * </pre>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected int hsbPolicy = HORIZONTAL_SCROLLBAR_AS_NEEDED;

    /**
     * The display policy for the horizontal scrollbar.
     * The default is <code>ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED</code>.
     * <p>
     * This field is obsolete, please use the <code>JScrollPane</code> field instead.
     *
     * @see JScrollPane#setHorizontalScrollBarPolicy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected int vsbPolicy = VERTICAL_SCROLLBAR_AS_NEEDED;

    /**
     * The display policy for the vertical scrollbar.
     * The default is <code>ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED</code>.
     * <p>
     * This field is obsolete, please use the <code>JScrollPane</code> field instead.
     *
     * @see JScrollPane#setVerticalScrollBarPolicy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected Component upperRight;

    /**
     * The component to display in the upper right corner.
     * Default is <code>null</code>.
     * @see JScrollPane#setCorner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected Component upperLeft;

    /**
     * The component to display in the upper left corner.
     * Default is <code>null</code>.
     * @see JScrollPane#setCorner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected Component lowerRight;

    /**
     * The component to display in the lower right corner.
     * Default is <code>null</code>.
     * @see JScrollPane#setCorner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected Component lowerLeft;

    /**
     * The component to display in the lower left corner.
     * Default is <code>null</code>.
     * @see JScrollPane#setCorner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected JViewport colHead;

    /**
     * The column header child.  Default is <code>null</code>.
     * @see JScrollPane#setColumnHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected JViewport rowHead;

    /**
     * The row header child.  Default is <code>null</code>.
     * @see JScrollPane#setRowHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected JScrollBar hsb;

    /**
     * The scrollpane's horizontal scrollbar child.
     * Default is a <code>JScrollBar</code>.
     * @see JScrollPane#setHorizontalScrollBar
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected JScrollBar vsb;

    /**
     * The scrollpane's vertical scrollbar child.
     * Default is a <code>JScrollBar</code>.
     * @see JScrollPane#setVerticalScrollBar
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
    protected JViewport viewport;

    /**
     * The scrollpane's viewport child.
     * Default is an empty <code>JViewport</code>.
     * @see JScrollPane#setViewport
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ScrollPaneLayout.java
public class ScrollPaneLayout

/**
 * The layout manager used by <code>JScrollPane</code>.
 * <code>JScrollPaneLayout</code> is
 * responsible for nine components: a viewport, two scrollbars,
 * a row header, a column header, and four "corner" components.
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
 * @see JScrollPane
 * @see JViewport
 *
 * @author Hans Muller
 */
