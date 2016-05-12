_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    boolean isSystemTheme() {

    /**
     * Returns true if this is a theme provided by the core platform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    void install() {

    /**
     * This is invoked when a MetalLookAndFeel is installed and about to
     * start using this theme. When we can add API this should be nuked
     * in favor of DefaultMetalTheme overriding addCustomEntriesToTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public void addCustomEntriesToTable(UIDefaults table) {}

    /**
     * Adds values specific to this theme to the defaults table. This method
     * is invoked when the look and feel defaults are obtained from
     * {@code MetalLookAndFeel}.
     * <p>
     * This implementation does nothing; it is provided for subclasses
     * that wish to customize the defaults table.
     *
     * @param table the {@code UIDefaults} to add the values to
     *
     * @see MetalLookAndFeel#getDefaults
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getAcceleratorSelectedForeground() { return getBlack(); }

    /**
     * Returns the accelerator selected foreground color. This
     * returns the value of {@code getBlack()}.
     *
     * @return the accelerator selected foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getAcceleratorForeground() { return getPrimary1(); }

    /**
     * Returns the accelerator foreground color. This
     * returns the value of {@code getPrimary1()}.
     *
     * @return the accelerator foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getSeparatorForeground() { return getPrimary1(); }

    /**
     * Returns the separator foreground color. This
     * returns the value of {@code getPrimary1()}.
     *
     * @return the separator foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getSeparatorBackground() { return getWhite(); }

    /**
     * Returns the separator background color. This
     * returns the value of {@code getWhite()}.
     *
     * @return the separator background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getMenuDisabledForeground() { return getSecondary2(); }

    /**
     * Returns the menu disabled foreground color. This
     * returns the value of {@code getSecondary2()}.
     *
     * @return the menu disabled foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getMenuSelectedForeground() { return getBlack(); }

    /**
     * Returns the menu selected foreground color. This
     * returns the value of {@code getBlack()}.
     *
     * @return the menu selected foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getMenuSelectedBackground() { return getPrimary2(); }

    /**
     * Returns the menu selected background color. This
     * returns the value of {@code getPrimary2()}.
     *
     * @return the menu selected background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getMenuForeground() { return  getBlack(); }

    /**
     * Returns the menu foreground color. This
     * returns the value of {@code getBlack()}.
     *
     * @return the menu foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getMenuBackground() { return getSecondary3(); }

    /**
     * Returns the menu background color. This
     * returns the value of {@code getSecondary3()}.
     *
     * @return the menu background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getWindowTitleInactiveForeground() { return getBlack(); }

    /**
     * Returns the window title inactive foreground color. This
     * returns the value of {@code getBlack()}.
     *
     * @return the window title inactive foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getWindowTitleInactiveBackground() { return getSecondary3(); }

    /**
     * Returns the window title inactive background color. This
     * returns the value of {@code getSecondary3()}.
     *
     * @return the window title inactive background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getWindowTitleForeground() { return getBlack(); }

    /**
     * Returns the window title foreground color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the window title foreground color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getWindowTitleBackground() { return getPrimary3(); }

    /**
     * Returns the window title background color. This returns the value of
     * {@code getPrimary3()}.
     *
     * @return the window title background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getWindowBackground() { return getWhite(); }

    /**
     * Returns the window background color. This returns the value of
     * {@code getWhite()}.
     *
     * @return the window background color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getHighlightedTextColor() { return getControlTextColor(); }

    /**
     * Returns the highlighted text color. This returns the value of
     * {@code getControlTextColor()}.
     *
     * @return the highlighted text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getTextHighlightColor() { return getPrimary3(); }

    /**
     * Returns the text highlight color. This returns the value of
     * {@code getPrimary3()}.
     *
     * @return the text highlight color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getUserTextColor() { return getBlack(); }

    /**
     * Returns the user text color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the user text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getInactiveSystemTextColor() { return getSecondary2(); }

    /**
     * Returns the inactive system text color. This returns the value of
     * {@code getSecondary2()}.
     *
     * @return the inactive system text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getInactiveControlTextColor() { return getControlDisabled(); }

    /**
     * Returns the inactive control text color. This returns the value of
     * {@code getControlDisabled()}.
     *
     * @return the inactive control text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlTextColor() { return getControlInfo(); }

    /**
     * Returns the control text color. This returns the value of
     * {@code getControlInfo()}.
     *
     * @return the control text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getSystemTextColor() { return getBlack(); }

    /**
     * Returns the system text color. This returns the value of
     * {@code getBlack()}.
     *
     * @return the system text color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getPrimaryControlHighlight() { return getWhite(); }

    /**
     * Returns the primary control highlight color. This
     * returns the value of {@code getWhite()}.
     *
     * @return the primary control highlight color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getPrimaryControlInfo() { return getBlack(); }

    /**
     * Returns the primary control info color. This
     * returns the value of {@code getBlack()}.
     *
     * @return the primary control info color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getPrimaryControlShadow() { return getPrimary2(); }

    /**
     * Returns the primary control shadow color. This returns
     * the value of {@code getPrimary2()}.
     *
     * @return the primary control shadow color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getPrimaryControl() { return getPrimary3(); }

    /**
     * Returns the primary control color. This returns
     * the value of {@code getPrimary3()}.
     *
     * @return the primary control color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlDisabled() { return getSecondary2(); }

    /**
     * Returns the control disabled color. This returns
     * the value of {@code getSecondary2()}.
     *
     * @return the control disabled color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlHighlight() { return getWhite(); }

    /**
     * Returns the control highlight color. This returns
     * the value of {@code getWhite()}.
     *
     * @return the control highlight color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlInfo() { return getBlack(); }

    /**
     * Returns the control info color. This returns
     * the value of {@code getBlack()}.
     *
     * @return the control info color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlDarkShadow() { return getSecondary1(); }

    /**
     * Returns the control dark shadow color. This returns
     * the value of {@code getSecondary1()}.
     *
     * @return the control dark shadow color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControlShadow() { return getSecondary2(); }

    /**
     * Returns the control shadow color. This returns
     * the value of {@code getSecondary2()}.
     *
     * @return the control shadow color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getControl() { return getSecondary3(); }

    /**
     * Returns the control color. This returns the value of
     * {@code getSecondary3()}.
     *
     * @return the control color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public  ColorUIResource getDesktopColor() { return getPrimary2(); }

    /**
     * Returns the desktop color. This returns the value of
     * {@code getPrimary2()}.
     *
     * @return the desktop color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public ColorUIResource getFocusColor() { return getPrimary2(); }

    /**
     * Returns the focus color. This returns the value of
     * {@code getPrimary2()}.
     *
     * @return the focus color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected ColorUIResource getBlack() { return black; }

    /**
     * Returns the black color. This returns opaque black
     * ({@code 0xFF000000}).
     *
     * @return the black color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected ColorUIResource getWhite() { return white; }

    /**
     * Returns the white color. This returns opaque white
     * ({@code 0xFFFFFFFF}).
     *
     * @return the white color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getSubTextFont();

    /**
     * Returns the sub-text font.
     *
     * @return the sub-text font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getWindowTitleFont();

    /**
     * Returns the window title font.
     *
     * @return the window title font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getMenuTextFont();

    /**
     * Returns the menu text font.
     *
     * @return the menu text font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getUserTextFont();

    /**
     * Returns the user text font.
     *
     * @return the user text font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getSystemTextFont();

    /**
     * Returns the system text font.
     *
     * @return the system text font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract FontUIResource getControlTextFont();

    /**
     * Returns the control text font.
     *
     * @return the control text font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getSecondary3();

    /**
     * Returns the secondary 3 color.
     *
     * @return the secondary 3 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getSecondary2();

    /**
     * Returns the secondary 2 color.
     *
     * @return the secondary 2 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getSecondary1();  // these are gray in Metal Default Theme

    /**
     * Returns the secondary 1 color.
     *
     * @return the secondary 1 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getPrimary3();

    /**
     * Returns the primary 3 color.
     *
     * @return the primary 3 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getPrimary2();

    /**
     * Returns the primary 2 color.
     *
     * @return the primary 2 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    protected abstract ColorUIResource getPrimary1();  // these are blue in Metal Default Theme

    /**
     * Returns the primary 1 color.
     *
     * @return the primary 1 color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
    public abstract String getName();

    /**
     * Returns the name of this theme.
     *
     * @return the name of this theme
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTheme.java
public abstract class MetalTheme {

/**
 * {@code MetalTheme} provides the color palette and fonts used by
 * the Java Look and Feel.
 * <p>
 * {@code MetalTheme} is abstract, see {@code DefaultMetalTheme} and
 * {@code OceanTheme} for concrete implementations.
 * <p>
 * {@code MetalLookAndFeel} maintains the current theme that the
 * the {@code ComponentUI} implementations for metal use. Refer to
 * {@link MetalLookAndFeel#setCurrentTheme
 * MetalLookAndFeel.setCurrentTheme(MetalTheme)} for details on changing
 * the current theme.
 * <p>
 * {@code MetalTheme} provides a number of public methods for getting
 * colors. These methods are implemented in terms of a
 * handful of protected abstract methods. A subclass need only override
 * the protected abstract methods ({@code getPrimary1},
 * {@code getPrimary2}, {@code getPrimary3}, {@code getSecondary1},
 * {@code getSecondary2}, and {@code getSecondary3}); although a subclass
 * may override the other public methods for more control over the set of
 * colors that are used.
 * <p>
 * Concrete implementations of {@code MetalTheme} must return {@code non-null}
 * values from all methods. While the behavior of returning {@code null} is
 * not specified, returning {@code null} will result in incorrect behavior.
 * <p>
 * It is strongly recommended that subclasses return completely opaque colors.
 * To do otherwise may result in rendering problems, such as visual garbage.
 *
 * @see DefaultMetalTheme
 * @see OceanTheme
 * @see MetalLookAndFeel#setCurrentTheme
 *
 * @author Steve Wilson
 */
