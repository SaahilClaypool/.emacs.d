_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlElementRefs.java
@Retention(RUNTIME)

/**
 * Marks a property that refers to classes with {@link XmlElement}
 * or JAXBElement.
 *
 * <p>
 * Compared to an element property (property with {@link XmlElement}
 * annotation), a reference property has a different substitution semantics.
 * When a sub-class is assigned to a property, an element property produces
 * the same tag name with @xsi:type, whereas a reference property produces
 * a different tag name (the tag name that's on the the sub-class.)
 *
 * <p> This annotation can be used with the following annotations:
 * {@link XmlJavaTypeAdapter}, {@link XmlElementWrapper}.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Sekhar Vajjhala, Sun Microsystems, Inc.</li></ul>
 *
 * @see XmlElementWrapper
 * @see XmlElementRef
 * @since JAXB2.0
 */
