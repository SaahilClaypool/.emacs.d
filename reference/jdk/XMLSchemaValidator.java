_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private void ensureCapacity(int size) {

        /** Ensures capacity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public boolean contains(short value) {

        /** Returns whether the short is contained in the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void clear() {

        /** Clears the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public short valueAt(int position) {

        /** Returns the short value at the specified position in the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void add(short value) {

        /** Adds the value to the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int length() {

        /** Returns the length of the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private short[] fData;

        /** Data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private int fLength;

        /** Current length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final class ShortVector {

    /**
     * A simple vector for <code>short</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /** Check identity constraints. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreBase getGlobalValueStoreFor(IdentityConstraint id) {

        /** Returns the global value store associated to the specified IdentityConstraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreBase getValueStoreFor(IdentityConstraint id, int initialDepth) {

        /** Returns the value store associated to the specified IdentityConstraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void initValueStoresFor(XSElementDecl eDecl, FieldActivator activator) {

        /**
         * Initializes the value stores for the specified element
         * declaration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endElement() {

        /** endElement():  merges contents of fGlobalIDConstraintMap with the
         * top of fGlobalMapStack into fGlobalIDConstraintMap.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void startDocument() {

        /** Resets the identity constraint cache. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreCache() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected final Map<LocalIDKey, ValueStoreBase>

        /**
         * Values stores associated to specific identity constraints.
         * This map maps IdentityConstraints and
         * the 0-based element on which their selectors first matched to
         * a corresponding ValueStore.  This should take care
         * of all cases, including where ID constraints with
         * descendant-or-self axes occur on recursively-defined
         * elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected final Vector fValueStores = new Vector();

        /** stores all global Values stores. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class ValueStoreCache {

    /**
     * Value store cache. This class is used to store the values for
     * identity constraints.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /** End document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public KeyRefValueStore(KeyRef keyRef, KeyValueStore keyValueStore) {

        /** Constructs a key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected ValueStoreBase fKeyValueStore;

        /** Key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class KeyRefValueStore extends ValueStoreBase {

    /**
     * Key reference value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected void checkDuplicateValues() {

        /**
         * Called when a duplicate value is added.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public KeyValueStore(UniqueOrKey key) {

        /** Constructs a key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class KeyValueStore extends ValueStoreBase {

    /**
     * Key value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected void checkDuplicateValues() {

        /**
         * Called when a duplicate value is added.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public UniqueValueStore(UniqueOrKey unique) {

        /** Constructs a unique value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class UniqueValueStore extends ValueStoreBase {

    /**
     * Unique value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected String toString(Vector values, int start, int length) {

        /** Returns a string of the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected String toString(Object[] values) {

        /** Returns a string of the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
                OUTER: for (int i = 0; i < size1; i += fFieldCount) {

                /** Iterate over each set of fields. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
            else {

            /** Handle n-tuples. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int contains(ValueStoreBase vsb) {

        /**
         * Returns -1 if this value store contains the specified
         * values, otherwise the index of the first field in the
         * key sequence.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public boolean contains() {

        /**
         * Returns true if this value store contains the locally scoped value stores
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void addValue(Field field, Object actualValue, short valueType, ShortList itemValueType) {

        /**
         * Adds the specified value to the value store.
         *
         * @param field The field associated to the value. This reference
         *              is used to ensure that each field only adds a value
         *              once within a selection scope.
         * @param actualValue The value to add.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /**
         * Signals the end of the document. This is where the specific
         * instances of value stores can verify the integrity of the
         * identity constraints.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endValueScope() {

        /** Ends scope for value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void startValueScope() {

        /** Start scope for value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected ValueStoreBase(IdentityConstraint identityConstraint) {

        /** Constructs a value store for the specified identity constraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        final StringBuffer fTempBuffer = new StringBuffer();

        /** buffer for error messages */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public final Vector fValues = new Vector();

        /** global data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected int fValuesCount;

        /** Current data value count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected Object[] fLocalValues = null;

        /** current data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected IdentityConstraint fIdentityConstraint;

        /** Identity constraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected abstract class ValueStoreBase implements ValueStore {

    /**
     * Value store implementation base class. There are specific subclasses
     * for handling unique, key, and keyref.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private void ensureMatcherCapacity() {

        /** Ensures the size of the matchers array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void popContext() {

        /** Pops a context off of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void pushContext() {

        /** Pushes a new context onto the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public XPathMatcher getMatcherAt(int index) {

        /** Returns the XPath matcher at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void addMatcher(XPathMatcher matcher) {

        /** Adds a matcher. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int getMatcherCount() {

        /** Returns the count of XPath matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int size() {

        /** Returns the size of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void clear() {

        /** Resets the XPath matcher stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected IntStack fContextStack = new IntStack();

        /** Offset stack for contexts. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected int fMatchersCount;

        /** Count of active matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected XPathMatcher[] fMatchers = new XPathMatcher[4];

        /** Active matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static class XPathMatcherStack {

    /**
     * Stack of XPath matchers for identity constraints.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // xpath matcher information

    /**********************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        return valueType;

        /** Other types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.POSITIVEINTEGER_DT) {

        /** Types derived from decimal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.ENTITY_DT) {

        /** Types derived from string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.NOTATION_DT) {

        /** Primitive datatypes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean isComparable(ValidatedInfo info1, ValidatedInfo info2) {

    /** Returns true if the two ValidatedInfo objects can be compared in the same value space. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    void processElementContent(QName element) {

    /**
     *  If there is not text content, and there is a
     *  {value constraint} on the corresponding element decl, then return
     *  an XMLString representing the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    Augmentations handleEndElement(QName element, Augmentations augs) {

    /**
     *  Handle end element. If there is not text content, and there is a
     *  {value constraint} on the corresponding element decl, then
     * set the fDefaultValue XMLString representing the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    Augmentations handleStartElement(QName element, XMLAttributes attributes, Augmentations augs) {

    /** Handle element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private void normalizeWhitespace(XMLString value, boolean collapse) {

    /**
     * Normalize whitespace in an XMLString according to the rules defined
     * in XML Schema specifications.
     * @param value    The string to normalize.
     * @param collapse replace or collapse
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    void ensureStackCapacity() {

    /** ensure element stack capacity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public Boolean mayMatch(Field field) {

    /**
     * Returns whether the given field is permitted to match a value.
     *
     * @param field The field that may be permitted to be matched.
     * @return Boolean indicating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setMayMatch(Field field, Boolean state) {

    /**
     * Sets whether the given field is permitted to match a value.
     * This should be used to catch instance documents that try
     * and match a field several times in the same scope.
     *
     * @param field The field that may be permitted to be matched.
     * @param state Boolean indiciating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endValueScopeFor(IdentityConstraint identityConstraint, int initialDepth) {

    /**
     * Ends the value scope for the specified identity constraint.
     *
     * @param identityConstraint The identity constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XPathMatcher activateField(Field field, int initialDepth) {

    /**
     * Request to activate the specified field. This method returns the
     * matcher for the field.
     *
     * @param field The field to activate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startValueScopeFor(IdentityConstraint identityConstraint, int initialDepth) {

    /**
     * Start the value scope for the specified identity constraint. This
     * method is called when the selector matches in order to initialize
     * the value store.
     *
     * @param identityConstraint The identity constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLSchemaValidator() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected ValueStoreCache fValueStoreCache = new ValueStoreCache();

    /** Cache of value stores for identity constraint fields. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XPathMatcherStack fMatcherStack = new XPathMatcherStack();

    /**
     * Stack of active XPath matchers for identity constraints. All
     * active XPath matchers are notified of startElement
     * and endElement callbacks in order to perform their matches.
     * <p>
     * For each element with identity constraints, the selector of
     * each identity constraint is activated. When the selector matches
     * its XPath, then all the fields of the identity constraint are
     * activated.
     * <p>
     * <strong>Note:</strong> Once the activation scope is left, the
     * XPath matchers are automatically removed from the stack of
     * active matchers and no longer receive callbacks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private ValidatedInfo fValidatedInfo = new ValidatedInfo();

    /** temporary validated info */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final QName fTempQName = new QName();

    /** temporary qname */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fStringContent = new boolean[INITIAL_STACK_SIZE];

    /** Stack to record if we saw character data outside of element content*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSawCharacters = false;

    /** Did we see non-whitespace character data? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fSawTextStack = new boolean[INITIAL_STACK_SIZE];

    /** stack to record if we saw character data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSawText = false;

    /** Did we see any character data? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fAppendBuffer = true;

    /** Whether need to append characters to fBuffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final StringBuffer fBuffer = new StringBuffer();

    /** Temporary string buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fStrictAssessStack = new boolean[INITIAL_STACK_SIZE];

    /** strict assess stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fStrictAssess = true;

    /** whether the curret element is strictly assessed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int[][] fCMStateStack = new int[INITIAL_STACK_SIZE][];

    /** stack to hold content model states */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int[] fCurrCMState;

    /** the current state of the current content model */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSCMValidator[] fCMStack = new XSCMValidator[INITIAL_STACK_SIZE];

    /** Content model stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSCMValidator fCurrentCM;

    /** Current content model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSTypeDefinition[] fTypeStack = new XSTypeDefinition[INITIAL_STACK_SIZE];

    /** type stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSTypeDefinition fCurrentType;

    /** Current type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSNotationDecl[] fNotationStack = new XSNotationDecl[INITIAL_STACK_SIZE];

    /** notation stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSNotationDecl fNotation;

    /** notation value of the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fNilStack = new boolean[INITIAL_STACK_SIZE];

    /** nil value stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fNil;

    /** nil value of the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSElementDecl[] fElemDeclStack = new XSElementDecl[INITIAL_STACK_SIZE];

    /** Element decl stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSElementDecl fCurrentElemDecl;

    /** Current element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fSubElementStack = new boolean[INITIAL_STACK_SIZE];

    /** Seen sub elements stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSubElement;

    /** Seen sub elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fElementDepth;

    /** Element depth: -2: validator not in pipeline; >= -1 current depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fNNoneValidationDepth;

    /** anything above this level has validation_attempted != none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fNFullValidationDepth;

    /** anything above this level has validation_attempted != full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fSkipValidationDepth;

    /** Skip validation: anything below this level should be skipped */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: what do we store here? QName, XPATH, some ID? use rawname now.

    /** String representation of the validation root. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: create decl pool, and pass it to each traversers

    /** used to build content models */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: in new simple type design, make things in DVs static,

    /** the DV usd to convert xsi:type to a QName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final XSGrammarBucket fGrammarBucket = new XSGrammarBucket();

    /** Schema grammar resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name   The name of the entity.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException {

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method will never be called for the
     * document entity; it is only called for external general entities
     * referenced in document content.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startGeneralEntity(
        String name,
        XMLResourceIdentifier identifier,
        String encoding,
        Augmentations augs)

    /**
     * This method notifies the start of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the general entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     *
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
    * The start of a CDATA section.
    *
    * @param augs     Additional information that may include infoset augmentations
    *
    * @throws XNIException Thrown by handler to signal an error.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text The ignorable whitespace.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void doctypeDecl(
        String rootElement,
        String publicId,
        String systemId,
        Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void xmlDecl(String version, String encoding, String standalone, Augmentations augs)

    /**
     * Notifies of the presence of an XMLDecl line in the document. If
     * present, this method will be called immediately following the
     * startDocument call.
     *
     * @param version    The XML version.
     * @param encoding   The IANA encoding name of the document, or null if
     *                   not specified.
     * @param standalone The standalone value, or null if not specified.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startDocument(
        XMLLocator locator,
        String encoding,
        NamespaceContext namespaceContext,
        Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The system identifier of the entity if the entity
     *                 is external, null otherwise.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param namespaceContext
     *                 The namespace context in effect at the
     *                 start of this document.
     *                 This object represents the current context.
     *                 Implementors of this class are responsible
     *                 for copying the namespace bindings from the
     *                 the current context (and its parent contexts)
     *                 if that information is important.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLDocumentSource getDocumentSource() {

    /** Returns the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setDocumentSource(XMLDocumentSource source) {

    /** Sets the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /** Sets the document handler to receive information about the document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setProperty(String propertyId, Object value) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setFeature(String featureId, boolean state) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final XSDDescription fXSDDescription = new XSDDescription();

    /** Schema Grammar Description passed,  to give a chance to application to supply the Grammar */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XMLEntityResolver fEntityResolver;

    /** Entity resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final XSIErrorReporter fXSIErrorReporter = new XSIErrorReporter();

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final class XSIErrorReporter {

    /**
     * A wrapper of the standard error reporter. We'll store all schema errors
     * in this wrapper object, so that we can get all errors (error codes) of
     * a specific element. This is useful for PSVI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XMLLocator fLocator;

    /**
     * While parsing a document, keep the location of the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private String fSchemaType = null;

    /** Schema type: None, DTD, Schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final HashMap fMayMatchFieldMap = new HashMap();

    /**
     * Map which is used to catch instance documents that try
     * and match a field several times in the same scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected ElementPSVImpl fCurrentPSVI = new ElementPSVImpl();

    /** current PSVI element info */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final Object[] PROPERTY_DEFAULTS =

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final Boolean[] FEATURE_DEFAULTS = { null,

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String[] RECOGNIZED_FEATURES =

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_NONS_LOCATION =

    /** Property identifier: no namespace schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_LOCATION =

    /** Property identifier: schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: whether to continue parsing a schema after a fatal error is encountered */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: whether to recognize java encoding names */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_AUGMENT_PSVI =

    /** Feature identifier: augment PSVI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
public class XMLSchemaValidator

/**
 * The XML Schema validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Sandy Gao IBM
 * @author Elena Litani IBM
 * @author Andy Clark IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: XMLSchemaValidator.java,v 1.16 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private void ensureCapacity(int size) {

        /** Ensures capacity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public boolean contains(short value) {

        /** Returns whether the short is contained in the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void clear() {

        /** Clears the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public short valueAt(int position) {

        /** Returns the short value at the specified position in the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void add(short value) {

        /** Adds the value to the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int length() {

        /** Returns the length of the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private short[] fData;

        /** Data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private int fLength;

        /** Current length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final class ShortVector {

    /**
     * A simple vector for <code>short</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /** Check identity constraints. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreBase getGlobalValueStoreFor(IdentityConstraint id) {

        /** Returns the global value store associated to the specified IdentityConstraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreBase getValueStoreFor(IdentityConstraint id, int initialDepth) {

        /** Returns the value store associated to the specified IdentityConstraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void initValueStoresFor(XSElementDecl eDecl, FieldActivator activator) {

        /**
         * Initializes the value stores for the specified element
         * declaration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endElement() {

        /** endElement():  merges contents of fGlobalIDConstraintMap with the
         * top of fGlobalMapStack into fGlobalIDConstraintMap.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void startDocument() {

        /** Resets the identity constraint cache. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public ValueStoreCache() {

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected final Map<LocalIDKey, ValueStoreBase>

        /**
         * Values stores associated to specific identity constraints.
         * This map maps IdentityConstraints and
         * the 0-based element on which their selectors first matched to
         * a corresponding ValueStore.  This should take care
         * of all cases, including where ID constraints with
         * descendant-or-self axes occur on recursively-defined
         * elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected final Vector fValueStores = new Vector();

        /** stores all global Values stores. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class ValueStoreCache {

    /**
     * Value store cache. This class is used to store the values for
     * identity constraints.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /** End document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public KeyRefValueStore(KeyRef keyRef, KeyValueStore keyValueStore) {

        /** Constructs a key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected ValueStoreBase fKeyValueStore;

        /** Key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class KeyRefValueStore extends ValueStoreBase {

    /**
     * Key reference value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected void checkDuplicateValues() {

        /**
         * Called when a duplicate value is added.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public KeyValueStore(UniqueOrKey key) {

        /** Constructs a key value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class KeyValueStore extends ValueStoreBase {

    /**
     * Key value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected void checkDuplicateValues() {

        /**
         * Called when a duplicate value is added.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public UniqueValueStore(UniqueOrKey unique) {

        /** Constructs a unique value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected class UniqueValueStore extends ValueStoreBase {

    /**
     * Unique value store.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected String toString(Vector values, int start, int length) {

        /** Returns a string of the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected String toString(Object[] values) {

        /** Returns a string of the specified values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
                OUTER: for (int i = 0; i < size1; i += fFieldCount) {

                /** Iterate over each set of fields. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
            else {

            /** Handle n-tuples. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int contains(ValueStoreBase vsb) {

        /**
         * Returns -1 if this value store contains the specified
         * values, otherwise the index of the first field in the
         * key sequence.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public boolean contains() {

        /**
         * Returns true if this value store contains the locally scoped value stores
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void addValue(Field field, Object actualValue, short valueType, ShortList itemValueType) {

        /**
         * Adds the specified value to the value store.
         *
         * @param field The field associated to the value. This reference
         *              is used to ensure that each field only adds a value
         *              once within a selection scope.
         * @param actualValue The value to add.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endDocument() {

        /**
         * Signals the end of the document. This is where the specific
         * instances of value stores can verify the integrity of the
         * identity constraints.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void endValueScope() {

        /** Ends scope for value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void startValueScope() {

        /** Start scope for value store. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected ValueStoreBase(IdentityConstraint identityConstraint) {

        /** Constructs a value store for the specified identity constraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        final StringBuffer fTempBuffer = new StringBuffer();

        /** buffer for error messages */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public final Vector fValues = new Vector();

        /** global data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected int fValuesCount;

        /** Current data value count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected Object[] fLocalValues = null;

        /** current data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected IdentityConstraint fIdentityConstraint;

        /** Identity constraint. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected abstract class ValueStoreBase implements ValueStore {

    /**
     * Value store implementation base class. There are specific subclasses
     * for handling unique, key, and keyref.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        private void ensureMatcherCapacity() {

        /** Ensures the size of the matchers array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void popContext() {

        /** Pops a context off of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void pushContext() {

        /** Pushes a new context onto the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public XPathMatcher getMatcherAt(int index) {

        /** Returns the XPath matcher at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void addMatcher(XPathMatcher matcher) {

        /** Adds a matcher. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int getMatcherCount() {

        /** Returns the count of XPath matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public int size() {

        /** Returns the size of the stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        public void clear() {

        /** Resets the XPath matcher stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected IntStack fContextStack = new IntStack();

        /** Offset stack for contexts. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected int fMatchersCount;

        /** Count of active matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        protected XPathMatcher[] fMatchers = new XPathMatcher[4];

        /** Active matchers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static class XPathMatcherStack {

    /**
     * Stack of XPath matchers for identity constraints.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // xpath matcher information

    /**********************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        return valueType;

        /** Other types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.POSITIVEINTEGER_DT) {

        /** Types derived from decimal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.ENTITY_DT) {

        /** Types derived from string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
        if (valueType <= XSConstants.NOTATION_DT) {

        /** Primitive datatypes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean isComparable(ValidatedInfo info1, ValidatedInfo info2) {

    /** Returns true if the two ValidatedInfo objects can be compared in the same value space. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    void processElementContent(QName element) {

    /**
     *  If there is not text content, and there is a
     *  {value constraint} on the corresponding element decl, then return
     *  an XMLString representing the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    Augmentations handleEndElement(QName element, Augmentations augs) {

    /**
     *  Handle end element. If there is not text content, and there is a
     *  {value constraint} on the corresponding element decl, then
     * set the fDefaultValue XMLString representing the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    Augmentations handleStartElement(QName element, XMLAttributes attributes, Augmentations augs) {

    /** Handle element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private void normalizeWhitespace(XMLString value, boolean collapse) {

    /**
     * Normalize whitespace in an XMLString according to the rules defined
     * in XML Schema specifications.
     * @param value    The string to normalize.
     * @param collapse replace or collapse
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    void ensureStackCapacity() {

    /** ensure element stack capacity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public Boolean mayMatch(Field field) {

    /**
     * Returns whether the given field is permitted to match a value.
     *
     * @param field The field that may be permitted to be matched.
     * @return Boolean indicating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setMayMatch(Field field, Boolean state) {

    /**
     * Sets whether the given field is permitted to match a value.
     * This should be used to catch instance documents that try
     * and match a field several times in the same scope.
     *
     * @param field The field that may be permitted to be matched.
     * @param state Boolean indiciating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endValueScopeFor(IdentityConstraint identityConstraint, int initialDepth) {

    /**
     * Ends the value scope for the specified identity constraint.
     *
     * @param identityConstraint The identity constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XPathMatcher activateField(Field field, int initialDepth) {

    /**
     * Request to activate the specified field. This method returns the
     * matcher for the field.
     *
     * @param field The field to activate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startValueScopeFor(IdentityConstraint identityConstraint, int initialDepth) {

    /**
     * Start the value scope for the specified identity constraint. This
     * method is called when the selector matches in order to initialize
     * the value store.
     *
     * @param identityConstraint The identity constraint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLSchemaValidator() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected ValueStoreCache fValueStoreCache = new ValueStoreCache();

    /** Cache of value stores for identity constraint fields. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XPathMatcherStack fMatcherStack = new XPathMatcherStack();

    /**
     * Stack of active XPath matchers for identity constraints. All
     * active XPath matchers are notified of startElement
     * and endElement callbacks in order to perform their matches.
     * <p>
     * For each element with identity constraints, the selector of
     * each identity constraint is activated. When the selector matches
     * its XPath, then all the fields of the identity constraint are
     * activated.
     * <p>
     * <strong>Note:</strong> Once the activation scope is left, the
     * XPath matchers are automatically removed from the stack of
     * active matchers and no longer receive callbacks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private ValidatedInfo fValidatedInfo = new ValidatedInfo();

    /** temporary validated info */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final QName fTempQName = new QName();

    /** temporary qname */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fStringContent = new boolean[INITIAL_STACK_SIZE];

    /** Stack to record if we saw character data outside of element content*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSawCharacters = false;

    /** Did we see non-whitespace character data? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fSawTextStack = new boolean[INITIAL_STACK_SIZE];

    /** stack to record if we saw character data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSawText = false;

    /** Did we see any character data? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fAppendBuffer = true;

    /** Whether need to append characters to fBuffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final StringBuffer fBuffer = new StringBuffer();

    /** Temporary string buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fStrictAssessStack = new boolean[INITIAL_STACK_SIZE];

    /** strict assess stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fStrictAssess = true;

    /** whether the curret element is strictly assessed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int[][] fCMStateStack = new int[INITIAL_STACK_SIZE][];

    /** stack to hold content model states */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int[] fCurrCMState;

    /** the current state of the current content model */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSCMValidator[] fCMStack = new XSCMValidator[INITIAL_STACK_SIZE];

    /** Content model stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSCMValidator fCurrentCM;

    /** Current content model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSTypeDefinition[] fTypeStack = new XSTypeDefinition[INITIAL_STACK_SIZE];

    /** type stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSTypeDefinition fCurrentType;

    /** Current type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSNotationDecl[] fNotationStack = new XSNotationDecl[INITIAL_STACK_SIZE];

    /** notation stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSNotationDecl fNotation;

    /** notation value of the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fNilStack = new boolean[INITIAL_STACK_SIZE];

    /** nil value stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fNil;

    /** nil value of the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSElementDecl[] fElemDeclStack = new XSElementDecl[INITIAL_STACK_SIZE];

    /** Element decl stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XSElementDecl fCurrentElemDecl;

    /** Current element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean[] fSubElementStack = new boolean[INITIAL_STACK_SIZE];

    /** Seen sub elements stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private boolean fSubElement;

    /** Seen sub elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fElementDepth;

    /** Element depth: -2: validator not in pipeline; >= -1 current depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fNNoneValidationDepth;

    /** anything above this level has validation_attempted != none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fNFullValidationDepth;

    /** anything above this level has validation_attempted != full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private int fSkipValidationDepth;

    /** Skip validation: anything below this level should be skipped */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: what do we store here? QName, XPATH, some ID? use rawname now.

    /** String representation of the validation root. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: create decl pool, and pass it to each traversers

    /** used to build content models */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    // REVISIT: in new simple type design, make things in DVs static,

    /** the DV usd to convert xsi:type to a QName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private final XSGrammarBucket fGrammarBucket = new XSGrammarBucket();

    /** Schema grammar resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name   The name of the entity.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException {

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method will never be called for the
     * document entity; it is only called for external general entities
     * referenced in document content.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startGeneralEntity(
        String name,
        XMLResourceIdentifier identifier,
        String encoding,
        Augmentations augs)

    /**
     * This method notifies the start of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the general entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     *
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
    * The start of a CDATA section.
    *
    * @param augs     Additional information that may include infoset augmentations
    *
    * @throws XNIException Thrown by handler to signal an error.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text The ignorable whitespace.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void doctypeDecl(
        String rootElement,
        String publicId,
        String systemId,
        Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void xmlDecl(String version, String encoding, String standalone, Augmentations augs)

    /**
     * Notifies of the presence of an XMLDecl line in the document. If
     * present, this method will be called immediately following the
     * startDocument call.
     *
     * @param version    The XML version.
     * @param encoding   The IANA encoding name of the document, or null if
     *                   not specified.
     * @param standalone The standalone value, or null if not specified.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void startDocument(
        XMLLocator locator,
        String encoding,
        NamespaceContext namespaceContext,
        Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The system identifier of the entity if the entity
     *                 is external, null otherwise.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param namespaceContext
     *                 The namespace context in effect at the
     *                 start of this document.
     *                 This object represents the current context.
     *                 Implementors of this class are responsible
     *                 for copying the namespace bindings from the
     *                 the current context (and its parent contexts)
     *                 if that information is important.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLDocumentSource getDocumentSource() {

    /** Returns the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setDocumentSource(XMLDocumentSource source) {

    /** Sets the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /** Sets the document handler to receive information about the document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setProperty(String propertyId, Object value) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public void setFeature(String featureId, boolean state) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final XSDDescription fXSDDescription = new XSDDescription();

    /** Schema Grammar Description passed,  to give a chance to application to supply the Grammar */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected XMLEntityResolver fEntityResolver;

    /** Entity resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final XSIErrorReporter fXSIErrorReporter = new XSIErrorReporter();

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final class XSIErrorReporter {

    /**
     * A wrapper of the standard error reporter. We'll store all schema errors
     * in this wrapper object, so that we can get all errors (error codes) of
     * a specific element. This is useful for PSVI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private XMLLocator fLocator;

    /**
     * While parsing a document, keep the location of the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private String fSchemaType = null;

    /** Schema type: None, DTD, Schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected final HashMap fMayMatchFieldMap = new HashMap();

    /**
     * Map which is used to catch instance documents that try
     * and match a field several times in the same scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected ElementPSVImpl fCurrentPSVI = new ElementPSVImpl();

    /** current PSVI element info */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final Object[] PROPERTY_DEFAULTS =

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String[] RECOGNIZED_PROPERTIES =

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final Boolean[] FEATURE_DEFAULTS = { null,

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String[] RECOGNIZED_FEATURES =

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_NONS_LOCATION =

    /** Property identifier: no namespace schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_LOCATION =

    /** Property identifier: schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: whether to continue parsing a schema after a fatal error is encountered */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: whether to recognize java encoding names */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_AUGMENT_PSVI =

    /** Feature identifier: augment PSVI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String SCHEMA_VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaValidator.java
public class XMLSchemaValidator

/**
 * The XML Schema validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Sandy Gao IBM
 * @author Elena Litani IBM
 * @author Andy Clark IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: XMLSchemaValidator.java,v 1.16 2010-11-01 04:39:55 joehw Exp $
 */
