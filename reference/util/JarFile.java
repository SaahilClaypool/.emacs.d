_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    Enumeration<JarEntry> entries2() {

    /**
     * Returns an enumeration of the zip file entries
     * excluding internal JAR mechanism entries and including
     * signed entries missing from the ZIP directory.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    private void checkForSpecialAttributes() throws IOException {

    /**
     * On first invocation, check if the JAR file has the Class-Path
     * attribute. A no-op on subsequent calls.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    private boolean match(char[] src, byte[] b, int[] lastOcc, int[] optoSft) {

    /**
     * Returns true if the pattern {@code src} is found in {@code b}.
     * The {@code lastOcc} and {@code optoSft} arrays are the precomputed
     * bad character and good suffix shifts.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    boolean hasClassPathAttribute() throws IOException {

   /**
    * Returns {@code true} iff this JAR file has a manifest with the
    * Class-Path attribute
    */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public synchronized InputStream getInputStream(ZipEntry ze)

    /**
     * Returns an input stream for reading the contents of the specified
     * zip file entry.
     * @param ze the zip file entry
     * @return an input stream for reading the contents of the specified
     *         zip file entry
     * @throws ZipException if a zip file format error has occurred
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if any of the jar file entries
     *         are incorrectly signed.
     * @throws IllegalStateException
     *         may be thrown if the jar file has been closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public Enumeration<JarEntry> entries() {

    /**
     * Returns an enumeration of the zip file entries.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public ZipEntry getEntry(String name) {

    /**
     * Returns the <code>ZipEntry</code> for the given entry name or
     * <code>null</code> if not found.
     *
     * @param name the jar file entry name
     * @return the <code>ZipEntry</code> for the given entry name or
     *         <code>null</code> if not found
     *
     * @throws IllegalStateException
     *         may be thrown if the jar file has been closed
     *
     * @see java.util.zip.ZipEntry
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarEntry getJarEntry(String name) {

    /**
     * Returns the <code>JarEntry</code> for the given entry name or
     * <code>null</code> if not found.
     *
     * @param name the jar file entry name
     * @return the <code>JarEntry</code> for the given entry name or
     *         <code>null</code> if not found.
     *
     * @throws IllegalStateException
     *         may be thrown if the jar file has been closed
     *
     * @see java.util.jar.JarEntry
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public Manifest getManifest() throws IOException {

    /**
     * Returns the jar file manifest, or <code>null</code> if none.
     *
     * @return the jar file manifest, or <code>null</code> if none
     *
     * @throws IllegalStateException
     *         may be thrown if the jar file has been closed
     * @throws IOException  if an I/O error has occurred
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarFile(File file, boolean verify, int mode) throws IOException {

    /**
     * Creates a new <code>JarFile</code> to read from the specified
     * <code>File</code> object in the specified mode.  The mode argument
     * must be either <tt>OPEN_READ</tt> or <tt>OPEN_READ | OPEN_DELETE</tt>.
     *
     * @param file the jar file to be opened for reading
     * @param verify whether or not to verify the jar file if
     * it is signed.
     * @param mode the mode in which the file is to be opened
     * @throws IOException if an I/O error has occurred
     * @throws IllegalArgumentException
     *         if the <tt>mode</tt> argument is invalid
     * @throws SecurityException if access to the file is denied
     *         by the SecurityManager
     * @since 1.3
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarFile(File file, boolean verify) throws IOException {

    /**
     * Creates a new <code>JarFile</code> to read from the specified
     * <code>File</code> object.
     * @param file the jar file to be opened for reading
     * @param verify whether or not to verify the jar file if
     * it is signed.
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if access to the file is denied
     *         by the SecurityManager.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarFile(File file) throws IOException {

    /**
     * Creates a new <code>JarFile</code> to read from the specified
     * <code>File</code> object. The <code>JarFile</code> will be verified if
     * it is signed.
     * @param file the jar file to be opened for reading
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if access to the file is denied
     *         by the SecurityManager
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarFile(String name, boolean verify) throws IOException {

    /**
     * Creates a new <code>JarFile</code> to read from the specified
     * file <code>name</code>.
     * @param name the name of the jar file to be opened for reading
     * @param verify whether or not to verify the jar file if
     * it is signed.
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if access to the file is denied
     *         by the SecurityManager
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public JarFile(String name) throws IOException {

    /**
     * Creates a new <code>JarFile</code> to read from the specified
     * file <code>name</code>. The <code>JarFile</code> will be verified if
     * it is signed.
     * @param name the name of the jar file to be opened for reading
     * @throws IOException if an I/O error has occurred
     * @throws SecurityException if access to the file is denied
     *         by the SecurityManager
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
    public static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";

    /**
     * The JAR manifest file name.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//jar/JarFile.java
public

/**
 * The <code>JarFile</code> class is used to read the contents of a jar file
 * from any file that can be opened with <code>java.io.RandomAccessFile</code>.
 * It extends the class <code>java.util.zip.ZipFile</code> with support
 * for reading an optional <code>Manifest</code> entry. The
 * <code>Manifest</code> can be used to specify meta-information about the
 * jar file and its entries.
 *
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in this class will cause a {@link NullPointerException} to be
 * thrown.
 *
 * If the verify flag is on when opening a signed jar file, the content of the
 * file is verified against its signature embedded inside the file. Please note
 * that the verification process does not include validating the signer's
 * certificate. A caller should inspect the return value of
 * {@link JarEntry#getCodeSigners()} to further determine if the signature
 * can be trusted.
 *
 * @author  David Connelly
 * @see     Manifest
 * @see     java.util.zip.ZipFile
 * @see     java.util.jar.JarEntry
 * @since   1.2
 */
