_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/EndpointContext.java
    public abstract Set<Endpoint> getEndpoints();

    /**
     * This gives list of endpoints in an application. For e.g in
     * servlet container, a war file may contain multiple endpoints.
     * In case of http, these endpoints are hosted on the same http
     * server.
     *
     * @return list of all endpoints in an application
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/EndpointContext.java
public abstract class EndpointContext {

/**
 * <code>EndpointContext</code> allows multiple endpoints in an application
 * to share any information. For example, servlet application's war may
 * contain multiple endpoints and these endpoints can get addresses of each
 * other by sharing this context. If multiple endpoints share different
 * ports of a WSDL, then the multiple port addresses can be patched
 * when the WSDL is accessed. It also allows all endpoints to share any
 * other runtime information.
 *
 * <p>
 * This needs to be set by using {@link Endpoint#setEndpointContext}
 * before {@link Endpoint#publish} methods.
 *
 * @author Jitendra Kotamraju
 * @since JAX-WS 2.2
 */
