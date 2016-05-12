_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    String getMessage(Locale locale);

    /**
     * Gets a localized message for the given locale.  The actual
     * message is implementation-dependent.  If the locale is {@code
     * null} use the default locale.
     *
     * @param locale a locale; might be {@code null}
     * @return a localized message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    String getCode();

    /**
     * Gets a diagnostic code indicating the type of diagnostic.  The
     * code is implementation-dependent and might be {@code null}.
     *
     * @return a diagnostic code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    long getColumnNumber();

    /**
     * Gets the column number of the character offset returned by
     * {@linkplain #getPosition()}.
     *
     * @return a column number or {@link #NOPOS} if and only if {@link
     * #getPosition()} returns {@link #NOPOS}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    long getLineNumber();

    /**
     * Gets the line number of the character offset returned by
     * {@linkplain #getPosition()}.
     *
     * @return a line number or {@link #NOPOS} if and only if {@link
     * #getPosition()} returns {@link #NOPOS}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    long getEndPosition();

    /**
     * Gets the character offset from the beginning of the file
     * associated with this diagnostic that indicates the end of the
     * problem.
     *
     * @return offset from beginning of file; {@link #NOPOS} if and
     * only if {@link #getPosition()} returns {@link #NOPOS}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    long getStartPosition();

    /**
     * Gets the character offset from the beginning of the file
     * associated with this diagnostic that indicates the start of the
     * problem.
     *
     * @return offset from beginning of file; {@link #NOPOS} if and
     * only if {@link #getPosition()} returns {@link #NOPOS}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    long getPosition();

    /**
     * Gets a character offset from the beginning of the source object
     * associated with this diagnostic that indicates the location of
     * the problem.  In addition, the following must be true:
     *
     * <p>{@code getStartPostion() <= getPosition()}
     * <p>{@code getPosition() <= getEndPosition()}
     *
     * @return character offset from beginning of source; {@link
     * #NOPOS} if {@link #getSource()} would return {@code null} or if
     * no location is suitable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    S getSource();

    /**
     * Gets the source object associated with this diagnostic.
     *
     * @return the source object associated with this diagnostic.
     * {@code null} if no source object is associated with the
     * diagnostic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    Kind getKind();

    /**
     * Gets the kind of this diagnostic, for example, error or
     * warning.
     * @return the kind of this diagnostic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    public final static long NOPOS = -1;

    /**
     * Used to signal that no position is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
        NOTE,

        /**
         * Informative message from the tool.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
        WARNING,

        /**
         * Problem which does not usually prevent the tool from
         * completing normally.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
    enum Kind {

    /**
     * Kinds of diagnostics, for example, error or warning.
     *
     * The kind of a diagnostic can be used to determine how the
     * diagnostic should be presented to the user. For example,
     * errors might be colored red or prefixed with the word "Error",
     * while warnings might be colored yellow or prefixed with the
     * word "Warning". There is no requirement that the Kind
     * should imply any inherent semantic meaning to the message
     * of the diagnostic: for example, a tool might provide an
     * option to report all warnings as errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/tools/Diagnostic.java
public interface Diagnostic<S> {

/**
 * Interface for diagnostics from tools.  A diagnostic usually reports
 * a problem at a specific position in a source file.  However, not
 * all diagnostics are associated with a position or a file.
 *
 * <p>A position is a zero-based character offset from the beginning of
 * a file.  Negative values (except {@link #NOPOS}) are not valid
 * positions.
 *
 * <p>Line and column numbers begin at 1.  Negative values (except
 * {@link #NOPOS}) and 0 are not valid line or column numbers.
 *
 * @param <S> the type of source object used by this diagnostic
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
