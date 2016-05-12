_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected int isUnchangedByNormalization(XMLString value) {

    /**
     * Checks whether this string would be unchanged by normalization.
     *
     * @return -1 if the value would be unchanged by normalization,
     * otherwise the index of the first whitespace character which
     * would be transformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected void normalizeWhitespace(XMLString value, int fromIndex) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected boolean scanPubidLiteral(XMLString literal)

    /**
     * Scans public ID literal.
     *
     * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'"
     * [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%]
     *
     * The returned string is normalized according to the following rule,
     * from http://www.w3.org/TR/REC-xml#dt-pubid:
     *
     * Before a match is attempted, all strings of white space in the public
     * identifier must be normalized to single space characters (#x20), and
     * leading and trailing white space must be removed.
     *
     * @param literal The string to fill in with the public ID literal.
     * @return True on success.
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it at
     * the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    public XML11DTDScannerImpl(SymbolTable symbolTable,
                XMLErrorReporter errorReporter, XMLEntityManager entityManager) {

    /** Constructor for he use of non-XMLComponentManagers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    public XML11DTDScannerImpl() {super();} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
public class XML11DTDScannerImpl

/**
 * This class is responsible for scanning the declarations found
 * in the internal and external subsets of a DTD in an XML document.
 * The scanner acts as the sources for the DTD information which is
 * communicated to the DTD handlers.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Glenn Marcy, IBM
 * @author Eric Ye, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected int isUnchangedByNormalization(XMLString value) {

    /**
     * Checks whether this string would be unchanged by normalization.
     *
     * @return -1 if the value would be unchanged by normalization,
     * otherwise the index of the first whitespace character which
     * would be transformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected void normalizeWhitespace(XMLString value, int fromIndex) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    protected boolean scanPubidLiteral(XMLString literal)

    /**
     * Scans public ID literal.
     *
     * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'"
     * [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%]
     *
     * The returned string is normalized according to the following rule,
     * from http://www.w3.org/TR/REC-xml#dt-pubid:
     *
     * Before a match is attempted, all strings of white space in the public
     * identifier must be normalized to single space characters (#x20), and
     * leading and trailing white space must be removed.
     *
     * @param literal The string to fill in with the public ID literal.
     * @return True on success.
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it at
     * the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    public XML11DTDScannerImpl(SymbolTable symbolTable,
                XMLErrorReporter errorReporter, XMLEntityManager entityManager) {

    /** Constructor for he use of non-XMLComponentManagers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    public XML11DTDScannerImpl() {super();} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DTDScannerImpl.java
public class XML11DTDScannerImpl

/**
 * This class is responsible for scanning the declarations found
 * in the internal and external subsets of a DTD in an XML document.
 * The scanner acts as the sources for the DTD information which is
 * communicated to the DTD handlers.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Glenn Marcy, IBM
 * @author Eric Ye, IBM
 *
 */
