_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public List<Integer> getScopes() {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Bindings getBindings(int scope) {

    /**
     * Returns the value of the <code>engineScope</code> field if specified scope is
     * <code>ENGINE_SCOPE</code>.  Returns the value of the <code>globalScope</code> field if the specified scope is
     * <code>GLOBAL_SCOPE</code>.
     *
     * @param scope The specified scope
     * @return The value of either the  <code>engineScope</code> or <code>globalScope</code> field.
     * @throws IllegalArgumentException if the value of scope is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public int getAttributesScope(String name) {

    /**
     * Get the lowest scope in which an attribute is defined.
     * @param name Name of the attribute
     * .
     * @return The lowest scope.  Returns -1 if no attribute with the given
     * name is defined in any scope.
     * @throws NullPointerException if name is null.
     * @throws IllegalArgumentException if name is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public void setErrorWriter(Writer writer) {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Writer getErrorWriter() {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public void setWriter(Writer writer) {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public void setReader(Reader reader) {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Reader getReader() {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Writer getWriter() {

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public void setAttribute(String name, Object value, int scope) {

    /**
     * Sets the value of an attribute in a given scope.
     *
     * @param name The name of the attribute to set
     * @param value The value of the attribute
     * @param scope The scope in which to set the attribute
     *
     * @throws IllegalArgumentException
     *         if the name is empty or if the scope is invalid.
     * @throws NullPointerException if the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Object removeAttribute(String name, int scope) {

    /**
     * Remove an attribute in a given scope.
     *
     * @param name The name of the attribute to remove
     * @param scope The scope in which to remove the attribute
     *
     * @return The removed value.
     * @throws IllegalArgumentException
     *         if the name is empty or if the scope is invalid.
     * @throws NullPointerException if the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Object getAttribute(String name, int scope) {

    /**
     * Gets the value of an attribute in a given scope.
     *
     * @param name The name of the attribute to retrieve.
     * @param scope The scope in which to retrieve the attribute.
     * @return The value of the attribute. Returns <code>null</code> is the name
     * does not exist in the given scope.
     *
     * @throws IllegalArgumentException
     *         if the name is empty or if the value of scope is invalid.
     * @throws NullPointerException if the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public Object getAttribute(String name) {

    /**
     * Retrieves the value of the attribute with the given name in
     * the scope occurring earliest in the search order.  The order
     * is determined by the numeric value of the scope parameter (lowest
     * scope values first.)
     *
     * @param name The name of the the attribute to retrieve.
     * @return The value of the attribute in the lowest scope for
     * which an attribute with the given name is defined.  Returns
     * null if no attribute with the name exists in any scope.
     * @throws NullPointerException if the name is null.
     * @throws IllegalArgumentException if the name is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public void setBindings(Bindings bindings, int scope) {

    /**
     * Sets a <code>Bindings</code> of attributes for the given scope.  If the value
     * of scope is <code>ENGINE_SCOPE</code> the given <code>Bindings</code> replaces the
     * <code>engineScope</code> field.  If the value
     * of scope is <code>GLOBAL_SCOPE</code> the given <code>Bindings</code> replaces the
     * <code>globalScope</code> field.
     *
     * @param bindings The <code>Bindings</code> of attributes to set.
     * @param scope The value of the scope in which the attributes are set.
     *
     * @throws IllegalArgumentException if scope is invalid.
     * @throws NullPointerException if the value of scope is <code>ENGINE_SCOPE</code> and
     * the specified <code>Bindings</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    public SimpleScriptContext() {

    /**
     * Create a {@code SimpleScriptContext}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    protected Bindings globalScope;

    /**
     * This is the global scope bindings.
     * By default, a null value (which means no global scope) is used. Accessor
     * methods setBindings, getBindings are used to manage this field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    protected Bindings engineScope;

    /**
     * This is the engine scope bindings.
     * By default, a <code>SimpleBindings</code> is used. Accessor
     * methods setBindings, getBindings are used to manage this field.
     * @see SimpleBindings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    protected Reader reader;

    /**
     * This is the reader to be used for input from scripts.
     * By default, a <code>InputStreamReader</code> based on <code>System.in</code>
     * is used and default charset is used by this reader. Accessor methods
     * getReader, setReader are used to manage this field.
     * @see java.lang.System#in
     * @see java.io.InputStreamReader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    protected Writer errorWriter;

    /**
     * This is the writer to be used to output errors from scripts.
     * By default, a <code>PrintWriter</code> based on <code>System.err</code> is
     * used. Accessor methods getErrorWriter, setErrorWriter are used to manage
     * this field.
     * @see java.lang.System#err
     * @see java.io.PrintWriter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
    protected Writer writer;

    /**
     * This is the writer to be used to output from scripts.
     * By default, a <code>PrintWriter</code> based on <code>System.out</code>
     * is used. Accessor methods getWriter, setWriter are used to manage
     * this field.
     * @see java.lang.System#out
     * @see java.io.PrintWriter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/SimpleScriptContext.java
public class SimpleScriptContext  implements ScriptContext {

/**
 * Simple implementation of ScriptContext.
 *
 * @author Mike Grogan
 * @since 1.6
 */
