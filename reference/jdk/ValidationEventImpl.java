_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public String toString() {

    /**
     * Returns a string representation of this object in a format
     * helpful to debugging.
     *
     * @see Object#equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public void setLocator( ValidationEventLocator _locator ) {

    /**
     * Set the locator object for this event.
     *
     * @param _locator The locator - may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public void setLinkedException( Throwable _linkedException ) {

    /**
     * Set the linked exception field of this event.
     *
     * @param _linkedException Optional linked exception - may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public void setMessage( String _message ) {

    /**
     * Set the message field of this event.
     *
     * @param _message String message - may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public void setSeverity( int _severity ) {

    /**
     * Set the severity field of this event.
     *
     * @param _severity Must be one of ValidationEvent.WARNING,
     * ValidationEvent.ERROR, or ValidationEvent.FATAL_ERROR.
     * @throws IllegalArgumentException if an illegal severity field is supplied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public ValidationEventImpl( int _severity, String _message,
                                 ValidationEventLocator _locator,
                                 Throwable _linkedException ) {

    /**
     * Create a new ValidationEventImpl.
     *
     * @param _severity The severity value for this event.  Must be one of
     * ValidationEvent.WARNING, ValidationEvent.ERROR, or
     * ValidationEvent.FATAL_ERROR
     * @param _message The text message for this event - may be null.
     * @param _locator The locator object for this event - may be null.
     * @param _linkedException An optional linked exception that may provide
     * additional information about the event - may be null.
     * @throws IllegalArgumentException if an illegal severity field is supplied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
    public ValidationEventImpl( int _severity, String _message,
                                 ValidationEventLocator _locator ) {

    /**
     * Create a new ValidationEventImpl.
     *
     * @param _severity The severity value for this event.  Must be one of
     * ValidationEvent.WARNING, ValidationEvent.ERROR, or
     * ValidationEvent.FATAL_ERROR
     * @param _message The text message for this event - may be null.
     * @param _locator The locator object for this event - may be null.
     * @throws IllegalArgumentException if an illegal severity field is supplied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/ValidationEventImpl.java
public class ValidationEventImpl implements ValidationEvent

/**
 * Default implementation of the ValidationEvent interface.
 *
 * <p>
 * JAXB providers are allowed to use whatever class that implements
 * the ValidationEvent interface. This class is just provided for a
 * convenience.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li></ul>
 * @see javax.xml.bind.Validator
 * @see javax.xml.bind.ValidationEventHandler
 * @see javax.xml.bind.ValidationEvent
 * @see javax.xml.bind.ValidationEventLocator
 * @since JAXB1.0
 */
