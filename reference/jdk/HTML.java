_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static Attribute getAttributeKey(String attName) {

    /**
     * Fetches an attribute constant for a well-known attribute name
     * (i.e. one of the attributes in the set {FACE, COMMENT, SIZE,
     * COLOR, CLEAR, BACKGROUND, BGCOLOR, TEXT, LINK, VLINK, ALINK,
     * WIDTH, HEIGHT, ALIGN, NAME, HREF, REL, REV, TITLE, TARGET,
     * SHAPE, COORDS, ISMAP, NOHREF, ALT, ID, SRC, HSPACE, VSPACE,
     * USEMAP, LOWSRC, CODEBASE, CODE, ARCHIVE, VALUE, VALUETYPE,
     * TYPE, CLASS, STYLE, LANG, DIR, DECLARE, CLASSID, DATA, CODETYPE,
     * STANDBY, BORDER, SHAPES, NOSHADE, COMPACT, START, ACTION, METHOD,
     * ENCTYPE, CHECKED, MAXLENGTH, MULTIPLE, SELECTED, ROWS, COLS,
     * DUMMY, CELLSPACING, CELLPADDING, VALIGN, HALIGN, NOWRAP, ROWSPAN,
     * COLSPAN, PROMPT, HTTPEQUIV, CONTENT, LANGUAGE, VERSION, N,
     * FRAMEBORDER, MARGINWIDTH, MARGINHEIGHT, SCROLLING, NORESIZE,
     * MEDIA, ENDTAG}).
     * If the given name does not represent one of the well-known attributes,
     * then <code>null</code> will be returned.
     *
     * @param attName the <code>String</code> requested
     * @return the <code>Attribute</code> corresponding to <code>attName</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static Attribute[] getAllAttributeKeys() {

    /**
     * Returns the set of HTML attributes recognized.
     * @return the set of HTML attributes recognized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static int getIntegerAttributeValue(AttributeSet attr,
                                               Attribute key, int def) {

    /**
     * Fetches an integer attribute value.  Attribute values
     * are stored as a string, and this is a convenience method
     * to convert to an actual integer.
     *
     * @param attr the set of attributes to use to try to fetch a value
     * @param key the key to use to fetch the value
     * @param def the default value to use if the attribute isn't
     *  defined or there is an error converting to an integer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    static Tag getTagForStyleConstantsKey(StyleConstants sc) {

    /**
     * Returns the HTML <code>Tag</code> associated with the
     * <code>StyleConstants</code> key <code>sc</code>.
     * If no matching <code>Tag</code> is found, returns
     * <code>null</code>.
     *
     * @param sc the <code>StyleConstants</code> key
     * @return tag which corresponds to <code>sc</code>, or
     *   <code>null</code> if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static Tag getTag(String tagName) {

    /**
     * Fetches a tag constant for a well-known tag name (i.e. one of
     * the tags in the set {A, ADDRESS, APPLET, AREA, B,
     * BASE, BASEFONT, BIG,
     * BLOCKQUOTE, BODY, BR, CAPTION, CENTER, CITE, CODE,
     * DD, DFN, DIR, DIV, DL, DT, EM, FONT, FORM, FRAME,
     * FRAMESET, H1, H2, H3, H4, H5, H6, HEAD, HR, HTML,
     * I, IMG, INPUT, ISINDEX, KBD, LI, LINK, MAP, MENU,
     * META, NOBR, NOFRAMES, OBJECT, OL, OPTION, P, PARAM,
     * PRE, SAMP, SCRIPT, SELECT, SMALL, SPAN, STRIKE, S,
     * STRONG, STYLE, SUB, SUP, TABLE, TD, TEXTAREA,
     * TH, TITLE, TR, TT, U, UL, VAR}.  If the given
     * name does not represent one of the well-known tags, then
     * <code>null</code> will be returned.
     *
     * @param tagName the <code>String</code> name requested
     * @return a tag constant corresponding to the <code>tagName</code>,
     *    or <code>null</code> if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static Tag[] getAllTags() {

    /**
     * Returns the set of actual HTML tags that
     * are recognized by the default HTML reader.
     * This set does not include tags that are
     * manufactured by the reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    private static final Hashtable<Object, Tag> scMapping = new Hashtable<Object, Tag>(8);

    /** Maps from StyleConstant key to HTML.Tag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public String toString() {

        /**
         * Returns the string representation of this attribute.
         * @return the string representation of this attribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        Attribute(String id) {

        /**
         * Creates a new <code>Attribute</code> with the specified
         * <code>id</code>.
         *
         * @param id the id of the new <code>Attribute</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static final class Attribute {

    /**
     * Typesafe enumeration representing an HTML
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public boolean equals(Object obj) {

        /**
         * Compares this object to the specified object.
         * The result is <code>true</code> if and only if the argument is not
         * <code>null</code> and is an <code>UnknownTag</code> object
         * with the same name.
         *
         * @param     obj   the object to compare this tag with
         * @return    <code>true</code> if the objects are equal;
         *            <code>false</code> otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public int hashCode() {

        /**
         * Returns the hash code which corresponds to the string
         * for this tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public UnknownTag(String id) {

        /**
         * Creates a new <code>UnknownTag</code> with the specified
         * <code>id</code>.
         * @param id the id of the new tag
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public static final Tag COMMENT = new Tag("comment");

        /**
         * All comments are labeled with this tag.
         * <p>
         * This is a tag synthesized by the HTML reader.
         * Since elements are identified by their tag type,
         * we create a some fake tag types to mark the elements
         * that were manufactured.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public static final Tag CONTENT = new Tag("content");

        /**
         * All text content is labeled with this tag.
         * <p>
         * This is a tag synthesized by the HTML reader.
         * Since elements are identified by their tag type,
         * we create a some fake tag types to mark the elements
         * that were manufactured.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public static final Tag IMPLIED = new Tag("p-implied");

        /**
         * All text content must be in a paragraph element.
         * If a paragraph didn't exist when content was
         * encountered, a paragraph is manufactured.
         * <p>
         * This is a tag synthesized by the HTML reader.
         * Since elements are identified by their tag type,
         * we create a some fake tag types to mark the elements
         * that were manufactured.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        boolean isParagraph() {

        /**
         * Returns <code>true</code> if this tag is considered to be a paragraph
         * in the internal HTML model. <code>false</code> - otherwise.
         *
         * @return <code>true</code> if this tag is considered to be a paragraph
         *         in the internal HTML model. <code>false</code> - otherwise.
         * @see HTMLDocument.HTMLReader.ParagraphAction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public String toString() {

        /**
         * Returns the string representation of the
         * tag.
         *
         * @return the <code>String</code> representation of the tag
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public boolean isPreformatted() {

        /**
         * Returns <code>true</code> if this tag is pre-formatted,
         * which is true if the tag is either <code>PRE</code> or
         * <code>TEXTAREA</code>.
         *
         * @return <code>true</code> if this tag is pre-formatted,
         *   otherwise returns <code>false</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public boolean breaksFlow() {

        /**
         * Returns <code>true</code> if this tag causes a
         * line break to the flow of data, otherwise returns
         * <code>false</code>.
         *
         * @return <code>true</code> if this tag causes a
         *   line break to the flow of data, otherwise returns
         *   <code>false</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public boolean isBlock() {

        /**
         * Returns <code>true</code> if this tag is a block
         * tag, which is a tag used to add structure to a
         * document.
         *
         * @return <code>true</code> if this tag is a block
         *   tag, otherwise returns <code>false</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        protected Tag(String id, boolean causesBreak, boolean isBlock) {

        /**
         * Creates a new <code>Tag</code> with the specified <code>id</code>;
         * <code>causesBreak</code> and <code>isBlock</code> are defined
         * by the user.
         *
         * @param id the id of the new tag
         * @param causesBreak  <code>true</code> if this tag
         *    causes a break to the flow of data
         * @param isBlock <code>true</code> if the tag is used
         *    to add structure to a document
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        protected Tag(String id) {

        /**
         * Creates a new <code>Tag</code> with the specified <code>id</code>,
         * and with <code>causesBreak</code> and <code>isBlock</code>
         * set to <code>false</code>.
         *
         * @param id  the id of the new tag
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
        public Tag() {}

        /** @since 1.3 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
    public static class Tag {

    /**
     * Typesafe enumeration for an HTML tag.  Although the
     * set of HTML tags is a closed set, we have left the
     * set open so that people can add their own tag types
     * to their custom parser and still communicate to the
     * reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HTML.java
public class HTML {

/**
 * Constants used in the <code>HTMLDocument</code>.  These
 * are basically tag and attribute definitions.
 *
 * @author  Timothy Prinzing
 * @author  Sunita Mani
 *
 */
