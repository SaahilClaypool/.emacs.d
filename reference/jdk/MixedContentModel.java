_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    public MixedContentModel(QName[] children, int[] type, int offset, int length , boolean ordered) {

    /**
     * Constructs a mixed content model.
     *
     * @param children The list of allowed children.
     * @param type The list of the types of the children.
     * @param offset The start offset position in the children.
     * @param length The child count.
     * @param ordered True if content must be ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private boolean fOrdered;

    /**
     * True if mixed content model is ordered. DTD mixed content models
     * are <em>always</em> unordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private int fChildrenType[];

    /** The type of the children to support ANY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private QName fChildren[];

    /** The list of possible children that we have to accept. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private int fCount;

    /** The count of possible children that we have to deal with. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
public class MixedContentModel

/**
 * MixedContentModel is a derivative of the abstract content model base
 * class that handles the special case of mixed model elements. If an element
 * is mixed model, it has PCDATA as its first possible content, followed
 * by an alternation of the possible children. The children cannot have any
 * numeration or order, so it must look like this:
 * <pre>
 *   &lt;!ELEMENT Foo ((#PCDATA|a|b|c|)*)&gt;
 * </pre>
 * So, all we have to do is to keep an array of the possible children and
 * validate by just looking up each child being validated by looking it up
 * in the list.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    public MixedContentModel(QName[] children, int[] type, int offset, int length , boolean ordered) {

    /**
     * Constructs a mixed content model.
     *
     * @param children The list of allowed children.
     * @param type The list of the types of the children.
     * @param offset The start offset position in the children.
     * @param length The child count.
     * @param ordered True if content must be ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private boolean fOrdered;

    /**
     * True if mixed content model is ordered. DTD mixed content models
     * are <em>always</em> unordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private int fChildrenType[];

    /** The type of the children to support ANY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private QName fChildren[];

    /** The list of possible children that we have to accept. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
    private int fCount;

    /** The count of possible children that we have to deal with. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/MixedContentModel.java
public class MixedContentModel

/**
 * MixedContentModel is a derivative of the abstract content model base
 * class that handles the special case of mixed model elements. If an element
 * is mixed model, it has PCDATA as its first possible content, followed
 * by an alternation of the possible children. The children cannot have any
 * numeration or order, so it must look like this:
 * <pre>
 *   &lt;!ELEMENT Foo ((#PCDATA|a|b|c|)*)&gt;
 * </pre>
 * So, all we have to do is to keep an array of the possible children and
 * validate by just looking up each child being validated by looking it up
 * in the list.
 *
 * @xerces.internal
 *
 */
