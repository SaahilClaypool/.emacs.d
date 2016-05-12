_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private long counter;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private byte[] randomBytes;

    /**
     * @serial
     *
     * We know that the MessageDigest class does not implement
     * java.io.Serializable.  However, since this field is no longer
     * used, it will always be NULL and won't affect the serialization
     * of the SecureRandom class itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private byte[] state;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public static SecureRandom getInstanceStrong()

    /**
     * Returns a {@code SecureRandom} object that was selected by using
     * the algorithms/providers specified in the {@code
     * securerandom.strongAlgorithms} {@link Security} property.
     * <p>
     * Some situations require strong random values, such as when
     * creating high-value/long-lived secrets like RSA public/private
     * keys.  To help guide applications in selecting a suitable strong
     * {@code SecureRandom} implementation, Java distributions
     * include a list of known strong {@code SecureRandom}
     * implementations in the {@code securerandom.strongAlgorithms}
     * Security property.
     * <p>
     * Every implementation of the Java platform is required to
     * support at least one strong {@code SecureRandom} implementation.
     *
     * @return a strong {@code SecureRandom} implementation as indicated
     * by the {@code securerandom.strongAlgorithms} Security property
     *
     * @throws NoSuchAlgorithmException if no algorithm is available
     *
     * @see Security#getProperty(String)
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private static String getPrngAlgorithm() {

    /**
     * Gets a default PRNG algorithm by looking through all registered
     * providers. Returns the first PRNG algorithm of the first provider that
     * has registered a SecureRandom implementation, or null if none of the
     * registered providers supplies a SecureRandom implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private static byte[] longToByteArray(long l) {

    /**
     * Helper function to convert a long into a byte array (least significant
     * byte first).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public byte[] generateSeed(int numBytes) {

    /**
     * Returns the given number of seed bytes, computed using the seed
     * generation algorithm that this class uses to seed itself.  This
     * call may be used to seed other random number generators.
     *
     * @param numBytes the number of seed bytes to generate.
     *
     * @return the seed bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public static byte[] getSeed(int numBytes) {

    /**
     * Returns the given number of seed bytes, computed using the seed
     * generation algorithm that this class uses to seed itself.  This
     * call may be used to seed other random number generators.
     *
     * <p>This method is only included for backwards compatibility.
     * The caller is encouraged to use one of the alternative
     * {@code getInstance} methods to obtain a SecureRandom object, and
     * then call the {@code generateSeed} method to obtain seed bytes
     * from that object.
     *
     * @param numBytes the number of seed bytes to generate.
     *
     * @return the seed bytes.
     *
     * @see #setSeed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    @Override

    /**
     * Generates an integer containing the user-specified number of
     * pseudo-random bits (right justified, with leading zeros).  This
     * method overrides a {@code java.util.Random} method, and serves
     * to provide a source of random bits to all of the methods inherited
     * from that class (for example, {@code nextInt},
     * {@code nextLong}, and {@code nextFloat}).
     *
     * @param numBits number of pseudo-random bits to be generated, where
     * {@code 0 <= numBits <= 32}.
     *
     * @return an {@code int} containing the user-specified number
     * of pseudo-random bits (right justified, with leading zeros).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    @Override

    /**
     * Generates a user-specified number of random bytes.
     *
     * <p> If a call to {@code setSeed} had not occurred previously,
     * the first call to this method forces this SecureRandom object
     * to seed itself.  This self-seeding will not occur if
     * {@code setSeed} was previously called.
     *
     * @param bytes the array to be filled in with random bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    @Override

    /**
     * Reseeds this random object, using the eight bytes contained
     * in the given {@code long seed}. The given seed supplements,
     * rather than replaces, the existing seed. Thus, repeated calls
     * are guaranteed never to reduce randomness.
     *
     * <p>This method is defined for compatibility with
     * {@code java.util.Random}.
     *
     * @param seed the seed.
     *
     * @see #getSeed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    synchronized public void setSeed(byte[] seed) {

    /**
     * Reseeds this random object. The given seed supplements, rather than
     * replaces, the existing seed. Thus, repeated calls are guaranteed
     * never to reduce randomness.
     *
     * @param seed the seed.
     *
     * @see #getSeed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public String getAlgorithm() {

    /**
     * Returns the name of the algorithm implemented by this SecureRandom
     * object.
     *
     * @return the name of the algorithm or {@code unknown}
     *          if the algorithm name cannot be determined.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public final Provider getProvider() {

    /**
     * Returns the provider of this SecureRandom object.
     *
     * @return the provider of this SecureRandom object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    SecureRandomSpi getSecureRandomSpi() {

    /**
     * Returns the SecureRandomSpi of this SecureRandom object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public static SecureRandom getInstance(String algorithm,
            Provider provider) throws NoSuchAlgorithmException {

    /**
     * Returns a SecureRandom object that implements the specified
     * Random Number Generator (RNG) algorithm.
     *
     * <p> A new SecureRandom object encapsulating the
     * SecureRandomSpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * <p> The returned SecureRandom object has not been seeded.  To seed the
     * returned object, call the {@code setSeed} method.
     * If {@code setSeed} is not called, the first call to
     * {@code nextBytes} will force the SecureRandom object to seed itself.
     * This self-seeding will not occur if {@code setSeed} was
     * previously called.
     *
     * @param algorithm the name of the RNG algorithm.
     * See the SecureRandom section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#SecureRandom">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard RNG algorithm names.
     *
     * @param provider the provider.
     *
     * @return the new SecureRandom object.
     *
     * @exception NoSuchAlgorithmException if a SecureRandomSpi
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public static SecureRandom getInstance(String algorithm, String provider)

    /**
     * Returns a SecureRandom object that implements the specified
     * Random Number Generator (RNG) algorithm.
     *
     * <p> A new SecureRandom object encapsulating the
     * SecureRandomSpi implementation from the specified provider
     * is returned.  The specified provider must be registered
     * in the security provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * <p> The returned SecureRandom object has not been seeded.  To seed the
     * returned object, call the {@code setSeed} method.
     * If {@code setSeed} is not called, the first call to
     * {@code nextBytes} will force the SecureRandom object to seed itself.
     * This self-seeding will not occur if {@code setSeed} was
     * previously called.
     *
     * @param algorithm the name of the RNG algorithm.
     * See the SecureRandom section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#SecureRandom">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard RNG algorithm names.
     *
     * @param provider the name of the provider.
     *
     * @return the new SecureRandom object.
     *
     * @exception NoSuchAlgorithmException if a SecureRandomSpi
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
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public static SecureRandom getInstance(String algorithm)

    /**
     * Returns a SecureRandom object that implements the specified
     * Random Number Generator (RNG) algorithm.
     *
     * <p> This method traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new SecureRandom object encapsulating the
     * SecureRandomSpi implementation from the first
     * Provider that supports the specified algorithm is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * <p> The returned SecureRandom object has not been seeded.  To seed the
     * returned object, call the {@code setSeed} method.
     * If {@code setSeed} is not called, the first call to
     * {@code nextBytes} will force the SecureRandom object to seed itself.
     * This self-seeding will not occur if {@code setSeed} was
     * previously called.
     *
     * @param algorithm the name of the RNG algorithm.
     * See the SecureRandom section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#SecureRandom">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard RNG algorithm names.
     *
     * @return the new SecureRandom object.
     *
     * @exception NoSuchAlgorithmException if no Provider supports a
     *          SecureRandomSpi implementation for the
     *          specified algorithm.
     *
     * @see Provider
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    protected SecureRandom(SecureRandomSpi secureRandomSpi,
                           Provider provider) {

    /**
     * Creates a SecureRandom object.
     *
     * @param secureRandomSpi the SecureRandom implementation.
     * @param provider the provider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public SecureRandom(byte seed[]) {

    /**
     * Constructs a secure random number generator (RNG) implementing the
     * default random number algorithm.
     * The SecureRandom instance is seeded with the specified seed bytes.
     *
     * <p> This constructor traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new SecureRandom object encapsulating the
     * SecureRandomSpi implementation from the first
     * Provider that supports a SecureRandom (RNG) algorithm is returned.
     * If none of the Providers support a RNG algorithm,
     * then an implementation-specific default is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * <p> See the SecureRandom section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#SecureRandom">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard RNG algorithm names.
     *
     * @param seed the seed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    public SecureRandom() {

    /**
     * Constructs a secure random number generator (RNG) implementing the
     * default random number algorithm.
     *
     * <p> This constructor traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new SecureRandom object encapsulating the
     * SecureRandomSpi implementation from the first
     * Provider that supports a SecureRandom (RNG) algorithm is returned.
     * If none of the Providers support a RNG algorithm,
     * then an implementation-specific default is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * <p> See the SecureRandom section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#SecureRandom">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard RNG algorithm names.
     *
     * <p> The returned SecureRandom object has not been seeded.  To seed the
     * returned object, call the {@code setSeed} method.
     * If {@code setSeed} is not called, the first call to
     * {@code nextBytes} will force the SecureRandom object to seed itself.
     * This self-seeding will not occur if {@code setSeed} was
     * previously called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private SecureRandomSpi secureRandomSpi = null;

    /**
     * The provider implementation.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
    private Provider provider = null;

    /**
     * The provider.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SecureRandom.java
public class SecureRandom extends java.util.Random {

/**
 * This class provides a cryptographically strong random number
 * generator (RNG).
 *
 * <p>A cryptographically strong random number
 * minimally complies with the statistical random number generator tests
 * specified in <a href="http://csrc.nist.gov/cryptval/140-2.htm">
 * <i>FIPS 140-2, Security Requirements for Cryptographic Modules</i></a>,
 * section 4.9.1.
 * Additionally, SecureRandom must produce non-deterministic output.
 * Therefore any seed material passed to a SecureRandom object must be
 * unpredictable, and all SecureRandom output sequences must be
 * cryptographically strong, as described in
 * <a href="http://www.ietf.org/rfc/rfc1750.txt">
 * <i>RFC 1750: Randomness Recommendations for Security</i></a>.
 *
 * <p>A caller obtains a SecureRandom instance via the
 * no-argument constructor or one of the {@code getInstance} methods:
 *
 * <pre>
 *      SecureRandom random = new SecureRandom();
 * </pre>
 *
 * <p> Many SecureRandom implementations are in the form of a pseudo-random
 * number generator (PRNG), which means they use a deterministic algorithm
 * to produce a pseudo-random sequence from a true random seed.
 * Other implementations may produce true random numbers,
 * and yet others may use a combination of both techniques.
 *
 * <p> Typical callers of SecureRandom invoke the following methods
 * to retrieve random bytes:
 *
 * <pre>
 *      SecureRandom random = new SecureRandom();
 *      byte bytes[] = new byte[20];
 *      random.nextBytes(bytes);
 * </pre>
 *
 * <p> Callers may also invoke the {@code generateSeed} method
 * to generate a given number of seed bytes (to seed other random number
 * generators, for example):
 * <pre>
 *      byte seed[] = random.generateSeed(20);
 * </pre>
 *
 * Note: Depending on the implementation, the {@code generateSeed} and
 * {@code nextBytes} methods may block as entropy is being gathered,
 * for example, if they need to read from /dev/random on various Unix-like
 * operating systems.
 *
 * @see java.security.SecureRandomSpi
 * @see java.util.Random
 *
 * @author Benjamin Renaud
 * @author Josh Bloch
 */
