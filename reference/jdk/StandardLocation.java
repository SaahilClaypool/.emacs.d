_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    public static Location locationFor(final String name) {

    /**
     * Gets a location object with the given name.  The following
     * property must hold: {@code locationFor(x) ==
     * locationFor(y)} if and only if {@code x.equals(y)}.
     * The returned location will be an output location if and only if
     * name ends with {@code "_OUTPUT"}.
     *
     * @param name a name
     * @return a location
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    NATIVE_HEADER_OUTPUT;

    /**
     * Location of new native header files.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    PLATFORM_CLASS_PATH,

    /**
     * Location to search for platform classes.  Sometimes called
     * the boot class path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    ANNOTATION_PROCESSOR_PATH,

    /**
     * Location to search for annotation processors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    SOURCE_PATH,

    /**
     * Location to search for existing source files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    CLASS_PATH,

    /**
     * Location to search for user class files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    SOURCE_OUTPUT,

    /**
     * Location of new source files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
    CLASS_OUTPUT,

    /**
     * Location of new class files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/StandardLocation.java
public enum StandardLocation implements Location {

/**
 * Standard locations of file objects.
 *
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
