_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    private void updateOptionPaneState() {

    /**
     * Updates any state dependant upon the JInternalFrame being shown in
     * a <code>JOptionPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    protected void addSubComponents() {

    /**
     * Override the parent's method avoid creating a menu bar. Metal frames
     * do not have system menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    protected void showSystemMenu() {}

    /**
     * Override the parent's method to do nothing. Metal frames do not
     * have system menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    protected void addSystemMenuItems(JMenu systemMenu) {}

    /**
     * Override the parent's method to do nothing. Metal frames do not
     * have system menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    protected void assembleSystemMenu() {}

    /**
     * Override the parent's method to do nothing. Metal frames do not
     * have system menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    private String selectedShadowKey;

    /**
     * Key used to lookup shadow color from UIManager. If this is null,
     * <code>getPrimaryControlDarkShadow</code> is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
    private String selectedBackgroundKey;

    /**
     * Key used to lookup Color from UIManager. If this is null,
     * <code>getWindowTitleBackground</code> is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalInternalFrameTitlePane.java
public class MetalInternalFrameTitlePane  extends BasicInternalFrameTitlePane {

/**
 * Class that manages a JLF title bar
 * @author Steve Wilson
 * @author Brian Beck
 * @since 1.3
 */
