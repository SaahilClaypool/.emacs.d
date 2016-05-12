_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/CopyMoveHelper.java
    static void moveToForeignTarget(Path source, Path target,
                                    CopyOption... options) throws IOException

    /**
     * Simple move implements as copy+delete for use when source and target are
     * associated with different providers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/CopyMoveHelper.java
    static void copyToForeignTarget(Path source, Path target,
                                    CopyOption... options)

    /**
     * Simple copy for use when source and target are associated with different
     * providers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/CopyMoveHelper.java
    private static CopyOption[] convertMoveToCopyOptions(CopyOption... options)

    /**
     * Converts the given array of options for moving a file to options suitable
     * for copying the file when a move is implemented as copy + delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/CopyMoveHelper.java
    private static class CopyOptions {

    /**
     * Parses the arguments for a file copy operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/CopyMoveHelper.java
class CopyMoveHelper {

/**
 * Helper class to support copying or moving files when the source and target
 * are associated with different providers.
 */
