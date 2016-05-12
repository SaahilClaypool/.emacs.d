_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    static int getFontSize(String pangoName) {

    /**
     * Parses a String containing a pango font description and returns
     * the (unscaled) font size as an integer.
     *
     * @param pangoName a String describing a pango font
     * @return the size of the font described by pangoName (e.g. if
     *         pangoName is "Sans Italic 10", then this method returns 10)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    static Font lookupFont(String pangoName) {

    /**
     * Parses a String containing a pango font description and returns
     * a Font object.
     *
     * @param pangoName a String describing a pango font
     *                  e.g. "Sans Italic 10"
     * @return a Font object as a FontUIResource
     *         or null if no suitable font could be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    private static double fontScale;

    /**
     * Calculate a default scale factor for fonts in this L&F to match
     * the reported resolution of the screen.
     * Java 2D specified a default user-space scale of 72dpi.
     * This is unlikely to correspond to that of the real screen.
     * The Xserver reports a value which may be used to adjust for this.
     * and Java 2D exposes it via a normalizing transform.
     * However many Xservers report a hard-coded 90dpi whilst others report a
     * calculated value based on possibly incorrect data.
     * That is something that must be solved at the X11 level
     * Note that in an X11 multi-screen environment, the default screen
     * is the one used by the JRE so it is safe to use it here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
class PangoFonts {

/**
 * @author Shannon Hickey
 * @author Leif Samuelsson
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    static int getFontSize(String pangoName) {

    /**
     * Parses a String containing a pango font description and returns
     * the (unscaled) font size as an integer.
     *
     * @param pangoName a String describing a pango font
     * @return the size of the font described by pangoName (e.g. if
     *         pangoName is "Sans Italic 10", then this method returns 10)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    static Font lookupFont(String pangoName) {

    /**
     * Parses a String containing a pango font description and returns
     * a Font object.
     *
     * @param pangoName a String describing a pango font
     *                  e.g. "Sans Italic 10"
     * @return a Font object as a FontUIResource
     *         or null if no suitable font could be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
    private static double fontScale;

    /**
     * Calculate a default scale factor for fonts in this L&F to match
     * the reported resolution of the screen.
     * Java 2D specified a default user-space scale of 72dpi.
     * This is unlikely to correspond to that of the real screen.
     * The Xserver reports a value which may be used to adjust for this.
     * and Java 2D exposes it via a normalizing transform.
     * However many Xservers report a hard-coded 90dpi whilst others report a
     * calculated value based on possibly incorrect data.
     * That is something that must be solved at the X11 level
     * Note that in an X11 multi-screen environment, the default screen
     * is the one used by the JRE so it is safe to use it here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/PangoFonts.java
class PangoFonts {

/**
 * @author Shannon Hickey
 * @author Leif Samuelsson
 */
