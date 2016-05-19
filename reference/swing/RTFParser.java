_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public void close()

  /** Closes the parser. Currently, this simply does a <code>flush()</code>,
   *  followed by some minimal consistency checks. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public void flush()

  /** Flushes any buffered but not yet written characters.
   *  Subclasses which override this method should call this
   *  method <em>before</em> flushing
   *  any of their own buffers. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract void endgroup();

  /** Implemented by subclasses to react to the end of a group. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract void begingroup();

  /** Implemented by subclasses to react to an increase
   *  in the nesting level. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract void handleBinaryBlob(byte[] data);

  /** Implemented by subclasses to handle the contents of the \bin keyword. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract void handleText(String text);

  /** Implemented by subclasses to interpret text from the RTF stream. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract boolean handleKeyword(String keyword, int parameter);

  /** Implemented by subclasses to interpret a keyword with a parameter.
   *  @param keyword   The keyword, as with <code>handleKeyword(String)</code>.
   *  @param parameter The parameter following the keyword. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public abstract boolean handleKeyword(String keyword);

  /** Implemented by subclasses to interpret a parameter-less RTF keyword.
   *  The keyword is passed without the leading '/' or any delimiting
   *  whitespace. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  protected PrintStream warnings;

  /** A stream to which to write warnings and debugging information
   *  while parsing. This is set to <code>System.out</code> to log
   *  any anomalous information to stdout. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
  public int level;

  /** The current RTF group nesting level. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFParser.java
abstract class RTFParser extends AbstractFilter

/**
 * <b>RTFParser</b> is a subclass of <b>AbstractFilter</b> which understands basic RTF syntax
 * and passes a stream of control words, text, and begin/end group
 * indications to its subclass.
 *
 * Normally programmers will only use <b>RTFFilter</b>, a subclass of this class that knows what to
 * do with the tokens this class parses.
 *
 * @see AbstractFilter
 * @see RTFFilter
 */
