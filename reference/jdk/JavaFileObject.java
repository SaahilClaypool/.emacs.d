_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
    Modifier getAccessLevel();

    /**
     * Provides a hint about the access level of the class represented
     * by this file object.  If the access level is not known or if
     * this file object does not represent a class file this method
     * returns {@code null}.
     *
     * @return the access level
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
    NestingKind getNestingKind();

    /**
     * Provides a hint about the nesting level of the class
     * represented by this file object.  This method may return
     * {@link NestingKind#MEMBER} to mean
     * {@link NestingKind#LOCAL} or {@link NestingKind#ANONYMOUS}.
     * If the nesting level is not known or this file object does not
     * represent a class file this method returns {@code null}.
     *
     * @return the nesting kind, or {@code null} if the nesting kind
     * is not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
    boolean isNameCompatible(String simpleName, Kind kind);

    /**
     * Checks if this file object is compatible with the specified
     * simple name and kind.  A simple name is a single identifier
     * (not qualified) as defined in
     * <cite>The Java&trade; Language Specification</cite>,
     * section 6.2 "Names and Identifiers".
     *
     * @param simpleName a simple name of a class
     * @param kind a kind
     * @return {@code true} if this file object is compatible; false
     * otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
    Kind getKind();

    /**
     * Gets the kind of this file object.
     *
     * @return the kind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
        OTHER("");

        /**
         * Any other kind.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
        HTML(".html"),

        /**
         * HTML files.  For example, regular files ending with {@code
         * .html}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
        CLASS(".class"),

        /**
         * Class files for the Java Virtual Machine.  For example,
         * regular files ending with {@code .class}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
    enum Kind {

    /**
     * Kinds of JavaFileObjects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/JavaFileObject.java
public interface JavaFileObject extends FileObject {

/**
 * File abstraction for tools operating on Java&trade; programming language
 * source and class files.
 *
 * <p>All methods in this interface might throw a SecurityException if
 * a security exception occurs.
 *
 * <p>Unless explicitly allowed, all methods in this interface might
 * throw a NullPointerException if given a {@code null} argument.
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @see JavaFileManager
 * @since 1.6
 */
