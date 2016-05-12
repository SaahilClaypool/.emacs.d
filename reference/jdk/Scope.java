_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public Iterable<? extends Element> getLocalElements();

    /**
     * Returns the elements directly contained in this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public ExecutableElement getEnclosingMethod();

    /**
     * Returns the innermost executable element containing the position of this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public TypeElement getEnclosingClass();

    /**
     * Returns the innermost type element containing the position of this scope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public Scope getEnclosingScope();

    /**
     * Returns the enclosing scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
@jdk.Exported

/**
 * Interface for determining locally available program elements, such as
 * local variables and imports.
 * Upon creation, a Scope is associated with a given program position;
 * for example, a {@linkplain Tree tree node}. This position may be used to
 * infer an enclosing method and/or class.
 *
 * <p>A Scope does not itself contain the details of the elements corresponding
 * to the parameters, methods and fields of the methods and classes containing
 * its position. However, these elements can be determined from the enclosing
 * elements.
 *
 * <p>Scopes may be contained in an enclosing scope. The outermost scope contains
 * those elements available via "star import" declarations; the scope within that
 * contains the top level elements of the compilation unit, including any named
 * imports.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public Iterable<? extends Element> getLocalElements();

    /**
     * Returns the elements directly contained in this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public ExecutableElement getEnclosingMethod();

    /**
     * Returns the innermost executable element containing the position of this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public TypeElement getEnclosingClass();

    /**
     * Returns the innermost type element containing the position of this scope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
    public Scope getEnclosingScope();

    /**
     * Returns the enclosing scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Scope.java
@jdk.Exported

/**
 * Interface for determining locally available program elements, such as
 * local variables and imports.
 * Upon creation, a Scope is associated with a given program position;
 * for example, a {@linkplain Tree tree node}. This position may be used to
 * infer an enclosing method and/or class.
 *
 * <p>A Scope does not itself contain the details of the elements corresponding
 * to the parameters, methods and fields of the methods and classes containing
 * its position. However, these elements can be determined from the enclosing
 * elements.
 *
 * <p>Scopes may be contained in an enclosing scope. The outermost scope contains
 * those elements available via "star import" declarations; the scope within that
 * contains the top level elements of the compilation unit, including any named
 * imports.
 *
 * @since 1.6
 */
