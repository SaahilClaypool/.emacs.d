_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    private native static void init();

    /**
     * Perform class load-time initializations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    protected void finalize() {}

    /**
     * Overrides finalize, the fd is closed by the Socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    private boolean closing = false;

    /**
     * Closes the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public int available() throws IOException {

    /**
     * Returns the number of bytes that can be read without blocking.
     * @return the number of immediately available bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public long skip(long numbytes) throws IOException {

    /**
     * Skips n bytes of input.
     * @param numbytes the number of bytes to skip
     * @return  the actual number of bytes skipped.
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public int read() throws IOException {

    /**
     * Reads a single byte from the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public int read(byte b[], int off, int length) throws IOException {

    /**
     * Reads into a byte array <i>b</i> at offset <i>off</i>,
     * <i>length</i> bytes of data.
     * @param b the buffer into which the data is read
     * @param off the start offset of the data
     * @param length the maximum number of bytes read
     * @return the actual number of bytes read, -1 is
     *          returned when the end of the stream is reached.
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public int read(byte b[]) throws IOException {

    /**
     * Reads into a byte array data from the socket.
     * @param b the buffer into which the data is read
     * @return the actual number of bytes read, -1 is
     *          returned when the end of the stream is reached.
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    private int socketRead(FileDescriptor fd,
                           byte b[], int off, int len,
                           int timeout)

    /**
     * Reads into an array of bytes at the specified offset using
     * the received socket primitive.
     * @param fd the FileDescriptor
     * @param b the buffer into which the data is read
     * @param off the start offset of the data
     * @param len the maximum number of bytes read
     * @param timeout the read timeout in ms
     * @return the actual number of bytes read, -1 is
     *          returned when the end of the stream is reached.
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    private native int socketRead0(FileDescriptor fd,
                                   byte b[], int off, int len,
                                   int timeout)

    /**
     * Reads into an array of bytes at the specified offset using
     * the received socket primitive.
     * @param fd the FileDescriptor
     * @param b the buffer into which the data is read
     * @param off the start offset of the data
     * @param len the maximum number of bytes read
     * @param timeout the read timeout in ms
     * @return the actual number of bytes read, -1 is
     *          returned when the end of the stream is reached.
     * @exception IOException If an I/O error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    public final FileChannel getChannel() {

    /**
     * Returns the unique {@link java.nio.channels.FileChannel FileChannel}
     * object associated with this file input stream.</p>
     *
     * The {@code getChannel} method of {@code SocketInputStream}
     * returns {@code null} since it is a socket based stream.</p>
     *
     * @return  the file channel associated with this file input stream
     *
     * @since 1.4
     * @spec JSR-51
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
    SocketInputStream(AbstractPlainSocketImpl impl) throws IOException {

    /**
     * Creates a new SocketInputStream. Can only be called
     * by a Socket. This method needs to hang on to the owner Socket so
     * that the fd will not be closed.
     * @param impl the implemented socket input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketInputStream.java
class SocketInputStream extends FileInputStream

/**
 * This stream extends FileInputStream to implement a
 * SocketInputStream. Note that this class should <b>NOT</b> be
 * public.
 *
 * @author      Jonathan Payne
 * @author      Arthur van Hoff
 */
