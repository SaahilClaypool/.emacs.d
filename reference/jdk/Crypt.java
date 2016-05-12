_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public static void main(String arg[]) {

    /**
     * program to test the crypt routine.
     *
     * The first parameter is the cleartext password, the second is
     * the salt to use. The salt should be two characters from the
     * set [a-zA-Z0-9./]. Outputs the crypt result.
     *
     * @param arg command line arguments.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public synchronized byte[] crypt(byte[] pw, byte[] salt) {

    /**
     * Implements the libc crypt(3) function.
     *
     * @param pw the password to "encrypt".
     *
     * @param salt the salt to use.
     *
     * @return A new byte[13] array that contains the encrypted
     * password. The first two characters are the salt.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public Crypt()

    /**
     * Creates a new Crypt object for use with the crypt method.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
package com.sun.security.auth.module;

/**
 * Implements the UNIX crypt(3) function, based on a direct port of the
 * libc crypt function.
 *
 * <p>
 * From the crypt man page:
 * <p>
 * crypt() is the password encryption routine, based on the NBS
 * Data  Encryption  Standard,  with variations intended (among
 * other things) to frustrate use of  hardware  implementations
 * of the DES for key search.
 * <p>
 * The first argument to crypt() is  normally  a  user's  typed
 * password.   The  second  is a 2-character string chosen from
 * the set [a-zA-Z0-9./].  the  salt string is used to perturb
 * the DES algorithm in one
 * of 4096 different ways, after which the password is used  as
 * the  key  to  encrypt  repeatedly  a  constant  string.  The
 * returned value points to the encrypted password, in the same
 * alphabet as the salt.  The first two characters are the salt
 * itself.
 *
 * @author Roland Schemers
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public static void main(String arg[]) {

    /**
     * program to test the crypt routine.
     *
     * The first parameter is the cleartext password, the second is
     * the salt to use. The salt should be two characters from the
     * set [a-zA-Z0-9./]. Outputs the crypt result.
     *
     * @param arg command line arguments.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public synchronized byte[] crypt(byte[] pw, byte[] salt) {

    /**
     * Implements the libc crypt(3) function.
     *
     * @param pw the password to "encrypt".
     *
     * @param salt the salt to use.
     *
     * @return A new byte[13] array that contains the encrypted
     * password. The first two characters are the salt.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
    public Crypt()

    /**
     * Creates a new Crypt object for use with the crypt method.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/module/Crypt.java
package com.sun.security.auth.module;

/**
 * Implements the UNIX crypt(3) function, based on a direct port of the
 * libc crypt function.
 *
 * <p>
 * From the crypt man page:
 * <p>
 * crypt() is the password encryption routine, based on the NBS
 * Data  Encryption  Standard,  with variations intended (among
 * other things) to frustrate use of  hardware  implementations
 * of the DES for key search.
 * <p>
 * The first argument to crypt() is  normally  a  user's  typed
 * password.   The  second  is a 2-character string chosen from
 * the set [a-zA-Z0-9./].  the  salt string is used to perturb
 * the DES algorithm in one
 * of 4096 different ways, after which the password is used  as
 * the  key  to  encrypt  repeatedly  a  constant  string.  The
 * returned value points to the encrypted password, in the same
 * alphabet as the salt.  The first two characters are the salt
 * itself.
 *
 * @author Roland Schemers
 */
