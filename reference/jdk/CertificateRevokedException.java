_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    private void readObject(ObjectInputStream ois)

    /**
     * Deserialize the {@code CertificateRevokedException} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    private void writeObject(ObjectOutputStream oos) throws IOException {

    /**
     * Serialize this {@code CertificateRevokedException} instance.
     *
     * @serialData the size of the extensions map (int), followed by all of
     * the extensions in the map, in no particular order. For each extension,
     * the following data is emitted: the OID String (Object), the criticality
     * flag (boolean), the length of the encoded extension value byte array
     * (int), and the encoded extension value bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public Map<String, Extension> getExtensions() {

    /**
     * Returns a map of X.509 extensions containing additional information
     * about the revoked certificate, such as the Invalidity Date
     * Extension. Each key is an OID String that maps to the corresponding
     * Extension.
     *
     * @return an unmodifiable map of X.509 extensions, or an empty map
     *    if there are no extensions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public Date getInvalidityDate() {

    /**
     * Returns the invalidity date, as specified in the Invalidity Date
     * extension of this {@code CertificateRevokedException}. The
     * invalidity date is the date on which it is known or suspected that the
     * private key was compromised or that the certificate otherwise became
     * invalid. This implementation calls {@code getExtensions()} and
     * checks the returned map for an entry for the Invalidity Date extension
     * OID ("2.5.29.24"). If found, it returns the invalidity date in the
     * extension; otherwise null. A new Date object is returned each time the
     * method is invoked to protect against subsequent modification.
     *
     * @return the invalidity date, or {@code null} if not specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public X500Principal getAuthorityName() {

    /**
     * Returns the name of the authority that signed the certificate's
     * revocation status information.
     *
     * @return the {@code X500Principal} that represents the name of the
     *     authority that signed the certificate's revocation status information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public CRLReason getRevocationReason() {

    /**
     * Returns the reason the certificate was revoked.
     *
     * @return the revocation reason
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public Date getRevocationDate() {

    /**
     * Returns the date on which the certificate was revoked. A new copy is
     * returned each time the method is invoked to protect against subsequent
     * modification.
     *
     * @return the revocation date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    public CertificateRevokedException(Date revocationDate, CRLReason reason,
        X500Principal authority, Map<String, Extension> extensions) {

    /**
     * Constructs a {@code CertificateRevokedException} with
     * the specified revocation date, reason code, authority name, and map
     * of extensions.
     *
     * @param revocationDate the date on which the certificate was revoked. The
     *    date is copied to protect against subsequent modification.
     * @param reason the revocation reason
     * @param extensions a map of X.509 Extensions. Each key is an OID String
     *    that maps to the corresponding Extension. The map is copied to
     *    prevent subsequent modification.
     * @param authority the {@code X500Principal} that represents the name
     *    of the authority that signed the certificate's revocation status
     *    information
     * @throws NullPointerException if {@code revocationDate},
     *    {@code reason}, {@code authority}, or
     *    {@code extensions} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    private final X500Principal authority;

    /**
     * @serial the {@code X500Principal} that represents the name of the
     * authority that signed the certificate's revocation status information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
    private Date revocationDate;

    /**
     * @serial the date on which the certificate was revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateRevokedException.java
public class CertificateRevokedException extends CertificateException {

/**
 * An exception that indicates an X.509 certificate is revoked. A
 * {@code CertificateRevokedException} contains additional information
 * about the revoked certificate, such as the date on which the
 * certificate was revoked and the reason it was revoked.
 *
 * @author Sean Mullan
 * @since 1.7
 * @see CertPathValidatorException
 */
