_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/ResolverStyle.java
    LENIENT;

    /**
     * Style to resolve dates and times leniently.
     * <p>
     * Using lenient resolution will resolve the values in an appropriate
     * lenient manner. Individual fields will interpret this differently.
     * <p>
     * For example, lenient mode allows the month in the ISO calendar system
     * to be outside the range 1 to 12.
     * For example, month 15 is treated as being 3 months after month 12.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/ResolverStyle.java
    STRICT,

    /**
     * Style to resolve dates and times strictly.
     * <p>
     * Using strict resolution will ensure that all parsed values are within
     * the outer range of valid values for the field. Individual fields may
     * be further processed for strictness.
     * <p>
     * For example, resolving year-month and day-of-month in the ISO calendar
     * system using strict mode will ensure that the day-of-month is valid
     * for the year-month, rejecting invalid values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/ResolverStyle.java
public enum ResolverStyle {

/**
 * Enumeration of different ways to resolve dates and times.
 * <p>
 * Parsing a text string occurs in two phases.
 * Phase 1 is a basic text parse according to the fields added to the builder.
 * Phase 2 resolves the parsed field-value pairs into date and/or time objects.
 * This style is used to control how phase 2, resolving, happens.
 *
 * @implSpec
 * This is an immutable and thread-safe enum.
 *
 * @since 1.8
 */
