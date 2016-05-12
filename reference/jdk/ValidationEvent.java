_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public ValidationEventLocator getLocator();

    /**
     * Retrieve the locator for this warning/error.
     *
     * @return the locator that indicates where the warning/error occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public Throwable getLinkedException();

    /**
     * Retrieve the linked exception for this warning/error.
     *
     * @return the linked exception for this warning/error or null if one
     *         wasn't set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public String getMessage();

    /**
     * Retrieve the text message for this warning/error.
     *
     * @return the text message for this warning/error or null if one wasn't set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public int getSeverity();

    /**
     * Retrieve the severity code for this warning/error.
     *
     * <p>
     * Must be one of <tt>ValidationError.WARNING</tt>,
     * <tt>ValidationError.ERROR</tt>, or <tt>ValidationError.FATAL_ERROR</tt>.
     *
     * @return the severity code for this warning/error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public static final int FATAL_ERROR = 2;

    /**
     * Conditions that correspond to the definition of "fatal error" in section
     * 1.2 of the W3C XML 1.0 Recommendation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public static final int ERROR       = 1;

    /**
     * Conditions that correspond to the definition of "error" in section
     * 1.2 of the W3C XML 1.0 Recommendation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
    public static final int WARNING     = 0;

    /**
     * Conditions that are not errors or fatal errors as defined by the
     * XML 1.0 recommendation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationEvent.java
public interface ValidationEvent {

/**
 * This event indicates that a problem was encountered while validating the
 * incoming XML data during an unmarshal operation, while performing
 * on-demand validation of the Java content tree, or while marshalling the
 * Java content tree back to XML data.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul>
 * @see Validator
 * @see ValidationEventHandler
 * @since JAXB1.0
 */
