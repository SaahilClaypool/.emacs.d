_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/RTFGenerator.java
    /* Not very efficient. TODO. */

/** Takes a char and a conversion table (an int[] in the current
 * implementation, but conversion tables should be treated as an opaque
 * type) and returns the
 * corresponding byte value (as an int, since bytes are signed).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/RTFGenerator.java
    /* Not very efficient at all. Could be changed to sort the table

/** Takes a translation table (a 256-element array of characters)
 * and creates an output conversion table for use by
 * convertCharacter(). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/RTFGenerator.java
    static public final Color defaultRTFColor = Color.black;

    /** The default color, used for text without an explicit color
     *  attribute. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/RTFGenerator.java
class RTFGenerator extends Object

/**
 * Generates an RTF output stream (java.io.OutputStream) from rich text
 * (handed off through a series of LTTextAcceptor calls).  Can be used to
 * generate RTF from any object which knows how to write to a text acceptor
 * (e.g., LTAttributedText and LTRTFFilter).
 *
 * <p>Note that this is a lossy conversion since RTF's model of
 * text does not exactly correspond with LightText's.
 *
 * @see LTAttributedText
 * @see LTRTFFilter
 * @see LTTextAcceptor
 * @see java.io.OutputStream
 */
