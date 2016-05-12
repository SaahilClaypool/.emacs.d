_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public String toString(boolean detailed);

    /**
     * Returns a string that represents the contents of the certificate.
     *
     * @param detailed whether or not to give detailed information
     * about the certificate
     *
     * @return a string representing the contents of the certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract String getFormat();

    /**
     * Returns the name of the coding format. This is used as a hint to find
     * an appropriate parser. It could be "X.509", "PGP", etc. This is
     * the format produced and understood by the {@code encode}
     * and {@code decode} methods.
     *
     * @return the name of the coding format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract void decode(InputStream stream)

    /**
     * Decodes a certificate from an input stream. The format should be
     * that returned by {@code getFormat} and produced by
     * {@code encode}.
     *
     * @param stream the input stream from which to fetch the data
     * being decoded.
     *
     * @exception KeyException if the certificate is not properly initialized,
     * or data is missing, etc.
     *
     * @exception IOException if an exception occurs while trying to input
     * the encoded certificate from the input stream.
     *
     * @see #encode
     * @see #getFormat
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract void encode(OutputStream stream)

    /**
     * Encodes the certificate to an output stream in a format that can
     * be decoded by the {@code decode} method.
     *
     * @param stream the output stream to which to encode the
     * certificate.
     *
     * @exception KeyException if the certificate is not
     * properly initialized, or data is missing, etc.
     *
     * @exception IOException if a stream exception occurs while
     * trying to output the encoded certificate to the output stream.
     *
     * @see #decode
     * @see #getFormat
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract PublicKey getPublicKey();

    /**
     * Returns the key of the principal-key pair being guaranteed by
     * the guarantor.
     *
     * @return the public key that this certificate certifies belongs
     * to a particular principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract Principal getPrincipal();

    /**
     * Returns the principal of the principal-key pair being guaranteed by
     * the guarantor.
     *
     * @return the principal to which this certificate is bound.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
    public abstract Principal getGuarantor();

    /**
     * Returns the guarantor of the certificate, that is, the principal
     * guaranteeing that the public key associated with this certificate
     * is that of the principal associated with this certificate. For X.509
     * certificates, the guarantor will typically be a Certificate Authority
     * (such as the United States Postal Service or Verisign, Inc.).
     *
     * @return the guarantor which guaranteed the principal-key
     * binding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Certificate.java
@Deprecated

/**
 * <p>This is an interface of abstract methods for managing a
 * variety of identity certificates.
 * An identity certificate is a guarantee by a principal that
 * a public key is that of another principal.  (A principal represents
 * an entity such as an individual user, a group, or a corporation.)
 *
 * <p>In particular, this interface is intended to be a common
 * abstraction for constructs that have different formats but
 * important common uses.  For example, different types of
 * certificates, such as X.509 certificates and PGP certificates,
 * share general certificate functionality (the need to encode and
 * decode certificates) and some types of information, such as a
 * public key, the principal whose key it is, and the guarantor
 * guaranteeing that the public key is that of the specified
 * principal. So an implementation of X.509 certificates and an
 * implementation of PGP certificates can both utilize the Certificate
 * interface, even though their formats and additional types and
 * amounts of information stored are different.
 *
 * <p><b>Important</b>: This interface is useful for cataloging and
 * grouping objects sharing certain common uses. It does not have any
 * semantics of its own. In particular, a Certificate object does not
 * make any statement as to the <i>validity</i> of the binding. It is
 * the duty of the application implementing this interface to verify
 * the certificate and satisfy itself of its validity.
 *
 * @author Benjamin Renaud
 * @deprecated A new certificate handling package is created in the Java platform.
 *             This Certificate interface is entirely deprecated and
 *             is here to allow for a smooth transition to the new
 *             package.
 * @see java.security.cert.Certificate
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    protected Object writeReplace() throws java.io.ObjectStreamException {

    /**
     * Replace the Certificate to be serialized.
     *
     * @return the alternate Certificate object to be serialized
     *
     * @throws java.io.ObjectStreamException if a new object representing
     * this Certificate could not be created
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
        protected Object readResolve() throws java.io.ObjectStreamException {

        /**
         * Resolve the Certificate Object.
         *
         * <p>
         *
         * @return the resolved Certificate Object
         *
         * @throws java.io.ObjectStreamException if the Certificate
         *      could not be resolved
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
        protected CertificateRep(String type, byte[] data) {

        /**
         * Construct the alternate Certificate class with the Certificate
         * type and Certificate encoding bytes.
         *
         * <p>
         *
         * @param type the standard name of the Certificate type. <p>
         *
         * @param data the Certificate data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    protected static class CertificateRep implements java.io.Serializable {

    /**
     * Alternate Certificate class for serialization.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public abstract PublicKey getPublicKey();

    /**
     * Gets the public key from this certificate.
     *
     * @return the public key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public abstract String toString();

    /**
     * Returns a string representation of this certificate.
     *
     * @return a string representation of this certificate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public void verify(PublicKey key, Provider sigProvider)

    /**
     * Verifies that this certificate was signed using the
     * private key that corresponds to the specified public key.
     * This method uses the signature verification engine
     * supplied by the specified provider. Note that the specified
     * Provider object does not have to be registered in the provider list.
     *
     * <p> This method was added to version 1.8 of the Java Platform
     * Standard Edition. In order to maintain backwards compatibility with
     * existing service providers, this method cannot be {@code abstract}
     * and by default throws an {@code UnsupportedOperationException}.
     *
     * @param key the PublicKey used to carry out the verification.
     * @param sigProvider the signature provider.
     *
     * @exception NoSuchAlgorithmException on unsupported signature
     * algorithms.
     * @exception InvalidKeyException on incorrect key.
     * @exception SignatureException on signature errors.
     * @exception CertificateException on encoding errors.
     * @exception UnsupportedOperationException if the method is not supported
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public abstract void verify(PublicKey key, String sigProvider)

    /**
     * Verifies that this certificate was signed using the
     * private key that corresponds to the specified public key.
     * This method uses the signature verification engine
     * supplied by the specified provider.
     *
     * @param key the PublicKey used to carry out the verification.
     * @param sigProvider the name of the signature provider.
     *
     * @exception NoSuchAlgorithmException on unsupported signature
     * algorithms.
     * @exception InvalidKeyException on incorrect key.
     * @exception NoSuchProviderException on incorrect provider.
     * @exception SignatureException on signature errors.
     * @exception CertificateException on encoding errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public abstract void verify(PublicKey key)

    /**
     * Verifies that this certificate was signed using the
     * private key that corresponds to the specified public key.
     *
     * @param key the PublicKey used to carry out the verification.
     *
     * @exception NoSuchAlgorithmException on unsupported signature
     * algorithms.
     * @exception InvalidKeyException on incorrect key.
     * @exception NoSuchProviderException if there's no default provider.
     * @exception SignatureException on signature errors.
     * @exception CertificateException on encoding errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public abstract byte[] getEncoded()

    /**
     * Returns the encoded form of this certificate. It is
     * assumed that each certificate type would have only a single
     * form of encoding; for example, X.509 certificates would
     * be encoded as ASN.1 DER.
     *
     * @return the encoded form of this certificate
     *
     * @exception CertificateEncodingException if an encoding error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public int hashCode() {

    /**
     * Returns a hashcode value for this certificate from its
     * encoded form.
     *
     * @return the hashcode value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public boolean equals(Object other) {

    /**
     * Compares this certificate for equality with the specified
     * object. If the {@code other} object is an
     * {@code instanceof} {@code Certificate}, then
     * its encoded form is retrieved and compared with the
     * encoded form of this certificate.
     *
     * @param other the object to test for equality with this certificate.
     * @return true iff the encoded forms of the two certificates
     * match, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    public final String getType() {

    /**
     * Returns the type of this certificate.
     *
     * @return the type of this certificate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    protected Certificate(String type) {

    /**
     * Creates a certificate of the specified type.
     *
     * @param type the standard name of the certificate type.
     * See the CertificateFactory section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertificateFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard certificate types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
    private int hash = -1; // Default to -1

    /** Cache the hash code for the certiticate */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/Certificate.java
