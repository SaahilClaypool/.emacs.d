_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CalendarBuilder.java
class CalendarBuilder {

/**
 * {@code CalendarBuilder} keeps field-value pairs for setting
 * the calendar fields of the given {@code Calendar}. It has the
 * {@link Calendar#FIELD_COUNT FIELD_COUNT}-th field for the week year
 * support. Also {@code ISO_DAY_OF_WEEK} is used to specify
 * {@code DAY_OF_WEEK} in the ISO day of week numbering.
 *
 * <p>{@code CalendarBuilder} retains the semantic of the pseudo
 * timestamp for fields. {@code CalendarBuilder} uses a single
 * int array combining fields[] and stamp[] of {@code Calendar}.
 *
 * @author Masayoshi Okutsu
 */
