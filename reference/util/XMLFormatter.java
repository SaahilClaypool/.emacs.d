_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/XMLFormatter.java
    public String getTail(Handler h) {

    /**
     * Return the tail string for a set of XML formatted records.
     *
     * @param   h  The target handler (can be null)
     * @return  a valid XML string
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/XMLFormatter.java
    public String getHead(Handler h) {

    /**
     * Return the header string for a set of XML formatted records.
     *
     * @param   h  The target handler (can be null)
     * @return  a valid XML string
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/XMLFormatter.java
    public String format(LogRecord record) {

    /**
     * Format the given message to XML.
     * <p>
     * This method can be overridden in a subclass.
     * It is recommended to use the {@link Formatter#formatMessage}
     * convenience method to localize and format the message field.
     *
     * @param record the log record to be formatted.
     * @return a formatted log record
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//logging/XMLFormatter.java
public class XMLFormatter extends Formatter {

/**
 * Format a LogRecord into a standard XML format.
 * <p>
 * The DTD specification is provided as Appendix A to the
 * Java Logging APIs specification.
 * <p>
 * The XMLFormatter can be used with arbitrary character encodings,
 * but it is recommended that it normally be used with UTF-8.  The
 * character encoding can be set on the output Handler.
 *
 * @since 1.4
 */
