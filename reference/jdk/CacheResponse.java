_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheResponse.java
    public abstract InputStream getBody() throws IOException;

    /**
     * Returns the response body as an InputStream.
     *
     * @return an InputStream from which the response body can
     *         be accessed
     * @throws IOException if an I/O error occurs while
     *         getting the response body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheResponse.java
    public abstract Map<String, List<String>> getHeaders() throws IOException;

    /**
     * Returns the response headers as a Map.
     *
     * @return An immutable Map from response header field names to
     *         lists of field values. The status line has null as its
     *         field name.
     * @throws IOException if an I/O error occurs
     *            while getting the response headers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheResponse.java
public abstract class CacheResponse {

/**
 * Represent channels for retrieving resources from the
 * ResponseCache. Instances of such a class provide an
 * InputStream that returns the entity body, and also a
 * getHeaders() method which returns the associated response headers.
 *
 * @author Yingxian Wang
 * @since 1.5
 */
