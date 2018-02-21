# Kathleen Dean, Matt Pigliavent0

# RETURNS a new sound that is the portion of "source" from "start" to "end"
# doesn't alter the original sound     
def clip (source, start, end):
  target = makeEmptySound (end - start, 44100)
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


# YOU NEED TO COMPLETE THE FOLLOWING FUNCTION.  DO NOT 
# CHANGE EITHER OF THE FUNCTIONS ABOVE.

# To use the "sentence" function:  run the "setMediaPath()" 
# command in the command area so it will find your recordings.

# Combines words 1 and 3 from "sentence1.wav" and words 2 and 4 from 
# "sentence2.wav" to form a new sentence
def sentence():
  
  kat = makeSound (getMediaPath ("sentence1.wav"))
  halloween = clip (kat, 45698, 76059)
  super = clip (kat, 89831, 115497) 
  mat = makeSound (getMediaPath ("sentence2.wav"))
  word2 = clip (mat, 64768, 77568)
  fun = clip (mat, 98560, 114944)
  len = getLength(halloween) + getLength (word2) + getLength (super) + getLength (fun) + 4000
  newSent = makeEmptySound (len, 44100)
  copy (halloween, newSent, 0)
  copy (word2, newSent, (getLength(halloween)+1000))
  copy (super, newSent, (getLength(halloween)+ getLength(word2)+2000))
  copy (fun, newSent, (getLength(halloween)+ getLength(word2)+getLength(super)+3000))  
  return newSent

# decreases volume of first quarter to one-tenth, second quarter times 2
# third quarter to a tenth, and second quarter times 2  
def alterVolume(sound):
  for sampleIndex in range (0, getLength (sound)/4):
    value = getSampleValueAt (sound, sampleIndex)
    setSampleValueAt (sound, sampleIndex, value/10)
  for sampleIndex in range (getLength(sound)/4, getLength(sound)/2):
    value = getSampleValueAt (sound, sampleIndex)
    setSampleValueAt (sound, sampleIndex, value*2)
  for sampleIndex in range (getLength(sound)/2, getLength(sound)*(3/4)):
    value = getSampleValueAt (sound, sampleIndex)
    setSampleValueAt (sound, sampleIndex, value/10)     
  for sampleIndex in range (getLength(sound)*(3/4), getLength(sound)):
    value = getSampleValueAt (sound, sampleIndex)
    setSampleValueAt (sound, sampleIndex, value*2)     
    
           
	



  