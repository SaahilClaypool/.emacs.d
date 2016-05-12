_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean checkCommunity(String comm){

  /**
   * Checks if the specified community is part of the community set in this
   * entry.
   *
   * @param  comm the community to be checked for.
   * @return true if the community is part of the community set in this
   *         entry, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean removeCommunity(String comm){

  /**
   * Removes the specified community from this ACL entry.
   *
   * @param comm the community  to be removed from this entry.
   * @return true if the community is removed, false if the community was
   *         not part of this entry's community set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean addCommunity(String comm){

  /**
   * Adds the specified community to this ACL entry. Note: An entry can
   * have multiple communities.
   *
   * @param comm the community to be associated with the principal
   *        in this entry.
   * @return true if the community was added, false if the community was
   *         already part of this entry's community set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Enumeration<String> communities(){

  /**
   * Returns an enumeration of the communities in this ACL entry.
   *
   * @return an enumeration of the communities in this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public String toString(){

  /**
   * Returns a string representation of the contents of this ACL entry.
   *
   * @return a string representation of the contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean setPrincipal(Principal p) {

  /**
   * Specifies the principal for which permissions are granted or denied by
   * this ACL entry. If a principal was already set for this ACL entry,
   * false is returned, otherwise true is returned.
   *
   * @param p the principal to be set for this entry.
   * @return true if the principal is set, false if there was already a
   *         principal set for this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Principal getPrincipal(){

  /**
   * Returns the principal for which permissions are granted or denied by this ACL
   * entry. Returns null if there is no principal set for this entry yet.
   *
   * @return the principal associated with this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public void setNegativePermissions(){

  /**
   * Sets this ACL entry to be a negative one. That is, the associated principal
   * (e.g., a user or a group) will be denied the permission set specified in the
   * entry. Note: ACL entries are by default positive. An entry becomes a negative
   * entry only if this setNegativePermissions method is called on it.
   *
   * Not Implemented.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Enumeration<Permission> permissions(){

  /**
   * Returns an enumeration of the permissions in this ACL entry.
   *
   * @return an enumeration of the permissions in this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean checkPermission(java.security.acl.Permission perm){

  /**
   * Checks if the specified permission is part of the permission set in
   * this entry.
   *
   * @param perm the permission to be checked for.
   * @return true if the permission is part of the permission set in this
   *         entry, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean removePermission(java.security.acl.Permission perm){

  /**
   * Removes the specified permission from this ACL entry.
   *
   * @param perm the permission to be removed from this entry.
   * @return true if the permission is removed, false if the permission
   *         was not part of this entry's permission set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean addPermission(java.security.acl.Permission perm){

  /**
   * Adds the specified permission to this ACL entry. Note: An entry can
   * have multiple permissions.
   *
   * @param perm the permission to be associated with the principal in this
   *        entry
   * @return true if the permission is removed, false if the permission was
   *         not part of this entry's permission set.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean isNegative(){

  /**
   * Returns true if this is a negative ACL entry (one denying the associated principal
   * the set of permissions in the entry), false otherwise.
   *
   * @return true if this is a negative ACL entry, false if it's not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Object clone() {

  /**
   * Clones this ACL entry.
   *
   * @return a clone of this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public AclEntryImpl (Principal p) throws UnknownHostException {

  /**
   * Constructs an ACL entry with a specified principal.
   *
   * @param p the principal to be set for this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public AclEntryImpl (){

  /**
   * Contructs an empty ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
class AclEntryImpl implements AclEntry, Serializable {

/**
 * Represent one entry in the Access Control List (ACL).
 * This ACL entry object contains a permission associated with a particular principal.
 * (A principal represents an entity such as an individual machine or a group).
 *
 * @see java.security.acl.AclEntry
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean checkCommunity(String comm){

  /**
   * Checks if the specified community is part of the community set in this
   * entry.
   *
   * @param  comm the community to be checked for.
   * @return true if the community is part of the community set in this
   *         entry, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean removeCommunity(String comm){

  /**
   * Removes the specified community from this ACL entry.
   *
   * @param comm the community  to be removed from this entry.
   * @return true if the community is removed, false if the community was
   *         not part of this entry's community set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean addCommunity(String comm){

  /**
   * Adds the specified community to this ACL entry. Note: An entry can
   * have multiple communities.
   *
   * @param comm the community to be associated with the principal
   *        in this entry.
   * @return true if the community was added, false if the community was
   *         already part of this entry's community set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Enumeration<String> communities(){

  /**
   * Returns an enumeration of the communities in this ACL entry.
   *
   * @return an enumeration of the communities in this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public String toString(){

  /**
   * Returns a string representation of the contents of this ACL entry.
   *
   * @return a string representation of the contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean setPrincipal(Principal p) {

  /**
   * Specifies the principal for which permissions are granted or denied by
   * this ACL entry. If a principal was already set for this ACL entry,
   * false is returned, otherwise true is returned.
   *
   * @param p the principal to be set for this entry.
   * @return true if the principal is set, false if there was already a
   *         principal set for this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Principal getPrincipal(){

  /**
   * Returns the principal for which permissions are granted or denied by this ACL
   * entry. Returns null if there is no principal set for this entry yet.
   *
   * @return the principal associated with this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public void setNegativePermissions(){

  /**
   * Sets this ACL entry to be a negative one. That is, the associated principal
   * (e.g., a user or a group) will be denied the permission set specified in the
   * entry. Note: ACL entries are by default positive. An entry becomes a negative
   * entry only if this setNegativePermissions method is called on it.
   *
   * Not Implemented.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Enumeration<Permission> permissions(){

  /**
   * Returns an enumeration of the permissions in this ACL entry.
   *
   * @return an enumeration of the permissions in this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean checkPermission(java.security.acl.Permission perm){

  /**
   * Checks if the specified permission is part of the permission set in
   * this entry.
   *
   * @param perm the permission to be checked for.
   * @return true if the permission is part of the permission set in this
   *         entry, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean removePermission(java.security.acl.Permission perm){

  /**
   * Removes the specified permission from this ACL entry.
   *
   * @param perm the permission to be removed from this entry.
   * @return true if the permission is removed, false if the permission
   *         was not part of this entry's permission set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean addPermission(java.security.acl.Permission perm){

  /**
   * Adds the specified permission to this ACL entry. Note: An entry can
   * have multiple permissions.
   *
   * @param perm the permission to be associated with the principal in this
   *        entry
   * @return true if the permission is removed, false if the permission was
   *         not part of this entry's permission set.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public boolean isNegative(){

  /**
   * Returns true if this is a negative ACL entry (one denying the associated principal
   * the set of permissions in the entry), false otherwise.
   *
   * @return true if this is a negative ACL entry, false if it's not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public Object clone() {

  /**
   * Clones this ACL entry.
   *
   * @return a clone of this ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public AclEntryImpl (Principal p) throws UnknownHostException {

  /**
   * Constructs an ACL entry with a specified principal.
   *
   * @param p the principal to be set for this entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
  public AclEntryImpl (){

  /**
   * Contructs an empty ACL entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclEntryImpl.java
class AclEntryImpl implements AclEntry, Serializable {

/**
 * Represent one entry in the Access Control List (ACL).
 * This ACL entry object contains a permission associated with a particular principal.
 * (A principal represents an entity such as an individual machine or a group).
 *
 * @see java.security.acl.AclEntry
 */
