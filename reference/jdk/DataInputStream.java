_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final static String readUTF(DataInput in) throws IOException {

    /**
     * Reads from the
     * stream <code>in</code> a representation
     * of a Unicode  character string encoded in
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a> format;
     * this string of characters is then returned as a <code>String</code>.
     * The details of the modified UTF-8 representation
     * are  exactly the same as for the <code>readUTF</code>
     * method of <code>DataInput</code>.
     *
     * @param      in   a data input stream.
     * @return     a Unicode string.
     * @exception  EOFException            if the input stream reaches the end
     *               before all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @exception  UTFDataFormatException  if the bytes do not represent a
     *               valid modified UTF-8 encoding of a Unicode string.
     * @see        java.io.DataInputStream#readUnsignedShort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final String readUTF() throws IOException {

    /**
     * See the general contract of the <code>readUTF</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     a Unicode string.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @exception  UTFDataFormatException if the bytes do not represent a valid
     *             modified UTF-8 encoding of a string.
     * @see        java.io.DataInputStream#readUTF(java.io.DataInput)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    @Deprecated

    /**
     * See the general contract of the <code>readLine</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @deprecated This method does not properly convert bytes to characters.
     * As of JDK&nbsp;1.1, the preferred way to read lines of text is via the
     * <code>BufferedReader.readLine()</code> method.  Programs that use the
     * <code>DataInputStream</code> class to read lines can be converted to use
     * the <code>BufferedReader</code> class by replacing code of the form:
     * <blockquote><pre>
     *     DataInputStream d =&nbsp;new&nbsp;DataInputStream(in);
     * </pre></blockquote>
     * with:
     * <blockquote><pre>
     *     BufferedReader d
     *          =&nbsp;new&nbsp;BufferedReader(new&nbsp;InputStreamReader(in));
     * </pre></blockquote>
     *
     * @return     the next line of text from this input stream.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.BufferedReader#readLine()
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final double readDouble() throws IOException {

    /**
     * See the general contract of the <code>readDouble</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             <code>double</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readLong()
     * @see        java.lang.Double#longBitsToDouble(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final float readFloat() throws IOException {

    /**
     * See the general contract of the <code>readFloat</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as a
     *             <code>float</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readInt()
     * @see        java.lang.Float#intBitsToFloat(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final long readLong() throws IOException {

    /**
     * See the general contract of the <code>readLong</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readInt() throws IOException {

    /**
     * See the general contract of the <code>readInt</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as an
     *             <code>int</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final char readChar() throws IOException {

    /**
     * See the general contract of the <code>readChar</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             <code>char</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readUnsignedShort() throws IOException {

    /**
     * See the general contract of the <code>readUnsignedShort</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as an
     *             unsigned 16-bit integer.
     * @exception  EOFException  if this input stream reaches the end before
     *             reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final short readShort() throws IOException {

    /**
     * See the general contract of the <code>readShort</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             signed 16-bit number.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readUnsignedByte() throws IOException {

    /**
     * See the general contract of the <code>readUnsignedByte</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream, interpreted as an
     *             unsigned 8-bit number.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see         java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final byte readByte() throws IOException {

    /**
     * See the general contract of the <code>readByte</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream as a signed 8-bit
     *             <code>byte</code>.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final boolean readBoolean() throws IOException {

    /**
     * See the general contract of the <code>readBoolean</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @return     the <code>boolean</code> value read.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int skipBytes(int n) throws IOException {

    /**
     * See the general contract of the <code>skipBytes</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @exception  IOException  if the contained input stream does not support
     *             seek, or the stream has been closed and
     *             the contained input stream does not support
     *             reading after close, or another I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final void readFully(byte b[], int off, int len) throws IOException {

    /**
     * See the general contract of the <code>readFully</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset of the data.
     * @param      len   the number of bytes to read.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final void readFully(byte b[]) throws IOException {

    /**
     * See the general contract of the <code>readFully</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param      b   the buffer into which the data is read.
     * @exception  EOFException  if this input stream reaches the end before
     *             reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int read(byte b[], int off, int len) throws IOException {

    /**
     * Reads up to <code>len</code> bytes of data from the contained
     * input stream into an array of bytes.  An attempt is made to read
     * as many as <code>len</code> bytes, but a smaller number may be read,
     * possibly zero. The number of bytes actually read is returned as an
     * integer.
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
     * @param      b     the buffer into which the data is read.
     * @param off the start offset in the destination array <code>b</code>
     * @param      len   the maximum number of bytes read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end
     *             of the stream has been reached.
     * @exception  NullPointerException If <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @exception  IOException if the first byte cannot be read for any reason
     * other than end of file, the stream has been closed and the underlying
     * input stream does not support reading after close, or another I/O
     * error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int read(byte b[]) throws IOException {

    /**
     * Reads some number of bytes from the contained input stream and
     * stores them into the buffer array <code>b</code>. The number of
     * bytes actually read is returned as an integer. This method blocks
     * until input data is available, end of file is detected, or an
     * exception is thrown.
     *
     * <p>If <code>b</code> is null, a <code>NullPointerException</code> is
     * thrown. If the length of <code>b</code> is zero, then no bytes are
     * read and <code>0</code> is returned; otherwise, there is an attempt
     * to read at least one byte. If no byte is available because the
     * stream is at end of file, the value <code>-1</code> is returned;
     * otherwise, at least one byte is read and stored into <code>b</code>.
     *
     * <p>The first byte read is stored into element <code>b[0]</code>, the
     * next one into <code>b[1]</code>, and so on. The number of bytes read
     * is, at most, equal to the length of <code>b</code>. Let <code>k</code>
     * be the number of bytes actually read; these bytes will be stored in
     * elements <code>b[0]</code> through <code>b[k-1]</code>, leaving
     * elements <code>b[k]</code> through <code>b[b.length-1]</code>
     * unaffected.
     *
     * <p>The <code>read(b)</code> method has the same effect as:
     * <blockquote><pre>
     * read(b, 0, b.length)
     * </pre></blockquote>
     *
     * @param      b   the buffer into which the data is read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end
     *             of the stream has been reached.
     * @exception  IOException if the first byte cannot be read for any reason
     * other than end of file, the stream has been closed and the underlying
     * input stream does not support reading after close, or another I/O
     * error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    private byte bytearr[] = new byte[80];

    /**
     * working arrays initialized on demand by readUTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public DataInputStream(InputStream in) {

    /**
     * Creates a DataInputStream that uses the specified
     * underlying InputStream.
     *
     * @param  in   the specified input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
public

/**
 * A data input stream lets an application read primitive Java data
 * types from an underlying input stream in a machine-independent
 * way. An application uses a data output stream to write data that
 * can later be read by a data input stream.
 * <p>
 * DataInputStream is not necessarily safe for multithreaded access.
 * Thread safety is optional and is the responsibility of users of
 * methods in this class.
 *
 * @author  Arthur van Hoff
 * @see     java.io.DataOutputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final static String readUTF(DataInput in) throws IOException {

    /**
     * Reads from the
     * stream <code>in</code> a representation
     * of a Unicode  character string encoded in
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a> format;
     * this string of characters is then returned as a <code>String</code>.
     * The details of the modified UTF-8 representation
     * are  exactly the same as for the <code>readUTF</code>
     * method of <code>DataInput</code>.
     *
     * @param      in   a data input stream.
     * @return     a Unicode string.
     * @exception  EOFException            if the input stream reaches the end
     *               before all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @exception  UTFDataFormatException  if the bytes do not represent a
     *               valid modified UTF-8 encoding of a Unicode string.
     * @see        java.io.DataInputStream#readUnsignedShort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final String readUTF() throws IOException {

    /**
     * See the general contract of the <code>readUTF</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     a Unicode string.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @exception  UTFDataFormatException if the bytes do not represent a valid
     *             modified UTF-8 encoding of a string.
     * @see        java.io.DataInputStream#readUTF(java.io.DataInput)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    @Deprecated

    /**
     * See the general contract of the <code>readLine</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @deprecated This method does not properly convert bytes to characters.
     * As of JDK&nbsp;1.1, the preferred way to read lines of text is via the
     * <code>BufferedReader.readLine()</code> method.  Programs that use the
     * <code>DataInputStream</code> class to read lines can be converted to use
     * the <code>BufferedReader</code> class by replacing code of the form:
     * <blockquote><pre>
     *     DataInputStream d =&nbsp;new&nbsp;DataInputStream(in);
     * </pre></blockquote>
     * with:
     * <blockquote><pre>
     *     BufferedReader d
     *          =&nbsp;new&nbsp;BufferedReader(new&nbsp;InputStreamReader(in));
     * </pre></blockquote>
     *
     * @return     the next line of text from this input stream.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.BufferedReader#readLine()
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final double readDouble() throws IOException {

    /**
     * See the general contract of the <code>readDouble</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             <code>double</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readLong()
     * @see        java.lang.Double#longBitsToDouble(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final float readFloat() throws IOException {

    /**
     * See the general contract of the <code>readFloat</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as a
     *             <code>float</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.DataInputStream#readInt()
     * @see        java.lang.Float#intBitsToFloat(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final long readLong() throws IOException {

    /**
     * See the general contract of the <code>readLong</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next eight bytes of this input stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading eight bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readInt() throws IOException {

    /**
     * See the general contract of the <code>readInt</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next four bytes of this input stream, interpreted as an
     *             <code>int</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading four bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final char readChar() throws IOException {

    /**
     * See the general contract of the <code>readChar</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             <code>char</code>.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readUnsignedShort() throws IOException {

    /**
     * See the general contract of the <code>readUnsignedShort</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as an
     *             unsigned 16-bit integer.
     * @exception  EOFException  if this input stream reaches the end before
     *             reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final short readShort() throws IOException {

    /**
     * See the general contract of the <code>readShort</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next two bytes of this input stream, interpreted as a
     *             signed 16-bit number.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading two bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int readUnsignedByte() throws IOException {

    /**
     * See the general contract of the <code>readUnsignedByte</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream, interpreted as an
     *             unsigned 8-bit number.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see         java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final byte readByte() throws IOException {

    /**
     * See the general contract of the <code>readByte</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @return     the next byte of this input stream as a signed 8-bit
     *             <code>byte</code>.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final boolean readBoolean() throws IOException {

    /**
     * See the general contract of the <code>readBoolean</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @return     the <code>boolean</code> value read.
     * @exception  EOFException  if this input stream has reached the end.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int skipBytes(int n) throws IOException {

    /**
     * See the general contract of the <code>skipBytes</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes for this operation are read from the contained
     * input stream.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @exception  IOException  if the contained input stream does not support
     *             seek, or the stream has been closed and
     *             the contained input stream does not support
     *             reading after close, or another I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final void readFully(byte b[], int off, int len) throws IOException {

    /**
     * See the general contract of the <code>readFully</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset of the data.
     * @param      len   the number of bytes to read.
     * @exception  EOFException  if this input stream reaches the end before
     *               reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final void readFully(byte b[]) throws IOException {

    /**
     * See the general contract of the <code>readFully</code>
     * method of <code>DataInput</code>.
     * <p>
     * Bytes
     * for this operation are read from the contained
     * input stream.
     *
     * @param      b   the buffer into which the data is read.
     * @exception  EOFException  if this input stream reaches the end before
     *             reading all the bytes.
     * @exception  IOException   the stream has been closed and the contained
     *             input stream does not support reading after close, or
     *             another I/O error occurs.
     * @see        java.io.FilterInputStream#in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int read(byte b[], int off, int len) throws IOException {

    /**
     * Reads up to <code>len</code> bytes of data from the contained
     * input stream into an array of bytes.  An attempt is made to read
     * as many as <code>len</code> bytes, but a smaller number may be read,
     * possibly zero. The number of bytes actually read is returned as an
     * integer.
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
     * @param      b     the buffer into which the data is read.
     * @param off the start offset in the destination array <code>b</code>
     * @param      len   the maximum number of bytes read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end
     *             of the stream has been reached.
     * @exception  NullPointerException If <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @exception  IOException if the first byte cannot be read for any reason
     * other than end of file, the stream has been closed and the underlying
     * input stream does not support reading after close, or another I/O
     * error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public final int read(byte b[]) throws IOException {

    /**
     * Reads some number of bytes from the contained input stream and
     * stores them into the buffer array <code>b</code>. The number of
     * bytes actually read is returned as an integer. This method blocks
     * until input data is available, end of file is detected, or an
     * exception is thrown.
     *
     * <p>If <code>b</code> is null, a <code>NullPointerException</code> is
     * thrown. If the length of <code>b</code> is zero, then no bytes are
     * read and <code>0</code> is returned; otherwise, there is an attempt
     * to read at least one byte. If no byte is available because the
     * stream is at end of file, the value <code>-1</code> is returned;
     * otherwise, at least one byte is read and stored into <code>b</code>.
     *
     * <p>The first byte read is stored into element <code>b[0]</code>, the
     * next one into <code>b[1]</code>, and so on. The number of bytes read
     * is, at most, equal to the length of <code>b</code>. Let <code>k</code>
     * be the number of bytes actually read; these bytes will be stored in
     * elements <code>b[0]</code> through <code>b[k-1]</code>, leaving
     * elements <code>b[k]</code> through <code>b[b.length-1]</code>
     * unaffected.
     *
     * <p>The <code>read(b)</code> method has the same effect as:
     * <blockquote><pre>
     * read(b, 0, b.length)
     * </pre></blockquote>
     *
     * @param      b   the buffer into which the data is read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end
     *             of the stream has been reached.
     * @exception  IOException if the first byte cannot be read for any reason
     * other than end of file, the stream has been closed and the underlying
     * input stream does not support reading after close, or another I/O
     * error occurs.
     * @see        java.io.FilterInputStream#in
     * @see        java.io.InputStream#read(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    private byte bytearr[] = new byte[80];

    /**
     * working arrays initialized on demand by readUTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
    public DataInputStream(InputStream in) {

    /**
     * Creates a DataInputStream that uses the specified
     * underlying InputStream.
     *
     * @param  in   the specified input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataInputStream.java
public

/**
 * A data input stream lets an application read primitive Java data
 * types from an underlying input stream in a machine-independent
 * way. An application uses a data output stream to write data that
 * can later be read by a data input stream.
 * <p>
 * DataInputStream is not necessarily safe for multithreaded access.
 * Thread safety is optional and is the responsibility of users of
 * methods in this class.
 *
 * @author  Arthur van Hoff
 * @see     java.io.DataOutputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_double_array (org.omg.CORBA.DoubleSeqHolder seq, int offset, int length);

    /** Reads array of IDL doubles from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_float_array (org.omg.CORBA.FloatSeqHolder seq, int offset, int length);

    /** Reads array of IDL floats from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_longlong_array (org.omg.CORBA.LongLongSeqHolder seq, int offset, int length);

    /** Reads array of IDL long longs from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_ulonglong_array (org.omg.CORBA.ULongLongSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned long longs from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_ulong_array (org.omg.CORBA.ULongSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned longs from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_long_array (org.omg.CORBA.LongSeqHolder seq, int offset, int length);

    /** Reads array of IDL longs from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_ushort_array (org.omg.CORBA.UShortSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned shorts from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_short_array (org.omg.CORBA.ShortSeqHolder seq, int offset, int length);

    /** Reads array of IDL shorts from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_octet_array (org.omg.CORBA.OctetSeqHolder seq, int offset, int length);

    /** Reads array of IDL octets from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_wchar_array (org.omg.CORBA.WCharSeqHolder seq, int offset, int length);

    /** Reads array of IDL wide characters from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_char_array (org.omg.CORBA.CharSeqHolder seq, int offset, int length);

    /** Reads array of IDL characters from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_boolean_array (org.omg.CORBA.BooleanSeqHolder seq, int offset, int length);

    /** Reads array of IDL booleans from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    void read_any_array (org.omg.CORBA.AnySeqHolder seq, int offset, int length);

    /** Reads array of IDL Anys from offset for length elements from the
    * input stream.
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    org.omg.CORBA.TypeCode read_TypeCode ();

    /** Reads an IDL typecode from the input stream.
    * @return  the typecode read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    java.io.Serializable read_Value ();

    /** Reads an IDL value type from the input stream.
    * @return  the value type read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    java.lang.Object read_Abstract ();

    /** Reads an IDL Abstract interface from the input stream.
    * @return  the Abstract interface read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    org.omg.CORBA.Object read_Object ();

    /** Reads an IDL CORBA::Object from the input stream.
    * @return  the CORBA::Object read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    String read_wstring ();

    /** Reads an IDL wide string from the input stream.
    * @return  the wide string read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    String read_string ();

    /** Reads an IDL string from the input stream.
    * @return  the string read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    double read_double ();

    /** Reads an IDL double from the input stream.
    * @return  the double read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    float read_float ();

    /** Reads an IDL float from the input stream.
    * @return  the float read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    long read_ulonglong ();

    /** Reads an unsigned IDL long long from the input stream.
    * @return  the unsigned long long read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    long read_longlong ();

    /** Reads an IDL long long from the input stream.
    * @return  the long long read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    int read_ulong ();

    /** Reads an IDL unsigned long from the input stream.
    * @return  the unsigned long read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    int read_long ();

    /** Reads an IDL long from the input stream.
    * @return  the long read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    short read_ushort ();

    /** Reads an IDL unsigned short from the input stream.
    * @return  the unsigned short read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    short read_short ();

    /** Reads an IDL short from the input stream.
    * @return  the short read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    byte read_octet ();

    /** Reads an IDL octet value from the input stream.
    * @return  the octet value read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    char read_wchar ();

    /** Reads an IDL wide character value from the input stream.
    * @return  the wide character read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    char read_char ();

    /** Reads an IDL character value from the input stream.
    * @return  the character read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    boolean read_boolean ();

    /** Reads an IDL boolean value from the input stream.
    * @return  the boolean read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
    org.omg.CORBA.Any read_any ();

    /** Reads an IDL <code>Any</code> value from the input stream.
    * @return  the <code>Any</code> read.
    * @throws <code>org.omg.CORBA.MARSHAL</code>
    * If an inconsistency is detected, including not having registered
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataInputStream.java
public interface DataInputStream extends org.omg.CORBA.portable.ValueBase

/** Defines the methods used to read primitive data types from input streams
* for unmarshaling custom value types.  This interface is used by user
* written custom unmarshaling code for custom value types.
* @see org.omg.CORBA.DataOutputStream
* @see org.omg.CORBA.CustomMarshal
*/
