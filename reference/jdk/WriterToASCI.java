_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public Writer getWriter()

  /**
   * Get the writer that this writer directly chains to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public OutputStream getOutputStream()

  /**
   * Get the output stream where the events will be serialized to.
   *
   * @return reference to the result stream, or null of only a writer was
   * set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void close() throws java.io.IOException

  /**
   * Close the stream, flushing it first.  Once a stream has been closed,
   * further write() or flush() invocations will cause an IOException to be
   * thrown.  Closing a previously-closed stream, however, has no effect.
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void flush() throws java.io.IOException

  /**
   * Flush the stream.  If the stream has saved any characters from the
   * various write() methods in a buffer, write them immediately to their
   * intended destination.  Then, if that destination is another character or
   * byte stream, flush it.  Thus one flush() invocation will flush all the
   * buffers in a chain of Writers and OutputStreams.
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(String s) throws IOException

  /**
   * Write a string.
   *
   * @param  s String to be written
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(int c) throws IOException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(char chars[], int start, int length)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public WriterToASCI(OutputStream os)

  /**
   * Create an unbuffered ASCII writer.
   *
   *
   * @param os The byte stream to write to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  private final OutputStream m_os;

  /** The byte stream to write to.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
class WriterToASCI extends Writer implements WriterChain

/**
 * This class writes ASCII to a byte stream as quickly as possible.  For the
 * moment it does not do buffering, though I reserve the right to do some
 * buffering down the line if I can prove that it will be faster even if the
 * output stream is buffered.
 *
 * This class is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public Writer getWriter()

  /**
   * Get the writer that this writer directly chains to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public OutputStream getOutputStream()

  /**
   * Get the output stream where the events will be serialized to.
   *
   * @return reference to the result stream, or null of only a writer was
   * set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void close() throws java.io.IOException

  /**
   * Close the stream, flushing it first.  Once a stream has been closed,
   * further write() or flush() invocations will cause an IOException to be
   * thrown.  Closing a previously-closed stream, however, has no effect.
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void flush() throws java.io.IOException

  /**
   * Flush the stream.  If the stream has saved any characters from the
   * various write() methods in a buffer, write them immediately to their
   * intended destination.  Then, if that destination is another character or
   * byte stream, flush it.  Thus one flush() invocation will flush all the
   * buffers in a chain of Writers and OutputStreams.
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(String s) throws IOException

  /**
   * Write a string.
   *
   * @param  s String to be written
   *
   * @exception  IOException  If an I/O error occurs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(int c) throws IOException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public void write(char chars[], int start, int length)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  public WriterToASCI(OutputStream os)

  /**
   * Create an unbuffered ASCII writer.
   *
   *
   * @param os The byte stream to write to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
  private final OutputStream m_os;

  /** The byte stream to write to.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/WriterToASCI.java
class WriterToASCI extends Writer implements WriterChain

/**
 * This class writes ASCII to a byte stream as quickly as possible.  For the
 * moment it does not do buffering, though I reserve the right to do some
 * buffering down the line if I can prove that it will be faster even if the
 * output stream is buffered.
 *
 * This class is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
