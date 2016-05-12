_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private Element getDocFromBytes(byte[] bytes) throws KeyResolverException {

    /**
     * Parses a byte array and returns the parsed Element.
     *
     * @param bytes
     * @return the Document Element after parsing bytes
     * @throws KeyResolverException if something goes wrong
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private Element obtainReferenceElement(XMLSignatureInput resource)

    /**
     * Resolve the Element effectively represented by the XML signature input source.
     *
     * @param resource
     * @return
     * @throws CanonicalizationException
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private XMLSignatureInput resolveInput(Attr uri, String baseURI, boolean secureValidation)

    /**
     * Resolve the XML signature input represented by the specified URI.
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private void validateReference(Element referentElement) throws XMLSecurityException {

    /**
     * Validate the Element referred to by the KeyInfoReference.
     *
     * @param referentElement
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private KeyInfo resolveReferentKeyInfo(Element element, String baseURI, StorageResolver storage) throws XMLSecurityException {

    /**
     * Resolve the KeyInfoReference Element's URI attribute into a KeyInfo instance.
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return the KeyInfo which is referred to by this KeyInfoReference, or null if can not be resolved
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public PrivateKey engineLookupAndResolvePrivateKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public SecretKey engineLookupAndResolveSecretKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public X509Certificate engineLookupResolveX509Certificate(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public PublicKey engineLookupAndResolvePublicKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public boolean engineCanResolve(Element element, String baseURI, StorageResolver storage) {

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
public class KeyInfoReferenceResolver extends KeyResolverSpi {

/**
 * KeyResolverSpi implementation which resolves public keys, private keys, secret keys, and X.509 certificates from a
 * <code>dsig11:KeyInfoReference</code> element.
 *
 * @author Brent Putman (putmanb@georgetown.edu)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private Element getDocFromBytes(byte[] bytes) throws KeyResolverException {

    /**
     * Parses a byte array and returns the parsed Element.
     *
     * @param bytes
     * @return the Document Element after parsing bytes
     * @throws KeyResolverException if something goes wrong
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private Element obtainReferenceElement(XMLSignatureInput resource)

    /**
     * Resolve the Element effectively represented by the XML signature input source.
     *
     * @param resource
     * @return
     * @throws CanonicalizationException
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private XMLSignatureInput resolveInput(Attr uri, String baseURI, boolean secureValidation)

    /**
     * Resolve the XML signature input represented by the specified URI.
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private void validateReference(Element referentElement) throws XMLSecurityException {

    /**
     * Validate the Element referred to by the KeyInfoReference.
     *
     * @param referentElement
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private KeyInfo resolveReferentKeyInfo(Element element, String baseURI, StorageResolver storage) throws XMLSecurityException {

    /**
     * Resolve the KeyInfoReference Element's URI attribute into a KeyInfo instance.
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return the KeyInfo which is referred to by this KeyInfoReference, or null if can not be resolved
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public PrivateKey engineLookupAndResolvePrivateKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public SecretKey engineLookupAndResolveSecretKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public X509Certificate engineLookupResolveX509Certificate(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public PublicKey engineLookupAndResolvePublicKey(Element element, String baseURI, StorageResolver storage)

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    public boolean engineCanResolve(Element element, String baseURI, StorageResolver storage) {

    /** {@inheritDoc}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/KeyInfoReferenceResolver.java
public class KeyInfoReferenceResolver extends KeyResolverSpi {

/**
 * KeyResolverSpi implementation which resolves public keys, private keys, secret keys, and X.509 certificates from a
 * <code>dsig11:KeyInfoReference</code> element.
 *
 * @author Brent Putman (putmanb@georgetown.edu)
 */
