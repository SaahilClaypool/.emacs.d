_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected void finalize() throws Throwable {

    /**
     * Finalizes this object prior to garbage collection.  The
     * <code>close</code> method is called to close any open input
     * source.  This method should not be called from application
     * code.
     *
     * @exception Throwable if an error occurs during superclass
     * finalization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public boolean isCachedFile() {

    /**
     * Default implementation returns false.  Subclasses should
     * override this if they cache data in a temporary file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public boolean isCachedMemory() {

    /**
     * Default implementation returns false.  Subclasses should
     * override this if they cache data in main memory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public boolean isCached() {

    /**
     * Default implementation returns false.  Subclasses should
     * override this if they cache data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public void reset() throws IOException {

    /**
     * Resets the current stream byte and bit positions from the stack
     * of marked positions.
     *
     * <p> An <code>IOException</code> will be thrown if the previous
     * marked position lies in the discarded portion of the stream.
     *
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public void mark() {

    /**
     * Pushes the current stream position onto a stack of marked
     * positions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public long skipBytes(long n) throws IOException {

    /**
     * Advances the current stream position by calling
     * <code>seek(getStreamPosition() + n)</code>.
     *
     * <p> The bit offset is reset to zero.
     *
     * @param n the number of bytes to seek forward.
     *
     * @return a <code>long</code> representing the number of bytes
     * skipped.
     *
     * @exception IOException if <code>getStreamPosition</code>
     * throws an <code>IOException</code> when computing either
     * the starting or ending position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public int skipBytes(int n) throws IOException {

    /**
     * Advances the current stream position by calling
     * <code>seek(getStreamPosition() + n)</code>.
     *
     * <p> The bit offset is reset to zero.
     *
     * @param n the number of bytes to seek forward.
     *
     * @return an <code>int</code> representing the number of bytes
     * skipped.
     *
     * @exception IOException if <code>getStreamPosition</code>
     * throws an <code>IOException</code> when computing either
     * the starting or ending position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public long length() {

    /**
     * Returns <code>-1L</code> to indicate that the stream has unknown
     * length.  Subclasses must override this method to provide actual
     * length information.
     *
     * @return -1L to indicate unknown length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public abstract int read(byte[] b, int off, int len) throws IOException;

    /**
     * Reads up to <code>len</code> bytes from the stream, and stores
     * them into <code>b</code> starting at index <code>off</code>.
     * If no bytes can be read because the end of the stream has been
     * reached, <code>-1</code> is returned.
     *
     * <p> The bit offset within the stream must be reset to zero before
     * the read occurs.
     *
     * <p> Subclasses must provide an implementation for this method.
     * The subclass implementation should update the stream position
     * before exiting.
     *
     * @param b an array of bytes to be written to.
     * @param off the starting position within <code>b</code> to write to.
     * @param len the maximum number of bytes to read.
     *
     * @return the number of bytes actually read, or <code>-1</code>
     * to indicate EOF.
     *
     * @exception IndexOutOfBoundsException if <code>off</code> is
     * negative, <code>len</code> is negative, or <code>off +
     * len</code> is greater than <code>b.length</code>.
     * @exception NullPointerException if <code>b</code> is
     * <code>null</code>.
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public int read(byte[] b) throws IOException {

    /**
     * A convenience method that calls <code>read(b, 0, b.length)</code>.
     *
     * <p> The bit offset within the stream is reset to zero before
     * the read occurs.
     *
     * @return the number of bytes actually read, or <code>-1</code>
     * to indicate EOF.
     *
     * @exception NullPointerException if <code>b</code> is
     * <code>null</code>.
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public abstract int read() throws IOException;

    /**
     * Reads a single byte from the stream and returns it as an
     * <code>int</code> between 0 and 255.  If EOF is reached,
     * <code>-1</code> is returned.
     *
     * <p> Subclasses must provide an implementation for this method.
     * The subclass implementation should update the stream position
     * before exiting.
     *
     * <p> The bit offset within the stream must be reset to zero before
     * the read occurs.
     *
     * @return the value of the next byte in the stream, or <code>-1</code>
     * if EOF is reached.
     *
     * @exception IOException if the stream has been closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected final void checkClosed() throws IOException {

    /**
     * Throws an <code>IOException</code> if the stream has been closed.
     * Subclasses may call this method from any of their methods that
     * require the stream not to be closed.
     *
     * @exception IOException if the stream is closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    public ImageInputStreamImpl() {

    /**
     * Constructs an <code>ImageInputStreamImpl</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected long flushedPos = 0;

    /**
     * The position prior to which data may be discarded.  Seeking
     * to a smaller position is not allowed.  <code>flushedPos</code>
     * will always be {@literal >= 0}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected int bitOffset;

    /**
     * The current bit offset within the stream.  Subclasses are
     * responsible for keeping this value current from any method they
     * override that alters the bit offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected long streamPos;

    /**
     * The current read position within the stream.  Subclasses are
     * responsible for keeping this value current from any method they
     * override that alters the read position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    protected ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

    /**
     * The byte order of the stream as an instance of the enumeration
     * class <code>java.nio.ByteOrder</code>, where
     * <code>ByteOrder.BIG_ENDIAN</code> indicates network byte order
     * and <code>ByteOrder.LITTLE_ENDIAN</code> indicates the reverse
     * order.  By default, the value is
     * <code>ByteOrder.BIG_ENDIAN</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
    byte[] byteBuf = new byte[BYTE_BUF_LENGTH];

    /**
     * Byte buffer used for readFully(type[], int, int).  Note that this
     * array is also used for bulk reads in readShort(), readInt(), etc, so
     * it should be large enough to hold a primitive value (i.e. >= 8 bytes).
     * Also note that this array is package protected, so that it can be
     * used by ImageOutputStreamImpl in a similar manner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageInputStreamImpl.java
public abstract class ImageInputStreamImpl implements ImageInputStream {

/**
 * An abstract class implementing the <code>ImageInputStream</code> interface.
 * This class is designed to reduce the number of methods that must
 * be implemented by subclasses.
 *
 * <p> In particular, this class handles most or all of the details of
 * byte order interpretation, buffering, mark/reset, discarding,
 * closing, and disposing.
 */
