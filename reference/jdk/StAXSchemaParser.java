_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    final void fillQName(QName toFill, String uri, String localpart, String prefix) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillQName(QName toFill, javax.xml.namespace.QName toCopy) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(XMLStreamReader reader) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(Iterator namespaces) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(EndElement event) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(StartElement event) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void sendCharactersToSchemaParser(String str, boolean whitespace) {

    /** Send characters to the validator in CHUNK_SIZE character chunks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final JAXPNamespaceContextWrapper fNamespaceContext = new JAXPNamespaceContextWrapper(fSymbolTable);

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final StAXLocationWrapper fLocationWrapper = new StAXLocationWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private SchemaDOMParser fSchemaDOMParser;

    /** SchemaDOMParser, events will be delegated to SchemaDOMParser to pass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final char [] fCharBuffer = new char[CHUNK_SIZE];

    /** Array for holding character data. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private static final int CHUNK_SIZE = (1 << 10);

    /** Chunk size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
final class StAXSchemaParser {

/**
 * <p>StAXSchemaParser reads StAX events, converts them into XNI events
 * and passes them directly to the SchemaDOMParser.</p>
 *
 * @xerces.internal
 *
 * @version $Id: StAXSchemaParser.java,v 1.2 2010-10-26 23:01:12 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    final void fillQName(QName toFill, String uri, String localpart, String prefix) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillQName(QName toFill, javax.xml.namespace.QName toCopy) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(XMLStreamReader reader) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(Iterator namespaces) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(EndElement event) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void fillDeclaredPrefixes(StartElement event) {

    /** Fills in the list of declared prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private void sendCharactersToSchemaParser(String str, boolean whitespace) {

    /** Send characters to the validator in CHUNK_SIZE character chunks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final JAXPNamespaceContextWrapper fNamespaceContext = new JAXPNamespaceContextWrapper(fSymbolTable);

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final StAXLocationWrapper fLocationWrapper = new StAXLocationWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private SchemaDOMParser fSchemaDOMParser;

    /** SchemaDOMParser, events will be delegated to SchemaDOMParser to pass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private final char [] fCharBuffer = new char[CHUNK_SIZE];

    /** Array for holding character data. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
    private static final int CHUNK_SIZE = (1 << 10);

    /** Chunk size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/StAXSchemaParser.java
final class StAXSchemaParser {

/**
 * <p>StAXSchemaParser reads StAX events, converts them into XNI events
 * and passes them directly to the SchemaDOMParser.</p>
 *
 * @xerces.internal
 *
 * @version $Id: StAXSchemaParser.java,v 1.2 2010-10-26 23:01:12 joehw Exp $
 */
