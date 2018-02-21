#Sean O'Connor + Matthew Pigliavento
def pickAndShow():
  myFile = pickAFile()
  myPic = makePicture(myFile)
  show (myPic)
  
def pickAndPlay():
  myFile=pickAFile()
  mySound=makeSound(myFile)
  play(mySound)