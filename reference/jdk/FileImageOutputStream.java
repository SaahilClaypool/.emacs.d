_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    protected void finalize() throws Throwable {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    public void seek(long pos) throws IOException {

    /**
     * Sets the current stream position and resets the bit offset to
     * 0.  It is legal to seeking past the end of the file; an
     * <code>EOFException</code> will be thrown only if a read is
     * performed.  The file length will not be increased until a write
     * is performed.
     *
     * @exception IndexOutOfBoundsException if <code>pos</code> is smaller
     * than the flushed position.
     * @exception IOException if any other I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    public FileImageOutputStream(RandomAccessFile raf) {

    /**
     * Constructs a <code>FileImageOutputStream</code> that will write
     * to a given <code>RandomAccessFile</code>.
     *
     * @param raf a <code>RandomAccessFile</code> to write to.
     *
     * @exception IllegalArgumentException if <code>raf</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    public FileImageOutputStream(File f)

    /**
     * Constructs a <code>FileImageOutputStream</code> that will write
     * to a given <code>File</code>.
     *
     * @param f a <code>File</code> to write to.
     *
     * @exception IllegalArgumentException if <code>f</code> is
     * <code>null</code>.
     * @exception SecurityException if a security manager exists
     * and does not allow write access to the file.
     * @exception FileNotFoundException if <code>f</code> does not denote
     * a regular file or it cannot be opened for reading and writing for any
     * other reason.
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    private final CloseableDisposerRecord disposerRecord;

    /** The DisposerRecord that closes the underlying RandomAccessFile. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
    private final Object disposerReferent;

    /** The referent to be registered with the Disposer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageOutputStream.java
public class FileImageOutputStream extends ImageOutputStreamImpl {

/**
 * An implementation of <code>ImageOutputStream</code> that writes its
 * output directly to a <code>File</code> or
 * <code>RandomAccessFile</code>.
 *
 */
