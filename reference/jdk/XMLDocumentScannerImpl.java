_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    /**

    /**
     * Implements XMLBufferListener interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class TrailingMiscDriver

    /**
     * Driver to handle trailing miscellaneous section scanning.
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected void endOfFileHook(EOFException e)

        /**
         * End of file hook. This method is a hook for subclasses to
         * add code that handles the end of file. The end of file in
         * a document fragment is OK if the markup depth is zero.
         * However, when scanning a full XML document, an end of file
         * is always premature.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. When scanning a document fragment, there is no
         * "root" element. However, when scanning a full XML document,
         * the scanner must handle the root element specially.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean elementDepthIsZeroHook()

        /**
         * Element depth iz zero. This methos is a hook for subclasses
         * to add code to handle when the element depth hits zero. When
         * scanning a document fragment, an element depth of zero is
         * normal. However, when scanning a full XML document, the
         * scanner must handle the trailing miscellanous section of
         * the document after the end of the document's root element.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean scanForDoctypeHook()

        /**
         * Scan for DOCTYPE hook. This method is a hook for subclasses
         * to add code to handle scanning for a the "DOCTYPE" string
         * after the string "<!" has been scanned.
         *
         * @return True if the "DOCTYPE" was scanned; false if "DOCTYPE"
         *          was not scanned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected class ContentDriver

    /**
     * Driver to handle content scanning.
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                            resourceIdentifier.setValues(fDoctypePublicId, fDoctypeSystemId, null, null);

                            /**
                            fDTDDescription.setValues(fDoctypePublicId, fDoctypeSystemId, null, null);
                            fDTDDescription.setRootName(fDoctypeName);
                            XMLInputSource xmlInputSource =
                                fEntityManager.resolveEntity(fDTDDescription);
                            fDTDScanner.setInputSource(xmlInputSource);
                            setScannerState(SCANNER_STATE_DTD_EXTERNAL_DECLS);
                            again = true;
                            break;
                             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        public boolean dispatch(boolean complete)

        /**
         * Dispatch an XML "event".
         *
         * @param complete True if this driver is intended to scan
         *                 and dispatch as much as possible.
         *
         * @return True if there is more to dispatch either from this
         *          or a another driver.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class DTDDriver

    /**
     * Driver to handle the internal and external DTD subsets.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                }

                    /**
                     * if (complete) {
                     * if (fEntityScanner.scanChar() != '<') {
                     * reportFatalError("RootElementRequired", null);
                     * }
                     * setScannerState(SCANNER_STATE_ROOT_ELEMENT);
                     * setDriver(fContentDriver);
                     * }
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                    case SCANNER_STATE_COMMENT: {

                    /**
                    //this part is handled by FragmentContentHandler
                    case SCANNER_STATE_ROOT_ELEMENT: {
                        //we have read '<' and beginning of reading the start element tag
                        setScannerState(SCANNER_STATE_START_ELEMENT_TAG);
                        setDriver(fContentDriver);
                        //from now onwards this would be handled by fContentDriver,in the same next() call
                        return fContentDriver.next();
                    }
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        public int next() throws IOException, XNIException {

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event.
         *
         * Internally XML document is divided into several states. Each state represents
         * a sections of XML document. When this functions returns normally, it has read
         * the section of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class PrologDriver

    /**
     * Driver to handle prolog scanning.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class XMLDeclDriver

    /**
     * Driver to handle XMLDecl scanning.
     *
     * This class has been modified as per the new design which is more suited to
     * efficiently build pull parser. Lots of performance improvements have been done and
     * the code has been added to support stax functionality/features.
     *
     * @author Neeraj Bajaj, Sun Microsystems.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected void setEndDTDScanState() {

    /** Set the scanner state after scanning DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean scanDoctypeDecl(boolean supportDTD) throws IOException, XNIException {

    /** Scans a doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        if (fDocumentHandler != null && name.equals("[xml]")) {

        /** comment this part.. LOCATOR problem.. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public int getScannetState(){

    /**return the state of the scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public XMLDocumentScannerImpl() {} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private final XMLDTDDescription fDTDDescription = new XMLDTDDescription(null, null, null, null, null);

    /** A DTD Description. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private XMLInputSource fExternalSubsetSource = null;

    /** External subset source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fTrailingMiscDriver = new TrailingMiscDriver();

    /** Trailing miscellaneous section driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fDTDDriver = null ;

    /** DTD driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fPrologDriver = new PrologDriver();

    /** Prolog driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fXMLDeclDriver = new XMLDeclDriver();

    /** XML declaration driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean fSeenDoctypeDecl;

    /** Seen doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean fLoadExternalDTD = true;

    /** Load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected NamespaceContext fNamespaceContext = new NamespaceSupport();

    /** Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypeSystemId;

    /** Doctype declaration system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypePublicId;

    /** Doctype declaration public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypeName;

    /** Doctype name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    //xxx: fValidationManager code needs to be added yet!

    /** Validation manager . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected XMLDTDScanner fDTDScanner = null;

    /** DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String NAMESPACE_CONTEXT =

    /** property identifier:  NamespaceContext */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_NO_SUCH_ELEMENT_EXCEPTION = 48;

    /** Scanner state: NO MORE ELEMENTS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_EXTERNAL_DECLS = 47;

    /** Scanner state: DTD external declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_EXTERNAL = 46;

    /** Scanner state: open DTD external subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_INTERNAL_DECLS = 45;

    /** Scanner state: DTD internal declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_TRAILING_MISC = 44;

    /** Scanner state: trailing misc. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_PROLOG = 43;

    /** Scanner state: prolog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_XML_DECL = 42;

    /** Scanner state: XML declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
public class XMLDocumentScannerImpl

/**
 * This class is responsible for scanning XML document structure
 * and content.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author K.Venugopal, Sun Microsystems
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author Sunitha Reddy, Sun Microsystems
 *
 * Refer to the table in unit-test javax.xml.stream.XMLStreamReaderTest.SupportDTD for changes
 * related to property SupportDTD.
 * @author Joe Wang, Sun Microsystems
 * @version $Id: XMLDocumentScannerImpl.java,v 1.17 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    /**

    /**
     * Implements XMLBufferListener interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class TrailingMiscDriver

    /**
     * Driver to handle trailing miscellaneous section scanning.
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected void endOfFileHook(EOFException e)

        /**
         * End of file hook. This method is a hook for subclasses to
         * add code that handles the end of file. The end of file in
         * a document fragment is OK if the markup depth is zero.
         * However, when scanning a full XML document, an end of file
         * is always premature.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean scanRootElementHook()

        /**
         * Scan for root element hook. This method is a hook for
         * subclasses to add code that handles scanning for the root
         * element. When scanning a document fragment, there is no
         * "root" element. However, when scanning a full XML document,
         * the scanner must handle the root element specially.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean elementDepthIsZeroHook()

        /**
         * Element depth iz zero. This methos is a hook for subclasses
         * to add code to handle when the element depth hits zero. When
         * scanning a document fragment, an element depth of zero is
         * normal. However, when scanning a full XML document, the
         * scanner must handle the trailing miscellanous section of
         * the document after the end of the document's root element.
         *
         * @return True if the caller should stop and return true which
         *          allows the scanner to switch to a new scanning
         *          driver. A return value of false indicates that
         *          the content driver should continue as normal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        protected boolean scanForDoctypeHook()

        /**
         * Scan for DOCTYPE hook. This method is a hook for subclasses
         * to add code to handle scanning for a the "DOCTYPE" string
         * after the string "<!" has been scanned.
         *
         * @return True if the "DOCTYPE" was scanned; false if "DOCTYPE"
         *          was not scanned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected class ContentDriver

    /**
     * Driver to handle content scanning.
     *
     * @author Andy Clark, IBM
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                            resourceIdentifier.setValues(fDoctypePublicId, fDoctypeSystemId, null, null);

                            /**
                            fDTDDescription.setValues(fDoctypePublicId, fDoctypeSystemId, null, null);
                            fDTDDescription.setRootName(fDoctypeName);
                            XMLInputSource xmlInputSource =
                                fEntityManager.resolveEntity(fDTDDescription);
                            fDTDScanner.setInputSource(xmlInputSource);
                            setScannerState(SCANNER_STATE_DTD_EXTERNAL_DECLS);
                            again = true;
                            break;
                             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        public boolean dispatch(boolean complete)

        /**
         * Dispatch an XML "event".
         *
         * @param complete True if this driver is intended to scan
         *                 and dispatch as much as possible.
         *
         * @return True if there is more to dispatch either from this
         *          or a another driver.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class DTDDriver

    /**
     * Driver to handle the internal and external DTD subsets.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                }

                    /**
                     * if (complete) {
                     * if (fEntityScanner.scanChar() != '<') {
                     * reportFatalError("RootElementRequired", null);
                     * }
                     * setScannerState(SCANNER_STATE_ROOT_ELEMENT);
                     * setDriver(fContentDriver);
                     * }
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
                    case SCANNER_STATE_COMMENT: {

                    /**
                    //this part is handled by FragmentContentHandler
                    case SCANNER_STATE_ROOT_ELEMENT: {
                        //we have read '<' and beginning of reading the start element tag
                        setScannerState(SCANNER_STATE_START_ELEMENT_TAG);
                        setDriver(fContentDriver);
                        //from now onwards this would be handled by fContentDriver,in the same next() call
                        return fContentDriver.next();
                    }
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        public int next() throws IOException, XNIException {

        /**
         * Drives the parser to the next state/event on the input. Parser is guaranteed
         * to stop at the next state/event.
         *
         * Internally XML document is divided into several states. Each state represents
         * a sections of XML document. When this functions returns normally, it has read
         * the section of XML document and returns the state corresponding to section of
         * document which has been read. For optimizations, a particular driver
         * can read ahead of the section of document (state returned) just read and
         * can maintain a different internal state.
         *
         * @return state representing the section of document just read.
         *
         * @throws IOException  Thrown on i/o error.
         * @throws XNIException Thrown on parse error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class PrologDriver

    /**
     * Driver to handle prolog scanning.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected final class XMLDeclDriver

    /**
     * Driver to handle XMLDecl scanning.
     *
     * This class has been modified as per the new design which is more suited to
     * efficiently build pull parser. Lots of performance improvements have been done and
     * the code has been added to support stax functionality/features.
     *
     * @author Neeraj Bajaj, Sun Microsystems.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected void setEndDTDScanState() {

    /** Set the scanner state after scanning DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean scanDoctypeDecl(boolean supportDTD) throws IOException, XNIException {

    /** Scans a doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver createContentDriver() {

    /** Creates a content driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public int next() throws IOException, XNIException {

    /** return the next state on the input
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
        if (fDocumentHandler != null && name.equals("[xml]")) {

        /** comment this part.. LOCATOR problem.. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public int getScannetState(){

    /**return the state of the scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    public XMLDocumentScannerImpl() {} // <init>()

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private final XMLDTDDescription fDTDDescription = new XMLDTDDescription(null, null, null, null, null);

    /** A DTD Description. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private XMLInputSource fExternalSubsetSource = null;

    /** External subset source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fTrailingMiscDriver = new TrailingMiscDriver();

    /** Trailing miscellaneous section driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fDTDDriver = null ;

    /** DTD driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fPrologDriver = new PrologDriver();

    /** Prolog driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected Driver fXMLDeclDriver = new XMLDeclDriver();

    /** XML declaration driver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean fSeenDoctypeDecl;

    /** Seen doctype declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected boolean fLoadExternalDTD = true;

    /** Load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected NamespaceContext fNamespaceContext = new NamespaceSupport();

    /** Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypeSystemId;

    /** Doctype declaration system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypePublicId;

    /** Doctype declaration public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected String fDoctypeName;

    /** Doctype name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    //xxx: fValidationManager code needs to be added yet!

    /** Validation manager . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected XMLDTDScanner fDTDScanner = null;

    /** DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String NAMESPACE_CONTEXT =

    /** property identifier:  NamespaceContext */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_NO_SUCH_ELEMENT_EXCEPTION = 48;

    /** Scanner state: NO MORE ELEMENTS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_EXTERNAL_DECLS = 47;

    /** Scanner state: DTD external declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_EXTERNAL = 46;

    /** Scanner state: open DTD external subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_DTD_INTERNAL_DECLS = 45;

    /** Scanner state: DTD internal declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_TRAILING_MISC = 44;

    /** Scanner state: trailing misc. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_PROLOG = 43;

    /** Scanner state: prolog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
    protected static final int SCANNER_STATE_XML_DECL = 42;

    /** Scanner state: XML declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDocumentScannerImpl.java
public class XMLDocumentScannerImpl

/**
 * This class is responsible for scanning XML document structure
 * and content.
 *
 * This class has been modified as per the new design which is more suited to
 * efficiently build pull parser. Lot of improvements have been done and
 * the code has been added to support stax functionality/features.
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author K.Venugopal, Sun Microsystems
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author Sunitha Reddy, Sun Microsystems
 *
 * Refer to the table in unit-test javax.xml.stream.XMLStreamReaderTest.SupportDTD for changes
 * related to property SupportDTD.
 * @author Joe Wang, Sun Microsystems
 * @version $Id: XMLDocumentScannerImpl.java,v 1.17 2010-11-01 04:39:41 joehw Exp $
 */
