_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
    @Override

    /**
     * Returns {@code null} since a package is not enclosed by another
     * element.
     *
     * @return {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
    boolean isUnnamed();

    /**
     * Returns {@code true} is this is an unnamed package and {@code
     * false} otherwise.
     *
     * @return {@code true} is this is an unnamed package and {@code
     * false} otherwise
     * @jls 7.4.2 Unnamed Packages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
    @Override

    /**
     * Returns the {@linkplain NestingKind#TOP_LEVEL top-level}
     * classes and interfaces within this package.  Note that
     * subpackages are <em>not</em> considered to be enclosed by a
     * package.
     *
     * @return the top-level classes and interfaces within this
     * package
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
    @Override

    /**
     * Returns the simple name of this package.  For an unnamed
     * package, an empty name is returned.
     *
     * @return the simple name of this package or an empty name if
     * this is an unnamed package
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
    Name getQualifiedName();

    /**
     * Returns the fully qualified name of this package.
     * This is also known as the package's <i>canonical</i> name.
     *
     * @return the fully qualified name of this package, or an
     * empty name if this is an unnamed package
     * @jls 6.7 Fully Qualified Names and Canonical Names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/PackageElement.java
public interface PackageElement extends Element, QualifiedNameable {

/**
 * Represents a package program element.  Provides access to information
 * about the package and its members.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see javax.lang.model.util.Elements#getPackageOf
 * @since 1.6
 */
