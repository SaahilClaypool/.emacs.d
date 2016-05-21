_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    ClassDoc classNamed(String qualifiedName);

    /**
     * Return a ClassDoc for the specified class or interface name.
     *
     * @param qualifiedName
     * <a href="package-summary.html#qualified">qualified</a>
     * class or package name
     *
     * @return a ClassDoc holding the specified class, null if
     * this class is not referenced.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    PackageDoc packageNamed(String name);

    /**
     * Return a PackageDoc for the specified package name.
     *
     * @param name package name
     *
     * @return a PackageDoc holding the specified package, null if
     * this package is not referenced.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    ClassDoc[] classes();

    /**
     * Return the
     * <a href="package-summary.html#included">included</a>
      classes and interfaces in all packages.
     *
     * @return included classes and interfaces in all packages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    ClassDoc[] specifiedClasses();

    /**
     * Return the classes and interfaces
     * <a href="package-summary.html#included">specified</a>
     * as source file names on the command line.
     *
     * @return classes and interfaces specified on the command line.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    PackageDoc[] specifiedPackages();

    /**
     * Return the packages
     * <a href="package-summary.html#included">specified</a>
     * on the command line.
     * If <code>-subpackages</code> and <code>-exclude</code> options
     * are used, return all the non-excluded packages.
     *
     * @return packages specified on the command line.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
    String[][] options();

    /**
     * Command line options.
     * <p>
     * For example, given:
     * <pre>
     *     javadoc -foo this that -bar other ...</pre>
     *
     * this method will return:
     * <pre>
     *      options()[0][0] = "-foo"
     *      options()[0][1] = "this"
     *      options()[0][2] = "that"
     *      options()[1][0] = "-bar"
     *      options()[1][1] = "other"</pre>
     *
     * @return an array of arrays of String.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/RootDoc.java
public interface RootDoc extends Doc, DocErrorReporter {

/**
 * Represents the root of the program structure information
 * for one run of javadoc.  From this root all other program
 * structure information can be extracted.
 * Also represents the command line information -- the
 * packages, classes and options specified by the user.
 *
 * @since 1.2
 * @author Robert Field
 */