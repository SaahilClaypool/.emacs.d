_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/I18NImpl.java
    protected static final String getString(String className, String resource_name, String key) {

    /**
     * Returns the message string with the specified key from the
     * "properties" file in the package containing the class with
     * the specified name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/I18NImpl.java
public class I18NImpl {

/**
 * Class to simplify use of internationalization message strings.
 * Property files are constructed in terms of content as for JAI with
 * one "key=value" pair per line. All such files however have the same
 * name "properties". The resource extractor resolves the extraction of
 * the file from the jar as the package name is included automatically.
 *
 * <p>Extenders need only provide a static method
 * <code>getString(String)</code> which calls the static method in this
 * class with the name of the invoking class and returns a
 * <code>String</code>.
 */
