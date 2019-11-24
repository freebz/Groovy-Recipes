// 6.9 Creating a ZIP File/Tarball

def ant = new AntBuilder()

// zip files
ant.zip(basedir:"images", destfile:"../backup.zip")

// tar files
ant.tar(basedir:"images", destfile:"../backup.tar")
ant.gzip(zipfile:"../backup.tar.gz", src:"../backup.tar")
ant.bzip2(zipfile:"../backup.tar.bz2", src:"../backup.tar")


// Zipping Up Selected Files

def ant = new AntBuilder()
ant.zip(destfile:"../backup.zip"){
  fileset(dir:"images"){
    include(name:"**/*.jpg")
    exclude(name:"**/*.txt")
  }
}
