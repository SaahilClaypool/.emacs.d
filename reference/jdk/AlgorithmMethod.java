_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/AlgorithmMethod.java
    AlgorithmParameterSpec getParameterSpec();

    /**
     * Returns the algorithm parameters of this <code>AlgorithmMethod</code>.
     *
     * @return the algorithm parameters of this <code>AlgorithmMethod</code>.
     *    Returns <code>null</code> if this <code>AlgorithmMethod</code> does
     *    not require parameters and they are not specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/AlgorithmMethod.java
    String getAlgorithm();

    /**
     * Returns the algorithm URI of this <code>AlgorithmMethod</code>.
     *
     * @return the algorithm URI of this <code>AlgorithmMethod</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/AlgorithmMethod.java
public interface AlgorithmMethod {

/**
 * An abstract representation of an algorithm defined in the XML Security
 * specifications. Subclasses represent specific types of XML security
 * algorithms, such as a {@link javax.xml.crypto.dsig.Transform}.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
