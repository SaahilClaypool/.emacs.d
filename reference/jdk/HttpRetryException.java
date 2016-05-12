_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
    public String getLocation() {

    /**
     * Returns the value of the Location header field if the
     * error resulted from redirection.
     *
     * @return The location string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
    public String getReason() {

    /**
     * Returns a string explaining why the http request could
     * not be retried.
     *
     * @return  The reason string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
    public int responseCode() {

    /**
     * Returns the http response code
     *
     * @return  The http response code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
    public HttpRetryException(String detail, int code, String location) {

    /**
     * Constructs a new {@code HttpRetryException} with detail message
     * responseCode and the contents of the Location response header field.
     *
     * @param   detail   the detail message.
     * @param   code   the HTTP response code from server.
     * @param   location   the URL to be redirected to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
    public HttpRetryException(String detail, int code) {

    /**
     * Constructs a new {@code HttpRetryException} from the
     * specified response code and exception detail message
     *
     * @param   detail   the detail message.
     * @param   code   the HTTP response code from server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpRetryException.java
public

/**
 * Thrown to indicate that a HTTP request needs to be retried
 * but cannot be retried automatically, due to streaming mode
 * being enabled.
 *
 * @author  Michael McMahon
 * @since   1.5
 */
