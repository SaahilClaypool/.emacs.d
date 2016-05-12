_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
    protected Object getDefaultValue() {

    /**
     * Returns the default font.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
    protected Object configureValue(Object value) {

    /**
     * Overriden to create a Font with the size coming from the desktop
     * and the style and name coming from DefaultMetalTheme.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
    MetalFontDesktopProperty(String key, int type) {

    /**
     * Creates a MetalFontDesktopProperty.
     *
     * @param key Key used in looking up desktop value.
     * @param toolkit Toolkit used to fetch property from, can be null
     *        in which default will be used.
     * @param type Type of font being used, corresponds to MetalTheme font
     *        type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
    MetalFontDesktopProperty(int type) {

    /**
     * Creates a MetalFontDesktopProperty. The key used to lookup the
     * desktop property is determined from the type of font.
     *
     * @param type MetalTheme font type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
    private int type;

    /**
     * Corresponds to a MetalTheme font type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalFontDesktopProperty.java
class MetalFontDesktopProperty extends com.sun.java.swing.plaf.windows.DesktopProperty {

/**
 * DesktopProperty that only uses font height in configuring font. This
 * is only used on Windows.
 *
 */
