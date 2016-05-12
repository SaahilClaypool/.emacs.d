_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/FilerException.java
    public FilerException(String s) {

    /**
     * Constructs an exception with the specified detail message.
     * @param s the detail message, which should include the name of
     * the file attempting to be opened; may be {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/FilerException.java
public class FilerException extends IOException {

/**
 * Indicates a {@link Filer} detected an attempt to open a file that
 * would violate the guarantees provided by the {@code Filer}.  Those
 * guarantees include not creating the same file more than once, not
 * creating multiple files corresponding to the same type, and not
 * creating files for types with invalid names.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
