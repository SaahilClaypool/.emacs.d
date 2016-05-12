_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    public int getErrorIndex() {

    /**
     * Returns the index where the error was found.
     *
     * @return the index in the parsed string that was invalid, should be a valid index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    public String getParsedString() {

    /**
     * Returns the string that was being parsed.
     *
     * @return the string that was being parsed, should not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    public DateTimeParseException(String message, CharSequence parsedData, int errorIndex, Throwable cause) {

    /**
     * Constructs a new exception with the specified message and cause.
     *
     * @param message  the message to use for this exception, may be null
     * @param parsedData  the parsed text, should not be null
     * @param errorIndex  the index in the parsed string that was invalid, should be a valid index
     * @param cause  the cause exception, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    public DateTimeParseException(String message, CharSequence parsedData, int errorIndex) {

    /**
     * Constructs a new exception with the specified message.
     *
     * @param message  the message to use for this exception, may be null
     * @param parsedData  the parsed text, should not be null
     * @param errorIndex  the index in the parsed string that was invalid, should be a valid index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    private final String parsedString;

    /**
     * The text that was being parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
    private static final long serialVersionUID = 4304633501674722597L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeParseException.java
public class DateTimeParseException extends DateTimeException {

/**
 * An exception thrown when an error occurs during parsing.
 * <p>
 * This exception includes the text being parsed and the error index.
 *
 * @implSpec
 * This class is intended for use in a single thread.
 *
 * @since 1.8
 */
