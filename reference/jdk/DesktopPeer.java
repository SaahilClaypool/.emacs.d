_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void browse(URI uri) throws IOException;

    /**
     * Launches the user default browser to display the given URI.
     *
     * @param uri the given URI.
     * @throws IOException If the user default browser is not found,
     *         or it fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void mail(URI mailtoURL) throws IOException;

    /**
     * Launches the mail composing window of the user default mail client,
     * filling the message fields including to, cc, etc, with the values
     * specified by the given mailto URL.
     *
     * @param mailtoURL represents a mailto URL with specified values of the message.
     *        The syntax of mailto URL is defined by
     *        <a href="http://www.ietf.org/rfc/rfc2368.txt">RFC2368: The mailto
     *        URL scheme</a>
     * @throws IOException If the user default mail client is not found,
     *         or it fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void print(File file) throws IOException;

    /**
     * Prints the given file with the native desktop printing facility, using
     * the associated application's print command.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated application
     *         that can be used to print it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void edit(File file) throws IOException;

    /**
     * Launches the associated editor and opens the given file for editing. The
     * associated editor is registered to be the default editor for the file
     * type of the given file.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated editor, or
     *         the associated application fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void open(File file) throws IOException;

    /**
     * Launches the associated application to open the given file. The
     * associated application is registered to be the default file viewer for
     * the file type of the given file.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated application,
     *         or the associated application fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    boolean isSupported(Action action);

    /**
     * Returns whether the given action is supported on the current platform.
     * @param action the action type to be tested if it's supported on the
     *        current platform.
     * @return {@code true} if the given action is supported on
     *         the current platform; {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
public interface DesktopPeer {

/**
 * The {@code DesktopPeer} interface provides methods for the operation
 * of open, edit, print, browse and mail with the given URL or file, by
 * launching the associated application.
 * <p>
 * Each platform has an implementation class for this interface.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void browse(URI uri) throws IOException;

    /**
     * Launches the user default browser to display the given URI.
     *
     * @param uri the given URI.
     * @throws IOException If the user default browser is not found,
     *         or it fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void mail(URI mailtoURL) throws IOException;

    /**
     * Launches the mail composing window of the user default mail client,
     * filling the message fields including to, cc, etc, with the values
     * specified by the given mailto URL.
     *
     * @param mailtoURL represents a mailto URL with specified values of the message.
     *        The syntax of mailto URL is defined by
     *        <a href="http://www.ietf.org/rfc/rfc2368.txt">RFC2368: The mailto
     *        URL scheme</a>
     * @throws IOException If the user default mail client is not found,
     *         or it fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void print(File file) throws IOException;

    /**
     * Prints the given file with the native desktop printing facility, using
     * the associated application's print command.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated application
     *         that can be used to print it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void edit(File file) throws IOException;

    /**
     * Launches the associated editor and opens the given file for editing. The
     * associated editor is registered to be the default editor for the file
     * type of the given file.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated editor, or
     *         the associated application fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    void open(File file) throws IOException;

    /**
     * Launches the associated application to open the given file. The
     * associated application is registered to be the default file viewer for
     * the file type of the given file.
     *
     * @param file the given file.
     * @throws IOException If the given file has no associated application,
     *         or the associated application fails to be launched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
    boolean isSupported(Action action);

    /**
     * Returns whether the given action is supported on the current platform.
     * @param action the action type to be tested if it's supported on the
     *        current platform.
     * @return {@code true} if the given action is supported on
     *         the current platform; {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/DesktopPeer.java
public interface DesktopPeer {

/**
 * The {@code DesktopPeer} interface provides methods for the operation
 * of open, edit, print, browse and mail with the given URL or file, by
 * launching the associated application.
 * <p>
 * Each platform has an implementation class for this interface.
 *
 */
