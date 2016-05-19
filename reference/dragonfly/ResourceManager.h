_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  Music *getMusic(std::string label);

  /// Find Music with indicated label.
  /// Return pointer to it if found, else NULL.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int unloadMusic(std::string label);

  /// Remove label for Music with indicated label.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int loadMusic(std::string filename, std::string label);

  /// Associate file with Music.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  Sound *getSound(std::string label);

  /// Find Sound with indicated label.
  /// Return pointer to it if found, else NULL.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int unloadSound(std::string label);

  /// Remove Sound with indicated label.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int loadSound(std::string filename, std::string label);

  /// Load sound from file.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  Sprite *getSprite(std::string label) const;

  /// Find Sprite with indicated label.
  /// Return pointer to it if found, else NULL.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int unloadSprite(std::string label);

  /// Unload Sprite with indicated label.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int loadSprite(std::string filename, std::string label);

  /// Load Sprite from file.
  /// Assign indicated label to Sprite.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  void shutDown();

  /// Shut down manager, freeing up any allocated Sprites, Music and Sounds.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  int startUp();

  /// Get ResourceManager ready to manage resources.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
  static ResourceManager &getInstance();

  /// Get the one and only instance of the ResourceManager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
 public:

  ResourceManager (ResourceManager const&); ///< Don't allow copy.
  void operator=(ResourceManager const&);   ///< Don't allow assignment.
  ResourceManager();		 ///< Private since a singleton.
  Sprite *p_sprite[MAX_SPRITES]; ///< Array of (pointers to) Sprites.
  int sprite_count;	        ///< Count of number of loaded sprites.
  Sound sound[MAX_SOUNDS];	///< Array of sound buffers.
  int sound_count;	        ///< Count of number of loaded sounds.
  Music music[MAX_MUSICS];	///< Array of music buffers.
  int music_count;	        ///< Count of number of loaded musics.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ResourceManager.h
#ifndef __RESOURCE_MANAGER_H__

///
/// The resource manager
///
