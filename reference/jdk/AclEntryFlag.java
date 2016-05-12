_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryFlag.java
    INHERIT_ONLY;

    /**
     * Can be placed on a directory but does not apply to the directory,
     * only to newly created files/directories as specified by the
     * {@link #FILE_INHERIT} and {@link #DIRECTORY_INHERIT} flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryFlag.java
    NO_PROPAGATE_INHERIT,

    /**
     * Can be placed on a directory to indicate that the ACL entry should not
     * be placed on the newly created directory which is inheritable by
     * subdirectories of the created directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryFlag.java
    DIRECTORY_INHERIT,

    /**
     * Can be placed on a directory and indicates that the ACL entry should be
     * added to each new directory created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryFlag.java
    FILE_INHERIT,

    /**
     * Can be placed on a directory and indicates that the ACL entry should be
     * added to each new non-directory file created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/AclEntryFlag.java
public enum AclEntryFlag {

/**
 * Defines the flags for used by the flags component of an ACL {@link AclEntry
 * entry}.
 *
 * <p> In this release, this class does not define flags related to {@link
 * AclEntryType#AUDIT} and {@link AclEntryType#ALARM} entry types.
 *
 * @since 1.7
 */
