_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public String toString() {

    /**
     * Returns a formatted string describing the parameters.
     *
     * @return a formatted string describing the parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public Object clone() {

    /**
     * Returns a copy of this object. Changes to the copy will not affect
     * the original and vice versa.
     * <p>
     * Note: this method currently performs a shallow copy of the object
     * (simply calls {@code Object.clone()}). This may be changed in a
     * future revision to perform a deep copy if new parameters are added
     * that should not be shared.
     *
     * @return the copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public int getPort() {

    /**
     * Returns the port number of the LDAP server.
     *
     * @return the port number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public String getServerName() {

    /**
     * Returns the DNS name of the LDAP server.
     *
     * @return the name (not {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public LDAPCertStoreParameters() {

    /**
     * Creates an instance of {@code LDAPCertStoreParameters} with the
     * default parameter values (server name "localhost", port 389).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public LDAPCertStoreParameters(String serverName) {

    /**
     * Creates an instance of {@code LDAPCertStoreParameters} with the
     * specified server name and a default port of 389.
     *
     * @param serverName the DNS name of the LDAP server
     * @exception NullPointerException if {@code serverName} is
     * {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    public LDAPCertStoreParameters(String serverName, int port) {

    /**
     * Creates an instance of {@code LDAPCertStoreParameters} with the
     * specified parameter values.
     *
     * @param serverName the DNS name of the LDAP server
     * @param port the port number of the LDAP server
     * @exception NullPointerException if {@code serverName} is
     * {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    private String serverName;

    /**
     * the DNS name of the LDAP server
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
    private int port;

    /**
     * the port number of the LDAP server
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/LDAPCertStoreParameters.java
public class LDAPCertStoreParameters implements CertStoreParameters {

/**
 * Parameters used as input for the LDAP {@code CertStore} algorithm.
 * <p>
 * This class is used to provide necessary configuration parameters (server
 * name and port number) to implementations of the LDAP {@code CertStore}
 * algorithm.
 * <p>
 * <b>Concurrent Access</b>
 * <p>
 * Unless otherwise specified, the methods defined in this class are not
 * thread-safe. Multiple threads that need to access a single
 * object concurrently should synchronize amongst themselves and
 * provide the necessary locking. Multiple threads each manipulating
 * separate objects need not synchronize.
 *
 * @since       1.4
 * @author      Steve Hanna
 * @see         CertStore
 */
