_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public void setAuthorizedID(String id) {

    /**
     * Sets the id of the authorized entity. Called by handler only when the id
     * is different from getAuthorizationID(). For example, the id
     * might need to be canonicalized for the environment in which it
     * will be used.
     * @param id The id of the authorized user.
     * @see #setAuthorized(boolean)
     * @see #getAuthorizedID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public String getAuthorizedID() {

    /**
     * Returns the id of the authorized user.
     * @return The id of the authorized user. {@code null} means the
     * authorization failed.
     * @see #setAuthorized(boolean)
     * @see #setAuthorizedID(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public void setAuthorized(boolean ok) {

    /**
     * Sets whether the authorization is allowed.
     * @param ok {@code true} if authorization is allowed; {@code false} otherwise
     * @see #isAuthorized
     * @see #setAuthorizedID(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public boolean isAuthorized() {

    /**
     * Determines whether the authentication id is allowed to
     * act on behalf of the authorization id.
     *
     * @return {@code true} if authorization is allowed; {@code false} otherwise
     * @see #setAuthorized(boolean)
     * @see #getAuthorizedID()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public String getAuthorizationID() {

    /**
     * Returns the authorization id to check.
     * @return The authentication id to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public String getAuthenticationID() {

    /**
     * Returns the authentication id to check.
     * @return The authentication id to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    public AuthorizeCallback(String authnID, String authzID) {

    /**
     * Constructs an instance of {@code AuthorizeCallback}.
     *
     * @param authnID   The (authenticated) authentication id.
     * @param authzID   The authorization id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    private boolean authorized;

    /**
     * A flag indicating whether the authentication id is allowed to
     * act on behalf of the authorization id.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    private String authorizedID;

    /**
     * The id of the authorized entity. If null, the id of
     * the authorized entity is authorizationID.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
    private String authorizationID;

    /**
     * The authorization id to check.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthorizeCallback.java
public class AuthorizeCallback implements Callback, java.io.Serializable {

/**
  * This callback is used by {@code SaslServer} to determine whether
  * one entity (identified by an authenticated authentication id)
  * can act on
  * behalf of another entity (identified by an authorization id).
  *
  * @since 1.5
  *
  * @author Rosanna Lee
  * @author Rob Weltman
  */
