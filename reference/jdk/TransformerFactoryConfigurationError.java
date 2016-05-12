_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    @Override

    /**
     * use the exception chaining mechanism of JDK1.4
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public Exception getException() {

    /**
     * Return the actual exception (if any) that caused this exception to
     * be raised.
     *
     * @return The encapsulated exception, or null if there is none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public String getMessage() {

    /**
     * Return the message (if any) for this error . If there is no
     * message for the exception and there is an encapsulated
     * exception then the message of that exception will be returned.
     *
     * @return The error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public TransformerFactoryConfigurationError(Exception e, String msg) {

    /**
     * Create a new <code>TransformerFactoryConfigurationError</code> with the
     * given <code>Exception</code> base cause and detail message.
     *
     * @param e The exception to be encapsulated in a
     * TransformerFactoryConfigurationError
     * @param msg The detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public TransformerFactoryConfigurationError(Exception e) {

    /**
     * Create a new <code>TransformerFactoryConfigurationError</code> with a
     * given <code>Exception</code> base cause of the error.
     *
     * @param e The exception to be encapsulated in a
     * TransformerFactoryConfigurationError.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public TransformerFactoryConfigurationError(String msg) {

    /**
     * Create a new <code>TransformerFactoryConfigurationError</code> with
     * the <code>String</code> specified as an error message.
     *
     * @param msg The error message for the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    public TransformerFactoryConfigurationError() {

    /**
     * Create a new <code>TransformerFactoryConfigurationError</code> with no
     * detail mesage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
    private Exception exception;

    /**
     * <code>Exception</code> for the
     *  <code>TransformerFactoryConfigurationError</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerFactoryConfigurationError.java
public class TransformerFactoryConfigurationError extends Error {

/**
 * Thrown when a problem with configuration with the Transformer Factories
 * exists. This error will typically be thrown when the class of a
 * transformation factory specified in the system properties cannot be found
 * or instantiated.
 */
