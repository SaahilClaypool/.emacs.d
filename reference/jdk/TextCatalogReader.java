_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int nextChar() throws IOException {

  /**
     * Return the next logical character from the input stream.
     *
     * @return The next (logical) character from the input stream. The
     * character may be buffered from a previous lookahead.
     *
     * @throws IOException If an error occurs reading from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected String nextToken() throws IOException, CatalogException {

    /**
     * Return the next token in the catalog file.
     *
     * <p>FYI: This code does not throw any sort of exception for
     * a file that contains an n
     *
     * @return The Catalog file token from the input stream.
     * @throws IOException If an error occurs reading from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected void finalize() {

  /**
     * The destructor.
     *
     * <p>Makes sure the catalog file is closed.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
    }

      catURL = new URL("file:///" + fileUrl);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Start parsing a text catalog file. The file is
   * actually read and parsed
   * as needed by <code>nextEntry</code>.</p>
   *
   * @param fileUrl  The URL or filename of the catalog file to process
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  public TextCatalogReader() { }

  /**
   * Construct a CatalogReader object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected boolean caseSensitive = false;

  /** Are keywords in the catalog case sensitive? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int top = -1;

  /** The current position on the lookahead stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected Stack tokenStack = new Stack();

  /**
   * Token stack. Recognizing an unexpected catalog entry requires
   * the ability to "push back" a token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int[] stack = new int[3];

  /**
   * Character lookahead stack. Reading a catalog sometimes requires
   * up to two characters of lookahead.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
public class TextCatalogReader implements CatalogReader {

/**
 * Parses plain text Catalog files.
 *
 * <p>This class reads plain text Open Catalog files.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int nextChar() throws IOException {

  /**
     * Return the next logical character from the input stream.
     *
     * @return The next (logical) character from the input stream. The
     * character may be buffered from a previous lookahead.
     *
     * @throws IOException If an error occurs reading from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected String nextToken() throws IOException, CatalogException {

    /**
     * Return the next token in the catalog file.
     *
     * <p>FYI: This code does not throw any sort of exception for
     * a file that contains an n
     *
     * @return The Catalog file token from the input stream.
     * @throws IOException If an error occurs reading from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected void finalize() {

  /**
     * The destructor.
     *
     * <p>Makes sure the catalog file is closed.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
    }

      catURL = new URL("file:///" + fileUrl);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Start parsing a text catalog file. The file is
   * actually read and parsed
   * as needed by <code>nextEntry</code>.</p>
   *
   * @param fileUrl  The URL or filename of the catalog file to process
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  public TextCatalogReader() { }

  /**
   * Construct a CatalogReader object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected boolean caseSensitive = false;

  /** Are keywords in the catalog case sensitive? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int top = -1;

  /** The current position on the lookahead stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected Stack tokenStack = new Stack();

  /**
   * Token stack. Recognizing an unexpected catalog entry requires
   * the ability to "push back" a token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
  protected int[] stack = new int[3];

  /**
   * Character lookahead stack. Reading a catalog sometimes requires
   * up to two characters of lookahead.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TextCatalogReader.java
public class TextCatalogReader implements CatalogReader {

/**
 * Parses plain text Catalog files.
 *
 * <p>This class reads plain text Open Catalog files.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
