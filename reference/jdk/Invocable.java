_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Invocable.java
     public <T> T getInterface(Object thiz, Class<T> clasz);

    /**
     * Returns an implementation of an interface using member functions of
     * a scripting object compiled in the interpreter. The methods of the
     * interface may be implemented using the <code>invokeMethod</code> method.
     *
     * @param <T> the type of the interface to return
     * @param thiz The scripting object whose member functions are used to implement the methods of the interface.
     * @param clasz The <code>Class</code> object of the interface to return.
     *
     * @return An instance of requested interface - null if the requested interface is unavailable,
     * i. e. if compiled methods in the <code>ScriptEngine</code> cannot be found matching
     * the ones in the requested interface.
     *
     * @throws IllegalArgumentException if the specified <code>Class</code> object
     * is null or is not an interface, or if the specified Object is
     * null or does not represent a scripting object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Invocable.java
    public <T> T getInterface(Class<T> clasz);

     /**
     * Returns an implementation of an interface using functions compiled in
     * the interpreter. The methods of the interface
     * may be implemented using the <code>invokeFunction</code> method.
     *
     * @param <T> the type of the interface to return
     * @param clasz The <code>Class</code> object of the interface to return.
     *
     * @return An instance of requested interface - null if the requested interface is unavailable,
     * i. e. if compiled functions in the <code>ScriptEngine</code> cannot be found matching
     * the ones in the requested interface.
     *
     * @throws IllegalArgumentException if the specified <code>Class</code> object
     * is null or is not an interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Invocable.java
     public Object invokeFunction(String name, Object... args)

    /**
     * Used to call top-level procedures and functions defined in scripts.
     *
     * @param name of the procedure or function to call
     * @param args Arguments to pass to the procedure or function
     * @return The value returned by the procedure or function
     *
     * @throws ScriptException if an error occurs during invocation of the method.
     * @throws NoSuchMethodException if method with given name or matching argument types cannot be found.
     * @throws NullPointerException if method name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Invocable.java
public interface Invocable  {

/**
 * The optional interface implemented by ScriptEngines whose methods allow the invocation of
 * procedures in scripts that have previously been executed.
 *
 * @author  Mike Grogan
 * @author  A. Sundararajan
 * @since 1.6
 */
