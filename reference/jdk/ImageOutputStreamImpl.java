_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageOutputStreamImpl.java
    protected final void flushBits() throws IOException {

    /**
     * If the bit offset is non-zero, forces the remaining bits
     * in the current byte to 0 and advances the stream position
     * by one.  This method should be called by subclasses at the
     * beginning of the <code>write(int)</code> and
     * <code>write(byte[], int, int)</code> methods.
     *
     * @exception IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageOutputStreamImpl.java
    public ImageOutputStreamImpl() {

    /**
     * Constructs an <code>ImageOutputStreamImpl</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/ImageOutputStreamImpl.java
public abstract class ImageOutputStreamImpl

/**
 * An abstract class implementing the <code>ImageOutputStream</code> interface.
 * This class is designed to reduce the number of methods that must
 * be implemented by subclasses.
 *
 */
