_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public synchronized void error(String msg, Exception ex, int code) {

    /**
     * The error method is called when a Handler failure occurs.
     * <p>
     * This method may be overridden in subclasses.  The default
     * behavior in this base class is that the first call is
     * reported to System.err, and subsequent calls are ignored.
     *
     * @param msg    a descriptive string (may be null)
     * @param ex     an exception (may be null)
     * @param code   an error code defined in ErrorManager
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int FORMAT_FAILURE = 5;

    /**
     * FORMAT_FAILURE is used when formatting fails for any reason.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int OPEN_FAILURE = 4;

    /**
     * OPEN_FAILURE is used when an open of an output stream fails.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int CLOSE_FAILURE = 3;

    /**
     * CLOSE_FAILURE is used when a close of an output stream fails.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int FLUSH_FAILURE = 2;

    /**
     * FLUSH_FAILURE is used when a flush to an output stream fails.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int WRITE_FAILURE = 1;

    /**
     * WRITE_FAILURE is used when a write to an output stream fails.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
    public final static int GENERIC_FAILURE = 0;

    /**
     * GENERIC_FAILURE is used for failure that don't fit
     * into one of the other categories.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/ErrorManager.java
public class ErrorManager {

/**
 * ErrorManager objects can be attached to Handlers to process
 * any error that occurs on a Handler during Logging.
 * <p>
 * When processing logging output, if a Handler encounters problems
 * then rather than throwing an Exception back to the issuer of
 * the logging call (who is unlikely to be interested) the Handler
 * should call its associated ErrorManager.
 */
