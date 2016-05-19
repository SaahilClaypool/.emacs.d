_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  sf::Sound getSound() const;

  /// Return SFML sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  void pause();

  /// Pause sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  void stop();

  /// Stop sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  void play(bool loop=false);

  /// Play sound.
  /// If loop is true, repeat play when done.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  std::string getLabel() const;

  /// Get label associated with sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  void setLabel(std::string new_label);

  /// Set label associated with sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
  int loadSound(std::string filename);

  /// Load sound buffer from file.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
 public:

  sf::Sound sound;	        ///< SFML sound.
  sf::SoundBuffer sound_buffer; ///< SFML sound buffer associated with sound.
  std::string label;	        ///< Text label to identify sound.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sound.h
#ifndef __SOUND_H__

///
/// The sound
/// 
