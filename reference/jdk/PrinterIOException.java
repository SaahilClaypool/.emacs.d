_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public Throwable getCause() {

    /**
     * Returns the the cause of this exception (the <code>IOException</code>
     * that terminated the print job).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public IOException getIOException() {

    /**
     * Returns the <code>IOException</code> that terminated
     * the print job.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the <code>IOException</code> that terminated
     * the print job.
     * @see IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public PrinterIOException(IOException exception) {

    /**
     * Constructs a new <code>PrinterIOException</code>
     * with the string representation of the specified
     * {@link IOException}.
     * @param exception the specified <code>IOException</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    private IOException mException;

    /**
     * The IO error that terminated the print job.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
public class PrinterIOException extends PrinterException {

/**
 * The <code>PrinterIOException</code> class is a subclass of
 * {@link PrinterException} and is used to indicate that an IO error
 * of some sort has occurred while printing.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The
 * "<code>IOException</code> that terminated the print job"
 * that is provided at construction time and accessed via the
 * {@link #getIOException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public Throwable getCause() {

    /**
     * Returns the the cause of this exception (the <code>IOException</code>
     * that terminated the print job).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public IOException getIOException() {

    /**
     * Returns the <code>IOException</code> that terminated
     * the print job.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the <code>IOException</code> that terminated
     * the print job.
     * @see IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    public PrinterIOException(IOException exception) {

    /**
     * Constructs a new <code>PrinterIOException</code>
     * with the string representation of the specified
     * {@link IOException}.
     * @param exception the specified <code>IOException</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
    private IOException mException;

    /**
     * The IO error that terminated the print job.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/PrinterIOException.java
public class PrinterIOException extends PrinterException {

/**
 * The <code>PrinterIOException</code> class is a subclass of
 * {@link PrinterException} and is used to indicate that an IO error
 * of some sort has occurred while printing.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The
 * "<code>IOException</code> that terminated the print job"
 * that is provided at construction time and accessed via the
 * {@link #getIOException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 */
