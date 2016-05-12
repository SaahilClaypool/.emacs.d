_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public OutputStream getOutputStream()

  /**
   * Get the output stream where the events will be serialized to.
   *
   * @return reference to the result stream, or null of only a writer was
   * set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void close() throws java.io.IOException

  /**
   * Close the stream, flushing it first.  Once a stream has been closed,
   * further write() or flush() invocations will cause an IOException to be
   * thrown.  Closing a previously-closed stream, however, has no effect.
   *
   * @exception  IOException  If an I/O error occurs
   *
   * @throws java.io.IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void flush() throws java.io.IOException

  /**
   * Flush the stream.  If the stream has saved any characters from the
   * various write() methods in a buffer, write them immediately to their
   * intended destination.  Then, if that destination is another character or
   * byte stream, flush it.  Thus one flush() invocation will flush all the
   * buffers in a chain of Writers and OutputStreams.
   *
   * @exception  IOException  If an I/O error occurs
   *
   * @throws java.io.IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void flushBuffer() throws IOException

  /**
   * Flush the internal buffer
   *
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
    else if (c >= 0xD800 && c <= 0xDBFF)

    /**
      * The following else if condition is added to support XML 1.1 Characters for
      * UTF-8:   [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]*
      * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate)
      *          [1101 11yy] [yyxx xxxx] (low surrogate)
      *          * uuuuu = wwww + 1
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
      else if (c >= 0xD800 && c <= 0xDBFF)

      /**
        * The following else if condition is added to support XML 1.1 Characters for
        * UTF-8:   [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]*
        * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate)
        *          [1101 11yy] [yyxx xxxx] (low surrogate)
        *          * uuuuu = wwww + 1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
//  public WriterToUTF8Buffered(final OutputStream out, final int size)

  /**
   * Create an buffered UTF-8 writer to write data to the
   * specified underlying output stream with the specified buffer
   * size.
   *
   * @param   out    the underlying output stream.
   * @param   size   the buffer size.
   * @exception IllegalArgumentException if size <= 0.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public WriterToUTF8Buffered(OutputStream out)

  /**
   * Create an buffered UTF-8 writer.
   *
   *
   * @param   out    the underlying output stream.
   *
   * @throws UnsupportedEncodingException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private int count;

  /**
   * The number of valid bytes in the buffer. This value is always
   * in the range <tt>0</tt> through <tt>m_outputBytes.length</tt>; elements
   * <tt>m_outputBytes[0]</tt> through <tt>m_outputBytes[count-1]</tt> contain valid
   * byte data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private final byte m_outputBytes[];

  /**
   * The internal buffer where data is stored.
   * (sc & sb remove final to compile in JDK 1.1.8)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private final OutputStream m_os;

  /** The byte stream to write to. (sc & sb remove final to compile in JDK 1.1.8) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private static final int BYTES_MAX=16*1024;

  /** number of bytes that the byte buffer can hold.
   * This is a fixed constant is used rather than m_outputBytes.lenght for performance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
final class WriterToUTF8Buffered extends Writer implements WriterChain

/**
 * This class writes unicode characters to a byte stream (java.io.OutputStream)
 * as quickly as possible. It buffers the output in an internal
 * buffer which must be flushed to the OutputStream when done. This flushing
 * is done via the close() flush() or flushBuffer() method.
 *
 * This class is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public OutputStream getOutputStream()

  /**
   * Get the output stream where the events will be serialized to.
   *
   * @return reference to the result stream, or null of only a writer was
   * set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void close() throws java.io.IOException

  /**
   * Close the stream, flushing it first.  Once a stream has been closed,
   * further write() or flush() invocations will cause an IOException to be
   * thrown.  Closing a previously-closed stream, however, has no effect.
   *
   * @exception  IOException  If an I/O error occurs
   *
   * @throws java.io.IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void flush() throws java.io.IOException

  /**
   * Flush the stream.  If the stream has saved any characters from the
   * various write() methods in a buffer, write them immediately to their
   * intended destination.  Then, if that destination is another character or
   * byte stream, flush it.  Thus one flush() invocation will flush all the
   * buffers in a chain of Writers and OutputStreams.
   *
   * @exception  IOException  If an I/O error occurs
   *
   * @throws java.io.IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public void flushBuffer() throws IOException

  /**
   * Flush the internal buffer
   *
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
    else if (c >= 0xD800 && c <= 0xDBFF)

    /**
      * The following else if condition is added to support XML 1.1 Characters for
      * UTF-8:   [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]*
      * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate)
      *          [1101 11yy] [yyxx xxxx] (low surrogate)
      *          * uuuuu = wwww + 1
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
      else if (c >= 0xD800 && c <= 0xDBFF)

      /**
        * The following else if condition is added to support XML 1.1 Characters for
        * UTF-8:   [1111 0uuu] [10uu zzzz] [10yy yyyy] [10xx xxxx]*
        * Unicode: [1101 10ww] [wwzz zzyy] (high surrogate)
        *          [1101 11yy] [yyxx xxxx] (low surrogate)
        *          * uuuuu = wwww + 1
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
//  public WriterToUTF8Buffered(final OutputStream out, final int size)

  /**
   * Create an buffered UTF-8 writer to write data to the
   * specified underlying output stream with the specified buffer
   * size.
   *
   * @param   out    the underlying output stream.
   * @param   size   the buffer size.
   * @exception IllegalArgumentException if size <= 0.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  public WriterToUTF8Buffered(OutputStream out)

  /**
   * Create an buffered UTF-8 writer.
   *
   *
   * @param   out    the underlying output stream.
   *
   * @throws UnsupportedEncodingException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private int count;

  /**
   * The number of valid bytes in the buffer. This value is always
   * in the range <tt>0</tt> through <tt>m_outputBytes.length</tt>; elements
   * <tt>m_outputBytes[0]</tt> through <tt>m_outputBytes[count-1]</tt> contain valid
   * byte data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private final byte m_outputBytes[];

  /**
   * The internal buffer where data is stored.
   * (sc & sb remove final to compile in JDK 1.1.8)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private final OutputStream m_os;

  /** The byte stream to write to. (sc & sb remove final to compile in JDK 1.1.8) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
  private static final int BYTES_MAX=16*1024;

  /** number of bytes that the byte buffer can hold.
   * This is a fixed constant is used rather than m_outputBytes.lenght for performance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToUTF8Buffered.java
final class WriterToUTF8Buffered extends Writer implements WriterChain

/**
 * This class writes unicode characters to a byte stream (java.io.OutputStream)
 * as quickly as possible. It buffers the output in an internal
 * buffer which must be flushed to the OutputStream when done. This flushing
 * is done via the close() flush() or flushBuffer() method.
 *
 * This class is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
