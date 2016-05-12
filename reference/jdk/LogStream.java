_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Convert a string name of a logging level to its internal
     * integer representation.
     * @param s name of logging level (e.g., 'SILENT', 'BRIEF', 'VERBOSE')
     * @return corresponding integer log level
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    public static final int VERBOSE = 20;

    /** log level constant (verbose logging). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    public static final int SILENT  = 0;

    /** log level constant (no logging). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Return log name as string representation.
     * @return log name
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Write a subarray of bytes.  Pass each through write byte method.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Write a byte of data to the stream.  If it is not a newline, then
     * the byte is appended to the internal buffer.  If it is a newline,
     * then the currently buffered line is sent to the log's output
     * stream, prefixed with the appropriate logging information.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Set the stream to which output from this log is sent.
     * @param out new output stream for this log
     * @see #getOutputStream
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Return the current stream to which output from this log is sent.
     * @return output stream for this log
     * @see #setOutputStream
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Set the default stream for new logs.
     * @param newDefault new default log stream
     * @see #getDefaultStream
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Return the current default stream for new logs.
     * @return default log stream
     * @see #setDefaultStream
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Return the LogStream identified by the given name.  If
     * a log corresponding to "name" does not exist, a log using
     * the default stream is created.
     * @param name name identifying the desired LogStream
     * @return log associated with given name
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    @Deprecated

    /**
     * Create a new LogStream object.  Since this only constructor is
     * private, users must have a LogStream created through the "log"
     * method.
     * @param name string identifying messages from this log
     * @out output stream that log messages will be sent to
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private ByteArrayOutputStream bufOut;

    /** stream used for buffering lines */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private StringBuffer buffer = new StringBuffer();

    /** string buffer used for constructing log message prefixes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private OutputStreamWriter logWriter;

    /** string writer for writing message prefixes to log stream */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private OutputStream logOut;

    /** stream where output of this log is sent to */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private String name;

    /** log name for this log */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
    private static Map<String,LogStream> known = new HashMap<>(5);

    /** table mapping known log names to log stream objects */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/LogStream.java
@Deprecated

/**
 * <code>LogStream</code> provides a mechanism for logging errors that are
 * of possible interest to those monitoring a system.
 *
 * @author  Ann Wollrath (lots of code stolen from Ken Arnold)
 * @since   JDK1.1
 * @deprecated no replacement
 */
