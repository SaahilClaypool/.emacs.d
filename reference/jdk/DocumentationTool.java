_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
        TAGLET_PATH;

        /**
         * Location to search for taglets.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
        DOCLET_PATH,

        /**
         * Location to search for doclets.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
    enum Location implements JavaFileManager.Location {

    /**
     * Locations specific to {@link DocumentationTool}.
     *
     * @see StandardLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
        Boolean call();

        /**
         * Performs this documentation task.  The task may only
         * be performed once.  Subsequent calls to this method throw
         * IllegalStateException.
         *
         * @return true if and only all the files were processed without errors;
         * false otherwise
         *
         * @throws RuntimeException if an unrecoverable error occurred
         * in a user-supplied component.  The
         * {@linkplain Throwable#getCause() cause} will be the error
         * in user code.
         *
         * @throws IllegalStateException if called more than once
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
    interface DocumentationTask extends Callable<Boolean> {

    /**
     * Interface representing a future for a documentation task.  The
     * task has not yet started.  To start the task, call
     * the {@linkplain #call call} method.
     *
     * <p>Before calling the call method, additional aspects of the
     * task can be configured, for example, by calling the
     * {@linkplain #setLocale setLocale} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
    StandardJavaFileManager getStandardFileManager(
        DiagnosticListener<? super JavaFileObject> diagnosticListener,
        Locale locale,
        Charset charset);

    /**
     * Gets a new instance of the standard file manager implementation
     * for this tool.  The file manager will use the given diagnostic
     * listener for producing any non-fatal diagnostics.  Fatal errors
     * will be signaled with the appropriate exceptions.
     *
     * <p>The standard file manager will be automatically reopened if
     * it is accessed after calls to {@code flush} or {@code close}.
     * The standard file manager must be usable with other tools.
     *
     * @param diagnosticListener a diagnostic listener for non-fatal
     * diagnostics; if {@code null} use the compiler's default method
     * for reporting diagnostics
     *
     * @param locale the locale to apply when formatting diagnostics;
     * {@code null} means the {@linkplain Locale#getDefault() default locale}.
     *
     * @param charset the character set used for decoding bytes; if
     * {@code null} use the platform default
     *
     * @return the standard file manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/DocumentationTool.java
public interface DocumentationTool extends Tool, OptionChecker {

/**
 * Interface to invoke Java&trade; programming language documentation tools from
 * programs.
 */
