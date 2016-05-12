_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    private native static void init();

    /**
     * Perform class load-time initializations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    protected void finalize() {}

    /**
     * Overrides finalize, the fd is closed by the Socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    private boolean closing = false;

    /**
     * Closes the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    public void write(byte b[], int off, int len) throws IOException {

    /**
     * Writes <i>length</i> bytes from buffer <i>b</i> starting at
     * offset <i>len</i>.
     * @param b the data to be written
     * @param off the start offset in the data
     * @param len the number of bytes that are written
     * @exception SocketException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    public void write(byte b[]) throws IOException {

    /**
     * Writes the contents of the buffer <i>b</i> to the socket.
     * @param b the data to be written
     * @exception SocketException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    public void write(int b) throws IOException {

    /**
     * Writes a byte to the socket.
     * @param b the data to be written
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    private void socketWrite(byte b[], int off, int len) throws IOException {

    /**
     * Writes to the socket with appropriate locking of the
     * FileDescriptor.
     * @param b the data to be written
     * @param off the start offset in the data
     * @param len the number of bytes that are written
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    private native void socketWrite0(FileDescriptor fd, byte[] b, int off,
                                     int len) throws IOException;

    /**
     * Writes to the socket.
     * @param fd the FileDescriptor
     * @param b the data to be written
     * @param off the start offset in the data
     * @param len the number of bytes that are written
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    public final FileChannel getChannel() {

    /**
     * Returns the unique {@link java.nio.channels.FileChannel FileChannel}
     * object associated with this file output stream. </p>
     *
     * The {@code getChannel} method of {@code SocketOutputStream}
     * returns {@code null} since it is a socket based stream.</p>
     *
     * @return  the file channel associated with this file output stream
     *
     * @since 1.4
     * @spec JSR-51
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
    SocketOutputStream(AbstractPlainSocketImpl impl) throws IOException {

    /**
     * Creates a new SocketOutputStream. Can only be called
     * by a Socket. This method needs to hang on to the owner Socket so
     * that the fd will not be closed.
     * @param impl the socket output stream inplemented
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketOutputStream.java
class SocketOutputStream extends FileOutputStream

/**
 * This stream extends FileOutputStream to implement a
 * SocketOutputStream. Note that this class should <b>NOT</b> be
 * public.
 *
 * @author      Jonathan Payne
 * @author      Arthur van Hoff
 */
