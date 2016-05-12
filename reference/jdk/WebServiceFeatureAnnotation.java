_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/WebServiceFeatureAnnotation.java
    Class<? extends WebServiceFeature> bean();

    /**
     * The <code>WebServiceFeature</code> bean that is associated
     * with the <code>WebServiceFeature</code> annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/WebServiceFeatureAnnotation.java
    String id();

    /**
     * Unique identifier for the WebServiceFeature.  This
     * identifier MUST be unique across all implementations
     * of JAX-WS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/WebServiceFeatureAnnotation.java
@Target(ElementType.ANNOTATION_TYPE)

/**
 * Annotation used to identify other annotations
 * as a <code>WebServiceFeature</code>.
 * <p>
 * Each <code>WebServiceFeature</code> annotation annotated with
 * this annotation MUST contain an
 * <code>enabled</code> property of type
 * <code>boolean</code> with a default value of <code>true</code>.
 * <p>
 * JAX-WS defines the following
 * <code>WebServiceFeature</code> annotations (<code>Addressing</code>,
 * <code>MTOM</code>, <code>RespectBinding</code>), however, an implementation
 * may define vendors specific annotations for other features.
 * <p>
 * Annotations annotated with <code>WebServiceFeatureAnnotation</code> MUST
 * have the same @Target of {@link WebServiceRef} annotation, so that the resulting
 * feature annotation can be used in conjunction with the {@link WebServiceRef}
 * annotation if necessary.
 * <p>
 * If a JAX-WS implementation encounters an annotation annotated
 * with the <code>WebServiceFeatureAnnotation</code> that it does not
 * recognize/support an error MUST be given.
 * <p>
 *
 * @see Addressing
 * @see MTOM
 * @see RespectBinding
 *
 * @since JAX-WS 2.1
 */
