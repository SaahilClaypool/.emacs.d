_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlMimeType.java
    String value();

    /**
     * The textual representation of the MIME type,
     * such as "image/jpeg" "image/*", "text/xml; charset=iso-8859-1" and so on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlMimeType.java
@Retention(RUNTIME)

/**
 * Associates the MIME type that controls the XML representation of the property.
 *
 * <p>
 * This annotation is used in conjunction with datatypes such as
 * {@link java.awt.Image} or {@link Source} that are bound to base64-encoded binary in XML.
 *
 * <p>
 * If a property that has this annotation has a sibling property bound to
 * the xmime:contentType attribute, and if in the instance the property has a value,
 * the value of the attribute takes precedence and that will control the marshalling.
 *
 * @author Kohsuke Kawaguchi
 * @since JAXB2.0
 */
