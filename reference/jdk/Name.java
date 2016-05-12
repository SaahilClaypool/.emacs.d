_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Name.java
    boolean contentEquals(CharSequence cs);

    /**
     * Compares this name to the specified {@code CharSequence}. The result
     * is {@code true} if and only if this name represents the same sequence
     * of {@code char} values as the specified sequence.
     *
     * @return {@code true} if this name represents the same sequence
     * of {@code char} values as the specified sequence, {@code false}
     * otherwise
     *
     * @param cs The sequence to compare this name against
     * @see String#contentEquals(CharSequence)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Name.java
    int hashCode();

    /**
     * Obeys the general contract of {@link Object#hashCode Object.hashCode}.
     *
     * @see #equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/Name.java
public interface Name extends CharSequence {

/**
 * An immutable sequence of characters.  When created by the same
 * implementation, objects implementing this interface must obey the
 * general {@linkplain Object#equals equals contract} when compared
 * with each other.  Therefore, {@code Name} objects from the same
 * implementation are usable in collections while {@code Name}s from
 * different implementations may not work properly in collections.
 *
 * <p>An empty {@code Name} has a length of zero.
 *
 * <p>In the context of {@linkplain
 * javax.annotation.processing.ProcessingEnvironment annotation
 * processing}, the guarantees for "the same" implementation must
 * include contexts where the {@linkplain javax.annotation.processing
 * API mediated} side effects of {@linkplain
 * javax.annotation.processing.Processor processors} could be visible
 * to each other, including successive annotation processing
 * {@linkplain javax.annotation.processing.RoundEnvironment rounds}.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see javax.lang.model.util.Elements#getName
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Object remove(int posn) throws InvalidNameException;

    /**
     * Removes a component from this name.
     * The component of this name at the specified position is removed.
     * Components with indexes greater than this position
     * are shifted down (toward index 0) by one.
     *
     * @param posn
     *          the index of the component to remove.
     *          Must be in the range [0,size()).
     * @return  the component removed (a String)
     *
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     * @throws  InvalidNameException if deleting the component
     *          would violate the syntax rules of the name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name add(int posn, String comp) throws InvalidNameException;

    /**
     * Adds a single component at a specified position within this name.
     * Components of this name at or after the index of the new component
     * are shifted up by one (away from index 0) to accommodate the new
     * component.
     *
     * @param comp
     *          the component to add
     * @param posn
     *          the index at which to add the new component.
     *          Must be in the range [0,size()].
     * @return  the updated name (not a new one)
     *
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     * @throws  InvalidNameException if adding <tt>comp</tt> would violate
     *          the syntax rules of this name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name add(String comp) throws InvalidNameException;

    /**
     * Adds a single component to the end of this name.
     *
     * @param comp
     *          the component to add
     * @return  the updated name (not a new one)
     *
     * @throws  InvalidNameException if adding <tt>comp</tt> would violate
     *          the syntax rules of this name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name addAll(int posn, Name n) throws InvalidNameException;

    /**
     * Adds the components of a name -- in order -- at a specified position
     * within this name.
     * Components of this name at or after the index of the first new
     * component are shifted up (away from 0) to accommodate the new
     * components.
     *
     * @param n
     *          the components to add
     * @param posn
     *          the index in this name at which to add the new
     *          components.  Must be in the range [0,size()].
     * @return  the updated name (not a new one)
     *
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     * @throws  InvalidNameException if <tt>n</tt> is not a valid name,
     *          or if the addition of the components would violate the syntax
     *          rules of this name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name addAll(Name suffix) throws InvalidNameException;

    /**
     * Adds the components of a name -- in order -- to the end of this name.
     *
     * @param suffix
     *          the components to add
     * @return  the updated name (not a new one)
     *
     * @throws  InvalidNameException if <tt>suffix</tt> is not a valid name,
     *          or if the addition of the components would violate the syntax
     *          rules of this name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public boolean endsWith(Name n);

    /**
     * Determines whether this name ends with a specified suffix.
     * A name <tt>n</tt> is a suffix if it is equal to
     * <tt>getSuffix(size()-n.size())</tt>.
     *
     * @param n
     *          the name to check
     * @return  true if <tt>n</tt> is a suffix of this name, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public boolean startsWith(Name n);

    /**
     * Determines whether this name starts with a specified prefix.
     * A name <tt>n</tt> is a prefix if it is equal to
     * <tt>getPrefix(n.size())</tt>.
     *
     * @param n
     *          the name to check
     * @return  true if <tt>n</tt> is a prefix of this name, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name getSuffix(int posn);

    /**
     * Creates a name whose components consist of a suffix of the
     * components in this name.  Subsequent changes to
     * this name do not affect the name that is returned and vice versa.
     *
     * @param posn
     *          the 0-based index of the component at which to start.
     *          Must be in the range [0,size()].
     * @return  a name consisting of the components at indexes in
     *          the range [posn,size()).  If posn is equal to
     *          size(), an empty name is returned.
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Name getPrefix(int posn);

    /**
     * Creates a name whose components consist of a prefix of the
     * components of this name.  Subsequent changes to
     * this name will not affect the name that is returned and vice versa.
     *
     * @param posn
     *          the 0-based index of the component at which to stop.
     *          Must be in the range [0,size()].
     * @return  a name consisting of the components at indexes in
     *          the range [0,posn).
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public String get(int posn);

    /**
     * Retrieves a component of this name.
     *
     * @param posn
     *          the 0-based index of the component to retrieve.
     *          Must be in the range [0,size()).
     * @return  the component at index posn
     * @throws  ArrayIndexOutOfBoundsException
     *          if posn is outside the specified range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Enumeration<String> getAll();

    /**
     * Retrieves the components of this name as an enumeration
     * of strings.  The effect on the enumeration of updates to
     * this name is undefined.  If the name has zero components,
     * an empty (non-null) enumeration is returned.
     *
     * @return  an enumeration of the components of this name, each a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public boolean isEmpty();

    /**
     * Determines whether this name is empty.
     * An empty name is one with zero components.
     *
     * @return  true if this name is empty, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public int size();

    /**
     * Returns the number of components in this name.
     *
     * @return  the number of components in this name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public int compareTo(Object obj);

    /**
     * Compares this name with another name for order.
     * Returns a negative integer, zero, or a positive integer as this
     * name is less than, equal to, or greater than the given name.
     *
     * <p> As with <tt>Object.equals()</tt>, the notion of ordering for names
     * depends on the class that implements this interface.
     * For example, the ordering may be
     * based on lexicographical ordering of the name components.
     * Specific attributes of the name, such as how it treats case,
     * may affect the ordering.  In general, two names of different
     * classes may not be compared.
     *
     * @param   obj the non-null object to compare against.
     * @return  a negative integer, zero, or a positive integer as this name
     *          is less than, equal to, or greater than the given name
     * @throws  ClassCastException if obj is not a <tt>Name</tt> of a
     *          type that may be compared with this name
     *
     * @see Comparable#compareTo(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    public Object clone();

    /**
     * Generates a new copy of this name.
     * Subsequent changes to the components of this name will not
     * affect the new copy, and vice versa.
     *
     * @return  a copy of this name
     *
     * @see Object#clone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
    static final long serialVersionUID = -3617482732056931635L;

   /**
    * The class fingerprint that is set to indicate
    * serialization compatibility with a previous
    * version of the class.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Name.java
public interface Name

/**
 * The <tt>Name</tt> interface represents a generic name -- an ordered
 * sequence of components.  It can be a composite name (names that
 * span multiple namespaces), or a compound name (names that are
 * used within individual hierarchical naming systems).
 *
 * <p> There can be different implementations of <tt>Name</tt>; for example,
 * composite names, URLs, or namespace-specific compound names.
 *
 * <p> The components of a name are numbered.  The indexes of a name
 * with N components range from 0 up to, but not including, N.  This
 * range may be written as [0,N).
 * The most significant component is at index 0.
 * An empty name has no components.
 *
 * <p> None of the methods in this interface accept null as a valid
 * value for a parameter that is a name or a name component.
 * Likewise, methods that return a name or name component never return null.
 *
 * <p> An instance of a <tt>Name</tt> may not be synchronized against
 * concurrent multithreaded access if that access is not read-only.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 * @author R. Vasudevan
 * @since 1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Name.java
    String getURI();

    /**
     * Returns the URI of the namespace for the XML
     * name that this <code>Name</code> object represents.
     *
     * @return the URI as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Name.java
    String getPrefix();

    /**
     * Returns the prefix that was specified when this <code>Name</code> object
     * was initialized. This prefix is associated with the namespace for the XML
     * name that this <code>Name</code> object represents.
     *
     * @return the prefix as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Name.java
    String getQualifiedName();

    /**
     * Gets the namespace-qualified name of the XML name that this
     * <code>Name</code> object represents.
     *
     * @return the namespace-qualified name as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Name.java
public interface Name {

/**
 * A representation of an XML name.  This interface provides methods for
 * getting the local and namespace-qualified names and also for getting the
 * prefix associated with the namespace for the name. It is also possible
 * to get the URI of the namespace.
 * <P>
 * The following is an example of a namespace declaration in an element.
 * <PRE>
 *   &lt;wombat:GetLastTradePrice xmlns:wombat="http://www.wombat.org/trader"&gt;
 * </PRE>
 * ("xmlns" stands for "XML namespace".)
 * The following
 * shows what the methods in the <code>Name</code> interface will return.
 * <UL>
 *  <LI><code>getQualifiedName</code> will return "prefix:LocalName" =
 *      "WOMBAT:GetLastTradePrice"
 *  <LI><code>getURI</code> will return "http://www.wombat.org/trader"
 *  <LI><code>getLocalName</code> will return "GetLastTracePrice"
 *  <LI><code>getPrefix</code> will return "WOMBAT"
 * </UL>
 * <P>
 * XML namespaces are used to disambiguate SOAP identifiers from
 * application-specific identifiers.
 * <P>
 * <code>Name</code> objects are created using the method
 * <code>SOAPEnvelope.createName</code>, which has two versions.
 * One method creates <code>Name</code> objects with
 * a local name, a namespace prefix, and a namespace URI.
 *  and the second creates <code>Name</code> objects with just a local name.
 * The following line of
 * code, in which <i>se</i> is a <code>SOAPEnvelope</code> object, creates a new
 * <code>Name</code> object with all three.
 * <PRE>
 *     Name name = se.createName("GetLastTradePrice", "WOMBAT",
 *                                "http://www.wombat.org/trader");
 * </PRE>
 * The following line of code gives an example of how a <code>Name</code> object
 * can be used. The variable <i>element</i> is a <code>SOAPElement</code> object.
 * This code creates a new <code>SOAPElement</code> object with the given name and
 * adds it to <i>element</i>.
 * <PRE>
 *     element.addChildElement(name);
 * </PRE>
 * <P>
 * The <code>Name</code> interface may be deprecated in a future release of SAAJ
 * in favor of <code>javax.xml.namespace.QName<code>
 * @see SOAPEnvelope#createName(String, String, String) SOAPEnvelope.createName
 * @see SOAPFactory#createName(String, String, String) SOAPFactory.createName
 */
