_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/SignStyle.java
    boolean parse(boolean positive, boolean strict, boolean fixedWidth) {

    /**
     * Parse helper.
     *
     * @param positive  true if positive sign parsed, false for negative sign
     * @param strict  true if strict, false if lenient
     * @param fixedWidth  true if fixed width, false if not
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/SignStyle.java
    EXCEEDS_PAD;

    /**
     * Style to always output the sign if the value exceeds the pad width.
     * A negative value will always output the '-' sign.
     * <p>
     * In strict parsing, the sign will be rejected unless the pad width is exceeded.
     * In lenient parsing, any sign will be accepted, with the absence
     * of a sign treated as a positive number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/SignStyle.java
    NEVER,

    /**
     * Style to never output sign, only outputting the absolute value.
     * <p>
     * In strict parsing, any sign will be rejected.
     * In lenient parsing, any sign will be accepted unless the width is fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/SignStyle.java
    NORMAL,

    /**
     * Style to output the sign only if the value is negative.
     * <p>
     * In strict parsing, the negative sign will be accepted and the positive sign rejected.
     * In lenient parsing, any sign will be accepted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/SignStyle.java
public enum SignStyle {

/**
 * Enumeration of ways to handle the positive/negative sign.
 * <p>
 * The formatting engine allows the positive and negative signs of numbers
 * to be controlled using this enum.
 * See {@link DateTimeFormatterBuilder} for usage.
 *
 * @implSpec
 * This is an immutable and thread-safe enum.
 *
 * @since 1.8
 */
