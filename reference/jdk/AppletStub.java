_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    void appletResize(int width, int height);

    /**
     * Called when the applet wants to be resized.
     *
     * @param   width    the new requested width for the applet.
     * @param   height   the new requested height for the applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    AppletContext getAppletContext();

    /**
     * Returns the applet's context.
     *
     * @return  the applet's context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    String getParameter(String name);

    /**
     * Returns the value of the named parameter in the HTML tag. For
     * example, if an applet is specified as
     * <blockquote><pre>
     * &lt;applet code="Clock" width=50 height=50&gt;
     * &lt;param name=Color value="blue"&gt;
     * &lt;/applet&gt;
     * </pre></blockquote>
     * <p>
     * then a call to <code>getParameter("Color")</code> returns the
     * value <code>"blue"</code>.
     *
     * @param   name   a parameter name.
     * @return  the value of the named parameter,
     * or <tt>null</tt> if not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    URL getCodeBase();

    /**
     * Gets the base URL. This is the URL of the directory which contains the applet.
     *
     * @return  the base {@link java.net.URL} of
     *          the directory which contains the applet.
     * @see     java.applet.AppletStub#getDocumentBase()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    URL getDocumentBase();

    /**
     * Gets the URL of the document in which the applet is embedded.
     * For example, suppose an applet is contained
     * within the document:
     * <blockquote><pre>
     *    http://www.oracle.com/technetwork/java/index.html
     * </pre></blockquote>
     * The document base is:
     * <blockquote><pre>
     *    http://www.oracle.com/technetwork/java/index.html
     * </pre></blockquote>
     *
     * @return  the {@link java.net.URL} of the document that contains the
     *          applet.
     * @see     java.applet.AppletStub#getCodeBase()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
public interface AppletStub {

/**
 * When an applet is first created, an applet stub is attached to it
 * using the applet's <code>setStub</code> method. This stub
 * serves as the interface between the applet and the browser
 * environment or applet viewer environment in which the application
 * is running.
 *
 * @author      Arthur van Hoff
 * @see         java.applet.Applet#setStub(java.applet.AppletStub)
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    void appletResize(int width, int height);

    /**
     * Called when the applet wants to be resized.
     *
     * @param   width    the new requested width for the applet.
     * @param   height   the new requested height for the applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    AppletContext getAppletContext();

    /**
     * Returns the applet's context.
     *
     * @return  the applet's context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    String getParameter(String name);

    /**
     * Returns the value of the named parameter in the HTML tag. For
     * example, if an applet is specified as
     * <blockquote><pre>
     * &lt;applet code="Clock" width=50 height=50&gt;
     * &lt;param name=Color value="blue"&gt;
     * &lt;/applet&gt;
     * </pre></blockquote>
     * <p>
     * then a call to <code>getParameter("Color")</code> returns the
     * value <code>"blue"</code>.
     *
     * @param   name   a parameter name.
     * @return  the value of the named parameter,
     * or <tt>null</tt> if not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    URL getCodeBase();

    /**
     * Gets the base URL. This is the URL of the directory which contains the applet.
     *
     * @return  the base {@link java.net.URL} of
     *          the directory which contains the applet.
     * @see     java.applet.AppletStub#getDocumentBase()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
    URL getDocumentBase();

    /**
     * Gets the URL of the document in which the applet is embedded.
     * For example, suppose an applet is contained
     * within the document:
     * <blockquote><pre>
     *    http://www.oracle.com/technetwork/java/index.html
     * </pre></blockquote>
     * The document base is:
     * <blockquote><pre>
     *    http://www.oracle.com/technetwork/java/index.html
     * </pre></blockquote>
     *
     * @return  the {@link java.net.URL} of the document that contains the
     *          applet.
     * @see     java.applet.AppletStub#getCodeBase()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/applet/AppletStub.java
public interface AppletStub {

/**
 * When an applet is first created, an applet stub is attached to it
 * using the applet's <code>setStub</code> method. This stub
 * serves as the interface between the applet and the browser
 * environment or applet viewer environment in which the application
 * is running.
 *
 * @author      Arthur van Hoff
 * @see         java.applet.Applet#setStub(java.applet.AppletStub)
 * @since       JDK1.0
 */
