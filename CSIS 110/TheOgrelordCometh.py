import time

def theOgreLordCometh():
  theShrekoning=makePicture(getMediaPath("The Ogrelord.gif"))
  for p in getPixels(theShrekoning):
    setRed(p, 125)
    if getRed(p) < 200:
      setGreen(p, 255)
  show (theShrekoning)
  
  time.stop(3)
  
  dogFort=makePicture(pickAFile())
  show (dogFort)
  
  