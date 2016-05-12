_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public void close()  throws IOException {

    /**
     * Closes this piped stream and releases any system resources
     * associated with the stream.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized boolean ready() throws IOException {

    /**
     * Tell whether this stream is ready to be read.  A piped character
     * stream is ready if the circular buffer is not empty.
     *
     * @exception  IOException  if the pipe is
     *                  <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *                  {@link #connect(java.io.PipedWriter) unconnected}, or closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized int read(char cbuf[], int off, int len)  throws IOException {

    /**
     * Reads up to <code>len</code> characters of data from this piped
     * stream into an array of characters. Less than <code>len</code> characters
     * will be read if the end of the data stream is reached or if
     * <code>len</code> exceeds the pipe's buffer size. This method
     * blocks until at least one character of input is available.
     *
     * @param      cbuf     the buffer into which the data is read.
     * @param      off   the start offset of the data.
     * @param      len   the maximum number of characters read.
     * @return     the total number of characters read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException  if the pipe is
     *                  <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *                  {@link #connect(java.io.PipedWriter) unconnected}, closed,
     *                  or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized int read()  throws IOException {

    /**
     * Reads the next character of data from this piped stream.
     * If no character is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned.
     * This method blocks until input data is available, the end of
     * the stream is detected, or an exception is thrown.
     *
     * @return     the next character of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if the pipe is
     *          <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedWriter) unconnected}, closed,
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receivedLast() {

    /**
     * Notifies all waiting threads that the last character of data has been
     * received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receive(char c[], int off, int len)  throws IOException {

    /**
     * Receives data into an array of characters.  This method will
     * block until some input is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receive(int c) throws IOException {

    /**
     * Receives a char of data. This method will block if no input is
     * available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public void connect(PipedWriter src) throws IOException {

    /**
     * Causes this piped reader to be connected
     * to the piped  writer <code>src</code>.
     * If this object is already connected to some
     * other piped writer, an <code>IOException</code>
     * is thrown.
     * <p>
     * If <code>src</code> is an
     * unconnected piped writer and <code>snk</code>
     * is an unconnected piped reader, they
     * may be connected by either the call:
     *
     * <pre><code>snk.connect(src)</code> </pre>
     * <p>
     * or the call:
     *
     * <pre><code>src.connect(snk)</code> </pre>
     * <p>
     * The two calls have the same effect.
     *
     * @param      src   The piped writer to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(int pipeSize) {

    /**
     * Creates a <code>PipedReader</code> so that it is not yet
     * {@link #connect(java.io.PipedWriter) connected} and uses
     * the specified pipe size for the pipe's buffer.
     * It must be  {@linkplain java.io.PipedWriter#connect(
     * java.io.PipedReader) connected} to a <code>PipedWriter</code>
     * before being used.
     *
     * @param   pipeSize the size of the pipe's buffer.
     * @exception  IllegalArgumentException if {@code pipeSize <= 0}.
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader() {

    /**
     * Creates a <code>PipedReader</code> so
     * that it is not yet {@linkplain #connect(java.io.PipedWriter)
     * connected}. It must be {@linkplain java.io.PipedWriter#connect(
     * java.io.PipedReader) connected} to a <code>PipedWriter</code>
     * before being used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(PipedWriter src, int pipeSize) throws IOException {

    /**
     * Creates a <code>PipedReader</code> so that it is connected
     * to the piped writer <code>src</code> and uses the specified
     * pipe size for the pipe's buffer. Data written to <code>src</code>
     * will then be  available as input from this stream.

     * @param      src       the stream to connect to.
     * @param      pipeSize  the size of the pipe's buffer.
     * @exception  IOException  if an I/O error occurs.
     * @exception  IllegalArgumentException if {@code pipeSize <= 0}.
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(PipedWriter src) throws IOException {

    /**
     * Creates a <code>PipedReader</code> so
     * that it is connected to the piped writer
     * <code>src</code>. Data written to <code>src</code>
     * will then be available as input from this stream.
     *
     * @param      src   the stream to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    int out = 0;

    /**
     * The index of the position in the circular buffer at which the next
     * character of data will be read by this piped reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    int in = -1;

    /**
     * The index of the position in the circular buffer at which the
     * next character of data will be stored when received from the connected
     * piped writer. <code>in&lt;0</code> implies the buffer is empty,
     * <code>in==out</code> implies the buffer is full
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    char buffer[];

    /**
     * The circular buffer into which incoming data is placed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    private static final int DEFAULT_PIPE_SIZE = 1024;

   /**
    * The size of the pipe's circular input buffer.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
public class PipedReader extends Reader {

/**
 * Piped character-input streams.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public void close()  throws IOException {

    /**
     * Closes this piped stream and releases any system resources
     * associated with the stream.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized boolean ready() throws IOException {

    /**
     * Tell whether this stream is ready to be read.  A piped character
     * stream is ready if the circular buffer is not empty.
     *
     * @exception  IOException  if the pipe is
     *                  <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *                  {@link #connect(java.io.PipedWriter) unconnected}, or closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized int read(char cbuf[], int off, int len)  throws IOException {

    /**
     * Reads up to <code>len</code> characters of data from this piped
     * stream into an array of characters. Less than <code>len</code> characters
     * will be read if the end of the data stream is reached or if
     * <code>len</code> exceeds the pipe's buffer size. This method
     * blocks until at least one character of input is available.
     *
     * @param      cbuf     the buffer into which the data is read.
     * @param      off   the start offset of the data.
     * @param      len   the maximum number of characters read.
     * @return     the total number of characters read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException  if the pipe is
     *                  <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *                  {@link #connect(java.io.PipedWriter) unconnected}, closed,
     *                  or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public synchronized int read()  throws IOException {

    /**
     * Reads the next character of data from this piped stream.
     * If no character is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned.
     * This method blocks until input data is available, the end of
     * the stream is detected, or an exception is thrown.
     *
     * @return     the next character of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if the pipe is
     *          <a href=PipedInputStream.html#BROKEN> <code>broken</code></a>,
     *          {@link #connect(java.io.PipedWriter) unconnected}, closed,
     *          or an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receivedLast() {

    /**
     * Notifies all waiting threads that the last character of data has been
     * received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receive(char c[], int off, int len)  throws IOException {

    /**
     * Receives data into an array of characters.  This method will
     * block until some input is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    synchronized void receive(int c) throws IOException {

    /**
     * Receives a char of data. This method will block if no input is
     * available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public void connect(PipedWriter src) throws IOException {

    /**
     * Causes this piped reader to be connected
     * to the piped  writer <code>src</code>.
     * If this object is already connected to some
     * other piped writer, an <code>IOException</code>
     * is thrown.
     * <p>
     * If <code>src</code> is an
     * unconnected piped writer and <code>snk</code>
     * is an unconnected piped reader, they
     * may be connected by either the call:
     *
     * <pre><code>snk.connect(src)</code> </pre>
     * <p>
     * or the call:
     *
     * <pre><code>src.connect(snk)</code> </pre>
     * <p>
     * The two calls have the same effect.
     *
     * @param      src   The piped writer to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(int pipeSize) {

    /**
     * Creates a <code>PipedReader</code> so that it is not yet
     * {@link #connect(java.io.PipedWriter) connected} and uses
     * the specified pipe size for the pipe's buffer.
     * It must be  {@linkplain java.io.PipedWriter#connect(
     * java.io.PipedReader) connected} to a <code>PipedWriter</code>
     * before being used.
     *
     * @param   pipeSize the size of the pipe's buffer.
     * @exception  IllegalArgumentException if {@code pipeSize <= 0}.
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader() {

    /**
     * Creates a <code>PipedReader</code> so
     * that it is not yet {@linkplain #connect(java.io.PipedWriter)
     * connected}. It must be {@linkplain java.io.PipedWriter#connect(
     * java.io.PipedReader) connected} to a <code>PipedWriter</code>
     * before being used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(PipedWriter src, int pipeSize) throws IOException {

    /**
     * Creates a <code>PipedReader</code> so that it is connected
     * to the piped writer <code>src</code> and uses the specified
     * pipe size for the pipe's buffer. Data written to <code>src</code>
     * will then be  available as input from this stream.

     * @param      src       the stream to connect to.
     * @param      pipeSize  the size of the pipe's buffer.
     * @exception  IOException  if an I/O error occurs.
     * @exception  IllegalArgumentException if {@code pipeSize <= 0}.
     * @since      1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    public PipedReader(PipedWriter src) throws IOException {

    /**
     * Creates a <code>PipedReader</code> so
     * that it is connected to the piped writer
     * <code>src</code>. Data written to <code>src</code>
     * will then be available as input from this stream.
     *
     * @param      src   the stream to connect to.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    int out = 0;

    /**
     * The index of the position in the circular buffer at which the next
     * character of data will be read by this piped reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    int in = -1;

    /**
     * The index of the position in the circular buffer at which the
     * next character of data will be stored when received from the connected
     * piped writer. <code>in&lt;0</code> implies the buffer is empty,
     * <code>in==out</code> implies the buffer is full
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    char buffer[];

    /**
     * The circular buffer into which incoming data is placed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
    private static final int DEFAULT_PIPE_SIZE = 1024;

   /**
    * The size of the pipe's circular input buffer.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/PipedReader.java
public class PipedReader extends Reader {

/**
 * Piped character-input streams.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
