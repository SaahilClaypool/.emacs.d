_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void reset() {

    /**
     * Erase the entire cache contents and reset the length to 0.
     * The cache object may subsequently be reused as though it had just
     * been allocated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void disposeBefore(long pos) {

    /**
     * Free the blocks up to the position <code>pos</code>.
     * The byte at <code>pos</code> remains available.
     *
     * @exception IndexOutOfBoundsException if <code>pos</code>
     * is in a block that has already been disposed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void read(byte[] b, int off, int len, long pos)

    /**
     * Copy <code>len</code> bytes from the cache, starting
     * at cache position <code>pos</code>, into the array
     * <code>b</code> at offset <code>off</code>.
     *
     * @exception NullPointerException if b is <code>null</code>
     * @exception IndexOutOfBoundsException if <code>off</code>,
     * <code>len</code> or <code>pos</code> are negative or if
     * <code>off + len > b.length</code> or if any portion of the
     * requested data is not in the cache (including if
     * <code>pos</code> is in a block that has already been disposed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public int read(long pos) throws IOException {

    /**
     * Returns the single byte at the given position, as an
     * <code>int</code>.  Returns -1 if this position has
     * not been cached or has been disposed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public long getLength() {

    /**
     * Returns the total length of data that has been cached,
     * regardless of whether any early blocks have been disposed.
     * This value will only ever increase.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void write(int b, long pos) throws IOException {

    /**
     * Overwrites or appends a single byte to the cache.
     * The length of the cache will be extended as needed to hold
     * the incoming data.
     *
     * @param b an <code>int</code> whose 8 least significant bits
     * will be written.
     * @param pos the cache position at which to begin writing.
     *
     * @exception IndexOutOfBoundsException if <code>pos</code> is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void write(byte[] b, int off, int len, long pos)

    /**
     * Overwrites and/or appends the cache from a byte array.
     * The length of the cache will be extended as needed to hold
     * the incoming data.
     *
     * @param b an array of bytes containing data to be written.
     * @param off the starting offset withing the data array.
     * @param len the number of bytes to be written.
     * @param pos the cache position at which to begin writing.
     *
     * @exception NullPointerException if <code>b</code> is <code>null</code>.
     * @exception IndexOutOfBoundsException if <code>off</code>,
     * <code>len</code>, or <code>pos</code> are negative,
     * or if <code>off+len > b.length</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    private void pad(long pos) throws IOException {

    /**
     * Ensure that there is space to write a byte at the given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public void writeToStream(OutputStream stream, long pos, long len)

    /**
     * Writes out a portion of the cache to an <code>OutputStream</code>.
     * This method preserves no state about the output stream, and does
     * not dispose of any blocks containing bytes written.  To dispose
     * blocks, use {@link #disposeBefore <code>disposeBefore()</code>}.
     *
     * @exception IndexOutOfBoundsException if any portion of
     * the requested data is not in the cache (including if <code>pos</code>
     * is in a block already disposed), or if either <code>pos</code> or
     * <code>len</code> is < 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    public long loadFromStream(InputStream stream, long pos)

    /**
     * Ensures that at least <code>pos</code> bytes are cached,
     * or the end of the source is reached.  The return value
     * is equal to the smaller of <code>pos</code> and the
     * length of the source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
    private long length = 0L;

    /**
     * The largest position ever written to the cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/MemoryCache.java
class MemoryCache {

/**
 * Package-visible class consolidating common code for
 * <code>MemoryCacheImageInputStream</code> and
 * <code>MemoryCacheImageOutputStream</code>.
 * This class keeps an <code>ArrayList</code> of 8K blocks,
 * loaded sequentially.  Blocks may only be disposed of
 * from the index 0 forward.  As blocks are freed, the
 * corresponding entries in the array list are set to
 * <code>null</code>, but no compacting is performed.
 * This allows the index for each block to never change,
 * and the length of the cache is always the same as the
 * total amount of data ever cached.  Cached data is
 * therefore always contiguous from the point of last
 * disposal to the current length.
 *
 * <p> The total number of blocks resident in the cache must not
 * exceed <code>Integer.MAX_VALUE</code>.  In practice, the limit of
 * available memory will be exceeded long before this becomes an
 * issue, since a full cache would contain 8192*2^31 = 16 terabytes of
 * data.
 *
 * A <code>MemoryCache</code> may be reused after a call
 * to <code>reset()</code>.
 */
