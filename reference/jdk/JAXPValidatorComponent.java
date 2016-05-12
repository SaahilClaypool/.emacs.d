_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final TypeInfoProvider noInfoProvider = new TypeInfoProvider() {

    /**
     * {@link TypeInfoProvider} that returns no info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        }

            /** Augmentations augs = fCurrentAttributes.getAugmentations(j);
            augs.putItem( Constants.TYPEINFO,
                typeInfoProvider.getAttributeTypeInfo(i) );
            augs.putItem( Constants.ID_ATTRIBUTE,
                typeInfoProvider.isIdAttribute(i)?Boolean.TRUE:Boolean.FALSE ); **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private void updateAttributes( Attributes atts ) {

    /**
     * Compares the given {@link Attributes} with {@link #fCurrentAttributes}
     * and update the latter accordingly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void fatalError(SAXParseException e) throws SAXException {

        /** Fatal Error: Throws back SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void error(SAXParseException e) throws SAXException {

        /** Error: Throws back SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void warning(SAXParseException e) throws SAXException {

        /** Warning: Ignore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public static DraconianErrorHandler getInstance() {

        /** Returns the one and only instance of this error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private static final DraconianErrorHandler ERROR_HANDLER_INSTANCE

        /**
         * Singleton instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final AttributesProxy fAttributesProxy = new AttributesProxy(null);

        /**
         * For efficiency, we reuse one instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        protected NamespaceContext fNamespaceContext;

        /** Namespace context */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private final class XNI2SAX extends DefaultXMLDocumentHandler {

    /**
     * Converts {@link XNI} events to {@link ContentHandler} events.
     *
     * <p>
     * Deriving from {@link DefaultXMLDocumentHandler}
     * to reuse its default {@link com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler}
     * implementation.
     *
     * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private QName toQName( String uri, String localName, String qname ) {

        /**
         * Creates a proper {@link QName} object from 3 parts.
         * <p>
         * This method does the symbolization.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private SAXException toSAXException( XNIException xe ) {

        /**
         * Converts the {@link XNIException} received from a downstream
         * component to a {@link SAXException}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private XMLDocumentHandler handler() {

        /**
         * Get the handler to which we should send events.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private Augmentations aug() {

        /**
         * Gets the {@link Augmentations} that should be associated with
         * the current event.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
            return aug;

            /** aug.putItem(Constants.TYPEINFO,typeInfoProvider.getElementTypeInfo()); **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final QName fQName = new QName();

        /**
         * {@link QName} to send along events.
         * we reuse one QName for efficiency.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final Augmentations fAugmentations = new AugmentationsImpl();

        /**
         * {@link Augmentations} to send along with events.
         * We reuse one object for efficiency.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private final class SAX2XNI extends DefaultHandler {

    /**
     *
     * Uses {@link DefaultHandler} as a default implementation of
     * {@link ContentHandler}.
     *
     * <p>
     * We only forward certain events from a {@link ValidatorHandler}.
     * Other events should go "the 2nd direct route".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    public JAXPValidatorComponent( ValidatorHandler validatorHandler ) {

    /**
     * @param validatorHandler may not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private XMLAttributes fCurrentAttributes;

    /**
     * {@link XMLAttributes} version of {@link #fCurrentAug}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private Augmentations fCurrentAug;

    /**
     * Used to store the {@link Augmentations} associated with the
     * current event, so that we can pick it up again
     * when the event is forwarded by the {@link ValidatorHandler}.
     *
     * UGLY HACK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
final class JAXPValidatorComponent

/**
 * Runs events through a {@link javax.xml.validation.ValidatorHandler}
 * and performs validation/infoset-augmentation by an external validator.
 *
 * <p>
 * This component sets up the pipeline as follows:
 *
 * <!-- this picture may look teribble on your IDE but it is correct. -->
 * <pre>
 *             __                                           __
 *            /  |==> XNI2SAX --> Validator --> SAX2XNI ==>|
 *           /   |                                         |
 *       ==>| Tee|                                         | next
 *           \   |                                         |  component
 *            \  |============other XNI events============>|
 *             ~~                                           ~~
 * </pre>
 * <p>
 * only those events that need to go through Validator will go the 1st route,
 * and other events go the 2nd direct route.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final TypeInfoProvider noInfoProvider = new TypeInfoProvider() {

    /**
     * {@link TypeInfoProvider} that returns no info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        }

            /** Augmentations augs = fCurrentAttributes.getAugmentations(j);
            augs.putItem( Constants.TYPEINFO,
                typeInfoProvider.getAttributeTypeInfo(i) );
            augs.putItem( Constants.ID_ATTRIBUTE,
                typeInfoProvider.isIdAttribute(i)?Boolean.TRUE:Boolean.FALSE ); **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private void updateAttributes( Attributes atts ) {

    /**
     * Compares the given {@link Attributes} with {@link #fCurrentAttributes}
     * and update the latter accordingly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void fatalError(SAXParseException e) throws SAXException {

        /** Fatal Error: Throws back SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void error(SAXParseException e) throws SAXException {

        /** Error: Throws back SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public void warning(SAXParseException e) throws SAXException {

        /** Warning: Ignore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        public static DraconianErrorHandler getInstance() {

        /** Returns the one and only instance of this error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private static final DraconianErrorHandler ERROR_HANDLER_INSTANCE

        /**
         * Singleton instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final AttributesProxy fAttributesProxy = new AttributesProxy(null);

        /**
         * For efficiency, we reuse one instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        protected NamespaceContext fNamespaceContext;

        /** Namespace context */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private final class XNI2SAX extends DefaultXMLDocumentHandler {

    /**
     * Converts {@link XNI} events to {@link ContentHandler} events.
     *
     * <p>
     * Deriving from {@link DefaultXMLDocumentHandler}
     * to reuse its default {@link com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler}
     * implementation.
     *
     * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private QName toQName( String uri, String localName, String qname ) {

        /**
         * Creates a proper {@link QName} object from 3 parts.
         * <p>
         * This method does the symbolization.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private SAXException toSAXException( XNIException xe ) {

        /**
         * Converts the {@link XNIException} received from a downstream
         * component to a {@link SAXException}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private XMLDocumentHandler handler() {

        /**
         * Get the handler to which we should send events.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private Augmentations aug() {

        /**
         * Gets the {@link Augmentations} that should be associated with
         * the current event.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
            return aug;

            /** aug.putItem(Constants.TYPEINFO,typeInfoProvider.getElementTypeInfo()); **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final QName fQName = new QName();

        /**
         * {@link QName} to send along events.
         * we reuse one QName for efficiency.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
        private final Augmentations fAugmentations = new AugmentationsImpl();

        /**
         * {@link Augmentations} to send along with events.
         * We reuse one object for efficiency.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private final class SAX2XNI extends DefaultHandler {

    /**
     *
     * Uses {@link DefaultHandler} as a default implementation of
     * {@link ContentHandler}.
     *
     * <p>
     * We only forward certain events from a {@link ValidatorHandler}.
     * Other events should go "the 2nd direct route".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    public JAXPValidatorComponent( ValidatorHandler validatorHandler ) {

    /**
     * @param validatorHandler may not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private XMLAttributes fCurrentAttributes;

    /**
     * {@link XMLAttributes} version of {@link #fCurrentAug}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private Augmentations fCurrentAug;

    /**
     * Used to store the {@link Augmentations} associated with the
     * current event, so that we can pick it up again
     * when the event is forwarded by the {@link ValidatorHandler}.
     *
     * UGLY HACK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
    private static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/JAXPValidatorComponent.java
final class JAXPValidatorComponent

/**
 * Runs events through a {@link javax.xml.validation.ValidatorHandler}
 * and performs validation/infoset-augmentation by an external validator.
 *
 * <p>
 * This component sets up the pipeline as follows:
 *
 * <!-- this picture may look teribble on your IDE but it is correct. -->
 * <pre>
 *             __                                           __
 *            /  |==> XNI2SAX --> Validator --> SAX2XNI ==>|
 *           /   |                                         |
 *       ==>| Tee|                                         | next
 *           \   |                                         |  component
 *            \  |============other XNI events============>|
 *             ~~                                           ~~
 * </pre>
 * <p>
 * only those events that need to go through Validator will go the 1st route,
 * and other events go the 2nd direct route.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
