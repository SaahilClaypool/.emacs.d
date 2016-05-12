_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
                if(fCurrentEntity.mayReadChunks || !fCurrentEntity.xmlDeclChunkRead) {

                /**
                 * //System.out.println("fCurrentEntitty = " + fCurrentEntity );
                 * //System.out.println("fInputStream = " + fInputStream );
                 * // better get some more for the voracious reader... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected final class RewindableInputStream extends InputStream {

    /**
    * This class wraps the byte inputstreams we're presented with.
    * We need it because java.io.InputStreams don't provide
    * functionality to reread processed bytes, and they have a habit
    * of reading more than one character when you call their read()
    * methods.  This means that, once we discover the true (declared)
    * encoding of a document, we can neither backtrack to read the
    * whole doc again nor start reading where we are with a new
    * reader.
    *
    * This class allows rewinding an inputStream by allowing a mark
    * to be set, and the stream reset to that position.  <strong>The
    * class assumes that it needs to read one character per
    * invocation when it's read() method is inovked, but uses the
    * underlying InputStream's read(char[], offset length) method--it
    * won't buffer data read this way!</strong>
    *
    * @xerces.internal
    *
    * @author Neil Graham, IBM
    * @author Glenn Marcy, IBM
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public void setExternalBufferSize(int bufferSize) {

        /** Sets the size of external buffers and dumps the old pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public void returnToPool(CharacterBuffer buffer) {

        /** Returns buffer to pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public CharacterBuffer getBuffer(boolean external) {

        /** Retrieves buffer from pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private void init() {

        /** Initializes buffer pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static class CharacterBufferPool {

     /**
     * Stores a number of character buffers and provides it to the entity
     * manager to use when an entity is seen.
     *
     * @xerces.internal
     *
     * @author Ankit Pasricha, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private boolean isExternal;

        /** whether the buffer is for an external or internal scanned entity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private char[] ch;

        /** character buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static class CharacterBuffer {

    /**
     * Buffer used in entity manager to reuse character arrays instead
     * of creating new ones every time.
     *
     * @xerces.internal
     *
     * @author Ankit Pasricha, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    final void print() {

    /** Prints the contents of the buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static String fixURI(String str) {

    /**
     * Fixes a platform dependent filename to standard URI form.
     *
     * @param str The string to fix.
     *
     * @return Returns the fixed URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public int getColumnNumber() {

    /**
     * Return the column number where the current document event ends.
     * <p>
     * <strong>Warning:</strong> The return value from the method
     * is intended only as an approximation for the sake of error
     * reporting; it is not intended to provide sufficient information
     * to edit the character content of the original XML document.
     * <p>
     * The return value is an approximation of the column number
     * in the document entity or external parsed entity where the
     * markup triggering the event appears.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.  The first column in each line is column 1.
     *
     * @return The column number, or -1 if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public int getLineNumber() {

    /**
     * Return the line number where the current document event ends.
     * <p>
     * <strong>Warning:</strong> The return value from the method
     * is intended only as an approximation for the sake of error
     * reporting; it is not intended to provide sufficient information
     * to edit the character content of the original XML document.
     * <p>
     * The return value is an approximation of the line number
     * in the document entity or external parsed entity where the
     * markup triggering the event appears.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.  The first line in the document is line 1.
     *
     * @return The line number, or -1 if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getLiteralSystemId() {

    /**
     * Return the literal system identifier for the current document event.
     * <p>
     * The return value is the literal system identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     * <p>
     * @return A string containing the literal system identifier, or null
     *         if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getExpandedSystemId() {

    /**
     * Return the expanded system identifier for the current document event.
     * <p>
     * The return value is the expanded system identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     * <p>
     * If the system identifier is a URL, the parser must resolve it
     * fully before passing it to the application.
     *
     * @return A string containing the expanded system identifier, or null
     *         if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getPublicId() {

    /**
     * Return the public identifier for the current document event.
     * <p>
     * The return value is the public identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     *
     * @return A string containing the public identifier, or
     *         null if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Reader createReader(InputStream inputStream, String encoding, Boolean isBigEndian)

    /**
     * Creates a reader capable of reading the given input stream in
     * the specified encoding.
     *
     * @param inputStream  The input stream.
     * @param encoding     The encoding name that the input stream is
     *                     encoded using. If the user has specified that
     *                     Java encoding names are allowed, then the
     *                     encoding name may be a Java encoding name;
     *                     otherwise, it is an ianaEncoding name.
     * @param isBigEndian   For encodings (like uCS-4), whose names cannot
     *                      specify a byte order, this tells whether the order is bigEndian.  null menas
     *                      unknown or not relevant.
     *
     * @return Returns a reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Object[] getEncodingName(byte[] b4, int count) {

    /**
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @param count The number of bytes actually read.
     * @return a 2-element array:  the first element, an IANA-encoding string,
     *  the second element a Boolean which is true iff the document is big endian, false
     *  if it's little-endian, and null if the distinction isn't relevant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            throw new URISyntaxException(systemId, "the scheme's length is only one character");

            /**
             * If the scheme's length is only one character,
             * it's likely that this was intended as a file
             * path. Fixing this up in expandSystemId to
             * maintain backwards compatibility.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            throw new URI.MalformedURIException();

            /**
             * If the scheme's length is only one character,
             * it's likely that this was intended as a file
             * path. Fixing this up in expandSystemId to
             * maintain backwards compatibility.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static String expandSystemIdStrictOff(String systemId, String baseSystemId)

    /**
     * Helper method for expandSystemId(String,String,boolean):String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static void setInstanceFollowRedirects(HttpURLConnection urlCon, boolean followRedirects) {

    /**
     * Attempt to set whether redirects will be followed for an <code>HttpURLConnection</code>.
     * This may fail on earlier JDKs which do not support setting this preference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static String expandSystemIdStrictOn(String systemId, String baseSystemId)

    /**
     * Helper method for expandSystemId(String,String,boolean):String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            try {

            /** Xerces URI rejects unicode, try java.net.URI
             * this is not ideal solution, but it covers known cases which either
             * Xerces URI or java.net.URI can handle alone
             * will file bug against java.net.URI
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId, String baseSystemId,
                                        boolean strict)

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId, String baseSystemId) {

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static void absolutizeAgainstUserDir(URI uri)

    /**
     * Absolutizes a URI using the current value
     * of the "user.dir" property as the base URI. If
     * the URI is already absolute, this is a no-op.
     *
     * @param uri the URI to absolutize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId) {

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setProperty(String propertyId, Object value){

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        //close the reader

        /** need to close the reader first since the program can end
         *  prematurely (e.g. fEntityHandler.endEntity may throw exception)
         *  leaving the reader open
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void closeReaders() {

    /**
     * Close all opened InputStreams and Readers opened by this parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public Entity.ScannedEntity getTopLevelEntity() {

    /**
     * Return the top level entity handled by this manager, or null
     * if no entity was added.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public Entity.ScannedEntity getCurrentEntity(){

    /**
     * Return the current entity being scanned. Current entity is SET using startEntity function.
     * @return Entity.ScannedEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startEntity(boolean reference, String name,
            XMLInputSource xmlInputSource,
            boolean literal, boolean isExternal)

    /**
     * Starts an entity.
     * <p>
     * This method can be used to insert an application defined XML
     * entity stream into the parsing stream.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param name           The name of the entity.
     * @param xmlInputSource The input source of the entity.
     * @param literal        True if this entity is started within a
     *                       literal value.
     * @param isExternal    whether this entity should be treated as an internal or external entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startDTDEntity(XMLInputSource xmlInputSource)

    /**
     * Starts the DTD entity. The DTD entity has the "[dtd]"
     * pseudo-name.
     *
     * @param xmlInputSource The input source of the DTD entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startDocumentEntity(XMLInputSource xmlInputSource)

    /**
     * Starts the document entity. The document entity has the "[xml]"
     * pseudo-name.
     *
     * @param xmlInputSource The input source of the document entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            xmlInputSource = staxInputSource.getXMLInputSource() ;

            /** xxx:  Waiting from the EG
             * //simply return if there was entity resolver registered and application
             * //returns either XMLStreamReader or XMLEventReader.
             * if(staxInputSource.hasXMLStreamOrXMLEventReader()) return ;
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startEntity(boolean reference, String entityName, boolean literal)

    /**
     * Starts a named entity.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param entityName The name of the entity to start.
     * @param literal    True if this entity is started within a literal
     *                   value.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier) throws IOException, XNIException {

    /**
     * Resolves the specified public and system identifiers. This
     * method first attempts to resolve the entity based on the
     * EntityResolver registered by the application. If no entity
     * resolver is registered or if the registered entity handler
     * is unable to resolve the entity, then default entity
     * resolution will occur.
     *
     * @param publicId     The public identifier of the entity.
     * @param systemId     The system identifier of the entity.
     * @param baseSystemId The base system identifier of the entity.
     *                     This is the system identifier of the current
     *                     entity and is used to expand the system
     *                     identifier when the system identifier is a
     *                     relative URI.
     *
     * @return Returns an input source that wraps the resolved entity.
     *         This method will never return null.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity resolver to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setEntityHandler(com.sun.org.apache.xerces.internal.impl.XMLEntityHandler entityHandler) {

    /**
     * Sets the entity handler. When an entity starts and ends, the
     * entity handler is notified of the change.
     *
     * @param entityHandler The new entity handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isStandalone() {

    /** Returns true if the document entity is standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setStandalone(boolean standalone) {

    /**
     * Sets whether the document entity is standalone.
     *
     * @param standalone True if document entity is standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isEntityDeclInExternalSubset(String entityName) {

    /**
     * Checks whether the declaration of an entity given by name is
     * // in the external subset.
     *
     * @param entityName The name of the entity to check.
     * @return True if the entity was declared in the external subset, false otherwise
     *           (including when the entity is not declared).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isExternalEntity(String entityName) {

    /**
     * Checks whether an entity given by name is external.
     *
     * @param entityName The name of the entity to check.
     * @return True if the entity is external, false otherwise
     * (including when the entity is not declared).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String setupCurrentEntity(boolean reference, String name, XMLInputSource xmlInputSource,
            boolean literal, boolean isExternal)

    /**
     * This method uses the passed-in XMLInputSource to make
     * fCurrentEntity usable for reading.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param name  name of the entity (XML is it's the document entity)
     * @param xmlInputSource    the input source, with sufficient information
     *      to begin scanning characters.
     * @param literal        True if this entity is started within a
     *                       literal value.
     * @param isExternal    whether this entity should be treated as an internal or external entity.
     * @throws IOException  if anything can't be read
     *  XNIException    If any parser-specific goes wrong.
     * @return the encoding of the new entity or null if a character stream was employed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityScanner getEntityScanner(){

    /** return the entity responsible for reading the entity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityStorage getEntityStore(){

    /** get the entity storage object from entity manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addUnparsedEntity(String name,
            String publicId, String systemId,
            String baseSystemId, String notation) {

    /**
     * Adds an unparsed entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name     The name of the entity.
     * @param publicId The public identifier of the entity.
     * @param systemId The system identifier of the entity.
     * @param notation The name of the notation.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addExternalEntity(String name,
            String publicId, String literalSystemId,
            String baseSystemId) throws IOException {

    /**
     * Adds an external entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name         The name of the entity.
     * @param publicId     The public identifier of the entity.
     * @param literalSystemId     The system identifier of the entity.
     * @param baseSystemId The base system identifier of the entity.
     *                     This is the system identifier of the entity
     *                     where <em>the entity being added</em> and
     *                     is used to expand the system identifier when
     *                     the system identifier is a relative URI.
     *                     When null the system identifier of the first
     *                     external entity on the stack is used instead.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addInternalEntity(String name, String text) {

    /**
     * Adds an internal entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name The name of the entity.
     * @param text The text of the entity.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityManager(PropertyManager propertyManager) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityManager() {

    /**
     * If this constructor is used to create the object, reset() should be invoked on this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private CharacterBufferPool fBufferPool = new CharacterBufferPool(fBufferSize, DEFAULT_INTERNAL_BUFFER_SIZE);

    /** Pool of character buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private final Augmentations fEntityAugs = new AugmentationsImpl();

    /** Augmentations for entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private final XMLResourceIdentifierImpl fResourceIdentifier = new XMLResourceIdentifierImpl();

    /** Resource identifer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    boolean fISCreatedByResolver = false;

    /** identify if the InputSource is created by a resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Entity.ScannedEntity fCurrentEntity = null;

    /** Current entity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Stack fEntityStack = new Stack();

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Map<String, Entity> fEntities = new HashMap<>();

    /** Entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected int fEntityExpansionCount = 0;

    /** count of entities expanded: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fXML11EntityScanner;

    /** XML 1.1 entity scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fXML10EntityScanner;

    /** XML 1.0 entity scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fEntityScanner ;

    /** Current entity scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityHandler fEntityHandler;

    /** Entity handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fStandalone;

    /**
     * True if the document entity is standalone. This should really
     * only be set by the document source (e.g. XMLDocumentScanner).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security Manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected int fBufferSize = DEFAULT_BUFFER_SIZE;

    /**
     * Buffer size. We get this value from a property. The default size
     * is used if the input buffer size property is not specified.
     * REVISIT: do we need a property for internal entity buffer size?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected ValidationManager fValidationManager;

    /**
     * Validation manager. This property identifier is:
     * http://apache.org/xml/properties/internal/validation-manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected String fAccessExternalDTD = EXTERNAL_ACCESS_DEFAULT;

    /** used to restrict external access */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    boolean fSupportDTD = true;

    /** StAX properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected PropertyManager fPropertyManager ;

    /** Property Manager. This is used from Stax */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected StaxEntityResolverWrapper fStaxEntityResolver;

    /** Stax Entity Resolver. This property identifier is XMLInputFactory.ENTITY_RESOLVER */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityResolver fEntityResolver;

    /**
     * Entity resolver. This property identifier is:
     * http://apache.org/xml/properties/internal/entity-resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLErrorReporter fErrorReporter;

    /**
     * Error reporter. This property identifier is:
     * http://apache.org/xml/properties/internal/error-reporter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected SymbolTable fSymbolTable;

    /**
     * Symbol table. This property identifier is:
     * http://apache.org/xml/properties/internal/symbol-table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fLoadExternalDTD = true;

    /** Load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fAllowJavaEncodings = true ;

    /**
     * Allow Java encoding names. This feature identifier is:
     * http://apache.org/xml/features/allow-java-encodings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fExternalParameterEntities;

    /**
     * External parameter entities. This feature identifier is:
     * http://xml.org/sax/features/external-parameter-entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fExternalGeneralEntities;

    /**
     * External general entities. This feature identifier is:
     * http://xml.org/sax/features/external-general-entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fValidation;

    /**
     * Validation. This feature identifier is:
     * http://xml.org/sax/features/validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_ENCODINGS = false;

    /** Debug switching readers for encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_ENTITIES = false;

    /** Debug some basic entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fWarnDuplicateEntityDef;

    /** warn on duplicate Entity declaration.
     *  http://apache.org/xml/features/warn-on-duplicate-entitydef
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_BUFFER = false;

    /**
     * Debug printing of buffer. This debugging flag works best when you
     * resize the DEFAULT_BUFFER_SIZE down to something reasonable like
     * 64 characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    static final String EXTERNAL_ACCESS_DEFAULT = Constants.EXTERNAL_ACCESS_DEFAULT;

    /** access external dtd: file protocol */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String BUFFER_SIZE =

    /** property identifier: buffer size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String STANDARD_URI_CONFORMANT =

    /** Feature identifier: standard uri conformant */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String WARN_ON_DUPLICATE_ENTITYDEF =

    /** Feature identifier: warn on duplicate EntityDef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fStrictURI;

    /**
     * standard uri conformant (strict uri).
     * http://apache.org/xml/features/standard-uri-conformant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 1024;

    /** Default internal entity buffer size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_XMLDECL_BUFFER_SIZE = 64;

    /** Default buffer size before we've finished with the XMLDecl:  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_BUFFER_SIZE = 8192;

    /** Default buffer size (2048). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
public class XMLEntityManager implements XMLComponent, XMLEntityResolver {

/**
 * Will keep track of current entity.
 *
 * The entity manager handles the registration of general and parameter
 * entities; resolves entities; and starts entities. The entity manager
 * is a central component in a standard parser configuration and this
 * class works directly with the entity scanner to manage the underlying
 * xni.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://xml.org/sax/features/external-general-entities</li>
 *  <li>http://xml.org/sax/features/external-parameter-entities</li>
 *  <li>http://apache.org/xml/features/allow-java-encodings</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 *
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author K.Venugopal SUN Microsystems
 * @author Neeraj Bajaj SUN Microsystems
 * @author Sunitha Reddy SUN Microsystems
 * @version $Id: XMLEntityManager.java,v 1.17 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
                if(fCurrentEntity.mayReadChunks || !fCurrentEntity.xmlDeclChunkRead) {

                /**
                 * //System.out.println("fCurrentEntitty = " + fCurrentEntity );
                 * //System.out.println("fInputStream = " + fInputStream );
                 * // better get some more for the voracious reader... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected final class RewindableInputStream extends InputStream {

    /**
    * This class wraps the byte inputstreams we're presented with.
    * We need it because java.io.InputStreams don't provide
    * functionality to reread processed bytes, and they have a habit
    * of reading more than one character when you call their read()
    * methods.  This means that, once we discover the true (declared)
    * encoding of a document, we can neither backtrack to read the
    * whole doc again nor start reading where we are with a new
    * reader.
    *
    * This class allows rewinding an inputStream by allowing a mark
    * to be set, and the stream reset to that position.  <strong>The
    * class assumes that it needs to read one character per
    * invocation when it's read() method is inovked, but uses the
    * underlying InputStream's read(char[], offset length) method--it
    * won't buffer data read this way!</strong>
    *
    * @xerces.internal
    *
    * @author Neil Graham, IBM
    * @author Glenn Marcy, IBM
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public void setExternalBufferSize(int bufferSize) {

        /** Sets the size of external buffers and dumps the old pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public void returnToPool(CharacterBuffer buffer) {

        /** Returns buffer to pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        public CharacterBuffer getBuffer(boolean external) {

        /** Retrieves buffer from pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private void init() {

        /** Initializes buffer pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static class CharacterBufferPool {

     /**
     * Stores a number of character buffers and provides it to the entity
     * manager to use when an entity is seen.
     *
     * @xerces.internal
     *
     * @author Ankit Pasricha, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private boolean isExternal;

        /** whether the buffer is for an external or internal scanned entity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        private char[] ch;

        /** character buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static class CharacterBuffer {

    /**
     * Buffer used in entity manager to reuse character arrays instead
     * of creating new ones every time.
     *
     * @xerces.internal
     *
     * @author Ankit Pasricha, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    final void print() {

    /** Prints the contents of the buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static String fixURI(String str) {

    /**
     * Fixes a platform dependent filename to standard URI form.
     *
     * @param str The string to fix.
     *
     * @return Returns the fixed URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public int getColumnNumber() {

    /**
     * Return the column number where the current document event ends.
     * <p>
     * <strong>Warning:</strong> The return value from the method
     * is intended only as an approximation for the sake of error
     * reporting; it is not intended to provide sufficient information
     * to edit the character content of the original XML document.
     * <p>
     * The return value is an approximation of the column number
     * in the document entity or external parsed entity where the
     * markup triggering the event appears.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.  The first column in each line is column 1.
     *
     * @return The column number, or -1 if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public int getLineNumber() {

    /**
     * Return the line number where the current document event ends.
     * <p>
     * <strong>Warning:</strong> The return value from the method
     * is intended only as an approximation for the sake of error
     * reporting; it is not intended to provide sufficient information
     * to edit the character content of the original XML document.
     * <p>
     * The return value is an approximation of the line number
     * in the document entity or external parsed entity where the
     * markup triggering the event appears.
     * <p>
     * If possible, the SAX driver should provide the line position
     * of the first character after the text associated with the document
     * event.  The first line in the document is line 1.
     *
     * @return The line number, or -1 if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getLiteralSystemId() {

    /**
     * Return the literal system identifier for the current document event.
     * <p>
     * The return value is the literal system identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     * <p>
     * @return A string containing the literal system identifier, or null
     *         if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getExpandedSystemId() {

    /**
     * Return the expanded system identifier for the current document event.
     * <p>
     * The return value is the expanded system identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     * <p>
     * If the system identifier is a URL, the parser must resolve it
     * fully before passing it to the application.
     *
     * @return A string containing the expanded system identifier, or null
     *         if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String getPublicId() {

    /**
     * Return the public identifier for the current document event.
     * <p>
     * The return value is the public identifier of the document
     * entity or of the external parsed entity in which the markup
     * triggering the event appears.
     *
     * @return A string containing the public identifier, or
     *         null if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Reader createReader(InputStream inputStream, String encoding, Boolean isBigEndian)

    /**
     * Creates a reader capable of reading the given input stream in
     * the specified encoding.
     *
     * @param inputStream  The input stream.
     * @param encoding     The encoding name that the input stream is
     *                     encoded using. If the user has specified that
     *                     Java encoding names are allowed, then the
     *                     encoding name may be a Java encoding name;
     *                     otherwise, it is an ianaEncoding name.
     * @param isBigEndian   For encodings (like uCS-4), whose names cannot
     *                      specify a byte order, this tells whether the order is bigEndian.  null menas
     *                      unknown or not relevant.
     *
     * @return Returns a reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Object[] getEncodingName(byte[] b4, int count) {

    /**
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @param count The number of bytes actually read.
     * @return a 2-element array:  the first element, an IANA-encoding string,
     *  the second element a Boolean which is true iff the document is big endian, false
     *  if it's little-endian, and null if the distinction isn't relevant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            throw new URISyntaxException(systemId, "the scheme's length is only one character");

            /**
             * If the scheme's length is only one character,
             * it's likely that this was intended as a file
             * path. Fixing this up in expandSystemId to
             * maintain backwards compatibility.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            throw new URI.MalformedURIException();

            /**
             * If the scheme's length is only one character,
             * it's likely that this was intended as a file
             * path. Fixing this up in expandSystemId to
             * maintain backwards compatibility.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static String expandSystemIdStrictOff(String systemId, String baseSystemId)

    /**
     * Helper method for expandSystemId(String,String,boolean):String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static void setInstanceFollowRedirects(HttpURLConnection urlCon, boolean followRedirects) {

    /**
     * Attempt to set whether redirects will be followed for an <code>HttpURLConnection</code>.
     * This may fail on earlier JDKs which do not support setting this preference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static String expandSystemIdStrictOn(String systemId, String baseSystemId)

    /**
     * Helper method for expandSystemId(String,String,boolean):String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            try {

            /** Xerces URI rejects unicode, try java.net.URI
             * this is not ideal solution, but it covers known cases which either
             * Xerces URI or java.net.URI can handle alone
             * will file bug against java.net.URI
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId, String baseSystemId,
                                        boolean strict)

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId, String baseSystemId) {

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static void absolutizeAgainstUserDir(URI uri)

    /**
     * Absolutizes a URI using the current value
     * of the "user.dir" property as the base URI. If
     * the URI is already absolute, this is a no-op.
     *
     * @param uri the URI to absolutize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static String expandSystemId(String systemId) {

    /**
     * Expands a system id and returns the system id as a URI, if
     * it can be expanded. A return value of null means that the
     * identifier is already expanded. An exception thrown
     * indicates a failure to expand the id.
     *
     * @param systemId The systemId to be expanded.
     *
     * @return Returns the URI string representing the expanded system
     *         identifier. A null value indicates that the given
     *         system identifier is already expanded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setProperty(String propertyId, Object value){

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
        //close the reader

        /** need to close the reader first since the program can end
         *  prematurely (e.g. fEntityHandler.endEntity may throw exception)
         *  leaving the reader open
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void closeReaders() {

    /**
     * Close all opened InputStreams and Readers opened by this parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public Entity.ScannedEntity getTopLevelEntity() {

    /**
     * Return the top level entity handled by this manager, or null
     * if no entity was added.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public Entity.ScannedEntity getCurrentEntity(){

    /**
     * Return the current entity being scanned. Current entity is SET using startEntity function.
     * @return Entity.ScannedEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startEntity(boolean reference, String name,
            XMLInputSource xmlInputSource,
            boolean literal, boolean isExternal)

    /**
     * Starts an entity.
     * <p>
     * This method can be used to insert an application defined XML
     * entity stream into the parsing stream.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param name           The name of the entity.
     * @param xmlInputSource The input source of the entity.
     * @param literal        True if this entity is started within a
     *                       literal value.
     * @param isExternal    whether this entity should be treated as an internal or external entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startDTDEntity(XMLInputSource xmlInputSource)

    /**
     * Starts the DTD entity. The DTD entity has the "[dtd]"
     * pseudo-name.
     *
     * @param xmlInputSource The input source of the DTD entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startDocumentEntity(XMLInputSource xmlInputSource)

    /**
     * Starts the document entity. The document entity has the "[xml]"
     * pseudo-name.
     *
     * @param xmlInputSource The input source of the document entity.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
            xmlInputSource = staxInputSource.getXMLInputSource() ;

            /** xxx:  Waiting from the EG
             * //simply return if there was entity resolver registered and application
             * //returns either XMLStreamReader or XMLEventReader.
             * if(staxInputSource.hasXMLStreamOrXMLEventReader()) return ;
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void startEntity(boolean reference, String entityName, boolean literal)

    /**
     * Starts a named entity.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param entityName The name of the entity to start.
     * @param literal    True if this entity is started within a literal
     *                   value.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier) throws IOException, XNIException {

    /**
     * Resolves the specified public and system identifiers. This
     * method first attempts to resolve the entity based on the
     * EntityResolver registered by the application. If no entity
     * resolver is registered or if the registered entity handler
     * is unable to resolve the entity, then default entity
     * resolution will occur.
     *
     * @param publicId     The public identifier of the entity.
     * @param systemId     The system identifier of the entity.
     * @param baseSystemId The base system identifier of the entity.
     *                     This is the system identifier of the current
     *                     entity and is used to expand the system
     *                     identifier when the system identifier is a
     *                     relative URI.
     *
     * @return Returns an input source that wraps the resolved entity.
     *         This method will never return null.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown by entity resolver to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setEntityHandler(com.sun.org.apache.xerces.internal.impl.XMLEntityHandler entityHandler) {

    /**
     * Sets the entity handler. When an entity starts and ends, the
     * entity handler is notified of the change.
     *
     * @param entityHandler The new entity handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isStandalone() {

    /** Returns true if the document entity is standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void setStandalone(boolean standalone) {

    /**
     * Sets whether the document entity is standalone.
     *
     * @param standalone True if document entity is standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isEntityDeclInExternalSubset(String entityName) {

    /**
     * Checks whether the declaration of an entity given by name is
     * // in the external subset.
     *
     * @param entityName The name of the entity to check.
     * @return True if the entity was declared in the external subset, false otherwise
     *           (including when the entity is not declared).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public boolean isExternalEntity(String entityName) {

    /**
     * Checks whether an entity given by name is external.
     *
     * @param entityName The name of the entity to check.
     * @return True if the entity is external, false otherwise
     * (including when the entity is not declared).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public String setupCurrentEntity(boolean reference, String name, XMLInputSource xmlInputSource,
            boolean literal, boolean isExternal)

    /**
     * This method uses the passed-in XMLInputSource to make
     * fCurrentEntity usable for reading.
     *
     * @param reference flag to indicate whether the entity is an Entity Reference.
     * @param name  name of the entity (XML is it's the document entity)
     * @param xmlInputSource    the input source, with sufficient information
     *      to begin scanning characters.
     * @param literal        True if this entity is started within a
     *                       literal value.
     * @param isExternal    whether this entity should be treated as an internal or external entity.
     * @throws IOException  if anything can't be read
     *  XNIException    If any parser-specific goes wrong.
     * @return the encoding of the new entity or null if a character stream was employed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityScanner getEntityScanner(){

    /** return the entity responsible for reading the entity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityStorage getEntityStore(){

    /** get the entity storage object from entity manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addUnparsedEntity(String name,
            String publicId, String systemId,
            String baseSystemId, String notation) {

    /**
     * Adds an unparsed entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name     The name of the entity.
     * @param publicId The public identifier of the entity.
     * @param systemId The system identifier of the entity.
     * @param notation The name of the notation.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addExternalEntity(String name,
            String publicId, String literalSystemId,
            String baseSystemId) throws IOException {

    /**
     * Adds an external entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name         The name of the entity.
     * @param publicId     The public identifier of the entity.
     * @param literalSystemId     The system identifier of the entity.
     * @param baseSystemId The base system identifier of the entity.
     *                     This is the system identifier of the entity
     *                     where <em>the entity being added</em> and
     *                     is used to expand the system identifier when
     *                     the system identifier is a relative URI.
     *                     When null the system identifier of the first
     *                     external entity on the stack is used instead.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public void addInternalEntity(String name, String text) {

    /**
     * Adds an internal entity declaration.
     * <p>
     * <strong>Note:</strong> This method ignores subsequent entity
     * declarations.
     * <p>
     * <strong>Note:</strong> The name should be a unique symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @param name The name of the entity.
     * @param text The text of the entity.
     *
     * @see SymbolTable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityManager(PropertyManager propertyManager) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public XMLEntityManager() {

    /**
     * If this constructor is used to create the object, reset() should be invoked on this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private CharacterBufferPool fBufferPool = new CharacterBufferPool(fBufferSize, DEFAULT_INTERNAL_BUFFER_SIZE);

    /** Pool of character buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private final Augmentations fEntityAugs = new AugmentationsImpl();

    /** Augmentations for entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private final XMLResourceIdentifierImpl fResourceIdentifier = new XMLResourceIdentifierImpl();

    /** Resource identifer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    boolean fISCreatedByResolver = false;

    /** identify if the InputSource is created by a resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Entity.ScannedEntity fCurrentEntity = null;

    /** Current entity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Stack fEntityStack = new Stack();

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected Map<String, Entity> fEntities = new HashMap<>();

    /** Entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected int fEntityExpansionCount = 0;

    /** count of entities expanded: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fXML11EntityScanner;

    /** XML 1.1 entity scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fXML10EntityScanner;

    /** XML 1.0 entity scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityScanner fEntityScanner ;

    /** Current entity scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityHandler fEntityHandler;

    /** Entity handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fStandalone;

    /**
     * True if the document entity is standalone. This should really
     * only be set by the document source (e.g. XMLDocumentScanner).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security Manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected int fBufferSize = DEFAULT_BUFFER_SIZE;

    /**
     * Buffer size. We get this value from a property. The default size
     * is used if the input buffer size property is not specified.
     * REVISIT: do we need a property for internal entity buffer size?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected ValidationManager fValidationManager;

    /**
     * Validation manager. This property identifier is:
     * http://apache.org/xml/properties/internal/validation-manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected String fAccessExternalDTD = EXTERNAL_ACCESS_DEFAULT;

    /** used to restrict external access */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    boolean fSupportDTD = true;

    /** StAX properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected PropertyManager fPropertyManager ;

    /** Property Manager. This is used from Stax */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected StaxEntityResolverWrapper fStaxEntityResolver;

    /** Stax Entity Resolver. This property identifier is XMLInputFactory.ENTITY_RESOLVER */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLEntityResolver fEntityResolver;

    /**
     * Entity resolver. This property identifier is:
     * http://apache.org/xml/properties/internal/entity-resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected XMLErrorReporter fErrorReporter;

    /**
     * Error reporter. This property identifier is:
     * http://apache.org/xml/properties/internal/error-reporter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected SymbolTable fSymbolTable;

    /**
     * Symbol table. This property identifier is:
     * http://apache.org/xml/properties/internal/symbol-table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fLoadExternalDTD = true;

    /** Load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fAllowJavaEncodings = true ;

    /**
     * Allow Java encoding names. This feature identifier is:
     * http://apache.org/xml/features/allow-java-encodings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fExternalParameterEntities;

    /**
     * External parameter entities. This feature identifier is:
     * http://xml.org/sax/features/external-parameter-entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fExternalGeneralEntities;

    /**
     * External general entities. This feature identifier is:
     * http://xml.org/sax/features/external-general-entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fValidation;

    /**
     * Validation. This feature identifier is:
     * http://xml.org/sax/features/validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_ENCODINGS = false;

    /** Debug switching readers for encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_ENTITIES = false;

    /** Debug some basic entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fWarnDuplicateEntityDef;

    /** warn on duplicate Entity declaration.
     *  http://apache.org/xml/features/warn-on-duplicate-entitydef
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final boolean DEBUG_BUFFER = false;

    /**
     * Debug printing of buffer. This debugging flag works best when you
     * resize the DEFAULT_BUFFER_SIZE down to something reasonable like
     * 64 characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    static final String EXTERNAL_ACCESS_DEFAULT = Constants.EXTERNAL_ACCESS_DEFAULT;

    /** access external dtd: file protocol */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String BUFFER_SIZE =

    /** property identifier: buffer size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String STANDARD_URI_CONFORMANT =

    /** Feature identifier: standard uri conformant */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String WARN_ON_DUPLICATE_ENTITYDEF =

    /** Feature identifier: warn on duplicate EntityDef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected boolean fStrictURI;

    /**
     * standard uri conformant (strict uri).
     * http://apache.org/xml/features/standard-uri-conformant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 1024;

    /** Default internal entity buffer size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_XMLDECL_BUFFER_SIZE = 64;

    /** Default buffer size before we've finished with the XMLDecl:  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
    public static final int DEFAULT_BUFFER_SIZE = 8192;

    /** Default buffer size (2048). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityManager.java
public class XMLEntityManager implements XMLComponent, XMLEntityResolver {

/**
 * Will keep track of current entity.
 *
 * The entity manager handles the registration of general and parameter
 * entities; resolves entities; and starts entities. The entity manager
 * is a central component in a standard parser configuration and this
 * class works directly with the entity scanner to manage the underlying
 * xni.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://xml.org/sax/features/external-general-entities</li>
 *  <li>http://xml.org/sax/features/external-parameter-entities</li>
 *  <li>http://apache.org/xml/features/allow-java-encodings</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 *
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author K.Venugopal SUN Microsystems
 * @author Neeraj Bajaj SUN Microsystems
 * @author Sunitha Reddy SUN Microsystems
 * @version $Id: XMLEntityManager.java,v 1.17 2010-11-01 04:39:41 joehw Exp $
 */
