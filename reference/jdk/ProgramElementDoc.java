_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isFinal();

    /**
     * Return true if this program element is final.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPackagePrivate();

    /**
     * Return true if this program element is package private.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPrivate();

    /**
     * Return true if this program element is private.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isProtected();

    /**
     * Return true if this program element is protected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPublic();

    /**
     * Return true if this program element is public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    AnnotationDesc[] annotations();

    /**
     * Get the annotations of this program element.
     * Return an empty array if there are none.
     *
     * @return the annotations of this program element.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    String modifiers();

    /**
     * Get modifiers string.
     * For example, for:
     * <pre>
     *   public abstract int foo() { ... }
     * </pre>
     * return "public abstract".
     * Annotations are not included.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    int modifierSpecifier();

    /**
     * Get the modifier specifier integer.
     *
     * @see java.lang.reflect.Modifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    String qualifiedName();

    /**
     * Get the fully qualified name of this program element.
     * For example, for the class <code>java.util.Hashtable</code>,
     * return "java.util.Hashtable".
     * <p>
     * For the method <code>bar()</code> in class <code>Foo</code>
     * in the unnamed package, return "Foo.bar".
     *
     * @return the qualified name of the program element as a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    PackageDoc containingPackage();

    /**
     * Get the package that this program element is contained in.
     *
     * @return a PackageDoc for this element containing package.
     * If in the unnamed package, this PackageDoc will have the
     * name "".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    ClassDoc containingClass();

    /**
     * Get the containing class or interface of this program element.
     *
     * @return a ClassDoc for this element's containing class or interface.
     * If this is a top-level class or interface, return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
public interface ProgramElementDoc extends Doc {

/**
 * Represents a java program element: class, interface, field,
 * constructor, or method.
 * This is an abstract class dealing with information common to
 * these elements.
 *
 * @see MemberDoc
 * @see ClassDoc
 *
 * @author Robert Field
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isFinal();

    /**
     * Return true if this program element is final.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPackagePrivate();

    /**
     * Return true if this program element is package private.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPrivate();

    /**
     * Return true if this program element is private.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isProtected();

    /**
     * Return true if this program element is protected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    boolean isPublic();

    /**
     * Return true if this program element is public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    AnnotationDesc[] annotations();

    /**
     * Get the annotations of this program element.
     * Return an empty array if there are none.
     *
     * @return the annotations of this program element.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    String modifiers();

    /**
     * Get modifiers string.
     * For example, for:
     * <pre>
     *   public abstract int foo() { ... }
     * </pre>
     * return "public abstract".
     * Annotations are not included.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    int modifierSpecifier();

    /**
     * Get the modifier specifier integer.
     *
     * @see java.lang.reflect.Modifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    String qualifiedName();

    /**
     * Get the fully qualified name of this program element.
     * For example, for the class <code>java.util.Hashtable</code>,
     * return "java.util.Hashtable".
     * <p>
     * For the method <code>bar()</code> in class <code>Foo</code>
     * in the unnamed package, return "Foo.bar".
     *
     * @return the qualified name of the program element as a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    PackageDoc containingPackage();

    /**
     * Get the package that this program element is contained in.
     *
     * @return a PackageDoc for this element containing package.
     * If in the unnamed package, this PackageDoc will have the
     * name "".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
    ClassDoc containingClass();

    /**
     * Get the containing class or interface of this program element.
     *
     * @return a ClassDoc for this element's containing class or interface.
     * If this is a top-level class or interface, return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/ProgramElementDoc.java
public interface ProgramElementDoc extends Doc {

/**
 * Represents a java program element: class, interface, field,
 * constructor, or method.
 * This is an abstract class dealing with information common to
 * these elements.
 *
 * @see MemberDoc
 * @see ClassDoc
 *
 * @author Robert Field
 */
