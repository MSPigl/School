# Matthew Pigliavento, Jacob VanVorst

# lab7Enhancing.py
# main function, "sound board"
#Begins the sound board
def soundBoard():
  numSounds = input ("Please enter number of sounds: ")
  
  if numSounds == 1:
    processOneSound()
  
  elif numSounds == 2:
    processTwoSounds()
  
  elif numSounds == 3:
   processThreeSounds()
  
  
    
  print "Thanks for using Sound Board!"

 #Either reverses or doubles the speed of a sound if user entered 1 or 2 respectivly
def processOneSound():
  sound = makeSound (pickAFile())
  action = input ("Please enter 1 for reverse, 2 for double frequency: ")
  
  if action == 1:
    revSound = reverse(sound)
    play (revSound)
  elif action == 2: 
    dubSound = double(sound)
    play(dubSound)
      
# Don't change this function; we traced this in class!
def double (source):
  len = getLength(source)/2 + 1
  target = makeEmptySound (len)
  targetIndex = 0
  for sourceIndex in range (0, getLength(source), 2):
    sourceValue = getSampleValueAt (source, sourceIndex)
    setSampleValueAt (target, targetIndex, sourceValue)
    targetIndex = targetIndex + 1
  return (target)              

# don't change this function; it's from a previous lab and we traced this in class!  
def reverse (source):
  target = makeEmptySound (getLength(source))
  sourceIndex = getLength(source) - 1
  for targetIndex in range (0, getLength(target)):
    sourceValue = getSampleValueAt (source, sourceIndex)
    setSampleValueAt (target, targetIndex, sourceValue)
    sourceIndex = sourceIndex - 1
  return (target)

# Either mixes or interleaves two sounds depending on user input
def processTwoSounds():
  s1 = makeSound (pickAFile())
  s2 = makeSound (pickAFile())
  action = input ("Please enter 1 to mix the sounds, 2 to interleave the sounds: ")
  if action == 1:
    mixValue3 = input ("What percentage of the sound do you want to be sound 1? (in decimal): ")
    mixValue4 = input ("What percentage of the sound do you want to be sound 2? (in decimal): ")
    mixSound = makeMix(s1, s2, mixValue3, mixValue4)
    play (mixSound)
  elif action == 2: 
    interval = input ("Please enter interleaving interval: ")
    interSound = interleave (s1, s2, interval)
    play(interSound)

  
# This function blends 2 sounds.  Don't change it, but understand how it works!
def makeMix(sound1,sound2,mixValue1,mixValue2):
  newLength = min(getLength(sound1),getLength(sound2))
  newSound = makeEmptySound(newLength)
  for index in range(0,newLength):
    sample1 = getSampleValueAt(sound1,index)
    sample2 = getSampleValueAt(sound2,index)
    newSample = mixValue1*sample1 + mixValue2*sample2
    setSampleValueAt(newSound,index,newSample)
  return newSound



# Mixes 3 sounds 
def processThreeSounds():
  s1 = makeSound (pickAFile())
  s2 = makeSound (pickAFile())
  s3 = makeSound (pickAFile())
  mixValue3 = input ("What percentage of the sound do you want to be sound 1? (in decimal): ")
  mixValue4 = input ("What percentage of the sound do you want to be sound 2? (in decimal): ")
  mixValue5 = input ("What percentage of the sound do you want to be sound 3? (in decimal): ")
  mixSound20 = makeMix3(s1,s2,s3, mixValue3, mixValue4, mixValue5)
  play(mixSound20)
  
# Alter the following function so that it interleaves 2 sounds as described in the lab instructions.  The 
# function currently assumes the interval is always 3000; you need to generalize that by adding a parameter
# so that any interval can be used.

# Interleaves 2 sounds until the shortest of
# the 2 sounds is done.
def interleave (sound1, sound2, interval1):
  minLength = min(getLength(sound1),getLength(sound2))
  newSound = makeEmptySound(minLength*2)
  numSegments = minLength / interval1
  
  for segment in range (0, numSegments):
    segment1 = clip (sound1, segment*interval1, (segment + 1)*interval1)
    segment2 = clip (sound2, segment*interval1, (segment + 1)*interval1)
    copy (segment1, newSound, segment*(interval1*2))
    copy (segment2, newSound, segment*(interval1*2) + interval1)  
  return newSound  

# These last 2 functions are here to be used by "interleave"; you
# don't need them for anything else!  Don't change them.
      
# returns a new sound that is the portion of "source" from "start" to "end"
# doesn't alter the original sound     
def clip (source, start, end):
  target = makeEmptySound (end - start)
  targetIndex = 0
  for sourceIndex in range (start, end):
    sourceValue = getSampleValueAt (source, sourceIndex)
    setSampleValueAt (target, targetIndex, sourceValue)
    targetIndex = targetIndex + 1
  return target
  
# copies the "source" sound into the "target" sound starting at "start" in "target"
def copy (source, target, start):
  targetIndex = start
  for sourceIndex in range(0, getLength(source)):
    sourceValue = getSampleValueAt (source, sourceIndex)
    setSampleValueAt (target, targetIndex, sourceValue)
    targetIndex = targetIndex + 1
    
#Mixes 3 sounds
def makeMix3(sound1,sound2, sound3,mixValue1,mixValue2, mixValue3):
  newLength = min(getLength(sound1),getLength(sound2), getLength(sound3))
  newSound = makeEmptySound(newLength)
  for index in range(0,newLength):
    sample1 = getSampleValueAt(sound1,index)
    sample2 = getSampleValueAt(sound2,index)
    sample3 = getSampleValueAt(sound3, index)
    newSample = mixValue1*sample1 + mixValue2*sample2 + mixValue3*sample3
    setSampleValueAt(newSound,index,newSample)
  return newSound