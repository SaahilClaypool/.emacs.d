_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private void ensureCapacity(int size) {

        /** Ensures capacity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public void clear() {

        /** Clears the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public boolean pop() {

        /** Pops a value off of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public void push(boolean value) {

        /** Pushes a value onto the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public int size() {

        /** Returns the size of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private boolean[] fData;

        /** Stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private int fDepth;

        /** Stack depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    private static final class BooleanStack {

    /**
     * A simple boolean based stack.
     *
     * @xerces.internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void resetNodePool() {

    /**
     * ResetNodePool on SchemaParsingConfig
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void reset() {

    /**
     * Reset SchemaParsingConfig
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void parse(XMLInputSource inputSource) throws IOException {

    /**
     * Delegates parsing to SchemaParsingConfig
     *
     * @param inputSource
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setEntityResolver(XMLEntityResolver er) {

    /**
     * Delegates to SchemaParsingConfig.setEntityResolver.
     * @param er XMLEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public Object getProperty(String propertyId){

    /**
     * Delegates to SchemaParsingConfig.getProperty.
     * @param propertyId
     * @return Object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setProperty(String propertyId, Object value){

    /**
     * Delegates to SchemaParsingConfig.setProperty.
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public boolean getFeature(String featureId){

    /**
     * Delegates to SchemaParsingConfig.getFeature
     * @param featureId
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setFeature(String featureId, boolean state){

    /**
     * Delegates to SchemaParsingConfig.setFeature
     * @param featureId
     * @param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public Document getDocument() {

    /**
     * Returns the DOM document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    private boolean hasNonSchemaAttributes(QName element, XMLAttributes attributes) {

    /**
     * @param attributes
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void processingInstruction(String target, XMLString data, Augmentations augs)

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public SchemaDOMParser(XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public static final String GENERATE_SYNTHETIC_ANNOTATION =

    /** Feature identifier: generate synthetic annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
public class SchemaDOMParser extends DefaultXMLDocumentHandler {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: SchemaDOMParser.java,v 1.8 2010-11-01 04:40:01 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private void ensureCapacity(int size) {

        /** Ensures capacity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public void clear() {

        /** Clears the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public boolean pop() {

        /** Pops a value off of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public void push(boolean value) {

        /** Pushes a value onto the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        public int size() {

        /** Returns the size of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private boolean[] fData;

        /** Stack data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
        private int fDepth;

        /** Stack depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    private static final class BooleanStack {

    /**
     * A simple boolean based stack.
     *
     * @xerces.internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void resetNodePool() {

    /**
     * ResetNodePool on SchemaParsingConfig
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void reset() {

    /**
     * Reset SchemaParsingConfig
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void parse(XMLInputSource inputSource) throws IOException {

    /**
     * Delegates parsing to SchemaParsingConfig
     *
     * @param inputSource
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setEntityResolver(XMLEntityResolver er) {

    /**
     * Delegates to SchemaParsingConfig.setEntityResolver.
     * @param er XMLEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public Object getProperty(String propertyId){

    /**
     * Delegates to SchemaParsingConfig.getProperty.
     * @param propertyId
     * @return Object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setProperty(String propertyId, Object value){

    /**
     * Delegates to SchemaParsingConfig.setProperty.
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public boolean getFeature(String featureId){

    /**
     * Delegates to SchemaParsingConfig.getFeature
     * @param featureId
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void setFeature(String featureId, boolean state){

    /**
     * Delegates to SchemaParsingConfig.setFeature
     * @param featureId
     * @param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public Document getDocument() {

    /**
     * Returns the DOM document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    private boolean hasNonSchemaAttributes(QName element, XMLAttributes attributes) {

    /**
     * @param attributes
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void processingInstruction(String target, XMLString data, Augmentations augs)

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public SchemaDOMParser(XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public static final String GENERATE_SYNTHETIC_ANNOTATION =

    /** Feature identifier: generate synthetic annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaDOMParser.java
public class SchemaDOMParser extends DefaultXMLDocumentHandler {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: SchemaDOMParser.java,v 1.8 2010-11-01 04:40:01 joehw Exp $
 */
