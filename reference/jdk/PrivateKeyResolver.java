_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PrivateKey engineLookupAndResolvePrivateKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolvePrivateKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved PrivateKey key or null if no {@link PrivateKey} could be obtained
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public SecretKey engineResolveSecretKey(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolveSecretKey
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return resolved SecretKey key or null if no {@link SecretKey} could be obtained
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolveX509Certificate
     * @inheritDoc
     * @param element
     * @param BaseURI
     * @param storage
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePublicKey
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return null if no {@link PublicKey} could be obtained
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public boolean engineCanResolve(Element element, String BaseURI, StorageResolver storage) {

    /**
     * This method returns whether the KeyResolverSpi is able to perform the requested action.
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PrivateKeyResolver(KeyStore keyStore, char[] password) {

    /**
     * Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
public class PrivateKeyResolver extends KeyResolverSpi {

/**
 * Resolves a PrivateKey within a KeyStore based on the KeyInfo hints.
 * For X509Data hints, the certificate associated with the private key entry must match.
 * For a KeyName hint, the KeyName must match the alias of a PrivateKey entry within the KeyStore.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PrivateKey engineLookupAndResolvePrivateKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolvePrivateKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved PrivateKey key or null if no {@link PrivateKey} could be obtained
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public SecretKey engineResolveSecretKey(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolveSecretKey
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return resolved SecretKey key or null if no {@link SecretKey} could be obtained
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolveX509Certificate
     * @inheritDoc
     * @param element
     * @param BaseURI
     * @param storage
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String BaseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePublicKey
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return null if no {@link PublicKey} could be obtained
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public boolean engineCanResolve(Element element, String BaseURI, StorageResolver storage) {

    /**
     * This method returns whether the KeyResolverSpi is able to perform the requested action.
     *
     * @param element
     * @param BaseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
    public PrivateKeyResolver(KeyStore keyStore, char[] password) {

    /**
     * Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/PrivateKeyResolver.java
public class PrivateKeyResolver extends KeyResolverSpi {

/**
 * Resolves a PrivateKey within a KeyStore based on the KeyInfo hints.
 * For X509Data hints, the certificate associated with the private key entry must match.
 * For a KeyName hint, the KeyName must match the alias of a PrivateKey entry within the KeyStore.
 */
