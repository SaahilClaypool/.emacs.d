_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/resolver/Resolver.java
    java.util.Set list() ;

    /** Return the entire collection of names that are currently bound
     * by this resolver.  Resulting collection contains only strings for
     * which resolve does not return null.  Some resolvers may not support
     * this method, in which case they return an empty set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/resolver/Resolver.java
public interface Resolver {

/** Resolver defines the operations needed to support ORB operations for
 * resolve_initial_references and list_initial_services.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private synchronized Vector resolveAllSubordinateCatalogs(int entityType,
                                              String entityName,
                                              String publicId,
                                              String systemId)

    /**
     * Search the subordinate catalogs, in order, looking for all
     * match.
     *
     * <p>This method searches the Catalog and returns all of the system
     * identifiers specified for the given entity type with the given
     * name, public, and system identifiers. In some contexts, these
     * may be null.</p>
     *
     * @param entityType The CatalogEntry type for which this query is
     * being conducted. This is necessary in order to do the approprate
     * query on a subordinate catalog.
     * @param entityName The name of the entity being searched for, if
     * appropriate.
     * @param publicId The public identifier of the entity in question
     * (as provided in the source document).
     * @param systemId The nominal system identifier for the entity
     * in question (as provided in the source document).
     *
     * @throws MalformedURLException The formal system identifier of a
     * delegated catalog cannot be turned into a valid URL.
     * @throws IOException Error reading delegated catalog file.
     *
     * @return The system identifier to use.
     * Note that the nominal system identifier is not returned if a
     * match is not found in the catalog, instead null is returned
     * to indicate that no match was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector resolveLocalSystemReverse(String systemId) {

    /**
     * Find the URNs for a given system identifier in the current catalog.
     *
     * @param systemId The system ID to locate.
     *
     * @return A vector of URNs that map to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector resolveAllLocalSystem(String systemId) {

    /**
     * Return all applicable SYSTEM system identifiers in this
     * catalog.
     *
     * <p>If one or more SYSTEM entries exists in the catalog file
     * for the system ID specified, return the mapped values.</p>
     *
     * @param systemId The system ID to locate in the catalog
     *
     * @return A vector of the mapped system identifiers or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public Vector resolveAllSystem(String systemId)

    /**
     * Return the applicable SYSTEM system identifiers.
     *
     * <p>If one or more SYSTEM entries exists in the Catalog
     * for the system ID specified, return the mapped values.</p>
     *
     * <p>The caller is responsible for doing any necessary
     * normalization of the system identifier before calling
     * this method. For example, a relative system identifier in
     * a document might be converted to an absolute system identifier
     * before attempting to resolve it.</p>
     *
     * <p>Note that this function will force all subordinate catalogs
     * to be loaded.</p>
     *
     * <p>On Windows-based operating systems, the comparison between
     * the system identifier provided and the SYSTEM entries in the
     * Catalog is case-insensitive.</p>
     *
     * @param systemId The system ID to locate in the catalog.
     *
     * @return The system identifier to use for the notation.
     *
     * @throws MalformedURLException The formal system identifier of a
     * subordinate catalog cannot be turned into a valid URL.
     * @throws IOException Error reading subordinate catalog file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public String resolveSystemReverse(String systemId)

    /**
     * Find the URN for a given system identifier.
     *
     * @param systemId The system ID to locate.
     *
     * @return A (single) URN that maps to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public Vector resolveAllSystemReverse(String systemId)

    /**
     * Find the URNs for a given system identifier in all catalogs.
     *
     * @param systemId The system ID to locate.
     *
     * @return A vector of URNs that map to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector appendVector(Vector vec, Vector appvec) {

    /**
     * Append two vectors, returning the result.
     *
     * @param vec The first vector
     * @param appvec The vector to be appended
     * @return The vector vec, with appvec's elements appended to it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected Resolver queryResolver(String resolver,
                                     String command,
                                     String arg1,
                                     String arg2) {

    /**
     * Query an external RFC2483 resolver.
     *
     * @param resolver The URL of the RFC2483 resolver.
     * @param command The command to send the resolver.
     * @param arg1 The first argument to the resolver.
     * @param arg2 The second argument to the resolver, usually null.
     *
     * @return The Resolver constructed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected String resolveExternalPublic(String publicId, String resolver)

    /**
     * Query an external RFC2483 resolver for a public identifier.
     *
     * @param publicId The system ID to locate.
     * @param resolver The name of the resolver to use.
     *
     * @return The system identifier to use for the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected String resolveExternalSystem(String systemId, String resolver)

    /**
     * Query an external RFC2483 resolver for a system identifier.
     *
     * @param systemId The system ID to locate.
     * @param resolver The name of the resolver to use.
     *
     * @return The system identifier to use for the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolvePublic(String publicId, String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier, resorting
   * to external resolvers if necessary.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or
   * public identifiers. If
   * no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * null is returned.</p>
   *
   * <p>Note that a system or public identifier in the current catalog
   * (or subordinate catalogs) will be used in preference to an
   * external resolver. Further, if a systemId is present, the external
   * resolver(s) will be queried for that before the publicId.</p>
   *
   * @param publicId The public identifier to locate in the catalog.
   * Public identifiers are normalized before comparison.
   * @param systemId The nominal system identifier for the entity
   * in question (as provided in the source document).
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   *
   * @return The system identifier to use.
   * Note that the nominal system identifier is not returned if a
   * match is not found in the catalog, instead null is returned
   * to indicate that no match was found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolveSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier, resorting
   * to external RESOLVERs if necessary.
   *
   * <p>If a SYSTEM entry exists in the Catalog
   * for the system ID specified, return the mapped value.</p>
   *
   * <p>In the Resolver (as opposed to the Catalog) class, if the
   * URI isn't found by the usual algorithm, SYSTEMSUFFIX entries are
   * considered.</p>
   *
   * <p>On Windows-based operating systems, the comparison between
   * the system identifier provided and the SYSTEM entries in the
   * Catalog is case-insensitive.</p>
   *
   * @param systemId The system ID to locate in the catalog.
   *
   * @return The system identifier to use for systemId.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolveURI(String uri)

  /**
   * Return the applicable URI.
   *
   * <p>If a URI entry exists in the Catalog
   * for the URI specified, return the mapped value.</p>
   *
   * <p>In the Resolver (as opposed to the Catalog) class, if the
   * URI isn't found by the usual algorithm, URISUFFIX entries are
   * considered.</p>
   *
   * <p>URI comparison is case sensitive.</p>
   *
   * @param uri The URI to locate in the catalog.
   *
   * @return The resolved URI.
   *
   * @throws MalformedURLException The system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public void addEntry(CatalogEntry entry) {

  /**
   * Cleanup and process a Catalog entry.
   *
   * <p>This method processes each Catalog entry, changing mapped
   * relative system identifiers into absolute ones (based on the current
   * base URI), and maintaining other information about the current
   * catalog.</p>
   *
   * @param entry The CatalogEntry to process.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public void setupReaders() {

  /**
   * Setup readers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int SYSTEMREVERSE

  /**
   * The SYSTEMREVERSE Catalog Entry type.
   *
   * <p>This is a bit of a hack. There's no actual SYSTEMREVERSE entry,
   * but this entry type is used to indicate that a reverse lookup is
   * being performed. (This allows the Resolver to implement
   * RFC2483 I2N and I2NS.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int RESOLVER = CatalogEntry.addEntryType("RESOLVER", 1);

  /**
   * The RESOLVER Catalog Entry type.
   *
   * <p>A hook for providing support for web-based backup resolvers.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int SYSTEMSUFFIX = CatalogEntry.addEntryType("SYSTEMSUFFIX", 2);

  /**
   * The SYSTEMSUFFIX Catalog Entry type.
   *
   * <p>System suffix entries match system identifiers that end in a
   * specified suffix.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
public class Resolver extends Catalog {

/**
 * An extension to OASIS Open Catalog files, this class supports
 * suffix-based matching and an external RFC2483 resolver.
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/resolver/Resolver.java
    java.util.Set list() ;

    /** Return the entire collection of names that are currently bound
     * by this resolver.  Resulting collection contains only strings for
     * which resolve does not return null.  Some resolvers may not support
     * this method, in which case they return an empty set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/resolver/Resolver.java
public interface Resolver {

/** Resolver defines the operations needed to support ORB operations for
 * resolve_initial_references and list_initial_services.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private synchronized Vector resolveAllSubordinateCatalogs(int entityType,
                                              String entityName,
                                              String publicId,
                                              String systemId)

    /**
     * Search the subordinate catalogs, in order, looking for all
     * match.
     *
     * <p>This method searches the Catalog and returns all of the system
     * identifiers specified for the given entity type with the given
     * name, public, and system identifiers. In some contexts, these
     * may be null.</p>
     *
     * @param entityType The CatalogEntry type for which this query is
     * being conducted. This is necessary in order to do the approprate
     * query on a subordinate catalog.
     * @param entityName The name of the entity being searched for, if
     * appropriate.
     * @param publicId The public identifier of the entity in question
     * (as provided in the source document).
     * @param systemId The nominal system identifier for the entity
     * in question (as provided in the source document).
     *
     * @throws MalformedURLException The formal system identifier of a
     * delegated catalog cannot be turned into a valid URL.
     * @throws IOException Error reading delegated catalog file.
     *
     * @return The system identifier to use.
     * Note that the nominal system identifier is not returned if a
     * match is not found in the catalog, instead null is returned
     * to indicate that no match was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector resolveLocalSystemReverse(String systemId) {

    /**
     * Find the URNs for a given system identifier in the current catalog.
     *
     * @param systemId The system ID to locate.
     *
     * @return A vector of URNs that map to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector resolveAllLocalSystem(String systemId) {

    /**
     * Return all applicable SYSTEM system identifiers in this
     * catalog.
     *
     * <p>If one or more SYSTEM entries exists in the catalog file
     * for the system ID specified, return the mapped values.</p>
     *
     * @param systemId The system ID to locate in the catalog
     *
     * @return A vector of the mapped system identifiers or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public Vector resolveAllSystem(String systemId)

    /**
     * Return the applicable SYSTEM system identifiers.
     *
     * <p>If one or more SYSTEM entries exists in the Catalog
     * for the system ID specified, return the mapped values.</p>
     *
     * <p>The caller is responsible for doing any necessary
     * normalization of the system identifier before calling
     * this method. For example, a relative system identifier in
     * a document might be converted to an absolute system identifier
     * before attempting to resolve it.</p>
     *
     * <p>Note that this function will force all subordinate catalogs
     * to be loaded.</p>
     *
     * <p>On Windows-based operating systems, the comparison between
     * the system identifier provided and the SYSTEM entries in the
     * Catalog is case-insensitive.</p>
     *
     * @param systemId The system ID to locate in the catalog.
     *
     * @return The system identifier to use for the notation.
     *
     * @throws MalformedURLException The formal system identifier of a
     * subordinate catalog cannot be turned into a valid URL.
     * @throws IOException Error reading subordinate catalog file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public String resolveSystemReverse(String systemId)

    /**
     * Find the URN for a given system identifier.
     *
     * @param systemId The system ID to locate.
     *
     * @return A (single) URN that maps to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    public Vector resolveAllSystemReverse(String systemId)

    /**
     * Find the URNs for a given system identifier in all catalogs.
     *
     * @param systemId The system ID to locate.
     *
     * @return A vector of URNs that map to the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    private Vector appendVector(Vector vec, Vector appvec) {

    /**
     * Append two vectors, returning the result.
     *
     * @param vec The first vector
     * @param appvec The vector to be appended
     * @return The vector vec, with appvec's elements appended to it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected Resolver queryResolver(String resolver,
                                     String command,
                                     String arg1,
                                     String arg2) {

    /**
     * Query an external RFC2483 resolver.
     *
     * @param resolver The URL of the RFC2483 resolver.
     * @param command The command to send the resolver.
     * @param arg1 The first argument to the resolver.
     * @param arg2 The second argument to the resolver, usually null.
     *
     * @return The Resolver constructed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected String resolveExternalPublic(String publicId, String resolver)

    /**
     * Query an external RFC2483 resolver for a public identifier.
     *
     * @param publicId The system ID to locate.
     * @param resolver The name of the resolver to use.
     *
     * @return The system identifier to use for the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
    protected String resolveExternalSystem(String systemId, String resolver)

    /**
     * Query an external RFC2483 resolver for a system identifier.
     *
     * @param systemId The system ID to locate.
     * @param resolver The name of the resolver to use.
     *
     * @return The system identifier to use for the systemId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolvePublic(String publicId, String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier, resorting
   * to external resolvers if necessary.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or
   * public identifiers. If
   * no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * null is returned.</p>
   *
   * <p>Note that a system or public identifier in the current catalog
   * (or subordinate catalogs) will be used in preference to an
   * external resolver. Further, if a systemId is present, the external
   * resolver(s) will be queried for that before the publicId.</p>
   *
   * @param publicId The public identifier to locate in the catalog.
   * Public identifiers are normalized before comparison.
   * @param systemId The nominal system identifier for the entity
   * in question (as provided in the source document).
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   *
   * @return The system identifier to use.
   * Note that the nominal system identifier is not returned if a
   * match is not found in the catalog, instead null is returned
   * to indicate that no match was found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolveSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier, resorting
   * to external RESOLVERs if necessary.
   *
   * <p>If a SYSTEM entry exists in the Catalog
   * for the system ID specified, return the mapped value.</p>
   *
   * <p>In the Resolver (as opposed to the Catalog) class, if the
   * URI isn't found by the usual algorithm, SYSTEMSUFFIX entries are
   * considered.</p>
   *
   * <p>On Windows-based operating systems, the comparison between
   * the system identifier provided and the SYSTEM entries in the
   * Catalog is case-insensitive.</p>
   *
   * @param systemId The system ID to locate in the catalog.
   *
   * @return The system identifier to use for systemId.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public String resolveURI(String uri)

  /**
   * Return the applicable URI.
   *
   * <p>If a URI entry exists in the Catalog
   * for the URI specified, return the mapped value.</p>
   *
   * <p>In the Resolver (as opposed to the Catalog) class, if the
   * URI isn't found by the usual algorithm, URISUFFIX entries are
   * considered.</p>
   *
   * <p>URI comparison is case sensitive.</p>
   *
   * @param uri The URI to locate in the catalog.
   *
   * @return The resolved URI.
   *
   * @throws MalformedURLException The system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public void addEntry(CatalogEntry entry) {

  /**
   * Cleanup and process a Catalog entry.
   *
   * <p>This method processes each Catalog entry, changing mapped
   * relative system identifiers into absolute ones (based on the current
   * base URI), and maintaining other information about the current
   * catalog.</p>
   *
   * @param entry The CatalogEntry to process.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public void setupReaders() {

  /**
   * Setup readers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int SYSTEMREVERSE

  /**
   * The SYSTEMREVERSE Catalog Entry type.
   *
   * <p>This is a bit of a hack. There's no actual SYSTEMREVERSE entry,
   * but this entry type is used to indicate that a reverse lookup is
   * being performed. (This allows the Resolver to implement
   * RFC2483 I2N and I2NS.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int RESOLVER = CatalogEntry.addEntryType("RESOLVER", 1);

  /**
   * The RESOLVER Catalog Entry type.
   *
   * <p>A hook for providing support for web-based backup resolvers.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
  public static final int SYSTEMSUFFIX = CatalogEntry.addEntryType("SYSTEMSUFFIX", 2);

  /**
   * The SYSTEMSUFFIX Catalog Entry type.
   *
   * <p>System suffix entries match system identifiers that end in a
   * specified suffix.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Resolver.java
public class Resolver extends Catalog {

/**
 * An extension to OASIS Open Catalog files, this class supports
 * suffix-based matching and an external RFC2483 resolver.
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/Resolver.java
    public ResolveResult resolveToClass(String name,
                                        Class<? extends Context> contextType)

    /**
     * Partially resolves a name.
     * See {@link #resolveToClass(Name, Class)} for details.
     *
     * @param name
     *          the name to resolve
     * @param contextType
     *          the type of object to resolve.  This should
     *          be a subtype of <code>Context</code>.
     * @return  the object that was found, along with the unresolved
     *          suffix of <code>name</code>.  Cannot be null.
     *
     * @throws  javax.naming.NotContextException
     *          if no context of the appropriate type is found
     * @throws  NamingException if a naming exception was encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/Resolver.java
    public ResolveResult resolveToClass(Name name,
                                        Class<? extends Context> contextType)

    /**
     * Partially resolves a name.  Stops at the first
     * context that is an instance of a given subtype of
     * <code>Context</code>.
     *
     * @param name
     *          the name to resolve
     * @param contextType
     *          the type of object to resolve.  This should
     *          be a subtype of <code>Context</code>.
     * @return  the object that was found, along with the unresolved
     *          suffix of <code>name</code>.  Cannot be null.
     *
     * @throws  javax.naming.NotContextException
     *          if no context of the appropriate type is found
     * @throws  NamingException if a naming exception was encountered
     *
     * @see #resolveToClass(String, Class)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/Resolver.java
public interface Resolver {

/**
  * This interface represents an "intermediate context" for name resolution.
  *<p>
  * The Resolver interface contains methods that are implemented by contexts
  * that do not support subtypes of Context, but which can act as
  * intermediate contexts for resolution purposes.
  *<p>
  * A <tt>Name</tt> parameter passed to any method is owned
  * by the caller.  The service provider will not modify the object
  * or keep a reference to it.
  * A <tt>ResolveResult</tt> object returned by any
  * method is owned by the caller.  The caller may subsequently modify it;
  * the service provider may not.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
