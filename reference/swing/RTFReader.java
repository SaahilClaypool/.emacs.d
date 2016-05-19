_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class DocumentDestination

/** RTFReader.DocumentDestination is a concrete subclass of
 *  TextHandlingDestination which appends the text to the
 *  StyledDocument given by the <code>target</code> ivar of the
 *  containing RTFReader.
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    boolean inParagraph;

    /** <code>true</code> if the reader has not just finished
     *  a paragraph; false upon startup */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
abstract class TextHandlingDestination

/** RTFReader.TextHandlingDestination provides basic text handling
 *  functionality. Subclasses must implement: <dl>
 *  <dt>deliverText()<dd>to handle a run of text with the same
 *                       attributes
 *  <dt>finishParagraph()<dd>to end the current paragraph and
 *                           set the paragraph's attributes
 *  <dt>endSection()<dd>to end the current section
 *  </dl>
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected void resetSectionAttributes()

    /** Resets the filter's internal notion of the current section's
     *  attributes to their default values. Invoked to handle the
     *  \sectd keyword. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected void resetParagraphAttributes()

    /** Resets the filter's internal notion of the current paragraph's
     *  attributes to their default values. Invoked to handle the
     *  \pard keyword. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected void resetCharacterAttributes()

    /** Resets the filter's internal notion of the current character
     *  attributes to their default values. Invoked to handle the
     *  \plain keyword. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    public AttributeSet currentSectionAttributes()

    /**
     * Calculates the current section attributes
     * from the current parser state.
     *
     * @returns a newly created MutableAttributeSet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
        TabStop tabs[];

        /*** Tab stops ***/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    MutableAttributeSet currentParagraphAttributes()

    /**
     * Calculates the current paragraph attributes (with keys
     * as given in StyleConstants) from the current parser state.
     *
     * @returns a newly created MutableAttributeSet.
     * @see StyleConstants
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    MutableAttributeSet currentTextAttributes()

    /**
     * Calculates the current text (character) attributes in a form suitable
     * for SwingText from the current parser state.
     *
     * @returns a new MutableAttributeSet containing the text attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected MutableAttributeSet rootSectionAttributes()

    /** Returns a new MutableAttributeSet containing the
     *  default section attributes */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected MutableAttributeSet rootParagraphAttributes()

    /** Returns a new MutableAttributeSet containing the
     *  default paragraph attributes */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    protected MutableAttributeSet rootCharacterAttributes()

    /** Returns a new MutableAttributeSet containing the
     *  default character attributes */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    MutableAttributeSet sectionAttributes;

    /** This is the "sec" element of parserState, cached for
     *  more efficient use */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    MutableAttributeSet paragraphAttributes;

    /** This is the "pgf" element of parserState, cached for
     *  more efficient use */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    MutableAttributeSet characterAttributes;

    /** This is the "chr" element of parserState, cached for
     *  more efficient use */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
abstract class AttributeTrackingDestination implements Destination

/** RTFReader.TextHandlingDestination is an abstract RTF destination
 *  which simply tracks the attributes specified by the RTF control words
 *  in internal form and can produce acceptable AttributeSets for the
 *  current character, paragraph, and section attributes. It is up
 *  to the subclasses to determine what is done with the actual text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class InfoDestination

/** Handles the info group. Currently no info keywords are recognized
 *  so this is a subclass of DiscardingDestination. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
    class StyleDefiningDestination

    /** This subclass handles an individual style */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class StylesheetDestination

/** Handles the stylesheet keyword. Styles are read and sorted
 *  into the three style arrays in the RTFReader. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class ColortblDestination implements Destination

/** Reads the colortbl group. Upon end-of-group, the RTFReader's
 *  color table is set to an array containing the read colors. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class FonttblDestination implements Destination

/** Reads the fonttbl group, inserting fonts into the RTFReader's
 *  fontTable dictionary. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class DiscardingDestination implements Destination

/** This data-sink class is used to implement ignored destinations
 *  (e.g. {\*\blegga blah blah blah} )
 *  It accepts all keywords and text but does nothing with them. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
interface Destination {

/** An interface (could be an entirely abstract class) describing
 *  a destination. The RTF reader always has a current destination
 *  which is where text is sent.
 *
 *  @see RTFReader
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
static char[] readCharset(InputStream strm)

/** Parses a character set from an InputStream. The character set
 * must contain 256 decimal integers, separated by whitespace, with
 * no punctuation. B- and C- style comments are allowed.
 *
 * @returns the newly read character set
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public static Object

/** Looks up a named character set. A character set is a 256-entry
 *  array of characters, mapping unsigned byte values to their Unicode
 *  equivalents. The character set is loaded if necessary.
 *
 *  @returns the character set
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public static void

/** Adds a character set to the RTFReader's list
 *  of known character sets */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void setCharacterSet(String name)

