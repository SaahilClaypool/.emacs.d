_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int postTreeBuildInit(CMNode nodeCur, int curIndex)

    /** Post tree build initialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int[] makeDefStateList()

    /**
     * -1 is used to represent bad transitions in the transition table
     * entry for each state. So each entry is initialized to an all -1
     * array. This method creates a new entry and initializes it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void dumpTree(CMNode nodeCur, int level)

    /**
     * Dumps the tree of the current node to standard output.
     *
     * @param nodeCur The current node.
     * @param level   The maximum levels to output.
     *
     * @exception CMException Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    }

         /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
         else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE

         /***
         else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE)
        {
            // Recurse first
            calcFollowList(((CMUniOp)nodeCur).getChild());

            //
            //  Now handle our level. We use our own first and last position
            //  sets, so get them up front.
            //
            final CMStateSet first = nodeCur.firstPos();
            final CMStateSet last  = nodeCur.lastPos();

            //
            //  For every position which is in our last position set, add all
            //  of our first position states to the follow set for that
            //  position.
            //
            for (int index = 0; index < fLeafCount; index++)
            {
                if (last.getBit(index))
                    fFollowList[index].union(first);
            }
        }
         else if ((nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ONE_OR_MORE)
              ||  (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_ONE))
        {
            throw new RuntimeException("ImplementationMessages.VAL_NIICM");
        }
        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void calcFollowList(CMNode nodeCur)

    /**
     * Calculates the follow list of the current node.
     *
     * @param nodeCur The curent node.
     *
     * @exception CMException Thrown if follow list cannot be calculated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
        int[] fLeafSorter = new int[fLeafCount + fElemMapSize];

        /*****
        if (fLeafNameTypeVector != null) {
            fLeafNameTypeVector.setValues(fElemMap, fElemMapType, fElemMapSize);
        }

        /***
        * Optimization(Jan, 2001); We sort fLeafList according to
        * elemIndex which is *uniquely* associated to each leaf.
        * We are *assuming* that each element appears in at least one leaf.
        **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
            // Get the current leaf's element index

            /****
            if ( (fLeafListType[outIndex] & 0x0f) != 0 ) {
                if (fLeafNameTypeVector == null) {
                    fLeafNameTypeVector = new ContentLeafNameTypeVector();
                }
            }
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void buildDFA(CMNode syntaxTree)

    /**
     * Builds the internal DFA transition table from the given syntax tree.
     *
     * @param syntaxTree The syntax tree.
     *
     * @exception CMException Thrown if DFA cannot be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    public int validate(QName[] children, int offset, int length) {

    /**
     * Check that the specified content is valid according to this
     * content model. This method can also be called to do 'what if'
     * testing of content models just to see if they would be valid.
     * <p>
     * A value of -1 in the children array indicates a PCDATA node. All other
     * indexes will be positive and represent child elements. The count can be
     * zero, since some elements have the EMPTY content model and that must be
     * confirmed.
     *
     * @param children The children of this element.  Each integer is an index within
     *                 the <code>StringPool</code> of the child element name.  An index
     *                 of -1 is used to indicate an occurrence of non-whitespace character
     *                 data.
     * @param offset Offset into the array where the children starts.
     * @param length The number of entries in the <code>children</code> array.
     *
     * @return The value -1 if fully valid, else the 0 based index of the child
     *         that first failed. If the value returned is equal to the number
     *         of children, then the specified children are valid but additional
     *         content is required to reach a valid ending state.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    public DFAContentModel(CMNode syntaxTree, int leafCount, boolean mixed) {

    /**
     * Constructs a DFA content model.
     *
     * @param syntaxTree    The syntax tree of the content model.
     * @param leafCount     The number of leaves.
     * @param mixed
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private final QName fQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fEmptyContentIsValid = false;

    /**
     * Flag that indicates that even though we have a "complicated"
     * content model, it is valid to have no content. In other words,
     * all parts of the content model are optional. For example:
     * <pre>
     *      &lt;!ELEMENT AllOptional (Optional*,NotRequired?)&gt;
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fTransTableSize = 0;

    /**
     * The number of valid entries in the transition table, and in the other
     * related tables such as fFinalStateFlags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fTransTable[][] = null;

    /**
     * This is the transition table that is the main by product of all
     * of the effort here. It is an array of arrays of ints. The first
     * dimension is the number of states we end up with in the DFA. The
     * second dimensions is the number of unique elements in the content
     * model (fElemMapSize). Each entry in the second dimension indicates
     * the new state given that input for the first dimension's start
     * state.
     * <p>
     * The fElemMap array handles mapping from element indexes to
     * positions in the second dimension of the transition table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    //private StringPool fStringPool = null;

    /**
     * The string pool of our parser session. This is set during construction
     * and kept around.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fLeafListType[] = null;

    /** Array mapping ANY types to the leaf list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMLeaf fLeafList[] = null;

    /**
     * An array of non-epsilon leaf nodes, which is used during the DFA
     * build operation, then dropped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fLeafCount = 0;

    /**
     * The count of leaf nodes. This is an important number that set some
     * limits on the sizes of data structures in the DFA process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMNode fHeadNode = null;

    /**
     * This is the head node of our intermediate representation. It is
     * only non-null during the building of the DFA (just so that it
     * does not have to be passed all around.) Once the DFA is built,
     * this is no longer required so its nulled out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMStateSet fFollowList[] = null;

    /**
     * The list of follow positions for each NFA position (i.e. for each
     * non-epsilon leaf node.) This is only used during the building of
     * the DFA, and is let go afterwards.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fFinalStateFlags[] = null;

    /**
     * This is an array of booleans, one per state (there are
     * fTransTableSize states in the DFA) that indicates whether that
     * state is a final state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fEOCPos = 0;

    /**
     * The NFA position of the special EOC (end of content) node. This
     * is saved away since it's used during the DFA build.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fMixed;

    /** Boolean to distinguish Schema Mixed Content */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fElemMapSize = 0;

    /** The element map size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fElemMapType[] = null;

    /**
     * This is a map of whether the element map contains information
     * related to ANY models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private QName fElemMap[] = null;

    /**
     * This is the map of unique input symbol elements to indices into
     * each state's per-input symbol transition table entry. This is part
     * of the built DFA information that must be kept around to do the
     * actual validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static final boolean DEBUG_VALIDATE_CONTENT = false;

    /** Set to true to debug content model validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    static {

    /** initializing static members **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static String fEOCString = "<<CMNODE_EOC>>";

    /** End-of-content string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static String fEpsilonString = "<<CMNODE_EPSILON>>";

    /** Epsilon string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
public class DFAContentModel

/**

 * @version $Id: DFAContentModel.java,v 1.4 2010/08/06 23:49:43 joehw Exp $
 * DFAContentModel is the derivative of ContentModel that does
 * all of the non-trivial element content validation. This class does
 * the conversion from the regular expression to the DFA that
 * it then uses in its validation algorithm.
 * <p>
 * <b>Note:</b> Upstream work insures that this class will never see
 * a content model with PCDATA in it. Any model with PCDATA is 'mixed'
 * and is handled via the MixedContentModel class since mixed models
 * are very constrained in form and easily handled via a special case.
 * This also makes implementation of this class much easier.
 *
 * @xerces.internal
 *
 * @version $Id: DFAContentModel.java,v 1.4 2010/08/06 23:49:43 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int postTreeBuildInit(CMNode nodeCur, int curIndex)

    /** Post tree build initialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int[] makeDefStateList()

    /**
     * -1 is used to represent bad transitions in the transition table
     * entry for each state. So each entry is initialized to an all -1
     * array. This method creates a new entry and initializes it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void dumpTree(CMNode nodeCur, int level)

    /**
     * Dumps the tree of the current node to standard output.
     *
     * @param nodeCur The current node.
     * @param level   The maximum levels to output.
     *
     * @exception CMException Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    }

         /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
         else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE

         /***
         else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE)
        {
            // Recurse first
            calcFollowList(((CMUniOp)nodeCur).getChild());

            //
            //  Now handle our level. We use our own first and last position
            //  sets, so get them up front.
            //
            final CMStateSet first = nodeCur.firstPos();
            final CMStateSet last  = nodeCur.lastPos();

            //
            //  For every position which is in our last position set, add all
            //  of our first position states to the follow set for that
            //  position.
            //
            for (int index = 0; index < fLeafCount; index++)
            {
                if (last.getBit(index))
                    fFollowList[index].union(first);
            }
        }
         else if ((nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ONE_OR_MORE)
              ||  (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_ONE))
        {
            throw new RuntimeException("ImplementationMessages.VAL_NIICM");
        }
        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void calcFollowList(CMNode nodeCur)

    /**
     * Calculates the follow list of the current node.
     *
     * @param nodeCur The curent node.
     *
     * @exception CMException Thrown if follow list cannot be calculated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
        int[] fLeafSorter = new int[fLeafCount + fElemMapSize];

        /*****
        if (fLeafNameTypeVector != null) {
            fLeafNameTypeVector.setValues(fElemMap, fElemMapType, fElemMapSize);
        }

        /***
        * Optimization(Jan, 2001); We sort fLeafList according to
        * elemIndex which is *uniquely* associated to each leaf.
        * We are *assuming* that each element appears in at least one leaf.
        **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
            // Get the current leaf's element index

            /****
            if ( (fLeafListType[outIndex] & 0x0f) != 0 ) {
                if (fLeafNameTypeVector == null) {
                    fLeafNameTypeVector = new ContentLeafNameTypeVector();
                }
            }
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private void buildDFA(CMNode syntaxTree)

    /**
     * Builds the internal DFA transition table from the given syntax tree.
     *
     * @param syntaxTree The syntax tree.
     *
     * @exception CMException Thrown if DFA cannot be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    public int validate(QName[] children, int offset, int length) {

    /**
     * Check that the specified content is valid according to this
     * content model. This method can also be called to do 'what if'
     * testing of content models just to see if they would be valid.
     * <p>
     * A value of -1 in the children array indicates a PCDATA node. All other
     * indexes will be positive and represent child elements. The count can be
     * zero, since some elements have the EMPTY content model and that must be
     * confirmed.
     *
     * @param children The children of this element.  Each integer is an index within
     *                 the <code>StringPool</code> of the child element name.  An index
     *                 of -1 is used to indicate an occurrence of non-whitespace character
     *                 data.
     * @param offset Offset into the array where the children starts.
     * @param length The number of entries in the <code>children</code> array.
     *
     * @return The value -1 if fully valid, else the 0 based index of the child
     *         that first failed. If the value returned is equal to the number
     *         of children, then the specified children are valid but additional
     *         content is required to reach a valid ending state.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    public DFAContentModel(CMNode syntaxTree, int leafCount, boolean mixed) {

    /**
     * Constructs a DFA content model.
     *
     * @param syntaxTree    The syntax tree of the content model.
     * @param leafCount     The number of leaves.
     * @param mixed
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private final QName fQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fEmptyContentIsValid = false;

    /**
     * Flag that indicates that even though we have a "complicated"
     * content model, it is valid to have no content. In other words,
     * all parts of the content model are optional. For example:
     * <pre>
     *      &lt;!ELEMENT AllOptional (Optional*,NotRequired?)&gt;
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fTransTableSize = 0;

    /**
     * The number of valid entries in the transition table, and in the other
     * related tables such as fFinalStateFlags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fTransTable[][] = null;

    /**
     * This is the transition table that is the main by product of all
     * of the effort here. It is an array of arrays of ints. The first
     * dimension is the number of states we end up with in the DFA. The
     * second dimensions is the number of unique elements in the content
     * model (fElemMapSize). Each entry in the second dimension indicates
     * the new state given that input for the first dimension's start
     * state.
     * <p>
     * The fElemMap array handles mapping from element indexes to
     * positions in the second dimension of the transition table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    //private StringPool fStringPool = null;

    /**
     * The string pool of our parser session. This is set during construction
     * and kept around.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fLeafListType[] = null;

    /** Array mapping ANY types to the leaf list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMLeaf fLeafList[] = null;

    /**
     * An array of non-epsilon leaf nodes, which is used during the DFA
     * build operation, then dropped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fLeafCount = 0;

    /**
     * The count of leaf nodes. This is an important number that set some
     * limits on the sizes of data structures in the DFA process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMNode fHeadNode = null;

    /**
     * This is the head node of our intermediate representation. It is
     * only non-null during the building of the DFA (just so that it
     * does not have to be passed all around.) Once the DFA is built,
     * this is no longer required so its nulled out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private CMStateSet fFollowList[] = null;

    /**
     * The list of follow positions for each NFA position (i.e. for each
     * non-epsilon leaf node.) This is only used during the building of
     * the DFA, and is let go afterwards.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fFinalStateFlags[] = null;

    /**
     * This is an array of booleans, one per state (there are
     * fTransTableSize states in the DFA) that indicates whether that
     * state is a final state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fEOCPos = 0;

    /**
     * The NFA position of the special EOC (end of content) node. This
     * is saved away since it's used during the DFA build.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private boolean fMixed;

    /** Boolean to distinguish Schema Mixed Content */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fElemMapSize = 0;

    /** The element map size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private int fElemMapType[] = null;

    /**
     * This is a map of whether the element map contains information
     * related to ANY models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private QName fElemMap[] = null;

    /**
     * This is the map of unique input symbol elements to indices into
     * each state's per-input symbol transition table entry. This is part
     * of the built DFA information that must be kept around to do the
     * actual validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static final boolean DEBUG_VALIDATE_CONTENT = false;

    /** Set to true to debug content model validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    static {

    /** initializing static members **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static String fEOCString = "<<CMNODE_EOC>>";

    /** End-of-content string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
    private static String fEpsilonString = "<<CMNODE_EPSILON>>";

    /** Epsilon string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/DFAContentModel.java
public class DFAContentModel

/**

 * @version $Id: DFAContentModel.java,v 1.4 2010/08/06 23:49:43 joehw Exp $
 * DFAContentModel is the derivative of ContentModel that does
 * all of the non-trivial element content validation. This class does
 * the conversion from the regular expression to the DFA that
 * it then uses in its validation algorithm.
 * <p>
 * <b>Note:</b> Upstream work insures that this class will never see
 * a content model with PCDATA in it. Any model with PCDATA is 'mixed'
 * and is handled via the MixedContentModel class since mixed models
 * are very constrained in form and easily handled via a special case.
 * This also makes implementation of this class much easier.
 *
 * @xerces.internal
 *
 * @version $Id: DFAContentModel.java,v 1.4 2010/08/06 23:49:43 joehw Exp $
 */
