_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private Hashtable<InetAddress, Vector<String>> informDestList = null;

    /**
     * Contains the hosts list for inform destination.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private String authorizedListFile = null;

    /**
     * Represents the Access Control List flat file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private AclImpl acl = null;

    /**
     * Represents the Access Control List.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private void setDefaultFileName() {

    /**
     * Set the default full path for "snmp.acl" input file.
     * Do not complain if the file does not exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private void readAuthorizedListFile() {

    /**
     * Converts the input configuration file into ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> getInformCommunities(InetAddress i) {

    /**
     * Returns an enumeration of inform communities for a given host.
     *
     * @param i The address of the host.
     *
     * @return An enumeration of inform communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<InetAddress> getInformDestinations() {

    /**
     * Returns an enumeration of inform destinations.
     *
     * @return An enumeration of the inform destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> getTrapCommunities(InetAddress i) {

    /**
     * Returns an enumeration of trap communities for a given host.
     *
     * @param i The address of the host.
     *
     * @return An enumeration of trap communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<InetAddress> getTrapDestinations() {

    /**
     * Returns an enumeration of trap destinations.
     *
     * @return An enumeration of the trap destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkWritePermission(InetAddress address, String community) {

    /**
     * Checks whether or not the specified host and community have <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     * @param community The community associated with the host.
     *
     * @return <CODE>true</CODE> if the pair (host, community) has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkWritePermission(InetAddress address) {

    /**
     * Checks whether or not the specified host has <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkCommunity(String community) {

    /**
     * Checks whether or not a community string is defined.
     *
     * @param community The community to check.
     *
     * @return <CODE>true</CODE> if the community is known, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkReadPermission(InetAddress address, String community) {

    /**
     * Checks whether or not the specified host and community have <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     * @param community The community associated with the host.
     *
     * @return <CODE>true</CODE> if the pair (host, community) has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkReadPermission(InetAddress address) {

    /**
     * Checks whether or not the specified host has <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public String getAuthorizedListFile() {

    /**
     * Returns the full path of the file used to get ACL information.
     *
     * @return The full path of the file used to get ACL information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public void rereadTheFile() throws NotOwnerException, UnknownHostException {

    /**
     * Resets this ACL to the values contained in the configuration file.
     *
     * @exception NotOwnerException If the principal attempting the reset is not an owner of this ACL.
     * @exception UnknownHostException If IP addresses for hosts contained in the ACL file couldn't be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public void setAuthorizedListFile(String filename)

    /**
     * Sets the full path of the file containing the ACL information.
     *
     * @param filename The full path of the file containing the ACL information.
     * @throws IllegalArgumentException If the passed ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public static String getDefaultAclFileName() {

    /**
     * Get the default name for the ACL file.
     * In this implementation this is "$JRE/lib/snmp.acl"
     * @return The default name for the ACL file.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    static public PermissionImpl getWRITE() {

    /**
     * Returns the write permission instance used.
     *
     * @return  The write permission instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    static public PermissionImpl getREAD() {

    /**
     * Returns the read permission instance used.
     *
     * @return The read permission instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public String getName() {

    /**
     * Returns the name of the ACL.
     *
     * @return The name of the ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> communities() {

    /**
     * Returns ann enumeration of community strings. Community strings are returned as String.
     * @return The enumeration of community strings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<AclEntry> entries() {

    /**
     * Returns an enumeration of the entries in this ACL. Each element in the
     * enumeration is of type <CODE>java.security.acl.AclEntry</CODE>.
     *
     * @return An enumeration of the entries in this ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public SnmpAcl(String Owner, String aclFileName)

    /**
     * Constructs the Java Dynamic Management(TM) Access Control List
     * based on IP addresses. The ACL will take the given owner name.
     * The current IP address will be the owner of the ACL.
     *
     * @param Owner The name of the ACL Owner.
     * @param aclFileName The name of the ACL File.
     *
     * @exception UnknownHostException If the local host is unknown.
     * @exception IllegalArgumentException If the ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public SnmpAcl(String Owner)

    /**
     * Constructs the Java Dynamic Management(TM) Access Control List
     * based on IP addresses. The ACL will take the given owner name.
     * The current IP address will be the owner of the ACL.
     *
     * @param Owner The name of the ACL Owner.
     *
     * @exception UnknownHostException If the local host is unknown.
     * @exception IllegalArgumentException If the ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
public class SnmpAcl implements InetAddressAcl, Serializable {

/**
 * Defines an implementation of the {@link com.sun.jmx.snmp.InetAddressAcl InetAddressAcl} interface.
 * <p>
 * In this implementation the ACL information is stored on a flat file and
 * its default location is "$JRE/lib/snmp.acl" - See
 * {@link #getDefaultAclFileName()}
 * <p>
 * <OL>
  *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private Hashtable<InetAddress, Vector<String>> informDestList = null;

    /**
     * Contains the hosts list for inform destination.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private String authorizedListFile = null;

    /**
     * Represents the Access Control List flat file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private AclImpl acl = null;

    /**
     * Represents the Access Control List.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private void setDefaultFileName() {

    /**
     * Set the default full path for "snmp.acl" input file.
     * Do not complain if the file does not exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    private void readAuthorizedListFile() {

    /**
     * Converts the input configuration file into ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> getInformCommunities(InetAddress i) {

    /**
     * Returns an enumeration of inform communities for a given host.
     *
     * @param i The address of the host.
     *
     * @return An enumeration of inform communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<InetAddress> getInformDestinations() {

    /**
     * Returns an enumeration of inform destinations.
     *
     * @return An enumeration of the inform destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> getTrapCommunities(InetAddress i) {

    /**
     * Returns an enumeration of trap communities for a given host.
     *
     * @param i The address of the host.
     *
     * @return An enumeration of trap communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<InetAddress> getTrapDestinations() {

    /**
     * Returns an enumeration of trap destinations.
     *
     * @return An enumeration of the trap destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkWritePermission(InetAddress address, String community) {

    /**
     * Checks whether or not the specified host and community have <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     * @param community The community associated with the host.
     *
     * @return <CODE>true</CODE> if the pair (host, community) has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkWritePermission(InetAddress address) {

    /**
     * Checks whether or not the specified host has <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkCommunity(String community) {

    /**
     * Checks whether or not a community string is defined.
     *
     * @param community The community to check.
     *
     * @return <CODE>true</CODE> if the community is known, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkReadPermission(InetAddress address, String community) {

    /**
     * Checks whether or not the specified host and community have <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     * @param community The community associated with the host.
     *
     * @return <CODE>true</CODE> if the pair (host, community) has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public boolean checkReadPermission(InetAddress address) {

    /**
     * Checks whether or not the specified host has <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public String getAuthorizedListFile() {

    /**
     * Returns the full path of the file used to get ACL information.
     *
     * @return The full path of the file used to get ACL information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public void rereadTheFile() throws NotOwnerException, UnknownHostException {

    /**
     * Resets this ACL to the values contained in the configuration file.
     *
     * @exception NotOwnerException If the principal attempting the reset is not an owner of this ACL.
     * @exception UnknownHostException If IP addresses for hosts contained in the ACL file couldn't be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public void setAuthorizedListFile(String filename)

    /**
     * Sets the full path of the file containing the ACL information.
     *
     * @param filename The full path of the file containing the ACL information.
     * @throws IllegalArgumentException If the passed ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public static String getDefaultAclFileName() {

    /**
     * Get the default name for the ACL file.
     * In this implementation this is "$JRE/lib/snmp.acl"
     * @return The default name for the ACL file.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    static public PermissionImpl getWRITE() {

    /**
     * Returns the write permission instance used.
     *
     * @return  The write permission instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    static public PermissionImpl getREAD() {

    /**
     * Returns the read permission instance used.
     *
     * @return The read permission instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public String getName() {

    /**
     * Returns the name of the ACL.
     *
     * @return The name of the ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<String> communities() {

    /**
     * Returns ann enumeration of community strings. Community strings are returned as String.
     * @return The enumeration of community strings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public Enumeration<AclEntry> entries() {

    /**
     * Returns an enumeration of the entries in this ACL. Each element in the
     * enumeration is of type <CODE>java.security.acl.AclEntry</CODE>.
     *
     * @return An enumeration of the entries in this ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public SnmpAcl(String Owner, String aclFileName)

    /**
     * Constructs the Java Dynamic Management(TM) Access Control List
     * based on IP addresses. The ACL will take the given owner name.
     * The current IP address will be the owner of the ACL.
     *
     * @param Owner The name of the ACL Owner.
     * @param aclFileName The name of the ACL File.
     *
     * @exception UnknownHostException If the local host is unknown.
     * @exception IllegalArgumentException If the ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
    public SnmpAcl(String Owner)

    /**
     * Constructs the Java Dynamic Management(TM) Access Control List
     * based on IP addresses. The ACL will take the given owner name.
     * The current IP address will be the owner of the ACL.
     *
     * @param Owner The name of the ACL Owner.
     *
     * @exception UnknownHostException If the local host is unknown.
     * @exception IllegalArgumentException If the ACL file doesn't exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/SnmpAcl.java
public class SnmpAcl implements InetAddressAcl, Serializable {

/**
 * Defines an implementation of the {@link com.sun.jmx.snmp.InetAddressAcl InetAddressAcl} interface.
 * <p>
 * In this implementation the ACL information is stored on a flat file and
 * its default location is "$JRE/lib/snmp.acl" - See
 * {@link #getDefaultAclFileName()}
 * <p>
 * <OL>
  *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
