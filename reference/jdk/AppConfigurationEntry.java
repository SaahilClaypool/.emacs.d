_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
        public String toString() {

        /**
         * Return a String representation of this controlFlag.
         *
         * <p> The String has the format, "LoginModuleControlFlag: <i>flag</i>",
         * where <i>flag</i> is either <i>required</i>, <i>requisite</i>,
         * <i>sufficient</i>, or <i>optional</i>.
         *
         * @return a String representation of this controlFlag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
        public static final LoginModuleControlFlag OPTIONAL =

        /**
         * Optional {@code LoginModule}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
        public static final LoginModuleControlFlag SUFFICIENT =

        /**
         * Sufficient {@code LoginModule}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
        public static final LoginModuleControlFlag REQUISITE =

        /**
         * Requisite {@code LoginModule}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
        public static final LoginModuleControlFlag REQUIRED =

        /**
         * Required {@code LoginModule}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
    public static class LoginModuleControlFlag {

    /**
     * This class represents whether or not a {@code LoginModule}
     * is REQUIRED, REQUISITE, SUFFICIENT or OPTIONAL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
    public Map<String,?> getOptions() {

    /**
     * Get the options configured for this {@code LoginModule}.
     *
     * @return the options configured for this {@code LoginModule}
     *          as an unmodifiable {@code Map}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
    public LoginModuleControlFlag getControlFlag() {

    /**
     * Return the controlFlag
     * (either REQUIRED, REQUISITE, SUFFICIENT, or OPTIONAL)
     * for this {@code LoginModule}.
     *
     * @return the controlFlag
     *          (either REQUIRED, REQUISITE, SUFFICIENT, or OPTIONAL)
     *          for this {@code LoginModule}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
    public String getLoginModuleName() {

    /**
     * Get the class name of the configured {@code LoginModule}.
     *
     * @return the class name of the configured {@code LoginModule} as
     *          a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
    public AppConfigurationEntry(String loginModuleName,
                                LoginModuleControlFlag controlFlag,
                                Map<String,?> options)

    /**
     * Default constructor for this class.
     *
     * <p> This entry represents a single {@code LoginModule}
     * entry configured for the application specified in the
     * {@code getAppConfigurationEntry(String appName)}
     * method from the {@code Configuration} class.
     *
     * @param loginModuleName String representing the class name of the
     *                  {@code LoginModule} configured for the
     *                  specified application. <p>
     *
     * @param controlFlag either REQUIRED, REQUISITE, SUFFICIENT,
     *                  or OPTIONAL. <p>
     *
     * @param options the options configured for this {@code LoginModule}.
     *
     * @exception IllegalArgumentException if {@code loginModuleName}
     *                  is null, if {@code LoginModuleName}
     *                  has a length of 0, if {@code controlFlag}
     *                  is not either REQUIRED, REQUISITE, SUFFICIENT
     *                  or OPTIONAL, or if {@code options} is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/AppConfigurationEntry.java
public class AppConfigurationEntry {

/**
 * This class represents a single {@code LoginModule} entry
 * configured for the application specified in the
 * {@code getAppConfigurationEntry(String appName)}
 * method in the {@code Configuration} class.  Each respective
 * {@code AppConfigurationEntry} contains a {@code LoginModule} name,
 * a control flag (specifying whether this {@code LoginModule} is
 * REQUIRED, REQUISITE, SUFFICIENT, or OPTIONAL), and LoginModule-specific
 * options.  Please refer to the {@code Configuration} class for
 * more information on the different control flags and their semantics.
 *
 * @see javax.security.auth.login.Configuration
 */
