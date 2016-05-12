_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
}

    /*********** Logging support -- for debugging only, uncomment as needed
    static final Executor logPool = Executors.newSingleThreadExecutor();
    protected static void log(final String s) {
        MethodHandleProxyLambdaMetafactory.logPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(s);
            }
        });
    }

    protected static void log(final String s, final Throwable e) {
        MethodHandleProxyLambdaMetafactory.logPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(s);
                e.printStackTrace(System.out);
            }
        });
    }
    ***********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    private boolean isAdaptableToAsReturn(Class<?> fromType, Class<?> toType) {

    /**
     * Check type adaptability for return types --
     * special handling of void type) and parameterized fromType
     * @return True if 'fromType' can be converted to 'toType'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    private boolean isAdaptableTo(Class<?> fromType, Class<?> toType, boolean strict) {

    /**
     * Check type adaptability for parameter types.
     * @param fromType Type to convert from
     * @param toType Type to convert to
     * @param strict If true, do strict checks, else allow that fromType may be parameterized
     * @return True if 'fromType' can be passed to an argument of 'toType'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    void validateMetafactoryArgs() throws LambdaConversionException {

    /**
     * Check the meta-factory arguments for errors
     * @throws LambdaConversionException if there are improper conversions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    abstract CallSite buildCallSite()

    /**
     * Build the CallSite.
     *
     * @return a CallSite, which, when invoked, will return an instance of the
     * functional interface
     * @throws ReflectiveOperationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    AbstractValidatingLambdaMetafactory(MethodHandles.Lookup caller,
                                       MethodType invokedType,
                                       String samMethodName,
                                       MethodType samMethodType,
                                       MethodHandle implMethod,
                                       MethodType instantiatedMethodType,
                                       boolean isSerializable,
                                       Class<?>[] markerInterfaces,
                                       MethodType[] additionalBridges)

    /**
     * Meta-factory constructor.
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
     * @param implMethod The implementation method which should be called
     *                   (with suitable adaptation of argument types, return
     *                   types, and adjustment for captured arguments) when
     *                   methods of the resulting functional interface instance
     *                   are invoked.
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
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
/* package */ abstract class AbstractValidatingLambdaMetafactory {

/**
 * Abstract implementation of a lambda metafactory which provides parameter
 * unrolling and input validation.
 *
 * @see LambdaMetafactory
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
}

    /*********** Logging support -- for debugging only, uncomment as needed
    static final Executor logPool = Executors.newSingleThreadExecutor();
    protected static void log(final String s) {
        MethodHandleProxyLambdaMetafactory.logPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(s);
            }
        });
    }

    protected static void log(final String s, final Throwable e) {
        MethodHandleProxyLambdaMetafactory.logPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(s);
                e.printStackTrace(System.out);
            }
        });
    }
    ***********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    private boolean isAdaptableToAsReturn(Class<?> fromType, Class<?> toType) {

    /**
     * Check type adaptability for return types --
     * special handling of void type) and parameterized fromType
     * @return True if 'fromType' can be converted to 'toType'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    private boolean isAdaptableTo(Class<?> fromType, Class<?> toType, boolean strict) {

    /**
     * Check type adaptability for parameter types.
     * @param fromType Type to convert from
     * @param toType Type to convert to
     * @param strict If true, do strict checks, else allow that fromType may be parameterized
     * @return True if 'fromType' can be passed to an argument of 'toType'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    void validateMetafactoryArgs() throws LambdaConversionException {

    /**
     * Check the meta-factory arguments for errors
     * @throws LambdaConversionException if there are improper conversions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    abstract CallSite buildCallSite()

    /**
     * Build the CallSite.
     *
     * @return a CallSite, which, when invoked, will return an instance of the
     * functional interface
     * @throws ReflectiveOperationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
    AbstractValidatingLambdaMetafactory(MethodHandles.Lookup caller,
                                       MethodType invokedType,
                                       String samMethodName,
                                       MethodType samMethodType,
                                       MethodHandle implMethod,
                                       MethodType instantiatedMethodType,
                                       boolean isSerializable,
                                       Class<?>[] markerInterfaces,
                                       MethodType[] additionalBridges)

    /**
     * Meta-factory constructor.
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
     * @param implMethod The implementation method which should be called
     *                   (with suitable adaptation of argument types, return
     *                   types, and adjustment for captured arguments) when
     *                   methods of the resulting functional interface instance
     *                   are invoked.
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
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/AbstractValidatingLambdaMetafactory.java
/* package */ abstract class AbstractValidatingLambdaMetafactory {

/**
 * Abstract implementation of a lambda metafactory which provides parameter
 * unrolling and input validation.
 *
 * @see LambdaMetafactory
 */
