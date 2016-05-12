_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public boolean isFullyComposed() {

    /**
     * <p>Returns whether the schema components contained in this object
     * can be considered to be a fully composed schema and should be
     * used to exclusion of other schema components which may be
     * present elsewhere.</p>
     *
     * @return whether the schema components contained in this object
     * can be considered to be a fully composed schema
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public XMLGrammarPool getGrammarPool() {

    /**
     * <p>Returns the grammar pool contained inside the container.</p>
     *
     * @return the grammar pool contained inside the container
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public XMLSchema(XMLGrammarPool grammarPool) {

    /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    private final XMLGrammarPool fGrammarPool;

    /** The grammar pool is immutable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
final class XMLSchema extends AbstractXMLSchema {

/**
 * <p>Implementation of Schema for W3C XML Schemas.</p>
 *
 * @author Michael Glavassevich, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public boolean isFullyComposed() {

    /**
     * <p>Returns whether the schema components contained in this object
     * can be considered to be a fully composed schema and should be
     * used to exclusion of other schema components which may be
     * present elsewhere.</p>
     *
     * @return whether the schema components contained in this object
     * can be considered to be a fully composed schema
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public XMLGrammarPool getGrammarPool() {

    /**
     * <p>Returns the grammar pool contained inside the container.</p>
     *
     * @return the grammar pool contained inside the container
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    public XMLSchema(XMLGrammarPool grammarPool) {

    /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
    private final XMLGrammarPool fGrammarPool;

    /** The grammar pool is immutable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchema.java
final class XMLSchema extends AbstractXMLSchema {

/**
 * <p>Implementation of Schema for W3C XML Schemas.</p>
 *
 * @author Michael Glavassevich, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    // the actual value is chosen because ## is not a valid

    /**
     * The default value of the {@link #location()} attribute,
     * which indicates that the schema generator will generate
     * components in this namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    String location() default NO_LOCATION;

    /**
     * Indicates that this namespace (specified by {@link #namespace()})
     * has a schema already available exeternally, available at this location.
     *
     * <p>
     * This instructs the JAXB schema generators to simply refer to
     * the pointed schema, as opposed to generating components into the schema.
     * This schema is assumed to match what would be otherwise produced
     * by the schema generator (same element names, same type names...)
     *
     * <p>
     * This feature is intended to be used when a set of the Java classes
     * is originally generated from an existing schema, hand-written to
     * match externally defined schema, or the generated schema is modified
     * manually.
     *
     * <p>
     * Value could be any absolute URI, like <tt>http://example.org/some.xsd</tt>.
     * It is also possible to specify the empty string, to indicate
     * that the schema is externally available but the location is
     * unspecified (and thus it's the responsibility of the reader of the generate
     * schema to locate it.) Finally, the default value of this property
     * <tt>"##generate"</tt> indicates that the schema generator is going
     * to generate components for this namespace (as it did in JAXB 2.0.)
     *
     * <p>
     * Multiple {@link XmlSchema} annotations on multiple packages are allowed
     * to govern the same {@link #namespace()}. In such case, all of them
     * must have the same {@link #location()} values.
     *
     *
     * <h3>Note to implementor</h3>
     * <p>
     * More precisely, the value must be either <tt>""</tt>, <tt>"##generate"</tt>, or
     * <a href="http://www.w3.org/TR/xmlschema-2/#anyURI">
     * a valid lexical representation of <tt>xs:anyURI</tt></a> that begins
     * with <tt>&lt;scheme>:</tt>.
     *
     * <p>
     * A schema generator is expected to generate a corresponding
     * <tt>&lt;xs:import namespace="..." schemaLocation="..."/></tt> (or
     * no <tt>schemaLocation</tt> attribute at all if the empty string is specified.)
     * However, the schema generator is allowed to use a different value in
     * the <tt>schemaLocation</tt> attribute (including not generating
     * such attribute), for example so that the user can specify a local
     * copy of the resource through the command line interface.
     *
     * @since JAXB2.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    XmlNsForm attributeFormDefault() default XmlNsForm.UNSET;

    /**
     * Namespace qualification for attributes. By default,
     * attributesFormDefault will be absent from the XML Schema fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    XmlNsForm elementFormDefault() default XmlNsForm.UNSET;

    /**
     * Namespace qualification for elements. By default, element
     * default attribute will be absent from the XML Schema fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    String namespace() default "";

    /**
     * Name of the XML namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
    XmlNs[]  xmlns() default {};

    /**
     * Customize the namespace URI, prefix associations. By default,
     * the namespace prefixes for a XML namespace are generated by a
     * JAXB Provider in an implementation dependent way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlSchema.java
@Retention(RUNTIME) @Target(PACKAGE)

/**
 * <p> Maps a package name to a XML namespace. </p>
 *
 * <h3>Usage</h3>
 * <p>
 * The XmlSchema annotation can be used with the following program
 * elements:
 * <ul>
 *   <li>package</li>
 * </ul>
 *
 * <p>
 * This is a package level annotation and follows the recommendations
 * and restrictions contained in JSR 175, section III, "Annotations".
 * Thus the usage is subject to the following constraints and
 * recommendations.
 * <ul>
 *   <li> There can only be one package declaration as noted in JSR
 *        175, section III, "Annotations". </li>
 *   <li> JSR 175 recommends package-info.java for package level
 *        annotations. JAXB Providers that follow this recommendation
 *        will allow the package level annotations to be defined in
 *        package-info.java.
 * </ul>
 * <p>
 *
 * <p><b>Example 1:</b> Customize name of XML namespace to which
 * package is mapped.</p>
 *
 * <pre>
 *    &#64;javax.xml.bind.annotation.XmlSchema (
 *      namespace = "http://www.example.com/MYPO1"
 *    )
 *
 *    &lt;!-- XML Schema fragment -->
 *    &lt;schema
 *      xmlns=...
 *      xmlns:po=....
 *      targetNamespace="http://www.example.com/MYPO1"
 *    >
 *    &lt;!-- prefixes generated by default are implementation
 *            depedenent -->
 * </pre>
 *
 * <p><b>Example 2:</b> Customize namespace prefix, namespace URI
 * mapping</p>
 *
 * <pre>
 *    // Package level annotation
 *    &#64;javax.xml.bind.annotation.XmlSchema (
 *      xmlns = {
 *        &#64;javax.xml.bind.annotation.XmlNs(prefix = "po",
 *                   namespaceURI="http://www.example.com/myPO1"),
 *
 *        &#64;javax.xml.bind.annotation.XmlNs(prefix="xs",
 *                   namespaceURI="http://www.w3.org/2001/XMLSchema")
 *      )
 *    )
 *
 *    &lt;!-- XML Schema fragment -->
 *    &lt;schema
 *        xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *        xmlns:po="http://www.example.com/PO1"
 *        targetNamespace="http://www.example.com/PO1">
 *
 * </pre>
 *
 * <p><b>Example 3:</b> Customize elementFormDefault</p>
 * <pre>
 *    &#64;javax.xml.bind.annotation.XmlSchema (
 *      elementFormDefault=XmlNsForm.UNQUALIFIED
 *      ...
 *    )
 *
 *    &lt;!-- XML Schema fragment -->
 *    &lt;schema
 *        xmlns="http://www.w3.org/2001/XMLSchema"
 *        xmlns:po="http://www.example.com/PO1"
 *        elementFormDefault="unqualified">
 *
 * </pre>

 * @author Sekhar Vajjhala, Sun Microsystems, Inc.
 * @since JAXB2.0
 */
