_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Transient.java
    boolean value() default true;

    /**
     * Returns whether or not the {@code Introspector} should
     * construct artifacts for the annotated method.
     * @return whether or not the {@code Introspector} should
     * construct artifacts for the annotated method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Transient.java
@Target({METHOD})

/**
 * Indicates that an attribute called "transient"
 * should be declared with the given {@code value}
 * when the {@link Introspector} constructs
 * a {@link PropertyDescriptor} or {@link EventSetDescriptor}
 * classes associated with the annotated code element.
 * A {@code true} value for the "transient" attribute
 * indicates to encoders derived from {@link Encoder}
 * that this feature should be ignored.
 * <p>
 * The {@code Transient} annotation may be be used
 * in any of the methods that are involved
 * in a {@link FeatureDescriptor} subclass
 * to identify the transient feature in the annotated class and its subclasses.
 * Normally, the method that starts with "get" is the best place
 * to put the annotation and it is this declaration
 * that takes precedence in the case of multiple annotations
 * being defined for the same feature.
 * <p>
 * To declare a feature non-transient in a class
 * whose superclass declares it transient,
 * use {@code @Transient(false)}.
 * In all cases, the {@link Introspector} decides
 * if a feature is transient by referring to the annotation
 * on the most specific superclass.
 * If no {@code Transient} annotation is present
 * in any superclass the feature is not transient.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Transient.java
    boolean value() default true;

    /**
     * Returns whether or not the {@code Introspector} should
     * construct artifacts for the annotated method.
     * @return whether or not the {@code Introspector} should
     * construct artifacts for the annotated method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Transient.java
@Target({METHOD})

/**
 * Indicates that an attribute called "transient"
 * should be declared with the given {@code value}
 * when the {@link Introspector} constructs
 * a {@link PropertyDescriptor} or {@link EventSetDescriptor}
 * classes associated with the annotated code element.
 * A {@code true} value for the "transient" attribute
 * indicates to encoders derived from {@link Encoder}
 * that this feature should be ignored.
 * <p>
 * The {@code Transient} annotation may be be used
 * in any of the methods that are involved
 * in a {@link FeatureDescriptor} subclass
 * to identify the transient feature in the annotated class and its subclasses.
 * Normally, the method that starts with "get" is the best place
 * to put the annotation and it is this declaration
 * that takes precedence in the case of multiple annotations
 * being defined for the same feature.
 * <p>
 * To declare a feature non-transient in a class
 * whose superclass declares it transient,
 * use {@code @Transient(false)}.
 * In all cases, the {@link Introspector} decides
 * if a feature is transient by referring to the annotation
 * on the most specific superclass.
 * If no {@code Transient} annotation is present
 * in any superclass the feature is not transient.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSIENT.java
    public TRANSIENT(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSIENT</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSIENT.java
    public TRANSIENT(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSIENT</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSIENT.java
    public TRANSIENT(String s) {

    /**
     * Constructs a <code>TRANSIENT</code> exception with the specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSIENT.java
public final class TRANSIENT extends SystemException {

/**
 * Exception  thrown when the ORB attempted to reach an object and failed.
 * It is not an indication that an object does not exist. Instead, it simply
 * means that no further determination of an object's status was possible
 * because it could not be reached. This exception is raised if an attempt
 * to establish a connection fails, for example, because the server or the
 * implementation repository is down.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
