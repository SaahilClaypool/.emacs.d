_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusIcon.java
    private int scale(SynthContext context, int size) {

    /**
     * Scale a size based on the "JComponent.sizeVariant" client property of the
     * component that is using this icon
     *
     * @param context The synthContext to get the component from
     * @param size The size to scale
     * @return The scaled size or original if "JComponent.sizeVariant" is not
     *          set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusIcon.java
    @Override

    /**
     * Implements the standard Icon interface's paintIcon method as the standard
     * synth stub passes null for the context and this will cause us to not
     * paint any thing, so we override here so that we can paint the enabled
     * state if no synth context is available
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusIcon.java
class NimbusIcon extends SynthIcon {

/**
 * An icon that delegates to a painter.
 * @author rbair
 */
