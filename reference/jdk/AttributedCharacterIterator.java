_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public Set<Attribute> getAllAttributeKeys();

    /**
     * Returns the keys of all attributes defined on the
     * iterator's text range. The set is empty if no
     * attributes are defined.
     *
     * @return the keys of all attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public Object getAttribute(Attribute attribute);

    /**
     * Returns the value of the named {@code attribute} for the current character.
     * Returns {@code null} if the {@code attribute} is not defined.
     *
     * @param attribute the desired attribute
     * @return the value of the named {@code attribute} or {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public Map<Attribute,Object> getAttributes();

    /**
     * Returns a map with the attributes defined on the current
     * character.
     *
     * @return a map with the attributes defined on the current character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunLimit(Set<? extends Attribute> attributes);

    /**
     * Returns the index of the first character following the run
     * with respect to the given {@code attributes} containing the current character.
     *
     * @param attributes a set of the desired attributes
     * @return the index of the first character following the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunLimit(Attribute attribute);

    /**
     * Returns the index of the first character following the run
     * with respect to the given {@code attribute} containing the current character.
     *
     * @param attribute the desired attribute
     * @return the index of the first character following the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunLimit();

    /**
     * Returns the index of the first character following the run
     * with respect to all attributes containing the current character.
     *
     * <p>Any contiguous text segments having the same attributes (the
     * same set of attribute/value pairs) are treated as separate runs
     * if the attributes have been given to those text segments separately.
     *
     * @return the index of the first character following the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunStart(Set<? extends Attribute> attributes);

    /**
     * Returns the index of the first character of the run
     * with respect to the given {@code attributes} containing the current character.
     *
     * @param attributes a set of the desired attributes.
     * @return the index of the first character of the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunStart(Attribute attribute);

    /**
     * Returns the index of the first character of the run
     * with respect to the given {@code attribute} containing the current character.
     *
     * @param attribute the desired attribute.
     * @return the index of the first character of the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public int getRunStart();

    /**
     * Returns the index of the first character of the run
     * with respect to all attributes containing the current character.
     *
     * <p>Any contiguous text segments having the same attributes (the
     * same set of attribute/value pairs) are treated as separate runs
     * if the attributes have been given to those text segments separately.
     *
     * @return the index of the first character of the run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public static final Attribute INPUT_METHOD_SEGMENT = new Attribute("input_method_segment");

        /**
         * Attribute key for input method segments. Input methods often break
         * up text into segments, which usually correspond to words.
         * <p>Values are instances of {@link Annotation} holding a {@code null} reference.
         * @see Annotation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public static final Attribute READING = new Attribute("reading");

        /**
         * Attribute key for the reading of some text. In languages where the written form
         * and the pronunciation of a word are only loosely related (such as Japanese),
         * it is often necessary to store the reading (pronunciation) along with the
         * written form.
         * <p>Values are instances of {@link Annotation} holding instances of {@link String}.
         *
         * @see Annotation
         * @see java.lang.String
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public static final Attribute LANGUAGE = new Attribute("language");

        /**
         * Attribute key for the language of some text.
         * <p> Values are instances of {@link java.util.Locale Locale}.
         * @see java.util.Locale
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        protected Object readResolve() throws InvalidObjectException {

        /**
         * Resolves instances being deserialized to the predefined constants.
         *
         * @return the resolved {@code Attribute} object
         * @throws InvalidObjectException if the object to resolve is not
         *                                an instance of {@code Attribute}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        protected String getName() {

        /**
         * Returns the name of the attribute.
         *
         * @return the name of {@code Attribute}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public String toString() {

        /**
         * Returns a string representation of the object. This version returns the
         * concatenation of class name, {@code "("}, a name identifying the attribute
         * and {@code ")"}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public final int hashCode() {

        /**
         * Returns a hash code value for the object. This version is identical to
         * the one in {@code Object}, but is also final.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        public final boolean equals(Object obj) {

        /**
         * Compares two objects for equality. This version only returns true
         * for {@code x.equals(y)} if {@code x} and {@code y} refer
         * to the same object, and guarantees this for all subclasses.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        protected Attribute(String name) {

        /**
         * Constructs an {@code Attribute} with the given name.
         *
         * @param name the name of {@code Attribute}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
        private String name;

        /**
         * The name of this {@code Attribute}. The name is used primarily by {@code readResolve}
         * to look up the corresponding predefined instance when deserializing
         * an instance.
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
    public static class Attribute implements Serializable {

    /**
     * Defines attribute keys that are used to identify text attributes. These
     * keys are used in {@code AttributedCharacterIterator} and {@code AttributedString}.
     * @see AttributedCharacterIterator
     * @see AttributedString
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedCharacterIterator.java
public interface AttributedCharacterIterator extends CharacterIterator {

/**
 * An {@code AttributedCharacterIterator} allows iteration through both text and
 * related attribute information.
 *
 * <p>
 * An attribute is a key/value pair, identified by the key.  No two
 * attributes on a given character can have the same key.
 *
 * <p>The values for an attribute are immutable, or must not be mutated
 * by clients or storage.  They are always passed by reference, and not
 * cloned.
 *
 * <p>A <em>run with respect to an attribute</em> is a maximum text range for
 * which:
 * <ul>
 * <li>the attribute is undefined or {@code null} for the entire range, or
 * <li>the attribute value is defined and has the same non-{@code null} value for the
 *     entire range.
 * </ul>
 *
 * <p>A <em>run with respect to a set of attributes</em> is a maximum text range for
 * which this condition is met for each member attribute.
 *
 * <p>When getting a run with no explicit attributes specified (i.e.,
 * calling {@link #getRunStart()} and {@link #getRunLimit()}), any
 * contiguous text segments having the same attributes (the same set
 * of attribute/value pairs) are treated as separate runs if the
 * attributes have been given to those text segments separately.
 *
 * <p>The returned indexes are limited to the range of the iterator.
 *
 * <p>The returned attribute information is limited to runs that contain
 * the current character.
 *
 * <p>
 * Attribute keys are instances of {@link AttributedCharacterIterator.Attribute} and its
 * subclasses, such as {@link java.awt.font.TextAttribute}.
 *
 * @see AttributedCharacterIterator.Attribute
 * @see java.awt.font.TextAttribute
 * @see AttributedString
 * @see Annotation
 * @since 1.2
 */
