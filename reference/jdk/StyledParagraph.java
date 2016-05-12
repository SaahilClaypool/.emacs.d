_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static Object getGraphicOrFont(
            Map<? extends Attribute, ?> attributes) {

    /**
     * Extract a GraphicAttribute or Font from the given attributes.
     * If attributes does not contain a GraphicAttribute, Font, or
     * Font family entry this method returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    static Map<? extends Attribute, ?>

    /**
     * Return a Map with entries from oldStyles, as well as input
     * method entries, if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addFonts(char[] chars, Map<? extends Attribute, ?> attributes,
                          int start, int limit) {

    /**
     * Resolve the given chars into Fonts using FontResolver, then add
     * font runs for each.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addFont(Object f, int index) {

    /**
     * Add a new Font/GraphicAttribute run with the given object at the
     * given index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addDecoration(Decoration d, int index) {

    /**
     * Add a new Decoration run with the given Decoration at the
     * given index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    @SuppressWarnings({"rawtypes", "unchecked"})

    /**
     * Append the given Object to the given Vector.  Add
     * the given index to the given starts array.  If the
     * starts array does not have room for the index, a
     * new array is created and returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static int findRunContaining(int index, int[] starts) {

    /**
     * Return i such that starts[i] &lt;= index &lt; starts[i+1].  starts
     * must be in increasing order, with at least one element greater
     * than index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public Object getFontOrGraphicAt(int index) {

    /**
     * Return the Font or GraphicAttribute in effect at the given index.
     * The client must test the type of the return value to determine what
     * it is.
     * @param index a valid index in the paragraph
     * @return the Font or GraphicAttribute at index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public Decoration getDecorationAt(int index) {

    /**
     * Return the Decoration in effect at the given index.
     * @param index a valid index in the paragraph
     * @return the Decoration at index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public int getRunLimit(int index) {

    /**
     * Return the index at which there is a different Font, GraphicAttribute, or
     * Dcoration than at the given index.
     * @param index a valid index in the paragraph
     * @return the first index where there is a change in attributes from
     *      those at index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public static StyledParagraph deleteChar(AttributedCharacterIterator aci,
                                             char[] chars,
                                             int deletePos,
                                             StyledParagraph oldParagraph) {

    /**
     * Return a StyledParagraph reflecting the insertion of a single character
     * into the text.  This method will attempt to reuse the given paragraph,
     * but may create a new paragraph.
     * @param aci an iterator over the text.  The text should be the same as the
     *     text used to create (or most recently update) oldParagraph, with
     *     the exception of deleting a single character at deletePos.
     * @param chars the characters in aci
     * @param deletePos the index where a character was removed
     * @param oldParagraph a StyledParagraph for the text in aci before the
     *     insertion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static void deleteFrom(int deleteAt, int[] starts, int numStarts) {

    /**
     * Adjust indices in starts to reflect a deletion after deleteAt.
     * Any index in starts greater than deleteAt will be increased by 1.
     * It is the caller's responsibility to make sure that no 0-length
     * runs result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public static StyledParagraph insertChar(AttributedCharacterIterator aci,
                                             char[] chars,
                                             int insertPos,
                                             StyledParagraph oldParagraph) {

    /**
     * Return a StyledParagraph reflecting the insertion of a single character
     * into the text.  This method will attempt to reuse the given paragraph,
     * but may create a new paragraph.
     * @param aci an iterator over the text.  The text should be the same as the
     *     text used to create (or most recently update) oldParagraph, with
     *     the exception of inserting a single character at insertPos.
     * @param chars the characters in aci
     * @param insertPos the index of the new character in aci
     * @param oldParagraph a StyledParagraph for the text in aci before the
     *     insertion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static void insertInto(int pos, int[] starts, int numStarts) {

    /**
     * Adjust indices in starts to reflect an insertion after pos.
     * Any index in starts greater than pos will be increased by 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public StyledParagraph(AttributedCharacterIterator aci,
                           char[] chars) {

    /**
     * Create a new StyledParagraph over the given styled text.
     * @param aci an iterator over the text
     * @param chars the characters extracted from aci
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
final class StyledParagraph {

/**
 * This class stores Font, GraphicAttribute, and Decoration intervals
 * on a paragraph of styled text.
 * <p>
 * Currently, this class is optimized for a small number of intervals
 * (preferrably 1).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static Object getGraphicOrFont(
            Map<? extends Attribute, ?> attributes) {

    /**
     * Extract a GraphicAttribute or Font from the given attributes.
     * If attributes does not contain a GraphicAttribute, Font, or
     * Font family entry this method returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    static Map<? extends Attribute, ?>

    /**
     * Return a Map with entries from oldStyles, as well as input
     * method entries, if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addFonts(char[] chars, Map<? extends Attribute, ?> attributes,
                          int start, int limit) {

    /**
     * Resolve the given chars into Fonts using FontResolver, then add
     * font runs for each.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addFont(Object f, int index) {

    /**
     * Add a new Font/GraphicAttribute run with the given object at the
     * given index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private void addDecoration(Decoration d, int index) {

    /**
     * Add a new Decoration run with the given Decoration at the
     * given index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    @SuppressWarnings({"rawtypes", "unchecked"})

    /**
     * Append the given Object to the given Vector.  Add
     * the given index to the given starts array.  If the
     * starts array does not have room for the index, a
     * new array is created and returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static int findRunContaining(int index, int[] starts) {

    /**
     * Return i such that starts[i] &lt;= index &lt; starts[i+1].  starts
     * must be in increasing order, with at least one element greater
     * than index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public Object getFontOrGraphicAt(int index) {

    /**
     * Return the Font or GraphicAttribute in effect at the given index.
     * The client must test the type of the return value to determine what
     * it is.
     * @param index a valid index in the paragraph
     * @return the Font or GraphicAttribute at index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public Decoration getDecorationAt(int index) {

    /**
     * Return the Decoration in effect at the given index.
     * @param index a valid index in the paragraph
     * @return the Decoration at index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public int getRunLimit(int index) {

    /**
     * Return the index at which there is a different Font, GraphicAttribute, or
     * Dcoration than at the given index.
     * @param index a valid index in the paragraph
     * @return the first index where there is a change in attributes from
     *      those at index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public static StyledParagraph deleteChar(AttributedCharacterIterator aci,
                                             char[] chars,
                                             int deletePos,
                                             StyledParagraph oldParagraph) {

    /**
     * Return a StyledParagraph reflecting the insertion of a single character
     * into the text.  This method will attempt to reuse the given paragraph,
     * but may create a new paragraph.
     * @param aci an iterator over the text.  The text should be the same as the
     *     text used to create (or most recently update) oldParagraph, with
     *     the exception of deleting a single character at deletePos.
     * @param chars the characters in aci
     * @param deletePos the index where a character was removed
     * @param oldParagraph a StyledParagraph for the text in aci before the
     *     insertion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static void deleteFrom(int deleteAt, int[] starts, int numStarts) {

    /**
     * Adjust indices in starts to reflect a deletion after deleteAt.
     * Any index in starts greater than deleteAt will be increased by 1.
     * It is the caller's responsibility to make sure that no 0-length
     * runs result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public static StyledParagraph insertChar(AttributedCharacterIterator aci,
                                             char[] chars,
                                             int insertPos,
                                             StyledParagraph oldParagraph) {

    /**
     * Return a StyledParagraph reflecting the insertion of a single character
     * into the text.  This method will attempt to reuse the given paragraph,
     * but may create a new paragraph.
     * @param aci an iterator over the text.  The text should be the same as the
     *     text used to create (or most recently update) oldParagraph, with
     *     the exception of inserting a single character at insertPos.
     * @param chars the characters in aci
     * @param insertPos the index of the new character in aci
     * @param oldParagraph a StyledParagraph for the text in aci before the
     *     insertion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    private static void insertInto(int pos, int[] starts, int numStarts) {

    /**
     * Adjust indices in starts to reflect an insertion after pos.
     * Any index in starts greater than pos will be increased by 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
    public StyledParagraph(AttributedCharacterIterator aci,
                           char[] chars) {

    /**
     * Create a new StyledParagraph over the given styled text.
     * @param aci an iterator over the text
     * @param chars the characters extracted from aci
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/StyledParagraph.java
final class StyledParagraph {

/**
 * This class stores Font, GraphicAttribute, and Decoration intervals
 * on a paragraph of styled text.
 * <p>
 * Currently, this class is optimized for a small number of intervals
 * (preferrably 1).
 */
