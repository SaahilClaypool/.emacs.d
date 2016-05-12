_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void showPopupMenu(int x, int y);

    /**
     * Shows the popup menu of this tray icon at the specified position.
     *
     * @param x the X location for the popup menu
     * @param y the Y location for the popup menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void displayMessage(String caption, String text, String messageType);

    /**
     * Displays a message at the tray icon.
     *
     * @param caption the message caption
     * @param text the actual message text
     * @param messageType the message type
     *
     * @see TrayIcon#displayMessage(String, String, java.awt.TrayIcon.MessageType)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void updateImage();

    /**
     * Updates the icon image. This is supposed to display the current icon
     * from the TrayIcon component in the actual tray icon.
     *
     * @see TrayIcon#setImage(java.awt.Image)
     * @see TrayIcon#setImageAutoSize(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void setToolTip(String tooltip);

    /**
     * Sets the tool tip for the tray icon.
     *
     * @param tooltip the tooltip to set
     *
     * @see TrayIcon#setToolTip(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void dispose();

    /**
     * Disposes the tray icon and releases and resources held by it.
     *
     * @see TrayIcon#removeNotify()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
public interface TrayIconPeer {

/**
 * The peer interface for the {@link TrayIcon}. This doesn't need to be
 * implemented if {@link SystemTray#isSupported()} returns false.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void showPopupMenu(int x, int y);

    /**
     * Shows the popup menu of this tray icon at the specified position.
     *
     * @param x the X location for the popup menu
     * @param y the Y location for the popup menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void displayMessage(String caption, String text, String messageType);

    /**
     * Displays a message at the tray icon.
     *
     * @param caption the message caption
     * @param text the actual message text
     * @param messageType the message type
     *
     * @see TrayIcon#displayMessage(String, String, java.awt.TrayIcon.MessageType)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void updateImage();

    /**
     * Updates the icon image. This is supposed to display the current icon
     * from the TrayIcon component in the actual tray icon.
     *
     * @see TrayIcon#setImage(java.awt.Image)
     * @see TrayIcon#setImageAutoSize(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void setToolTip(String tooltip);

    /**
     * Sets the tool tip for the tray icon.
     *
     * @param tooltip the tooltip to set
     *
     * @see TrayIcon#setToolTip(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
    void dispose();

    /**
     * Disposes the tray icon and releases and resources held by it.
     *
     * @see TrayIcon#removeNotify()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TrayIconPeer.java
public interface TrayIconPeer {

/**
 * The peer interface for the {@link TrayIcon}. This doesn't need to be
 * implemented if {@link SystemTray#isSupported()} returns false.
 */
