_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isIncluded();

    /**
     * Return true if this Doc item is
     * <a href="{@docRoot}/com/sun/javadoc/package-summary.html#included">included</a>
     * in the result set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isAnnotationType();

    /**
     * Is this Doc item an annotation type?
     *
     * @return true if it represents an annotation type
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isEnum();

    /**
     * Is this Doc item an enum type?
     *
     * @return true if it represents an enum type
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isError();

    /**
     * Is this Doc item an error class?
     *
     * @return true if it represents a error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isException();

    /**
     * Is this Doc item an exception class?
     *
     * @return true if it represents an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isInterface();

    /**
     * Is this Doc item an interface (but not an annotation type)?
     *
     * @return true if it represents an interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isAnnotationTypeElement();

    /**
     * Is this Doc item an annotation type element?
     *
     * @return true if it represents an annotation type element
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isMethod();

    /**
     * Is this Doc item a method (but not a constructor or annotation
     * type element)?
     *
     * @return true if it represents a method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isConstructor();

    /**
     * Is this Doc item a constructor?
     *
     * @return true if it represents a constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isEnumConstant();

    /**
     * Is this Doc item an enum constant?
     *
     * @return true if it represents an enum constant
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isField();

    /**
     * Is this Doc item a field (but not an enum constant)?
     *
     * @return true if it represents a field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String name();

    /**
     * Returns the non-qualified name of this Doc item.
     *
     * @return  the name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    void setRawCommentText(String rawDocumentation);

    /**
     * Set the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String getRawCommentText();

    /**
     * Return the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    SeeTag[] seeTags();

    /**
     * Return the see also tags in this Doc item.
     *
     * @return an array of SeeTag containing all @see tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    Tag[] tags();

    /**
     * Return all tags in this Doc item.
     *
     * @return an array of {@link Tag} objects containing all tags on
     *         this Doc item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String commentText();

    /**
     * Return the text of the comment for this doc item.
     * Tags have been removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isIncluded();

    /**
     * Return true if this Doc item is
     * <a href="{@docRoot}/com/sun/javadoc/package-summary.html#included">included</a>
     * in the result set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isAnnotationType();

    /**
     * Is this Doc item an annotation type?
     *
     * @return true if it represents an annotation type
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isEnum();

    /**
     * Is this Doc item an enum type?
     *
     * @return true if it represents an enum type
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isError();

    /**
     * Is this Doc item an error class?
     *
     * @return true if it represents a error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isException();

    /**
     * Is this Doc item an exception class?
     *
     * @return true if it represents an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isInterface();

    /**
     * Is this Doc item an interface (but not an annotation type)?
     *
     * @return true if it represents an interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isAnnotationTypeElement();

    /**
     * Is this Doc item an annotation type element?
     *
     * @return true if it represents an annotation type element
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isMethod();

    /**
     * Is this Doc item a method (but not a constructor or annotation
     * type element)?
     *
     * @return true if it represents a method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isConstructor();

    /**
     * Is this Doc item a constructor?
     *
     * @return true if it represents a constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isEnumConstant();

    /**
     * Is this Doc item an enum constant?
     *
     * @return true if it represents an enum constant
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    boolean isField();

    /**
     * Is this Doc item a field (but not an enum constant)?
     *
     * @return true if it represents a field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String name();

    /**
     * Returns the non-qualified name of this Doc item.
     *
     * @return  the name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    void setRawCommentText(String rawDocumentation);

    /**
     * Set the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String getRawCommentText();

    /**
     * Return the full unprocessed text of the comment.  Tags
     * are included as text.  Used mainly for store and retrieve
     * operations like internalization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    SeeTag[] seeTags();

    /**
     * Return the see also tags in this Doc item.
     *
     * @return an array of SeeTag containing all @see tags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    Tag[] tags();

    /**
     * Return all tags in this Doc item.
     *
     * @return an array of {@link Tag} objects containing all tags on
     *         this Doc item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
    String commentText();

    /**
     * Return the text of the comment for this doc item.
     * Tags have been removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doc.java
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
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
    public InputStream getStreamForBytes() throws IOException;

    /**
     * Obtains an input stream for extracting byte print data from this
     * doc.  The Doc implementation is required to support this method if
     * the DocFlavor has one of the following print data representation
     * classes, and return null otherwise:
     * <UL>
     * <LI> byte[]
     * <LI> java.io.InputStream
     * </UL>
     * This doc's print data representation object is obtained, then an input
     * stream for reading the print data from the print data representation
     * object as a stream of bytes is created and returned. However, if the
     * print data representation object is itself an input stream, then the
     * print data representation object is simply returned.
     * <P>
     * @return  Input stream for reading the print data bytes from this doc. If
     *          an input stream cannot be provided because this doc does not
     *          meet the criteria stated above, null is returned.
     *
     * @exception  IOException
     *     Thrown if there was an I/O error while creating the input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
    public Reader getReaderForText() throws IOException;

    /**
     * Obtains a reader for extracting character print data from this doc.
     * The Doc implementation is required to support this method if the
     * DocFlavor has one of the following print data representation classes,
     * and return null otherwise:
     * <UL>
     * <LI> char[]
     * <LI> java.lang.String
     * <LI> java.io.Reader
     * </UL>
     * The doc's print data representation object is used to construct and
     * return a Reader for reading the print data as a stream of characters
     * from the print data representation object.
     * However, if the print data representation object is itself a Reader,
     * then the print data representation object is simply returned.
     * <P>
     * @return  Reader for reading the print data characters from this doc.
     *          If a reader cannot be provided because this doc does not meet
     *          the criteria stated above, null is returned.
     *
     * @exception  IOException
     *     Thrown if there was an I/O error while creating the reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
    public DocAttributeSet getAttributes();

    /**
     * Obtains the set of printing attributes for this doc object. If the
     * returned attribute set includes an instance of a particular attribute
     * <I>X,</I> the printer must use that attribute value for this doc,
     * overriding any value of attribute <I>X</I> in the job's attribute set.
     * If the returned attribute set does not include an instance
     * of a particular attribute <I>X</I> or if null is returned, the printer
     * must consult the job's attribute set to obtain the value for
     * attribute <I>X,</I> and if not found there, the printer must use an
     * implementation-dependent default value. The returned attribute set is
     * unmodifiable.
     *
     * @return  Unmodifiable set of printing attributes for this doc, or null
     *          to obtain all attribute values from the job's attribute
     *          set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
    public Object getPrintData() throws IOException;

    /**
     * Obtains the print data representation object that contains this doc
     * object's piece of print data in the format corresponding to the
     * supported doc flavor.
     * The <CODE>getPrintData()</CODE> method returns an instance of
     * the representation class whose name is given by <CODE>{@link
     * #getDocFlavor() getDocFlavor()}.{@link
     * DocFlavor#getRepresentationClassName()
     * getRepresentationClassName()}</CODE>, and the return value can be cast
     * from class Object to that representation class.
     *
     * @return  Print data representation object.
     *
     * @exception  IOException
     *     Thrown if the representation class is a stream and there was an I/O
     *     error while constructing the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
    public DocFlavor getDocFlavor();

    /**
     * Determines the doc flavor in which this doc object will supply its
     * piece of print data.
     *
     * @return  Doc flavor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/Doc.java
public interface Doc {

/**
 * Interface Doc specifies the interface for an object that supplies one piece
 * of print data for a Print Job. "Doc" is a short, easy-to-pronounce term
 * that means "a piece of print data." The client passes to the Print Job an
 * object that implements interface Doc, and the Print Job calls methods on
 * that object to obtain the print data. The Doc interface lets a Print Job:
 * <UL>
 * <LI>
 * Determine the format, or "doc flavor" (class {@link DocFlavor DocFlavor}),
 * in which the print data is available. A doc flavor designates the print
 * data format (a MIME type) and the representation class of the object
 * from which the print data comes.
 * <P>
 * <LI>
 * Obtain the print data representation object, which is an instance of the
 * doc flavor's representation class. The Print Job can then obtain the actual
 * print data from the representation object.
 * <P>
 * <LI>
 * Obtain the printing attributes that specify additional characteristics of
 * the doc or that specify processing instructions to be applied to the doc.
 * Printing attributes are defined in package {@link javax.print.attribute
 * javax.print.attribute}. The doc returns its printing attributes stored in
 * an {@link javax.print.attribute.DocAttributeSet javax.print.attribute.DocAttributeSet}.
 * </UL>
 * <P>
 * Each method in an implementation of interface Doc is permitted always to
 * return the same object each time the method is called.
 * This has implications
 * for a Print Job or other caller of a doc object whose print data
 * representation object "consumes" the print data as the caller obtains the
 * print data, such as a print data representation object which is a stream.
 * Once the Print Job has called {@link #getPrintData()
 * getPrintData()} and obtained the stream, any further calls to
 * {@link #getPrintData() getPrintData()} will return the same
 * stream object upon which reading may already be in progress, <I>not</I> a new
 * stream object that will re-read the print data from the beginning. Specifying
 * a doc object to behave this way simplifies the implementation of doc objects,
 * and is justified on the grounds that a particular doc is intended to convey
 * print data only to one Print Job, not to several different Print Jobs. (To
 * convey the same print data to several different Print Jobs, you have to
 * create several different doc objects on top of the same print data source.)
 * <P>
 * Interface Doc affords considerable implementation flexibility. The print data
 * might already be in existence when the doc object is constructed. In this
 * case the objects returned by the doc's methods can be supplied to the doc's
 * constructor, be stored in the doc ahead of time, and simply be returned when
 * called for. Alternatively, the print data might not exist yet when the doc
 * object is constructed. In this case the doc object might provide a "lazy"
 * implementation that generates the print data representation object (and/or
 * the print data) only when the Print Job calls for it (when the Print Job
 * calls the {@link #getPrintData() getPrintData()} method).
 * <P>
 * There is no restriction on the number of client threads that may be
 * simultaneously accessing the same doc. Therefore, all implementations of
 * interface Doc must be designed to be multiple thread safe.
 * <p>
 * However there can only be one consumer of the print data obtained from a
 * Doc.
 * <p>
 * If print data is obtained from the client as a stream, by calling Doc's
 * <code>getReaderForText()</code> or <code>getStreamForBytes()</code>
 * methods, or because the print data source is already an InputStream or
 * Reader, then the print service should always close these streams for the
 * client on all job completion conditions. With the following caveat.
 * If the print data is itself a stream, the service will always close it.
 * If the print data is otherwise something that can be requested as a stream,
 * the service will only close the stream if it has obtained the stream before
 * terminating. That is, just because a print service might request data as
 * a stream does not mean that it will, with the implications that Doc
 * implementors which rely on the service to close them should create such
 * streams only in response to a request from the service.
 * <P>
 * <HR>
 */
