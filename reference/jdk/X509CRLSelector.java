_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public Object clone() {

    /**
     * Returns a copy of this object.
     *
     * @return the copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public boolean match(CRL crl) {

    /**
     * Decides whether a {@code CRL} should be selected.
     *
     * @param crl the {@code CRL} to be checked
     * @return {@code true} if the {@code CRL} should be selected,
     *         {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public String toString() {

    /**
     * Returns a printable representation of the {@code X509CRLSelector}.
     *
     * @return a {@code String} describing the contents of the
     *         {@code X509CRLSelector}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public X509Certificate getCertificateChecking() {

    /**
     * Returns the certificate being checked. This is not a criterion. Rather,
     * it is optional information that may help a {@code CertStore}
     * find CRLs that would be relevant when checking revocation for the
     * specified certificate. If the value returned is {@code null}, then
     * no such optional information is provided.
     *
     * @return the certificate being checked (or {@code null})
     * @see #setCertificateChecking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public Date getDateAndTime() {

    /**
     * Returns the dateAndTime criterion. The specified date must be
     * equal to or later than the value of the thisUpdate component
     * of the {@code X509CRL} and earlier than the value of the
     * nextUpdate component. There is no match if the
     * {@code X509CRL} does not contain a nextUpdate component.
     * If {@code null}, no dateAndTime check will be done.
     * <p>
     * Note that the {@code Date} returned is cloned to protect against
     * subsequent modifications.
     *
     * @return the {@code Date} to match against (or {@code null})
     * @see #setDateAndTime
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public BigInteger getMaxCRL() {

    /**
     * Returns the maxCRLNumber criterion. The {@code X509CRL} must have a
     * CRL number extension whose value is less than or equal to the
     * specified value. If {@code null}, no maxCRLNumber check will be
     * done.
     *
     * @return the maximum CRL number accepted (or {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public BigInteger getMinCRL() {

    /**
     * Returns the minCRLNumber criterion. The {@code X509CRL} must have a
     * CRL number extension whose value is greater than or equal to the
     * specified value. If {@code null}, no minCRLNumber check will be done.
     *
     * @return the minimum CRL number accepted (or {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public Collection<Object> getIssuerNames() {

    /**
     * Returns a copy of the issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names. If the value returned is {@code null}, any
     * issuer distinguished name will do.
     * <p>
     * If the value returned is not {@code null}, it is a
     * {@code Collection} of names. Each name is a {@code String}
     * or a byte array representing a distinguished name (in RFC 2253 or
     * ASN.1 DER encoded form, respectively).  Note that the
     * {@code Collection} returned may contain duplicate names.
     * <p>
     * If a name is specified as a byte array, it should contain a single DER
     * encoded distinguished name, as defined in X.501. The ASN.1 notation for
     * this structure is given in the documentation for
     * {@link #setIssuerNames setIssuerNames(Collection names)}.
     * <p>
     * Note that a deep copy is performed on the {@code Collection} to
     * protect against subsequent modifications.
     *
     * @return a {@code Collection} of names (or {@code null})
     * @see #setIssuerNames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public Collection<X500Principal> getIssuers() {

    /**
     * Returns the issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names. If the value returned is {@code null}, any
     * issuer distinguished name will do.
     * <p>
     * If the value returned is not {@code null}, it is a
     * unmodifiable {@code Collection} of {@code X500Principal}s.
     *
     * @return an unmodifiable {@code Collection} of names
     *   (or {@code null})
     * @see #setIssuers
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setCertificateChecking(X509Certificate cert) {

    /**
     * Sets the certificate being checked. This is not a criterion. Rather,
     * it is optional information that may help a {@code CertStore}
     * find CRLs that would be relevant when checking revocation for the
     * specified certificate. If {@code null} is specified, then no
     * such optional information is provided.
     *
     * @param cert the {@code X509Certificate} being checked
     *             (or {@code null})
     * @see #getCertificateChecking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    void setDateAndTime(Date dateAndTime, long skew) {

    /**
     * Sets the dateAndTime criterion and allows for the specified clock skew
     * (in milliseconds) when checking against the validity period of the CRL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setDateAndTime(Date dateAndTime) {

    /**
     * Sets the dateAndTime criterion. The specified date must be
     * equal to or later than the value of the thisUpdate component
     * of the {@code X509CRL} and earlier than the value of the
     * nextUpdate component. There is no match if the {@code X509CRL}
     * does not contain a nextUpdate component.
     * If {@code null}, no dateAndTime check will be done.
     * <p>
     * Note that the {@code Date} supplied here is cloned to protect
     * against subsequent modifications.
     *
     * @param dateAndTime the {@code Date} to match against
     *                    (or {@code null})
     * @see #getDateAndTime
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setMaxCRLNumber(BigInteger maxCRL) {

    /**
     * Sets the maxCRLNumber criterion. The {@code X509CRL} must have a
     * CRL number extension whose value is less than or equal to the
     * specified value. If {@code null}, no maxCRLNumber check will be
     * done.
     *
     * @param maxCRL the maximum CRL number accepted (or {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setMinCRLNumber(BigInteger minCRL) {

    /**
     * Sets the minCRLNumber criterion. The {@code X509CRL} must have a
     * CRL number extension whose value is greater than or equal to the
     * specified value. If {@code null}, no minCRLNumber check will be
     * done.
     *
     * @param minCRL the minimum CRL number accepted (or {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    private static HashSet<X500Principal> parseIssuerNames(Collection<Object> names)

    /**
     * Parse an argument of the form passed to setIssuerNames,
     * returning a Collection of issuerX500Principals.
     * Throw an IOException if the argument is malformed.
     *
     * @param names a {@code Collection} of names. Each entry is a
     *              String or a byte array (the name, in string or ASN.1
     *              DER encoded form, respectively). <Code>Null</Code> is
     *              not an acceptable value.
     * @return a HashSet of issuerX500Principals
     * @throws IOException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    private static HashSet<Object> cloneIssuerNames(Collection<Object> names) {

    /**
     * Clone an argument of the form passed to setIssuerNames.
     * Throw a RuntimeException if the argument is malformed.
     * <p>
     * This method wraps cloneAndCheckIssuerNames, changing any IOException
     * into a RuntimeException. This method should be used when the object being
     * cloned has already been checked, so there should never be any exceptions.
     *
     * @param names a {@code Collection} of names. Each entry is a
     *              String or a byte array (the name, in string or ASN.1
     *              DER encoded form, respectively). {@code null} is
     *              not an acceptable value.
     * @return a deep copy of the specified {@code Collection}
     * @throws RuntimeException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    private static HashSet<Object> cloneAndCheckIssuerNames(Collection<?> names)

    /**
     * Clone and check an argument of the form passed to
     * setIssuerNames. Throw an IOException if the argument is malformed.
     *
     * @param names a {@code Collection} of names. Each entry is a
     *              String or a byte array (the name, in string or ASN.1
     *              DER encoded form, respectively). {@code null} is
     *              not an acceptable value.
     * @return a deep copy of the specified {@code Collection}
     * @throws IOException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    private void addIssuerNameInternal(Object name, X500Principal principal) {

    /**
     * A private method that adds a name (String or byte array) to the
     * issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names.
     *
     * @param name the name in string or byte array form
     * @param principal the name in X500Principal form
     * @throws IOException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void addIssuerName(byte[] name) throws IOException {

    /**
     * Adds a name to the issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names.
     * <p>
     * This method allows the caller to add a name to the set of issuer names
     * which {@code X509CRLs} may contain. The specified name is added to
     * any previous value for the issuerNames criterion. If the specified name
     * is a duplicate, it may be ignored.
     * If a name is specified as a byte array, it should contain a single DER
     * encoded distinguished name, as defined in X.501. The ASN.1 notation for
     * this structure is as follows.
     * <p>
     * The name is provided as a byte array. This byte array should contain
     * a single DER encoded distinguished name, as defined in X.501. The ASN.1
     * notation for this structure appears in the documentation for
     * {@link #setIssuerNames setIssuerNames(Collection names)}.
     * <p>
     * Note that the byte array supplied here is cloned to protect against
     * subsequent modifications.
     *
     * @param name a byte array containing the name in ASN.1 DER encoded form
     * @throws IOException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void addIssuerName(String name) throws IOException {

    /**
     * <strong>Denigrated</strong>, use
     * {@linkplain #addIssuer(X500Principal)} or
     * {@linkplain #addIssuerName(byte[])} instead. This method should not be
     * relied on as it can fail to match some CRLs because of a loss of
     * encoding information in the RFC 2253 String form of some distinguished
     * names.
     * <p>
     * Adds a name to the issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names.
     * <p>
     * This method allows the caller to add a name to the set of issuer names
     * which {@code X509CRLs} may contain. The specified name is added to
     * any previous value for the issuerNames criterion.
     * If the specified name is a duplicate, it may be ignored.
     *
     * @param name the name in RFC 2253 form
     * @throws IOException if a parsing error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void addIssuer(X500Principal issuer) {

    /**
     * Adds a name to the issuerNames criterion. The issuer distinguished
     * name in the {@code X509CRL} must match at least one of the specified
     * distinguished names.
     * <p>
     * This method allows the caller to add a name to the set of issuer names
     * which {@code X509CRLs} may contain. The specified name is added to
     * any previous value for the issuerNames criterion.
     * If the specified name is a duplicate, it may be ignored.
     *
     * @param issuer the issuer as X500Principal
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setIssuerNames(Collection<?> names) throws IOException {

    /**
     * <strong>Note:</strong> use {@linkplain #setIssuers(Collection)} instead
     * or only specify the byte array form of distinguished names when using
     * this method. See {@link #addIssuerName(String)} for more information.
     * <p>
     * Sets the issuerNames criterion. The issuer distinguished name in the
     * {@code X509CRL} must match at least one of the specified
     * distinguished names. If {@code null}, any issuer distinguished name
     * will do.
     * <p>
     * This method allows the caller to specify, with a single method call,
     * the complete set of issuer names which {@code X509CRLs} may contain.
     * The specified value replaces the previous value for the issuerNames
     * criterion.
     * <p>
     * The {@code names} parameter (if not {@code null}) is a
     * {@code Collection} of names. Each name is a {@code String}
     * or a byte array representing a distinguished name (in
     * <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a> or
     * ASN.1 DER encoded form, respectively). If {@code null} is supplied
     * as the value for this argument, no issuerNames check will be performed.
     * <p>
     * Note that the {@code names} parameter can contain duplicate
     * distinguished names, but they may be removed from the
     * {@code Collection} of names returned by the
     * {@link #getIssuerNames getIssuerNames} method.
     * <p>
     * If a name is specified as a byte array, it should contain a single DER
     * encoded distinguished name, as defined in X.501. The ASN.1 notation for
     * this structure is as follows.
     * <pre>{@code
     * Name ::= CHOICE {
     *   RDNSequence }
     *
     * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
     *
     * RelativeDistinguishedName ::=
     *   SET SIZE (1 .. MAX) OF AttributeTypeAndValue
     *
     * AttributeTypeAndValue ::= SEQUENCE {
     *   type     AttributeType,
     *   value    AttributeValue }
     *
     * AttributeType ::= OBJECT IDENTIFIER
     *
     * AttributeValue ::= ANY DEFINED BY AttributeType
     * ....
     * DirectoryString ::= CHOICE {
     *       teletexString           TeletexString (SIZE (1..MAX)),
     *       printableString         PrintableString (SIZE (1..MAX)),
     *       universalString         UniversalString (SIZE (1..MAX)),
     *       utf8String              UTF8String (SIZE (1.. MAX)),
     *       bmpString               BMPString (SIZE (1..MAX)) }
     * }</pre>
     * <p>
     * Note that a deep copy is performed on the {@code Collection} to
     * protect against subsequent modifications.
     *
     * @param names a {@code Collection} of names (or {@code null})
     * @throws IOException if a parsing error occurs
     * @see #getIssuerNames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public void setIssuers(Collection<X500Principal> issuers) {

    /**
     * Sets the issuerNames criterion. The issuer distinguished name in the
     * {@code X509CRL} must match at least one of the specified
     * distinguished names. If {@code null}, any issuer distinguished name
     * will do.
     * <p>
     * This method allows the caller to specify, with a single method call,
     * the complete set of issuer names which {@code X509CRLs} may contain.
     * The specified value replaces the previous value for the issuerNames
     * criterion.
     * <p>
     * The {@code names} parameter (if not {@code null}) is a
     * {@code Collection} of {@code X500Principal}s.
     * <p>
     * Note that the {@code names} parameter can contain duplicate
     * distinguished names, but they may be removed from the
     * {@code Collection} of names returned by the
     * {@link #getIssuers getIssuers} method.
     * <p>
     * Note that a copy is performed on the {@code Collection} to
     * protect against subsequent modifications.
     *
     * @param issuers a {@code Collection} of X500Principals
     *   (or {@code null})
     * @see #getIssuers
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
    public X509CRLSelector() {}

    /**
     * Creates an {@code X509CRLSelector}. Initially, no criteria are set
     * so any {@code X509CRL} will match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/X509CRLSelector.java
public class X509CRLSelector implements CRLSelector {

/**
 * A {@code CRLSelector} that selects {@code X509CRLs} that
 * match all specified criteria. This class is particularly useful when
 * selecting CRLs from a {@code CertStore} to check revocation status
 * of a particular certificate.
 * <p>
 * When first constructed, an {@code X509CRLSelector} has no criteria
 * enabled and each of the {@code get} methods return a default
 * value ({@code null}). Therefore, the {@link #match match} method
 * would return {@code true} for any {@code X509CRL}. Typically,
 * several criteria are enabled (by calling {@link #setIssuers setIssuers}
 * or {@link #setDateAndTime setDateAndTime}, for instance) and then the
 * {@code X509CRLSelector} is passed to
 * {@link CertStore#getCRLs CertStore.getCRLs} or some similar
 * method.
 * <p>
 * Please refer to <a href="http://www.ietf.org/rfc/rfc3280.txt">RFC 3280:
 * Internet X.509 Public Key Infrastructure Certificate and CRL Profile</a>
 * for definitions of the X.509 CRL fields and extensions mentioned below.
 * <p>
 * <b>Concurrent Access</b>
 * <p>
 * Unless otherwise specified, the methods defined in this class are not
 * thread-safe. Multiple threads that need to access a single
 * object concurrently should synchronize amongst themselves and
 * provide the necessary locking. Multiple threads each manipulating
 * separate objects need not synchronize.
 *
 * @see CRLSelector
 * @see X509CRL
 *
 * @since       1.4
 * @author      Steve Hanna
 */
