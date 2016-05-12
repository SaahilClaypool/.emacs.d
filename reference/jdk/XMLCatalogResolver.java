_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void attachReaderToCatalog (Catalog catalog) {

    /**
     * Attaches the reader to the catalog.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void parseCatalogs () throws IOException {

    /**
     * Instruct the <code>Catalog</code> to parse each of the
     * catalogs in the list. Only the first catalog will actually be
     * parsed immediately. The others will be queued and read if
     * they are needed later.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void init (String [] catalogs, boolean preferPublic) {

    /**
     * Initialization. Create a CatalogManager and set all
     * the properties upfront. This prevents JVM wide system properties
     * or a property file somewhere in the environment from affecting
     * the behaviour of this catalog resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolveURI (String uri)

    /**
     * <p>Returns the URI mapping in the catalog for the given URI
     * reference or <code>null</code> if no mapping exists.
     * URI comparison is case sensitive. If the URI reference
     * is an URN in the <code>publicid</code> namespace
     * it is converted into a public identifier by URN "unwrapping"
     * as specified in the XML Catalogs specification and then
     * resolution is performed following the semantics of
     * external identifier resolution.</p>
     *
     * @param uri the URI to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolvePublic (String publicId, String systemId)

    /**
     * <p>Returns the URI mapping in the catalog for the given
     * external identifier or <code>null</code> if no mapping
     * exists. Public identifiers are normalized before
     * comparison.</p>
     *
     * @param publicId the public identifier to locate in the catalog
     * @param systemId the system identifier to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolveSystem (String systemId)

    /**
     * <p>Returns the URI mapping in the catalog for the given
     * external identifier or <code>null</code> if no mapping
     * exists. If the system identifier is an URN in the
     * <code>publicid</code> namespace it is converted into
     * a public identifier by URN "unwrapping" as specified
     * in the XML Catalogs specification.</p>
     *
     * @param systemId the system identifier to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public String resolveIdentifier(XMLResourceIdentifier resourceIdentifier)

    /**
     * <p>Resolves an identifier using the catalog. This method interprets that
     * the namespace of the identifier corresponds to uri entries in the catalog.
     * Where both a namespace and an external identifier exist, the namespace
     * takes precedence.</p>
     *
     * @param resourceIdentifier the identifier to resolve
     *
     * @throws XNIException thrown on general error
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * <p>Resolves an external entity. If the entity cannot be
     * resolved, this method should return <code>null</code>. This
     * method only calls <code>resolveIdentifier</code> and returns
     * an input source if an entry was found in the catalog. It
     * should be overrided if other behaviour is required.</p>
     *
     * @param resourceIdentifier location of the XML resource to resolve
     *
     * @throws XNIException thrown on general error
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public LSInput resolveResource(String type, String namespaceURI,
        String publicId, String systemId, String baseURI) {

    /**
     * <p>Resolves a resource using the catalog. This method interprets that
     * the namespace URI corresponds to uri entries in the catalog.
     * Where both a namespace and an external identifier exist, the namespace
     * takes precedence.</p>
     *
     * @param type the type of the resource being resolved
     * @param namespaceURI the namespace of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param publicId the public identifier of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param systemId the system identifier of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param baseURI the absolute base URI of the resource being parsed,
     * or <code>null</code> if there is no base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
     public InputSource getExternalSubset(String name, String baseURI)

     /**
      * <p>Locates an external subset for documents which do not explicitly
      * provide one. This method always returns <code>null</code>. It
      * should be overrided if other behaviour is required.</p>
      *
      * @param name the identifier of the document root element
      * @param baseURI the document's base URI
      *
      * @throws SAXException any SAX exception, possibly wrapping another exception
      * @throws IOException thrown if some i/o error occurs
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
     public InputSource resolveEntity(String name, String publicId,
         String baseURI, String systemId) throws SAXException, IOException {

     /**
      * <p>Resolves an external entity. If the entity cannot be
      * resolved, this method should return <code>null</code>. This
      * method returns an input source if an entry was found in the
      * catalog for the given external identifier. It should be
      * overrided if other behaviour is required.</p>
      *
      * @param name the identifier of the external entity
      * @param publicId the public identifier, or <code>null</code> if none was supplied
      * @param baseURI the URI with respect to which relative systemIDs are interpreted.
      * @param systemId the system identifier
      *
      * @throws SAXException any SAX exception, possibly wrapping another exception
      * @throws IOException thrown if some i/o error occurs
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public InputSource resolveEntity(String publicId, String systemId)

    /**
     * <p>Resolves an external entity. If the entity cannot be
     * resolved, this method should return <code>null</code>. This
     * method returns an input source if an entry was found in the
     * catalog for the given external identifier. It should be
     * overrided if other behaviour is required.</p>
     *
     * @param publicId the public identifier, or <code>null</code> if none was supplied
     * @param systemId the system identifier
     *
     * @throws SAXException any SAX exception, possibly wrapping another exception
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final void setUseLiteralSystemId (boolean useLiteralSystemId) {

    /**
     * <p>Sets the preference for whether the literal system
     * identifier should be used when resolving system
     * identifiers when both it and the expanded system
     * identifier are available.</p>
     *
     * <p>The literal system identifier is the URI as it was
     * provided before absolutization. It may be embedded within
     * an entity. It may be provided externally or it may be the
     * result of redirection. For example, redirection may
     * have come from the protocol level through HTTP or from
     * an application's entity resolver.</p>
     *
     * <p>The expanded system identifier is an absolute URI
     * which is the result of resolving the literal system
     * identifier against a base URI.</p>
     *
     * @param useLiteralSystemId the preference for using
     * literal system identifers for catalog resolution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final boolean getUseLiteralSystemId () {

    /**
     * <p>Returns the preference for whether the literal system
     * identifier should be used when resolving system
     * identifiers when both it and the expanded system
     * identifier are available. If this property has not yet
     * been explicitly set its value is <code>true</code>.</p>
     *
     * @return the preference for using literal system identifers
     * for catalog resolution
     *
     * @see #setUseLiteralSystemId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final void setPreferPublic (boolean preferPublic) {

    /**
     * <p>Sets the preference for whether system or public
     * matches are preferred. This is used in the absence
     * of any occurence of the <code>prefer</code> attribute
     * on the <code>catalog</code> entry of a catalog.</p>
     *
     * @param preferPublic the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final boolean getPreferPublic () {

    /**
     * <p>Returns the preference for whether system or public
     * matches are preferred. This is used in the absence
     * of any occurence of the <code>prefer</code> attribute
     * on the <code>catalog</code> entry of a catalog. If this
     * property has not yet been explicitly set its value is
     * <code>true</code>.</p>
     *
     * @return the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized void clear () {

    /**
     * <p>Forces the cache of catalog mappings to be cleared.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized void setCatalogList (String [] catalogs) {

    /**
     * <p>Sets the initial list of catalog entry files.
     * If there were any catalog mappings cached from
     * the previous list they will be replaced by catalog
     * mappings from the new list the next time the catalog
     * is queried.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String [] getCatalogList () {

    /**
     * <p>Returns the initial list of catalog entry files.</p>
     *
     * @return the initial list of catalog entry files
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver (String [] catalogs, boolean preferPublic) {

    /**
     * <p>Constructs a catalog resolver with the given
     * list of entry files and the preference for whether
     * system or public matches are preferred.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     * @param preferPublic the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver (String [] catalogs) {

    /**
     * <p>Constructs a catalog resolver with the given
     * list of entry files.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver () {

    /**
     * <p>Constructs a catalog resolver with a default configuration.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fUseLiteralSystemId = true;

    /**
     * Indicates whether the application desires that
     * the parser or some other component performing catalog
     * resolution should use the literal system identifier
     * instead of the expanded system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fPreferPublic = true;

    /** Application specified prefer public setting. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fCatalogsChanged = true;

    /**
     * Indicates whether the list of catalogs has
     * changed since it was processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private String [] fCatalogsList = null;

    /** An array of catalog URIs. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private Catalog fCatalog = null;

    /** Internal catalog structure. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private CatalogManager fResolverCatalogManager = null;

    /** Internal catalog manager for Apache catalogs. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
public class XMLCatalogResolver

/**
 * <p>The catalog resolver handles the resolution of external
 * identifiers and URI references through XML catalogs. This
 * component supports XML catalogs defined by the
 * <a href="http://www.oasis-open.org/committees/entity/spec.html">
 * OASIS XML Catalogs Specification</a>. It encapsulates the
 * <a href="http://xml.apache.org/commons/">XML Commons</a> resolver.
 * An instance of this class may be registered on the parser
 * as a SAX entity resolver, as a DOM LSResourceResolver or
 * as an XNI entity resolver by setting the property
 * (http://apache.org/xml/properties/internal/entity-resolver).</p>
 *
 * <p>It is intended that this class may be used standalone to perform
 * catalog resolution outside of a parsing context. It may be shared
 * between several parsers and the application.</p>
 *
 * @author Michael Glavassevich, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void attachReaderToCatalog (Catalog catalog) {

    /**
     * Attaches the reader to the catalog.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void parseCatalogs () throws IOException {

    /**
     * Instruct the <code>Catalog</code> to parse each of the
     * catalogs in the list. Only the first catalog will actually be
     * parsed immediately. The others will be queued and read if
     * they are needed later.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private void init (String [] catalogs, boolean preferPublic) {

    /**
     * Initialization. Create a CatalogManager and set all
     * the properties upfront. This prevents JVM wide system properties
     * or a property file somewhere in the environment from affecting
     * the behaviour of this catalog resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolveURI (String uri)

    /**
     * <p>Returns the URI mapping in the catalog for the given URI
     * reference or <code>null</code> if no mapping exists.
     * URI comparison is case sensitive. If the URI reference
     * is an URN in the <code>publicid</code> namespace
     * it is converted into a public identifier by URN "unwrapping"
     * as specified in the XML Catalogs specification and then
     * resolution is performed following the semantics of
     * external identifier resolution.</p>
     *
     * @param uri the URI to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolvePublic (String publicId, String systemId)

    /**
     * <p>Returns the URI mapping in the catalog for the given
     * external identifier or <code>null</code> if no mapping
     * exists. Public identifiers are normalized before
     * comparison.</p>
     *
     * @param publicId the public identifier to locate in the catalog
     * @param systemId the system identifier to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String resolveSystem (String systemId)

    /**
     * <p>Returns the URI mapping in the catalog for the given
     * external identifier or <code>null</code> if no mapping
     * exists. If the system identifier is an URN in the
     * <code>publicid</code> namespace it is converted into
     * a public identifier by URN "unwrapping" as specified
     * in the XML Catalogs specification.</p>
     *
     * @param systemId the system identifier to locate in the catalog
     *
     * @return the mapped URI or <code>null</code> if no mapping
     * was found in the catalog
     *
     * @throws IOException if an i/o error occurred while reading
     * the catalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public String resolveIdentifier(XMLResourceIdentifier resourceIdentifier)

    /**
     * <p>Resolves an identifier using the catalog. This method interprets that
     * the namespace of the identifier corresponds to uri entries in the catalog.
     * Where both a namespace and an external identifier exist, the namespace
     * takes precedence.</p>
     *
     * @param resourceIdentifier the identifier to resolve
     *
     * @throws XNIException thrown on general error
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * <p>Resolves an external entity. If the entity cannot be
     * resolved, this method should return <code>null</code>. This
     * method only calls <code>resolveIdentifier</code> and returns
     * an input source if an entry was found in the catalog. It
     * should be overrided if other behaviour is required.</p>
     *
     * @param resourceIdentifier location of the XML resource to resolve
     *
     * @throws XNIException thrown on general error
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public LSInput resolveResource(String type, String namespaceURI,
        String publicId, String systemId, String baseURI) {

    /**
     * <p>Resolves a resource using the catalog. This method interprets that
     * the namespace URI corresponds to uri entries in the catalog.
     * Where both a namespace and an external identifier exist, the namespace
     * takes precedence.</p>
     *
     * @param type the type of the resource being resolved
     * @param namespaceURI the namespace of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param publicId the public identifier of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param systemId the system identifier of the resource being resolved,
     * or <code>null</code> if none was supplied
     * @param baseURI the absolute base URI of the resource being parsed,
     * or <code>null</code> if there is no base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
     public InputSource getExternalSubset(String name, String baseURI)

     /**
      * <p>Locates an external subset for documents which do not explicitly
      * provide one. This method always returns <code>null</code>. It
      * should be overrided if other behaviour is required.</p>
      *
      * @param name the identifier of the document root element
      * @param baseURI the document's base URI
      *
      * @throws SAXException any SAX exception, possibly wrapping another exception
      * @throws IOException thrown if some i/o error occurs
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
     public InputSource resolveEntity(String name, String publicId,
         String baseURI, String systemId) throws SAXException, IOException {

     /**
      * <p>Resolves an external entity. If the entity cannot be
      * resolved, this method should return <code>null</code>. This
      * method returns an input source if an entry was found in the
      * catalog for the given external identifier. It should be
      * overrided if other behaviour is required.</p>
      *
      * @param name the identifier of the external entity
      * @param publicId the public identifier, or <code>null</code> if none was supplied
      * @param baseURI the URI with respect to which relative systemIDs are interpreted.
      * @param systemId the system identifier
      *
      * @throws SAXException any SAX exception, possibly wrapping another exception
      * @throws IOException thrown if some i/o error occurs
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public InputSource resolveEntity(String publicId, String systemId)

    /**
     * <p>Resolves an external entity. If the entity cannot be
     * resolved, this method should return <code>null</code>. This
     * method returns an input source if an entry was found in the
     * catalog for the given external identifier. It should be
     * overrided if other behaviour is required.</p>
     *
     * @param publicId the public identifier, or <code>null</code> if none was supplied
     * @param systemId the system identifier
     *
     * @throws SAXException any SAX exception, possibly wrapping another exception
     * @throws IOException thrown if some i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final void setUseLiteralSystemId (boolean useLiteralSystemId) {

    /**
     * <p>Sets the preference for whether the literal system
     * identifier should be used when resolving system
     * identifiers when both it and the expanded system
     * identifier are available.</p>
     *
     * <p>The literal system identifier is the URI as it was
     * provided before absolutization. It may be embedded within
     * an entity. It may be provided externally or it may be the
     * result of redirection. For example, redirection may
     * have come from the protocol level through HTTP or from
     * an application's entity resolver.</p>
     *
     * <p>The expanded system identifier is an absolute URI
     * which is the result of resolving the literal system
     * identifier against a base URI.</p>
     *
     * @param useLiteralSystemId the preference for using
     * literal system identifers for catalog resolution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final boolean getUseLiteralSystemId () {

    /**
     * <p>Returns the preference for whether the literal system
     * identifier should be used when resolving system
     * identifiers when both it and the expanded system
     * identifier are available. If this property has not yet
     * been explicitly set its value is <code>true</code>.</p>
     *
     * @return the preference for using literal system identifers
     * for catalog resolution
     *
     * @see #setUseLiteralSystemId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final void setPreferPublic (boolean preferPublic) {

    /**
     * <p>Sets the preference for whether system or public
     * matches are preferred. This is used in the absence
     * of any occurence of the <code>prefer</code> attribute
     * on the <code>catalog</code> entry of a catalog.</p>
     *
     * @param preferPublic the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final boolean getPreferPublic () {

    /**
     * <p>Returns the preference for whether system or public
     * matches are preferred. This is used in the absence
     * of any occurence of the <code>prefer</code> attribute
     * on the <code>catalog</code> entry of a catalog. If this
     * property has not yet been explicitly set its value is
     * <code>true</code>.</p>
     *
     * @return the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized void clear () {

    /**
     * <p>Forces the cache of catalog mappings to be cleared.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized void setCatalogList (String [] catalogs) {

    /**
     * <p>Sets the initial list of catalog entry files.
     * If there were any catalog mappings cached from
     * the previous list they will be replaced by catalog
     * mappings from the new list the next time the catalog
     * is queried.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public final synchronized String [] getCatalogList () {

    /**
     * <p>Returns the initial list of catalog entry files.</p>
     *
     * @return the initial list of catalog entry files
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver (String [] catalogs, boolean preferPublic) {

    /**
     * <p>Constructs a catalog resolver with the given
     * list of entry files and the preference for whether
     * system or public matches are preferred.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     * @param preferPublic the prefer public setting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver (String [] catalogs) {

    /**
     * <p>Constructs a catalog resolver with the given
     * list of entry files.</p>
     *
     * @param catalogs an ordered array list of absolute URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    public XMLCatalogResolver () {

    /**
     * <p>Constructs a catalog resolver with a default configuration.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fUseLiteralSystemId = true;

    /**
     * Indicates whether the application desires that
     * the parser or some other component performing catalog
     * resolution should use the literal system identifier
     * instead of the expanded system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fPreferPublic = true;

    /** Application specified prefer public setting. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private boolean fCatalogsChanged = true;

    /**
     * Indicates whether the list of catalogs has
     * changed since it was processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private String [] fCatalogsList = null;

    /** An array of catalog URIs. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private Catalog fCatalog = null;

    /** Internal catalog structure. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
    private CatalogManager fResolverCatalogManager = null;

    /** Internal catalog manager for Apache catalogs. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLCatalogResolver.java
public class XMLCatalogResolver

/**
 * <p>The catalog resolver handles the resolution of external
 * identifiers and URI references through XML catalogs. This
 * component supports XML catalogs defined by the
 * <a href="http://www.oasis-open.org/committees/entity/spec.html">
 * OASIS XML Catalogs Specification</a>. It encapsulates the
 * <a href="http://xml.apache.org/commons/">XML Commons</a> resolver.
 * An instance of this class may be registered on the parser
 * as a SAX entity resolver, as a DOM LSResourceResolver or
 * as an XNI entity resolver by setting the property
 * (http://apache.org/xml/properties/internal/entity-resolver).</p>
 *
 * <p>It is intended that this class may be used standalone to perform
 * catalog resolution outside of a parsing context. It may be shared
 * between several parsers and the application.</p>
 *
 * @author Michael Glavassevich, IBM
 *
 */
