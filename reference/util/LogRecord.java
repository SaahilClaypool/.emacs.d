_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Default fields, followed by a two byte version number
     * (major byte, followed by minor byte), followed by information on
     * the log record parameter array.  If there is no parameter array,
     * then -1 is written.  If there is a parameter array (possible of zero
     * length) then the array length is written as an integer, followed
     * by String values for each parameter.  If a parameter is null, then
     * a null String is written.  Otherwise the output of Object.toString()
     * is written.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setThrown(Throwable thrown) {

    /**
     * Set a throwable associated with the log event.
     *
     * @param thrown  a throwable (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public Throwable getThrown() {

    /**
     * Get any throwable associated with the log record.
     * <p>
     * If the event involved an exception, this will be the
     * exception object. Otherwise null.
     *
     * @return a throwable
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setMillis(long millis) {

    /**
     * Set event time.
     *
     * @param millis event time in millis since 1970
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public long getMillis() {

    /**
     * Get event time in milliseconds since 1970.
     *
     * @return event time in millis since 1970
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setThreadID(int threadID) {

    /**
     * Set an identifier for the thread where the message originated.
     * @param threadID  the thread ID
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public int getThreadID() {

    /**
     * Get an identifier for the thread where the message originated.
     * <p>
     * This is a thread identifier within the Java VM and may or
     * may not map to any operating system ID.
     *
     * @return thread ID
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setParameters(Object parameters[]) {

    /**
     * Set the parameters to the log message.
     *
     * @param parameters the log message parameters. (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public Object[] getParameters() {

    /**
     * Get the parameters to the log message.
     *
     * @return the log message parameters.  May be null if
     *                  there are no parameters.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setMessage(String message) {

    /**
     * Set the "raw" log message, before localization or formatting.
     *
     * @param message the raw message string (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public String getMessage() {

    /**
     * Get the "raw" log message, before localization or formatting.
     * <p>
     * May be null, which is equivalent to the empty string "".
     * <p>
     * This message may be either the final text or a localization key.
     * <p>
     * During formatting, if the source logger has a localization
     * ResourceBundle and if that ResourceBundle has an entry for
     * this message string, then the message string is replaced
     * with the localized value.
     *
     * @return the raw message string
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setSourceMethodName(String sourceMethodName) {

    /**
     * Set the name of the method that (allegedly) issued the logging request.
     *
     * @param sourceMethodName the source method name (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public String getSourceMethodName() {

    /**
     * Get the  name of the method that (allegedly) issued the logging request.
     * <p>
     * Note that this sourceMethodName is not verified and may be spoofed.
     * This information may either have been provided as part of the
     * logging call, or it may have been inferred automatically by the
     * logging framework.  In the latter case, the information may only
     * be approximate and may in fact describe an earlier call on the
     * stack frame.
     * <p>
     * May be null if no information could be obtained.
     *
     * @return the source method name
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setSourceClassName(String sourceClassName) {

    /**
     * Set the name of the class that (allegedly) issued the logging request.
     *
     * @param sourceClassName the source class name (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public String getSourceClassName() {

    /**
     * Get the  name of the class that (allegedly) issued the logging request.
     * <p>
     * Note that this sourceClassName is not verified and may be spoofed.
     * This information may either have been provided as part of the
     * logging call, or it may have been inferred automatically by the
     * logging framework.  In the latter case, the information may only
     * be approximate and may in fact describe an earlier call on the
     * stack frame.
     * <p>
     * May be null if no information could be obtained.
     *
     * @return the source class name
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setSequenceNumber(long seq) {

    /**
     * Set the sequence number.
     * <p>
     * Sequence numbers are normally assigned in the LogRecord constructor,
     * so it should not normally be necessary to use this method.
     * @param seq the sequence number
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public long getSequenceNumber() {

    /**
     * Get the sequence number.
     * <p>
     * Sequence numbers are normally assigned in the LogRecord
     * constructor, which assigns unique sequence numbers to
     * each new LogRecord in increasing order.
     * @return the sequence number
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setLevel(Level level) {

    /**
     * Set the logging message level, for example Level.SEVERE.
     * @param level the logging message level
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public Level getLevel() {

    /**
     * Get the logging message level, for example Level.SEVERE.
     * @return the logging message level
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setResourceBundleName(String name) {

    /**
     * Set the localization resource bundle name.
     *
     * @param name  localization bundle name (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public String getResourceBundleName() {

    /**
     * Get the localization resource bundle name
     * <p>
     * This is the name for the ResourceBundle that should be
     * used to localize the message string before formatting it.
     * The result may be null if the message is not localizable.
     * @return the localization resource bundle name
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setResourceBundle(ResourceBundle bundle) {

    /**
     * Set the localization resource bundle.
     *
     * @param bundle  localization bundle (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public ResourceBundle getResourceBundle() {

    /**
     * Get the localization resource bundle
     * <p>
     * This is the ResourceBundle that should be used to localize
     * the message string before formatting it.  The result may
     * be null if the message is not localizable, or if no suitable
     * ResourceBundle is available.
     * @return the localization resource bundle
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public void setLoggerName(String name) {

    /**
     * Set the source Logger's name.
     *
     * @param name   the source logger name (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public String getLoggerName() {

    /**
     * Get the source Logger's name.
     *
     * @return source logger name (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    public LogRecord(Level level, String msg) {

    /**
     * Construct a LogRecord with the given level and message values.
     * <p>
     * The sequence property will be initialized with a new unique value.
     * These sequence values are allocated in increasing order within a VM.
     * <p>
     * The millis property will be initialized to the current time.
     * <p>
     * The thread ID property will be initialized with a unique ID for
     * the current thread.
     * <p>
     * All other properties will be initialized to "null".
     *
     * @param level  a logging level value
     * @param msg  the raw non-localized logging message (may be null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private int defaultThreadID() {

    /**
     * Returns the default value for a new LogRecord's threadID.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private String resourceBundleName;

    /**
     * @serial Resource bundle name to localized log message.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private String loggerName;

    /**
     * @serial Name of the source Logger.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private Throwable thrown;

    /**
     * @serial The Throwable (if any) associated with log message
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private long millis;

    /**
     * @serial Event time in milliseconds since 1970
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private int threadID;

    /**
     * @serial Thread ID for thread that issued logging call.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private String message;

    /**
     * @serial Non-localized raw message text
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private String sourceMethodName;

    /**
     * @serial Method that issued logging call
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private String sourceClassName;

    /**
     * @serial Class that issued logging call
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private long sequenceNumber;

    /**
     * @serial Sequence number
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private Level level;

    /**
     * @serial Logging message level
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
    private static final int MIN_SEQUENTIAL_THREAD_ID = Integer.MAX_VALUE / 2;

    /**
     * The default value of threadID will be the current thread's
     * thread id, for ease of correlation, unless it is greater than
     * MIN_SEQUENTIAL_THREAD_ID, in which case we try harder to keep
     * our promise to keep threadIDs unique by avoiding collisions due
     * to 32-bit wraparound.  Unfortunately, LogRecord.getThreadID()
     * returns int, while Thread.getId() returns long.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/LogRecord.java
public class LogRecord implements java.io.Serializable {

/**
 * LogRecord objects are used to pass logging requests between
 * the logging framework and individual log Handlers.
 * <p>
 * When a LogRecord is passed into the logging framework it
 * logically belongs to the framework and should no longer be
 * used or updated by the client application.
 * <p>
 * Note that if the client application has not specified an
 * explicit source method name and source class name, then the
 * LogRecord class will infer them automatically when they are
 * first accessed (due to a call on getSourceMethodName or
 * getSourceClassName) by analyzing the call stack.  Therefore,
 * if a logging Handler wants to pass off a LogRecord to another
 * thread, or to transmit it over RMI, and if it wishes to subsequently
 * obtain method name or class name information it should call
 * one of getSourceClassName or getSourceMethodName to force
 * the values to be filled in.
 * <p>
 * <b> Serialization notes:</b>
 * <ul>
 * <li>The LogRecord class is serializable.
 *
 * <li> Because objects in the parameters array may not be serializable,
 * during serialization all objects in the parameters array are
 * written as the corresponding Strings (using Object.toString).
 *
 * <li> The ResourceBundle is not transmitted as part of the serialized
 * form, but the resource bundle name is, and the recipient object's
 * readObject method will attempt to locate a suitable resource bundle.
 *
 * </ul>
 *
 * @since 1.4
 */
