_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/wsaddressing/W3CEndpointReference.java
    public void writeTo(Result result){

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/wsaddressing/W3CEndpointReference.java
    public W3CEndpointReference(Source source) {

    /**
     * Creates an EPR from infoset representation
     *
     * @param source A source object containing valid XmlInfoset
     * instance consistent with the W3C WS-Addressing Core
     * recommendation.
     *
     * @throws WebServiceException
     *   If the source does NOT contain a valid W3C WS-Addressing
     *   EndpointReference.
     * @throws NullPointerException
     *   If the <code>null</code> <code>source</code> value is given
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/wsaddressing/W3CEndpointReference.java
// XmlRootElement allows this class to be marshalled on its own

/**
 * This class represents a W3C Addressing EndpointReferece which is
 * a remote reference to a web service endpoint that supports the
 * W3C WS-Addressing 1.0 - Core Recommendation.
 * <p>
 * Developers should use this class in their SEIs if they want to
 * pass/return endpoint references that represent the W3C WS-Addressing
 * recommendation.
 * <p>
 * JAXB will use the JAXB annotations and bind this class to XML infoset
 * that is consistent with that defined by WS-Addressing.  See
 * <a href="http://www.w3.org/TR/2006/REC-ws-addr-core-20060509/">
 * WS-Addressing</a>
 * for more information on WS-Addressing EndpointReferences.
 *
 * @since JAX-WS 2.1
 */
