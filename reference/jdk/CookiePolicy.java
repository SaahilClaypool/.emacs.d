_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookiePolicy.java
    public boolean shouldAccept(URI uri, HttpCookie cookie);

    /**
     * Will be called to see whether or not this cookie should be accepted.
     *
     * @param uri       the URI to consult accept policy with
     * @param cookie    the HttpCookie object in question
     * @return          {@code true} if this cookie should be accepted;
     *                  otherwise, {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookiePolicy.java
    public static final CookiePolicy ACCEPT_ORIGINAL_SERVER  = new CookiePolicy(){

    /**
     * One pre-defined policy which only accepts cookies from original server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookiePolicy.java
    public static final CookiePolicy ACCEPT_NONE = new CookiePolicy(){

    /**
     * One pre-defined policy which accepts no cookies.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CookiePolicy.java
public interface CookiePolicy {

/**
 * CookiePolicy implementations decide which cookies should be accepted
 * and which should be rejected. Three pre-defined policy implementations
 * are provided, namely ACCEPT_ALL, ACCEPT_NONE and ACCEPT_ORIGINAL_SERVER.
 *
 * <p>See RFC 2965 sec. 3.3 and 7 for more detail.
 *
 * @author Edward Wang
 * @since 1.6
 */
