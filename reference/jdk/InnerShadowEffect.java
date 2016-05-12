_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/InnerShadowEffect.java
    BufferedImage applyEffect(BufferedImage src, BufferedImage dst, int w, int h) {

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
     * @return Image with the result of the effect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/InnerShadowEffect.java
    Effect.EffectType getEffectType() {

    /**
     * Get the type of this effect, one of UNDER,BLENDED,OVER. UNDER means the result of apply effect should be painted
     * under the src image. BLENDED means the result of apply sffect contains a modified src image so just it should be
     * painted. OVER means the result of apply effect should be painted over the src image.
     *
     * @return The effect type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/InnerShadowEffect.java
class InnerShadowEffect extends ShadowEffect {

/**
 * InnerShadowEffect - This effect currently only works with ARGB type buffered
 * images.
 *
 * @author Created by Jasper Potts (Jun 18, 2007)
 */
