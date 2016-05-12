_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public ArrayList checkMinMaxBounds() {

    /**
     * Used by constant space algorithm for a{n,m} for n > 1 and
     * m <= unbounded. Called by a validator if validation of
     * countent model succeeds after subsuming a{n,m} to a*
     * (or a+) to check the n and m bounds.
     * Returns <code>null</code> if validation of bounds is
     * successful. Returns a list of strings with error info
     * if not. Even entries in list returned are error codes
     * (used to look up properties) and odd entries are parameters
     * to be passed when formatting error message. Each parameter
     * is associated with the error code that preceeds it in
     * the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public Vector whatCanGoHere(int[] state) {

    /**
     * Check which elements are valid to appear at this point. This method also
     * works if the state is in error, in which case it returns what should
     * have been seen.
     *
     * @param state  the current state
     * @return       a Vector whose entries are instances of
     *               either XSWildcardDecl or XSElementDecl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void postTreeBuildInit(CMNode nodeCur) throws RuntimeException {

    /** Post tree build initialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int[] makeDefStateList()

    /**
     * -1 is used to represent bad transitions in the transition table
     * entry for each state. So each entry is initialized to an all -1
     * array. This method creates a new entry and initializes it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void dumpTree(CMNode nodeCur, int level) {

    /**
     * Dumps the tree of the current node to standard output.
     *
     * @param nodeCur The current node.
     * @param level   The maximum levels to output.
     *
     * @exception RuntimeException Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void calcFollowList(CMNode nodeCur) {

    /**
     * Calculates the follow list of the current node.
     *
     * @param nodeCur The curent node.
     *
     * @exception RuntimeException Thrown if follow list cannot be calculated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
        int[] fLeafSorter = new int[fLeafCount + fElemMapSize];

        /***
         * Optimization(Jan, 2001); We sort fLeafList according to
         * elemIndex which is *uniquely* associated to each leaf.
         * We are *assuming* that each element appears in at least one leaf.
         **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void buildDFA(CMNode syntaxTree) {

    /**
     * Builds the internal DFA transition table from the given syntax tree.
     *
     * @param syntaxTree The syntax tree.
     *
     * @exception RuntimeException Thrown if DFA cannot be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public Object oneTransition(QName curElem, int[] state, SubstitutionGroupHandler subGroupHandler) {

    /**
     * one transition only
     *
     * @param curElem The current element's QName
     * @param state stack to store the previous state
     * @param subGroupHandler the substitution group handler
     *
     * @return  null if transition is invalid; otherwise the Object corresponding to the
     *      XSElementDecl or XSWildcardDecl identified.  Also, the
     *      state array will be modified to include the new state; this so that the validator can
     *      store it away.
     *
     * @exception RuntimeException thrown on error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public boolean isFinalState (int state) {

    /**
     * check whether the given state is one of the final states
     *
     * @param state       the state to check
     *
     * @return whether it's a final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
   public XSDFACM(CMNode syntaxTree, int leafCount) {

    /**
     * Constructs a DFA content model.
     *
     * @param syntaxTree    The syntax tree of the content model.
     * @param leafCount     The number of leaves.
     *
     * @exception RuntimeException Thrown if DFA can't be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounterUpperBound[];   // -1 if no upper bound

    /**
     * Array of upper bounds for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. This array
     * stores the n's for those elements (or wildcards) for which
     * the constant space algorithm applies, or -1 if algorithm does
     * not apply or m = unbounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounterLowerBound[];

    /**
     * Array of lower bounds for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. This array
     * stores the n's for those elements (or wildcards) for which
     * the constant space algorithm applies (or -1 otherwise).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounter[];

    /**
     * Array of counters for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. Used
     * to count the a's to later check against n and m. Counter
     * set to -1 if element (or wildcard) not optimized by
     * constant space algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fTransTableSize = 0;

    /**
     * The number of valid entries in the transition table, and in the other
     * related tables such as fFinalStateFlags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fLeafListType[] = null;

    /** Array mapping ANY types to the leaf list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private XSCMLeaf fLeafList[] = null;

    /**
     * An array of non-epsilon leaf nodes, which is used during the DFA
     * build operation, then dropped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fLeafCount = 0;

    /**
     * The count of leaf nodes. This is an important number that set some
     * limits on the sizes of data structures in the DFA process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private CMNode fHeadNode = null;

    /**
     * This is the head node of our intermediate representation. It is
     * only non-null during the building of the DFA (just so that it
     * does not have to be passed all around.) Once the DFA is built,
     * this is no longer required so its nulled out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private CMStateSet fFollowList[] = null;

    /**
     * The list of follow positions for each NFA position (i.e. for each
     * non-epsilon leaf node.) This is only used during the building of
     * the DFA, and is let go afterwards.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private boolean fFinalStateFlags[] = null;

    /**
     * This is an array of booleans, one per state (there are
     * fTransTableSize states in the DFA) that indicates whether that
     * state is a final state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapSize = 0;

    /** The element map size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapId[] = null;

    /**
     * id of the unique input symbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapType[] = null;

    /**
     * This is a map of whether the element map contains information
     * related to ANY models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private Object fElemMap[] = null;

    /**
     * This is the map of unique input symbol elements to indices into
     * each state's per-input symbol transition table entry. This is part
     * of the built DFA information that must be kept around to do the
     * actual validation.  Note tat since either XSElementDecl or XSParticleDecl object
     * can live here, we've got to use an Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private static final boolean DEBUG_VALIDATE_CONTENT = false;

    /** Set to true to debug content model validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
public class XSDFACM

/**
 * DFAContentModel is the implementation of XSCMValidator that does
 * all of the non-trivial element content validation. This class does
 * the conversion from the regular expression to the DFA that
 * it then uses in its validation algorithm.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XSDFACM.java,v 1.9 2010/08/06 23:49:43 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public ArrayList checkMinMaxBounds() {

    /**
     * Used by constant space algorithm for a{n,m} for n > 1 and
     * m <= unbounded. Called by a validator if validation of
     * countent model succeeds after subsuming a{n,m} to a*
     * (or a+) to check the n and m bounds.
     * Returns <code>null</code> if validation of bounds is
     * successful. Returns a list of strings with error info
     * if not. Even entries in list returned are error codes
     * (used to look up properties) and odd entries are parameters
     * to be passed when formatting error message. Each parameter
     * is associated with the error code that preceeds it in
     * the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public Vector whatCanGoHere(int[] state) {

    /**
     * Check which elements are valid to appear at this point. This method also
     * works if the state is in error, in which case it returns what should
     * have been seen.
     *
     * @param state  the current state
     * @return       a Vector whose entries are instances of
     *               either XSWildcardDecl or XSElementDecl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void postTreeBuildInit(CMNode nodeCur) throws RuntimeException {

    /** Post tree build initialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int[] makeDefStateList()

    /**
     * -1 is used to represent bad transitions in the transition table
     * entry for each state. So each entry is initialized to an all -1
     * array. This method creates a new entry and initializes it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void dumpTree(CMNode nodeCur, int level) {

    /**
     * Dumps the tree of the current node to standard output.
     *
     * @param nodeCur The current node.
     * @param level   The maximum levels to output.
     *
     * @exception RuntimeException Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void calcFollowList(CMNode nodeCur) {

    /**
     * Calculates the follow list of the current node.
     *
     * @param nodeCur The curent node.
     *
     * @exception RuntimeException Thrown if follow list cannot be calculated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
        int[] fLeafSorter = new int[fLeafCount + fElemMapSize];

        /***
         * Optimization(Jan, 2001); We sort fLeafList according to
         * elemIndex which is *uniquely* associated to each leaf.
         * We are *assuming* that each element appears in at least one leaf.
         **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private void buildDFA(CMNode syntaxTree) {

    /**
     * Builds the internal DFA transition table from the given syntax tree.
     *
     * @param syntaxTree The syntax tree.
     *
     * @exception RuntimeException Thrown if DFA cannot be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public Object oneTransition(QName curElem, int[] state, SubstitutionGroupHandler subGroupHandler) {

    /**
     * one transition only
     *
     * @param curElem The current element's QName
     * @param state stack to store the previous state
     * @param subGroupHandler the substitution group handler
     *
     * @return  null if transition is invalid; otherwise the Object corresponding to the
     *      XSElementDecl or XSWildcardDecl identified.  Also, the
     *      state array will be modified to include the new state; this so that the validator can
     *      store it away.
     *
     * @exception RuntimeException thrown on error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    public boolean isFinalState (int state) {

    /**
     * check whether the given state is one of the final states
     *
     * @param state       the state to check
     *
     * @return whether it's a final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
   public XSDFACM(CMNode syntaxTree, int leafCount) {

    /**
     * Constructs a DFA content model.
     *
     * @param syntaxTree    The syntax tree of the content model.
     * @param leafCount     The number of leaves.
     *
     * @exception RuntimeException Thrown if DFA can't be built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounterUpperBound[];   // -1 if no upper bound

    /**
     * Array of upper bounds for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. This array
     * stores the n's for those elements (or wildcards) for which
     * the constant space algorithm applies, or -1 if algorithm does
     * not apply or m = unbounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounterLowerBound[];

    /**
     * Array of lower bounds for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. This array
     * stores the n's for those elements (or wildcards) for which
     * the constant space algorithm applies (or -1 otherwise).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapCounter[];

    /**
     * Array of counters for all the for elements (or wildcards)
     * of the form a{n,m} where n > 1 and m <= unbounded. Used
     * to count the a's to later check against n and m. Counter
     * set to -1 if element (or wildcard) not optimized by
     * constant space algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fTransTableSize = 0;

    /**
     * The number of valid entries in the transition table, and in the other
     * related tables such as fFinalStateFlags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fLeafListType[] = null;

    /** Array mapping ANY types to the leaf list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private XSCMLeaf fLeafList[] = null;

    /**
     * An array of non-epsilon leaf nodes, which is used during the DFA
     * build operation, then dropped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fLeafCount = 0;

    /**
     * The count of leaf nodes. This is an important number that set some
     * limits on the sizes of data structures in the DFA process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private CMNode fHeadNode = null;

    /**
     * This is the head node of our intermediate representation. It is
     * only non-null during the building of the DFA (just so that it
     * does not have to be passed all around.) Once the DFA is built,
     * this is no longer required so its nulled out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private CMStateSet fFollowList[] = null;

    /**
     * The list of follow positions for each NFA position (i.e. for each
     * non-epsilon leaf node.) This is only used during the building of
     * the DFA, and is let go afterwards.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private boolean fFinalStateFlags[] = null;

    /**
     * This is an array of booleans, one per state (there are
     * fTransTableSize states in the DFA) that indicates whether that
     * state is a final state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapSize = 0;

    /** The element map size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapId[] = null;

    /**
     * id of the unique input symbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private int fElemMapType[] = null;

    /**
     * This is a map of whether the element map contains information
     * related to ANY models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private Object fElemMap[] = null;

    /**
     * This is the map of unique input symbol elements to indices into
     * each state's per-input symbol transition table entry. This is part
     * of the built DFA information that must be kept around to do the
     * actual validation.  Note tat since either XSElementDecl or XSParticleDecl object
     * can live here, we've got to use an Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
    private static final boolean DEBUG_VALIDATE_CONTENT = false;

    /** Set to true to debug content model validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSDFACM.java
public class XSDFACM

/**
 * DFAContentModel is the implementation of XSCMValidator that does
 * all of the non-trivial element content validation. This class does
 * the conversion from the regular expression to the DFA that
 * it then uses in its validation algorithm.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XSDFACM.java,v 1.9 2010/08/06 23:49:43 joehw Exp $
 */
