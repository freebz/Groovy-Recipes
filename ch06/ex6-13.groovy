// 6.4 Copying Files

def src = new File("src.txt")
new File("dest.txt").write(src.text)


// Copying Binary Files

File src = new File("src.jpg")
new File("dest.jpg").withOutputStream{ out ->
  out.write src.readBytes()
}


// Copying Files Using the Underlying Operating System

File src = new File("src.jpg")
File dest = new File("dest.jpg")
"cp ${src.name} ${dest.name}".execute()


// Adding Your Own Copy Method to File

File.metaClass.copy = {String destName ->
  if(delegate.isFile()){
    new File(destName).withOutputStream{ out ->
      out.write.delegate.readBytes()
    }
  }
}

new File("src.jpg").copy("dest.jpg")
