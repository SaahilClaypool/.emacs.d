_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public TextHitInfo getOffsetHit(int delta) {

    /**
     * Creates a <code>TextHitInfo</code> whose character index is offset
     * by <code>delta</code> from the <code>charIndex</code> of this
     * <code>TextHitInfo</code>. This <code>TextHitInfo</code> remains
     * unchanged.
     * @param delta the value to offset this <code>charIndex</code>
     * @return a <code>TextHitInfo</code> whose <code>charIndex</code> is
     * offset by <code>delta</code> from the <code>charIndex</code> of
     * this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public TextHitInfo getOtherHit() {

    /**
     * Creates a <code>TextHitInfo</code> on the other side of the
     * insertion point.  This <code>TextHitInfo</code> remains unchanged.
     * @return a <code>TextHitInfo</code> on the other side of the
     * insertion point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo afterOffset(int offset) {

    /**
     * Creates a <code>TextHitInfo</code> at the specified offset,
     * associated with the character after the offset.
     * @param offset an offset associated with the character after
     * the offset
     * @return a <code>TextHitInfo</code> at the specified offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo beforeOffset(int offset) {

    /**
     * Creates a <code>TextHitInfo</code> at the specified offset,
     * associated with the character before the offset.
     * @param offset an offset associated with the character before
     * the offset
     * @return a <code>TextHitInfo</code> at the specified offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo trailing(int charIndex) {

    /**
     * Creates a hit on the trailing edge of the character at
     * the specified <code>charIndex</code>.
     * @param charIndex the index of the character hit
     * @return a <code>TextHitInfo</code> on the trailing edge of the
     * character at the specified <code>charIndex</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo leading(int charIndex) {

    /**
     * Creates a <code>TextHitInfo</code> on the leading edge of the
     * character at the specified <code>charIndex</code>.
     * @param charIndex the index of the character hit
     * @return a <code>TextHitInfo</code> on the leading edge of the
     * character at the specified <code>charIndex</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public String toString() {

    /**
     * Returns a <code>String</code> representing the hit for debugging
     * use only.
     * @return a <code>String</code> representing this
     * <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean equals(TextHitInfo hitInfo) {

    /**
     * Returns <code>true</code> if the specified <code>TextHitInfo</code>
     * has the same <code>charIndex</code> and <code>isLeadingEdge</code>
     * as this <code>TextHitInfo</code>.  This is not the same as having
     * the same insertion offset.
     * @param hitInfo a specified <code>TextHitInfo</code>
     * @return <code>true</code> if the specified <code>TextHitInfo</code>
     * has the same <code>charIndex</code> and <code>isLeadingEdge</code>
     * as this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean equals(Object obj) {

    /**
     * Returns <code>true</code> if the specified <code>Object</code> is a
     * <code>TextHitInfo</code> and equals this <code>TextHitInfo</code>.
     * @param obj the <code>Object</code> to test for equality
     * @return <code>true</code> if the specified <code>Object</code>
     * equals this <code>TextHitInfo</code>; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int hashCode() {

    /**
     * Returns the hash code.
     * @return the hash code of this <code>TextHitInfo</code>, which is
     * also the <code>charIndex</code> of this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int getInsertionIndex() {

    /**
     * Returns the insertion index.  This is the character index if
     * the leading edge of the character was hit, and one greater
     * than the character index if the trailing edge was hit.
     * @return the insertion index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean isLeadingEdge() {

    /**
     * Returns <code>true</code> if the leading edge of the character was
     * hit.
     * @return <code>true</code> if the leading edge of the character was
     * hit; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int getCharIndex() {

    /**
     * Returns the index of the character hit.
     * @return the index of the character hit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    private TextHitInfo(int charIndex, boolean isLeadingEdge) {

    /**
     * Constructs a new <code>TextHitInfo</code>.
     * @param charIndex the index of the character hit
     * @param isLeadingEdge <code>true</code> if the leading edge of the
     * character was hit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
public final class TextHitInfo {

/**
 * The <code>TextHitInfo</code> class represents a character position in a
 * text model, and a <b>bias</b>, or "side," of the character.  Biases are
 * either <EM>leading</EM> (the left edge, for a left-to-right character)
 * or <EM>trailing</EM> (the right edge, for a left-to-right character).
 * Instances of <code>TextHitInfo</code> are used to specify caret and
 * insertion positions within text.
 * <p>
 * For example, consider the text "abc".  TextHitInfo.trailing(1)
 * corresponds to the right side of the 'b' in the text.
 * <p>
 * <code>TextHitInfo</code> is used primarily by {@link TextLayout} and
 * clients of <code>TextLayout</code>.  Clients of <code>TextLayout</code>
 * query <code>TextHitInfo</code> instances for an insertion offset, where
 * new text is inserted into the text model.  The insertion offset is equal
 * to the character position in the <code>TextHitInfo</code> if the bias
 * is leading, and one character after if the bias is trailing.  The
 * insertion offset for TextHitInfo.trailing(1) is 2.
 * <p>
 * Sometimes it is convenient to construct a <code>TextHitInfo</code> with
 * the same insertion offset as an existing one, but on the opposite
 * character.  The <code>getOtherHit</code> method constructs a new
 * <code>TextHitInfo</code> with the same insertion offset as an existing
 * one, with a hit on the character on the other side of the insertion offset.
 * Calling <code>getOtherHit</code> on trailing(1) would return leading(2).
 * In general, <code>getOtherHit</code> for trailing(n) returns
 * leading(n+1) and <code>getOtherHit</code> for leading(n)
 * returns trailing(n-1).
 * <p>
 * <strong>Example</strong>:<p>
 * Converting a graphical point to an insertion point within a text
 * model
 * <blockquote><pre>
 * TextLayout layout = ...;
 * Point2D.Float hitPoint = ...;
 * TextHitInfo hitInfo = layout.hitTestChar(hitPoint.x, hitPoint.y);
 * int insPoint = hitInfo.getInsertionIndex();
 * // insPoint is relative to layout;  may need to adjust for use
 * // in a text model
 * </pre></blockquote>
 *
 * @see TextLayout
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public TextHitInfo getOffsetHit(int delta) {

    /**
     * Creates a <code>TextHitInfo</code> whose character index is offset
     * by <code>delta</code> from the <code>charIndex</code> of this
     * <code>TextHitInfo</code>. This <code>TextHitInfo</code> remains
     * unchanged.
     * @param delta the value to offset this <code>charIndex</code>
     * @return a <code>TextHitInfo</code> whose <code>charIndex</code> is
     * offset by <code>delta</code> from the <code>charIndex</code> of
     * this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public TextHitInfo getOtherHit() {

    /**
     * Creates a <code>TextHitInfo</code> on the other side of the
     * insertion point.  This <code>TextHitInfo</code> remains unchanged.
     * @return a <code>TextHitInfo</code> on the other side of the
     * insertion point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo afterOffset(int offset) {

    /**
     * Creates a <code>TextHitInfo</code> at the specified offset,
     * associated with the character after the offset.
     * @param offset an offset associated with the character after
     * the offset
     * @return a <code>TextHitInfo</code> at the specified offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo beforeOffset(int offset) {

    /**
     * Creates a <code>TextHitInfo</code> at the specified offset,
     * associated with the character before the offset.
     * @param offset an offset associated with the character before
     * the offset
     * @return a <code>TextHitInfo</code> at the specified offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo trailing(int charIndex) {

    /**
     * Creates a hit on the trailing edge of the character at
     * the specified <code>charIndex</code>.
     * @param charIndex the index of the character hit
     * @return a <code>TextHitInfo</code> on the trailing edge of the
     * character at the specified <code>charIndex</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public static TextHitInfo leading(int charIndex) {

    /**
     * Creates a <code>TextHitInfo</code> on the leading edge of the
     * character at the specified <code>charIndex</code>.
     * @param charIndex the index of the character hit
     * @return a <code>TextHitInfo</code> on the leading edge of the
     * character at the specified <code>charIndex</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public String toString() {

    /**
     * Returns a <code>String</code> representing the hit for debugging
     * use only.
     * @return a <code>String</code> representing this
     * <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean equals(TextHitInfo hitInfo) {

    /**
     * Returns <code>true</code> if the specified <code>TextHitInfo</code>
     * has the same <code>charIndex</code> and <code>isLeadingEdge</code>
     * as this <code>TextHitInfo</code>.  This is not the same as having
     * the same insertion offset.
     * @param hitInfo a specified <code>TextHitInfo</code>
     * @return <code>true</code> if the specified <code>TextHitInfo</code>
     * has the same <code>charIndex</code> and <code>isLeadingEdge</code>
     * as this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean equals(Object obj) {

    /**
     * Returns <code>true</code> if the specified <code>Object</code> is a
     * <code>TextHitInfo</code> and equals this <code>TextHitInfo</code>.
     * @param obj the <code>Object</code> to test for equality
     * @return <code>true</code> if the specified <code>Object</code>
     * equals this <code>TextHitInfo</code>; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int hashCode() {

    /**
     * Returns the hash code.
     * @return the hash code of this <code>TextHitInfo</code>, which is
     * also the <code>charIndex</code> of this <code>TextHitInfo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int getInsertionIndex() {

    /**
     * Returns the insertion index.  This is the character index if
     * the leading edge of the character was hit, and one greater
     * than the character index if the trailing edge was hit.
     * @return the insertion index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public boolean isLeadingEdge() {

    /**
     * Returns <code>true</code> if the leading edge of the character was
     * hit.
     * @return <code>true</code> if the leading edge of the character was
     * hit; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    public int getCharIndex() {

    /**
     * Returns the index of the character hit.
     * @return the index of the character hit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
    private TextHitInfo(int charIndex, boolean isLeadingEdge) {

    /**
     * Constructs a new <code>TextHitInfo</code>.
     * @param charIndex the index of the character hit
     * @param isLeadingEdge <code>true</code> if the leading edge of the
     * character was hit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextHitInfo.java
public final class TextHitInfo {

/**
 * The <code>TextHitInfo</code> class represents a character position in a
 * text model, and a <b>bias</b>, or "side," of the character.  Biases are
 * either <EM>leading</EM> (the left edge, for a left-to-right character)
 * or <EM>trailing</EM> (the right edge, for a left-to-right character).
 * Instances of <code>TextHitInfo</code> are used to specify caret and
 * insertion positions within text.
 * <p>
 * For example, consider the text "abc".  TextHitInfo.trailing(1)
 * corresponds to the right side of the 'b' in the text.
 * <p>
 * <code>TextHitInfo</code> is used primarily by {@link TextLayout} and
 * clients of <code>TextLayout</code>.  Clients of <code>TextLayout</code>
 * query <code>TextHitInfo</code> instances for an insertion offset, where
 * new text is inserted into the text model.  The insertion offset is equal
 * to the character position in the <code>TextHitInfo</code> if the bias
 * is leading, and one character after if the bias is trailing.  The
 * insertion offset for TextHitInfo.trailing(1) is 2.
 * <p>
 * Sometimes it is convenient to construct a <code>TextHitInfo</code> with
 * the same insertion offset as an existing one, but on the opposite
 * character.  The <code>getOtherHit</code> method constructs a new
 * <code>TextHitInfo</code> with the same insertion offset as an existing
 * one, with a hit on the character on the other side of the insertion offset.
 * Calling <code>getOtherHit</code> on trailing(1) would return leading(2).
 * In general, <code>getOtherHit</code> for trailing(n) returns
 * leading(n+1) and <code>getOtherHit</code> for leading(n)
 * returns trailing(n-1).
 * <p>
 * <strong>Example</strong>:<p>
 * Converting a graphical point to an insertion point within a text
 * model
 * <blockquote><pre>
 * TextLayout layout = ...;
 * Point2D.Float hitPoint = ...;
 * TextHitInfo hitInfo = layout.hitTestChar(hitPoint.x, hitPoint.y);
 * int insPoint = hitInfo.getInsertionIndex();
 * // insPoint is relative to layout;  may need to adjust for use
 * // in a text model
 * </pre></blockquote>
 *
 * @see TextLayout
 */
