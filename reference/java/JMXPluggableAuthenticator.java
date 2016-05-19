_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public void refresh() {

    /**
     * Refreshes the configuration.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public AppConfigurationEntry[] getAppConfigurationEntry(String name) {

    /**
     * Gets the JAAS configuration for file-based authentication
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public FileLoginConfig(String passwordFile) {

    /**
     * Creates an instance of <code>FileLoginConfig</code>
     *
     * @param passwordFile A filepath that identifies the password file to use.
     *                     If null then the default password file is used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
private static class FileLoginConfig extends Configuration {

/**
 * This class defines the JAAS configuration for file-based authentication.
 * It is equivalent to the following textual configuration entry:
 * <pre>
 *     JMXPluggableAuthenticator {
 *         com.sun.jmx.remote.security.FileLoginModule required;
 *     };
 * </pre>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public void handle(Callback[] callbacks)

    /**
     * Sets the username and password in the appropriate Callback object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
private final class JMXCallbackHandler implements CallbackHandler {

/**
 * This callback handler supplies the username and password (which was
 * originally supplied by the JMX user) to the JAAS login module performing
 * the authentication. No interactive user prompting is required because the
 * credentials are already available to this class (via its enclosing class).
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public Subject authenticate(Object credentials) {

    /**
     * Authenticate the <code>MBeanServerConnection</code> client
     * with the given client credentials.
     *
     * @param credentials the user-defined credentials to be passed in
     * to the server in order to authenticate the user before creating
     * the <code>MBeanServerConnection</code>.  This parameter must
     * be a two-element <code>String[]</code> containing the client's
     * username and password in that order.
     *
     * @return the authenticated subject containing a
     * <code>JMXPrincipal(username)</code>.
     *
     * @exception SecurityException if the server cannot authenticate the user
     * with the provided credentials.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
    public JMXPluggableAuthenticator(Map<?, ?> env) {

    /**
     * Creates an instance of <code>JMXPluggableAuthenticator</code>
     * and initializes it with a {@link LoginContext}.
     *
     * @param env the environment containing configuration properties for the
     *            authenticator. Can be null, which is equivalent to an empty
     *            Map.
     * @exception SecurityException if the authentication mechanism cannot be
     *            initialized.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXPluggableAuthenticator.java
public final class JMXPluggableAuthenticator implements JMXAuthenticator {

/**
 * <p>This class represents a
 * <a href="{@docRoot}/../guide/security/jaas/JAASRefGuide.html">JAAS</a>
 * based implementation of the {@link JMXAuthenticator} interface.</p>
 *
 * <p>Authentication is performed by passing the supplied user's credentials
 * to one or more authentication mechanisms ({@link LoginModule}) for
 * verification. An authentication mechanism acquires the user's credentials
 * by calling {@link NameCallback} and/or {@link PasswordCallback}.
 * If authentication is successful then an authenticated {@link Subject}
 * filled in with a {@link Principal} is returned.  Authorization checks
 * will then be performed based on this <code>Subject</code>.</p>
 *
 * <p>By default, a single file-based authentication mechanism
 * {@link FileLoginModule} is configured (<code>FileLoginConfig</code>).</p>
 *
 * <p>To override the default configuration use the
 * <code>com.sun.management.jmxremote.login.config</code> management property
 * described in the JRE/lib/management/management.properties file.
 * Set this property to the name of a JAAS configuration entry and ensure that
 * the entry is loaded by the installed {@link Configuration}. In addition,
 * ensure that the authentication mechanisms specified in the entry acquire
 * the user's credentials by calling {@link NameCallback} and
 * {@link PasswordCallback} and that they return a {@link Subject} filled-in
 * with a {@link Principal}, for those users that are successfully
 * authenticated.</p>
 */
