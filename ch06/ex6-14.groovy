// 6.5 Using AntBuilder to Copy a File

def ant = new AntBuilder()
ant.copy(file:"src.txt", tofile:"dest.txt")


// build.xml
<project name="test" basedir=".">
  <target name="copy">
    <copy file="src.txt" tofile="dest.txt" />
  </target>
</project>


$ ant copy
Buildfile: build.xml
copy:
     [copy] Copying 1 file to /
BUILD SUCCESSFUL
Total time: 0 seconds


// Copying a file to a Directory

def ant = new AntBuilder()
ant.copy(file:"src.txt", todir:"../backup")


// Overwriting the Destination File

def ant = new AntBuilder()
any.copy(file:"src.txt", tofile:"dest.txt", overwrite:true)
