_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    protected void finalize() throws Throwable {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    public long length() {

    /**
     * Returns the length of the underlying file, or <code>-1</code>
     * if it is unknown.
     *
     * @return the file length as a <code>long</code>, or
     * <code>-1</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    public FileImageInputStream(RandomAccessFile raf) {

    /**
     * Constructs a <code>FileImageInputStream</code> that will read
     * from a given <code>RandomAccessFile</code>.
     *
     * <p> The file contents must not change between the time this
     * object is constructed and the time of the last call to a read
     * method.
     *
     * @param raf a <code>RandomAccessFile</code> to read from.
     *
     * @exception IllegalArgumentException if <code>raf</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    public FileImageInputStream(File f)

    /**
     * Constructs a <code>FileImageInputStream</code> that will read
     * from a given <code>File</code>.
     *
     * <p> The file contents must not change between the time this
     * object is constructed and the time of the last call to a read
     * method.
     *
     * @param f a <code>File</code> to read from.
     *
     * @exception IllegalArgumentException if <code>f</code> is
     * <code>null</code>.
     * @exception SecurityException if a security manager exists
     * and does not allow read access to the file.
     * @exception FileNotFoundException if <code>f</code> is a
     * directory or cannot be opened for reading for any other reason.
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    private final CloseableDisposerRecord disposerRecord;

    /** The DisposerRecord that closes the underlying RandomAccessFile. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
    private final Object disposerReferent;

    /** The referent to be registered with the Disposer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/FileImageInputStream.java
public class FileImageInputStream extends ImageInputStreamImpl {

/**
 * An implementation of <code>ImageInputStream</code> that gets its
 * input from a <code>File</code> or <code>RandomAccessFile</code>.
 * The file contents are assumed to be stable during the lifetime of
 * the object.
 *
 */
