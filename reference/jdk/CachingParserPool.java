_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public boolean containsGrammar(XMLGrammarDescription desc) {

        /**
         * Returns true if the grammar pool contains a grammar associated
         * to the specified description.
         *
         * @param desc The description of the grammar.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar getGrammar(XMLGrammarDescription desc) {

        /**
         * Returns the grammar associated to the specified description.
         *
         * @param desc The description of the grammar.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void cacheGrammars(String grammarType, Grammar[] grammars) {

        /**
         * Give the grammarPool the option of caching these grammars.
         * This certainly must be synchronized.
         *
         * @param grammarType The type of the grammars to be cached.
         * @param grammars    The Grammars that may be cached (unordered, Grammars previously
         *                    given to the validator may be included).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar retrieveGrammar(XMLGrammarDescription gDesc) {

        /**
         * Retrieve a particular grammar.
         * REVISIT:  does this need to be synchronized since it's just reading?
         *
         * @param gDesc Description of the grammar to be retrieved
         * @return      Grammar corresponding to gDesc, or null if none exists.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar [] retrieveInitialGrammarSet(String grammarType ) {

        /**
         * Retrieve the initial set of grammars for the validator to work with.
         * REVISIT:  does this need to be synchronized since it's just reading?
         *
         * @param grammarType Type of the grammars to be retrieved.
         * @return            The initial grammar set the validator may place in its "bucket"
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public ShadowedGrammarPool(XMLGrammarPool grammarPool) {

        /** Constructs a shadowed grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        private XMLGrammarPool fGrammarPool;

        /** Main grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final class ShadowedGrammarPool

    /**
     * Shadowed grammar pool.
     * This class is predicated on the existence of a concrete implementation;
     * so using our own doesn't seem to bad an idea.
     *
     * @author Andy Clark, IBM
     * @author Neil Graham, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    } // class SynchronizedGrammarPool

        /**********
        public boolean containsGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.containsGrammar(key);
            }
        } // containsGrammar(String):boolean
        ********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /**********
        public Grammar removeGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.removeGrammar(key);
            }
        } // removeGrammar(String):Grammar
        ******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /**********
        public Grammar getGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.getGrammar(key);
            }
        } // getGrammar(String):Grammar
        ***********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /******
        public void putGrammar(String key, Grammar grammar) {
            synchronized (fGrammarPool) {
                fGrammarPool.putGrammar(key, grammar);
            }
        } // putGrammar(String,Grammar)
        *******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /***
         * Methods corresponding to original (pre Xerces2.0.0final)
         * grammarPool have been commented out.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void unlockPool() {

        /** unlock the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void clear() {

        /** clear the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void lockPool() {

        /** lock the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public SynchronizedGrammarPool(XMLGrammarPool grammarPool) {

        /** Constructs a synchronized grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        private XMLGrammarPool fGrammarPool;

        /** Main grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final class SynchronizedGrammarPool

    /**
     * Synchronized grammar pool.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public SAXParser createSAXParser() {

    /** Creates a new SAX parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public DOMParser createDOMParser() {

    /** Creates a new DOM parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public void setShadowSymbolTable(boolean shadow) {

    /**
     * Sets whether new parser instance receive shadow copies of the
     * main symbol table.
     *
     * @param shadow If true, new parser instances use shadow copies
     *               of the main symbol table and are not allowed to
     *               add new symbols to the main symbol table. New
     *               symbols are added to the shadow symbol table and
     *               are local to the parser instance. If false, new
     *               parser instances are allowed to add new symbols
     *               to the main symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public XMLGrammarPool getXMLGrammarPool() {

    /** Returns the grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public SymbolTable getSymbolTable() {

    /** Returns the symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public CachingParserPool(SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a caching parser pool with the specified symbol table
     * and grammar pool.
     *
     * @param symbolTable The symbol table.
     * @param grammarPool The grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public CachingParserPool() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected boolean fShadowGrammarPool = DEFAULT_SHADOW_GRAMMAR_POOL;

    /**
     * Shadow the grammar pool for new parser instances. If true,
     * new parser instances use shadow copies of the main grammar
     * pool and are not allowed to add new grammars to the main
     * grammar pool. New grammars are added to the shadow grammar
     * pool and are local to the parser instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected boolean fShadowSymbolTable = DEFAULT_SHADOW_SYMBOL_TABLE;

    /**
     * Shadow the symbol table for new parser instances. If true,
     * new parser instances use shadow copies of the main symbol
     * table and are not allowed to add new symbols to the main
     * symbol table. New symbols are added to the shadow symbol
     * table and are local to the parser instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected XMLGrammarPool fSynchronizedGrammarPool;

    /**
     * Grammar pool. The grammar pool that the caching parser pool is
     * constructed with is automatically wrapped in a synchronized
     * version for thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected SymbolTable fSynchronizedSymbolTable;

    /**
     * Symbol table. The symbol table that the caching parser pool is
     * constructed with is automatically wrapped in a synchronized
     * version for thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final boolean DEFAULT_SHADOW_GRAMMAR_POOL = false;

    /** Default shadow grammar pool (false). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final boolean DEFAULT_SHADOW_SYMBOL_TABLE = false;

    /** Default shadow symbol table (false). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
public class CachingParserPool {

/**
 * A parser pool that enables caching of grammars. The caching parser
 * pool is constructed with a specific symbol table and grammar pool
 * that has already been populated with the grammars used by the
 * application.
 * <p>
 * Once the caching parser pool is constructed, specific parser
 * instances are created by calling the appropriate factory method
 * on the parser pool.
 * <p>
 * <strong>Note:</strong> There is a performance penalty for using
 * a caching parser pool due to thread safety. Access to the symbol
 * table and grammar pool must be synchronized to ensure the safe
 * operation of the symbol table and grammar pool.
 * <p>
 * <strong>Note:</strong> If performance is critical, then another
 * mechanism needs to be used instead of the caching parser pool.
 * One approach would be to create parser instances that do not
 * share these structures. Instead, each instance would get its
 * own copy to use while parsing. This avoids the synchronization
 * overhead at the expense of more memory and the time required
 * to copy the structures for each new parser instance. And even
 * when a parser instance is re-used, there is a potential for a
 * memory leak due to new symbols being added to the symbol table
 * over time. In other words, always take caution to make sure
 * that your application is thread-safe and avoids leaking memory.
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public boolean containsGrammar(XMLGrammarDescription desc) {

        /**
         * Returns true if the grammar pool contains a grammar associated
         * to the specified description.
         *
         * @param desc The description of the grammar.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar getGrammar(XMLGrammarDescription desc) {

        /**
         * Returns the grammar associated to the specified description.
         *
         * @param desc The description of the grammar.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void cacheGrammars(String grammarType, Grammar[] grammars) {

        /**
         * Give the grammarPool the option of caching these grammars.
         * This certainly must be synchronized.
         *
         * @param grammarType The type of the grammars to be cached.
         * @param grammars    The Grammars that may be cached (unordered, Grammars previously
         *                    given to the validator may be included).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar retrieveGrammar(XMLGrammarDescription gDesc) {

        /**
         * Retrieve a particular grammar.
         * REVISIT:  does this need to be synchronized since it's just reading?
         *
         * @param gDesc Description of the grammar to be retrieved
         * @return      Grammar corresponding to gDesc, or null if none exists.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public Grammar [] retrieveInitialGrammarSet(String grammarType ) {

        /**
         * Retrieve the initial set of grammars for the validator to work with.
         * REVISIT:  does this need to be synchronized since it's just reading?
         *
         * @param grammarType Type of the grammars to be retrieved.
         * @return            The initial grammar set the validator may place in its "bucket"
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public ShadowedGrammarPool(XMLGrammarPool grammarPool) {

        /** Constructs a shadowed grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        private XMLGrammarPool fGrammarPool;

        /** Main grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final class ShadowedGrammarPool

    /**
     * Shadowed grammar pool.
     * This class is predicated on the existence of a concrete implementation;
     * so using our own doesn't seem to bad an idea.
     *
     * @author Andy Clark, IBM
     * @author Neil Graham, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    } // class SynchronizedGrammarPool

        /**********
        public boolean containsGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.containsGrammar(key);
            }
        } // containsGrammar(String):boolean
        ********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /**********
        public Grammar removeGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.removeGrammar(key);
            }
        } // removeGrammar(String):Grammar
        ******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /**********
        public Grammar getGrammar(String key) {
            synchronized (fGrammarPool) {
                return fGrammarPool.getGrammar(key);
            }
        } // getGrammar(String):Grammar
        ***********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /******
        public void putGrammar(String key, Grammar grammar) {
            synchronized (fGrammarPool) {
                fGrammarPool.putGrammar(key, grammar);
            }
        } // putGrammar(String,Grammar)
        *******/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        /**

        /***
         * Methods corresponding to original (pre Xerces2.0.0final)
         * grammarPool have been commented out.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void unlockPool() {

        /** unlock the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void clear() {

        /** clear the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public void lockPool() {

        /** lock the grammar pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        public SynchronizedGrammarPool(XMLGrammarPool grammarPool) {

        /** Constructs a synchronized grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
        private XMLGrammarPool fGrammarPool;

        /** Main grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final class SynchronizedGrammarPool

    /**
     * Synchronized grammar pool.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public SAXParser createSAXParser() {

    /** Creates a new SAX parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public DOMParser createDOMParser() {

    /** Creates a new DOM parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public void setShadowSymbolTable(boolean shadow) {

    /**
     * Sets whether new parser instance receive shadow copies of the
     * main symbol table.
     *
     * @param shadow If true, new parser instances use shadow copies
     *               of the main symbol table and are not allowed to
     *               add new symbols to the main symbol table. New
     *               symbols are added to the shadow symbol table and
     *               are local to the parser instance. If false, new
     *               parser instances are allowed to add new symbols
     *               to the main symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public XMLGrammarPool getXMLGrammarPool() {

    /** Returns the grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public SymbolTable getSymbolTable() {

    /** Returns the symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public CachingParserPool(SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a caching parser pool with the specified symbol table
     * and grammar pool.
     *
     * @param symbolTable The symbol table.
     * @param grammarPool The grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public CachingParserPool() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected boolean fShadowGrammarPool = DEFAULT_SHADOW_GRAMMAR_POOL;

    /**
     * Shadow the grammar pool for new parser instances. If true,
     * new parser instances use shadow copies of the main grammar
     * pool and are not allowed to add new grammars to the main
     * grammar pool. New grammars are added to the shadow grammar
     * pool and are local to the parser instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected boolean fShadowSymbolTable = DEFAULT_SHADOW_SYMBOL_TABLE;

    /**
     * Shadow the symbol table for new parser instances. If true,
     * new parser instances use shadow copies of the main symbol
     * table and are not allowed to add new symbols to the main
     * symbol table. New symbols are added to the shadow symbol
     * table and are local to the parser instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected XMLGrammarPool fSynchronizedGrammarPool;

    /**
     * Grammar pool. The grammar pool that the caching parser pool is
     * constructed with is automatically wrapped in a synchronized
     * version for thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    protected SymbolTable fSynchronizedSymbolTable;

    /**
     * Symbol table. The symbol table that the caching parser pool is
     * constructed with is automatically wrapped in a synchronized
     * version for thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final boolean DEFAULT_SHADOW_GRAMMAR_POOL = false;

    /** Default shadow grammar pool (false). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
    public static final boolean DEFAULT_SHADOW_SYMBOL_TABLE = false;

    /** Default shadow symbol table (false). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/CachingParserPool.java
public class CachingParserPool {

/**
 * A parser pool that enables caching of grammars. The caching parser
 * pool is constructed with a specific symbol table and grammar pool
 * that has already been populated with the grammars used by the
 * application.
 * <p>
 * Once the caching parser pool is constructed, specific parser
 * instances are created by calling the appropriate factory method
 * on the parser pool.
 * <p>
 * <strong>Note:</strong> There is a performance penalty for using
 * a caching parser pool due to thread safety. Access to the symbol
 * table and grammar pool must be synchronized to ensure the safe
 * operation of the symbol table and grammar pool.
 * <p>
 * <strong>Note:</strong> If performance is critical, then another
 * mechanism needs to be used instead of the caching parser pool.
 * One approach would be to create parser instances that do not
 * share these structures. Instead, each instance would get its
 * own copy to use while parsing. This avoids the synchronization
 * overhead at the expense of more memory and the time required
 * to copy the structures for each new parser instance. And even
 * when a parser instance is re-used, there is a potential for a
 * memory leak due to new symbols being added to the symbol table
 * over time. In other words, always take caution to make sure
 * that your application is thread-safe and avoids leaking memory.
 *
 * @author Andy Clark, IBM
 *
 */
