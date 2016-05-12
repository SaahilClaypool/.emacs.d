_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    private FileNotFoundException(String path, String reason) {

    /**
     * Constructs a <code>FileNotFoundException</code> with a detail message
     * consisting of the given pathname string followed by the given reason
     * string.  If the <code>reason</code> argument is <code>null</code> then
     * it will be omitted.  This private constructor is invoked only by native
     * I/O methods.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    public FileNotFoundException(String s) {

    /**
     * Constructs a <code>FileNotFoundException</code> with the
     * specified detail message. The string <code>s</code> can be
     * retrieved later by the
     * <code>{@link java.lang.Throwable#getMessage}</code>
     * method of class <code>java.lang.Throwable</code>.
     *
     * @param   s   the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    public FileNotFoundException() {

    /**
     * Constructs a <code>FileNotFoundException</code> with
     * <code>null</code> as its error detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
public class FileNotFoundException extends IOException {

/**
 * Signals that an attempt to open the file denoted by a specified pathname
 * has failed.
 *
 * <p> This exception will be thrown by the {@link FileInputStream}, {@link
 * FileOutputStream}, and {@link RandomAccessFile} constructors when a file
 * with the specified pathname does not exist.  It will also be thrown by these
 * constructors if the file does exist but for some reason is inaccessible, for
 * example when an attempt is made to open a read-only file for writing.
 *
 * @author  unascribed
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    private FileNotFoundException(String path, String reason) {

    /**
     * Constructs a <code>FileNotFoundException</code> with a detail message
     * consisting of the given pathname string followed by the given reason
     * string.  If the <code>reason</code> argument is <code>null</code> then
     * it will be omitted.  This private constructor is invoked only by native
     * I/O methods.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    public FileNotFoundException(String s) {

    /**
     * Constructs a <code>FileNotFoundException</code> with the
     * specified detail message. The string <code>s</code> can be
     * retrieved later by the
     * <code>{@link java.lang.Throwable#getMessage}</code>
     * method of class <code>java.lang.Throwable</code>.
     *
     * @param   s   the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
    public FileNotFoundException() {

    /**
     * Constructs a <code>FileNotFoundException</code> with
     * <code>null</code> as its error detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FileNotFoundException.java
public class FileNotFoundException extends IOException {

/**
 * Signals that an attempt to open the file denoted by a specified pathname
 * has failed.
 *
 * <p> This exception will be thrown by the {@link FileInputStream}, {@link
 * FileOutputStream}, and {@link RandomAccessFile} constructors when a file
 * with the specified pathname does not exist.  It will also be thrown by these
 * constructors if the file does exist but for some reason is inaccessible, for
 * example when an attempt is made to open a read-only file for writing.
 *
 * @author  unascribed
 * @since   JDK1.0
 */
