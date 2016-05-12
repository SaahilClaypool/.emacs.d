_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void dispose();

    /**
     * Disposes the robot peer when it is not needed anymore.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    int[] getRGBPixels(Rectangle bounds);

    /**
     * Gets the RGB values of the specified screen area as an array.
     *
     * @param bounds the screen area to capture the RGB values from
     *
     * @return the RGB values of the specified screen area
     *
     * @see Robot#createScreenCapture(Rectangle)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    int getRGBPixel(int x, int y);

    /**
     * Gets the RGB value of the specified pixel on screen.
     *
     * @param x the X screen coordinate
     * @param y the Y screen coordinate
     *
     * @return the RGB value of the specified pixel on screen
     *
     * @see Robot#getPixelColor(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void keyRelease(int keycode);

    /**
     * Simulates a key release of the specified key.
     *
     * @param keycode the key code to release
     *
     * @see Robot#keyRelease(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void keyPress(int keycode);

    /**
     * Simulates a key press of the specified key.
     *
     * @param keycode the key code to press
     *
     * @see Robot#keyPress(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseWheel(int wheelAmt);

    /**
     * Simulates mouse wheel action.
     *
     * @param wheelAmt number of notches to move the mouse wheel
     *
     * @see Robot#mouseWheel(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseRelease(int buttons);

    /**
     * Simulates a mouse release with the specified button(s).
     *
     * @param buttons the button mask
     *
     * @see Robot#mouseRelease(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mousePress(int buttons);

    /**
     * Simulates a mouse press with the specified button(s).
     *
     * @param buttons the button mask
     *
     * @see Robot#mousePress(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseMove(int x, int y);

    /**
     * Moves the mouse pointer to the specified screen location.
     *
     * @param x the X location on screen
     * @param y the Y location on screen
     *
     * @see Robot#mouseMove(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
public interface RobotPeer

/**
 * RobotPeer defines an interface whereby toolkits support automated testing
 * by allowing native input events to be generated from Java code.
 *
 * This interface should not be directly imported by code outside the
 * java.awt.* hierarchy; it is not to be considered public and is subject
 * to change.
 *
 * @author      Robi Khan
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void dispose();

    /**
     * Disposes the robot peer when it is not needed anymore.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    int[] getRGBPixels(Rectangle bounds);

    /**
     * Gets the RGB values of the specified screen area as an array.
     *
     * @param bounds the screen area to capture the RGB values from
     *
     * @return the RGB values of the specified screen area
     *
     * @see Robot#createScreenCapture(Rectangle)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    int getRGBPixel(int x, int y);

    /**
     * Gets the RGB value of the specified pixel on screen.
     *
     * @param x the X screen coordinate
     * @param y the Y screen coordinate
     *
     * @return the RGB value of the specified pixel on screen
     *
     * @see Robot#getPixelColor(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void keyRelease(int keycode);

    /**
     * Simulates a key release of the specified key.
     *
     * @param keycode the key code to release
     *
     * @see Robot#keyRelease(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void keyPress(int keycode);

    /**
     * Simulates a key press of the specified key.
     *
     * @param keycode the key code to press
     *
     * @see Robot#keyPress(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseWheel(int wheelAmt);

    /**
     * Simulates mouse wheel action.
     *
     * @param wheelAmt number of notches to move the mouse wheel
     *
     * @see Robot#mouseWheel(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseRelease(int buttons);

    /**
     * Simulates a mouse release with the specified button(s).
     *
     * @param buttons the button mask
     *
     * @see Robot#mouseRelease(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mousePress(int buttons);

    /**
     * Simulates a mouse press with the specified button(s).
     *
     * @param buttons the button mask
     *
     * @see Robot#mousePress(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
    void mouseMove(int x, int y);

    /**
     * Moves the mouse pointer to the specified screen location.
     *
     * @param x the X location on screen
     * @param y the Y location on screen
     *
     * @see Robot#mouseMove(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/RobotPeer.java
public interface RobotPeer

/**
 * RobotPeer defines an interface whereby toolkits support automated testing
 * by allowing native input events to be generated from Java code.
 *
 * This interface should not be directly imported by code outside the
 * java.awt.* hierarchy; it is not to be considered public and is subject
 * to change.
 *
 * @author      Robi Khan
 */
