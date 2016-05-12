_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean isOwner(Principal owner){

  /**
   * Returns true if the given principal is an owner of the ACL.
   *
   * @param owner the principal to be checked to determine whether or
   *        not it is an owner.
   * @return true if the given principal is an owner of the ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean deleteOwner(Principal caller, Principal owner)

  /**
   * Deletes an owner. If this is the last owner in the ACL, an exception is raised.
   *<P>
   * The caller principal must be an owner of the ACL in order to invoke this method.
   *
   * @param caller the principal invoking this method. It must be an owner
   *   of the ACL.
   * @param owner the owner to be removed from the list of owners.
   * @return true if successful, false if owner is already an owner.
   * @exception NotOwnerException if the caller principal is not an owner
   *   of the ACL.
   * @exception LastOwnerException if there is only one owner left, so that
   *   deleteOwner would leave the ACL owner-less.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean addOwner(Principal caller, Principal owner)

  /**
   * Adds an owner. Only owners can modify ACL contents. The caller principal
   * must be an owner of the ACL in order to invoke this method. That is, only
   * an owner can add another owner. The initial owner is configured at
   * ACL construction time.
   *
   * @param caller the principal invoking this method.
   *        It must be an owner of the ACL.
   * @param owner the owner that should be added to the list of owners.
   * @return true if successful, false if owner is already an owner.
   * @exception NotOwnerException if the caller principal is not an owner
   *    of the ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public OwnerImpl (PrincipalImpl owner){

  /**
   * Constructs a list of owner with the specified principal as first element.
   *
   * @param owner the principal added to the owner list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public OwnerImpl (){

  /**
   * Constructs an empty list of owner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
class OwnerImpl implements Owner, Serializable {

/**
 * Owner of Access Control Lists (ACLs).
 * The initial owner Principal should be specified as an
 * argument to the constructor of the class AclImpl.
 *
 * @see java.security.acl.Owner
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean isOwner(Principal owner){

  /**
   * Returns true if the given principal is an owner of the ACL.
   *
   * @param owner the principal to be checked to determine whether or
   *        not it is an owner.
   * @return true if the given principal is an owner of the ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean deleteOwner(Principal caller, Principal owner)

  /**
   * Deletes an owner. If this is the last owner in the ACL, an exception is raised.
   *<P>
   * The caller principal must be an owner of the ACL in order to invoke this method.
   *
   * @param caller the principal invoking this method. It must be an owner
   *   of the ACL.
   * @param owner the owner to be removed from the list of owners.
   * @return true if successful, false if owner is already an owner.
   * @exception NotOwnerException if the caller principal is not an owner
   *   of the ACL.
   * @exception LastOwnerException if there is only one owner left, so that
   *   deleteOwner would leave the ACL owner-less.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public boolean addOwner(Principal caller, Principal owner)

  /**
   * Adds an owner. Only owners can modify ACL contents. The caller principal
   * must be an owner of the ACL in order to invoke this method. That is, only
   * an owner can add another owner. The initial owner is configured at
   * ACL construction time.
   *
   * @param caller the principal invoking this method.
   *        It must be an owner of the ACL.
   * @param owner the owner that should be added to the list of owners.
   * @return true if successful, false if owner is already an owner.
   * @exception NotOwnerException if the caller principal is not an owner
   *    of the ACL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public OwnerImpl (PrincipalImpl owner){

  /**
   * Constructs a list of owner with the specified principal as first element.
   *
   * @param owner the principal added to the owner list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
  public OwnerImpl (){

  /**
   * Constructs an empty list of owner.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/OwnerImpl.java
class OwnerImpl implements Owner, Serializable {

/**
 * Owner of Access Control Lists (ACLs).
 * The initial owner Principal should be specified as an
 * argument to the constructor of the class AclImpl.
 *
 * @see java.security.acl.Owner
 */
