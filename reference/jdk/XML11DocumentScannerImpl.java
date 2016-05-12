_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected void normalizeWhitespace(XMLString value, int fromIndex) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
            nonNormalizedValue.setValues(value);

            /** Both the non-normalized and normalized attribute values are equal. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected boolean scanAttributeValue(XMLString value,
                                      XMLString nonNormalizedValue,
                                      String atName,
                                      boolean checkEntities,String eleName)

    /**
     * Scans an attribute value and normalizes whitespace converting all
     * whitespace characters to space characters.
     *
     * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'"
     *
     * @param value The XMLString to fill in with the value.
     * @param nonNormalizedValue The XMLString to fill in with the
     *                           non-normalized value.
     * @param atName The name of the attribute being parsed (for error msgs).
     * @param checkEntities true if undeclared entities should be reported as VC violation,
     *                      false if undeclared entities should be reported as WFC violation.
     * @param eleName The name of element to which this attribute belongs.
     *
     * @return true if the non-normalized and normalized value are the same
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected int scanContent(XMLStringBuffer content) throws IOException, XNIException {

    /**
     * Scans element content.
     *
     * @return Returns the next character on the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    public XML11DocumentScannerImpl() {super();} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    private final XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
public class XML11DocumentScannerImpl

/**
 * This class is responsible for scanning XML document structure
 * and content. The scanner acts as the source for the document
 * information which is communicated to the document handler.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *  <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 *
 * @version $Id: XML11DocumentScannerImpl.java,v 1.5 2010/08/04 20:59:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected void normalizeWhitespace(XMLString value, int fromIndex) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
            nonNormalizedValue.setValues(value);

            /** Both the non-normalized and normalized attribute values are equal. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected boolean scanAttributeValue(XMLString value,
                                      XMLString nonNormalizedValue,
                                      String atName,
                                      boolean checkEntities,String eleName)

    /**
     * Scans an attribute value and normalizes whitespace converting all
     * whitespace characters to space characters.
     *
     * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'"
     *
     * @param value The XMLString to fill in with the value.
     * @param nonNormalizedValue The XMLString to fill in with the
     *                           non-normalized value.
     * @param atName The name of the attribute being parsed (for error msgs).
     * @param checkEntities true if undeclared entities should be reported as VC violation,
     *                      false if undeclared entities should be reported as WFC violation.
     * @param eleName The name of element to which this attribute belongs.
     *
     * @return true if the non-normalized and normalized value are the same
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    protected int scanContent(XMLStringBuffer content) throws IOException, XNIException {

    /**
     * Scans element content.
     *
     * @return Returns the next character on the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    public XML11DocumentScannerImpl() {super();} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
    private final XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11DocumentScannerImpl.java
public class XML11DocumentScannerImpl

/**
 * This class is responsible for scanning XML document structure
 * and content. The scanner acts as the source for the document
 * information which is communicated to the document handler.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *  <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 *
 * @version $Id: XML11DocumentScannerImpl.java,v 1.5 2010/08/04 20:59:09 joehw Exp $
 */
