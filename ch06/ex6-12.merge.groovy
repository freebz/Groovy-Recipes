// Merging Several Text Files

// merge.groovy
File logDir = new File(".")
File mergedFile = new File("summary/merged.log")
mergedFile.write("")  //empty out the existing file
logDir.eachFile{file ->
  if(file.isFile() && file.name.endsWith(".log")){
    mergedFile << file.text
  }
}
