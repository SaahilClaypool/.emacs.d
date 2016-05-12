_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public String toString() {

  /**
   * Prints a string representation of this group.
   *
   * @return  a string representation of this group.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean removeMember(Principal p) {

  /**
   * Removes the specified member from the group. (Not implemented)
   *
   * @param p the principal to remove from this group.
   * @return allways return true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public Enumeration<? extends Principal> members(){

  /**
   * Returns an enumeration which contains the subnet mask.
   *
   * @return an enumeration which contains the subnet mask.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean isMember(Principal p) {

  /**
   * Returns true if the passed principal is a member of the group.
   *
   * @param p the principal whose membership is to be checked.
   * @return true if the principal is a member of this group, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
    public boolean equals (Object p) {

  /**
   * Compares this group to the specified object. Returns true if the object
   * passed in matches the group represented.
   *
   * @param p the object to compare with.
   * @return true if the object passed in matches the subnet mask,
   *    false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean addMember(Principal p) {

  /**
   * Adds the specified member to the group.
   *
   * @param p the principal to add to this group.
   * @return true if the member was successfully added, false if the
   *      principal was already a member.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public NetMaskImpl (String a, int prefix) throws UnknownHostException {

  /**
   * Constructs a group using the specified subnet mask.
   * THIS ALGORITHM IS V4 and V6 compatible.
   *
   * @exception UnknownHostException if the subnet mask cann't be built.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
    public NetMaskImpl () throws UnknownHostException {

    /**
     * Constructs an empty group.
     * @exception UnknownHostException Not implemented
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
class NetMaskImpl extends PrincipalImpl implements Group, Serializable {

/**
 * This class is used to represent a subnet mask (a group of hosts matching the same
 * IP mask).
 *
 * @see java.security.acl.Group
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public String toString() {

  /**
   * Prints a string representation of this group.
   *
   * @return  a string representation of this group.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean removeMember(Principal p) {

  /**
   * Removes the specified member from the group. (Not implemented)
   *
   * @param p the principal to remove from this group.
   * @return allways return true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public Enumeration<? extends Principal> members(){

  /**
   * Returns an enumeration which contains the subnet mask.
   *
   * @return an enumeration which contains the subnet mask.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean isMember(Principal p) {

  /**
   * Returns true if the passed principal is a member of the group.
   *
   * @param p the principal whose membership is to be checked.
   * @return true if the principal is a member of this group, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
    public boolean equals (Object p) {

  /**
   * Compares this group to the specified object. Returns true if the object
   * passed in matches the group represented.
   *
   * @param p the object to compare with.
   * @return true if the object passed in matches the subnet mask,
   *    false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public boolean addMember(Principal p) {

  /**
   * Adds the specified member to the group.
   *
   * @param p the principal to add to this group.
   * @return true if the member was successfully added, false if the
   *      principal was already a member.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
  public NetMaskImpl (String a, int prefix) throws UnknownHostException {

  /**
   * Constructs a group using the specified subnet mask.
   * THIS ALGORITHM IS V4 and V6 compatible.
   *
   * @exception UnknownHostException if the subnet mask cann't be built.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
    public NetMaskImpl () throws UnknownHostException {

    /**
     * Constructs an empty group.
     * @exception UnknownHostException Not implemented
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/NetMaskImpl.java
class NetMaskImpl extends PrincipalImpl implements Group, Serializable {

/**
 * This class is used to represent a subnet mask (a group of hosts matching the same
 * IP mask).
 *
 * @see java.security.acl.Group
 */
