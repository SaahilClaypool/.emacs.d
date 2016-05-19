_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    TypeVariable[] typeParameters();

    /**
     * Return the formal type parameters of this method or constructor.
     * Return an empty array if this method or constructor is not generic.
     *
     * @return the formal type parameters of this method or constructor.
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    String flatSignature();

    /**
     * get flat signature.  all types are not qualified.
     *      return a String, which is the flat signiture of this member.
     *      It is the parameter list, type is not qualified.
     *      For instance, for a method <code>mymethod(String x, int y)</code>,
     *      it will return <code>(String, int)</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    String signature();

    /**
     * Get the signature. It is the parameter list, type is qualified.
     *      For instance, for a method <code>mymethod(String x, int y)</code>,
     *      it will return <code>(java.lang.String,int)</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    ParamTag[] typeParamTags();

    /**
     * Return the type parameter tags in this method.
     *
     * @return an array of ParamTag containing all <code>&#64;param</code> tags
     * corresponding to the type parameters of this method.
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    ParamTag[] paramTags();

    /**
     * Return the param tags in this method, excluding the type
     * parameter tags.
     *
     * @return an array of ParamTag containing all <code>&#64;param</code> tags
     * corresponding to the parameters of this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    ThrowsTag[] throwsTags();

    /**
     * Return the throws tags in this method.
     *
     * @return an array of ThrowTag containing all <code>&#64;exception</code>
     * and <code>&#64;throws</code> tags.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    Type receiverType();

    /**
     * Get the receiver type of this executable element.
     *
     * @return the receiver type of this executable element.
     * @since 1.8
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    Parameter[] parameters();

    /**
     * Get argument information.
     *
     * @see Parameter
     *
     * @return an array of Parameter, one element per argument
     * in the order the arguments are present.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    public boolean isVarArgs();

    /**
     * Return true if this method was declared to take a variable number
     * of arguments.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    boolean isSynchronized();

    /**
     * Return true if this method is synchronized
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    boolean isNative();

    /**
     * Return true if this method is native
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    Type[] thrownExceptionTypes();

    /**
     * Return exceptions this method or constructor throws.
     *
     * @return an array representing the exceptions thrown by this method.
     *         Each array element is either a <code>ClassDoc</code> or a
     *         <code>TypeVariable</code>.
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
    ClassDoc[] thrownExceptions();

    /**
     * Return exceptions this method or constructor throws.
     * If the type of the exception is a type variable, return the
     * <code>ClassDoc</code> of its erasure.
     *
     * <p> <i>The <code>thrownExceptions</code> method cannot
     * accommodate certain generic type constructs.  The
     * <code>thrownExceptionTypes</code> method should be used
     * instead.</i>
     *
     * @return an array of ClassDoc[] representing the exceptions
     *         thrown by this method.
     * @see #thrownExceptionTypes
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/ExecutableMemberDoc.java
public interface ExecutableMemberDoc extends MemberDoc {

/**
 * Represents a method or constructor of a java class.
 *
 * @since 1.2
 * @author Robert Field
 */
