_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getOwnerType();

    /**
     * Returns a {@code Type} object representing the type that this type
     * is a member of.  For example, if this type is {@code O<T>.I<S>},
     * return a representation of {@code O<T>}.
     *
     * <p>If this type is a top-level type, {@code null} is returned.
     *
     * @return a {@code Type} object representing the type that
     *     this type is a member of. If this type is a top-level type,
     *     {@code null} is returned
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getRawType();

    /**
     * Returns the {@code Type} object representing the class or interface
     * that declared this type.
     *
     * @return the {@code Type} object representing the class or interface
     *     that declared this type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type[] getActualTypeArguments();

    /**
     * Returns an array of {@code Type} objects representing the actual type
     * arguments to this type.
     *
     * <p>Note that in some cases, the returned array be empty. This can occur
     * if this type represents a non-parameterized type nested within
     * a parameterized type.
     *
     * @return an array of {@code Type} objects representing the actual type
     *     arguments to this type
     * @throws TypeNotPresentException if any of the
     *     actual type arguments refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     actual type parameters refer to a parameterized type that cannot
     *     be instantiated for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * ParameterizedType represents a parameterized type such as
 * Collection&lt;String&gt;.
 *
 * <p>A parameterized type is created the first time it is needed by a
 * reflective method, as specified in this package. When a
 * parameterized type p is created, the generic type declaration that
 * p instantiates is resolved, and all type arguments of p are created
 * recursively. See {@link java.lang.reflect.TypeVariable
 * TypeVariable} for details on the creation process for type
 * variables. Repeated creation of a parameterized type has no effect.
 *
 * <p>Instances of classes that implement this interface must implement
 * an equals() method that equates any two instances that share the
 * same generic type declaration and have equal type parameters.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
    Type containingType();

    /**
     * Return the type that contains this type as a member.
     * Return null is this is a top-level type.
     *
     * <p> For example, the containing type of
     * {@code AnInterface.Nested<Number>} is the <code>ClassDoc</code>
     * representing {@code AnInterface}, and the containing type of
     * {@code Outer<String>.Inner<Number>} is the
     * <code>ParameterizedType</code> representing {@code Outer<String>}.
     *
     * @return the type that contains this type as a member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
    Type[] interfaceTypes();

    /**
     * Return the interface types directly implemented by or extended by this
     * parameterized type.
     * These are the interfaces directly implemented or extended
     * by this type's declaring class or interface,
     * with type arguments substituted in.
     * Return an empty array if there are no interfaces.
     *
     * <p> For example, the interface extended by
     * {@code java.util.Set<String>} is {@code java.util.Collection<String>}.
     *
     * @return the interface types directly implemented by or extended by this
     * parameterized type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
    Type superclassType();

    /**
     * Return the class type that is a direct supertype of this one.
     * This is the superclass of this type's declaring class,
     * with type arguments substituted in.
     * Return null if this is an interface type.
     *
     * <p> For example, if this parameterized type is
     * {@code java.util.ArrayList<String>}, the result will be
     * {@code java.util.AbstractList<String>}.
     *
     * @return the class type that is a direct supertype of this one.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
    Type[] typeArguments();

    /**
     * Return the actual type arguments of this type.
     * For a generic type that is nested within some other generic type
     * (such as {@code Outer<T>.Inner<S>}),
     * only the type arguments of the innermost type are included.
     *
     * @return the actual type arguments of this type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
    ClassDoc asClassDoc();

    /**
     * Return the generic class or interface that declared this type.
     *
     * @return the generic class or interface that declared this type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * Represents an invocation of a generic class or interface.  For example,
 * given the generic interface {@code List<E>}, possible invocations
 * include:
 * <pre>
 *      {@code List<String>}
 *      {@code List<T extends Number>}
 *      {@code List<?>}
 * </pre>
 * A generic inner class {@code Outer<T>.Inner<S>} might be invoked as:
 * <pre>
 *      {@code Outer<Number>.Inner<String>}
 * </pre>
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getOwnerType();

    /**
     * Returns a {@code Type} object representing the type that this type
     * is a member of.  For example, if this type is {@code O<T>.I<S>},
     * return a representation of {@code O<T>}.
     *
     * <p>If this type is a top-level type, {@code null} is returned.
     *
     * @return a {@code Type} object representing the type that
     *     this type is a member of. If this type is a top-level type,
     *     {@code null} is returned
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getRawType();

    /**
     * Returns the {@code Type} object representing the class or interface
     * that declared this type.
     *
     * @return the {@code Type} object representing the class or interface
     *     that declared this type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type[] getActualTypeArguments();

    /**
     * Returns an array of {@code Type} objects representing the actual type
     * arguments to this type.
     *
     * <p>Note that in some cases, the returned array be empty. This can occur
     * if this type represents a non-parameterized type nested within
     * a parameterized type.
     *
     * @return an array of {@code Type} objects representing the actual type
     *     arguments to this type
     * @throws TypeNotPresentException if any of the
     *     actual type arguments refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     actual type parameters refer to a parameterized type that cannot
     *     be instantiated for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * ParameterizedType represents a parameterized type such as
 * Collection&lt;String&gt;.
 *
 * <p>A parameterized type is created the first time it is needed by a
 * reflective method, as specified in this package. When a
 * parameterized type p is created, the generic type declaration that
 * p instantiates is resolved, and all type arguments of p are created
 * recursively. See {@link java.lang.reflect.TypeVariable
 * TypeVariable} for details on the creation process for type
 * variables. Repeated creation of a parameterized type has no effect.
 *
 * <p>Instances of classes that implement this interface must implement
 * an equals() method that equates any two instances that share the
 * same generic type declaration and have equal type parameters.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getOwnerType();

    /**
     * Returns a {@code Type} object representing the type that this type
     * is a member of.  For example, if this type is {@code O<T>.I<S>},
     * return a representation of {@code O<T>}.
     *
     * <p>If this type is a top-level type, {@code null} is returned.
     *
     * @return a {@code Type} object representing the type that
     *     this type is a member of. If this type is a top-level type,
     *     {@code null} is returned
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getRawType();

    /**
     * Returns the {@code Type} object representing the class or interface
     * that declared this type.
     *
     * @return the {@code Type} object representing the class or interface
     *     that declared this type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type[] getActualTypeArguments();

    /**
     * Returns an array of {@code Type} objects representing the actual type
     * arguments to this type.
     *
     * <p>Note that in some cases, the returned array be empty. This can occur
     * if this type represents a non-parameterized type nested within
     * a parameterized type.
     *
     * @return an array of {@code Type} objects representing the actual type
     *     arguments to this type
     * @throws TypeNotPresentException if any of the
     *     actual type arguments refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     actual type parameters refer to a parameterized type that cannot
     *     be instantiated for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * ParameterizedType represents a parameterized type such as
 * Collection&lt;String&gt;.
 *
 * <p>A parameterized type is created the first time it is needed by a
 * reflective method, as specified in this package. When a
 * parameterized type p is created, the generic type declaration that
 * p instantiates is resolved, and all type arguments of p are created
 * recursively. See {@link java.lang.reflect.TypeVariable
 * TypeVariable} for details on the creation process for type
 * variables. Repeated creation of a parameterized type has no effect.
 *
 * <p>Instances of classes that implement this interface must implement
 * an equals() method that equates any two instances that share the
 * same generic type declaration and have equal type parameters.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getOwnerType();

    /**
     * Returns a {@code Type} object representing the type that this type
     * is a member of.  For example, if this type is {@code O<T>.I<S>},
     * return a representation of {@code O<T>}.
     *
     * <p>If this type is a top-level type, {@code null} is returned.
     *
     * @return a {@code Type} object representing the type that
     *     this type is a member of. If this type is a top-level type,
     *     {@code null} is returned
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getRawType();

    /**
     * Returns the {@code Type} object representing the class or interface
     * that declared this type.
     *
     * @return the {@code Type} object representing the class or interface
     *     that declared this type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type[] getActualTypeArguments();

    /**
     * Returns an array of {@code Type} objects representing the actual type
     * arguments to this type.
     *
     * <p>Note that in some cases, the returned array be empty. This can occur
     * if this type represents a non-parameterized type nested within
     * a parameterized type.
     *
     * @return an array of {@code Type} objects representing the actual type
     *     arguments to this type
     * @throws TypeNotPresentException if any of the
     *     actual type arguments refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     actual type parameters refer to a parameterized type that cannot
     *     be instantiated for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * ParameterizedType represents a parameterized type such as
 * Collection&lt;String&gt;.
 *
 * <p>A parameterized type is created the first time it is needed by a
 * reflective method, as specified in this package. When a
 * parameterized type p is created, the generic type declaration that
 * p instantiates is resolved, and all type arguments of p are created
 * recursively. See {@link java.lang.reflect.TypeVariable
 * TypeVariable} for details on the creation process for type
 * variables. Repeated creation of a parameterized type has no effect.
 *
 * <p>Instances of classes that implement this interface must implement
 * an equals() method that equates any two instances that share the
 * same generic type declaration and have equal type parameters.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getOwnerType();

    /**
     * Returns a {@code Type} object representing the type that this type
     * is a member of.  For example, if this type is {@code O<T>.I<S>},
     * return a representation of {@code O<T>}.
     *
     * <p>If this type is a top-level type, {@code null} is returned.
     *
     * @return a {@code Type} object representing the type that
     *     this type is a member of. If this type is a top-level type,
     *     {@code null} is returned
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type getRawType();

    /**
     * Returns the {@code Type} object representing the class or interface
     * that declared this type.
     *
     * @return the {@code Type} object representing the class or interface
     *     that declared this type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
    Type[] getActualTypeArguments();

    /**
     * Returns an array of {@code Type} objects representing the actual type
     * arguments to this type.
     *
     * <p>Note that in some cases, the returned array be empty. This can occur
     * if this type represents a non-parameterized type nested within
     * a parameterized type.
     *
     * @return an array of {@code Type} objects representing the actual type
     *     arguments to this type
     * @throws TypeNotPresentException if any of the
     *     actual type arguments refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     actual type parameters refer to a parameterized type that cannot
     *     be instantiated for any reason
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/ParameterizedType.java
public interface ParameterizedType extends Type {

/**
 * ParameterizedType represents a parameterized type such as
 * Collection&lt;String&gt;.
 *
 * <p>A parameterized type is created the first time it is needed by a
 * reflective method, as specified in this package. When a
 * parameterized type p is created, the generic type declaration that
 * p instantiates is resolved, and all type arguments of p are created
 * recursively. See {@link java.lang.reflect.TypeVariable
 * TypeVariable} for details on the creation process for type
 * variables. Repeated creation of a parameterized type has no effect.
 *
 * <p>Instances of classes that implement this interface must implement
 * an equals() method that equates any two instances that share the
 * same generic type declaration and have equal type parameters.
 *
 * @since 1.5
 */
