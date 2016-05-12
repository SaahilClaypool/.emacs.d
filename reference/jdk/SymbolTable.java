_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void popExcludedNamespacesContext() {

    /**
     * Exclusion of namespaces by a stylesheet does not extend to any stylesheet
     * imported or included by the stylesheet.  Upon exiting the context of a
     * stylesheet, a call to this method is needed to restore the set of
     * excluded namespaces that was in effect prior to entering the context of
     * the current stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void pushExcludedNamespacesContext() {

    /**
     * Exclusion of namespaces by a stylesheet does not extend to any stylesheet
     * imported or included by the stylesheet.  Upon entering the context of a
     * new stylesheet, a call to this method is needed to clear the current set
     * of excluded namespaces temporarily.  Every call to this method requires
     * a corresponding call to {@link #popExcludedNamespacesContext()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void unExcludeNamespaces(String prefixes) {

    /**
     * Turn of namespace declaration exclusion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public boolean isExcludedNamespace(String uri) {

    /**
     * Check if a namespace should not be declared in the output (unless used)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void excludeNamespaces(String prefixes) {

    /**
     * Exclude a series of namespaces given by a list of whitespace
     * separated namespace prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void excludeURI(String uri) {

    /**
     * Register a namespace URI so that it will not be declared in the output
     * unless it is actually referenced in the output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public String lookupPrefixAlias(String prefix) {

    /**
     * Retrieves any alias for a given namespace prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void addPrefixAlias(String prefix, String alias) {

    /**
     * Adds an alias for a namespace prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    private SyntaxTreeNode _current = null;

    /**
     * Use a namespace prefix to lookup a namespace URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    private int _nsCounter = 0;

    /**
     * This is used for xsl:attribute elements that have a "namespace"
     * attribute that is currently not defined using xmlns:
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public Vector lookupPrimop(String name) {

    /**
     * Lookup a primitive operator or function in the symbol table by
     * prepending the prefix <tt>PrimopPrefix</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void addPrimop(String name, MethodType mtype) {

    /**
     * Add a primitive operator or function to the symbol table. To avoid
     * name clashes with user-defined names, the prefix <tt>PrimopPrefix</tt>
     * is prepended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
final class SymbolTable {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry(char[] ch, int offset, int length, Entry next) {

        /**
         * Constructs a new entry from the specified symbol information and
         * next entry reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry(String symbol, Entry next) {

        /**
         * Constructs a new entry from the specified symbol and next entry
         * reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry next;

        /** The next entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public final char[] characters;

        /**
         * Symbol characters. This information is duplicated here for
         * comparison performance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public final String symbol;

        /** Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final class Entry {

    /**
     * This class is a symbol table entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public boolean containsSymbol(char[] buffer, int offset, int length) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param buffer The buffer containing the symbol to look for.
     * @param offset The offset into the buffer.
     * @param length The length of the symbol in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public boolean containsSymbol(String symbol) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param symbol The symbol to look for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected void rebalance() {

    /**
     * Randomly selects a new hash function and reorganizes this SymbolTable
     * in order to more evenly distribute its entries across the table. This
     * method is called automatically when the number keys in one of the
     * SymbolTable's buckets exceeds the given collision threshold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected void rehash() {

    /**
     * Increases the capacity of and internally reorganizes this
     * SymbolTable, in order to accommodate and access its entries more
     * efficiently.  This method is called automatically when the
     * number of keys in the SymbolTable exceeds this hashtable's capacity
     * and load factor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public int hash(char[] buffer, int offset, int length) {

    /**
     * Returns a hashcode value for the specified symbol information.
     * The value returned by this method must be identical to the value
     * returned by the <code>hash(String)</code> method when called
     * with the string object created from the symbol information.
     *
     * @param buffer The character buffer containing the symbol.
     * @param offset The offset into the character buffer of the start
     *               of the symbol.
     * @param length The length of the symbol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public int hash(String symbol) {

    /**
     * Returns a hashcode value for the specified symbol. The value
     * returned by this method must be identical to the value returned
     * by the <code>hash(char[],int,int)</code> method when called
     * with the character array that comprises the symbol string.
     *
     * @param symbol The symbol to hash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public String addSymbol(char[] buffer, int offset, int length) {

    /**
     * Adds the specified symbol to the symbol table and returns a
     * reference to the unique symbol. If the symbol already exists,
     * the previous symbol reference is returned instead, in order
     * guarantee that symbol references remain unique.
     *
     * @param buffer The buffer containing the new symbol.
     * @param offset The offset into the buffer of the new symbol.
     * @param length The length of the new symbol in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public String addSymbol(String symbol) {

    /**
     * Adds the specified symbol to the symbol table and returns a
     * reference to the unique symbol. If the symbol already exists,
     * the previous symbol reference is returned instead, in order
     * guarantee that symbol references remain unique.
     *
     * @param symbol The new symbol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable() {

    /**
     * Constructs a new, empty SymbolTable with a default initial capacity (101)
     * and load factor, which is <tt>0.75</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable(int initialCapacity) {

    /**
     * Constructs a new, empty SymbolTable with the specified initial capacity
     * and default load factor, which is <tt>0.75</tt>.
     *
     * @param     initialCapacity   the initial capacity of the hashtable.
     * @throws    IllegalArgumentException if the initial capacity is less
     *            than zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable(int initialCapacity, float loadFactor) {

    /**
     * Constructs a new, empty SymbolTable with the specified initial
     * capacity and the specified load factor.
     *
     * @param      initialCapacity   the initial capacity of the SymbolTable.
     * @param      loadFactor        the load factor of the SymbolTable.
     * @throws     IllegalArgumentException  if the initial capacity is less
     *             than zero, or if the load factor is nonpositive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected final int fCollisionThreshold;

    /**
     * A new hash function is selected and the table is rehashed when
     * the number of keys in the bucket exceeds this threshold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected float fLoadFactor;

    /** The load factor for the SymbolTable. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int fThreshold;

    /** The table is rehashed when its size exceeds this threshold.  (The
     * value of this field is (int)(capacity * loadFactor).) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected transient int fCount;

    /** The total number of entries in the hash table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int fTableSize;

    /** actual table size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected Entry[] fBuckets = null;

    /** Buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket for a table with load factor == 1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
public class SymbolTable {

/**
 * This class is a symbol table implementation that guarantees that
 * strings used as identifiers are unique references. Multiple calls
 * to <code>addSymbol</code> will always return the same string
 * reference.
 * <p>
 * The symbol table performs the same task as <code>String.intern()</code>
 * with the following differences:
 * <ul>
 *  <li>
 *   A new string object does not need to be created in order to
 *   retrieve a unique reference. Symbols can be added by using
 *   a series of characters in a character array.
 *  </li>
 *  <li>
 *   Users of the symbol table can provide their own symbol hashing
 *   implementation. For example, a simple string hashing algorithm
 *   may fail to produce a balanced set of hashcodes for symbols
 *   that are <em>mostly</em> unique. Strings with similar leading
 *   characters are especially prone to this poor hashing behavior.
 *  </li>
 * </ul>
 *
 * @see SymbolHash
 *
 * @author Andy Clark
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void popExcludedNamespacesContext() {

    /**
     * Exclusion of namespaces by a stylesheet does not extend to any stylesheet
     * imported or included by the stylesheet.  Upon exiting the context of a
     * stylesheet, a call to this method is needed to restore the set of
     * excluded namespaces that was in effect prior to entering the context of
     * the current stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void pushExcludedNamespacesContext() {

    /**
     * Exclusion of namespaces by a stylesheet does not extend to any stylesheet
     * imported or included by the stylesheet.  Upon entering the context of a
     * new stylesheet, a call to this method is needed to clear the current set
     * of excluded namespaces temporarily.  Every call to this method requires
     * a corresponding call to {@link #popExcludedNamespacesContext()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void unExcludeNamespaces(String prefixes) {

    /**
     * Turn of namespace declaration exclusion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public boolean isExcludedNamespace(String uri) {

    /**
     * Check if a namespace should not be declared in the output (unless used)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void excludeNamespaces(String prefixes) {

    /**
     * Exclude a series of namespaces given by a list of whitespace
     * separated namespace prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void excludeURI(String uri) {

    /**
     * Register a namespace URI so that it will not be declared in the output
     * unless it is actually referenced in the output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public String lookupPrefixAlias(String prefix) {

    /**
     * Retrieves any alias for a given namespace prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void addPrefixAlias(String prefix, String alias) {

    /**
     * Adds an alias for a namespace prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    private SyntaxTreeNode _current = null;

    /**
     * Use a namespace prefix to lookup a namespace URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    private int _nsCounter = 0;

    /**
     * This is used for xsl:attribute elements that have a "namespace"
     * attribute that is currently not defined using xmlns:
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public Vector lookupPrimop(String name) {

    /**
     * Lookup a primitive operator or function in the symbol table by
     * prepending the prefix <tt>PrimopPrefix</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
    public void addPrimop(String name, MethodType mtype) {

    /**
     * Add a primitive operator or function to the symbol table. To avoid
     * name clashes with user-defined names, the prefix <tt>PrimopPrefix</tt>
     * is prepended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SymbolTable.java
final class SymbolTable {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry(char[] ch, int offset, int length, Entry next) {

        /**
         * Constructs a new entry from the specified symbol information and
         * next entry reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry(String symbol, Entry next) {

        /**
         * Constructs a new entry from the specified symbol and next entry
         * reference.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public Entry next;

        /** The next entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public final char[] characters;

        /**
         * Symbol characters. This information is duplicated here for
         * comparison performance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
        public final String symbol;

        /** Symbol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final class Entry {

    /**
     * This class is a symbol table entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public boolean containsSymbol(char[] buffer, int offset, int length) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param buffer The buffer containing the symbol to look for.
     * @param offset The offset into the buffer.
     * @param length The length of the symbol in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public boolean containsSymbol(String symbol) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param symbol The symbol to look for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected void rebalance() {

    /**
     * Randomly selects a new hash function and reorganizes this SymbolTable
     * in order to more evenly distribute its entries across the table. This
     * method is called automatically when the number keys in one of the
     * SymbolTable's buckets exceeds the given collision threshold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected void rehash() {

    /**
     * Increases the capacity of and internally reorganizes this
     * SymbolTable, in order to accommodate and access its entries more
     * efficiently.  This method is called automatically when the
     * number of keys in the SymbolTable exceeds this hashtable's capacity
     * and load factor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public int hash(char[] buffer, int offset, int length) {

    /**
     * Returns a hashcode value for the specified symbol information.
     * The value returned by this method must be identical to the value
     * returned by the <code>hash(String)</code> method when called
     * with the string object created from the symbol information.
     *
     * @param buffer The character buffer containing the symbol.
     * @param offset The offset into the character buffer of the start
     *               of the symbol.
     * @param length The length of the symbol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public int hash(String symbol) {

    /**
     * Returns a hashcode value for the specified symbol. The value
     * returned by this method must be identical to the value returned
     * by the <code>hash(char[],int,int)</code> method when called
     * with the character array that comprises the symbol string.
     *
     * @param symbol The symbol to hash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public String addSymbol(char[] buffer, int offset, int length) {

    /**
     * Adds the specified symbol to the symbol table and returns a
     * reference to the unique symbol. If the symbol already exists,
     * the previous symbol reference is returned instead, in order
     * guarantee that symbol references remain unique.
     *
     * @param buffer The buffer containing the new symbol.
     * @param offset The offset into the buffer of the new symbol.
     * @param length The length of the new symbol in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public String addSymbol(String symbol) {

    /**
     * Adds the specified symbol to the symbol table and returns a
     * reference to the unique symbol. If the symbol already exists,
     * the previous symbol reference is returned instead, in order
     * guarantee that symbol references remain unique.
     *
     * @param symbol The new symbol.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable() {

    /**
     * Constructs a new, empty SymbolTable with a default initial capacity (101)
     * and load factor, which is <tt>0.75</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable(int initialCapacity) {

    /**
     * Constructs a new, empty SymbolTable with the specified initial capacity
     * and default load factor, which is <tt>0.75</tt>.
     *
     * @param     initialCapacity   the initial capacity of the hashtable.
     * @throws    IllegalArgumentException if the initial capacity is less
     *            than zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    public SymbolTable(int initialCapacity, float loadFactor) {

    /**
     * Constructs a new, empty SymbolTable with the specified initial
     * capacity and the specified load factor.
     *
     * @param      initialCapacity   the initial capacity of the SymbolTable.
     * @param      loadFactor        the load factor of the SymbolTable.
     * @throws     IllegalArgumentException  if the initial capacity is less
     *             than zero, or if the load factor is nonpositive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected final int fCollisionThreshold;

    /**
     * A new hash function is selected and the table is rehashed when
     * the number of keys in the bucket exceeds this threshold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected float fLoadFactor;

    /** The load factor for the SymbolTable. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int fThreshold;

    /** The table is rehashed when its size exceeds this threshold.  (The
     * value of this field is (int)(capacity * loadFactor).) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected transient int fCount;

    /** The total number of entries in the hash table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected int fTableSize;

    /** actual table size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected Entry[] fBuckets = null;

    /** Buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket for a table with load factor == 1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolTable.java
public class SymbolTable {

/**
 * This class is a symbol table implementation that guarantees that
 * strings used as identifiers are unique references. Multiple calls
 * to <code>addSymbol</code> will always return the same string
 * reference.
 * <p>
 * The symbol table performs the same task as <code>String.intern()</code>
 * with the following differences:
 * <ul>
 *  <li>
 *   A new string object does not need to be created in order to
 *   retrieve a unique reference. Symbols can be added by using
 *   a series of characters in a character array.
 *  </li>
 *  <li>
 *   Users of the symbol table can provide their own symbol hashing
 *   implementation. For example, a simple string hashing algorithm
 *   may fail to produce a balanced set of hashcodes for symbols
 *   that are <em>mostly</em> unique. Strings with similar leading
 *   characters are especially prone to this poor hashing behavior.
 *  </li>
 * </ul>
 *
 * @see SymbolHash
 *
 * @author Andy Clark
 *
 */
