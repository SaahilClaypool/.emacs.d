_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    boolean overrides(MethodDoc meth);

    /**
     * Tests whether this method overrides another.
     * The overridden method may be one declared in a superclass or
     * a superinterface (unlike {@link #overriddenMethod()}).
     *
     * <p> When a non-abstract method overrides an abstract one, it is
     * also said to <i>implement</i> the other.
     *
     * @param meth  the other method to examine
     * @return <tt>true</tt> if this method overrides the other
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    MethodDoc overriddenMethod();

    /**
     * Return the method that this method overrides.
     *
     * @return a MethodDoc representing a method definition
     * in a superclass this method overrides, null if
     * this method does not override.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    Type overriddenType();

    /**
     * Return the type containing the method that this method overrides.
     * It may be a <code>ClassDoc</code> or a <code>ParameterizedType</code>.
     *
     * @return the supertype whose method is overridden, or null if this
     *         method does not override another in a superclass
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    ClassDoc overriddenClass();

    /**
     * Return the class containing the method that this method overrides.
     *
     * <p> <i>The <code>overriddenClass</code> method cannot
     * accommodate certain generic type constructs.  The
     * <code>overriddenType</code> method should be used instead.</i>
     *
     * @return a ClassDoc representing the superclass
     *         defining a method that this method overrides, or null if
     *         this method does not override.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    Type returnType();

    /**
     * Get return type.
     *
     * @return the return type of this method, null if it
     * is a constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    boolean isDefault();

    /**
     * Return true if this method is default
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
    boolean isAbstract();

    /**
     * Return true if this method is abstract
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/MethodDoc.java
public interface MethodDoc extends ExecutableMemberDoc {

/**
 * Represents a method of a java class.
 *
 * @since 1.2
 * @author Robert Field
 */
