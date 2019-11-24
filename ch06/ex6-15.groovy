// 6.6 Using AntBuilder to Copy a Directory

def ant = new AntBuilder()
ant.copy(todir:"backup"){
  fileset(dir:"images")
}

// build.xml
<project name="test" basedir=".">
  <target name="backupImages">
    <copy todir="backup">
      <fileset dir="images" />
    </copy>
  </target>
</project>


// Selectively Including/Excluding Files

//NOTE: this WILL NOT copy files in subdirectories
// due to the pattern in include and exclude
def ant = new AntBuilder()
ant.copy(todir:"backup", overwrite:true){
  fileset(dir:"images"){
    include(name:"*.jpg")
    exclude(name:"*.txt")
  }
}


//NOTE: this WILL copy files in subdirectories
// due to the pattern in include and exclude
def ant = new AntBuilder()
ant.copy(todir:"backup", overwrite:true){
  fileset(dir:"images"){
    include(name:"**/*.jpg")
    exclude(name:"**/*.txt")
  }
}


// Flattening the Directory Structure on Copy

def ant = new AntBuilder()
ant.copy(todir:"backup", overwrite:true, flatten:true){
  fileset(dir:"images"){
    include(name:"**/*.jpg")
    exclude(name:"**/*.txt")
  }
}

// images (before):
images/logo.jpg
images/big_image.jpg
images/icons/button.jpg
images/icons/arrow.jpg
images/thumbnails/big_image_thumb.jpg

// backup (after):
backup/logo.jpg
backup/big_image.jpg
backup/button.jpg
backup/arrow.jpg
backup/big_image_thumb.jpg
