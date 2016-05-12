_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getStepLocalName(int opPosOfStep)

  /**
   * Get the local name of the step.
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return OpCodes.EMPTY, OpCodes.ELEMWILDCARD, or the local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getStepNS(int opPosOfStep)

  /**
   * Get the namespace of the step.
   *
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return The step's namespace, NodeTest.WILD, or null for null namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getStepTestType(int opPosOfStep)

  /**
   * Get the test type of the step, i.e. NODETYPE_XXX value.
   *
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return NODETYPE_XXX value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getFirstChildPosOfStep(int opPos)

  /**
   * Get the first child position of a given location step.
   *
   * @param opPos Position of location step in the location map.
   *
   * @return The first child position of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getArgLengthOfStep(int opPos)

  /**
   * Given a location step, get the length of that step.
   *
   * @param opPos Position of location step in op map.
   *
   * @return The length of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getArgLength(int opPos)

  /**
   * Get the length of an operation.
   *
   * @param opPos The position of the operation in the op map.
   *
   * @return The size of the operation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getFirstChildPos(int opPos)

  /**
   * Go to the first child of a given operation.
   *
   * @param opPos position of operation.
   *
   * @return The position of the first child of the operation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public void error(String msg, Object[] args) throws javax.xml.transform.TransformerException

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getFirstPredicateOpPos(int opPos)

  /**
   * Given an FROM_stepType position, return the position of the
   * first predicate, if there is one, or else this will point
   * to the end of the FROM_stepType.
   * Example:
   *  int posOfPredicate = xpath.getNextOpPos(stepPos);
   *  boolean hasPredicates =
   *            OpCodes.OP_PREDICATE == xpath.getOp(posOfPredicate);
   *
   * @param opPos position of FROM_stepType op.
   * @return position of predicate in FROM_stepType structure.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getNextOpPos(int[] opMap, int opPos)

  /**
   * Given an operation position, return the end position, i.e. the
   * beginning of the next operation.
   *
   * @param opMap The operations map.
   * @param opPos index to operation, for which there is a size entry following.
   * @return position of next operation in m_opMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getNextStepPos(int opPos)

  /**
   * Given a location step position, return the end position, i.e. the
   * beginning of the next step.
   *
   * @param opPos the position of a location step.
   * @return the position of the next location step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getNextOpPos(int opPos)

  /**
   * Given an operation position, return the end position, i.e. the
   * beginning of the next operation.
   *
   * @param opPos An op position of an operation for which there is a size
   *              entry following.
   * @return position of next operation in m_opMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public void setOp(int opPos, int value)

  /**
  * Set the op at index to the given int.
   *
   * @param opPos index into op map.
   * @param value Value to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getOp(int opPos)

  /**
  * Given an operation position, return the current op.
   *
   * @param opPos index into op map.
   * @return the op that corresponds to the opPos argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  void shrink()

  /**
   * Replace the large arrays
   * with a small array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static final int MAPINDEX_LENGTH = 1;

  /**
   * The length is always the opcode position + 1.
   * Length is always expressed as the opcode+length bytes,
   * so it is always 2 or greater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public OpMapVector getOpMap()

  /**
    * Get the opcode list that describes the XPath operations.  It contains
   * operations codes and indexes into the m_tokenQueue.
   * I use an array instead of a full parse tree in order to cut down
   * on the number of objects created.
   *
   * @return An IntVector that is the opcode list that describes the XPath operations.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  OpMapVector m_opMap = null;

  /**
   * An operations map is used instead of a proper parse tree.  It contains
   * operations codes and indexes into the m_tokenQueue.
   * I use an array instead of a full parse tree in order to cut down
   * on the number of objects created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getTokenQueueSize()

  /**
    * Get size of the token queue.
   *
   * @return The size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
//  public int m_tokenQueueSize = 0;

  /**
   * The current size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public Object getToken(int pos)

  /**
   * Get the XPath as a list of tokens.
   *
   * @param pos index into token queue.
   *
   * @return The token, normally a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public ObjectVector getTokenQueue()

  /**
   * Get the XPath as a list of tokens.
   *
   * @return ObjectVector of tokens.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  ObjectVector m_tokenQueue = new ObjectVector(MAXTOKENQUEUESIZE, BLOCKTOKENQUEUESIZE);

  /**
   *  TokenStack is the queue of used tokens. The current token is the token at the
   * end of the m_tokenQueue. The idea is that the queue can be marked and a sequence
   * of tokens can be reused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  static final int MAXTOKENQUEUESIZE = 500;

  /**
   * The starting size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getPatternString()

  /**
   * Return the expression as a string for diagnostics.
   *
   * @return The expression string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String toString()

  /**
   * Return the expression as a string for diagnostics.
   *
   * @return The expression string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  protected String m_currentPattern;

  /**
   * The current pattern string, for diagnostics purposes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
public class OpMap

/**
 * This class represents the data structure basics of the XPath
 * object.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getStepLocalName(int opPosOfStep)

  /**
   * Get the local name of the step.
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return OpCodes.EMPTY, OpCodes.ELEMWILDCARD, or the local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getStepNS(int opPosOfStep)

  /**
   * Get the namespace of the step.
   *
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return The step's namespace, NodeTest.WILD, or null for null namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getStepTestType(int opPosOfStep)

  /**
   * Get the test type of the step, i.e. NODETYPE_XXX value.
   *
   * @param opPosOfStep The position of the FROM_XXX step.
   *
   * @return NODETYPE_XXX value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getFirstChildPosOfStep(int opPos)

  /**
   * Get the first child position of a given location step.
   *
   * @param opPos Position of location step in the location map.
   *
   * @return The first child position of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getArgLengthOfStep(int opPos)

  /**
   * Given a location step, get the length of that step.
   *
   * @param opPos Position of location step in op map.
   *
   * @return The length of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getArgLength(int opPos)

  /**
   * Get the length of an operation.
   *
   * @param opPos The position of the operation in the op map.
   *
   * @return The size of the operation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getFirstChildPos(int opPos)

  /**
   * Go to the first child of a given operation.
   *
   * @param opPos position of operation.
   *
   * @return The position of the first child of the operation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public void error(String msg, Object[] args) throws javax.xml.transform.TransformerException

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getFirstPredicateOpPos(int opPos)

  /**
   * Given an FROM_stepType position, return the position of the
   * first predicate, if there is one, or else this will point
   * to the end of the FROM_stepType.
   * Example:
   *  int posOfPredicate = xpath.getNextOpPos(stepPos);
   *  boolean hasPredicates =
   *            OpCodes.OP_PREDICATE == xpath.getOp(posOfPredicate);
   *
   * @param opPos position of FROM_stepType op.
   * @return position of predicate in FROM_stepType structure.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static int getNextOpPos(int[] opMap, int opPos)

  /**
   * Given an operation position, return the end position, i.e. the
   * beginning of the next operation.
   *
   * @param opMap The operations map.
   * @param opPos index to operation, for which there is a size entry following.
   * @return position of next operation in m_opMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getNextStepPos(int opPos)

  /**
   * Given a location step position, return the end position, i.e. the
   * beginning of the next step.
   *
   * @param opPos the position of a location step.
   * @return the position of the next location step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getNextOpPos(int opPos)

  /**
   * Given an operation position, return the end position, i.e. the
   * beginning of the next operation.
   *
   * @param opPos An op position of an operation for which there is a size
   *              entry following.
   * @return position of next operation in m_opMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public void setOp(int opPos, int value)

  /**
  * Set the op at index to the given int.
   *
   * @param opPos index into op map.
   * @param value Value to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getOp(int opPos)

  /**
  * Given an operation position, return the current op.
   *
   * @param opPos index into op map.
   * @return the op that corresponds to the opPos argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  void shrink()

  /**
   * Replace the large arrays
   * with a small array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public static final int MAPINDEX_LENGTH = 1;

  /**
   * The length is always the opcode position + 1.
   * Length is always expressed as the opcode+length bytes,
   * so it is always 2 or greater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public OpMapVector getOpMap()

  /**
    * Get the opcode list that describes the XPath operations.  It contains
   * operations codes and indexes into the m_tokenQueue.
   * I use an array instead of a full parse tree in order to cut down
   * on the number of objects created.
   *
   * @return An IntVector that is the opcode list that describes the XPath operations.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  OpMapVector m_opMap = null;

  /**
   * An operations map is used instead of a proper parse tree.  It contains
   * operations codes and indexes into the m_tokenQueue.
   * I use an array instead of a full parse tree in order to cut down
   * on the number of objects created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public int getTokenQueueSize()

  /**
    * Get size of the token queue.
   *
   * @return The size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
//  public int m_tokenQueueSize = 0;

  /**
   * The current size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public Object getToken(int pos)

  /**
   * Get the XPath as a list of tokens.
   *
   * @param pos index into token queue.
   *
   * @return The token, normally a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public ObjectVector getTokenQueue()

  /**
   * Get the XPath as a list of tokens.
   *
   * @return ObjectVector of tokens.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  ObjectVector m_tokenQueue = new ObjectVector(MAXTOKENQUEUESIZE, BLOCKTOKENQUEUESIZE);

  /**
   *  TokenStack is the queue of used tokens. The current token is the token at the
   * end of the m_tokenQueue. The idea is that the queue can be marked and a sequence
   * of tokens can be reused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  static final int MAXTOKENQUEUESIZE = 500;

  /**
   * The starting size of the token queue.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String getPatternString()

  /**
   * Return the expression as a string for diagnostics.
   *
   * @return The expression string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  public String toString()

  /**
   * Return the expression as a string for diagnostics.
   *
   * @return The expression string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
  protected String m_currentPattern;

  /**
   * The current pattern string, for diagnostics purposes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMap.java
public class OpMap

/**
 * This class represents the data structure basics of the XPath
 * object.
 */
