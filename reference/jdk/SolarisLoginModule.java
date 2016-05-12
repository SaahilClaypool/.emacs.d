_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user
     *
     * <p> This method removes the Principals associated
     * with the <code>Subject</code>.
     *
     * <p>
     *
     * @exception LoginException if the logout fails
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * Abort the authentication (second phase).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> This method cleans up any state that was originally saved
     * as part of the authentication attempt from the <code>login</code>
     * and <code>commit</code> methods.
     *
     * <p>
     *
     * @exception LoginException if the abort fails
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Commit the authentication (second phase).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (the importing of the Solaris authentication information
     * succeeded), then this method associates the Solaris Principals
     * with the <code>Subject</code> currently tied to the
     * <code>LoginModule</code>.  If this LoginModule's
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails
     *
     * @return true if this LoginModule's own login and commit attempts
     *          succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user (first phase).
     *
     * <p> The implementation of this method attempts to retrieve the user's
     * Solaris <code>Subject</code> information by making a native Solaris
     * system call.
     *
     * <p>
     *
     * @exception FailedLoginException if attempts to retrieve the underlying
     *          system information fail.
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
@jdk.Exported(false)

/**
 * <p> This <code>LoginModule</code> imports a user's Solaris
 * <code>Principal</code> information (<code>SolarisPrincipal</code>,
 * <code>SolarisNumericUserPrincipal</code>,
 * and <code>SolarisNumericGroupPrincipal</code>)
 * and associates them with the current <code>Subject</code>.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 * @deprecated  As of JDK1.4, replaced by
 * <code>com.sun.security.auth.module.UnixLoginModule</code>.
 *             This LoginModule is entirely deprecated and
 *             is here to allow for a smooth transition to the new
 *             UnixLoginModule.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean logout() throws LoginException {

    /**
     * Logout the user
     *
     * <p> This method removes the Principals associated
     * with the <code>Subject</code>.
     *
     * <p>
     *
     * @exception LoginException if the logout fails
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * Abort the authentication (second phase).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> This method cleans up any state that was originally saved
     * as part of the authentication attempt from the <code>login</code>
     * and <code>commit</code> methods.
     *
     * <p>
     *
     * @exception LoginException if the abort fails
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *          failed, and true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Commit the authentication (second phase).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (the importing of the Solaris authentication information
     * succeeded), then this method associates the Solaris Principals
     * with the <code>Subject</code> currently tied to the
     * <code>LoginModule</code>.  If this LoginModule's
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the commit fails
     *
     * @return true if this LoginModule's own login and commit attempts
     *          succeeded, or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Authenticate the user (first phase).
     *
     * <p> The implementation of this method attempts to retrieve the user's
     * Solaris <code>Subject</code> information by making a native Solaris
     * system call.
     *
     * <p>
     *
     * @exception FailedLoginException if attempts to retrieve the underlying
     *          system information fail.
     *
     * @return true in all cases (this <code>LoginModule</code>
     *          should not be ignored).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/SolarisLoginModule.java
@jdk.Exported(false)

/**
 * <p> This <code>LoginModule</code> imports a user's Solaris
 * <code>Principal</code> information (<code>SolarisPrincipal</code>,
 * <code>SolarisNumericUserPrincipal</code>,
 * and <code>SolarisNumericGroupPrincipal</code>)
 * and associates them with the current <code>Subject</code>.
 *
 * <p> This LoginModule recognizes the debug option.
 * If set to true in the login Configuration,
 * debug messages will be output to the output stream, System.out.
 * @deprecated  As of JDK1.4, replaced by
 * <code>com.sun.security.auth.module.UnixLoginModule</code>.
 *             This LoginModule is entirely deprecated and
 *             is here to allow for a smooth transition to the new
 *             UnixLoginModule.
 *
 */
