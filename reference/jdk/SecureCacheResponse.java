_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SecureCacheResponse.java
     public abstract Principal getLocalPrincipal();

    /**
      * Returns the principal that was sent to the server during
      * handshaking in the original connection that retrieved the
      * network resource.
      *
      * @return the principal sent to the server. Returns an X500Principal
      * of the end-entity certificate for X509-based cipher suites, and
      * KerberosPrincipal for Kerberos cipher suites. If no principal was
      * sent, then null is returned.
      *
      * @see #getLocalCertificateChain()
      * @see #getPeerPrincipal()
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SecureCacheResponse.java
     public abstract Principal getPeerPrincipal()

    /**
     * Returns the server's principal which was established as part of
     * defining the session during the original connection that
     * retrieved the network resource.
     *
     * @return the server's principal. Returns an X500Principal of the
     * end-entity certiticate for X509-based cipher suites, and
     * KerberosPrincipal for Kerberos cipher suites.
     *
     * @throws SSLPeerUnverifiedException if the peer was not verified.
     *
     * @see #getServerCertificateChain()
     * @see #getLocalPrincipal()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SecureCacheResponse.java
    public abstract List<Certificate> getServerCertificateChain()

    /**
     * Returns the server's certificate chain, which was established as
     * part of defining the session in the original connection that
     * retrieved the network resource, from cache.  Note: This method
     * can be used only when using certificate-based cipher suites;
     * using it with non-certificate-based cipher suites, such as
     * Kerberos, will throw an SSLPeerUnverifiedException.
     *
     * @return an immutable List of Certificate representing the server's
     *         certificate chain.
     * @throws SSLPeerUnverifiedException if the peer is not verified.
     * @see #getPeerPrincipal()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SecureCacheResponse.java
    public abstract List<Certificate> getLocalCertificateChain();

    /**
     * Returns the certificate chain that were sent to the server during
     * handshaking of the original connection that retrieved the
     * network resource.  Note: This method is useful only
     * when using certificate-based cipher suites.
     *
     * @return an immutable List of Certificate representing the
     *           certificate chain that was sent to the server. If no
     *           certificate chain was sent, null will be returned.
     * @see #getLocalPrincipal()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SecureCacheResponse.java
public abstract class SecureCacheResponse extends CacheResponse {

/**
 * Represents a cache response originally retrieved through secure
 * means, such as TLS.
 *
 * @since 1.5
 */
