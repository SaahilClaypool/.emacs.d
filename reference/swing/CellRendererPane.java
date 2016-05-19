_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    protected class AccessibleCellRendererPane extends AccessibleAWTContainer {

    /**
     * This class implements accessibility support for the
     * <code>CellRendererPane</code> class.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this CellRendererPane.
     * For CellRendererPanes, the AccessibleContext takes the form of an
     * AccessibleCellRendererPane.
     * A new AccessibleCellRendererPane instance is created if necessary.
     *
     * @return an AccessibleCellRendererPane that serves as the
     *         AccessibleContext of this CellRendererPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    protected AccessibleContext accessibleContext = null;

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void paintComponent(Graphics g, Component c, Container p, Rectangle r) {

    /**
     * Calls this.paintComponent() with the rectangles x,y,width,height fields.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void paintComponent(Graphics g, Component c, Container p, int x, int y, int w, int h) {

    /**
     * Calls this.paintComponent(g, c, p, x, y, w, h, false).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void paintComponent(Graphics g, Component c, Container p, int x, int y, int w, int h, boolean shouldValidate) {

    /**
     * Paint a cell renderer component c on graphics object g.  Before the component
     * is drawn it's reparented to this (if that's necessary), it's bounds
     * are set to w,h and the graphics object is (effectively) translated to x,y.
     * If it's a JComponent, double buffering is temporarily turned off. After
     * the component is painted it's bounds are reset to -w, -h, 0, 0 so that, if
     * it's the last renderer component painted, it will not start consuming input.
     * The Container p is the component we're actually drawing on, typically it's
     * equal to this.getParent(). If shouldValidate is true the component c will be
     * validated before painted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    protected void addImpl(Component x, Object constraints, int index) {

    /**
     * If the specified component is already a child of this then we don't
     * bother doing anything - stacking order doesn't matter for cell
     * renderer components (CellRendererPane doesn't paint anyway).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void update(Graphics g) { }

    /**
     * Shouldn't be called.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void paint(Graphics g) { }

    /**
     * Shouldn't be called.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public void invalidate() { }

    /**
     * Overridden to avoid propagating a invalidate up the tree when the
     * cell renderer child is configured.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
    public CellRendererPane() {

    /**
     * Construct a CellRendererPane object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//CellRendererPane.java
public class CellRendererPane extends Container implements Accessible

/**
 * This class is inserted in between cell renderers and the components that
 * use them.  It just exists to thwart the repaint() and invalidate() methods
 * which would otherwise propagate up the tree when the renderer was configured.
 * It's used by the implementations of JTable, JTree, and JList.  For example,
 * here's how CellRendererPane is used in the code the paints each row
 * in a JList:
 * <pre>
 *   cellRendererPane = new CellRendererPane();
 *   ...
 *   Component rendererComponent = renderer.getListCellRendererComponent();
 *   renderer.configureListCellRenderer(dataModel.getElementAt(row), row);
 *   cellRendererPane.paintComponent(g, rendererComponent, this, x, y, w, h);
 * </pre>
 * <p>
 * A renderer component must override isShowing() and unconditionally return
 * true to work correctly because the Swing paint does nothing for components
 * with isShowing false.
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
 * @author Hans Muller
 */
