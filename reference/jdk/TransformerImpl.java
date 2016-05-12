_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * This method resets  the Transformer to its original configuration
     * Transformer code is reset to the same state it was when it was
     * created
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a warning.
     * Transformers can use this method to report conditions that are not
     * errors or fatal errors. The default behaviour is to take no action.
     * After invoking this method, the Transformer must continue with the
     * transformation. It should still be possible for the application to
     * process the document through to the end.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (never does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a non-recoverable error.
     * The application must assume that the transformation cannot continue
     * after the Transformer has invoked this method, and should continue
     * (if at all) only to collect addition error messages. In fact,
     * Transformers are free to stop reporting events once this method has
     * been invoked.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a recoverable error.
     * The transformer must continue to provide normal parsing events after
     * invoking this method. It should still be possible for the application
     * to process the document through to the end.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * This class should only be used as a DOMCache for the translet if the
     * URIResolver has been set.
     *
     * The method implements XSLTC's DOMCache interface, which is used to
     * plug in an external document loader into a translet. This method acts
     * as an adapter between TrAX's URIResolver interface and XSLTC's
     * DOMCache interface. This approach is simple, but removes the
     * possibility of using external document caches with XSLTC.
     *
     * @param baseURI The base URI used by the document call.
     * @param href The href argument passed to the document function.
     * @param translet A reference to the translet requesting the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setURIResolver()
     * Set an object that will be used to resolve URIs used in document().
     *
     * @param resolver The URIResolver to use in document()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getURIResolver()
     * Set the object currently used to resolve URIs used in document().
     *
     * @return  The URLResolver object currently in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getParameter()
     * Returns the value of a given parameter. Note that the translet will not
     * keep values for parameters that were not defined in the stylesheet.
     *
     * @param name The name of the parameter
     * @return An object that contains the value assigned to the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.clearParameters()
     * Clear all parameters set with setParameter. Clears the translet's
     * parameter stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setParameter()
     * Add a parameter for the transformation. The parameter is simply passed
     * on to the translet - no validation is performed - so any unused
     * parameters are quitely ignored by the translet.
     *
     * @param name The name of the parameter
     * @param value The value to assign to the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean isDefaultProperty(String name, Properties properties) {

    /**
     * Checks if a given output property is default (2nd layer only)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean validOutputProperty(String name) {

    /**
     * Verifies if a given output property name is a property defined in
     * the JAXP 1.1 / TrAX spec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
        private void setDefaults(Properties props, String method)

        /**
         * Internal method to get the default properties from the
         * serializer factory and set them on the property object.
         * @param props a java.util.Property object on which the properties are set.
         * @param method The output method type, one of "xml", "text", "html" ...
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Properties createOutputProperties(Properties outputProperties) {

    /**
     * Internal method to create the initial set of properties. There
     * are two layers of properties: the default layer and the base layer.
     * The latter contains properties defined in the stylesheet or by
     * the user using this API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void transferOutputProperties(SerializationHandler handler)

    /**
     * This method is used to pass any properties to the output handler
     * when running the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void transferOutputProperties(AbstractTranslet translet)

    /**
     * Internal method to pass any properties to the translet prior to
     * initiating the transformation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setOutputProperty().
     * Get an output property that is in effect for the transformation. The
     * property specified may be a property that was set with
     * setOutputProperty(), or it may be a property specified in the stylesheet.
     *
     * @param name The name of the property to set
     * @param value The value to assign to the property
     * @throws IllegalArgumentException Never, errors are ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setOutputProperties().
     * Set the output properties for the transformation. These properties
     * will override properties set in the Templates with xsl:output.
     * Unrecognised properties will be quitely ignored.
     *
     * @param properties The properties to use for the Transformer
     * @throws IllegalArgumentException Never, errors are ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getOutputProperty().
     * Get an output property that is in effect for the transformation. The
     * property specified may be a property that was set with setOutputProperty,
     * or it may be a property specified in the stylesheet.
     *
     * @param name A non-null string that contains the name of the property
     * @throws IllegalArgumentException if the property name is not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getOutputProperties().
     * Returns a copy of the output properties for the transformation. This is
     * a set of layered properties. The first layer contains properties set by
     * calls to setOutputProperty() and setOutputProperties() on this class,
     * and the output settings defined in the stylesheet's <xsl:output>
     * element makes up the second level, while the default XSLT output
     * settings are returned on the third level.
     *
     * @return Properties in effect for this Transformer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void postWarningToListener(String message) {

    /**
     * Inform TrAX error listener of a warning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void postErrorToListener(String message) {

    /**
     * Inform TrAX error listener of an error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setErrorListener()
     * Set the error event listener in effect for the transformation.
     * Register a message handler in the translet in order to forward
     * xsl:messages to error listener.
     *
     * @param listener The error event listener to use
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getErrorListener()
     * Get the error event handler in effect for the transformation.
     *
     * @return The error event handler currently in effect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void transform(Source source, SerializationHandler handler,
        String encoding) throws TransformerException

    /**
     * Internal transformation method - uses the internal APIs of XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected TransletOutputHandlerFactory getTransletOutputHandlerFactory() {

    /**
     * Returns the {@link com.sun.org.apache.xalan.internal.xsltc.runtime.output.TransletOutputHandlerFactory}
     * object that create the <code>TransletOutputHandler</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected TransformerFactoryImpl getTransformerFactory() {

    /**
     * Returns the {@link com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl}
     * object that create this <code>Transformer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private DOM getDOM(Source source) throws TransformerException {

    /**
     * Builds an internal DOM from a TrAX Source object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected void setDOM(DOM dom) {

    /**
     * Set the internal DOM that will be used for the next transformation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
                LexicalHandler lexicalHandler = target.getLexicalHandler();

                /**
                 * Fix for bug 24414
                 * If the lexicalHandler is set then we need to get that
                 * for obtaining the lexical information
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public SerializationHandler getOutputHandler(Result result)

    /**
     * Create an output handler for the transformation output based on
     * the type and contents of the TrAX Result object passed to the
     * transform() method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.transform()
     *
     * @param source Contains the input XML document
     * @param result Will contain the output from the transformation
     * @throws TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected AbstractTranslet getTranslet() {

    /**
     * Returns the translet wrapped inside this Transformer or
     * null if this is the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void setSecureProcessing(boolean flag) {

    /**
     * Set the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    static class MessageHandler

    /**
     * This class wraps an ErrorListener into a MessageHandler in order to
     * capture messages reported via xsl:message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Map<String, Object> _parameters = null;

    /**
     * A map to store parameters for the identity transform. These
     * are not needed during the transformation, but we must keep track of
     * them to be fully complaint with the JAXP API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _accessExternalDTD = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

     /**
     * protocols allowed for external DTD references in source file and/or stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _useServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _isSecureProcessing = false;

    /**
     * State of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _isIdentity = false;

    /**
     * A flag indicating whether this transformer implements the identity
     * transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    //private boolean _isIncremental = false;

    /**
     * A flag indicating whether we use incremental building of the DTM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private XMLReaderManager _readerManager;

    /**
     * A reference to an object that creates and caches XMLReader objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private XSLTCDTMManager _dtmManager = null;

    /**
     * A reference to the XSLTCDTMManager which is used to build the DOM/DTM
     * for this transformer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private OutputStream _ostream = null;

    /**
     * A reference to the output stream, if we create one in our code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private int _indentNumber;

    /**
     * Number of indent spaces to add when indentation is on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private DOM _dom = null;

    /**
     * A reference to a internal DOM representation of the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private TransletOutputHandlerFactory _tohFactory = null;

    /**
     * A reference to an output handler factory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Properties _properties, _propertiesClone;

    /**
     * Output properties of this transformer instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private URIResolver _uriResolver = null;

    /**
     * A reference to a URI resolver for calls to document().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private ErrorListener _errorListener = this;

    /**
     * An error listener for runtime errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _sourceSystemId = null;

    /**
     * The systemId set in input source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _encoding = null;

    /**
     * The output encoding of this transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _method = null;

    /**
     * The output method of this transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private AbstractTranslet _translet = null;

    /**
     * A reference to the translet or null if the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private static final String NAMESPACE_PREFIXES_FEATURE =

    /**
     * Namespace prefixes feature for {@link XMLReader}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
public final class TransformerImpl extends Transformer

/**
 * @author Morten Jorgensen
 * @author G. Todd Miller
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * This method resets  the Transformer to its original configuration
     * Transformer code is reset to the same state it was when it was
     * created
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a warning.
     * Transformers can use this method to report conditions that are not
     * errors or fatal errors. The default behaviour is to take no action.
     * After invoking this method, the Transformer must continue with the
     * transformation. It should still be possible for the application to
     * process the document through to the end.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (never does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a non-recoverable error.
     * The application must assume that the transformation cannot continue
     * after the Transformer has invoked this method, and should continue
     * (if at all) only to collect addition error messages. In fact,
     * Transformers are free to stop reporting events once this method has
     * been invoked.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Receive notification of a recoverable error.
     * The transformer must continue to provide normal parsing events after
     * invoking this method. It should still be possible for the application
     * to process the document through to the end.
     *
     * @param e The warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * This class should only be used as a DOMCache for the translet if the
     * URIResolver has been set.
     *
     * The method implements XSLTC's DOMCache interface, which is used to
     * plug in an external document loader into a translet. This method acts
     * as an adapter between TrAX's URIResolver interface and XSLTC's
     * DOMCache interface. This approach is simple, but removes the
     * possibility of using external document caches with XSLTC.
     *
     * @param baseURI The base URI used by the document call.
     * @param href The href argument passed to the document function.
     * @param translet A reference to the translet requesting the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setURIResolver()
     * Set an object that will be used to resolve URIs used in document().
     *
     * @param resolver The URIResolver to use in document()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getURIResolver()
     * Set the object currently used to resolve URIs used in document().
     *
     * @return  The URLResolver object currently in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getParameter()
     * Returns the value of a given parameter. Note that the translet will not
     * keep values for parameters that were not defined in the stylesheet.
     *
     * @param name The name of the parameter
     * @return An object that contains the value assigned to the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.clearParameters()
     * Clear all parameters set with setParameter. Clears the translet's
     * parameter stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setParameter()
     * Add a parameter for the transformation. The parameter is simply passed
     * on to the translet - no validation is performed - so any unused
     * parameters are quitely ignored by the translet.
     *
     * @param name The name of the parameter
     * @param value The value to assign to the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean isDefaultProperty(String name, Properties properties) {

    /**
     * Checks if a given output property is default (2nd layer only)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean validOutputProperty(String name) {

    /**
     * Verifies if a given output property name is a property defined in
     * the JAXP 1.1 / TrAX spec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
        private void setDefaults(Properties props, String method)

        /**
         * Internal method to get the default properties from the
         * serializer factory and set them on the property object.
         * @param props a java.util.Property object on which the properties are set.
         * @param method The output method type, one of "xml", "text", "html" ...
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Properties createOutputProperties(Properties outputProperties) {

    /**
     * Internal method to create the initial set of properties. There
     * are two layers of properties: the default layer and the base layer.
     * The latter contains properties defined in the stylesheet or by
     * the user using this API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void transferOutputProperties(SerializationHandler handler)

    /**
     * This method is used to pass any properties to the output handler
     * when running the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void transferOutputProperties(AbstractTranslet translet)

    /**
     * Internal method to pass any properties to the translet prior to
     * initiating the transformation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setOutputProperty().
     * Get an output property that is in effect for the transformation. The
     * property specified may be a property that was set with
     * setOutputProperty(), or it may be a property specified in the stylesheet.
     *
     * @param name The name of the property to set
     * @param value The value to assign to the property
     * @throws IllegalArgumentException Never, errors are ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setOutputProperties().
     * Set the output properties for the transformation. These properties
     * will override properties set in the Templates with xsl:output.
     * Unrecognised properties will be quitely ignored.
     *
     * @param properties The properties to use for the Transformer
     * @throws IllegalArgumentException Never, errors are ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getOutputProperty().
     * Get an output property that is in effect for the transformation. The
     * property specified may be a property that was set with setOutputProperty,
     * or it may be a property specified in the stylesheet.
     *
     * @param name A non-null string that contains the name of the property
     * @throws IllegalArgumentException if the property name is not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getOutputProperties().
     * Returns a copy of the output properties for the transformation. This is
     * a set of layered properties. The first layer contains properties set by
     * calls to setOutputProperty() and setOutputProperties() on this class,
     * and the output settings defined in the stylesheet's <xsl:output>
     * element makes up the second level, while the default XSLT output
     * settings are returned on the third level.
     *
     * @return Properties in effect for this Transformer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void postWarningToListener(String message) {

    /**
     * Inform TrAX error listener of a warning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void postErrorToListener(String message) {

    /**
     * Inform TrAX error listener of an error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.setErrorListener()
     * Set the error event listener in effect for the transformation.
     * Register a message handler in the translet in order to forward
     * xsl:messages to error listener.
     *
     * @param listener The error event listener to use
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.getErrorListener()
     * Get the error event handler in effect for the transformation.
     *
     * @return The error event handler currently in effect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private void transform(Source source, SerializationHandler handler,
        String encoding) throws TransformerException

    /**
     * Internal transformation method - uses the internal APIs of XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected TransletOutputHandlerFactory getTransletOutputHandlerFactory() {

    /**
     * Returns the {@link com.sun.org.apache.xalan.internal.xsltc.runtime.output.TransletOutputHandlerFactory}
     * object that create the <code>TransletOutputHandler</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected TransformerFactoryImpl getTransformerFactory() {

    /**
     * Returns the {@link com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl}
     * object that create this <code>Transformer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private DOM getDOM(Source source) throws TransformerException {

    /**
     * Builds an internal DOM from a TrAX Source object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected void setDOM(DOM dom) {

    /**
     * Set the internal DOM that will be used for the next transformation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
                LexicalHandler lexicalHandler = target.getLexicalHandler();

                /**
                 * Fix for bug 24414
                 * If the lexicalHandler is set then we need to get that
                 * for obtaining the lexical information
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public SerializationHandler getOutputHandler(Result result)

    /**
     * Create an output handler for the transformation output based on
     * the type and contents of the TrAX Result object passed to the
     * transform() method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    @Override

    /**
     * Implements JAXP's Transformer.transform()
     *
     * @param source Contains the input XML document
     * @param result Will contain the output from the transformation
     * @throws TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    protected AbstractTranslet getTranslet() {

    /**
     * Returns the translet wrapped inside this Transformer or
     * null if this is the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public void setSecureProcessing(boolean flag) {

    /**
     * Set the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    static class MessageHandler

    /**
     * This class wraps an ErrorListener into a MessageHandler in order to
     * capture messages reported via xsl:message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Map<String, Object> _parameters = null;

    /**
     * A map to store parameters for the identity transform. These
     * are not needed during the transformation, but we must keep track of
     * them to be fully complaint with the JAXP API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _accessExternalDTD = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

     /**
     * protocols allowed for external DTD references in source file and/or stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _useServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _isSecureProcessing = false;

    /**
     * State of the secure processing feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private boolean _isIdentity = false;

    /**
     * A flag indicating whether this transformer implements the identity
     * transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    //private boolean _isIncremental = false;

    /**
     * A flag indicating whether we use incremental building of the DTM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private XMLReaderManager _readerManager;

    /**
     * A reference to an object that creates and caches XMLReader objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private XSLTCDTMManager _dtmManager = null;

    /**
     * A reference to the XSLTCDTMManager which is used to build the DOM/DTM
     * for this transformer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private OutputStream _ostream = null;

    /**
     * A reference to the output stream, if we create one in our code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private int _indentNumber;

    /**
     * Number of indent spaces to add when indentation is on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private DOM _dom = null;

    /**
     * A reference to a internal DOM representation of the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private TransletOutputHandlerFactory _tohFactory = null;

    /**
     * A reference to an output handler factory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private Properties _properties, _propertiesClone;

    /**
     * Output properties of this transformer instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private URIResolver _uriResolver = null;

    /**
     * A reference to a URI resolver for calls to document().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private ErrorListener _errorListener = this;

    /**
     * An error listener for runtime errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _sourceSystemId = null;

    /**
     * The systemId set in input source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _encoding = null;

    /**
     * The output encoding of this transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private String _method = null;

    /**
     * The output method of this transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private AbstractTranslet _translet = null;

    /**
     * A reference to the translet or null if the identity transform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
    private static final String NAMESPACE_PREFIXES_FEATURE =

    /**
     * Namespace prefixes feature for {@link XMLReader}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerImpl.java
public final class TransformerImpl extends Transformer

/**
 * @author Morten Jorgensen
 * @author G. Todd Miller
 * @author Santiago Pericas-Geertsen
 */
