_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public XMLFilter newXMLFilter(Source src)

    /**
     * Create an XMLFilter that uses the given source as the
     * transformation instructions. Uses
     * com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler(Templates templates)

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a transformer specified by the stylesheet Source.
     * Uses com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler(Source src)

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a transformer specified by the stylesheet Source.
     * Uses com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler()

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a copy transformer.
     * Uses com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TemplatesHandler newTemplatesHandler()

    /**
     * Get a TemplatesHandler object that can process SAX ContentHandler
     * events into a Templates object. Uses the
     * com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Templates newTemplates(Source source)

    /**
     * Create a Templates object that from the input stylesheet
     * Uses the com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     * @param source the stylesheet.
     * @return A Templates object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Transformer newTransformer(Source source) throws

    /**
     * Create a Transformer object that from the input stylesheet
     * Uses the com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     * @param source the stylesheet.
     * @return A Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Transformer newTransformer()

    /**
     * Create a Transformer object that copies the input document to the
     * result. Uses the com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     * @return A Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public boolean getFeature(String name) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public void setFeature(String name, boolean value)

    /**
     * <p>Set a feature for this <code>SmartTransformerFactory</code> and <code>Transformer</code>s
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public SmartTransformerFactoryImpl() { }

    /**
     * implementation of the SmartTransformerFactory. This factory
     * uses com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory
     * to return Templates objects; and uses
     * com.sun.org.apache.xalan.internal.processor.TransformerFactory
     * to return Transformer objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    private boolean featureSecureProcessing = false;

    /**
     * <p>State of secure processing feature.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    private static final String CLASS_NAME = "SmartTransformerFactoryImpl";

    /**
     * <p>Name of class as a constant to use for debugging.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
public class SmartTransformerFactoryImpl extends SAXTransformerFactory

/**
 * Implementation of a transformer factory that uses an XSLTC
 * transformer factory for the creation of Templates objects
 * and uses the Xalan processor transformer factory for the
 * creation of Transformer objects.
 * @author G. Todd Miller
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public XMLFilter newXMLFilter(Source src)

    /**
     * Create an XMLFilter that uses the given source as the
     * transformation instructions. Uses
     * com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler(Templates templates)

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a transformer specified by the stylesheet Source.
     * Uses com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler(Source src)

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a transformer specified by the stylesheet Source.
     * Uses com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TransformerHandler newTransformerHandler()

    /**
     * Get a TransformerHandler object that can process SAX ContentHandler
     * events based on a copy transformer.
     * Uses com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public TemplatesHandler newTemplatesHandler()

    /**
     * Get a TemplatesHandler object that can process SAX ContentHandler
     * events into a Templates object. Uses the
     * com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Templates newTemplates(Source source)

    /**
     * Create a Templates object that from the input stylesheet
     * Uses the com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory.
     * @param source the stylesheet.
     * @return A Templates object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Transformer newTransformer(Source source) throws

    /**
     * Create a Transformer object that from the input stylesheet
     * Uses the com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     * @param source the stylesheet.
     * @return A Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public Transformer newTransformer()

    /**
     * Create a Transformer object that copies the input document to the
     * result. Uses the com.sun.org.apache.xalan.internal.processor.TransformerFactory.
     * @return A Transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public boolean getFeature(String name) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public void setFeature(String name, boolean value)

    /**
     * <p>Set a feature for this <code>SmartTransformerFactory</code> and <code>Transformer</code>s
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    public SmartTransformerFactoryImpl() { }

    /**
     * implementation of the SmartTransformerFactory. This factory
     * uses com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactory
     * to return Templates objects; and uses
     * com.sun.org.apache.xalan.internal.processor.TransformerFactory
     * to return Transformer objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    private boolean featureSecureProcessing = false;

    /**
     * <p>State of secure processing feature.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
    private static final String CLASS_NAME = "SmartTransformerFactoryImpl";

    /**
     * <p>Name of class as a constant to use for debugging.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/SmartTransformerFactoryImpl.java
public class SmartTransformerFactoryImpl extends SAXTransformerFactory

/**
 * Implementation of a transformer factory that uses an XSLTC
 * transformer factory for the creation of Templates objects
 * and uses the Xalan processor transformer factory for the
 * creation of Transformer objects.
 * @author G. Todd Miller
 */
