_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    private boolean startsWithLocHeader() {

    /**
     * Returns {@code true} if, and only if, the zip file begins with {@code
     * LOCSIG}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    protected void finalize() throws IOException {

    /**
     * Ensures that the system resources held by this ZipFile object are
     * released when there are no more references to it.
     *
     * <p>
     * Since the time when GC would invoke this method is undetermined,
     * it is strongly recommended that applications invoke the <code>close</code>
     * method as soon they have finished accessing this <code>ZipFile</code>.
     * This will prevent holding up system resources for an undetermined
     * length of time.
     *
     * @throws IOException if an I/O error has occurred
     * @see    java.util.zip.ZipFile#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public void close() throws IOException {

    /**
     * Closes the ZIP file.
     * <p> Closing this ZIP file will close all of the input streams
     * previously returned by invocations of the {@link #getInputStream
     * getInputStream} method.
     *
     * @throws IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public int size() {

    /**
     * Returns the number of entries in the ZIP file.
     * @return the number of entries in the ZIP file
     * @throws IllegalStateException if the zip file has been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public Stream<? extends ZipEntry> stream() {

    /**
     * Return an ordered {@code Stream} over the ZIP file entries.
     * Entries appear in the {@code Stream} in the order they appear in
     * the central directory of the ZIP file.
     *
     * @return an ordered {@code Stream} of entries in this ZIP file
     * @throws IllegalStateException if the zip file has been closed
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public Enumeration<? extends ZipEntry> entries() {

    /**
     * Returns an enumeration of the ZIP file entries.
     * @return an enumeration of the ZIP file entries
     * @throws IllegalStateException if the zip file has been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public String getName() {

    /**
     * Returns the path name of the ZIP file.
     * @return the path name of the ZIP file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public InputStream getInputStream(ZipEntry entry) throws IOException {

    /**
     * Returns an input stream for reading the contents of the specified
     * zip file entry.
     *
     * <p> Closing this ZIP file will, in turn, close all input
     * streams that have been returned by invocations of this method.
     *
     * @param entry the zip file entry
     * @return the input stream for reading the contents of the specified
     * zip file entry.
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     * @throws IllegalStateException if the zip file has been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipEntry getEntry(String name) {

    /**
     * Returns the zip file entry for the specified name, or null
     * if not found.
     *
     * @param name the name of the entry
     * @return the zip file entry, or null if not found
     * @throws IllegalStateException if the zip file has been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public String getComment() {

    /**
     * Returns the zip file comment, or null if none.
     *
     * @return the comment string for the zip file, or null if none
     *
     * @throws IllegalStateException if the zip file has been closed
     *
     * Since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(File file, Charset charset) throws IOException

    /**
     * Opens a ZIP file for reading given the specified File object.
     * @param file the ZIP file to be opened for reading
     * @param charset
     *        The {@linkplain java.nio.charset.Charset charset} to be
     *        used to decode the ZIP entry name and comment (ignored if
     *        the <a href="package-summary.html#lang_encoding"> language
     *        encoding bit</a> of the ZIP entry's general purpose bit
     *        flag is set).
     *
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(String name, Charset charset) throws IOException

    /**
     * Opens a zip file for reading.
     *
     * <p>First, if there is a security manager, its <code>checkRead</code>
     * method is called with the <code>name</code> argument as its argument
     * to ensure the read is allowed.
     *
     * @param name the name of the zip file
     * @param charset
     *        the {@linkplain java.nio.charset.Charset charset} to
     *        be used to decode the ZIP entry name and comment that are not
     *        encoded by using UTF-8 encoding (indicated by entry's general
     *        purpose flag).
     *
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException
     *         if a security manager exists and its <code>checkRead</code>
     *         method doesn't allow read access to the file
     *
     * @see SecurityManager#checkRead(java.lang.String)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(File file, int mode, Charset charset) throws IOException

    /**
     * Opens a new <code>ZipFile</code> to read from the specified
     * <code>File</code> object in the specified mode.  The mode argument
     * must be either <tt>OPEN_READ</tt> or <tt>OPEN_READ | OPEN_DELETE</tt>.
     *
     * <p>First, if there is a security manager, its <code>checkRead</code>
     * method is called with the <code>name</code> argument as its argument to
     * ensure the read is allowed.
     *
     * @param file the ZIP file to be opened for reading
     * @param mode the mode in which the file is to be opened
     * @param charset
     *        the {@linkplain java.nio.charset.Charset charset} to
     *        be used to decode the ZIP entry name and comment that are not
     *        encoded by using UTF-8 encoding (indicated by entry's general
     *        purpose flag).
     *
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     *
     * @throws SecurityException
     *         if a security manager exists and its <code>checkRead</code>
     *         method doesn't allow read access to the file,or its
     *         <code>checkDelete</code> method doesn't allow deleting the
     *         file when the <tt>OPEN_DELETE</tt> flag is set
     *
     * @throws IllegalArgumentException if the <tt>mode</tt> argument is invalid
     *
     * @see SecurityManager#checkRead(java.lang.String)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(File file) throws ZipException, IOException {

    /**
     * Opens a ZIP file for reading given the specified File object.
     *
     * <p>The UTF-8 {@link java.nio.charset.Charset charset} is used to
     * decode the entry names and comments.
     *
     * @param file the ZIP file to be opened for reading
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(File file, int mode) throws IOException {

    /**
     * Opens a new <code>ZipFile</code> to read from the specified
     * <code>File</code> object in the specified mode.  The mode argument
     * must be either <tt>OPEN_READ</tt> or <tt>OPEN_READ | OPEN_DELETE</tt>.
     *
     * <p>First, if there is a security manager, its <code>checkRead</code>
     * method is called with the <code>name</code> argument as its argument to
     * ensure the read is allowed.
     *
     * <p>The UTF-8 {@link java.nio.charset.Charset charset} is used to
     * decode the entry names and comments
     *
     * @param file the ZIP file to be opened for reading
     * @param mode the mode in which the file is to be opened
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if a security manager exists and
     *         its <code>checkRead</code> method
     *         doesn't allow read access to the file,
     *         or its <code>checkDelete</code> method doesn't allow deleting
     *         the file when the <tt>OPEN_DELETE</tt> flag is set.
     * @throws IllegalArgumentException if the <tt>mode</tt> argument is invalid
     * @see SecurityManager#checkRead(java.lang.String)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public ZipFile(String name) throws IOException {

    /**
     * Opens a zip file for reading.
     *
     * <p>First, if there is a security manager, its <code>checkRead</code>
     * method is called with the <code>name</code> argument as its argument
     * to ensure the read is allowed.
     *
     * <p>The UTF-8 {@link java.nio.charset.Charset charset} is used to
     * decode the entry names and comments.
     *
     * @param name the name of the zip file
     * @throws ZipException if a ZIP format error has occurred
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if a security manager exists and its
     *         <code>checkRead</code> method doesn't allow read access to the file.
     *
     * @see SecurityManager#checkRead(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public static final int OPEN_DELETE = 0x4;

    /**
     * Mode flag to open a zip file and mark it for deletion.  The file will be
     * deleted some time between the moment that it is opened and the moment
     * that it is closed, but its contents will remain accessible via the
     * <tt>ZipFile</tt> object until either the close method is invoked or the
     * virtual machine exits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
    public static final int OPEN_READ = 0x1;

    /**
     * Mode flag to open a zip file for reading.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipFile.java
public

/**
 * This class is used to read entries from a zip file.
 *
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in this class will cause a {@link NullPointerException} to be
 * thrown.
 *
 * @author      David Connelly
 */
