_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    @Override

    /**
     * Returns the package of a top-level type and returns the
     * immediately lexically enclosing element for a {@linkplain
     * NestingKind#isNested nested} type.
     *
     * @return the package of a top-level type, the immediately
     * lexically enclosing element for a nested type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    List<? extends TypeParameterElement> getTypeParameters();

    /**
     * Returns the formal type parameters of this type element
     * in declaration order.
     *
     * @return the formal type parameters, or an empty list
     * if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    List<? extends TypeMirror> getInterfaces();

    /**
     * Returns the interface types directly implemented by this class
     * or extended by this interface.
     *
     * @return the interface types directly implemented by this class
     * or extended by this interface, or an empty list if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    TypeMirror getSuperclass();

    /**
     * Returns the direct superclass of this type element.
     * If this type element represents an interface or the class
     * {@code java.lang.Object}, then a {@link NoType}
     * with kind {@link TypeKind#NONE NONE} is returned.
     *
     * @return the direct superclass, or a {@code NoType} if there is none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    @Override

    /**
     * Returns the simple name of this type element.
     *
     * For an anonymous class, an empty name is returned.
     *
     * @return the simple name of this class or interface,
     * an empty name for an anonymous class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    Name getQualifiedName();

    /**
     * Returns the fully qualified name of this type element.
     * More precisely, it returns the <i>canonical</i> name.
     * For local and anonymous classes, which do not have canonical names,
     * an empty name is returned.
     *
     * <p>The name of a generic type does not include any reference
     * to its formal type parameters.
     * For example, the fully qualified name of the interface
     * {@code java.util.Set<E>} is "{@code java.util.Set}".
     * Nested types use "{@code .}" as a separator, as in
     * "{@code java.util.Map.Entry}".
     *
     * @return the fully qualified name of this class or interface, or
     * an empty name if none
     *
     * @see Elements#getBinaryName
     * @jls 6.7 Fully Qualified Names and Canonical Names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
    NestingKind getNestingKind();

    /**
     * Returns the <i>nesting kind</i> of this type element.
     *
     * @return the nesting kind of this type element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/TypeElement.java
public interface TypeElement extends Element, Parameterizable, QualifiedNameable {

/**
 * Represents a class or interface program element.  Provides access
 * to information about the type and its members.  Note that an enum
 * type is a kind of class and an annotation type is a kind of
 * interface.
 *
 * <p> <a name="ELEM_VS_TYPE"></a>
 * While a {@code TypeElement} represents a class or interface
 * <i>element</i>, a {@link DeclaredType} represents a class
 * or interface <i>type</i>, the latter being a use
 * (or <i>invocation</i>) of the former.
 * The distinction is most apparent with generic types,
 * for which a single element can define a whole
 * family of types.  For example, the element
 * {@code java.util.Set} corresponds to the parameterized types
 * {@code java.util.Set<String>} and {@code java.util.Set<Number>}
 * (and many others), and to the raw type {@code java.util.Set}.
 *
 * <p> Each method of this interface that returns a list of elements
 * will return them in the order that is natural for the underlying
 * source of program information.  For example, if the underlying
 * source of information is Java source code, then the elements will be
 * returned in source code order.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see DeclaredType
 * @since 1.6
 */
