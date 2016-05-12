_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private class ForwardingMethodGenerator extends TypeConvertingMethodAdapter {

    /**
     * This class generates a method body which calls the lambda implementation
     * method, converting arguments, as needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateSerializationHostileMethods() {

    /**
     * Generate a readObject/writeObject method that is hostile to serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateSerializationFriendlyMethods() {

    /**
     * Generate a writeReplace method that supports serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateConstructor() {

    /**
     * Generate the constructor for the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateFactory() {

    /**
     * Generate the factory method for the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private Class<?> spinInnerClass() throws LambdaConversionException {

    /**
     * Generate a class file which implements the functional
     * interface, define and return the class.
     *
     * @implNote The class that is generated does not include signature
     * information for exceptions that may be present on the SAM method.
     * This is to reduce classfile size, and is harmless as checked exceptions
     * are erased anyway, no one will ever compile against this classfile,
     * and we make no guarantees about the reflective properties of lambda
     * objects.
     *
     * @return a Class which implements the functional interface
     * @throws LambdaConversionException If properly formed functional interface
     * is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    @Override

    /**
     * Build the CallSite. Generate a class file which implements the functional
     * interface, define the class, if there are no parameters create an instance
     * of the class which the CallSite will return, otherwise, generate handles
     * which will call the class' constructor.
     *
     * @return a CallSite, which, when invoked, will return an instance of the
     * functional interface
     * @throws ReflectiveOperationException
     * @throws LambdaConversionException If properly formed functional interface
     * is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    public InnerClassLambdaMetafactory(MethodHandles.Lookup caller,
                                       MethodType invokedType,
                                       String samMethodName,
                                       MethodType samMethodType,
                                       MethodHandle implMethod,
                                       MethodType instantiatedMethodType,
                                       boolean isSerializable,
                                       Class<?>[] markerInterfaces,
                                       MethodType[] additionalBridges)

    /**
     * General meta-factory constructor, supporting both standard cases and
     * allowing for uncommon options such as serialization or bridging.
     *
     * @param caller Stacked automatically by VM; represents a lookup context
     *               with the accessibility privileges of the caller.
     * @param invokedType Stacked automatically by VM; the signature of the
     *                    invoked method, which includes the expected static
     *                    type of the returned lambda object, and the static
     *                    types of the captured arguments for the lambda.  In
     *                    the event that the implementation method is an
     *                    instance method, the first argument in the invocation
     *                    signature will correspond to the receiver.
     * @param samMethodName Name of the method in the functional interface to
     *                      which the lambda or method reference is being
     *                      converted, represented as a String.
     * @param samMethodType Type of the method in the functional interface to
     *                      which the lambda or method reference is being
     *                      converted, represented as a MethodType.
     * @param implMethod The implementation method which should be called (with
     *                   suitable adaptation of argument types, return types,
     *                   and adjustment for captured arguments) when methods of
     *                   the resulting functional interface instance are invoked.
     * @param instantiatedMethodType The signature of the primary functional
     *                               interface method after type variables are
     *                               substituted with their instantiation from
     *                               the capture site
     * @param isSerializable Should the lambda be made serializable?  If set,
     *                       either the target type or one of the additional SAM
     *                       types must extend {@code Serializable}.
     * @param markerInterfaces Additional interfaces which the lambda object
     *                       should implement.
     * @param additionalBridges Method types for additional signatures to be
     *                          bridged to the implementation method
     * @throws LambdaConversionException If any of the meta-factory protocol
     * invariants are violated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
/* package */ final class InnerClassLambdaMetafactory extends AbstractValidatingLambdaMetafactory {

/**
 * Lambda metafactory implementation which dynamically creates an
 * inner-class-like class per lambda callsite.
 *
 * @see LambdaMetafactory
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private class ForwardingMethodGenerator extends TypeConvertingMethodAdapter {

    /**
     * This class generates a method body which calls the lambda implementation
     * method, converting arguments, as needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateSerializationHostileMethods() {

    /**
     * Generate a readObject/writeObject method that is hostile to serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateSerializationFriendlyMethods() {

    /**
     * Generate a writeReplace method that supports serialization
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateConstructor() {

    /**
     * Generate the constructor for the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private void generateFactory() {

    /**
     * Generate the factory method for the class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    private Class<?> spinInnerClass() throws LambdaConversionException {

    /**
     * Generate a class file which implements the functional
     * interface, define and return the class.
     *
     * @implNote The class that is generated does not include signature
     * information for exceptions that may be present on the SAM method.
     * This is to reduce classfile size, and is harmless as checked exceptions
     * are erased anyway, no one will ever compile against this classfile,
     * and we make no guarantees about the reflective properties of lambda
     * objects.
     *
     * @return a Class which implements the functional interface
     * @throws LambdaConversionException If properly formed functional interface
     * is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    @Override

    /**
     * Build the CallSite. Generate a class file which implements the functional
     * interface, define the class, if there are no parameters create an instance
     * of the class which the CallSite will return, otherwise, generate handles
     * which will call the class' constructor.
     *
     * @return a CallSite, which, when invoked, will return an instance of the
     * functional interface
     * @throws ReflectiveOperationException
     * @throws LambdaConversionException If properly formed functional interface
     * is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
    public InnerClassLambdaMetafactory(MethodHandles.Lookup caller,
                                       MethodType invokedType,
                                       String samMethodName,
                                       MethodType samMethodType,
                                       MethodHandle implMethod,
                                       MethodType instantiatedMethodType,
                                       boolean isSerializable,
                                       Class<?>[] markerInterfaces,
                                       MethodType[] additionalBridges)

    /**
     * General meta-factory constructor, supporting both standard cases and
     * allowing for uncommon options such as serialization or bridging.
     *
     * @param caller Stacked automatically by VM; represents a lookup context
     *               with the accessibility privileges of the caller.
     * @param invokedType Stacked automatically by VM; the signature of the
     *                    invoked method, which includes the expected static
     *                    type of the returned lambda object, and the static
     *                    types of the captured arguments for the lambda.  In
     *                    the event that the implementation method is an
     *                    instance method, the first argument in the invocation
     *                    signature will correspond to the receiver.
     * @param samMethodName Name of the method in the functional interface to
     *                      which the lambda or method reference is being
     *                      converted, represented as a String.
     * @param samMethodType Type of the method in the functional interface to
     *                      which the lambda or method reference is being
     *                      converted, represented as a MethodType.
     * @param implMethod The implementation method which should be called (with
     *                   suitable adaptation of argument types, return types,
     *                   and adjustment for captured arguments) when methods of
     *                   the resulting functional interface instance are invoked.
     * @param instantiatedMethodType The signature of the primary functional
     *                               interface method after type variables are
     *                               substituted with their instantiation from
     *                               the capture site
     * @param isSerializable Should the lambda be made serializable?  If set,
     *                       either the target type or one of the additional SAM
     *                       types must extend {@code Serializable}.
     * @param markerInterfaces Additional interfaces which the lambda object
     *                       should implement.
     * @param additionalBridges Method types for additional signatures to be
     *                          bridged to the implementation method
     * @throws LambdaConversionException If any of the meta-factory protocol
     * invariants are violated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/InnerClassLambdaMetafactory.java
/* package */ final class InnerClassLambdaMetafactory extends AbstractValidatingLambdaMetafactory {

/**
 * Lambda metafactory implementation which dynamically creates an
 * inner-class-like class per lambda callsite.
 *
 * @see LambdaMetafactory
 */
