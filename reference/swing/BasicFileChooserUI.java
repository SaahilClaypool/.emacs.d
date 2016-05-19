_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
            protected Object getRicherData(DataFlavor flavor) {

            /**
             * The only richer format supported is the file list flavor
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
            protected DataFlavor[] getRicherFlavors() {

            /**
             * Best format of the file chooser is DataFlavor.javaFileListFlavor.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
        protected Transferable createTransferable(JComponent c) {

        /**
         * Create a Transferable to use as the source for a data transfer.
         *
         * @param c  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  The representation of the data to be transfered.
         *
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    static class FileTransferHandler extends TransferHandler implements UIResource {

    /**
     * Data transfer support for the file chooser.  Since files are currently presented
     * as a list, the list support is reused with the added flavor of DataFlavor.javaFileListFlavor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected class UpdateAction extends AbstractAction {

    /**
     * Rescans the files in the current directory
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected class CancelSelectionAction extends AbstractAction {

    /**
     * Responds to a cancel request.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected class ApproveSelectionAction extends AbstractAction {

    /**
     * Responds to an Open or Save request
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected class GoHomeAction extends AbstractAction {

    /**
     * Acts on the "home" key event or equivalent event.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected class NewFolderAction extends AbstractAction {

    /**
     * Creates a new folder.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    public String getDialogTitle(JFileChooser fc) {

    /**
     * Returns the title of this dialog
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    public FileFilter getAcceptAllFileFilter(JFileChooser fc) {

    /**
     * Returns the default accept all file filter
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    private int getMnemonic(String key, Locale l) {

    /**
     * Returns the mnemonic for the given key.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected void setDirectory(File f) {

    /**
     * Property to remember the directory that is currently selected in the UI.
     * This is normally called by the UI on a selection event.
     *
     * @param f the <code>File</code> object representing the directory that is
     *          currently selected
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected File getDirectory() {

    /**
     * Property to remember the directory that is currently selected in the UI.
     *
     * @return the value of the <code>directory</code> property
     * @see #setDirectory
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected void setDirectorySelected(boolean b) {

    /**
     * Property to remember whether a directory is currently selected in the UI.
     * This is normally called by the UI on a selection event.
     *
     * @param b iff a directory is currently selected.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected boolean isDirectorySelected() {

    /**
     * Property to remember whether a directory is currently selected in the UI.
     *
     * @return <code>true</code> iff a directory is currently selected.
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
        public void mouseEntered(MouseEvent e) {

        /**
         * The JList used for representing the files is created by subclasses, but the
         * selection is monitored in this class.  The TransferHandler installed in the
         * JFileChooser is also installed in the file list as it is used as the actual
         * transfer source.  The list is updated on a mouse enter to reflect the current
         * data transfer state of the file chooser.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a {@code BasicFileChooserUI} implementation
     * for the specified component. By default
     * the {@code BasicLookAndFeel} class uses
     * {@code createUI} methods of all basic UIs classes
     * to instantiate UIs.
     *
     * @param c the {@code JFileChooser} which needs a UI
     * @return the {@code BasicFileChooserUI} object
     *
     * @see UIDefaults#getUI(JComponent)
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected String directoryOpenButtonToolTipText = null;

    /**
     * The tooltip text displayed on the approve button when a directory
     * is selected and the current selection mode is FILES_ONLY.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected String directoryOpenButtonText = null;

    /**
     * The label text displayed on the approve button when a directory
     * is selected and the current selection mode is FILES_ONLY.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
    protected int directoryOpenButtonMnemonic = 0;

    /**
     * The mnemonic keycode used for the approve button when a directory
     * is selected and the current selection mode is FILES_ONLY.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicFileChooserUI.java
public class BasicFileChooserUI extends FileChooserUI {

/**
 * Basic L&amp;F implementation of a FileChooser.
 *
 * @author Jeff Dinkins
 */
