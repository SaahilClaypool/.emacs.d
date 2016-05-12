_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void close() throws IOException {

    /**
     * Closes this output stream and releases any system resources
     * associated with this stream. The general contract of <code>close</code>
     * is that it closes the output stream. A closed stream cannot perform
     * output operations and cannot be reopened.
     * <p>
     * The <code>close</code> method of <code>OutputStream</code> does nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void flush() throws IOException {

    /**
     * Flushes this output stream and forces any buffered output bytes
     * to be written out. The general contract of <code>flush</code> is
     * that calling it is an indication that, if any bytes previously
     * written have been buffered by the implementation of the output
     * stream, such bytes should immediately be written to their
     * intended destination.
     * <p>
     * If the intended destination of this stream is an abstraction provided by
     * the underlying operating system, for example a file, then flushing the
     * stream guarantees only that bytes previously written to the stream are
     * passed to the operating system for writing; it does not guarantee that
     * they are actually written to a physical device such as a disk drive.
     * <p>
     * The <code>flush</code> method of <code>OutputStream</code> does nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void write(byte b[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to this output stream.
     * The general contract for <code>write(b, off, len)</code> is that
     * some of the bytes in the array <code>b</code> are written to the
     * output stream in order; element <code>b[off]</code> is the first
     * byte written and <code>b[off+len-1]</code> is the last byte written
     * by this operation.
     * <p>
     * The <code>write</code> method of <code>OutputStream</code> calls
     * the write method of one argument on each of the bytes to be
     * written out. Subclasses are encouraged to override this method and
     * provide a more efficient implementation.
     * <p>
     * If <code>b</code> is <code>null</code>, a
     * <code>NullPointerException</code> is thrown.
     * <p>
     * If <code>off</code> is negative, or <code>len</code> is negative, or
     * <code>off+len</code> is greater than the length of the array
     * <code>b</code>, then an <tt>IndexOutOfBoundsException</tt> is thrown.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs. In particular,
     *             an <code>IOException</code> is thrown if the output
     *             stream is closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void write(byte b[]) throws IOException {

    /**
     * Writes <code>b.length</code> bytes from the specified byte array
     * to this output stream. The general contract for <code>write(b)</code>
     * is that it should have exactly the same effect as the call
     * <code>write(b, 0, b.length)</code>.
     *
     * @param      b   the data.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.OutputStream#write(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
public abstract class OutputStream implements Closeable, Flushable {

/**
 * This abstract class is the superclass of all classes representing
 * an output stream of bytes. An output stream accepts output bytes
 * and sends them to some sink.
 * <p>
 * Applications that need to define a subclass of
 * <code>OutputStream</code> must always provide at least a method
 * that writes one byte of output.
 *
 * @author  Arthur van Hoff
 * @see     java.io.BufferedOutputStream
 * @see     java.io.ByteArrayOutputStream
 * @see     java.io.DataOutputStream
 * @see     java.io.FilterOutputStream
 * @see     java.io.InputStream
 * @see     java.io.OutputStream#write(int)
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void close() throws IOException {

    /**
     * Closes this output stream and releases any system resources
     * associated with this stream. The general contract of <code>close</code>
     * is that it closes the output stream. A closed stream cannot perform
     * output operations and cannot be reopened.
     * <p>
     * The <code>close</code> method of <code>OutputStream</code> does nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void flush() throws IOException {

    /**
     * Flushes this output stream and forces any buffered output bytes
     * to be written out. The general contract of <code>flush</code> is
     * that calling it is an indication that, if any bytes previously
     * written have been buffered by the implementation of the output
     * stream, such bytes should immediately be written to their
     * intended destination.
     * <p>
     * If the intended destination of this stream is an abstraction provided by
     * the underlying operating system, for example a file, then flushing the
     * stream guarantees only that bytes previously written to the stream are
     * passed to the operating system for writing; it does not guarantee that
     * they are actually written to a physical device such as a disk drive.
     * <p>
     * The <code>flush</code> method of <code>OutputStream</code> does nothing.
     *
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void write(byte b[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to this output stream.
     * The general contract for <code>write(b, off, len)</code> is that
     * some of the bytes in the array <code>b</code> are written to the
     * output stream in order; element <code>b[off]</code> is the first
     * byte written and <code>b[off+len-1]</code> is the last byte written
     * by this operation.
     * <p>
     * The <code>write</code> method of <code>OutputStream</code> calls
     * the write method of one argument on each of the bytes to be
     * written out. Subclasses are encouraged to override this method and
     * provide a more efficient implementation.
     * <p>
     * If <code>b</code> is <code>null</code>, a
     * <code>NullPointerException</code> is thrown.
     * <p>
     * If <code>off</code> is negative, or <code>len</code> is negative, or
     * <code>off+len</code> is greater than the length of the array
     * <code>b</code>, then an <tt>IndexOutOfBoundsException</tt> is thrown.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs. In particular,
     *             an <code>IOException</code> is thrown if the output
     *             stream is closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
    public void write(byte b[]) throws IOException {

    /**
     * Writes <code>b.length</code> bytes from the specified byte array
     * to this output stream. The general contract for <code>write(b)</code>
     * is that it should have exactly the same effect as the call
     * <code>write(b, 0, b.length)</code>.
     *
     * @param      b   the data.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.OutputStream#write(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OutputStream.java
public abstract class OutputStream implements Closeable, Flushable {

/**
 * This abstract class is the superclass of all classes representing
 * an output stream of bytes. An output stream accepts output bytes
 * and sends them to some sink.
 * <p>
 * Applications that need to define a subclass of
 * <code>OutputStream</code> must always provide at least a method
 * that writes one byte of output.
 *
 * @author  Arthur van Hoff
 * @see     java.io.BufferedOutputStream
 * @see     java.io.ByteArrayOutputStream
 * @see     java.io.DataOutputStream
 * @see     java.io.FilterOutputStream
 * @see     java.io.InputStream
 * @see     java.io.OutputStream#write(int)
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public org.omg.CORBA.ORB orb() {

    /**
     * Returns the ORB that created this OutputStream.
     * @return the ORB that created this OutputStream
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public void write_Context(org.omg.CORBA.Context ctx,
                              org.omg.CORBA.ContextList contexts) {

    /**
     * Writes a CORBA context on this stream. The
     * Context is marshaled as a sequence of strings.
     * Only those Context values specified in the contexts
     * parameter are actually written.
     * @param ctx a CORBA context
     * @param contexts a <code>ContextList</code> object containing the list of contexts
     *        to be written
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public void write_fixed(java.math.BigDecimal value) {

    /**
     * Writes a BigDecimal number.
     * @param value a BidDecimal--value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public void write(int b) throws java.io.IOException {

    /**
     * Writes an integer (length of arrays) onto this stream.
     * @param b the value to be written.
     * @throws java.io.IOException if there is an input/output error
     * @see <a href="package-summary.html#unimpl"><code>portable</code>
     * package comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    @Deprecated

    /**
     * Writes a Principle on this output stream.
     * @param value the value to be written.
     * @deprecated Deprecated by CORBA 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_any(Any value);

    /**
     * Writes an Any on this output stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_Object(org.omg.CORBA.Object value);

    /**
     * Writes a CORBA Object on this output stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_float_array(float[] value, int offset,
                                           int length);

    /**
     * Writes an array of floats on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_longlong_array(long[] value, int offset,
                                              int length);

    /**
     * Writes an array of CORBA longlongs (i.e. Java longs) on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_long_array(int[] value, int offset,
                                          int length);

    /**
     * Writes an array of CORBA longs (i.e. Java ints) on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_short_array(short[] value, int offset,
                                           int length);

    /**
     * Writes an array of shorts on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_wchar_array(char[] value, int offset,
                                           int length);

    /**
     * Writes an array of wide chars on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_boolean_array(boolean[] value, int offset,
                                             int length);

    /**
     * Writes an array of booleans on this output stream.
     * @param value the array to be written.
     * @param offset offset on the stream.
     * @param length length of buffer to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_string(String value);

    /**
     * Writes a string value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_float(float value);

    /**
     * Writes a float value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_longlong(long value);

    /**
     * Writes a CORBA longlong (i.e. Java long) value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_long(int value);

    /**
     * Writes a CORBA long (i.e. Java int) value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_short(short value);

    /**
     * Writes a short value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_wchar(char value);

    /**
     * Writes a wide char value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract void write_boolean(boolean value);

    /**
     * Writes a boolean value to this stream.
     * @param value the value to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
    public abstract InputStream create_input_stream();

    /**
     * Returns an input stream with the same buffer.
     *@return an input stream with the same buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/OutputStream.java
public abstract class OutputStream extends java.io.OutputStream

/**
 * OuputStream is the Java API for writing IDL types
 * to CDR marshal streams. These methods are used by the ORB to
 * marshal IDL types as well as to insert IDL types into Anys.
 * The <code>_array</code> versions of the methods can be directly
 * used to write sequences and arrays of IDL types.
 *
 * @since   JDK1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public void write_abstract_interface(java.lang.Object obj) {

    /**
     * Marshals a value object or a stub object.
     * @param obj the actual value object to marshal or the stub to be marshalled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public void write_value(java.io.Serializable value, org.omg.CORBA.portable.BoxedValueHelper factory) {

    /**
     * Marshals a value type to the output stream.
     * @param value is the acutal value to write
     * @param factory is the instance of the helper to be used for marshaling
     * the boxed value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public void write_value(java.io.Serializable value, String repository_id) {

    /**
     * Marshals a value type to the output stream.
     * @param value is the acutal value to write
     * @param repository_id identifies the type of the value type to
     * be marshaled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public void write_value(java.io.Serializable value, java.lang.Class clz) {

    /**
     * Marshals a value type to the output stream.
     * @param value is the acutal value to write
     * @param clz is the declared type of the value to be marshaled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public void write_value(java.io.Serializable value) {

    /**
     * Marshals a value type to the output stream.
     * @param value is the acutal value to write
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
    public OutputStream() {

    /**
     * Create a new instance of this class.
     *
     * throw SecurityException if SecurityManager is installed and
     * enableSubclassImplementation SerializablePermission
     * is not granted or jdk.corba.allowOutputStreamSubclass system
     * property is either not set or is set to 'false'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/OutputStream.java
public abstract class OutputStream extends org.omg.CORBA.portable.OutputStream {

/**
 * OutputStream provides interface for writing of all of the mapped IDL type
 * to the stream. It extends org.omg.CORBA.portable.OutputStream, and defines
 * new methods defined by CORBA 2.3.
 *
 * @see org.omg.CORBA.portable.OutputStream
 * @author  OMG
 * @since   JDK1.2
 */
