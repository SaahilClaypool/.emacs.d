_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createNewFolder(File containingDir) throws IOException {

    /**
     * Creates a new folder with a default folder name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
class GenericFileSystemView extends FileSystemView {

/**
 * Fallthrough FileSystemView in case we can't determine the OS.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createFileObject(String path) {

    /**
     * Returns a File object constructed from the given path string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createNewFolder(File containingDir) throws IOException {

    /**
     * Creates a new folder with a default folder name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File getHomeDirectory() {

    /**
     * @return the Desktop folder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public String getSystemTypeDescription(File f) {

    /**
     * Type description for a file, directory, or folder as it would be displayed in
     * a system file browser. Example from Windows: the "Desktop" folder
     * is described as "Desktop".
     *
     * The Windows implementation gets information from the ShellFolder class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
class WindowsFileSystemView extends FileSystemView {

/**
 * FileSystemView that handles some specific windows concepts.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createNewFolder(File containingDir) throws IOException {

    /**
     * Creates a new folder with a default folder name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
class UnixFileSystemView extends FileSystemView {

/**
 * FileSystemView that handles some specific unix-isms.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    protected File createFileSystemRoot(File f) {

    /**
     * Creates a new <code>File</code> object for <code>f</code> with correct
     * behavior for a file system root directory.
     *
     * @param f a <code>File</code> object representing a file system root
     *          directory, for example "/" on Unix or "C:\" on Windows.
     * @return a new <code>File</code> object
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    ShellFolder getShellFolder(File f) throws FileNotFoundException {

    /**
     * Throws {@code FileNotFoundException} if file not found or current thread was interrupted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File getParentDirectory(File dir) {

    /**
     * Returns the parent directory of <code>dir</code>.
     * @param dir the <code>File</code> being queried
     * @return the parent directory of <code>dir</code>, or
     *   <code>null</code> if <code>dir</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File[] getFiles(File dir, boolean useFileHiding) {

    /**
     * Gets the list of shown (i.e. not hidden) files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createFileObject(String path) {

    /**
     * Returns a File object constructed from the given path string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File createFileObject(File dir, String filename) {

    /**
     * Returns a File object constructed in dir from the given filename.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File getDefaultDirectory() {

    /**
     * Return the user's default starting directory for the file chooser.
     *
     * @return a <code>File</code> object representing the default
     *         starting folder
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File[] getRoots() {

    /**
     * Returns all root partitions on this system. For example, on
     * Windows, this would be the "Desktop" folder, while on DOS this
     * would be the A: through Z: drives.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isComputerNode(File dir) {

    /**
     * Used by UI classes to decide whether to display a special icon
     * for a computer node, e.g. "My Computer" or a network server.
     *
     * The default implementation has no way of knowing, so always returns false.
     *
     * @param dir a directory
     * @return <code>false</code> always
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isFloppyDrive(File dir) {

    /**
     * Used by UI classes to decide whether to display a special icon
     * for a floppy disk. Implies isDrive(dir).
     *
     * The default implementation has no way of knowing, so always returns false.
     *
     * @param dir a directory
     * @return <code>false</code> always
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isDrive(File dir) {

    /**
     * Used by UI classes to decide whether to display a special icon
     * for drives or partitions, e.g. a "hard disk" icon.
     *
     * The default implementation has no way of knowing, so always returns false.
     *
     * @param dir a directory
     * @return <code>false</code> always
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isFileSystemRoot(File dir) {

    /**
     * Is dir the root of a tree in the file system, such as a drive
     * or partition. Example: Returns true for "C:\" on Windows 98.
     *
     * @param dir a <code>File</code> object representing a directory
     * @return <code>true</code> if <code>f</code> is a root of a filesystem
     * @see #isRoot
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isHiddenFile(File f) {

    /**
     * Returns whether a file is hidden or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public abstract File createNewFolder(File containingDir) throws IOException;

    /**
     * Creates a new folder with a default folder name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isFileSystem(File f) {

    /**
     * Checks if <code>f</code> represents a real directory or file as opposed to a
     * special folder such as <code>"Desktop"</code>. Used by UI classes to decide if
     * a folder is selectable when doing directory choosing.
     *
     * @param f a <code>File</code> object
     * @return <code>true</code> if <code>f</code> is a real file or directory.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public File getChild(File parent, String fileName) {

    /**
     *
     * @param parent a <code>File</code> object representing a directory or special folder
     * @param fileName a name of a file or folder which exists in <code>parent</code>
     * @return a File object. This is normally constructed with <code>new
     * File(parent, fileName)</code> except when parent and child are both
     * special folders, in which case the <code>File</code> is a wrapper containing
     * a <code>ShellFolder</code> object.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isParent(File folder, File file) {

    /**
     * On Windows, a file can appear in multiple folders, other than its
     * parent directory in the filesystem. Folder could for example be the
     * "Desktop" folder which is not the same as file.getParentFile().
     *
     * @param folder a <code>File</code> object representing a directory or special folder
     * @param file a <code>File</code> object
     * @return <code>true</code> if <code>folder</code> is a directory or special folder and contains <code>file</code>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public Icon getSystemIcon(File f) {

    /**
     * Icon for a file, directory, or folder as it would be displayed in
     * a system file browser. Example from Windows: the "M:\" directory
     * displays a CD-ROM icon.
     *
     * The default implementation gets information from the ShellFolder class.
     *
     * @param f a <code>File</code> object
     * @return an icon as it would be displayed by a native file chooser
     * @see JFileChooser#getIcon
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public String getSystemTypeDescription(File f) {

    /**
     * Type description for a file, directory, or folder as it would be displayed in
     * a system file browser. Example from Windows: the "Desktop" folder
     * is described as "Desktop".
     *
     * Override for platforms with native ShellFolder implementations.
     *
     * @param f a <code>File</code> object
     * @return the file type description as it would be displayed by a native file chooser
     * or null if no native information is available.
     * @see JFileChooser#getTypeDescription
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public String getSystemDisplayName(File f) {

    /**
     * Name of a file, directory, or folder as it would be displayed in
     * a system file browser. Example from Windows: the "M:\" directory
     * displays as "CD-ROM (M:)"
     *
     * The default implementation gets information from the ShellFolder class.
     *
     * @param f a <code>File</code> object
     * @return the file name as it would be displayed by a native file chooser
     * @see JFileChooser#getName
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public Boolean isTraversable(File f) {

    /**
     * Returns true if the file (directory) can be visited.
     * Returns false if the directory cannot be traversed.
     *
     * @param f the <code>File</code>
     * @return <code>true</code> if the file/directory can be traversed, otherwise <code>false</code>
     * @see JFileChooser#isTraversable
     * @see FileView#isTraversable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
    public boolean isRoot(File f) {

    /**
     * Determines if the given file is a root in the navigable tree(s).
     * Examples: Windows 98 has one root, the Desktop folder. DOS has one root
     * per drive letter, <code>C:\</code>, <code>D:\</code>, etc. Unix has one root,
     * the <code>"/"</code> directory.
     *
     * The default implementation gets information from the <code>ShellFolder</code> class.
     *
     * @param f a <code>File</code> object representing a directory
     * @return <code>true</code> if <code>f</code> is a root in the navigable tree.
     * @see #isFileSystemRoot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileSystemView.java
// PENDING(jeff) - need to provide a specification for

/**
 * FileSystemView is JFileChooser's gateway to the
 * file system. Since the JDK1.1 File API doesn't allow
 * access to such information as root partitions, file type
 * information, or hidden file bits, this class is designed
 * to intuit as much OS-specific file system information as
 * possible.
 *
 * <p>
 *
 * Java Licensees may want to provide a different implementation of
 * FileSystemView to better handle a given operating system.
 *
 * @author Jeff Dinkins
 */
