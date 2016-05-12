_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
    public int getReason();

    /**
     * Return the reason for the event.
     * @return one of the predefined reasons enumerated in this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
    public URI getUnsupportedURI();

    /**
     * Return the URI.
     * @return the URI that is the cause of this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
    public static final int URIOtherProblem = -1;

    /**
     * Indicates any kind of problem not specifically identified
     * by the other reasons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
    public static final int URISchemeNotSupported = 2;

    /**
     * Indicates that the printer does not support the URI
     * scheme ("http", "ftp", etc.) in the URI address.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
    public static final int URIInaccessible = 1;

    /**
     * Indicates that the printer cannot access the URI address.
     * For example, the printer might report this error if it goes to get
     * the print data and cannot even establish a connection to the
     * URI address.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/URIException.java
public interface URIException {

/**
 * Interface URIException is a mixin interface which a subclass of {@link
 * PrintException PrintException} can implement to report an error condition
 * involving a URI address. The Print Service API does not define any print
 * exception classes that implement interface URIException, that being left to
 * the Print Service implementor's discretion.
 *
 */
