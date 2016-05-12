_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/PrintConversionEventImpl.java
    public PrintConversionEventImpl( int _severity, String _message,
                                      ValidationEventLocator _locator,
                                      Throwable _linkedException) {

    /**
     * Create a new PrintConversionEventImpl.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/PrintConversionEventImpl.java
    public PrintConversionEventImpl( int _severity, String _message,
                                      ValidationEventLocator _locator) {

    /**
     * Create a new PrintConversionEventImpl.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/PrintConversionEventImpl.java
public class PrintConversionEventImpl

/**
 * Default implementation of the PrintConversionEvent interface.
 *
 * <p>
 * JAXB providers are allowed to use whatever class that implements
 * the ValidationEvent interface. This class is just provided for a
 * convenience.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see javax.xml.bind.PrintConversionEvent
 * @see javax.xml.bind.Validator
 * @see javax.xml.bind.ValidationEventHandler
 * @see javax.xml.bind.ValidationEvent
 * @see javax.xml.bind.ValidationEventLocator
 * @since JAXB1.0
 */
