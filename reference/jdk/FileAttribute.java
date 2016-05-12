_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileAttribute.java
    T value();

    /**
     * Returns the attribute value.
     *
     * @return The attribute value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileAttribute.java
public interface FileAttribute<T> {

/**
 * An object that encapsulates the value of a file attribute that can be set
 * atomically when creating a new file or directory by invoking the {@link
 * java.nio.file.Files#createFile createFile} or {@link
 * java.nio.file.Files#createDirectory createDirectory} methods.
 *
 * @param <T> The type of the file attribute value
 *
 * @since 1.7
 * @see PosixFilePermissions#asFileAttribute
 */
