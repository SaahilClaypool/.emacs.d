_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/CMStateSet.java
// made this class public so it can be accessed by

/**
 * This class is a very simple bitset class. The DFA content model code needs
 * to support a bit set, but the java BitSet class is way, way overkill. Our
 * bitset never needs to be expanded after creation, hash itself, etc...
 *
 * Since the vast majority of content models will never require more than 64
 * bits, and since allocation of anything in Java is expensive, this class
 * provides a hybrid implementation that uses two ints for instances that use
 * 64 bits or fewer. It has a byte array reference member which will only be
 * used if more than 64 bits are required.
 *
 * Note that the code that uses this class will never perform operations
 * on sets of different sizes, so that check does not have to be made here.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/models/CMStateSet.java
// made this class public so it can be accessed by

/**
 * This class is a very simple bitset class. The DFA content model code needs
 * to support a bit set, but the java BitSet class is way, way overkill. Our
 * bitset never needs to be expanded after creation, hash itself, etc...
 *
 * Since the vast majority of content models will never require more than 64
 * bits, and since allocation of anything in Java is expensive, this class
 * provides a hybrid implementation that uses two ints for instances that use
 * 64 bits or fewer. It has a byte array reference member which will only be
 * used if more than 64 bits are required.
 *
 * Note that the code that uses this class will never perform operations
 * on sets of different sizes, so that check does not have to be made here.
 *
 * @xerces.internal
 *
 */
