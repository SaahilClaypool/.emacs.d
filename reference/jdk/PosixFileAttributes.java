_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFileAttributes.java
    Set<PosixFilePermission> permissions();

    /**
     * Returns the permissions of the file. The file permissions are returned
     * as a set of {@link PosixFilePermission} elements. The returned set is a
     * copy of the file permissions and is modifiable. This allows the result
     * to be modified and passed to the {@link PosixFileAttributeView#setPermissions
     * setPermissions} method to update the file's permissions.
     *
     * @return  the file permissions
     *
     * @see PosixFileAttributeView#setPermissions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFileAttributes.java
    GroupPrincipal group();

    /**
     * Returns the group owner of the file.
     *
     * @return  the file group owner
     *
     * @see PosixFileAttributeView#setGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFileAttributes.java
    UserPrincipal owner();

    /**
     * Returns the owner of the file.
     *
     * @return  the file owner
     *
     * @see PosixFileAttributeView#setOwner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFileAttributes.java
public interface PosixFileAttributes

/**
 * File attributes associated with files on file systems used by operating systems
 * that implement the Portable Operating System Interface (POSIX) family of
 * standards.
 *
 * <p> The POSIX attributes of a file are retrieved using a {@link
 * PosixFileAttributeView} by invoking its {@link
 * PosixFileAttributeView#readAttributes readAttributes} method.
 *
 * @since 1.7
 */
