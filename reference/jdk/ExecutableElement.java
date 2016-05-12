_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    @Override

    /**
     * Returns the simple name of a constructor, method, or
     * initializer.  For a constructor, the name {@code "<init>"} is
     * returned, for a static initializer, the name {@code "<clinit>"}
     * is returned, and for an anonymous class or instance
     * initializer, an empty name is returned.
     *
     * @return the simple name of a constructor, method, or
     * initializer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    AnnotationValue getDefaultValue();

    /**
     * Returns the default value if this executable is an annotation
     * type element.  Returns {@code null} if this method is not an
     * annotation type element, or if it is an annotation type element
     * with no default value.
     *
     * @return the default value, or {@code null} if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    List<? extends TypeMirror> getThrownTypes();

    /**
     * Returns the exceptions and other throwables listed in this
     * method or constructor's {@code throws} clause in declaration
     * order.
     *
     * @return the exceptions and other throwables listed in the
     * {@code throws} clause, or an empty list if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    boolean isDefault();

    /**
     * Returns {@code true} if this method is a default method and
     * returns {@code false} otherwise.
     *
     * @return {@code true} if this method is a default method and
     * {@code false} otherwise
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    boolean isVarArgs();

    /**
     * Returns {@code true} if this method or constructor accepts a variable
     * number of arguments and returns {@code false} otherwise.
     *
     * @return {@code true} if this method or constructor accepts a variable
     * number of arguments and {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    TypeMirror getReceiverType();

    /**
     * Returns the receiver type of this executable,
     * or {@link javax.lang.model.type.NoType NoType} with
     * kind {@link javax.lang.model.type.TypeKind#NONE NONE}
     * if the executable has no receiver type.
     *
     * An executable which is an instance method, or a constructor of an
     * inner class, has a receiver type derived from the {@linkplain
     * #getEnclosingElement declaring type}.
     *
     * An executable which is a static method, or a constructor of a
     * non-inner class, or an initializer (static or instance), has no
     * receiver type.
     *
     * @return the receiver type of this executable
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    List<? extends VariableElement> getParameters();

    /**
     * Returns the formal parameters of this executable.
     * They are returned in declaration order.
     *
     * @return the formal parameters,
     * or an empty list if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
    TypeMirror getReturnType();

    /**
     * Returns the return type of this executable.
     * Returns a {@link NoType} with kind {@link TypeKind#VOID VOID}
     * if this executable is not a method, or is a method that does not
     * return a value.
     *
     * @return the return type of this executable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ExecutableElement.java
public interface ExecutableElement extends Element, Parameterizable {

/**
 * Represents a method, constructor, or initializer (static or
 * instance) of a class or interface, including annotation type
 * elements.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see ExecutableType
 * @since 1.6
 */
