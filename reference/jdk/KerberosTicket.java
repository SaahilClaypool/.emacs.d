_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public boolean equals(Object other) {

    /**
     * Compares the specified Object with this KerberosTicket for equality.
     * Returns true if the given object is also a
     * {@code KerberosTicket} and the two
     * {@code KerberosTicket} instances are equivalent.
     *
     * @param other the Object to compare to
     * @return true if the specified object is equal to this KerberosTicket,
     * false otherwise. NOTE: Returns false if either of the KerberosTicket
     * objects has been destroyed.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public int hashCode() {

    /**
     * Returns a hashcode for this KerberosTicket.
     *
     * @return a hashCode() for the {@code KerberosTicket}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public boolean isDestroyed() {

    /**
     * Determines if this ticket has been destroyed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public void destroy() throws DestroyFailedException {

    /**
     * Destroys the ticket and destroys any sensitive information stored in
     * it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public void refresh() throws RefreshFailedException {

    /**
     * Extends the validity period of this ticket. The ticket will contain
     * a new session key if the refresh operation succeeds. The refresh
     * operation will fail if the ticket is not renewable or the latest
     * allowable renew time has passed. Any other error returned by the
     * KDC will also cause this method to fail.
     *
     * Note: This method is not synchronized with the the accessor
     * methods of this object. Hence callers need to be aware of multiple
     * threads that might access this and try to renew it at the same
     * time.
     *
     * @throws RefreshFailedException if the ticket is not renewable, or
     * the latest allowable renew time has passed, or the KDC returns some
     * error.
     *
     * @see #isRenewable()
     * @see #getRenewTill()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public boolean isCurrent() {

    /** Determines if this ticket is still current.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final byte[] getEncoded() {

    /**
     * Returns an ASN.1 encoding of the entire ticket.
     *
     * @return an ASN.1 encoding of the entire ticket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final java.net.InetAddress[] getClientAddresses() {

    /**
     * Returns a list of addresses from where the ticket can be used.
     *
     * @return ths list of addresses or null, if the field was not
     * provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final java.util.Date getRenewTill() {

    /**
     * Returns the latest expiration time for this ticket, including all
     * renewals. This will return a null value for non-renewable tickets.
     *
     * @return the latest expiration time for this ticket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final java.util.Date getEndTime() {

    /**
     * Returns the expiration time for this ticket's validity period.
     *
     * @return the expiration time for this ticket's validity period.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final java.util.Date getStartTime() {

    /**
     * Returns the start time for this ticket's validity period.
     *
     * @return the start time for this ticket's validity period
     *         or null if not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final java.util.Date getAuthTime() {

    /**
     * Returns the time that the client was authenticated.
     *
     * @return the time that the client was authenticated
     *         or null if not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean[]  getFlags() {

    /**
     * Returns the flags associated with this ticket. Each element in the
     * returned array indicates the value for the corresponding bit in the
     * ASN.1 BitString that represents the ticket flags.
     *
     * @return the flags associated with this ticket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isInitial() {

    /**
     * Determines if this ticket was issued using the Kerberos AS-Exchange
     * protocol, and not issued based on some ticket-granting ticket.
     *
     * @return true if this ticket was issued using the Kerberos AS-Exchange
     * protocol, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isRenewable() {

    /**
     * Determines is this ticket is renewable. If so, the {@link #refresh()
     * refresh} method can be called, assuming the validity period for
     * renewing is not already over.
     *
     * @return true if this ticket is renewable, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isPostdated() {

    /**
     * Determines is this ticket is post-dated.
     *
     * @return true if this ticket is post-dated, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isProxy() {

    /**
     * Determines is this ticket is a proxy-ticket.
     *
     * @return true if this ticket is a proxy-ticket, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isProxiable() {

    /**
     * Determines if this ticket is proxiable.
     *
     * @return true if this ticket is proxiable, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isForwarded() {

    /**
     * Determines if this ticket had been forwarded or was issued based on
     * authentication involving a forwarded ticket-granting ticket.
     *
     * @return true if this ticket had been forwarded or was issued based on
     * authentication involving a forwarded ticket-granting ticket,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final boolean isForwardable() {

    /**
     * Determines if this ticket is forwardable.
     *
     * @return true if this ticket is forwardable, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final int getSessionKeyType() {

    /**
     * Returns the key type of the session key associated with this
     * ticket as defined by the Kerberos Protocol Specification.
     *
     * @return the key type of the session key associated with this
     * ticket.
     *
     * @see #getSessionKey()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final SecretKey getSessionKey() {

    /**
     * Returns the session key associated with this ticket.
     *
     * @return the session key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final KerberosPrincipal getServer() {

    /**
     * Returns the service principal associated with this ticket.
     *
     * @return the service principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public final KerberosPrincipal getClient() {

    /**
     * Returns the client principal associated with this ticket.
     *
     * @return the client principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    public KerberosTicket(byte[] asn1Encoding,
                         KerberosPrincipal client,
                         KerberosPrincipal server,
                         byte[] sessionKey,
                         int keyType,
                         boolean[] flags,
                         Date authTime,
                         Date startTime,
                         Date endTime,
                         Date renewTill,
                         InetAddress[] clientAddresses) {

    /**
     * Constructs a KerberosTicket using credentials information that a
     * client either receives from a KDC or reads from a cache.
     *
     * @param asn1Encoding the ASN.1 encoding of the ticket as defined by
     * the Kerberos protocol specification.
     * @param client the client that owns this service
     * ticket
     * @param server the service that this ticket is for
     * @param sessionKey the raw bytes for the session key that must be
     * used to encrypt the authenticator that will be sent to the server
     * @param keyType the key type for the session key as defined by the
     * Kerberos protocol specification.
     * @param flags the ticket flags. Each element in this array indicates
     * the value for the corresponding bit in the ASN.1 BitString that
     * represents the ticket flags. If the number of elements in this array
     * is less than the number of flags used by the Kerberos protocol,
     * then the missing flags will be filled in with false.
     * @param authTime the time of initial authentication for the client
     * @param startTime the time after which the ticket will be valid. This
     * may be null in which case the value of authTime is treated as the
     * startTime.
     * @param endTime the time after which the ticket will no longer be
     * valid
     * @param renewTill an absolute expiration time for the ticket,
     * including all renewal that might be possible. This field may be null
     * for tickets that are not renewable.
     * @param clientAddresses the addresses from where the ticket may be
     * used by the client. This field may be null when the ticket is usable
     * from any address.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private InetAddress[] clientAddresses;

    /**
     *
     * The addresses from where the ticket may be used by the client.
     * This field may be null when the ticket is usable from any address.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private KerberosPrincipal server;

    /**
     *
     * The service for which the ticket was issued.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private KerberosPrincipal client;

    /**
     *
     * Client that owns the service ticket
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private Date renewTill;

    /**
     *
     * For renewable Tickets it indicates the maximum endtime that may be
     * included in a renewal. It can be thought of as the absolute expiration
     * time for the ticket, including all renewals. This field may be null
     * for tickets that are not renewable.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private Date endTime;

    /**
     *
     * Time after which the ticket will not be honored. (its expiration time).
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private Date startTime;

    /**
     *
     * Time after which the ticket is valid.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private Date authTime;

    /**
     *
     * Time of initial authentication
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private boolean[] flags;

    /**
     *
     * Ticket Flags as defined in the Kerberos Protocol Specification RFC4120.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private KeyImpl sessionKey;

    /**
     *{@code KeyImpl} is serialized by writing out the ASN1 Encoded bytes
     * of the encryption key. The ASN1 encoding is defined in RFC4120 and as
     * follows:
     * <pre>
     * EncryptionKey   ::= SEQUENCE {
     *          keytype    [0] Int32 -- actually encryption type --,
     *          keyvalue   [1] OCTET STRING
     * }
     * </pre>
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
    private byte[] asn1Encoding;

    /**
     *
     * ASN.1 DER Encoding of the Ticket as defined in the
     * Kerberos Protocol Specification RFC4120.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosTicket.java
public class KerberosTicket implements Destroyable, Refreshable,

/**
 * This class encapsulates a Kerberos ticket and associated
 * information as viewed from the client's point of view. It captures all
 * information that the Key Distribution Center (KDC) sends to the client
 * in the reply message KDC-REP defined in the Kerberos Protocol
 * Specification (<a href=http://www.ietf.org/rfc/rfc4120.txt>RFC 4120</a>).
 * <p>
 * All Kerberos JAAS login modules that authenticate a user to a KDC should
 * use this class. Where available, the login module might even read this
 * information from a ticket cache in the operating system instead of
 * directly communicating with the KDC. During the commit phase of the JAAS
 * authentication process, the JAAS login module should instantiate this
 * class and store the instance in the private credential set of a
 * {@link javax.security.auth.Subject Subject}.<p>
 *
 * It might be necessary for the application to be granted a
 * {@link javax.security.auth.PrivateCredentialPermission
 * PrivateCredentialPermission} if it needs to access a KerberosTicket
 * instance from a Subject. This permission is not needed when the
 * application depends on the default JGSS Kerberos mechanism to access the
 * KerberosTicket. In that case, however, the application will need an
 * appropriate
 * {@link javax.security.auth.kerberos.ServicePermission ServicePermission}.
 * <p>
 * Note that this class is applicable to both ticket granting tickets and
 * other regular service tickets. A ticket granting ticket is just a
 * special case of a more generalized service ticket.
 *
 * @see javax.security.auth.Subject
 * @see javax.security.auth.PrivateCredentialPermission
 * @see javax.security.auth.login.LoginContext
 * @see org.ietf.jgss.GSSCredential
 * @see org.ietf.jgss.GSSManager
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
