_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    protected class DirectoryComboBoxAction implements ActionListener {

    /**
     * Acts when DirectoryComboBox has changed the selected item.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    protected class FilterComboBoxModel extends AbstractListModel<FileFilter> implements ComboBoxModel<FileFilter>,

    /**
     * Data model for a type-face selection combo-box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    public class FilterComboBoxRenderer extends DefaultListCellRenderer {

    /**
     * Render different type sizes and styles.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
        private void addItem(File directory) {

        /**
         * Adds the directory to the model and sets it to be selected,
         * additionally clears out the previous selected directory and
         * the paths leading up to it, if any.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    protected class DirectoryComboBoxModel extends AbstractListModel<File> implements ComboBoxModel<File> {

    /**
     * Data model for a type-face selection combo-box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    protected void setDirectorySelected(boolean directorySelected) {

    /**
     * Property to remember whether a directory is currently selected in the UI.
     * This is normally called by the UI on a selection event.
     *
     * @param directorySelected if a directory is currently selected.
     * @since 1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * Returns the maximum size of the <code>JFileChooser</code>.
     *
     * @param c  a <code>JFileChooser</code>
     * @return   a <code>Dimension</code> specifying the maximum
     *           width and height of the file chooser
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * Returns the minimum size of the <code>JFileChooser</code>.
     *
     * @param c  a <code>JFileChooser</code>
     * @return   a <code>Dimension</code> specifying the minimum
     *           width and height of the file chooser
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
    public ListSelectionListener createListSelectionListener(JFileChooser fc) {

    /**
     * Creates a selection listener for the list of files and directories.
     *
     * @param fc a <code>JFileChooser</code>
     * @return a <code>ListSelectionListener</code>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsFileChooserUI.java
public class WindowsFileChooserUI extends BasicFileChooserUI {

/**
 * Windows L&F implementation of a FileChooser.
 *
 * @author Jeff Dinkins
 */
