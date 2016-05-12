_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFilePermissions.java
    public static FileAttribute<Set<PosixFilePermission>>

    /**
     * Creates a {@link FileAttribute}, encapsulating a copy of the given file
     * permissions, suitable for passing to the {@link java.nio.file.Files#createFile
     * createFile} or {@link java.nio.file.Files#createDirectory createDirectory}
     * methods.
     *
     * @param   perms
     *          the set of permissions
     *
     * @return  an attribute encapsulating the given file permissions with
     *          {@link FileAttribute#name name} {@code "posix:permissions"}
     *
     * @throws  ClassCastException
     *          if the set contains elements that are not of type {@code
     *          PosixFilePermission}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFilePermissions.java
    public static Set<PosixFilePermission> fromString(String perms) {

    /**
     * Returns the set of permissions corresponding to a given {@code String}
     * representation.
     *
     * <p> The {@code perms} parameter is a {@code String} representing the
     * permissions. It has 9 characters that are interpreted as three sets of
     * three. The first set refers to the owner's permissions; the next to the
     * group permissions and the last to others. Within each set, the first
     * character is {@code 'r'} to indicate permission to read, the second
     * character is {@code 'w'} to indicate permission to write, and the third
     * character is {@code 'x'} for execute permission. Where a permission is
     * not set then the corresponding character is set to {@code '-'}.
     *
     * <p> <b>Usage Example:</b>
     * Suppose we require the set of permissions that indicate the owner has read,
     * write, and execute permissions, the group has read and execute permissions
     * and others have none.
     * <pre>
     *   Set&lt;PosixFilePermission&gt; perms = PosixFilePermissions.fromString("rwxr-x---");
     * </pre>
     *
     * @param   perms
     *          string representing a set of permissions
     *
     * @return  the resulting set of permissions
     *
     * @throws  IllegalArgumentException
     *          if the string cannot be converted to a set of permissions
     *
     * @see #toString(Set)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFilePermissions.java
    public static String toString(Set<PosixFilePermission> perms) {

    /**
     * Returns the {@code String} representation of a set of permissions. It
     * is guaranteed that the returned {@code String} can be parsed by the
     * {@link #fromString} method.
     *
     * <p> If the set contains {@code null} or elements that are not of type
     * {@code PosixFilePermission} then these elements are ignored.
     *
     * @param   perms
     *          the set of permissions
     *
     * @return  the string representation of the permission set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/PosixFilePermissions.java
public final class PosixFilePermissions {

/**
 * This class consists exclusively of static methods that operate on sets of
 * {@link PosixFilePermission} objects.
 *
 * @since 1.7
 */
