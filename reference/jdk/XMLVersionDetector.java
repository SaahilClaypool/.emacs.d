_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public short determineDocVersion(XMLInputSource inputSource) throws IOException {

    /**
     * This methods scans the XML declaration to find out the version
     * (and provisional encoding)  of the document.
     * The scanning is doing using XML 1.1 scanner.
     * @param inputSource
     * @return short - Constants.XML_VERSION_1_1 if document version 1.1,
     *                  otherwise Constants.XML_VERSION_1_0
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public void startDocumentParsing(XMLEntityHandler scanner, short version){

    /**
     * Reset the reference to the appropriate scanner given the version of the
     * document and start document scanning.
     * @param scanner - the scanner to use
     * @param version - the version of the document (XML 1.1 or XML 1.0).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public void reset(XMLComponentManager componentManager)

    /**
     *
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Throws exception if required features and
     *                      properties cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected final static String fVersionSymbol = "version".intern();

    /** Symbol: "version". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
public class XMLVersionDetector {

/**
 * This class scans the version of the document to determine
 * which scanner to use: XML 1.1 or XML 1.0.
 * The version is scanned using XML 1.1. scanner.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Elena Litani, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public short determineDocVersion(XMLInputSource inputSource) throws IOException {

    /**
     * This methods scans the XML declaration to find out the version
     * (and provisional encoding)  of the document.
     * The scanning is doing using XML 1.1 scanner.
     * @param inputSource
     * @return short - Constants.XML_VERSION_1_1 if document version 1.1,
     *                  otherwise Constants.XML_VERSION_1_0
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public void startDocumentParsing(XMLEntityHandler scanner, short version){

    /**
     * Reset the reference to the appropriate scanner given the version of the
     * document and start document scanning.
     * @param scanner - the scanner to use
     * @param version - the version of the document (XML 1.1 or XML 1.0).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    public void reset(XMLComponentManager componentManager)

    /**
     *
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Throws exception if required features and
     *                      properties cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected final static String fVersionSymbol = "version".intern();

    /** Symbol: "version". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLVersionDetector.java
public class XMLVersionDetector {

/**
 * This class scans the version of the document to determine
 * which scanner to use: XML 1.1 or XML 1.0.
 * The version is scanned using XML 1.1. scanner.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Elena Litani, IBM
 */
