_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    static class Entry {

    /**
     * An internal class that represents an entry in the Special Casing Properties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isCased(int ch) {

    /**
     * Examines whether a character is 'cased'.
     *
     * A character C is defined to be 'cased' if and only if at least one of
     * following are true for C: uppercase==true, or lowercase==true, or
     * general_category==titlecase_letter.
     *
     * The uppercase and lowercase property values are specified in the data
     * file DerivedCoreProperties.txt in the Unicode Character Database.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isBeforeDot(String src, int index) {

    /**
     * Implements the "Before_Dot" condition
     *
     * Specification: C is followed by <code>U+0307 COMBINING DOT ABOVE</code>.
     * Any sequence of characters with a combining class that is
     * neither 0 nor 230 may intervene between the current character
     * and the combining dot above.
     *
     * Regular Expression:
     *   After C: ([{cc!=230}&{cc!=0}])*[\u0307]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isMoreAbove(String src, int index) {

    /**
     * Implements the "More_Above" condition
     *
     * Specification: C is followed by one or more characters of combining
     * class 230 (ABOVE) in the combining character sequence.
     *
     * Regular Expression:
     *   After C: [{cc!=0}]*[{cc==230}]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterSoftDotted(String src, int index) {

    /**
     * Implements the "After_Soft_Dotted" condition
     *
     * Specification: The last preceding character with combining class
     * of zero before C was Soft_Dotted, and there is no intervening
     * combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [{Soft_Dotted==true}]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterI(String src, int index) {

    /**
     * Implements the "After_I" condition
     *
     * Specification: The last preceding base character was an uppercase I,
     * and there is no intervening combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [I]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isFinalCased(String src, int index, Locale locale) {

    /**
     * Implements the "Final_Cased" condition
     *
     * Specification: Within the closest word boundaries containing C, there is a cased
     * letter before C, and there is no cased letter after C.
     *
     * Regular Expression:
     *   Before C: [{cased==true}][{wordBoundary!=true}]*
     *   After C: !([{wordBoundary!=true}]*[{cased}])
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
final class ConditionalSpecialCasing {

/**
 * This is a utility class for <code>String.toLowerCase()</code> and
 * <code>String.toUpperCase()</code>, that handles special casing with
 * conditions.  In other words, it handles the mappings with conditions
 * that are defined in
 * <a href="http://www.unicode.org/Public/UNIDATA/SpecialCasing.txt">Special
 * Casing Properties</a> file.
 * <p>
 * Note that the unconditional case mappings (including 1:M mappings)
 * are handled in <code>Character.toLower/UpperCase()</code>.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    static class Entry {

    /**
     * An internal class that represents an entry in the Special Casing Properties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isCased(int ch) {

    /**
     * Examines whether a character is 'cased'.
     *
     * A character C is defined to be 'cased' if and only if at least one of
     * following are true for C: uppercase==true, or lowercase==true, or
     * general_category==titlecase_letter.
     *
     * The uppercase and lowercase property values are specified in the data
     * file DerivedCoreProperties.txt in the Unicode Character Database.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isBeforeDot(String src, int index) {

    /**
     * Implements the "Before_Dot" condition
     *
     * Specification: C is followed by <code>U+0307 COMBINING DOT ABOVE</code>.
     * Any sequence of characters with a combining class that is
     * neither 0 nor 230 may intervene between the current character
     * and the combining dot above.
     *
     * Regular Expression:
     *   After C: ([{cc!=230}&{cc!=0}])*[\u0307]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isMoreAbove(String src, int index) {

    /**
     * Implements the "More_Above" condition
     *
     * Specification: C is followed by one or more characters of combining
     * class 230 (ABOVE) in the combining character sequence.
     *
     * Regular Expression:
     *   After C: [{cc!=0}]*[{cc==230}]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterSoftDotted(String src, int index) {

    /**
     * Implements the "After_Soft_Dotted" condition
     *
     * Specification: The last preceding character with combining class
     * of zero before C was Soft_Dotted, and there is no intervening
     * combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [{Soft_Dotted==true}]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterI(String src, int index) {

    /**
     * Implements the "After_I" condition
     *
     * Specification: The last preceding base character was an uppercase I,
     * and there is no intervening combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [I]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isFinalCased(String src, int index, Locale locale) {

    /**
     * Implements the "Final_Cased" condition
     *
     * Specification: Within the closest word boundaries containing C, there is a cased
     * letter before C, and there is no cased letter after C.
     *
     * Regular Expression:
     *   Before C: [{cased==true}][{wordBoundary!=true}]*
     *   After C: !([{wordBoundary!=true}]*[{cased}])
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
final class ConditionalSpecialCasing {

/**
 * This is a utility class for <code>String.toLowerCase()</code> and
 * <code>String.toUpperCase()</code>, that handles special casing with
 * conditions.  In other words, it handles the mappings with conditions
 * that are defined in
 * <a href="http://www.unicode.org/Public/UNIDATA/SpecialCasing.txt">Special
 * Casing Properties</a> file.
 * <p>
 * Note that the unconditional case mappings (including 1:M mappings)
 * are handled in <code>Character.toLower/UpperCase()</code>.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    static class Entry {

    /**
     * An internal class that represents an entry in the Special Casing Properties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isCased(int ch) {

    /**
     * Examines whether a character is 'cased'.
     *
     * A character C is defined to be 'cased' if and only if at least one of
     * following are true for C: uppercase==true, or lowercase==true, or
     * general_category==titlecase_letter.
     *
     * The uppercase and lowercase property values are specified in the data
     * file DerivedCoreProperties.txt in the Unicode Character Database.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isBeforeDot(String src, int index) {

    /**
     * Implements the "Before_Dot" condition
     *
     * Specification: C is followed by <code>U+0307 COMBINING DOT ABOVE</code>.
     * Any sequence of characters with a combining class that is
     * neither 0 nor 230 may intervene between the current character
     * and the combining dot above.
     *
     * Regular Expression:
     *   After C: ([{cc!=230}&{cc!=0}])*[\u0307]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isMoreAbove(String src, int index) {

    /**
     * Implements the "More_Above" condition
     *
     * Specification: C is followed by one or more characters of combining
     * class 230 (ABOVE) in the combining character sequence.
     *
     * Regular Expression:
     *   After C: [{cc!=0}]*[{cc==230}]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterSoftDotted(String src, int index) {

    /**
     * Implements the "After_Soft_Dotted" condition
     *
     * Specification: The last preceding character with combining class
     * of zero before C was Soft_Dotted, and there is no intervening
     * combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [{Soft_Dotted==true}]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterI(String src, int index) {

    /**
     * Implements the "After_I" condition
     *
     * Specification: The last preceding base character was an uppercase I,
     * and there is no intervening combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [I]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isFinalCased(String src, int index, Locale locale) {

    /**
     * Implements the "Final_Cased" condition
     *
     * Specification: Within the closest word boundaries containing C, there is a cased
     * letter before C, and there is no cased letter after C.
     *
     * Regular Expression:
     *   Before C: [{cased==true}][{wordBoundary!=true}]*
     *   After C: !([{wordBoundary!=true}]*[{cased}])
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
final class ConditionalSpecialCasing {

/**
 * This is a utility class for <code>String.toLowerCase()</code> and
 * <code>String.toUpperCase()</code>, that handles special casing with
 * conditions.  In other words, it handles the mappings with conditions
 * that are defined in
 * <a href="http://www.unicode.org/Public/UNIDATA/SpecialCasing.txt">Special
 * Casing Properties</a> file.
 * <p>
 * Note that the unconditional case mappings (including 1:M mappings)
 * are handled in <code>Character.toLower/UpperCase()</code>.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    static class Entry {

    /**
     * An internal class that represents an entry in the Special Casing Properties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isCased(int ch) {

    /**
     * Examines whether a character is 'cased'.
     *
     * A character C is defined to be 'cased' if and only if at least one of
     * following are true for C: uppercase==true, or lowercase==true, or
     * general_category==titlecase_letter.
     *
     * The uppercase and lowercase property values are specified in the data
     * file DerivedCoreProperties.txt in the Unicode Character Database.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isBeforeDot(String src, int index) {

    /**
     * Implements the "Before_Dot" condition
     *
     * Specification: C is followed by <code>U+0307 COMBINING DOT ABOVE</code>.
     * Any sequence of characters with a combining class that is
     * neither 0 nor 230 may intervene between the current character
     * and the combining dot above.
     *
     * Regular Expression:
     *   After C: ([{cc!=230}&{cc!=0}])*[\u0307]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isMoreAbove(String src, int index) {

    /**
     * Implements the "More_Above" condition
     *
     * Specification: C is followed by one or more characters of combining
     * class 230 (ABOVE) in the combining character sequence.
     *
     * Regular Expression:
     *   After C: [{cc!=0}]*[{cc==230}]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterSoftDotted(String src, int index) {

    /**
     * Implements the "After_Soft_Dotted" condition
     *
     * Specification: The last preceding character with combining class
     * of zero before C was Soft_Dotted, and there is no intervening
     * combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [{Soft_Dotted==true}]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterI(String src, int index) {

    /**
     * Implements the "After_I" condition
     *
     * Specification: The last preceding base character was an uppercase I,
     * and there is no intervening combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [I]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isFinalCased(String src, int index, Locale locale) {

    /**
     * Implements the "Final_Cased" condition
     *
     * Specification: Within the closest word boundaries containing C, there is a cased
     * letter before C, and there is no cased letter after C.
     *
     * Regular Expression:
     *   Before C: [{cased==true}][{wordBoundary!=true}]*
     *   After C: !([{wordBoundary!=true}]*[{cased}])
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
final class ConditionalSpecialCasing {

/**
 * This is a utility class for <code>String.toLowerCase()</code> and
 * <code>String.toUpperCase()</code>, that handles special casing with
 * conditions.  In other words, it handles the mappings with conditions
 * that are defined in
 * <a href="http://www.unicode.org/Public/UNIDATA/SpecialCasing.txt">Special
 * Casing Properties</a> file.
 * <p>
 * Note that the unconditional case mappings (including 1:M mappings)
 * are handled in <code>Character.toLower/UpperCase()</code>.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    static class Entry {

    /**
     * An internal class that represents an entry in the Special Casing Properties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isCased(int ch) {

    /**
     * Examines whether a character is 'cased'.
     *
     * A character C is defined to be 'cased' if and only if at least one of
     * following are true for C: uppercase==true, or lowercase==true, or
     * general_category==titlecase_letter.
     *
     * The uppercase and lowercase property values are specified in the data
     * file DerivedCoreProperties.txt in the Unicode Character Database.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isBeforeDot(String src, int index) {

    /**
     * Implements the "Before_Dot" condition
     *
     * Specification: C is followed by <code>U+0307 COMBINING DOT ABOVE</code>.
     * Any sequence of characters with a combining class that is
     * neither 0 nor 230 may intervene between the current character
     * and the combining dot above.
     *
     * Regular Expression:
     *   After C: ([{cc!=230}&{cc!=0}])*[\u0307]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isMoreAbove(String src, int index) {

    /**
     * Implements the "More_Above" condition
     *
     * Specification: C is followed by one or more characters of combining
     * class 230 (ABOVE) in the combining character sequence.
     *
     * Regular Expression:
     *   After C: [{cc!=0}]*[{cc==230}]
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterSoftDotted(String src, int index) {

    /**
     * Implements the "After_Soft_Dotted" condition
     *
     * Specification: The last preceding character with combining class
     * of zero before C was Soft_Dotted, and there is no intervening
     * combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [{Soft_Dotted==true}]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isAfterI(String src, int index) {

    /**
     * Implements the "After_I" condition
     *
     * Specification: The last preceding base character was an uppercase I,
     * and there is no intervening combining character class 230 (ABOVE).
     *
     * Regular Expression:
     *   Before C: [I]([{cc!=230}&{cc!=0}])*
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
    private static boolean isFinalCased(String src, int index, Locale locale) {

    /**
     * Implements the "Final_Cased" condition
     *
     * Specification: Within the closest word boundaries containing C, there is a cased
     * letter before C, and there is no cased letter after C.
     *
     * Regular Expression:
     *   Before C: [{cased==true}][{wordBoundary!=true}]*
     *   After C: !([{wordBoundary!=true}]*[{cased}])
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ConditionalSpecialCasing.java
final class ConditionalSpecialCasing {

/**
 * This is a utility class for <code>String.toLowerCase()</code> and
 * <code>String.toUpperCase()</code>, that handles special casing with
 * conditions.  In other words, it handles the mappings with conditions
 * that are defined in
 * <a href="http://www.unicode.org/Public/UNIDATA/SpecialCasing.txt">Special
 * Casing Properties</a> file.
 * <p>
 * Note that the unconditional case mappings (including 1:M mappings)
 * are handled in <code>Character.toLower/UpperCase()</code>.
 */
