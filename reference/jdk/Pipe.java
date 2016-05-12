_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    public static Pipe open() throws IOException {

    /**
     * Opens a pipe.
     *
     * <p> The new pipe is created by invoking the {@link
     * java.nio.channels.spi.SelectorProvider#openPipe openPipe} method of the
     * system-wide default {@link java.nio.channels.spi.SelectorProvider}
     * object.  </p>
     *
     * @return  A new pipe
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    public abstract SinkChannel sink();

    /**
     * Returns this pipe's sink channel.
     *
     * @return  This pipe's sink channel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    public abstract SourceChannel source();

    /**
     * Returns this pipe's source channel.
     *
     * @return  This pipe's source channel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    protected Pipe() { }

    /**
     * Initializes a new instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
        public final int validOps() {

        /**
         * Returns an operation set identifying this channel's supported
         * operations.
         *
         * <p> Pipe-sink channels only support writing, so this method returns
         * {@link SelectionKey#OP_WRITE}.  </p>
         *
         * @return  The valid-operation set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
        protected SinkChannel(SelectorProvider provider) {

        /**
         * Initializes a new instance of this class.
         *
         * @param  provider
         *         The selector provider
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    public static abstract class SinkChannel

    /**
     * A channel representing the writable end of a {@link Pipe}.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
        public final int validOps() {

        /**
         * Returns an operation set identifying this channel's supported
         * operations.
         *
         * <p> Pipe-source channels only support reading, so this method
         * returns {@link SelectionKey#OP_READ}.  </p>
         *
         * @return  The valid-operation set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
        protected SourceChannel(SelectorProvider provider) {

        /**
         * Constructs a new instance of this class.
         *
         * @param  provider
         *         The selector provider
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
    public static abstract class SourceChannel

    /**
     * A channel representing the readable end of a {@link Pipe}.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/Pipe.java
public abstract class Pipe {

/**
 * A pair of channels that implements a unidirectional pipe.
 *
 * <p> A pipe consists of a pair of channels: A writable {@link
 * Pipe.SinkChannel sink} channel and a readable {@link Pipe.SourceChannel source}
 * channel.  Once some bytes are written to the sink channel they can be read
 * from source channel in exactlyAthe order in which they were written.
 *
 * <p> Whether or not a thread writing bytes to a pipe will block until another
 * thread reads those bytes, or some previously-written bytes, from the pipe is
 * system-dependent and therefore unspecified.  Many pipe implementations will
 * buffer up to a certain number of bytes between the sink and source channels,
 * but such buffering should not be assumed.  </p>
 *
 *
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 * @since 1.4
 */
