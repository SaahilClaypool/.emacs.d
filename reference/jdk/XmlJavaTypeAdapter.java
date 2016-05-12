_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter.java
    static final class DEFAULT {}

    /**
     * Used in {@link XmlJavaTypeAdapter#type()} to
     * signal that the type be inferred from the signature
     * of the field, property, parameter or the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter.java
    Class type() default DEFAULT.class;

    /**
     * If this annotation is used at the package level, then value of
     * the type() must be specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter.java
    Class<? extends XmlAdapter> value();

    /**
     * Points to the class that converts a value type to a bound type or vice versa.
     * See {@link XmlAdapter} for more details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter.java
@Retention(RUNTIME) @Target({PACKAGE,FIELD,METHOD,TYPE,PARAMETER})

/**
 * Use an adapter that implements {@link XmlAdapter} for custom marshaling.
 *
 * <p> <b> Usage: </b> </p>
 *
 * <p> The <tt>@XmlJavaTypeAdapter</tt> annotation can be used with the
 * following program elements:
 * <ul>
 *   <li> a JavaBean property </li>
 *   <li> field </li>
 *   <li> parameter </li>
 *   <li> package </li>
 *   <li> from within {@link XmlJavaTypeAdapters} </li>
 * </ul>
 *
 * <p> When <tt>@XmlJavaTypeAdapter</tt> annotation is defined on a
 * class, it applies to all references to the class.
 * <p> When <tt>@XmlJavaTypeAdapter</tt> annotation is defined at the
 * package level it applies to all references from within the package
 * to <tt>@XmlJavaTypeAdapter.type()</tt>.
 * <p> When <tt>@XmlJavaTypeAdapter</tt> annotation is defined on the
 * field, property or parameter, then the annotation applies to the
 * field, property or the parameter only.
 * <p> A <tt>@XmlJavaTypeAdapter</tt> annotation on a field, property
 * or parameter overrides the <tt>@XmlJavaTypeAdapter</tt> annotation
 * associated with the class being referenced by the field, property
 * or parameter.
 * <p> A <tt>@XmlJavaTypeAdapter</tt> annotation on a class overrides
 * the <tt>@XmlJavaTypeAdapter</tt> annotation specified at the
 * package level for that class.
 *
 * <p>This annotation can be used with the following other annotations:
 * {@link XmlElement}, {@link XmlAttribute}, {@link XmlElementRef},
 * {@link XmlElementRefs}, {@link XmlAnyElement}. This can also be
 * used at the package level with the following annotations:
 * {@link XmlAccessorType}, {@link XmlSchema}, {@link XmlSchemaType},
 * {@link XmlSchemaTypes}.
 *
 * <p><b> Example: </b> See example in {@link XmlAdapter}
 *
 * @author <ul><li>Sekhar Vajjhala, Sun Microsystems Inc.</li> <li> Kohsuke Kawaguchi, Sun Microsystems Inc.</li></ul>
 * @since JAXB2.0
 * @see XmlAdapter
 */
