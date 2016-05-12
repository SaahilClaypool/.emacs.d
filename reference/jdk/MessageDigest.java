_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
        public Object clone() throws CloneNotSupportedException {

        /**
         * Returns a clone if the delegate is cloneable.
         *
         * @return a clone if the delegate is cloneable.
         *
         * @exception CloneNotSupportedException if this is called on a
         * delegate that does not support {@code Cloneable}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * Returns a clone if the implementation is cloneable.
     *
     * @return a clone if the implementation is cloneable.
     *
     * @exception CloneNotSupportedException if this is called on an
     * implementation that does not support {@code Cloneable}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public final int getDigestLength() {

    /**
     * Returns the length of the digest in bytes, or 0 if this operation is
     * not supported by the provider and the implementation is not cloneable.
     *
     * @return the digest length in bytes, or 0 if this operation is not
     * supported by the provider and the implementation is not cloneable.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public final String getAlgorithm() {

    /**
     * Returns a string that identifies the algorithm, independent of
     * implementation details. The name should be a standard
     * Java Security name (such as "SHA", "MD5", and so on).
     * See the MessageDigest section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @return the name of the algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public void reset() {

    /**
     * Resets the digest for further use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public static boolean isEqual(byte[] digesta, byte[] digestb) {

    /**
     * Compares two digests for equality. Does a simple byte compare.
     *
     * @param digesta one of the digests to compare.
     *
     * @param digestb the other digest to compare.
     *
     * @return true if the digests are equal, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public String toString() {

    /**
     * Returns a string representation of this message digest object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public byte[] digest(byte[] input) {

    /**
     * Performs a final update on the digest using the specified array
     * of bytes, then completes the digest computation. That is, this
     * method first calls {@link #update(byte[]) update(input)},
     * passing the <i>input</i> array to the {@code update} method,
     * then calls {@link #digest() digest()}.
     *
     * @param input the input to be updated before the digest is
     * completed.
     *
     * @return the array of bytes for the resulting hash value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public int digest(byte[] buf, int offset, int len) throws DigestException {

    /**
     * Completes the hash computation by performing final operations
     * such as padding. The digest is reset after this call is made.
     *
     * @param buf output buffer for the computed digest
     *
     * @param offset offset into the output buffer to begin storing the digest
     *
     * @param len number of bytes within buf allotted for the digest
     *
     * @return the number of bytes placed into {@code buf}
     *
     * @exception DigestException if an error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public byte[] digest() {

    /**
     * Completes the hash computation by performing final operations
     * such as padding. The digest is reset after this call is made.
     *
     * @return the array of bytes for the resulting hash value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public final void update(ByteBuffer input) {

    /**
     * Update the digest using the specified ByteBuffer. The digest is
     * updated using the {@code input.remaining()} bytes starting
     * at {@code input.position()}.
     * Upon return, the buffer's position will be equal to its limit;
     * its limit will not have changed.
     *
     * @param input the ByteBuffer
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public void update(byte[] input) {

    /**
     * Updates the digest using the specified array of bytes.
     *
     * @param input the array of bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public void update(byte[] input, int offset, int len) {

    /**
     * Updates the digest using the specified array of bytes, starting
     * at the specified offset.
     *
     * @param input the array of bytes.
     *
     * @param offset the offset to start from in the array of bytes.
     *
     * @param len the number of bytes to use, starting at
     * {@code offset}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public void update(byte input) {

    /**
     * Updates the digest using the specified byte.
     *
     * @param input the byte with which to update the digest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public final Provider getProvider() {

    /**
     * Returns the provider of this message digest object.
     *
     * @return the provider of this message digest object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public static MessageDigest getInstance(String algorithm,
                                            Provider provider)

    /**
     * Returns a MessageDigest object that implements the specified digest
     * algorithm.
     *
     * <p> A new MessageDigest object encapsulating the
     * MessageDigestSpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * @param algorithm the name of the algorithm requested.
     * See the MessageDigest section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the provider.
     *
     * @return a MessageDigest object that implements the specified algorithm.
     *
     * @exception NoSuchAlgorithmException if a MessageDigestSpi
     *          implementation for the specified algorithm is not available
     *          from the specified Provider object.
     *
     * @exception IllegalArgumentException if the specified provider is null.
     *
     * @see Provider
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public static MessageDigest getInstance(String algorithm, String provider)

    /**
     * Returns a MessageDigest object that implements the specified digest
     * algorithm.
     *
     * <p> A new MessageDigest object encapsulating the
     * MessageDigestSpi implementation from the specified provider
     * is returned.  The specified provider must be registered
     * in the security provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the name of the algorithm requested.
     * See the MessageDigest section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the name of the provider.
     *
     * @return a MessageDigest object that implements the specified algorithm.
     *
     * @exception NoSuchAlgorithmException if a MessageDigestSpi
     *          implementation for the specified algorithm is not
     *          available from the specified provider.
     *
     * @exception NoSuchProviderException if the specified provider is not
     *          registered in the security provider list.
     *
     * @exception IllegalArgumentException if the provider name is null
     *          or empty.
     *
     * @see Provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    public static MessageDigest getInstance(String algorithm)

    /**
     * Returns a MessageDigest object that implements the specified digest
     * algorithm.
     *
     * <p> This method traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new MessageDigest object encapsulating the
     * MessageDigestSpi implementation from the first
     * Provider that supports the specified algorithm is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the name of the algorithm requested.
     * See the MessageDigest section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @return a Message Digest object that implements the specified algorithm.
     *
     * @exception NoSuchAlgorithmException if no Provider supports a
     *          MessageDigestSpi implementation for the
     *          specified algorithm.
     *
     * @see Provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
    protected MessageDigest(String algorithm) {

    /**
     * Creates a message digest with the specified algorithm name.
     *
     * @param algorithm the standard name of the digest algorithm.
     * See the MessageDigest section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/MessageDigest.java
public abstract class MessageDigest extends MessageDigestSpi {

/**
 * This MessageDigest class provides applications the functionality of a
 * message digest algorithm, such as SHA-1 or SHA-256.
 * Message digests are secure one-way hash functions that take arbitrary-sized
 * data and output a fixed-length hash value.
 *
 * <p>A MessageDigest object starts out initialized. The data is
 * processed through it using the {@link #update(byte) update}
 * methods. At any point {@link #reset() reset} can be called
 * to reset the digest. Once all the data to be updated has been
 * updated, one of the {@link #digest() digest} methods should
 * be called to complete the hash computation.
 *
 * <p>The {@code digest} method can be called once for a given number
 * of updates. After {@code digest} has been called, the MessageDigest
 * object is reset to its initialized state.
 *
 * <p>Implementations are free to implement the Cloneable interface.
 * Client applications can test cloneability by attempting cloning
 * and catching the CloneNotSupportedException:
 *
 * <pre>{@code
 * MessageDigest md = MessageDigest.getInstance("SHA");
 *
 * try {
 *     md.update(toChapter1);
 *     MessageDigest tc1 = md.clone();
 *     byte[] toChapter1Digest = tc1.digest();
 *     md.update(toChapter2);
 *     ...etc.
 * } catch (CloneNotSupportedException cnse) {
 *     throw new DigestException("couldn't make digest of partial content");
 * }
 * }</pre>
 *
 * <p>Note that if a given implementation is not cloneable, it is
 * still possible to compute intermediate digests by instantiating
 * several instances, if the number of digests is known in advance.
 *
 * <p>Note that this class is abstract and extends from
 * {@code MessageDigestSpi} for historical reasons.
 * Application developers should only take notice of the methods defined in
 * this {@code MessageDigest} class; all the methods in
 * the superclass are intended for cryptographic service providers who wish to
 * supply their own implementations of message digest algorithms.
 *
 * <p> Every implementation of the Java platform is required to support
 * the following standard {@code MessageDigest} algorithms:
 * <ul>
 * <li>{@code MD5}</li>
 * <li>{@code SHA-1}</li>
 * <li>{@code SHA-256}</li>
 * </ul>
 * These algorithms are described in the <a href=
 * "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
 * MessageDigest section</a> of the
 * Java Cryptography Architecture Standard Algorithm Name Documentation.
 * Consult the release documentation for your implementation to see if any
 * other algorithms are supported.
 *
 * @author Benjamin Renaud
 *
 * @see DigestInputStream
 * @see DigestOutputStream
 */
