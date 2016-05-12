_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public OutputStream getOutputStream()

    /**
     * Get the OutputStream that is the at the end of the
     * chain of writers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public Writer getWriter()

    /**
     * Get the writer that this one directly wraps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final String s) throws IOException

    /**
     * Write a string.
     *
     * @param  s  String to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final char chars[], final int start, final int length)

    /**
     * Write a portion of an array of characters.
     *
     * @param  chars  Array of characters
     * @param  start   Offset from which to start writing characters
     * @param  length   Number of characters to write
     *
     * @exception  IOException  If an I/O error occurs
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final int c) throws IOException

    /**
     * Write a single character.  The character to be written is contained in
     * the 16 low-order bits of the given integer value; the 16 high-order bits
     * are ignored.
     *
     * <p> Subclasses that intend to support efficient single-character output
     * should override this method.
     *
     * @param c  int specifying a character to be written.
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void close() throws java.io.IOException

    /**
     * Flush the internal buffer and close the Writer
     * @see java.io.Writer#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void flush() throws java.io.IOException

    /**
     * Flush the internal buffer and flush the Writer
     * @see java.io.Writer#flush()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private void flushBuffer() throws IOException

    /**
     * Flush out the collected characters by sending them to the trace
     * listener.  These characters are never written to the real writer
     * (m_writer) because that has already happened with every method
     * call. This method simple informs the listener of what has already
     * happened.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public SerializerTraceWriter(Writer out, SerializerTrace tracer)

    /**
     * Constructor.
     * If the writer passed in is null, then this SerializerTraceWriter will
     * only signal trace events of what would have been written to that writer.
     * If the writer passed in is not null then the trace events will mirror
     * what is going to that writer. In this way tools, such as a debugger, can
     * gather information on what is being written out.
     *
     * @param out the Writer to write to (possibly null)
     * @param tracer the tracer to inform that characters are being written
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private void setBufferSize(int size)

    /**
     * Creates or replaces the internal buffer, and makes sure it has a few
     * extra bytes slight overflow of the last UTF8 encoded character.
     * @param size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private int count;

    /**
     * How many bytes have been collected and still need to go to trace
     * listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private byte buf[];

    /**
     * Internal buffer to collect the characters to go to the trace listener.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private int buf_length;

    /** The size of the internal buffer, just to keep too many
     * events from being sent to the tracer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private final SerializerTrace m_tracer;

    /** The tracer to send events to */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private final java.io.Writer m_writer;

    /** The real writer to immediately write to.
     * This reference may be null, in which case nothing is written out, but
     * only the trace events are fired for output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
final class SerializerTraceWriter extends Writer implements WriterChain

/**
 * This class wraps the real writer, it only purpose is to send
 * CHARACTERTOSTREAM events to the trace listener.
 * Each method immediately sends the call to the wrapped writer unchanged, but
 * in addition it collects characters to be issued to a trace listener.
 *
 * In this way the trace
 * listener knows what characters have been written to the output Writer.
 *
 * There may still be differences in what the trace events say is going to the
 * output writer and what is really going there. These differences will be due
 * to the fact that this class is UTF-8 encoding before emiting the trace event
 * and the underlying writer may not be UTF-8 encoding. There may also be
 * encoding differences.  So the main pupose of this class is to provide a
 * resonable facsimile of the true output.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public OutputStream getOutputStream()

    /**
     * Get the OutputStream that is the at the end of the
     * chain of writers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public Writer getWriter()

    /**
     * Get the writer that this one directly wraps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final String s) throws IOException

    /**
     * Write a string.
     *
     * @param  s  String to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final char chars[], final int start, final int length)

    /**
     * Write a portion of an array of characters.
     *
     * @param  chars  Array of characters
     * @param  start   Offset from which to start writing characters
     * @param  length   Number of characters to write
     *
     * @exception  IOException  If an I/O error occurs
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void write(final int c) throws IOException

    /**
     * Write a single character.  The character to be written is contained in
     * the 16 low-order bits of the given integer value; the 16 high-order bits
     * are ignored.
     *
     * <p> Subclasses that intend to support efficient single-character output
     * should override this method.
     *
     * @param c  int specifying a character to be written.
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void close() throws java.io.IOException

    /**
     * Flush the internal buffer and close the Writer
     * @see java.io.Writer#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public void flush() throws java.io.IOException

    /**
     * Flush the internal buffer and flush the Writer
     * @see java.io.Writer#flush()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private void flushBuffer() throws IOException

    /**
     * Flush out the collected characters by sending them to the trace
     * listener.  These characters are never written to the real writer
     * (m_writer) because that has already happened with every method
     * call. This method simple informs the listener of what has already
     * happened.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    public SerializerTraceWriter(Writer out, SerializerTrace tracer)

    /**
     * Constructor.
     * If the writer passed in is null, then this SerializerTraceWriter will
     * only signal trace events of what would have been written to that writer.
     * If the writer passed in is not null then the trace events will mirror
     * what is going to that writer. In this way tools, such as a debugger, can
     * gather information on what is being written out.
     *
     * @param out the Writer to write to (possibly null)
     * @param tracer the tracer to inform that characters are being written
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private void setBufferSize(int size)

    /**
     * Creates or replaces the internal buffer, and makes sure it has a few
     * extra bytes slight overflow of the last UTF8 encoded character.
     * @param size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private int count;

    /**
     * How many bytes have been collected and still need to go to trace
     * listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private byte buf[];

    /**
     * Internal buffer to collect the characters to go to the trace listener.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private int buf_length;

    /** The size of the internal buffer, just to keep too many
     * events from being sent to the tracer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private final SerializerTrace m_tracer;

    /** The tracer to send events to */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
    private final java.io.Writer m_writer;

    /** The real writer to immediately write to.
     * This reference may be null, in which case nothing is written out, but
     * only the trace events are fired for output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTraceWriter.java
final class SerializerTraceWriter extends Writer implements WriterChain

/**
 * This class wraps the real writer, it only purpose is to send
 * CHARACTERTOSTREAM events to the trace listener.
 * Each method immediately sends the call to the wrapped writer unchanged, but
 * in addition it collects characters to be issued to a trace listener.
 *
 * In this way the trace
 * listener knows what characters have been written to the output Writer.
 *
 * There may still be differences in what the trace events say is going to the
 * output writer and what is really going there. These differences will be due
 * to the fact that this class is UTF-8 encoding before emiting the trace event
 * and the underlying writer may not be UTF-8 encoding. There may also be
 * encoding differences.  So the main pupose of this class is to provide a
 * resonable facsimile of the true output.
 *
 * @xsl.usage internal
 */
