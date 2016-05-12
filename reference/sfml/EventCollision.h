_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  Vector getPosition() const;

  /// Return position of collision.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  void setPosition(Vector new_pos);

  /// Set position of collision.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  Object *getObject2() const;

  /// Return object that was collided with.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  void setObject2(Object *p_new_o2); 

  /// Set object that was collided with.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  Object *getObject1() const;

  /// Return object that caused collision.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  void setObject1(Object *p_new_o1); 

  /// Set object that caused collision.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
  EventCollision(Object *p_o1, Object *p_o2, Vector p);

  /// Create collision event between o1 and o2 at position p.
  /// Object o1 "caused" collision by moving into object o2.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
 public:

  Vector pos;          ///< Where collision occurred.
  Object *p_obj1;        ///< Object moving, causing collision.
  Object *p_obj2;        ///< Object being collided with.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventCollision.h
#ifndef __EVENT_COLLISION_H__

///
/// A "collision" event
///
