_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    DSYNC;

    /**
     * Requires that every update to the file's content be written
     * synchronously to the underlying storage device.
     *
     * @see <a href="package-summary.html#integrity">Synchronized I/O file integrity</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    SYNC,

    /**
     * Requires that every update to the file's content or metadata be written
     * synchronously to the underlying storage device.
     *
     * @see <a href="package-summary.html#integrity">Synchronized I/O file integrity</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    SPARSE,

    /**
     * Sparse file. When used with the {@link #CREATE_NEW} option then this
     * option provides a <em>hint</em> that the new file will be sparse. The
     * option is ignored when the file system does not support the creation of
     * sparse files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    DELETE_ON_CLOSE,

    /**
     * Delete on close. When this option is present then the implementation
     * makes a <em>best effort</em> attempt to delete the file when closed
     * by the appropriate {@code close} method. If the {@code close} method is
     * not invoked then a <em>best effort</em> attempt is made to delete the
     * file when the Java virtual machine terminates (either normally, as
     * defined by the Java Language Specification, or where possible, abnormally).
     * This option is primarily intended for use with <em>work files</em> that
     * are used solely by a single instance of the Java virtual machine. This
     * option is not recommended for use when opening files that are open
     * concurrently by other entities. Many of the details as to when and how
     * the file is deleted are implementation specific and therefore not
     * specified. In particular, an implementation may be unable to guarantee
     * that it deletes the expected file when replaced by an attacker while the
     * file is open. Consequently, security sensitive applications should take
     * care when using this option.
     *
     * <p> For security reasons, this option may imply the {@link
     * LinkOption#NOFOLLOW_LINKS} option. In other words, if the option is present
     * when opening an existing file that is a symbolic link then it may fail
     * (by throwing {@link java.io.IOException}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    CREATE_NEW,

    /**
     * Create a new file, failing if the file already exists.
     * The check for the existence of the file and the creation of the file
     * if it does not exist is atomic with respect to other file system
     * operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    CREATE,

    /**
     * Create a new file if it does not exist.
     * This option is ignored if the {@link #CREATE_NEW} option is also set.
     * The check for the existence of the file and the creation of the file
     * if it does not exist is atomic with respect to other file system
     * operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    TRUNCATE_EXISTING,

    /**
     * If the file already exists and it is opened for {@link #WRITE}
     * access, then its length is truncated to 0. This option is ignored
     * if the file is opened only for {@link #READ} access.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    APPEND,

    /**
     * If the file is opened for {@link #WRITE} access then bytes will be written
     * to the end of the file rather than the beginning.
     *
     * <p> If the file is opened for write access by other programs, then it
     * is file system specific if writing to the end of the file is atomic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
    WRITE,

    /**
     * Open for write access.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/StandardOpenOption.java
public enum StandardOpenOption implements OpenOption {

/**
 * Defines the standard open options.
 *
 * @since 1.7
 */
