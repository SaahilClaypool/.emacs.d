_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    private static String etcDir;

    /**
     * Directories used by Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setTmpDir(String dirname) {

    /**
     * Sets the <CODE>tmp</CODE> directory for the product
     *
     * @param dirname The <CODE>tmp</CODE> directory for Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getTmpDir(String dirname) {

    /**
     * Returns the <CODE>tmp</CODE> directory for Java DMK concatenated with dirname.
     * <P>
     * The default value of the <CODE>tmp</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("tmp")</CODE>.
     * </UL>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK <CODE>tmp</CODE> directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getTmpDir() {

    /**
     * Returns the <CODE>tmp</CODE> directory for the product.
     * <P>
     * The default value of the <CODE>tmp</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("tmp")</CODE>.
     * </UL>
     *
     * @return Java DMK <CODE>tmp</CODE> directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setEtcDir(String dirname) {

    /**
     * Sets the <CODE>etc</CODE> directory for Java DMK.
     *
     * @param dirname The <CODE>etc</CODE> directory for Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getEtcDir(String dirname) {

    /**
     * Returns the <CODE>etc</CODE> directory for Java DMK concatenated with dirname.
     * <P>
     * The default value of the <CODE>etc</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("etc")</CODE>.
     * </UL>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK <CODE>etc</CODE> directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getEtcDir() {

    /**
     * Returns the <CODE>etc</CODE> directory for Java DMK.
     * <P>
     * The default value of the <CODE>etc</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("etc")</CODE>.
     * </UL>
     *
     * @return Java DMK <CODE>etc</CODE> directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setInstallDir(String dirname) {

    /**
     * Sets the installation directory for Java DMK.
     *
     * @param dirname The directory where Java DMK resides.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getInstallDir(String dirname) {

    /**
     * Returns the installation directory for Java DMK concatenated with dirname.
     *
     * The default value of the installation directory is:
     * <CODE>&lt;base_dir&gt; + File.separator + SUNWjdmk + File.separator + jdmk5.0 </CODE>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK installation directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getInstallDir() {

    /**
     * Returns the installation directory for Java DMK.
     *
     * The default value of the installation directory is:
     * <CODE>&lt;base_dir&gt; + File.separator + SUNWjdmk + File.separator + jdmk5.0 </CODE>
     *
     * @return Java DMK installation directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
public class DefaultPaths {

/**
 * This class represents a set of default directories used by Java DMK.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    private static String etcDir;

    /**
     * Directories used by Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setTmpDir(String dirname) {

    /**
     * Sets the <CODE>tmp</CODE> directory for the product
     *
     * @param dirname The <CODE>tmp</CODE> directory for Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getTmpDir(String dirname) {

    /**
     * Returns the <CODE>tmp</CODE> directory for Java DMK concatenated with dirname.
     * <P>
     * The default value of the <CODE>tmp</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("tmp")</CODE>.
     * </UL>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK <CODE>tmp</CODE> directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getTmpDir() {

    /**
     * Returns the <CODE>tmp</CODE> directory for the product.
     * <P>
     * The default value of the <CODE>tmp</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("tmp")</CODE>.
     * </UL>
     *
     * @return Java DMK <CODE>tmp</CODE> directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setEtcDir(String dirname) {

    /**
     * Sets the <CODE>etc</CODE> directory for Java DMK.
     *
     * @param dirname The <CODE>etc</CODE> directory for Java DMK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getEtcDir(String dirname) {

    /**
     * Returns the <CODE>etc</CODE> directory for Java DMK concatenated with dirname.
     * <P>
     * The default value of the <CODE>etc</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("etc")</CODE>.
     * </UL>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK <CODE>etc</CODE> directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getEtcDir() {

    /**
     * Returns the <CODE>etc</CODE> directory for Java DMK.
     * <P>
     * The default value of the <CODE>etc</CODE> directory is:
     * <UL>
     * <LI><CODE>DefaultPaths.getInstallDir("etc")</CODE>.
     * </UL>
     *
     * @return Java DMK <CODE>etc</CODE> directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static void setInstallDir(String dirname) {

    /**
     * Sets the installation directory for Java DMK.
     *
     * @param dirname The directory where Java DMK resides.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getInstallDir(String dirname) {

    /**
     * Returns the installation directory for Java DMK concatenated with dirname.
     *
     * The default value of the installation directory is:
     * <CODE>&lt;base_dir&gt; + File.separator + SUNWjdmk + File.separator + jdmk5.0 </CODE>
     *
     * @param dirname The directory to be appended.
     *
     * @return Java DMK installation directory + <CODE>File.separator</CODE> + <CODE>dirname</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
    public static String getInstallDir() {

    /**
     * Returns the installation directory for Java DMK.
     *
     * The default value of the installation directory is:
     * <CODE>&lt;base_dir&gt; + File.separator + SUNWjdmk + File.separator + jdmk5.0 </CODE>
     *
     * @return Java DMK installation directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/DefaultPaths.java
public class DefaultPaths {

/**
 * This class represents a set of default directories used by Java DMK.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
