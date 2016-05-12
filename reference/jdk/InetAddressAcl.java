_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<String> getInformCommunities(InetAddress address);

    /**
     * Returns an enumeration of inform communities for a given host.
     *
     * @param address The address of the host.
     *
     * @return An enumeration of inform communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<InetAddress> getInformDestinations();

    /**
     * Returns an enumeration of inform destinations.
     *
     * @return An enumeration of the inform destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<String> getTrapCommunities(InetAddress address);

    /**
     * Returns an enumeration of trap communities for a given host.
     *
     * @param address The address of the host.
     *
     * @return An enumeration of trap communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<InetAddress> getTrapDestinations();

    /**
     * Returns an enumeration of trap destinations.
     *
     * @return An enumeration of the trap destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkWritePermission(InetAddress address, String community);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkWritePermission(InetAddress address);

    /**
     * Checks whether or not the specified host has <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkCommunity(String community);

    /**
     * Checks whether or not a community string is defined.
     *
     * @param community The community to check.
     *
     * @return <CODE>true</CODE> if the community is known, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkReadPermission(InetAddress address, String community);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkReadPermission(InetAddress address);

    /**
     * Checks whether or not the specified host has <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public String getName();

    /**
     * Returns the name of the ACL.
     *
     * @return The name of the ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
public interface InetAddressAcl {

/**
 * Defines the IP address based ACL used by the SNMP protocol adaptor.
 * <p>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<String> getInformCommunities(InetAddress address);

    /**
     * Returns an enumeration of inform communities for a given host.
     *
     * @param address The address of the host.
     *
     * @return An enumeration of inform communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<InetAddress> getInformDestinations();

    /**
     * Returns an enumeration of inform destinations.
     *
     * @return An enumeration of the inform destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<String> getTrapCommunities(InetAddress address);

    /**
     * Returns an enumeration of trap communities for a given host.
     *
     * @param address The address of the host.
     *
     * @return An enumeration of trap communities for a given host (enumeration of <CODE>String</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public Enumeration<InetAddress> getTrapDestinations();

    /**
     * Returns an enumeration of trap destinations.
     *
     * @return An enumeration of the trap destinations (enumeration of <CODE>InetAddress</CODE>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkWritePermission(InetAddress address, String community);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkWritePermission(InetAddress address);

    /**
     * Checks whether or not the specified host has <CODE>WRITE</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has write permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkCommunity(String community);

    /**
     * Checks whether or not a community string is defined.
     *
     * @param community The community to check.
     *
     * @return <CODE>true</CODE> if the community is known, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkReadPermission(InetAddress address, String community);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public boolean checkReadPermission(InetAddress address);

    /**
     * Checks whether or not the specified host has <CODE>READ</CODE> access.
     *
     * @param address The host address to check.
     *
     * @return <CODE>true</CODE> if the host has read permission, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
    public String getName();

    /**
     * Returns the name of the ACL.
     *
     * @return The name of the ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/InetAddressAcl.java
public interface InetAddressAcl {

/**
 * Defines the IP address based ACL used by the SNMP protocol adaptor.
 * <p>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
