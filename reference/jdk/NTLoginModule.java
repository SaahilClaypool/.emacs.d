_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user.
     *
     * <p> This method removes the <code>NTUserPrincipal</code>,
     * <code>NTDomainPrincipal</code>, <code>NTSidUserPrincipal</code>,
     * <code>NTSidDomainPrincipal</code>, <code>NTSidGroupPrincipal</code>s,
     * and <code>NTSidPrimaryGroupPrincipal</code>
     * that may have been added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates some
     * number of various <code>Principal</code>s
     * with the <code>Subject</code> located in the
     * <code>LoginModuleContext</code>.  If this LoginModule's own
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Import underlying NT system identity information.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public void initialize(Subject subject, CallbackHandler callbackHandler,
                           Map<String,?> sharedState,
                           Map<String,?> options)

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *          with the end user (prompting for usernames and
     *          passwords, for example). This particular LoginModule only
     *          extracts the underlying NT system information, so this
     *          parameter is ignored.<p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
@jdk.Exported

/**
 * <p> This <code>LoginModule</code>
 * renders a user's NT security information as some number of
 * <code>Principal</code>s
 * and associates them with a <code>Subject</code>.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 *
 * <p> This LoginModule also recognizes the debugNative option.
 * If set to true in the login Configuration,
 * debug messages from the native component of the module
 * will be output to the output stream, System.out.
 *
 * @see javax.security.auth.spi.LoginModule
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user.
     *
     * <p> This method removes the <code>NTUserPrincipal</code>,
     * <code>NTDomainPrincipal</code>, <code>NTSidUserPrincipal</code>,
     * <code>NTSidDomainPrincipal</code>, <code>NTSidGroupPrincipal</code>s,
     * and <code>NTSidPrimaryGroupPrincipal</code>
     * that may have been added by the <code>commit</code> method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates some
     * number of various <code>Principal</code>s
     * with the <code>Subject</code> located in the
     * <code>LoginModuleContext</code>.  If this LoginModule's own
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Import underlying NT system identity information.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
    public void initialize(Subject subject, CallbackHandler callbackHandler,
                           Map<String,?> sharedState,
                           Map<String,?> options)

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *          with the end user (prompting for usernames and
     *          passwords, for example). This particular LoginModule only
     *          extracts the underlying NT system information, so this
     *          parameter is ignored.<p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/NTLoginModule.java
@jdk.Exported

/**
 * <p> This <code>LoginModule</code>
 * renders a user's NT security information as some number of
 * <code>Principal</code>s
 * and associates them with a <code>Subject</code>.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 *
 * <p> This LoginModule also recognizes the debugNative option.
 * If set to true in the login Configuration,
 * debug messages from the native component of the module
 * will be output to the output stream, System.out.
 *
 * @see javax.security.auth.spi.LoginModule
 */
