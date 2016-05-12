_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/MTOM.java
    int threshold() default 0;

    /**
     * Property for MTOM threshold value. When MTOM is enabled, binary data above this
     * size in bytes will be XOP encoded or sent as attachment. The value of this property
     * MUST always be >= 0. Default value is 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/MTOM.java
    boolean enabled() default true;

    /**
     * Specifies if this feature is enabled or disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/MTOM.java
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

/**
 * This feature represents the use of MTOM with a
 * web service.
 * <p>
 * This annotation MUST only be used in conjunction the
 * <code>javax.jws.WebService</code>, {@link WebServiceProvider},
 * {@link WebServiceRef} annotations.
 * When used with the <code>javax.jws.WebService</code> annotation this
 * annotation MUST only be used on the service endpoint implementation
 * class.
 * When used with a <code>WebServiceRef</code> annotation, this annotation
 * MUST only be used when a proxy instance is created. The injected SEI
 * proxy, and endpoint MUST honor the values of the <code>MTOM</code>
 * annotation.
 * <p>
 *
 * This annotation's behaviour is defined by the corresponding feature
 * {@link MTOMFeature}.
 *
 * @since JAX-WS 2.1
 */
