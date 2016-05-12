_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected void addDelegate(CatalogEntry entry) {

  /**
   * Add to the current list of delegated catalogs.
   *
   * <p>This method always constructs the {@link #localDelegate}
   * vector so that it is ordered by length of partial
   * public identifier.</p>
   *
   * @param entry The DELEGATE catalog entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String encodedByte (int b) {

  /**
   * Perform %-encoding on a single byte.
   *
   * @param b The 8-bit integer that represents th byte. (Bytes are signed
              but encoding needs to look at the bytes unsigned.)
   * @return The %-encoded string for the byte in question.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String normalizeURI(String uriref) {

  /**
   * Perform character normalization on a URI reference.
   *
   * @param uriref The URI reference
   * @return The normalized URI reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String makeAbsolute(String sysid) {

  /**
   * Construct an absolute URI from a relative one, using the current
   * base URI.
   *
   * @param sysid The (possibly relative) system identifier
   * @return The system identifier made absolute with respect to the
   * current {@link #base}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String fixSlashes (String sysid) {

  /**
   * Replace backslashes with forward slashes. (URLs always use
   * forward slashes.)
   *
   * @param sysid The input system identifier.
   * @return The same system identifier with backslashes turned into
   * forward slashes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized String resolveSubordinateCatalogs(int entityType,
                                                           String entityName,
                                                           String publicId,
                                                           String systemId)

  /**
   * Search the subordinate catalogs, in order, looking for a match.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given entity type with the given
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
   * in question (as provided in the source document). This parameter is
   * overloaded for the URI entry type.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String resolveLocalURI(String uri)

  /**
   * Return the applicable URI in this catalog.
   *
   * <p>If a URI entry exists in the catalog file
   * for the URI specified, return the mapped value.</p>
   *
   * @param uri The URI to locate in the catalog
   *
   * @return The mapped URI or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveURI(String uri)

  /**
   * Return the applicable URI.
   *
   * <p>If a URI entry exists in the Catalog
   * for the URI specified, return the mapped value.</p>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String resolveLocalSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier in this
   * catalog.
   *
   * <p>If a SYSTEM entry exists in the catalog file
   * for the system ID specified, return the mapped value.</p>
   *
   * @param systemId The system ID to locate in the catalog
   *
   * @return The mapped system identifier or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier.
   *
   * <p>If a SYSTEM entry exists in the Catalog
   * for the system ID specified, return the mapped value.</p>
   *
   * <p>On Windows-based operating systems, the comparison between
   * the system identifier provided and the SYSTEM entries in the
   * Catalog is case-insensitive.</p>
   *
   * @param systemId The system ID to locate in the catalog.
   *
   * @return The resolved system identifier.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized String resolveLocalPublic(int entityType,
                                                   String entityName,
                                                   String publicId,
                                                   String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or public identifiers.
   * If no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * delegated Catalogs are interrogated.</p>
   *
   * <p>There are four possible cases:</p>
   *
   * <ul>
   * <li>If the system identifier provided matches a SYSTEM entry
   * in the current catalog, the SYSTEM entry is returned.
   * <li>If the system identifier is not null, the PUBLIC entries
   * that were encountered when OVERRIDE YES was in effect are
   * interrogated and the first matching entry is returned.</li>
   * <li>If the system identifier is null, then all of the PUBLIC
   * entries are interrogated and the first matching entry
   * is returned. This may not be the same as the preceding case, if
   * some PUBLIC entries are encountered when OVERRIDE NO is in effect. In
   * XML, the only place where a public identifier may occur without
   * a system identifier is in a notation declaration.</li>
   * <li>Finally, if the public identifier matches one of the partial
   * public identifiers specified in a DELEGATE* entry in
   * the Catalog, the delegated catalog is interrogated. The first
   * time that the delegated catalog is required, it will be
   * retrieved and parsed. It is subsequently cached.
   * </li>
   * </ul>
   *
   * @param entityType The CatalogEntry type for which this query is
   * being conducted. This is necessary in order to do the approprate
   * query on a delegated catalog.
   * @param entityName The name of the entity being searched for, if
   * appropriate.
   * @param publicId The public identifier of the entity in question.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolvePublic(String publicId, String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or
   * public identifiers. If
   * no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * null is returned.</p>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveNotation(String notationName,
                                String publicId,
                                String systemId)

  /**
   * Return the applicable NOTATION system identifier.
   *
   * @param notationName The name of the notation for which
   * a doctype is required.
   * @param publicId The nominal public identifier for the notation
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the notation
   * (as provided in the source document).
   *
   * @return The system identifier to use for the notation.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveEntity(String entityName,
                              String publicId,
                              String systemId)

  /**
   * Return the applicable ENTITY system identifier.
   *
   * @param entityName The name of the entity for which
   * a system identifier is required.
   * @param publicId The nominal public identifier for the entity
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the entity
   * (as provided in the source document).
   *
   * @return The system identifier to use for the entity.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveDocument()

  /**
   * Return the applicable DOCUMENT entry.
   *
   * @return The system identifier to use for the doctype.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveDoctype(String entityName,
                               String publicId,
                               String systemId)

  /**
   * Return the applicable DOCTYPE system identifier.
   *
   * @param entityName The name of the entity (element) for which
   * a doctype is required.
   * @param publicId The nominal public identifier for the doctype
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the doctype
   * (as provided in the source document).
   *
   * @return The system identifier to use for the doctype.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void parseAllCatalogs()

  /**
   * Parse all subordinate catalogs.
   *
   * <p>This method recursively parses all of the subordinate catalogs.
   * If this method does not throw an exception, you can be confident that
   * no subsequent call to any resolve*() method will either, with two
   * possible exceptions:</p>
   *
   * <ol>
   * <li><p>Delegated catalogs are re-parsed each time they are needed
   * (because a variable list of them may be needed in each case,
   * depending on the length of the matching partial public identifier).</p>
   * <p>But they are parsed by this method, so as long as they don't
   * change or disappear while the program is running, they shouldn't
   * generate errors later if they don't generate errors now.</p>
   * <li><p>If you add new catalogs with <code>parseCatalog</code>, they
   * won't be loaded until they are needed or until you call
   * <code>parseAllCatalogs</code> again.</p>
   * </ol>
   *
   * <p>On the other hand, if you don't call this method, you may
   * successfully parse documents without having to load all possible
   * catalogs.</p>
   *
   * @throws MalformedURLException The filename (URL) for a
   * subordinate or delegated catalog is not a valid URL.
   * @throws IOException Error reading some subordinate or delegated
   * catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void unknownEntry(Vector strings) {

  /**
   * Handle unknown CatalogEntry types.
   *
   * <p>This method exists to allow subclasses to deal with unknown
   * entry types.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized void parseCatalogFile(String fileName)

  /**
   * Parse a single catalog file, augmenting internal data structures.
   *
   * @param fileName The filename of the catalog file to process
   *
   * @throws MalformedURLException The fileName cannot be turned into
   * a valid URL.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized void parsePendingCatalogs()

  /**
   * Parse all of the pending catalogs.
   *
   * <p>Catalogs may refer to other catalogs, this method parses
   * all of the currently pending catalog files.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(URL aUrl) throws IOException {

  /**
   * Parse a catalog document, augmenting internal data structures.
   *
   * <p>This method supports catalog files stored in jar files: e.g.,
   * jar:file:///path/to/filename.jar!/path/to/catalog.xml". That URI
   * doesn't survive transmogrification through the URI processing that
   * the parseCatalog(String) performs and passing it as an input stream
   * doesn't set the base URI appropriately.</p>
   *
   * <p>Written by Stefan Wachter (2002-09-26)</p>
   *
   * @param aUrl The URL of the catalog document to process
   *
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(String mimeType, InputStream is)

  /**
   * Parse a catalog file, augmenting internal data structures.
   *
   * <p>Catalogs retrieved over the net may have an associated MIME type.
   * The MIME type can be used to select an appropriate reader.</p>
   *
   * @param mimeType The MIME type of the catalog file.
   * @param is The InputStream from which the catalog should be read
   *
   * @throws CatalogException Failed to load catalog
   * mimeType.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(String fileName)

  /**
   * Parse a catalog file, augmenting internal data structures.
   *
   * @param fileName The filename of the catalog file to process
   *
   * @throws MalformedURLException The fileName cannot be turned into
   * a valid URL.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void loadSystemCatalogs()

  /**
   * Load the system catalog files.
   *
   * <p>The method adds all of the
   * catalogs specified in the <tt>xml.catalog.files</tt> property
   * to the Catalog list.</p>
   *
   * @throws MalformedURLException  One of the system catalogs is
   * identified with a filename that is not a valid URL.
   * @throws IOException One of the system catalogs cannot be read.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String getDefaultOverride() {

  /**
   * Returns the default override setting associated with this
   * catalog.
   *
   * <p>All catalog files loaded by this catalog will have the
   * initial override setting specified by this default.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String getCurrentBase() {

  /**
   * Returns the current base URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Catalog newCatalog() {

  /**
   * Create a new Catalog object.
   *
   * <p>This method constructs a new instance of the running Catalog
   * class (which might be a subtype of com.sun.org.apache.xml.internal.resolver.Catalog).
   * All new catalogs are managed by the same CatalogManager.
   * </p>
   *
   * <p>N.B. All Catalog subtypes should call newCatalog() to construct
   * a new Catalog. Do not simply use "new Subclass()" since that will
   * confuse future subclasses.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected void copyReaders(Catalog newCatalog) {

  /**
   * Copies the reader list from the current Catalog to a new Catalog.
   *
   * <p>This method is used internally when constructing a new catalog.
   * It copies the current reader associations over to the new catalog.
   * </p>
   *
   * @param newCatalog The new Catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void addReader(String mimeType, CatalogReader reader) {

  /**
   * Add a new CatalogReader to the Catalog.
   *
   * <p>This method allows you to add a new CatalogReader to the
   * catalog. The reader will be associated with the specified mimeType.
   * You can only have one reader per mimeType.</p>
   *
   * <p>In the absence of a mimeType (e.g., when reading a catalog
   * directly from a file on the local system), the readers are attempted
   * in the order that you add them to the Catalog.</p>
   *
   * <p>Note that subordinate catalogs (created by CATALOG or
   * DELEGATE* entries) get a copy of the set of readers present in
   * the primary catalog when they are created. Readers added subsequently
   * will not be available. For this reason, it is best to add all
   * of the readers before the first call to parse a catalog.</p>
   *
   * @param mimeType The MIME type associated with this reader.
   * @param reader The CatalogReader to use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void setupReaders() {

  /**
   * Setup readers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void setCatalogManager(CatalogManager manager) {

  /**
   * Establish the CatalogManager used by this catalog.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public CatalogManager getCatalogManager() {

  /**
   * Return the CatalogManager used by this catalog.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public Catalog(CatalogManager manager) {

  /**
   * Constructs an empty Catalog with a specific CatalogManager.
   *
   * <p>The constructor interrogates the relevant system properties
   * using the specified Catalog Manager
   * and initializes the catalog data structures.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public Catalog() {

  /**
   * Constructs an empty Catalog.
   *
   * <p>The constructor interrogates the relevant system properties
   * using the default (static) CatalogManager
   * and initializes the catalog data structures.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector readerArr = new Vector();

  /**
   * A vector of CatalogReaders.
   *
   * <p>This vector contains all of the readers in the order that they
   * were added. In the event that a catalog is read from a file, where
   * the MIME type is unknown, each reader is attempted in turn until
   * one succeeds.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Map<String, Integer> readerMap = new HashMap<>();

  /**
   * A hash of CatalogReaders.
   *
   * <p>This hash maps MIME types to elements in the readerArr
   * vector. This allows the Catalog to quickly locate the reader
   * for a particular MIME type.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector localDelegate = new Vector();

  /**
   * A vector of DELEGATE* Catalog entries constructed during
   * processing of the Catalog.
   *
   * <p>This two-level system has two purposes; first, it allows
   * us to sort the DELEGATE* entries by the length of the partial
   * public identifier so that a linear search encounters them in
   * the correct order and second, it puts them all at the end of
   * the Catalog.</p>
   *
   * <p>When processing reaches the end of each catalog file, any
   * elements on this vector are added to the end of the
   * <code>catalogEntries</code> vector. This assures that matching
   * PUBLIC keywords are encountered before DELEGATE* entries.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogs = new Vector();

  /**
   * A vector of Catalogs.
   *
   * <p>The semantics of Catalog resolution are such that each
   * catalog is effectively a list of Catalogs (in other words,
   * a recursive list of Catalog instances).</p>
   *
   * <p>Catalogs that are processed as the result of CATALOG or
   * DELEGATE* entries are subordinate to the catalog that contained
   * them, but they may in turn have subordinate catalogs.</p>
   *
   * <p>Catalogs are only loaded when they are needed, so this vector
   * initially contains a list of Catalog filenames (URLs). If, during
   * processing, one of these catalogs has to be loaded, the resulting
   * Catalog object is placed in the vector, effectively caching it
   * for the next query.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector localCatalogFiles = new Vector();

  /**
   * A vector of catalog files constructed during processing of
   * CATALOG entries in the current catalog.
   *
   * <p>This two-level system is actually necessary to correctly implement
   * the semantics of the CATALOG entry. If one catalog file includes
   * another with a CATALOG entry, the included catalog logically
   * occurs <i>at the end</i> of the including catalog, and after any
   * preceding CATALOG entries. In other words, the CATALOG entry
   * cannot insert anything into the middle of a catalog file.</p>
   *
   * <p>When processing reaches the end of each catalog files, any
   * elements on this vector are added to the front of the
   * <code>catalogFiles</code> vector.</p>
   *
   * @see #catalogFiles
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogFiles = new Vector();

  /**
   * A vector of catalog files to be loaded.
   *
   * <p>This list is initially established by
   * <code>loadSystemCatalogs</code> when
   * it parses the system catalog list, but CATALOG entries may
   * contribute to it during the course of parsing.</p>
   *
   * @see #loadSystemCatalogs
   * @see #localCatalogFiles
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The catalog manager in use for this instance. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected boolean default_override = true;

  /** The default initial override setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogEntries = new Vector();

  /** The catalog entries currently known to the system. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected URL catalogCwd;

  /** The base URI of the Catalog file currently being parsed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected URL base;

  /**
   * The base URI for relative system identifiers in the catalog.
   * This may be changed by BASE entries in the catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int URI_SUFFIX = CatalogEntry.addEntryType("URI_SUFFIX", 2);

  /** The URI_SUFFIX Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int REWRITE_URI = CatalogEntry.addEntryType("REWRITE_URI", 2);

  /** The REWRITE_URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int REWRITE_SYSTEM = CatalogEntry.addEntryType("REWRITE_SYSTEM", 2);

  /** The REWRITE_SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int URI      = CatalogEntry.addEntryType("URI", 2);

  /** The URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int SYSTEM   = CatalogEntry.addEntryType("SYSTEM", 2);

  /** The SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int PUBLIC   = CatalogEntry.addEntryType("PUBLIC", 2);

  /** The PUBLIC Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int NOTATION = CatalogEntry.addEntryType("NOTATION", 2);

  /** The NOTATION Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int LINKTYPE = CatalogEntry.addEntryType("LINKTYPE", 2);

  /** The LINKTYPE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int ENTITY   = CatalogEntry.addEntryType("ENTITY", 2);

  /** The ENTITY Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DTDDECL  = CatalogEntry.addEntryType("DTDDECL", 2);

  /** The DTDDECL Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DOCTYPE  = CatalogEntry.addEntryType("DOCTYPE", 2);

  /** The DOCTYPE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_URI = CatalogEntry.addEntryType("DELEGATE_URI", 2);

  /** The DELEGATE_URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_SYSTEM = CatalogEntry.addEntryType("DELEGATE_SYSTEM", 2);

  /** The DELEGATE_SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_PUBLIC = CatalogEntry.addEntryType("DELEGATE_PUBLIC", 2);

  /** The DELEGATE_PUBLIC Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int SGMLDECL = CatalogEntry.addEntryType("SGMLDECL", 1);

  /** The SGMLDECL Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int OVERRIDE = CatalogEntry.addEntryType("OVERRIDE", 1);

  /** The OVERRIDE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DOCUMENT = CatalogEntry.addEntryType("DOCUMENT", 1);

  /** The DOCUMENT Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int CATALOG  = CatalogEntry.addEntryType("CATALOG", 1);

  /** The CATALOG Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
public class Catalog {

/**
 * Represents OASIS Open Catalog files.
 *
 * <p>This class implements the semantics of OASIS Open Catalog files
 * (defined by
 * <a href="http://www.oasis-open.org/html/a401.htm">OASIS Technical
 * Resolution 9401:1997 (Amendment 2 to TR 9401)</a>).</p>
 *
 * <p>The primary purpose of the Catalog is to associate resources in the
 * document with local system identifiers. Some entities
 * (document types, XML entities, and notations) have names and all of them
 * can have either public or system identifiers or both. (In XML, only a
 * notation can have a public identifier without a system identifier, but
 * the methods implemented in this class obey the Catalog semantics
 * from the SGML
 * days when system identifiers were optional.)</p>
 *
 * <p>The system identifiers returned by the resolution methods in this
 * class are valid, i.e. usable by, and in fact constructed by, the
 * <tt>java.net.URL</tt> class. Unfortunately, this class seems to behave in
 * somewhat non-standard ways and the system identifiers returned may
 * not be directly usable in a browser or filesystem context.
 *
 * <p>This class recognizes all of the Catalog entries defined in
 * TR9401:1997:</p>
 *
 * <ul>
 * <li><b>BASE</b>
 * changes the base URI for resolving relative system identifiers. The
 * initial base URI is the URI of the location of the catalog (which is,
 * in turn, relative to the location of the current working directory
 * at startup, as returned by the <tt>user.dir</tt> system property).</li>
 * <li><b>CATALOG</b>
 * processes other catalog files. An included catalog occurs logically
 * at the end of the including catalog.</li>
 * <li><b>DELEGATE_PUBLIC</b>
 * specifies alternate catalogs for some public identifiers. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>DELEGATE_SYSTEM</b>
 * specifies alternate catalogs for some system identifiers. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>DELEGATE_URI</b>
 * specifies alternate catalogs for some URIs. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>REWRITE_SYSTEM</b>
 * specifies alternate prefix for a system identifier.</li>
 * <li><b>REWRITE_URI</b>
 * specifies alternate prefix for a URI.</li>
 * <li><b>SYSTEM_SUFFIX</b>
 * maps any system identifier that ends with a particular suffix to another
 * system identifier.</li>
 * <li><b>URI_SUFFIX</b>
 * maps any URI that ends with a particular suffix to another URI.</li>
 * <li><b>DOCTYPE</b>
 * associates the names of root elements with URIs. (In other words, an XML
 * processor might infer the doctype of an XML document that does not include
 * a doctype declaration by looking for the DOCTYPE entry in the
 * catalog which matches the name of the root element of the document.)</li>
 * <li><b>DOCUMENT</b>
 * provides a default document.</li>
 * <li><b>DTDDECL</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>ENTITY</b>
 * associates entity names with URIs.</li>
 * <li><b>LINKTYPE</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>NOTATION</b>
 * associates notation names with URIs.</li>
 * <li><b>OVERRIDE</b>
 * changes the override behavior. Initial behavior is set by the
 * system property <tt>xml.catalog.override</tt>. The default initial
 * behavior is 'YES', that is, entries in the catalog override
 * system identifiers specified in the document.</li>
 * <li><b>PUBLIC</b>
 * maps a public identifier to a system identifier.</li>
 * <li><b>SGMLDECL</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>SYSTEM</b>
 * maps a system identifier to another system identifier.</li>
 * <li><b>URI</b>
 * maps a URI to another URI.</li>
 * </ul>
 *
 * <p>Note that BASE entries are treated as described by RFC2396. In
 * particular, this has the counter-intuitive property that after a BASE
 * entry identifing "http://example.com/a/b/c" as the base URI,
 * the relative URI "foo" is resolved to the absolute URI
 * "http://example.com/a/b/foo". You must provide the trailing slash if
 * you do not want the final component of the path to be discarded as a
 * filename would in a URI for a resource: "http://example.com/a/b/c/".
 * </p>
 *
 * <p>Note that subordinate catalogs (all catalogs except the first,
 * including CATALOG and DELEGATE* catalogs) are only loaded if and when
 * they are required.</p>
 *
 * <p>This class relies on classes which implement the CatalogReader
 * interface to actually load catalog files. This allows the catalog
 * semantics to be implemented for TR9401 text-based catalogs, XML
 * catalogs, or any number of other storage formats.</p>
 *
 * <p>Additional catalogs may also be loaded with the
 * {@link #parseCatalog} method.</p>
 * </dd>
 * </dl>
 *
 * <p><b>Change Log:</b></p>
 * <dl>
 * <dt>2.0</dt>
 * <dd><p>Rewrite to use CatalogReaders.</p></dd>
 * <dt>1.1</dt>
 * <dd><p>Allow quoted components in <tt>xml.catalog.files</tt>
 * so that URLs containing colons can be used on Unix.
 * The string passed to <tt>xml.catalog.files</tt> can now have the form:</p>
 * <pre>
 * unquoted-path-with-no-sep-chars:"double-quoted path with or without sep chars":'single-quoted path with or without sep chars'
 * </pre>
 * <p>(Where ":" is the separater character in this example.)</p>
 * <p>If an unquoted path contains an embedded double or single quote
 * character, no special processig is performed on that character. No
 * path can contain separater characters, double, and single quotes
 * simultaneously.</p>
 * <p>Fix bug in calculation of BASE entries: if
 * a catalog contains multiple BASE entries, each is relative to the preceding
 * base, not the default base URI of the catalog.</p>
 * </dd>
 * <dt>1.0.1</dt>
 * <dd><p>Fixed a bug in the calculation of the list of subordinate catalogs.
 * This bug caused an infinite loop where parsing would alternately process
 * two catalogs indefinitely.</p>
 * </dd>
 * </dl>
 *
 * @see CatalogReader
 * @see CatalogEntry
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 *
 * <p>Derived from public domain code originally published by Arbortext,
 * Inc.</p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected void addDelegate(CatalogEntry entry) {

  /**
   * Add to the current list of delegated catalogs.
   *
   * <p>This method always constructs the {@link #localDelegate}
   * vector so that it is ordered by length of partial
   * public identifier.</p>
   *
   * @param entry The DELEGATE catalog entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String encodedByte (int b) {

  /**
   * Perform %-encoding on a single byte.
   *
   * @param b The 8-bit integer that represents th byte. (Bytes are signed
              but encoding needs to look at the bytes unsigned.)
   * @return The %-encoded string for the byte in question.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String normalizeURI(String uriref) {

  /**
   * Perform character normalization on a URI reference.
   *
   * @param uriref The URI reference
   * @return The normalized URI reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String makeAbsolute(String sysid) {

  /**
   * Construct an absolute URI from a relative one, using the current
   * base URI.
   *
   * @param sysid The (possibly relative) system identifier
   * @return The system identifier made absolute with respect to the
   * current {@link #base}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String fixSlashes (String sysid) {

  /**
   * Replace backslashes with forward slashes. (URLs always use
   * forward slashes.)
   *
   * @param sysid The input system identifier.
   * @return The same system identifier with backslashes turned into
   * forward slashes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized String resolveSubordinateCatalogs(int entityType,
                                                           String entityName,
                                                           String publicId,
                                                           String systemId)

  /**
   * Search the subordinate catalogs, in order, looking for a match.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given entity type with the given
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
   * in question (as provided in the source document). This parameter is
   * overloaded for the URI entry type.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String resolveLocalURI(String uri)

  /**
   * Return the applicable URI in this catalog.
   *
   * <p>If a URI entry exists in the catalog file
   * for the URI specified, return the mapped value.</p>
   *
   * @param uri The URI to locate in the catalog
   *
   * @return The mapped URI or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveURI(String uri)

  /**
   * Return the applicable URI.
   *
   * <p>If a URI entry exists in the Catalog
   * for the URI specified, return the mapped value.</p>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected String resolveLocalSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier in this
   * catalog.
   *
   * <p>If a SYSTEM entry exists in the catalog file
   * for the system ID specified, return the mapped value.</p>
   *
   * @param systemId The system ID to locate in the catalog
   *
   * @return The mapped system identifier or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveSystem(String systemId)

  /**
   * Return the applicable SYSTEM system identifier.
   *
   * <p>If a SYSTEM entry exists in the Catalog
   * for the system ID specified, return the mapped value.</p>
   *
   * <p>On Windows-based operating systems, the comparison between
   * the system identifier provided and the SYSTEM entries in the
   * Catalog is case-insensitive.</p>
   *
   * @param systemId The system ID to locate in the catalog.
   *
   * @return The resolved system identifier.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized String resolveLocalPublic(int entityType,
                                                   String entityName,
                                                   String publicId,
                                                   String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or public identifiers.
   * If no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * delegated Catalogs are interrogated.</p>
   *
   * <p>There are four possible cases:</p>
   *
   * <ul>
   * <li>If the system identifier provided matches a SYSTEM entry
   * in the current catalog, the SYSTEM entry is returned.
   * <li>If the system identifier is not null, the PUBLIC entries
   * that were encountered when OVERRIDE YES was in effect are
   * interrogated and the first matching entry is returned.</li>
   * <li>If the system identifier is null, then all of the PUBLIC
   * entries are interrogated and the first matching entry
   * is returned. This may not be the same as the preceding case, if
   * some PUBLIC entries are encountered when OVERRIDE NO is in effect. In
   * XML, the only place where a public identifier may occur without
   * a system identifier is in a notation declaration.</li>
   * <li>Finally, if the public identifier matches one of the partial
   * public identifiers specified in a DELEGATE* entry in
   * the Catalog, the delegated catalog is interrogated. The first
   * time that the delegated catalog is required, it will be
   * retrieved and parsed. It is subsequently cached.
   * </li>
   * </ul>
   *
   * @param entityType The CatalogEntry type for which this query is
   * being conducted. This is necessary in order to do the approprate
   * query on a delegated catalog.
   * @param entityName The name of the entity being searched for, if
   * appropriate.
   * @param publicId The public identifier of the entity in question.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolvePublic(String publicId, String systemId)

  /**
   * Return the applicable PUBLIC or SYSTEM identifier.
   *
   * <p>This method searches the Catalog and returns the system
   * identifier specified for the given system or
   * public identifiers. If
   * no appropriate PUBLIC or SYSTEM entry is found in the Catalog,
   * null is returned.</p>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveNotation(String notationName,
                                String publicId,
                                String systemId)

  /**
   * Return the applicable NOTATION system identifier.
   *
   * @param notationName The name of the notation for which
   * a doctype is required.
   * @param publicId The nominal public identifier for the notation
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the notation
   * (as provided in the source document).
   *
   * @return The system identifier to use for the notation.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveEntity(String entityName,
                              String publicId,
                              String systemId)

  /**
   * Return the applicable ENTITY system identifier.
   *
   * @param entityName The name of the entity for which
   * a system identifier is required.
   * @param publicId The nominal public identifier for the entity
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the entity
   * (as provided in the source document).
   *
   * @return The system identifier to use for the entity.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveDocument()

  /**
   * Return the applicable DOCUMENT entry.
   *
   * @return The system identifier to use for the doctype.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String resolveDoctype(String entityName,
                               String publicId,
                               String systemId)

  /**
   * Return the applicable DOCTYPE system identifier.
   *
   * @param entityName The name of the entity (element) for which
   * a doctype is required.
   * @param publicId The nominal public identifier for the doctype
   * (as provided in the source document).
   * @param systemId The nominal system identifier for the doctype
   * (as provided in the source document).
   *
   * @return The system identifier to use for the doctype.
   *
   * @throws MalformedURLException The formal system identifier of a
   * subordinate catalog cannot be turned into a valid URL.
   * @throws IOException Error reading subordinate catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void parseAllCatalogs()

  /**
   * Parse all subordinate catalogs.
   *
   * <p>This method recursively parses all of the subordinate catalogs.
   * If this method does not throw an exception, you can be confident that
   * no subsequent call to any resolve*() method will either, with two
   * possible exceptions:</p>
   *
   * <ol>
   * <li><p>Delegated catalogs are re-parsed each time they are needed
   * (because a variable list of them may be needed in each case,
   * depending on the length of the matching partial public identifier).</p>
   * <p>But they are parsed by this method, so as long as they don't
   * change or disappear while the program is running, they shouldn't
   * generate errors later if they don't generate errors now.</p>
   * <li><p>If you add new catalogs with <code>parseCatalog</code>, they
   * won't be loaded until they are needed or until you call
   * <code>parseAllCatalogs</code> again.</p>
   * </ol>
   *
   * <p>On the other hand, if you don't call this method, you may
   * successfully parse documents without having to load all possible
   * catalogs.</p>
   *
   * @throws MalformedURLException The filename (URL) for a
   * subordinate or delegated catalog is not a valid URL.
   * @throws IOException Error reading some subordinate or delegated
   * catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void unknownEntry(Vector strings) {

  /**
   * Handle unknown CatalogEntry types.
   *
   * <p>This method exists to allow subclasses to deal with unknown
   * entry types.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized void parseCatalogFile(String fileName)

  /**
   * Parse a single catalog file, augmenting internal data structures.
   *
   * @param fileName The filename of the catalog file to process
   *
   * @throws MalformedURLException The fileName cannot be turned into
   * a valid URL.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected synchronized void parsePendingCatalogs()

  /**
   * Parse all of the pending catalogs.
   *
   * <p>Catalogs may refer to other catalogs, this method parses
   * all of the currently pending catalog files.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(URL aUrl) throws IOException {

  /**
   * Parse a catalog document, augmenting internal data structures.
   *
   * <p>This method supports catalog files stored in jar files: e.g.,
   * jar:file:///path/to/filename.jar!/path/to/catalog.xml". That URI
   * doesn't survive transmogrification through the URI processing that
   * the parseCatalog(String) performs and passing it as an input stream
   * doesn't set the base URI appropriately.</p>
   *
   * <p>Written by Stefan Wachter (2002-09-26)</p>
   *
   * @param aUrl The URL of the catalog document to process
   *
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(String mimeType, InputStream is)

  /**
   * Parse a catalog file, augmenting internal data structures.
   *
   * <p>Catalogs retrieved over the net may have an associated MIME type.
   * The MIME type can be used to select an appropriate reader.</p>
   *
   * @param mimeType The MIME type of the catalog file.
   * @param is The InputStream from which the catalog should be read
   *
   * @throws CatalogException Failed to load catalog
   * mimeType.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public synchronized void parseCatalog(String fileName)

  /**
   * Parse a catalog file, augmenting internal data structures.
   *
   * @param fileName The filename of the catalog file to process
   *
   * @throws MalformedURLException The fileName cannot be turned into
   * a valid URL.
   * @throws IOException Error reading catalog file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void loadSystemCatalogs()

  /**
   * Load the system catalog files.
   *
   * <p>The method adds all of the
   * catalogs specified in the <tt>xml.catalog.files</tt> property
   * to the Catalog list.</p>
   *
   * @throws MalformedURLException  One of the system catalogs is
   * identified with a filename that is not a valid URL.
   * @throws IOException One of the system catalogs cannot be read.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String getDefaultOverride() {

  /**
   * Returns the default override setting associated with this
   * catalog.
   *
   * <p>All catalog files loaded by this catalog will have the
   * initial override setting specified by this default.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public String getCurrentBase() {

  /**
   * Returns the current base URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Catalog newCatalog() {

  /**
   * Create a new Catalog object.
   *
   * <p>This method constructs a new instance of the running Catalog
   * class (which might be a subtype of com.sun.org.apache.xml.internal.resolver.Catalog).
   * All new catalogs are managed by the same CatalogManager.
   * </p>
   *
   * <p>N.B. All Catalog subtypes should call newCatalog() to construct
   * a new Catalog. Do not simply use "new Subclass()" since that will
   * confuse future subclasses.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected void copyReaders(Catalog newCatalog) {

  /**
   * Copies the reader list from the current Catalog to a new Catalog.
   *
   * <p>This method is used internally when constructing a new catalog.
   * It copies the current reader associations over to the new catalog.
   * </p>
   *
   * @param newCatalog The new Catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void addReader(String mimeType, CatalogReader reader) {

  /**
   * Add a new CatalogReader to the Catalog.
   *
   * <p>This method allows you to add a new CatalogReader to the
   * catalog. The reader will be associated with the specified mimeType.
   * You can only have one reader per mimeType.</p>
   *
   * <p>In the absence of a mimeType (e.g., when reading a catalog
   * directly from a file on the local system), the readers are attempted
   * in the order that you add them to the Catalog.</p>
   *
   * <p>Note that subordinate catalogs (created by CATALOG or
   * DELEGATE* entries) get a copy of the set of readers present in
   * the primary catalog when they are created. Readers added subsequently
   * will not be available. For this reason, it is best to add all
   * of the readers before the first call to parse a catalog.</p>
   *
   * @param mimeType The MIME type associated with this reader.
   * @param reader The CatalogReader to use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void setupReaders() {

  /**
   * Setup readers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public void setCatalogManager(CatalogManager manager) {

  /**
   * Establish the CatalogManager used by this catalog.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public CatalogManager getCatalogManager() {

  /**
   * Return the CatalogManager used by this catalog.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public Catalog(CatalogManager manager) {

  /**
   * Constructs an empty Catalog with a specific CatalogManager.
   *
   * <p>The constructor interrogates the relevant system properties
   * using the specified Catalog Manager
   * and initializes the catalog data structures.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public Catalog() {

  /**
   * Constructs an empty Catalog.
   *
   * <p>The constructor interrogates the relevant system properties
   * using the default (static) CatalogManager
   * and initializes the catalog data structures.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector readerArr = new Vector();

  /**
   * A vector of CatalogReaders.
   *
   * <p>This vector contains all of the readers in the order that they
   * were added. In the event that a catalog is read from a file, where
   * the MIME type is unknown, each reader is attempted in turn until
   * one succeeds.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Map<String, Integer> readerMap = new HashMap<>();

  /**
   * A hash of CatalogReaders.
   *
   * <p>This hash maps MIME types to elements in the readerArr
   * vector. This allows the Catalog to quickly locate the reader
   * for a particular MIME type.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector localDelegate = new Vector();

  /**
   * A vector of DELEGATE* Catalog entries constructed during
   * processing of the Catalog.
   *
   * <p>This two-level system has two purposes; first, it allows
   * us to sort the DELEGATE* entries by the length of the partial
   * public identifier so that a linear search encounters them in
   * the correct order and second, it puts them all at the end of
   * the Catalog.</p>
   *
   * <p>When processing reaches the end of each catalog file, any
   * elements on this vector are added to the end of the
   * <code>catalogEntries</code> vector. This assures that matching
   * PUBLIC keywords are encountered before DELEGATE* entries.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogs = new Vector();

  /**
   * A vector of Catalogs.
   *
   * <p>The semantics of Catalog resolution are such that each
   * catalog is effectively a list of Catalogs (in other words,
   * a recursive list of Catalog instances).</p>
   *
   * <p>Catalogs that are processed as the result of CATALOG or
   * DELEGATE* entries are subordinate to the catalog that contained
   * them, but they may in turn have subordinate catalogs.</p>
   *
   * <p>Catalogs are only loaded when they are needed, so this vector
   * initially contains a list of Catalog filenames (URLs). If, during
   * processing, one of these catalogs has to be loaded, the resulting
   * Catalog object is placed in the vector, effectively caching it
   * for the next query.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector localCatalogFiles = new Vector();

  /**
   * A vector of catalog files constructed during processing of
   * CATALOG entries in the current catalog.
   *
   * <p>This two-level system is actually necessary to correctly implement
   * the semantics of the CATALOG entry. If one catalog file includes
   * another with a CATALOG entry, the included catalog logically
   * occurs <i>at the end</i> of the including catalog, and after any
   * preceding CATALOG entries. In other words, the CATALOG entry
   * cannot insert anything into the middle of a catalog file.</p>
   *
   * <p>When processing reaches the end of each catalog files, any
   * elements on this vector are added to the front of the
   * <code>catalogFiles</code> vector.</p>
   *
   * @see #catalogFiles
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogFiles = new Vector();

  /**
   * A vector of catalog files to be loaded.
   *
   * <p>This list is initially established by
   * <code>loadSystemCatalogs</code> when
   * it parses the system catalog list, but CATALOG entries may
   * contribute to it during the course of parsing.</p>
   *
   * @see #loadSystemCatalogs
   * @see #localCatalogFiles
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The catalog manager in use for this instance. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected boolean default_override = true;

  /** The default initial override setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected Vector catalogEntries = new Vector();

  /** The catalog entries currently known to the system. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected URL catalogCwd;

  /** The base URI of the Catalog file currently being parsed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  protected URL base;

  /**
   * The base URI for relative system identifiers in the catalog.
   * This may be changed by BASE entries in the catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int URI_SUFFIX = CatalogEntry.addEntryType("URI_SUFFIX", 2);

  /** The URI_SUFFIX Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int REWRITE_URI = CatalogEntry.addEntryType("REWRITE_URI", 2);

  /** The REWRITE_URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int REWRITE_SYSTEM = CatalogEntry.addEntryType("REWRITE_SYSTEM", 2);

  /** The REWRITE_SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int URI      = CatalogEntry.addEntryType("URI", 2);

  /** The URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int SYSTEM   = CatalogEntry.addEntryType("SYSTEM", 2);

  /** The SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int PUBLIC   = CatalogEntry.addEntryType("PUBLIC", 2);

  /** The PUBLIC Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int NOTATION = CatalogEntry.addEntryType("NOTATION", 2);

  /** The NOTATION Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int LINKTYPE = CatalogEntry.addEntryType("LINKTYPE", 2);

  /** The LINKTYPE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int ENTITY   = CatalogEntry.addEntryType("ENTITY", 2);

  /** The ENTITY Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DTDDECL  = CatalogEntry.addEntryType("DTDDECL", 2);

  /** The DTDDECL Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DOCTYPE  = CatalogEntry.addEntryType("DOCTYPE", 2);

  /** The DOCTYPE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_URI = CatalogEntry.addEntryType("DELEGATE_URI", 2);

  /** The DELEGATE_URI Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_SYSTEM = CatalogEntry.addEntryType("DELEGATE_SYSTEM", 2);

  /** The DELEGATE_SYSTEM Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DELEGATE_PUBLIC = CatalogEntry.addEntryType("DELEGATE_PUBLIC", 2);

  /** The DELEGATE_PUBLIC Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int SGMLDECL = CatalogEntry.addEntryType("SGMLDECL", 1);

  /** The SGMLDECL Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int OVERRIDE = CatalogEntry.addEntryType("OVERRIDE", 1);

  /** The OVERRIDE Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int DOCUMENT = CatalogEntry.addEntryType("DOCUMENT", 1);

  /** The DOCUMENT Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
  public static final int CATALOG  = CatalogEntry.addEntryType("CATALOG", 1);

  /** The CATALOG Catalog Entry type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/Catalog.java
public class Catalog {

/**
 * Represents OASIS Open Catalog files.
 *
 * <p>This class implements the semantics of OASIS Open Catalog files
 * (defined by
 * <a href="http://www.oasis-open.org/html/a401.htm">OASIS Technical
 * Resolution 9401:1997 (Amendment 2 to TR 9401)</a>).</p>
 *
 * <p>The primary purpose of the Catalog is to associate resources in the
 * document with local system identifiers. Some entities
 * (document types, XML entities, and notations) have names and all of them
 * can have either public or system identifiers or both. (In XML, only a
 * notation can have a public identifier without a system identifier, but
 * the methods implemented in this class obey the Catalog semantics
 * from the SGML
 * days when system identifiers were optional.)</p>
 *
 * <p>The system identifiers returned by the resolution methods in this
 * class are valid, i.e. usable by, and in fact constructed by, the
 * <tt>java.net.URL</tt> class. Unfortunately, this class seems to behave in
 * somewhat non-standard ways and the system identifiers returned may
 * not be directly usable in a browser or filesystem context.
 *
 * <p>This class recognizes all of the Catalog entries defined in
 * TR9401:1997:</p>
 *
 * <ul>
 * <li><b>BASE</b>
 * changes the base URI for resolving relative system identifiers. The
 * initial base URI is the URI of the location of the catalog (which is,
 * in turn, relative to the location of the current working directory
 * at startup, as returned by the <tt>user.dir</tt> system property).</li>
 * <li><b>CATALOG</b>
 * processes other catalog files. An included catalog occurs logically
 * at the end of the including catalog.</li>
 * <li><b>DELEGATE_PUBLIC</b>
 * specifies alternate catalogs for some public identifiers. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>DELEGATE_SYSTEM</b>
 * specifies alternate catalogs for some system identifiers. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>DELEGATE_URI</b>
 * specifies alternate catalogs for some URIs. The delegated
 * catalogs are not loaded until they are needed, but they are cached
 * once loaded.</li>
 * <li><b>REWRITE_SYSTEM</b>
 * specifies alternate prefix for a system identifier.</li>
 * <li><b>REWRITE_URI</b>
 * specifies alternate prefix for a URI.</li>
 * <li><b>SYSTEM_SUFFIX</b>
 * maps any system identifier that ends with a particular suffix to another
 * system identifier.</li>
 * <li><b>URI_SUFFIX</b>
 * maps any URI that ends with a particular suffix to another URI.</li>
 * <li><b>DOCTYPE</b>
 * associates the names of root elements with URIs. (In other words, an XML
 * processor might infer the doctype of an XML document that does not include
 * a doctype declaration by looking for the DOCTYPE entry in the
 * catalog which matches the name of the root element of the document.)</li>
 * <li><b>DOCUMENT</b>
 * provides a default document.</li>
 * <li><b>DTDDECL</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>ENTITY</b>
 * associates entity names with URIs.</li>
 * <li><b>LINKTYPE</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>NOTATION</b>
 * associates notation names with URIs.</li>
 * <li><b>OVERRIDE</b>
 * changes the override behavior. Initial behavior is set by the
 * system property <tt>xml.catalog.override</tt>. The default initial
 * behavior is 'YES', that is, entries in the catalog override
 * system identifiers specified in the document.</li>
 * <li><b>PUBLIC</b>
 * maps a public identifier to a system identifier.</li>
 * <li><b>SGMLDECL</b>
 * recognized and silently ignored. Not relevant for XML.</li>
 * <li><b>SYSTEM</b>
 * maps a system identifier to another system identifier.</li>
 * <li><b>URI</b>
 * maps a URI to another URI.</li>
 * </ul>
 *
 * <p>Note that BASE entries are treated as described by RFC2396. In
 * particular, this has the counter-intuitive property that after a BASE
 * entry identifing "http://example.com/a/b/c" as the base URI,
 * the relative URI "foo" is resolved to the absolute URI
 * "http://example.com/a/b/foo". You must provide the trailing slash if
 * you do not want the final component of the path to be discarded as a
 * filename would in a URI for a resource: "http://example.com/a/b/c/".
 * </p>
 *
 * <p>Note that subordinate catalogs (all catalogs except the first,
 * including CATALOG and DELEGATE* catalogs) are only loaded if and when
 * they are required.</p>
 *
 * <p>This class relies on classes which implement the CatalogReader
 * interface to actually load catalog files. This allows the catalog
 * semantics to be implemented for TR9401 text-based catalogs, XML
 * catalogs, or any number of other storage formats.</p>
 *
 * <p>Additional catalogs may also be loaded with the
 * {@link #parseCatalog} method.</p>
 * </dd>
 * </dl>
 *
 * <p><b>Change Log:</b></p>
 * <dl>
 * <dt>2.0</dt>
 * <dd><p>Rewrite to use CatalogReaders.</p></dd>
 * <dt>1.1</dt>
 * <dd><p>Allow quoted components in <tt>xml.catalog.files</tt>
 * so that URLs containing colons can be used on Unix.
 * The string passed to <tt>xml.catalog.files</tt> can now have the form:</p>
 * <pre>
 * unquoted-path-with-no-sep-chars:"double-quoted path with or without sep chars":'single-quoted path with or without sep chars'
 * </pre>
 * <p>(Where ":" is the separater character in this example.)</p>
 * <p>If an unquoted path contains an embedded double or single quote
 * character, no special processig is performed on that character. No
 * path can contain separater characters, double, and single quotes
 * simultaneously.</p>
 * <p>Fix bug in calculation of BASE entries: if
 * a catalog contains multiple BASE entries, each is relative to the preceding
 * base, not the default base URI of the catalog.</p>
 * </dd>
 * <dt>1.0.1</dt>
 * <dd><p>Fixed a bug in the calculation of the list of subordinate catalogs.
 * This bug caused an infinite loop where parsing would alternately process
 * two catalogs indefinitely.</p>
 * </dd>
 * </dl>
 *
 * @see CatalogReader
 * @see CatalogEntry
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 *
 * <p>Derived from public domain code originally published by Arbortext,
 * Inc.</p>
 */
