_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public Object getProperty( String name )

    /**
     * Default implementation of the getProperty method always
     * throws PropertyException since there are no required
     * properties. If a provider needs to handle additional
     * properties, it should override this method in a derived class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public void setProperty( String name, Object value )

    /**
     * Default implementation of the setProperty method always
     * throws PropertyException since there are no required
     * properties. If a provider needs to handle additional
     * properties, it should override this method in a derived class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    protected UnmarshalException createUnmarshalException( SAXException e ) {

    /**
     * Creates an UnmarshalException from a SAXException.
     *
     * This is an utility method provided for the derived classes.
     *
     * <p>
     * When a provider-implemented ContentHandler wants to throw a
     * JAXBException, it needs to wrap the exception by a SAXException.
     * If the unmarshaller implementation blindly wrap SAXException
     * by JAXBException, such an exception will be a JAXBException
     * wrapped by a SAXException wrapped by another JAXBException.
     * This is silly.
     *
     * <p>
     * This method checks the nested exception of SAXException
     * and reduce those excessive wrapping.
     *
     * @return the resulting UnmarshalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public ValidationEventHandler getEventHandler() throws JAXBException {

    /**
     * Return the current event handler or the default event handler if one
     * hasn't been set.
     *
     * @return the current ValidationEventHandler or the default event handler
     *        if it hasn't been set
     * @throws JAXBException if an error was encountered while getting the
     *        current event handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public void setValidating(boolean validating) throws JAXBException {

    /**
     * Specifies whether or not the Unmarshaller should validate during
     * unmarshal operations.  By default, the <tt>Unmarshaller</tt> does
     * not validate.
     * <p>
     * This method may only be invoked before or after calling one of the
     * unmarshal methods.
     *
     * @param validating true if the Unmarshaller should validate during
     *       unmarshal, false otherwise
     * @throws JAXBException if an error occurred while enabling or disabling
     * validation at unmarshal time
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public void setEventHandler(ValidationEventHandler handler)

    /**
     * Allow an application to register a validation event handler.
     * <p>
     * The validation event handler will be called by the JAXB Provider if any
     * validation errors are encountered during calls to any of the
     * <tt>unmarshal</tt> methods.  If the client application does not register
     * a validation event handler before invoking the unmarshal methods, then
     * all validation events will be silently ignored and may result in
     * unexpected behaviour.
     *
     * @param handler the validation event handler
     * @throws JAXBException if an error was encountered while setting the
     *        event handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    public boolean isValidating() throws JAXBException {

    /**
     * Indicates whether or not the Unmarshaller is configured to validate
     * during unmarshal operations.
     * <p>
     * <i><b>Note:</b> I named this method isValidating() to stay in-line
     * with JAXP, as opposed to naming it getValidating(). </i>
     *
     * @return true if the Unmarshaller is configured to validate during
     *        unmarshal operations, false otherwise
     * @throws JAXBException if an error occurs while retrieving the validating
     *        flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    protected abstract Object unmarshal( XMLReader reader, InputSource source ) throws JAXBException;

    /**
     * Unmarshals an object by using the specified XMLReader and the InputSource.
     *
     * The callee should call the setErrorHandler method of the XMLReader
     * so that errors are passed to the client-specified ValidationEventHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    protected XMLReader getXMLReader() throws JAXBException {

    /**
     * Obtains a configured XMLReader.
     *
     * This method is used when the client-specified
     * {@link SAXSource} object doesn't have XMLReader.
     *
     * {@link Unmarshaller} is not re-entrant, so we will
     * only use one instance of XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    private XMLReader reader = null;

    /**
     * XMLReader that will be used to parse a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    protected boolean validating = false;

    /** whether or not the unmarshaller will validate */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
    private ValidationEventHandler eventHandler =

    /** handler that will be used to process errors and warnings during unmarshal */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/AbstractUnmarshallerImpl.java
public abstract class AbstractUnmarshallerImpl implements Unmarshaller

/**
 * Partial default <tt>Unmarshaller</tt> implementation.
 *
 * <p>
 * This class provides a partial default implementation for the
 * {@link javax.xml.bind.Unmarshaller}interface.
 *
 * <p>
 * A JAXB Provider has to implement five methods (getUnmarshallerHandler,
 * unmarshal(Node), unmarshal(XMLReader,InputSource),
 * unmarshal(XMLStreamReader), and unmarshal(XMLEventReader).
 *
 * @author <ul>
 *         <li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li>
 *         </ul>
 * @see javax.xml.bind.Unmarshaller
 * @since JAXB1.0
 */
