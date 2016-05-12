_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, int oldValue, int newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void repaint() {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    *
    * @since 1.5
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void repaint(Rectangle r) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void repaint(long tm, int x, int y, int width, int height) {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void revalidate() {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void invalidate() {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    *
    * @since 1.5
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void validate() {}

   /**
    * Overridden for performance reasons.
    * See the <a href="#override">Implementation Note</a>
    * for more information.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Dimension getPreferredSize() {

    /**
     * Overrides <code>JComponent.getPreferredSize</code> to
     * return slightly wider preferred size value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void paint(Graphics g) {

    /**
      * Paints the value.  The background is filled based on selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Component getTreeCellRendererComponent(JTree tree, Object value,
                                                  boolean sel,
                                                  boolean expanded,
                                                  boolean leaf, int row,
                                                  boolean hasFocus) {

    /**
      * Configures the renderer based on the passed in components.
      * The value is set from messaging the tree with
      * <code>convertValueToText</code>, which ultimately invokes
      * <code>toString</code> on <code>value</code>.
      * The foreground color is set based on the selection and the icon
      * is set based on the <code>leaf</code> and <code>expanded</code>
      * parameters.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setBackground(Color color) {

    /**
     * Subclassed to map <code>ColorUIResource</code>s to null. If
     * <code>color</code> is null, or a <code>ColorUIResource</code>, this
     * has the effect of letting the background color of the JTree show
     * through. On the other hand, if <code>color</code> is non-null, and not
     * a <code>ColorUIResource</code>, the background becomes
     * <code>color</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Font getFont() {

    /**
     * Gets the font of this component.
     * @return this component's font; if a font has not been set
     * for this component, the font of its parent is returned
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setFont(Font font) {

    /**
     * Subclassed to map <code>FontUIResource</code>s to null. If
     * <code>font</code> is null, or a <code>FontUIResource</code>, this
     * has the effect of letting the font of the JTree show
     * through. On the other hand, if <code>font</code> is non-null, and not
     * a <code>FontUIResource</code>, the font becomes <code>font</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Color getBorderSelectionColor() {

    /**
      * Returns the color the border is drawn.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setBorderSelectionColor(Color newColor) {

    /**
      * Sets the color to use for the border.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Color getBackgroundNonSelectionColor() {

    /**
      * Returns the background color to be used for non selected nodes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setBackgroundNonSelectionColor(Color newColor) {

    /**
      * Sets the background color to be used for non selected nodes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Color getBackgroundSelectionColor() {

    /**
      * Returns the color to use for the background if node is selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setBackgroundSelectionColor(Color newColor) {

    /**
      * Sets the color to use for the background if node is selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Color getTextNonSelectionColor() {

    /**
      * Returns the color the text is drawn with when the node isn't selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setTextNonSelectionColor(Color newColor) {

    /**
      * Sets the color the text is drawn with when the node isn't selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Color getTextSelectionColor() {

    /**
      * Returns the color the text is drawn with when the node is selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setTextSelectionColor(Color newColor) {

    /**
      * Sets the color the text is drawn with when the node is selected.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getLeafIcon() {

    /**
      * Returns the icon used to represent leaf nodes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setLeafIcon(Icon newIcon) {

    /**
      * Sets the icon used to represent leaf nodes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getClosedIcon() {

    /**
      * Returns the icon used to represent non-leaf nodes that are not
      * expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setClosedIcon(Icon newIcon) {

    /**
      * Sets the icon used to represent non-leaf nodes that are not expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getOpenIcon() {

    /**
      * Returns the icon used to represent non-leaf nodes that are expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void setOpenIcon(Icon newIcon) {

    /**
      * Sets the icon used to represent non-leaf nodes that are expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getDefaultLeafIcon() {

    /**
      * Returns the default icon, for the current laf, that is used to
      * represent leaf nodes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getDefaultClosedIcon() {

    /**
      * Returns the default icon, for the current laf, that is used to
      * represent non-leaf nodes that are not expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public Icon getDefaultOpenIcon() {

    /**
      * Returns the default icon, for the current laf, that is used to
      * represent non-leaf nodes that are expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public void updateUI() {

    /**
     * {@inheritDoc}
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    public DefaultTreeCellRenderer() {

    /**
     * Creates a {@code DefaultTreeCellRenderer}. Icons and text color are
     * determined from the {@code UIManager}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    private boolean inited;

    /**
     * Set to true after the constructor has run.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected Color borderSelectionColor;

    /** Color to use for the focus indicator when the node has focus. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected Color backgroundNonSelectionColor;

    /** Color to use for the background when the node isn't selected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected Color backgroundSelectionColor;

    /** Color to use for the background when a node is selected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected Color textNonSelectionColor;

    /** Color to use for the foreground for non-selected nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected Color textSelectionColor;

    /** Color to use for the foreground for selected nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    transient protected Icon openIcon;

    /** Icon used to show non-leaf nodes that are expanded. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    transient protected Icon leafIcon;

    /** Icon used to show leaf nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    transient protected Icon closedIcon;

    /** Icon used to show non-leaf nodes that aren't expanded. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    private Color treeBGColor;

    /**
     * Background color of the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    private boolean drawsFocusBorderAroundIcon;

    /** True if draws focus border around icon as well. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    protected boolean selected;

    /** Is the value currently selected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
    private JTree tree;

    /** Last tree the renderer was painted in. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellRenderer.java
public class DefaultTreeCellRenderer extends JLabel implements TreeCellRenderer

/**
 * Displays an entry in a tree.
 * <code>DefaultTreeCellRenderer</code> is not opaque and
 * unless you subclass paint you should not change this.
 * See <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html">How to Use Trees</a>
 * in <em>The Java Tutorial</em>
 * for examples of customizing node display using this class.
 * <p>
 * The set of icons and colors used by {@code DefaultTreeCellRenderer}
 * can be configured using the various setter methods. The value for
 * each property is initialized from the defaults table. When the
 * look and feel changes ({@code updateUI} is invoked), any properties
 * that have a value of type {@code UIResource} are refreshed from the
 * defaults table. The following table lists the mapping between
 * {@code DefaultTreeCellRenderer} property and defaults table key:
 * <table border="1" cellpadding="1" cellspacing="0" summary="">
 *   <tr valign="top"  align="left">
 *     <th style="background-color:#CCCCFF" align="left">Property:
 *     <th style="background-color:#CCCCFF" align="left">Key:
 *   <tr><td>"leafIcon"<td>"Tree.leafIcon"
 *   <tr><td>"closedIcon"<td>"Tree.closedIcon"
 *   <tr><td>"openIcon"<td>"Tree.openIcon"
 *   <tr><td>"textSelectionColor"<td>"Tree.selectionForeground"
 *   <tr><td>"textNonSelectionColor"<td>"Tree.textForeground"
 *   <tr><td>"backgroundSelectionColor"<td>"Tree.selectionBackground"
 *   <tr><td>"backgroundNonSelectionColor"<td>"Tree.textBackground"
 *   <tr><td>"borderSelectionColor"<td>"Tree.selectionBorderColor"
 * </table>
 * <p>
 * <strong><a name="override">Implementation Note:</a></strong>
 * This class overrides
 * <code>invalidate</code>,
 * <code>validate</code>,
 * <code>revalidate</code>,
 * <code>repaint</code>,
 * and
 * <code>firePropertyChange</code>
 * solely to improve performance.
 * If not overridden, these frequently called methods would execute code paths
 * that are unnecessary for the default tree cell renderer.
 * If you write your own renderer,
 * take care to weigh the benefits and
 * drawbacks of overriding these methods.
 *
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
 * @author Rob Davis
 * @author Ray Ryan
 * @author Scott Violet
 */
