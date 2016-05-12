_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public String toString() {

    /**
     * Returns a string representation of this identity scope, including
     * its name, its scope name, and the number of identities in this
     * identity scope.
     *
     * @return a string representation of this identity scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract Enumeration<Identity> identities();

    /**
     * Returns an enumeration of all identities in this identity scope.
     *
     * @return an enumeration of all identities in this identity scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract void removeIdentity(Identity identity)

    /**
     * Removes an identity from this identity scope.
     *
     * @param identity the identity to be removed.
     *
     * @exception KeyManagementException if the identity is missing,
     * or another exception occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract void addIdentity(Identity identity)

    /**
     * Adds an identity to this identity scope.
     *
     * @param identity the identity to be added.
     *
     * @exception KeyManagementException if the identity is not
     * valid, a name conflict occurs, another identity has the same
     * public key as the identity being added, or another exception
     * occurs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract Identity getIdentity(PublicKey key);

    /**
     * Retrieves the identity with the specified public key.
     *
     * @param key the public key for the identity to be returned.
     *
     * @return the identity with the given key, or null if there are
     * no identities in this scope with that key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public Identity getIdentity(Principal principal) {

    /**
     * Retrieves the identity whose name is the same as that of the
     * specified principal. (Note: Identity implements Principal.)
     *
     * @param principal the principal corresponding to the identity
     * to be retrieved.
     *
     * @return the identity whose name is the same as that of the
     * principal, or null if there are no identities of the same name
     * in this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract Identity getIdentity(String name);

    /**
     * Returns the identity in this scope with the specified name (if any).
     *
     * @param name the name of the identity to be retrieved.
     *
     * @return the identity named {@code name}, or null if there are
     * no identities named {@code name} in this scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public abstract int size();

    /**
     * Returns the number of identities within this identity scope.
     *
     * @return the number of identities within this identity scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    protected static void setSystemScope(IdentityScope scope) {

    /**
     * Sets the system's identity scope.
     *
     * <p>First, if there is a security manager, its
     * {@code checkSecurityAccess}
     * method is called with {@code "setSystemScope"}
     * as its argument to see if it's ok to set the identity scope.
     *
     * @param scope the scope to set.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * setting the identity scope.
     *
     * @see #getSystemScope
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public static IdentityScope getSystemScope() {

    /**
     * Returns the system's identity scope.
     *
     * @return the system's identity scope, or {@code null} if none has been
     *         set.
     *
     * @see #setSystemScope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public IdentityScope(String name, IdentityScope scope)

    /**
     * Constructs a new identity scope with the specified name and scope.
     *
     * @param name the scope name.
     * @param scope the scope for the new identity scope.
     *
     * @exception KeyManagementException if there is already an identity
     * with the same name in the scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    public IdentityScope(String name) {

    /**
     * Constructs a new identity scope with the specified name.
     *
     * @param name the scope name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
    protected IdentityScope() {

    /**
     * This constructor is used for serialization only and should not
     * be used by subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/IdentityScope.java
@Deprecated

/**
 * <p>This class represents a scope for identities. It is an Identity
 * itself, and therefore has a name and can have a scope. It can also
 * optionally have a public key and associated certificates.
 *
 * <p>An IdentityScope can contain Identity objects of all kinds, including
 * Signers. All types of Identity objects can be retrieved, added, and
 * removed using the same methods. Note that it is possible, and in fact
 * expected, that different types of identity scopes will
 * apply different policies for their various operations on the
 * various types of Identities.
 *
 * <p>There is a one-to-one mapping between keys and identities, and
 * there can only be one copy of one key per scope. For example, suppose
 * <b>Acme Software, Inc</b> is a software publisher known to a user.
 * Suppose it is an Identity, that is, it has a public key, and a set of
 * associated certificates. It is named in the scope using the name
 * "Acme Software". No other named Identity in the scope has the same
 * public  key. Of course, none has the same name as well.
 *
 * @see Identity
 * @see Signer
 * @see Principal
 * @see Key
 *
 * @author Benjamin Renaud
 *
 * @deprecated This class is no longer used. Its functionality has been
 * replaced by {@code java.security.KeyStore}, the
 * {@code java.security.cert} package, and
 * {@code java.security.Principal}.
 */
