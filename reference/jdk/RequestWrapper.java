_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RequestWrapper.java
    public String partName() default "";

    /**
     * wsdl:part name for the wrapper part
     *
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RequestWrapper.java
    public String className() default "";

    /**
     * Request wrapper bean name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RequestWrapper.java
    public String targetNamespace() default "";

    /**
     * Element's namespace name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RequestWrapper.java
    public String localName() default "";

    /**
     * Element's local name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/RequestWrapper.java
@Target(ElementType.METHOD)

/**
 * Used to annotate methods in the Service Endpoint Interface with the request
 * wrapper bean to be used at runtime. The default value of the <code>localName</code> is
 * the <code>operationName</code>, as defined in <code>WebMethod</code> annotation and the
 * <code>targetNamespace</code> is the target namespace of the SEI.
 * <p> When starting from Java this annotation is used resolve
 * overloading conflicts in document literal mode. Only the <code>className</code>
 * is required in this case.
 *
 *  @since JAX-WS 2.0
 **/
