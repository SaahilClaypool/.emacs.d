_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    protected void finalize() throws Throwable {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    public void close() throws IOException {

    /**
     * Closes this <code>MemoryCacheImageInputStream</code>, freeing
     * the cache.  The source <code>InputStream</code> is not closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    public boolean isCachedMemory() {

    /**
     * Returns <code>true</code> since this
     * <code>ImageInputStream</code> maintains a main memory cache.
     *
     * @return <code>true</code>.
     *
     * @see #isCached
     * @see #isCachedFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    public boolean isCachedFile() {

    /**
     * Returns <code>false</code> since this
     * <code>ImageInputStream</code> does not maintain a file cache.
     *
     * @return <code>false</code>.
     *
     * @see #isCached
     * @see #isCachedMemory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    public MemoryCacheImageInputStream(InputStream stream) {

    /**
     * Constructs a <code>MemoryCacheImageInputStream</code> that will read
     * from a given <code>InputStream</code>.
     *
     * @param stream an <code>InputStream</code> to read from.
     *
     * @exception IllegalArgumentException if <code>stream</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    private final DisposerRecord disposerRecord;

    /** The DisposerRecord that resets the underlying MemoryCache. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
    private final Object disposerReferent;

    /** The referent to be registered with the Disposer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageInputStream.java
public class MemoryCacheImageInputStream extends ImageInputStreamImpl {

/**
 * An implementation of <code>ImageInputStream</code> that gets its
 * input from a regular <code>InputStream</code>.  A memory buffer is
 * used to cache at least the data between the discard position and
 * the current read position.
 *
 * <p> In general, it is preferable to use a
 * <code>FileCacheImageInputStream</code> when reading from a regular
 * <code>InputStream</code>.  This class is provided for cases where
 * it is not possible to create a writable temporary file.
 *
 */
