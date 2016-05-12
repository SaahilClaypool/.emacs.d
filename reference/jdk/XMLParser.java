_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    public void parse(XMLInputSource inputSource)

    /**
     * parse
     *
     * @param inputSource
     *
     * @exception XNIException
     * @exception java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected XMLParser(XMLParserConfiguration config) {

    /**
     * Default Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    public boolean getFeature(String featureId)

    /**
     * Query the state of a feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    XMLSecurityPropertyManager securityPropertyManager;

    /** The XML Security Property Manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    XMLSecurityManager securityManager;

    /** The XML Security Manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected XMLParserConfiguration fConfiguration;

    /** The parser configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
public abstract class XMLParser {

/**
 * Base class of all XML-related parsers.
 * <p>
 * In addition to the features and properties recognized by the parser
 * configuration, this parser recognizes these additional features and
 * properties:
 * <ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLParser.java,v 1.5 2007/07/20 14:11:21 spericas Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    public void parse(XMLInputSource inputSource)

    /**
     * parse
     *
     * @param inputSource
     *
     * @exception XNIException
     * @exception java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected XMLParser(XMLParserConfiguration config) {

    /**
     * Default Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    public boolean getFeature(String featureId)

    /**
     * Query the state of a feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    XMLSecurityPropertyManager securityPropertyManager;

    /** The XML Security Property Manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    XMLSecurityManager securityManager;

    /** The XML Security Manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected XMLParserConfiguration fConfiguration;

    /** The parser configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLParser.java
public abstract class XMLParser {

/**
 * Base class of all XML-related parsers.
 * <p>
 * In addition to the features and properties recognized by the parser
 * configuration, this parser recognizes these additional features and
 * properties:
 * <ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLParser.java,v 1.5 2007/07/20 14:11:21 spericas Exp $
 */
