_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/Source.java
    public String getSystemId();

    /**
     * Get the system identifier that was set with setSystemId.
     *
     * @return The system identifier that was set with setSystemId, or null
     * if setSystemId was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/Source.java
    public void setSystemId(String systemId);

    /**
     * Set the system identifier for this Source.
     *
     * <p>The system identifier is optional if the source does not
     * get its data from a URL, but it may still be useful to provide one.
     * The application can use a system identifier, for example, to resolve
     * relative URIs and to include in error messages and warnings.</p>
     *
     * @param systemId The system identifier as a URL string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/Source.java
public interface Source {

/**
 * An object that implements this interface contains the information
 * needed to act as source input (XML source or transformation instructions).
 */
