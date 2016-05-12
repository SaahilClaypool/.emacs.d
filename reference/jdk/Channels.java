_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static Writer newWriter(WritableByteChannel ch,
                                   String csName)

    /**
     * Constructs a writer that encodes characters according to the named
     * charset and writes the resulting bytes to the given channel.
     *
     * <p> An invocation of this method of the form
     *
     * <blockquote><pre>
     * Channels.newWriter(ch, csname)</pre></blockquote>
     *
     * behaves in exactly the same way as the expression
     *
     * <blockquote><pre>
     * Channels.newWriter(ch,
     *                    Charset.forName(csName)
     *                        .newEncoder(),
     *                    -1);</pre></blockquote>
     *
     * @param  ch
     *         The channel to which bytes will be written
     *
     * @param  csName
     *         The name of the charset to be used
     *
     * @return  A new writer
     *
     * @throws  UnsupportedCharsetException
     *          If no support for the named charset is available
     *          in this instance of the Java virtual machine
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static Writer newWriter(final WritableByteChannel ch,
                                   final CharsetEncoder enc,
                                   final int minBufferCap)

    /**
     * Constructs a writer that encodes characters using the given encoder and
     * writes the resulting bytes to the given channel.
     *
     * <p> The resulting stream will contain an internal output buffer of at
     * least <tt>minBufferCap</tt> bytes.  The stream's <tt>write</tt> methods
     * will, as needed, flush the buffer by writing bytes to the underlying
     * channel; if the channel is in non-blocking mode when bytes are to be
     * written then an {@link IllegalBlockingModeException} will be thrown.
     * The resulting stream will not otherwise be buffered.  Closing the stream
     * will in turn cause the channel to be closed.  </p>
     *
     * @param  ch
     *         The channel to which bytes will be written
     *
     * @param  enc
     *         The charset encoder to be used
     *
     * @param  minBufferCap
     *         The minimum capacity of the internal byte buffer,
     *         or <tt>-1</tt> if an implementation-dependent
     *         default capacity is to be used
     *
     * @return  A new writer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static Reader newReader(ReadableByteChannel ch,
                                   String csName)

    /**
     * Constructs a reader that decodes bytes from the given channel according
     * to the named charset.
     *
     * <p> An invocation of this method of the form
     *
     * <blockquote><pre>
     * Channels.newReader(ch, csname)</pre></blockquote>
     *
     * behaves in exactly the same way as the expression
     *
     * <blockquote><pre>
     * Channels.newReader(ch,
     *                    Charset.forName(csName)
     *                        .newDecoder(),
     *                    -1);</pre></blockquote>
     *
     * @param  ch
     *         The channel from which bytes will be read
     *
     * @param  csName
     *         The name of the charset to be used
     *
     * @return  A new reader
     *
     * @throws  UnsupportedCharsetException
     *          If no support for the named charset is available
     *          in this instance of the Java virtual machine
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static Reader newReader(ReadableByteChannel ch,
                                   CharsetDecoder dec,
                                   int minBufferCap)

    /**
     * Constructs a reader that decodes bytes from the given channel using the
     * given decoder.
     *
     * <p> The resulting stream will contain an internal input buffer of at
     * least <tt>minBufferCap</tt> bytes.  The stream's <tt>read</tt> methods
     * will, as needed, fill the buffer by reading bytes from the underlying
     * channel; if the channel is in non-blocking mode when bytes are to be
     * read then an {@link IllegalBlockingModeException} will be thrown.  The
     * resulting stream will not otherwise be buffered, and it will not support
     * the {@link Reader#mark mark} or {@link Reader#reset reset} methods.
     * Closing the stream will in turn cause the channel to be closed.  </p>
     *
     * @param  ch
     *         The channel from which bytes will be read
     *
     * @param  dec
     *         The charset decoder to be used
     *
     * @param  minBufferCap
     *         The minimum capacity of the internal byte buffer,
     *         or <tt>-1</tt> if an implementation-dependent
     *         default capacity is to be used
     *
     * @return  A new reader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static WritableByteChannel newChannel(final OutputStream out) {

    /**
     * Constructs a channel that writes bytes to the given stream.
     *
     * <p> The resulting channel will not be buffered; it will simply redirect
     * its I/O operations to the given stream.  Closing the channel will in
     * turn cause the stream to be closed.  </p>
     *
     * @param  out
     *         The stream to which bytes are to be written
     *
     * @return  A new writable byte channel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static ReadableByteChannel newChannel(final InputStream in) {

    /**
     * Constructs a channel that reads bytes from the given stream.
     *
     * <p> The resulting channel will not be buffered; it will simply redirect
     * its I/O operations to the given stream.  Closing the channel will in
     * turn cause the stream to be closed.  </p>
     *
     * @param  in
     *         The stream from which bytes are to be read
     *
     * @return  A new readable byte channel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static OutputStream newOutputStream(final AsynchronousByteChannel ch) {

    /**
     * Constructs a stream that writes bytes to the given channel.
     *
     * <p> The stream will not be buffered. The stream will be safe for access
     * by multiple concurrent threads.  Closing the stream will in turn cause
     * the channel to be closed.  </p>
     *
     * @param  ch
     *         The channel to which bytes will be written
     *
     * @return  A new output stream
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static InputStream newInputStream(final AsynchronousByteChannel ch) {

    /**
     * Constructs a stream that reads bytes from the given channel.
     *
     * <p> The stream will not be buffered, and it will not support the {@link
     * InputStream#mark mark} or {@link InputStream#reset reset} methods.  The
     * stream will be safe for access by multiple concurrent threads.  Closing
     * the stream will in turn cause the channel to be closed.  </p>
     *
     * @param  ch
     *         The channel from which bytes will be read
     *
     * @return  A new input stream
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static OutputStream newOutputStream(final WritableByteChannel ch) {

    /**
     * Constructs a stream that writes bytes to the given channel.
     *
     * <p> The <tt>write</tt> methods of the resulting stream will throw an
     * {@link IllegalBlockingModeException} if invoked while the underlying
     * channel is in non-blocking mode.  The stream will not be buffered.  The
     * stream will be safe for access by multiple concurrent threads.  Closing
     * the stream will in turn cause the channel to be closed.  </p>
     *
     * @param  ch
     *         The channel to which bytes will be written
     *
     * @return  A new output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    public static InputStream newInputStream(ReadableByteChannel ch) {

    /**
     * Constructs a stream that reads bytes from the given channel.
     *
     * <p> The <tt>read</tt> methods of the resulting stream will throw an
     * {@link IllegalBlockingModeException} if invoked while the underlying
     * channel is in non-blocking mode.  The stream will not be buffered, and
     * it will not support the {@link InputStream#mark mark} or {@link
     * InputStream#reset reset} methods.  The stream will be safe for access by
     * multiple concurrent threads.  Closing the stream will in turn cause the
     * channel to be closed.  </p>
     *
     * @param  ch
     *         The channel from which bytes will be read
     *
     * @return  A new input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    private static void writeFully(WritableByteChannel ch, ByteBuffer bb)

    /**
     * Write all remaining bytes in buffer to the given channel.
     *
     * @throws  IllegalBlockingModeException
     *          If the channel is selectable and configured non-blocking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
    private static void writeFullyImpl(WritableByteChannel ch, ByteBuffer bb)

    /**
     * Write all remaining bytes in buffer to the given channel.
     * If the channel is selectable then it must be configured blocking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Channels.java
public final class Channels {

/**
 * Utility methods for channels and streams.
 *
 * <p> This class defines static methods that support the interoperation of the
 * stream classes of the <tt>{@link java.io}</tt> package with the channel
 * classes of this package.  </p>
 *
 *
 * @author Mark Reinhold
 * @author Mike McCloskey
 * @author JSR-51 Expert Group
 * @since 1.4
 */
