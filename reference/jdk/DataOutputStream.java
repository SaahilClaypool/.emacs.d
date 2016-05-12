_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final int size() {

    /**
     * Returns the current value of the counter <code>written</code>,
     * the number of bytes written to this data output stream so far.
     * If the counter overflows, it will be wrapped to Integer.MAX_VALUE.
     *
     * @return  the value of the <code>written</code> field.
     * @see     java.io.DataOutputStream#written
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    static int writeUTF(String str, DataOutput out) throws IOException {

    /**
     * Writes a string to the specified DataOutput using
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * encoding in a machine-independent manner.
     * <p>
     * First, two bytes are written to out as if by the <code>writeShort</code>
     * method giving the number of bytes to follow. This value is the number of
     * bytes actually written out, not the length of the string. Following the
     * length, each character of the string is output, in sequence, using the
     * modified UTF-8 encoding for the character. If no exception is thrown, the
     * counter <code>written</code> is incremented by the total number of
     * bytes written to the output stream. This will be at least two
     * plus the length of <code>str</code>, and at most two plus
     * thrice the length of <code>str</code>.
     *
     * @param      str   a string to be written.
     * @param      out   destination to write to
     * @return     The number of bytes written out.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeUTF(String str) throws IOException {

    /**
     * Writes a string to the underlying output stream using
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * encoding in a machine-independent manner.
     * <p>
     * First, two bytes are written to the output stream as if by the
     * <code>writeShort</code> method giving the number of bytes to
     * follow. This value is the number of bytes actually written out,
     * not the length of the string. Following the length, each character
     * of the string is output, in sequence, using the modified UTF-8 encoding
     * for the character. If no exception is thrown, the counter
     * <code>written</code> is incremented by the total number of
     * bytes written to the output stream. This will be at least two
     * plus the length of <code>str</code>, and at most two plus
     * thrice the length of <code>str</code>.
     *
     * @param      str   a string to be written.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeChars(String s) throws IOException {

    /**
     * Writes a string to the underlying output stream as a sequence of
     * characters. Each character is written to the data output stream as
     * if by the <code>writeChar</code> method. If no exception is
     * thrown, the counter <code>written</code> is incremented by twice
     * the length of <code>s</code>.
     *
     * @param      s   a <code>String</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.DataOutputStream#writeChar(int)
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeBytes(String s) throws IOException {

    /**
     * Writes out the string to the underlying output stream as a
     * sequence of bytes. Each character in the string is written out, in
     * sequence, by discarding its high eight bits. If no exception is
     * thrown, the counter <code>written</code> is incremented by the
     * length of <code>s</code>.
     *
     * @param      s   a string of bytes to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeDouble(double v) throws IOException {

    /**
     * Converts the double argument to a <code>long</code> using the
     * <code>doubleToLongBits</code> method in class <code>Double</code>,
     * and then writes that <code>long</code> value to the underlying
     * output stream as an 8-byte quantity, high byte first. If no
     * exception is thrown, the counter <code>written</code> is
     * incremented by <code>8</code>.
     *
     * @param      v   a <code>double</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.lang.Double#doubleToLongBits(double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeFloat(float v) throws IOException {

    /**
     * Converts the float argument to an <code>int</code> using the
     * <code>floatToIntBits</code> method in class <code>Float</code>,
     * and then writes that <code>int</code> value to the underlying
     * output stream as a 4-byte quantity, high byte first. If no
     * exception is thrown, the counter <code>written</code> is
     * incremented by <code>4</code>.
     *
     * @param      v   a <code>float</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.lang.Float#floatToIntBits(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeLong(long v) throws IOException {

    /**
     * Writes a <code>long</code> to the underlying output stream as eight
     * bytes, high byte first. In no exception is thrown, the counter
     * <code>written</code> is incremented by <code>8</code>.
     *
     * @param      v   a <code>long</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeInt(int v) throws IOException {

    /**
     * Writes an <code>int</code> to the underlying output stream as four
     * bytes, high byte first. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>4</code>.
     *
     * @param      v   an <code>int</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeChar(int v) throws IOException {

    /**
     * Writes a <code>char</code> to the underlying output stream as a
     * 2-byte value, high byte first. If no exception is thrown, the
     * counter <code>written</code> is incremented by <code>2</code>.
     *
     * @param      v   a <code>char</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeShort(int v) throws IOException {

    /**
     * Writes a <code>short</code> to the underlying output stream as two
     * bytes, high byte first. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>2</code>.
     *
     * @param      v   a <code>short</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeByte(int v) throws IOException {

    /**
     * Writes out a <code>byte</code> to the underlying output stream as
     * a 1-byte value. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>1</code>.
     *
     * @param      v   a <code>byte</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeBoolean(boolean v) throws IOException {

    /**
     * Writes a <code>boolean</code> to the underlying output stream as
     * a 1-byte value. The value <code>true</code> is written out as the
     * value <code>(byte)1</code>; the value <code>false</code> is
     * written out as the value <code>(byte)0</code>. If no exception is
     * thrown, the counter <code>written</code> is incremented by
     * <code>1</code>.
     *
     * @param      v   a <code>boolean</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public void flush() throws IOException {

    /**
     * Flushes this data output stream. This forces any buffered output
     * bytes to be written out to the stream.
     * <p>
     * The <code>flush</code> method of <code>DataOutputStream</code>
     * calls the <code>flush</code> method of its underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.io.OutputStream#flush()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public synchronized void write(byte b[], int off, int len)

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to the underlying output stream.
     * If no exception is thrown, the counter <code>written</code> is
     * incremented by <code>len</code>.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public synchronized void write(int b) throws IOException {

    /**
     * Writes the specified byte (the low eight bits of the argument
     * <code>b</code>) to the underlying output stream. If no exception
     * is thrown, the counter <code>written</code> is incremented by
     * <code>1</code>.
     * <p>
     * Implements the <code>write</code> method of <code>OutputStream</code>.
     *
     * @param      b   the <code>byte</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    private void incCount(int value) {

    /**
     * Increases the written counter by the specified value
     * until it reaches Integer.MAX_VALUE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public DataOutputStream(OutputStream out) {

    /**
     * Creates a new data output stream to write data to the specified
     * underlying output stream. The counter <code>written</code> is
     * set to zero.
     *
     * @param   out   the underlying output stream, to be saved for later
     *                use.
     * @see     java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    private byte[] bytearr = null;

    /**
     * bytearr is initialized on demand by writeUTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    protected int written;

    /**
     * The number of bytes written to the data output stream so far.
     * If this counter overflows, it will be wrapped to Integer.MAX_VALUE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
public

/**
 * A data output stream lets an application write primitive Java data
 * types to an output stream in a portable way. An application can
 * then use a data input stream to read the data back in.
 *
 * @author  unascribed
 * @see     java.io.DataInputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final int size() {

    /**
     * Returns the current value of the counter <code>written</code>,
     * the number of bytes written to this data output stream so far.
     * If the counter overflows, it will be wrapped to Integer.MAX_VALUE.
     *
     * @return  the value of the <code>written</code> field.
     * @see     java.io.DataOutputStream#written
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    static int writeUTF(String str, DataOutput out) throws IOException {

    /**
     * Writes a string to the specified DataOutput using
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * encoding in a machine-independent manner.
     * <p>
     * First, two bytes are written to out as if by the <code>writeShort</code>
     * method giving the number of bytes to follow. This value is the number of
     * bytes actually written out, not the length of the string. Following the
     * length, each character of the string is output, in sequence, using the
     * modified UTF-8 encoding for the character. If no exception is thrown, the
     * counter <code>written</code> is incremented by the total number of
     * bytes written to the output stream. This will be at least two
     * plus the length of <code>str</code>, and at most two plus
     * thrice the length of <code>str</code>.
     *
     * @param      str   a string to be written.
     * @param      out   destination to write to
     * @return     The number of bytes written out.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeUTF(String str) throws IOException {

    /**
     * Writes a string to the underlying output stream using
     * <a href="DataInput.html#modified-utf-8">modified UTF-8</a>
     * encoding in a machine-independent manner.
     * <p>
     * First, two bytes are written to the output stream as if by the
     * <code>writeShort</code> method giving the number of bytes to
     * follow. This value is the number of bytes actually written out,
     * not the length of the string. Following the length, each character
     * of the string is output, in sequence, using the modified UTF-8 encoding
     * for the character. If no exception is thrown, the counter
     * <code>written</code> is incremented by the total number of
     * bytes written to the output stream. This will be at least two
     * plus the length of <code>str</code>, and at most two plus
     * thrice the length of <code>str</code>.
     *
     * @param      str   a string to be written.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeChars(String s) throws IOException {

    /**
     * Writes a string to the underlying output stream as a sequence of
     * characters. Each character is written to the data output stream as
     * if by the <code>writeChar</code> method. If no exception is
     * thrown, the counter <code>written</code> is incremented by twice
     * the length of <code>s</code>.
     *
     * @param      s   a <code>String</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.DataOutputStream#writeChar(int)
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeBytes(String s) throws IOException {

    /**
     * Writes out the string to the underlying output stream as a
     * sequence of bytes. Each character in the string is written out, in
     * sequence, by discarding its high eight bits. If no exception is
     * thrown, the counter <code>written</code> is incremented by the
     * length of <code>s</code>.
     *
     * @param      s   a string of bytes to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeDouble(double v) throws IOException {

    /**
     * Converts the double argument to a <code>long</code> using the
     * <code>doubleToLongBits</code> method in class <code>Double</code>,
     * and then writes that <code>long</code> value to the underlying
     * output stream as an 8-byte quantity, high byte first. If no
     * exception is thrown, the counter <code>written</code> is
     * incremented by <code>8</code>.
     *
     * @param      v   a <code>double</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.lang.Double#doubleToLongBits(double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeFloat(float v) throws IOException {

    /**
     * Converts the float argument to an <code>int</code> using the
     * <code>floatToIntBits</code> method in class <code>Float</code>,
     * and then writes that <code>int</code> value to the underlying
     * output stream as a 4-byte quantity, high byte first. If no
     * exception is thrown, the counter <code>written</code> is
     * incremented by <code>4</code>.
     *
     * @param      v   a <code>float</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.lang.Float#floatToIntBits(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeLong(long v) throws IOException {

    /**
     * Writes a <code>long</code> to the underlying output stream as eight
     * bytes, high byte first. In no exception is thrown, the counter
     * <code>written</code> is incremented by <code>8</code>.
     *
     * @param      v   a <code>long</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeInt(int v) throws IOException {

    /**
     * Writes an <code>int</code> to the underlying output stream as four
     * bytes, high byte first. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>4</code>.
     *
     * @param      v   an <code>int</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeChar(int v) throws IOException {

    /**
     * Writes a <code>char</code> to the underlying output stream as a
     * 2-byte value, high byte first. If no exception is thrown, the
     * counter <code>written</code> is incremented by <code>2</code>.
     *
     * @param      v   a <code>char</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeShort(int v) throws IOException {

    /**
     * Writes a <code>short</code> to the underlying output stream as two
     * bytes, high byte first. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>2</code>.
     *
     * @param      v   a <code>short</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeByte(int v) throws IOException {

    /**
     * Writes out a <code>byte</code> to the underlying output stream as
     * a 1-byte value. If no exception is thrown, the counter
     * <code>written</code> is incremented by <code>1</code>.
     *
     * @param      v   a <code>byte</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public final void writeBoolean(boolean v) throws IOException {

    /**
     * Writes a <code>boolean</code> to the underlying output stream as
     * a 1-byte value. The value <code>true</code> is written out as the
     * value <code>(byte)1</code>; the value <code>false</code> is
     * written out as the value <code>(byte)0</code>. If no exception is
     * thrown, the counter <code>written</code> is incremented by
     * <code>1</code>.
     *
     * @param      v   a <code>boolean</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public void flush() throws IOException {

    /**
     * Flushes this data output stream. This forces any buffered output
     * bytes to be written out to the stream.
     * <p>
     * The <code>flush</code> method of <code>DataOutputStream</code>
     * calls the <code>flush</code> method of its underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     * @see        java.io.OutputStream#flush()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public synchronized void write(byte b[], int off, int len)

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to the underlying output stream.
     * If no exception is thrown, the counter <code>written</code> is
     * incremented by <code>len</code>.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public synchronized void write(int b) throws IOException {

    /**
     * Writes the specified byte (the low eight bits of the argument
     * <code>b</code>) to the underlying output stream. If no exception
     * is thrown, the counter <code>written</code> is incremented by
     * <code>1</code>.
     * <p>
     * Implements the <code>write</code> method of <code>OutputStream</code>.
     *
     * @param      b   the <code>byte</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    private void incCount(int value) {

    /**
     * Increases the written counter by the specified value
     * until it reaches Integer.MAX_VALUE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    public DataOutputStream(OutputStream out) {

    /**
     * Creates a new data output stream to write data to the specified
     * underlying output stream. The counter <code>written</code> is
     * set to zero.
     *
     * @param   out   the underlying output stream, to be saved for later
     *                use.
     * @see     java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    private byte[] bytearr = null;

    /**
     * bytearr is initialized on demand by writeUTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
    protected int written;

    /**
     * The number of bytes written to the data output stream so far.
     * If this counter overflows, it will be wrapped to Integer.MAX_VALUE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/DataOutputStream.java
public

/**
 * A data output stream lets an application write primitive Java data
 * types to an output stream in a portable way. An application can
 * then use a data input stream to read the data back in.
 *
 * @author  unascribed
 * @see     java.io.DataInputStream
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_double_array (double[] seq, int offset, int length);

    /**
    * Writes the array of IDL doubles from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_float_array (float[] seq, int offset, int length);

    /**
    * Writes the array of IDL floats from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_longlong_array (long[] seq, int offset, int length);

    /**
    * Writes the array of IDL long longs from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ulonglong_array (long[] seq, int offset, int length);

    /**
    * Writes the array of IDL unsigned long longs (represented as Java longs)
    * from offset for length elements to the output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ulong_array (int[] seq, int offset, int length);

    /**
    * Writes the array of IDL unsigned longs (represented as Java ints)
    * from offset for length elements to the output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_long_array (int[] seq, int offset, int length);

    /**
    * Writes the array of IDL longs from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ushort_array (short[] seq, int offset, int length);

    /**
    * Writes the array of IDL unsigned shorts (represented as Java shorts)
    * from offset for length elements to the output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_short_array (short[] seq, int offset, int length);

    /**
    * Writes the array of IDL shorts from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_octet_array (byte[] seq, int offset, int length);

    /**
    * Writes the array of IDL octets from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_wchar_array (char[] seq, int offset, int length);

    /**
    * Writes the array of IDL wide characters from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_char_array (char[] seq, int offset, int length);

    /**
    * Writes the array of IDL characters from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_boolean_array (boolean[] seq, int offset, int length);

    /**
    * Writes the array of IDL booleans from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_any_array (org.omg.CORBA.Any[] seq, int offset, int length);

    /**
    * Writes the array of IDL Anys from offset for length elements to the
    * output stream.
    * @param seq The array to be written.
    * @param offset The index into seq of the first element to write to the
    * output stream.
    * @param length The number of elements to write to the output stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_TypeCode (org.omg.CORBA.TypeCode value);

    /**
    * Writes the typecode to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_Value (java.io.Serializable value);

    /**
    * Writes the IDL value type value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_Abstract (java.lang.Object value);

    /**
    * Writes the IDL Abstract interface type to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_Object (org.omg.CORBA.Object value);

    /**
    * Writes the IDL CORBA::Object value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_wstring (String value);

    /**
    * Writes the IDL wide string value (represented as a Java String) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_string (String value);

    /**
    * Writes the IDL string value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_double (double value);

    /**
    * Writes the IDL double value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_float (float value);

    /**
    * Writes the IDL float value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ulonglong (long value);

    /**
    * Writes the IDL unsigned long long value (represented as a Java long)
    * to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_longlong (long value);

    /**
    * Writes the IDL long long value (represented as a Java long) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ulong (int value);

    /**
    * Writes the IDL unsigned long value (represented as a Java int) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_long (int value);

    /**
    * Writes the IDL long value (represented as a Java int) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_ushort (short value);

    /**
    * Writes the IDL unsigned short value (represented as a Java short
    * value) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_short (short value);

    /**
    * Writes the IDL short value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_octet (byte value);

    /**
    * Writes the IDL octet value (represented as a Java byte) to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_wchar (char value);

    /**
    * Writes the IDL wide character value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_char (char value);

    /**
    * Writes the IDL character value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_boolean (boolean value);

    /**
    * Writes the boolean value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
    void write_any (org.omg.CORBA.Any value);

    /**
    * Writes the Any value to the output stream.
    * @param value The value to be written.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DataOutputStream.java
public interface DataOutputStream extends org.omg.CORBA.portable.ValueBase

/** Defines the methods used to write primitive data types to output streams
* for marshalling custom value types.  This interface is used by user
* written custom marshalling code for custom value types.
* @see org.omg.CORBA.DataInputStream
* @see org.omg.CORBA.CustomMarshal
*/
