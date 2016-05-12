_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public static class UIResource extends DefaultTableCellRenderer

    /**
     * A subclass of <code>DefaultTableCellRenderer</code> that
     * implements <code>UIResource</code>.
     * <code>DefaultTableCellRenderer</code> doesn't implement
     * <code>UIResource</code>
     * directly so that applications can safely override the
     * <code>cellRenderer</code> property with
     * <code>DefaultTableCellRenderer</code> subclasses.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    protected void setValue(Object value) {

    /**
     * Sets the <code>String</code> object for the cell being rendered to
     * <code>value</code>.
     *
     * @param value  the string value for this cell; if value is
     *          <code>null</code> it sets the text value to an empty string
     * @see JLabel#setText
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) { }

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void repaint() {

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void repaint(Rectangle r) { }

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void repaint(long tm, int x, int y, int width, int height) {}

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void revalidate() {}

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void validate() {}

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public boolean isOpaque() {

    /**
     * Overridden for performance reasons.
     * See the <a href="#override">Implementation Note</a>
     * for more information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {

    /**
     *
     * Returns the default table cell renderer.
     * <p>
     * During a printing operation, this method will be called with
     * <code>isSelected</code> and <code>hasFocus</code> values of
     * <code>false</code> to prevent selection and focus from appearing
     * in the printed output. To do other customization based on whether
     * or not the table is being printed, check the return value from
     * {@link javax.swing.JComponent#isPaintingForPrint()}.
     *
     * @param table  the <code>JTable</code>
     * @param value  the value to assign to the cell at
     *                  <code>[row, column]</code>
     * @param isSelected true if cell is selected
     * @param hasFocus true if cell has focus
     * @param row  the row of the cell to render
     * @param column the column of the cell to render
     * @return the default table cell renderer
     * @see javax.swing.JComponent#isPaintingForPrint()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the look and feel
     * [L&amp;F] has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void setBackground(Color c) {

    /**
     * Overrides <code>JComponent.setBackground</code> to assign
     * the unselected-background color to the specified color.
     *
     * @param c set the background color to this value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public void setForeground(Color c) {

    /**
     * Overrides <code>JComponent.setForeground</code> to assign
     * the unselected-foreground color to the specified color.
     *
     * @param c set the foreground color to this value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    public DefaultTableCellRenderer() {

    /**
     * Creates a default table cell renderer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
    private static final Border SAFE_NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);

   /**
    * An empty <code>Border</code>. This field might not be used. To change the
    * <code>Border</code> used by this renderer override the
    * <code>getTableCellRendererComponent</code> method and set the border
    * of the returned component directly.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/DefaultTableCellRenderer.java
public class DefaultTableCellRenderer extends JLabel

/**
 * The standard class for rendering (displaying) individual cells
 * in a <code>JTable</code>.
 * <p>
 *
 * <strong><a name="override">Implementation Note:</a></strong>
 * This class inherits from <code>JLabel</code>, a standard component class.
 * However <code>JTable</code> employs a unique mechanism for rendering
 * its cells and therefore requires some slightly modified behavior
 * from its cell renderer.
 * The table class defines a single cell renderer and uses it as a
 * as a rubber-stamp for rendering all cells in the table;
 * it renders the first cell,
 * changes the contents of that cell renderer,
 * shifts the origin to the new location, re-draws it, and so on.
 * The standard <code>JLabel</code> component was not
 * designed to be used this way and we want to avoid
 * triggering a <code>revalidate</code> each time the
 * cell is drawn. This would greatly decrease performance because the
 * <code>revalidate</code> message would be
 * passed up the hierarchy of the container to determine whether any other
 * components would be affected.
 * As the renderer is only parented for the lifetime of a painting operation
 * we similarly want to avoid the overhead associated with walking the
 * hierarchy for painting operations.
 * So this class
 * overrides the <code>validate</code>, <code>invalidate</code>,
 * <code>revalidate</code>, <code>repaint</code>, and
 * <code>firePropertyChange</code> methods to be
 * no-ops and override the <code>isOpaque</code> method solely to improve
 * performance.  If you write your own renderer,
 * please keep this performance consideration in mind.
 * <p>
 *
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Philip Milne
 * @see JTable
 */
