_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
    public boolean removeAll();

    /**
     * Remove all cookies in this cookie store.
     *
     * @return          {@code true} if this store changed as a result of the call
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
    public boolean remove(URI uri, HttpCookie cookie);

    /**
     * Remove a cookie from store.
     *
     * @param uri       the uri this cookie associated with.
     *                  if {@code null}, the cookie to be removed is not associated
     *                  with an URI when added; if not {@code null}, the cookie
     *                  to be removed is associated with the given URI when added.
     * @param cookie    the cookie to remove
     *
     * @return          {@code true} if this store contained the specified cookie
     *
     * @throws NullPointerException if {@code cookie} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
    public List<URI> getURIs();

    /**
     * Get all URIs which identify the cookies in this cookie store.
     *
     * @return          an immutable list of URIs;
     *                  return empty list if no cookie in this cookie store
     *                  is associated with an URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
    public List<HttpCookie> getCookies();

    /**
     * Get all not-expired cookies in cookie store.
     *
     * @return          an immutable list of http cookies;
     *                  return empty list if there's no http cookie in store
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
    public List<HttpCookie> get(URI uri);

    /**
     * Retrieve cookies associated with given URI, or whose domain matches the
     * given URI. Only cookies that have not expired are returned.
     * This is called for every outgoing HTTP request.
     *
     * @return          an immutable list of HttpCookie,
     *                  return empty list if no cookies match the given URI
     *
     * @param uri       the uri associated with the cookies to be returned
     *
     * @throws NullPointerException if {@code uri} is {@code null}
     *
     * @see #add
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookieStore.java
public interface CookieStore {

/**
 * A CookieStore object represents a storage for cookie. Can store and retrieve
 * cookies.
 *
 * <p>{@link CookieManager} will call {@code CookieStore.add} to save cookies
 * for every incoming HTTP response, and call {@code CookieStore.get} to
 * retrieve cookie for every outgoing HTTP request. A CookieStore
 * is responsible for removing HttpCookie instances which have expired.
 *
 * @author Edward Wang
 * @since 1.6
 */
