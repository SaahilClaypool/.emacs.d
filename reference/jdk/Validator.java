_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public Object getProperty( String name ) throws PropertyException;

    /**
     * Get the particular property in the underlying implementation of
     * <tt>Validator</tt>.  This method can only be used to get one of
     * the standard JAXB defined properties above or a provider specific
     * property.  Attempting to get an undefined property will result in
     * a PropertyException being thrown.  See <a href="#supportedProps">
     * Supported Properties</a>.
     *
     * @param name the name of the property to retrieve
     * @return the value of the requested property
     *
     * @throws PropertyException
     *      when there is an error retrieving the given property or value
     *      property name
     * @throws IllegalArgumentException
     *      If the name parameter is null
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public void setProperty( String name, Object value )

    /**
     * Set the particular property in the underlying implementation of
     * <tt>Validator</tt>.  This method can only be used to set one of
     * the standard JAXB defined properties above or a provider specific
     * property.  Attempting to set an undefined property will result in
     * a PropertyException being thrown.  See <a href="#supportedProps">
     * Supported Properties</a>.
     *
     * @param name the name of the property to be set. This value can either
     *              be specified using one of the constant fields or a user
     *              supplied string.
     * @param value the value of the property to be set
     *
     * @throws PropertyException when there is an error processing the given
     *                            property or value
     * @throws IllegalArgumentException
     *      If the name parameter is null
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public boolean validateRoot( Object rootObj ) throws JAXBException;

    /**
     * Validate the Java content tree rooted at <tt>rootObj</tt>.
     * <p>
     * Client applications can use this method to validate Java content trees
     * on-demand at runtime.  This method is used to validate an entire Java
     * content tree.  Global constraint checking <b>will</b> be performed as
     * part of this operation (i.e. ID/IDREF constraints).
     *
     * @param rootObj the root obj to begin validation at
     * @throws JAXBException if any unexpected problem occurs during validation
     * @throws ValidationException
     *     If the {@link ValidationEventHandler ValidationEventHandler}
     *     returns false from its <tt>handleEvent</tt> method or the
     *     <tt>Validator</tt> is unable to validate the content tree rooted
     *     at <tt>rootObj</tt>
     * @throws IllegalArgumentException
     *      If the rootObj parameter is null
     * @return true if the tree rooted at <tt>rootObj</tt> is valid, false
     *         otherwise
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public boolean validate( Object subrootObj ) throws JAXBException;

    /**
     * Validate the Java content tree starting at <tt>subrootObj</tt>.
     * <p>
     * Client applications can use this method to validate Java content trees
     * on-demand at runtime.  This method can be used to validate any arbitrary
     * subtree of the Java content tree.  Global constraint checking <b>will not
     * </b> be performed as part of this operation (i.e. ID/IDREF constraints).
     *
     * @param subrootObj the obj to begin validation at
     * @throws JAXBException if any unexpected problem occurs during validation
     * @throws ValidationException
     *     If the {@link ValidationEventHandler ValidationEventHandler}
     *     returns false from its <tt>handleEvent</tt> method or the
     *     <tt>Validator</tt> is unable to validate the content tree rooted
     *     at <tt>subrootObj</tt>
     * @throws IllegalArgumentException
     *      If the subrootObj parameter is null
     * @return true if the subtree rooted at <tt>subrootObj</tt> is valid, false
     *         otherwise
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public ValidationEventHandler getEventHandler()

    /**
     * Return the current event handler or the default event handler if one
     * hasn't been set.
     *
     * @return the current ValidationEventHandler or the default event handler
     *         if it hasn't been set
     * @throws JAXBException if an error was encountered while getting the
     *         current event handler
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
    public void setEventHandler( ValidationEventHandler handler )

    /**
     * Allow an application to register a validation event handler.
     * <p>
     * The validation event handler will be called by the JAXB Provider if any
     * validation errors are encountered during calls to
     * {@link #validate(Object) validate}.  If the client application does not
     * register a validation event handler before invoking the validate method,
     * then validation events will be handled by the default event handler which
     * will terminate the validate operation after the first error or fatal error
     * is encountered.
     * <p>
     * Calling this method with a null parameter will cause the Validator
     * to revert back to the default default event handler.
     *
     * @param handler the validation event handler
     * @throws JAXBException if an error was encountered while setting the
     *         event handler
     * @deprecated since JAXB2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Validator.java
public interface Validator {

/**
 * As of JAXB 2.0, this class is deprecated and optional.
 * <p>
 * The <tt>Validator</tt> class is responsible for controlling the validation
 * of content trees during runtime.
 *
 * <p>
 * <a name="validationtypes"></a>
 * <b>Three Forms of Validation</b><br>
 * <blockquote>
 *    <dl>
 *        <dt><b>Unmarshal-Time Validation</b></dt>
 *        <dd>This form of validation enables a client application to receive
 *            information about validation errors and warnings detected while
 *            unmarshalling XML data into a Java content tree and is completely
 *            orthogonal to the other types of validation.  To enable or disable
 *            it, see the javadoc for
 *            {@link Unmarshaller#setValidating(boolean) Unmarshaller.setValidating}.
 *            All JAXB 1.0 Providers are required to support this operation.
 *        </dd>
 *
 *        <dt><b>On-Demand Validation</b></dt>
 *        <dd> This form of validation enables a client application to receive
 *             information about validation errors and warnings detected in the
 *             Java content tree.  At any point, client applications can call
 *             the {@link Validator#validate(Object) Validator.validate} method
 *             on the Java content tree (or any sub-tree of it).  All JAXB 1.0
 *             Providers are required to support this operation.
 *        </dd>
 *
 *        <dt><b>Fail-Fast Validation</b></dt>
 *        <dd> This form of validation enables a client application to receive
 *             immediate feedback about modifications to the Java content tree
 *             that violate type constraints on Java Properties as defined in
 *             the specification.  JAXB Providers are not required support
 *             this type of validation.  Of the JAXB Providers that do support
 *             this type of validation, some may require you to decide at schema
 *             compile time whether or not a client application will be allowed
 *             to request fail-fast validation at runtime.
 *        </dd>
 *    </dl>
 * </blockquote>
 *
 * <p>
 * The <tt>Validator</tt> class is responsible for managing On-Demand Validation.
 * The <tt>Unmarshaller</tt> class is responsible for managing Unmarshal-Time
 * Validation during the unmarshal operations.  Although there is no formal
 * method of enabling validation during the marshal operations, the
 * <tt>Marshaller</tt> may detect errors, which will be reported to the
 * <tt>ValidationEventHandler</tt> registered on it.
 *
 * <p>
 * <a name="defaulthandler"></a>
 * <b>Using the Default EventHandler</b><br>
 * <blockquote>
 *   If the client application does not set an event handler on their
 *   <tt>Validator</tt>, <tt>Unmarshaller</tt>, or <tt>Marshaller</tt> prior to
 *   calling the validate, unmarshal, or marshal methods, then a default event
 *   handler will receive notification of any errors or warnings encountered.
 *   The default event handler will cause the current operation to halt after
 *   encountering the first error or fatal error (but will attempt to continue
 *   after receiving warnings).
 * </blockquote>
 *
 * <p>
 * <a name="handlingevents"></a>
 * <b>Handling Validation Events</b><br>
 * <blockquote>
 *   There are three ways to handle events encountered during the unmarshal,
 *   validate, and marshal operations:
 *    <dl>
 *        <dt>Use the default event handler</dt>
 *        <dd>The default event handler will be used if you do not specify one
 *            via the <tt>setEventHandler</tt> API's on <tt>Validator</tt>,
 *            <tt>Unmarshaller</tt>, or <tt>Marshaller</tt>.
 *        </dd>
 *
 *        <dt>Implement and register a custom event handler</dt>
 *        <dd>Client applications that require sophisticated event processing
 *            can implement the <tt>ValidationEventHandler</tt> interface and
 *            register it with the <tt>Unmarshaller</tt> and/or
 *            <tt>Validator</tt>.
 *        </dd>
 *
 *        <dt>Use the {@link javax.xml.bind.util.ValidationEventCollector ValidationEventCollector}
 *            utility</dt>
 *        <dd>For convenience, a specialized event handler is provided that
 *            simply collects any <tt>ValidationEvent</tt> objects created
 *            during the unmarshal, validate, and marshal operations and
 *            returns them to the client application as a
 *            <tt>java.util.Collection</tt>.
 *        </dd>
 *    </dl>
 * </blockquote>
 *
 * <p>
 * <b>Validation and Well-Formedness</b><br>
 * <blockquote>
 * <p>
 * Validation events are handled differently depending on how the client
 * application is configured to process them as described in the previous
 * section.  However, there are certain cases where a JAXB Provider indicates
 * that it is no longer able to reliably detect and report errors.  In these
 * cases, the JAXB Provider will set the severity of the ValidationEvent to
 * FATAL_ERROR to indicate that the unmarshal, validate, or marshal operations
 * should be terminated.  The default event handler and
 * <tt>ValidationEventCollector</tt> utility class must terminate processing
 * after being notified of a fatal error.  Client applications that supply their
 * own <tt>ValidationEventHandler</tt> should also terminate processing after
 * being notified of a fatal error.  If not, unexpected behaviour may occur.
 * </blockquote>
 *
 * <p>
 * <a name="supportedProps"></a>
 * <b>Supported Properties</b><br>
 * <blockquote>
 * <p>
 * There currently are not any properties required to be supported by all
 * JAXB Providers on Validator.  However, some providers may support
 * their own set of provider specific properties.
 * </blockquote>
 *
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul>
 * @see JAXBContext
 * @see Unmarshaller
 * @see ValidationEventHandler
 * @see ValidationEvent
 * @see javax.xml.bind.util.ValidationEventCollector
 * @since JAXB1.0
 * @deprecated since JAXB 2.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public Object getProperty(String name)

    /**
     * Look up the value of a property.
     *
     * <p>The property name is any fully-qualified URI.  It is
     * possible for a {@link Validator} to recognize a property name but
     * temporarily be unable to return its value.
     * Some property values may be available only in specific
     * contexts, such as before, during, or after a validation.</p>
     *
     * <p>{@link Validator}s are not required to recognize any specific
     * property names.</p>
     *
     * <p>Implementors are free (and encouraged) to invent their own properties,
     * using names built on their own URIs.</p>
     *
     * @param name The property name, which is a non-null fully-qualified URI.
     *
     * @return The current value of the property.
     *
     * @throws SAXNotRecognizedException If the property
     *   value can't be assigned or retrieved.
     * @throws SAXNotSupportedException When the
     *   XMLReader recognizes the property name but
     *   cannot determine its value at this time.
     * @throws NullPointerException
     *   When the name parameter is null.
     *
     * @see #setProperty(String, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public void setProperty(String name, Object object)

    /**
     * Set the value of a property.
     *
     * <p>The property name is any fully-qualified URI.  It is
     * possible for a {@link Validator} to recognize a property name but
     * to be unable to change the current value.
     * Some property values may be immutable or mutable only
     * in specific contexts, such as before, during, or after
     * a validation.</p>
     *
     * <p>
     * All implementations that implement JAXP 1.5 or newer are required to
     * support the {@link javax.xml.XMLConstants#ACCESS_EXTERNAL_DTD} and
     * {@link javax.xml.XMLConstants#ACCESS_EXTERNAL_SCHEMA} properties.
     * </p>
     * <ul>
     *   <li>
     *      <p>Access to external DTDs in source or Schema file is restricted to
     *      the protocols specified by the {@link javax.xml.XMLConstants#ACCESS_EXTERNAL_DTD}
     *      property.  If access is denied during validation due to the restriction
     *      of this property, {@link org.xml.sax.SAXException} will be thrown by the
     *      {@link #validate(Source)} method.</p>
     *
     *      <p>Access to external reference set by the schemaLocation attribute is
     *      restricted to the protocols specified by the
     *      {@link javax.xml.XMLConstants#ACCESS_EXTERNAL_SCHEMA} property.
     *      If access is denied during validation due to the restriction of this property,
     *      {@link org.xml.sax.SAXException} will be thrown by the
     *      {@link #validate(Source)} method.</p>
     *   </li>
     * </ul>
     *
     * @param name The property name, which is a non-null fully-qualified URI.
     * @param object The requested value for the property.
     *
     * @throws SAXNotRecognizedException If the property
     *   value can't be assigned or retrieved.
     * @throws SAXNotSupportedException When the
     *   {@link Validator} recognizes the property name but
     *   cannot set the requested value.
     * @throws NullPointerException
     *   When the name parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public void setFeature(String name, boolean value)

    /**
     * Set the value of a feature flag.
     *
     * <p>
     * Feature can be used to control the way a {@link Validator}
     * parses schemas, although {@link Validator}s are not required
     * to recognize any specific feature names.</p>
     *
     * <p>The feature name is any fully-qualified URI.  It is
     * possible for a {@link Validator} to expose a feature value but
     * to be unable to change the current value.
     * Some feature values may be immutable or mutable only
     * in specific contexts, such as before, during, or after
     * a validation.</p>
     *
     * @param name The feature name, which is a non-null fully-qualified URI.
     * @param value The requested value of the feature (true or false).
     *
     * @throws SAXNotRecognizedException If the feature
     *   value can't be assigned or retrieved.
     * @throws SAXNotSupportedException When the
     *   {@link Validator} recognizes the feature name but
     *   cannot set the requested value.
     * @throws NullPointerException
     *   When the name parameter is null.
     *
     * @see #getFeature(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public boolean getFeature(String name)

    /**
     * Look up the value of a feature flag.
     *
     * <p>The feature name is any fully-qualified URI.  It is
     * possible for a {@link Validator} to recognize a feature name but
     * temporarily be unable to return its value.
     * Some feature values may be available only in specific
     * contexts, such as before, during, or after a validation.
     *
     * <p>Implementors are free (and encouraged) to invent their own features,
     * using names built on their own URIs.</p>
     *
     * @param name The feature name, which is a non-null fully-qualified URI.
     *
     * @return The current value of the feature (true or false).
     *
     * @throws SAXNotRecognizedException If the feature
     *   value can't be assigned or retrieved.
     * @throws SAXNotSupportedException When the
     *   {@link Validator} recognizes the feature name but
     *   cannot determine its value at this time.
     * @throws NullPointerException
     *   When the name parameter is null.
     *
     * @see #setFeature(String, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public abstract LSResourceResolver getResourceResolver();

    /**
     * Gets the current {@link LSResourceResolver} set to this {@link Validator}.
     *
     * @return
     *      This method returns the object that was last set through
     *      the {@link #setResourceResolver(LSResourceResolver)} method, or null
     *      if that method has never been called since this {@link Validator}
     *      has created.
     *
     * @see #setErrorHandler(ErrorHandler)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public abstract void setResourceResolver(LSResourceResolver resourceResolver);

    /**
     * Sets the {@link LSResourceResolver} to customize
     * resource resolution while in a validation episode.
     *
     * <p>
     * {@link Validator} uses a {@link LSResourceResolver}
     * when it needs to locate external resources while a validation,
     * although exactly what constitutes "locating external resources" is
     * up to each schema language.
     *
     * <p>
     * When the {@link LSResourceResolver} is null, the implementation will
     * behave as if the following {@link LSResourceResolver} is set:
     * <pre>
     * class DumbLSResourceResolver implements {@link LSResourceResolver} {
     *     public {@link org.w3c.dom.ls.LSInput} resolveResource(
     *         String publicId, String systemId, String baseURI) {
     *
     *         return null; // always return null
     *     }
     * }
     * </pre>
     *
     * <p>
     * If a {@link LSResourceResolver} throws a {@link RuntimeException}
     *  (or instances of its derived classes),
     * then the {@link Validator} will abort the parsing and
     * the caller of the <code>validate</code> method will receive
     * the same {@link RuntimeException}.
     *
     * <p>
     * When a new {@link Validator} object is created, initially
     * this field is set to null.
     *
     * @param   resourceResolver
     *      A new resource resolver to be set. This parameter can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public abstract ErrorHandler getErrorHandler();

    /**
     * Gets the current {@link ErrorHandler} set to this {@link Validator}.
     *
     * @return
     *      This method returns the object that was last set through
     *      the {@link #setErrorHandler(ErrorHandler)} method, or null
     *      if that method has never been called since this {@link Validator}
     *      has created.
     *
     * @see #setErrorHandler(ErrorHandler)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public abstract void setErrorHandler(ErrorHandler errorHandler);

    /**
     * Sets the {@link ErrorHandler} to receive errors encountered
     * during the <code>validate</code> method invocation.
     *
     * <p>
     * Error handler can be used to customize the error handling process
     * during a validation. When an {@link ErrorHandler} is set,
     * errors found during the validation will be first sent
     * to the {@link ErrorHandler}.
     *
     * <p>
     * The error handler can abort further validation immediately
     * by throwing {@link SAXException} from the handler. Or for example
     * it can print an error to the screen and try to continue the
     * validation by returning normally from the {@link ErrorHandler}
     *
     * <p>
     * If any {@link Throwable} is thrown from an {@link ErrorHandler},
     * the caller of the <code>validate</code> method will be thrown
     * the same {@link Throwable} object.
     *
     * <p>
     * {@link Validator} is not allowed to
     * throw {@link SAXException} without first reporting it to
     * {@link ErrorHandler}.
     *
     * <p>
     * When the {@link ErrorHandler} is null, the implementation will
     * behave as if the following {@link ErrorHandler} is set:
     * <pre>
     * class DraconianErrorHandler implements {@link ErrorHandler} {
     *     public void fatalError( {@link org.xml.sax.SAXParseException} e ) throws {@link SAXException} {
     *         throw e;
     *     }
     *     public void error( {@link org.xml.sax.SAXParseException} e ) throws {@link SAXException} {
     *         throw e;
     *     }
     *     public void warning( {@link org.xml.sax.SAXParseException} e ) throws {@link SAXException} {
     *         // noop
     *     }
     * }
     * </pre>
     *
     * <p>
     * When a new {@link Validator} object is created, initially
     * this field is set to null.
     *
     * @param   errorHandler
     *      A new error handler to be set. This parameter can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public abstract void validate(Source source, Result result)

    /**
     * <p>Validates the specified input and send the augmented validation
     * result to the specified output.</p>
     *
     * <p>This method places the following restrictions on the types of
     * the {@link Source}/{@link Result} accepted.</p>
     *
     * <table border=1>
     * <thead>
     *  <tr>
     *   <th colspan="5"><code>Source</code> / <code>Result</code> Accepted</th>
     *  </tr>
     *  <tr>
     *   <th></th>
     *   <th>{@link javax.xml.transform.stream.StreamSource}</th>
     *   <th>{@link javax.xml.transform.sax.SAXSource}</th>
     *   <th>{@link javax.xml.transform.dom.DOMSource}</th>
     *   <th>{@link javax.xml.transform.stax.StAXSource}</th>
     *  </tr>
     * </thead>
     * <tbody align="center">
     *  <tr>
     *   <td><code>null</code></td>
     *   <td>OK</td>
     *   <td>OK</td>
     *   <td>OK</td>
     *   <td>OK</td>
     *  </tr>
     *  <tr>
     *   <th>{@link javax.xml.transform.stream.StreamResult}</th>
     *   <td>OK</td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *  </tr>
     *  <tr>
     *   <th>{@link javax.xml.transform.sax.SAXResult}</th>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td>OK</td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *  </tr>
     *  <tr>
     *   <th>{@link javax.xml.transform.dom.DOMResult}</th>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td>OK</td>
     *   <td><code>IllegalArgumentException</code></td>
     *  </tr>
     *  <tr>
     *   <th>{@link javax.xml.transform.stax.StAXResult}</th>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td><code>IllegalArgumentException</code></td>
     *   <td>OK</td>
     *  </tr>
     * </tbody>
     * </table>
     *
     * <p>To validate one <code>Source</code> into another kind of
     * <code>Result</code>, use the identity transformer (see
     * {@link javax.xml.transform.TransformerFactory#newTransformer()}).</p>
     *
     * <p>Errors found during the validation is sent to the specified
     * {@link ErrorHandler}.</p>
     *
     * <p>If a document is valid, or if a document contains some errors
     * but none of them were fatal and the <code>ErrorHandler</code> didn't
     * throw any exception, then the method returns normally.</p>
     *
     * @param source
     *      XML to be validated. Must be an XML document or
     *      XML element and must not be null. For backwards compatibility,
     *      the results of attempting to validate anything other than
     *      a document or element are implementation-dependent.
     *      Implementations must either recognize and process the input
     *      or throw an IllegalArgumentException.
     *
     * @param result
     *      The <code>Result</code> object that receives (possibly augmented)
     *      XML. This parameter can be null if the caller is not interested
     *      in it.
     *
     *      Note that when a <code>DOMResult</code> is used,
     *      a validator might just pass the same DOM node from
     *      <code>DOMSource</code> to <code>DOMResult</code>
     *      (in which case <code>source.getNode()==result.getNode()</code>),
     *      it might copy the entire DOM tree, or it might alter the
     *      node given by the source.
     *
     * @throws IllegalArgumentException
     *      If the <code>Result</code> type doesn't match the
     *      <code>Source</code> type of if the <code>Source</code>
     *      is an XML artifact that the implementation cannot
     *      validate (for example, a processing instruction).
     * @throws SAXException
     *      If the <code>ErrorHandler</code> throws a
     *      <code>SAXException</code> or
     *      if a fatal error is found and the <code>ErrorHandler</code> returns
     *      normally.
     * @throws IOException
     *      If the validator is processing a
     *      <code>SAXSource</code> and the
     *      underlying {@link org.xml.sax.XMLReader} throws an
     *      <code>IOException</code>.
     * @throws NullPointerException
     *      If the <code>source</code> parameter is <code>null</code>.
     *
     * @see #validate(Source source)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    public void validate(Source source)

    /**
     * Validates the specified input.
     *
     * <p>This is just a convenience method for
     * {@link #validate(Source source, Result result)}
     * with <code>result</code> of <code>null</code>.</p>
     *
     * @param source
     *      XML to be validated. Must be an XML document or
     *      XML element and must not be null. For backwards compatibility,
     *      the results of attempting to validate anything other than
     *      a document or element are implementation-dependent.
     *      Implementations must either recognize and process the input
     *      or throw an IllegalArgumentException.
     *
     * @throws IllegalArgumentException
     *      If the <code>Source</code>
     *      is an XML artifact that the implementation cannot
     *      validate (for example, a processing instruction).
     *
     * @throws SAXException
     *      If the {@link ErrorHandler} throws a {@link SAXException} or
     *      if a fatal error is found and the {@link ErrorHandler} returns
     *      normally.
     *
     * @throws IOException
     *      If the validator is processing a
     *      {@link javax.xml.transform.sax.SAXSource} and the
     *      underlying {@link org.xml.sax.XMLReader} throws an
     *      {@link IOException}.
     *
     *
     * @throws NullPointerException If <code>source</code> is
     *   <code>null</code>.
     *
     * @see #validate(Source source, Result result)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
        public abstract void reset();

        /**
         * <p>Reset this <code>Validator</code> to its original configuration.</p>
         *
         * <p><code>Validator</code> is reset to the same state as when it was created with
         * {@link Schema#newValidator()}.
         * <code>reset()</code> is designed to allow the reuse of existing <code>Validator</code>s
         * thus saving resources associated with the creation of new <code>Validator</code>s.</p>
         *
         * <p>The reset <code>Validator</code> is not guaranteed to have the same {@link LSResourceResolver} or {@link ErrorHandler}
         * <code>Object</code>s, e.g. {@link Object#equals(Object obj)}.  It is guaranteed to have a functionally equal
         * <code>LSResourceResolver</code> and <code>ErrorHandler</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
    protected Validator() {

    /**
     * Constructor for derived classes.
     *
     * <p>The constructor does nothing.</p>
     *
     * <p>Derived classes must create {@link Validator} objects that have
     * <code>null</code> {@link ErrorHandler} and
     * <code>null</code> {@link LSResourceResolver}.
     * </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/Validator.java
public abstract class Validator {

/**
 * <p>A processor that checks an XML document against {@link Schema}.</p>
 *
 * <p>
 * A validator object is not thread-safe and not reentrant.
 * In other words, it is the application's responsibility to make
 * sure that one {@link Validator} object is not used from
 * more than one thread at any given time, and while the <code>validate</code>
 * method is invoked, applications may not recursively call
 * the <code>validate</code> method.
 * <p>
 *
 *
 * @author  <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @since 1.5
 */
