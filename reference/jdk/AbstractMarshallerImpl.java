_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    public void setEventHandler(ValidationEventHandler handler)

    /**
     * @see javax.xml.bind.Marshaller#setEventHandler(ValidationEventHandler)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    public ValidationEventHandler getEventHandler() throws JAXBException {

    /**
     * @see javax.xml.bind.Marshaller#getEventHandler()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    public Object getProperty( String name )

    /**
     * Default implementation of the getProperty method handles
     * the four defined properties in Marshaller.  If a provider
     * needs to support additional provider specific properties,
     * it should override this method in a derived class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    public void setProperty( String name, Object value )

    /**
     * Default implementation of the setProperty method handles
     * the four defined properties in Marshaller. If a provider
     * needs to handle additional properties, it should override
     * this method in a derived class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected String getJavaEncoding( String encoding ) throws UnsupportedEncodingException {

    /**
     * Gets the corresponding Java encoding name from an IANA name.
     *
     * This method is a helper method for the derived class to convert
     * encoding names.
     *
     * @exception UnsupportedEncodingException
     *      If this implementation couldn't find the Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected void setFragment( boolean v ) {

    /**
     * Convenience method for setting the fragment flag.
     *
     * @param v value of the fragment flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected boolean isFragment() {

    /**
     * Convenience method for getting the fragment flag.
     *
     * @return the current value of the fragment flag or false if
     * it hasn't been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected void setFormattedOutput( boolean v ) {

    /**
     * Convenience method for setting the formatted output flag.
     *
     * @param v value of the formatted output flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected boolean isFormattedOutput() {

    /**
     * Convenience method for getting the formatted output flag.
     *
     * @return the current value of the formatted output flag or false if
     * it hasn't been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected void setNoNSSchemaLocation( String location ) {

    /**
     * Convenience method for setting the noNamespaceSchemaLocation.
     *
     * @param location the noNamespaceSchemaLocation value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected String getNoNSSchemaLocation() {

    /**
     * Convenience method for getting the current noNamespaceSchemaLocation.
     *
     * @return the current noNamespaceSchemaLocation or null if it hasn't
     * been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected void setSchemaLocation( String location ) {

    /**
     * Convenience method for setting the schemaLocation.
     *
     * @param location the schemaLocation value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected String getSchemaLocation() {

    /**
     * Convenience method for getting the current schemaLocation.
     *
     * @return the current schemaLocation or null if it hasn't been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected void setEncoding( String encoding ) {

    /**
     * Convenience method for setting the output encoding.
     *
     * @param encoding a valid encoding as specified in the Marshaller class
     * documentation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    protected String getEncoding() {

    /**
     * Convenience method for getting the current output encoding.
     *
     * @return the current encoding or "UTF-8" if it hasn't been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    public org.w3c.dom.Node getNode( Object obj ) throws JAXBException {

    /**
     * By default, the getNode method is unsupported and throw
     * an {@link java.lang.UnsupportedOperationException}.
     *
     * Implementations that choose to support this method must
     * override this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private boolean fragment = false;

    /** store the value of the fragment property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private boolean formattedOutput = false;

    /** store the value of the formattedOutput property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private String noNSSchemaLocation = null;

    /** store the value of the noNamespaceSchemaLocation property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private String schemaLocation = null;

    /** store the value of the schemaLocation property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private String encoding = "UTF-8";

    /** store the value of the encoding property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
    private ValidationEventHandler eventHandler =

    /** handler that will be used to process errors and warnings during marshal */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractMarshallerImpl.java
public abstract class AbstractMarshallerImpl implements Marshaller

/**
 * Partial default <tt>Marshaller</tt> implementation.
 *
 * <p>
 * This class provides a partial default implementation for the
 * {@link javax.xml.bind.Marshaller} interface.
 *
 * <p>
 * The only methods that a JAXB Provider has to implement are
 * {@link Marshaller#marshal(Object, javax.xml.transform.Result) marshal(Object, javax.xml.transform.Result)},
 * {@link Marshaller#marshal(Object, javax.xml.transform.Result) marshal(Object, javax.xml.stream.XMLStreamWriter)}, and
 * {@link Marshaller#marshal(Object, javax.xml.transform.Result) marshal(Object, javax.xml.stream.XMLEventWriter)}.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li></ul>
 * @see javax.xml.bind.Marshaller
 * @since JAXB1.0
 */
