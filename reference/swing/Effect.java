_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/Effect.java
    abstract BufferedImage applyEffect(BufferedImage src, BufferedImage dst, int w, int h);

    /**
     * Apply the effect to the src image generating the result . The result image may or may not contain the source
     * image depending on what the effect type is.
     *
     * @param src The source image for applying the effect to
     * @param dst The dstination image to paint effect result into. If this is null then a new image will be created
     * @param w   The width of the src image to apply effect to, this allow the src and dst buffers to be bigger than
     *            the area the need effect applied to it
     * @param h   The height of the src image to apply effect to, this allow the src and dst buffers to be bigger than
     *            the area the need effect applied to it
     * @return The result of appl
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/Effect.java
    abstract float getOpacity();

    /**
     * Get the opacity to use to paint the result effected image if the EffectType is UNDER or OVER.
     *
     * @return The opactity for the effect, 0.0f -> 1.0f
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/Effect.java
    abstract EffectType getEffectType();

    /**
     * Get the type of this effect, one of UNDER,BLENDED,OVER. UNDER means the result of apply effect should be painted
     * under the src image. BLENDED means the result of apply sffect contains a modified src image so just it should be
     * painted. OVER means the result of apply effect should be painted over the src image.
     *
     * @return The effect type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/Effect.java
abstract class Effect {

/**
 * Effect
 *
 * @author Created by Jasper Potts (Jun 18, 2007)
 */
