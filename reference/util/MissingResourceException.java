_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    private String key;

    /**
     * The name of the specific resource requested by the user.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    private String className;

    /**
     * The class name of the resource bundle requested by the user.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    public String getKey() {

    /**
     * Gets parameter passed by constructor.
     *
     * @return the key for the missing resource
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    public String getClassName() {

    /**
     * Gets parameter passed by constructor.
     *
     * @return the name of the resource class
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    MissingResourceException(String message, String className, String key, Throwable cause) {

    /**
     * Constructs a <code>MissingResourceException</code> with
     * <code>message</code>, <code>className</code>, <code>key</code>,
     * and <code>cause</code>. This constructor is package private for
     * use by <code>ResourceBundle.getBundle</code>.
     *
     * @param message
     *        the detail message
     * @param className
     *        the name of the resource class
     * @param key
     *        the key for the missing resource.
     * @param cause
     *        the cause (which is saved for later retrieval by the
     *        {@link Throwable.getCause()} method). (A null value is
     *        permitted, and indicates that the cause is nonexistent
     *        or unknown.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
    public MissingResourceException(String s, String className, String key) {

    /**
     * Constructs a MissingResourceException with the specified information.
     * A detail message is a String that describes this particular exception.
     * @param s the detail message
     * @param className the name of the resource class
     * @param key the key for the missing resource.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//MissingResourceException.java
public

/**
 * Signals that a resource is missing.
 * @see java.lang.Exception
 * @see ResourceBundle
 * @author      Mark Davis
 * @since       JDK1.1
 */
