_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addStorageResolver(StorageResolver storageResolver) {

    /**
     * Method addStorageResolver
     *
     * @param storageResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    KeyResolverSpi itemInternalKeyResolver(int i) {

    /**
     * Method itemInternalKeyResolver
     *
     * @param i the index
     * @return the KeyResolverSpi for the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    int lengthInternalKeyResolver() {

    /**
     * Method lengthInternalKeyResolver
     * @return the length of the key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void registerInternalKeyResolver(KeyResolverSpi realKeyResolver) {

    /**
     * This method is used to add a custom {@link KeyResolverSpi} to a KeyInfo
     * object.
     *
     * @param realKeyResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PrivateKey getPrivateKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for private keys
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PrivateKey getPrivateKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for Private keys
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PrivateKey getPrivateKey() throws KeyResolverException {

    /**
     * This method returns a private key. This is for Key Transport in XML Encryption.
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    SecretKey getSecretKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for secret keys
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    SecretKey getSecretKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for Secret keys
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public SecretKey getSecretKey() throws KeyResolverException {

    /**
     * This method returns a secret (symmetric) key. This is for XML Encryption.
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    X509Certificate getX509CertificateFromInternalResolvers()

    /**
     * Method getX509CertificateFromInternalResolvers
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    X509Certificate getX509CertificateFromStaticResolvers()

    /**
     * This method uses each System-wide {@link KeyResolver} to search the
     * child elements. Each combination of {@link KeyResolver} and child element
     * is checked against all {@link StorageResolver}s.
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public X509Certificate getX509Certificate() throws KeyResolverException {

    /**
     * Method getX509Certificate
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PublicKey getPublicKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for public keys
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PublicKey getPublicKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for public keys
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PublicKey getPublicKey() throws KeyResolverException {

    /**
     * This method returns the public key.
     *
     * @return If the KeyInfo contains a PublicKey node
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyInfoReference() {

    /**
     * Method containsKeyInfoReference
     *
     * @return If the KeyInfo contains a KeyInfoReference node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsDEREncodedKeyValue() {

    /**
     * Method containsDEREncodedKeyValue
     *
     * @return If the KeyInfo contains a DEREncodedKeyValue node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsX509Data() {

    /**
     * Method containsX509Data
     *
     * @return If the KeyInfo contains a X509Data node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsUnknownElement() {

    /**
     * Method containsUnknownElement
     *
     * @return If the KeyInfo contains a UnknownElement node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsSPKIData() {

    /**
     * Method containsSPKIData
     *
     * @return If the KeyInfo contains a SPKIData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsRetrievalMethod() {

    /**
     * Method containsRetrievalMethod
     *
     * @return If the KeyInfo contains a RetrievalMethod node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsPGPData() {

    /**
     * Method containsPGPData
     *
     * @return If the KeyInfo contains a PGPData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsMgmtData() {

    /**
     * Method containsMgmtData
     *
     * @return If the KeyInfo contains a MgmtData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyValue() {

    /**
     * Method containsKeyValue
     *
     * @return If the KeyInfo contains a KeyValue node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyName() {

    /**
     * Method containsKeyName
     *
     * @return If the KeyInfo contains a KeyName node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean isEmpty() {

    /**
     * Method isEmpty
     *
     * @return true if the element has no descendants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
            if ((current.getNodeType() == Node.ELEMENT_NODE)

            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public Element itemUnknownElement(int i) {

    /**
     * Method itemUnknownElement
     *
     * @param i index
     * @return the element number of the unknown elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfoReference itemKeyInfoReference(int i) throws XMLSecurityException {

    /**
     * Method itemKeyInfoReference
     *
     * @param i
     * @return the asked KeyInfoReference element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public DEREncodedKeyValue itemDEREncodedKeyValue(int i) throws XMLSecurityException {

    /**
     * Method itemDEREncodedKeyValue
     *
     * @param i
     * @return the asked DEREncodedKeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public EncryptedKey itemEncryptedKey(int i) throws XMLSecurityException {

    /**
     * Method itemEncryptedKey
     *
     * @param i
     * @return the asked EncryptedKey element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public X509Data itemX509Data(int i) throws XMLSecurityException {

    /**
     * Method itemX509Data
     *
     * @param i
     * @return the asked X509Data element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public SPKIData itemSPKIData(int i) throws XMLSecurityException {

    /**
     * Method itemSPKIData
     *
     * @param i
     * @return the asked SPKIData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public RetrievalMethod itemRetrievalMethod(int i) throws XMLSecurityException {

    /**
     * Method itemRetrievalMethod
     *
     * @param i
     *@return the asked RetrievalMethod element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PGPData itemPGPData(int i) throws XMLSecurityException {

    /**
     * Method itemPGPData
     *
     * @param i
     * @return the asked PGPData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public MgmtData itemMgmtData(int i) throws XMLSecurityException {

    /**
     * Method itemMgmtData
     *
     * @param i
     * @return the asked MgmtData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyValue itemKeyValue(int i) throws XMLSecurityException {

    /**
     * Method itemKeyValue
     *
     * @param i
     * @return the asked KeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyName itemKeyName(int i) throws XMLSecurityException {

    /**
     * Method itemKeyName
     *
     * @param i
     * @return the asked KeyName element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
            if ((current.getNodeType() == Node.ELEMENT_NODE)

            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthUnknownElement() {

    /**
     * Method lengthUnknownElement
     * NOTE possibly buggy.
     * @return the number of the UnknownElement tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyInfoReference() {

    /**
     * Method lengthKeyInfoReference
     *
     *@return the number of the KeyInfoReference tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthDEREncodedKeyValue() {

    /**
     * Method lengthDEREncodedKeyValue
     *
     *@return the number of the DEREncodedKeyValue tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthX509Data() {

    /**
     * Method lengthX509Data
     *
     *@return the number of the X509Data tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthSPKIData() {

    /**
     * Method lengthSPKIData
     *
     *@return the number of the SPKIData tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthRetrievalMethod() {

    /**
     * Method lengthRetrievalMethod
     *
     *@return the number of the RetrievalMethod tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthPGPData() {

    /**
     * Method lengthPGPData
     *
     *@return the number of the PGPDat. tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthMgmtData() {

    /**
     * Method lengthMgmtData
     *
     *@return the number of the MgmtData tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyValue() {

    /**
     * Method lengthKeyValue
     *
     *@return the number of the KeyValue tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyName() {

    /**
     * Method lengthKeyName
     *
     * @return the number of the KeyName tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addUnknownElement(Element element) {

    /**
     * Method addUnknownElement
     *
     * @param element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyInfoReference keyInfoReference) {

    /**
     * Method add
     *
     * @param keyInfoReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyInfoReference(String URI) throws XMLSecurityException {

    /**
     * Method addKeyInfoReference
     *
     * @param URI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(DEREncodedKeyValue derEncodedKeyValue) {

    /**
     * Method add
     *
     * @param derEncodedKeyValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addDEREncodedKeyValue(PublicKey pk) throws XMLSecurityException {

    /**
     * Method addDEREncodedKeyValue
     *
     * @param pk
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(EncryptedKey encryptedKey) throws XMLEncryptionException {

    /**
     * Method addEncryptedKey
     *
     * @param encryptedKey
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(X509Data x509data) {

    /**
     * Method addX509Data
     *
     * @param x509data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(SPKIData spkidata) {

    /**
     * Method add
     *
     * @param spkidata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(RetrievalMethod retrievalmethod) {

    /**
     * Method add
     *
     * @param retrievalmethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addRetrievalMethod(String uri, Transforms transforms, String Type) {

    /**
     * Method addRetrievalMethod
     *
     * @param uri
     * @param transforms
     * @param Type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(PGPData pgpdata) {

    /**
     * Method addPGPData
     *
     * @param pgpdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(MgmtData mgmtdata) {

    /**
     * Method add
     *
     * @param mgmtdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addMgmtData(String mgmtdata) {

    /**
     * Method addMgmtData
     *
     * @param mgmtdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyValue keyvalue) {

    /**
     * Method add
     *
     * @param keyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(PublicKey pk) {

    /**
     * Method add
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(RSAKeyValue rsakeyvalue) {

    /**
     * Method add
     *
     * @param rsakeyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(DSAKeyValue dsakeyvalue) {

    /**
     * Method add
     *
     * @param dsakeyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyValue(Element unknownKeyValueElement) {

    /**
     * Method addKeyValue
     *
     * @param unknownKeyValueElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyValue(PublicKey pk) {

    /**
     * Method addKeyValue
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyName keyname) {

    /**
     * Method add
     *
     * @param keyname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyName(String keynameString) {

    /**
     * Method addKeyName
     *
     * @param keynameString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id ID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure processing is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfo(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor KeyInfo
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfo(Document doc) {

    /**
     * Constructor KeyInfo
     * @param doc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private List<KeyResolverSpi> internalKeyResolvers = new ArrayList<KeyResolverSpi>();

    /**
     * Stores the individual (per-KeyInfo) {@link KeyResolverSpi}s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private List<StorageResolver> storageResolvers = nullList;

    /** Field storageResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
public class KeyInfo extends SignatureElementProxy {

/**
 * This class stand for KeyInfo Element that may contain keys, names,
 * certificates and other public key management information,
 * such as in-band key distribution or key agreement data.
 * <BR />
 * KeyInfo Element has two basic functions:
 * One is KeyResolve for getting the public key in signature validation processing.
 * the other one is toElement for getting the element in signature generation processing.
 * <BR />
 * The <CODE>lengthXXX()</CODE> methods provide access to the internal Key
 * objects:
 * <UL>
 * <LI>If the <CODE>KeyInfo</CODE> was constructed from an Element
 * (Signature verification), the <CODE>lengthXXX()</CODE> methods searches
 * for child elements of <CODE>ds:KeyInfo</CODE> for known types. </LI>
 * <LI>If the <CODE>KeyInfo</CODE> was constructed from scratch (during
 * Signature generation), the <CODE>lengthXXX()</CODE> methods return the number
 * of <CODE>XXXs</CODE> objects already passed to the KeyInfo</LI>
 * </UL>
 * <BR />
 * The <CODE>addXXX()</CODE> methods are used for adding Objects of the
 * appropriate type to the <CODE>KeyInfo</CODE>. This is used during signature
 * generation.
 * <BR />
 * The <CODE>itemXXX(int i)</CODE> methods return the i'th object of the
 * corresponding type.
 * <BR />
 * The <CODE>containsXXX()</CODE> methods return <I>whether</I> the KeyInfo
 * contains the corresponding type.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
package com.sun.org.apache.xml.internal.security.keys;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addStorageResolver(StorageResolver storageResolver) {

    /**
     * Method addStorageResolver
     *
     * @param storageResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    KeyResolverSpi itemInternalKeyResolver(int i) {

    /**
     * Method itemInternalKeyResolver
     *
     * @param i the index
     * @return the KeyResolverSpi for the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    int lengthInternalKeyResolver() {

    /**
     * Method lengthInternalKeyResolver
     * @return the length of the key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void registerInternalKeyResolver(KeyResolverSpi realKeyResolver) {

    /**
     * This method is used to add a custom {@link KeyResolverSpi} to a KeyInfo
     * object.
     *
     * @param realKeyResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PrivateKey getPrivateKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for private keys
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PrivateKey getPrivateKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for Private keys
     *
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PrivateKey getPrivateKey() throws KeyResolverException {

    /**
     * This method returns a private key. This is for Key Transport in XML Encryption.
     * @return the private key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    SecretKey getSecretKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for secret keys
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    SecretKey getSecretKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for Secret keys
     *
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public SecretKey getSecretKey() throws KeyResolverException {

    /**
     * This method returns a secret (symmetric) key. This is for XML Encryption.
     * @return the secret key contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    X509Certificate getX509CertificateFromInternalResolvers()

    /**
     * Method getX509CertificateFromInternalResolvers
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    X509Certificate getX509CertificateFromStaticResolvers()

    /**
     * This method uses each System-wide {@link KeyResolver} to search the
     * child elements. Each combination of {@link KeyResolver} and child element
     * is checked against all {@link StorageResolver}s.
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public X509Certificate getX509Certificate() throws KeyResolverException {

    /**
     * Method getX509Certificate
     *
     * @return The certificate contained in this KeyInfo
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PublicKey getPublicKeyFromInternalResolvers() throws KeyResolverException {

    /**
     * Searches the per-KeyInfo KeyResolvers for public keys
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    PublicKey getPublicKeyFromStaticResolvers() throws KeyResolverException {

    /**
     * Searches the library wide KeyResolvers for public keys
     *
     * @return The public key contained in this Node.
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PublicKey getPublicKey() throws KeyResolverException {

    /**
     * This method returns the public key.
     *
     * @return If the KeyInfo contains a PublicKey node
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyInfoReference() {

    /**
     * Method containsKeyInfoReference
     *
     * @return If the KeyInfo contains a KeyInfoReference node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsDEREncodedKeyValue() {

    /**
     * Method containsDEREncodedKeyValue
     *
     * @return If the KeyInfo contains a DEREncodedKeyValue node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsX509Data() {

    /**
     * Method containsX509Data
     *
     * @return If the KeyInfo contains a X509Data node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsUnknownElement() {

    /**
     * Method containsUnknownElement
     *
     * @return If the KeyInfo contains a UnknownElement node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsSPKIData() {

    /**
     * Method containsSPKIData
     *
     * @return If the KeyInfo contains a SPKIData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsRetrievalMethod() {

    /**
     * Method containsRetrievalMethod
     *
     * @return If the KeyInfo contains a RetrievalMethod node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsPGPData() {

    /**
     * Method containsPGPData
     *
     * @return If the KeyInfo contains a PGPData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsMgmtData() {

    /**
     * Method containsMgmtData
     *
     * @return If the KeyInfo contains a MgmtData node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyValue() {

    /**
     * Method containsKeyValue
     *
     * @return If the KeyInfo contains a KeyValue node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean containsKeyName() {

    /**
     * Method containsKeyName
     *
     * @return If the KeyInfo contains a KeyName node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public boolean isEmpty() {

    /**
     * Method isEmpty
     *
     * @return true if the element has no descendants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
            if ((current.getNodeType() == Node.ELEMENT_NODE)

            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public Element itemUnknownElement(int i) {

    /**
     * Method itemUnknownElement
     *
     * @param i index
     * @return the element number of the unknown elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfoReference itemKeyInfoReference(int i) throws XMLSecurityException {

    /**
     * Method itemKeyInfoReference
     *
     * @param i
     * @return the asked KeyInfoReference element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public DEREncodedKeyValue itemDEREncodedKeyValue(int i) throws XMLSecurityException {

    /**
     * Method itemDEREncodedKeyValue
     *
     * @param i
     * @return the asked DEREncodedKeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public EncryptedKey itemEncryptedKey(int i) throws XMLSecurityException {

    /**
     * Method itemEncryptedKey
     *
     * @param i
     * @return the asked EncryptedKey element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public X509Data itemX509Data(int i) throws XMLSecurityException {

    /**
     * Method itemX509Data
     *
     * @param i
     * @return the asked X509Data element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public SPKIData itemSPKIData(int i) throws XMLSecurityException {

    /**
     * Method itemSPKIData
     *
     * @param i
     * @return the asked SPKIData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public RetrievalMethod itemRetrievalMethod(int i) throws XMLSecurityException {

    /**
     * Method itemRetrievalMethod
     *
     * @param i
     *@return the asked RetrievalMethod element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public PGPData itemPGPData(int i) throws XMLSecurityException {

    /**
     * Method itemPGPData
     *
     * @param i
     * @return the asked PGPData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public MgmtData itemMgmtData(int i) throws XMLSecurityException {

    /**
     * Method itemMgmtData
     *
     * @param i
     * @return the asked MgmtData element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyValue itemKeyValue(int i) throws XMLSecurityException {

    /**
     * Method itemKeyValue
     *
     * @param i
     * @return the asked KeyValue element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyName itemKeyName(int i) throws XMLSecurityException {

    /**
     * Method itemKeyName
     *
     * @param i
     * @return the asked KeyName element, null if the index is too big
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
            if ((current.getNodeType() == Node.ELEMENT_NODE)

            /**
             * $todo$ using this method, we don't see unknown Elements
             *  from Signature NS; revisit
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthUnknownElement() {

    /**
     * Method lengthUnknownElement
     * NOTE possibly buggy.
     * @return the number of the UnknownElement tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyInfoReference() {

    /**
     * Method lengthKeyInfoReference
     *
     *@return the number of the KeyInfoReference tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthDEREncodedKeyValue() {

    /**
     * Method lengthDEREncodedKeyValue
     *
     *@return the number of the DEREncodedKeyValue tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthX509Data() {

    /**
     * Method lengthX509Data
     *
     *@return the number of the X509Data tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthSPKIData() {

    /**
     * Method lengthSPKIData
     *
     *@return the number of the SPKIData tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthRetrievalMethod() {

    /**
     * Method lengthRetrievalMethod
     *
     *@return the number of the RetrievalMethod tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthPGPData() {

    /**
     * Method lengthPGPData
     *
     *@return the number of the PGPDat. tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthMgmtData() {

    /**
     * Method lengthMgmtData
     *
     *@return the number of the MgmtData tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyValue() {

    /**
     * Method lengthKeyValue
     *
     *@return the number of the KeyValue tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public int lengthKeyName() {

    /**
     * Method lengthKeyName
     *
     * @return the number of the KeyName tags
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addUnknownElement(Element element) {

    /**
     * Method addUnknownElement
     *
     * @param element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyInfoReference keyInfoReference) {

    /**
     * Method add
     *
     * @param keyInfoReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyInfoReference(String URI) throws XMLSecurityException {

    /**
     * Method addKeyInfoReference
     *
     * @param URI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(DEREncodedKeyValue derEncodedKeyValue) {

    /**
     * Method add
     *
     * @param derEncodedKeyValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addDEREncodedKeyValue(PublicKey pk) throws XMLSecurityException {

    /**
     * Method addDEREncodedKeyValue
     *
     * @param pk
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(EncryptedKey encryptedKey) throws XMLEncryptionException {

    /**
     * Method addEncryptedKey
     *
     * @param encryptedKey
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(X509Data x509data) {

    /**
     * Method addX509Data
     *
     * @param x509data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(SPKIData spkidata) {

    /**
     * Method add
     *
     * @param spkidata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(RetrievalMethod retrievalmethod) {

    /**
     * Method add
     *
     * @param retrievalmethod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addRetrievalMethod(String uri, Transforms transforms, String Type) {

    /**
     * Method addRetrievalMethod
     *
     * @param uri
     * @param transforms
     * @param Type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(PGPData pgpdata) {

    /**
     * Method addPGPData
     *
     * @param pgpdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(MgmtData mgmtdata) {

    /**
     * Method add
     *
     * @param mgmtdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addMgmtData(String mgmtdata) {

    /**
     * Method addMgmtData
     *
     * @param mgmtdata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyValue keyvalue) {

    /**
     * Method add
     *
     * @param keyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(PublicKey pk) {

    /**
     * Method add
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(RSAKeyValue rsakeyvalue) {

    /**
     * Method add
     *
     * @param rsakeyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(DSAKeyValue dsakeyvalue) {

    /**
     * Method add
     *
     * @param dsakeyvalue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyValue(Element unknownKeyValueElement) {

    /**
     * Method addKeyValue
     *
     * @param unknownKeyValueElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyValue(PublicKey pk) {

    /**
     * Method addKeyValue
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void add(KeyName keyname) {

    /**
     * Method add
     *
     * @param keyname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void addKeyName(String keynameString) {

    /**
     * Method addKeyName
     *
     * @param keynameString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id ID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure processing is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfo(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor KeyInfo
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    public KeyInfo(Document doc) {

    /**
     * Constructor KeyInfo
     * @param doc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private List<KeyResolverSpi> internalKeyResolvers = new ArrayList<KeyResolverSpi>();

    /**
     * Stores the individual (per-KeyInfo) {@link KeyResolverSpi}s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private List<StorageResolver> storageResolvers = nullList;

    /** Field storageResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
public class KeyInfo extends SignatureElementProxy {

/**
 * This class stand for KeyInfo Element that may contain keys, names,
 * certificates and other public key management information,
 * such as in-band key distribution or key agreement data.
 * <BR />
 * KeyInfo Element has two basic functions:
 * One is KeyResolve for getting the public key in signature validation processing.
 * the other one is toElement for getting the element in signature generation processing.
 * <BR />
 * The <CODE>lengthXXX()</CODE> methods provide access to the internal Key
 * objects:
 * <UL>
 * <LI>If the <CODE>KeyInfo</CODE> was constructed from an Element
 * (Signature verification), the <CODE>lengthXXX()</CODE> methods searches
 * for child elements of <CODE>ds:KeyInfo</CODE> for known types. </LI>
 * <LI>If the <CODE>KeyInfo</CODE> was constructed from scratch (during
 * Signature generation), the <CODE>lengthXXX()</CODE> methods return the number
 * of <CODE>XXXs</CODE> objects already passed to the KeyInfo</LI>
 * </UL>
 * <BR />
 * The <CODE>addXXX()</CODE> methods are used for adding Objects of the
 * appropriate type to the <CODE>KeyInfo</CODE>. This is used during signature
 * generation.
 * <BR />
 * The <CODE>itemXXX(int i)</CODE> methods return the i'th object of the
 * corresponding type.
 * <BR />
 * The <CODE>containsXXX()</CODE> methods return <I>whether</I> the KeyInfo
 * contains the corresponding type.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/KeyInfo.java
package com.sun.org.apache.xml.internal.security.keys;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyInfo.java
    void marshal(XMLStructure parent, XMLCryptoContext context)

    /**
     * Marshals the key info to XML.
     *
     * @param parent a mechanism-specific structure containing the parent node
     *    that the marshalled key info will be appended to
     * @param context the <code>XMLCryptoContext</code> containing additional
     *    context (may be null if not applicable)
     * @throws ClassCastException if the type of <code>parent</code> or
     *    <code>context</code> is not compatible with this key info
     * @throws MarshalException if the key info cannot be marshalled
     * @throws NullPointerException if <code>parent</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyInfo.java
    String getId();

    /**
     * Return the optional Id attribute of this <code>KeyInfo</code>, which
     * may be useful for referencing this <code>KeyInfo</code> from other
     * XML structures.
     *
     * @return the Id attribute of this <code>KeyInfo</code> (may be
     *    <code>null</code> if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyInfo.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList unmodifiable
     * list} containing the key information. Each entry of the list is
     * an {@link XMLStructure}.
     *
     * <p>If there is a public subclass representing the type of
     * <code>XMLStructure</code>, it is returned as an instance of that
     * class (ex: an <code>X509Data</code> element would be returned as an
     * instance of {@link javax.xml.crypto.dsig.keyinfo.X509Data}).
     *
     * @return an unmodifiable list of one or more <code>XMLStructure</code>s
     *    in this <code>KeyInfo</code>. Never returns <code>null</code> or an
     *    empty list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyInfo.java
public interface KeyInfo extends XMLStructure {

/**
 * A representation of the XML <code>KeyInfo</code> element as defined in
 * the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * A <code>KeyInfo</code> contains a list of {@link XMLStructure}s, each of
 * which contain information that enables the recipient(s) to obtain the key
 * needed to validate an XML signature. The XML Schema Definition is defined as:
 *
 * <pre>
 * &lt;element name="KeyInfo" type="ds:KeyInfoType"/&gt;
 * &lt;complexType name="KeyInfoType" mixed="true"&gt;
 *   &lt;choice maxOccurs="unbounded"&gt;
 *     &lt;element ref="ds:KeyName"/&gt;
 *     &lt;element ref="ds:KeyValue"/&gt;
 *     &lt;element ref="ds:RetrievalMethod"/&gt;
 *     &lt;element ref="ds:X509Data"/&gt;
 *     &lt;element ref="ds:PGPData"/&gt;
 *     &lt;element ref="ds:SPKIData"/&gt;
 *     &lt;element ref="ds:MgmtData"/&gt;
 *     &lt;any processContents="lax" namespace="##other"/&gt;
 *     &lt;!-- (1,1) elements from (0,unbounded) namespaces --&gt;
 *   &lt;/choice&gt;
 *   &lt;attribute name="Id" type="ID" use="optional"/&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * A <code>KeyInfo</code> instance may be created by invoking one of the
 * {@link KeyInfoFactory#newKeyInfo newKeyInfo} methods of the
 * {@link KeyInfoFactory} class, and passing it a list of one or more
 * <code>XMLStructure</code>s and an optional id parameter;
 * for example:
 * <pre>
 *   KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 *   KeyInfo keyInfo = factory.newKeyInfo
 *      (Collections.singletonList(factory.newKeyName("Alice"), "keyinfo-1"));
 * </pre>
 *
 * <p><code>KeyInfo</code> objects can also be marshalled to XML by invoking
 * the {@link #marshal marshal} method.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see KeyInfoFactory#newKeyInfo(List)
 * @see KeyInfoFactory#newKeyInfo(List, String)
 */
