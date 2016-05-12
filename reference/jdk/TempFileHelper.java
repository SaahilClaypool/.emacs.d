_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/TempFileHelper.java
    static Path createTempDirectory(Path dir,
                                    String prefix,
                                    FileAttribute<?>[] attrs)

    /**
     * Creates a temporary directory in the given directory, or in in the
     * temporary directory if dir is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/TempFileHelper.java
    static Path createTempFile(Path dir,
                               String prefix,
                               String suffix,
                               FileAttribute<?>[] attrs)

    /**
     * Creates a temporary file in the given directory, or in in the
     * temporary directory if dir is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/TempFileHelper.java
    private static Path create(Path dir,
                               String prefix,
                               String suffix,
                               boolean createDirectory,
                               FileAttribute<?>[] attrs)

    /**
     * Creates a file or directory in in the given given directory (or in the
     * temporary directory if dir is {@code null}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/TempFileHelper.java
class TempFileHelper {

/**
 * Helper class to support creation of temporary files and directories with
 * initial attributes.
 */