public abstract class Certificate implements java.io.Serializable {

/**
 * <p>Abstract class for managing a variety of identity certificates.
 * An identity certificate is a binding of a principal to a public key which
 * is vouched for by another principal.  (A principal represents
 * an entity such as an individual user, a group, or a corporation.)
 *<p>
 * This class is an abstraction for certificates that have different
 * formats but important common uses.  For example, different types of
 * certificates, such as X.509 and PGP, share general certificate
 * functionality (like encoding and verifying) and
 * some types of information (like a public key).
 * <p>
 * X.509, PGP, and SDSI certificates can all be implemented by
 * subclassing the Certificate class, even though they contain different
 * sets of information, and they store and retrieve the information in
 * different ways.
 *
 * @see X509Certificate
 * @see CertificateFactory
 *
 * @author Hemma Prafullchandra
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public abstract PublicKey getPublicKey();

    /**
     * Gets the public key from this certificate.
     *
     * @return the public key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public abstract String toString();

    /**
     * Returns a string representation of this certificate.
     *
     * @return a string representation of this certificate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public abstract void verify(PublicKey key, String sigProvider)

    /**
     * Verifies that this certificate was signed using the
     * private key that corresponds to the specified public key.
     * This method uses the signature verification engine
     * supplied by the specified provider.
     *
     * @param key the PublicKey used to carry out the verification.
     * @param sigProvider the name of the signature provider.
     * @exception NoSuchAlgorithmException on unsupported signature algorithms.
     * @exception InvalidKeyException on incorrect key.
     * @exception NoSuchProviderException on incorrect provider.
     * @exception SignatureException on signature errors.
     * @exception CertificateException on encoding errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public abstract void verify(PublicKey key)

    /**
     * Verifies that this certificate was signed using the
     * private key that corresponds to the specified public key.
     *
     * @param key the PublicKey used to carry out the verification.
     *
     * @exception NoSuchAlgorithmException on unsupported signature
     * algorithms.
     * @exception InvalidKeyException on incorrect key.
     * @exception NoSuchProviderException if there's no default provider.
     * @exception SignatureException on signature errors.
     * @exception CertificateException on encoding errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public abstract byte[] getEncoded() throws CertificateEncodingException;

    /**
     * Returns the encoded form of this certificate. It is
     * assumed that each certificate type would have only a single
     * form of encoding; for example, X.509 certificates would
     * be encoded as ASN.1 DER.
     *
     * @return encoded form of this certificate
     * @exception CertificateEncodingException on internal certificate
     *            encoding failure
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public int hashCode() {

    /**
     * Returns a hashcode value for this certificate from its
     * encoded form.
     *
     * @return the hashcode value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
    public boolean equals(Object other) {

    /**
     * Compares this certificate for equality with the specified
     * object. If the {@code other} object is an
     * {@code instanceof} {@code Certificate}, then
     * its encoded form is retrieved and compared with the
     * encoded form of this certificate.
     *
     * @param other the object to test for equality with this certificate.
     * @return true if the encoded forms of the two certificates
     *         match, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/Certificate.java
public abstract class Certificate {

/**
 * <p>Abstract class for managing a variety of identity certificates.
 * An identity certificate is a guarantee by a principal that
 * a public key is that of another principal.  (A principal represents
 * an entity such as an individual user, a group, or a corporation.)
 *<p>
 * This class is an abstraction for certificates that have different
 * formats but important common uses.  For example, different types of
 * certificates, such as X.509 and PGP, share general certificate
 * functionality (like encoding and verifying) and
 * some types of information (like a public key).
 * <p>
 * X.509, PGP, and SDSI certificates can all be implemented by
 * subclassing the Certificate class, even though they contain different
 * sets of information, and they store and retrieve the information in
 * different ways.
 *
 * <p><em>Note: The classes in the package {@code javax.security.cert}
 * exist for compatibility with earlier versions of the
 * Java Secure Sockets Extension (JSSE). New applications should instead
 * use the standard Java SE certificate classes located in
 * {@code java.security.cert}.</em></p>
 *
 * @since 1.4
 * @see X509Certificate
 *
 * @author Hemma Prafullchandra
 */
