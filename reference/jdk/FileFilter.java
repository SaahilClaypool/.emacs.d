_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileFilter.java
    boolean accept(File pathname);

    /**
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param  pathname  The abstract pathname to be tested
     * @return  <code>true</code> if and only if <code>pathname</code>
     *          should be included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileFilter.java
@FunctionalInterface

/**
 * A filter for abstract pathnames.
 *
 * <p> Instances of this interface may be passed to the <code>{@link
 * File#listFiles(java.io.FileFilter) listFiles(FileFilter)}</code> method
 * of the <code>{@link java.io.File}</code> class.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileFilter.java
    boolean accept(File pathname);

    /**
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param  pathname  The abstract pathname to be tested
     * @return  <code>true</code> if and only if <code>pathname</code>
     *          should be included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileFilter.java
@FunctionalInterface

/**
 * A filter for abstract pathnames.
 *
 * <p> Instances of this interface may be passed to the <code>{@link
 * File#listFiles(java.io.FileFilter) listFiles(FileFilter)}</code> method
 * of the <code>{@link java.io.File}</code> class.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileFilter.java
    public abstract String getDescription();

    /**
     * The description of this filter. For example: "JPG and GIF Images"
     * @see FileView#getName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileFilter.java
public abstract class FileFilter {

/**
 * <code>FileFilter</code> is an abstract class used by {@code JFileChooser}
 * for filtering the set of files shown to the user. See
 * {@code FileNameExtensionFilter} for an implementation that filters using
 * the file name extension.
 * <p>
 * A <code>FileFilter</code>
 * can be set on a <code>JFileChooser</code> to
 * keep unwanted files from appearing in the directory listing.
 * For an example implementation of a simple file filter, see
 * <code><i>yourJDK</i>/demo/jfc/FileChooserDemo/ExampleFileFilter.java</code>.
 * For more information and examples see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html">How to Use File Choosers</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * @see FileNameExtensionFilter
 * @see javax.swing.JFileChooser#setFileFilter
 * @see javax.swing.JFileChooser#addChoosableFileFilter
 *
 * @author Jeff Dinkins
 */
