_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/CompletionHandler.java
    void failed(Throwable exc, A attachment);

    /**
     * Invoked when an operation fails.
     *
     * @param   exc
     *          The exception to indicate why the I/O operation failed
     * @param   attachment
     *          The object attached to the I/O operation when it was initiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/CompletionHandler.java
    void completed(V result, A attachment);

    /**
     * Invoked when an operation has completed.
     *
     * @param   result
     *          The result of the I/O operation.
     * @param   attachment
     *          The object attached to the I/O operation when it was initiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/CompletionHandler.java
public interface CompletionHandler<V,A> {

/**
 * A handler for consuming the result of an asynchronous I/O operation.
 *
 * <p> The asynchronous channels defined in this package allow a completion
 * handler to be specified to consume the result of an asynchronous operation.
 * The {@link #completed completed} method is invoked when the I/O operation
 * completes successfully. The {@link #failed failed} method is invoked if the
 * I/O operations fails. The implementations of these methods should complete
 * in a timely manner so as to avoid keeping the invoking thread from dispatching
 * to other completion handlers.
 *
 * @param   <V>     The result type of the I/O operation
 * @param   <A>     The type of the object attached to the I/O operation
 *
 * @since 1.7
 */
