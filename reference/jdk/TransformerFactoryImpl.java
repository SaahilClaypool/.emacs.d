_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    protected final XSLTCDTMManager createNewDTMManagerInstance() {

    /**
     * Returns a new instance of the XSLTC DTM Manager service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String getStylesheetFileName(Source source)

    /**
     *  Return the local file name from the systemId of the Source object
     *
     * @param source The Source
     * @return The file name in the local filesystem, or null if the
     * systemId does not represent a local file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String getTransletBaseName(Source source)

    /**
     * Return the base class name of the translet.
     * The translet name is resolved using the following rules:
     * 1. if the _transletName attribute is set and its value is not "GregorSamsa",
     *    then _transletName is returned.
     * 2. otherwise get the translet name from the base name of the system ID
     * 3. return "GregorSamsa" if the result from step 2 is null.
     *
     * @param source The input Source
     * @return The name of the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void readFromInputStream(byte[] bytes, InputStream input, int size)

    /**
     * Read a given number of bytes from the InputStream into a byte array.
     *
     * @param bytes The byte array to store the input content.
     * @param input The input stream.
     * @param size The number of bytes to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private byte[][] getBytecodesFromJar(Source source, String fullClassName)

    /**
     * Load the translet classes from the jar file and return the bytecode.
     *
     * @param source The xsl source
     * @param fullClassName The full name of the translet
     * @return The bytecode array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private byte[][] getBytecodesFromClasses(Source source, String fullClassName)

    /**
     * Load the translet classes from local .class files and return
     * the bytecode array.
     *
     * @param source The xsl source
     * @param fullClassName The full name of the translet
     * @return The bytecode array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void resetTransientAttributes() {

    /**
     * Reset the per-session attributes to their default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * This method implements XSLTC's SourceLoader interface. It is used to
     * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes.
     *
     * @param href The URI of the document to load
     * @param context The URI of the currently loaded document
     * @param xsltc The compiler that resuests the document
     * @return An InputSource with the loaded document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * Receive notification of a non-recoverable error.
     * The application must assume that the transformation cannot continue
     * after the Transformer has invoked this method, and should continue
     * (if at all) only to collect addition error messages. In fact,
     * Transformers are free to stop reporting events once this method has
     * been invoked.
     *
     * @param e warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Create an XMLFilter that uses the given source as the
     * transformation instructions.
     *
     * @param templates The source of the transformation instructions.
     * @return An XMLFilter object, or null if this feature is not supported.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Create an XMLFilter that uses the given source as the
     * transformation instructions.
     *
     * @param src The source of the transformation instructions.
     * @return An XMLFilter object, or null if this feature is not supported.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result, based on the transformation instructions
     * specified by the argument.
     *
     * @param templates Represents a pre-processed stylesheet
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result, based on the transformation instructions
     * specified by the argument.
     *
     * @param src The source of the transformation instructions.
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result. This method will return a pure copy transformer.
     *
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TemplatesHandler object that can process SAX ContentHandler
     * events into a Templates object.
     *
     * @return A TemplatesHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Process the Source into a Templates object, which is a a compiled
     * representation of the source.
     *
     * @param source The input stylesheet - DOMSource not supported!!!
     * @return A Templates object that can be used to create Transformers.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void passErrorsToListener(Vector messages) {

    /**
     * Pass error messages from the compiler to the error listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void passWarningsToListener(Vector messages)

    /**
     * Pass warning messages from the compiler to the error listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Process the Source into a Templates object, which is a a compiled
     * representation of the source. Note that this method should not be
     * used with XSLTC, as the time-consuming compilation is done for each
     * and every transformation.
     *
     * @return A Templates object that can be used to create Transformers.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Create a Transformer object that copies the input document to the result.
     *
     * @return A Transformer object that simply copies the source to the result.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        StylesheetPIHandler _stylesheetPIHandler = new StylesheetPIHandler(null,media,title,charset);

        /**
         * Fix for bugzilla bug 24187
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the stylesheet specification(s) associated via the xml-stylesheet
     * processing instruction (see http://www.w3.org/TR/xml-stylesheet/) with
     * the document document specified in the source parameter, and that match
     * the given criteria.
     *
     * @param source The XML source document.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     * @return A Source object suitable for passing to the TransformerFactory.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Set the object that is used by default during the transformation to
     * resolve URIs used in document(), xsl:import, or xsl:include. Note that
     * this does not affect Templates and Transformers that are already
     * created with this factory.
     *
     * @param resolver The URLResolver used for this TransformerFactory and all
     * Templates and Transformer objects created using this factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the object that is used by default during the transformation to
     * resolve URIs used in document(), xsl:import, or xsl:include.
     *
     * @return The URLResolver used for this TransformerFactory and all
     * Templates and Transformer objects created using this factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public FeatureManager getFeatureManager() {

     /**
     * @return the feature manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        String propertyValue = (_featureManager != null) ?

        /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Look up the value of a feature (to see if it is supported).
     * This method must be updated as the various methods and features of this
     * class are implemented.
     *
     * @param name The feature name
     * @return 'true' if feature is supported, 'false' if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s
     * or <code>Template</code>s created by this factory.</p>
     *
     * <p>
     * Feature names are fully qualified {@link java.net.URI}s.
     * Implementations may define their own features.
     * An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the
     * <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature.
     * It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state.
     * </p>
     *
     * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p>
     *
     * @param name Feature name.
     * @param value Is feature state <code>true</code> or <code>false</code>.
     *
     * @throws TransformerConfigurationException if this <code>TransformerFactory</code>
     *   or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature.
     * @throws NullPointerException If the <code>name</code> parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Sets the value for a TransformerFactory attribute.
     *
     * @param name The attribute name
     * @param value An object representing the attribute value
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        String propertyValue = (_xmlSecurityManager != null) ?

        /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Returns the value set for a TransformerFactory attribute
     *
     * @param name The attribute name
     * @return An object representing the attribute value
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the error event handler for the TransformerFactory.
     *
     * @return The error listener used with the TransformerFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Set the error event listener for the TransformerFactory, which is used
     * for the processing of transformation instructions, and not for the
     * transformation itself.
     *
     * @param listener The error listener to use with the TransformerFactory
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public TransformerFactoryImpl() {

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _useServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _isNotSecureProcessing = true;

    /**
     * <p>State of secure processing feature.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private int _indentNumber = -1;

    /**
     * Number of indent spaces when indentation is turned on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _useClasspath = false;

    /**
     * If this is set to <code>true</code>, we attempt to load the translet
     * from the CLASSPATH.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _autoTranslet = false;

    /**
     * If this is set to <code>true</code>, we attempt to use translet classes
     * for transformation if possible without compiling the stylesheet. The
     * translet class is only used if its timestamp is newer than the timestamp
     * of the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _generateTranslet = false;

    /**
     * Set to <code>true</code> when we want to generate
     * translet classes from the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _enableInlining = false;

    /**
     * Set to <code>true</code> when templates are inlined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _debug = false;

    /**
     * Set to <code>true</code> when debugging is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private static class PIParamWrapper {

    /**
     * The above Map stores objects of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private Map<Source, PIParamWrapper> _piParams = null;

    /**
     * This Map is used to store parameters for locating
     * <?xml-stylesheet ...?> processing instructions in XML docs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _jarFileName = null;

    /**
     * The jar file name which the translet classes are packaged into
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _packageName = null;

    /**
     * The package name prefix for all generated translet classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _destinationDirectory = null;

    /**
     * The destination directory for the translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _transletName = DEFAULT_TRANSLET_NAME;

    /**
     * The class name of the translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    protected final static String DEFAULT_TRANSLET_NAME = "GregorSamsa";

    /**
     * As Gregor Samsa awoke one morning from uneasy dreams he found himself
     * transformed in his bed into a gigantic insect. He was lying on his hard,
     * as it were armour plated, back, and if he lifted his head a little he
     * could see his big, brown belly divided into stiff, arched segments, on
     * top of which the bed quilt could hardly keep in position and was about
     * to slide off completely. His numerous legs, which were pitifully thin
     * compared to the rest of his bulk, waved helplessly before his eyes.
     * "What has happened to me?", he thought. It was no dream....
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all created Templates and Transformers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private ErrorListener _errorListener = this;

    /**
     * This error listener is used only for this factory and is not passed to
     * the Templates or Transformer objects that we create.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
public class TransformerFactoryImpl

/**
 * Implementation of a JAXP1.1 TransformerFactory for Translets.
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    protected final XSLTCDTMManager createNewDTMManagerInstance() {

    /**
     * Returns a new instance of the XSLTC DTM Manager service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String getStylesheetFileName(Source source)

    /**
     *  Return the local file name from the systemId of the Source object
     *
     * @param source The Source
     * @return The file name in the local filesystem, or null if the
     * systemId does not represent a local file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String getTransletBaseName(Source source)

    /**
     * Return the base class name of the translet.
     * The translet name is resolved using the following rules:
     * 1. if the _transletName attribute is set and its value is not "GregorSamsa",
     *    then _transletName is returned.
     * 2. otherwise get the translet name from the base name of the system ID
     * 3. return "GregorSamsa" if the result from step 2 is null.
     *
     * @param source The input Source
     * @return The name of the translet class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void readFromInputStream(byte[] bytes, InputStream input, int size)

    /**
     * Read a given number of bytes from the InputStream into a byte array.
     *
     * @param bytes The byte array to store the input content.
     * @param input The input stream.
     * @param size The number of bytes to read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private byte[][] getBytecodesFromJar(Source source, String fullClassName)

    /**
     * Load the translet classes from the jar file and return the bytecode.
     *
     * @param source The xsl source
     * @param fullClassName The full name of the translet
     * @return The bytecode array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private byte[][] getBytecodesFromClasses(Source source, String fullClassName)

    /**
     * Load the translet classes from local .class files and return
     * the bytecode array.
     *
     * @param source The xsl source
     * @param fullClassName The full name of the translet
     * @return The bytecode array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void resetTransientAttributes() {

    /**
     * Reset the per-session attributes to their default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * This method implements XSLTC's SourceLoader interface. It is used to
     * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes.
     *
     * @param href The URI of the document to load
     * @param context The URI of the currently loaded document
     * @param xsltc The compiler that resuests the document
     * @return An InputSource with the loaded document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * Receive notification of a non-recoverable error.
     * The application must assume that the transformation cannot continue
     * after the Transformer has invoked this method, and should continue
     * (if at all) only to collect addition error messages. In fact,
     * Transformers are free to stop reporting events once this method has
     * been invoked.
     *
     * @param e warning information encapsulated in a transformer
     * exception.
     * @throws TransformerException if the application chooses to discontinue
     * the transformation (always does in our case).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Create an XMLFilter that uses the given source as the
     * transformation instructions.
     *
     * @param templates The source of the transformation instructions.
     * @return An XMLFilter object, or null if this feature is not supported.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Create an XMLFilter that uses the given source as the
     * transformation instructions.
     *
     * @param src The source of the transformation instructions.
     * @return An XMLFilter object, or null if this feature is not supported.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result, based on the transformation instructions
     * specified by the argument.
     *
     * @param templates Represents a pre-processed stylesheet
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result, based on the transformation instructions
     * specified by the argument.
     *
     * @param src The source of the transformation instructions.
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events into a Result. This method will return a pure copy transformer.
     *
     * @return A TransformerHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.SAXTransformerFactory implementation.
     * Get a TemplatesHandler object that can process SAX ContentHandler
     * events into a Templates object.
     *
     * @return A TemplatesHandler object that can handle SAX events
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Process the Source into a Templates object, which is a a compiled
     * representation of the source.
     *
     * @param source The input stylesheet - DOMSource not supported!!!
     * @return A Templates object that can be used to create Transformers.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void passErrorsToListener(Vector messages) {

    /**
     * Pass error messages from the compiler to the error listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private void passWarningsToListener(Vector messages)

    /**
     * Pass warning messages from the compiler to the error listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Process the Source into a Templates object, which is a a compiled
     * representation of the source. Note that this method should not be
     * used with XSLTC, as the time-consuming compilation is done for each
     * and every transformation.
     *
     * @return A Templates object that can be used to create Transformers.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Create a Transformer object that copies the input document to the result.
     *
     * @return A Transformer object that simply copies the source to the result.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        StylesheetPIHandler _stylesheetPIHandler = new StylesheetPIHandler(null,media,title,charset);

        /**
         * Fix for bugzilla bug 24187
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the stylesheet specification(s) associated via the xml-stylesheet
     * processing instruction (see http://www.w3.org/TR/xml-stylesheet/) with
     * the document document specified in the source parameter, and that match
     * the given criteria.
     *
     * @param source The XML source document.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     * @return A Source object suitable for passing to the TransformerFactory.
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Set the object that is used by default during the transformation to
     * resolve URIs used in document(), xsl:import, or xsl:include. Note that
     * this does not affect Templates and Transformers that are already
     * created with this factory.
     *
     * @param resolver The URLResolver used for this TransformerFactory and all
     * Templates and Transformer objects created using this factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the object that is used by default during the transformation to
     * resolve URIs used in document(), xsl:import, or xsl:include.
     *
     * @return The URLResolver used for this TransformerFactory and all
     * Templates and Transformer objects created using this factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public FeatureManager getFeatureManager() {

     /**
     * @return the feature manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        String propertyValue = (_featureManager != null) ?

        /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Look up the value of a feature (to see if it is supported).
     * This method must be updated as the various methods and features of this
     * class are implemented.
     *
     * @param name The feature name
     * @return 'true' if feature is supported, 'false' if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s
     * or <code>Template</code>s created by this factory.</p>
     *
     * <p>
     * Feature names are fully qualified {@link java.net.URI}s.
     * Implementations may define their own features.
     * An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the
     * <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature.
     * It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state.
     * </p>
     *
     * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p>
     *
     * @param name Feature name.
     * @param value Is feature state <code>true</code> or <code>false</code>.
     *
     * @throws TransformerConfigurationException if this <code>TransformerFactory</code>
     *   or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature.
     * @throws NullPointerException If the <code>name</code> parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Sets the value for a TransformerFactory attribute.
     *
     * @param name The attribute name
     * @param value An object representing the attribute value
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
        String propertyValue = (_xmlSecurityManager != null) ?

        /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Returns the value set for a TransformerFactory attribute
     *
     * @param name The attribute name
     * @return An object representing the attribute value
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Get the error event handler for the TransformerFactory.
     *
     * @return The error listener used with the TransformerFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    @Override

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     * Set the error event listener for the TransformerFactory, which is used
     * for the processing of transformation instructions, and not for the
     * transformation itself.
     *
     * @param listener The error listener to use with the TransformerFactory
     * @throws IllegalArgumentException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    public TransformerFactoryImpl() {

    /**
     * javax.xml.transform.sax.TransformerFactory implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _useServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _isNotSecureProcessing = true;

    /**
     * <p>State of secure processing feature.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private int _indentNumber = -1;

    /**
     * Number of indent spaces when indentation is turned on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _useClasspath = false;

    /**
     * If this is set to <code>true</code>, we attempt to load the translet
     * from the CLASSPATH.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _autoTranslet = false;

    /**
     * If this is set to <code>true</code>, we attempt to use translet classes
     * for transformation if possible without compiling the stylesheet. The
     * translet class is only used if its timestamp is newer than the timestamp
     * of the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _generateTranslet = false;

    /**
     * Set to <code>true</code> when we want to generate
     * translet classes from the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _enableInlining = false;

    /**
     * Set to <code>true</code> when templates are inlined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private boolean _debug = false;

    /**
     * Set to <code>true</code> when debugging is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private static class PIParamWrapper {

    /**
     * The above Map stores objects of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private Map<Source, PIParamWrapper> _piParams = null;

    /**
     * This Map is used to store parameters for locating
     * <?xml-stylesheet ...?> processing instructions in XML docs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _jarFileName = null;

    /**
     * The jar file name which the translet classes are packaged into
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _packageName = null;

    /**
     * The package name prefix for all generated translet classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _destinationDirectory = null;

    /**
     * The destination directory for the translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private String _transletName = DEFAULT_TRANSLET_NAME;

    /**
     * The class name of the translet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    protected final static String DEFAULT_TRANSLET_NAME = "GregorSamsa";

    /**
     * As Gregor Samsa awoke one morning from uneasy dreams he found himself
     * transformed in his bed into a gigantic insect. He was lying on his hard,
     * as it were armour plated, back, and if he lifted his head a little he
     * could see his big, brown belly divided into stiff, arched segments, on
     * top of which the bed quilt could hardly keep in position and was about
     * to slide off completely. His numerous legs, which were pitifully thin
     * compared to the rest of his bulk, waved helplessly before his eyes.
     * "What has happened to me?", he thought. It was no dream....
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all created Templates and Transformers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
    private ErrorListener _errorListener = this;

    /**
     * This error listener is used only for this factory and is not passed to
     * the Templates or Transformer objects that we create.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TransformerFactoryImpl.java
public class TransformerFactoryImpl

/**
 * Implementation of a JAXP1.1 TransformerFactory for Translets.
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
