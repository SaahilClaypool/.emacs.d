_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  private static final int NEXT_FREE_ID = 99;

  /** The next free ID.  Please keep this up to date.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int AXES_END_TYPES = 53;

  /** The end of the axes types.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_IMMEDIATE_ANCESTOR = 53;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_ANY_ANCESTOR = 52;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_ATTRIBUTE = 51;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ROOT = 50;

  /** '/' axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_NAMESPACE = 49;

  /** namespace axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_SELF = 48;

  /** self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PRECEDING_SIBLINGS = 47;

  /** preceding-sibling axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PRECEDING = 46;

  /** preceding axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PARENT = 45;

  /** parent axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_FOLLOWING_SIBLINGS = 44;

  /** following-siblings axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_FOLLOWING = 43;

  /** following axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_DESCENDANTS_OR_SELF = 42;

  /** descendants-of-self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_DESCENDANTS = 41;

  /** descendants axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_CHILDREN = 40;

  /** children axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ATTRIBUTES = 39;

  /** attribute axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ANCESTORS_OR_SELF = 38;

  /** ancestor-or-self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ANCESTORS = 37;

  /** ancestor axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int AXES_START_TYPES = 37;

  /**
   * [FROM_stepType]
   * [length, including predicates]
   * [length of just the step, without the predicates]
   * {node test}
   * {predicates}?
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_FUNCTEST = 1034;

  /**
   * [NODETYPE_ANY]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_ANYELEMENT = 36;

  /**
   * [NODETYPE_ANY]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_ROOT = 35;

  /**
   * [NODETYPE_ROOT]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODENAME = 34;

  /**
   * [NODENAME]
   * [index to ns token or EMPTY]
   * [index to name token]
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_NODE = 1033;

  /**
   * [NODETYPE_NODE]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_PI = 1032;

  /**
   * [NODETYPE_PI]
   * [index to token]
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_TEXT = 1031;

  /**
   * [NODETYPE_TEXT]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_COMMENT = 1030;

  /**
   * [NODETYPE_COMMENT]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LOCATIONPATHPATTERN = 31;

  /**
   * [OP_LOCATIONPATHPATTERN]
   * [length]
   *   {FROM_stepType}
   * | {function}{predicate}
   * [ENDOP]
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MATCHPATTERN = 30;

  /**
   * [OP_MATCHPATTERN]
   * [length]
   *  {PathExpr}+
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_PREDICATE = 29;

  /**
   * [OP_PREDICATE]
   * [length]
   *  {expression}
   * [ENDOP] (For safety)
   *
   * returns:
   *  XBoolean or XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LOCATIONPATH = 28;

  /**
   * [OP_LOCATIONPATH]
   * [length]
   *   {FROM_stepType}
   * | {function}
   * {predicate}
   * [ENDOP]
   *
   * (Note that element and attribute namespaces and
   * names can be wildcarded '*'.)
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NUMBERLIT = 27;

  /**
   * [OP_NUMBERLIT] (Number literal.)
   * [3]
   * [index to token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_ARGUMENT = 26;

  /**
   * [OP_ARGUMENT] (Function argument.)
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  static final int LAST_NODESET_OP = 25;

  /** The last opcode for stuff that can be a nodeset.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_FUNCTION = 25;

  /**
   * [OP_FUNCTION]
   * [length]
   * [FUNC_name]
   *  {OP_ARGUMENT}
   * [ENDOP]
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_EXTFUNCTION = 24;

  /**
   * [OP_EXTFUNCTION] (Extension function.)
   * [length]
   * [index to namespace token]
   * [index to function name token]
   *  {OP_ARGUMENT}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GROUP = 23;

  /**
   * [OP_GROUP]
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_VARIABLE = 22;

  /**
   * [OP_VARIABLE]
   * [4]
   * [index to namespace token, or EMPTY]
   * [index to function name token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  static final int FIRST_NODESET_OP = 22;

  /** The low opcode for nodesets, needed by getFirstPredicateOpPos and
   *  getNextStepPos.          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LITERAL = 21;

  /**
   * [OP_LITERAL]
   * [3]
   * [index to token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_UNION = 20;

  /**
   * [OP_UNION]
   * [length]
   *  {PathExpr}+
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NUMBER = 19;

  /**
   * [OP_NUMBER] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_BOOL = 18;

  /**
   * [OP_BOOL] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_STRING = 17;

  /**
   * [OP_STRING] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NEG = 16;

  /**
   * [OP_NEG]
   * [length]
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_QUO = 15;

  /**
   * [OP_QUO]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MOD = 14;

  /**
   * [OP_MOD]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_DIV = 13;

  /**
   * [OP_DIV]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MULT = 12;

  /**
   * [OP_MULT]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MINUS = 11;

  /**
   * [OP_MINUS]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_PLUS = 10;

  /**
   * [OP_PLUS]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GT = 9;

  /**
   * [OP_GT] (greater-than)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GTE = 8;

  /**
   * [OP_GTE] (greater-than-or-equals)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LT = 7;

  /**
   * [OP_LT] (less-than)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LTE = 6;

  /**
   * [OP_LTE] (less-than-or-equals)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_EQUALS = 5;

  /**
   * [OP_EQUALS]
   * [length]
   *  {expression}
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NOTEQUALS = 4;

  /**
   * [OP_NOTEQUALS]
   * [length]
   *  {expression}
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_AND = 3;

  /**
   * [OP_AND]
   * [length]
   *  {boolean expression}
   *  {boolean expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_OR = 2;

  /**
   * [OP_OR]
   * [length]
   *  {boolean expression}
   *  {boolean expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_XPATH = 1;

  /**
   * [OP_XPATH]
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int ELEMWILDCARD = -3;

  /**
   * [ELEMWILDCARD]
   * Means ELEMWILDCARD ("*"), used instead
   * of string index in some places.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int EMPTY = -2;

  /**
   * [EMPTY]
   * Empty slot to indicate NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int ENDOP = -1;

  /**
   * [ENDOP]
   * Some operators may like to have a terminator.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
public class OpCodes

/**
 * Operations codes for XPath.
 *
 * Code for the descriptions of the operations codes:
 * [UPPER CASE] indicates a literal value,
 * [lower case] is a description of a value,
 *      ([length] always indicates the length of the operation,
 *       including the operations code and the length integer.)
 * {UPPER CASE} indicates the given production,
 * {description} is the description of a new production,
 *      (For instance, {boolean expression} means some expression
 *       that should be resolved to a boolean.)
 *  * means that it occurs zero or more times,
 *  + means that it occurs one or more times,
 *  ? means that it is optional.
 *
 * returns: indicates what the production should return.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  private static final int NEXT_FREE_ID = 99;

  /** The next free ID.  Please keep this up to date.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int AXES_END_TYPES = 53;

  /** The end of the axes types.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_IMMEDIATE_ANCESTOR = 53;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_ANY_ANCESTOR = 52;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int MATCH_ATTRIBUTE = 51;

  /**
   * For match patterns.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ROOT = 50;

  /** '/' axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_NAMESPACE = 49;

  /** namespace axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_SELF = 48;

  /** self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PRECEDING_SIBLINGS = 47;

  /** preceding-sibling axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PRECEDING = 46;

  /** preceding axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_PARENT = 45;

  /** parent axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_FOLLOWING_SIBLINGS = 44;

  /** following-siblings axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_FOLLOWING = 43;

  /** following axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_DESCENDANTS_OR_SELF = 42;

  /** descendants-of-self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_DESCENDANTS = 41;

  /** descendants axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_CHILDREN = 40;

  /** children axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ATTRIBUTES = 39;

  /** attribute axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ANCESTORS_OR_SELF = 38;

  /** ancestor-or-self axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int FROM_ANCESTORS = 37;

  /** ancestor axes opcode.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int AXES_START_TYPES = 37;

  /**
   * [FROM_stepType]
   * [length, including predicates]
   * [length of just the step, without the predicates]
   * {node test}
   * {predicates}?
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_FUNCTEST = 1034;

  /**
   * [NODETYPE_ANY]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_ANYELEMENT = 36;

  /**
   * [NODETYPE_ANY]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_ROOT = 35;

  /**
   * [NODETYPE_ROOT]
   * No size or arguments.
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODENAME = 34;

  /**
   * [NODENAME]
   * [index to ns token or EMPTY]
   * [index to name token]
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_NODE = 1033;

  /**
   * [NODETYPE_NODE]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_PI = 1032;

  /**
   * [NODETYPE_PI]
   * [index to token]
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_TEXT = 1031;

  /**
   * [NODETYPE_TEXT]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int NODETYPE_COMMENT = 1030;

  /**
   * [NODETYPE_COMMENT]
   * No size or arguments.
   * Note: must not overlap function OP number!
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LOCATIONPATHPATTERN = 31;

  /**
   * [OP_LOCATIONPATHPATTERN]
   * [length]
   *   {FROM_stepType}
   * | {function}{predicate}
   * [ENDOP]
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MATCHPATTERN = 30;

  /**
   * [OP_MATCHPATTERN]
   * [length]
   *  {PathExpr}+
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_PREDICATE = 29;

  /**
   * [OP_PREDICATE]
   * [length]
   *  {expression}
   * [ENDOP] (For safety)
   *
   * returns:
   *  XBoolean or XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LOCATIONPATH = 28;

  /**
   * [OP_LOCATIONPATH]
   * [length]
   *   {FROM_stepType}
   * | {function}
   * {predicate}
   * [ENDOP]
   *
   * (Note that element and attribute namespaces and
   * names can be wildcarded '*'.)
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NUMBERLIT = 27;

  /**
   * [OP_NUMBERLIT] (Number literal.)
   * [3]
   * [index to token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_ARGUMENT = 26;

  /**
   * [OP_ARGUMENT] (Function argument.)
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  static final int LAST_NODESET_OP = 25;

  /** The last opcode for stuff that can be a nodeset.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_FUNCTION = 25;

  /**
   * [OP_FUNCTION]
   * [length]
   * [FUNC_name]
   *  {OP_ARGUMENT}
   * [ENDOP]
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_EXTFUNCTION = 24;

  /**
   * [OP_EXTFUNCTION] (Extension function.)
   * [length]
   * [index to namespace token]
   * [index to function name token]
   *  {OP_ARGUMENT}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GROUP = 23;

  /**
   * [OP_GROUP]
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_VARIABLE = 22;

  /**
   * [OP_VARIABLE]
   * [4]
   * [index to namespace token, or EMPTY]
   * [index to function name token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  static final int FIRST_NODESET_OP = 22;

  /** The low opcode for nodesets, needed by getFirstPredicateOpPos and
   *  getNextStepPos.          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LITERAL = 21;

  /**
   * [OP_LITERAL]
   * [3]
   * [index to token]
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_UNION = 20;

  /**
   * [OP_UNION]
   * [length]
   *  {PathExpr}+
   *
   * returns:
   *  XNodeSet
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NUMBER = 19;

  /**
   * [OP_NUMBER] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_BOOL = 18;

  /**
   * [OP_BOOL] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_STRING = 17;

  /**
   * [OP_STRING] (cast operation)
   * [length]
   *  {expression}
   *
   * returns:
   *  XString
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NEG = 16;

  /**
   * [OP_NEG]
   * [length]
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_QUO = 15;

  /**
   * [OP_QUO]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MOD = 14;

  /**
   * [OP_MOD]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_DIV = 13;

  /**
   * [OP_DIV]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MULT = 12;

  /**
   * [OP_MULT]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_MINUS = 11;

  /**
   * [OP_MINUS]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_PLUS = 10;

  /**
   * [OP_PLUS]
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XNumber
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GT = 9;

  /**
   * [OP_GT] (greater-than)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_GTE = 8;

  /**
   * [OP_GTE] (greater-than-or-equals)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LT = 7;

  /**
   * [OP_LT] (less-than)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_LTE = 6;

  /**
   * [OP_LTE] (less-than-or-equals)
   * [length]
   *  {number expression}
   *  {number expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_EQUALS = 5;

  /**
   * [OP_EQUALS]
   * [length]
   *  {expression}
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_NOTEQUALS = 4;

  /**
   * [OP_NOTEQUALS]
   * [length]
   *  {expression}
   *  {expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_AND = 3;

  /**
   * [OP_AND]
   * [length]
   *  {boolean expression}
   *  {boolean expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_OR = 2;

  /**
   * [OP_OR]
   * [length]
   *  {boolean expression}
   *  {boolean expression}
   *
   * returns:
   *  XBoolean
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int OP_XPATH = 1;

  /**
   * [OP_XPATH]
   * [length]
   *  {expression}
   *
   * returns:
   *  XNodeSet
   *  XNumber
   *  XString
   *  XBoolean
   *  XRTree
   *  XObject
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int ELEMWILDCARD = -3;

  /**
   * [ELEMWILDCARD]
   * Means ELEMWILDCARD ("*"), used instead
   * of string index in some places.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int EMPTY = -2;

  /**
   * [EMPTY]
   * Empty slot to indicate NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
  public static final int ENDOP = -1;

  /**
   * [ENDOP]
   * Some operators may like to have a terminator.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpCodes.java
public class OpCodes

/**
 * Operations codes for XPath.
 *
 * Code for the descriptions of the operations codes:
 * [UPPER CASE] indicates a literal value,
 * [lower case] is a description of a value,
 *      ([length] always indicates the length of the operation,
 *       including the operations code and the length integer.)
 * {UPPER CASE} indicates the given production,
 * {description} is the description of a new production,
 *      (For instance, {boolean expression} means some expression
 *       that should be resolved to a boolean.)
 *  * means that it occurs zero or more times,
 *  + means that it occurs one or more times,
 *  ? means that it is optional.
 *
 * returns: indicates what the production should return.
 */
