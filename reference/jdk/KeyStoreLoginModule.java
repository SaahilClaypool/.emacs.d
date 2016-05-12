_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals, public credentials and the
     * private credentials that were added by the <code>commit</code> method.
     *
     * <p> If the loaded KeyStore's provider extends
     * <code>java.security.AuthProvider</code>,
     * then the provider's <code>logout</code> method is invoked.
     *
     * <p>
     *
     * @exception LoginException if the logout fails.
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * <p> If the loaded KeyStore's provider extends
     * <code>java.security.AuthProvider</code>,
     * then the provider's <code>logout</code> method is invoked.
     *
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Abstract method to commit the authentication process (phase 2).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>X500Principal</code> for the subject distinguished name of the
     * first certificate in the alias's credentials in the subject's
     * principals,the alias's certificate path in the subject's public
     * credentials, and a<code>X500PrivateCredential</code> whose certificate
     * is the first  certificate in the alias's certificate path and whose
     * private key is the alias's private key in the subject's private
     * credentials.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails
     *
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    private void getKeyStoreInfo() throws LoginException {

    /** Get the credentials from the KeyStore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    @SuppressWarnings("fallthrough")

    /** Get the alias and passwords to use for looking up in the KeyStore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user.
     *
     * <p> Get the Keystore alias and relevant passwords.
     * Retrieve the alias's principal and credentials from the Keystore.
     *
     * <p>
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *                  with the end user (prompting for usernames and
     *                  passwords, for example),
     *                  which may be <code>null</code>. <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
@jdk.Exported

/**
 * Provides a JAAS login module that prompts for a key store alias and
 * populates the subject with the alias's principal and credentials. Stores
 * an <code>X500Principal</code> for the subject distinguished name of the
 * first certificate in the alias's credentials in the subject's principals,
 * the alias's certificate path in the subject's public credentials, and a
 * <code>X500PrivateCredential</code> whose certificate is the first
 * certificate in the alias's certificate path and whose private key is the
 * alias's private key in the subject's private credentials. <p>
 *
 * Recognizes the following options in the configuration file:
 * <dl>
 *
 * <dt> <code>keyStoreURL</code> </dt>
 * <dd> A URL that specifies the location of the key store.  Defaults to
 *      a URL pointing to the .keystore file in the directory specified by the
 *      <code>user.home</code> system property.  The input stream from this
 *      URL is passed to the <code>KeyStore.load</code> method.
 *      "NONE" may be specified if a <code>null</code> stream must be
 *      passed to the <code>KeyStore.load</code> method.
 *      "NONE" should be specified if the KeyStore resides
 *      on a hardware token device, for example.</dd>
 *
 * <dt> <code>keyStoreType</code> </dt>
 * <dd> The key store type.  If not specified, defaults to the result of
 *      calling <code>KeyStore.getDefaultType()</code>.
 *      If the type is "PKCS11", then keyStoreURL must be "NONE"
 *      and privateKeyPasswordURL must not be specified.</dd>
 *
 * <dt> <code>keyStoreProvider</code> </dt>
 * <dd> The key store provider.  If not specified, uses the standard search
 *      order to find the provider. </dd>
 *
 * <dt> <code>keyStoreAlias</code> </dt>
 * <dd> The alias in the key store to login as.  Required when no callback
 *      handler is provided.  No default value. </dd>
 *
 * <dt> <code>keyStorePasswordURL</code> </dt>
 * <dd> A URL that specifies the location of the key store password.  Required
 *      when no callback handler is provided and
 *      <code>protected</code> is false.
 *      No default value. </dd>
 *
 * <dt> <code>privateKeyPasswordURL</code> </dt>
 * <dd> A URL that specifies the location of the specific private key password
 *      needed to access the private key for this alias.
 *      The keystore password
 *      is used if this value is needed and not specified. </dd>
 *
 * <dt> <code>protected</code> </dt>
 * <dd> This value should be set to "true" if the KeyStore
 *      has a separate, protected authentication path
 *      (for example, a dedicated PIN-pad attached to a smart card).
 *      Defaults to "false". If "true" keyStorePasswordURL and
 *      privateKeyPasswordURL must not be specified.</dd>
 *
 * </dl>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals, public credentials and the
     * private credentials that were added by the <code>commit</code> method.
     *
     * <p> If the loaded KeyStore's provider extends
     * <code>java.security.AuthProvider</code>,
     * then the provider's <code>logout</code> method is invoked.
     *
     * <p>
     *
     * @exception LoginException if the logout fails.
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * <p> If the loaded KeyStore's provider extends
     * <code>java.security.AuthProvider</code>,
     * then the provider's <code>logout</code> method is invoked.
     *
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Abstract method to commit the authentication process (phase 2).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>X500Principal</code> for the subject distinguished name of the
     * first certificate in the alias's credentials in the subject's
     * principals,the alias's certificate path in the subject's public
     * credentials, and a<code>X500PrivateCredential</code> whose certificate
     * is the first  certificate in the alias's certificate path and whose
     * private key is the alias's private key in the subject's private
     * credentials.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails
     *
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    private void getKeyStoreInfo() throws LoginException {

    /** Get the credentials from the KeyStore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    @SuppressWarnings("fallthrough")

    /** Get the alias and passwords to use for looking up in the KeyStore. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user.
     *
     * <p> Get the Keystore alias and relevant passwords.
     * Retrieve the alias's principal and credentials from the Keystore.
     *
     * <p>
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *                  with the end user (prompting for usernames and
     *                  passwords, for example),
     *                  which may be <code>null</code>. <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/KeyStoreLoginModule.java
@jdk.Exported

/**
 * Provides a JAAS login module that prompts for a key store alias and
 * populates the subject with the alias's principal and credentials. Stores
 * an <code>X500Principal</code> for the subject distinguished name of the
 * first certificate in the alias's credentials in the subject's principals,
 * the alias's certificate path in the subject's public credentials, and a
 * <code>X500PrivateCredential</code> whose certificate is the first
 * certificate in the alias's certificate path and whose private key is the
 * alias's private key in the subject's private credentials. <p>
 *
 * Recognizes the following options in the configuration file:
 * <dl>
 *
 * <dt> <code>keyStoreURL</code> </dt>
 * <dd> A URL that specifies the location of the key store.  Defaults to
 *      a URL pointing to the .keystore file in the directory specified by the
 *      <code>user.home</code> system property.  The input stream from this
 *      URL is passed to the <code>KeyStore.load</code> method.
 *      "NONE" may be specified if a <code>null</code> stream must be
 *      passed to the <code>KeyStore.load</code> method.
 *      "NONE" should be specified if the KeyStore resides
 *      on a hardware token device, for example.</dd>
 *
 * <dt> <code>keyStoreType</code> </dt>
 * <dd> The key store type.  If not specified, defaults to the result of
 *      calling <code>KeyStore.getDefaultType()</code>.
 *      If the type is "PKCS11", then keyStoreURL must be "NONE"
 *      and privateKeyPasswordURL must not be specified.</dd>
 *
 * <dt> <code>keyStoreProvider</code> </dt>
 * <dd> The key store provider.  If not specified, uses the standard search
 *      order to find the provider. </dd>
 *
 * <dt> <code>keyStoreAlias</code> </dt>
 * <dd> The alias in the key store to login as.  Required when no callback
 *      handler is provided.  No default value. </dd>
 *
 * <dt> <code>keyStorePasswordURL</code> </dt>
 * <dd> A URL that specifies the location of the key store password.  Required
 *      when no callback handler is provided and
 *      <code>protected</code> is false.
 *      No default value. </dd>
 *
 * <dt> <code>privateKeyPasswordURL</code> </dt>
 * <dd> A URL that specifies the location of the specific private key password
 *      needed to access the private key for this alias.
 *      The keystore password
 *      is used if this value is needed and not specified. </dd>
 *
 * <dt> <code>protected</code> </dt>
 * <dd> This value should be set to "true" if the KeyStore
 *      has a separate, protected authentication path
 *      (for example, a dedicated PIN-pad attached to a smart card).
 *      Defaults to "false". If "true" keyStorePasswordURL and
 *      privateKeyPasswordURL must not be specified.</dd>
 *
 * </dl>
 */