/**
 * setCharacterSet sets the current translation table to correspond with
 * the named character set. The character set is loaded if necessary.
 *
 * @see AbstractFilter
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public boolean handleKeyword(String keyword, int parameter)

/**
 * Handles an RTF keyword and its integer parameter.
 * This is called by the superclass
 * (RTFParser) when a keyword is found in the input stream.
 *
 * @returns <code>true</code> if the keyword is recognized and handled;
 *          <code>false</code> otherwise
 * @see RTFParser#handleKeyword
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public boolean handleKeyword(String keyword)

/**
 * Handles a parameterless RTF keyword. This is called by the superclass
 * (RTFParser) when a keyword is found in the input stream.
 *
 * @returns <code>true</code> if the keyword is recognized and handled;
 *          <code>false</code> otherwise
 * @see RTFParser#handleKeyword
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void close()

/** Called by the user when there is no more input (<i>i.e.</i>,
 * at the end of the RTF file.)
 *
 * @see OutputStream#close
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void endgroup()

/** Called by the superclass when the current RTF group is closed.
 *  This restores the parserState saved by <code>begingroup()</code>
 *  as well as invoking the endgroup method of the current
 *  destination.
 * @see RTFParser#endgroup
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void begingroup()

/** Called by the superclass when a new RTF group is begun.
 *  This implementation saves the current <code>parserState</code>, and gives
 *  the current destination a chance to save its own state.
 * @see RTFParser#begingroup
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
Color defaultColor()

/** The default color for text which has no specified color. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void handleText(String text)

/**
 * Handles any pure text (containing no control characters) in the input
 * stream. Called by the superclass. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public void handleBinaryBlob(byte[] data)

/** Called when the RTFParser encounters a bin keyword in the
 *  RTF stream.
 *
 *  @see RTFParser
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
public RTFReader(StyledDocument destination)

/**
 * Creates a new RTFReader instance. Text will be sent to
 * the specified TextAcceptor.
 *
 * @param destination The TextAcceptor which is to receive the text.
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  static Dictionary<String, String> textKeywords = null;

  /** textKeywords maps RTF keywords to single-character strings,
   *  for those keywords which simply insert some text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  int skippingCharacters;

  /** The parameter of the most recently parsed \\ucN keyword,
   *  used for skipping alternative representations after a
   *  Unicode character. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  boolean ignoreGroupIfUnknownKeyword;

  /** <code>true</code> to indicate that if the next keyword is unknown,
   *  the containing group should be ignored. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  int rtfversion;

  /** This is the RTF version number, extracted from the \rtf keyword.
   *  The version information is currently not used. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Style[] sectionStyles;

  /** This array maps section style numbers to Style objects. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Style[] paragraphStyles;

  /** This array maps paragraph style numbers to Style objects. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Style[] characterStyles;

  /** This array maps character style numbers to Style objects. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Color[] colorTable;

  /** This array maps color indices to Color objects. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Dictionary<Integer, String> fontTable;

  /** This Dictionary maps Integer font numbers to String font names. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  MutableAttributeSet documentAttributes;

  /** This holds the current document attributes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Destination rtfDestination;

  /** This is the "dst" item from parserState. rtfDestination
   *  is the current rtf destination. It is cached in an instance
   *  variable for speed. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  Dictionary<Object, Object> parserState;   /* Current parser state */

  /** Miscellaneous information about the parser's state. This
   *  dictionary is saved and restored when an RTF group begins
   *  or ends. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
  StyledDocument target;

  /** The object to which the parsed text is sent. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/RTFReader.java
class RTFReader extends RTFParser

/**
 * Takes a sequence of RTF tokens and text and appends the text
 * described by the RTF to a <code>StyledDocument</code> (the <em>target</em>).
 * The RTF is lexed
 * from the character stream by the <code>RTFParser</code> which is this class's
 * superclass.
 *
 * This class is an indirect subclass of OutputStream. It must be closed
 * in order to guarantee that all of the text has been sent to
 * the text acceptor.
 *
 *   @see RTFParser
 *   @see java.io.OutputStream
 */
