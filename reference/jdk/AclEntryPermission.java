_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    public static final AclEntryPermission ADD_SUBDIRECTORY = APPEND_DATA;

    /**
     * Permission to create a subdirectory to a directory (equal to {@link #APPEND_DATA})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    public static final AclEntryPermission ADD_FILE = WRITE_DATA;

    /**
     * Permission to add a new file to a directory (equal to {@link #WRITE_DATA})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    public static final AclEntryPermission LIST_DIRECTORY = READ_DATA;

    /**
     * Permission to list the entries of a directory (equal to {@link #READ_DATA})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    SYNCHRONIZE;

    /**
     * Permission to access file locally at the server with synchronous reads
     * and writes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    WRITE_OWNER,

    /**
     * Permission to change the owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    WRITE_ACL,

    /**
     * Permission to write the ACL attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    READ_ACL,

    /**
     * Permission to read the ACL attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    DELETE,

    /**
     * Permission to delete the file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    WRITE_ATTRIBUTES,

    /**
     * The ability to write (non-acl) file attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    READ_ATTRIBUTES,

    /**
     * The ability to read (non-acl) file attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    DELETE_CHILD,

    /**
     * Permission to delete a file or directory within a directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    EXECUTE,

    /**
     * Permission to execute a file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    WRITE_NAMED_ATTRS,

    /**
     * Permission to write the named attributes of a file.
     *
     * <p> <a href="http://www.ietf.org/rfc/rfc3530.txt">RFC&nbsp;3530: Network
     * File System (NFS) version 4 Protocol</a> defines <em>named attributes</em>
     * as opaque files associated with a file in the file system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    READ_NAMED_ATTRS,

    /**
     * Permission to read the named attributes of a file.
     *
     * <p> <a href="http://www.ietf.org/rfc/rfc3530.txt">RFC&nbsp;3530: Network
     * File System (NFS) version 4 Protocol</a> defines <em>named attributes</em>
     * as opaque files associated with a file in the file system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    APPEND_DATA,

    /**
     * Permission to append data to a file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    WRITE_DATA,

    /**
     * Permission to modify the file's data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
    READ_DATA,

    /**
     * Permission to read the data of the file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryPermission.java
public enum AclEntryPermission {

/**
 * Defines the permissions for use with the permissions component of an ACL
 * {@link AclEntry entry}.
 *
 * @since 1.7
 */
