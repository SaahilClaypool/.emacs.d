_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    public String toString() {

    /**
     * Print out the first intLen ints of this MutableBigInteger's value
     * array starting at offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    void signedSubtract(MutableBigInteger addend) {

   /**
     * Signed subtraction built upon unsigned add and subtract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    void signedSubtract(SignedMutableBigInteger addend) {

   /**
     * Signed subtraction built upon unsigned add and subtract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    void signedAdd(MutableBigInteger addend) {

   /**
     * Signed addition built upon unsigned add and subtract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    void signedAdd(SignedMutableBigInteger addend) {

   /**
     * Signed addition built upon unsigned add and subtract.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    SignedMutableBigInteger(MutableBigInteger val) {

    /**
     * Construct a new MutableBigInteger with a magnitude equal to the
     * specified MutableBigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    SignedMutableBigInteger(int val) {

    /**
     * Construct a new MutableBigInteger with a magnitude specified by
     * the int val.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    SignedMutableBigInteger() {

    /**
     * The default constructor. An empty MutableBigInteger is created with
     * a one word capacity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
    int sign = 1;

   /**
     * The sign of this MutableBigInteger.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/math/SignedMutableBigInteger.java
class SignedMutableBigInteger extends MutableBigInteger {

/**
 * A class used to represent multiprecision integers that makes efficient
 * use of allocated space by allowing a number to occupy only part of
 * an array so that the arrays do not have to be reallocated as often.
 * When performing an operation with many iterations the array used to
 * hold a number is only increased when necessary and does not have to
 * be the same size as the number it represents. A mutable number allows
 * calculations to occur on the same number without having to create
 * a new number for every step of the calculation as occurs with
 * BigIntegers.
 *
 * Note that SignedMutableBigIntegers only support signed addition and
 * subtraction. All other operations occur as with MutableBigIntegers.
 *
 * @see     BigInteger
 * @author  Michael McCloskey
 * @since   1.3
 */
