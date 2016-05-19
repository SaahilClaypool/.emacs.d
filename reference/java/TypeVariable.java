_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
     AnnotatedType[] getAnnotatedBounds();

    /**
     * Returns an array of AnnotatedType objects that represent the use of
     * types to denote the upper bounds of the type parameter represented by
     * this TypeVariable. The order of the objects in the array corresponds to
     * the order of the bounds in the declaration of the type parameter.
     *
     * Returns an array of length 0 if the type parameter declares no bounds.
     *
     * @return an array of objects representing the upper bounds of the type variable
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    String getName();

    /**
     * Returns the name of this type variable, as it occurs in the source code.
     *
     * @return the name of this type variable, as it appears in the source code
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    D getGenericDeclaration();

    /**
     * Returns the {@code GenericDeclaration} object representing the
     * generic declaration declared this type variable.
     *
     * @return the generic declaration declared for this type variable.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    Type[] getBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * upper bound(s) of this type variable.  Note that if no upper bound is
     * explicitly declared, the upper bound is {@code Object}.
     *
     * <p>For each upper bound B: <ul> <li>if B is a parameterized
     * type or a type variable, it is created, (see {@link
     * java.lang.reflect.ParameterizedType ParameterizedType} for the
     * details of the creation process for parameterized types).
     * <li>Otherwise, B is resolved.  </ul>
     *
     * @throws TypeNotPresentException  if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     * @return an array of {@code Type}s representing the upper
     *     bound(s) of this type variable
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
public interface TypeVariable<D extends GenericDeclaration> extends Type, AnnotatedElement {

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.  If a type variable t is referenced
 * by a type (i.e, class, interface or annotation type) T, and T is declared
 * by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
 * requires the resolution (see JVMS 5) of the ith enclosing class of T,
 * for i = 0 to n, inclusive. Creating a type variable must not cause the
 * creation of its bounds. Repeated creation of a type variable has no effect.
 *
 * <p>Multiple objects may be instantiated at run-time to
 * represent a given type variable. Even though a type variable is
 * created only once, this does not imply any requirement to cache
 * instances representing the type variable. However, all instances
 * representing a type variable must be equal() to each other.
 * As a consequence, users of type variables must not rely on the identity
 * of instances of classes implementing this interface.
 *
 * @param <D> the type of generic declaration that declared the
 * underlying type variable.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/TypeVariable.java
    public AnnotationDesc[] annotations();

    /**
     * Get the annotations of this program element.
     * Return an empty array if there are none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/TypeVariable.java
    ProgramElementDoc owner();

    /**
     * Return the class, interface, method, or constructor within
     * which this type variable is declared.
     *
     * @return the class, interface, method, or constructor within
     *         which this type variable is declared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/TypeVariable.java
    Type[] bounds();

    /**
     * Return the bounds of this type variable.
     * These are the types given by the <i>extends</i> clause.
     * Return an empty array if there are no explicit bounds.
     *
     * @return the bounds of this type variable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/TypeVariable.java
public interface TypeVariable extends Type {

/**
 * Represents a type variable.
 * For example, the generic interface {@code List<E>} has a single
 * type variable {@code E}.
 * A type variable may have explicit bounds, as in
 * {@code C<R extends Remote>}.
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
     AnnotatedType[] getAnnotatedBounds();

    /**
     * Returns an array of AnnotatedType objects that represent the use of
     * types to denote the upper bounds of the type parameter represented by
     * this TypeVariable. The order of the objects in the array corresponds to
     * the order of the bounds in the declaration of the type parameter.
     *
     * Returns an array of length 0 if the type parameter declares no bounds.
     *
     * @return an array of objects representing the upper bounds of the type variable
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    String getName();

    /**
     * Returns the name of this type variable, as it occurs in the source code.
     *
     * @return the name of this type variable, as it appears in the source code
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    D getGenericDeclaration();

    /**
     * Returns the {@code GenericDeclaration} object representing the
     * generic declaration declared this type variable.
     *
     * @return the generic declaration declared for this type variable.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    Type[] getBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * upper bound(s) of this type variable.  Note that if no upper bound is
     * explicitly declared, the upper bound is {@code Object}.
     *
     * <p>For each upper bound B: <ul> <li>if B is a parameterized
     * type or a type variable, it is created, (see {@link
     * java.lang.reflect.ParameterizedType ParameterizedType} for the
     * details of the creation process for parameterized types).
     * <li>Otherwise, B is resolved.  </ul>
     *
     * @throws TypeNotPresentException  if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     * @return an array of {@code Type}s representing the upper
     *     bound(s) of this type variable
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
public interface TypeVariable<D extends GenericDeclaration> extends Type, AnnotatedElement {

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.  If a type variable t is referenced
 * by a type (i.e, class, interface or annotation type) T, and T is declared
 * by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
 * requires the resolution (see JVMS 5) of the ith enclosing class of T,
 * for i = 0 to n, inclusive. Creating a type variable must not cause the
 * creation of its bounds. Repeated creation of a type variable has no effect.
 *
 * <p>Multiple objects may be instantiated at run-time to
 * represent a given type variable. Even though a type variable is
 * created only once, this does not imply any requirement to cache
 * instances representing the type variable. However, all instances
 * representing a type variable must be equal() to each other.
 * As a consequence, users of type variables must not rely on the identity
 * of instances of classes implementing this interface.
 *
 * @param <D> the type of generic declaration that declared the
 * underlying type variable.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
     AnnotatedType[] getAnnotatedBounds();

    /**
     * Returns an array of AnnotatedType objects that represent the use of
     * types to denote the upper bounds of the type parameter represented by
     * this TypeVariable. The order of the objects in the array corresponds to
     * the order of the bounds in the declaration of the type parameter.
     *
     * Returns an array of length 0 if the type parameter declares no bounds.
     *
     * @return an array of objects representing the upper bounds of the type variable
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    String getName();

    /**
     * Returns the name of this type variable, as it occurs in the source code.
     *
     * @return the name of this type variable, as it appears in the source code
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    D getGenericDeclaration();

    /**
     * Returns the {@code GenericDeclaration} object representing the
     * generic declaration declared this type variable.
     *
     * @return the generic declaration declared for this type variable.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    Type[] getBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * upper bound(s) of this type variable.  Note that if no upper bound is
     * explicitly declared, the upper bound is {@code Object}.
     *
     * <p>For each upper bound B: <ul> <li>if B is a parameterized
     * type or a type variable, it is created, (see {@link
     * java.lang.reflect.ParameterizedType ParameterizedType} for the
     * details of the creation process for parameterized types).
     * <li>Otherwise, B is resolved.  </ul>
     *
     * @throws TypeNotPresentException  if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     * @return an array of {@code Type}s representing the upper
     *     bound(s) of this type variable
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
public interface TypeVariable<D extends GenericDeclaration> extends Type, AnnotatedElement {

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.  If a type variable t is referenced
 * by a type (i.e, class, interface or annotation type) T, and T is declared
 * by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
 * requires the resolution (see JVMS 5) of the ith enclosing class of T,
 * for i = 0 to n, inclusive. Creating a type variable must not cause the
 * creation of its bounds. Repeated creation of a type variable has no effect.
 *
 * <p>Multiple objects may be instantiated at run-time to
 * represent a given type variable. Even though a type variable is
 * created only once, this does not imply any requirement to cache
 * instances representing the type variable. However, all instances
 * representing a type variable must be equal() to each other.
 * As a consequence, users of type variables must not rely on the identity
 * of instances of classes implementing this interface.
 *
 * @param <D> the type of generic declaration that declared the
 * underlying type variable.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
     AnnotatedType[] getAnnotatedBounds();

    /**
     * Returns an array of AnnotatedType objects that represent the use of
     * types to denote the upper bounds of the type parameter represented by
     * this TypeVariable. The order of the objects in the array corresponds to
     * the order of the bounds in the declaration of the type parameter.
     *
     * Returns an array of length 0 if the type parameter declares no bounds.
     *
     * @return an array of objects representing the upper bounds of the type variable
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    String getName();

    /**
     * Returns the name of this type variable, as it occurs in the source code.
     *
     * @return the name of this type variable, as it appears in the source code
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    D getGenericDeclaration();

    /**
     * Returns the {@code GenericDeclaration} object representing the
     * generic declaration declared this type variable.
     *
     * @return the generic declaration declared for this type variable.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    Type[] getBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * upper bound(s) of this type variable.  Note that if no upper bound is
     * explicitly declared, the upper bound is {@code Object}.
     *
     * <p>For each upper bound B: <ul> <li>if B is a parameterized
     * type or a type variable, it is created, (see {@link
     * java.lang.reflect.ParameterizedType ParameterizedType} for the
     * details of the creation process for parameterized types).
     * <li>Otherwise, B is resolved.  </ul>
     *
     * @throws TypeNotPresentException  if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     * @return an array of {@code Type}s representing the upper
     *     bound(s) of this type variable
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
public interface TypeVariable<D extends GenericDeclaration> extends Type, AnnotatedElement {

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.  If a type variable t is referenced
 * by a type (i.e, class, interface or annotation type) T, and T is declared
 * by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
 * requires the resolution (see JVMS 5) of the ith enclosing class of T,
 * for i = 0 to n, inclusive. Creating a type variable must not cause the
 * creation of its bounds. Repeated creation of a type variable has no effect.
 *
 * <p>Multiple objects may be instantiated at run-time to
 * represent a given type variable. Even though a type variable is
 * created only once, this does not imply any requirement to cache
 * instances representing the type variable. However, all instances
 * representing a type variable must be equal() to each other.
 * As a consequence, users of type variables must not rely on the identity
 * of instances of classes implementing this interface.
 *
 * @param <D> the type of generic declaration that declared the
 * underlying type variable.
 *
 * @since 1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
     AnnotatedType[] getAnnotatedBounds();

    /**
     * Returns an array of AnnotatedType objects that represent the use of
     * types to denote the upper bounds of the type parameter represented by
     * this TypeVariable. The order of the objects in the array corresponds to
     * the order of the bounds in the declaration of the type parameter.
     *
     * Returns an array of length 0 if the type parameter declares no bounds.
     *
     * @return an array of objects representing the upper bounds of the type variable
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    String getName();

    /**
     * Returns the name of this type variable, as it occurs in the source code.
     *
     * @return the name of this type variable, as it appears in the source code
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    D getGenericDeclaration();

    /**
     * Returns the {@code GenericDeclaration} object representing the
     * generic declaration declared this type variable.
     *
     * @return the generic declaration declared for this type variable.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
    Type[] getBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * upper bound(s) of this type variable.  Note that if no upper bound is
     * explicitly declared, the upper bound is {@code Object}.
     *
     * <p>For each upper bound B: <ul> <li>if B is a parameterized
     * type or a type variable, it is created, (see {@link
     * java.lang.reflect.ParameterizedType ParameterizedType} for the
     * details of the creation process for parameterized types).
     * <li>Otherwise, B is resolved.  </ul>
     *
     * @throws TypeNotPresentException  if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     * @return an array of {@code Type}s representing the upper
     *     bound(s) of this type variable
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/TypeVariable.java
public interface TypeVariable<D extends GenericDeclaration> extends Type, AnnotatedElement {

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.  If a type variable t is referenced
 * by a type (i.e, class, interface or annotation type) T, and T is declared
 * by the nth enclosing class of T (see JLS 8.1.2), then the creation of t
 * requires the resolution (see JVMS 5) of the ith enclosing class of T,
 * for i = 0 to n, inclusive. Creating a type variable must not cause the
 * creation of its bounds. Repeated creation of a type variable has no effect.
 *
 * <p>Multiple objects may be instantiated at run-time to
 * represent a given type variable. Even though a type variable is
 * created only once, this does not imply any requirement to cache
 * instances representing the type variable. However, all instances
 * representing a type variable must be equal() to each other.
 * As a consequence, users of type variables must not rely on the identity
 * of instances of classes implementing this interface.
 *
 * @param <D> the type of generic declaration that declared the
 * underlying type variable.
 *
 * @since 1.5
 */
