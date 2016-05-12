_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Destroyable.java
    public default boolean isDestroyed() {

    /**
     * Determine if this {@code Object} has been destroyed.
     *
     * <p>
     * The default implementation returns false.
     *
     * @return true if this {@code Object} has been destroyed,
     *          false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Destroyable.java
    public default void destroy() throws DestroyFailedException {

    /**
     * Destroy this {@code Object}.
     *
     * <p> Sensitive information associated with this {@code Object}
     * is destroyed or cleared.  Subsequent calls to certain methods
     * on this {@code Object} will result in an
     * {@code IllegalStateException} being thrown.
     *
     * <p>
     * The default implementation throws {@code DestroyFailedException}.
     *
     * @exception DestroyFailedException if the destroy operation fails. <p>
     *
     * @exception SecurityException if the caller does not have permission
     *          to destroy this {@code Object}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Destroyable.java
public interface Destroyable {

/**
 * Objects such as credentials may optionally implement this interface
 * to provide the capability to destroy its contents.
 *
 * @see javax.security.auth.Subject
 */
