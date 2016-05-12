_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    protected void finalize() throws Throwable {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    public void close() throws IOException {

    /**
     * Closes this <code>FileCacheImageInputStream</code>, closing
     * and removing the cache file.  The source <code>InputStream</code>
     * is not closed.
     *
     * @exception IOException if an error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    public boolean isCachedMemory() {

    /**
     * Returns <code>false</code> since this
     * <code>ImageInputStream</code> does not maintain a main memory
     * cache.
     *
     * @return <code>false</code>.
     *
     * @see #isCached
     * @see #isCachedFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    public boolean isCachedFile() {

    /**
     * Returns <code>true</code> since this
     * <code>ImageInputStream</code> maintains a file cache.
     *
     * @return <code>true</code>.
     *
     * @see #isCached
     * @see #isCachedMemory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    public boolean isCached() {

    /**
     * Returns <code>true</code> since this
     * <code>ImageInputStream</code> caches data in order to allow
     * seeking backwards.
     *
     * @return <code>true</code>.
     *
     * @see #isCachedMemory
     * @see #isCachedFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    private long readUntil(long pos) throws IOException {

    /**
     * Ensures that at least <code>pos</code> bytes are cached,
     * or the end of the source is reached.  The return value
     * is equal to the smaller of <code>pos</code> and the
     * length of the source file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    public FileCacheImageInputStream(InputStream stream, File cacheDir)

    /**
     * Constructs a <code>FileCacheImageInputStream</code> that will read
     * from a given <code>InputStream</code>.
     *
     * <p> A temporary file is used as a cache.  If
     * <code>cacheDir</code>is non-<code>null</code> and is a
     * directory, the file will be created there.  If it is
     * <code>null</code>, the system-dependent default temporary-file
     * directory will be used (see the documentation for
     * <code>File.createTempFile</code> for details).
     *
     * @param stream an <code>InputStream</code> to read from.
     * @param cacheDir a <code>File</code> indicating where the
     * cache file should be created, or <code>null</code> to use the
     * system directory.
     *
     * @exception IllegalArgumentException if <code>stream</code> is
     * <code>null</code>.
     * @exception IllegalArgumentException if <code>cacheDir</code> is
     * non-<code>null</code> but is not a directory.
     * @exception IOException if a cache file cannot be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    private final StreamCloser.CloseAction closeAction;

    /** The CloseAction that closes the stream in
     *  the StreamCloser's shutdown hook                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    private final DisposerRecord disposerRecord;

    /** The DisposerRecord that closes the underlying cache. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
    private final Object disposerReferent;

    /** The referent to be registered with the Disposer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileCacheImageInputStream.java
public class FileCacheImageInputStream extends ImageInputStreamImpl {

/**
 * An implementation of <code>ImageInputStream</code> that gets its
 * input from a regular <code>InputStream</code>.  A file is used to
 * cache previously read data.
 *
 */
