_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        private void reconfigurePipeline() {

        /**
         * Re-configures pipeline by removing the DTD validator
         * if no DTD grammar exists. If no validator exists in the
         * pipeline or there is no DTD grammar, namespace binding
         * is performed by the scanner in the enclosing class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. This method will also attempt to remove DTD validator
         * from the pipeline, if there is no DTD grammar. If DTD validator
         * is no longer in the pipeline bind namespaces in the scanner.
         *
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected final class NSContentDriver

    /**
     * Driver to handle content scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        //this function doesn't use 'attIndex'. We are adding the attribute later

        ///fTempString2 would store attribute non-normalized value
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean scanStartElement()

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public void setDTDValidator(XMLDTDValidatorFilter dtd){

    /**
     * The scanner is responsible for removing DTD validator
     * from the pipeline if it is not needed.
     *
     * @param previous The filter component before DTDValidator
     * @param dtdValidator
     *                 The DTDValidator
     * @param next     The documentHandler after the DTDValidator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public void reset(PropertyManager propertyManager) {

    /** Resets the fields of this scanner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
     private boolean fXmlnsDeclared = false;

     /** xmlns, default Namespace, declared */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
     private XMLDTDValidatorFilter fDTDValidator;

    /** DTD validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fNotAddNSDeclAsAttribute = false;

    /** Default value of this feature is false, when in Stax mode this should be true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fPerformValidation;

    /** If validating parser, make sure we report an error in the
     *   scanner if DTD grammar is missing.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fBindNamespaces;

    /**
     * If is true, the dtd validator is no longer in the pipeline
     * and the scanner should bind namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
public class XMLNSDocumentScannerImpl

/**
 * This class adds the functionality of namespace processing.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 *
 * This class scans an XML document, checks if document has a DTD, and if
 * DTD is not found the scanner will remove the DTD Validator from the pipeline and perform
 * namespace binding.
 *
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author Venugopal Rao K, Sun Microsystems
 * @author Elena Litani, IBM
 * @version $Id: XMLNSDocumentScannerImpl.java,v 1.11 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        private void reconfigurePipeline() {

        /**
         * Re-configures pipeline by removing the DTD validator
         * if no DTD grammar exists. If no validator exists in the
         * pipeline or there is no DTD grammar, namespace binding
         * is performed by the scanner in the enclosing class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. This method will also attempt to remove DTD validator
         * from the pipeline, if there is no DTD grammar. If DTD validator
         * is no longer in the pipeline bind namespaces in the scanner.
         *
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected final class NSContentDriver

    /**
     * Driver to handle content scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
        //this function doesn't use 'attIndex'. We are adding the attribute later

        ///fTempString2 would store attribute non-normalized value
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean scanStartElement()

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public void setDTDValidator(XMLDTDValidatorFilter dtd){

    /**
     * The scanner is responsible for removing DTD validator
     * from the pipeline if it is not needed.
     *
     * @param previous The filter component before DTDValidator
     * @param dtdValidator
     *                 The DTDValidator
     * @param next     The documentHandler after the DTDValidator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    public void reset(PropertyManager propertyManager) {

    /** Resets the fields of this scanner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
     private boolean fXmlnsDeclared = false;

     /** xmlns, default Namespace, declared */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
     private XMLDTDValidatorFilter fDTDValidator;

    /** DTD validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fNotAddNSDeclAsAttribute = false;

    /** Default value of this feature is false, when in Stax mode this should be true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fPerformValidation;

    /** If validating parser, make sure we report an error in the
     *   scanner if DTD grammar is missing.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
    protected boolean fBindNamespaces;

    /**
     * If is true, the dtd validator is no longer in the pipeline
     * and the scanner should bind namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLNSDocumentScannerImpl.java
public class XMLNSDocumentScannerImpl

/**
 * This class adds the functionality of namespace processing.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 *
 * This class scans an XML document, checks if document has a DTD, and if
 * DTD is not found the scanner will remove the DTD Validator from the pipeline and perform
 * namespace binding.
 *
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author Venugopal Rao K, Sun Microsystems
 * @author Elena Litani, IBM
 * @version $Id: XMLNSDocumentScannerImpl.java,v 1.11 2010-11-01 04:39:41 joehw Exp $
 */
