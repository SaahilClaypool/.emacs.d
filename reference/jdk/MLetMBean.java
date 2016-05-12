_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public void setLibraryDirectory(String libdir);

    /**
     * Sets the directory used by the library loader for storing
     * native libraries before they are loaded into memory.
     *
     * @param libdir The directory used by the library loader.
     *
     * @see #getLibraryDirectory
     *
     * @throws UnsupportedOperationException if this implementation
     * does not support storing native libraries in this way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public String getLibraryDirectory();

    /**
     * Gets the current directory used by the library loader for
     * storing native libraries before they are loaded into memory.
     *
     * @return The current directory used by the library loader.
     *
     * @see #setLibraryDirectory
     *
     * @throws UnsupportedOperationException if this implementation
     * does not support storing native libraries in this way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public Enumeration<URL> getResources(String name) throws IOException;

    /**
     * Finds all the resources with the given name. A resource is some
     * data (images, audio, text, etc) that can be accessed by class
     * code in a way that is independent of the location of the code.
     * The name of a resource is a "/"-separated path name that
     * identifies the resource.
     *
     * @param name The  resource name.
     *
     * @return An enumeration of URL to the resource. If no resources
     * could be found, the enumeration will be empty. Resources that
     * cannot be accessed will not be in the enumeration.
     *
     * @exception IOException if an I/O exception occurs when
     * searching for resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public InputStream getResourceAsStream(String name);

    /** Returns an input stream for reading the specified resource. The search order is described in the documentation for
     *  getResource(String).
     *
     * @param name  The resource name
     *
     * @return An input stream for reading the resource, or null if the resource could not be found
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public URL getResource(String name);

    /** Finds the resource with the given name.
     * A resource is some data (images, audio, text, etc) that can be accessed by class code in a way that is
     *   independent of the location of the code.
     *   The name of a resource is a "/"-separated path name that identifies the resource.
     *
     * @param name The resource name
     *
     * @return  An URL for reading the resource, or null if the resource could not be found or the caller doesn't have adequate privileges to get the
     * resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public URL[] getURLs();

    /**
     * Returns the search path of URLs for loading classes and resources.
     * This includes the original list of URLs specified to the constructor,
     * along with any URLs subsequently appended by the addURL() method.
     *
     * @return the list of URLs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public void addURL(String url) throws ServiceNotFoundException;

    /**
     * Appends the specified URL to the list of URLs to search for classes and
     * resources.
     *
     * @param url the URL to add.
     *
     * @exception ServiceNotFoundException The specified URL is malformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public void addURL(URL url) ;

    /**
     * Appends the specified URL to the list of URLs to search for classes and
     * resources.
     *
     * @param url the URL to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public Set<Object> getMBeansFromURL(URL url)

    /**
     * Loads a text file containing MLET tags that define the MBeans
     * to be added to the MBean server. The location of the text file is
     * specified by a URL. The text file is read using the UTF-8
     * encoding. The MBeans specified in the MLET file will be
     * instantiated and registered in the MBean server.
     *
     * @param url The URL of the text file to be loaded as URL object.
     *
     * @return A set containing one entry per MLET tag in the m-let
     * text file loaded.  Each entry specifies either the
     * ObjectInstance for the created MBean, or a throwable object
     * (that is, an error or an exception) if the MBean could not be
     * created.
     *
     * @exception ServiceNotFoundException One of the following errors
     * has occurred: The m-let text file does not contain an MLET tag,
     * the m-let text file is not found, a mandatory attribute of the
     * MLET tag is not specified, the value of url is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
    public Set<Object> getMBeansFromURL(String url)

    /**
     * Loads a text file containing MLET tags that define the MBeans
     * to be added to the MBean server. The location of the text file is
     * specified by a URL. The text file is read using the UTF-8
     * encoding. The MBeans specified in the MLET file will be
     * instantiated and registered in the MBean server.
     *
     * @param url The URL of the text file to be loaded as String object.
     *
     * @return A set containing one entry per MLET tag in the m-let
     * text file loaded.  Each entry specifies either the
     * ObjectInstance for the created MBean, or a throwable object
     * (that is, an error or an exception) if the MBean could not be
     * created.
     *
     * @exception ServiceNotFoundException One of the following errors
     * has occurred: The m-let text file does not contain an MLET tag,
     * the m-let text file is not found, a mandatory attribute of the
     * MLET tag is not specified, the value of url is malformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetMBean.java
public interface MLetMBean   {

/**
 * Exposes the remote management interface of the MLet
 * MBean.
 *
 * @since 1.5
 */
