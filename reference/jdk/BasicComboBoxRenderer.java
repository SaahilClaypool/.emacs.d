_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxRenderer.java
    public static class UIResource extends BasicComboBoxRenderer implements javax.swing.plaf.UIResource {

    /**
     * A subclass of BasicComboBoxRenderer that implements UIResource.
     * BasicComboBoxRenderer doesn't implement UIResource
     * directly so that applications can safely override the
     * cellRenderer property with BasicListCellRenderer subclasses.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxRenderer.java
        if (isSelected) {

        /**if (isSelected) {
            setBackground(UIManager.getColor("ComboBox.selectionBackground"));
            setForeground(UIManager.getColor("ComboBox.selectionForeground"));
        } else {
            setBackground(UIManager.getColor("ComboBox.background"));
            setForeground(UIManager.getColor("ComboBox.foreground"));
        }**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxRenderer.java
    protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

   /**
    * An empty <code>Border</code>. This field might not be used. To change the
    * <code>Border</code> used by this renderer directly set it using
    * the <code>setBorder</code> method.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxRenderer.java
public class BasicComboBoxRenderer extends JLabel

/**
 * ComboBox renderer
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
 * @author Arnaud Weber
 */
