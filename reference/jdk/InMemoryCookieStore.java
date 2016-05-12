_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public boolean removeAll() {

    /**
     * Remove all cookies in this cookie store.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public boolean remove(URI uri, HttpCookie ck) {

    /**
     * Remove a cookie from store
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public List<URI> getURIs() {

    /**
     * Get all URIs, which are associated with at least one cookie
     * of this cookie store.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public List<HttpCookie> getCookies() {

    /**
     * Get all cookies in cookie store, except those have expired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public List<HttpCookie> get(URI uri) {

    /**
     * Get all cookies, which:
     *  1) given uri domain-matches with, or, associated with
     *     given uri when added to the cookie store.
     *  3) not expired.
     * See RFC 2965 sec. 3.3.4 for more detail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public void add(URI uri, HttpCookie cookie) {

    /**
     * Add one cookie into cookie store.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
    public InMemoryCookieStore() {

    /**
     * The default ctor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/InMemoryCookieStore.java
class InMemoryCookieStore implements CookieStore {

/**
 * A simple in-memory java.net.CookieStore implementation
 *
 * @author Edward Wang
 * @since 1.6
 */
