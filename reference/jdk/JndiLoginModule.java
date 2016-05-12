_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void cleanState() {

    /**
     * Clean out state because of a failed authentication attempt
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private boolean verifyPassword(String encryptedPassword, String password) {

    /**
     * Verify a password against the encrypted passwd from /etc/shadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void getUsernamePassword(boolean getPasswdFromSharedState)

    /**
     * Get the username and password.
     * This method does not return any value.
     * Instead, it sets global name and password variables.
     *
     * <p> Also note that this method will set the username and password
     * values in the shared state in case subsequent LoginModules
     * want to use them via use/tryFirstPass.
     *
     * <p>
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * Attempt authentication
     *
     * <p>
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals
     * that were added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     * <code>UnixPrincipal</code>
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public boolean login() throws LoginException {

    /**
     * <p> Prompt for username and password.
     * Verify the password against the relevant name service.
     *
     * <p>
     *
     * @return true always, since this <code>LoginModule</code>
     *          should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     *                  passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public final String USER_PROVIDER = "user.provider.url";

    /** JNDI Provider */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
@jdk.Exported

/**
 * <p> The module prompts for a username and password
 * and then verifies the password against the password stored in
 * a directory service configured under JNDI.
 *
 * <p> This <code>LoginModule</code> interoperates with
 * any conformant JNDI service provider.  To direct this
 * <code>LoginModule</code> to use a specific JNDI service provider,
 * two options must be specified in the login <code>Configuration</code>
 * for this <code>LoginModule</code>.
 * <pre>
 *      user.provider.url=<b>name_service_url</b>
 *      group.provider.url=<b>name_service_url</b>
 * </pre>
 *
 * <b>name_service_url</b> specifies
 * the directory service and path where this <code>LoginModule</code>
 * can access the relevant user and group information.  Because this
 * <code>LoginModule</code> only performs one-level searches to
 * find the relevant user information, the <code>URL</code>
 * must point to a directory one level above where the user and group
 * information is stored in the directory service.
 * For example, to instruct this <code>LoginModule</code>
 * to contact a NIS server, the following URLs must be specified:
 * <pre>
 *    user.provider.url="nis://<b>NISServerHostName</b>/<b>NISDomain</b>/user"
 *    group.provider.url="nis://<b>NISServerHostName</b>/<b>NISDomain</b>/system/group"
 * </pre>
 *
 * <b>NISServerHostName</b> specifies the server host name of the
 * NIS server (for example, <i>nis.sun.com</i>, and <b>NISDomain</b>
 * specifies the domain for that NIS server (for example, <i>jaas.sun.com</i>.
 * To contact an LDAP server, the following URLs must be specified:
 * <pre>
 *    user.provider.url="ldap://<b>LDAPServerHostName</b>/<b>LDAPName</b>"
 *    group.provider.url="ldap://<b>LDAPServerHostName</b>/<b>LDAPName</b>"
 * </pre>
 *
 * <b>LDAPServerHostName</b> specifies the server host name of the
 * LDAP server, which may include a port number
 * (for example, <i>ldap.sun.com:389</i>),
 * and <b>LDAPName</b> specifies the entry name in the LDAP directory
 * (for example, <i>ou=People,o=Sun,c=US</i> and <i>ou=Groups,o=Sun,c=US</i>
 * for user and group information, respectively).
 *
 * <p> The format in which the user's information must be stored in
 * the directory service is specified in RFC 2307.  Specifically,
 * this <code>LoginModule</code> will search for the user's entry in the
 * directory service using the user's <i>uid</i> attribute,
 * where <i>uid=<b>username</b></i>.  If the search succeeds,
 * this <code>LoginModule</code> will then
 * obtain the user's encrypted password from the retrieved entry
 * using the <i>userPassword</i> attribute.
 * This <code>LoginModule</code> assumes that the password is stored
 * as a byte array, which when converted to a <code>String</code>,
 * has the following format:
 * <pre>
 *      "{crypt}<b>encrypted_password</b>"
 * </pre>
 *
 * The LDAP directory server must be configured
 * to permit read access to the userPassword attribute.
 * If the user entered a valid username and password,
 * this <code>LoginModule</code> associates a
 * <code>UnixPrincipal</code>, <code>UnixNumericUserPrincipal</code>,
 * and the relevant UnixNumericGroupPrincipals with the
 * <code>Subject</code>.
 *
 * <p> This LoginModule also recognizes the following <code>Configuration</code>
 * options:
 * <pre>
 *    debug          if, true, debug messages are output to System.out.
 *
 *    useFirstPass   if, true, this LoginModule retrieves the
 *                   username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for authentication.
 *                   If authentication fails, no attempt for a retry is made,
 *                   and the failure is reported back to the calling
 *                   application.
 *
 *    tryFirstPass   if, true, this LoginModule retrieves the
 *                   the username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for authentication.
 *                   If authentication fails, the module uses the
 *                   CallbackHandler to retrieve a new username and password,
 *                   and another attempt to authenticate is made.
 *                   If the authentication fails, the failure is reported
 *                   back to the calling application.
 *
 *    storePass      if, true, this LoginModule stores the username and password
 *                   obtained from the CallbackHandler in the module's
 *                   shared state, using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  This is not performed if existing values already
 *                   exist for the username and password in the shared state,
 *                   or if authentication fails.
 *
 *    clearPass     if, true, this <code>LoginModule</code> clears the
 *                  username and password stored in the module's shared state
 *                  after both phases of authentication (login and commit)
 *                  have completed.
 * </pre>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void cleanState() {

    /**
     * Clean out state because of a failed authentication attempt
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private boolean verifyPassword(String encryptedPassword, String password) {

    /**
     * Verify a password against the encrypted passwd from /etc/shadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void getUsernamePassword(boolean getPasswdFromSharedState)

    /**
     * Get the username and password.
     * This method does not return any value.
     * Instead, it sets global name and password variables.
     *
     * <p> Also note that this method will set the username and password
     * values in the shared state in case subsequent LoginModules
     * want to use them via use/tryFirstPass.
     *
     * <p>
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * Attempt authentication
     *
     * <p>
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals
     * that were added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     * <code>UnixPrincipal</code>
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public boolean login() throws LoginException {

    /**
     * <p> Prompt for username and password.
     * Verify the password against the relevant name service.
     *
     * <p>
     *
     * @return true always, since this <code>LoginModule</code>
     *          should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
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
     *                  passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
    public final String USER_PROVIDER = "user.provider.url";

    /** JNDI Provider */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/JndiLoginModule.java
@jdk.Exported

/**
 * <p> The module prompts for a username and password
 * and then verifies the password against the password stored in
 * a directory service configured under JNDI.
 *
 * <p> This <code>LoginModule</code> interoperates with
 * any conformant JNDI service provider.  To direct this
 * <code>LoginModule</code> to use a specific JNDI service provider,
 * two options must be specified in the login <code>Configuration</code>
 * for this <code>LoginModule</code>.
 * <pre>
 *      user.provider.url=<b>name_service_url</b>
 *      group.provider.url=<b>name_service_url</b>
 * </pre>
 *
 * <b>name_service_url</b> specifies
 * the directory service and path where this <code>LoginModule</code>
 * can access the relevant user and group information.  Because this
 * <code>LoginModule</code> only performs one-level searches to
 * find the relevant user information, the <code>URL</code>
 * must point to a directory one level above where the user and group
 * information is stored in the directory service.
 * For example, to instruct this <code>LoginModule</code>
 * to contact a NIS server, the following URLs must be specified:
 * <pre>
 *    user.provider.url="nis://<b>NISServerHostName</b>/<b>NISDomain</b>/user"
 *    group.provider.url="nis://<b>NISServerHostName</b>/<b>NISDomain</b>/system/group"
 * </pre>
 *
 * <b>NISServerHostName</b> specifies the server host name of the
 * NIS server (for example, <i>nis.sun.com</i>, and <b>NISDomain</b>
 * specifies the domain for that NIS server (for example, <i>jaas.sun.com</i>.
 * To contact an LDAP server, the following URLs must be specified:
 * <pre>
 *    user.provider.url="ldap://<b>LDAPServerHostName</b>/<b>LDAPName</b>"
 *    group.provider.url="ldap://<b>LDAPServerHostName</b>/<b>LDAPName</b>"
 * </pre>
 *
 * <b>LDAPServerHostName</b> specifies the server host name of the
 * LDAP server, which may include a port number
 * (for example, <i>ldap.sun.com:389</i>),
 * and <b>LDAPName</b> specifies the entry name in the LDAP directory
 * (for example, <i>ou=People,o=Sun,c=US</i> and <i>ou=Groups,o=Sun,c=US</i>
 * for user and group information, respectively).
 *
 * <p> The format in which the user's information must be stored in
 * the directory service is specified in RFC 2307.  Specifically,
 * this <code>LoginModule</code> will search for the user's entry in the
 * directory service using the user's <i>uid</i> attribute,
 * where <i>uid=<b>username</b></i>.  If the search succeeds,
 * this <code>LoginModule</code> will then
 * obtain the user's encrypted password from the retrieved entry
 * using the <i>userPassword</i> attribute.
 * This <code>LoginModule</code> assumes that the password is stored
 * as a byte array, which when converted to a <code>String</code>,
 * has the following format:
 * <pre>
 *      "{crypt}<b>encrypted_password</b>"
 * </pre>
 *
 * The LDAP directory server must be configured
 * to permit read access to the userPassword attribute.
 * If the user entered a valid username and password,
 * this <code>LoginModule</code> associates a
 * <code>UnixPrincipal</code>, <code>UnixNumericUserPrincipal</code>,
 * and the relevant UnixNumericGroupPrincipals with the
 * <code>Subject</code>.
 *
 * <p> This LoginModule also recognizes the following <code>Configuration</code>
 * options:
 * <pre>
 *    debug          if, true, debug messages are output to System.out.
 *
 *    useFirstPass   if, true, this LoginModule retrieves the
 *                   username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for authentication.
 *                   If authentication fails, no attempt for a retry is made,
 *                   and the failure is reported back to the calling
 *                   application.
 *
 *    tryFirstPass   if, true, this LoginModule retrieves the
 *                   the username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for authentication.
 *                   If authentication fails, the module uses the
 *                   CallbackHandler to retrieve a new username and password,
 *                   and another attempt to authenticate is made.
 *                   If the authentication fails, the failure is reported
 *                   back to the calling application.
 *
 *    storePass      if, true, this LoginModule stores the username and password
 *                   obtained from the CallbackHandler in the module's
 *                   shared state, using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  This is not performed if existing values already
 *                   exist for the username and password in the shared state,
 *                   or if authentication fails.
 *
 *    clearPass     if, true, this <code>LoginModule</code> clears the
 *                  username and password stored in the module's shared state
 *                  after both phases of authentication (login and commit)
 *                  have completed.
 * </pre>
 *
 */
