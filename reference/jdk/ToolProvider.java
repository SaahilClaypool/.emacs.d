_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ToolProvider.java
    public static ClassLoader getSystemToolClassLoader() {

    /**
     * Returns the class loader for tools provided with this platform.
     * This does not include user-installed tools.  Use the
     * {@linkplain java.util.ServiceLoader service provider mechanism}
     * for locating user installed tools.
     *
     * @return the class loader for tools provided with this platform
     * or {@code null} if no tools are provided
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ToolProvider.java
    public static DocumentationTool getSystemDocumentationTool() {

    /**
     * Gets the Java&trade; programming language documentation tool provided
     * with this platform.
     * @return the documentation tool provided with this platform or
     * {@code null} if no documentation tool is provided
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ToolProvider.java
    public static JavaCompiler getSystemJavaCompiler() {

    /**
     * Gets the Java&trade; programming language compiler provided
     * with this platform.
     * @return the compiler provided with this platform or
     * {@code null} if no compiler is provided
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/ToolProvider.java
public class ToolProvider {

/**
 * Provides methods for locating tool providers, for example,
 * providers of compilers.  This class complements the
 * functionality of {@link java.util.ServiceLoader}.
 *
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
