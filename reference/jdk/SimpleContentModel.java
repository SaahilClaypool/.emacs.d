_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public SimpleContentModel(short operator, QName firstChild, QName secondChild) {

    /**
     * Constructs a simple content model.
     *
     * @param operator The content model operator.
     * @param firstChild qualified name of the first child
     * @param secondChild qualified name of the second child
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private int fOperator;

    /**
     * The operation that this object represents. Since this class only
     * does simple contents, there is only ever a single operation
     * involved (i.e. the children of the operation are always one or
     * two leafs.) This is one of the XMLDTDParams.CONTENTSPECNODE_XXX values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private QName fSecondChild = new QName();

    /**
     * The element decl pool indices of the first (and optional second)
     * child node. The operation code tells us whether the second child
     * is used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private QName fFirstChild = new QName();

    /**
     * The element decl pool indices of the first (and optional second)
     * child node. The operation code tells us whether the second child
     * is used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public static final short SEQUENCE = -1;

    /** SEQUENCE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public static final short CHOICE = -1;

    /** CHOICE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
public class SimpleContentModel

/**
 * SimpleContentModel is a derivative of the abstract content model base
 * class that handles a small set of simple content models that are just
 * way overkill to give the DFA treatment.
 * <p>
 * This class handles the following scenarios:
 * <ul>
 * <li> a
 * <li> a?
 * <li> a*
 * <li> a+
 * <li> a,b
 * <li> a|b
 * </ul>
 * <p>
 * These all involve a unary operation with one element type, or a binary
 * operation with two elements. These are very simple and can be checked
 * in a simple way without a DFA and without the overhead of setting up a
 * DFA for such a simple check.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public SimpleContentModel(short operator, QName firstChild, QName secondChild) {

    /**
     * Constructs a simple content model.
     *
     * @param operator The content model operator.
     * @param firstChild qualified name of the first child
     * @param secondChild qualified name of the second child
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private int fOperator;

    /**
     * The operation that this object represents. Since this class only
     * does simple contents, there is only ever a single operation
     * involved (i.e. the children of the operation are always one or
     * two leafs.) This is one of the XMLDTDParams.CONTENTSPECNODE_XXX values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private QName fSecondChild = new QName();

    /**
     * The element decl pool indices of the first (and optional second)
     * child node. The operation code tells us whether the second child
     * is used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    private QName fFirstChild = new QName();

    /**
     * The element decl pool indices of the first (and optional second)
     * child node. The operation code tells us whether the second child
     * is used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public static final short SEQUENCE = -1;

    /** SEQUENCE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
    public static final short CHOICE = -1;

    /** CHOICE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/SimpleContentModel.java
public class SimpleContentModel

/**
 * SimpleContentModel is a derivative of the abstract content model base
 * class that handles a small set of simple content models that are just
 * way overkill to give the DFA treatment.
 * <p>
 * This class handles the following scenarios:
 * <ul>
 * <li> a
 * <li> a?
 * <li> a*
 * <li> a+
 * <li> a,b
 * <li> a|b
 * </ul>
 * <p>
 * These all involve a unary operation with one element type, or a binary
 * operation with two elements. These are very simple and can be checked
 * in a simple way without a DFA and without the overhead of setting up a
 * DFA for such a simple check.
 *
 * @xerces.internal
 *
 */
