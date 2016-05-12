_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Shape getShape() const;

  /// Get drawing shape.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setShape(Shape new_shape);

  /// Set drawing shape.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual bool isModified() const;

  /// Return true if any attribute modified since last serialize.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual bool isModified(enum ObjectAttribute attribute) const;

  /// Return true if attribute modified since last serialize.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual int deserialize(std::string s);

  /// Deserialize string to become Object attributes.
  /// Return 0 if no errors, else -1.  
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual std::string serialize(bool all=false);

  /// Serialize Object attributes to single string.
  /// e.g., "id:110,is_active:true, ...
  /// Only modified attributes are serialized (unless all is true).
  /// Clear modified[] array.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setSpriteSlowdown(int new_sprite_slowdown);

  /// Slows down sprite animations.
  /// Slowdown value in multiples of GameManager frame time.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int getSpriteIndex() const;

  /// Return index of current Sprite frame to be displayed.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setSpriteIndex(int new_sprite_index);

  /// Set index of current Sprite frame to be displayed.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  char getTransparency() const;

  /// Get Sprite transparency character (0 means none).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setTransparency(char transparent=' ');

  /// Set Sprite transparency character (0 means none).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  bool isCentered() const;

  /// Indicates if Sprite is centered at Object position (pos).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setCentered(bool centered=true);

  /// Set Sprite to be centered at Object position (pos).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Sprite *getSprite() const;

  /// Return pointer to Sprite associated with this Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setSprite(Sprite *p_new_sprite, bool set_box=true);

  /// Set Object Sprite to new one.
  /// If set_box is true, set bounding box to size of Sprite.
  /// Set sprite index to 0 (first frame).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  std::string getSpriteName() const;

  /// Get Sprite name (in ResourceManager) for Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setSpriteName(std::string new_name);

  /// Set Sprite name (in ResourceManager) for Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual void draw();

  /// Draw single Sprite Frame.
  /// Drawing accounts for centering & slowdown, and advances Sprite Frame.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int unregisterInterest(std::string event_type);

  /// Unregister for interest in event.  
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int registerInterest(std::string event_type);

  /// Register for interest in event.  
  /// Keeps track of manager and event.  
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Box getBox() const;

  /// Get bounding box of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setBox(Box new_box);

  /// Set bounding box of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  bool isActive() const;

  /// Return activeness of Object.  Objects not active are not acted upon
  /// by engine.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int setActive(bool active=true);

  /// Set activeness of Object.  Objects not active are not acted upon
  /// by engine.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  bool isVisible() const;

  /// Return visibility of Object.  Objects not visible are not drawn.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int setVisible(bool visible=true);

  /// Set visibility of Object.  Objects not visible are not drawn.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Vector predictPosition();

  /// Predict Object position based on velocity.
  /// Return (possibly new) position.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Vector getVelocity() const;

  /// Get velocity of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setVelocity(Vector new_velocity);

  /// Set velocity of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int getAltitude() const;

  /// Return altitude of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int setAltitude(int new_altitude);

  /// Set altitude of Object, with checks for range [0, MAX_ALTITUDE].
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  bool getNoSoft() const;

  /// Get "no soft" setting of Object (true - cannot move onto SOFT Objects).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setNoSoft(bool new_no_soft=true);

  /// Set "no soft" setting of Object (true - cannot move onto SOFT Objects).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Solidness getSolidness() const;

  /// Return solidness of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int setSolidness(Solidness new_solid);

  /// Set solidness of Object, with checks for consistency.  
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  bool isSolid() const;    

  /// Return True if Object is HARD or SOFT, else false.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual int eventHandler(const Event *p_event);

  /// Handle event (default is to ignore everything).
  /// Return 0 if ignored, else 1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Vector getPosition() const;

  /// Get position of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setPosition(Vector new_pos);

  /// Set position of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  std::string getType() const;

  /// Get type identifier of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setType(std::string new_type);

  /// Set type identifier of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  int getId() const;

  /// Get Object id.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  void setId(int new_id);

  /// Set Object id.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  virtual ~Object();

  /// Destroy Object. 
  /// Unregister for any interested events.
  /// Remove from game world (WorldManager).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Object();

  /// Construct Object. 
  /// Set default parameters and add to game world (WorldManager).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
  Shape shape;

  int id;		      ///< Unique Object identifier.
  std::string type;	      ///< User-defined identification.
  bool is_active;             ///< If false, Object not acted upon.
  bool is_visible;            ///< If true, Object gets drawn.
  Box box;                    ///< Box for sprite boundary & collisions.
  Vector pos;                 ///< Position in game world.
  Vector velocity;	      ///< Velocity vector.
  std::string sprite_name;    ///< Sprite name in ResourceManager.
  Sprite *p_sprite;           ///< Sprite associated with Object.
  bool sprite_center;         ///< True if sprite centered on position.
  char sprite_transparency;   ///< Sprite transparent character (0 if none).
  int sprite_index;           ///< Current index frame for sprite.
  int sprite_slowdown;        ///< Slowdown rate (1 = no slowdown, 0 = stop).
  int sprite_slowdown_count;  ///< Slowdown counter.
  int altitude;               ///< 0 to MAX_ALTITUDE (higher drawn on top).
  Solidness solidness;        ///< Solidness state of Object.
  bool no_soft;               ///< True if won't move on SOFT Objects.
  int event_count;            ///< Number of events of interest.
  std::string event_name[MAX_OBJ_EVENTS]; ///< Names of events interested in.
  bool modified[ATTR_COUNT];  ///< Mod. attrib. since last serialize().
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
enum ObjectAttribute {

/// Categories of attributes that indicate modification.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
const int ATTR_COUNT = 12;

/// Count of number of modified attribute categories.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
};

  SOFT,       ///< Object causes collision, but doesn't impede.
  SPECTRAL,   ///< Object doesn't cause collisions.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
enum Solidness {

/// Types of solidness of Object.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
const int MAX_OBJ_EVENTS = 100;

/// Max number of events Object can be interested in.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
namespace df {

#include "Box.h"              ///< Objects have a bounding box.
#include "Event.h"            ///< Objects can handle events.
#include "Shape.h"	      ///< Objects can have simple drawing shapes.
#include "Sprite.h"           ///< Objects (often) have sprites.
#include "Vector.h"           ///< Objects need a float location.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Object.h
#ifndef __OBJECT_H__

///
/// The base game world object
///
