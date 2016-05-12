_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
    public void close() throws IOException {

    /**
     * Closes this <code>MemoryCacheImageOutputStream</code>.  All
     * pending data is flushed to the output, and the cache
     * is released.  The destination <code>OutputStream</code>
     * is not closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
    public boolean isCachedMemory() {

    /**
     * Returns <code>true</code> since this
     * <code>ImageOutputStream</code> maintains a main memory cache.
     *
     * @return <code>true</code>.
     *
     * @see #isCached
     * @see #isCachedFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
    public boolean isCachedFile() {

    /**
     * Returns <code>false</code> since this
     * <code>ImageOutputStream</code> does not maintain a file cache.
     *
     * @return <code>false</code>.
     *
     * @see #isCached
     * @see #isCachedMemory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
    public boolean isCached() {

    /**
     * Returns <code>true</code> since this
     * <code>ImageOutputStream</code> caches data in order to allow
     * seeking backwards.
     *
     * @return <code>true</code>.
     *
     * @see #isCachedMemory
     * @see #isCachedFile
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
    public MemoryCacheImageOutputStream(OutputStream stream) {

    /**
     * Constructs a <code>MemoryCacheImageOutputStream</code> that will write
     * to a given <code>OutputStream</code>.
     *
     * @param stream an <code>OutputStream</code> to write to.
     *
     * @exception IllegalArgumentException if <code>stream</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCacheImageOutputStream.java
public class MemoryCacheImageOutputStream extends ImageOutputStreamImpl {

/**
 * An implementation of <code>ImageOutputStream</code> that writes its
 * output to a regular <code>OutputStream</code>.  A memory buffer is
 * used to cache at least the data between the discard position and
 * the current write position.  The only constructor takes an
 * <code>OutputStream</code>, so this class may not be used for
 * read/modify/write operations.  Reading can occur only on parts of
 * the stream that have already been written to the cache and not
 * yet flushed.
 *
 */
