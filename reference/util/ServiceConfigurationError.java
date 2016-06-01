_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ServiceConfigurationError.java
    public ServiceConfigurationError(String msg, Throwable cause) {

    /**
     * Constructs a new instance with the specified message and cause.
     *
     * @param  msg  The message, or <tt>null</tt> if there is no message
     *
     * @param  cause  The cause, or <tt>null</tt> if the cause is nonexistent
     *                or unknown
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ServiceConfigurationError.java
    public ServiceConfigurationError(String msg) {

    /**
     * Constructs a new instance with the specified message.
     *
     * @param  msg  The message, or <tt>null</tt> if there is no message
     *
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ServiceConfigurationError.java
public class ServiceConfigurationError

/**
 * Error thrown when something goes wrong while loading a service provider.
 *
 * <p> This error will be thrown in the following situations:
 *
 * <ul>
 *
 *   <li> The format of a provider-configuration file violates the <a
 *   href="ServiceLoader.html#format">specification</a>; </li>
 *
 *   <li> An {@link java.io.IOException IOException} occurs while reading a
 *   provider-configuration file; </li>
 *
 *   <li> A concrete provider class named in a provider-configuration file
 *   cannot be found; </li>
 *
 *   <li> A concrete provider class is not a subclass of the service class;
 *   </li>
 *
 *   <li> A concrete provider class cannot be instantiated; or
 *
 *   <li> Some other kind of error occurs. </li>
 *
 * </ul>
 *
 *
 * @author Mark Reinhold
 * @since 1.6
 */
