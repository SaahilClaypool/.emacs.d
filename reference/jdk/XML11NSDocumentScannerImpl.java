_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
        private void reconfigurePipeline() {

        /**
         * Re-configures pipeline by removing the DTD validator
         * if no DTD grammar exists. If no validator exists in the
         * pipeline or there is no DTD grammar, namespace binding
         * is performed by the scanner in the enclosing class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected final class NS11ContentDriver extends ContentDriver {

    /**
     * Driver to handle content scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content Driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected int scanEndElement() throws IOException, XNIException {

    /**
     * Scans an end element.
     * <p>
     * <pre>
     * [42] ETag ::= '&lt;/' Name S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName variable.
     * The contents of this variable will be destroyed. The caller should
     * copy the needed information out of this variable before calling
     * this method.
     *
     * @return The element depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected void scanAttribute(XMLAttributesImpl attributes)

    /**
     * Scans an attribute.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean scanStartElementAfterName()

    /**
     * Scans the remainder of a start or empty tag after the element name.
     *
     * @see #scanStartElement
     * @return True if element is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected void scanStartElementName ()

    /**
     * Scans the name of an element in a start or empty tag.
     *
     * @see #scanStartElement()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean scanStartElement() throws IOException, XNIException {

    /**
     * Scans a start element. This method will handle the binding of
     * namespace information and notifying the handler of the start
     * of the element.
     * <p>
     * <pre>
     * [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>'
     * [40] STag ::= '&lt;' Name (S Attribute)* S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the leading
     * '&lt;' character has been consumed.
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName and
     * fAttributes variables. The contents of these variables will be
     * destroyed. The caller should copy important information out of
     * these variables before calling this method.
     *
     * @return True if element is empty. (i.e. It matches
     *          production [44].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    public void setDTDValidator(XMLDTDValidatorFilter validator) {

    /**
     * The scanner is responsible for removing DTD validator
     * from the pipeline if it is not needed.
     *
     * @param validator the DTD validator from the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    private boolean fSawSpace;

    /**
     * Saw spaces after element name or between attributes.
     *
     * This is reserved for the case where scanning of a start element spans
     * several methods, as is the case when scanning the start of a root element
     * where a DTD external subset may be read after scanning the element name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    private XMLDTDValidatorFilter fDTDValidator;

    /** DTD validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean fPerformValidation;

    /**
     * If validating parser, make sure we report an error in the
     *  scanner if DTD grammar is missing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean fBindNamespaces;

    /**
     * If is true, the dtd validator is no longer in the pipeline
     * and the scanner should bind namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
public class XML11NSDocumentScannerImpl extends XML11DocumentScannerImpl {

/**
 * The scanner acts as the source for the document
 * information which is communicated to the document handler.
 *
 * This class scans an XML document, checks if document has a DTD, and if
 * DTD is not found the scanner will remove the DTD Validator from the pipeline and perform
 * namespace binding.
 *
 * Note: This scanner should only be used when the namespace processing is on!
 *
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces {true} -- if the value of this
 *      feature is set to false this scanner must not be used.</li>
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
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 * @author Sunitha Reddy, Sun Microsystems
 * @version $Id: XML11NSDocumentScannerImpl.java,v 1.6 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
        private void reconfigurePipeline() {

        /**
         * Re-configures pipeline by removing the DTD validator
         * if no DTD grammar exists. If no validator exists in the
         * pipeline or there is no DTD grammar, namespace binding
         * is performed by the scanner in the enclosing class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected final class NS11ContentDriver extends ContentDriver {

    /**
     * Driver to handle content scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content Driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected int scanEndElement() throws IOException, XNIException {

    /**
     * Scans an end element.
     * <p>
     * <pre>
     * [42] ETag ::= '&lt;/' Name S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName variable.
     * The contents of this variable will be destroyed. The caller should
     * copy the needed information out of this variable before calling
     * this method.
     *
     * @return The element depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected void scanAttribute(XMLAttributesImpl attributes)

    /**
     * Scans an attribute.
     * <p>
     * <pre>
     * [41] Attribute ::= Name Eq AttValue
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the next
     * character on the stream is the first character of the attribute
     * name.
     * <p>
     * <strong>Note:</strong> This method uses the fAttributeQName and
     * fQName variables. The contents of these variables will be
     * destroyed.
     *
     * @param attributes The attributes list for the scanned attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean scanStartElementAfterName()

    /**
     * Scans the remainder of a start or empty tag after the element name.
     *
     * @see #scanStartElement
     * @return True if element is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected void scanStartElementName ()

    /**
     * Scans the name of an element in a start or empty tag.
     *
     * @see #scanStartElement()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean scanStartElement() throws IOException, XNIException {

    /**
     * Scans a start element. This method will handle the binding of
     * namespace information and notifying the handler of the start
     * of the element.
     * <p>
     * <pre>
     * [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>'
     * [40] STag ::= '&lt;' Name (S Attribute)* S? '>'
     * </pre>
     * <p>
     * <strong>Note:</strong> This method assumes that the leading
     * '&lt;' character has been consumed.
     * <p>
     * <strong>Note:</strong> This method uses the fElementQName and
     * fAttributes variables. The contents of these variables will be
     * destroyed. The caller should copy important information out of
     * these variables before calling this method.
     *
     * @return True if element is empty. (i.e. It matches
     *          production [44].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    public void setDTDValidator(XMLDTDValidatorFilter validator) {

    /**
     * The scanner is responsible for removing DTD validator
     * from the pipeline if it is not needed.
     *
     * @param validator the DTD validator from the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    private boolean fSawSpace;

    /**
     * Saw spaces after element name or between attributes.
     *
     * This is reserved for the case where scanning of a start element spans
     * several methods, as is the case when scanning the start of a root element
     * where a DTD external subset may be read after scanning the element name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    private XMLDTDValidatorFilter fDTDValidator;

    /** DTD validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean fPerformValidation;

    /**
     * If validating parser, make sure we report an error in the
     *  scanner if DTD grammar is missing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
    protected boolean fBindNamespaces;

    /**
     * If is true, the dtd validator is no longer in the pipeline
     * and the scanner should bind namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XML11NSDocumentScannerImpl.java
public class XML11NSDocumentScannerImpl extends XML11DocumentScannerImpl {

/**
 * The scanner acts as the source for the document
 * information which is communicated to the document handler.
 *
 * This class scans an XML document, checks if document has a DTD, and if
 * DTD is not found the scanner will remove the DTD Validator from the pipeline and perform
 * namespace binding.
 *
 * Note: This scanner should only be used when the namespace processing is on!
 *
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces {true} -- if the value of this
 *      feature is set to false this scanner must not be used.</li>
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
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 * @author Sunitha Reddy, Sun Microsystems
 * @version $Id: XML11NSDocumentScannerImpl.java,v 1.6 2010-11-01 04:39:40 joehw Exp $
 */
