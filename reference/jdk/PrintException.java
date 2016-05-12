_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/PrintException.java
    public PrintException (String s, Exception e) {

    /**
     * Construct a print exception with the given detail message
     * and chained exception.
     * @param  s  Detail message, or null if no detail message.
     * @param  e  Chained exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/PrintException.java
    public PrintException (Exception e) {

    /**
     * Construct a print exception chaining the supplied exception.
     *
     * @param  e  Chained exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/PrintException.java
    public PrintException (String s) {

    /**
     * Construct a print exception with the given detail message.
     *
     * @param  s  Detail message, or null if no detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/PrintException.java
    public PrintException() {

    /**
     * Construct a print exception with no detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/PrintException.java
public class PrintException extends Exception {

/**
 * Class PrintException encapsulates a printing-related error condition that
 * occurred while using a Print Service instance. This base class
 * furnishes only a string description of the error. Subclasses furnish more
 * detailed information if applicable.
 *
 */
