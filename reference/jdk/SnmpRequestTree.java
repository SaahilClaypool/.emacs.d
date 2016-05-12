_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
        @SuppressWarnings("unchecked")

        /**
         * register an entry for the given oid at the given position with
         * the given sublist.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
        public void addVarbind(SnmpVarBind varbind) {

        /**
         * Adds a varbind in this node sublist.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
final class SnmpRequestTree {

/**
 * This class is used to register varbinds from a SNMP varbind list with
 * the SnmpMibNode responsible for handling the requests concerning that
 * varbind.
 * This class holds a hashtable of Handler nodes, whith the involved
 * SnmpMibNode as a key.
 * When the involved SnmpMibNode is a group, the sublist of varbind is
 * directly stored in the Handler node.
 * When the involved SnmpMibNode is a table, the sublist is stored in a
 * sorted array indexed by the OID of the entry involved.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
        @SuppressWarnings("unchecked")

        /**
         * register an entry for the given oid at the given position with
         * the given sublist.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
        public void addVarbind(SnmpVarBind varbind) {

        /**
         * Adds a varbind in this node sublist.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpRequestTree.java
final class SnmpRequestTree {

/**
 * This class is used to register varbinds from a SNMP varbind list with
 * the SnmpMibNode responsible for handling the requests concerning that
 * varbind.
 * This class holds a hashtable of Handler nodes, whith the involved
 * SnmpMibNode as a key.
 * When the involved SnmpMibNode is a group, the sublist of varbind is
 * directly stored in the Handler node.
 * When the involved SnmpMibNode is a table, the sublist is stored in a
 * sorted array indexed by the OID of the entry involved.
 */
