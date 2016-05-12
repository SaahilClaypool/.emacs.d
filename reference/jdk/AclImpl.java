_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns a string representation of the ACL contents.
   *
   * @return a string representation of the ACL contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public boolean checkCommunity(String community) {

  /**
   * Checks whether or not the specified community string is defined.
   *
   * @param community the community name associated with the principal.
   *
   * @return true if the specified community string is defined, false
   *      otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public boolean checkPermission(Principal user, String community,
                                 java.security.acl.Permission perm) {

  /**
   * Checks whether or not the specified principal has the specified
   * permission.
   * If it does, true is returned, otherwise false is returned.
   * More specifically, this method checks whether the passed permission
   * is a member of the allowed permission set of the specified principal.
   * The allowed permission set is determined by the same algorithm as is
   * used by the getPermissions method.
   *
   * @param user the principal, assumed to be a valid authenticated Principal.
   * @param community the community name associated with the principal.
   * @param perm the permission to be checked for.
   * @return true if the principal has the specified permission, false
   *        otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Checks whether or not the specified principal has the specified
   * permission.
   * If it does, true is returned, otherwise false is returned.
   * More specifically, this method checks whether the passed permission
   * is a member of the allowed permission set of the specified principal.
   * The allowed permission set is determined by the same algorithm as is
   * used by the getPermissions method.
   *
   * @param user the principal, assumed to be a valid authenticated Principal.
   * @param perm the permission to be checked for.
   * @return true if the principal has the specified permission,
   *         false otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns an enumeration of the entries in this ACL. Each element in the
   * enumeration is of type AclEntry.
   *
   * @return an enumeration of the entries in this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns an enumeration for the set of allowed permissions for
   * the specified principal
   * (representing an entity such as an individual or a group).
   * This set of allowed permissions is calculated as follows:
   * <UL>
   * <LI>If there is no entry in this Access Control List for the specified
   * principal, an empty permission set is returned.</LI>
   * <LI>Otherwise, the principal's group permission sets are determined.
   * (A principal can belong to one or more groups, where a group is a group
   * of principals, represented by the Group interface.)</LI>
   * </UL>
   * @param user the principal whose permission set is to be returned.
   * @return the permission set specifying the permissions the principal
   *     is allowed.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public void removeAll(Principal caller)

  /**
   * Removes all ACL entries from this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @exception NotOwnerException if the caller principal is not an owner of
   *        this Acl.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Removes an ACL entry from this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param entry the ACL entry to be removed from this ACL.
   * @return true on success, false if the entry is not part of this ACL.
   * @exception NotOwnerException if the caller principal is not an owner
   *   of this Acl.
   * @see java.security.Principal
   * @see java.security.acl.AclEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Adds an ACL entry to this ACL. An entry associates a principal (e.g., an individual or a group)
   * with a set of permissions. Each principal can have at most one positive ACL entry
   * (specifying permissions to be granted to the principal) and one negative ACL entry
   * (specifying permissions to be denied). If there is already an ACL entry
   * of the same type (negative or positive) already in the ACL, false is returned.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param entry the ACL entry to be added to this ACL.
   * @return true on success, false if an entry of the same type (positive
   *       or negative) for the same principal is already present in this ACL.
   * @exception NotOwnerException if the caller principal is not an owner of
   *       this ACL.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns the name of this ACL.
   *
   * @return the name of this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Sets the name of this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param name the name to be given to this ACL.
   *
   * @exception NotOwnerException if the caller principal is not an owner
   *            of this ACL.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public AclImpl (PrincipalImpl owner, String name) {

  /**
   * Constructs the ACL with a specified owner
   *
   * @param owner owner of the ACL.
   * @param name  name of this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
class AclImpl extends OwnerImpl implements Acl, Serializable {

/**
 * Represent an Access Control List (ACL) which is used to guard access to http adaptor.
 * <P>
 * It is a data structure with multiple ACL entries. Each ACL entry, of interface type
 * AclEntry, contains a set of permissions and a set of communities associated with a
 * particular principal. (A principal represents an entity such as a host or a group of host).
 * Additionally, each ACL entry is specified as being either positive or negative.
 * If positive, the permissions are to be granted to the associated principal.
 * If negative, the permissions are to be denied.
 *
 * @see java.security.acl.Acl
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns a string representation of the ACL contents.
   *
   * @return a string representation of the ACL contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public boolean checkCommunity(String community) {

  /**
   * Checks whether or not the specified community string is defined.
   *
   * @param community the community name associated with the principal.
   *
   * @return true if the specified community string is defined, false
   *      otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public boolean checkPermission(Principal user, String community,
                                 java.security.acl.Permission perm) {

  /**
   * Checks whether or not the specified principal has the specified
   * permission.
   * If it does, true is returned, otherwise false is returned.
   * More specifically, this method checks whether the passed permission
   * is a member of the allowed permission set of the specified principal.
   * The allowed permission set is determined by the same algorithm as is
   * used by the getPermissions method.
   *
   * @param user the principal, assumed to be a valid authenticated Principal.
   * @param community the community name associated with the principal.
   * @param perm the permission to be checked for.
   * @return true if the principal has the specified permission, false
   *        otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Checks whether or not the specified principal has the specified
   * permission.
   * If it does, true is returned, otherwise false is returned.
   * More specifically, this method checks whether the passed permission
   * is a member of the allowed permission set of the specified principal.
   * The allowed permission set is determined by the same algorithm as is
   * used by the getPermissions method.
   *
   * @param user the principal, assumed to be a valid authenticated Principal.
   * @param perm the permission to be checked for.
   * @return true if the principal has the specified permission,
   *         false otherwise.
   * @see java.security.Principal
   * @see java.security.Permission
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns an enumeration of the entries in this ACL. Each element in the
   * enumeration is of type AclEntry.
   *
   * @return an enumeration of the entries in this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns an enumeration for the set of allowed permissions for
   * the specified principal
   * (representing an entity such as an individual or a group).
   * This set of allowed permissions is calculated as follows:
   * <UL>
   * <LI>If there is no entry in this Access Control List for the specified
   * principal, an empty permission set is returned.</LI>
   * <LI>Otherwise, the principal's group permission sets are determined.
   * (A principal can belong to one or more groups, where a group is a group
   * of principals, represented by the Group interface.)</LI>
   * </UL>
   * @param user the principal whose permission set is to be returned.
   * @return the permission set specifying the permissions the principal
   *     is allowed.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public void removeAll(Principal caller)

  /**
   * Removes all ACL entries from this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @exception NotOwnerException if the caller principal is not an owner of
   *        this Acl.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Removes an ACL entry from this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param entry the ACL entry to be removed from this ACL.
   * @return true on success, false if the entry is not part of this ACL.
   * @exception NotOwnerException if the caller principal is not an owner
   *   of this Acl.
   * @see java.security.Principal
   * @see java.security.acl.AclEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Adds an ACL entry to this ACL. An entry associates a principal (e.g., an individual or a group)
   * with a set of permissions. Each principal can have at most one positive ACL entry
   * (specifying permissions to be granted to the principal) and one negative ACL entry
   * (specifying permissions to be denied). If there is already an ACL entry
   * of the same type (negative or positive) already in the ACL, false is returned.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param entry the ACL entry to be added to this ACL.
   * @return true on success, false if an entry of the same type (positive
   *       or negative) for the same principal is already present in this ACL.
   * @exception NotOwnerException if the caller principal is not an owner of
   *       this ACL.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Returns the name of this ACL.
   *
   * @return the name of this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  @Override

  /**
   * Sets the name of this ACL.
   *
   * @param caller the principal invoking this method. It must be an owner
   *        of this ACL.
   * @param name the name to be given to this ACL.
   *
   * @exception NotOwnerException if the caller principal is not an owner
   *            of this ACL.
   * @see java.security.Principal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
  public AclImpl (PrincipalImpl owner, String name) {

  /**
   * Constructs the ACL with a specified owner
   *
   * @param owner owner of the ACL.
   * @param name  name of this ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/AclImpl.java
class AclImpl extends OwnerImpl implements Acl, Serializable {

/**
 * Represent an Access Control List (ACL) which is used to guard access to http adaptor.
 * <P>
 * It is a data structure with multiple ACL entries. Each ACL entry, of interface type
 * AclEntry, contains a set of permissions and a set of communities associated with a
 * particular principal. (A principal represents an entity such as a host or a group of host).
 * Additionally, each ACL entry is specified as being either positive or negative.
 * If positive, the permissions are to be granted to the associated principal.
 * If negative, the permissions are to be denied.
 *
 * @see java.security.acl.Acl
 */
