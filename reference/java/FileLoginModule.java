_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    private void cleanState() {

    /**
     * Clean out state because of a failed authentication attempt
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    private void getUsernamePassword(boolean usePasswdFromSharedState)

    /**
     * Get the username and password.
     * This method does not return any value.
     * Instead, it sets global name and password variables.
     *
     * <p> Also note that this method will set the username and password
     * values in the shared state in case subsequent LoginModules
     * want to use them via use/tryFirstPass.
     *
     * @param usePasswdFromSharedState boolean that tells this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    @SuppressWarnings("unchecked")  // sharedState used as Map<String,Object>

    /**
     * Attempt authentication
     *
     * @param usePasswdFromSharedState a flag to tell this method whether
     *          to retrieve the password from the sharedState.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    public boolean abort() throws LoginException {

    /**
     * Abort user authentication (Authentication Phase 2).
     *
     * <p> This method is called if the LoginContext's overall authentication
     * failed (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules did not succeed).
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    public boolean commit() throws LoginException {

    /**
     * Complete user authentication (Authentication Phase 2).
     *
     * <p> This method is called if the LoginContext's
     * overall authentication has succeeded
     * (all the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL
     * LoginModules have succeeded).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> method), then this method associates a
     * <code>JMXPrincipal</code> with the <code>Subject</code> located in the
     * <code>LoginModule</code>.  If this LoginModule's own
     * authentication attempted failed, then this method removes
     * any state that was originally saved.
     *
     * @exception LoginException if the commit fails
     * @return true if this LoginModule's own login and commit
     *          attempts succeeded, or false otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    public boolean login() throws LoginException {

    /**
     * Begin user authentication (Authentication Phase 1).
     *
     * <p> Acquire the user's name and password and verify them against
     * the corresponding credentials from the password file.
     *
     * @return true always, since this <code>LoginModule</code>
     *          should not be ignored.
     * @exception FailedLoginException if the authentication fails.
     * @exception LoginException if this <code>LoginModule</code>
     *          is unable to perform the authentication.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
    public void initialize(Subject subject, CallbackHandler callbackHandler,
                           Map<String,?> sharedState,
                           Map<String,?> options)

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * @param subject the <code>Subject</code> to be authenticated.
     * @param callbackHandler a <code>CallbackHandler</code> to acquire the
     *                  user's name and password.
     * @param sharedState shared <code>LoginModule</code> state.
     * @param options options specified in the login
     *                  <code>Configuration</code> for this particular
     *                  <code>LoginModule</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/FileLoginModule.java
public class FileLoginModule implements LoginModule {

/**
 * This {@link LoginModule} performs file-based authentication.
 *
 * <p> A supplied username and password is verified against the
 * corresponding user credentials stored in a designated password file.
 * If successful then a new {@link JMXPrincipal} is created with the
 * user's name and it is associated with the current {@link Subject}.
 * Such principals may be identified and granted management privileges in
 * the access control file for JMX remote management or in a Java security
 * policy.
 *
 * <p> The password file comprises a list of key-value pairs as specified in
 * {@link Properties}. The key represents a user's name and the value is its
 * associated cleartext password. By default, the following password file is
 * used:
 * <pre>
 *     ${java.home}/lib/management/jmxremote.password
 * </pre>
 * A different password file can be specified via the <code>passwordFile</code>
 * configuration option.
 *
 * <p> This module recognizes the following <code>Configuration</code> options:
 * <dl>
 * <dt> <code>passwordFile</code> </dt>
 * <dd> the path to an alternative password file. It is used instead of
 *      the default password file.</dd>
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
 *      the module uses the CallbackHandler to retrieve a new username and
 *      password, and another attempt to authenticate is made. If the
 *      authentication fails, the failure is reported back to the calling
 *      application.</dd>
 *
 * <dt> <code>storePass</code> </dt>
 * <dd> if <code>true</code>, this module stores the username and password
 *      obtained from the CallbackHandler in the module's shared state, using
 *      "javax.security.auth.login.name" and
 *      "javax.security.auth.login.password" as the respective keys.  This is
 *      not performed if existing values already exist for the username and
 *      password in the shared state, or if authentication fails.</dd>
 *
 * <dt> <code>clearPass</code> </dt>
 * <dd> if <code>true</code>, this module clears the username and password
 *      stored in the module's shared state after both phases of authentication
 *      (login and commit) have completed.</dd>
 * </dl>
 */
