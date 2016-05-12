_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public void printStackTrace(java.io.PrintWriter s) {

    /**
     * Print the the trace of methods from where the error
     * originated.  This will trace all nested exception
     * objects, as well as this object.
     * @param s The writer where the dump will be sent to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public void printStackTrace(java.io.PrintStream s) {

    /**
     * Print the the trace of methods from where the error
     * originated.  This will trace all nested exception
     * objects, as well as this object.
     * @param s The stream where the dump will be sent to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public void printStackTrace() {

    /**
     * Print the the trace of methods from where the error
     * originated.  This will trace all nested exception
     * objects, as well as this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public String getLocationAsString() {

    /**
     * Get the location information as a string.
     *
     * @return A string with location info, or null
     * if there is no location information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public String getMessageAndLocation() {

    /**
     * Get the error message with location information
     * appended.
     *
     * @return A <code>String</code> representing the error message with
     *         location information appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public TransformerException(String message, SourceLocator locator,
                                Throwable e) {

    /**
     * Wrap an existing exception in a TransformerException.
     *
     * @param message The error or warning message, or null to
     *                use the message from the embedded exception.
     * @param locator The locator object for the error or warning.
     * @param e Any exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public TransformerException(String message, SourceLocator locator) {

    /**
     * Create a new TransformerException from a message and a Locator.
     *
     * <p>This constructor is especially useful when an application is
     * creating its own exception from within a DocumentHandler
     * callback.</p>
     *
     * @param message The error or warning message.
     * @param locator The locator object for the error or warning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public TransformerException(String message, Throwable e) {

    /**
     * Wrap an existing exception in a TransformerException.
     *
     * <p>This is used for throwing processor exceptions before
     * the processing has started.</p>
     *
     * @param message The error or warning message, or null to
     *                use the message from the embedded exception.
     * @param e Any exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public TransformerException(Throwable e) {

    /**
     * Create a new TransformerException wrapping an existing exception.
     *
     * @param e The exception to be wrapped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public TransformerException(String message) {

    /**
     * Create a new TransformerException.
     *
     * @param message The error or warning message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public synchronized Throwable initCause(Throwable cause) {

    /**
     * Initializes the <i>cause</i> of this throwable to the specified value.
     * (The cause is the throwable that caused this throwable to get thrown.)
     *
     * <p>This method can be called at most once.  It is generally called from
     * within the constructor, or immediately after creating the
     * throwable.  If this throwable was created
     * with {@link #TransformerException(Throwable)} or
     * {@link #TransformerException(String,Throwable)}, this method cannot be called
     * even once.
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A <code>null</code> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @return  a reference to this <code>Throwable</code> instance.
     * @throws IllegalArgumentException if <code>cause</code> is this
     *         throwable.  (A throwable cannot
     *         be its own cause.)
     * @throws IllegalStateException if this throwable was
     *         created with {@link #TransformerException(Throwable)} or
     *         {@link #TransformerException(String,Throwable)}, or this method has already
     *         been called on this throwable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this throwable or <code>null</code> if the
     * cause is nonexistent or unknown.  (The cause is the throwable that
     * caused this throwable to get thrown.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public Throwable getException() {

    /**
     * This method retrieves an exception that this exception wraps.
     *
     * @return An Throwable object, or null.
     * @see #getCause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    Throwable containedException;

    /** Field containedException specifies a wrapped exception.  May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public void setLocator(SourceLocator location) {

    /**
     * Method setLocator sets an instance of a SourceLocator
     * object that specifies where an error occured.
     *
     * @param location A SourceLocator object, or null to clear the location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    public SourceLocator getLocator() {

    /**
     * Method getLocator retrieves an instance of a SourceLocator
     * object that specifies where an error occured.
     *
     * @return A SourceLocator object, or null if none was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
    SourceLocator locator;

    /** Field locator specifies where the error occured */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerException.java
public class TransformerException extends Exception {

/**
 * This class specifies an exceptional condition that occured
 * during the transformation process.
 */
