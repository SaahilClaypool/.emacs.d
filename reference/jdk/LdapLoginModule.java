_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private void cleanState() {

    /**
     * Clean out state because of a failed authentication attempt
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
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
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     * @exception LoginException if the username/password cannot be acquired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private String replaceUsernameToken(Matcher matcher, String string) {

    /**
     * Replace the username token
     *
     * @param string the target string
     * @return the modified string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private String findUserDN(LdapContext ctx) throws LoginException {

    /**
     * Search for the user's entry.
     * Determine the distinguished name of the user's entry and optionally
     * an authorization identity for the user.
     *
     * @param ctx an LDAP context to use for the search
     * @return the user's distinguished name or an empty string if none
     *         was found.
     * @exception LoginException if the user's entry cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * Attempt authentication
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     * @exception LoginException if the authentication attempt fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals
     * that were added by the <code>commit</code> method.
     *
     * @exception LoginException if the logout fails.
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * Abort user authentication.
     *
     * <p> This method is called if the overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * @exception LoginException if the abort fails.
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Complete user authentication.
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates an
     * <code>LdapPrincipal</code> and one or more <code>UserPrincipal</code>s
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * @exception LoginException if the commit fails
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Begin user authentication.
     *
     * <p> Acquire the user's credentials and verify them against the
     * specified LDAP directory.
     *
     * @return true always, since this <code>LoginModule</code>
     *          should not be ignored.
     * @exception FailedLoginException if the authentication fails.
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * @param subject the <code>Subject</code> to be authenticated.
     * @param callbackHandler a <code>CallbackHandler</code> to acquire the
     *                  username and password.
     * @param sharedState shared <code>LoginModule</code> state.
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
@jdk.Exported

/**
 * This {@link LoginModule} performs LDAP-based authentication.
 * A username and password is verified against the corresponding user
 * credentials stored in an LDAP directory.
 * This module requires the supplied {@link CallbackHandler} to support a
 * {@link NameCallback} and a {@link PasswordCallback}.
 * If authentication is successful then a new {@link LdapPrincipal} is created
 * using the user's distinguished name and a new {@link UserPrincipal} is
 * created using the user's username and both are associated
 * with the current {@link Subject}.
 *
 * <p> This module operates in one of three modes: <i>search-first</i>,
 * <i>authentication-first</i> or <i>authentication-only</i>.
 * A mode is selected by specifying a particular set of options.
 *
 * <p> In search-first mode, the LDAP directory is searched to determine the
 * user's distinguished name and then authentication is attempted.
 * An (anonymous) search is performed using the supplied username in
 * conjunction with a specified search filter.
 * If successful then authentication is attempted using the user's
 * distinguished name and the supplied password.
 * To enable this mode, set the <code>userFilter</code> option and omit the
 * <code>authIdentity</code> option.
 * Use search-first mode when the user's distinguished name is not
 * known in advance.
 *
 * <p> In authentication-first mode, authentication is attempted using the
 * supplied username and password and then the LDAP directory is searched.
 * If authentication is successful then a search is performed using the
 * supplied username in conjunction with a specified search filter.
 * To enable this mode, set the <code>authIdentity</code> and the
 * <code>userFilter</code> options.
 * Use authentication-first mode when accessing an LDAP directory
 * that has been configured to disallow anonymous searches.
 *
 * <p> In authentication-only mode, authentication is attempted using the
 * supplied username and password. The LDAP directory is not searched because
 * the user's distinguished name is already known.
 * To enable this mode, set the <code>authIdentity</code> option to a valid
 * distinguished name and omit the <code>userFilter</code> option.
 * Use authentication-only mode when the user's distinguished name is
 * known in advance.
 *
 * <p> The following option is mandatory and must be specified in this
 * module's login {@link Configuration}:
 * <dl><dt></dt><dd>
 * <dl>
 * <dt> <code>userProvider=<b>ldap_urls</b></code>
 * </dt>
 * <dd> This option identifies the LDAP directory that stores user entries.
 *      <b>ldap_urls</b> is a list of space-separated LDAP URLs
 *      (<a href="http://www.ietf.org/rfc/rfc2255.txt">RFC 2255</a>)
 *      that identifies the LDAP server to use and the position in
 *      its directory tree where user entries are located.
 *      When several LDAP URLs are specified then each is attempted,
 *      in turn, until the first successful connection is established.
 *      Spaces in the distinguished name component of the URL must be escaped
 *      using the standard mechanism of percent character ('<code>%</code>')
 *      followed by two hexadecimal digits (see {@link java.net.URI}).
 *      Query components must also be omitted from the URL.
 *
 *      <p>
 *      Automatic discovery of the LDAP server via DNS
 *      (<a href="http://www.ietf.org/rfc/rfc2782.txt">RFC 2782</a>)
 *      is supported (once DNS has been configured to support such a service).
 *      It is enabled by omitting the hostname and port number components from
 *      the LDAP URL. </dd>
 * </dl></dl>
 *
 * <p> This module also recognizes the following optional {@link Configuration}
 *     options:
 * <dl><dt></dt><dd>
 * <dl>
 * <dt> <code>userFilter=<b>ldap_filter</b></code> </dt>
 * <dd> This option specifies the search filter to use to locate a user's
 *      entry in the LDAP directory. It is used to determine a user's
 *      distinguished name.
 *      <code><b>ldap_filter</b></code> is an LDAP filter string
 *      (<a href="http://www.ietf.org/rfc/rfc2254.txt">RFC 2254</a>).
 *      If it contains the special token "<code><b>{USERNAME}</b></code>"
 *      then that token will be replaced with the supplied username value
 *      before the filter is used to search the directory. </dd>
 *
 * <dt> <code>authIdentity=<b>auth_id</b></code> </dt>
 * <dd> This option specifies the identity to use when authenticating a user
 *      to the LDAP directory.
 *      <code><b>auth_id</b></code> may be an LDAP distinguished name string
 *      (<a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>) or some
 *      other string name.
 *      It must contain the special token "<code><b>{USERNAME}</b></code>"
 *      which will be replaced with the supplied username value before the
 *      name is used for authentication.
 *      Note that if this option does not contain a distinguished name then
 *      the <code>userFilter</code> option must also be specified. </dd>
 *
 * <dt> <code>authzIdentity=<b>authz_id</b></code> </dt>
 * <dd> This option specifies an authorization identity for the user.
 *      <code><b>authz_id</b></code> is any string name.
 *      If it comprises a single special token with curly braces then
 *      that token is treated as a attribute name and will be replaced with a
 *      single value of that attribute from the user's LDAP entry.
 *      If the attribute cannot be found then the option is ignored.
 *      When this option is supplied and the user has been successfully
 *      authenticated then an additional {@link UserPrincipal}
 *      is created using the authorization identity and it is associated with
 *      the current {@link Subject}. </dd>
 *
 * <dt> <code>useSSL</code> </dt>
 * <dd> if <code>false</code>, this module does not establish an SSL connection
 *      to the LDAP server before attempting authentication. SSL is used to
 *      protect the privacy of the user's password because it is transmitted
 *      in the clear over LDAP.
 *      By default, this module uses SSL. </dd>
 *
 * <dt> <code>useFirstPass</code> </dt>
 * <dd> if <code>true</code>, this module retrieves the username and password
 *      from the module's shared state, using "javax.security.auth.login.name"
 *      and "javax.security.auth.login.password" as the respective keys. The
 *      retrieved values are used for authentication. If authentication fails,
 *      no attempt for a retry is made, and the failure is reported back to
 *      the calling application.</dd>
 *
 * <dt> <code>tryFirstPass</code> </dt>
 * <dd> if <code>true</code>, this module retrieves the username and password
 *      from the module's shared state, using "javax.security.auth.login.name"
 *       and "javax.security.auth.login.password" as the respective keys.  The
 *      retrieved values are used for authentication. If authentication fails,
 *      the module uses the {@link CallbackHandler} to retrieve a new username
 *      and password, and another attempt to authenticate is made. If the
 *      authentication fails, the failure is reported back to the calling
 *      application.</dd>
 *
 * <dt> <code>storePass</code> </dt>
 * <dd> if <code>true</code>, this module stores the username and password
 *      obtained from the {@link CallbackHandler} in the module's shared state,
 *      using
 *      "javax.security.auth.login.name" and
 *      "javax.security.auth.login.password" as the respective keys.  This is
 *      not performed if existing values already exist for the username and
 *      password in the shared state, or if authentication fails.</dd>
 *
 * <dt> <code>clearPass</code> </dt>
 * <dd> if <code>true</code>, this module clears the username and password
 *      stored in the module's shared state after both phases of authentication
 *      (login and commit) have completed.</dd>
 *
 * <dt> <code>debug</code> </dt>
 * <dd> if <code>true</code>, debug messages are displayed on the standard
 *      output stream.
 * </dl>
 * </dl>
 *
 * <p>
 * Arbitrary
 * <a href="{@docRoot}/../../../../../technotes/guides/jndi/jndi-ldap-gl.html#PROP">JNDI properties</a>
 * may also be specified in the {@link Configuration}.
 * They are added to the environment and passed to the LDAP provider.
 * Note that the following four JNDI properties are set by this module directly
 * and are ignored if also present in the configuration:
 * <ul>
 * <li> <code>java.naming.provider.url</code>
 * <li> <code>java.naming.security.principal</code>
 * <li> <code>java.naming.security.credentials</code>
 * <li> <code>java.naming.security.protocol</code>
 * </ul>
 *
 * <p>
 * Three sample {@link Configuration}s are shown below.
 * The first one activates search-first mode. It identifies the LDAP server
 * and specifies that users' entries be located by their <code>uid</code> and
 * <code>objectClass</code> attributes. It also specifies that an identity
 * based on the user's <code>employeeNumber</code> attribute should be created.
 * The second one activates authentication-first mode. It requests that the
 * LDAP server be located dynamically, that authentication be performed using
 * the supplied username directly but without the protection of SSL and that
 * users' entries be located by one of three naming attributes and their
 * <code>objectClass</code> attribute.
 * The third one activates authentication-only mode. It identifies alternative
 * LDAP servers, it specifies the distinguished name to use for
 * authentication and a fixed identity to use for authorization. No directory
 * search is performed.
 *
 * <pre>
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap://ldap-svr/ou=people,dc=example,dc=com"
 *             userFilter="(&(uid={USERNAME})(objectClass=inetOrgPerson))"
 *             authzIdentity="{EMPLOYEENUMBER}"
 *             debug=true;
 *     };
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap:///cn=users,dc=example,dc=com"
 *             authIdentity="{USERNAME}"
 *             userFilter="(&(|(samAccountName={USERNAME})(userPrincipalName={USERNAME})(cn={USERNAME}))(objectClass=user))"
 *             useSSL=false
 *             debug=true;
 *     };
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap://ldap-svr1 ldap://ldap-svr2"
 *             authIdentity="cn={USERNAME},ou=people,dc=example,dc=com"
 *             authzIdentity="staff"
 *             debug=true;
 *     };
 *
 * </pre>
 *
 * <dl>
 * <dt><b>Note:</b> </dt>
 * <dd>When a {@link SecurityManager} is active then an application
 *     that creates a {@link LoginContext} and uses a {@link LoginModule}
 *     must be granted certain permissions.
 *     <p>
 *     If the application creates a login context using an <em>installed</em>
 *     {@link Configuration} then the application must be granted the
 *     {@link AuthPermission} to create login contexts.
 *     For example, the following security policy allows an application in
 *     the user's current directory to instantiate <em>any</em> login context:
 *     <pre>
 *
 *     grant codebase "file:${user.dir}/" {
 *         permission javax.security.auth.AuthPermission "createLoginContext.*";
 *     };
 *     </pre>
 *
 *     Alternatively, if the application creates a login context using a
 *     <em>caller-specified</em> {@link Configuration} then the application
 *     must be granted the permissions required by the {@link LoginModule}.
 *     <em>This</em> module requires the following two permissions:
 *     <p>
 *     <ul>
 *     <li> The {@link SocketPermission} to connect to an LDAP server.
 *     <li> The {@link AuthPermission} to modify the set of {@link Principal}s
 *          associated with a {@link Subject}.
 *     </ul>
 *     <p>
 *     For example, the following security policy grants an application in the
 *     user's current directory all the permissions required by this module:
 *     <pre>
 *
 *     grant codebase "file:${user.dir}/" {
 *         permission java.net.SocketPermission "*:389", "connect";
 *         permission java.net.SocketPermission "*:636", "connect";
 *         permission javax.security.auth.AuthPermission "modifyPrincipals";
 *     };
 *     </pre>
 * </dd>
 * </dl>
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private void cleanState() {

    /**
     * Clean out state because of a failed authentication attempt
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
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
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     * @exception LoginException if the username/password cannot be acquired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private String replaceUsernameToken(Matcher matcher, String string) {

    /**
     * Replace the username token
     *
     * @param string the target string
     * @return the modified string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private String findUserDN(LdapContext ctx) throws LoginException {

    /**
     * Search for the user's entry.
     * Determine the distinguished name of the user's entry and optionally
     * an authorization identity for the user.
     *
     * @param ctx an LDAP context to use for the search
     * @return the user's distinguished name or an empty string if none
     *         was found.
     * @exception LoginException if the user's entry cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * Attempt authentication
     *
     * @param getPasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     * @exception LoginException if the authentication attempt fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout a user.
     *
     * <p> This method removes the Principals
     * that were added by the <code>commit</code> method.
     *
     * @exception LoginException if the logout fails.
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * Abort user authentication.
     *
     * <p> This method is called if the overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * @exception LoginException if the abort fails.
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Complete user authentication.
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates an
     * <code>LdapPrincipal</code> and one or more <code>UserPrincipal</code>s
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * @exception LoginException if the commit fails
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Begin user authentication.
     *
     * <p> Acquire the user's credentials and verify them against the
     * specified LDAP directory.
     *
     * @return true always, since this <code>LoginModule</code>
     *          should not be ignored.
     * @exception FailedLoginException if the authentication fails.
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * @param subject the <code>Subject</code> to be authenticated.
     * @param callbackHandler a <code>CallbackHandler</code> to acquire the
     *                  username and password.
     * @param sharedState shared <code>LoginModule</code> state.
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/LdapLoginModule.java
@jdk.Exported

/**
 * This {@link LoginModule} performs LDAP-based authentication.
 * A username and password is verified against the corresponding user
 * credentials stored in an LDAP directory.
 * This module requires the supplied {@link CallbackHandler} to support a
 * {@link NameCallback} and a {@link PasswordCallback}.
 * If authentication is successful then a new {@link LdapPrincipal} is created
 * using the user's distinguished name and a new {@link UserPrincipal} is
 * created using the user's username and both are associated
 * with the current {@link Subject}.
 *
 * <p> This module operates in one of three modes: <i>search-first</i>,
 * <i>authentication-first</i> or <i>authentication-only</i>.
 * A mode is selected by specifying a particular set of options.
 *
 * <p> In search-first mode, the LDAP directory is searched to determine the
 * user's distinguished name and then authentication is attempted.
 * An (anonymous) search is performed using the supplied username in
 * conjunction with a specified search filter.
 * If successful then authentication is attempted using the user's
 * distinguished name and the supplied password.
 * To enable this mode, set the <code>userFilter</code> option and omit the
 * <code>authIdentity</code> option.
 * Use search-first mode when the user's distinguished name is not
 * known in advance.
 *
 * <p> In authentication-first mode, authentication is attempted using the
 * supplied username and password and then the LDAP directory is searched.
 * If authentication is successful then a search is performed using the
 * supplied username in conjunction with a specified search filter.
 * To enable this mode, set the <code>authIdentity</code> and the
 * <code>userFilter</code> options.
 * Use authentication-first mode when accessing an LDAP directory
 * that has been configured to disallow anonymous searches.
 *
 * <p> In authentication-only mode, authentication is attempted using the
 * supplied username and password. The LDAP directory is not searched because
 * the user's distinguished name is already known.
 * To enable this mode, set the <code>authIdentity</code> option to a valid
 * distinguished name and omit the <code>userFilter</code> option.
 * Use authentication-only mode when the user's distinguished name is
 * known in advance.
 *
 * <p> The following option is mandatory and must be specified in this
 * module's login {@link Configuration}:
 * <dl><dt></dt><dd>
 * <dl>
 * <dt> <code>userProvider=<b>ldap_urls</b></code>
 * </dt>
 * <dd> This option identifies the LDAP directory that stores user entries.
 *      <b>ldap_urls</b> is a list of space-separated LDAP URLs
 *      (<a href="http://www.ietf.org/rfc/rfc2255.txt">RFC 2255</a>)
 *      that identifies the LDAP server to use and the position in
 *      its directory tree where user entries are located.
 *      When several LDAP URLs are specified then each is attempted,
 *      in turn, until the first successful connection is established.
 *      Spaces in the distinguished name component of the URL must be escaped
 *      using the standard mechanism of percent character ('<code>%</code>')
 *      followed by two hexadecimal digits (see {@link java.net.URI}).
 *      Query components must also be omitted from the URL.
 *
 *      <p>
 *      Automatic discovery of the LDAP server via DNS
 *      (<a href="http://www.ietf.org/rfc/rfc2782.txt">RFC 2782</a>)
 *      is supported (once DNS has been configured to support such a service).
 *      It is enabled by omitting the hostname and port number components from
 *      the LDAP URL. </dd>
 * </dl></dl>
 *
 * <p> This module also recognizes the following optional {@link Configuration}
 *     options:
 * <dl><dt></dt><dd>
 * <dl>
 * <dt> <code>userFilter=<b>ldap_filter</b></code> </dt>
 * <dd> This option specifies the search filter to use to locate a user's
 *      entry in the LDAP directory. It is used to determine a user's
 *      distinguished name.
 *      <code><b>ldap_filter</b></code> is an LDAP filter string
 *      (<a href="http://www.ietf.org/rfc/rfc2254.txt">RFC 2254</a>).
 *      If it contains the special token "<code><b>{USERNAME}</b></code>"
 *      then that token will be replaced with the supplied username value
 *      before the filter is used to search the directory. </dd>
 *
 * <dt> <code>authIdentity=<b>auth_id</b></code> </dt>
 * <dd> This option specifies the identity to use when authenticating a user
 *      to the LDAP directory.
 *      <code><b>auth_id</b></code> may be an LDAP distinguished name string
 *      (<a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>) or some
 *      other string name.
 *      It must contain the special token "<code><b>{USERNAME}</b></code>"
 *      which will be replaced with the supplied username value before the
 *      name is used for authentication.
 *      Note that if this option does not contain a distinguished name then
 *      the <code>userFilter</code> option must also be specified. </dd>
 *
 * <dt> <code>authzIdentity=<b>authz_id</b></code> </dt>
 * <dd> This option specifies an authorization identity for the user.
 *      <code><b>authz_id</b></code> is any string name.
 *      If it comprises a single special token with curly braces then
 *      that token is treated as a attribute name and will be replaced with a
 *      single value of that attribute from the user's LDAP entry.
 *      If the attribute cannot be found then the option is ignored.
 *      When this option is supplied and the user has been successfully
 *      authenticated then an additional {@link UserPrincipal}
 *      is created using the authorization identity and it is associated with
 *      the current {@link Subject}. </dd>
 *
 * <dt> <code>useSSL</code> </dt>
 * <dd> if <code>false</code>, this module does not establish an SSL connection
 *      to the LDAP server before attempting authentication. SSL is used to
 *      protect the privacy of the user's password because it is transmitted
 *      in the clear over LDAP.
 *      By default, this module uses SSL. </dd>
 *
 * <dt> <code>useFirstPass</code> </dt>
 * <dd> if <code>true</code>, this module retrieves the username and password
 *      from the module's shared state, using "javax.security.auth.login.name"
 *      and "javax.security.auth.login.password" as the respective keys. The
 *      retrieved values are used for authentication. If authentication fails,
 *      no attempt for a retry is made, and the failure is reported back to
 *      the calling application.</dd>
 *
 * <dt> <code>tryFirstPass</code> </dt>
 * <dd> if <code>true</code>, this module retrieves the username and password
 *      from the module's shared state, using "javax.security.auth.login.name"
 *       and "javax.security.auth.login.password" as the respective keys.  The
 *      retrieved values are used for authentication. If authentication fails,
 *      the module uses the {@link CallbackHandler} to retrieve a new username
 *      and password, and another attempt to authenticate is made. If the
 *      authentication fails, the failure is reported back to the calling
 *      application.</dd>
 *
 * <dt> <code>storePass</code> </dt>
 * <dd> if <code>true</code>, this module stores the username and password
 *      obtained from the {@link CallbackHandler} in the module's shared state,
 *      using
 *      "javax.security.auth.login.name" and
 *      "javax.security.auth.login.password" as the respective keys.  This is
 *      not performed if existing values already exist for the username and
 *      password in the shared state, or if authentication fails.</dd>
 *
 * <dt> <code>clearPass</code> </dt>
 * <dd> if <code>true</code>, this module clears the username and password
 *      stored in the module's shared state after both phases of authentication
 *      (login and commit) have completed.</dd>
 *
 * <dt> <code>debug</code> </dt>
 * <dd> if <code>true</code>, debug messages are displayed on the standard
 *      output stream.
 * </dl>
 * </dl>
 *
 * <p>
 * Arbitrary
 * <a href="{@docRoot}/../../../../../technotes/guides/jndi/jndi-ldap-gl.html#PROP">JNDI properties</a>
 * may also be specified in the {@link Configuration}.
 * They are added to the environment and passed to the LDAP provider.
 * Note that the following four JNDI properties are set by this module directly
 * and are ignored if also present in the configuration:
 * <ul>
 * <li> <code>java.naming.provider.url</code>
 * <li> <code>java.naming.security.principal</code>
 * <li> <code>java.naming.security.credentials</code>
 * <li> <code>java.naming.security.protocol</code>
 * </ul>
 *
 * <p>
 * Three sample {@link Configuration}s are shown below.
 * The first one activates search-first mode. It identifies the LDAP server
 * and specifies that users' entries be located by their <code>uid</code> and
 * <code>objectClass</code> attributes. It also specifies that an identity
 * based on the user's <code>employeeNumber</code> attribute should be created.
 * The second one activates authentication-first mode. It requests that the
 * LDAP server be located dynamically, that authentication be performed using
 * the supplied username directly but without the protection of SSL and that
 * users' entries be located by one of three naming attributes and their
 * <code>objectClass</code> attribute.
 * The third one activates authentication-only mode. It identifies alternative
 * LDAP servers, it specifies the distinguished name to use for
 * authentication and a fixed identity to use for authorization. No directory
 * search is performed.
 *
 * <pre>
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap://ldap-svr/ou=people,dc=example,dc=com"
 *             userFilter="(&(uid={USERNAME})(objectClass=inetOrgPerson))"
 *             authzIdentity="{EMPLOYEENUMBER}"
 *             debug=true;
 *     };
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap:///cn=users,dc=example,dc=com"
 *             authIdentity="{USERNAME}"
 *             userFilter="(&(|(samAccountName={USERNAME})(userPrincipalName={USERNAME})(cn={USERNAME}))(objectClass=user))"
 *             useSSL=false
 *             debug=true;
 *     };
 *
 *     ExampleApplication {
 *         com.sun.security.auth.module.LdapLoginModule REQUIRED
 *             userProvider="ldap://ldap-svr1 ldap://ldap-svr2"
 *             authIdentity="cn={USERNAME},ou=people,dc=example,dc=com"
 *             authzIdentity="staff"
 *             debug=true;
 *     };
 *
 * </pre>
 *
 * <dl>
 * <dt><b>Note:</b> </dt>
 * <dd>When a {@link SecurityManager} is active then an application
 *     that creates a {@link LoginContext} and uses a {@link LoginModule}
 *     must be granted certain permissions.
 *     <p>
 *     If the application creates a login context using an <em>installed</em>
 *     {@link Configuration} then the application must be granted the
 *     {@link AuthPermission} to create login contexts.
 *     For example, the following security policy allows an application in
 *     the user's current directory to instantiate <em>any</em> login context:
 *     <pre>
 *
 *     grant codebase "file:${user.dir}/" {
 *         permission javax.security.auth.AuthPermission "createLoginContext.*";
 *     };
 *     </pre>
 *
 *     Alternatively, if the application creates a login context using a
 *     <em>caller-specified</em> {@link Configuration} then the application
 *     must be granted the permissions required by the {@link LoginModule}.
 *     <em>This</em> module requires the following two permissions:
 *     <p>
 *     <ul>
 *     <li> The {@link SocketPermission} to connect to an LDAP server.
 *     <li> The {@link AuthPermission} to modify the set of {@link Principal}s
 *          associated with a {@link Subject}.
 *     </ul>
 *     <p>
 *     For example, the following security policy grants an application in the
 *     user's current directory all the permissions required by this module:
 *     <pre>
 *
 *     grant codebase "file:${user.dir}/" {
 *         permission java.net.SocketPermission "*:389", "connect";
 *         permission java.net.SocketPermission "*:636", "connect";
 *         permission javax.security.auth.AuthPermission "modifyPrincipals";
 *     };
 *     </pre>
 * </dd>
 * </dl>
 *
 * @since 1.6
 */
