_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private XMLInputSource createInputSource(String publicId,
            String systemId, String baseSystemId,
            String accept, String acceptLanguage) {

    /**
     * Returns a new <code>XMLInputSource</code> from the given parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private boolean isValidInHTTPHeader (String value) {

    /**
     * Returns <code>true</code> if the given string
     * would be valid in an HTTP header.
     *
     * @param value string to check
     * @return <code>true</code> if the given string
     * would be valid in an HTTP header
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void processXMLLangAttributes(XMLAttributes attributes) {

    /**
     * Search for a xml:lang attribute, and if one is found, put the new
     * [language] into effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void processXMLBaseAttributes(XMLAttributes attributes) {

    /**
     * Search for a xml:base attribute, and if one is found, put the new base URI into
     * effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getRelativeURI(int depth) throws MalformedURIException {

    /**
     * Returns a relative URI, which when resolved against the base URI at the
     * specified depth, will create the current base URI.
     * This is accomplished by merged the literal system IDs.
     * @param depth the depth at which to start creating the relative URI
     * @return a relative URI to convert the base URI at the given depth to the current
     *         base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getLanguage(int depth) {

    /**
     * Gets the language that was in use at that depth.
     * @param depth
     * @return the language
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getBaseURI(int depth) {

    /**
     * Gets the base URI that was in use at that depth
     * @param depth
     * @return the base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String restoreLanguage() {

    /**
     * Discards the language at the top of the stack, and returns the one beneath it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void saveLanguage(String language) {

    /**
     * Saves the given language on the top of the stack.
     *
     * @param lanaguage the language to push onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void restoreBaseURI() {

    /**
     * Discards the URIs at the top of the stack, and restores the ones beneath it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void saveBaseURI() {

    /**
     * Saves the current base URI to the top of the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private boolean getRootElementProcessed() {

    /**
     * Returns whether the root element has been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void setRootElementProcessed(boolean seenRoot) {

    /**
     * Sets whether the root element has been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void checkMultipleRootElements() {

    /**
     * Checks whether the root element has already been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void checkWhitespace(XMLString value) {

    /**
     * Checks whether the string only contains white space characters.
     *
     * @param value the text to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkAndSendNotation(Notation not) {

    /**
     * The purpose of this method is to check if a Notation conflicts with a previously
     * declared notation in the current pipeline stack.  If there is no conflict, the
     * Notation is sent by the root pipeline.
     *
     * @param not the Notation to check for conflicts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkAndSendUnparsedEntity(UnparsedEntity ent) {

    /**
     * The purpose of this method is to check if an UnparsedEntity conflicts with a previously
     * declared entity in the current pipeline stack.  If there is no conflict, the
     * UnparsedEntity is sent by the root pipeline.
     *
     * @param ent the UnparsedEntity to check for conflicts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkNotation(String notName) {

    /**
     * Checks if a Notation with the given name was declared in the DTD of the document
     * for the current pipeline.  If so, that Notation is passed to the root pipeline to
     * be checked for conflicts, and sent to the root DTDHandler
     *
     * @param notName the name of the Notation to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkUnparsedEntity(String entName) {

    /**
     * Checks if an UnparsedEntity with the given name was declared in the DTD of the document
     * for the current pipeline.  If so, then the notation for the UnparsedEntity is checked.
     * If that turns out okay, then the UnparsedEntity is passed to the root pipeline to
     * be checked for conflicts, and sent to the root DTDHandler.
     *
     * @param entName the name of the UnparsedEntity to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void addNotation(
        String name,
        XMLResourceIdentifier identifier,
        Augmentations augmentations) {

    /**
     * Caches a notation.
     * @param name the name of the notation
     * @param identifier the location of the notation
     * @param augmentations any Augmentations that were on the original notation declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void addUnparsedEntity(
        String name,
        XMLResourceIdentifier identifier,
        String notation,
        Augmentations augmentations) {

    /**
     * Caches an unparsed entity.
     * @param name the name of the unparsed entity
     * @param identifier the location of the unparsed entity
     * @param augmentations any Augmentations that were on the original unparsed entity declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setParent(XIncludeHandler parent) {

    /**
     * Set the parent of this XIncludeHandler in the tree
     * @param parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean getSawInclude(int depth) {

    /**
     * Return whether an &lt;include&gt; was encountered at the specified depth,
     * as an ancestor of the current item.
     *
     * @param depth
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setSawInclude(int depth, boolean val) {

    /**
     * Records that an &lt;include&gt; was encountered at the specified depth,
     * as an ancestor of the current item.
     *
     * @param depth
     * @param val
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean getSawFallback(int depth) {

    /**
     * Returns whether an &lt;fallback&gt; was encountered at the specified depth,
     * as an ancestor of the current element, or as a sibling of an ancestor of the
     * current element.
     *
     * @param depth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setSawFallback(int depth, boolean val) {

    /**
     * Records that an &lt;fallback&gt; was encountered at the specified depth,
     * as an ancestor of the current element, or as a sibling of an ancestor of the
     * current element.
     *
     * @param depth
     * @param val
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected Augmentations modifyAugmentations(
        Augmentations augs,
        boolean force) {

    /**
     * Modify the augmentations.  Add an [included] infoset item, if <code>force</code>
     * is true, or if the current element is a top level included item.
     * @param augs the Augmentations to modify.
     * @param force whether to force modification
     * @return the modified Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected Augmentations modifyAugmentations(Augmentations augs) {

    /**
     * Modify the augmentations.  Add an [included] infoset item, if the current
     * element is a top level included item.
     * @param augs the Augmentations to modify.
     * @return the modified Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private int getResultDepth() {

    /**
     * Returns the current element depth of the result infoset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private int getIncludeParentDepth() {

    /**
     * Returns the depth of the include parent.  Here, the include parent is
     * calculated as the last non-include or non-fallback element. It is assumed
     * this method is called when the current element is a top level included item.
     * Returning 0 indicates that the top level element in this document
     * was an include element.
     * @return the depth of the top level include element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private String getIncludeParentLanguage() {

    /**
     * Returns the [language] of the include parent.
     *
     * @return the language property of the include parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private String getIncludeParentBaseURI() {

    /**
     * Returns the [base URI] of the include parent.
     * @return the base URI of the include parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String literalPath = uri.getPath();

                /**
                 * The scheme and authority components are equal,
                 * return the path and the possible query and/or
                 * fragment which follow.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String baseAuthority = base.getAuthority();

                /** Check whether the authority components are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String baseScheme = base.getScheme();

                /** Check whether the scheme components are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected String getRelativeBaseURI() throws MalformedURIException {

    /**
     * Returns a URI, relative to the include parent's base URI, of the current
     * [base URI].  For instance, if the current [base URI] was "dir1/dir2/file.xml"
     * and the include parent's [base URI] was "dir/", this would return "dir2/file.xml".
     * @return the relative URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected XMLAttributes processAttributes(XMLAttributes attributes) {

    /**
     * Processes the XMLAttributes object of startElement() calls.  Performs the following tasks:
     * <ul>
     * <li> If the element is a top level included item whose [base URI] is different from the
     * [base URI] of the include parent, then an xml:base attribute is added to specify the
     * true [base URI]
     * <li> For all namespace prefixes which are in-scope in an included item, but not in scope
     * in the include parent, a xmlns:prefix attribute is added
     * <li> For all attributes with a type of ENTITY, ENTITIES or NOTATIONS, the notations and
     * unparsed entities are processed as described in the spec, sections 4.5.1 and 4.5.2
     * </ul>
     * @param attributes
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isTopLevelIncludedItem() {

    /**
     * Returns true if the current element is a top level included item.  This means
     * it's either the child of a fallback element, or the top level item in an
     * included document
     * @return true if the current element is a top level included item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean searchForRecursiveIncludes(XMLLocator includedSource) {

    /**
     * Checks if the file indicated by the given XMLLocator has already been included
     * in the current stack.
     * @param includedSource the source to check for inclusion
     * @return true if the source has already been included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean sameLanguageAsIncludeParent() {

    /**
     * Returns true if the current [language] is equivalent to the [language] that
     * was in effect on the include parent, taking case-insensitivity into account
     * as per [RFC 3066].  This method should <em>only</em> be called when the
     * current element is a top level included element, i.e. the direct child
     * of a fallback element, or the root elements in an included document.
     * The "include parent" is the element which, in the result infoset, will be the
     * direct parent of the current element.
     *
     * @return true if the [language] properties have the same value
     * taking case-insensitivity into account as per [RFC 3066].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean sameBaseURIAsIncludeParent() {

    /**
     * Returns true if the current [base URI] is the same as the [base URI] that
     * was in effect on the include parent.  This method should <em>only</em> be called
     * when the current element is a top level included element, i.e. the direct child
     * of a fallback element, or the root elements in an included document.
     * The "include parent" is the element which, in the result infoset, will be the
     * direct parent of the current element.
     * @return true if the [base URIs] are the same string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isFallbackElement(QName element) {

    /**
     * Checks if the element is an &lt;fallback&gt; element.  The element must have
     * the XInclude namespace, and a local name of "fallback".
     *
     * @param element the element to check
     * @return true if the element is an &lt;fallback; element
     * @see #hasXIncludeNamespace(QName)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isIncludeElement(QName element) {

    /**
     * Checks if the element is an &lt;include&gt; element.  The element must have
     * the XInclude namespace, and a local name of "include".
     *
     * @param element the element to check
     * @return true if the element is an &lt;include&gt; element
     * @see #hasXIncludeNamespace(QName)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean hasXIncludeNamespace(QName element) {

    /**
     * Returns true if the element has the namespace "http://www.w3.org/2001/XInclude"
     * @param element the element to check
     * @return true if the element has the namespace "http://www.w3.org/2001/XInclude"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Event sent at the start of the document.
     *
     * A fatal error will occur here, if it is detected that this document has been processed
     * before.
     *
     * This event is only passed on to the document handler if this is the root document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final Object[] PROPERTY_DEFAULTS = { null, null, null, new Integer(XMLEntityManager.DEFAULT_BUFFER_SIZE) };

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final Boolean[] FEATURE_DEFAULTS = { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE };

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final String[] RECOGNIZED_FEATURES =

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XML_SECURITY_PROPERTY_MANAGER =

    /** property identifier: XML security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public static final String BUFFER_SIZE =

    /** property identifier: buffer size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public final static String CURRENT_BASE_URI = "currentBaseURI";

    /** The identifier for the Augmentation that contains the current base URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
public class XIncludeHandler

/**
 * <p>
 * This is a pipeline component which performs XInclude handling, according to the
 * W3C specification for XML Inclusions.
 * </p>
 * <p>
 * This component analyzes each event in the pipeline, looking for &lt;include&gt;
 * elements. An &lt;include&gt; element is one which has a namespace of
 * <code>http://www.w3.org/2001/XInclude</code> and a localname of <code>include</code>.
 * When it finds an &lt;include&gt; element, it attempts to include the file specified
 * in the <code>href</code> attribute of the element.  If inclusion succeeds, all
 * children of the &lt;include&gt; element are ignored (with the exception of
 * checking for invalid children as outlined in the specification).  If the inclusion
 * fails, the &lt;fallback&gt; child of the &lt;include&gt; element is processed.
 * </p>
 * <p>
 * See the <a href="http://www.w3.org/TR/xinclude/">XInclude specification</a> for
 * more information on how XInclude is to be used.
 * </p>
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/allow-dtd-events-after-endDTD</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 * Optional property:
 * <ul>
 *  <li>http://apache.org/xml/properties/input-buffer-size</li>
 * </ul>
 *
 * Furthermore, the <code>NamespaceContext</code> used in the pipeline is required
 * to be an instance of <code>XIncludeNamespaceSupport</code>.
 * </p>
 * <p>
 * Currently, this implementation has only partial support for the XInclude specification.
 * Specifically, it is missing support for XPointer document fragments.  Thus, only whole
 * documents can be included using this component in the pipeline.
 * </p>
 *
 * @author Peter McCracken, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XIncludeHandler.java,v 1.7 2010-11-01 04:40:18 joehw Exp $
 *
 * @see XIncludeNamespaceSupport
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private XMLInputSource createInputSource(String publicId,
            String systemId, String baseSystemId,
            String accept, String acceptLanguage) {

    /**
     * Returns a new <code>XMLInputSource</code> from the given parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private boolean isValidInHTTPHeader (String value) {

    /**
     * Returns <code>true</code> if the given string
     * would be valid in an HTTP header.
     *
     * @param value string to check
     * @return <code>true</code> if the given string
     * would be valid in an HTTP header
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void processXMLLangAttributes(XMLAttributes attributes) {

    /**
     * Search for a xml:lang attribute, and if one is found, put the new
     * [language] into effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void processXMLBaseAttributes(XMLAttributes attributes) {

    /**
     * Search for a xml:base attribute, and if one is found, put the new base URI into
     * effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getRelativeURI(int depth) throws MalformedURIException {

    /**
     * Returns a relative URI, which when resolved against the base URI at the
     * specified depth, will create the current base URI.
     * This is accomplished by merged the literal system IDs.
     * @param depth the depth at which to start creating the relative URI
     * @return a relative URI to convert the base URI at the given depth to the current
     *         base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getLanguage(int depth) {

    /**
     * Gets the language that was in use at that depth.
     * @param depth
     * @return the language
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String getBaseURI(int depth) {

    /**
     * Gets the base URI that was in use at that depth
     * @param depth
     * @return the base URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public String restoreLanguage() {

    /**
     * Discards the language at the top of the stack, and returns the one beneath it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void saveLanguage(String language) {

    /**
     * Saves the given language on the top of the stack.
     *
     * @param lanaguage the language to push onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void restoreBaseURI() {

    /**
     * Discards the URIs at the top of the stack, and restores the ones beneath it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void saveBaseURI() {

    /**
     * Saves the current base URI to the top of the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private boolean getRootElementProcessed() {

    /**
     * Returns whether the root element has been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void setRootElementProcessed(boolean seenRoot) {

    /**
     * Sets whether the root element has been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void checkMultipleRootElements() {

    /**
     * Checks whether the root element has already been processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private void checkWhitespace(XMLString value) {

    /**
     * Checks whether the string only contains white space characters.
     *
     * @param value the text to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkAndSendNotation(Notation not) {

    /**
     * The purpose of this method is to check if a Notation conflicts with a previously
     * declared notation in the current pipeline stack.  If there is no conflict, the
     * Notation is sent by the root pipeline.
     *
     * @param not the Notation to check for conflicts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkAndSendUnparsedEntity(UnparsedEntity ent) {

    /**
     * The purpose of this method is to check if an UnparsedEntity conflicts with a previously
     * declared entity in the current pipeline stack.  If there is no conflict, the
     * UnparsedEntity is sent by the root pipeline.
     *
     * @param ent the UnparsedEntity to check for conflicts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkNotation(String notName) {

    /**
     * Checks if a Notation with the given name was declared in the DTD of the document
     * for the current pipeline.  If so, that Notation is passed to the root pipeline to
     * be checked for conflicts, and sent to the root DTDHandler
     *
     * @param notName the name of the Notation to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void checkUnparsedEntity(String entName) {

    /**
     * Checks if an UnparsedEntity with the given name was declared in the DTD of the document
     * for the current pipeline.  If so, then the notation for the UnparsedEntity is checked.
     * If that turns out okay, then the UnparsedEntity is passed to the root pipeline to
     * be checked for conflicts, and sent to the root DTDHandler.
     *
     * @param entName the name of the UnparsedEntity to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void addNotation(
        String name,
        XMLResourceIdentifier identifier,
        Augmentations augmentations) {

    /**
     * Caches a notation.
     * @param name the name of the notation
     * @param identifier the location of the notation
     * @param augmentations any Augmentations that were on the original notation declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void addUnparsedEntity(
        String name,
        XMLResourceIdentifier identifier,
        String notation,
        Augmentations augmentations) {

    /**
     * Caches an unparsed entity.
     * @param name the name of the unparsed entity
     * @param identifier the location of the unparsed entity
     * @param augmentations any Augmentations that were on the original unparsed entity declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setParent(XIncludeHandler parent) {

    /**
     * Set the parent of this XIncludeHandler in the tree
     * @param parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean getSawInclude(int depth) {

    /**
     * Return whether an &lt;include&gt; was encountered at the specified depth,
     * as an ancestor of the current item.
     *
     * @param depth
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setSawInclude(int depth, boolean val) {

    /**
     * Records that an &lt;include&gt; was encountered at the specified depth,
     * as an ancestor of the current item.
     *
     * @param depth
     * @param val
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean getSawFallback(int depth) {

    /**
     * Returns whether an &lt;fallback&gt; was encountered at the specified depth,
     * as an ancestor of the current element, or as a sibling of an ancestor of the
     * current element.
     *
     * @param depth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected void setSawFallback(int depth, boolean val) {

    /**
     * Records that an &lt;fallback&gt; was encountered at the specified depth,
     * as an ancestor of the current element, or as a sibling of an ancestor of the
     * current element.
     *
     * @param depth
     * @param val
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected Augmentations modifyAugmentations(
        Augmentations augs,
        boolean force) {

    /**
     * Modify the augmentations.  Add an [included] infoset item, if <code>force</code>
     * is true, or if the current element is a top level included item.
     * @param augs the Augmentations to modify.
     * @param force whether to force modification
     * @return the modified Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected Augmentations modifyAugmentations(Augmentations augs) {

    /**
     * Modify the augmentations.  Add an [included] infoset item, if the current
     * element is a top level included item.
     * @param augs the Augmentations to modify.
     * @return the modified Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private int getResultDepth() {

    /**
     * Returns the current element depth of the result infoset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private int getIncludeParentDepth() {

    /**
     * Returns the depth of the include parent.  Here, the include parent is
     * calculated as the last non-include or non-fallback element. It is assumed
     * this method is called when the current element is a top level included item.
     * Returning 0 indicates that the top level element in this document
     * was an include element.
     * @return the depth of the top level include element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private String getIncludeParentLanguage() {

    /**
     * Returns the [language] of the include parent.
     *
     * @return the language property of the include parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private String getIncludeParentBaseURI() {

    /**
     * Returns the [base URI] of the include parent.
     * @return the base URI of the include parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String literalPath = uri.getPath();

                /**
                 * The scheme and authority components are equal,
                 * return the path and the possible query and/or
                 * fragment which follow.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String baseAuthority = base.getAuthority();

                /** Check whether the authority components are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
                final String baseScheme = base.getScheme();

                /** Check whether the scheme components are equal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected String getRelativeBaseURI() throws MalformedURIException {

    /**
     * Returns a URI, relative to the include parent's base URI, of the current
     * [base URI].  For instance, if the current [base URI] was "dir1/dir2/file.xml"
     * and the include parent's [base URI] was "dir/", this would return "dir2/file.xml".
     * @return the relative URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected XMLAttributes processAttributes(XMLAttributes attributes) {

    /**
     * Processes the XMLAttributes object of startElement() calls.  Performs the following tasks:
     * <ul>
     * <li> If the element is a top level included item whose [base URI] is different from the
     * [base URI] of the include parent, then an xml:base attribute is added to specify the
     * true [base URI]
     * <li> For all namespace prefixes which are in-scope in an included item, but not in scope
     * in the include parent, a xmlns:prefix attribute is added
     * <li> For all attributes with a type of ENTITY, ENTITIES or NOTATIONS, the notations and
     * unparsed entities are processed as described in the spec, sections 4.5.1 and 4.5.2
     * </ul>
     * @param attributes
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isTopLevelIncludedItem() {

    /**
     * Returns true if the current element is a top level included item.  This means
     * it's either the child of a fallback element, or the top level item in an
     * included document
     * @return true if the current element is a top level included item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean searchForRecursiveIncludes(XMLLocator includedSource) {

    /**
     * Checks if the file indicated by the given XMLLocator has already been included
     * in the current stack.
     * @param includedSource the source to check for inclusion
     * @return true if the source has already been included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean sameLanguageAsIncludeParent() {

    /**
     * Returns true if the current [language] is equivalent to the [language] that
     * was in effect on the include parent, taking case-insensitivity into account
     * as per [RFC 3066].  This method should <em>only</em> be called when the
     * current element is a top level included element, i.e. the direct child
     * of a fallback element, or the root elements in an included document.
     * The "include parent" is the element which, in the result infoset, will be the
     * direct parent of the current element.
     *
     * @return true if the [language] properties have the same value
     * taking case-insensitivity into account as per [RFC 3066].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean sameBaseURIAsIncludeParent() {

    /**
     * Returns true if the current [base URI] is the same as the [base URI] that
     * was in effect on the include parent.  This method should <em>only</em> be called
     * when the current element is a top level included element, i.e. the direct child
     * of a fallback element, or the root elements in an included document.
     * The "include parent" is the element which, in the result infoset, will be the
     * direct parent of the current element.
     * @return true if the [base URIs] are the same string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isFallbackElement(QName element) {

    /**
     * Checks if the element is an &lt;fallback&gt; element.  The element must have
     * the XInclude namespace, and a local name of "fallback".
     *
     * @param element the element to check
     * @return true if the element is an &lt;fallback; element
     * @see #hasXIncludeNamespace(QName)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean isIncludeElement(QName element) {

    /**
     * Checks if the element is an &lt;include&gt; element.  The element must have
     * the XInclude namespace, and a local name of "include".
     *
     * @param element the element to check
     * @return true if the element is an &lt;include&gt; element
     * @see #hasXIncludeNamespace(QName)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected boolean hasXIncludeNamespace(QName element) {

    /**
     * Returns true if the element has the namespace "http://www.w3.org/2001/XInclude"
     * @param element the element to check
     * @return true if the element has the namespace "http://www.w3.org/2001/XInclude"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Event sent at the start of the document.
     *
     * A fatal error will occur here, if it is detected that this document has been processed
     * before.
     *
     * This event is only passed on to the document handler if this is the root document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    @Override

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final Object[] PROPERTY_DEFAULTS = { null, null, null, new Integer(XMLEntityManager.DEFAULT_BUFFER_SIZE) };

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final Boolean[] FEATURE_DEFAULTS = { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE };

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    private static final String[] RECOGNIZED_FEATURES =

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XML_SECURITY_PROPERTY_MANAGER =

    /** property identifier: XML security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public static final String BUFFER_SIZE =

    /** property identifier: buffer size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
    public final static String CURRENT_BASE_URI = "currentBaseURI";

    /** The identifier for the Augmentation that contains the current base URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeHandler.java
public class XIncludeHandler

/**
 * <p>
 * This is a pipeline component which performs XInclude handling, according to the
 * W3C specification for XML Inclusions.
 * </p>
 * <p>
 * This component analyzes each event in the pipeline, looking for &lt;include&gt;
 * elements. An &lt;include&gt; element is one which has a namespace of
 * <code>http://www.w3.org/2001/XInclude</code> and a localname of <code>include</code>.
 * When it finds an &lt;include&gt; element, it attempts to include the file specified
 * in the <code>href</code> attribute of the element.  If inclusion succeeds, all
 * children of the &lt;include&gt; element are ignored (with the exception of
 * checking for invalid children as outlined in the specification).  If the inclusion
 * fails, the &lt;fallback&gt; child of the &lt;include&gt; element is processed.
 * </p>
 * <p>
 * See the <a href="http://www.w3.org/TR/xinclude/">XInclude specification</a> for
 * more information on how XInclude is to be used.
 * </p>
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/allow-dtd-events-after-endDTD</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 * Optional property:
 * <ul>
 *  <li>http://apache.org/xml/properties/input-buffer-size</li>
 * </ul>
 *
 * Furthermore, the <code>NamespaceContext</code> used in the pipeline is required
 * to be an instance of <code>XIncludeNamespaceSupport</code>.
 * </p>
 * <p>
 * Currently, this implementation has only partial support for the XInclude specification.
 * Specifically, it is missing support for XPointer document fragments.  Thus, only whole
 * documents can be included using this component in the pipeline.
 * </p>
 *
 * @author Peter McCracken, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XIncludeHandler.java,v 1.7 2010-11-01 04:40:18 joehw Exp $
 *
 * @see XIncludeNamespaceSupport
 */
