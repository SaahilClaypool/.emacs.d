_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Compilable.java
    public CompiledScript compile(Reader script) throws

    /**
     * Compiles the script (source read from <code>Reader</code>) for
     * later execution.  Functionality is identical to
     * <code>compile(String)</code> other than the way in which the source is
     * passed.
     *
     * @param script The reader from which the script source is obtained.
     *
     * @return An instance of a subclass of <code>CompiledScript</code> to be executed
     * later using one of its <code>eval</code> methods of <code>CompiledScript</code>.
     *
     * @throws ScriptException if compilation fails.
     * @throws NullPointerException if argument is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/Compilable.java
public interface Compilable {

/**
 * The optional interface implemented by ScriptEngines whose methods compile scripts
 * to a form that can be executed repeatedly without recompilation.
 *
 * @author Mike Grogan
 * @since 1.6
 */
