_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    public SchemaContentHandler() {}

    /**
     * <p>Constructs an SchemaContentHandler.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fStringsInternalized = false;

    /** Flag used to track whether XML names and Namespace URIs have been internalized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fNamespacePrefixes = false;

    /** Flag used to track whether namespace declarations are reported as attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fNeedPushNSContext;

    /** Indicate if push NamespaceContest is needed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private NamespaceSupport fNamespaceContext = new NamespaceSupport();

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private final SAXLocatorWrapper fSAXLocatorWrapper = new SAXLocatorWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private SchemaDOMParser fSchemaDOMParser;

    /** SchemaDOMParser, events will be delegated to SchemaDOMParser to pass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
final class SchemaContentHandler implements ContentHandler {

/**
 * <p>SchemaContentHandler converts SAX events into XNI
 * and passes them directly to the SchemaDOMParser.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @author Jack Z. Wang, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    public SchemaContentHandler() {}

    /**
     * <p>Constructs an SchemaContentHandler.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fStringsInternalized = false;

    /** Flag used to track whether XML names and Namespace URIs have been internalized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fNamespacePrefixes = false;

    /** Flag used to track whether namespace declarations are reported as attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private boolean fNeedPushNSContext;

    /** Indicate if push NamespaceContest is needed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private NamespaceSupport fNamespaceContext = new NamespaceSupport();

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private final SAXLocatorWrapper fSAXLocatorWrapper = new SAXLocatorWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private SchemaDOMParser fSchemaDOMParser;

    /** SchemaDOMParser, events will be delegated to SchemaDOMParser to pass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/SchemaContentHandler.java
final class SchemaContentHandler implements ContentHandler {

/**
 * <p>SchemaContentHandler converts SAX events into XNI
 * and passes them directly to the SchemaDOMParser.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @author Jack Z. Wang, IBM
 *
 */
