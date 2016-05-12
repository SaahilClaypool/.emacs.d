_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  void setList(const ObjectList *p_list);

  /// Set to new List.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  ObjectListIterator &operator=(const ObjectListIterator &rhs);

  /// Assignment operator.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  Object *currentObject() const;     

  /// Return pointer to current item in list, NULL if done/empty.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  bool isDone() const;

  /// Return true if at end of list.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  void next();

  /// Set iterator to next item in list.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
  void first();

  /// Set iterator to first item in list.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
 public:

  ObjectListIterator();	///< Iterator must be given list when created.
  int index;			///< Index into list.
  const ObjectList *p_list;	///< List iterating over.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectListIterator.h
#ifndef __OBJECT_LIST_ITERATOR_H__

///
/// An iterator for ObjectLists
///
