_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyPair.java
   public PrivateKey getPrivate() {

     /**
     * Returns a reference to the private key component of this key pair.
     *
     * @return a reference to the private key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyPair.java
    public PublicKey getPublic() {

    /**
     * Returns a reference to the public key component of this key pair.
     *
     * @return a reference to the public key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyPair.java
    public KeyPair(PublicKey publicKey, PrivateKey privateKey) {

    /**
     * Constructs a key pair from the given public key and private key.
     *
     * <p>Note that this constructor only stores references to the public
     * and private key components in the generated key pair. This is safe,
     * because {@code Key} objects are immutable.
     *
     * @param publicKey the public key.
     *
     * @param privateKey the private key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyPair.java
public final class KeyPair implements java.io.Serializable {

/**
 * This class is a simple holder for a key pair (a public key and a
 * private key). It does not enforce any security, and, when initialized,
 * should be treated like a PrivateKey.
 *
 * @see PublicKey
 * @see PrivateKey
 *
 * @author Benjamin Renaud
 */
