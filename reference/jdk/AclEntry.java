_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    @Override

    /**
     * Returns the string representation of this ACL entry.
     *
     * @return  the string representation of this entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    @Override

    /**
     * Returns the hash-code value for this ACL entry.
     *
     * <p> This method satisfies the general contract of the {@link
     * Object#hashCode} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    @Override

    /**
     * Compares the specified object with this ACL entry for equality.
     *
     * <p> If the given object is not an {@code AclEntry} then this method
     * immediately returns {@code false}.
     *
     * <p> For two ACL entries to be considered equals requires that they are
     * both the same type, their who components are equal, their permissions
     * components are equal, and their flags components are equal.
     *
     * <p> This method satisfies the general contract of the {@link
     * java.lang.Object#equals(Object) Object.equals} method. </p>
     *
     * @param   ob   the object to which this object is to be compared
     *
     * @return  {@code true} if, and only if, the given object is an AclEntry that
     *          is identical to this AclEntry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public Set<AclEntryFlag> flags() {

    /**
     * Returns a copy of the flags component.
     *
     * <p> The returned set is a modifiable copy of the flags.
     *
     * @return the flags component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public Set<AclEntryPermission> permissions() {

    /**
     * Returns a copy of the permissions component.
     *
     * <p> The returned set is a modifiable copy of the permissions.
     *
     * @return the permissions component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public UserPrincipal principal() {

    /**
     * Returns the principal component.
     *
     * @return the principal component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public AclEntryType type() {

    /**
     * Returns the ACL entry type.
     *
     * @return the ACL entry type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public static Builder newBuilder(AclEntry entry) {

    /**
     * Constructs a new builder with the components of an existing ACL entry.
     *
     * @param   entry  an ACL entry
     * @return  a new builder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public static Builder newBuilder() {

    /**
     * Constructs a new builder. The initial value of the type and who
     * components is {@code null}. The initial value of the permissions and
     * flags components is the empty set.
     *
     * @return  a new builder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setFlags(AclEntryFlag... flags) {

        /**
         * Sets the flags component of this builder. On return, the flags
         * component of this builder is a copy of the flags in the given
         * array.
         *
         * @param   flags  the flags component
         * @return  this builder
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setFlags(Set<AclEntryFlag> flags) {

        /**
         * Sets the flags component of this builder. On return, the flags
         * component of this builder is a copy of the given set.
         *
         * @param   flags  the flags component
         * @return  this builder
         *
         * @throws  ClassCastException
         *          if the set contains elements that are not of type {@code
         *          AclEntryFlag}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setPermissions(AclEntryPermission... perms) {

        /**
         * Sets the permissions component of this builder. On return, the
         * permissions component of this builder is a copy of the permissions in
         * the given array.
         *
         * @param   perms  the permissions component
         * @return  this builder
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setPermissions(Set<AclEntryPermission> perms) {

        /**
         * Sets the permissions component of this builder. On return, the
         * permissions component of this builder is a copy of the given set.
         *
         * @param   perms  the permissions component
         * @return  this builder
         *
         * @throws  ClassCastException
         *          if the set contains elements that are not of type {@code
         *          AclEntryPermission}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setPrincipal(UserPrincipal who) {

        /**
         * Sets the principal component of this builder.
         *
         * @param   who  the principal component
         * @return  this builder
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public Builder setType(AclEntryType type) {

        /**
         * Sets the type component of this builder.
         *
         * @param   type  the component type
         * @return  this builder
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
        public AclEntry build() {

        /**
         * Constructs an {@link AclEntry} from the components of this builder.
         * The type and who components are required to have been set in order
         * to construct an {@code AclEntry}.
         *
         * @return  a new ACL entry
         *
         * @throws  IllegalStateException
         *          if the type or who component have not been set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
    public static final class Builder {

    /**
     * A builder of {@link AclEntry} objects.
     *
     * <p> A {@code Builder} object is obtained by invoking one of the {@link
     * AclEntry#newBuilder newBuilder} methods defined by the {@code AclEntry}
     * class.
     *
     * <p> Builder objects are mutable and are not safe for use by multiple
     * concurrent threads without appropriate synchronization.
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntry.java
public final class AclEntry {

/**
 * An entry in an access control list (ACL).
 *
 * <p> The ACL entry represented by this class is based on the ACL model
 * specified in <a href="http://www.ietf.org/rfc/rfc3530.txt"><i>RFC&nbsp;3530:
 * Network File System (NFS) version 4 Protocol</i></a>. Each entry has four
 * components as follows:
 *
 * <ol>
 *    <li><p> The {@link #type() type} component determines if the entry
 *    grants or denies access. </p></li>
 *
 *    <li><p> The {@link #principal() principal} component, sometimes called the
 *    "who" component, is a {@link UserPrincipal} corresponding to the identity
 *    that the entry grants or denies access
 *    </p></li>
 *
 *    <li><p> The {@link #permissions permissions} component is a set of
 *    {@link AclEntryPermission permissions}
 *    </p></li>
 *
 *    <li><p> The {@link #flags flags} component is a set of {@link AclEntryFlag
 *    flags} to indicate how entries are inherited and propagated </p></li>
 * </ol>
 *
 * <p> ACL entries are created using an associated {@link Builder} object by
 * invoking its {@link Builder#build build} method.
 *
 * <p> ACL entries are immutable and are safe for use by multiple concurrent
 * threads.
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public Object clone();

    /**
     * Clones this ACL entry.
     *
     * @return a clone of this ACL entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public String toString();

    /**
     * Returns a string representation of the contents of this ACL entry.
     *
     * @return a string representation of the contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public Enumeration<Permission> permissions();

    /**
     * Returns an enumeration of the permissions in this ACL entry.
     *
     * @return an enumeration of the permissions in this ACL entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public boolean checkPermission(Permission permission);

    /**
     * Checks if the specified permission is part of the
     * permission set in this entry.
     *
     * @param permission the permission to be checked for.
     *
     * @return true if the permission is part of the
     * permission set in this entry, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public boolean removePermission(Permission permission);

    /**
     * Removes the specified permission from this ACL entry.
     *
     * @param permission the permission to be removed from this entry.
     *
     * @return true if the permission is removed, false if the
     * permission was not part of this entry's permission set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public boolean addPermission(Permission permission);

    /**
     * Adds the specified permission to this ACL entry. Note: An entry can
     * have multiple permissions.
     *
     * @param permission the permission to be associated with
     * the principal in this entry.
     *
     * @return true if the permission was added, false if the
     * permission was already part of this entry's permission set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public boolean isNegative();

    /**
     * Returns true if this is a negative ACL entry (one denying the
     * associated principal the set of permissions in the entry), false
     * otherwise.
     *
     * @return true if this is a negative ACL entry, false if it's not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public void setNegativePermissions();

    /**
     * Sets this ACL entry to be a negative one. That is, the associated
     * principal (e.g., a user or a group) will be denied the permission set
     * specified in the entry.
     *
     * Note: ACL entries are by default positive. An entry becomes a
     * negative entry only if this {@code setNegativePermissions}
     * method is called on it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public Principal getPrincipal();

    /**
     * Returns the principal for which permissions are granted or denied by
     * this ACL entry. Returns null if there is no principal set for this
     * entry yet.
     *
     * @return the principal associated with this entry.
     *
     * @see #setPrincipal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
    public boolean setPrincipal(Principal user);

    /**
     * Specifies the principal for which permissions are granted or denied
     * by this ACL entry. If a principal was already set for this ACL entry,
     * false is returned, otherwise true is returned.
     *
     * @param user the principal to be set for this entry.
     *
     * @return true if the principal is set, false if there was
     * already a principal set for this entry.
     *
     * @see #getPrincipal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/acl/AclEntry.java
public interface AclEntry extends Cloneable {

/**
 * This is the interface used for representing one entry in an Access
 * Control List (ACL).<p>
 *
 * An ACL can be thought of as a data structure with multiple ACL entry
 * objects. Each ACL entry object contains a set of permissions associated
 * with a particular principal. (A principal represents an entity such as
 * an individual user or a group). Additionally, each ACL entry is specified
 * as being either positive or negative. If positive, the permissions are
 * to be granted to the associated principal. If negative, the permissions
 * are to be denied. Each principal can have at most one positive ACL entry
 * and one negative entry; that is, multiple positive or negative ACL
 * entries are not allowed for any principal.
 *
 * Note: ACL entries are by default positive. An entry becomes a
 * negative entry only if the
 * {@link #setNegativePermissions() setNegativePermissions}
 * method is called on it.
 *
 * @see java.security.acl.Acl
 *
 * @author      Satish Dharmaraj
 */
