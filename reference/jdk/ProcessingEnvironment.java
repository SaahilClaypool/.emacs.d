_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    Locale getLocale();

    /**
     * Returns the current locale or {@code null} if no locale is in
     * effect.  The locale can be be used to provide localized
     * {@linkplain Messager messages}.
     *
     * @return the current locale or {@code null} if no locale is in
     * effect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    SourceVersion getSourceVersion();

    /**
     * Returns the source version that any generated {@linkplain
     * Filer#createSourceFile source} and {@linkplain
     * Filer#createClassFile class} files should conform to.
     *
     * @return the source version to which generated source and class
     *         files should conform to
     * @see Processor#getSupportedSourceVersion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    Types getTypeUtils();

    /**
     * Returns an implementation of some utility methods for
     * operating on types.
     *
     * @return type utilities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    Elements getElementUtils();

    /**
     * Returns an implementation of some utility methods for
     * operating on elements
     *
     * @return element utilities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    Filer getFiler();

    /**
     * Returns the filer used to create new source, class, or auxiliary
     * files.
     *
     * @return the filer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
    Messager getMessager();

    /**
     * Returns the messager used to report errors, warnings, and other
     * notices.
     *
     * @return the messager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/ProcessingEnvironment.java
public interface ProcessingEnvironment {

/**
 * An annotation processing tool framework will {@linkplain
 * Processor#init provide an annotation processor with an object
 * implementing this interface} so the processor can use facilities
 * provided by the framework to write new files, report error
 * messages, and find other utilities.
 *
 * <p>Third parties may wish to provide value-add wrappers around the
 * facility objects from this interface, for example a {@code Filer}
 * extension that allows multiple processors to coordinate writing out
 * a single source file.  To enable this, for processors running in a
 * context where their side effects via the API could be visible to
 * each other, the tool infrastructure must provide corresponding
 * facility objects that are {@code .equals}, {@code Filer}s that are
 * {@code .equals}, and so on.  In addition, the tool invocation must
 * be able to be configured such that from the perspective of the
 * running annotation processors, at least the chosen subset of helper
 * classes are viewed as being loaded by the same class loader.
 * (Since the facility objects manage shared state, the implementation
 * of a wrapper class must know whether or not the same base facility
 * object has been wrapped before.)
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
