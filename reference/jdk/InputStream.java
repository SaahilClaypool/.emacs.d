_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public boolean markSupported() {

    /**
     * Tests if this input stream supports the <code>mark</code> and
     * <code>reset</code> methods. Whether or not <code>mark</code> and
     * <code>reset</code> are supported is an invariant property of a
     * particular input stream instance. The <code>markSupported</code> method
     * of <code>InputStream</code> returns <code>false</code>.
     *
     * @return  <code>true</code> if this stream instance supports the mark
     *          and reset methods; <code>false</code> otherwise.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.InputStream#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public synchronized void reset() throws IOException {

    /**
     * Repositions this stream to the position at the time the
     * <code>mark</code> method was last called on this input stream.
     *
     * <p> The general contract of <code>reset</code> is:
     *
     * <ul>
     * <li> If the method <code>markSupported</code> returns
     * <code>true</code>, then:
     *
     *     <ul><li> If the method <code>mark</code> has not been called since
     *     the stream was created, or the number of bytes read from the stream
     *     since <code>mark</code> was last called is larger than the argument
     *     to <code>mark</code> at that last call, then an
     *     <code>IOException</code> might be thrown.
     *
     *     <li> If such an <code>IOException</code> is not thrown, then the
     *     stream is reset to a state such that all the bytes read since the
     *     most recent call to <code>mark</code> (or since the start of the
     *     file, if <code>mark</code> has not been called) will be resupplied
     *     to subsequent callers of the <code>read</code> method, followed by
     *     any bytes that otherwise would have been the next input data as of
     *     the time of the call to <code>reset</code>. </ul>
     *
     * <li> If the method <code>markSupported</code> returns
     * <code>false</code>, then:
     *
     *     <ul><li> The call to <code>reset</code> may throw an
     *     <code>IOException</code>.
     *
     *     <li> If an <code>IOException</code> is not thrown, then the stream
     *     is reset to a fixed state that depends on the particular type of the
     *     input stream and how it was created. The bytes that will be supplied
     *     to subsequent callers of the <code>read</code> method depend on the
     *     particular type of the input stream. </ul></ul>
     *
     * <p>The method <code>reset</code> for class <code>InputStream</code>
     * does nothing except throw an <code>IOException</code>.
     *
     * @exception  IOException  if this stream has not been marked or if the
     *               mark has been invalidated.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public synchronized void mark(int readlimit) {}

    /**
     * Marks the current position in this input stream. A subsequent call to
     * the <code>reset</code> method repositions this stream at the last marked
     * position so that subsequent reads re-read the same bytes.
     *
     * <p> The <code>readlimit</code> arguments tells this input stream to
     * allow that many bytes to be read before the mark position gets
     * invalidated.
     *
     * <p> The general contract of <code>mark</code> is that, if the method
     * <code>markSupported</code> returns <code>true</code>, the stream somehow
     * remembers all the bytes read after the call to <code>mark</code> and
     * stands ready to supply those same bytes again if and whenever the method
     * <code>reset</code> is called.  However, the stream is not required to
     * remember any data at all if more than <code>readlimit</code> bytes are
     * read from the stream before <code>reset</code> is called.
     *
     * <p> Marking a closed stream should not have any effect on the stream.
     *
     * <p> The <code>mark</code> method of <code>InputStream</code> does
     * nothing.
     *
     * @param   readlimit   the maximum limit of bytes that can be read before
     *                      the mark position becomes invalid.
     * @see     java.io.InputStream#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public void close() throws IOException {}

    /**
     * Closes this input stream and releases any system resources associated
     * with the stream.
     *
     * <p> The <code>close</code> method of <code>InputStream</code> does
     * nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int available() throws IOException {

    /**
     * Returns an estimate of the number of bytes that can be read (or
     * skipped over) from this input stream without blocking by the next
     * invocation of a method for this input stream. The next invocation
     * might be the same thread or another thread.  A single read or skip of this
     * many bytes will not block, but may read or skip fewer bytes.
     *
     * <p> Note that while some implementations of {@code InputStream} will return
     * the total number of bytes in the stream, many will not.  It is
     * never correct to use the return value of this method to allocate
     * a buffer intended to hold all data in this stream.
     *
     * <p> A subclass' implementation of this method may choose to throw an
     * {@link IOException} if this input stream has been closed by
     * invoking the {@link #close()} method.
     *
     * <p> The {@code available} method for class {@code InputStream} always
     * returns {@code 0}.
     *
     * <p> This method should be overridden by subclasses.
     *
     * @return     an estimate of the number of bytes that can be read (or skipped
     *             over) from this input stream without blocking or {@code 0} when
     *             it reaches the end of the input stream.
     * @exception  IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips over and discards <code>n</code> bytes of data from this input
     * stream. The <code>skip</code> method may, for a variety of reasons, end
     * up skipping over some smaller number of bytes, possibly <code>0</code>.
     * This may result from any of a number of conditions; reaching end of file
     * before <code>n</code> bytes have been skipped is only one possibility.
     * The actual number of bytes skipped is returned. If {@code n} is
     * negative, the {@code skip} method for class {@code InputStream} always
     * returns 0, and no bytes are skipped. Subclasses may handle the negative
     * value differently.
     *
     * <p> The <code>skip</code> method of this class creates a
     * byte array and then repeatedly reads into it until <code>n</code> bytes
     * have been read or the end of the stream has been reached. Subclasses are
     * encouraged to provide a more efficient implementation of this method.
     * For instance, the implementation may depend on the ability to seek.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @exception  IOException  if the stream does not support seek,
     *                          or if some other I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int read(byte b[], int off, int len) throws IOException {

    /**
     * Reads up to <code>len</code> bytes of data from the input stream into
     * an array of bytes.  An attempt is made to read as many as
     * <code>len</code> bytes, but a smaller number may be read.
     * The number of bytes actually read is returned as an integer.
     *
     * <p> This method blocks until input data is available, end of file is
     * detected, or an exception is thrown.
     *
     * <p> If <code>len</code> is zero, then no bytes are read and
     * <code>0</code> is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at end of
     * file, the value <code>-1</code> is returned; otherwise, at least one
     * byte is read and stored into <code>b</code>.
     *
     * <p> The first byte read is stored into element <code>b[off]</code>, the
     * next one into <code>b[off+1]</code>, and so on. The number of bytes read
     * is, at most, equal to <code>len</code>. Let <i>k</i> be the number of
     * bytes actually read; these bytes will be stored in elements
     * <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>,
     * leaving elements <code>b[off+</code><i>k</i><code>]</code> through
     * <code>b[off+len-1]</code> unaffected.
     *
     * <p> In every case, elements <code>b[0]</code> through
     * <code>b[off]</code> and elements <code>b[off+len]</code> through
     * <code>b[b.length-1]</code> are unaffected.
     *
     * <p> The <code>read(b,</code> <code>off,</code> <code>len)</code> method
     * for class <code>InputStream</code> simply calls the method
     * <code>read()</code> repeatedly. If the first such call results in an
     * <code>IOException</code>, that exception is returned from the call to
     * the <code>read(b,</code> <code>off,</code> <code>len)</code> method.  If
     * any subsequent call to <code>read()</code> results in a
     * <code>IOException</code>, the exception is caught and treated as if it
     * were end of file; the bytes read up to that point are stored into
     * <code>b</code> and the number of bytes read before the exception
     * occurred is returned. The default implementation of this method blocks
     * until the requested amount of input data <code>len</code> has been read,
     * end of file is detected, or an exception is thrown. Subclasses are encouraged
     * to provide a more efficient implementation of this method.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset in array <code>b</code>
     *                   at which the data is written.
     * @param      len   the maximum number of bytes to read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException If the first byte cannot be read for any reason
     * other than end of file, or if the input stream has been closed, or if
     * some other I/O error occurs.
     * @exception  NullPointerException If <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @see        java.io.InputStream#read()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int read(byte b[]) throws IOException {

    /**
     * Reads some number of bytes from the input stream and stores them into
     * the buffer array <code>b</code>. The number of bytes actually read is
     * returned as an integer.  This method blocks until input data is
     * available, end of file is detected, or an exception is thrown.
     *
     * <p> If the length of <code>b</code> is zero, then no bytes are read and
     * <code>0</code> is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at the
     * end of the file, the value <code>-1</code> is returned; otherwise, at
     * least one byte is read and stored into <code>b</code>.
     *
     * <p> The first byte read is stored into element <code>b[0]</code>, the
     * next one into <code>b[1]</code>, and so on. The number of bytes read is,
     * at most, equal to the length of <code>b</code>. Let <i>k</i> be the
     * number of bytes actually read; these bytes will be stored in elements
     * <code>b[0]</code> through <code>b[</code><i>k</i><code>-1]</code>,
     * leaving elements <code>b[</code><i>k</i><code>]</code> through
     * <code>b[b.length-1]</code> unaffected.
     *
     * <p> The <code>read(b)</code> method for class <code>InputStream</code>
     * has the same effect as: <pre><code> read(b, 0, b.length) </code></pre>
     *
     * @param      b   the buffer into which the data is read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException  If the first byte cannot be read for any reason
     * other than the end of the file, if the input stream has been closed, or
     * if some other I/O error occurs.
     * @exception  NullPointerException  if <code>b</code> is <code>null</code>.
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public abstract int read() throws IOException;

    /**
     * Reads the next byte of data from the input stream. The value byte is
     * returned as an <code>int</code> in the range <code>0</code> to
     * <code>255</code>. If no byte is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned. This method
     * blocks until input data is available, the end of the stream is detected,
     * or an exception is thrown.
     *
     * <p> A subclass must provide an implementation of this method.
     *
     * @return     the next byte of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
public abstract class InputStream implements Closeable {

/**
 * This abstract class is the superclass of all classes representing
 * an input stream of bytes.
 *
 * <p> Applications that need to define a subclass of <code>InputStream</code>
 * must always provide a method that returns the next byte of input.
 *
 * @author  Arthur van Hoff
 * @see     java.io.BufferedInputStream
 * @see     java.io.ByteArrayInputStream
 * @see     java.io.DataInputStream
 * @see     java.io.FilterInputStream
 * @see     java.io.InputStream#read()
 * @see     java.io.OutputStream
 * @see     java.io.PushbackInputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public boolean markSupported() {

    /**
     * Tests if this input stream supports the <code>mark</code> and
     * <code>reset</code> methods. Whether or not <code>mark</code> and
     * <code>reset</code> are supported is an invariant property of a
     * particular input stream instance. The <code>markSupported</code> method
     * of <code>InputStream</code> returns <code>false</code>.
     *
     * @return  <code>true</code> if this stream instance supports the mark
     *          and reset methods; <code>false</code> otherwise.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.InputStream#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public synchronized void reset() throws IOException {

    /**
     * Repositions this stream to the position at the time the
     * <code>mark</code> method was last called on this input stream.
     *
     * <p> The general contract of <code>reset</code> is:
     *
     * <ul>
     * <li> If the method <code>markSupported</code> returns
     * <code>true</code>, then:
     *
     *     <ul><li> If the method <code>mark</code> has not been called since
     *     the stream was created, or the number of bytes read from the stream
     *     since <code>mark</code> was last called is larger than the argument
     *     to <code>mark</code> at that last call, then an
     *     <code>IOException</code> might be thrown.
     *
     *     <li> If such an <code>IOException</code> is not thrown, then the
     *     stream is reset to a state such that all the bytes read since the
     *     most recent call to <code>mark</code> (or since the start of the
     *     file, if <code>mark</code> has not been called) will be resupplied
     *     to subsequent callers of the <code>read</code> method, followed by
     *     any bytes that otherwise would have been the next input data as of
     *     the time of the call to <code>reset</code>. </ul>
     *
     * <li> If the method <code>markSupported</code> returns
     * <code>false</code>, then:
     *
     *     <ul><li> The call to <code>reset</code> may throw an
     *     <code>IOException</code>.
     *
     *     <li> If an <code>IOException</code> is not thrown, then the stream
     *     is reset to a fixed state that depends on the particular type of the
     *     input stream and how it was created. The bytes that will be supplied
     *     to subsequent callers of the <code>read</code> method depend on the
     *     particular type of the input stream. </ul></ul>
     *
     * <p>The method <code>reset</code> for class <code>InputStream</code>
     * does nothing except throw an <code>IOException</code>.
     *
     * @exception  IOException  if this stream has not been marked or if the
     *               mark has been invalidated.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public synchronized void mark(int readlimit) {}

    /**
     * Marks the current position in this input stream. A subsequent call to
     * the <code>reset</code> method repositions this stream at the last marked
     * position so that subsequent reads re-read the same bytes.
     *
     * <p> The <code>readlimit</code> arguments tells this input stream to
     * allow that many bytes to be read before the mark position gets
     * invalidated.
     *
     * <p> The general contract of <code>mark</code> is that, if the method
     * <code>markSupported</code> returns <code>true</code>, the stream somehow
     * remembers all the bytes read after the call to <code>mark</code> and
     * stands ready to supply those same bytes again if and whenever the method
     * <code>reset</code> is called.  However, the stream is not required to
     * remember any data at all if more than <code>readlimit</code> bytes are
     * read from the stream before <code>reset</code> is called.
     *
     * <p> Marking a closed stream should not have any effect on the stream.
     *
     * <p> The <code>mark</code> method of <code>InputStream</code> does
     * nothing.
     *
     * @param   readlimit   the maximum limit of bytes that can be read before
     *                      the mark position becomes invalid.
     * @see     java.io.InputStream#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public void close() throws IOException {}

    /**
     * Closes this input stream and releases any system resources associated
     * with the stream.
     *
     * <p> The <code>close</code> method of <code>InputStream</code> does
     * nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int available() throws IOException {

    /**
     * Returns an estimate of the number of bytes that can be read (or
     * skipped over) from this input stream without blocking by the next
     * invocation of a method for this input stream. The next invocation
     * might be the same thread or another thread.  A single read or skip of this
     * many bytes will not block, but may read or skip fewer bytes.
     *
     * <p> Note that while some implementations of {@code InputStream} will return
     * the total number of bytes in the stream, many will not.  It is
     * never correct to use the return value of this method to allocate
     * a buffer intended to hold all data in this stream.
     *
     * <p> A subclass' implementation of this method may choose to throw an
     * {@link IOException} if this input stream has been closed by
     * invoking the {@link #close()} method.
     *
     * <p> The {@code available} method for class {@code InputStream} always
     * returns {@code 0}.
     *
     * <p> This method should be overridden by subclasses.
     *
     * @return     an estimate of the number of bytes that can be read (or skipped
     *             over) from this input stream without blocking or {@code 0} when
     *             it reaches the end of the input stream.
     * @exception  IOException if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips over and discards <code>n</code> bytes of data from this input
     * stream. The <code>skip</code> method may, for a variety of reasons, end
     * up skipping over some smaller number of bytes, possibly <code>0</code>.
     * This may result from any of a number of conditions; reaching end of file
     * before <code>n</code> bytes have been skipped is only one possibility.
     * The actual number of bytes skipped is returned. If {@code n} is
     * negative, the {@code skip} method for class {@code InputStream} always
     * returns 0, and no bytes are skipped. Subclasses may handle the negative
     * value differently.
     *
     * <p> The <code>skip</code> method of this class creates a
     * byte array and then repeatedly reads into it until <code>n</code> bytes
     * have been read or the end of the stream has been reached. Subclasses are
     * encouraged to provide a more efficient implementation of this method.
     * For instance, the implementation may depend on the ability to seek.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @exception  IOException  if the stream does not support seek,
     *                          or if some other I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int read(byte b[], int off, int len) throws IOException {

    /**
     * Reads up to <code>len</code> bytes of data from the input stream into
     * an array of bytes.  An attempt is made to read as many as
     * <code>len</code> bytes, but a smaller number may be read.
     * The number of bytes actually read is returned as an integer.
     *
     * <p> This method blocks until input data is available, end of file is
     * detected, or an exception is thrown.
     *
     * <p> If <code>len</code> is zero, then no bytes are read and
     * <code>0</code> is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at end of
     * file, the value <code>-1</code> is returned; otherwise, at least one
     * byte is read and stored into <code>b</code>.
     *
     * <p> The first byte read is stored into element <code>b[off]</code>, the
     * next one into <code>b[off+1]</code>, and so on. The number of bytes read
     * is, at most, equal to <code>len</code>. Let <i>k</i> be the number of
     * bytes actually read; these bytes will be stored in elements
     * <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>,
     * leaving elements <code>b[off+</code><i>k</i><code>]</code> through
     * <code>b[off+len-1]</code> unaffected.
     *
     * <p> In every case, elements <code>b[0]</code> through
     * <code>b[off]</code> and elements <code>b[off+len]</code> through
     * <code>b[b.length-1]</code> are unaffected.
     *
     * <p> The <code>read(b,</code> <code>off,</code> <code>len)</code> method
     * for class <code>InputStream</code> simply calls the method
     * <code>read()</code> repeatedly. If the first such call results in an
     * <code>IOException</code>, that exception is returned from the call to
     * the <code>read(b,</code> <code>off,</code> <code>len)</code> method.  If
     * any subsequent call to <code>read()</code> results in a
     * <code>IOException</code>, the exception is caught and treated as if it
     * were end of file; the bytes read up to that point are stored into
     * <code>b</code> and the number of bytes read before the exception
     * occurred is returned. The default implementation of this method blocks
     * until the requested amount of input data <code>len</code> has been read,
     * end of file is detected, or an exception is thrown. Subclasses are encouraged
     * to provide a more efficient implementation of this method.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset in array <code>b</code>
     *                   at which the data is written.
     * @param      len   the maximum number of bytes to read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException If the first byte cannot be read for any reason
     * other than end of file, or if the input stream has been closed, or if
     * some other I/O error occurs.
     * @exception  NullPointerException If <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @see        java.io.InputStream#read()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public int read(byte b[]) throws IOException {

    /**
     * Reads some number of bytes from the input stream and stores them into
     * the buffer array <code>b</code>. The number of bytes actually read is
     * returned as an integer.  This method blocks until input data is
     * available, end of file is detected, or an exception is thrown.
     *
     * <p> If the length of <code>b</code> is zero, then no bytes are read and
     * <code>0</code> is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at the
     * end of the file, the value <code>-1</code> is returned; otherwise, at
     * least one byte is read and stored into <code>b</code>.
     *
     * <p> The first byte read is stored into element <code>b[0]</code>, the
     * next one into <code>b[1]</code>, and so on. The number of bytes read is,
     * at most, equal to the length of <code>b</code>. Let <i>k</i> be the
     * number of bytes actually read; these bytes will be stored in elements
     * <code>b[0]</code> through <code>b[</code><i>k</i><code>-1]</code>,
     * leaving elements <code>b[</code><i>k</i><code>]</code> through
     * <code>b[b.length-1]</code> unaffected.
     *
     * <p> The <code>read(b)</code> method for class <code>InputStream</code>
     * has the same effect as: <pre><code> read(b, 0, b.length) </code></pre>
     *
     * @param      b   the buffer into which the data is read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException  If the first byte cannot be read for any reason
     * other than the end of the file, if the input stream has been closed, or
     * if some other I/O error occurs.
     * @exception  NullPointerException  if <code>b</code> is <code>null</code>.
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
    public abstract int read() throws IOException;

    /**
     * Reads the next byte of data from the input stream. The value byte is
     * returned as an <code>int</code> in the range <code>0</code> to
     * <code>255</code>. If no byte is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned. This method
     * blocks until input data is available, the end of the stream is detected,
     * or an exception is thrown.
     *
     * <p> A subclass must provide an implementation of this method.
     *
     * @return     the next byte of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/InputStream.java
public abstract class InputStream implements Closeable {

/**
 * This abstract class is the superclass of all classes representing
 * an input stream of bytes.
 *
 * <p> Applications that need to define a subclass of <code>InputStream</code>
 * must always provide a method that returns the next byte of input.
 *
 * @author  Arthur van Hoff
 * @see     java.io.BufferedInputStream
 * @see     java.io.ByteArrayInputStream
 * @see     java.io.DataInputStream
 * @see     java.io.FilterInputStream
 * @see     java.io.InputStream#read()
 * @see     java.io.OutputStream
 * @see     java.io.PushbackInputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public org.omg.CORBA.ORB orb() {

    /**
     * Returns the ORB that created this InputStream.
     *
     * @return the <code>ORB</code> object that created this stream
     *
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public  org.omg.CORBA.Object read_Object(java.lang.Class
                                             clz) {

    /**
     * Unmarshals an object and returns a CORBA Object,
     * which is an instance of the class passed as its argument.
     * This class is the stub class of the expected type.
     *
     * @param clz  The Class object for the stub class which
     * corresponds to the type that is statistically expected, or
     * the Class object for the RMI/IDL interface type that
     * is statistically expected.
     * @return an Object instance of clz read from this stream
     *
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public org.omg.CORBA.Context read_Context() {

    /**
     * Reads a CORBA context from the stream.
     * @return a CORBA context
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public java.math.BigDecimal read_fixed() {

    /**
     * Reads a BigDecimal number.
     * @return a java.math.BigDecimal number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public int read() throws java.io.IOException {

    /**
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    @Deprecated

    /**
     * Returns principal for invocation.
     * @return Principal for invocation.
     * @deprecated Deprecated by CORBA 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract Any         read_any();

    /**
     * Reads an Any from this input stream.
     *
     * @return the <code>Any</code> instance read from this input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract org.omg.CORBA.Object read_Object();

    /**
     * Reads a CORBA object from this input stream.
     *
     * @return the <code>Object</code> instance read from this input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_float_array(float[] value, int offset, int
length);

    /**
     * Reads an array of floats from this input stream.
     * @param value returned array of floats.
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_longlong_array(long[] value, int offset, int
length);

    /**
     * Reads an array of CORBA longlongs (that is, Java longs) from this input
stream.
     * @param value returned array of CORBA longs (that is, Java longs).
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_long_array(int[] value, int offset, int
length);

    /**
     * Reads an array of CORBA longs (that is, Java ints) from this input stream.
     * @param value returned array of CORBA longs (that is, Java ints).
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_short_array(short[] value, int offset, int
length);

    /**
     * Reads an array of shorts from this input stream.
     * @param value returned array of shorts.
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_wchar_array(char[] value, int offset, int
length);

    /**
     * Reads an array of wide chars from this input stream.
     * @param value returned array of wide chars.
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract void        read_boolean_array(boolean[] value, int offset, int
length);

    /**
     * Reads an array of booleans from this input stream.
     * @param value returned array of booleans.
     * @param offset offset on the stream.
     * @param length length of buffer to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract String      read_string();

    /**
     * Reads a string value from this input stream.
     *
     * @return the <code>String</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract float       read_float();

    /**
     * Reads a float value from this input stream.
     *
     * @return the <code>float</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract long        read_longlong();

    /**
     * Reads a CORBA longlong (that is, Java long) value from this input stream.
     *
     * @return the <code>long</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract int         read_long();

    /**
     * Reads a CORBA long (that is, Java int) value from this input stream.
     *
     * @return the <code>int</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract short       read_short();

    /**
     * Reads a short value from this input stream.
     *
     * @return the <code>short</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract char        read_wchar();

    /**
     * Reads a wide char value from this input stream.
     *
     * @return the <code>char</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
    public abstract boolean     read_boolean();

    /**
     * Reads a boolean value from this input stream.
     *
     * @return the <code>boolean</code> value read from this input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/InputStream.java
public abstract class InputStream extends java.io.InputStream

/**
 * InputStream is the Java API for reading IDL types
 * from CDR marshal streams. These methods are used by the ORB to
 * unmarshal IDL types as well as to extract IDL types out of Anys.
 * The <code>_array</code> versions of the methods can be directly
 * used to read sequences and arrays of IDL types.
 *
 * @since   JDK1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.lang.Object read_abstract_interface(java.lang.Class clz) {

    /**
     * Unmarshal the class object or the stub class corresponding to the passed type.
     * @param clz is the Class object for the stub class which corresponds to
     * the type that is statically expected.
     * @return ORB runtime returns the value object or a suitable stub object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.lang.Object read_abstract_interface() {

    /**
     * Unmarshal the value object or a suitable stub object.
     * @return ORB runtime returns the value object or a suitable stub object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.io.Serializable read_value(java.io.Serializable value) {

    /**
     * Unmarshalls a value type from the input stream.
     * @param value is an uninitialized value which is added to the orb's
     * indirection table before calling Streamable._read() or
     * CustomMarshal.unmarshal() to unmarshal the value.
     * @return value type unmarshalled from the input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.io.Serializable read_value(java.lang.String rep_id) {

    /**
     * Unmarshalls a value type from the input stream.
     * @param rep_id identifies the type of the value to be unmarshalled
     * @return value type unmarshalled from the input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.io.Serializable read_value(org.omg.CORBA.portable.BoxedValueHelper factory) {

    /**
     * Unmarshalls a value type from the input stream.
     * @param factory is the instance fo the helper to be used for
     * unmarshalling the value type
     * @return the value unmarshalled from the input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.io.Serializable read_value(java.lang.Class clz) {

    /**
     * Unmarshalls a value type from the input stream.
     * @param clz is the declared type of the value to be unmarshalled
     * @return the value unmarshalled from the input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public java.io.Serializable read_value() {

    /**
     * Unmarshalls a value type from the input stream.
     * @return the value type unmarshalled from the input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
    public InputStream() {

    /**
     * Create a new instance of this class.
     *
     * throw SecurityException if SecurityManager is installed and
     * enableSubclassImplementation SerializablePermission
     * is not granted or jdk.corba.allowInputStreamSubclass system
     * property is either not set or is set to 'false'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/InputStream.java
public abstract class InputStream extends org.omg.CORBA.portable.InputStream {

/**
 * InputStream provides for the reading of all of the mapped IDL types
 * from the stream. It extends org.omg.CORBA.portable.InputStream.  This
 * class defines new methods that were added for CORBA 2.3.
 *
 * @see org.omg.CORBA.portable.InputStream
 * @author  OMG
 * @since   JDK1.2
 */
