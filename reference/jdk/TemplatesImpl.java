_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public void setStylesheetDOM(DOM sdom) {

    /**
     * Set the thread local copy of the stylesheet DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public DOM getStylesheetDOM() {

    /**
     * Return the thread local copy of the stylesheet DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized Properties getOutputProperties() {

    /**
     * Implements JAXP's Templates.getOutputProperties(). We need to
     * instanciate a translet to get the output settings, so
     * we might as well just instanciate a Transformer and use its
     * implementation of this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized Transformer newTransformer()

    /**
     * Implements JAXP's Templates.newTransformer()
     *
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Translet getTransletInstance()

    /**
     * This method generates an instance of the translet class that is
     * wrapped inside this Template. The translet instance will later
     * be wrapped inside a Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private void defineTransletClasses()

    /**
     * Defines the translet class and auxiliary classes.
     * Returns a reference to the Class object that defines the main class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected synchronized String getTransletName() {

    /**
     * Returns the name of the main translet class stored in this template
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected synchronized void setTransletName(String name) {

    /**
     * The TransformerFactory should call this method to set the translet name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized int getTransletIndex() {

    /**
     * Returns the index of the main class in array of bytecodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized Class[] getTransletClasses() {

    /**
     * Returns the translet bytecodes stored in this template
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized byte[][] getTransletBytecodes() {

    /**
     * Returns the translet bytecodes stored in this template
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized void setTransletBytecodes(byte[][] bytecodes) {

    /**
     * The TransformerFactory must pass us the translet bytecodes using this
     * method before we can create any translet instances
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized void setURIResolver(URIResolver resolver) {

     /**
     * Store URIResolver needed for Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private void writeObject(ObjectOutputStream os)

    /**
     *  This is to fix bugzilla bug 22438
     *  If the user defined class implements URIResolver and Serializable
     *  then we want it to get serialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    @SuppressWarnings("unchecked")

    /**
     *  Overrides the default readObject implementation since we decided
     *  it would be cleaner not to serialize the entire tranformer
     *  factory.  [ ref bugzilla 12317 ]
     *  We need to check if the user defined class for URIResolver also
     *  implemented Serializable
     *  if yes then we need to deserialize the URIResolver
     *  Fix for bugzilla bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public TemplatesImpl() { }

    /**
     * Need for de-serialization, see readObject().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected TemplatesImpl(Class[] transletClasses, String transletName,
        Properties outputProperties, int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Create an XSLTC template object from the translet class definition(s).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected TemplatesImpl(byte[][] bytecodes, String transletName,
        Properties outputProperties, int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Create an XSLTC template object from the bytecodes.
     * The bytecodes for the translet and auxiliary classes, plus the name of
     * the main translet class, must be supplied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
        Class defineClass(final byte[] b) {

        /**
         * Access to final protected superclass member from outer class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField _name String The Name of the main class
     * @serialField _bytecodes byte[][] Class definition
     * @serialField _class Class[] The translet class definition(s).
     * @serialField _transletIndex int The index of the main translet class
     * @serialField _outputProperties Properties Output properties of this translet.
     * @serialField _indentNumber int Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient boolean _useServicesMechanism;

    /**
     * A flag to determine whether the Service Mechanism is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient ThreadLocal _sdom = new ThreadLocal();

    /**
     * Cache the DTM for the stylesheet in a thread local variable,
     * which is used by the document('') function.
     * Use ThreadLocal because a DTM cannot be shared between
     * multiple threads.
     * Declaring it transient to fix bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all Transformers.
     * Declaring it transient to fix bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private int _indentNumber;

    /**
     * Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Properties _outputProperties;

    /**
     * Output properties of this translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient Map<String, Class<?>> _auxClasses = null;

    /**
     * Contains the list of auxiliary class definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private int _transletIndex = -1;

    /**
     * The index of the main translet class in the arrays _class[] and
     * _bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Class[] _class = null;

    /**
     * Contains the translet class definition(s). These are created when
     * this Templates is created or when it is read back from disk.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private byte[][] _bytecodes = null;

    /**
     * Contains the actual class definition for the translet class and
     * any auxiliary classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private String _name = null;

    /**
     * Name of the main class or default name if unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private static String ABSTRACT_TRANSLET

    /**
     * Name of the superclass of all translets. This is needed to
     * determine which, among all classes comprising a translet,
     * is the main one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
public final class TemplatesImpl implements Templates, Serializable {

/**
 * @author Morten Jorgensen
 * @author G. Todd Millerj
 * @author Jochen Cordes <Jochen.Cordes@t-online.de>
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public void setStylesheetDOM(DOM sdom) {

    /**
     * Set the thread local copy of the stylesheet DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public DOM getStylesheetDOM() {

    /**
     * Return the thread local copy of the stylesheet DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized Properties getOutputProperties() {

    /**
     * Implements JAXP's Templates.getOutputProperties(). We need to
     * instanciate a translet to get the output settings, so
     * we might as well just instanciate a Transformer and use its
     * implementation of this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized Transformer newTransformer()

    /**
     * Implements JAXP's Templates.newTransformer()
     *
     * @throws TransformerConfigurationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Translet getTransletInstance()

    /**
     * This method generates an instance of the translet class that is
     * wrapped inside this Template. The translet instance will later
     * be wrapped inside a Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private void defineTransletClasses()

    /**
     * Defines the translet class and auxiliary classes.
     * Returns a reference to the Class object that defines the main class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected synchronized String getTransletName() {

    /**
     * Returns the name of the main translet class stored in this template
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected synchronized void setTransletName(String name) {

    /**
     * The TransformerFactory should call this method to set the translet name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized int getTransletIndex() {

    /**
     * Returns the index of the main class in array of bytecodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized Class[] getTransletClasses() {

    /**
     * Returns the translet bytecodes stored in this template
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized byte[][] getTransletBytecodes() {

    /**
     * Returns the translet bytecodes stored in this template
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private synchronized void setTransletBytecodes(byte[][] bytecodes) {

    /**
     * The TransformerFactory must pass us the translet bytecodes using this
     * method before we can create any translet instances
     *
     * Note: This method is private for security reasons. See
     * CR 6537898. When merging with Apache, we must ensure
     * that the privateness of this method is maintained (that
     * is why it wasn't removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public synchronized void setURIResolver(URIResolver resolver) {

     /**
     * Store URIResolver needed for Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private void writeObject(ObjectOutputStream os)

    /**
     *  This is to fix bugzilla bug 22438
     *  If the user defined class implements URIResolver and Serializable
     *  then we want it to get serialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    @SuppressWarnings("unchecked")

    /**
     *  Overrides the default readObject implementation since we decided
     *  it would be cleaner not to serialize the entire tranformer
     *  factory.  [ ref bugzilla 12317 ]
     *  We need to check if the user defined class for URIResolver also
     *  implemented Serializable
     *  if yes then we need to deserialize the URIResolver
     *  Fix for bugzilla bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    public TemplatesImpl() { }

    /**
     * Need for de-serialization, see readObject().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected TemplatesImpl(Class[] transletClasses, String transletName,
        Properties outputProperties, int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Create an XSLTC template object from the translet class definition(s).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    protected TemplatesImpl(byte[][] bytecodes, String transletName,
        Properties outputProperties, int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Create an XSLTC template object from the bytecodes.
     * The bytecodes for the translet and auxiliary classes, plus the name of
     * the main translet class, must be supplied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
        Class defineClass(final byte[] b) {

        /**
         * Access to final protected superclass member from outer class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField _name String The Name of the main class
     * @serialField _bytecodes byte[][] Class definition
     * @serialField _class Class[] The translet class definition(s).
     * @serialField _transletIndex int The index of the main translet class
     * @serialField _outputProperties Properties Output properties of this translet.
     * @serialField _indentNumber int Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient boolean _useServicesMechanism;

    /**
     * A flag to determine whether the Service Mechanism is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient ThreadLocal _sdom = new ThreadLocal();

    /**
     * Cache the DTM for the stylesheet in a thread local variable,
     * which is used by the document('') function.
     * Use ThreadLocal because a DTM cannot be shared between
     * multiple threads.
     * Declaring it transient to fix bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all Transformers.
     * Declaring it transient to fix bug 22438
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private int _indentNumber;

    /**
     * Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Properties _outputProperties;

    /**
     * Output properties of this translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private transient Map<String, Class<?>> _auxClasses = null;

    /**
     * Contains the list of auxiliary class definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private int _transletIndex = -1;

    /**
     * The index of the main translet class in the arrays _class[] and
     * _bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private Class[] _class = null;

    /**
     * Contains the translet class definition(s). These are created when
     * this Templates is created or when it is read back from disk.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private byte[][] _bytecodes = null;

    /**
     * Contains the actual class definition for the translet class and
     * any auxiliary classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private String _name = null;

    /**
     * Name of the main class or default name if unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
    private static String ABSTRACT_TRANSLET

    /**
     * Name of the superclass of all translets. This is needed to
     * determine which, among all classes comprising a translet,
     * is the main one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesImpl.java
public final class TemplatesImpl implements Templates, Serializable {

/**
 * @author Morten Jorgensen
 * @author G. Todd Millerj
 * @author Jochen Cordes <Jochen.Cordes@t-online.de>
 * @author Santiago Pericas-Geertsen
 */
