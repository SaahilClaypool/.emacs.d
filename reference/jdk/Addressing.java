_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/Addressing.java
    Responses responses() default Responses.ALL;

    /**
     * If addressing is enabled, this property determines whether endpoint
     * requires the use of anonymous responses, or non-anonymous responses,
     * or all.
     *
     * <p>
     * {@link Responses#ALL} supports all response types and this is the
     * default value.
     *
     * <p>
     * {@link Responses#ANONYMOUS} requires the use of only anonymous
     * responses. It will result into wsam:AnonymousResponses nested assertion
     * as specified in
     * <a href="http://www.w3.org/TR/ws-addr-metadata/#wspolicyanonresponses">
     * 3.1.2 AnonymousResponses Assertion</a> in the generated WSDL.
     *
     * <p>
     * {@link Responses#NON_ANONYMOUS} requires the use of only non-anonymous
     * responses. It will result into
     * wsam:NonAnonymousResponses nested assertion as specified in
     * <a href="http://www.w3.org/TR/ws-addr-metadata/#wspolicynonanonresponses">
     * 3.1.3 NonAnonymousResponses Assertion</a> in the generated WSDL.
     *
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/Addressing.java
    boolean required() default false;

    /**
     * If addressing is enabled, this property determines whether the endpoint
     * requires WS-Addressing. If required is true, the endpoint requires
     * WS-Addressing and WS-Addressing headers MUST
     * be present on incoming messages. A corresponding
     * <a href="http://www.w3.org/TR/ws-addr-metadata/#wspolicyaddressing">
     * 3.1.1 Addressing Assertion</a> must be generated in the WSDL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/Addressing.java
    boolean enabled() default true;

    /**
     * Specifies if this feature is enabled or disabled. If enabled, it means
     * the endpoint supports WS-Addressing but does not require its use.
     * Corresponding
     * <a href="http://www.w3.org/TR/ws-addr-metadata/#wspolicyaddressing">
     * 3.1.1 Addressing Assertion</a> must be generated in the generated WSDL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/Addressing.java
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

/**
 * This annotation represents the use of WS-Addressing with either
 * the SOAP 1.1/HTTP or SOAP 1.2/HTTP binding. Using this annotation
 * with any other binding is undefined.
 * <p>
 * This annotation MUST only be used in conjunction with the
 * {@link javax.jws.WebService}, {@link WebServiceProvider},
 *  and {@link WebServiceRef} annotations.
 * When used with a <code>javax.jws.WebService</code> annotation, this
 * annotation MUST only be used on the service endpoint implementation
 * class.
 * When used with a <code>WebServiceRef</code> annotation, this annotation
 * MUST only be used when a proxy instance is created. The injected SEI
 * proxy, and endpoint MUST honor the values of the <code>Addressing</code>
 * annotation.
 * <p>
 * This annotation's behaviour is defined by the corresponding feature
 * {@link AddressingFeature}.
 *
 * @since JAX-WS 2.1
 */
