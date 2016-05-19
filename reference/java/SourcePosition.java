_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/SourcePosition.java
    String toString();

    /** Convert the source position to the form "Filename:line". */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/SourcePosition.java
    int column();

    /** The column in the source file. The first column is
     *  numbered 1; 0 means no column information is available.
     *  Columns count characters in the input stream; a tab
     *  advances the column number to the next 8-column tab stop.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/SourcePosition.java
    int line();

    /** The line in the source file. The first line is numbered 1;
     *  0 means no line number information is available. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/SourcePosition.java
    File file();

    /** The source file. Returns null if no file information is
     *  available. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/SourcePosition.java
public interface SourcePosition {

/**
 * This interface describes a source position: filename, line number,
 * and column number.
 *
 * @since 1.4
 * @author Neal M Gafter
 */
