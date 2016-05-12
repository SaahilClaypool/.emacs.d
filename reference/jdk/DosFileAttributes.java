_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/DosFileAttributes.java
    boolean isSystem();

    /**
     * Returns the value of the system attribute.
     *
     * <p> This attribute is often used to indicate that the file is a component
     * of the operating system.
     *
     * @return  the value of the system attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/DosFileAttributes.java
    boolean isArchive();

    /**
     * Returns the value of the archive attribute.
     *
     * <p> This attribute is typically used by backup programs.
     *
     * @return  the value of the archive attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/DosFileAttributes.java
    boolean isHidden();

    /**
     * Returns the value of the hidden attribute.
     *
     * <p> This attribute is often used to indicate if the file is visible to
     * users.
     *
     * @return  the value of the hidden attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/DosFileAttributes.java
    boolean isReadOnly();

    /**
     * Returns the value of the read-only attribute.
     *
     * <p> This attribute is often used as a simple access control mechanism
     * to prevent files from being deleted or updated. Whether the file system
     * or platform does any enforcement to prevent <em>read-only</em> files
     * from being updated is implementation specific.
     *
     * @return  the value of the read-only attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/DosFileAttributes.java
public interface DosFileAttributes

/**
 * File attributes associated with a file in a file system that supports
 * legacy "DOS" attributes.
 *
 * <p> <b>Usage Example:</b>
 * <pre>
 *    Path file = ...
 *    DosFileAttributes attrs = Files.readAttributes(file, DosFileAttributes.class);
 * </pre>
 *
 * @since 1.7
 */
