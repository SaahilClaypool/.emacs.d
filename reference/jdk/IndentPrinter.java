_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void unindent()

    /**
     * Decrement the indentation for the next line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void indent()

    /**
     * Increment the indentation for the next line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void flush()

    /**
     * Flush the output stream. Must be called when done printing
     * the document, otherwise some text might be buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void flushLine( boolean preserveSpace )

    /**
     * Flushes the line accumulated so far to the writer and get ready
     * to accumulate the next line. This method is called by {@link
     * #printText} and {@link #printSpace} when the accumulated line plus
     * accumulated text are two long to fit on a given line. At the end of
     * this method _line is empty and _spaces is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void breakLine()

    /**
     * Called to print a line consisting of the text accumulated so
     * far. This is equivalent to calling {@link #printSpace} but
     * forcing the line to print and starting a new line ({@link
     * #printSpace} will only start a new line if the current line
     * is long enough).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void printSpace()

    /**
     * Called to print a single space between text parts that may be
     * broken into separate lines. Must not be called to print a space
     * when preserving spaces. The text accumulated so far with {@link
     * #printText} will be added to the accumulated line, and a space
     * separator will be counted. If the line accumulated so far is
     * long enough, it will be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void printText( String text )

    /**
     * Called to print additional text. Each time this method is called
     * it accumulates more text. When a space is printed ({@link
     * #printSpace}) all the accumulated text becomes one part and is
     * added to the accumulate line. When a line is long enough, it can
     * be broken at its text boundary.
     *
     * @param text The text to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public String leaveDTD()

    /**
     * Called by the root element to leave DTD mode and if any
     * DTD parts were printer, will return a string with their
     * textual content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void enterDTD()

    /**
     * Called by any of the DTD handlers to enter DTD mode.
     * Once entered, all output will be accumulated in a string
     * that can be printed as part of the document's DTD.
     * This method may be called any number of time but will only
     * have affect the first time it's called. To exist DTD state
     * and get the accumulated DTD, call {@link #leaveDTD}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _nextIndent;

    /**
     * Holds the indentation for the next line to be printed. After this line is
     * printed, {@link #_nextIndent} is assigned to {@link #_thisIndent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _thisIndent;

    /**
     * Holds the indentation for the current line that is now accumulating in
     * memory and will be sent for printing shortly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _spaces;

    /**
     * Counts how many white spaces come between the accumulated line and the
     * current accumulated text. Multiple spaces at the end of the a line
     * will not be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private StringBuffer    _text;

    /**
     * Holds the currently accumulating text that follows {@link #_line}.
     * When the end of the part is identified by a call to {@link #printSpace}
     * or {@link #breakLine}, this part is added to the accumulated line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private StringBuffer    _line;

    /**
     * Holds the currently accumulating text line. This buffer will constantly
     * be reused by deleting its contents instead of reallocating it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
public class IndentPrinter

/**
 * Extends {@link Printer} and adds support for indentation and line
 * wrapping.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void unindent()

    /**
     * Decrement the indentation for the next line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void indent()

    /**
     * Increment the indentation for the next line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void flush()

    /**
     * Flush the output stream. Must be called when done printing
     * the document, otherwise some text might be buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void flushLine( boolean preserveSpace )

    /**
     * Flushes the line accumulated so far to the writer and get ready
     * to accumulate the next line. This method is called by {@link
     * #printText} and {@link #printSpace} when the accumulated line plus
     * accumulated text are two long to fit on a given line. At the end of
     * this method _line is empty and _spaces is zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void breakLine()

    /**
     * Called to print a line consisting of the text accumulated so
     * far. This is equivalent to calling {@link #printSpace} but
     * forcing the line to print and starting a new line ({@link
     * #printSpace} will only start a new line if the current line
     * is long enough).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void printSpace()

    /**
     * Called to print a single space between text parts that may be
     * broken into separate lines. Must not be called to print a space
     * when preserving spaces. The text accumulated so far with {@link
     * #printText} will be added to the accumulated line, and a space
     * separator will be counted. If the line accumulated so far is
     * long enough, it will be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void printText( String text )

    /**
     * Called to print additional text. Each time this method is called
     * it accumulates more text. When a space is printed ({@link
     * #printSpace}) all the accumulated text becomes one part and is
     * added to the accumulate line. When a line is long enough, it can
     * be broken at its text boundary.
     *
     * @param text The text to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public String leaveDTD()

    /**
     * Called by the root element to leave DTD mode and if any
     * DTD parts were printer, will return a string with their
     * textual content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    public void enterDTD()

    /**
     * Called by any of the DTD handlers to enter DTD mode.
     * Once entered, all output will be accumulated in a string
     * that can be printed as part of the document's DTD.
     * This method may be called any number of time but will only
     * have affect the first time it's called. To exist DTD state
     * and get the accumulated DTD, call {@link #leaveDTD}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _nextIndent;

    /**
     * Holds the indentation for the next line to be printed. After this line is
     * printed, {@link #_nextIndent} is assigned to {@link #_thisIndent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _thisIndent;

    /**
     * Holds the indentation for the current line that is now accumulating in
     * memory and will be sent for printing shortly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private int             _spaces;

    /**
     * Counts how many white spaces come between the accumulated line and the
     * current accumulated text. Multiple spaces at the end of the a line
     * will not be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private StringBuffer    _text;

    /**
     * Holds the currently accumulating text that follows {@link #_line}.
     * When the end of the part is identified by a call to {@link #printSpace}
     * or {@link #breakLine}, this part is added to the accumulated line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
    private StringBuffer    _line;

    /**
     * Holds the currently accumulating text line. This buffer will constantly
     * be reused by deleting its contents instead of reallocating it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/IndentPrinter.java
public class IndentPrinter

/**
 * Extends {@link Printer} and adds support for indentation and line
 * wrapping.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
