_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public void clear() {

    /**
     * clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public void setValues(QName name, int scope, short type, ContentModelValidator contentModelValidator, XMLSimpleType simpleType) {

    /**
     * setValues
     *
     * @param name
     * @param scope
     * @param type
     * @param contentModelValidator
     * @param simpleType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public final XMLSimpleType simpleType = new XMLSimpleType();

    /** simpleType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public ContentModelValidator contentModelValidator;

    /** contentModelValidator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public short type = -1;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public int scope = -1;

    /** scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public final QName name = new QName();

    /** name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_SIMPLE = 4;

    /** TYPE_SIMPLE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_CHILDREN = 3;

    /** TYPE_CHILDREN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_MIXED = 2;

    /** TYPE_MIXED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_EMPTY = 1;

    /** TYPE_EMPTY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_ANY = 0;

    /** TYPE_ANY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
public class XMLElementDecl {

/**
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public void clear() {

    /**
     * clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public void setValues(QName name, int scope, short type, ContentModelValidator contentModelValidator, XMLSimpleType simpleType) {

    /**
     * setValues
     *
     * @param name
     * @param scope
     * @param type
     * @param contentModelValidator
     * @param simpleType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public final XMLSimpleType simpleType = new XMLSimpleType();

    /** simpleType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public ContentModelValidator contentModelValidator;

    /** contentModelValidator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public short type = -1;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public int scope = -1;

    /** scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public final QName name = new QName();

    /** name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_SIMPLE = 4;

    /** TYPE_SIMPLE */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_CHILDREN = 3;

    /** TYPE_CHILDREN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_MIXED = 2;

    /** TYPE_MIXED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_EMPTY = 1;

    /** TYPE_EMPTY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
    public static final short TYPE_ANY = 0;

    /** TYPE_ANY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLElementDecl.java
public class XMLElementDecl {

/**
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    public final class GLOBAL {}

    /**
     * Used in {@link XmlElementDecl#scope()} to
     * signal that the declaration is in the global scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    String defaultValue() default "\u0000";

    /**
     * Default value of this element.
     *
     * <p>
     * The <pre>'\u0000'</pre> value specified as a default of this annotation element
     * is used as a poor-man's substitute for null to allow implementations
     * to recognize the 'no default value' state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    String substitutionHeadName() default "";

    /**
     * XML local name of a substitution group's head element.
     * <p>
     * If the value is "", then this element is not part of any
     * substitution group.
     *
     * @see #substitutionHeadNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    String substitutionHeadNamespace() default "##default";

    /**
     * namespace name of a substitution group's head XML element.
     * <p>
     * This specifies the namespace name of the XML element whose local
     * name is specified by <tt>substitutionHeadName()</tt>.
     * <p>
     * If <tt>susbtitutionHeadName()</tt> is "", then this
     * value can only be "##default". But the value is ignored since
     * since this element is not part of susbtitution group when the
     * value of <tt>susbstitutionHeadName()</tt> is "".
     * <p>
     * If <tt>susbtitutionHeadName()</tt> is not "" and the value is
     * "##default", then the namespace name is the namespace name to
     * which the package of the containing class, marked with {@link
     * XmlRegistry }, is mapped.
     * <p>
     * If <tt>susbtitutionHeadName()</tt> is not "" and the value is
     * not "##default", then the value is the namespace name.
     *
     * @see #substitutionHeadName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    String name();

    /**
     * local name of the XML element.
     *
     * <p>
     * <b> Note to reviewers: </b> There is no default name; since
     * the annotation is on a factory method, it is not clear that the
     * method name can be derived from the factory method name.
     * @see #namespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    String namespace() default "##default";

    /**
     * namespace name of the XML element.
     * <p>
     * If the value is "##default", then the value is the namespace
     * name for the package of the class containing this factory method.
     *
     * @see #name()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
    Class scope() default GLOBAL.class;

    /**
     * scope of the mapping.
     *
     * <p>
     * If this is not {@link XmlElementDecl.GLOBAL}, then this element
     * declaration mapping is only active within the specified class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementDecl.java
@Retention(RUNTIME)

/**
 * Maps a factory method to a XML element.
 *
 * <p> <b>Usage</b> </p>
 *
 * The annotation creates a mapping between an XML schema element
 * declaration and a <i> element factory method </i> that returns a
 * JAXBElement instance representing the element
 * declaration. Typically, the element factory method is generated
 * (and annotated) from a schema into the ObjectFactory class in a
 * Java package that represents the binding of the element
 * declaration's target namespace. Thus, while the annotation syntax
 * allows &#64;XmlElementDecl to be used on any method, semantically
 * its use is restricted to annotation of element factory method.
 *
 * The usage is subject to the following constraints:
 *
 * <ul>
 *   <li> The class containing the element factory method annotated
 *        with &#64;XmlElementDecl must be marked with {@link
 *        XmlRegistry}. </li>
 *   <li> The element factory method must take one parameter
 *        assignable to {@link Object}.</li>
 * </ul>
 *
 * <p><b>Example 1: </b>Annotation on a factory method
 * <pre>
 *     // Example: code fragment
 *     &#64;XmlRegistry
 *     class ObjectFactory {
 *         &#64;XmlElementDecl(name="foo")
 *         JAXBElement&lt;String> createFoo(String s) { ... }
 *     }
 * </pre>
 * <pre>
 *     &lt;!-- XML input -->
 *       &lt;foo>string</foo>
 *
 *     // Example: code fragment corresponding to XML input
 *     JAXBElement<String> o =
 *     (JAXBElement<String>)unmarshaller.unmarshal(aboveDocument);
 *     // print JAXBElement instance to show values
 *     System.out.println(o.getName());   // prints  "{}foo"
 *     System.out.println(o.getValue());  // prints  "string"
 *     System.out.println(o.getValue().getClass()); // prints "java.lang.String"
 *
 *     &lt;!-- Example: XML schema definition -->
 *     &lt;xs:element name="foo" type="xs:string"/>
 * </pre>
 *
 * <p><b>Example 2: </b> Element declaration with non local scope
 * <p>
 * The following example illustrates the use of scope annotation
 * parameter in binding of element declaration in schema derived
 * code.
 * <p>
 * The following example may be replaced in a future revision of
 * this javadoc.
 *
 * <pre>
 *     &lt;!-- Example: XML schema definition -->
 *     &lt;xs:schema>
 *       &lt;xs:complexType name="pea">
 *         &lt;xs:choice maxOccurs="unbounded">
 *           &lt;xs:element name="foo" type="xs:string"/>
 *           &lt;xs:element name="bar" type="xs:string"/>
 *         &lt;/xs:choice>
 *       &lt;/xs:complexType>
 *       &lt;xs:element name="foo" type="xs:int"/>
 *     &lt;/xs:schema>
 * </pre>
 * <pre>
 *     // Example: expected default binding
 *     class Pea {
 *         &#64;XmlElementRefs({
 *             &#64;XmlElementRef(name="foo",type=JAXBElement.class)
 *             &#64;XmlElementRef(name="bar",type=JAXBElement.class)
 *         })
 *         List&lt;JAXBElement&lt;String>> fooOrBar;
 *     }
 *
 *     &#64;XmlRegistry
 *     class ObjectFactory {
 *         &#64;XmlElementDecl(scope=Pea.class,name="foo")
 *         JAXBElement<String> createPeaFoo(String s);
 *
 *         &#64;XmlElementDecl(scope=Pea.class,name="bar")
 *         JAXBElement<String> createPeaBar(String s);
 *
 *         &#64;XmlElementDecl(name="foo")
 *         JAXBElement<Integer> createFoo(Integer i);
 *     }
 *
 * </pre>
 * Without scope createFoo and createPeaFoo would become ambiguous
 * since both of them map to a XML schema element with the same local
 * name "foo".
 *
 * @see XmlRegistry
 * @since JAXB 2.0
 */
