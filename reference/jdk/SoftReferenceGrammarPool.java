_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    static final class SoftGrammarReference extends SoftReference {

    /**
     * This class stores a soft reference to a grammar object. It keeps a reference
     * to its associated entry, so that it can be easily removed from the pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    static final class Entry {

    /**
     * This class is a grammar pool entry. Each entry acts as a node
     * in a doubly linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    private void clean() {

    /**
     * Removes stale entries from the pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    private Grammar removeEntry(Entry entry) {

    /**
     * Removes the given entry from the pool
     *
     * @param entry the entry to remove
     * @return The grammar attached to this entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public int hashCode(XMLGrammarDescription desc) {

    /**
     * Returns the hash code value for the given grammar description.
     *
     * @param desc The grammar description
     * @return     The hash code value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public boolean equals(XMLGrammarDescription desc1, XMLGrammarDescription desc2) {

    /**
     * This method checks whether two grammars are the same. Currently, we compare
     * the root element names for DTD grammars and the target namespaces for Schema grammars.
     * The application can override this behaviour and add its own logic.
     *
     * @param desc1 The grammar description
     * @param desc2 The grammar description of the grammar to be compared to
     * @return      True if the grammars are equal, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
                if (tempGrammar == null) {

                /** If the soft reference has been cleared, remove this entry from the pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public boolean containsGrammar(XMLGrammarDescription desc) {

    /**
     * Returns true if the grammar pool contains a grammar associated
     * to the specified grammar description. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public Grammar removeGrammar(XMLGrammarDescription desc) {

    /**
     * Removes the grammar associated to the specified grammar description from the
     * grammar pool and returns the removed grammar. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     * @return     The removed grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
                if (tempGrammar == null) {

                /** If the soft reference has been cleared, remove this entry from the pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public Grammar getGrammar(XMLGrammarDescription desc) {

    /**
     * Returns the grammar associated to the specified grammar description.
     * Currently, the root element name is used as the key for DTD grammars
     * and the target namespace  is used as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public void putGrammar(Grammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associates it to
     * its root element name or its target namespace.
     *
     * @param grammar The Grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public SoftReferenceGrammarPool(int initialCapacity) {

    /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public SoftReferenceGrammarPool() {

    /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected final ReferenceQueue fReferenceQueue = new ReferenceQueue();

    /** Reference queue for cleared grammar references */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected int fGrammarCount = 0;

    /** The number of grammars in the pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected boolean fPoolIsLocked;

    /** Flag indicating whether this pool is locked */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected Entry [] fGrammars = null;

    /** Grammars. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected static final Grammar [] ZERO_LENGTH_GRAMMAR_ARRAY = new Grammar [0];

    /** Zero length grammar array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected static final int TABLE_SIZE = 11;

    /** Default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
final class SoftReferenceGrammarPool implements XMLGrammarPool {

/**
 * <p>This grammar pool is a memory sensitive cache. The grammars
 * stored in the pool are softly reachable and may be cleared by
 * the garbage collector in response to memory demand. Equality
 * of <code>XMLSchemaDescription</code>s is determined using both
 * the target namespace for the schema and schema location.</p>
 *
 * @author Michael Glavassevich, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    static final class SoftGrammarReference extends SoftReference {

    /**
     * This class stores a soft reference to a grammar object. It keeps a reference
     * to its associated entry, so that it can be easily removed from the pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    static final class Entry {

    /**
     * This class is a grammar pool entry. Each entry acts as a node
     * in a doubly linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    private void clean() {

    /**
     * Removes stale entries from the pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    private Grammar removeEntry(Entry entry) {

    /**
     * Removes the given entry from the pool
     *
     * @param entry the entry to remove
     * @return The grammar attached to this entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public int hashCode(XMLGrammarDescription desc) {

    /**
     * Returns the hash code value for the given grammar description.
     *
     * @param desc The grammar description
     * @return     The hash code value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public boolean equals(XMLGrammarDescription desc1, XMLGrammarDescription desc2) {

    /**
     * This method checks whether two grammars are the same. Currently, we compare
     * the root element names for DTD grammars and the target namespaces for Schema grammars.
     * The application can override this behaviour and add its own logic.
     *
     * @param desc1 The grammar description
     * @param desc2 The grammar description of the grammar to be compared to
     * @return      True if the grammars are equal, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
                if (tempGrammar == null) {

                /** If the soft reference has been cleared, remove this entry from the pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public boolean containsGrammar(XMLGrammarDescription desc) {

    /**
     * Returns true if the grammar pool contains a grammar associated
     * to the specified grammar description. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public Grammar removeGrammar(XMLGrammarDescription desc) {

    /**
     * Removes the grammar associated to the specified grammar description from the
     * grammar pool and returns the removed grammar. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     * @return     The removed grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
                if (tempGrammar == null) {

                /** If the soft reference has been cleared, remove this entry from the pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public Grammar getGrammar(XMLGrammarDescription desc) {

    /**
     * Returns the grammar associated to the specified grammar description.
     * Currently, the root element name is used as the key for DTD grammars
     * and the target namespace  is used as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public void putGrammar(Grammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associates it to
     * its root element name or its target namespace.
     *
     * @param grammar The Grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public SoftReferenceGrammarPool(int initialCapacity) {

    /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    public SoftReferenceGrammarPool() {

    /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected final ReferenceQueue fReferenceQueue = new ReferenceQueue();

    /** Reference queue for cleared grammar references */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected int fGrammarCount = 0;

    /** The number of grammars in the pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected boolean fPoolIsLocked;

    /** Flag indicating whether this pool is locked */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected Entry [] fGrammars = null;

    /** Grammars. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected static final Grammar [] ZERO_LENGTH_GRAMMAR_ARRAY = new Grammar [0];

    /** Zero length grammar array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
    protected static final int TABLE_SIZE = 11;

    /** Default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/SoftReferenceGrammarPool.java
final class SoftReferenceGrammarPool implements XMLGrammarPool {

/**
 * <p>This grammar pool is a memory sensitive cache. The grammars
 * stored in the pool are softly reachable and may be cleared by
 * the garbage collector in response to memory demand. Equality
 * of <code>XMLSchemaDescription</code>s is determined using both
 * the target namespace for the schema and schema location.</p>
 *
 * @author Michael Glavassevich, IBM
 */
