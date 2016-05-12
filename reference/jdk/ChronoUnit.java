_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    @Override

    /**
     * Checks if this unit is a time unit.
     * <p>
     * All units from nanos to half-days inclusive are time-based.
     * Date-based units and {@code FOREVER} return false.
     *
     * @return true if a time unit, false if a date unit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    @Override

    /**
     * Checks if this unit is a date unit.
     * <p>
     * All units from days to eras inclusive are date-based.
     * Time-based units and {@code FOREVER} return false.
     *
     * @return true if a date unit, false if a time unit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    @Override

    /**
     * Checks if the duration of the unit is an estimate.
     * <p>
     * All time units in this class are considered to be accurate, while all date
     * units in this class are considered to be estimated.
     * <p>
     * This definition ignores leap seconds, but considers that Days vary due to
     * daylight saving time and months have different lengths.
     *
     * @return true if the duration is estimated, false if accurate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    @Override

    /**
     * Gets the estimated duration of this unit in the ISO calendar system.
     * <p>
     * All of the units in this class have an estimated duration.
     * Days vary due to daylight saving time, while months have different lengths.
     *
     * @return the estimated duration of this unit, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    ERAS("Eras", Duration.ofSeconds(31556952L * 1000_000_000L)),

    /**
     * Unit that represents the concept of an era.
     * The ISO calendar system doesn't have eras thus it is impossible to add
     * an era to a date or date-time.
     * The estimated duration of the era is artificially defined as {@code 1,000,000,000 Years}.
     * <p>
     * When used with other calendar systems there are no restrictions on the unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    CENTURIES("Centuries", Duration.ofSeconds(31556952L * 100L)),

    /**
     * Unit that represents the concept of a century.
     * For the ISO calendar system, it is equal to 100 years.
     * <p>
     * When used with other calendar systems it must correspond to an integral number of days
     * and is normally an integral number of years.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    YEARS("Years", Duration.ofSeconds(31556952L)),

    /**
     * Unit that represents the concept of a year.
     * For the ISO calendar system, it is equal to 12 months.
     * The estimated duration of a year is {@code 365.2425 Days}.
     * <p>
     * When used with other calendar systems it must correspond to an integral number of days
     * or months roughly equal to a year defined by the passage of the Earth around the Sun.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    WEEKS("Weeks", Duration.ofSeconds(7 * 86400L)),

    /**
     * Unit that represents the concept of a week.
     * For the ISO calendar system, it is equal to 7 days.
     * <p>
     * When used with other calendar systems it must correspond to an integral number of days.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),

    /**
     * Unit that represents the concept of half a day, as used in AM/PM.
     * For the ISO calendar system, it is equal to 12 hours.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    MINUTES("Minutes", Duration.ofSeconds(60)),

    /**
     * Unit that represents the concept of a minute.
     * For the ISO calendar system, it is equal to 60 seconds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    MILLIS("Millis", Duration.ofNanos(1000_000)),

    /**
     * Unit that represents the concept of a millisecond.
     * For the ISO calendar system, it is equal to the 1000th part of the second unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
    NANOS("Nanos", Duration.ofNanos(1)),

    /**
     * Unit that represents the concept of a nanosecond, the smallest supported unit of time.
     * For the ISO calendar system, it is equal to the 1,000,000,000th part of the second unit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/ChronoUnit.java
public enum ChronoUnit implements TemporalUnit {

/**
 * A standard set of date periods units.
 * <p>
 * This set of units provide unit-based access to manipulate a date, time or date-time.
 * The standard set of units can be extended by implementing {@link TemporalUnit}.
 * <p>
 * These units are intended to be applicable in multiple calendar systems.
 * For example, most non-ISO calendar systems define units of years, months and days,
 * just with slightly different rules.
 * The documentation of each unit explains how it operates.
 *
 * @implSpec
 * This is a final, immutable and thread-safe enum.
 *
 * @since 1.8
 */
