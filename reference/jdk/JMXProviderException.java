_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXProviderException.java
    private Throwable cause = null;

    /**
     * @serial An exception that caused this exception to be thrown.
     *         This field may be null.
     * @see #getCause()
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXProviderException.java
    public JMXProviderException(String message, Throwable cause) {

    /**
     * <p>Constructs a <code>JMXProviderException</code> with the
     * specified detail message and nested exception.</p>
     *
     * @param message the detail message
     * @param cause the nested exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXProviderException.java
    public JMXProviderException(String message) {

    /**
     * <p>Constructs a <code>JMXProviderException</code> with the
     * specified detail message.</p>
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXProviderException.java
    public JMXProviderException() {

    /**
     * <p>Constructs a <code>JMXProviderException</code> with no
     * specified detail message.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXProviderException.java
public class JMXProviderException extends IOException {

/**
 * <p>Exception thrown by {@link JMXConnectorFactory} and
 * {@link JMXConnectorServerFactory} when a provider exists for
 * the required protocol but cannot be used for some reason.</p>
 *
 * @see JMXConnectorFactory#newJMXConnector
 * @see JMXConnectorServerFactory#newJMXConnectorServer
 * @since 1.5
 */
