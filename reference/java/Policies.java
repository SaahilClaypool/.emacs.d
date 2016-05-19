_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/Policies.java
    Policies(Policy[] policies, int id ) throws InvalidPolicy

    /** Main constructor used from POA::create_POA.  This need only be visible
    * within the POA package.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/Policies.java
    private void addToErrorSet( Policy[] policies, int policyId,
        BitSet errorSet )

    /** Add the first index in policies at which the policy is of type
    * policyId to errorSet, if the polictId is in policies (it may not be).
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/Policies.java
    private void checkForPolicyError( BitSet errorSet ) throws InvalidPolicy

    /** If any errors were found, throw INVALID_POLICY with the smallest
     * index of any offending policy.
     */
