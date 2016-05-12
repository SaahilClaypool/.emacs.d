_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void close()  throws IOException {

    /**
     * Closes this piped output stream and releases any system resources
     * associated with this stream. This stream may no longer be used for
     * writing characters.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public synchronized void flush() throws IOException {

    /**
     * Flushes this output stream and forces any buffered output characters
     * to be written out.
     * This will notify any readers that characters are waiting in the pipe.
     *
     * @exception  IOException  if the pipe is closed, or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> characters from the specified character array
     * starting at offset <code>off</code> to this piped output stream.
     * This method blocks until all the characters are written to the output
     * stream.
     * If a thread was reading data characters from the connected piped input
     * stream, but the thread is no longer alive, then an
     * <code>IOException</code> is thrown.
     *
     * @param      cbuf  the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of characters to write.
     * @exception  IOException  if the pipe is
     *          <a href=PipedOutputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedReader) unconnected}, closed
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void write(int c)  throws IOException {

    /**
     * Writes the specified <code>char</code> to the piped output stream.
     * If a thread was reading data characters from the connected piped input
     * stream, but the thread is no longer alive, then an
     * <code>IOException</code> is thrown.
     * <p>
     * Implements the <code>write</code> method of <code>Writer</code>.
     *
     * @param      c   the <code>char</code> to be written.
     * @exception  IOException  if the pipe is
     *          <a href=PipedOutputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedReader) unconnected}, closed
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public synchronized void connect(PipedReader snk) throws IOException {

    /**
     * Connects this piped writer to a receiver. If this object
     * is already connected to some other piped reader, an
     * <code>IOException</code> is thrown.
     * <p>
     * If <code>snk</code> is an unconnected piped reader and
     * <code>src</code> is an unconnected piped writer, they may
     * be connected by either the call:
     * <blockquote><pre>
     * src.connect(snk)</pre></blockquote>
     * or the call:
     * <blockquote><pre>
     * snk.connect(src)</pre></blockquote>
     * The two calls have the same effect.
     *
     * @param      snk   the piped reader to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public PipedWriter() {

    /**
     * Creates a piped writer that is not yet connected to a
     * piped reader. It must be connected to a piped reader,
     * either by the receiver or the sender, before being used.
     *
     * @see     java.io.PipedReader#connect(java.io.PipedWriter)
     * @see     java.io.PipedWriter#connect(java.io.PipedReader)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public PipedWriter(PipedReader snk)  throws IOException {

    /**
     * Creates a piped writer connected to the specified piped
     * reader. Data characters written to this stream will then be
     * available as input from <code>snk</code>.
     *
     * @param      snk   The piped reader to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
public class PipedWriter extends Writer {

/**
 * Piped character-output streams.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void close()  throws IOException {

    /**
     * Closes this piped output stream and releases any system resources
     * associated with this stream. This stream may no longer be used for
     * writing characters.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public synchronized void flush() throws IOException {

    /**
     * Flushes this output stream and forces any buffered output characters
     * to be written out.
     * This will notify any readers that characters are waiting in the pipe.
     *
     * @exception  IOException  if the pipe is closed, or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> characters from the specified character array
     * starting at offset <code>off</code> to this piped output stream.
     * This method blocks until all the characters are written to the output
     * stream.
     * If a thread was reading data characters from the connected piped input
     * stream, but the thread is no longer alive, then an
     * <code>IOException</code> is thrown.
     *
     * @param      cbuf  the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of characters to write.
     * @exception  IOException  if the pipe is
     *          <a href=PipedOutputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedReader) unconnected}, closed
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public void write(int c)  throws IOException {

    /**
     * Writes the specified <code>char</code> to the piped output stream.
     * If a thread was reading data characters from the connected piped input
     * stream, but the thread is no longer alive, then an
     * <code>IOException</code> is thrown.
     * <p>
     * Implements the <code>write</code> method of <code>Writer</code>.
     *
     * @param      c   the <code>char</code> to be written.
     * @exception  IOException  if the pipe is
     *          <a href=PipedOutputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedReader) unconnected}, closed
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public synchronized void connect(PipedReader snk) throws IOException {

    /**
     * Connects this piped writer to a receiver. If this object
     * is already connected to some other piped reader, an
     * <code>IOException</code> is thrown.
     * <p>
     * If <code>snk</code> is an unconnected piped reader and
     * <code>src</code> is an unconnected piped writer, they may
     * be connected by either the call:
     * <blockquote><pre>
     * src.connect(snk)</pre></blockquote>
     * or the call:
     * <blockquote><pre>
     * snk.connect(src)</pre></blockquote>
     * The two calls have the same effect.
     *
     * @param      snk   the piped reader to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public PipedWriter() {

    /**
     * Creates a piped writer that is not yet connected to a
     * piped reader. It must be connected to a piped reader,
     * either by the receiver or the sender, before being used.
     *
     * @see     java.io.PipedReader#connect(java.io.PipedWriter)
     * @see     java.io.PipedWriter#connect(java.io.PipedReader)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
    public PipedWriter(PipedReader snk)  throws IOException {

    /**
     * Creates a piped writer connected to the specified piped
     * reader. Data characters written to this stream will then be
     * available as input from <code>snk</code>.
     *
     * @param      snk   The piped reader to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedWriter.java
public class PipedWriter extends Writer {

/**
 * Piped character-output streams.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
