_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
    static LambdaForm makeReinvokerForm(MethodHandle target,
                                        int whichCache,
                                        Object constraint,
                                        String debugString,
                                        boolean forceInline,
                                        NamedFunction getTargetFn,
                                        NamedFunction preActionFn) {

    /** Create a LF which simply reinvokes a target of the given basic type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
    abstract protected MethodHandle getTarget();

    /** Define this to extract the delegated target which supplies the invocation behavior. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
/*non-public*/

/**
 * A method handle whose invocation behavior is determined by a target.
 * The delegating MH itself can hold extra "intentions" beyond the simple behavior.
 * @author jrose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
    static LambdaForm makeReinvokerForm(MethodHandle target,
                                        int whichCache,
                                        Object constraint,
                                        String debugString,
                                        boolean forceInline,
                                        NamedFunction getTargetFn,
                                        NamedFunction preActionFn) {

    /** Create a LF which simply reinvokes a target of the given basic type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
    abstract protected MethodHandle getTarget();

    /** Define this to extract the delegated target which supplies the invocation behavior. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DelegatingMethodHandle.java
/*non-public*/

/**
 * A method handle whose invocation behavior is determined by a target.
 * The delegating MH itself can hold extra "intentions" beyond the simple behavior.
 * @author jrose
 */
