_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    SourcePosition position();

    /**
     * Return the source position of the first line of the
     * corresponding declaration, or null if
     * no position is available.  A default constructor returns
     * null because it has no location in the source file.
     *
     * @since 1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isIncluded();

    /**
     * Return true if this Doc item is
     * <a href="{@docRoot}/com/sun/javadoc/package-summary.html#included">included</a>
     * in the result set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isClass();

    /**
     * Is this Doc item a
     * <a href="{@docRoot}/com/sun/javadoc/package-summary.html#class">class</a>
     * (and not an interface or annotation type)?
     * This includes ordinary classes, enums, errors and exceptions.
     *
     * @return true if it represents a class
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isOrdinaryClass();

    /**
     * Is this Doc item an
     * <a href="{@docRoot}/com/sun/javadoc/package-summary.html#class">ordinary
     * class</a>?
     * (i.e. not an interface, annotation type, enum, exception, or error)?
     *
     * @return true if it represents an ordinary class
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isAnnotationType();

    /**
     * Is this Doc item an annotation type?
     *
     * @return true if it represents an annotation type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isEnum();

    /**
     * Is this Doc item an enum type?
     *
     * @return true if it represents an enum type
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isError();

    /**
     * Is this Doc item an error class?
     *
     * @return true if it represents a error
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isException();

    /**
     * Is this Doc item an exception class?
     *
     * @return true if it represents an exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isInterface();

    /**
     * Is this Doc item an interface (but not an annotation type)?
     *
     * @return true if it represents an interface
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isAnnotationTypeElement();

    /**
     * Is this Doc item an annotation type element?
     *
     * @return true if it represents an annotation type element
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isMethod();

    /**
     * Is this Doc item a method (but not a constructor or annotation
     * type element)?
     *
     * @return true if it represents a method
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isConstructor();

    /**
     * Is this Doc item a constructor?
     *
     * @return true if it represents a constructor
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isEnumConstant();

    /**
     * Is this Doc item an enum constant?
     *
     * @return true if it represents an enum constant
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    boolean isField();

    /**
     * Is this Doc item a field (but not an enum constant)?
     *
     * @return true if it represents a field
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    int compareTo(Object obj);

    /**
     * Compares this doc object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this doc object is less
     * than, equal to, or greater than the given object.
     * <p>
     * This method satisfies the {@link java.lang.Comparable} interface.
     *
     * @param   obj  the <code>Object</code> to be compared.
     * @return  a negative integer, zero, or a positive integer as this Object
     *      is less than, equal to, or greater than the given Object.
     * @exception ClassCastException the specified Object's type prevents it
     *        from being compared to this Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    String name();

    /**
     * Returns the non-qualified name of this Doc item.
     *
     * @return  the name
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    void setRawCommentText(String rawDocumentation);

    /**
     * Set the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    String getRawCommentText();

    /**
     * Return the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    Tag[] firstSentenceTags();

    /**
     * Return the first sentence of the comment as an array of tags.
     * Includes inline tags
     * (i.e. {&#64;link <i>reference</i>} tags)  but not
     * block tags.
     * Each section of plain text is represented as a {@link Tag}
     * of {@linkplain Tag#kind() kind} "Text".
     * Inline tags are represented as a {@link SeeTag} of kind "@see"
     * and name "@link".
     * <p>
     * If the locale is English language, the first sentence is
     * determined by the rules described in the Java Language
     * Specification (first version): &quot;This sentence ends
     * at the first period that is followed by a blank, tab, or
     * line terminator or at the first tagline.&quot;, in
     * addition a line will be terminated by block
     * HTML tags: &lt;p&gt;  &lt;/p&gt;  &lt;h1&gt;
     * &lt;h2&gt;  &lt;h3&gt; &lt;h4&gt;  &lt;h5&gt;  &lt;h6&gt;
     * &lt;hr&gt;  &lt;pre&gt;  or &lt;/pre&gt;.
     * If the locale is not English, the sentence end will be
     * determined by
     * {@link BreakIterator#getSentenceInstance(Locale)}.

     * @return an array of {@link Tag}s representing the
     * first sentence of the comment
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    Tag[] inlineTags();

    /**
     * Return comment as an array of tags. Includes inline tags
     * (i.e. {&#64;link <i>reference</i>} tags)  but not
     * block tags.
     * Each section of plain text is represented as a {@link Tag}
     * of {@linkplain Tag#kind() kind} "Text".
     * Inline tags are represented as a {@link SeeTag} of kind "@see"
     * and name "@link".
     *
     * @return an array of {@link Tag}s representing the comment
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    SeeTag[] seeTags();

    /**
     * Return the see also tags in this Doc item.
     *
     * @return an array of SeeTag containing all @see tags.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    Tag[] tags(String tagname);

    /**
     * Return tags of the specified {@linkplain Tag#kind() kind} in
     * this Doc item.
     *
     * For example, if 'tagname' has value "@serial", all tags in
     * this Doc item of kind "@serial" will be returned.
     *
     * @param tagname name of the tag kind to search for.
     * @return an array of Tag containing all tags whose 'kind()'
     * matches 'tagname'.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    Tag[] tags();

    /**
     * Return all tags in this Doc item.
     *
     * @return an array of {@link Tag} objects containing all tags on
     *         this Doc item.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
    String commentText();

    /**
     * Return the text of the comment for this doc item.
     * Tags have been removed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/Doc.java
public interface Doc extends Comparable<Object> {

/**
 * Represents Java language constructs (package, class, constructor,
 * method, field) which have comments and have been processed by this
 * run of javadoc.  All Doc objects are unique, that is, they
 * are == comparable.
 *
 * @since 1.2
 * @author Robert Field
 * @author Scott Seligman (generics, enums, annotations)
 */
