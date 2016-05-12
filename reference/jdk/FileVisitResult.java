_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileVisitResult.java
    SKIP_SIBLINGS;

    /**
     * Continue without visiting the <em>siblings</em> of this file or directory.
     * If returned from the {@link FileVisitor#preVisitDirectory
     * preVisitDirectory} method then the entries in the directory are also
     * skipped and the {@link FileVisitor#postVisitDirectory postVisitDirectory}
     * method is not invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileVisitResult.java
    TERMINATE,

    /**
     * Terminate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileVisitResult.java
public enum FileVisitResult {

/**
 * The result type of a {@link FileVisitor FileVisitor}.
 *
 * @since 1.7
 *
 * @see Files#walkFileTree
 */
