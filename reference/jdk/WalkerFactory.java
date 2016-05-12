_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_MATCH_PATTERN = (0x00001000 << 19);

  /** Bit is on if the expression is a match pattern. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_NODETEST_ANY = (0x00001000 << 18);

  /**
   * Bit is on if any of the walkers contain an node() test.  This is
   *  really only useful if the count is 1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANY_DESCENDANT_FROM_ROOT = (0x00001000 << 17);

  /** Found "//foo" pattern */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_BACKWARDS_SELF = (0x00001000 << 16);

  /**
   * Bit is on if any of the walkers can go backwards in document
   *  order from the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITMASK_TRAVERSES_OUTSIDE_SUBTREE = (BIT_NAMESPACE  // ??
                                                                | BIT_PRECEDING_SIBLING
                                                                | BIT_PRECEDING
                                                                | BIT_FOLLOWING_SIBLING
                                                                | BIT_FOLLOWING
                                                                | BIT_PARENT  // except parent of attrs.
                                                                | BIT_ANCESTOR_OR_SELF
                                                                | BIT_ANCESTOR
                                                                | BIT_FILTER
                                                                | BIT_ROOT);

  /**
   * If any of these bits are on, the expression may likely traverse outside
   *  the given subtree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ROOT = (0x00001000 << 15);

  /** Bit is on if any of the walkers contain a root step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FILTER = (0x00001000 << 14);

  /**
   * Bit is on if any of the walkers contain a filter (i.e. id(), extension
   *  function, etc.) step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_SELF = (0x00001000 << 13);

  /** Bit is on if any of the walkers contain a self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PRECEDING_SIBLING = (0x00001000 << 12);

  /** Bit is on if any of the walkers contain a preceding-sibling step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PRECEDING = (0x00001000 << 11);

  /** Bit is on if any of the walkers contain a preceding step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PARENT = (0x00001000 << 10);

  /** Bit is on if any of the walkers contain a parent step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_NAMESPACE = (0x00001000 << 9);

  /** Bit is on if any of the walkers contain a namespace step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FOLLOWING_SIBLING = (0x00001000 << 8);

  /** Bit is on if any of the walkers contain a following-sibiling step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FOLLOWING = (0x00001000 << 7);

  /** Bit is on if any of the walkers contain a following step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_DESCENDANT_OR_SELF = (0x00001000 << 6);

  /** Bit is on if any of the walkers contain a descendant-or-self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_DESCENDANT = (0x00001000 << 5);

  /** Bit is on if any of the walkers contain a descendant step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_CHILD = (0x00001000 << 4);

  /** Bit is on if any of the walkers contain a child step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ATTRIBUTE = (0x00001000 << 3);

  /** Bit is on if any of the walkers contain an attribute step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANCESTOR_OR_SELF = (0x00001000 << 2);

  /** Bit is on if any of the walkers contain an ancestor-or-self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANCESTOR = (0x00001000 << 1);

  /** Bit is on if any of the walkers contain an ancestor step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PREDICATE = (0x00001000);

  /** Bit is on if the expression contains a top-level predicate. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITS_RESERVED = 0x00000F00;

  /** 4 bits are reserved for future use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITS_COUNT = 0x000000FF;

  /**
   * First 8 bits are the number of top-level location steps.  Hopefully
   *  there will never be more that 255 location steps!!!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static boolean isNaturalDocOrder(
          Compiler compiler, int stepOpCodePos, int stepIndex, int analysis)

  /**
   * Tell if the pattern can be 'walked' with the iteration steps in natural
   * document order, without duplicates.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   * @param analysis The general analysis of the pattern.
   *
   * @return true if the walk can be done in natural order.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static public boolean isNaturalDocOrder(int analysis)

  /**
   * Tell if the pattern can be 'walked' with the iteration steps in natural
   * document order, without duplicates.
   *
   * @param analysis The general analysis of the pattern.
   *
   * @return true if the walk can be done in natural order.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_ITERATOR_CREATION = false;

  /** Set to true for diagnostics about iterator creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_WALKER_CREATION = false;

  /** Set to true for diagnostics about walker creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_PATTERN_CREATION = false;

  /** Set to true for diagnostics about walker creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static AxesWalker createDefaultWalker(Compiler compiler, int opPos,
          WalkingIterator lpi, int analysis)

  /**
   * Create the proper Walker from the axes type.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The opcode position for the step.
   * @param lpi The owning location path iterator.
   * @param analysis 32 bits of analysis, from which the type of AxesWalker
   *                 may be influenced.
   *
   * @return non-null reference to AxesWalker derivative.
   * @throws RuntimeException if the input is bad.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static boolean analyzePredicate(Compiler compiler, int opPos, int stepType)

  /**
   * Analyze a step and give information about it's predicates.  Right now this
   * just returns true or false if the step has a predicate.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The opcode position for the step.
   * @param stepType The type of step, one of OP_GROUP, etc.
   *
   * @return true if step has a predicate.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static StepPattern createDefaultStepPattern(
          Compiler compiler, int opPos, MatchPatternIterator mpi,
          int analysis, StepPattern tail, StepPattern head)

  /**
   * Create a StepPattern that is contained within a LocationPath.
   *
   *
   * @param compiler The compiler that holds the syntax tree/op map to
   * construct from.
   * @param stepOpCodePos The current op code position within the opmap.
   * @param mpi The MatchPatternIterator to which the steps will be attached.
   * @param analysis 32 bits of analysis, from which the type of AxesWalker
   *                 may be influenced.
   * @param tail The step that is the first step analyzed, but the last
   *                  step in the relative match linked list, i.e. the tail.
   *                  May be null.
   * @param head The step that is the current head of the relative
   *                 match step linked list.
   *                 May be null.
   *
   * @return the head of the list.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static StepPattern loadSteps(
          MatchPatternIterator mpi, Compiler compiler, int stepOpCodePos,
                                                       int stepIndex)

  /**
   * Read a <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a>
   * as a generalized match pattern.  What this means is that the LocationPath
   * is read backwards, as a test on a given node, to see if it matches the
   * criteria of the selection, and ends up at the context node.  Essentially,
   * this is a backwards query from a given node, to find the context node.
   * <p>So, the selection "foo/daz[2]" is, in non-abreviated expanded syntax,
   * "self::node()/following-sibling::foo/child::daz[position()=2]".
   * Taking this as a match pattern for a probable node, it works out to
   * "self::daz/parent::foo[child::daz[position()=2 and isPrevStepNode()]
   * precedingSibling::node()[isContextNodeOfLocationPath()]", adding magic
   * isPrevStepNode and isContextNodeOfLocationPath operations.  Predicates in
   * the location path have to be executed by the following step,
   * because they have to know the context of their execution.
   *
   * @param mpi The MatchPatternIterator to which the steps will be attached.
   * @param compiler The compiler that holds the syntax tree/op map to
   * construct from.
   * @param stepOpCodePos The current op code position within the opmap.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return A StepPattern object, which may contain relative StepPatterns.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static boolean isDownwardAxisOfMany(int axis)

  /**
   * Tell if the given axis goes downword.  Bogus name, if you can think of
   * a better one, please do tell.  This really has to do with inverting
   * attribute axis.
   * @param axis One of Axis.XXX.
   * @return true if the axis is not a child axis and does not go up from
   * the axis root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static int analyze(
          Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * Analyze the location path and return 32 bits that give information about
   * the location path as a whole.  See the BIT_XXX constants for meaning about
   * each of the bits.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static boolean isOptimizableForDescendantIterator(
          Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * Special purpose function to see if we can optimize the pattern for
   * a DescendantIterator.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static boolean mightBeProximate(Compiler compiler, int opPos, int stepType)

  /**
   * Tell if the predicates need to have proximity knowledge.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
    static public int getAnalysisBitFromAxes(int axis)

    /**
     * Get a corresponding BIT_XXX from an axis.
     * @param axis One of Axis.ANCESTOR, etc.
     * @return One of BIT_ANCESTOR, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static int getAxisFromStep(
          Compiler compiler, int stepOpCodePos)

  /**
   * Special purpose function to see if we can optimize the pattern for
   * a DescendantIterator.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static DTMIterator newDTMIterator(
          Compiler compiler, int opPos,
          boolean isTopLevel)

  /**
   * Create a new LocPathIterator iterator.  The exact type of iterator
   * returned is based on an analysis of the XPath operations.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The position of the operation code for this itterator.
   *
   * @return non-null reference to a LocPathIterator or derivative.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static AxesWalker loadWalkers(
          WalkingIterator lpi, Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * This method is for building an array of possible levels
   * where the target element(s) could be found for a match.
   * @param lpi The owning location path iterator object.
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return non-null AxesWalker derivative.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static AxesWalker loadOneWalker(
          WalkingIterator lpi, Compiler compiler, int stepOpCodePos)

  /**
   * This method is for building an array of possible levels
   * where the target element(s) could be found for a match.
   * @param lpi The owning location path iterator.
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   *
   * @return non-null AxesWalker derivative.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
public class WalkerFactory

/**
 * This class is both a factory for XPath location path expressions,
 * which are built from the opcode map output, and an analysis engine
 * for the location path expressions in order to provide optimization hints.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_MATCH_PATTERN = (0x00001000 << 19);

  /** Bit is on if the expression is a match pattern. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_NODETEST_ANY = (0x00001000 << 18);

  /**
   * Bit is on if any of the walkers contain an node() test.  This is
   *  really only useful if the count is 1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANY_DESCENDANT_FROM_ROOT = (0x00001000 << 17);

  /** Found "//foo" pattern */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_BACKWARDS_SELF = (0x00001000 << 16);

  /**
   * Bit is on if any of the walkers can go backwards in document
   *  order from the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITMASK_TRAVERSES_OUTSIDE_SUBTREE = (BIT_NAMESPACE  // ??
                                                                | BIT_PRECEDING_SIBLING
                                                                | BIT_PRECEDING
                                                                | BIT_FOLLOWING_SIBLING
                                                                | BIT_FOLLOWING
                                                                | BIT_PARENT  // except parent of attrs.
                                                                | BIT_ANCESTOR_OR_SELF
                                                                | BIT_ANCESTOR
                                                                | BIT_FILTER
                                                                | BIT_ROOT);

  /**
   * If any of these bits are on, the expression may likely traverse outside
   *  the given subtree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ROOT = (0x00001000 << 15);

  /** Bit is on if any of the walkers contain a root step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FILTER = (0x00001000 << 14);

  /**
   * Bit is on if any of the walkers contain a filter (i.e. id(), extension
   *  function, etc.) step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_SELF = (0x00001000 << 13);

  /** Bit is on if any of the walkers contain a self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PRECEDING_SIBLING = (0x00001000 << 12);

  /** Bit is on if any of the walkers contain a preceding-sibling step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PRECEDING = (0x00001000 << 11);

  /** Bit is on if any of the walkers contain a preceding step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PARENT = (0x00001000 << 10);

  /** Bit is on if any of the walkers contain a parent step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_NAMESPACE = (0x00001000 << 9);

  /** Bit is on if any of the walkers contain a namespace step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FOLLOWING_SIBLING = (0x00001000 << 8);

  /** Bit is on if any of the walkers contain a following-sibiling step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_FOLLOWING = (0x00001000 << 7);

  /** Bit is on if any of the walkers contain a following step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_DESCENDANT_OR_SELF = (0x00001000 << 6);

  /** Bit is on if any of the walkers contain a descendant-or-self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_DESCENDANT = (0x00001000 << 5);

  /** Bit is on if any of the walkers contain a descendant step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_CHILD = (0x00001000 << 4);

  /** Bit is on if any of the walkers contain a child step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ATTRIBUTE = (0x00001000 << 3);

  /** Bit is on if any of the walkers contain an attribute step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANCESTOR_OR_SELF = (0x00001000 << 2);

  /** Bit is on if any of the walkers contain an ancestor-or-self step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_ANCESTOR = (0x00001000 << 1);

  /** Bit is on if any of the walkers contain an ancestor step. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BIT_PREDICATE = (0x00001000);

  /** Bit is on if the expression contains a top-level predicate. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITS_RESERVED = 0x00000F00;

  /** 4 bits are reserved for future use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static final int BITS_COUNT = 0x000000FF;

  /**
   * First 8 bits are the number of top-level location steps.  Hopefully
   *  there will never be more that 255 location steps!!!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static boolean isNaturalDocOrder(
          Compiler compiler, int stepOpCodePos, int stepIndex, int analysis)

  /**
   * Tell if the pattern can be 'walked' with the iteration steps in natural
   * document order, without duplicates.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   * @param analysis The general analysis of the pattern.
   *
   * @return true if the walk can be done in natural order.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static public boolean isNaturalDocOrder(int analysis)

  /**
   * Tell if the pattern can be 'walked' with the iteration steps in natural
   * document order, without duplicates.
   *
   * @param analysis The general analysis of the pattern.
   *
   * @return true if the walk can be done in natural order.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_ITERATOR_CREATION = false;

  /** Set to true for diagnostics about iterator creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_WALKER_CREATION = false;

  /** Set to true for diagnostics about walker creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static final boolean DEBUG_PATTERN_CREATION = false;

  /** Set to true for diagnostics about walker creation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static AxesWalker createDefaultWalker(Compiler compiler, int opPos,
          WalkingIterator lpi, int analysis)

  /**
   * Create the proper Walker from the axes type.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The opcode position for the step.
   * @param lpi The owning location path iterator.
   * @param analysis 32 bits of analysis, from which the type of AxesWalker
   *                 may be influenced.
   *
   * @return non-null reference to AxesWalker derivative.
   * @throws RuntimeException if the input is bad.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static boolean analyzePredicate(Compiler compiler, int opPos, int stepType)

  /**
   * Analyze a step and give information about it's predicates.  Right now this
   * just returns true or false if the step has a predicate.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The opcode position for the step.
   * @param stepType The type of step, one of OP_GROUP, etc.
   *
   * @return true if step has a predicate.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static StepPattern createDefaultStepPattern(
          Compiler compiler, int opPos, MatchPatternIterator mpi,
          int analysis, StepPattern tail, StepPattern head)

  /**
   * Create a StepPattern that is contained within a LocationPath.
   *
   *
   * @param compiler The compiler that holds the syntax tree/op map to
   * construct from.
   * @param stepOpCodePos The current op code position within the opmap.
   * @param mpi The MatchPatternIterator to which the steps will be attached.
   * @param analysis 32 bits of analysis, from which the type of AxesWalker
   *                 may be influenced.
   * @param tail The step that is the first step analyzed, but the last
   *                  step in the relative match linked list, i.e. the tail.
   *                  May be null.
   * @param head The step that is the current head of the relative
   *                 match step linked list.
   *                 May be null.
   *
   * @return the head of the list.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static StepPattern loadSteps(
          MatchPatternIterator mpi, Compiler compiler, int stepOpCodePos,
                                                       int stepIndex)

  /**
   * Read a <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a>
   * as a generalized match pattern.  What this means is that the LocationPath
   * is read backwards, as a test on a given node, to see if it matches the
   * criteria of the selection, and ends up at the context node.  Essentially,
   * this is a backwards query from a given node, to find the context node.
   * <p>So, the selection "foo/daz[2]" is, in non-abreviated expanded syntax,
   * "self::node()/following-sibling::foo/child::daz[position()=2]".
   * Taking this as a match pattern for a probable node, it works out to
   * "self::daz/parent::foo[child::daz[position()=2 and isPrevStepNode()]
   * precedingSibling::node()[isContextNodeOfLocationPath()]", adding magic
   * isPrevStepNode and isContextNodeOfLocationPath operations.  Predicates in
   * the location path have to be executed by the following step,
   * because they have to know the context of their execution.
   *
   * @param mpi The MatchPatternIterator to which the steps will be attached.
   * @param compiler The compiler that holds the syntax tree/op map to
   * construct from.
   * @param stepOpCodePos The current op code position within the opmap.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return A StepPattern object, which may contain relative StepPatterns.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static boolean isDownwardAxisOfMany(int axis)

  /**
   * Tell if the given axis goes downword.  Bogus name, if you can think of
   * a better one, please do tell.  This really has to do with inverting
   * attribute axis.
   * @param axis One of Axis.XXX.
   * @return true if the axis is not a child axis and does not go up from
   * the axis root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static int analyze(
          Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * Analyze the location path and return 32 bits that give information about
   * the location path as a whole.  See the BIT_XXX constants for meaning about
   * each of the bits.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  private static boolean isOptimizableForDescendantIterator(
          Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * Special purpose function to see if we can optimize the pattern for
   * a DescendantIterator.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static boolean mightBeProximate(Compiler compiler, int opPos, int stepType)

  /**
   * Tell if the predicates need to have proximity knowledge.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
    static public int getAnalysisBitFromAxes(int axis)

    /**
     * Get a corresponding BIT_XXX from an axis.
     * @param axis One of Axis.ANCESTOR, etc.
     * @return One of BIT_ANCESTOR, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static int getAxisFromStep(
          Compiler compiler, int stepOpCodePos)

  /**
   * Special purpose function to see if we can optimize the pattern for
   * a DescendantIterator.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   *
   * @return 32 bits as an integer that give information about the location
   * path as a whole.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  public static DTMIterator newDTMIterator(
          Compiler compiler, int opPos,
          boolean isTopLevel)

  /**
   * Create a new LocPathIterator iterator.  The exact type of iterator
   * returned is based on an analysis of the XPath operations.
   *
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param opPos The position of the operation code for this itterator.
   *
   * @return non-null reference to a LocPathIterator or derivative.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static AxesWalker loadWalkers(
          WalkingIterator lpi, Compiler compiler, int stepOpCodePos, int stepIndex)

  /**
   * This method is for building an array of possible levels
   * where the target element(s) could be found for a match.
   * @param lpi The owning location path iterator object.
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   * @param stepIndex The top-level step index withing the iterator.
   *
   * @return non-null AxesWalker derivative.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
  static AxesWalker loadOneWalker(
          WalkingIterator lpi, Compiler compiler, int stepOpCodePos)

  /**
   * This method is for building an array of possible levels
   * where the target element(s) could be found for a match.
   * @param lpi The owning location path iterator.
   * @param compiler non-null reference to compiler object that has processed
   *                 the XPath operations into an opcode map.
   * @param stepOpCodePos The opcode position for the step.
   *
   * @return non-null AxesWalker derivative.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkerFactory.java
public class WalkerFactory

/**
 * This class is both a factory for XPath location path expressions,
 * which are built from the opcode map output, and an analysis engine
 * for the location path expressions in order to provide optimization hints.
 */
