_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalTreeUI.java
    class LineListener implements PropertyChangeListener {

    /** This class listens for changes in line style */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalTreeUI.java
    protected void decodeLineStyle(Object lineStyleFlag) {

    /** this function converts between the string passed into the client property
      * and the internal representation (currently and int)
      *
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalTreeUI.java
public class MetalTreeUI extends BasicTreeUI {

/**
 * The metal look and feel implementation of <code>TreeUI</code>.
 * <p>
 * <code>MetalTreeUI</code> allows for configuring how to
 * visually render the spacing and delineation between nodes. The following
 * hints are supported:
 *
 * <table summary="Descriptions of supported hints: Angled, Horizontal, and None">
 *  <tr>
 *    <th><p style="text-align:left">Angled</p></th>
 *    <td>A line is drawn connecting the child to the parent. For handling
 *          of the root node refer to
 *          {@link javax.swing.JTree#setRootVisible} and
 *          {@link javax.swing.JTree#setShowsRootHandles}.
 *    </td>
 *  </tr>
 *  <tr>
 *     <th><p style="text-align:left">Horizontal</p></th>
 *     <td>A horizontal line is drawn dividing the children of the root node.</td>
 *  </tr>
 *  <tr>
 *      <th><p style="text-align:left">None</p></th>
 *      <td>Do not draw any visual indication between nodes.</td>
 *  </tr>
 * </table>
 *
 * <p>
 * As it is typically impractical to obtain the <code>TreeUI</code> from
 * the <code>JTree</code> and cast to an instance of <code>MetalTreeUI</code>
 * you enable this property via the client property
 * <code>JTree.lineStyle</code>. For example, to switch to
 * <code>Horizontal</code> style you would do:
 * <code>tree.putClientProperty("JTree.lineStyle", "Horizontal");</code>
 * <p>
 * The default is <code>Angled</code>.
 *
 * @author Tom Santos
 * @author Steve Wilson (value add stuff)
 */
