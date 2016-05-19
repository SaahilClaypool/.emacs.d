_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    private static class ButtonAreaLayout implements LayoutManager {

    /**
     * <code>ButtonAreaLayout</code> behaves in a similar manner to
     * <code>FlowLayout</code>. It lays out all components from left to
     * right, flushed right. The widths of all components will be set
     * to the largest preferred size width.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    protected class DirectoryComboBoxAction extends AbstractAction {

    /**
     * Acts when DirectoryComboBox has changed the selected item.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    protected class FilterComboBoxModel extends AbstractListModel<Object> implements ComboBoxModel<Object>, PropertyChangeListener {

    /**
     * Data model for a type-face selection combo-box.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    public class FilterComboBoxRenderer extends DefaultListCellRenderer {

    /**
     * Render different type sizes and styles.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
        private void addItem(File directory) {

        /**
         * Adds the directory to the model and sets it to be selected,
         * additionally clears out the previous selected directory and
         * the paths leading up to it, if any.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    protected class DirectoryComboBoxModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {

    /**
     * Data model for a type-face selection combo-box.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    protected void setDirectorySelected(boolean directorySelected) {

    /**
     * Property to remember whether a directory is currently selected in the UI.
     * This is normally called by the UI on a selection event.
     *
     * @param directorySelected if a directory is currently selected.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * Returns the maximum size of the <code>JFileChooser</code>.
     *
     * @param c  a <code>JFileChooser</code>
     * @return   a <code>Dimension</code> specifying the maximum
     *           width and height of the file chooser
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * Returns the minimum size of the <code>JFileChooser</code>.
     *
     * @param c  a <code>JFileChooser</code>
     * @return   a <code>Dimension</code> specifying the minimum
     *           width and height of the file chooser
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * Returns the preferred size of the specified
     * <code>JFileChooser</code>.
     * The preferred size is at least as large,
     * in both height and width,
     * as the preferred size recommended
     * by the file chooser's layout manager.
     *
     * @param c  a <code>JFileChooser</code>
     * @return   a <code>Dimension</code> specifying the preferred
     *           width and height of the file chooser
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
    public ListSelectionListener createListSelectionListener(JFileChooser fc) {

    /**
     * Creates a selection listener for the list of files and directories.
     *
     * @param fc a <code>JFileChooser</code>
     * @return a <code>ListSelectionListener</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/MetalFileChooserUI.java
public class MetalFileChooserUI extends BasicFileChooserUI {

/**
 * Metal L&amp;F implementation of a FileChooser.
 *
 * @author Jeff Dinkins
 */
