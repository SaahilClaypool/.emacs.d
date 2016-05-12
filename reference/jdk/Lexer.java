_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
      /***  Old code commented out 10-Jan-2001

/** old code commented out 17-Sep-2004
// error("Could not locate namespace for prefix: "+prefix);
//                m_processor.error(XPATHErrorResources.ER_PREFIX_MUST_RESOLVE,
//                                       new String[] {prefix});  //"Prefix must resolve to a namespace: {0}";
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int mapNSTokens(String pat, int startSubstring, int posOfNSSep,
                          int posOfScan)

  /**
   * When a seperator token is found, see if there's a element name or
   * the like to map.
   *
   * @param pat The XPath name string.
   * @param startSubstring The start of the name string.
   * @param posOfNSSep The position of the namespace seperator (':').
   * @param posOfScan The end of the name index.
   *
   * @throws javax.xml.transform.TransformerException
   *
   * @return -1 always.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private final void addToTokenQueue(String s)

  /**
   * Add a token to the token queue.
   *
   *
   * @param s The token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private void recordTokenString(Vector targetStrings)

  /**
   * Record the current token in the passed vector.
   *
   * @param targetStrings Vector of string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  final int getKeywordToken(String key)

  /**
   * Given a string, return the corresponding keyword token.
   *
   * @param key The keyword.
   *
   * @return An opcode value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private final void resetTokenMark(int mark)

  /**
   * Reset token queue mark and m_token to a
   * given position.
   * @param mark The new position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int getTokenQueuePosFromMap(int i)

  /**
   * Given a map pos, return the corresponding token queue pos.
   *
   * @param i The index in the m_patternMap.
   *
   * @return the token queue position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private boolean mapPatternElemPos(int nesting, boolean isStart,
                                    boolean isAttrName)

  /**
   * Record the current position on the token queue as long as
   * this is a top-level element.  Must be called before the
   * next token is added to the m_tokenQueue.
   *
   * @param nesting The nesting count for the pattern element.
   * @param isStart true if this is the start of a pattern.
   * @param isAttrName true if we have determined that this is an attribute name.
   *
   * @return true if this is the start of a pattern.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  void tokenize(String pat, Vector targetStrings)

  /**
   * Walk through the expression and build a token queue, and a map of the top-level
   * elements.
   * @param pat XSLT Expression.
   * @param targetStrings Vector to hold Strings, may be null.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  void tokenize(String pat) throws javax.xml.transform.TransformerException

  /**
   * Walk through the expression and build a token queue, and a map of the top-level
   * elements.
   * @param pat XSLT Expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  Lexer(Compiler compiler, PrefixResolver resolver,
        XPathParser xpathProcessor)

  /**
   * Create a Lexer object.
   *
   * @param compiler The owning compiler for this lexer.
   * @param resolver The prefix resolver for mapping qualified name prefixes
   *                 to namespace URIs.
   * @param xpathProcessor The parser that is processing strings to opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int m_patternMapSize;

  /**
   * Ignore this, it is going away.
   * The number of elements that m_patternMap maps;
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int m_patternMap[] = new int[100];

  /**
   * Ignore this, it is going away.
   * This holds a map to the m_tokenQueue that tells where the top-level elements are.
   * It is used for pattern matching so the m_tokenQueue can be walked backwards.
   * Each element that is a 'target', (right-most top level element name) has
   * TARGETEXTRA added to it.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  static final int TARGETEXTRA = 10000;

  /**
   * This value is added to each element name in the TARGETEXTRA
   * that is a 'target' (right-most top-level element name).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  XPathParser m_processor;

  /**
   * The XPath processor object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  PrefixResolver m_namespaceContext;

  /**
   * The prefix resolver to map prefixes to namespaces in the XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private Compiler m_compiler;

  /**
   * The target XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
class Lexer

/**
 * This class is in charge of lexical processing of the XPath
 * expression into tokens.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
      /***  Old code commented out 10-Jan-2001

/** old code commented out 17-Sep-2004
// error("Could not locate namespace for prefix: "+prefix);
//                m_processor.error(XPATHErrorResources.ER_PREFIX_MUST_RESOLVE,
//                                       new String[] {prefix});  //"Prefix must resolve to a namespace: {0}";
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int mapNSTokens(String pat, int startSubstring, int posOfNSSep,
                          int posOfScan)

  /**
   * When a seperator token is found, see if there's a element name or
   * the like to map.
   *
   * @param pat The XPath name string.
   * @param startSubstring The start of the name string.
   * @param posOfNSSep The position of the namespace seperator (':').
   * @param posOfScan The end of the name index.
   *
   * @throws javax.xml.transform.TransformerException
   *
   * @return -1 always.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private final void addToTokenQueue(String s)

  /**
   * Add a token to the token queue.
   *
   *
   * @param s The token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private void recordTokenString(Vector targetStrings)

  /**
   * Record the current token in the passed vector.
   *
   * @param targetStrings Vector of string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  final int getKeywordToken(String key)

  /**
   * Given a string, return the corresponding keyword token.
   *
   * @param key The keyword.
   *
   * @return An opcode value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private final void resetTokenMark(int mark)

  /**
   * Reset token queue mark and m_token to a
   * given position.
   * @param mark The new position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int getTokenQueuePosFromMap(int i)

  /**
   * Given a map pos, return the corresponding token queue pos.
   *
   * @param i The index in the m_patternMap.
   *
   * @return the token queue position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private boolean mapPatternElemPos(int nesting, boolean isStart,
                                    boolean isAttrName)

  /**
   * Record the current position on the token queue as long as
   * this is a top-level element.  Must be called before the
   * next token is added to the m_tokenQueue.
   *
   * @param nesting The nesting count for the pattern element.
   * @param isStart true if this is the start of a pattern.
   * @param isAttrName true if we have determined that this is an attribute name.
   *
   * @return true if this is the start of a pattern.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  void tokenize(String pat, Vector targetStrings)

  /**
   * Walk through the expression and build a token queue, and a map of the top-level
   * elements.
   * @param pat XSLT Expression.
   * @param targetStrings Vector to hold Strings, may be null.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  void tokenize(String pat) throws javax.xml.transform.TransformerException

  /**
   * Walk through the expression and build a token queue, and a map of the top-level
   * elements.
   * @param pat XSLT Expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  Lexer(Compiler compiler, PrefixResolver resolver,
        XPathParser xpathProcessor)

  /**
   * Create a Lexer object.
   *
   * @param compiler The owning compiler for this lexer.
   * @param resolver The prefix resolver for mapping qualified name prefixes
   *                 to namespace URIs.
   * @param xpathProcessor The parser that is processing strings to opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int m_patternMapSize;

  /**
   * Ignore this, it is going away.
   * The number of elements that m_patternMap maps;
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private int m_patternMap[] = new int[100];

  /**
   * Ignore this, it is going away.
   * This holds a map to the m_tokenQueue that tells where the top-level elements are.
   * It is used for pattern matching so the m_tokenQueue can be walked backwards.
   * Each element that is a 'target', (right-most top level element name) has
   * TARGETEXTRA added to it.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  static final int TARGETEXTRA = 10000;

  /**
   * This value is added to each element name in the TARGETEXTRA
   * that is a 'target' (right-most top-level element name).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  XPathParser m_processor;

  /**
   * The XPath processor object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  PrefixResolver m_namespaceContext;

  /**
   * The prefix resolver to map prefixes to namespaces in the XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
  private Compiler m_compiler;

  /**
   * The target XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Lexer.java
class Lexer

/**
 * This class is in charge of lexical processing of the XPath
 * expression into tokens.
 */
