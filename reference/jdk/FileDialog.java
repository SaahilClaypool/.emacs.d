_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>FileDialog</code>
     * window. This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  the parameter string of this file dialog window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and performs
     * a backwards compatibility check by converting
     * either a <code>dir</code> or a <code>file</code>
     * equal to an empty string to <code>null</code>.
     *
     * @param s the <code>ObjectInputStream</code> to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public synchronized void setFilenameFilter(FilenameFilter filter) {

    /**
     * Sets the filename filter for this file dialog window to the
     * specified filter.
     * Filename filters do not function in Sun's reference
     * implementation for Microsoft Windows.
     *
     * @param   filter   the specified filter
     * @see     java.io.FilenameFilter
     * @see     java.awt.FileDialog#getFilenameFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FilenameFilter getFilenameFilter() {

    /**
     * Determines this file dialog's filename filter. A filename filter
     * allows the user to specify which files appear in the file dialog
     * window.  Filename filters do not function in Sun's reference
     * implementation for Microsoft Windows.
     *
     * @return    this file dialog's filename filter
     * @see       java.io.FilenameFilter
     * @see       java.awt.FileDialog#setFilenameFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public boolean isMultipleMode() {

    /**
     * Returns whether the file dialog allows the multiple file selection.
     *
     * @return          {@code true} if the file dialog allows the multiple
     *                  file selection; {@code false} otherwise.
     * @see #setMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setMultipleMode(boolean enable) {

    /**
     * Enables or disables multiple file selection for the file dialog.
     *
     * @param enable    if {@code true}, multiple file selection is enabled;
     *                  {@code false} - disabled.
     * @see #isMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setFile(String file) {

    /**
     * Sets the selected file for this file dialog window to be the
     * specified file. This file becomes the default file if it is set
     * before the file dialog window is first shown.
     * <p>
     * When the dialog is shown, the specified file is selected. The kind of
     * selection depends on the file existence, the dialog type, and the native
     * platform. E.g., the file could be highlighted in the file list, or a
     * file name editbox could be populated with the file name.
     * <p>
     * This method accepts either a full file path, or a file name with an
     * extension if used together with the {@code setDirectory} method.
     * <p>
     * Specifying "" as the file is exactly equivalent to specifying
     * {@code null} as the file.
     *
     * @param    file   the file being set
     * @see      #getFile
     * @see      #getFiles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private void setFiles(File files[]) {

    /**
     * Stores the names of all the files that the user selects.
     *
     * Note that the method is private and it's intended to be used
     * by the peers through the AWTAccessor API.
     *
     * @param files     the array that contains the short names of
     *                  all the files that the user selects.
     *
     * @see #getFiles
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public File[] getFiles() {

    /**
     * Returns files that the user selects.
     * <p>
     * If the user cancels the file dialog,
     * then the method returns an empty array.
     *
     * @return    files that the user selects or an empty array
     *            if the user cancels the file dialog.
     * @see       #setFile(String)
     * @see       #getFile
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public String getFile() {

    /**
     * Gets the selected file of this file dialog.  If the user
     * selected <code>CANCEL</code>, the returned file is <code>null</code>.
     *
     * @return    the currently selected file of this file dialog window,
     *                or <code>null</code> if none is selected
     * @see       java.awt.FileDialog#setFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setDirectory(String dir) {

    /**
     * Sets the directory of this file dialog window to be the
     * specified directory. Specifying a <code>null</code> or an
     * invalid directory implies an implementation-defined default.
     * This default will not be realized, however, until the user
     * has selected a file. Until this point, <code>getDirectory()</code>
     * will return the value passed into this method.
     * <p>
     * Specifying "" as the directory is exactly equivalent to
     * specifying <code>null</code> as the directory.
     *
     * @param     dir   the specified directory
     * @see       java.awt.FileDialog#getDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public String getDirectory() {

    /**
     * Gets the directory of this file dialog.
     *
     * @return  the (potentially <code>null</code> or invalid)
     *          directory of this <code>FileDialog</code>
     * @see       java.awt.FileDialog#setDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setMode(int mode) {

    /**
     * Sets the mode of the file dialog.  If <code>mode</code> is not
     * a legal value, an exception will be thrown and <code>mode</code>
     * will not be set.
     *
     * @param      mode  the mode for this file dialog, either
     *                 <code>FileDialog.LOAD</code> or
     *                 <code>FileDialog.SAVE</code>
     * @see        java.awt.FileDialog#LOAD
     * @see        java.awt.FileDialog#SAVE
     * @see        java.awt.FileDialog#getMode
     * @exception  IllegalArgumentException if an illegal file
     *                 dialog mode is supplied
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public int getMode() {

    /**
     * Indicates whether this file dialog box is for loading from a file
     * or for saving to a file.
     *
     * @return   the mode of this file dialog window, either
     *               <code>FileDialog.LOAD</code> or
     *               <code>FileDialog.SAVE</code>
     * @see      java.awt.FileDialog#LOAD
     * @see      java.awt.FileDialog#SAVE
     * @see      java.awt.FileDialog#setMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void addNotify() {

    /**
     * Creates the file dialog's peer.  The peer allows us to change the look
     * of the file dialog without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    String constructComponentName() {

    /**
     * Constructs a name for this component. Called by <code>getName()</code>
     * when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent, String title, int mode) {

    /**
     * Creates a file dialog window with the specified title for loading
     * or saving a file.
     * <p>
     * If the value of <code>mode</code> is <code>LOAD</code>, then the
     * file dialog is finding a file to read, and the files shown are those
     * in the current directory.   If the value of
     * <code>mode</code> is <code>SAVE</code>, the file dialog is finding
     * a place to write a file.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog; a <code>null</code> value
     *                     will be accepted without causing a
     *                     <code>NullPointerException</code> to be thrown
     * @param     mode     the mode of the dialog; either
     *                     <code>FileDialog.LOAD</code> or <code>FileDialog.SAVE</code>
     * @exception java.lang.IllegalArgumentException if an illegal
     *            file dialog mode is supplied;
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       java.awt.FileDialog#LOAD
     * @see       java.awt.FileDialog#SAVE
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent, String title) {

    /**
     * Creates a file dialog window with the specified title for loading
     * a file. The files shown are those in the current directory.
     * This is a convenience method for
     * <code>FileDialog(parent, title, LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog; a <code>null</code> value
     *                     will be accepted without causing a
     *                     <code>NullPointerException</code> to be thrown
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent) {

    /**
     * Creates a file dialog for loading a file.  The title of the
     * file dialog is initially empty.  This is a convenience method for
     * <code>FileDialog(parent, "", LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent, String title, int mode) {

    /**
     * Creates a file dialog window with the specified title for loading
     * or saving a file.
     * <p>
     * If the value of <code>mode</code> is <code>LOAD</code>, then the
     * file dialog is finding a file to read, and the files shown are those
     * in the current directory.   If the value of
     * <code>mode</code> is <code>SAVE</code>, the file dialog is finding
     * a place to write a file.
     *
     * @param     parent   the owner of the dialog
     * @param     title   the title of the dialog
     * @param     mode   the mode of the dialog; either
     *          <code>FileDialog.LOAD</code> or <code>FileDialog.SAVE</code>
     * @exception  IllegalArgumentException if an illegal file
     *                 dialog mode is supplied
     * @see       java.awt.FileDialog#LOAD
     * @see       java.awt.FileDialog#SAVE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent, String title) {

    /**
     * Creates a file dialog window with the specified title for loading
     * a file. The files shown are those in the current directory.
     * This is a convenience method for
     * <code>FileDialog(parent, title, LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent) {

    /**
     * Creates a file dialog for loading a file.  The title of the
     * file dialog is initially empty.  This is a convenience method for
     * <code>FileDialog(parent, "", LOAD)</code>.
     *
     * @param parent the owner of the dialog
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private boolean multipleMode = false;

    /**
     * Represents whether the file dialog allows the multiple file selection.
     *
     * @serial
     * @see #setMultipleMode
     * @see #isMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private File[] files;

    /**
     * Contains the File instances for all the files that the user selects.
     *
     * @serial
     * @see #getFiles
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public static final int SAVE = 1;

    /**
     * This constant value indicates that the purpose of the file
     * dialog window is to locate a file to which to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public static final int LOAD = 0;

    /**
     * This constant value indicates that the purpose of the file
     * dialog window is to locate a file from which to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
public class FileDialog extends Dialog {

/**
 * The <code>FileDialog</code> class displays a dialog window
 * from which the user can select a file.
 * <p>
 * Since it is a modal dialog, when the application calls
 * its <code>show</code> method to display the dialog,
 * it blocks the rest of the application until the user has
 * chosen a file.
 *
 * @see Window#show
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>FileDialog</code>
     * window. This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  the parameter string of this file dialog window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and performs
     * a backwards compatibility check by converting
     * either a <code>dir</code> or a <code>file</code>
     * equal to an empty string to <code>null</code>.
     *
     * @param s the <code>ObjectInputStream</code> to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public synchronized void setFilenameFilter(FilenameFilter filter) {

    /**
     * Sets the filename filter for this file dialog window to the
     * specified filter.
     * Filename filters do not function in Sun's reference
     * implementation for Microsoft Windows.
     *
     * @param   filter   the specified filter
     * @see     java.io.FilenameFilter
     * @see     java.awt.FileDialog#getFilenameFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FilenameFilter getFilenameFilter() {

    /**
     * Determines this file dialog's filename filter. A filename filter
     * allows the user to specify which files appear in the file dialog
     * window.  Filename filters do not function in Sun's reference
     * implementation for Microsoft Windows.
     *
     * @return    this file dialog's filename filter
     * @see       java.io.FilenameFilter
     * @see       java.awt.FileDialog#setFilenameFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public boolean isMultipleMode() {

    /**
     * Returns whether the file dialog allows the multiple file selection.
     *
     * @return          {@code true} if the file dialog allows the multiple
     *                  file selection; {@code false} otherwise.
     * @see #setMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setMultipleMode(boolean enable) {

    /**
     * Enables or disables multiple file selection for the file dialog.
     *
     * @param enable    if {@code true}, multiple file selection is enabled;
     *                  {@code false} - disabled.
     * @see #isMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setFile(String file) {

    /**
     * Sets the selected file for this file dialog window to be the
     * specified file. This file becomes the default file if it is set
     * before the file dialog window is first shown.
     * <p>
     * When the dialog is shown, the specified file is selected. The kind of
     * selection depends on the file existence, the dialog type, and the native
     * platform. E.g., the file could be highlighted in the file list, or a
     * file name editbox could be populated with the file name.
     * <p>
     * This method accepts either a full file path, or a file name with an
     * extension if used together with the {@code setDirectory} method.
     * <p>
     * Specifying "" as the file is exactly equivalent to specifying
     * {@code null} as the file.
     *
     * @param    file   the file being set
     * @see      #getFile
     * @see      #getFiles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private void setFiles(File files[]) {

    /**
     * Stores the names of all the files that the user selects.
     *
     * Note that the method is private and it's intended to be used
     * by the peers through the AWTAccessor API.
     *
     * @param files     the array that contains the short names of
     *                  all the files that the user selects.
     *
     * @see #getFiles
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public File[] getFiles() {

    /**
     * Returns files that the user selects.
     * <p>
     * If the user cancels the file dialog,
     * then the method returns an empty array.
     *
     * @return    files that the user selects or an empty array
     *            if the user cancels the file dialog.
     * @see       #setFile(String)
     * @see       #getFile
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public String getFile() {

    /**
     * Gets the selected file of this file dialog.  If the user
     * selected <code>CANCEL</code>, the returned file is <code>null</code>.
     *
     * @return    the currently selected file of this file dialog window,
     *                or <code>null</code> if none is selected
     * @see       java.awt.FileDialog#setFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setDirectory(String dir) {

    /**
     * Sets the directory of this file dialog window to be the
     * specified directory. Specifying a <code>null</code> or an
     * invalid directory implies an implementation-defined default.
     * This default will not be realized, however, until the user
     * has selected a file. Until this point, <code>getDirectory()</code>
     * will return the value passed into this method.
     * <p>
     * Specifying "" as the directory is exactly equivalent to
     * specifying <code>null</code> as the directory.
     *
     * @param     dir   the specified directory
     * @see       java.awt.FileDialog#getDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public String getDirectory() {

    /**
     * Gets the directory of this file dialog.
     *
     * @return  the (potentially <code>null</code> or invalid)
     *          directory of this <code>FileDialog</code>
     * @see       java.awt.FileDialog#setDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void setMode(int mode) {

    /**
     * Sets the mode of the file dialog.  If <code>mode</code> is not
     * a legal value, an exception will be thrown and <code>mode</code>
     * will not be set.
     *
     * @param      mode  the mode for this file dialog, either
     *                 <code>FileDialog.LOAD</code> or
     *                 <code>FileDialog.SAVE</code>
     * @see        java.awt.FileDialog#LOAD
     * @see        java.awt.FileDialog#SAVE
     * @see        java.awt.FileDialog#getMode
     * @exception  IllegalArgumentException if an illegal file
     *                 dialog mode is supplied
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public int getMode() {

    /**
     * Indicates whether this file dialog box is for loading from a file
     * or for saving to a file.
     *
     * @return   the mode of this file dialog window, either
     *               <code>FileDialog.LOAD</code> or
     *               <code>FileDialog.SAVE</code>
     * @see      java.awt.FileDialog#LOAD
     * @see      java.awt.FileDialog#SAVE
     * @see      java.awt.FileDialog#setMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public void addNotify() {

    /**
     * Creates the file dialog's peer.  The peer allows us to change the look
     * of the file dialog without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    String constructComponentName() {

    /**
     * Constructs a name for this component. Called by <code>getName()</code>
     * when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent, String title, int mode) {

    /**
     * Creates a file dialog window with the specified title for loading
     * or saving a file.
     * <p>
     * If the value of <code>mode</code> is <code>LOAD</code>, then the
     * file dialog is finding a file to read, and the files shown are those
     * in the current directory.   If the value of
     * <code>mode</code> is <code>SAVE</code>, the file dialog is finding
     * a place to write a file.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog; a <code>null</code> value
     *                     will be accepted without causing a
     *                     <code>NullPointerException</code> to be thrown
     * @param     mode     the mode of the dialog; either
     *                     <code>FileDialog.LOAD</code> or <code>FileDialog.SAVE</code>
     * @exception java.lang.IllegalArgumentException if an illegal
     *            file dialog mode is supplied;
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       java.awt.FileDialog#LOAD
     * @see       java.awt.FileDialog#SAVE
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent, String title) {

    /**
     * Creates a file dialog window with the specified title for loading
     * a file. The files shown are those in the current directory.
     * This is a convenience method for
     * <code>FileDialog(parent, title, LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog; a <code>null</code> value
     *                     will be accepted without causing a
     *                     <code>NullPointerException</code> to be thrown
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Dialog parent) {

    /**
     * Creates a file dialog for loading a file.  The title of the
     * file dialog is initially empty.  This is a convenience method for
     * <code>FileDialog(parent, "", LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @exception java.lang.IllegalArgumentException if the <code>parent</code>'s
     *            <code>GraphicsConfiguration</code>
     *            is not from a screen device;
     * @exception java.lang.IllegalArgumentException if <code>parent</code>
     *            is <code>null</code>; this exception is always thrown when
     *            <code>GraphicsEnvironment.isHeadless</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent, String title, int mode) {

    /**
     * Creates a file dialog window with the specified title for loading
     * or saving a file.
     * <p>
     * If the value of <code>mode</code> is <code>LOAD</code>, then the
     * file dialog is finding a file to read, and the files shown are those
     * in the current directory.   If the value of
     * <code>mode</code> is <code>SAVE</code>, the file dialog is finding
     * a place to write a file.
     *
     * @param     parent   the owner of the dialog
     * @param     title   the title of the dialog
     * @param     mode   the mode of the dialog; either
     *          <code>FileDialog.LOAD</code> or <code>FileDialog.SAVE</code>
     * @exception  IllegalArgumentException if an illegal file
     *                 dialog mode is supplied
     * @see       java.awt.FileDialog#LOAD
     * @see       java.awt.FileDialog#SAVE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent, String title) {

    /**
     * Creates a file dialog window with the specified title for loading
     * a file. The files shown are those in the current directory.
     * This is a convenience method for
     * <code>FileDialog(parent, title, LOAD)</code>.
     *
     * @param     parent   the owner of the dialog
     * @param     title    the title of the dialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public FileDialog(Frame parent) {

    /**
     * Creates a file dialog for loading a file.  The title of the
     * file dialog is initially empty.  This is a convenience method for
     * <code>FileDialog(parent, "", LOAD)</code>.
     *
     * @param parent the owner of the dialog
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private boolean multipleMode = false;

    /**
     * Represents whether the file dialog allows the multiple file selection.
     *
     * @serial
     * @see #setMultipleMode
     * @see #isMultipleMode
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    private File[] files;

    /**
     * Contains the File instances for all the files that the user selects.
     *
     * @serial
     * @see #getFiles
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public static final int SAVE = 1;

    /**
     * This constant value indicates that the purpose of the file
     * dialog window is to locate a file to which to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
    public static final int LOAD = 0;

    /**
     * This constant value indicates that the purpose of the file
     * dialog window is to locate a file from which to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FileDialog.java
public class FileDialog extends Dialog {

/**
 * The <code>FileDialog</code> class displays a dialog window
 * from which the user can select a file.
 * <p>
 * Since it is a modal dialog, when the application calls
 * its <code>show</code> method to display the dialog,
 * it blocks the rest of the application until the user has
 * chosen a file.
 *
 * @see Window#show
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
