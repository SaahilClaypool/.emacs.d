_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void cleanState() {

    /**
     * Clean out the state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void cleanKerberosCred() throws LoginException {

    /**
     * Clean Kerberos credentials
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user.
     *
     * <p> This method removes the <code>Krb5Principal</code>
     * that was added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean abort() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules did not succeed).
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean commit() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>Krb5Principal</code>
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>. It adds Kerberos Credentials to the
     *  the Subject's private credentials set. If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails.
     *
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * process the configuration options
     * Get the TGT either out of
     * cache or from the KDC using the password entered
     * Check the  permission before getting the TGT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user
     *
     * <p>
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for
     *                  communication with the end user (prompting for
     *                  usernames and passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
@jdk.Exported

/**
 * <p> This <code>LoginModule</code> authenticates users using
 * Kerberos protocols.
 *
 * <p> The configuration entry for <code>Krb5LoginModule</code> has
 * several options that control the authentication process and
 * additions to the <code>Subject</code>'s private credential
 * set. Irrespective of these options, the <code>Subject</code>'s
 * principal set and private credentials set are updated only when
 * <code>commit</code> is called.
 * When <code>commit</code> is called, the <code>KerberosPrincipal</code>
 * is added to the <code>Subject</code>'s principal set (unless the
 * <code>principal</code> is specified as "*"). If <code>isInitiator</code>
 * is true, the <code>KerberosTicket</code> is
 * added to the <code>Subject</code>'s private credentials.
 *
 * <p> If the configuration entry for <code>KerberosLoginModule</code>
 * has the option <code>storeKey</code> set to true, then
 * <code>KerberosKey</code> or <code>KeyTab</code> will also be added to the
 * subject's private credentials. <code>KerberosKey</code>, the principal's
 * key(s) will be derived from user's password, and <code>KeyTab</code> is
 * the keytab used when <code>useKeyTab</code> is set to true. The
 * <code>KeyTab</code> object is restricted to be used by the specified
 * principal unless the principal value is "*".
 *
 * <p> This <code>LoginModule</code> recognizes the <code>doNotPrompt</code>
 * option. If set to true the user will not be prompted for the password.
 *
 * <p> The user can  specify the location of the ticket cache by using
 * the option <code>ticketCache</code> in the configuration entry.
 *
 * <p>The user can specify the keytab location by using
 * the option <code>keyTab</code>
 * in the configuration entry.
 *
 * <p> The principal name can be specified in the configuration entry
 * by using the option <code>principal</code>. The principal name
 * can either be a simple user name, a service name such as
 * <code>host/mission.eng.sun.com</code>, or "*". The principal can also
 * be set using the system property <code>sun.security.krb5.principal</code>.
 * This property is checked during login. If this property is not set, then
 * the principal name from the configuration is used. In the
 * case where the principal property is not set and the principal
 * entry also does not exist, the user is prompted for the name.
 * When this property of entry is set, and <code>useTicketCache</code>
 * is set to true, only TGT belonging to this principal is used.
 *
 * <p> The following is a list of configuration options supported
 * for <code>Krb5LoginModule</code>:
 * <blockquote><dl>
 * <dt><b><code>refreshKrb5Config</code></b>:</dt>
 * <dd> Set this to true, if you want the configuration
 * to be refreshed before the <code>login</code> method is called.</dd>
 * <dt><b><code>useTicketCache</code></b>:</dt>
 * <dd>Set this to true, if you want the
 * TGT to be obtained
 * from the ticket cache. Set this option
 * to false if you do not want this module to use the ticket cache.
 * (Default is False).
 * This module will
 * search for the ticket
 * cache in the following locations:
 * On Solaris and Linux
 * it will look for the ticket cache in /tmp/krb5cc_<code>uid</code>
 * where the uid is numeric user
 * identifier. If the ticket cache is
 * not available in the above location, or if we are on a
 * Windows platform, it will look for the cache as
 * {user.home}{file.separator}krb5cc_{user.name}.
 * You can override the ticket cache location by using
 * <code>ticketCache</code>.
 * For Windows, if a ticket cannot be retrieved from the file ticket cache,
 * it will use Local Security Authority (LSA) API to get the TGT.
 * <dt><b><code>ticketCache</code></b>:</dt>
 * <dd>Set this to the name of the ticket
 * cache that  contains user's TGT.
 * If this is set,  <code>useTicketCache</code>
 * must also be set to true; Otherwise a configuration error will
 * be returned.</dd>
 * <dt><b><code>renewTGT</code></b>:</dt>
 * <dd>Set this to true, if you want to renew
 * the TGT. If this is set, <code>useTicketCache</code> must also be
 * set to true; otherwise a configuration error will be returned.</dd>
 * <dt><b><code>doNotPrompt</code></b>:</dt>
 * <dd>Set this to true if you do not want to be
 * prompted for the password
 * if credentials can not be obtained from the cache, the keytab,
 * or through shared state.(Default is false)
 * If set to true, credential must be obtained through cache, keytab,
 * or shared state. Otherwise, authentication will fail.</dd>
 * <dt><b><code>useKeyTab</code></b>:</dt>
 * <dd>Set this to true if you
 * want the module to get the principal's key from the
 * the keytab.(default value is False)
 * If <code>keytab</code>
 * is not set then
 * the module will locate the keytab from the
 * Kerberos configuration file.
 * If it is not specified in the Kerberos configuration file
 * then it will look for the file
 * <code>{user.home}{file.separator}</code>krb5.keytab.</dd>
 * <dt><b><code>keyTab</code></b>:</dt>
 * <dd>Set this to the file name of the
 * keytab to get principal's secret key.</dd>
 * <dt><b><code>storeKey</code></b>:</dt>
 * <dd>Set this to true to if you want the keytab or the
 * principal's key to be stored in the Subject's private credentials.
 * For <code>isInitiator</code> being false, if <code>principal</code>
 * is "*", the {@link KeyTab} stored can be used by anyone, otherwise,
 * it's restricted to be used by the specified principal only.</dd>
 * <dt><b><code>principal</code></b>:</dt>
 * <dd>The name of the principal that should
 * be used. The principal can be a simple username such as
 * "<code>testuser</code>" or a service name such as
 * "<code>host/testhost.eng.sun.com</code>". You can use the
 * <code>principal</code>  option to set the principal when there are
 * credentials for multiple principals in the
 * <code>keyTab</code> or when you want a specific ticket cache only.
 * The principal can also be set using the system property
 * <code>sun.security.krb5.principal</code>. In addition, if this
 * system property is defined, then it will be used. If this property
 * is not set, then the principal name from the configuration will be
 * used.
 * The principal name can be set to "*" when <code>isInitiator</code> is false.
 * In this case, the acceptor is not bound to a single principal. It can
 * act as any principal an initiator requests if keys for that principal
 * can be found. When <code>isInitiator</code> is true, the principal name
 * cannot be set to "*".
 * </dd>
 * <dt><b><code>isInitiator</code></b>:</dt>
 * <dd>Set this to true, if initiator. Set this to false, if acceptor only.
 * (Default is true).
 * Note: Do not set this value to false for initiators.</dd>
 * </dl></blockquote>
 *
 * <p> This <code>LoginModule</code> also recognizes the following additional
 * <code>Configuration</code>
 * options that enable you to share username and passwords across different
 * authentication modules:
 * <blockquote><dl>
 *
 *    <dt><b><code>useFirstPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule retrieves the
 *                   username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys. The retrieved values are used for authentication.
 *                   If authentication fails, no attempt for a retry
 *                   is made, and the failure is reported back to the
 *                   calling application.</dd>
 *
 *    <dt><b><code>tryFirstPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule retrieves the
 *                   the username and password from the module's shared
 *                   state using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for
 *                   authentication.
 *                   If authentication fails, the module uses the
 *                   CallbackHandler to retrieve a new username
 *                   and password, and another attempt to authenticate
 *                   is made. If the authentication fails,
 *                   the failure is reported back to the calling application</dd>
 *
 *    <dt><b><code>storePass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule stores the username and
 *                   password obtained from the CallbackHandler in the
 *                   modules shared state, using
 *                   "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  This is not performed if existing values already
 *                   exist for the username and password in the shared
 *                   state, or if authentication fails.</dd>
 *
 *    <dt><b><code>clearPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule clears the
 *                   username and password stored in the module's shared
 *                   state  after both phases of authentication
 *                   (login and commit) have completed.</dd>
 * </dl></blockquote>
 * <p>If the principal system property or key is already provided, the value of
 * "javax.security.auth.login.name" in the shared state is ignored.
 * <p>When multiple mechanisms to retrieve a ticket or key is provided, the
 * preference order is:
 * <ol>
 * <li>ticket cache
 * <li>keytab
 * <li>shared state
 * <li>user prompt
 * </ol>
 * <p>Note that if any step fails, it will fallback to the next step.
 * There's only one exception, if the shared state step fails and
 * <code>useFirstPass</code>=true, no user prompt is made.
 * <p>Examples of some configuration values for Krb5LoginModule in
 * JAAS config file and the results are:
 * <ul>
 * <p> <code>doNotPrompt</code>=true;
 * </ul>
 * <p> This is an illegal combination since none of <code>useTicketCache</code>,
 * <code>useKeyTab</code>, <code>useFirstPass</code> and <code>tryFirstPass</code>
 * is set and the user can not be prompted for the password.
 *<ul>
 * <p> <code>ticketCache</code> = &lt;filename&gt;;
 *</ul>
 * <p> This is an illegal combination since <code>useTicketCache</code>
 * is not set to true and the ticketCache is set. A configuration error
 * will occur.
 * <ul>
 * <p> <code>renewTGT</code>=true;
 *</ul>
 * <p> This is an illegal combination since <code>useTicketCache</code> is
 * not set to true and renewTGT is set. A configuration error will occur.
 * <ul>
 * <p> <code>storeKey</code>=true
 * <code>useTicketCache</code> = true
 * <code>doNotPrompt</code>=true;;
 *</ul>
 * <p> This is an illegal combination since  <code>storeKey</code> is set to
 * true but the key can not be obtained either by prompting the user or from
 * the keytab, or from the shared state. A configuration error will occur.
 * <ul>
 * <p>  <code>keyTab</code> = &lt;filename&gt; <code>doNotPrompt</code>=true ;
 * </ul>
 * <p>This is an illegal combination since useKeyTab is not set to true and
 * the keyTab is set. A configuration error will occur.
 * <ul>
 * <p> <code>debug=true </code>
 *</ul>
 * <p> Prompt the user for the principal name and the password.
 * Use the authentication exchange to get TGT from the KDC and
 * populate the <code>Subject</code> with the principal and TGT.
 * Output debug messages.
 * <ul>
 * <p> <code>useTicketCache</code> = true <code>doNotPrompt</code>=true;
 *</ul>
 * <p>Check the default cache for TGT and populate the <code>Subject</code>
 * with the principal and TGT. If the TGT is not available,
 * do not prompt the user, instead fail the authentication.
 * <ul>
 * <p><code>principal</code>=&lt;name&gt;<code>useTicketCache</code> = true
 * <code>doNotPrompt</code>=true;
 *</ul>
 * <p> Get the TGT from the default cache for the principal and populate the
 * Subject's principal and private creds set. If ticket cache is
 * not available or does not contain the principal's TGT
 * authentication will fail.
 * <ul>
 * <p> <code>useTicketCache</code> = true
 * <code>ticketCache</code>=&lt;file name&gt;<code>useKeyTab</code> = true
 * <code> keyTab</code>=&lt;keytab filename&gt;
 * <code>principal</code> = &lt;principal name&gt;
 * <code>doNotPrompt</code>=true;
 *</ul>
 * <p>  Search the cache for the principal's TGT. If it is not available
 * use the key in the keytab to perform authentication exchange with the
 * KDC and acquire the TGT.
 * The Subject will be populated with the principal and the TGT.
 * If the key is not available or valid then authentication will fail.
 * <ul>
 * <p><code>useTicketCache</code> = true
 * <code>ticketCache</code>=&lt;file name&gt;
 *</ul>
 * <p> The TGT will be obtained from the cache specified.
 * The Kerberos principal name used will be the principal name in
 * the Ticket cache. If the TGT is not available in the
 * ticket cache the user will be prompted for the principal name
 * and the password. The TGT will be obtained using the authentication
 * exchange with the KDC.
 * The Subject will be populated with the TGT.
 *<ul>
 * <p> <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytab filename&gt;
 * <code>principal</code>= &lt;principal name&gt;
 * <code>storeKey</code>=true;
 *</ul>
 * <p>  The key for the principal will be retrieved from the keytab.
 * If the key is not available in the keytab the user will be prompted
 * for the principal's password. The Subject will be populated
 * with the principal's key either from the keytab or derived from the
 * password entered.
 * <ul>
 * <p> <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytabname&gt;
 * <code>storeKey</code>=true
 * <code>doNotPrompt</code>=false;
 *</ul>
 * <p>The user will be prompted for the service principal name.
 * If the principal's
 * longterm key is available in the keytab , it will be added to the
 * Subject's private credentials. An authentication exchange will be
 * attempted with the principal name and the key from the Keytab.
 * If successful the TGT will be added to the
 * Subject's private credentials set. Otherwise the authentication will
 * fail.
 * <ul>
 * <p> <code>isInitiator</code> = false <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytabname&gt;
 * <code>storeKey</code>=true
 * <code>principal</code>=*;
 *</ul>
 * <p>The acceptor will be an unbound acceptor and it can act as any principal
 * as long that principal has keys in the keytab.
 *<ul>
 * <p>
 * <code>useTicketCache</code>=true
 * <code>ticketCache</code>=&lt;file name&gt;;
 * <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;file name&gt; <code>storeKey</code>=true
 * <code>principal</code>= &lt;principal name&gt;
 *</ul>
 * <p>
 * The client's TGT will be retrieved from the ticket cache and added to the
 * <code>Subject</code>'s private credentials. If the TGT is not available
 * in the ticket cache, or the TGT's client name does not match the principal
 * name, Java will use a secret key to obtain the TGT using the authentication
 * exchange and added to the Subject's private credentials.
 * This secret key will be first retrieved from the keytab. If the key
 * is not available, the user will be prompted for the password. In either
 * case, the key derived from the password will be added to the
 * Subject's private credentials set.
 * <ul>
 * <p><code>isInitiator</code> = false
 *</ul>
 * <p>Configured to act as acceptor only, credentials are not acquired
 * via AS exchange. For acceptors only, set this value to false.
 * For initiators, do not set this value to false.
 * <ul>
 * <p><code>isInitiator</code> = true
 *</ul>
 * <p>Configured to act as initiator, credentials are acquired
 * via AS exchange. For initiators, set this value to true, or leave this
 * option unset, in which case default value (true) will be used.
 *
 * @author Ram Marti
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void cleanState() {

    /**
     * Clean out the state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void cleanKerberosCred() throws LoginException {

    /**
     * Clean Kerberos credentials
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user.
     *
     * <p> This method removes the <code>Krb5Principal</code>
     * that was added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean abort() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules did not succeed).
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean commit() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>Krb5Principal</code>
     * with the <code>Subject</code> located in the
     * <code>LoginModule</code>. It adds Kerberos Credentials to the
     *  the Subject's private credentials set. If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails.
     *
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    private void attemptAuthentication(boolean getPasswdFromSharedState)

    /**
     * process the configuration options
     * Get the TGT either out of
     * cache or from the KDC using the password entered
     * Check the  permission before getting the TGT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user
     *
     * <p>
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
    // Unchecked warning from (Map<String, Object>)sharedState is safe

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for
     *                  communication with the end user (prompting for
     *                  usernames and passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Krb5LoginModule.java
@jdk.Exported

/**
 * <p> This <code>LoginModule</code> authenticates users using
 * Kerberos protocols.
 *
 * <p> The configuration entry for <code>Krb5LoginModule</code> has
 * several options that control the authentication process and
 * additions to the <code>Subject</code>'s private credential
 * set. Irrespective of these options, the <code>Subject</code>'s
 * principal set and private credentials set are updated only when
 * <code>commit</code> is called.
 * When <code>commit</code> is called, the <code>KerberosPrincipal</code>
 * is added to the <code>Subject</code>'s principal set (unless the
 * <code>principal</code> is specified as "*"). If <code>isInitiator</code>
 * is true, the <code>KerberosTicket</code> is
 * added to the <code>Subject</code>'s private credentials.
 *
 * <p> If the configuration entry for <code>KerberosLoginModule</code>
 * has the option <code>storeKey</code> set to true, then
 * <code>KerberosKey</code> or <code>KeyTab</code> will also be added to the
 * subject's private credentials. <code>KerberosKey</code>, the principal's
 * key(s) will be derived from user's password, and <code>KeyTab</code> is
 * the keytab used when <code>useKeyTab</code> is set to true. The
 * <code>KeyTab</code> object is restricted to be used by the specified
 * principal unless the principal value is "*".
 *
 * <p> This <code>LoginModule</code> recognizes the <code>doNotPrompt</code>
 * option. If set to true the user will not be prompted for the password.
 *
 * <p> The user can  specify the location of the ticket cache by using
 * the option <code>ticketCache</code> in the configuration entry.
 *
 * <p>The user can specify the keytab location by using
 * the option <code>keyTab</code>
 * in the configuration entry.
 *
 * <p> The principal name can be specified in the configuration entry
 * by using the option <code>principal</code>. The principal name
 * can either be a simple user name, a service name such as
 * <code>host/mission.eng.sun.com</code>, or "*". The principal can also
 * be set using the system property <code>sun.security.krb5.principal</code>.
 * This property is checked during login. If this property is not set, then
 * the principal name from the configuration is used. In the
 * case where the principal property is not set and the principal
 * entry also does not exist, the user is prompted for the name.
 * When this property of entry is set, and <code>useTicketCache</code>
 * is set to true, only TGT belonging to this principal is used.
 *
 * <p> The following is a list of configuration options supported
 * for <code>Krb5LoginModule</code>:
 * <blockquote><dl>
 * <dt><b><code>refreshKrb5Config</code></b>:</dt>
 * <dd> Set this to true, if you want the configuration
 * to be refreshed before the <code>login</code> method is called.</dd>
 * <dt><b><code>useTicketCache</code></b>:</dt>
 * <dd>Set this to true, if you want the
 * TGT to be obtained
 * from the ticket cache. Set this option
 * to false if you do not want this module to use the ticket cache.
 * (Default is False).
 * This module will
 * search for the ticket
 * cache in the following locations:
 * On Solaris and Linux
 * it will look for the ticket cache in /tmp/krb5cc_<code>uid</code>
 * where the uid is numeric user
 * identifier. If the ticket cache is
 * not available in the above location, or if we are on a
 * Windows platform, it will look for the cache as
 * {user.home}{file.separator}krb5cc_{user.name}.
 * You can override the ticket cache location by using
 * <code>ticketCache</code>.
 * For Windows, if a ticket cannot be retrieved from the file ticket cache,
 * it will use Local Security Authority (LSA) API to get the TGT.
 * <dt><b><code>ticketCache</code></b>:</dt>
 * <dd>Set this to the name of the ticket
 * cache that  contains user's TGT.
 * If this is set,  <code>useTicketCache</code>
 * must also be set to true; Otherwise a configuration error will
 * be returned.</dd>
 * <dt><b><code>renewTGT</code></b>:</dt>
 * <dd>Set this to true, if you want to renew
 * the TGT. If this is set, <code>useTicketCache</code> must also be
 * set to true; otherwise a configuration error will be returned.</dd>
 * <dt><b><code>doNotPrompt</code></b>:</dt>
 * <dd>Set this to true if you do not want to be
 * prompted for the password
 * if credentials can not be obtained from the cache, the keytab,
 * or through shared state.(Default is false)
 * If set to true, credential must be obtained through cache, keytab,
 * or shared state. Otherwise, authentication will fail.</dd>
 * <dt><b><code>useKeyTab</code></b>:</dt>
 * <dd>Set this to true if you
 * want the module to get the principal's key from the
 * the keytab.(default value is False)
 * If <code>keytab</code>
 * is not set then
 * the module will locate the keytab from the
 * Kerberos configuration file.
 * If it is not specified in the Kerberos configuration file
 * then it will look for the file
 * <code>{user.home}{file.separator}</code>krb5.keytab.</dd>
 * <dt><b><code>keyTab</code></b>:</dt>
 * <dd>Set this to the file name of the
 * keytab to get principal's secret key.</dd>
 * <dt><b><code>storeKey</code></b>:</dt>
 * <dd>Set this to true to if you want the keytab or the
 * principal's key to be stored in the Subject's private credentials.
 * For <code>isInitiator</code> being false, if <code>principal</code>
 * is "*", the {@link KeyTab} stored can be used by anyone, otherwise,
 * it's restricted to be used by the specified principal only.</dd>
 * <dt><b><code>principal</code></b>:</dt>
 * <dd>The name of the principal that should
 * be used. The principal can be a simple username such as
 * "<code>testuser</code>" or a service name such as
 * "<code>host/testhost.eng.sun.com</code>". You can use the
 * <code>principal</code>  option to set the principal when there are
 * credentials for multiple principals in the
 * <code>keyTab</code> or when you want a specific ticket cache only.
 * The principal can also be set using the system property
 * <code>sun.security.krb5.principal</code>. In addition, if this
 * system property is defined, then it will be used. If this property
 * is not set, then the principal name from the configuration will be
 * used.
 * The principal name can be set to "*" when <code>isInitiator</code> is false.
 * In this case, the acceptor is not bound to a single principal. It can
 * act as any principal an initiator requests if keys for that principal
 * can be found. When <code>isInitiator</code> is true, the principal name
 * cannot be set to "*".
 * </dd>
 * <dt><b><code>isInitiator</code></b>:</dt>
 * <dd>Set this to true, if initiator. Set this to false, if acceptor only.
 * (Default is true).
 * Note: Do not set this value to false for initiators.</dd>
 * </dl></blockquote>
 *
 * <p> This <code>LoginModule</code> also recognizes the following additional
 * <code>Configuration</code>
 * options that enable you to share username and passwords across different
 * authentication modules:
 * <blockquote><dl>
 *
 *    <dt><b><code>useFirstPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule retrieves the
 *                   username and password from the module's shared state,
 *                   using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys. The retrieved values are used for authentication.
 *                   If authentication fails, no attempt for a retry
 *                   is made, and the failure is reported back to the
 *                   calling application.</dd>
 *
 *    <dt><b><code>tryFirstPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule retrieves the
 *                   the username and password from the module's shared
 *                   state using "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  The retrieved values are used for
 *                   authentication.
 *                   If authentication fails, the module uses the
 *                   CallbackHandler to retrieve a new username
 *                   and password, and another attempt to authenticate
 *                   is made. If the authentication fails,
 *                   the failure is reported back to the calling application</dd>
 *
 *    <dt><b><code>storePass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule stores the username and
 *                   password obtained from the CallbackHandler in the
 *                   modules shared state, using
 *                   "javax.security.auth.login.name" and
 *                   "javax.security.auth.login.password" as the respective
 *                   keys.  This is not performed if existing values already
 *                   exist for the username and password in the shared
 *                   state, or if authentication fails.</dd>
 *
 *    <dt><b><code>clearPass</code></b>:</dt>
 *                   <dd>if, true, this LoginModule clears the
 *                   username and password stored in the module's shared
 *                   state  after both phases of authentication
 *                   (login and commit) have completed.</dd>
 * </dl></blockquote>
 * <p>If the principal system property or key is already provided, the value of
 * "javax.security.auth.login.name" in the shared state is ignored.
 * <p>When multiple mechanisms to retrieve a ticket or key is provided, the
 * preference order is:
 * <ol>
 * <li>ticket cache
 * <li>keytab
 * <li>shared state
 * <li>user prompt
 * </ol>
 * <p>Note that if any step fails, it will fallback to the next step.
 * There's only one exception, if the shared state step fails and
 * <code>useFirstPass</code>=true, no user prompt is made.
 * <p>Examples of some configuration values for Krb5LoginModule in
 * JAAS config file and the results are:
 * <ul>
 * <p> <code>doNotPrompt</code>=true;
 * </ul>
 * <p> This is an illegal combination since none of <code>useTicketCache</code>,
 * <code>useKeyTab</code>, <code>useFirstPass</code> and <code>tryFirstPass</code>
 * is set and the user can not be prompted for the password.
 *<ul>
 * <p> <code>ticketCache</code> = &lt;filename&gt;;
 *</ul>
 * <p> This is an illegal combination since <code>useTicketCache</code>
 * is not set to true and the ticketCache is set. A configuration error
 * will occur.
 * <ul>
 * <p> <code>renewTGT</code>=true;
 *</ul>
 * <p> This is an illegal combination since <code>useTicketCache</code> is
 * not set to true and renewTGT is set. A configuration error will occur.
 * <ul>
 * <p> <code>storeKey</code>=true
 * <code>useTicketCache</code> = true
 * <code>doNotPrompt</code>=true;;
 *</ul>
 * <p> This is an illegal combination since  <code>storeKey</code> is set to
 * true but the key can not be obtained either by prompting the user or from
 * the keytab, or from the shared state. A configuration error will occur.
 * <ul>
 * <p>  <code>keyTab</code> = &lt;filename&gt; <code>doNotPrompt</code>=true ;
 * </ul>
 * <p>This is an illegal combination since useKeyTab is not set to true and
 * the keyTab is set. A configuration error will occur.
 * <ul>
 * <p> <code>debug=true </code>
 *</ul>
 * <p> Prompt the user for the principal name and the password.
 * Use the authentication exchange to get TGT from the KDC and
 * populate the <code>Subject</code> with the principal and TGT.
 * Output debug messages.
 * <ul>
 * <p> <code>useTicketCache</code> = true <code>doNotPrompt</code>=true;
 *</ul>
 * <p>Check the default cache for TGT and populate the <code>Subject</code>
 * with the principal and TGT. If the TGT is not available,
 * do not prompt the user, instead fail the authentication.
 * <ul>
 * <p><code>principal</code>=&lt;name&gt;<code>useTicketCache</code> = true
 * <code>doNotPrompt</code>=true;
 *</ul>
 * <p> Get the TGT from the default cache for the principal and populate the
 * Subject's principal and private creds set. If ticket cache is
 * not available or does not contain the principal's TGT
 * authentication will fail.
 * <ul>
 * <p> <code>useTicketCache</code> = true
 * <code>ticketCache</code>=&lt;file name&gt;<code>useKeyTab</code> = true
 * <code> keyTab</code>=&lt;keytab filename&gt;
 * <code>principal</code> = &lt;principal name&gt;
 * <code>doNotPrompt</code>=true;
 *</ul>
 * <p>  Search the cache for the principal's TGT. If it is not available
 * use the key in the keytab to perform authentication exchange with the
 * KDC and acquire the TGT.
 * The Subject will be populated with the principal and the TGT.
 * If the key is not available or valid then authentication will fail.
 * <ul>
 * <p><code>useTicketCache</code> = true
 * <code>ticketCache</code>=&lt;file name&gt;
 *</ul>
 * <p> The TGT will be obtained from the cache specified.
 * The Kerberos principal name used will be the principal name in
 * the Ticket cache. If the TGT is not available in the
 * ticket cache the user will be prompted for the principal name
 * and the password. The TGT will be obtained using the authentication
 * exchange with the KDC.
 * The Subject will be populated with the TGT.
 *<ul>
 * <p> <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytab filename&gt;
 * <code>principal</code>= &lt;principal name&gt;
 * <code>storeKey</code>=true;
 *</ul>
 * <p>  The key for the principal will be retrieved from the keytab.
 * If the key is not available in the keytab the user will be prompted
 * for the principal's password. The Subject will be populated
 * with the principal's key either from the keytab or derived from the
 * password entered.
 * <ul>
 * <p> <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytabname&gt;
 * <code>storeKey</code>=true
 * <code>doNotPrompt</code>=false;
 *</ul>
 * <p>The user will be prompted for the service principal name.
 * If the principal's
 * longterm key is available in the keytab , it will be added to the
 * Subject's private credentials. An authentication exchange will be
 * attempted with the principal name and the key from the Keytab.
 * If successful the TGT will be added to the
 * Subject's private credentials set. Otherwise the authentication will
 * fail.
 * <ul>
 * <p> <code>isInitiator</code> = false <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;keytabname&gt;
 * <code>storeKey</code>=true
 * <code>principal</code>=*;
 *</ul>
 * <p>The acceptor will be an unbound acceptor and it can act as any principal
 * as long that principal has keys in the keytab.
 *<ul>
 * <p>
 * <code>useTicketCache</code>=true
 * <code>ticketCache</code>=&lt;file name&gt;;
 * <code>useKeyTab</code> = true
 * <code>keyTab</code>=&lt;file name&gt; <code>storeKey</code>=true
 * <code>principal</code>= &lt;principal name&gt;
 *</ul>
 * <p>
 * The client's TGT will be retrieved from the ticket cache and added to the
 * <code>Subject</code>'s private credentials. If the TGT is not available
 * in the ticket cache, or the TGT's client name does not match the principal
 * name, Java will use a secret key to obtain the TGT using the authentication
 * exchange and added to the Subject's private credentials.
 * This secret key will be first retrieved from the keytab. If the key
 * is not available, the user will be prompted for the password. In either
 * case, the key derived from the password will be added to the
 * Subject's private credentials set.
 * <ul>
 * <p><code>isInitiator</code> = false
 *</ul>
 * <p>Configured to act as acceptor only, credentials are not acquired
 * via AS exchange. For acceptors only, set this value to false.
 * For initiators, do not set this value to false.
 * <ul>
 * <p><code>isInitiator</code> = true
 *</ul>
 * <p>Configured to act as initiator, credentials are acquired
 * via AS exchange. For initiators, set this value to true, or leave this
 * option unset, in which case default value (true) will be used.
 *
 * @author Ram Marti
 */
