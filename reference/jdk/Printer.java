_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    public void flush()

    /**
     * Flush the output stream. Must be called when done printing
     * the document, otherwise some text might be buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    public String leaveDTD()

    /**
     * Called by the root element to leave DTD mode and if any
     * DTD parts were printer, will return a string with their
     * textual content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private int           _pos = 0;

    /**
     * Position within the output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private final char[]  _buffer = new char[ BufferSize ];

    /**
     * Output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private static final int BufferSize = 4096;

    /**
     * The size of the output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected IOException     _exception;

    /**
     * Holds the exception thrown by the serializer.  Exceptions do not cause
     * the serializer to quit, but are held and one is thrown at the end.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected Writer          _docWriter;

    /**
     * Holds a reference to the document writer while we are
     * in DTD mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected StringWriter       _dtdWriter;

    /**
     * The DTD writer. When we switch to DTD mode, all output is
     * accumulated in this DTD writer. When we switch out of it,
     * the output is obtained as a string. Must not be reset to
     * null until we're done with the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected Writer             _writer;

    /**
     * The writer to which the document is written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected final OutputFormat _format;

    /**
     * The output format associated with this serializer. This will never
     * be a null reference. If no format was passed to the constructor,
     * the default one for this document type will be used. The format
     * object is never changed by the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
public class Printer

/**
 * The printer is responsible for sending text to the output stream
 * or writer. This class performs direct writing for efficiency.
 * {@link IndentPrinter} supports indentation and line wrapping by
 * extending this class.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    public void flush()

    /**
     * Flush the output stream. Must be called when done printing
     * the document, otherwise some text might be buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    public String leaveDTD()

    /**
     * Called by the root element to leave DTD mode and if any
     * DTD parts were printer, will return a string with their
     * textual content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private int           _pos = 0;

    /**
     * Position within the output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private final char[]  _buffer = new char[ BufferSize ];

    /**
     * Output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    private static final int BufferSize = 4096;

    /**
     * The size of the output buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected IOException     _exception;

    /**
     * Holds the exception thrown by the serializer.  Exceptions do not cause
     * the serializer to quit, but are held and one is thrown at the end.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected Writer          _docWriter;

    /**
     * Holds a reference to the document writer while we are
     * in DTD mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected StringWriter       _dtdWriter;

    /**
     * The DTD writer. When we switch to DTD mode, all output is
     * accumulated in this DTD writer. When we switch out of it,
     * the output is obtained as a string. Must not be reset to
     * null until we're done with the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected Writer             _writer;

    /**
     * The writer to which the document is written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
    protected final OutputFormat _format;

    /**
     * The output format associated with this serializer. This will never
     * be a null reference. If no format was passed to the constructor,
     * the default one for this document type will be used. The format
     * object is never changed by the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Printer.java
public class Printer

/**
 * The printer is responsible for sending text to the output stream
 * or writer. This class performs direct writing for efficiency.
 * {@link IndentPrinter} supports indentation and line wrapping by
 * extending this class.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
