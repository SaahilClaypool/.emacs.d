_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxEditor.java
    public static class UIResource extends BasicComboBoxEditor

    /**
     * A subclass of BasicComboBoxEditor that implements UIResource.
     * BasicComboBoxEditor doesn't implement UIResource
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxEditor.java
    public void setItem(Object anObject) {

    /**
     * Sets the item that should be edited.
     *
     * @param anObject the displayed value of the editor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxEditor.java
    protected JTextField createEditorComponent() {

    /**
     * Creates the internal editor component. Override this to provide
     * a custom implementation.
     *
     * @return a new editor component
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxEditor.java
public class BasicComboBoxEditor implements ComboBoxEditor,FocusListener {

/**
 * The default editor for editable combo boxes. The editor is implemented as a JTextField.
 *
 * @author Arnaud Weber
 * @author Mark Davidson
 */
