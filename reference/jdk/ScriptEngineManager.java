_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    private Bindings globalScope;

    /** Global bindings associated with script engines created by this manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    private HashMap<String, ScriptEngineFactory> mimeTypeAssociations;

    /** Map of script script MIME type to script engine factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    private HashMap<String, ScriptEngineFactory> extensionAssociations;

    /** Map of script file extension to script engine factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    private HashMap<String, ScriptEngineFactory> nameAssociations;

    /** Map of engine name to script engine factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    private HashSet<ScriptEngineFactory> engineSpis;

    /** Set of script engine factories discovered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public void registerEngineExtension(String extension, ScriptEngineFactory factory) {

    /**
     * Registers a <code>ScriptEngineFactory</code> to handle an extension.
     * Overrides any such association found using the Discovery mechanism.
     *
     * @param extension The extension type  to be associated with the
     * <code>ScriptEngineFactory</code>.
     * @param factory The class to associate with the given extension.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public void registerEngineMimeType(String type, ScriptEngineFactory factory) {

    /**
     * Registers a <code>ScriptEngineFactory</code> to handle a mime type.
     * Overrides any such association found using the Discovery mechanism.
     *
     * @param type The mime type  to be associated with the
     * <code>ScriptEngineFactory</code>.
     *
     * @param factory The class to associate with the given mime type.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public void registerEngineName(String name, ScriptEngineFactory factory) {

    /**
     * Registers a <code>ScriptEngineFactory</code> to handle a language
     * name.  Overrides any such association found using the Discovery mechanism.
     * @param name The name to be associated with the <code>ScriptEngineFactory</code>.
     * @param factory The class to associate with the given name.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public List<ScriptEngineFactory> getEngineFactories() {

    /**
     * Returns a list whose elements are instances of all the <code>ScriptEngineFactory</code> classes
     * found by the discovery mechanism.
     * @return List of all discovered <code>ScriptEngineFactory</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public ScriptEngine getEngineByMimeType(String mimeType) {

    /**
     * Look up and create a <code>ScriptEngine</code> for a given mime type.  The algorithm
     * used by <code>getEngineByName</code> is used except that the search starts
     * by looking for a <code>ScriptEngineFactory</code> registered to handle the
     * given mime type using <code>registerEngineMimeType</code>.
     * @param mimeType The given mime type
     * @return The engine to handle scripts with this mime type.  Returns <code>null</code>
     * if not found.
     * @throws NullPointerException if mimeType is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public ScriptEngine getEngineByExtension(String extension) {

    /**
     * Look up and create a <code>ScriptEngine</code> for a given extension.  The algorithm
     * used by <code>getEngineByName</code> is used except that the search starts
     * by looking for a <code>ScriptEngineFactory</code> registered to handle the
     * given extension using <code>registerEngineExtension</code>.
     * @param extension The given extension
     * @return The engine to handle scripts with this extension.  Returns <code>null</code>
     * if not found.
     * @throws NullPointerException if extension is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public ScriptEngine getEngineByName(String shortName) {

    /**
     * Looks up and creates a <code>ScriptEngine</code> for a given  name.
     * The algorithm first searches for a <code>ScriptEngineFactory</code> that has been
     * registered as a handler for the specified name using the <code>registerEngineName</code>
     * method.
     * <br><br> If one is not found, it searches the set of <code>ScriptEngineFactory</code> instances
     * stored by the constructor for one with the specified name.  If a <code>ScriptEngineFactory</code>
     * is found by either method, it is used to create instance of <code>ScriptEngine</code>.
     * @param shortName The short name of the <code>ScriptEngine</code> implementation.
     * returned by the <code>getNames</code> method of its <code>ScriptEngineFactory</code>.
     * @return A <code>ScriptEngine</code> created by the factory located in the search.  Returns null
     * if no such factory was found.  The <code>ScriptEngineManager</code> sets its own <code>globalScope</code>
     * <code>Bindings</code> as the <code>GLOBAL_SCOPE</code> <code>Bindings</code> of the newly
     * created <code>ScriptEngine</code>.
     * @throws NullPointerException if shortName is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public Object get(String key) {

    /**
     * Gets the value for the specified key in the Global Scope
     * @param key The key whose value is to be returned.
     * @return The value for the specified key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public void put(String key, Object value) {

    /**
     * Sets the specified key/value pair in the Global Scope.
     * @param key Key to set
     * @param value Value to set.
     * @throws NullPointerException if key is null.
     * @throws IllegalArgumentException if key is empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public Bindings getBindings() {

    /**
     * <code>getBindings</code> returns the value of the <code>globalScope</code> field.
     * ScriptEngineManager sets this <code>Bindings</code> as global bindings for
     * <code>ScriptEngine</code> objects created by it.
     *
     * @return The globalScope field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public void setBindings(Bindings bindings) {

    /**
     * <code>setBindings</code> stores the specified <code>Bindings</code>
     * in the <code>globalScope</code> field. ScriptEngineManager sets this
     * <code>Bindings</code> as global bindings for <code>ScriptEngine</code>
     * objects created by it.
     *
     * @param bindings The specified <code>Bindings</code>
     * @throws IllegalArgumentException if bindings is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public ScriptEngineManager(ClassLoader loader) {

    /**
     * This constructor loads the implementations of
     * <code>ScriptEngineFactory</code> visible to the given
     * <code>ClassLoader</code> using the <a href="../../../technotes/guides/jar/jar.html#Service%20Provider">service provider</a> mechanism.<br><br>
     * If loader is <code>null</code>, the script engine factories that are
     * bundled with the platform and that are in the usual extension
     * directories (installed extensions) are loaded. <br><br>
     *
     * @param loader ClassLoader used to discover script engine factories.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
    public ScriptEngineManager() {

    /**
     * The effect of calling this constructor is the same as calling
     * <code>ScriptEngineManager(Thread.currentThread().getContextClassLoader())</code>.
     *
     * @see java.lang.Thread#getContextClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/ScriptEngineManager.java
public class ScriptEngineManager  {

/**
 * The <code>ScriptEngineManager</code> implements a discovery and instantiation
 * mechanism for <code>ScriptEngine</code> classes and also maintains a
 * collection of key/value pairs storing state shared by all engines created
 * by the Manager. This class uses the <a href="../../../technotes/guides/jar/jar.html#Service%20Provider">service provider</a> mechanism to enumerate all the
 * implementations of <code>ScriptEngineFactory</code>. <br><br>
 * The <code>ScriptEngineManager</code> provides a method to return a list of all these factories
 * as well as utility methods which look up factories on the basis of language name, file extension
 * and mime type.
 * <p>
 * The <code>Bindings</code> of key/value pairs, referred to as the "Global Scope"  maintained
 * by the manager is available to all instances of <code>ScriptEngine</code> created
 * by the <code>ScriptEngineManager</code>.  The values in the <code>Bindings</code> are
 * generally exposed in all scripts.
 *
 * @author Mike Grogan
 * @author A. Sundararajan
 * @since 1.6
 */
