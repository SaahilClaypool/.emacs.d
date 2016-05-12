_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    private Object readResolve() {

    /**
     * Returns the object that will replace this one.
     *
     * @return the read object, should never be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    /**
     * Implements the {@code Externalizable} interface to read the object.
     * @serialData
     *
     * The streamed type and parameters defined by the type's {@code writeReplace}
     * method are read and passed to the corresponding static factory for the type
     * to create a new instance.  That instance is returned as the de-serialized
     * {@code Ser} object.
     *
     * <ul>
     * <li><a href="../../serialized-form.html#java.time.Duration">Duration</a> - {@code Duration.ofSeconds(seconds, nanos);}
     * <li><a href="../../serialized-form.html#java.time.Instant">Instant</a> - {@code Instant.ofEpochSecond(seconds, nanos);}
     * <li><a href="../../serialized-form.html#java.time.LocalDate">LocalDate</a> - {@code LocalDate.of(year, month, day);}
     * <li><a href="../../serialized-form.html#java.time.LocalDateTime">LocalDateTime</a> - {@code LocalDateTime.of(date, time);}
     * <li><a href="../../serialized-form.html#java.time.LocalTime">LocalTime</a> - {@code LocalTime.of(hour, minute, second, nano);}
     * <li><a href="../../serialized-form.html#java.time.MonthDay">MonthDay</a> - {@code MonthDay.of(month, day);}
     * <li><a href="../../serialized-form.html#java.time.OffsetTime">OffsetTime</a> - {@code OffsetTime.of(time, offset);}
     * <li><a href="../../serialized-form.html#java.time.OffsetDateTime">OffsetDateTime</a> - {@code OffsetDateTime.of(dateTime, offset);}
     * <li><a href="../../serialized-form.html#java.time.Period">Period</a> - {@code Period.of(years, months, days);}
     * <li><a href="../../serialized-form.html#java.time.Year">Year</a> - {@code Year.of(year);}
     * <li><a href="../../serialized-form.html#java.time.YearMonth">YearMonth</a> - {@code YearMonth.of(year, month);}
     * <li><a href="../../serialized-form.html#java.time.ZonedDateTime">ZonedDateTime</a> - {@code ZonedDateTime.ofLenient(dateTime, offset, zone);}
     * <li><a href="../../serialized-form.html#java.time.ZoneId">ZoneId</a> - {@code ZoneId.of(id);}
     * <li><a href="../../serialized-form.html#java.time.ZoneOffset">ZoneOffset</a> - {@code (offsetByte == 127 ? ZoneOffset.ofTotalSeconds(in.readInt()) : ZoneOffset.ofTotalSeconds(offsetByte * 900));}
     * </ul>
     *
     * @param in  the data to read, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    @Override

    /**
     * Implements the {@code Externalizable} interface to write the object.
     * @serialData
     *
     * Each serializable class is mapped to a type that is the first byte
     * in the stream.  Refer to each class {@code writeReplace}
     * serialized form for the value of the type and sequence of values for the type.
     * <ul>
     * <li><a href="../../serialized-form.html#java.time.Duration">Duration.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.Instant">Instant.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.LocalDate">LocalDate.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.LocalDateTime">LocalDateTime.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.LocalTime">LocalTime.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.MonthDay">MonthDay.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.OffsetTime">OffsetTime.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.OffsetDateTime">OffsetDateTime.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.Period">Period.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.Year">Year.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.YearMonth">YearMonth.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.ZoneId">ZoneId.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.ZoneOffset">ZoneOffset.writeReplace</a>
     * <li><a href="../../serialized-form.html#java.time.ZonedDateTime">ZonedDateTime.writeReplace</a>
     * </ul>
     *
     * @param out  the data stream to write to, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    Ser(byte type, Object object) {

    /**
     * Creates an instance for serialization.
     *
     * @param type  the type
     * @param object  the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    public Ser() {

    /**
     * Constructor for deserialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    private byte type;

    /** The type being serialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
    private static final long serialVersionUID = -7683839454370182990L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Ser.java
final class Ser implements Externalizable {

/**
 * The shared serialization delegate for this package.
 *
 * @implNote
 * This class wraps the object being serialized, and takes a byte representing the type of the class to
 * be serialized.  This byte can also be used for versioning the serialization format.  In this case another
 * byte flag would be used in order to specify an alternative version of the type format.
 * For example {@code LOCAL_DATE_TYPE_VERSION_2 = 21}.
 * <p>
 * In order to serialize the object it writes its byte and then calls back to the appropriate class where
 * the serialization is performed.  In order to deserialize the object it read in the type byte, switching
 * in order to select which class to call back into.
 * <p>
 * The serialization format is determined on a per class basis.  In the case of field based classes each
 * of the fields is written out with an appropriate size format in descending order of the field's size.  For
 * example in the case of {@link LocalDate} year is written before month.  Composite classes, such as
 * {@link LocalDateTime} are serialized as one object.
 * <p>
 * This class is mutable and should be created once per serialization.
 *
 * @serial include
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    private Object readResolve() {

    /**
     * Returns the object that will replace this one.
     *
     * @return the read object, should never be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    @Override

    /**
     * Implements the {@code Externalizable} interface to read the object.
     * @serialData
     * The streamed type and parameters defined by the type's {@code writeReplace}
     * method are read and passed to the corresponding static factory for the type
     * to create a new instance.  That instance is returned as the de-serialized
     * {@code Ser} object.
     *
     * <ul>
     * <li><a href="../../../serialized-form.html#java.time.chrono.HijrahChronology">HijrahChronology</a> - Chronology.of(id)
     * <li><a href="../../../serialized-form.html#java.time.chrono.IsoChronology">IsoChronology</a> - Chronology.of(id)
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseChronology">JapaneseChronology</a> - Chronology.of(id)
     * <li><a href="../../../serialized-form.html#java.time.chrono.MinguoChronology">MinguoChronology</a> - Chronology.of(id)
     * <li><a href="../../../serialized-form.html#java.time.chrono.ThaiBuddhistChronology">ThaiBuddhistChronology</a> - Chronology.of(id)
     * <li><a href="../../../serialized-form.html#java.time.chrono.ChronoLocalDateTimeImpl">ChronoLocalDateTime</a> - date.atTime(time)
     * <li><a href="../../../serialized-form.html#java.time.chrono.ChronoZonedDateTimeImpl">ChronoZonedDateTime</a> - dateTime.atZone(offset).withZoneSameLocal(zone)
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseDate">JapaneseDate</a> - JapaneseChronology.INSTANCE.date(year, month, dayOfMonth)
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseEra">JapaneseEra</a> - JapaneseEra.of(eraValue)
     * <li><a href="../../../serialized-form.html#java.time.chrono.HijrahDate">HijrahDate</a> - HijrahChronology chrono.date(year, month, dayOfMonth)
     * <li><a href="../../../serialized-form.html#java.time.chrono.MinguoDate">MinguoDate</a> - MinguoChronology.INSTANCE.date(year, month, dayOfMonth)
     * <li><a href="../../../serialized-form.html#java.time.chrono.ThaiBuddhistDate">ThaiBuddhistDate</a> - ThaiBuddhistChronology.INSTANCE.date(year, month, dayOfMonth)
     * </ul>
     *
     * @param in  the data stream to read from, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    @Override

    /**
     * Implements the {@code Externalizable} interface to write the object.
     * @serialData
     * Each serializable class is mapped to a type that is the first byte
     * in the stream.  Refer to each class {@code writeReplace}
     * serialized form for the value of the type and sequence of values for the type.
     * <ul>
     * <li><a href="../../../serialized-form.html#java.time.chrono.HijrahChronology">HijrahChronology.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.IsoChronology">IsoChronology.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseChronology">JapaneseChronology.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.MinguoChronology">MinguoChronology.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.ThaiBuddhistChronology">ThaiBuddhistChronology.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.ChronoLocalDateTimeImpl">ChronoLocalDateTime.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.ChronoZonedDateTimeImpl">ChronoZonedDateTime.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseDate">JapaneseDate.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.JapaneseEra">JapaneseEra.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.HijrahDate">HijrahDate.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.MinguoDate">MinguoDate.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.chrono.ThaiBuddhistDate">ThaiBuddhistDate.writeReplace</a>
     * </ul>
     *
     * @param out  the data stream to write to, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    Ser(byte type, Object object) {

    /**
     * Creates an instance for serialization.
     *
     * @param type  the type
     * @param object  the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    public Ser() {

    /**
     * Constructor for deserialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    private byte type;

    /** The type being serialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
    private static final long serialVersionUID = -6103370247208168577L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/Ser.java
final class Ser implements Externalizable {

/**
 * The shared serialization delegate for this package.
 *
 * @implNote
 * This class wraps the object being serialized, and takes a byte representing the type of the class to
 * be serialized.  This byte can also be used for versioning the serialization format.  In this case another
 * byte flag would be used in order to specify an alternative version of the type format.
 * For example {@code CHRONO_TYPE_VERSION_2 = 21}
 * <p>
 * In order to serialize the object it writes its byte and then calls back to the appropriate class where
 * the serialization is performed.  In order to deserialize the object it read in the type byte, switching
 * in order to select which class to call back into.
 * <p>
 * The serialization format is determined on a per class basis.  In the case of field based classes each
 * of the fields is written out with an appropriate size format in descending order of the field's size.  For
 * example in the case of {@link LocalDate} year is written before month.  Composite classes, such as
 * {@link LocalDateTime} are serialized as one object.  Enum classes are serialized using the index of their
 * element.
 * <p>
 * This class is mutable and should be created once per serialization.
 *
 * @serial include
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static long readEpochSec(DataInput in) throws IOException {

    /**
     * Reads the state from the stream.
     *
     * @param in  the input stream, not null
     * @return the epoch seconds, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static void writeEpochSec(long epochSec, DataOutput out) throws IOException {

    /**
     * Writes the state to the stream.
     *
     * @param epochSec  the epoch seconds, not null
     * @param out  the output stream, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static ZoneOffset readOffset(DataInput in) throws IOException {

    /**
     * Reads the state from the stream.
     *
     * @param in  the input stream, not null
     * @return the created object, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static void writeOffset(ZoneOffset offset, DataOutput out) throws IOException {

    /**
     * Writes the state to the stream.
     *
     * @param offset  the offset, not null
     * @param out  the output stream, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    private Object readResolve() {

    /**
     * Returns the object that will replace this one.
     *
     * @return the read object, should never be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    @Override

    /**
     * Implements the {@code Externalizable} interface to read the object.
     * @serialData
     * The streamed type and parameters defined by the type's {@code writeReplace}
     * method are read and passed to the corresponding static factory for the type
     * to create a new instance.  That instance is returned as the de-serialized
     * {@code Ser} object.
     *
     * <ul>
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneRules">ZoneRules</a>
     * - {@code ZoneRules.of(standardTransitions, standardOffsets, savingsInstantTransitions, wallOffsets, lastRules);}
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneOffsetTransition">ZoneOffsetTransition</a>
     * - {@code ZoneOffsetTransition of(LocalDateTime.ofEpochSecond(epochSecond), offsetBefore, offsetAfter);}
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneOffsetTransitionRule">ZoneOffsetTransitionRule</a>
     * - {@code ZoneOffsetTransitionRule.of(month, dom, dow, time, timeEndOfDay, timeDefinition, standardOffset, offsetBefore, offsetAfter);}
     * </ul>
     * @param in  the data to read, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    @Override

    /**
     * Implements the {@code Externalizable} interface to write the object.
     * @serialData
     * Each serializable class is mapped to a type that is the first byte
     * in the stream.  Refer to each class {@code writeReplace}
     * serialized form for the value of the type and sequence of values for the type.
     *
     * <ul>
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneRules">ZoneRules.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneOffsetTransition">ZoneOffsetTransition.writeReplace</a>
     * <li><a href="../../../serialized-form.html#java.time.zone.ZoneOffsetTransitionRule">ZoneOffsetTransitionRule.writeReplace</a>
     * </ul>
     *
     * @param out  the data stream to write to, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    Ser(byte type, Object object) {

    /**
     * Creates an instance for serialization.
     *
     * @param type  the type
     * @param object  the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    public Ser() {

    /**
     * Constructor for deserialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    private byte type;

    /** The type being serialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static final byte ZOTRULE = 3;

    /** Type for ZoneOffsetTransition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    static final byte ZRULES = 1;

    /** Type for ZoneRules. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
    private static final long serialVersionUID = -8885321777449118786L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/Ser.java
final class Ser implements Externalizable {

/**
 * The shared serialization delegate for this package.
 *
 * @implNote
 * This class is mutable and should be created once per serialization.
 *
 * @serial include
 * @since 1.8
 */
