_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RespectBinding.java
    boolean enabled() default true;

    /**
     * Specifies if this feature is enabled or disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RespectBinding.java
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

/**
 * This feature clarifies the use of the <code>wsdl:binding</code>
 * in a JAX-WS runtime.
 * <p>
 * This annotation MUST only be used in conjunction the
 * <code>javax.jws.WebService</code>, {@link WebServiceProvider},
 * {@link WebServiceRef} annotations.
 * When used with the <code>javax.jws.WebService</code> annotation this
 * annotation MUST only be used on the service endpoint implementation
 * class.
 * When used with a <code>WebServiceRef</code> annotation, this annotation
 * MUST only be used when a proxy instance is created. The injected SEI
 * proxy, and endpoint MUST honor the values of the <code>RespectBinding</code>
 * annotation.
 * <p>
 *
 * This annotation's behaviour is defined by the corresponding feature
 * {@link RespectBindingFeature}.
 *
 * @see RespectBindingFeature
 *
 * @since JAX-WS 2.1
 */
