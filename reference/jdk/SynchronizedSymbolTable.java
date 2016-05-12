_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    public boolean containsSymbol(String symbol) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param symbol The symbol to look for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    public SynchronizedSymbolTable(SymbolTable symbolTable) {

    /** Constructs a synchronized symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    protected SymbolTable fSymbolTable;

    /** Main symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
public final class SynchronizedSymbolTable

/**
 * Synchronized symbol table.
 *
 * This class moved into the util package since it's needed by multiple
 * other classes (CachingParserPool, XMLGrammarCachingConfiguration).
 *
 * @author Andy Clark, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    public boolean containsSymbol(String symbol) {

    /**
     * Returns true if the symbol table already contains the specified
     * symbol.
     *
     * @param symbol The symbol to look for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    public SynchronizedSymbolTable(SymbolTable symbolTable) {

    /** Constructs a synchronized symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
    protected SymbolTable fSymbolTable;

    /** Main symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SynchronizedSymbolTable.java
public final class SynchronizedSymbolTable

/**
 * Synchronized symbol table.
 *
 * This class moved into the util package since it's needed by multiple
 * other classes (CachingParserPool, XMLGrammarCachingConfiguration).
 *
 * @author Andy Clark, IBM
 */
